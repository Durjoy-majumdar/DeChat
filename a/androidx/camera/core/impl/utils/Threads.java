package androidx.camera.core.impl.utils;

import android.os.Looper;
import p329d3.C20434g;

public final class Threads {
    private Threads() {
    }

    public static void checkBackgroundThread() {
        C20434g.m22021e(isBackgroundThread(), "In application's main thread");
    }

    public static void checkMainThread() {
        C20434g.m22021e(isMainThread(), "Not in application's main thread");
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
