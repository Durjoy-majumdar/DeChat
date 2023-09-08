package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import p834a3.C103298d;

public final class MainThreadAsyncHandler {
    private static volatile Handler sHandler;

    private MainThreadAsyncHandler() {
    }

    public static Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (MainThreadAsyncHandler.class) {
            if (sHandler == null) {
                sHandler = C103298d.m136811a(Looper.getMainLooper());
            }
        }
        return sHandler;
    }
}
