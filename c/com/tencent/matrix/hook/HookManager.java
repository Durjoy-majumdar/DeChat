package com.tencent.matrix.hook;

import android.text.TextUtils;
import com.tencent.matrix.hook.C80379a;
import j20.C117292a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k20.C9556a;
import p723vf.C118672d;

public class HookManager {

    /* renamed from: e */
    public static final HookManager f235267e = new HookManager();

    /* renamed from: a */
    public volatile boolean f235268a = false;

    /* renamed from: b */
    public byte[] f235269b = new byte[0];

    /* renamed from: c */
    public final Set<C80379a> f235270c = new HashSet();

    /* renamed from: d */
    public C80378b f235271d = null;

    /* renamed from: com.tencent.matrix.hook.HookManager$a */
    public static class C80377a extends Exception {
        public C80377a(String str) {
            super(str);
        }
    }

    /* renamed from: com.tencent.matrix.hook.HookManager$b */
    public interface C80378b {
        void loadLibrary(String str);
    }

    private native void doFinalInitializeNative(boolean z);

    private native boolean doPreHookInitializeNative(boolean z);

    /* renamed from: e */
    public static String m97945e(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!stackTraceElement.getClassName().contains("java.lang.Thread")) {
                sb.append(stackTraceElement);
                sb.append(';');
            }
        }
        return sb.toString();
    }

    public static String getStack() {
        try {
            return m97945e(Thread.currentThread().getStackTrace());
        } catch (Throwable th) {
            return "ERROR: " + m97945e(th.getStackTrace());
        }
    }

    /* renamed from: a */
    public HookManager mo111829a(C80379a aVar) {
        if (!(aVar == null || aVar.f235272a == C80379a.C80380a.COMMIT_SUCCESS)) {
            synchronized (this.f235270c) {
                ((HashSet) this.f235270c).add(aVar);
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0016, code lost:
        if (r12.f235268a != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = r12.f235271d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001b, code lost:
        if (r2 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x001d, code lost:
        r2.loadLibrary("matrix-hookcommon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0023, code lost:
        r3 = new k20.C9556a();
        r3.mo10233c("matrix-hookcommon");
        r2 = new java.lang.Object();
        j20.C117292a.m165358d(r2, r3.mo10232b(), "com/tencent/matrix/hook/HookManager", "commitHooks", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) r3.mo10231a(0));
        j20.C117292a.m165359e(r2, "com/tencent/matrix/hook/HookManager", "commitHooks", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (doPreHookInitializeNative(false) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        mo111831c();
        doFinalInitializeNative(false);
        r12.f235268a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        throw new com.tencent.matrix.hook.HookManager.C80377a("Fail to do hook common pre-hook initialize.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        p723vf.C118672d.m167354d("Matrix.HookManager", r2, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        mo111831c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111830b() {
        /*
            r12 = this;
            byte[] r0 = r12.f235269b
            monitor-enter(r0)
            java.util.Set<com.tencent.matrix.hook.a> r1 = r12.f235270c     // Catch:{ all -> 0x008b }
            monitor-enter(r1)     // Catch:{ all -> 0x008b }
            java.util.Set<com.tencent.matrix.hook.a> r2 = r12.f235270c     // Catch:{ all -> 0x0088 }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x0088 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            boolean r1 = r12.f235268a     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0083
            r1 = 0
            com.tencent.matrix.hook.HookManager$b r2 = r12.f235271d     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0023
            java.lang.String r3 = "matrix-hookcommon"
            r2.loadLibrary(r3)     // Catch:{ all -> 0x0077 }
            goto L_0x005f
        L_0x0023:
            java.lang.String r2 = "matrix-hookcommon"
            k20.a r3 = new k20.a     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            r3.mo10233c(r2)     // Catch:{ all -> 0x0077 }
            java.lang.Object r2 = new java.lang.Object     // Catch:{ all -> 0x0077 }
            r2.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r5 = r3.mo10232b()     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "com/tencent/matrix/hook/HookManager"
            java.lang.String r7 = "commitHooks"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "java/lang/System_EXEC_"
            java.lang.String r10 = "loadLibrary"
            java.lang.String r11 = "(Ljava/lang/String;)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0077 }
            java.lang.Object r3 = r3.mo10231a(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0077 }
            java.lang.System.loadLibrary(r3)     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "com/tencent/matrix/hook/HookManager"
            java.lang.String r6 = "commitHooks"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "java/lang/System_EXEC_"
            java.lang.String r9 = "loadLibrary"
            java.lang.String r10 = "(Ljava/lang/String;)V"
            r4 = r2
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0077 }
        L_0x005f:
            boolean r2 = r12.doPreHookInitializeNative(r1)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x006f
            r12.mo111831c()     // Catch:{ all -> 0x008b }
            r12.doFinalInitializeNative(r1)     // Catch:{ all -> 0x008b }
            r1 = 1
            r12.f235268a = r1     // Catch:{ all -> 0x008b }
            goto L_0x0086
        L_0x006f:
            com.tencent.matrix.hook.HookManager$a r1 = new com.tencent.matrix.hook.HookManager$a     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "Fail to do hook common pre-hook initialize."
            r1.<init>(r2)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x0077:
            r2 = move-exception
            java.lang.String r3 = "Matrix.HookManager"
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x008b }
            p723vf.C118672d.m167354d(r3, r2, r4, r1)     // Catch:{ all -> 0x008b }
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x0083:
            r12.mo111831c()     // Catch:{ all -> 0x008b }
        L_0x0086:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x0088:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            throw r2     // Catch:{ all -> 0x008b }
        L_0x008b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.hook.HookManager.mo111830b():void");
    }

    /* renamed from: c */
    public final void mo111831c() {
        C80379a.C80380a aVar = C80379a.C80380a.UNCOMMIT;
        synchronized (this.f235270c) {
            Iterator it = ((HashSet) this.f235270c).iterator();
            while (it.hasNext()) {
                C80379a aVar2 = (C80379a) it.next();
                String a = aVar2.mo111834a();
                if (!TextUtils.isEmpty(a)) {
                    try {
                        mo111832d();
                        C80378b bVar = this.f235271d;
                        if (bVar != null) {
                            bVar.loadLibrary(a);
                        } else {
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(a);
                            Object obj = new Object();
                            C117292a.m165358d(obj, aVar3.mo10232b(), "com/tencent/matrix/hook/HookManager", "commitHooksLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                            System.loadLibrary((String) aVar3.mo10231a(0));
                            C117292a.m165359e(obj, "com/tencent/matrix/hook/HookManager", "commitHooksLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        }
                    } catch (Throwable th) {
                        C118672d.m167354d("Matrix.HookManager", th, "", new Object[0]);
                        C118672d.m167352b("Matrix.HookManager", "Fail to load native library for %s, skip next steps.", aVar2.getClass().getName());
                        aVar2.f235272a = C80379a.C80380a.COMMIT_FAIL_ON_LOAD_LIB;
                    }
                }
            }
            Iterator it4 = ((HashSet) this.f235270c).iterator();
            while (it4.hasNext()) {
                C80379a aVar4 = (C80379a) it4.next();
                if (aVar4.f235272a != aVar) {
                    C118672d.m167352b("Matrix.HookManager", "%s has failed steps before, skip calling onConfigure on it.", aVar4.getClass().getName());
                } else if (!aVar4.mo111835b()) {
                    C118672d.m167352b("Matrix.HookManager", "Fail to configure %s, skip next steps", aVar4.getClass().getName());
                    aVar4.f235272a = C80379a.C80380a.COMMIT_FAIL_ON_CONFIGURE;
                }
            }
            Iterator it5 = ((HashSet) this.f235270c).iterator();
            while (it5.hasNext()) {
                C80379a aVar5 = (C80379a) it5.next();
                if (aVar5.f235272a != aVar) {
                    C118672d.m167352b("Matrix.HookManager", "%s has failed steps before, skip calling onHook on it.", aVar5.getClass().getName());
                } else if (aVar5.mo111836c(false)) {
                    C118672d.m167353c("Matrix.HookManager", "%s is committed successfully.", aVar5.getClass().getName());
                    aVar5.f235272a = C80379a.C80380a.COMMIT_SUCCESS;
                } else {
                    C118672d.m167352b("Matrix.HookManager", "Fail to do hook in %s.", aVar5.getClass().getName());
                    aVar5.f235272a = C80379a.C80380a.COMMIT_FAIL_ON_HOOK;
                }
            }
            ((HashSet) this.f235270c).clear();
        }
    }

    /* renamed from: d */
    public final void mo111832d() {
    }
}
