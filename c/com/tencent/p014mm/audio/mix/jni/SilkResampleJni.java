package com.tencent.p014mm.audio.mix.jni;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.audio.mix.jni.SilkResampleJni */
public class SilkResampleJni {
    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("wechataudiosilk");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/audio/mix/jni/SilkResampleJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/audio/mix/jni/SilkResampleJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int clearResample(String str);

    public static native int clearResampleAll();

    public static native int initResample(String str, int i, int i2);

    public static native int resamplePcm(String str, int i, int i2, short[] sArr, int i3, short[] sArr2);
}
