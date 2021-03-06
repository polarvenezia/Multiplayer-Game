package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.PlayScreen;

public class MultiplayerGame extends Game {

	/** SpriteBatch is a container for our images, textures, etc.
	* SpriteBatch is memory intensive, hence we make it public
	* so other screens will access this one SpriteBatch */

    // virtual width and height for game
    public static final int V_WIDTH = 500;
    public static final int V_HEIGHT = 500;
    public static final float PPM = 60;

	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
        setScreen(new PlayScreen(this));

	}

	@Override
	public void render () {
        super.render(); // delegate render method to playscreen
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
