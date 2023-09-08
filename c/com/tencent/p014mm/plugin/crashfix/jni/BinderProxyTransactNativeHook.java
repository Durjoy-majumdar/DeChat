package com.tencent.p014mm.plugin.crashfix.jni;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.BinderProxyTransactNativeHook */
public class BinderProxyTransactNativeHook {
    private static long BAD_BINDER_TIME_OUT = 1000;
    private static final int IDKEY_BAD_BINDER_MONITOR = 1435;
    private static final int ID_CLIENT_1S_KEY = 1;
    private static final int ID_KV_BAD_BINDER_MONITOR = 20494;
    private static final int ID_SERVER_1S_KEY = 2;
    private static final String TAG = "MicroMsg.BadBinder";
    private static HandlerThread mBadBinderCheckHandlerThread;

    /* renamed from: mH */
    private static Handler f248134mH;
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.plugin.crashfix.jni.BinderProxyTransactNativeHook$b */
    public static class C29834b implements Runnable {

        /* renamed from: d */
        public long f80860d;

        public C29834b() {
            this.f80860d = 0;
            this.f80860d = System.currentTimeMillis();
        }

        public void run() {
            Log.m105920e(BinderProxyTransactNativeHook.TAG, hashCode() + "#send_bad#");
        }
    }

    /* renamed from: com.tencent.mm.plugin.crashfix.jni.BinderProxyTransactNativeHook$a */
    public static class C85162a implements Runnable {

        /* renamed from: d */
        public Class f248135d;

        /* renamed from: e */
        public long f248136e = 0;

        /* renamed from: f */
        public int f248137f;

        public C85162a(Class cls, int i) {
            this.f248135d = cls;
            this.f248137f = i;
            this.f248136e = System.currentTimeMillis();
        }

        public void run() {
            Log.m105920e(BinderProxyTransactNativeHook.TAG, hashCode() + "#exec_bad#" + this.f248135d.getName() + "#" + this.f248135d.getGenericSuperclass() + "#" + this.f248137f);
        }
    }

    public static native void calculateOffset();

    public static Object execTransactBegin(Class cls, int i) {
        C85162a aVar = new C85162a(cls, i);
        f248134mH.postDelayed(aVar, BAD_BINDER_TIME_OUT);
        return aVar;
    }

    public static void execTransactEnd(Object obj) {
        C85162a aVar = (C85162a) obj;
        f248134mH.removeCallbacks(aVar);
        long currentTimeMillis = System.currentTimeMillis() - aVar.f248136e;
        if (currentTimeMillis > BAD_BINDER_TIME_OUT) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1435, 2, 1);
            String str = aVar.f248135d.getName() + "#" + aVar.f248135d.getGenericSuperclass() + "#" + aVar.f248137f;
            Log.m105920e(TAG, aVar.hashCode() + "#exec_cost#" + currentTimeMillis + "#" + str);
            nVar.mo160131h(ID_KV_BAD_BINDER_MONITOR, str, Long.valueOf(currentTimeMillis));
        }
    }

    public static native void hook(Method method, Method method2);

    public static void init() {
        C9556a aVar = new C9556a();
        aVar.mo10233c("systemcrashprotect");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/crashfix/jni/BinderProxyTransactNativeHook", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/plugin/crashfix/jni/BinderProxyTransactNativeHook", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        HandlerThread handlerThread = new HandlerThread("BadBinder");
        mBadBinderCheckHandlerThread = handlerThread;
        handlerThread.start();
        f248134mH = new Handler(mBadBinderCheckHandlerThread.getLooper());
    }

    public static Object onTransactNativeBegin() {
        C29834b bVar = new C29834b();
        f248134mH.postDelayed(bVar, BAD_BINDER_TIME_OUT);
        return bVar;
    }

    public static void onTransactNativeEnd(Object obj) {
        C29834b bVar = (C29834b) obj;
        f248134mH.removeCallbacks(bVar);
        long currentTimeMillis = System.currentTimeMillis() - bVar.f80860d;
        if (currentTimeMillis > BAD_BINDER_TIME_OUT) {
            C115669n.INSTANCE.mo175913w(1435, 1, 1);
            String str = "";
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null) {
                for (int i = 0; i < stackTrace.length; i++) {
                    if (TextUtils.isEmpty(str)) {
                        str = stackTrace[i].toString();
                    } else {
                        str = str + "\n" + stackTrace[i].toString();
                    }
                }
            }
            Log.m105920e(TAG, bVar.hashCode() + "#send_cost#" + currentTimeMillis + "#" + str);
        }
    }
}
