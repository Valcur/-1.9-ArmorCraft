/*     */ package armor;
/*     */

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.init.SoundEvents;
/*     */ import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/*     */
@Mod(modid = ArmorCraft.MODID, version = ArmorCraft.VERSION)
/*     */
/*     */ public class ArmorCraft {
            public static final String MODID = "ArmorCraft";
/*     */   public static final String VERSION = "1.0";
/*     */   public static Item samuraiDefaultHelmet;
/*     */   public static Item samuraiDefaultChestPlate;
/*     */   public static Item samuraiDefaultLeg;
/*     */   public static Item samuraiDefaultBoots;
/*     */   public static Item samuraiGreenHelmet;
/*     */   public static Item samuraiGreenChestPlate;
/*     */   public static Item samuraiGreenLeg;
/*     */   public static Item samuraiGreenBoots;
/*     */   public static Item samuraiRedHelmet;
/*     */   public static Item samuraiRedChestPlate;
/*     */   public static Item samuraiRedLeg;
/*     */   public static Item samuraiRedBoots;
/*     */   public static Item samuraiBlueHelmet;
/*     */   public static Item samuraiBlueChestPlate;
/*     */   public static Item samuraiBlueLeg;
/*     */   public static Item samuraiBlueBoots;
/*     */   public static Item darkKnightHelmet;
/*     */   public static Item darkKnightChestPlate;
/*     */   public static Item darkKnightLeg;
/*     */   public static Item darkKnightBoots;
/*     */   public static Item knightHelmet;
/*     */   public static Item knightChestPlate;
/*     */   public static Item knightLeg;
/*     */   public static Item knightBoots;
/*     */   public static Item templarHelmet;
/*     */   public static Item templarChestPlate;
/*     */   public static Item templarLeg;
/*     */   public static Item templarBoots;
/*     */   public static Item paladinHelmet;
/*     */   public static Item paladinChestPlate;
/*  39 */   public static Item paladinLeg;
            public static Item paladinBoots;
            public static Item romanHelmet;
            public static Item romanChestPlate;
            public static Item romanLeg;
            public static Item romanBoots;
            public static Item skyrimGuardGreenHelmet;
            public static Item skyrimGuardGreenChestPlate;
            public static Item skyrimGuardGreenLeg;
            public static Item skyrimGuardGreenBoots;
            public static Item skyrimGuardRedHelmet;
            public static Item skyrimGuardRedChestPlate;
            public static Item skyrimGuardRedLeg;
            public static Item skyrimGuardRedBoots;
            public static Item skyrimGuardBlueHelmet;
            public static Item skyrimGuardBlueChestPlate;
            public static Item skyrimGuardBlueLeg;
            public static Item skyrimGuardBlueBoots;
            public static Item skyrimGuardYellowHelmet;
            public static Item skyrimGuardYellowChestPlate;
            public static Item skyrimGuardYellowLeg;
            public static Item skyrimGuardYellowBoots;
            public static Item assassinHelmet;
            public static Item assassinChestPlate;
            public static Item assassinLeg;
            public static Item assassinBoots;
            //addArmorMaterial(int, {int armor value : boots, leggs, chest, helmet}, int enchantability)
            public static ArmorMaterial samuraiArmor = EnumHelper.addArmorMaterial("samuraiArmor", "samuraiDefault",  15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.item_armor_equip_iron);
/*  40 */   public static ArmorMaterial darkKnightArmor = EnumHelper.addArmorMaterial("darkKnightArmor", "darkKnight",  40, new int[] { 3, 8, 6, 3 }, 7, SoundEvents.item_armor_equip_iron);
/*  41 */   public static ArmorMaterial knightArmor = EnumHelper.addArmorMaterial("knightArmor", "knight", 15, new int[] { 2, 5, 6, 2 }, 12, SoundEvents.item_armor_equip_iron);
/*  42 */   public static ArmorMaterial templarArmor = EnumHelper.addArmorMaterial("templarArmor", "templar", 20, new int[] { 2, 7, 6, 2 }, 20, SoundEvents.item_armor_equip_iron);
/*  43 */   public static ArmorMaterial paladinArmor = EnumHelper.addArmorMaterial("paladinArmor", "paladin", 25, new int[] { 3, 8, 5, 3 }, 28, SoundEvents.item_armor_equip_iron);
/*  44 */   public static ArmorMaterial romanArmor = EnumHelper.addArmorMaterial("romanArmor", "roman", 15, new int[] { 3, 6, 7, 2 }, 9, SoundEvents.item_armor_equip_iron);
/*  45 */   public static ArmorMaterial skyrimGuardArmor = EnumHelper.addArmorMaterial("skyrimGuardArmor", "skyrimGuardYellow", 15, new int[] { 2, 5, 6, 2 }, 12, SoundEvents.item_armor_equip_iron);
/*  46 */   public static ArmorMaterial assassinArmor = EnumHelper.addArmorMaterial("assassinArmor", "assassin", 12, new int[] { 2, 5, 5, 2 }, 16, SoundEvents.item_armor_equip_iron);
/*     */   
/*     */ 
/*     */   @EventHandler
/*     */   public void preInit(FMLPreInitializationEvent event)
/*     */   {
/*  52 */
/*     */     
/*  55 */     samuraiDefaultHelmet = new SamuraiDefaultArmor(samuraiArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("samuraiDefaultHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  56 */     samuraiDefaultChestPlate = new SamuraiDefaultArmor(samuraiArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("samuraiDefaultChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  57 */     samuraiDefaultLeg = new SamuraiDefaultArmor(samuraiArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("samuraiDefaultLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  58 */     samuraiDefaultBoots = new SamuraiDefaultArmor(samuraiArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("samuraiDefaultBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  60 */     samuraiGreenHelmet = new SamuraiGreenArmor(samuraiArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("samuraiGreenHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  61 */     samuraiGreenChestPlate = new SamuraiGreenArmor(samuraiArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("samuraiGreenChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  62 */     samuraiGreenLeg = new SamuraiGreenArmor(samuraiArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("samuraiGreenLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  63 */     samuraiGreenBoots = new SamuraiGreenArmor(samuraiArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("samuraiGreenBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  65 */     samuraiRedHelmet = new SamuraiRedArmor(samuraiArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("samuraiRedHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  66 */     samuraiRedChestPlate = new SamuraiRedArmor(samuraiArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("samuraiRedChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  67 */     samuraiRedLeg = new SamuraiRedArmor(samuraiArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("samuraiRedLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  68 */     samuraiRedBoots = new SamuraiRedArmor(samuraiArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("samuraiRedBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  70 */     samuraiBlueHelmet = new SamuraiBlueArmor(samuraiArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("samuraiBlueHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  71 */     samuraiBlueChestPlate = new SamuraiBlueArmor(samuraiArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("samuraiBlueChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  72 */     samuraiBlueLeg = new SamuraiBlueArmor(samuraiArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("samuraiBlueLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  73 */     samuraiBlueBoots = new SamuraiBlueArmor(samuraiArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("samuraiBlueBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  75 */     darkKnightHelmet = new DarkKnightArmor(darkKnightArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("darkKnightHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  76 */     darkKnightChestPlate = new DarkKnightArmor(darkKnightArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("darkKnightChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  77 */     darkKnightLeg = new DarkKnightArmor(darkKnightArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("darkKnightLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  78 */     darkKnightBoots = new DarkKnightArmor(darkKnightArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("darkKnightBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  80 */     knightHelmet = new KnightArmor(knightArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("knightHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  81 */     knightChestPlate = new KnightArmor(knightArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("knightChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  82 */     knightLeg = new KnightArmor(knightArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("knightLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  83 */     knightBoots = new KnightArmor(knightArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("knightBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  85 */     templarHelmet = new TemplarArmor(templarArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("templarHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  86 */     templarChestPlate = new TemplarArmor(templarArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("templarChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  87 */     templarLeg = new TemplarArmor(templarArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("templarLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  88 */     templarBoots = new TemplarArmor(templarArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("templarBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  90 */     paladinHelmet = new PaladinArmor(paladinArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("paladinHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  91 */     paladinChestPlate = new PaladinArmor(paladinArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("paladinChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  92 */     paladinLeg = new PaladinArmor(paladinArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("paladinLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  93 */     paladinBoots = new PaladinArmor(paladinArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("paladinBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/*  95 */     romanHelmet = new RomanArmor(romanArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("romanHelmet").setCreativeTab(CreativeTabs.tabCombat);
/*  96 */     romanChestPlate = new RomanArmor(romanArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("romanChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/*  97 */     romanLeg = new RomanArmor(romanArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("romanLeg").setCreativeTab(CreativeTabs.tabCombat);
/*  98 */     romanBoots = new RomanArmor(romanArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("romanBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/* 100 */     skyrimGuardGreenHelmet = new SkyrimGuardGreenArmor(skyrimGuardArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("skyrimGuardGreenHelmet").setCreativeTab(CreativeTabs.tabCombat);
/* 101 */     skyrimGuardGreenChestPlate = new SkyrimGuardGreenArmor(skyrimGuardArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("skyrimGuardGreenChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/* 102 */     skyrimGuardGreenLeg = new SkyrimGuardGreenArmor(skyrimGuardArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("skyrimGuardGreenLeg").setCreativeTab(CreativeTabs.tabCombat);
/* 103 */     skyrimGuardGreenBoots = new SkyrimGuardGreenArmor(skyrimGuardArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("skyrimGuardGreenBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/* 105 */     skyrimGuardRedHelmet = new SkyrimGuardRedArmor(skyrimGuardArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("skyrimGuardRedHelmet").setCreativeTab(CreativeTabs.tabCombat);
/* 106 */     skyrimGuardRedChestPlate = new SkyrimGuardRedArmor(skyrimGuardArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("skyrimGuardRedChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/* 107 */     skyrimGuardRedLeg = new SkyrimGuardRedArmor(skyrimGuardArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("skyrimGuardRedLeg").setCreativeTab(CreativeTabs.tabCombat);
/* 108 */     skyrimGuardRedBoots = new SkyrimGuardRedArmor(skyrimGuardArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("skyrimGuardRedBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/* 110 */     skyrimGuardBlueHelmet = new SkyrimGuardBlueArmor(skyrimGuardArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("skyrimGuardBlueHelmet").setCreativeTab(CreativeTabs.tabCombat);
/* 111 */     skyrimGuardBlueChestPlate = new SkyrimGuardBlueArmor(skyrimGuardArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("skyrimGuardBlueChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/* 112 */     skyrimGuardBlueLeg = new SkyrimGuardBlueArmor(skyrimGuardArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("skyrimGuardBlueLeg").setCreativeTab(CreativeTabs.tabCombat);
/* 113 */     skyrimGuardBlueBoots = new SkyrimGuardBlueArmor(skyrimGuardArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("skyrimGuardBlueBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/* 115 */     skyrimGuardYellowHelmet = new SkyrimGuardYellowArmor(skyrimGuardArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("skyrimGuardYellowHelmet").setCreativeTab(CreativeTabs.tabCombat);
/* 116 */     skyrimGuardYellowChestPlate = new SkyrimGuardYellowArmor(skyrimGuardArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("skyrimGuardYellowChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/* 117 */     skyrimGuardYellowLeg = new SkyrimGuardYellowArmor(skyrimGuardArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("skyrimGuardYellowLeg").setCreativeTab(CreativeTabs.tabCombat);
/* 118 */     skyrimGuardYellowBoots = new SkyrimGuardYellowArmor(skyrimGuardArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("skyrimGuardYellowBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */     
/* 120 */     assassinHelmet = new AssassinArmor(assassinArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("assassinHelmet").setCreativeTab(CreativeTabs.tabCombat);
/* 121 */     assassinChestPlate = new AssassinArmor(assassinArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("assassinChestPlate").setCreativeTab(CreativeTabs.tabCombat);
/* 122 */     assassinLeg = new AssassinArmor(assassinArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("assassinLeg").setCreativeTab(CreativeTabs.tabCombat);
/* 123 */     assassinBoots = new AssassinArmor(assassinArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("assassinBoots").setCreativeTab(CreativeTabs.tabCombat);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @EventHandler
/*     */   public void init(FMLInitializationEvent event)
/*     */   {
/* 134 */     //GameRegistry.addRecipe(new net.minecraft.item.ItemStack(net.minecraft.init.Items.field_151116_aA), new Object[] { "ZZZ", "ZZZ", "ZZZ", 'Z'), net.minecraft.init.Items.field_151078_bh });
/*     */     
/* 136 */     GameRegistry.addRecipe(new ItemStack(samuraiDefaultHelmet), new Object[] { " I ", "ILI", " I ", 'I', Items.iron_ingot, 'L', Items.leather_helmet});
/* 137 */     GameRegistry.addRecipe(new ItemStack(samuraiDefaultChestPlate), new Object[] { " I ", "ILI", " I ", 'I', Items.iron_ingot, 'L', Items.leather_chestplate });
/* 138 */     GameRegistry.addRecipe(new ItemStack(samuraiDefaultLeg), new Object[] { " I ", "ILI", " I ", 'I', Items.iron_ingot, 'L', Items.leather_leggings });
/* 139 */     GameRegistry.addRecipe(new ItemStack(samuraiDefaultBoots), new Object[] { " I ", "ILI", " I ", 'I', Items.iron_ingot, 'L', Items.leather_boots});
/*     */     
/* 141 */     GameRegistry.addRecipe(new ItemStack(samuraiGreenHelmet), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 10), 'S', samuraiDefaultHelmet });
/* 142 */     GameRegistry.addRecipe(new ItemStack(samuraiGreenChestPlate), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 10), 'S', samuraiDefaultChestPlate });
/* 143 */     GameRegistry.addRecipe(new ItemStack(samuraiGreenLeg), new Object[] { "D", "S", 'D',  new ItemStack(Items.dye, 1, 10), 'S', samuraiDefaultLeg });
/* 144 */     GameRegistry.addRecipe(new ItemStack(samuraiGreenBoots), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 10), 'S', samuraiDefaultBoots });
/*     */     
/* 146 */     GameRegistry.addRecipe(new ItemStack(samuraiRedHelmet), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 1), 'S', samuraiDefaultHelmet });
/* 147 */     GameRegistry.addRecipe(new ItemStack(samuraiRedChestPlate), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 1), 'S', samuraiDefaultChestPlate });
/* 148 */     GameRegistry.addRecipe(new ItemStack(samuraiRedLeg), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 1), 'S', samuraiDefaultLeg });
/* 149 */     GameRegistry.addRecipe(new ItemStack(samuraiRedBoots), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 1), 'S', samuraiDefaultBoots });
/*     */     
/* 151 */     GameRegistry.addRecipe(new ItemStack(samuraiBlueHelmet), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 4), 'S', samuraiDefaultHelmet });
/* 152 */     GameRegistry.addRecipe(new ItemStack(samuraiBlueChestPlate), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 4), 'S', samuraiDefaultChestPlate });
/* 153 */     GameRegistry.addRecipe(new ItemStack(samuraiBlueLeg), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 4), 'S', samuraiDefaultLeg });
/* 154 */     GameRegistry.addRecipe(new ItemStack(samuraiBlueBoots), new Object[] { "D", "S", 'D', new ItemStack(Items.dye, 1, 4), 'S', samuraiDefaultBoots });
/*     */     
/* 156 */     GameRegistry.addRecipe(new ItemStack(darkKnightHelmet), new Object[] { "OOO", "O O", 'O', Blocks.obsidian });
/* 157 */     GameRegistry.addRecipe(new ItemStack(darkKnightChestPlate), new Object[] { "O O", "OOO", "OOO", 'O', Blocks.obsidian });
/* 158 */     GameRegistry.addRecipe(new ItemStack(darkKnightLeg), new Object[] { "OOO", "O O", "O O", 'O', Blocks.obsidian });
/* 159 */     GameRegistry.addRecipe(new ItemStack(darkKnightBoots), new Object[] { "O O", "O O", 'O', Blocks.obsidian });
/*     */     
/* 161 */     GameRegistry.addRecipe(new ItemStack(templarHelmet), new Object[] { " G ", "IAI", " L ", 'A', knightHelmet, 'I', Items.iron_ingot, 'G', Items.gold_ingot, 'L', Items.leather });
/* 162 */     GameRegistry.addRecipe(new ItemStack(templarChestPlate), new Object[] { " G ", "IAI", " L ", 'A', knightChestPlate, 'I', Items.iron_ingot, 'G', Items.gold_ingot, 'L', Items.leather });
/* 163 */     GameRegistry.addRecipe(new ItemStack(templarLeg), new Object[] { " G ", "IAI", " L ", 'A', knightLeg, 'I', Items.iron_ingot, 'G', Items.gold_ingot, 'L', Items.leather });
/* 164 */     GameRegistry.addRecipe(new ItemStack(templarBoots), new Object[] { " G ", "IAI", " L ", 'A', knightBoots, 'I', Items.iron_ingot, 'G', Items.iron_ingot, 'L', Items.leather });
/*     */     
/* 166 */     GameRegistry.addRecipe(new ItemStack(paladinHelmet), new Object[] { " G ", "GAG", " G ", 'A', templarHelmet, 'G', Items.iron_ingot });
/* 167 */     GameRegistry.addRecipe(new ItemStack(paladinChestPlate), new Object[] { " G ", "GAG", " G ", 'A', templarChestPlate, 'G', Items.iron_ingot });
/* 168 */     GameRegistry.addRecipe(new ItemStack(paladinLeg), new Object[] { " G ", "GAG", " G ", 'A', templarLeg, 'G', Items.iron_ingot });
/* 169 */     GameRegistry.addRecipe(new ItemStack(paladinBoots), new Object[] { " G ", "GAG", " G ", 'A', templarBoots, 'G', Items.iron_ingot });
/*     */     
/* 171 */     GameRegistry.addRecipe(new ItemStack(romanHelmet), new Object[] { "IGI", "I I", 'G', Items.iron_ingot, 'I', Items.iron_ingot });
/* 172 */     GameRegistry.addRecipe(new ItemStack(romanChestPlate), new Object[] { "G G", "III", "III", 'G', Items.iron_ingot, 'I', Items.iron_ingot });
/* 173 */     GameRegistry.addRecipe(new ItemStack(romanLeg), new Object[] { "GIG", "I I", "I I", 'G', Items.iron_ingot, 'I', Items.iron_ingot });
/* 174 */     GameRegistry.addRecipe(new ItemStack(romanBoots), new Object[] { "G G", "I I", 'G', Items.iron_ingot, 'I', Items.iron_ingot });
/*     */     
/* 176 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardGreenHelmet), new Object[] { "W", "A", 'A', Items.iron_helmet, 'W', new ItemStack(Blocks.wool, 1, 13) });
/* 177 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardGreenChestPlate), new Object[] { "W", "A", 'A', Items.iron_chestplate, 'W', new ItemStack(Blocks.wool, 1, 13) });
/* 178 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardGreenLeg), new Object[] { "W", "A", 'A', Items.iron_leggings, 'W',new ItemStack(Blocks.wool, 1, 13) });
/* 179 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardGreenBoots), new Object[] { "W", "A", 'A', Items.iron_boots, 'W', new ItemStack(Blocks.wool, 1, 13) });
/*     */     
/* 181 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardRedHelmet), new Object[] { "W", "A", 'A', Items.iron_helmet, 'W', new ItemStack(Blocks.wool, 1, 14) });
/* 182 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardRedChestPlate), new Object[] { "W", "A", 'A', Items.iron_chestplate, 'W', new ItemStack(Blocks.wool, 1, 14) });
/* 183 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardRedLeg), new Object[] { "W", "A", 'A', Items.iron_leggings, 'W', new ItemStack(Blocks.wool, 1, 14) });
/* 184 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardRedBoots), new Object[] { "W", "A", 'A', Items.iron_boots, 'W', new ItemStack(Blocks.wool, 1, 14) });
/*     */     
/* 186 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardBlueHelmet), new Object[] { "W", "A", 'A', Items.iron_helmet, 'W', new ItemStack(Blocks.wool, 1, 11) });
/* 187 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardBlueChestPlate), new Object[] { "W", "A", 'A', Items.iron_chestplate, 'W', new ItemStack(Blocks.wool, 1, 11) });
/* 188 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardBlueLeg), new Object[] { "W", "A", 'A', Items.iron_leggings, 'W', new ItemStack(Blocks.wool, 1, 11) });
/* 189 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardBlueBoots), new Object[] { "W", "A", 'A', Items.iron_boots, 'W', new ItemStack(Blocks.wool, 1, 11) });
/*     */     
/* 191 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardYellowHelmet), new Object[] { "W", "A", 'A', Items.iron_helmet, 'W', new ItemStack(Blocks.wool, 1, 4) });
/* 192 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardYellowChestPlate), new Object[] { "W", "A", 'A', Items.iron_chestplate, 'W', new ItemStack(Blocks.wool, 1, 4) });
/* 193 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardYellowLeg), new Object[] { "W", "A", 'A', Items.iron_leggings, 'W', new ItemStack(Blocks.wool, 1, 4) });
/* 194 */     GameRegistry.addRecipe(new ItemStack(skyrimGuardYellowBoots), new Object[] { "W", "A", 'A', Items.iron_boots, 'W', new ItemStack(Blocks.wool, 1, 4) });
/*     */     
/* 196 */     GameRegistry.addRecipe(new ItemStack(knightHelmet), new Object[] { "W", "A", 'A', Items.iron_helmet, 'W', Blocks.wool });
/* 197 */     GameRegistry.addRecipe(new ItemStack(knightChestPlate), new Object[] { "W", "A", 'A', Items.iron_chestplate, 'W', Blocks.wool });
/* 198 */     GameRegistry.addRecipe(new ItemStack(knightLeg), new Object[] { "W", "A", 'A', Items.iron_leggings, 'W', Blocks.wool });
/* 199 */     GameRegistry.addRecipe(new ItemStack(knightBoots), new Object[] { "W", "A", 'A', Items.iron_boots, 'W', Blocks.wool });
/*     */     
/* 201 */     GameRegistry.addRecipe(new ItemStack(assassinHelmet), new Object[] { "E", "A", 'E', Items.ender_eye, 'A', Items.leather_helmet });
/* 202 */     GameRegistry.addRecipe(new ItemStack(assassinChestPlate), new Object[] { "E", "A", 'E', Items.ender_eye, 'A', Items.leather_chestplate });
/* 203 */     GameRegistry.addRecipe(new ItemStack(assassinLeg), new Object[] { "E", "A", 'E', Items.ender_eye, 'A', Items.leather_leggings });
/* 204 */     GameRegistry.addRecipe(new ItemStack(assassinBoots), new Object[] { "E", "A", 'E', Items.ender_eye, 'A', Items.leather_boots });
/*     */     
/*     */ 
/*     */

/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */
/*     */ 
/* 214 */     GameRegistry.registerItem(samuraiDefaultHelmet, "samuraiDefaultHelmet");
/* 215 */     GameRegistry.registerItem(samuraiDefaultChestPlate, "samuraiDefaultChestPlate");
/* 216 */     GameRegistry.registerItem(samuraiDefaultLeg, "samuraiDefaultLeg");
/* 217 */     GameRegistry.registerItem(samuraiDefaultBoots, "samuraiDefaultBoots");
/*     */     
/* 219 */     GameRegistry.registerItem(samuraiGreenHelmet, "samuraiGreenHelmet");
/* 220 */     GameRegistry.registerItem(samuraiGreenChestPlate, "samuraiGreenChestPlate");
/* 221 */     GameRegistry.registerItem(samuraiGreenLeg, "samuraiGreenLeg");
/* 222 */     GameRegistry.registerItem(samuraiGreenBoots, "samuraiGreenBoots");
/*     */     
/* 224 */     GameRegistry.registerItem(samuraiRedHelmet, "samuraiRedHelmet");
/* 225 */     GameRegistry.registerItem(samuraiRedChestPlate, "samuraiRedChestPlate");
/* 226 */     GameRegistry.registerItem(samuraiRedLeg, "samuraiRedLeg");
/* 227 */     GameRegistry.registerItem(samuraiRedBoots, "samuraiRedBoots");
/*     */     
/* 229 */     GameRegistry.registerItem(samuraiBlueHelmet, "samuraiBlueHelmet");
/* 230 */     GameRegistry.registerItem(samuraiBlueChestPlate, "samuraiBlueChestPlate");
/* 231 */     GameRegistry.registerItem(samuraiBlueLeg, "samuraiBlueLeg");
/* 232 */     GameRegistry.registerItem(samuraiBlueBoots, "samuraiBlueBoots");
/*     */     
/* 234 */     GameRegistry.registerItem(darkKnightHelmet, "darkKnightHelmet");
/* 235 */     GameRegistry.registerItem(darkKnightChestPlate, "darkKnightChestPlate");
/* 236 */     GameRegistry.registerItem(darkKnightLeg, "darkKnightLeg");
/* 237 */     GameRegistry.registerItem(darkKnightBoots, "darkKnightBoots");
/*     */     
/* 239 */     GameRegistry.registerItem(knightHelmet, "knightHelmet");
/* 240 */     GameRegistry.registerItem(knightChestPlate, "knightChestPlate");
/* 241 */     GameRegistry.registerItem(knightLeg, "knightLeg");
/* 242 */     GameRegistry.registerItem(knightBoots, "knightBoots");
/*     */     
/* 244 */     GameRegistry.registerItem(templarHelmet, "templarHelmet");
/* 245 */     GameRegistry.registerItem(templarChestPlate, "templarChestPlate");
/* 246 */     GameRegistry.registerItem(templarLeg, "templarLeg");
/* 247 */     GameRegistry.registerItem(templarBoots, "templarBoots");
/*     */     
/* 249 */     GameRegistry.registerItem(paladinHelmet, "paladinHelmet");
/* 250 */     GameRegistry.registerItem(paladinChestPlate, "paladinChestPlate");
/* 251 */     GameRegistry.registerItem(paladinLeg, "paladinLeg");
/* 252 */     GameRegistry.registerItem(paladinBoots, "paladinBoots");
/*     */     
/* 254 */     GameRegistry.registerItem(romanHelmet, "romanHelmet");
/* 255 */     GameRegistry.registerItem(romanChestPlate, "romanChestPlate");
/* 256 */     GameRegistry.registerItem(romanLeg, "romanLeg");
/* 257 */     GameRegistry.registerItem(romanBoots, "romanBoots");
/*     */     
/* 259 */     GameRegistry.registerItem(skyrimGuardGreenHelmet, "skyrimGuardGreenHelmet");
/* 260 */     GameRegistry.registerItem(skyrimGuardGreenChestPlate, "skyrimGuardGreenChestPlate");
/* 261 */     GameRegistry.registerItem(skyrimGuardGreenLeg, "skyrimGuardGreenLeg");
/* 262 */     GameRegistry.registerItem(skyrimGuardGreenBoots, "skyrimGuardGreenBoots");
/*     */     
/* 264 */     GameRegistry.registerItem(skyrimGuardRedHelmet, "skyrimGuardRedHelmet");
/* 265 */     GameRegistry.registerItem(skyrimGuardRedChestPlate, "skyrimGuardRedChestPlate");
/* 266 */     GameRegistry.registerItem(skyrimGuardRedLeg, "skyrimGuardRedLeg");
/* 267 */     GameRegistry.registerItem(skyrimGuardRedBoots, "skyrimGuardRedBoots");
/*     */     
/* 269 */     GameRegistry.registerItem(skyrimGuardBlueHelmet, "skyrimGuardBlueHelmet");
/* 270 */     GameRegistry.registerItem(skyrimGuardBlueChestPlate, "skyrimGuardBlueChestPlate");
/* 271 */     GameRegistry.registerItem(skyrimGuardBlueLeg, "skyrimGuardBlueLeg");
/* 272 */     GameRegistry.registerItem(skyrimGuardBlueBoots, "skyrimGuardBlueBoots");
/*     */     
/* 274 */     GameRegistry.registerItem(skyrimGuardYellowHelmet, "skyrimGuardYellowHelmet");
/* 275 */     GameRegistry.registerItem(skyrimGuardYellowChestPlate, "skyrimGuardYellowChestPlate");
/* 276 */     GameRegistry.registerItem(skyrimGuardYellowLeg, "skyrimGuardYellowLeg");
/* 277 */     GameRegistry.registerItem(skyrimGuardYellowBoots, "skyrimGuardYellowBoots");
/*     */     
/* 279 */     GameRegistry.registerItem(assassinHelmet, "assassinHelmet");
/* 280 */     GameRegistry.registerItem(assassinChestPlate, "assassinChestPlate");
/* 281 */     GameRegistry.registerItem(assassinLeg, "assassinLeg");
/* 282 */     GameRegistry.registerItem(assassinBoots, "assassinBoots");

                registerRenders();
/*     */   }

    public static void registerRenders() {

/* 214 */     registerRender(samuraiDefaultHelmet);
/* 215 */     registerRender(samuraiDefaultChestPlate);
/* 216 */     registerRender(samuraiDefaultLeg);
/* 217 */     registerRender(samuraiDefaultBoots);
/*     */
/* 219 */     registerRender(samuraiGreenHelmet);
/* 220 */     registerRender(samuraiGreenChestPlate);
/* 221 */     registerRender(samuraiGreenLeg);
/* 222 */     registerRender(samuraiGreenBoots);
/*     */
/* 224 */     registerRender(samuraiRedHelmet);
/* 225 */     registerRender(samuraiRedChestPlate);
/* 226 */     registerRender(samuraiRedLeg);
/* 227 */     registerRender(samuraiRedBoots);
/*     */
/* 229 */     registerRender(samuraiBlueHelmet);
/* 230 */     registerRender(samuraiBlueChestPlate);
/* 231 */     registerRender(samuraiBlueLeg);
/* 232 */     registerRender(samuraiBlueBoots);
/*     */
/* 234 */     registerRender(darkKnightHelmet);
/* 235 */     registerRender(darkKnightChestPlate);
/* 236 */     registerRender(darkKnightLeg);
/* 237 */     registerRender(darkKnightBoots);
/*     */
/* 239 */     registerRender(knightHelmet);
/* 240 */     registerRender(knightChestPlate);
/* 241 */     registerRender(knightLeg);
/* 242 */     registerRender(knightBoots);
/*     */
/* 244 */     registerRender(templarHelmet);
/* 245 */     registerRender(templarChestPlate);
/* 246 */     registerRender(templarLeg);
/* 247 */     registerRender(templarBoots);
/*     */
/* 249 */     registerRender(paladinHelmet);
/* 250 */     registerRender(paladinChestPlate);
/* 251 */     registerRender(paladinLeg);
/* 252 */     registerRender(paladinBoots);
/*     */
/* 254 */     registerRender(romanHelmet);
/* 255 */     registerRender(romanChestPlate);
/* 256 */     registerRender(romanLeg);
/* 257 */     registerRender(romanBoots);
/*     */
/* 259 */     registerRender(skyrimGuardGreenHelmet);
/* 260 */     registerRender(skyrimGuardGreenChestPlate);
/* 261 */     registerRender(skyrimGuardGreenLeg);
/* 262 */     registerRender(skyrimGuardGreenBoots);
/*     */
/* 264 */     registerRender(skyrimGuardRedHelmet);
/* 265 */     registerRender(skyrimGuardRedChestPlate);
/* 266 */     registerRender(skyrimGuardRedLeg);
/* 267 */     registerRender(skyrimGuardRedBoots);
/*     */
/* 269 */     registerRender(skyrimGuardBlueHelmet);
/* 270 */     registerRender(skyrimGuardBlueChestPlate);
/* 271 */     registerRender(skyrimGuardBlueLeg);
/* 272 */     registerRender(skyrimGuardBlueBoots);
/*     */
/* 274 */     registerRender(skyrimGuardYellowHelmet);
/* 275 */     registerRender(skyrimGuardYellowChestPlate);
/* 276 */     registerRender(skyrimGuardYellowLeg);
/* 277 */     registerRender(skyrimGuardYellowBoots);
/*     */
/* 279 */     registerRender(assassinHelmet);
/* 280 */     registerRender(assassinChestPlate);
/* 281 */     registerRender(assassinLeg);
/* 282 */     registerRender(assassinBoots);

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("armorcraft:" + item.getUnlocalizedName().substring(5), "inventory"));
    }
/*     */ }


/* Location:              /Users/loicd/Desktop/ArmorCraft-0.1.jar!/armor/ArmorCraft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */