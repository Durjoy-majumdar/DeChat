package com.tencent.p014mm.network;

/* renamed from: com.tencent.mm.network.a0 */
public class C114765a0 {
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m161489a(java.lang.String r13) {
        /*
            java.lang.String r0 = "exception:%s"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onDisasterNodeNotify:\n"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.MMDisasterInfoHandle"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 1
            java.io.StringReader r6 = new java.io.StringReader     // Catch:{ Exception -> 0x01bf }
            r6.<init>(r13)     // Catch:{ Exception -> 0x01bf }
            r1.setInput(r6)     // Catch:{ Exception -> 0x01bf }
            int r13 = r1.getEventType()     // Catch:{ Exception -> 0x01bf }
        L_0x002f:
            if (r13 == r5) goto L_0x004d
            r6 = 2
            if (r13 == r6) goto L_0x0035
            goto L_0x0048
        L_0x0035:
            java.lang.String r13 = "host"
            java.lang.String r6 = r1.getName()     // Catch:{ Exception -> 0x01bf }
            boolean r13 = r13.equals(r6)     // Catch:{ Exception -> 0x01bf }
            if (r13 == 0) goto L_0x0048
            java.lang.String r13 = r1.nextText()     // Catch:{ Exception -> 0x01bf }
            r3.add(r13)     // Catch:{ Exception -> 0x01bf }
        L_0x0048:
            int r13 = r1.next()     // Catch:{ Exception -> 0x01bf }
            goto L_0x002f
        L_0x004d:
            java.util.Iterator r13 = r3.iterator()
        L_0x0051:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "host "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0051
        L_0x0072:
            java.lang.String r13 = "compareDisasterHost"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            int r13 = r3.size()
            if (r13 != 0) goto L_0x007f
            goto L_0x01be
        L_0x007f:
            com.tencent.mm.network.y r13 = com.tencent.p014mm.network.C114781l0.m161554a()
            if (r13 != 0) goto L_0x008c
            java.lang.String r13 = "autoAuth is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r13)
            goto L_0x01be
        L_0x008c:
            com.tencent.mm.network.a r13 = r13.f344208n
            if (r13 != 0) goto L_0x0097
            java.lang.String r13 = "accinfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r13)
            goto L_0x01be
        L_0x0097:
            java.util.List<java.lang.String> r1 = r13.f344130u
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            r6 = 20
            if (r1 != 0) goto L_0x00c8
            java.util.Iterator r1 = r3.iterator()
        L_0x00a7:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x010d
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            byte[] r7 = r7.getBytes()
            java.util.List<java.lang.String> r8 = r13.f344130u
            java.lang.String r9 = new java.lang.String
            r9.<init>(r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r7 = r8.contains(r9)
            if (r7 == 0) goto L_0x00a7
            r9 = 1
            goto L_0x010e
        L_0x00c8:
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r7 = "main"
            com.tencent.mars.p468mm.MMLogic.getLocalHostList(r1, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List r1 = java.util.Arrays.asList(r1)
            r7.<init>(r1)
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x010d
            int r1 = r7.size()
            java.util.Iterator r8 = r3.iterator()
            r9 = 0
        L_0x00e7:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x010e
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
        L_0x00f4:
            if (r11 >= r1) goto L_0x00e7
            java.lang.Object r12 = r7.get(r11)
            if (r12 == 0) goto L_0x010a
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x010a
            r9 = 1
            goto L_0x00e7
        L_0x010a:
            int r11 = r11 + 1
            goto L_0x00f4
        L_0x010d:
            r9 = 0
        L_0x010e:
            if (r9 == 0) goto L_0x013f
            r13.mo174412j()
            com.tencent.mm.sdk.platformtools.MMHandler r13 = com.tencent.p014mm.network.C114781l0.m161556c()     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.network.z r1 = new com.tencent.mm.network.z     // Catch:{ Exception -> 0x0120 }
            r1.<init>()     // Catch:{ Exception -> 0x0120 }
            r13.post(r1)     // Catch:{ Exception -> 0x0120 }
            goto L_0x012c
        L_0x0120:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)
            r1[r4] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
        L_0x012c:
            java.lang.String r13 = "main disaster disasterOccur "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r13)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 148(0x94, double:7.3E-322)
            r6 = 124(0x7c, double:6.13E-322)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            goto L_0x01be
        L_0x013f:
            java.util.Map<java.lang.Integer, te3.yg2> r0 = r13.f344128s
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0160
            java.util.Iterator r0 = r3.iterator()
        L_0x014d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x019e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r13.mo54127q3(r1)
            if (r1 == 0) goto L_0x014d
            goto L_0x019f
        L_0x0160:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.String r1 = "axhost"
            com.tencent.mars.p468mm.MMLogic.getLocalHostList(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            int r0 = r1.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x0178:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x019e
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
        L_0x0185:
            if (r7 >= r0) goto L_0x0178
            java.lang.Object r8 = r1.get(r7)
            if (r8 == 0) goto L_0x019b
            java.lang.Object r8 = r1.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x019b
            r9 = 1
            goto L_0x0178
        L_0x019b:
            int r7 = r7 + 1
            goto L_0x0185
        L_0x019e:
            r5 = r9
        L_0x019f:
            if (r5 == 0) goto L_0x01be
            r13.mo174412j()
            com.tencent.mm.network.y r13 = com.tencent.p014mm.network.C114781l0.m161554a()
            java.lang.String r0 = ""
            r13.mo174496n(r0)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 148(0x94, double:7.3E-322)
            r6 = 125(0x7d, double:6.2E-322)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            java.lang.String r13 = "ax disaster disasterOccur "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r13)
        L_0x01be:
            return
        L_0x01bf:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)
            r1[r4] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114765a0.m161489a(java.lang.String):void");
    }
}
