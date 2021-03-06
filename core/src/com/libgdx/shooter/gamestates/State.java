package com.libgdx.shooter.gamestates;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.libgdx.shooter.managers.GameStateManager;
import com.badlogic.gdx.utils.viewport.Viewport;

import static com.libgdx.shooter.game.ShooterGame.SCREEN_HEIGHT;
import static com.libgdx.shooter.game.ShooterGame.SCREEN_WIDTH;
import static com.libgdx.shooter.game.ShooterGame.WORLD_HEIGHT;
import static com.libgdx.shooter.game.ShooterGame.WORLD_WIDTH;

/**
 * Created by Conal on 30/09/2015.
 */
public abstract class State {

    protected GameStateManager gameStateManager;
    protected OrthographicCamera cam;
    protected Viewport viewport;


    public State (GameStateManager gsm){
        this.gameStateManager = gsm;
        cam = new OrthographicCamera();

//        cam = new OrthographicCamera(ShooterGame.WORLD_WIDTH, ShooterGame.WORLD_WIDTH * ShooterGame.SCREEN_ASPECT_RATIO);
//        cam = new OrthographicCamera(); //this is in the parent class
//        viewport = new FitViewport(SCREEN_WIDTH, SCREEN_HEIGHT, cam);
        viewport = new FitViewport(WORLD_WIDTH, WORLD_HEIGHT, cam);
//        viewport = new FitViewport(WORLD_WIDTH, WORLD_WIDTH * SCREEN_ASPECT_RATIO, cam);
//        viewport = new StretchViewport(WORLD_WIDTH, WORLD_HEIGHT, cam);
        viewport.apply();
    }

    public abstract void create();
    public abstract void update(float delta);
    public abstract void render();
    public abstract void handleInput();
    public abstract void dispose();
    public abstract void resize(int width, int height);
    public abstract void pause();
    public abstract void resume();
}
