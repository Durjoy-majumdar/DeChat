package com.tencent.xweb.skia_canvas.resource_loader;

class ResourceLoaderJNI {
    private static final String TAG = "ResourceLoaderJNI";

    public static byte[] loadResource(String str, String str2) {
        return SkiaCanvasResourceLoader.hasDelegateSet() ? SkiaCanvasResourceLoader.getDelegateWrapperForCurrentThread().loadResource(str, str2) : new byte[0];
    }

    public static void loadResourceAsync(int i, String str, String str2) {
        if (SkiaCanvasResourceLoader.hasDelegateSet()) {
            SkiaCanvasResourceLoader.getDelegateWrapperForCurrentThread().loadResourceAsync(i, str, str2);
        }
    }
}
