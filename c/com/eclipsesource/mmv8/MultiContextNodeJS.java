package com.eclipsesource.mmv8;

import android.os.SystemClock;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;

public final class MultiContextNodeJS {
    private static final String GLOBAL = "global";
    public CreateStats createStats = null;
    private final V8Context mainContext;
    private final MultiContextV8 mv8;

    public static class CreateStats {
        public final long isolateCreateDurationMills;
        public final long mainContextCreateDurationMills;
        public final long nodeEnvCreateDurationMills;

        public CreateStats(long j, long j2, long j3) {
            this.isolateCreateDurationMills = j;
            this.mainContextCreateDurationMills = j2;
            this.nodeEnvCreateDurationMills = j3;
        }
    }

    private MultiContextNodeJS(MultiContextV8 multiContextV8, V8Context v8Context) {
        this.mv8 = multiContextV8;
        this.mainContext = v8Context;
    }

    public static MultiContextNodeJS createMultiContextNodeJS(int i) {
        return createMultiContextNodeJS(i, (String) null, (byte[]) null, false);
    }

    public void closeUVLoop() {
        this.mv8.getV8().closeUVLoop();
    }

    public void debuggerMessageLoop() {
        this.mv8.debuggerMessageLoop();
    }

    public V8Context getMainContext() {
        return this.mainContext;
    }

    public MultiContextV8 getRuntime() {
        return this.mv8;
    }

    public boolean handleMessage(boolean z) {
        this.mv8.getV8().checkThread();
        return this.mv8.getV8().pumpMessageLoop(z);
    }

    public boolean isRunning() {
        this.mv8.getV8().checkThread();
        return this.mv8.getV8().isRunning();
    }

    public void nativeDispatch() {
        this.mv8.getV8().nativeDispatch();
    }

    public void nativeMessageLoop() {
        this.mv8.getV8().checkThread();
        this.mv8.getV8().nativeMessageLoop();
    }

    public void release() {
        this.mv8.getV8().checkThread();
        if (!this.mainContext.isReleased()) {
            this.mainContext.release();
        }
        this.mv8.release();
    }

    public void waitForDebugger(String str) {
        this.mv8.waitForDebugger(str);
    }

    public void wakeUpUVLoop() {
        this.mv8.getV8().wakeUpUVLoop();
    }

    public static MultiContextNodeJS createMultiContextNodeJS(int i, String str, byte[] bArr, boolean z) {
        return createMultiContextNodeJS(i, CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX, str, bArr, (String) null, false, z);
    }

    /* JADX INFO: finally extract failed */
    public static MultiContextNodeJS createMultiContextNodeJS(int i, int i2, String str, byte[] bArr, String str2, boolean z, boolean z2) {
        V8Context v8Context;
        MultiContextV8 createMultiContextV8 = MultiContextV8.createMultiContextV8(GLOBAL, str, bArr, str2, z);
        long j = createMultiContextV8.getV8().isolateCreateDurationMills;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX == i2) {
            v8Context = createMultiContextV8.createContext(i);
        } else if (!z || CreateSnapshotResult.Success.NODE_MAIN_CONTEXT_INDEX == i2) {
            if (z) {
                v8Context = createMultiContextV8.createNodeMainContextFromSnapshot(i);
            } else {
                v8Context = createMultiContextV8.createContextFromSnapshot(i, i2);
            }
            if (v8Context == null) {
                createMultiContextV8.release();
                throw new V8RuntimeException("Create mainContext from snapshot fail");
            }
        } else {
            createMultiContextV8.release();
            throw new V8RuntimeException("Node is snapshot but main context snapshot index is not 0");
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        MultiContextNodeJS multiContextNodeJS = new MultiContextNodeJS(createMultiContextV8, v8Context);
        if (z2) {
            createMultiContextV8.getV8().enableNativeTrans();
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        try {
            V8TracerAccessible.beginSection("CreateNode");
            if (!createMultiContextV8.getV8Locker().hasLock()) {
                createMultiContextV8.getV8Locker().acquire();
            }
            createMultiContextV8.getV8().createNodeRuntime();
            createMultiContextV8.getV8Locker().release();
            V8TracerAccessible.endSection();
            multiContextNodeJS.createStats = new CreateStats(j, elapsedRealtime2, SystemClock.elapsedRealtime() - elapsedRealtime3);
            return multiContextNodeJS;
        } catch (Throwable th) {
            createMultiContextV8.getV8Locker().release();
            V8TracerAccessible.endSection();
            throw th;
        }
    }
}
