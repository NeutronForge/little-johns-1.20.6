package net.echo.little_johns.state.property;

import net.echo.little_johns.block.enums.CornerType;
import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;

public class ModProperties extends Properties {
    public static final EnumProperty<CornerType> CORNER_TYPE = EnumProperty.of("type", CornerType.class);
}
