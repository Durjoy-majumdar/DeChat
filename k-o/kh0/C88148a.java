package kh0;

import kh0.C88149b;

/* renamed from: kh0.a */
public class C88148a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f254924d;

    /* renamed from: e */
    public final /* synthetic */ String f254925e;

    public C88148a(C88149b.C88150a aVar, String str, String str2) {
        this.f254924d = str;
        this.f254925e = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109 A[SYNTHETIC, Splitter:B:56:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0114 A[Catch:{ IOException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015f A[SYNTHETIC, Splitter:B:72:0x015f] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016a A[Catch:{ IOException -> 0x0166 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r2 = r14.f254924d
            java.lang.String r3 = r14.f254925e
            java.lang.String r4 = "unzip file error"
            java.lang.String r5 = "MicroMsg.ZipTools"
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            r6 = 0
            r7 = 1
            r8 = 0
            java.util.zip.ZipInputStream r9 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00f5, all -> 0x00f2 }
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00f5, all -> 0x00f2 }
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106423E(r3)     // Catch:{ IOException -> 0x00f5, all -> 0x00f2 }
            r10.<init>(r3)     // Catch:{ IOException -> 0x00f5, all -> 0x00f2 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x00f5, all -> 0x00f2 }
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x00ee, all -> 0x00e9 }
            r10 = r6
        L_0x0026:
            java.util.zip.ZipEntry r11 = r9.getNextEntry()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r11 == 0) goto L_0x00cd
            java.lang.String r12 = r11.getName()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.lang.String r13 = "../"
            boolean r13 = r12.contains(r13)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r13 != 0) goto L_0x0026
            java.lang.String r13 = "..\\"
            boolean r13 = r12.contains(r13)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r13 == 0) goto L_0x0041
            goto L_0x0026
        L_0x0041:
            kh0.C10076d.m9921a(r12, r2)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            boolean r11 = r11.isDirectory()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r11 == 0) goto L_0x0092
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.<init>()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.append(r2)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.append(r12)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.lang.String r12 = r11.getPath()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r12 == 0) goto L_0x007d
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r8, r8)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.lang.String r13 = r11.getPath()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            boolean r13 = r13.equals(r12)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r13 != 0) goto L_0x007d
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            android.net.Uri$Builder r11 = r11.path(r12)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            android.net.Uri r11 = r11.build()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
        L_0x007d:
            com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            com.tencent.mm.vfs.f0$h r11 = r12.mo177799l(r11, r6)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            boolean r12 = r11.mo177810a()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r12 != 0) goto L_0x008a
            goto L_0x0026
        L_0x008a:
            com.tencent.mm.vfs.FileSystem$c r12 = r11.f348991a     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.lang.String r11 = r11.f348992b     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r12.mo119937g(r11)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            goto L_0x0026
        L_0x0092:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.<init>()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.append(r2)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.append(r12)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106444e(r11)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            if (r11 == 0) goto L_0x0026
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.<init>()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.append(r2)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r11.append(r12)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            java.io.OutputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106429K(r11, r8)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
        L_0x00ba:
            int r11 = r9.read(r3)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r12 = -1
            if (r11 == r12) goto L_0x00c5
            r10.write(r3, r8, r11)     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            goto L_0x00ba
        L_0x00c5:
            r10.flush()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            r10.close()     // Catch:{ IOException -> 0x00e6, all -> 0x00e3 }
            goto L_0x0026
        L_0x00cd:
            r9.closeEntry()     // Catch:{ IOException -> 0x00d9 }
            r9.close()     // Catch:{ IOException -> 0x00d9 }
            if (r10 == 0) goto L_0x00e1
            r10.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00e1
        L_0x00d9:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r6 = p213oh.C11412b.f33577a
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r4, r3)
        L_0x00e1:
            r2 = 1
            goto L_0x011e
        L_0x00e3:
            r0 = move-exception
            r6 = r10
            goto L_0x00ea
        L_0x00e6:
            r2 = move-exception
            r6 = r10
            goto L_0x00ef
        L_0x00e9:
            r0 = move-exception
        L_0x00ea:
            r3 = r6
            r6 = r9
            goto L_0x015d
        L_0x00ee:
            r2 = move-exception
        L_0x00ef:
            r3 = r6
            r6 = r9
            goto L_0x00f7
        L_0x00f2:
            r0 = move-exception
            r3 = r6
            goto L_0x015d
        L_0x00f5:
            r2 = move-exception
            r3 = r6
        L_0x00f7:
            java.lang.String r9 = "unzipfile error[%s]"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x015c }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x015c }
            r10[r8] = r11     // Catch:{ all -> 0x015c }
            int r11 = p213oh.C11412b.f33577a     // Catch:{ all -> 0x015c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r9, r10)     // Catch:{ all -> 0x015c }
            if (r6 == 0) goto L_0x0112
            r6.closeEntry()     // Catch:{ IOException -> 0x0110 }
            r6.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0112
        L_0x0110:
            r2 = move-exception
            goto L_0x0118
        L_0x0112:
            if (r3 == 0) goto L_0x011d
            r3.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x011d
        L_0x0118:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r4, r3)
        L_0x011d:
            r2 = 0
        L_0x011e:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r3[r8] = r4
            java.lang.String r4 = r14.f254924d
            r3[r7] = r4
            r4 = 2
            java.lang.String r5 = r14.f254925e
            r3[r4] = r5
            r4 = 3
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = "MicroMsg.AiDownloadLogic"
            java.lang.String r1 = "up zip [%b] unZipDir[%s] savePath[%s] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            r0 = 1559(0x617, float:2.185E-42)
            if (r2 == 0) goto L_0x014f
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 8
            r1.mo175911u(r0, r2)
            goto L_0x0156
        L_0x014f:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 9
            r1.mo175911u(r0, r2)
        L_0x0156:
            java.lang.String r0 = r14.f254925e
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            return
        L_0x015c:
            r0 = move-exception
        L_0x015d:
            if (r6 == 0) goto L_0x0168
            r6.closeEntry()     // Catch:{ IOException -> 0x0166 }
            r6.close()     // Catch:{ IOException -> 0x0166 }
            goto L_0x0168
        L_0x0166:
            r1 = move-exception
            goto L_0x016e
        L_0x0168:
            if (r3 == 0) goto L_0x0175
            r3.close()     // Catch:{ IOException -> 0x0166 }
            goto L_0x0175
        L_0x016e:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            int r3 = p213oh.C11412b.f33577a
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r4, r2)
        L_0x0175:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kh0.C88148a.run():void");
    }
}
