package e43;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONArray;
import q00.C110264g;

/* renamed from: e43.c */
public final class C107225c {

    /* renamed from: a */
    public static final C107225c f320827a = new C107225c();

    /* renamed from: b */
    public static C110264g.C110266c f320828b;

    /* renamed from: c */
    public static boolean f320829c;

    /* renamed from: d */
    public static JSONArray f320830d = new JSONArray();

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r3 = r3.f317333b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m145287a(e43.C107225c r0, int r1, java.lang.String r2, int r3, java.lang.Object r4) {
        /*
            r0.getClass()
            org.json.JSONArray r0 = f320830d     // Catch:{ Exception -> 0x003e }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x003e }
            r2.<init>()     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = "action"
            r2.put(r3, r1)     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = "isFront"
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x003e }
            if (r3 == 0) goto L_0x0024
            l33.a r3 = r3.f317333b     // Catch:{ Exception -> 0x003e }
            if (r3 == 0) goto L_0x0024
            boolean r3 = r3.mo152455Y()     // Catch:{ Exception -> 0x003e }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x003e }
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            r2.put(r1, r3)     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = "timeStamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x003e }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x003e }
            org.json.JSONArray r0 = r0.put(r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = "usageDetails.put(\n      …          }\n            )"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x003e }
            f320830d = r0     // Catch:{ Exception -> 0x003e }
            goto L_0x0059
        L_0x003e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "recordAction fail: "
            r1.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.VirtualBackgroundFilter"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e43.C107225c.m145287a(e43.c, int, java.lang.String, int, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo157685b(C110264g.C110266c cVar) {
        C87412m.m108594g(cVar, "mode");
        Log.m105924i("MicroMsg.VirtualBackgroundFilter", "setSegmentBgBlur: " + cVar);
        m145287a(this, 1, (String) null, 2, (Object) null);
        f320828b = cVar;
    }
}
