package com.tencent.p014mm.plugin.webview.model;

/* renamed from: com.tencent.mm.plugin.webview.model.b */
public class C43696b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f118077d;

    /* renamed from: e */
    public final /* synthetic */ C43697c f118078e;

    public C43696b(C43697c cVar, String str) {
        this.f118078e = cVar;
        this.f118077d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x011d A[Catch:{ Exception -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0120 A[Catch:{ Exception -> 0x0126 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            java.lang.String r0 = r15.f118077d
            java.lang.String r1 = "DNSAdvanceRelateDomain"
            r2 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r1, r2)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            if (r0 == 0) goto L_0x0157
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0157
            r3 = 0
            r4 = 0
        L_0x0018:
            int r5 = r0.size()
            java.lang.String r6 = ".DNSAdvanceRelateDomain.RelateDomain"
            java.lang.String r7 = ""
            java.lang.String r8 = "MicroMsg.DNSPreGetOptimize"
            r9 = 1
            if (r4 >= r5) goto L_0x0067
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            if (r4 != 0) goto L_0x0031
            r10 = r7
            goto L_0x0035
        L_0x0031:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
        L_0x0035:
            r5.append(r10)
            java.lang.String r10 = ".$domain"
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 == 0) goto L_0x005b
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r3] = r4
            java.lang.String r4 = "now break for main domain i = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r5)
            goto L_0x0067
        L_0x005b:
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L_0x0064
            r1.add(r5)
        L_0x0064:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0067:
            r4 = 0
        L_0x0068:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            if (r4 != 0) goto L_0x0074
            r10 = r7
            goto L_0x0078
        L_0x0074:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
        L_0x0078:
            r5.append(r10)
            java.lang.String r10 = ".Relate"
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = ".DNSAdvanceRelateDomain.RelateDomain.Relate"
            r10.append(r11)
            if (r4 != 0) goto L_0x0098
            r11 = r7
            goto L_0x009c
        L_0x0098:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
        L_0x009c:
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r11 == 0) goto L_0x0135
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x0135
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r3] = r4
            java.lang.String r4 = "now break for releated domain j = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r0)
            com.tencent.mm.plugin.webview.model.c r0 = r15.f118078e
            com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118079a
            com.tencent.mm.plugin.webview.model.h2$m r4 = r0.f118118a
            if (r4 != 0) goto L_0x00d1
            com.tencent.mm.plugin.webview.model.h2$m r4 = new com.tencent.mm.plugin.webview.model.h2$m
            r4.<init>(r0)
            r0.f118118a = r4
        L_0x00d1:
            com.tencent.mm.plugin.webview.model.h2$m r0 = r0.f118118a
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0126 }
        L_0x00d7:
            boolean r4 = r1.hasNext()     // Catch:{ Exception -> 0x0126 }
            if (r4 == 0) goto L_0x0157
            java.lang.Object r4 = r1.next()     // Catch:{ Exception -> 0x0126 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0126 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0126 }
            java.net.InetAddress r7 = java.net.InetAddress.getByName(r4)     // Catch:{ Exception -> 0x0103 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0101 }
            long r10 = r10 - r5
            java.lang.String r12 = "get dns for domain : %s, cost time : %d"
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0101 }
            r13[r3] = r4     // Catch:{ Exception -> 0x0101 }
            java.lang.Long r14 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0101 }
            r13[r9] = r14     // Catch:{ Exception -> 0x0101 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r13)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0117
        L_0x0101:
            r10 = move-exception
            goto L_0x0105
        L_0x0103:
            r10 = move-exception
            r7 = r2
        L_0x0105:
            java.lang.String r11 = "get dns failed : %s"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0126 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ Exception -> 0x0126 }
            r12[r3] = r10     // Catch:{ Exception -> 0x0126 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r11, r12)     // Catch:{ Exception -> 0x0126 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0126 }
            long r10 = r10 - r5
        L_0x0117:
            r0.f118161a = r10     // Catch:{ Exception -> 0x0126 }
            r0.f118162b = r4     // Catch:{ Exception -> 0x0126 }
            if (r7 == 0) goto L_0x0120
            r0.f118163c = r9     // Catch:{ Exception -> 0x0126 }
            goto L_0x0122
        L_0x0120:
            r0.f118163c = r3     // Catch:{ Exception -> 0x0126 }
        L_0x0122:
            r0.mo68023a()     // Catch:{ Exception -> 0x0126 }
            goto L_0x00d7
        L_0x0126:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r0 = r0.getMessage()
            r1[r3] = r0
            java.lang.String r0 = "get dns failed 2 : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r1)
            goto L_0x0157
        L_0x0135:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r11 != 0) goto L_0x0144
            boolean r11 = r1.contains(r5)
            if (r11 != 0) goto L_0x0144
            r1.add(r5)
        L_0x0144:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r5 != 0) goto L_0x0153
            boolean r5 = r1.contains(r10)
            if (r5 != 0) goto L_0x0153
            r1.add(r10)
        L_0x0153:
            int r4 = r4 + 1
            goto L_0x0068
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.C43696b.run():void");
    }
}
