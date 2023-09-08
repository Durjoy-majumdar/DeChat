package b12;

import lu3.C76725h;

/* renamed from: b12.a */
public class C79643a extends C76725h {

    /* renamed from: d */
    public String f233526d;

    /* renamed from: e */
    public String f233527e;

    /* renamed from: f */
    public String f233528f;

    /* renamed from: g */
    public boolean f233529g = true;

    public C79643a(String str, String str2, String str3, boolean z) {
        this.f233526d = str;
        this.f233527e = str2;
        this.f233528f = str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c8 A[SYNTHETIC, Splitter:B:108:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d0 A[Catch:{ Exception -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d5 A[Catch:{ Exception -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo93950c() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "exception:%s"
            java.lang.String r3 = "[cpan] get image data failed.:%s"
            java.lang.String r4 = "Tinker.TinkerDownloadTask"
            r5 = 0
            r6 = 0
            r7 = 1
            java.lang.String r0 = r1.f233526d     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            com.tencent.mm.network.b0 r8 = com.tencent.p014mm.network.C81035d.m98963d(r0, r5)     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            java.lang.String r0 = "GET"
            r8.mo112930l(r0)     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            r0 = 15000(0x3a98, float:2.102E-41)
            r8.mo112919d(r0)     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r8.mo112923g(r0)     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            int r0 = com.tencent.p014mm.network.C81035d.m98960a(r8)     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "checkHttpConnection failed! url:%s"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            java.lang.String r10 = r1.f233526d     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            r9[r6] = r10     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r9)     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            return
        L_0x0032:
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ InterruptedException -> 0x00ec, UnknownHostException -> 0x00e6, SSLHandshakeException -> 0x00e0, SocketException -> 0x00da, SocketTimeoutException -> 0x00d4, IOException -> 0x00cf, Exception -> 0x00ca }
            if (r9 != 0) goto L_0x0044
            java.lang.String r0 = "getInputStream failed. url:%s"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
            java.lang.String r11 = r1.f233526d     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
            r10[r6] = r11     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r10)     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
            return
        L_0x0044:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
            java.lang.String r10 = r1.f233527e     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
            java.io.OutputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106429K(r10, r6)     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
        L_0x004e:
            int r11 = r9.read(r0)     // Catch:{ InterruptedException -> 0x00b2, UnknownHostException -> 0x00af, SSLHandshakeException -> 0x00ad, SocketException -> 0x00ab, SocketTimeoutException -> 0x00a9, IOException -> 0x00a7, Exception -> 0x00a5 }
            r12 = -1
            if (r11 == r12) goto L_0x0059
            r10.write(r0, r6, r11)     // Catch:{ InterruptedException -> 0x00b2, UnknownHostException -> 0x00af, SSLHandshakeException -> 0x00ad, SocketException -> 0x00ab, SocketTimeoutException -> 0x00a9, IOException -> 0x00a7, Exception -> 0x00a5 }
            goto L_0x004e
        L_0x0059:
            r1.f233529g = r6     // Catch:{ InterruptedException -> 0x00b2, UnknownHostException -> 0x00af, SSLHandshakeException -> 0x00ad, SocketException -> 0x00ab, SocketTimeoutException -> 0x00a9, IOException -> 0x00a7, Exception -> 0x00a5 }
            r10.close()     // Catch:{ InterruptedException -> 0x00b2, UnknownHostException -> 0x00af, SSLHandshakeException -> 0x00ad, SocketException -> 0x00ab, SocketTimeoutException -> 0x00a9, IOException -> 0x00a7, Exception -> 0x00a5 }
            r8.disconnect()     // Catch:{ InterruptedException -> 0x00c7, UnknownHostException -> 0x00c4, SSLHandshakeException -> 0x00c1, SocketException -> 0x00be, SocketTimeoutException -> 0x00bb, IOException -> 0x00b8, Exception -> 0x00b5 }
            r9.close()     // Catch:{ InterruptedException -> 0x00a1, UnknownHostException -> 0x009d, SSLHandshakeException -> 0x0099, SocketException -> 0x0095, SocketTimeoutException -> 0x0091, IOException -> 0x008d, Exception -> 0x0089 }
            java.lang.String r0 = r1.f233527e     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            java.lang.String r8 = r1.f233528f     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "hp_apply md5 mismatched, ignored"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            r9 = 614(0x266, double:3.034E-321)
            r11 = 30
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
            r1.f233529g = r7     // Catch:{ InterruptedException -> 0x01a9, UnknownHostException -> 0x018b, SSLHandshakeException -> 0x016d, SocketException -> 0x014f, SocketTimeoutException -> 0x0130, IOException -> 0x0111, Exception -> 0x00f2 }
        L_0x0085:
            r9 = r5
            r10 = r9
            goto L_0x01c6
        L_0x0089:
            r0 = move-exception
            r10 = r5
            goto L_0x00f5
        L_0x008d:
            r0 = move-exception
            r10 = r5
            goto L_0x0114
        L_0x0091:
            r0 = move-exception
            r10 = r5
            goto L_0x0133
        L_0x0095:
            r0 = move-exception
            r10 = r5
            goto L_0x0152
        L_0x0099:
            r0 = move-exception
            r10 = r5
            goto L_0x0170
        L_0x009d:
            r0 = move-exception
            r10 = r5
            goto L_0x018e
        L_0x00a1:
            r0 = move-exception
            r10 = r5
            goto L_0x01ac
        L_0x00a5:
            r0 = move-exception
            goto L_0x00cd
        L_0x00a7:
            r0 = move-exception
            goto L_0x00d2
        L_0x00a9:
            r0 = move-exception
            goto L_0x00d7
        L_0x00ab:
            r0 = move-exception
            goto L_0x00dd
        L_0x00ad:
            r0 = move-exception
            goto L_0x00e3
        L_0x00af:
            r0 = move-exception
            goto L_0x00e9
        L_0x00b2:
            r0 = move-exception
            goto L_0x00ef
        L_0x00b5:
            r0 = move-exception
            r10 = r5
            goto L_0x00cd
        L_0x00b8:
            r0 = move-exception
            r10 = r5
            goto L_0x00d2
        L_0x00bb:
            r0 = move-exception
            r10 = r5
            goto L_0x00d7
        L_0x00be:
            r0 = move-exception
            r10 = r5
            goto L_0x00dd
        L_0x00c1:
            r0 = move-exception
            r10 = r5
            goto L_0x00e3
        L_0x00c4:
            r0 = move-exception
            r10 = r5
            goto L_0x00e9
        L_0x00c7:
            r0 = move-exception
            r10 = r5
            goto L_0x00ef
        L_0x00ca:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00cd:
            r5 = r8
            goto L_0x00f5
        L_0x00cf:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00d2:
            r5 = r8
            goto L_0x0114
        L_0x00d4:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00d7:
            r5 = r8
            goto L_0x0133
        L_0x00da:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00dd:
            r5 = r8
            goto L_0x0152
        L_0x00e0:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00e3:
            r5 = r8
            goto L_0x0170
        L_0x00e6:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00e9:
            r5 = r8
            goto L_0x018e
        L_0x00ec:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00ef:
            r5 = r8
            goto L_0x01ac
        L_0x00f2:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x00f5:
            r1.f233529g = r7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 614(0x266, double:3.034E-321)
            r14 = 38
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r3[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r3)
            goto L_0x01c6
        L_0x0111:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x0114:
            r1.f233529g = r7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 614(0x266, double:3.034E-321)
            r14 = 37
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r8)
            goto L_0x01c6
        L_0x0130:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x0133:
            r1.f233529g = r7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 614(0x266, double:3.034E-321)
            r14 = 36
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r8)
            goto L_0x01c6
        L_0x014f:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x0152:
            r1.f233529g = r7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 614(0x266, double:3.034E-321)
            r14 = 35
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r8)
            goto L_0x01c6
        L_0x016d:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x0170:
            r1.f233529g = r7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 614(0x266, double:3.034E-321)
            r14 = 34
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r8)
            goto L_0x01c6
        L_0x018b:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x018e:
            r1.f233529g = r7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 614(0x266, double:3.034E-321)
            r14 = 33
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r8)
            goto L_0x01c6
        L_0x01a9:
            r0 = move-exception
            r9 = r5
            r10 = r9
        L_0x01ac:
            r1.f233529g = r7
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 614(0x266, double:3.034E-321)
            r14 = 32
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r8)
        L_0x01c6:
            if (r5 == 0) goto L_0x01ce
            r5.disconnect()     // Catch:{ Exception -> 0x01cc }
            goto L_0x01ce
        L_0x01cc:
            r0 = move-exception
            goto L_0x01d9
        L_0x01ce:
            if (r9 == 0) goto L_0x01d3
            r9.close()     // Catch:{ Exception -> 0x01cc }
        L_0x01d3:
            if (r10 == 0) goto L_0x01f1
            r10.close()     // Catch:{ Exception -> 0x01cc }
            goto L_0x01f1
        L_0x01d9:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r3[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r3)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r2[r6] = r0
            java.lang.String r0 = "close conn failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b12.C79643a.mo93950c():void");
    }
}
