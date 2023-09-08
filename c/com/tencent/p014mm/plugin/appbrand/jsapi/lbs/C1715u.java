package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.u */
public class C1715u extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 38;
    public static final String NAME = "openLocation";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Intent w = mo1706w(jSONObject);
        if (w == null) {
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Context context = fVar.getContext();
        if (context == null) {
            fVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        C88144b.m109791i(context, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", w, (Bundle) null);
        fVar.mo109647a(i, mo115109j("ok"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:7|8|9|10|11|12|(1:14)|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0057 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0071 A[Catch:{ Exception -> 0x0095 }] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo1706w(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r10
            java.lang.String r3 = "MicroMsg.JsApiOpenLocation"
            java.lang.String r4 = "data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            r1 = 0
            java.lang.String r4 = "latitude"
            java.lang.String r4 = r10.optString(r4)     // Catch:{ Exception -> 0x0095 }
            r5 = 0
            float r4 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r4, r5)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = "longitude"
            java.lang.String r6 = r10.optString(r6)     // Catch:{ Exception -> 0x0095 }
            float r5 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r6, r5)     // Catch:{ Exception -> 0x0095 }
            float r6 = java.lang.Math.abs(r4)     // Catch:{ Exception -> 0x0095 }
            r7 = 1119092736(0x42b40000, float:90.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x0081
            float r6 = java.lang.Math.abs(r5)     // Catch:{ Exception -> 0x0095 }
            r7 = 1127481344(0x43340000, float:180.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            goto L_0x0081
        L_0x0038:
            java.lang.String r0 = "name"
            java.lang.String r0 = r10.optString(r0)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104396c(r0)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r3 = "address"
            java.lang.String r3 = r10.optString(r3)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104396c(r3)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = "scale"
            java.lang.String r10 = r10.optString(r6)     // Catch:{ Exception -> 0x0057 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r2)     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            android.content.Intent r10 = new android.content.Intent     // Catch:{ Exception -> 0x0095 }
            r10.<init>()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = "map_view_type"
            r7 = 10
            r10.putExtra(r6, r7)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = "kwebmap_slat"
            double r7 = (double) r4     // Catch:{ Exception -> 0x0095 }
            r10.putExtra(r6, r7)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r4 = "kwebmap_lng"
            double r5 = (double) r5     // Catch:{ Exception -> 0x0095 }
            r10.putExtra(r4, r5)     // Catch:{ Exception -> 0x0095 }
            if (r2 <= 0) goto L_0x0076
            java.lang.String r4 = "kwebmap_scale"
            r10.putExtra(r4, r2)     // Catch:{ Exception -> 0x0095 }
        L_0x0076:
            java.lang.String r2 = "kPoiName"
            r10.putExtra(r2, r0)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "Kwebmap_locaion"
            r10.putExtra(r0, r3)     // Catch:{ Exception -> 0x0095 }
            return r10
        L_0x0081:
            java.lang.String r10 = "lat: %f or lng: %f value is error!"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0095 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0095 }
            r6[r2] = r4     // Catch:{ Exception -> 0x0095 }
            java.lang.Float r2 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0095 }
            r6[r0] = r2     // Catch:{ Exception -> 0x0095 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r10, r6)     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u.mo1706w(org.json.JSONObject):android.content.Intent");
    }
}
