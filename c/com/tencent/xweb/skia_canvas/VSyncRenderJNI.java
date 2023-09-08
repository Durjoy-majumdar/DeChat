package com.tencent.xweb.skia_canvas;

import com.tencent.xweb.skia_canvas.VSyncRenderer;

class VSyncRenderJNI {
    private static long addAnimationCallback(final long j) {
        VSyncRenderer instance = VSyncRenderer.getInstance();
        if (instance != null) {
            return instance.addAnimationCallback(new VSyncRenderer.AnimationCallback() {
                public void doAnimation(long j) {
                    VSyncRenderJNI.nativeOnAnimation(j, j);
                }
            });
        }
        throw new IllegalStateException("VSyncRendererCallback is not init in current thread.");
    }

    /* access modifiers changed from: private */
    public static native void nativeOnAnimation(long j, long j2);

    private static void removeAnimationCallback(long j) {
        VSyncRenderer instance = VSyncRenderer.getInstance();
        if (instance != null) {
            instance.removeAnimationCallback(j);
            return;
        }
        throw new IllegalStateException("VSyncRendererCallback is not init in current thread.");
    }
}
