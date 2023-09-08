package com.tencent.p014mm.plugin.expt.pageflow;

/* renamed from: com.tencent.mm.plugin.expt.pageflow.g */
public class C115415g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f345932d;

    /* renamed from: e */
    public final /* synthetic */ C29897i f345933e;

    public C115415g(C29897i iVar, String str) {
        this.f345933e = iVar;
        this.f345932d = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.tencent.mm.plugin.expt.pageflow.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.tencent.mm.plugin.expt.pageflow.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.tencent.mm.plugin.expt.pageflow.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r27 = this;
            r1 = r27
            com.tencent.mm.plugin.expt.pageflow.i r0 = r1.f345933e
            java.lang.String r2 = r1.f345932d
            r0.getClass()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0011
            goto L_0x01f4
        L_0x0011:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r5 = "\\|"
            java.lang.String[] r2 = r2.split(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r2.length
            r8 = 0
        L_0x0022:
            r9 = 0
            if (r8 >= r6) goto L_0x004d
            r11 = r2[r8]
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 != 0) goto L_0x004a
            com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct
            r13 = 59
            r14 = 44
            java.lang.String r11 = r11.replace(r13, r14)
            r12.<init>(r11)
            long r13 = r12.f343804i
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x004a
            long r13 = r12.f343803h
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x004a
            r5.add(r12)
        L_0x004a:
            int r8 = r8 + 1
            goto L_0x0022
        L_0x004d:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            boolean r6 = r5.isEmpty()
            java.lang.String r8 = ";"
            java.lang.String r11 = "MicroMsg.MMPageReporter"
            if (r6 != 0) goto L_0x0126
            com.tencent.mm.plugin.expt.pageflow.h r6 = new com.tencent.mm.plugin.expt.pageflow.h
            r6.<init>(r0)
            java.util.Collections.sort(r5, r6)
            int r0 = r5.size()     // Catch:{ Exception -> 0x0118 }
            r6 = 0
            r17 = r9
            r15 = 0
            r16 = 0
        L_0x006e:
            if (r15 >= r0) goto L_0x0116
            java.lang.Object r19 = r5.get(r15)     // Catch:{ Exception -> 0x0106 }
            r12 = r19
            com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct r12 = (com.tencent.p014mm.autogen.mmdata.rpt.PageFlowDetailStruct) r12     // Catch:{ Exception -> 0x0106 }
            int r13 = r15 + 1
            if (r13 >= r0) goto L_0x0082
            java.lang.Object r6 = r5.get(r13)     // Catch:{ Exception -> 0x0106 }
            com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct r6 = (com.tencent.p014mm.autogen.mmdata.rpt.PageFlowDetailStruct) r6     // Catch:{ Exception -> 0x0106 }
        L_0x0082:
            if (r12 == 0) goto L_0x0109
            if (r6 == 0) goto L_0x0109
            r20 = r15
            long r14 = r12.f343803h     // Catch:{ Exception -> 0x0106 }
            r21 = 7
            r23 = 8
            int r25 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r25 != 0) goto L_0x00f9
            r22 = r8
            long r7 = r6.f343803h     // Catch:{ Exception -> 0x00f5 }
            int r25 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r25 != 0) goto L_0x00f1
            long r7 = r12.f343804i     // Catch:{ Exception -> 0x00f5 }
            long r9 = r6.f343804i     // Catch:{ Exception -> 0x00f5 }
            int r26 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r26 >= 0) goto L_0x00f1
            int r9 = r12.f343799d     // Catch:{ Exception -> 0x00f5 }
            int r10 = r6.f343799d     // Catch:{ Exception -> 0x00f5 }
            if (r9 != r10) goto L_0x00f1
            r9 = 0
            int r13 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b1
            long r13 = r7 - r17
            goto L_0x00b2
        L_0x00b1:
            r13 = r9
        L_0x00b2:
            java.lang.String r15 = "{\"tbe\":%d.\"ten\":%d.\"in\":%d.\"inbg\":%d}"
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x00f5 }
            r8 = 0
            r9[r8] = r7     // Catch:{ Exception -> 0x00f5 }
            long r7 = r6.f343804i     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x00f5 }
            r8 = 1
            r9[r8] = r7     // Catch:{ Exception -> 0x00f5 }
            long r7 = r6.f343804i     // Catch:{ Exception -> 0x00f5 }
            r10 = r0
            long r0 = r12.f343804i     // Catch:{ Exception -> 0x00f5 }
            long r7 = r7 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x00f5 }
            r1 = 2
            r9[r1] = r0     // Catch:{ Exception -> 0x00f5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x00f5 }
            r1 = 3
            r9[r1] = r0     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x00f5 }
            r2.append(r0)     // Catch:{ Exception -> 0x00f5 }
            r1 = r22
            r2.append(r1)     // Catch:{ Exception -> 0x0104 }
            long r7 = r6.f343804i     // Catch:{ Exception -> 0x0104 }
            int r15 = r20 + 2
            int r16 = r16 + 1
            r17 = r7
            goto L_0x010c
        L_0x00f1:
            r10 = r0
            r1 = r22
            goto L_0x00fb
        L_0x00f5:
            r0 = move-exception
            r1 = r22
            goto L_0x0114
        L_0x00f9:
            r10 = r0
            r1 = r8
        L_0x00fb:
            int r0 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            long r7 = r12.f343804i     // Catch:{ Exception -> 0x0104 }
            r17 = r7
            goto L_0x010b
        L_0x0104:
            r0 = move-exception
            goto L_0x0114
        L_0x0106:
            r0 = move-exception
            r1 = r8
            goto L_0x0114
        L_0x0109:
            r10 = r0
            r1 = r8
        L_0x010b:
            r15 = r13
        L_0x010c:
            r8 = r1
            r0 = r10
            r9 = 0
            r1 = r27
            goto L_0x006e
        L_0x0114:
            r5 = 0
            goto L_0x011d
        L_0x0116:
            r1 = r8
            goto L_0x0129
        L_0x0118:
            r0 = move-exception
            r1 = r8
            r5 = 0
            r16 = 0
        L_0x011d:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = "reportWeixinAppTime error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r5, r6)
            goto L_0x0129
        L_0x0126:
            r1 = r8
            r16 = 0
        L_0x0129:
            java.lang.String r0 = r2.toString()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = ","
            java.lang.String r5 = "."
            java.lang.String r5 = r0.replace(r5, r2)
            java.lang.String r1 = r5.replace(r1, r2)
            int r5 = r1.length()
            r6 = 1
            int r5 = r5 - r6
            java.lang.String r5 = r1.substring(r5)
            boolean r2 = u24.C90599h.m113509b(r5, r2)
            if (r2 == 0) goto L_0x0159
            int r2 = r1.length()
            int r2 = r2 - r6
            r5 = 0
            java.lang.String r1 = r1.substring(r5, r2)
        L_0x0159:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "["
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            j81.a r2 = j81.C117302a.xx0()
            t81.l r2 = r2.f351171d
            r2.getClass()
            boolean r5 = j81.C87906e.m109416j()
            if (r5 != 0) goto L_0x017f
            goto L_0x01af
        L_0x017f:
            boolean r5 = u24.C90599h.m113511d(r1)
            java.lang.String r6 = "EdgeComputingDataSourceService"
            if (r5 == 0) goto L_0x018d
            java.lang.String r1 = "[EdgeComputingDataSourceService] sendForeBack data isEmpty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x01af
        L_0x018d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[EdgeComputingDataSourceService] sendForeBack data : "
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            j81.C87906e.m109407a(r6, r5)
            long r5 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r2.f353895b
            t81.d r8 = new t81.d
            r8.<init>(r2, r5, r1)
            r7.post(r8)
        L_0x01af:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 16563(0x40b3, float:2.321E-41)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 1
            r5[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r9 = 2
            r5[r9] = r7
            r1.mo160131h(r2, r5)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r6] = r0
            java.lang.String r0 = "reportWeixinAppTime [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
            goto L_0x01dc
        L_0x01d9:
            r6 = 0
            r8 = 1
            r9 = 2
        L_0x01dc:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r8] = r1
            java.lang.String r1 = "reportWeixinAppTime cost[%d] count[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.pageflow.C115415g.run():void");
    }
}
