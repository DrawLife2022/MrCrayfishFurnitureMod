package com.mrcrayfish.furniture.render.tileentity;

import com.mrcrayfish.furniture.tileentity.TileEntityChoppingBoard;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class ChoppingBoardRenderer extends TileEntitySpecialRenderer<TileEntityChoppingBoard>
{
    @Override
    public void render(TileEntityChoppingBoard board, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
    {
        if(!board.getAllFood().isEmpty())
        {
            GlStateManager.pushMatrix();
            {
                GlStateManager.translate(x, y, z);
                GlStateManager.translate(0.5, 0.05, 0.5);
                GlStateManager.rotate(-90F, 0, 1, 0);
                GlStateManager.translate(-0.5, -0.5, -0.5);
                GlStateManager.rotate(90F, 1, 0, 0);
                GlStateManager.translate(0.5, 0.5, -0.5 - 0.03125);

                GlStateManager.scale(0.75F, 0.75F, 0.75F);
                GlStateManager.pushAttrib();
                RenderHelper.enableStandardItemLighting();
                for (int i = 0; i < board.getAllFood().size(); i++) {
                    if(board.getAllFood().get(i) == null) continue;
                    Minecraft.getMinecraft().getRenderItem().renderItem(board.getAllFood().get(i), ItemCameraTransforms.TransformType.FIXED);
                    GlStateManager.translate(0, 0f, -0.05F);
                }
                RenderHelper.disableStandardItemLighting();
                GlStateManager.popAttrib();
            }
            GlStateManager.popMatrix();
        }
    }
}
