package com.tencent.xweb.skia_canvas;

public class SkiaCanvasApp {
    private final long mNativePeer;
    private final IXWebWorkingHandler mWorkingHandler;

    public static class ConfigOptions {
        private boolean mV8LockerEnable = true;

        public boolean isV8LockerEnable() {
            return this.mV8LockerEnable;
        }

        public ConfigOptions v8LockerEnable(boolean z) {
            this.mV8LockerEnable = z;
            return this;
        }
    }

    static {
        SkiaCanvasLogic.init();
    }

    public SkiaCanvasApp(long j, long j2, IXWebWorkingHandler iXWebWorkingHandler) {
        this(j, j2, "", iXWebWorkingHandler);
    }

    private long init(long j, long j2, String str) {
        return nativeInit(j, j2, str);
    }

    public static void initConfig(ConfigOptions configOptions) {
        if (configOptions != null) {
            setV8LockerEnable(configOptions.isV8LockerEnable());
        }
    }

    private native long nativeInit(long j, long j2, String str);

    private native void nativeOnJSContextDestroying(long j);

    private static native void setV8LockerEnable(boolean z);

    public void checkAndPostOnWorkingThread(Runnable runnable) {
        if (this.mWorkingHandler.isRunOnWorkingThread()) {
            runnable.run();
        } else {
            this.mWorkingHandler.post(runnable);
        }
    }

    public boolean isRunOnWorkingThread() {
        return this.mWorkingHandler.isRunOnWorkingThread();
    }

    public void onJSContextDestroying() {
        if (this.mWorkingHandler.isRunOnWorkingThread()) {
            nativeOnJSContextDestroying(this.mNativePeer);
            return;
        }
        throw new IllegalStateException("Thread during destroy is not matched with init.");
    }

    public SkiaCanvasApp(long j, long j2, String str, IXWebWorkingHandler iXWebWorkingHandler) {
        this.mWorkingHandler = iXWebWorkingHandler;
        if (iXWebWorkingHandler.isRunOnWorkingThread()) {
            this.mNativePeer = init(j, j2, str);
            VSyncRenderer.initRenderer(iXWebWorkingHandler);
            return;
        }
        throw new IllegalStateException("SkiaCanvasApp must be created and used on working thread.");
    }
}
