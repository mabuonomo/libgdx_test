package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;

import java.util.logging.Level;

public class ApplicationListenerSample implements ApplicationListener {

    //private static final String TAG = "ApplicationListernerSample";
    private static final Logger logger = new Logger(ApplicationListener.class.getName(), Logger.DEBUG);
    private boolean renderInterrupt = true;

    @Override
    public void create() {
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        logger.debug("create()");

        logger.debug("app " + Gdx.app);
        logger.debug("audio " + Gdx.audio);
        logger.debug("input " + Gdx.input);
        logger.debug("files " + Gdx.files);
        logger.debug("net " + Gdx.net);
        logger.debug("graphics " + Gdx.graphics);

    }

    @Override
    public void resize(int width, int height) {
        logger.debug("resize () width= " + width + " height=" + height);
    }

    @Override
    public void render() {
        // called 60 times for seconds
        if (renderInterrupt) {
            logger.debug("render()");
            renderInterrupt = false;
        }
    }

    @Override
    public void pause() {
        logger.debug("pause()");
        renderInterrupt = true;
    }

    @Override
    public void resume() {
        logger.debug("resume()");
        renderInterrupt = true;
    }

    @Override
    public void dispose() {
        logger.debug("dispose()");
    }
}
