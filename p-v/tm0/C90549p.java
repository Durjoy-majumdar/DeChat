package tm0;

import android.os.Build;
import android.util.DisplayMetrics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84780r0;
import java.util.HashMap;
import java.util.Map;
import js0.C88020k;
import p156gj.C87201q;
import p156gj.C87203t;

/* renamed from: tm0.p */
public class C90549p<C extends C82381f> extends C82016a0<C> {
    public static final int CTRL_INDEX = 40;
    public static final String NAME = "getSystemInfo";

    /* renamed from: g */
    public final C14017c<C> f260178g;

    public C90549p() {
        this((C14017c) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[Catch:{ all -> 0x0066 }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo1731t(C r11, org.json.JSONObject r12) {
        /*
            r10 = this;
            java.lang.String r0 = "invoke cost:%dms, byNewImpl?:%b"
            java.lang.String r1 = "MicroMsg.JsApiGetSystemInfo"
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r4 = 2
            r5 = 1
            r6 = 0
            tm0.c<C> r7 = r10.f260178g     // Catch:{ all -> 0x0066 }
            r8 = 0
            if (r7 != 0) goto L_0x0011
            goto L_0x003c
        L_0x0011:
            r7.getClass()     // Catch:{ all -> 0x0066 }
            java.lang.String r9 = "component"
            gy3.C87412m.m108594g(r11, r9)     // Catch:{ all -> 0x0066 }
            if (r12 == 0) goto L_0x0023
            java.lang.String r9 = "type"
            java.lang.String r12 = r12.optString(r9)     // Catch:{ all -> 0x0066 }
            goto L_0x0024
        L_0x0023:
            r12 = r8
        L_0x0024:
            if (r12 == 0) goto L_0x002f
            int r9 = r12.length()     // Catch:{ all -> 0x0066 }
            if (r9 != 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r9 = 0
            goto L_0x0030
        L_0x002f:
            r9 = 1
        L_0x0030:
            if (r9 == 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            java.util.Map r12 = r7.mo13448a(r12, r11)     // Catch:{ all -> 0x0066 }
            if (r12 != 0) goto L_0x003b
            sx3.g0 r12 = sx3.C36903g0.f97931d     // Catch:{ all -> 0x0066 }
        L_0x003b:
            r8 = r12
        L_0x003c:
            if (r8 == 0) goto L_0x0040
            r12 = 1
            goto L_0x0041
        L_0x0040:
            r12 = 0
        L_0x0041:
            if (r8 != 0) goto L_0x0047
            java.util.Map r8 = r10.mo121609v(r11)     // Catch:{ all -> 0x0064 }
        L_0x0047:
            java.lang.String r11 = "ok"
            java.lang.String r11 = r10.mo115112m(r11, r8)     // Catch:{ all -> 0x0064 }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r7 = r7 - r2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2[r6] = r3
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2[r5] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
            return r11
        L_0x0064:
            r11 = move-exception
            goto L_0x0068
        L_0x0066:
            r11 = move-exception
            r12 = 0
        L_0x0068:
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r7 = r7 - r2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2[r6] = r3
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2[r5] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tm0.C90549p.mo1731t(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject):java.lang.String");
    }

    /* renamed from: v */
    public Map<String, Object> mo121609v(C c) {
        HashMap hashMap = new HashMap();
        hashMap.put("brand", Build.BRAND);
        hashMap.put("model", C87203t.m108275k());
        hashMap.put("abi", Build.CPU_ABI);
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null && strArr.length > 0) {
            hashMap.put("deviceAbi", strArr[0]);
        }
        hashMap.put("system", "Android " + Build.VERSION.RELEASE);
        DisplayMetrics displayMetrics = c.getContext().getResources().getDisplayMetrics();
        hashMap.put("pixelRatio", Float.valueOf(displayMetrics.density));
        hashMap.put("screenWidth", Integer.valueOf(C88020k.m109555f(displayMetrics.widthPixels)));
        hashMap.put("screenHeight", Integer.valueOf(C88020k.m109555f(displayMetrics.heightPixels)));
        hashMap.put("memorySize", Integer.valueOf(C84780r0.m104449a(c)));
        String b = C87201q.m108258b();
        if (b == null) {
            b = "unknown";
        }
        hashMap.put("cpuType", b);
        return hashMap;
    }

    public C90549p(C14017c<C> cVar) {
        this.f260178g = cVar;
    }
}
