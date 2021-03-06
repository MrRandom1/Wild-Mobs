package com.wildmobsmod.entity.passive.butterfly;

import org.lwjgl.opengl.GL11;

import com.wildmobsmod.entity.passive.deer.EntityDeer;
import com.wildmobsmod.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderButterfly extends RenderLiving{

	private static final ResourceLocation beigeTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_beige.png");
	private static final ResourceLocation blueTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_blue.png");
	private static final ResourceLocation glassTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_glass.png");
	private static final ResourceLocation limeTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_lime.png");
	private static final ResourceLocation orangeTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_orange.png");
	private static final ResourceLocation purpleTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_purple.png");
	private static final ResourceLocation redTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_red.png");
	private static final ResourceLocation whiteTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_white.png");
	private static final ResourceLocation yellowTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_yellow.png");
	private static final ResourceLocation cyanTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_cyan.png");
	private static final ResourceLocation brownTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_brown.png");
	private static final ResourceLocation blackTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_black.png");
	private static final ResourceLocation greenTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_green.png");
	private static final ResourceLocation grayTextures = new ResourceLocation(Strings.MODID + ":textures/entity/butterfly/butterfly_gray.png");

    public RenderButterfly(ModelBase p_i1265_1_, float p_i1265_2_)
    {
        super(p_i1265_1_, p_i1265_2_);
        this.shadowSize = 0.2F;
    }

    
	protected ResourceLocation getEntityTexture(EntityButterfly entity) {
	       int type = entity.getDataWatcher().getWatchableObjectByte(20);
	       switch(entity.getDataWatcher().getWatchableObjectByte(20)) {
	       case 0: return beigeTextures;
	       case 1: return blueTextures;
	       case 2: return glassTextures;
	       case 3: return limeTextures;
	       case 4: return orangeTextures;
	       case 5: return purpleTextures;
	       case 6: return redTextures;
	       case 7: return whiteTextures;
	       case 8: return yellowTextures;
	       case 9: return cyanTextures;
	       case 10: return brownTextures;
	       case 11: return blackTextures;
	       case 12: return greenTextures;
	       case 13: return grayTextures;
	       default: return orangeTextures;
	       }
	}
	

    @Override
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityButterfly)entity);
	}
}