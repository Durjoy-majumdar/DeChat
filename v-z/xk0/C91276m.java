package xk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;

/* renamed from: xk0.m */
public class C91276m extends C82016a0 {
    public static final int CTRL_INDEX = 436;
    public static final String NAME = "measureText";

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[Catch:{ JSONException -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9 A[Catch:{ JSONException -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[Catch:{ JSONException -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce A[Catch:{ JSONException -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7 A[Catch:{ JSONException -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de A[Catch:{ JSONException -> 0x00e2 }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo1731t(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r12, org.json.JSONObject r13) {
        /*
            r11 = this;
            java.lang.String r12 = "normal"
            java.lang.String r0 = "MicroMsg.JsApiMeasureText"
            if (r13 != 0) goto L_0x0012
            java.lang.String r12 = "measureText, data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            java.lang.String r12 = "fail:data is null"
            java.lang.String r12 = r11.mo115109j(r12)
            return r12
        L_0x0012:
            java.lang.String r1 = "text"
            java.lang.String r1 = r13.optString(r1)
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            java.lang.String r4 = "fontSize"
            double r2 = r13.optDouble(r4, r2)
            float r2 = (float) r2
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r13.toString()
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "measureText data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x0153
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x003e
            goto L_0x0153
        L_0x003e:
            si0.a r4 = new si0.a
            r4.<init>()
            float r2 = js0.C88020k.m109552c(r2)
            r4.setTextSize(r2)
            java.lang.String r2 = "fontFamily"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ JSONException -> 0x005c }
            r4.f331434g = r2     // Catch:{ JSONException -> 0x005c }
            int r5 = r4.f331435h     // Catch:{ JSONException -> 0x005c }
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r5)     // Catch:{ JSONException -> 0x005c }
            r4.setTypeface(r2)     // Catch:{ JSONException -> 0x005c }
            goto L_0x0061
        L_0x005c:
            java.lang.String r2 = "get 'fontFamily' error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x0061:
            r2 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            r5 = 2
            r7 = -1
            java.lang.String r8 = "fontStyle"
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x00ad }
            int r9 = r8.hashCode()     // Catch:{ JSONException -> 0x00ad }
            r10 = -1657669071(0xffffffff9d31fa31, float:-2.35551E-21)
            if (r9 == r10) goto L_0x008f
            r10 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            if (r9 == r10) goto L_0x0085
            if (r9 == r2) goto L_0x007d
            goto L_0x0099
        L_0x007d:
            boolean r8 = r8.equals(r12)     // Catch:{ JSONException -> 0x00ad }
            if (r8 == 0) goto L_0x0099
            r8 = 2
            goto L_0x009a
        L_0x0085:
            java.lang.String r9 = "italic"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x00ad }
            if (r8 == 0) goto L_0x0099
            r8 = 1
            goto L_0x009a
        L_0x008f:
            java.lang.String r9 = "oblique"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x00ad }
            if (r8 == 0) goto L_0x0099
            r8 = 0
            goto L_0x009a
        L_0x0099:
            r8 = -1
        L_0x009a:
            if (r8 == 0) goto L_0x00a9
            if (r8 == r3) goto L_0x00a5
            if (r8 == r5) goto L_0x00a1
            goto L_0x00b2
        L_0x00a1:
            r4.mo162352d(r6)     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00b2
        L_0x00a5:
            r4.mo162352d(r5)     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00b2
        L_0x00a9:
            r4.mo162352d(r5)     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r8 = "get 'fontStyle' error."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
        L_0x00b2:
            java.lang.String r8 = "fontWeight"
            java.lang.String r13 = r13.getString(r8)     // Catch:{ JSONException -> 0x00e2 }
            int r8 = r13.hashCode()     // Catch:{ JSONException -> 0x00e2 }
            if (r8 == r2) goto L_0x00ce
            r12 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r8 == r12) goto L_0x00c4
            goto L_0x00d5
        L_0x00c4:
            java.lang.String r12 = "bold"
            boolean r12 = r13.equals(r12)     // Catch:{ JSONException -> 0x00e2 }
            if (r12 == 0) goto L_0x00d5
            r7 = 0
            goto L_0x00d5
        L_0x00ce:
            boolean r12 = r13.equals(r12)     // Catch:{ JSONException -> 0x00e2 }
            if (r12 == 0) goto L_0x00d5
            r7 = 1
        L_0x00d5:
            if (r7 == 0) goto L_0x00de
            if (r7 == r3) goto L_0x00da
            goto L_0x00e7
        L_0x00da:
            r4.setFakeBoldText(r6)     // Catch:{ JSONException -> 0x00e2 }
            goto L_0x00e7
        L_0x00de:
            r4.setFakeBoldText(r3)     // Catch:{ JSONException -> 0x00e2 }
            goto L_0x00e7
        L_0x00e2:
            java.lang.String r12 = "get 'fontWeight' error."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
        L_0x00e7:
            float r12 = r4.measureText(r1)
            android.graphics.Paint$FontMetrics r13 = r4.getFontMetrics()
            float r1 = r13.bottom
            float r2 = r13.top
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            float r4 = r13.bottom
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r2[r6] = r4
            float r13 = r13.top
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r2[r3] = r13
            java.lang.Float r13 = java.lang.Float.valueOf(r12)
            r2[r5] = r13
            r13 = 3
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            r2[r13] = r4
            java.lang.String r13 = "fontMetrics.bottom : %f, fontMetrics.top : %f, width : %f, height : %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r2)
            float r13 = js0.C88020k.m109556g()
            float r12 = r12 / r13
            float r13 = js0.C88020k.m109556g()
            float r1 = r1 / r13
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.String r2 = "width"
            r13.put(r2, r12)
            java.lang.Float r12 = java.lang.Float.valueOf(r1)
            java.lang.String r1 = "height"
            r13.put(r1, r12)
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r1 = r13.toString()
            r12[r6] = r1
            java.lang.String r1 = "map:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r12)
            java.lang.String r12 = "ok"
            java.lang.String r12 = r11.mo115112m(r12, r13)
            return r12
        L_0x0153:
            java.lang.String r12 = "measureText, param is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            java.lang.String r12 = "fail:param is illegal"
            java.lang.String r12 = r11.mo115109j(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xk0.C91276m.mo1731t(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject):java.lang.String");
    }
}
