package com.tencent.p014mm.plugin.rubbishbin;

import com.tencent.midas.data.APMidasPluginInfo;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.rubbishbin.JNIExceptionHandler */
public abstract class JNIExceptionHandler {
    public static JNIExceptionHandler INSTANCE;
    private static boolean libLoaded;
    private byte _hellAccFlag_;

    public static void init() {
        if (!libLoaded) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("rubbishbin");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/rubbishbin/JNIExceptionHandler", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/rubbishbin/JNIExceptionHandler", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            libLoaded = true;
        }
        initSigHandler();
    }

    public static native void initSigHandler();

    public static void invoke_crash() {
        if (!libLoaded) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("rubbishbin");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/rubbishbin/JNIExceptionHandler", "invoke_crash", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/rubbishbin/JNIExceptionHandler", "invoke_crash", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            libLoaded = true;
        }
        testCrashAA();
    }

    public static native String testCrashAA();

    public abstract void onException(int i, String str);

    public abstract void setReportExecutionTag(String str);
}
