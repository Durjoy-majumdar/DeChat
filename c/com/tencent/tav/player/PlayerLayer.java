package com.tencent.tav.player;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public class PlayerLayer {
    private boolean needReleaseSurface = false;
    private Player player;
    private boolean readyForDisplay;
    private PlayerLayerReadyListener readyListener = null;
    public Surface surface;
    public int surfaceHeight;
    public int surfaceWidth;
    private int videoGravity;
    private Rect videoRect;

    public interface PlayerLayerReadyListener {
        void finish(PlayerLayer playerLayer);
    }

    public PlayerLayer(Surface surface2, int i, int i2) {
        this.surface = surface2;
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public int getSurfaceHeight() {
        return this.surfaceHeight;
    }

    public int getSurfaceWidth() {
        return this.surfaceWidth;
    }

    public int getVideoGravity() {
        return this.videoGravity;
    }

    public Rect getVideoRect() {
        return this.videoRect;
    }

    public boolean isReadyForDisplay() {
        return this.readyForDisplay;
    }

    public void release() {
        if (this.needReleaseSurface) {
            this.surface.release();
        }
    }

    public void setPlayer(Player player2) {
        this.player = player2;
        if (player2 != null) {
            player2.bindLayer(this);
        }
    }

    public void setReadyForDisplay(PlayerLayerReadyListener playerLayerReadyListener) {
        this.readyListener = playerLayerReadyListener;
    }

    public void setVideoGravity(int i) {
        this.videoGravity = i;
    }

    public PlayerLayer(SurfaceTexture surfaceTexture, int i, int i2) {
        this.surface = new Surface(surfaceTexture);
        this.needReleaseSurface = true;
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
    }
}
