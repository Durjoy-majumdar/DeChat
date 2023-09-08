package com.eclipsesource.mmv8;

import com.eclipsesource.mmv8.utils.MemoryManager;

public final class MultiContextV8 {
    private final V8ContextSessionMgr contextSessionMgr;

    /* renamed from: v8 */
    private final C80135V8 f234638v8;

    private MultiContextV8() {
        this((String) null);
    }

    public static MultiContextV8 createMultiContextV8() {
        return new MultiContextV8();
    }

    /* JADX INFO: finally extract failed */
    public V8Context createContext(int i) {
        try {
            V8TracerAccessible.beginSection("CreateContext");
            long createV8Context = this.f234638v8.createV8Context(i);
            V8TracerAccessible.endSection();
            return new V8ContextWrapper(this, createV8Context).context();
        } catch (Throwable th) {
            V8TracerAccessible.endSection();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public V8Context createContextFromSnapshot(int i, int i2) {
        try {
            V8TracerAccessible.beginSection("CreateContextFromSnapshot");
            long createV8ContextFromSnapshot = this.f234638v8.createV8ContextFromSnapshot(i, i2);
            V8TracerAccessible.endSection();
            if (0 == createV8ContextFromSnapshot) {
                return null;
            }
            return new V8ContextWrapper(this, createV8ContextFromSnapshot).context();
        } catch (Throwable th) {
            V8TracerAccessible.endSection();
            throw th;
        }
    }

    public MemoryManager createMemoryManager() {
        return new MemoryManager(this.f234638v8);
    }

    /* JADX INFO: finally extract failed */
    public V8Context createNodeMainContextFromSnapshot(int i) {
        try {
            V8TracerAccessible.beginSection("CreateNodeMainContextFromSnapshot");
            long createV8NodeMainContextFromSnapshot = this.f234638v8.createV8NodeMainContextFromSnapshot(i);
            V8TracerAccessible.endSection();
            if (0 == createV8NodeMainContextFromSnapshot) {
                return null;
            }
            return new V8ContextWrapper(this, createV8NodeMainContextFromSnapshot).context();
        } catch (Throwable th) {
            V8TracerAccessible.endSection();
            throw th;
        }
    }

    public void debuggerMessageLoop() {
        this.f234638v8.debuggerMessageLoop();
    }

    public void enterContext(V8ContextWrapper v8ContextWrapper) {
        this.contextSessionMgr.enterContext(v8ContextWrapper);
    }

    public long getIsolatePtr() {
        return this.f234638v8.getIsolatePtr();
    }

    public long getUVLoopPtr() {
        return this.f234638v8.getUVLoopPtr();
    }

    public C80135V8 getV8() {
        return this.f234638v8;
    }

    public V8Locker getV8Locker() {
        return this.f234638v8.getLocker();
    }

    public void markSnapshotNotNeed() {
        this.f234638v8.markSnapshotNotNeed();
    }

    public void memoryPressureNotification(int i) {
        this.f234638v8.memoryPressureNotification(i);
    }

    public void release() {
        this.f234638v8.release();
    }

    public void releaseContext(V8ContextWrapper v8ContextWrapper) {
        this.contextSessionMgr.releaseContext(v8ContextWrapper);
    }

    public void setMinimalCodeLength(int i) {
        this.f234638v8.setMinimalCodeLength(i);
    }

    public void waitForDebugger(String str) {
        this.f234638v8.waitForDebugger(str);
    }

    public void waitForDebuggerWithContexts(String str, long[] jArr, String[] strArr) {
        this.f234638v8.waitForDebuggerWithContexts(str, jArr, strArr);
    }

    private MultiContextV8(String str) {
        this(str, (String) null, (byte[]) null);
    }

    public static MultiContextV8 createMultiContextV8(String str) {
        return new MultiContextV8(str);
    }

    private MultiContextV8(String str, String str2, byte[] bArr) {
        this(str, str2, bArr, (String) null, false);
    }

    public static MultiContextV8 createMultiContextV8(String str, byte[] bArr) {
        return new MultiContextV8((String) null, str, bArr);
    }

    private MultiContextV8(String str, String str2, byte[] bArr, String str3, boolean z) {
        this.f234638v8 = C80135V8.createV8Runtime(str, (String) null, false, str2, bArr, str3, z);
        this.contextSessionMgr = new V8ContextSessionMgr(getV8());
    }

    public static MultiContextV8 createMultiContextV8(String str, String str2, byte[] bArr) {
        return new MultiContextV8(str, str2, bArr);
    }

    public static MultiContextV8 createMultiContextV8(String str, String str2, byte[] bArr, String str3, boolean z) {
        return new MultiContextV8(str, str2, bArr, str3, z);
    }
}
