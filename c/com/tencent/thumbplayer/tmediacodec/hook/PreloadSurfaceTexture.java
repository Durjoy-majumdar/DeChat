package com.tencent.thumbplayer.tmediacodec.hook;

import android.graphics.SurfaceTexture;

public final class PreloadSurfaceTexture extends SurfaceTexture {
    private ActionCallback mActionCallback;

    public interface ActionCallback {
        void onReleased();
    }

    public PreloadSurfaceTexture(int i) {
        super(i);
    }

    public void release() {
        super.release();
        ActionCallback actionCallback = this.mActionCallback;
        if (actionCallback != null) {
            actionCallback.onReleased();
        }
    }

    public final void setActionCallback(ActionCallback actionCallback) {
        this.mActionCallback = actionCallback;
    }
}
