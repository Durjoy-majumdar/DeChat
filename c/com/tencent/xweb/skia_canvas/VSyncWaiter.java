package com.tencent.xweb.skia_canvas;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;

public class VSyncWaiter {
    private static final String TAG = "VSyncWaiter";
    private volatile Handler mWorkingHandler;

    public static final class Holder {
        public static final VSyncWaiter INSTANCE = new VSyncWaiter();

        private Holder() {
        }
    }

    public interface VSyncWaiterCallback {
        void doFrame(long j);
    }

    public static VSyncWaiter getInstance() {
        return Holder.INSTANCE;
    }

    private void initWorkingThread() {
        if (this.mWorkingHandler == null) {
            HandlerThread handlerThread = new HandlerThread("SkiaCanvasVSyncWaiterThread", -2);
            handlerThread.start();
            this.mWorkingHandler = new Handler(handlerThread.getLooper());
        }
    }

    /* access modifiers changed from: private */
    public void runVSyncCallback(final VSyncWaiterCallback vSyncWaiterCallback) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            public void doFrame(long j) {
                vSyncWaiterCallback.doFrame(j);
            }
        });
    }

    public void asyncWaitForVSync(final VSyncWaiterCallback vSyncWaiterCallback) {
        if (Looper.myLooper() != null) {
            runVSyncCallback(vSyncWaiterCallback);
            return;
        }
        initWorkingThread();
        this.mWorkingHandler.post(new Runnable() {
            public void run() {
                VSyncWaiter.this.runVSyncCallback(vSyncWaiterCallback);
            }
        });
    }

    private VSyncWaiter() {
    }
}
