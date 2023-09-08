package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class CameraExecutor$$a implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Logger.m15473e(CameraExecutor.TAG, "A rejected execution occurred in CameraExecutor!");
    }
}
