package com.tencent.matrix.traffic;

import com.tencent.xweb.IXWebBroadcastListener;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import p1047uf.C90656a;
import p1060we.C90970b;
import p723vf.C118672d;
import p723vf.C90779e;

public class TrafficPlugin extends C90970b {

    /* renamed from: i */
    public static final Map<String, String> f235660i = new ConcurrentHashMap();

    /* renamed from: j */
    public static final Map<String, String> f235661j = new ConcurrentHashMap();

    /* renamed from: h */
    public final C90656a f235662h;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("matrix-traffic");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/traffic/TrafficPlugin", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/matrix/traffic/TrafficPlugin", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public TrafficPlugin(C90656a aVar) {
        this.f235662h = aVar;
    }

    private static native void nativeClearTrafficInfo();

    private static native String nativeGetAllStackTraceTrafficInfo();

    private static native String nativeGetNativeBackTraceByKey(String str);

    private static native String nativeGetTrafficInfo();

    private static native HashMap<String, String> nativeGetTrafficInfoMap(int i);

    private static native void nativeInitMatrixTraffic(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String[] strArr);

    private static native void nativeReleaseMatrixTraffic();

    private static void setFdStackTrace(String str) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        String sb4 = sb.toString();
        String str2 = C90779e.f260689a;
        byte[] digest = C90779e.f260692d.get().digest(sb4.getBytes());
        int length = digest.length;
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        int i = length + 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = digest[i2];
            char[] cArr = C90779e.f260691c;
            char c = cArr[(b & 240) >> 4];
            char c2 = cArr[b & 15];
            stringBuffer.append(c);
            stringBuffer.append(c2);
        }
        String stringBuffer2 = stringBuffer.toString();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f235660i;
        if (!concurrentHashMap.containsKey(stringBuffer2)) {
            concurrentHashMap.put(stringBuffer2, sb.toString());
        }
        ((ConcurrentHashMap) f235661j).put(str, stringBuffer2);
    }

    /* renamed from: d */
    public void mo112100d() {
        if (!(this.f261039g == 2)) {
            super.mo112100d();
            C118672d.m167353c("TrafficPlugin", IXWebBroadcastListener.STAGE_START, new Object[0]);
            ArrayList arrayList = (ArrayList) this.f235662h.f260471f;
            this.f235662h.getClass();
            this.f235662h.getClass();
            C90656a aVar = this.f235662h;
            nativeInitMatrixTraffic(aVar.f260466a, aVar.f260467b, aVar.f260468c, aVar.f260469d, aVar.f260470e, (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    /* renamed from: e */
    public void mo112139e() {
        ((ConcurrentHashMap) f235661j).clear();
        ((ConcurrentHashMap) f235660i).clear();
        nativeClearTrafficInfo();
    }

    /* renamed from: f */
    public String mo112140f(String str) {
        return !this.f235662h.f260469d ? "" : nativeGetNativeBackTraceByKey(str);
    }

    /* renamed from: g */
    public HashMap<String, String> mo112141g(int i) {
        return nativeGetTrafficInfoMap(i);
    }
}
