package es.joseka.renfemtr.mod.blocks;


import es.joseka.renfemtr.mod.data.Incrementable;
import org.mtr.mapping.holder.*;
import org.mtr.mod.Blocks;
import org.mtr.mod.block.IBlock;

public class PlatformsNumber extends ModelChangerBase implements Incrementable {

    public static final IntegerProperty TEXTURE = IntegerProperty.of("texture", 1, 10);

    public PlatformsNumber() {
        super(Blocks.createDefaultBlockSettings(true));
        //super(BlockHelper.createBlockSettings(true), 10);
    }
    @Override
    public IntegerProperty getPropertyToIncrement() {
        return TEXTURE;
    }
    @Override
    public int getMinValue() {
        return 1;
    }

    @Override
    public int getMaxValue() {
        return 10;
    }
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0, 0, 7, 16, 16, 9, IBlock.getStatePropertySafe(state, FACING));
    }
}
