package com.tencent.matrix.p469fd;

import j20.C117292a;
import k20.C9556a;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.fd.FDDumpBridge */
public class FDDumpBridge {

    /* renamed from: a */
    public static boolean f78626a;

    static {
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("matrix-fd");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/fd/FDDumpBridge", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/matrix/fd/FDDumpBridge", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f78626a = true;
        } catch (Throwable th) {
            C118672d.m167354d("FDDumpBridge", th, "", new Object[0]);
            f78626a = false;
        }
    }

    public static native int getFDLimit();

    public static native String getFdPathNameNative(String str);
}
