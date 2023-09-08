package ol0;

import pl0.C118080q;

/* renamed from: ol0.u */
public class C117838u extends C117793b {
    public static final int CTRL_INDEX = 136;
    public static final String NAME = "includeMapPoints";

    /* renamed from: ol0.u$a */
    public class C117839a extends C118080q.C118093j {
        public C117839a(C117838u uVar, double d, double d2) {
            super(d, d2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf A[Catch:{ Exception -> 0x00e9 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r21, org.json.JSONObject r22, int r23) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r0 = r22
            r9 = r23
            java.lang.String r1 = "points"
            super.mo1505u(r21, r22, r23)
            java.lang.String r10 = "MicroMsg.JsApiIncludeMapPoints"
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r0 = r7.mo115109j(r0)
            r8.mo109647a(r9, r0)
            return
        L_0x0020:
            r11 = 1
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r12 = 0
            r2[r12] = r0
            java.lang.String r3 = "data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            pl0.q r19 = r20.mo182577y(r21, r22)
            if (r19 != 0) goto L_0x0040
            java.lang.String r0 = "mapView is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            java.lang.String r0 = "fail:mapview is null"
            java.lang.String r0 = r7.mo115109j(r0)
            r8.mo109647a(r9, r0)
            return
        L_0x0040:
            boolean r2 = r0.has(r1)     // Catch:{ Exception -> 0x00e9 }
            if (r2 == 0) goto L_0x00d4
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e9 }
            r14.<init>()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r1 = r0.optString(r1)     // Catch:{ Exception -> 0x00e9 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x00e9 }
            if (r2 != 0) goto L_0x0090
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ Exception -> 0x00e9 }
            r13.<init>(r1)     // Catch:{ Exception -> 0x00e9 }
            r15 = 0
        L_0x005b:
            int r1 = r13.length()     // Catch:{ Exception -> 0x00e9 }
            if (r15 >= r1) goto L_0x0090
            java.lang.Object r1 = r13.get(r15)     // Catch:{ Exception -> 0x00e9 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r2 = "latitude"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Exception -> 0x00e9 }
            r3 = 0
            double r5 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r2, r3)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r2 = "longitude"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x00e9 }
            double r16 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r1, r3)     // Catch:{ Exception -> 0x00e9 }
            ol0.u$a r3 = new ol0.u$a     // Catch:{ Exception -> 0x00e9 }
            r1 = r3
            r2 = r20
            r11 = r3
            r3 = r5
            r5 = r16
            r1.<init>(r2, r3, r5)     // Catch:{ Exception -> 0x00e9 }
            r14.add(r11)     // Catch:{ Exception -> 0x00e9 }
            int r15 = r15 + 1
            r11 = 1
            goto L_0x005b
        L_0x0090:
            java.lang.String r1 = "padding"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x00e9 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x00e9 }
            if (r1 != 0) goto L_0x00c2
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x00e9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00e9 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x00e9 }
            if (r0 <= 0) goto L_0x00c2
            int r0 = js0.C88020k.m109559j(r1, r12)     // Catch:{ Exception -> 0x00e9 }
            r2 = 1
            int r3 = js0.C88020k.m109559j(r1, r2)     // Catch:{ Exception -> 0x00e9 }
            r2 = 2
            int r2 = js0.C88020k.m109559j(r1, r2)     // Catch:{ Exception -> 0x00e9 }
            r4 = 3
            int r1 = js0.C88020k.m109559j(r1, r4)     // Catch:{ Exception -> 0x00e9 }
            r15 = r0
            r18 = r1
            r17 = r2
            r16 = r3
            goto L_0x00c9
        L_0x00c2:
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x00c9:
            int r0 = r14.size()     // Catch:{ Exception -> 0x00e9 }
            if (r0 <= 0) goto L_0x00d4
            r13 = r19
            r13.mo182835d(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00e9 }
        L_0x00d4:
            java.lang.String r0 = "ok"
            java.lang.String r4 = r7.mo115109j(r0)
            r5 = 1
            boolean r6 = r19.mo182849h()
            r1 = r20
            r2 = r21
            r3 = r23
            r1.mo182575w(r2, r3, r4, r5, r6)
            return
        L_0x00e9:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r12] = r0
            java.lang.String r0 = "parse points error, exception : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r1)
            java.lang.String r0 = "fail:internal error"
            java.lang.String r0 = r7.mo115109j(r0)
            r8.mo109647a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.C117838u.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
