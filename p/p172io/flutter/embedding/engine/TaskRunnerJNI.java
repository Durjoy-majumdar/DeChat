package p172io.flutter.embedding.engine;

/* renamed from: io.flutter.embedding.engine.TaskRunnerJNI */
public class TaskRunnerJNI {
    private static final String TAG = "TaskRunnerJNI";
    private long jniAddress = 0;

    public TaskRunnerJNI() {
        init();
    }

    private native void nativeDestroy(long j);

    private native long nativeGetTaskRunnerAddress(long j);

    private native long nativeInit();

    private native void nativePost(long j, Runnable runnable);

    private native void nativePostDelay(long j, Runnable runnable, long j2);

    private native void nativeRunNowOrPost(long j, Runnable runnable);

    private native boolean nativeRunOnCurrentThread(long j);

    public static void run(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void destroy() {
        nativeDestroy(this.jniAddress);
        this.jniAddress = 0;
    }

    public long getAddress() {
        return this.jniAddress;
    }

    public long getTaskRunnerAddress() {
        long j = this.jniAddress;
        if (j == 0) {
            return 0;
        }
        return nativeGetTaskRunnerAddress(j);
    }

    public void init() {
        this.jniAddress = nativeInit();
    }

    public void post(Runnable runnable) {
        nativePost(this.jniAddress, runnable);
    }

    public void postDelay(Runnable runnable, long j) {
        nativePostDelay(this.jniAddress, runnable, j);
    }

    public void runNowOrPost(Runnable runnable) {
        nativeRunNowOrPost(this.jniAddress, runnable);
    }

    public boolean runOnCurrentThread() {
        return nativeRunOnCurrentThread(this.jniAddress);
    }
}
