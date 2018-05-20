package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class WallTile extends Tile {
	
	public WallTile(int id) {
		super(Assets.wall, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
