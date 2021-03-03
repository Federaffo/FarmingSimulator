package gameMap;

import java.awt.Rectangle;
import java.util.*;

import entity.Pair;
import item.Food;
import item.FoodType;
import item.Seed;
import item.SeedType;





public class FactoryBlock {
	
	public Block getTerrainBlock(){
		return new Block(BlockType.TERRAIN, true, false);
	}
	
	public Block getObstacleBlock(){
		return new Block(BlockType.OBSTACLE, false, false);
	}
	
	public Block getFieldBlock(){
		return new Block(BlockType.FIELD, true, true){
			private Optional<Seed> seed = Optional.empty();
			public void plant() {
				seed = Optional.of(new Seed(SeedType.POTATO_SEED));
			}
			public Pair<Food, Integer> harvest() {
				Food food = seed.get().Harvest();
				return new Pair<>(food,3);
			}
		};
	}
	

	private class Block extends Rectangle{
		
		public final static int SIZE = 50;
		private final BlockType blockType;
		private final boolean isWalkable;
		private final boolean isInteractable;

		public Block(BlockType bt, boolean isWalkable, boolean isInteractable) {
			this.blockType = bt;
			this.isWalkable = isWalkable;
			this.isInteractable = isInteractable;
		}
		

		public boolean isWalkable() {
			return this.isWalkable();
		}
		
		public boolean isInteractable() {
			return this.isInteractable();
		}
		
		public BlockType getType() {
			return this.blockType;
		}

	}

}