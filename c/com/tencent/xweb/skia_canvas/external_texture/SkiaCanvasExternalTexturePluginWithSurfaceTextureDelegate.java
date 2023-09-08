package com.tencent.xweb.skia_canvas.external_texture;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import com.tencent.xweb.skia_canvas.external_texture.SkiaCanvasExternalTexturePlugin;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public abstract class SkiaCanvasExternalTexturePluginWithSurfaceTextureDelegate extends SkiaCanvasExternalTexturePlugin {
    private static final String TAG = "SETPluginWithSTDelegate";
    private Map<String, Map<Integer, InstanceDep>> mDepMap = new ConcurrentHashMap();

    public static class InstanceDep {
        public SurfaceTextureRenderDelegate delegate;
        public Map<ISkiaCanvasExternalTextureHandler, Surface> delegatedClonedDownStreamSurfaceMap = new HashMap();
        public SurfaceTexture delegatedUpStreamSurface;
        public final int height;
        public Surface originDisplaySurface;
        public final int width;

        public InstanceDep(int i, int i2, Surface surface) {
            this.width = i;
            this.height = i2;
            this.originDisplaySurface = surface;
        }
    }

    private Map<Integer, InstanceDep> getInstanceMapForCanvas(String str) {
        if (!this.mDepMap.containsKey(str)) {
            this.mDepMap.put(str, new ConcurrentHashMap());
        }
        return this.mDepMap.get(str);
    }

    private void initDelegateChain(InstanceDep instanceDep) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        instanceDep.delegatedUpStreamSurface = surfaceTexture;
        surfaceTexture.detachFromGLContext();
        instanceDep.delegate = new SurfaceTextureRenderDelegate(instanceDep.delegatedUpStreamSurface, instanceDep.originDisplaySurface);
    }

    public synchronized void onOriginSurfaceChanged(int i, String str, Surface surface) {
        SurfaceTextureRenderDelegate surfaceTextureRenderDelegate;
        InstanceDep instanceDep = getInstanceMapForCanvas(str).get(Integer.valueOf(i));
        if (!(instanceDep == null || (surfaceTextureRenderDelegate = instanceDep.delegate) == null)) {
            surfaceTextureRenderDelegate.removeDownStreamSurface(instanceDep.originDisplaySurface);
            if (surface != null) {
                instanceDep.delegate.addDownStreamSurface(surface);
                instanceDep.originDisplaySurface = surface;
            }
        }
    }

    public synchronized void onPluginInstanceDestroy(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, int i, String str) {
        Surface surface;
        InstanceDep instanceDep = getInstanceMapForCanvas(str).get(Integer.valueOf(i));
        if (!(instanceDep == null || (surface = instanceDep.delegatedClonedDownStreamSurfaceMap.get(iSkiaCanvasExternalTextureHandler)) == null)) {
            instanceDep.delegate.removeDownStreamSurface(surface);
            if (instanceDep.delegate.getAvailableDownStreamCount() == 1) {
                instanceDep.delegate.destroy();
                instanceDep.delegate = null;
            }
        }
    }

    public synchronized SkiaCanvasExternalTexturePlugin.PluginLoadResult onPluginInstanceLoad(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, String str, final int i, final String str2) {
        final InstanceDep instanceDep = getInstanceMapForCanvas(str2).get(Integer.valueOf(i));
        if (instanceDep == null) {
            return new SkiaCanvasExternalTexturePlugin.PluginLoadResult((SurfaceTexture) null, -1, -1);
        }
        if (instanceDep.delegate == null) {
            initDelegateChain(instanceDep);
            Objects.toString(instanceDep.originDisplaySurface);
            replaceDisplaySurface(i, str2, new Surface(instanceDep.delegatedUpStreamSurface));
            SkiaCanvasView.setSurfaceSize(instanceDep.originDisplaySurface, instanceDep.width, instanceDep.height);
            instanceDep.delegate.addReleaseCallback(new Runnable() {
                public void run() {
                    Objects.toString(instanceDep.originDisplaySurface);
                    SkiaCanvasExternalTexturePluginWithSurfaceTextureDelegate.this.replaceDisplaySurface(i, str2, instanceDep.originDisplaySurface);
                    for (ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler : instanceDep.delegatedClonedDownStreamSurfaceMap.keySet()) {
                        Surface surface = instanceDep.delegatedClonedDownStreamSurfaceMap.get(iSkiaCanvasExternalTextureHandler);
                        if (surface != null) {
                            surface.release();
                        }
                    }
                    instanceDep.delegatedUpStreamSurface.release();
                }
            });
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surface.toString();
        surfaceTexture.toString();
        instanceDep.delegate.addDownStreamSurface(surface);
        instanceDep.delegatedClonedDownStreamSurfaceMap.put(iSkiaCanvasExternalTextureHandler, surface);
        return new SkiaCanvasExternalTexturePlugin.PluginLoadResult(surfaceTexture, instanceDep.width, instanceDep.height);
    }

    public void registerInstance(int i, String str, int i2, int i3, Surface surface) {
        getInstanceMapForCanvas(str).put(Integer.valueOf(i), new InstanceDep(i2, i3, surface));
    }

    public abstract void replaceDisplaySurface(int i, String str, Surface surface);
}
