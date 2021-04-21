package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

import block.BlockType;
import entity.Direction;
import item.FoodType;
import item.Texturable;
import item.SeedType;
import entity.AnimalType;

public class Resources {
	
	
	public static class LazyResources {
			private static final Resources SINGLETON = new Resources();
	}
	
	public static Resources getRes() {
		return LazyResources.SINGLETON;
	}
	
	private  final String FILE_SEPARATOR = File.separator;
	private  final String TEXTURE_FOLDER = "/texture";

	private  final Map<Texturable, BufferedImage> textures = new HashMap<>();
	private  InputStream mainTheme;
	private  int animationDelay = 0;
	private  final int ANIMATION_SPEED = 500;

	private Resources() {
		try {
			//seed
			textures.put(SeedType.CARROT_SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/carrot2.png")));
			textures.put(SeedType.WHEAT_SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/weat.png")));
			textures.put(SeedType.POTATO_SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/potato2.png")));
			textures.put(SeedType.TOMATO_SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/tomato2.png")));
			textures.put(SeedType.ORANGE_SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/orange.png")));
			textures.put(SeedType.CHERRY_SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/cherry.png")));
			textures.put(SeedType.APPLE_SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/apple.png")));
			
			//food

			textures.put(FoodType.PORK_MEAT, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/carrot.png")));
			textures.put(FoodType.EGG, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/carrot.png")));
			textures.put(FoodType.MILK, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/carrot.png")));
			textures.put(FoodType.CARROT, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/carrot2.png")));
			textures.put(FoodType.POTATO, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/potato2.png")));
			textures.put(FoodType.TOMATO, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/tomato2.png")));
			textures.put(FoodType.APPLE, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/appletree.png")));
			textures.put(FoodType.ORANGE, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/orangetree.png")));
			textures.put(FoodType.CHERRY, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/cherrytree.png")));
			textures.put(FoodType.WHEAT, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/weat.png")));

			//block
			textures.put(BlockType.TERRAIN, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/grass.png")));
			textures.put(BlockType.FIELD, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/farmland.png")));
			textures.put(BlockType.WALL, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/wall.png")));
			textures.put(BlockType.LOCKED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/lock3.png")));
			textures.put(BlockType.WATER, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/water.png")));
			textures.put(BlockType.STALL, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/stall.png")));
			
			textures.put(Texture.LOCK, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/lucchetto.png")));
			textures.put(Texture.TREE, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/tree.png")));
			//textures.put(texture.LABELHUD, ImageIO.read(getClass().getResourceAsStream("/labelHUD.png")));

			textures.put(Texture.MONEY, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/moneyIcon.png")));
			textures.put(Texture.SEED, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/pianta.png")));
			textures.put(Texture.TIME, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/timeIcon.png")));
			textures.put(Texture.INFO, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/infoIcon.png")));
			textures.put(Texture.EMPTY, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/empty.png")));

			
			//player
			textures.put(Texture.PLAYER_RIGHT, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/right0.png")));
			textures.put(Texture.PLAYER_RIGHT2, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/right1.png")));
			textures.put(Texture.PLAYER_LEFT, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/left0.png")));
			textures.put(Texture.PLAYER_LEFT2, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/left1.png")));
			textures.put(Texture.PLAYER_DOWN, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/down0.png")));
			textures.put(Texture.PLAYER_DOWN2, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/down1.png")));
			textures.put(Texture.PLAYER_UP, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/up0.png")));
			textures.put(Texture.PLAYER_UP2, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/up1.png")));
			textures.put(Texture.PLAYER, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/stop.png")));


			//animals
			textures.put(AnimalType.COW, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/cow.png")));
			textures.put(AnimalType.PIG, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/pig.png")));
			textures.put(AnimalType.CHICKEN, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/chicken.png")));
			
			//keyboard commands
			textures.put(Texture.WASD, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/wasd.png")));
			textures.put(Texture.E_KEY, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/e.png")));
			textures.put(Texture.F_KEY, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/f.png")));
			textures.put(Texture.MOUSE_WHEEL, ImageIO.read(getClass().getResourceAsStream(TEXTURE_FOLDER+"/mouse.png")));
			
			mainTheme = getClass().getResourceAsStream("/hd.wav"); 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public  BufferedImage getPlayerInDirection(Direction dir) {
		animationDelay++;
		animationDelay %= ANIMATION_SPEED;
		boolean isFirstFrame = animationDelay > (ANIMATION_SPEED / 2);

		if (dir.isRight()) {
			if (isFirstFrame) {
				return textures.get(Texture.PLAYER_RIGHT);
			} else {
				return textures.get(Texture.PLAYER_RIGHT2);
			}
		} else if (dir.isLeft()) {
			if (isFirstFrame) {
				return textures.get(Texture.PLAYER_LEFT);
			} else {
				return textures.get(Texture.PLAYER_LEFT2);
			}
		} else if (dir.isDown()) {
			if (isFirstFrame) {
				return textures.get(Texture.PLAYER_DOWN);
			} else {
				return textures.get(Texture.PLAYER_DOWN2);
			}
		} else if (dir.isUp()) {
			if (isFirstFrame) {
				return textures.get(Texture.PLAYER_UP);
			} else {
				return textures.get(Texture.PLAYER_UP2);
			}
		} else {
			return textures.get(Texture.PLAYER);
		}
	}

	public BufferedImage getTextures(Texturable item) {
		return textures.get(item);
	}


	public InputStream getMainTheme() {
		return mainTheme;
	}
}
