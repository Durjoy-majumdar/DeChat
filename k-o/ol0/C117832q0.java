package ol0;

/* renamed from: ol0.q0 */
public class C117832q0 extends C117793b {
    public static final int CTRL_INDEX = 891;
    public static final String NAME = "updateMapGroundOverlay";

    /* JADX WARNING: Removed duplicated region for block: B:35:0x010e A[Catch:{ JSONException -> 0x013c }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126 A[Catch:{ JSONException -> 0x013a }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r21, org.json.JSONObject r22, int r23) {
        /*
            r20 = this;
            r7 = r20
            r2 = r21
            r0 = r22
            r3 = r23
            java.lang.Class<zi0.b> r1 = zi0.C91759b.class
            java.lang.String r4 = "northeast"
            java.lang.String r5 = "southwest"
            java.lang.String r6 = "bounds"
            super.mo1505u(r21, r22, r23)
            super.mo1505u(r21, r22, r23)
            java.lang.String r8 = "MicroMsg.JsApiUpdateMapGroundOverlay"
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r0 = r7.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        L_0x002a:
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r0
            java.lang.String r12 = "data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r10)
            pl0.q r10 = r20.mo182577y(r21, r22)
            if (r10 != 0) goto L_0x004a
            java.lang.String r0 = "mapView is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            java.lang.String r0 = "fail:mapview is null"
            java.lang.String r0 = r7.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        L_0x004a:
            pl0.q$e r12 = new pl0.q$e     // Catch:{ JSONException -> 0x0148 }
            r12.<init>()     // Catch:{ JSONException -> 0x0148 }
            java.lang.String r13 = "id"
            int r13 = r0.getInt(r13)     // Catch:{ JSONException -> 0x0148 }
            java.lang.String r14 = "src"
            java.lang.String r14 = r0.getString(r14)     // Catch:{ JSONException -> 0x0148 }
            boolean r15 = r0.has(r6)     // Catch:{ JSONException -> 0x0148 }
            if (r15 == 0) goto L_0x00b5
            org.json.JSONObject r6 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x00ae }
            boolean r15 = r6.has(r5)     // Catch:{ JSONException -> 0x00ae }
            java.lang.String r11 = "longitude"
            java.lang.String r9 = "latitude"
            r16 = r8
            r7 = 0
            if (r15 == 0) goto L_0x008e
            org.json.JSONObject r5 = r6.getJSONObject(r5)     // Catch:{ JSONException -> 0x0140 }
            pl0.q$j r15 = new pl0.q$j     // Catch:{ JSONException -> 0x0140 }
            r17 = r1
            double r1 = r5.optDouble(r9, r7)     // Catch:{ JSONException -> 0x0140 }
            r18 = r13
            r19 = r14
            double r13 = r5.optDouble(r11, r7)     // Catch:{ JSONException -> 0x0140 }
            r15.<init>(r1, r13)     // Catch:{ JSONException -> 0x0140 }
            r12.f353006b = r15     // Catch:{ JSONException -> 0x0140 }
            goto L_0x0094
        L_0x008e:
            r17 = r1
            r18 = r13
            r19 = r14
        L_0x0094:
            boolean r1 = r6.has(r4)     // Catch:{ JSONException -> 0x0140 }
            if (r1 == 0) goto L_0x00bd
            org.json.JSONObject r1 = r6.getJSONObject(r4)     // Catch:{ JSONException -> 0x0140 }
            pl0.q$j r2 = new pl0.q$j     // Catch:{ JSONException -> 0x0140 }
            double r4 = r1.optDouble(r9, r7)     // Catch:{ JSONException -> 0x0140 }
            double r6 = r1.optDouble(r11, r7)     // Catch:{ JSONException -> 0x0140 }
            r2.<init>(r4, r6)     // Catch:{ JSONException -> 0x0140 }
            r12.f353007c = r2     // Catch:{ JSONException -> 0x0140 }
            goto L_0x00bd
        L_0x00ae:
            r0 = move-exception
            r7 = r20
            r2 = r21
            goto L_0x0149
        L_0x00b5:
            r17 = r1
            r16 = r8
            r18 = r13
            r19 = r14
        L_0x00bd:
            java.lang.String r1 = "visible"
            r2 = 1
            boolean r1 = r0.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x0140 }
            java.lang.String r4 = "zIndex"
            int r4 = r0.optInt(r4, r2)     // Catch:{ JSONException -> 0x0140 }
            java.lang.String r2 = "opacity"
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r0.optDouble(r2, r5)     // Catch:{ JSONException -> 0x0140 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)     // Catch:{ JSONException -> 0x0140 }
            r2 = r21
            if (r0 != 0) goto L_0x00f3
            r0 = r17
            ra.b r7 = r2.mo109668l(r0)     // Catch:{ JSONException -> 0x013c }
            if (r7 == 0) goto L_0x00f3
            ra.b r0 = r2.mo109668l(r0)     // Catch:{ JSONException -> 0x013c }
            zi0.b r0 = (zi0.C91759b) r0     // Catch:{ JSONException -> 0x013c }
            r7 = r19
            java.lang.String r0 = r0.mo115838nO(r2, r7)     // Catch:{ JSONException -> 0x013c }
            r12.f353005a = r0     // Catch:{ JSONException -> 0x013c }
            goto L_0x00f7
        L_0x00f3:
            r7 = r19
            r12.f353005a = r7     // Catch:{ JSONException -> 0x013c }
        L_0x00f7:
            r12.f353009e = r1     // Catch:{ JSONException -> 0x013c }
            r12.f353010f = r4     // Catch:{ JSONException -> 0x013c }
            float r0 = (float) r5     // Catch:{ JSONException -> 0x013c }
            r12.f353008d = r0     // Catch:{ JSONException -> 0x013c }
            java.lang.Class<zi0.a> r0 = zi0.C91755a.class
            ra.b r0 = r2.mo109668l(r0)     // Catch:{ JSONException -> 0x013c }
            zi0.a r0 = (zi0.C91755a) r0     // Catch:{ JSONException -> 0x013c }
            r1 = r18
            boolean r0 = r10.mo182859m(r1, r12, r0)     // Catch:{ JSONException -> 0x013c }
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = "updateGroundOverlay ok"
            r1 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r0 = "ok"
            r7 = r20
            java.lang.String r0 = r7.mo115109j(r0)     // Catch:{ JSONException -> 0x013a }
            r2.mo109647a(r3, r0)     // Catch:{ JSONException -> 0x013a }
            goto L_0x0139
        L_0x0122:
            r0 = move-exception
            r7 = r20
            goto L_0x014a
        L_0x0126:
            r7 = r20
            r1 = r16
            java.lang.String r0 = "updateGroundOverlay fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r0 = "fail"
            java.lang.String r0 = r7.mo115109j(r0)     // Catch:{ JSONException -> 0x013a }
            r2.mo109647a(r3, r0)     // Catch:{ JSONException -> 0x013a }
        L_0x0139:
            return
        L_0x013a:
            r0 = move-exception
            goto L_0x014a
        L_0x013c:
            r0 = move-exception
            r7 = r20
            goto L_0x0145
        L_0x0140:
            r0 = move-exception
            r7 = r20
            r2 = r21
        L_0x0145:
            r1 = r16
            goto L_0x014a
        L_0x0148:
            r0 = move-exception
        L_0x0149:
            r1 = r8
        L_0x014a:
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "parse update groundOverlay error, exception : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
            java.lang.String r0 = "fail:internal error"
            java.lang.String r4 = r7.mo115109j(r0)
            r5 = 0
            boolean r6 = r10.mo182849h()
            r1 = r20
            r2 = r21
            r3 = r23
            r1.mo182575w(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.C117832q0.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
