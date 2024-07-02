package net.creeperio.foodmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class ExtraBurntLebronJames extends FuelItem
{
    public ExtraBurntLebronJames(Properties pProperties, int burnTime) {
        super(pProperties, burnTime);
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.extraburnt_lebron"));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}