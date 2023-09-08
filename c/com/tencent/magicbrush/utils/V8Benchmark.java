package com.tencent.magicbrush.utils;

import j20.C117292a;
import k20.C9556a;

public class V8Benchmark {
    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("mmv8");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/magicbrush/utils/V8Benchmark", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/magicbrush/utils/V8Benchmark", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c("magicbrush");
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/magicbrush/utils/V8Benchmark", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar2.mo10231a(0));
        C117292a.m165359e(obj2, "com/tencent/magicbrush/utils/V8Benchmark", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native String execute(String str);
}
