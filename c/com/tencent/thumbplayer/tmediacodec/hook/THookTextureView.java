package com.tencent.thumbplayer.tmediacodec.hook;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;

public class THookTextureView extends TextureView {
    public static final String TAG = "THookTextureView";
    /* access modifiers changed from: private */
    public static SurfaceTextureHookCallback sHookCallback;
    private final TextureView.SurfaceTextureListener mInnerSetListener;
    /* access modifiers changed from: private */
    public TextureView.SurfaceTextureListener mOutSetListener;

    public interface SurfaceTextureHookCallback {
        boolean onSurfaceTextureDestroyedCalled(SurfaceTexture surfaceTexture);
    }

    public THookTextureView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public static void setHookCallback(SurfaceTextureHookCallback surfaceTextureHookCallback) {
        sHookCallback = surfaceTextureHookCallback;
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.mOutSetListener = surfaceTextureListener;
        super.setSurfaceTextureListener(this.mInnerSetListener);
    }

    public THookTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public THookTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInnerSetListener = new TextureView.SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (THookTextureView.this.mOutSetListener != null) {
                    THookTextureView.this.mOutSetListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z = false;
                boolean z2 = THookTextureView.this.mOutSetListener == null || THookTextureView.this.mOutSetListener.onSurfaceTextureDestroyed(surfaceTexture);
                if (THookTextureView.sHookCallback != null) {
                    if (z2 && THookTextureView.sHookCallback.onSurfaceTextureDestroyedCalled(surfaceTexture)) {
                        z = true;
                    }
                    LogUtils.m21881d(THookTextureView.TAG, this + "onSurfaceTextureDestroyed surfaceTexture:" + surfaceTexture + " hookResult:" + z + "result:" + z2);
                    return z;
                }
                LogUtils.m21881d(THookTextureView.TAG, this + ", onSurfaceTextureDestroyed surfaceTexture:" + surfaceTexture + " result:" + z2);
                return z2;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (THookTextureView.this.mOutSetListener != null) {
                    THookTextureView.this.mOutSetListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (THookTextureView.this.mOutSetListener != null) {
                    THookTextureView.this.mOutSetListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            }
        };
        setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
    }
}
