package com.tencent.xweb.skia_canvas.resource_loader;

public class SkiaCanvasResourceLoader {
    private static final String TAG = "SkiaCanvasResourceLoader";
    private static ThreadLocal<ResourceLoaderDelegateWrapper> sThreadLocalLoader = new ThreadLocal<>();

    public static ResourceLoaderDelegateWrapper getDelegateWrapperForCurrentThread() {
        return sThreadLocalLoader.get();
    }

    public static boolean hasDelegateSet() {
        return sThreadLocalLoader.get() != null;
    }

    public static void setDelegate(IResourceLoader iResourceLoader) {
        sThreadLocalLoader.set(new ResourceLoaderDelegateWrapper(iResourceLoader));
    }
}
