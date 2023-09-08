package com.tencent.p014mm.plugin.expt.pageflow;

/* renamed from: com.tencent.mm.plugin.expt.pageflow.e */
public class C41385e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f111416d;

    /* renamed from: e */
    public final /* synthetic */ boolean f111417e;

    /* renamed from: f */
    public final /* synthetic */ MMPageFlowService f111418f;

    public C41385e(MMPageFlowService mMPageFlowService, long j, boolean z) {
        this.f111418f = mMPageFlowService;
        this.f111416d = j;
        this.f111417e = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        if (r9 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fe, code lost:
        r0 = r16;
        r1 = r17;
        r9 = r18;
        r10 = r19;
        r11 = r20;
        r16 = r2;
        r17 = r3;
        r19 = r5;
        r20 = "MicroMsg.MMPageFlowService";
        r2 = r21;
        r3 = r22;
        r4 = r23;
        r5 = r24;
        r6 = r25;
        r21 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r7 = new org.json.JSONObject();
        r7.put(com.tencent.p014mm.sdk.storage.MStorageEventData.EventType.SINGLE, r9).put("singleSes", r12);
        r7.put("singleMute", r13).put("singleMuteSes", r0);
        r7.put("group", r11).put("groupSes", r2);
        r7.put("groupMute", r5).put("groupMuteSes", r6);
        r7.put("plugin", r14).put("pluginSes", r15);
        r7.put("service", r3).put("serviceSes", r4);
        r7.put("notifyMessage", r1).put("subscribe", r10).put("cost", r21);
        r0 = r7.toString().replace(",", ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018f, code lost:
        r4 = r20;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0193, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0194, code lost:
        r1 = 0;
        r4 = r20;
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, "toJson error", new java.lang.Object[0]);
        r0 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r29 = this;
            r1 = r29
            com.tencent.mm.plugin.expt.pageflow.MMPageFlowService r2 = r1.f111418f
            long r3 = r1.f111416d
            boolean r5 = r1.f111417e
            r2.getClass()
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.String r6 = "MicroMsg.MMPageFlowService"
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r9 = 0
            r11 = 0
            k40.a r12 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x00d8 }
            f62.k0 r12 = (f62.C75700k0) r12     // Catch:{ Exception -> 0x00d8 }
            com.tencent.mm.storage.v3 r12 = r12.mo96094Ku()     // Catch:{ Exception -> 0x00d8 }
            com.tencent.mm.storage.i2 r12 = (com.tencent.p014mm.storage.C44660i2) r12     // Catch:{ Exception -> 0x00d8 }
            android.database.Cursor r9 = r12.mo69750V()     // Catch:{ Exception -> 0x00d8 }
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            if (r9 == 0) goto L_0x00d2
        L_0x003f:
            boolean r26 = r9.moveToNext()     // Catch:{ Exception -> 0x00d0 }
            if (r26 == 0) goto L_0x00d2
            java.lang.String r10 = r9.getString(r11)     // Catch:{ Exception -> 0x00d0 }
            r11 = 1
            int r27 = r9.getInt(r11)     // Catch:{ Exception -> 0x00d0 }
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85841l5(r10)     // Catch:{ Exception -> 0x00d0 }
            if (r11 == 0) goto L_0x0058
            int r19 = r19 + r27
            goto L_0x00cd
        L_0x0058:
            boolean r11 = eb0.C45628s0.m50751P(r10)     // Catch:{ Exception -> 0x00d0 }
            if (r11 != 0) goto L_0x00c9
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85795C5(r10)     // Catch:{ Exception -> 0x00d0 }
            if (r11 == 0) goto L_0x0066
            goto L_0x00c9
        L_0x0066:
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85840k5(r10)     // Catch:{ Exception -> 0x00d0 }
            if (r11 == 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85806K4(r10)     // Catch:{ Exception -> 0x00d0 }
            if (r11 == 0) goto L_0x0076
        L_0x0073:
            int r17 = r17 + r27
            goto L_0x00cd
        L_0x0076:
            java.lang.String r11 = "gh_"
            boolean r11 = r10.startsWith(r11)     // Catch:{ Exception -> 0x00d0 }
            if (r11 == 0) goto L_0x0083
            int r22 = r22 + r27
            int r23 = r23 + 1
            goto L_0x00cd
        L_0x0083:
            k40.a r11 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x00d0 }
            f62.k0 r11 = (f62.C75700k0) r11     // Catch:{ Exception -> 0x00d0 }
            com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()     // Catch:{ Exception -> 0x00d0 }
            com.tencent.mm.storage.z1 r11 = r11.get(r10)     // Catch:{ Exception -> 0x00d0 }
            if (r11 == 0) goto L_0x00cd
            java.lang.String r28 = r11.getUsername()     // Catch:{ Exception -> 0x00d0 }
            boolean r28 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)     // Catch:{ Exception -> 0x00d0 }
            if (r28 == 0) goto L_0x009e
            goto L_0x00cd
        L_0x009e:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)     // Catch:{ Exception -> 0x00d0 }
            if (r10 == 0) goto L_0x00b2
            int r10 = r11.f149512S     // Catch:{ Exception -> 0x00d0 }
            if (r10 != 0) goto L_0x00ad
            int r24 = r24 + r27
            int r25 = r25 + 1
            goto L_0x00cd
        L_0x00ad:
            int r20 = r20 + r27
            int r21 = r21 + 1
            goto L_0x00cd
        L_0x00b2:
            boolean r10 = r11.mo62916m3()     // Catch:{ Exception -> 0x00d0 }
            if (r10 == 0) goto L_0x00b9
            goto L_0x00cd
        L_0x00b9:
            boolean r10 = eb0.C45628s0.m50746K(r11)     // Catch:{ Exception -> 0x00d0 }
            if (r10 == 0) goto L_0x00c4
            int r13 = r13 + r27
            int r16 = r16 + 1
            goto L_0x00cd
        L_0x00c4:
            int r18 = r18 + r27
            int r12 = r12 + 1
            goto L_0x00cd
        L_0x00c9:
            int r14 = r14 + r27
            int r15 = r15 + 1
        L_0x00cd:
            r11 = 0
            goto L_0x003f
        L_0x00d0:
            r0 = move-exception
            goto L_0x00f1
        L_0x00d2:
            if (r9 == 0) goto L_0x00fe
            goto L_0x00fb
        L_0x00d5:
            r0 = move-exception
            goto L_0x0202
        L_0x00d8:
            r0 = move-exception
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x00f1:
            java.lang.String r10 = "getUnreadStatus error"
            r11 = 0
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r10, r1)     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00fe
        L_0x00fb:
            r9.close()
        L_0x00fe:
            r0 = r16
            r1 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r16 = r2
            r17 = r3
            r19 = r5
            r20 = r6
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7)
            r21 = r7
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0193 }
            r7.<init>()     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r8 = "single"
            org.json.JSONObject r8 = r7.put(r8, r9)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r9 = "singleSes"
            r8.put(r9, r12)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r8 = "singleMute"
            org.json.JSONObject r8 = r7.put(r8, r13)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r9 = "singleMuteSes"
            r8.put(r9, r0)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r0 = "group"
            org.json.JSONObject r0 = r7.put(r0, r11)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r8 = "groupSes"
            r0.put(r8, r2)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r0 = "groupMute"
            org.json.JSONObject r0 = r7.put(r0, r5)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r2 = "groupMuteSes"
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r0 = "plugin"
            org.json.JSONObject r0 = r7.put(r0, r14)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r2 = "pluginSes"
            r0.put(r2, r15)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r0 = "service"
            org.json.JSONObject r0 = r7.put(r0, r3)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r2 = "serviceSes"
            r0.put(r2, r4)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r0 = "notifyMessage"
            org.json.JSONObject r0 = r7.put(r0, r1)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r1 = "subscribe"
            org.json.JSONObject r0 = r0.put(r1, r10)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r1 = "cost"
            r2 = r21
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r0 = r7.toString()     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r1 = ","
            java.lang.String r2 = "."
            java.lang.String r0 = r0.replace(r1, r2)     // Catch:{ JSONException -> 0x0193 }
            r4 = r20
            r1 = 0
            goto L_0x01a1
        L_0x0193:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "toJson error"
            r4 = r20
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
            java.lang.String r0 = ""
        L_0x01a1:
            r2 = 2
            if (r19 == 0) goto L_0x01c3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            r2[r1] = r3
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "\"tbe\":%d.\"be\":%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r5 = r16
            r5.f345928f = r0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r1] = r0
            java.lang.String r0 = "check unread status in [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r2)
            goto L_0x0201
        L_0x01c3:
            r5 = r16
            r3 = 1
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r5 = r5.f345928f
            r6[r1] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r17)
            r6[r3] = r5
            r6[r2] = r0
            java.lang.String r0 = "{%s.\"ten\":%d.\"en\":%s}"
            java.lang.String r0 = java.lang.String.format(r0, r6)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r1] = r0
            java.lang.String r1 = "check unread status back [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r2)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 16387(0x4003, float:2.2963E-41)
            r1.kvStat(r2, r0)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEIXIN_UNREAD_RECORDS_LAST_RPT_TIME_LONG
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119677K(r1, r2)
        L_0x0201:
            return
        L_0x0202:
            if (r9 == 0) goto L_0x0207
            r9.close()
        L_0x0207:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.pageflow.C41385e.run():void");
    }
}
