package dev.study.seansgame.entities.statics;

import java.awt.Graphics;

import dev.study.seansgame.Handler;
import dev.study.seansgame.gfx.Assets;
import dev.study.seansgame.items.Item;
import dev.study.seansgame.tiles.Tile;


public class Tree extends StaticEntity {
	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 16;
		bounds.y = 34;
		bounds.width = 32;
		bounds.height = 1;
	}


	@Override
	public void tick() {

		
	}
	
	@Override
	public void die() {
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.tree, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
