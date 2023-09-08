package com.tencent.xweb.skia_canvas.external_texture;

import android.graphics.SurfaceTexture;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class SkiaCanvasExternalTexturePlugin implements ISkiaCanvasExternalTextureController {
    private Map<ISkiaCanvasExternalTextureHandler, PluginLoadResult> mLoadResultMap = new ConcurrentHashMap();
    private Map<ISkiaCanvasExternalTextureHandler, Boolean> mSurfaceTextureAttachedMap = new ConcurrentHashMap();

    public static class PluginFrameAvailableListener implements SurfaceTexture.OnFrameAvailableListener {
        private ISkiaCanvasExternalTextureHandler mHandler;

        public PluginFrameAvailableListener(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler) {
            this.mHandler = iSkiaCanvasExternalTextureHandler;
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.mHandler.onFrameAvailable();
        }
    }

    public static class PluginLoadResult {
        public int height;
        public SurfaceTexture surfaceTexture;
        public int width;

        public PluginLoadResult(SurfaceTexture surfaceTexture2, int i, int i2) {
            this.surfaceTexture = surfaceTexture2;
            this.width = i;
            this.height = i2;
        }
    }

    public static class PluginUpdateResult {
        public float[] transform;

        public PluginUpdateResult(float[] fArr) {
            this.transform = fArr;
        }
    }

    public boolean load(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, String str, int i, String str2) {
        PluginLoadResult onPluginInstanceLoad = onPluginInstanceLoad(iSkiaCanvasExternalTextureHandler, str, i, str2);
        SurfaceTexture surfaceTexture = onPluginInstanceLoad.surfaceTexture;
        if (surfaceTexture == null || onPluginInstanceLoad.height < 0 || onPluginInstanceLoad.width < 0) {
            return false;
        }
        surfaceTexture.setOnFrameAvailableListener(new PluginFrameAvailableListener(iSkiaCanvasExternalTextureHandler));
        onPluginInstanceLoad.surfaceTexture.setDefaultBufferSize(onPluginInstanceLoad.width, onPluginInstanceLoad.height);
        iSkiaCanvasExternalTextureHandler.onLoad(onPluginInstanceLoad.surfaceTexture, onPluginInstanceLoad.width, onPluginInstanceLoad.height);
        this.mLoadResultMap.put(iSkiaCanvasExternalTextureHandler, onPluginInstanceLoad);
        this.mSurfaceTextureAttachedMap.put(iSkiaCanvasExternalTextureHandler, Boolean.FALSE);
        return true;
    }

    public void onDestroy(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, String str, int i, String str2) {
        onPluginInstanceDestroy(iSkiaCanvasExternalTextureHandler, i, str2);
        this.mLoadResultMap.remove(iSkiaCanvasExternalTextureHandler);
        this.mSurfaceTextureAttachedMap.remove(iSkiaCanvasExternalTextureHandler);
    }

    public abstract void onPluginInstanceDestroy(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, int i, String str);

    public PluginUpdateResult onPluginInstanceImageUpdate(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, int i, int i2) {
        Boolean bool = this.mSurfaceTextureAttachedMap.get(iSkiaCanvasExternalTextureHandler);
        PluginLoadResult pluginLoadResult = this.mLoadResultMap.get(iSkiaCanvasExternalTextureHandler);
        if (bool == null || !bool.booleanValue()) {
            pluginLoadResult.surfaceTexture.attachToGLContext(i);
            this.mSurfaceTextureAttachedMap.put(iSkiaCanvasExternalTextureHandler, Boolean.TRUE);
        }
        pluginLoadResult.surfaceTexture.updateTexImage();
        float[] fArr = new float[16];
        pluginLoadResult.surfaceTexture.getTransformMatrix(fArr);
        return new PluginUpdateResult(fArr);
    }

    public abstract PluginLoadResult onPluginInstanceLoad(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, String str, int i, String str2);

    public abstract boolean supportType(String str);

    public float[] updateImage(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, int i, String str, int i2, String str2) {
        return onPluginInstanceImageUpdate(iSkiaCanvasExternalTextureHandler, i, i2).transform;
    }
}
