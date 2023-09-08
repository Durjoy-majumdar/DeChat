package p664qp;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: qp.a */
public class C101231a extends IStaticListener<CheckResUpdateCacheFileEvent> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0178 A[SYNTHETIC, Splitter:B:64:0x0178] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0189 A[Catch:{ IOException -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019f A[SYNTHETIC, Splitter:B:76:0x019f] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b0 A[Catch:{ IOException -> 0x01bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r15) {
        /*
            r14 = this;
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r15 = (com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent) r15
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r15.f78743d
            int r1 = r0.f78744a
            r2 = 47
            r3 = 0
            if (r1 != r2) goto L_0x01c3
            int r0 = r0.f78745b
            r1 = 1
            if (r0 != r1) goto L_0x01c3
            java.lang.String r0 = "MicroMsg.CheckRegionCodeListener"
            java.lang.String r2 = "going to update region code."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r15 = r15.f78743d
            java.lang.String r15 = r15.f78746c
            java.lang.String r0 = ""
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r15)
            boolean r4 = r2.mo119967g()
            java.lang.String r5 = "MicroMsg.SubCorePacakge"
            if (r4 != 0) goto L_0x0041
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update regioncode failed, file not exist, packagePath:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r15)
            goto L_0x01c3
        L_0x0041:
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            r4 = 0
            java.io.InputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106422D(r2)     // Catch:{ Exception -> 0x0170 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.lang.String r8 = "utf-8"
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
        L_0x0058:
            java.lang.String r9 = r8.readLine()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r9 == 0) goto L_0x00ed
            java.lang.String r10 = r9.trim()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.lang.String r11 = "\\|"
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            int r11 = r10.length     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r12 = 2
            if (r11 < r12) goto L_0x00d7
            r11 = r10[r3]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r11 != 0) goto L_0x00d7
            r11 = r10[r1]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r11 == 0) goto L_0x007d
            goto L_0x00d7
        L_0x007d:
            r9 = r10[r3]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.lang.Object r9 = r15.get(r9)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.io.BufferedWriter r9 = (java.io.BufferedWriter) r9     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r9 != 0) goto L_0x00b6
            com.tencent.mm.storage.RegionCodeDecoder r4 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r9 = r10[r3]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.lang.String r4 = r4.mo135568c(r9)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r9 == 0) goto L_0x0098
            goto L_0x0058
        L_0x0098:
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r9.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            boolean r11 = r9.mo119967g()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r11 != 0) goto L_0x00a6
            r9.mo119964e()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
        L_0x00a6:
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            com.tencent.mm.vfs.u1 r13 = new com.tencent.mm.vfs.u1     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r13.<init>((com.tencent.p014mm.vfs.C86009m1) r9)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r11.<init>(r13)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r9 = r10[r3]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r15.put(r9, r11)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r9 = r11
        L_0x00b6:
            java.lang.StringBuffer r11 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r11.<init>()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r13 = r10[r1]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r11.append(r13)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r13 = 124(0x7c, float:1.74E-43)
            r11.append(r13)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r10 = r10[r12]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r11.append(r10)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r10 = 10
            r11.append(r10)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r9.write(r10)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            goto L_0x0058
        L_0x00d7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r10.<init>()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.lang.String r11 = "dispatch regioncode, error line = "
            r10.append(r11)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r10.append(r9)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            goto L_0x0058
        L_0x00ed:
            java.util.Collection r1 = r15.values()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
        L_0x00f5:
            boolean r9 = r1.hasNext()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r9 == 0) goto L_0x0107
            java.lang.Object r9 = r1.next()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            java.io.BufferedWriter r9 = (java.io.BufferedWriter) r9     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r9 == 0) goto L_0x00f5
            r9.flush()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            goto L_0x00f5
        L_0x0107:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r1 != 0) goto L_0x013a
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r1.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            com.tencent.mm.vfs.m1 r1 = r1.mo119974l()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            uc0.e0 r4 = new uc0.e0     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r4.<init>()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            com.tencent.mm.vfs.m1[] r1 = r1.mo119985v(r4)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            int r4 = r1.length     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r9 = 0
        L_0x0121:
            if (r9 >= r4) goto L_0x0133
            r10 = r1[r9]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            com.tencent.mm.storage.RegionCodeDecoder r11 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            com.tencent.mm.vfs.m1 r12 = r10.mo119974l()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r11.mo135569d(r10, r12)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            int r9 = r9 + 1
            goto L_0x0121
        L_0x0133:
            com.tencent.mm.storage.RegionCodeDecoder r1 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r1.mo135566a()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
        L_0x013a:
            r8.close()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r7.close()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            r2.mo119966f()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            if (r6 == 0) goto L_0x0148
            r6.close()     // Catch:{ IOException -> 0x0162 }
        L_0x0148:
            java.util.Collection r15 = r15.values()     // Catch:{ IOException -> 0x0162 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ IOException -> 0x0162 }
        L_0x0150:
            boolean r1 = r15.hasNext()     // Catch:{ IOException -> 0x0162 }
            if (r1 == 0) goto L_0x01c3
            java.lang.Object r1 = r15.next()     // Catch:{ IOException -> 0x0162 }
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1     // Catch:{ IOException -> 0x0162 }
            if (r1 == 0) goto L_0x0150
            r1.close()     // Catch:{ IOException -> 0x0162 }
            goto L_0x0150
        L_0x0162:
            r15 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r15, r0, r1)
            goto L_0x01c3
        L_0x0169:
            r1 = move-exception
            goto L_0x019d
        L_0x016b:
            r1 = move-exception
            r4 = r6
            goto L_0x0171
        L_0x016e:
            r1 = move-exception
            goto L_0x019c
        L_0x0170:
            r1 = move-exception
        L_0x0171:
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x016e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r0, r2)     // Catch:{ all -> 0x016e }
            if (r4 == 0) goto L_0x017b
            r4.close()     // Catch:{ IOException -> 0x0195 }
        L_0x017b:
            java.util.Collection r15 = r15.values()     // Catch:{ IOException -> 0x0195 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ IOException -> 0x0195 }
        L_0x0183:
            boolean r1 = r15.hasNext()     // Catch:{ IOException -> 0x0195 }
            if (r1 == 0) goto L_0x01c3
            java.lang.Object r1 = r15.next()     // Catch:{ IOException -> 0x0195 }
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1     // Catch:{ IOException -> 0x0195 }
            if (r1 == 0) goto L_0x0183
            r1.close()     // Catch:{ IOException -> 0x0195 }
            goto L_0x0183
        L_0x0195:
            r15 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r15, r0, r1)
            goto L_0x01c3
        L_0x019c:
            r6 = r4
        L_0x019d:
            if (r6 == 0) goto L_0x01a2
            r6.close()     // Catch:{ IOException -> 0x01bc }
        L_0x01a2:
            java.util.Collection r15 = r15.values()     // Catch:{ IOException -> 0x01bc }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ IOException -> 0x01bc }
        L_0x01aa:
            boolean r2 = r15.hasNext()     // Catch:{ IOException -> 0x01bc }
            if (r2 == 0) goto L_0x01c2
            java.lang.Object r2 = r15.next()     // Catch:{ IOException -> 0x01bc }
            java.io.BufferedWriter r2 = (java.io.BufferedWriter) r2     // Catch:{ IOException -> 0x01bc }
            if (r2 == 0) goto L_0x01aa
            r2.close()     // Catch:{ IOException -> 0x01bc }
            goto L_0x01aa
        L_0x01bc:
            r15 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r15, r0, r2)
        L_0x01c2:
            throw r1
        L_0x01c3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p664qp.C101231a.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
