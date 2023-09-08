package com.tencent.p014mm.patchligthdiff.hdiff;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.patchligthdiff.hdiff.HPatch */
public class HPatch {
    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("hpatchz");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/patchligthdiff/hdiff/HPatch", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/patchligthdiff/hdiff/HPatch", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int patch(String str, String str2, String str3, long j);
}
