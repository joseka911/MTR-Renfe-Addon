

const PIDSCustomUtil = {
    lang: "es",
    texts: {
        es: {
            parked: "Estacionado",
            sec: "{n} seg",
            min: "{n} min",
            car1: "{n} coche",
            carN: "{n} coches",
            destination: "Destino:",
            stopsAt: "Con parada en:",
            eta: "Tiempo estimado:",
            eta2: "  Tiempo  estimado:",
            and: " y "
        },
        ca: {
            parked: "Estacionat",
            sec: "{n} seg",
            min: "{n} min",
            car1: "{n} cotxe",
            carN: "{n} cotxes",
            destination: "Destinació:",
            stopsAt: "Amb parada a:",
            eta: "Temps estimat:",
            eta2: " Temps   estimat:",
            and: " i "
        },
        val: {
            parked: "Estacionat",
            sec: "{n} seg",
            min: "{n} min",
            car1: "{n} cotxe",
            carN: "{n} cotxes",
            destination: "Destinació:",
            stopsAt: "Amb parada a:",
            eta: "Temps estimat:",
            eta2: " Temps   estimat:",
            and: " i "
        },
        gl: {
            parked: "Estacionado",
            sec: "{n} seg",
            min: "{n} min",
            car1: "{n} coche",
            carN: "{n} coches",
            destination: "Destino:",
            stopsAt: "Con parada en:",
            eta: "Tempo estimado:",
            eta2: "Tempo  estimado:",
            and: " e "
        },
        eu: {
            parked: "Geltokian",
            sec: "{n} seg",
            min: "{n} min",
            car1: "{n} bagoi",
            carN: "{n} bagoi",
            destination: "Helmuga:",
            stopsAt: "Geldialdiak:",
            eta: "Denbora:",
            eta2: "Denbora:",
            and: " eta "
        },
        en: {
            parked: "At platform",
            sec: "{n} sec",
            min: "{n} min",
            car1: "{n}-car",
            carN: "{n}-cars",
            destination: "Destination:",
            stopsAt: "Calling at:",
            eta: "Estimated time:",
            eta2: "Estimated time:",
            and: " and "
        }
    },

    t(key, n) {
        let table = PIDSCustomUtil.texts[PIDSCustomUtil.lang] || PIDSCustomUtil.texts.es;
        let text = table[key];
        if (text === undefined) text = PIDSCustomUtil.texts.es[key];
        if (text === undefined) return key;
        return n === undefined ? text : text.replace("{n}", n);
    },
    getETAText(arrivalTime, arrivedText) {
        let remainingMs = arrivalTime - Date.now();
        let remainingSec = Math.floor(remainingMs / 1000);

        if (remainingSec <= 0) {
            let baseText = arrivedText ? arrivedText : PIDSCustomUtil.t("parked");
            let visible = Math.floor(Date.now() / 800) % 2 === 0;
            return visible ? baseText : "";
        } else if (remainingMs <= 60000) {
            return PIDSCustomUtil.t("sec", remainingSec);
        } else {
            return PIDSCustomUtil.t("min", Math.floor(remainingSec / 60));
        }
    },

    formatTime(inGameTime, padZero) {
        let timeNow = inGameTime + 6000;
        let hrs = (timeNow / 1000) % 24;
        let mins = (hrs - Math.floor(hrs)) * 60;
        let h = Math.floor(hrs).toString();
        let m = Math.floor(mins % 60).toString().padStart(2, "0");
        return (padZero ? h.padStart(2, "0") : h) + ":" + m;
    },

    getCarText(len) {
        return PIDSCustomUtil.t(len <= 1 ? "car1" : "carN", len);
    },

    formatDateTime(d) {
        return d.getHours().toString().padStart(2, "0") + ":" + d.getMinutes().toString().padStart(2, "0");
    },
    getStopsText(stops, stationName) {
        let clean = (s) => String(s).normalize("NFC").trim();
        let current = clean(stationName);
        let start = stops.findIndex((s) => clean(s) === current) + 1;

        let remaining = stops.slice(start).map((s) => String(s).split("|").join(" "));
        if (remaining.length === 0) return "";
        if (remaining.length === 1) return remaining[0] + ".";

        let last = remaining.pop();
        return remaining.join(", ") + PIDSCustomUtil.t("and") + last + ".";
    }
};
