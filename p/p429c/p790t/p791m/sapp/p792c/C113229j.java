package p429c.p790t.p791m.sapp.p792c;

import com.tencent.map.geolocation.sapp.internal.LocationLogCallback;

/* renamed from: c.t.m.sapp.c.j */
public class C113229j {

    /* renamed from: a */
    public static String f338812a = "TencentLocTag";

    /* renamed from: b */
    public static LocationLogCallback f338813b;

    /* renamed from: a */
    public static void m154970a(LocationLogCallback locationLogCallback) {
        f338813b = locationLogCallback;
    }

    /* renamed from: a */
    public static void m154969a(int i, String str, Throwable th) {
        LocationLogCallback locationLogCallback = f338813b;
        if (locationLogCallback != null) {
            locationLogCallback.onLog(i, "TencentLocationComp_sapp", str, th);
        }
    }

    /* renamed from: a */
    public static void m154971a(String str) {
        m154969a(4, str, (Throwable) null);
    }

    /* renamed from: a */
    public static void m154972a(String str, Throwable th) {
        m154969a(6, str, th);
    }
}
