package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.vfs.C86009m1;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;

/* renamed from: com.tencent.mm.sdk.platformtools.FLock */
public class FLock {
    private static final int ERRNO_EBADF = 9;
    private static final int ERRNO_EINTR = 4;
    private static final int ERRNO_EINVAL = 22;
    private static final int ERRNO_ENOLCK = 46;
    private static final int ERRNO_EWOULDBLOCK = 11;
    private static final int ERRNO_NOERR = 0;
    private static final String TAG = "MicroMsg.FLock";
    private byte _hellAccFlag_;
    private volatile int mFD;
    private C86009m1 mFile;

    static {
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("wechatcommon");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/FLock", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/sdk/platformtools/FLock", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "fail to load so.", new Object[0]);
        }
    }

    public FLock(String str, boolean z) {
        this(new C86009m1(str), z);
    }

    private synchronized void free() {
        if (this.mFD != -1) {
            nativeFree(this.mFD);
            this.mFD = -1;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int init() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.tencent.mm.vfs.m1 r0 = r2.mFile     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.mo119967g()     // Catch:{ all -> 0x0025 }
            r1 = -1
            if (r0 != 0) goto L_0x0011
            com.tencent.mm.vfs.m1 r0 = r2.mFile     // Catch:{ IOException -> 0x000f }
            r0.mo119964e()     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r2.mFD = r1     // Catch:{ all -> 0x0025 }
        L_0x0011:
            int r0 = r2.mFD     // Catch:{ all -> 0x0025 }
            if (r0 != r1) goto L_0x0021
            com.tencent.mm.vfs.m1 r0 = r2.mFile     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = r0.mo119971i()     // Catch:{ all -> 0x0025 }
            int r0 = nativeInit(r0)     // Catch:{ all -> 0x0025 }
            r2.mFD = r0     // Catch:{ all -> 0x0025 }
        L_0x0021:
            int r0 = r2.mFD     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.FLock.init():int");
    }

    private static native void nativeFree(int i);

    private static native int nativeInit(String str);

    private static native int nativeLockRead(int i, boolean z);

    private static native int nativeLockWrite(int i, boolean z);

    private static native int nativeUnlock(int i);

    public void finalize() {
        super.finalize();
        unlock();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 == 22) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r1 == 46) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        throw new java.lang.IllegalStateException("bad operation.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void lockRead() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.init()     // Catch:{ all -> 0x003d }
        L_0x0005:
            r1 = 1
            int r1 = nativeLockRead(r0, r1)     // Catch:{ all -> 0x003d }
            r2 = 4
            if (r1 == r2) goto L_0x0037
            r2 = 9
            if (r1 == r2) goto L_0x002f
            r2 = 11
            if (r1 == r2) goto L_0x0037
            r0 = 22
            if (r1 == r0) goto L_0x0027
            r0 = 46
            if (r1 == r0) goto L_0x001f
            monitor-exit(r3)
            return
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "kernel lock spaces ran out."
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "bad operation."
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "bad file descriptor."
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0037:
            r1 = 0
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.FLock.lockRead():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 == 22) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r1 == 46) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        throw new java.lang.IllegalStateException("bad operation.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void lockWrite() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.init()     // Catch:{ all -> 0x003d }
        L_0x0005:
            r1 = 1
            int r1 = nativeLockWrite(r0, r1)     // Catch:{ all -> 0x003d }
            r2 = 4
            if (r1 == r2) goto L_0x0037
            r2 = 9
            if (r1 == r2) goto L_0x002f
            r2 = 11
            if (r1 == r2) goto L_0x0037
            r0 = 22
            if (r1 == r0) goto L_0x0027
            r0 = 46
            if (r1 == r0) goto L_0x001f
            monitor-exit(r3)
            return
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "kernel lock spaces ran out."
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "bad operation."
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "bad file descriptor."
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0037:
            r1 = 0
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.FLock.lockWrite():void");
    }

    public synchronized boolean tryLockRead() {
        int nativeLockRead;
        int init = init();
        while (true) {
            nativeLockRead = nativeLockRead(init, false);
            if (nativeLockRead != 4) {
                break;
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException unused) {
            }
        }
        if (nativeLockRead == 9) {
            throw new IllegalStateException("bad file descriptor.");
        } else if (nativeLockRead == 11) {
            return false;
        } else {
            if (nativeLockRead == 22) {
                throw new IllegalStateException("bad operation.");
            } else if (nativeLockRead != 46) {
                return true;
            } else {
                throw new IllegalStateException("kernel lock spaces ran out.");
            }
        }
    }

    public synchronized boolean tryLockWrite() {
        int nativeLockWrite;
        int init = init();
        while (true) {
            nativeLockWrite = nativeLockWrite(init, false);
            if (nativeLockWrite != 4) {
                break;
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException unused) {
            }
        }
        if (nativeLockWrite == 9) {
            throw new IllegalStateException("bad file descriptor.");
        } else if (nativeLockWrite == 11) {
            return false;
        } else {
            if (nativeLockWrite == 22) {
                throw new IllegalStateException("bad operation.");
            } else if (nativeLockWrite != 46) {
                return true;
            } else {
                throw new IllegalStateException("kernel lock spaces ran out.");
            }
        }
    }

    public synchronized void unlock() {
        if (this.mFD != -1) {
            try {
                int nativeUnlock = nativeUnlock(this.mFD);
                if (nativeUnlock == 0) {
                    return;
                }
                if (nativeUnlock == 9) {
                    throw new IllegalArgumentException(this.mFD + " is not a valid fd.");
                } else if (nativeUnlock != 22) {
                    throw new IllegalStateException("other err: " + nativeUnlock);
                } else {
                    throw new IllegalStateException("bad operation.");
                }
            } finally {
                free();
            }
        }
    }

    public FLock(C86009m1 m1Var, boolean z) {
        this.mFile = null;
        this.mFD = -1;
        if (!m1Var.mo119967g()) {
            if (z) {
                try {
                    m1Var.mo119964e();
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                throw new IllegalArgumentException("target is not exists or create failed.");
            }
        } else if (!m1Var.mo119978p()) {
            throw new IllegalArgumentException("target is not a file.");
        }
        this.mFile = m1Var;
    }
}
