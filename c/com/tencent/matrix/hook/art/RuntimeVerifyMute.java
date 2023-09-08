package com.tencent.matrix.hook.art;

import com.tencent.matrix.hook.HookManager;
import j20.C117292a;
import k20.C9556a;
import p723vf.C118672d;

public final class RuntimeVerifyMute {

    /* renamed from: c */
    public static final RuntimeVerifyMute f235279c = new RuntimeVerifyMute();

    /* renamed from: a */
    public HookManager.C80378b f235280a = null;

    /* renamed from: b */
    public boolean f235281b = false;

    private static native boolean nativeInstall();

    /* renamed from: a */
    public boolean mo111837a() {
        boolean z;
        synchronized (this) {
            z = true;
            if (!this.f235281b) {
                try {
                    HookManager.C80378b bVar = this.f235280a;
                    if (bVar != null) {
                        bVar.loadLibrary("matrix-hookcommon");
                        this.f235280a.loadLibrary("matrix-artmisc");
                    } else {
                        C9556a aVar = new C9556a();
                        aVar.mo10233c("matrix-hookcommon");
                        Object obj = new Object();
                        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        System.loadLibrary((String) aVar.mo10231a(0));
                        C117292a.m165359e(obj, "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c("matrix-artmisc");
                        Object obj2 = new Object();
                        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        System.loadLibrary((String) aVar2.mo10231a(0));
                        C117292a.m165359e(obj2, "com/tencent/matrix/hook/art/RuntimeVerifyMute", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    }
                    this.f235281b = true;
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.RuntimeVerifyMute", th, "Fail to load native library.", new Object[0]);
                    this.f235281b = false;
                }
                z = this.f235281b;
            }
        }
        if (!z) {
            return false;
        }
        return nativeInstall();
    }
}
