package es.joseka.renfemtr.mod;

import es.joseka.renfemtr.mod.render.RenderStationNameTiledCercaniasNew;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.RenderLayer;

import org.mtr.mapping.registry.RegistryClient;
import org.mtr.mod.item.ItemBlockClickingBase;


public class InitClient {
	public static final RegistryClient REGISTRY_CLIENT = new RegistryClient(Init.REGISTRY);

	public static void init() {
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_5_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_5_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_5_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_5_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_5_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_5_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_10_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_10_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_10_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_10_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_10_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_10_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_30_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_30_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_30_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_30_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_30_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_30_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_50_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_50_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_50_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_50_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_50_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_50_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_60_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_60_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_60_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_70_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_70_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_70_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_80_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_80_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_80_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_90_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_90_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_90_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_100_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_100_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_100_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_110_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_110_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_110_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_120_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_120_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_120_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_130_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_130_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_140_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_140_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_150_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_150_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_160_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_160_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_200_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_200_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_220_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_220_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_270_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_270_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_300_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_300_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_320_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_320_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_350_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_350_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_ENTRANCE_CERCANIAS);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_ENTRANCE_RODALIES);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_EXIT_CERCANIAS);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_EXIT_RODALIES);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_END);
		REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.STATION_NAME_ENTRANCE_CERCANIAS_NEW, dispatcher -> new RenderStationNameTiledCercaniasNew<>(dispatcher, 1, 0.24F / 12 , 1 / 16F, 3 / 16F, -6 / 16F, 0,0xFF000000, false, "vialog"));
		REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.STATION_NAME_ENTRANCE_CERCANIAS_OLD, dispatcher -> new RenderStationNameTiledCercaniasNew<>(dispatcher, 1, 0.24F / 12 , 1 / 16F, 3 / 16F, -6 / 16F, 0,0xFFFFFFFF, false, "vialog"));
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_1);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_2);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_3);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_4);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_5);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1_SLAB_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2_SLAB_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_BARRIER);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_BARRIER_SLAB);
		REGISTRY_CLIENT.registerItemModelPredicate(Items.RAIL_CONNECTOR_5, new Identifier(Init.MOD_ID, "selected"), checkItemPredicateTag());
		REGISTRY_CLIENT.registerItemModelPredicate(Items.RAIL_CONNECTOR_5_ONE_WAY, new Identifier(Init.MOD_ID, "selected"), checkItemPredicateTag());
		REGISTRY_CLIENT.registerItemModelPredicate(Items.RAIL_CONNECTOR_10, new Identifier(Init.MOD_ID, "selected"), checkItemPredicateTag());
		REGISTRY_CLIENT.registerItemModelPredicate(Items.RAIL_CONNECTOR_10_ONE_WAY, new Identifier(Init.MOD_ID, "selected"), checkItemPredicateTag());
		REGISTRY_CLIENT.init();
	}
	private static RegistryClient.ModelPredicateProvider checkItemPredicateTag() {
		return (itemStack, clientWorld, livingEntity) -> itemStack.getOrCreateTag().contains(ItemBlockClickingBase.TAG_POS) ? 1 : 0;
	}
}
