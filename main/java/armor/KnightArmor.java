/*    */ package armor;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class KnightArmor extends ItemArmor
/*    */ {
    /*    */   public KnightArmor(ArmorMaterial armor, EntityEquipmentSlot slot)
/*    */   {
/* 12 */       super(armor, 0, slot);
/*    */   }
    /*    */
/*    */   public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
/*    */   {
/* 17 */      if (slot == EntityEquipmentSlot.LEGS)
/* 21 */       return "armorcraft:textures/models/armor/knight_layer_2.png";
/*    */ 
/* 25 */     return "armorcraft:textures/models/armor/knight_layer_1.png";
/*    */   }
    /*    */   
/*    */ 
/*    */   public boolean getIsRepairable(ItemStack input, ItemStack repair)
/*    */   {
/* 31 */     if (repair.getItem() == Items.iron_ingot)
/*    */     {
/* 34 */       return true;
/*    */     }

/* 38 */     return false;
/*    */   }
/*    */ }



/* Location:              /Users/loicd/Desktop/ArmorCraft-0.1.jar!/armor/KnightArmor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */