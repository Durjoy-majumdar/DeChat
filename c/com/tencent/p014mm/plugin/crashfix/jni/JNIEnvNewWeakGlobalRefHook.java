package com.tencent.p014mm.plugin.crashfix.jni;

import com.tencent.midas.data.APMidasPluginInfo;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.JNIEnvNewWeakGlobalRefHook */
public class JNIEnvNewWeakGlobalRefHook {
    private byte _hellAccFlag_;

    public static native void calculateOffset();

    public static native void hook(Method method, Method method2);

    public static void init() {
        C9556a aVar = new C9556a();
        aVar.mo10233c("systemcrashprotect");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/crashfix/jni/JNIEnvNewWeakGlobalRefHook", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/plugin/crashfix/jni/JNIEnvNewWeakGlobalRefHook", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
