package com.tencent.p014mm.plugin.fts.p059ui;

/* renamed from: com.tencent.mm.plugin.fts.ui.g0$$a */
public final /* synthetic */ class g0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f19093d;

    /* renamed from: e */
    public final /* synthetic */ String f19094e;

    /* renamed from: f */
    public final /* synthetic */ String f19095f;

    /* renamed from: g */
    public final /* synthetic */ int f19096g;

    public /* synthetic */ g0$$a(String str, String str2, String str3, int i) {
        this.f19093d = str;
        this.f19094e = str2;
        this.f19095f = str3;
        this.f19096g = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b1, code lost:
        if (r9.put("username", r0).put("nickname", r1).put("headUrl", r2).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, eb0.C31543z5.m39455e()).put("type", r3) == null) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = r14.f19093d
            java.lang.String r1 = r14.f19094e
            java.lang.String r2 = r14.f19095f
            int r3 = r14.f19096g
            tv1.a$a r4 = tv1.C14094a.f39499a
            java.lang.String r5 = ""
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r5)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r5)
            r4.getClass()
            java.lang.String r4 = "FTSBizClickFlow"
            java.lang.String r5 = "username"
            gy3.C87412m.m108594g(r0, r5)
            java.lang.String r6 = "nickName"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "headUrl"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "addClickFlow username:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = ", nickName:"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = ", headUrl:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.FTS.FTSBizClickFlow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e7 }
            r7.<init>()     // Catch:{ Exception -> 0x00e7 }
            rx3.g<com.tencent.mm.sdk.platformtools.MultiProcessMMKV> r9 = g83.C59379b.f169715b     // Catch:{ Exception -> 0x00e7 }
            rx3.g<com.tencent.mm.sdk.platformtools.MultiProcessMMKV> r9 = g83.C59379b.f169715b     // Catch:{ Exception -> 0x00e7 }
            rx3.n r9 = (rx3.C36570n) r9     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ Exception -> 0x00e7 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r9     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r10 = "{}"
            java.lang.String r9 = r9.decodeString(r4, r10)     // Catch:{ Exception -> 0x00e7 }
            if (r9 == 0) goto L_0x008b
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e7 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x00e7 }
            java.util.Iterator r9 = r10.keys()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r11 = "obj.keys()"
            gy3.C87412m.m108593f(r9, r11)     // Catch:{ Exception -> 0x00e7 }
        L_0x0077:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x00e7 }
            if (r11 == 0) goto L_0x008b
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r12 = r10.opt(r11)     // Catch:{ Exception -> 0x00e7 }
            r7.put(r11, r12)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x0077
        L_0x008b:
            org.json.JSONObject r9 = r7.optJSONObject(r0)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r10 = "type"
            java.lang.String r11 = "timestamp"
            java.lang.String r12 = "nickname"
            if (r9 == 0) goto L_0x00b3
            org.json.JSONObject r9 = r9.put(r5, r0)     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r9 = r9.put(r12, r1)     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r9 = r9.put(r6, r2)     // Catch:{ Exception -> 0x00e7 }
            int r13 = eb0.C31543z5.m39455e()     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r9 = r9.put(r11, r13)     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r9 = r9.put(r10, r3)     // Catch:{ Exception -> 0x00e7 }
            if (r9 != 0) goto L_0x00d3
        L_0x00b3:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e7 }
            r9.<init>()     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r5 = r9.put(r5, r0)     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r1 = r5.put(r12, r1)     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r1 = r1.put(r6, r2)     // Catch:{ Exception -> 0x00e7 }
            int r2 = eb0.C31543z5.m39455e()     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r1 = r1.put(r11, r2)     // Catch:{ Exception -> 0x00e7 }
            org.json.JSONObject r1 = r1.put(r10, r3)     // Catch:{ Exception -> 0x00e7 }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x00e7 }
        L_0x00d3:
            rx3.g<com.tencent.mm.sdk.platformtools.MultiProcessMMKV> r0 = g83.C59379b.f169715b     // Catch:{ Exception -> 0x00e7 }
            rx3.g<com.tencent.mm.sdk.platformtools.MultiProcessMMKV> r0 = g83.C59379b.f169715b     // Catch:{ Exception -> 0x00e7 }
            rx3.n r0 = (rx3.C36570n) r0     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x00e7 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x00e7 }
            r0.encode((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f0
        L_0x00e7:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "addClickFlow"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r1)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.p059ui.g0$$a.run():void");
    }
}
