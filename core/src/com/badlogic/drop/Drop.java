package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Drop extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    public GameScreen gameScreen ;

    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // use libGDX's default Arial font
        this.setScreen(new MainMenuScreen(this));
        gameScreen = new GameScreen(this);
    }

    public void render() {
        super.render(); // important!
    }

   @Override
    public void dispose() {
       if(gameScreen != null)
           gameScreen.dispose();

       batch.dispose();
       font.dispose();

   }
}