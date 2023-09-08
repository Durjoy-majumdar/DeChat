package com.tencent.p014mm.util;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.util.NativeNamespace */
public final class NativeNamespace {
    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("wechatnativeutils");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/util/NativeNamespace", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/util/NativeNamespace", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public NativeNamespace() {
        throw new UnsupportedOperationException();
    }

    private static native int nativeResetNamespace();
}
