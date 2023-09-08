package com.tencent.xweb.skia_canvas.external_texture;

import java.util.ArrayList;
import java.util.List;

public class SkiaCanvasExternalTextureManager implements ISkiaCanvasExternalTextureController {
    private static final String TAG = "ExternalTextureManager";
    private List<SkiaCanvasExternalTexturePlugin> mPluginList;

    public static final class Holder {
        public static SkiaCanvasExternalTextureManager INSTANCE = new SkiaCanvasExternalTextureManager();

        private Holder() {
        }
    }

    private synchronized SkiaCanvasExternalTexturePlugin findPlugin(String str) {
        for (SkiaCanvasExternalTexturePlugin next : this.mPluginList) {
            if (next.supportType(str)) {
                return next;
            }
        }
        return null;
    }

    public static SkiaCanvasExternalTextureManager getInstance() {
        return Holder.INSTANCE;
    }

    public boolean load(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, String str, int i, String str2) {
        SkiaCanvasExternalTexturePlugin findPlugin = findPlugin(str);
        if (findPlugin != null) {
            return findPlugin.load(iSkiaCanvasExternalTextureHandler, str, i, str2);
        }
        return false;
    }

    public void onDestroy(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, String str, int i, String str2) {
        SkiaCanvasExternalTexturePlugin findPlugin = findPlugin(str);
        if (findPlugin != null) {
            findPlugin.onDestroy(iSkiaCanvasExternalTextureHandler, str, i, str2);
        }
    }

    public synchronized void registerPlugin(SkiaCanvasExternalTexturePlugin skiaCanvasExternalTexturePlugin) {
        this.mPluginList.add(skiaCanvasExternalTexturePlugin);
    }

    public float[] updateImage(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, int i, String str, int i2, String str2) {
        SkiaCanvasExternalTexturePlugin findPlugin = findPlugin(str);
        return findPlugin != null ? findPlugin.updateImage(iSkiaCanvasExternalTextureHandler, i, str, i2, str2) : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    private SkiaCanvasExternalTextureManager() {
        this.mPluginList = new ArrayList();
    }
}
