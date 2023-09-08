package com.tencent.wxperf.thread;

import android.os.Process;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.stubs.logger.Log;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;

public final class ThreadInspect {
    private static final int ALL_THREAD_FLAG = -2;
    private static final int CURR_PID_FLAG = -1;
    private static final int CURR_TID_FLAG = -1;
    private static final String TAG = "ThreadInspect";
    private static volatile boolean initialized;
    private static final Map<Integer, WeakReference<Thread>> sTidThreads = new HashMap();
    private byte _hellAccFlag_;

    static {
        init();
    }

    private static String currJavaThrowable() {
        Map<Integer, WeakReference<Thread>> map = sTidThreads;
        synchronized (map) {
            map.put(Integer.valueOf(Process.myTid()), new WeakReference(Thread.currentThread()));
        }
        return null;
    }

    private static void dump(int i, int i2, int i3, String str) {
        if (initialized) {
            nativeDump(i, i2, i3, str);
        }
    }

    public static void dumpLocalAllThread(int i, String str) {
        dump(-1, -2, i, str);
    }

    public static void dumpLocalCurrentThread(int i, String str) {
        dump(-1, -1, i, str);
    }

    public static void dumpLocalThread(int i, int i2, String str) {
        dump(-1, i, i2, str);
    }

    public static void dumpRemoteAllThread(int i, int i2, String str) {
        dump(i, -2, i2, str);
    }

    public static void dumpRemoteThread(int i, int i2, int i3, String str) {
        dump(i, i2, i3, str);
    }

    private static String get(int i, int i2, String str) {
        if (!initialized) {
            return null;
        }
        return nativeGet(i, i2, str);
    }

    public static String getLocalAllThread(String str) {
        return get(-1, -2, str);
    }

    public static String getLocalCurrentThread(String str) {
        return get(-1, -1, str);
    }

    public static String getLocalThread(int i, String str) {
        return get(-1, i, str);
    }

    public static String getRemoteAllThread(int i, String str) {
        return get(i, -2, str);
    }

    public static String getRemoteThread(int i, int i2, String str) {
        return get(i, i2, str);
    }

    private static Thread getThreadByTid(int i) {
        WeakReference weakReference;
        if (i == Process.myTid()) {
            return Thread.currentThread();
        }
        Map<Integer, WeakReference<Thread>> map = sTidThreads;
        synchronized (map) {
            weakReference = map.get(Integer.valueOf(i));
        }
        if (weakReference != null) {
            return (Thread) weakReference.get();
        }
        return null;
    }

    private static String getThreadStack(Thread thread) {
        if (thread == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement append : thread.getStackTrace()) {
            sb.append("\n");
            sb.append("at ");
            sb.append(append);
        }
        if (sb.length() <= 0) {
            return null;
        }
        return "JUnwind" + sb.toString();
    }

    public static synchronized boolean init() {
        boolean z;
        synchronized (ThreadInspect.class) {
            if (!initialized) {
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c("wxperf-tkill");
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/wxperf/thread/ThreadInspect", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar.mo10231a(0));
                    C117292a.m165359e(obj, "com/tencent/wxperf/thread/ThreadInspect", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    initialized = true;
                } catch (Throwable th) {
                    Log.printStack(6, TAG, th);
                    initialized = false;
                }
            }
            z = initialized;
        }
        return z;
    }

    public static String jUnwindCurr() {
        try {
            return getThreadStack(Thread.currentThread());
        } catch (Exception e) {
            Log.m106515w(TAG, (Throwable) e, "jUnwindCurr failed");
            return null;
        }
    }

    public static String jUnwindR(int i) {
        Thread threadByTid = getThreadByTid(i);
        if (threadByTid == null && initialized) {
            try {
                nativeJUnwindR(i);
                threadByTid = getThreadByTid(i);
            } catch (Exception e) {
                Log.m106515w(TAG, (Throwable) e, "jUnwindR failed");
            }
        }
        return getThreadStack(threadByTid);
    }

    private static void log(int i, int i2, String str, int i3, String str2) {
        if (initialized) {
            nativeLog(i, i2, str, i3, str2);
        }
    }

    public static void logLocalAllThread(String str, int i, String str2) {
        log(-1, -2, str, i, str2);
    }

    public static void logLocalCurrentThread(String str, int i, String str2) {
        log(-1, -1, str, i, str2);
    }

    public static void logLocalThread(int i, String str, int i2, String str2) {
        log(-1, i, str, i2, str2);
    }

    public static void logRemoteAllThread(int i, String str, int i2, String str2) {
        log(i, -2, str, i2, str2);
    }

    public static void logRemoteThread(int i, int i2, String str, int i3, String str2) {
        log(i, i2, str, i3, str2);
    }

    private static native void nativeDump(int i, int i2, int i3, String str);

    private static native String nativeGet(int i, int i2, String str);

    private static native String nativeJUnwindR(int i);

    public static native void nativeLog(int i, int i2, String str, int i3, String str2);

    private static native void nativeTgkill(int i, int i2, int i3);

    private static native void nativeTkill(int i, int i2);

    public static void tgkill(int i, int i2, int i3) {
        if (initialized) {
            nativeTgkill(i, i2, i3);
        }
    }

    public static void tkill(int i, int i2) {
        if (initialized) {
            nativeTkill(i, i2);
        }
    }

    public static void dumpLocalAllThread(int i) {
        dump(-1, -2, i, (String) null);
    }

    public static void dumpLocalCurrentThread(int i) {
        dump(-1, -1, i, (String) null);
    }

    public static void dumpLocalThread(int i, int i2) {
        dump(-1, i, i2, (String) null);
    }

    public static void dumpRemoteAllThread(int i, int i2) {
        dump(i, -2, i2, (String) null);
    }

    public static void dumpRemoteThread(int i, int i2, int i3) {
        dump(i, i2, i3, (String) null);
    }

    public static String getLocalAllThread() {
        return get(-1, -2, (String) null);
    }

    public static String getLocalCurrentThread() {
        return get(-1, -1, (String) null);
    }

    public static String getLocalThread(int i) {
        return get(-1, i, (String) null);
    }

    public static String getRemoteAllThread(int i) {
        return get(i, -2, (String) null);
    }

    public static String getRemoteThread(int i, int i2) {
        return get(i, i2, (String) null);
    }

    public static void logLocalAllThread(String str, int i) {
        log(-1, -2, str, i, (String) null);
    }

    public static void logLocalCurrentThread(String str, int i) {
        log(-1, -1, str, i, (String) null);
    }

    public static void logLocalThread(int i, String str, int i2) {
        log(-1, i, str, i2, (String) null);
    }

    public static void logRemoteAllThread(int i, String str, int i2) {
        log(i, -2, str, i2, (String) null);
    }

    public static void logRemoteThread(int i, int i2, String str, int i3) {
        log(i, i2, str, i3, (String) null);
    }
}
