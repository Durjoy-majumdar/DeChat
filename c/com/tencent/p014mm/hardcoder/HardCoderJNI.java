package com.tencent.p014mm.hardcoder;

import android.os.Process;
import android.os.SystemClock;
import com.tencent.p014mm.hardcoder.C17766b;
import com.tencent.p014mm.hardcoder.C17774h;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.HashMap;
import k20.C9556a;

/* renamed from: com.tencent.mm.hardcoder.HardCoderJNI */
public class HardCoderJNI {
    public static final int APP_SCENE_COMMUNICATE = 6;
    public static final int APP_SCENE_DATA_LOADING_AND_PROCESS = 4;
    public static final int APP_SCENE_MULTI_MEDIA_PROCESS = 5;
    public static final int APP_SCENE_STARTUP = 1;
    public static final int APP_SCENE_SYSTEM_DEVICE = 7;
    public static final int APP_SCENE_UNDEFINE = 0;
    public static final int APP_SCENE_WINDOW_SCROLL = 3;
    public static final int APP_SCENE_WINDOW_SWITCH = 2;
    public static final int CALLBACK_TYPE_BASE = 0;
    public static final int CALLBACK_TYPE_DATA = 2;
    public static final int CALLBACK_TYPE_STATUS = 1;
    public static final int CLIENT_CONNECT = -20000;
    public static final int CLIENT_DISCONNECT = -20001;
    public static final String CLIENT_SOCK = ".hardcoder.client.sock";
    public static final int CPU_LEVEL_0 = 0;
    public static final int CPU_LEVEL_1 = 1;
    public static final int CPU_LEVEL_2 = 2;
    public static final int CPU_LEVEL_3 = 3;
    public static final int ERROR_CODE_CHECKENV_FAIL = -2;
    public static final int ERROR_CODE_DISCONNECT = -6;
    public static final int ERROR_CODE_FAILED = -1;
    public static final int ERROR_CODE_HCPERFMANAGER_NULL = -5;
    public static final int ERROR_CODE_NOT_ENABLE = -3;
    public static final int ERROR_CODE_NOT_FOREGROUND = -4;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERR_CLIENT_ALREADY_INIT = -20002;
    public static final int ERR_UNAUTHORIZED = -10001;
    public static final int FUNC_BASE = 1000;
    public static final int FUNC_CANCEL_CPU_CORE_FOR_THREAD = 1005;
    public static final int FUNC_CANCEL_CPU_HIGH_FREQ = 1003;
    public static final int FUNC_CANCEL_GPU_HIGH_FREQ = 1017;
    public static final int FUNC_CANCEL_HIGH_IO_FREQ = 1007;
    public static final int FUNC_CANCEL_UNIFY_CPU_IO_THREAD_CORE = 1014;
    public static final int FUNC_CHECK_PERMISSION = 1001;
    public static final int FUNC_CONFIGURE = 1018;
    public static final int FUNC_CPU_CORE_FOR_THREAD = 1004;
    public static final int FUNC_CPU_HIGH_FREQ = 1002;
    public static final int FUNC_GPU_HIGH_FREQ = 1016;
    public static final int FUNC_HIGH_IO_FREQ = 1006;
    public static final int FUNC_LOCAL = 0;
    public static final int FUNC_REG_ANR_CALLBACK = 1010;
    public static final int FUNC_REG_PRELOAD_BOOT_RESOURCE = 1011;
    public static final int FUNC_REG_SYSTEM_EVENT_CALLBACK = 1015;
    public static final int FUNC_RESET_SCREEN_RESOLUTION = 1009;
    public static final int FUNC_SET_SCREEN_RESOLUTION = 1008;
    public static final int FUNC_TERMINATE_APP = 1012;
    public static final int FUNC_UNIFY_CPU_IO_THREAD_CORE = 1013;
    public static final int GPU_LEVEL_0 = 0;
    public static final int GPU_LEVEL_1 = 1;
    public static final int IO_LEVEL_0 = 0;
    public static final int IO_LEVEL_1 = 1;
    public static final int IO_LEVEL_2 = 2;
    public static final int IO_LEVEL_3 = 3;
    public static final int RET_CPU_HIGH_FREQ = 8;
    public static final int RET_CPU_HIGH_FREQ_LEVEL_1 = 9;
    public static final int RET_CPU_HIGH_FREQ_LEVEL_2 = 10;
    public static final int RET_CPU_HIGH_FREQ_LEVEL_3 = 11;
    public static final int RET_GPU_HIGH_FREQ = 32;
    public static final int RET_HIGH_IO_FREQ = 16;
    public static final int RET_HIGH_IO_FREQ_LEVEL_1 = 17;
    public static final int RET_HIGH_IO_FREQ_LEVEL_2 = 18;
    public static final int RET_HIGH_IO_FREQ_LEVEL_3 = 19;
    public static final int RET_LEVEL_1 = 1;
    public static final int RET_LEVEL_2 = 2;
    public static final int RET_LEVEL_3 = 3;
    public static final int RET_OK = 0;
    public static final String SERVER_PROP_KEY = "persist.sys.hardcoder.name";
    private static final String TAG = "Hardcoder.HardCoderJNI";
    private static AnrCallback anrCallback;
    private static boolean checkEnv = false;
    private static boolean connect = false;
    private static C104631d connectStatusCallback;
    private static HashMap<Long, C104632e> funcRetCallback = new HashMap<>();
    private static boolean hcDebug = false;
    private static boolean hcEnable = true;
    private static C17766b hcPerfManager;
    private static byte[] lock = new byte[0];
    private static HashMap<Long, C114728f> requestStatusCallback = new HashMap<>();
    private static Method sGetStringPropsMethod = null;
    private static volatile Class<?> sSystemPropertiesClazz = null;
    public static C17773g sceneReportCallback;
    public static int tickRate = 100;
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.hardcoder.HardCoderJNI$AnrCallback */
    public interface AnrCallback {
        void onANR(byte[] bArr);
    }

    /* renamed from: com.tencent.mm.hardcoder.HardCoderJNI$HCPerfManagerThread */
    public interface HCPerfManagerThread {
        Thread newThread(Runnable runnable, String str, int i);
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("hardcoder");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/hardcoder/HardCoderJNI", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/hardcoder/HardCoderJNI", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private HardCoderJNI() {
    }

    public static native long cancelCpuCoreForThread(int[] iArr, int i, long j);

    public static native long cancelCpuHighFreq(int i, long j);

    public static native long cancelGpuHighFreq(int i, long j);

    public static native long cancelHighIOFreq(int i, long j);

    public static native long cancelUnifyCpuIOThreadCoreGpu(boolean z, boolean z2, boolean z3, boolean z4, int[] iArr, int i, long j);

    public static native long checkPermission(String[] strArr, String[] strArr2, int i, int i2, int i3, long j);

    public static long checkPermission(String[] strArr, String[] strArr2, C104632e eVar) {
        if (!connect) {
            C17774h.m18165b(TAG, "startPerformance error disconnect");
            return -6;
        }
        long checkPermission = checkPermission(strArr, strArr2, Process.myPid(), Process.myUid(), Process.myTid(), SystemClock.elapsedRealtimeNanos());
        funcRetCallback.put(Long.valueOf(checkPermission), eVar);
        return checkPermission;
    }

    public static native long configure(byte[] bArr, int i, long j);

    public static native long getParameters(byte[] bArr, int i, long j);

    private static native int getTickRate();

    private static native int initHardCoder(String str, int i, String str2);

    public static int initHardCoder(String str, int i, String str2, HCPerfManagerThread hCPerfManagerThread, C104631d dVar) {
        boolean z = true;
        if (!isHcEnable()) {
            C17774h.m18165b(TAG, String.format("initHardCoder client not enable Hardcoder, hcEnable:%b, checkEnv:%b", new Object[]{Boolean.valueOf(isHcEnable()), Boolean.valueOf(isCheckEnv())}));
            return -3;
        }
        if (str == null || str.equals("")) {
            z = false;
        }
        checkEnv = z;
        synchronized (lock) {
            if (hcPerfManager == null) {
                if (hCPerfManagerThread == null) {
                    hCPerfManagerThread = new HCPerfManagerThread() {
                        public Thread newThread(Runnable runnable, String str, int i) {
                            return new Thread(runnable, str);
                        }
                    };
                }
                hcPerfManager = new C17766b(hCPerfManagerThread);
            }
        }
        tickRate = getTickRate();
        connectStatusCallback = dVar;
        return initHardCoder(str, i, str2);
    }

    public static boolean isCheckEnv() {
        return checkEnv;
    }

    public static boolean isHcDebug() {
        return hcDebug;
    }

    public static boolean isHcEnable() {
        return hcEnable;
    }

    public static native int isRunning();

    public static void onData(int i, long j, long j2, int i2, int i3, int i4, byte[] bArr) {
        C17774h.m18166c(TAG, "onData callbackType:" + i + ", requestId:" + j + ", timestamp:" + j2 + ", retCode:" + i2 + ", funcId:" + i3 + ", dataType:" + i4);
        if (i != 1) {
            if (i != 2) {
                onRequestCallback(i, j, i2, i3, i4, bArr);
            } else if (i3 != 1010) {
                onRequestCallback(i, j, i2, i3, i4, bArr);
            } else {
                AnrCallback anrCallback2 = anrCallback;
                if (anrCallback2 != null) {
                    anrCallback2.onANR(bArr);
                }
            }
        } else if (i3 != 0) {
            onRequestCallback(i, j, i2, i3, i4, bArr);
        } else {
            switch (i2) {
                case ERR_CLIENT_ALREADY_INIT /*-20002*/:
                    connect = true;
                    C17774h.m18166c(TAG, "onData callback, already initHardcoder!");
                    return;
                case CLIENT_DISCONNECT /*-20001*/:
                    connect = false;
                    C104631d dVar = connectStatusCallback;
                    if (dVar != null) {
                        dVar.onConnectStatus(false);
                        return;
                    }
                    return;
                case CLIENT_CONNECT /*-20000*/:
                    connect = true;
                    C104631d dVar2 = connectStatusCallback;
                    if (dVar2 != null) {
                        dVar2.onConnectStatus(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static void onRequestCallback(int i, long j, int i2, int i3, int i4, byte[] bArr) {
        HashMap<Long, C114728f> hashMap = requestStatusCallback;
        C104632e eVar = null;
        C114728f remove = hashMap != null ? hashMap.remove(Long.valueOf(j)) : null;
        HashMap<Long, C104632e> hashMap2 = funcRetCallback;
        if (!(hashMap2 == null || (eVar = hashMap2.remove(Long.valueOf(j))) == null)) {
            eVar.onFuncRet(i, j, i2, i3, i4, bArr);
        }
        if (remove != null || eVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRequestCallback, funcId:");
            int i5 = i3;
            sb.append(i3);
            sb.append(", requestId:");
            long j2 = j;
            sb.append(j);
            sb.append(", retCode:");
            int i6 = i2;
            sb.append(i2);
            sb.append(", requestStatus:");
            sb.append(remove == null ? "null" : remove.toString());
            sb.append(", funcRetCallback:");
            sb.append(eVar == null ? "false" : "true");
            C17774h.m18166c(TAG, sb.toString());
        }
    }

    public static void putFuncRetHashMap(long j, C104632e eVar) {
        HashMap<Long, C104632e> hashMap = funcRetCallback;
        if (hashMap != null) {
            hashMap.put(Long.valueOf(j), eVar);
        }
    }

    public static void putRequestStatusHashMap(long j, C114728f fVar) {
        HashMap<Long, C114728f> hashMap = requestStatusCallback;
        if (hashMap != null) {
            hashMap.put(Long.valueOf(j), fVar);
        }
    }

    public static String readServerAddr() {
        String str;
        Class<String> cls = String.class;
        try {
            synchronized (lock) {
                if (sSystemPropertiesClazz == null) {
                    sSystemPropertiesClazz = Class.forName("android.os.SystemProperties");
                    Method declaredMethod = sSystemPropertiesClazz.getDeclaredMethod("get", new Class[]{cls, cls});
                    sGetStringPropsMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                str = (String) sGetStringPropsMethod.invoke((Object) null, new Object[]{SERVER_PROP_KEY, ""});
                C17774h.m18166c(TAG, String.format("readServerAddr, serverprop[%s] result[%s]", new Object[]{SERVER_PROP_KEY, str}));
            }
            return str;
        } catch (Throwable th) {
            Object[] objArr = new Object[0];
            C17774h.C17775a aVar = C17774h.f48943a;
            if (aVar == null) {
                return "";
            }
            aVar.printErrStackTrace(TAG, th, "readServerAddr", objArr);
            return "";
        }
    }

    public static native long registerANRCallback(int i, long j);

    public static long registerANRCallback(AnrCallback anrCallback2) {
        anrCallback = anrCallback2;
        return registerANRCallback(Process.myTid(), SystemClock.elapsedRealtime());
    }

    public static native long registerBootPreloadResource(String[] strArr, int i, long j);

    public static native long registerSystemEventCallback(int i, long j);

    public static native long requestCpuCoreForThread(int i, long j, int[] iArr, int i2, int i3, long j2);

    public static native long requestCpuHighFreq(int i, long j, int i2, int i3, int i4, long j2);

    public static native long requestGpuHighFreq(int i, long j, int i2, int i3, int i4, long j2);

    public static native long requestHighIOFreq(int i, long j, int i2, int i3, int i4, long j2);

    public static native long requestScreenResolution(int i, String str, int i2, long j);

    public static native long requestUnifyCpuIOThreadCoreGpu(int i, long j, int i2, int i3, int i4, int[] iArr, int i5, int i6, long j2);

    public static native long resetScreenResolution(int i, long j);

    public static void setCheckEnv(boolean z) {
        checkEnv = z;
    }

    private static native void setDebug(boolean z);

    private static native void setHCEnable(boolean z);

    public static void setHcDebug(boolean z) {
        hcDebug = z;
        if (checkEnv) {
            setDebug(z);
        }
    }

    public static void setHcEnable(boolean z) {
        hcEnable = z;
        if (checkEnv) {
            setHCEnable(z);
        }
    }

    public static native void setRetryConnectInterval(int i);

    public static void setSceneReportCallback(C17773g gVar) {
        sceneReportCallback = gVar;
    }

    public static int startPerformance(int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, String str) {
        return startPerformance(i, i2, i3, 0, new int[]{i4}, i5, i6, j, i7, str);
    }

    public static native int startTraceCpuLoad(int i, int i2);

    public static int stopPerformance(int i) {
        C17766b bVar = hcPerfManager;
        if (bVar == null) {
            C17774h.m18165b(TAG, "stopPerformance error HCPerfManager is null, please initHardCoder first!");
            return -5;
        } else if (!connect) {
            C17774h.m18165b(TAG, "stopPerformance error disconnect");
            return -6;
        } else {
            bVar.getClass();
            C17766b.C17770d dVar = new C17766b.C17770d();
            dVar.f48933a = System.currentTimeMillis();
            dVar.f48934b = i;
            boolean offer = i != 0 ? bVar.f48909d.offer(dVar) : false;
            C17774h.m18164a("Hardcoder.HCPerfManager", String.format("stop ret:%b, hashcode:%x", new Object[]{Boolean.valueOf(offer), Integer.valueOf(i)}));
            C17774h.m18166c(TAG, String.format("stopPerformance:%d, ret:%b", new Object[]{Integer.valueOf(i), Boolean.valueOf(offer)}));
            return offer ? 0 : -1;
        }
    }

    public static native int stopTraceCpuLoad(int i);

    public static native long terminateApp(int i, long j);

    public boolean isConnect() {
        return connect;
    }

    public static int startPerformance(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6, long j, int i7, String str) {
        int i8;
        int i9 = i;
        int i15 = i2;
        int i16 = i3;
        int i17 = i4;
        int[] iArr2 = iArr;
        int i18 = i5;
        C17766b bVar = hcPerfManager;
        if (bVar == null) {
            C17774h.m18165b(TAG, "startPerformance error HCPerfManager is null, please initHardCoder first!");
            return -5;
        } else if (!connect) {
            C17774h.m18165b(TAG, "startPerformance error disconnect");
            return -6;
        } else {
            bVar.getClass();
            if (!(i9 >= 0 && i15 >= 0 && i17 >= 0 && i16 >= 0 && iArr2 != null && iArr2.length > 0 && i18 > 0) || (i15 == 0 && i16 == 0 && i17 == 0 && iArr2.length == 1 && iArr2[0] == 0)) {
                int i19 = i6;
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(i2);
                objArr[2] = Integer.valueOf(i3);
                objArr[3] = Integer.valueOf(i4);
                objArr[4] = Integer.valueOf(iArr2 == null ? 0 : iArr2.length);
                objArr[5] = Integer.valueOf(i5);
                C17774h.m18165b("Hardcoder.HCPerfManager", String.format("start error params, ignore this task! delay:%d, [cpu:%d, io:%d, gpu:%d], bindTids:%d, timeout:%d", objArr));
            } else {
                C17766b.C17769c cVar = new C17766b.C17769c();
                cVar.f48913b = i9;
                cVar.f48915d = i15;
                cVar.f48917f = i16;
                cVar.f48918g = (int[]) iArr.clone();
                cVar.f48916e = i17;
                cVar.f48914c = i18;
                cVar.f48919h = i6;
                cVar.f48920i = j;
                cVar.f48924m = i7;
                long currentTimeMillis = System.currentTimeMillis();
                cVar.f48922k = currentTimeMillis;
                long j2 = currentTimeMillis + ((long) i9);
                cVar.f48921j = j2;
                cVar.f48923l = ((long) i18) + j2;
                cVar.f48925n = str;
                cVar.f48928q = j2;
                boolean offer = bVar.f48909d.offer(cVar);
                C17774h.m18164a("Hardcoder.HCPerfManager", String.format("start ret:%b ,task:%s", new Object[]{Boolean.valueOf(offer), cVar.mo21753c(cVar.f48922k)}));
                if (offer) {
                    i8 = cVar.hashCode();
                    C17774h.m18166c(TAG, String.format("hcPerfManager startPerformance:%d, scene:%d", new Object[]{Integer.valueOf(i8), Integer.valueOf(i6)}));
                    return i8;
                }
            }
            i8 = 0;
            C17774h.m18166c(TAG, String.format("hcPerfManager startPerformance:%d, scene:%d", new Object[]{Integer.valueOf(i8), Integer.valueOf(i6)}));
            return i8;
        }
    }
}
