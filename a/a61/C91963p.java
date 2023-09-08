package a61;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: a61.p */
public class C91963p extends IStaticListener<CheckResUpdateCacheFileEvent> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v70, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v71, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v72, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v74, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v75, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v76, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v77, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v78, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v79, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v83, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r8v51, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f4, code lost:
        r22 = r12;
        r12 = r10;
        r10 = r22;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
        r10 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:26:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r24) {
        /*
            r23 = this;
            r1 = r24
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r1 = (com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent) r1
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            java.lang.Class<fp.e> r2 = p523fp.C32147e.class
            boolean r3 = r1 instanceof com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent
            r4 = 0
            if (r3 == 0) goto L_0x0a7f
            boolean r3 = f40.C86709a0.m107522a()
            if (r3 != 0) goto L_0x0015
            goto L_0x0a7f
        L_0x0015:
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r3 = r1.f78743d
            int r5 = r3.f78744a
            r6 = 33
            java.lang.String r7 = "config.conf"
            java.lang.String r8 = "temp"
            r9 = 2
            r10 = 0
            r11 = 1
            if (r5 != r6) goto L_0x0213
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = r3.f78746c
            r1.<init>((java.lang.String) r0)
            boolean r0 = r1.mo119967g()
            java.lang.String r2 = "MicroMsg.emoji.EmojiResUpdateListener"
            if (r0 == 0) goto L_0x020c
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.mm.vfs.m1 r3 = r1.mo119969h()
            r0[r4] = r3
            java.lang.String r3 = "checkResUpdateListener callback to update %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = zb0.C53767d.m60278b()
            r3.<init>((java.lang.String) r0, (java.lang.String) r8)
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = "emoji_template.zip"
            r5.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r6)
            r3.mo119987x()
            java.lang.String r0 = r1.mo119971i()
            java.lang.String r8 = r5.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r8)
            java.lang.String r0 = r5.mo119971i()
            java.lang.String r8 = r3.mo119971i()
            int r0 = com.tencent.p014mm.vfs.C86013q1.m106436R(r0, r8)
            if (r0 < 0) goto L_0x0136
            android.net.Uri r0 = r3.f250486d     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            if (r0 != 0) goto L_0x007b
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r0.<init>()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            android.net.Uri$Builder r0 = r0.path(r7)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            goto L_0x0082
        L_0x007b:
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r0.appendPath(r7)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
        L_0x0082:
            android.net.Uri r7 = r0.build()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r8 = r7.getPath()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            if (r8 == 0) goto L_0x00a2
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r4, r4)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r12 = r7.getPath()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            boolean r12 = r12.equals(r8)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            if (r12 != 0) goto L_0x00a2
            android.net.Uri$Builder r0 = r0.path(r8)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            android.net.Uri r7 = r0.build()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
        L_0x00a2:
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            com.tencent.mm.vfs.f0$h r0 = r0.mo177799l(r7, r10)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.io.InputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106421C(r7, r0)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x010a, all -> 0x0106 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x010a, all -> 0x0106 }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0104, all -> 0x0100 }
            r12.<init>(r8)     // Catch:{ Exception -> 0x0104, all -> 0x0100 }
            java.lang.String r0 = ""
        L_0x00b8:
            java.lang.String r10 = r12.readLine()     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            if (r10 == 0) goto L_0x00ce
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r13.<init>()     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r13.append(r0)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r13.append(r10)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            goto L_0x00b8
        L_0x00ce:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r10.<init>(r0)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            java.lang.String r13 = "version"
            int r10 = r10.getInt(r13)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            java.lang.String r13 = "config file content:%s version:%d"
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00f3, all -> 0x00fa }
            r14[r4] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x00fa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00f3, all -> 0x00fa }
            r14[r11] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x00fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r13, r14)     // Catch:{ Exception -> 0x00f3, all -> 0x00fa }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            goto L_0x0137
        L_0x00f3:
            r0 = move-exception
            r22 = r12
            r12 = r10
            r10 = r22
            goto L_0x0115
        L_0x00fa:
            r0 = move-exception
            r10 = r12
            goto L_0x0101
        L_0x00fd:
            r0 = move-exception
            r10 = r12
            goto L_0x0114
        L_0x0100:
            r0 = move-exception
        L_0x0101:
            r1 = r10
            r10 = r8
            goto L_0x0108
        L_0x0104:
            r0 = move-exception
            goto L_0x0114
        L_0x0106:
            r0 = move-exception
            r1 = r10
        L_0x0108:
            r8 = r10
            goto L_0x012b
        L_0x010a:
            r0 = move-exception
            r8 = r10
            goto L_0x0114
        L_0x010d:
            r0 = move-exception
            r1 = r10
            r8 = r1
            goto L_0x012c
        L_0x0111:
            r0 = move-exception
            r7 = r10
            r8 = r7
        L_0x0114:
            r12 = 1
        L_0x0115:
            java.lang.String r13 = r0.getMessage()     // Catch:{ all -> 0x0129 }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r13, r14)     // Catch:{ all -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            r10 = r12
            goto L_0x0137
        L_0x0129:
            r0 = move-exception
            r1 = r10
        L_0x012b:
            r10 = r7
        L_0x012c:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            throw r0
        L_0x0136:
            r10 = 1
        L_0x0137:
            java.lang.String r0 = r3.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)
            java.lang.String r0 = r5.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            int r0 = zb0.C53767d.f150915a
            if (r0 >= r10) goto L_0x01f6
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3[r11] = r0
            java.lang.String r0 = "res update template currentVersion:%d resVersion:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r3)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = zb0.C53767d.m60278b()
            r2.<init>((java.lang.String) r0)
            java.lang.String r0 = r2.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)
            r2.mo119987x()
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = ".nomedia"
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r3)
            boolean r3 = r0.mo119967g()
            java.lang.String r5 = "MicroMsg.emoji.EmojiStoreExportLogic"
            if (r3 != 0) goto L_0x018c
            r0.mo119964e()     // Catch:{ IOException -> 0x0183 }
            goto L_0x018c
        L_0x0183:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r7 = "create nomedia file error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r3, r7, r0)
        L_0x018c:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r6)
            java.lang.String r1 = r1.mo119976n()
            java.lang.String r2 = r0.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r2)
            java.lang.String r1 = r0.mo119976n()
            java.lang.String r2 = r0.mo119973k()
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.UnZipFolder(r1, r2)
            if (r1 >= 0) goto L_0x01d9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unzip fail, ret = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", zipFilePath = "
            r2.append(r1)
            java.lang.String r1 = r0.mo119971i()
            r2.append(r1)
            java.lang.String r1 = ", unzipPath = "
            r2.append(r1)
            java.lang.String r0 = r0.mo119973k()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0a7f
        L_0x01d9:
            int r1 = zb0.C53767d.m60277a()
            zb0.C53767d.f150915a = r1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r0 = r0.mo119973k()
            r1[r4] = r0
            int r0 = zb0.C53767d.f150915a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r11] = r0
            java.lang.String r0 = "Unzip Path%s version=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            goto L_0x0a7f
        L_0x01f6:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r11] = r0
            java.lang.String r0 = "res no need update template currentVersion:%d resVersion:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
            goto L_0x0a7f
        L_0x020c:
            java.lang.String r0 = "checkResUpdateListener file not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x0a7f
        L_0x0213:
            r6 = 37
            if (r5 != r6) goto L_0x0a7f
            int r3 = r3.f78745b
            if (r3 != r11) goto L_0x0224
            i61.i r0 = i61.C98603i.m128193d()
            r0.mo138046g(r1, r4)
            goto L_0x0a7f
        L_0x0224:
            java.lang.String r5 = "/"
            java.lang.String r6 = "MicroMsg.emoji.EmojiResUpdateMgr"
            if (r3 != r9) goto L_0x04f9
            i61.i r3 = i61.C98603i.m128193d()
            i61.i$a r12 = i61.C98603i.C98604a.PANEL
            kl.g r13 = r3.mo138044e(r12)
            int r14 = r3.mo138043b(r12)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r15 = r1.f78743d
            java.lang.String r15 = r15.f78746c
            boolean r15 = r3.mo138042a(r15, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = i61.C98603i.m128192c()
            r9.append(r11)
            r9.append(r5)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            if (r9 != 0) goto L_0x025a
            r9 = r10
            goto L_0x025e
        L_0x025a:
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
        L_0x025e:
            if (r9 != 0) goto L_0x026a
            android.net.Uri$Builder r9 = new android.net.Uri$Builder
            r9.<init>()
            android.net.Uri$Builder r9 = r9.path(r7)
            goto L_0x0271
        L_0x026a:
            android.net.Uri$Builder r9 = r9.buildUpon()
            r9.appendPath(r7)
        L_0x0271:
            android.net.Uri r11 = r9.build()
            java.lang.String r10 = r11.getPath()
            if (r10 == 0) goto L_0x0291
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r4, r4)
            java.lang.String r4 = r11.getPath()
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x0291
            android.net.Uri$Builder r4 = r9.path(r10)
            android.net.Uri r11 = r4.build()
        L_0x0291:
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163865u(r11)
            int r4 = p207nl.C100134k.m130830d(r4)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r9 = r13.f290706a
            r9.f265435g = r14
            r9.f265436h = r4
            r13.mo138519b(r15)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r4 = r13.f290706a
            r9 = 0
            r4.f265434f = r9
            r4.mo86054n()
            if (r15 == 0) goto L_0x04f1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = i61.C98603i.m128192c()
            r4.append(r9)
            r4.append(r5)
            java.lang.String r9 = "panel"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = i61.C98603i.m128192c()
            r4.append(r10)
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = i61.C98603i.m128192c()
            r8.append(r10)
            r8.append(r5)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.vfs.C86013q1.m106462w(r4, r8)
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = i61.C98603i.m128192c()
            r4.<init>((java.lang.String) r8, (java.lang.String) r9)
            java.lang.Class<lc3.b> r8 = lc3.C10485b.class
            k40.a r8 = f40.C86709a0.m107533q(r8)
            lc3.b r8 = (lc3.C10485b) r8
            pj.f r8 = r8.vh0()
            java.lang.String r10 = "EmotionPanelConfigName"
            java.lang.String r8 = r8.mo107405c(r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r11 = "emojipanel-config.xml"
            if (r10 == 0) goto L_0x0321
            java.lang.String r8 = "no dynamic config panel file name. use default."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            goto L_0x0383
        L_0x0321:
            android.net.Uri r10 = r4.f250486d
            if (r10 != 0) goto L_0x032f
            android.net.Uri$Builder r10 = new android.net.Uri$Builder
            r10.<init>()
            android.net.Uri$Builder r10 = r10.path(r8)
            goto L_0x033c
        L_0x032f:
            android.net.Uri$Builder r10 = r10.buildUpon()
            boolean r13 = r8.isEmpty()
            if (r13 != 0) goto L_0x033c
            r10.appendPath(r8)
        L_0x033c:
            android.net.Uri r13 = r10.build()
            java.lang.String r14 = r13.getPath()
            if (r14 == 0) goto L_0x035d
            r15 = 0
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r15, r15)
            java.lang.String r15 = r13.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x035d
            android.net.Uri$Builder r10 = r10.path(r14)
            android.net.Uri r13 = r10.build()
        L_0x035d:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r14 = 0
            com.tencent.mm.vfs.f0$h r10 = r10.mo177799l(r13, r14)
            boolean r13 = r10.mo177810a()
            if (r13 != 0) goto L_0x036c
            r10 = 0
            goto L_0x0374
        L_0x036c:
            com.tencent.mm.vfs.FileSystem$c r13 = r10.f348991a
            java.lang.String r10 = r10.f348992b
            boolean r10 = r13.mo119948x(r10)
        L_0x0374:
            if (r10 != 0) goto L_0x0377
            r8 = r11
        L_0x0377:
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r10 = 0
            r11[r10] = r8
            java.lang.String r10 = "dynamic config panel file name :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r11)
            r11 = r8
        L_0x0383:
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            r8.<init>((com.tencent.p014mm.vfs.C86009m1) r4, (java.lang.String) r11)
            boolean r4 = r8.mo119967g()
            if (r4 == 0) goto L_0x04e4
            java.util.ArrayList r4 = p207nl.C100134k.m130827a(r8)
            kl.g r3 = r3.mo138044e(r12)
            boolean r8 = r4.isEmpty()
            r10 = 1
            r8 = r8 ^ r10
            r3.mo138518a(r8)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r8 = r3.f290706a
            int r10 = r4.size()
            r8.f265434f = r10
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r3 = r3.f290706a
            r3.mo86054n()
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x04bf
            java.lang.Class<z51.g> r3 = z51.C39315g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            i61.h r3 = (i61.C98602h) r3
            r3.getClass()
            di3.d r0 = di3.C86312j.m106911c(r0)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            boolean[] r3 = r0.f82769a
            monitor-enter(r3)
            wh3.y r0 = r0.f82781m     // Catch:{ all -> 0x04bc }
            monitor-exit(r3)     // Catch:{ all -> 0x04bc }
            r0.getClass()
            java.lang.String r3 = "MicroMsg.emoji.SmileyPanelConfigInfoStorage"
            int r6 = r4.size()
            if (r6 > 0) goto L_0x03e7
            java.lang.String r0 = "insertSmileyConfigInfoList failed. list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x043b
        L_0x03e7:
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            int r6 = r4.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 0
            r8[r10] = r6
            java.lang.String r6 = "insertSmileyConfigInfoList: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r8)
            r12 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f100805d
            boolean r6 = r3 instanceof zh3.C91753f
            if (r6 == 0) goto L_0x0412
            zh3.f r3 = (zh3.C91753f) r3
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            long r12 = r6.getId()
            long r12 = r3.beginTransaction(r12)
            r14 = r3
            goto L_0x0413
        L_0x0412:
            r14 = 0
        L_0x0413:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f100805d
            java.lang.String r6 = "SmileyPanelConfigInfo"
            r8 = 0
            r3.delete(r6, r8, r8)
            java.util.Iterator r3 = r4.iterator()
        L_0x041f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x042f
            java.lang.Object r4 = r3.next()
            com.tencent.mm.storage.emotion.SmileyPanelConfigInfo r4 = (com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo) r4
            r0.insert(r4)
            goto L_0x041f
        L_0x042f:
            r0 = -1
            if (r14 == 0) goto L_0x0436
            int r0 = r14.endTransaction(r12)
        L_0x0436:
            if (r0 < 0) goto L_0x043b
            r16 = 1
            goto L_0x043d
        L_0x043b:
            r16 = 0
        L_0x043d:
            if (r16 == 0) goto L_0x04c5
            com.tencent.mm.autogen.events.EmojiConfigEvent r0 = new com.tencent.mm.autogen.events.EmojiConfigEvent
            r0.<init>()
            com.tencent.mm.autogen.events.EmojiConfigEvent$a r3 = r0.f264694d
            r4 = 2
            r3.f264695a = r4
            r0.publish()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = i61.C98603i.m128192c()
            r0.append(r3)
            r0.append(r5)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0466
            r10 = 0
            goto L_0x046a
        L_0x0466:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
        L_0x046a:
            if (r10 != 0) goto L_0x0476
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.path(r7)
            goto L_0x047d
        L_0x0476:
            android.net.Uri$Builder r0 = r10.buildUpon()
            r0.appendPath(r7)
        L_0x047d:
            android.net.Uri r3 = r0.build()
            java.lang.String r4 = r3.getPath()
            if (r4 == 0) goto L_0x049e
            r5 = 0
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r5, r5)
            java.lang.String r5 = r3.getPath()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x049e
            android.net.Uri$Builder r0 = r0.path(r4)
            android.net.Uri r3 = r0.build()
        L_0x049e:
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163865u(r3)
            int r0 = p207nl.C100134k.m130830d(r0)
            i61.C98603i.f289100d = r0
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_NEW_PANEL_INT
            int r4 = i61.C98603i.f289100d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.mo119677K(r3, r4)
            goto L_0x04c5
        L_0x04bc:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04bc }
            throw r0
        L_0x04bf:
            java.lang.String r0 = "parserEmojiPanelConfigFromFile smiley panel list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x04c5:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_NEW_PANEL_NAME_STRING
            r0.mo119677K(r3, r11)
            di3.d r0 = di3.C86312j.m106911c(r2)
            fp.e r0 = (p523fp.C32147e) r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r1.f78743d
            int r2 = r1.f78744a
            int r3 = r1.f78745b
            int r1 = r1.f78747d
            r0.Y40(r2, r3, r1)
            goto L_0x04ea
        L_0x04e4:
            java.lang.String r0 = "updateEmojiPanel config don't exist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x04ea:
            uk.g$a r0 = p1048uk.C102051g.f300534a
            r0.mo141553d()
            goto L_0x0a7f
        L_0x04f1:
            java.lang.String r0 = "updateEmojiPanel unzip file failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0a7f
        L_0x04f9:
            r4 = 3
            if (r3 != r4) goto L_0x07f7
            i61.i r3 = i61.C98603i.m128193d()
            i61.i$a r4 = i61.C98603i.C98604a.SUGGEST
            kl.g r9 = r3.mo138044e(r4)
            int r4 = r3.mo138043b(r4)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r10 = r1.f78743d
            java.lang.String r10 = r10.f78746c
            boolean r3 = r3.mo138042a(r10, r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = i61.C98603i.m128192c()
            r10.append(r11)
            r10.append(r5)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L_0x052c
            r14 = 0
            goto L_0x0530
        L_0x052c:
            android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
        L_0x0530:
            if (r14 != 0) goto L_0x053c
            android.net.Uri$Builder r10 = new android.net.Uri$Builder
            r10.<init>()
            android.net.Uri$Builder r10 = r10.path(r7)
            goto L_0x0543
        L_0x053c:
            android.net.Uri$Builder r10 = r14.buildUpon()
            r10.appendPath(r7)
        L_0x0543:
            android.net.Uri r11 = r10.build()
            java.lang.String r12 = r11.getPath()
            if (r12 == 0) goto L_0x0564
            r13 = 0
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r13, r13)
            java.lang.String r13 = r11.getPath()
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x0564
            android.net.Uri$Builder r10 = r10.path(r12)
            android.net.Uri r11 = r10.build()
        L_0x0564:
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163865u(r11)
            int r10 = p207nl.C100134k.m130830d(r10)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r11 = r9.f290706a
            r11.f265435g = r4
            r11.f265436h = r10
            r9.mo138519b(r3)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r4 = r9.f290706a
            r4.mo86054n()
            if (r3 == 0) goto L_0x07ef
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = i61.C98603i.m128192c()
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = "suggest"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = i61.C98603i.m128192c()
            r3.append(r10)
            r3.append(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = i61.C98603i.m128192c()
            r8.append(r10)
            r8.append(r5)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.vfs.C86013q1.m106462w(r3, r8)
            java.lang.String r3 = i61.C98603i.m128192c()
            if (r3 != 0) goto L_0x05cf
            r14 = 0
            goto L_0x05d3
        L_0x05cf:
            android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
        L_0x05d3:
            if (r14 != 0) goto L_0x05df
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            android.net.Uri$Builder r3 = r3.path(r4)
            goto L_0x05e6
        L_0x05df:
            android.net.Uri$Builder r3 = r14.buildUpon()
            r3.appendPath(r4)
        L_0x05e6:
            android.net.Uri r8 = r3.build()
            java.lang.String r10 = r8.getPath()
            if (r10 == 0) goto L_0x0607
            r11 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r11, r11)
            java.lang.String r11 = r8.getPath()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0607
            android.net.Uri$Builder r3 = r3.path(r10)
            android.net.Uri r8 = r3.build()
        L_0x0607:
            java.lang.String r3 = "emojisuggest-config.xml"
            if (r8 != 0) goto L_0x0615
            android.net.Uri$Builder r8 = new android.net.Uri$Builder
            r8.<init>()
            android.net.Uri$Builder r3 = r8.path(r3)
            goto L_0x061d
        L_0x0615:
            android.net.Uri$Builder r8 = r8.buildUpon()
            r8.appendPath(r3)
            r3 = r8
        L_0x061d:
            android.net.Uri r8 = r3.build()
            java.lang.String r10 = r8.getPath()
            if (r10 == 0) goto L_0x063e
            r11 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r11, r11)
            java.lang.String r11 = r8.getPath()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x063e
            android.net.Uri$Builder r3 = r3.path(r10)
            android.net.Uri r8 = r3.build()
        L_0x063e:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r10 = 0
            com.tencent.mm.vfs.f0$h r11 = r3.mo177799l(r8, r10)
            boolean r12 = r11.mo177810a()
            if (r12 != 0) goto L_0x064d
            r12 = 0
            goto L_0x0655
        L_0x064d:
            com.tencent.mm.vfs.FileSystem$c r12 = r11.f348991a
            java.lang.String r13 = r11.f348992b
            boolean r12 = r12.mo119948x(r13)
        L_0x0655:
            if (r12 == 0) goto L_0x07d2
            javax.xml.parsers.DocumentBuilderFactory r12 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r8, r11)     // Catch:{ Exception -> 0x07b5 }
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106421C(r8, r3)     // Catch:{ Exception -> 0x07b5 }
            javax.xml.parsers.DocumentBuilder r8 = r12.newDocumentBuilder()     // Catch:{ all -> 0x07a3 }
            org.w3c.dom.Document r8 = r8.parse(r3)     // Catch:{ all -> 0x07a3 }
            r8.normalize()     // Catch:{ all -> 0x07a3 }
            org.w3c.dom.Element r8 = r8.getDocumentElement()     // Catch:{ all -> 0x07a3 }
            java.lang.String r11 = "group"
            org.w3c.dom.NodeList r8 = r8.getElementsByTagName(r11)     // Catch:{ all -> 0x07a3 }
            if (r8 == 0) goto L_0x079b
            int r11 = r8.getLength()     // Catch:{ all -> 0x07a3 }
            if (r11 <= 0) goto L_0x079b
            int r11 = r8.getLength()     // Catch:{ all -> 0x07a3 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r12.<init>()     // Catch:{ all -> 0x07a3 }
            r13 = 0
        L_0x068a:
            if (r13 >= r11) goto L_0x0708
            org.w3c.dom.Node r14 = r8.item(r13)     // Catch:{ all -> 0x07a3 }
            org.w3c.dom.NodeList r14 = r14.getChildNodes()     // Catch:{ all -> 0x07a3 }
            if (r14 == 0) goto L_0x06f8
            int r15 = r14.getLength()     // Catch:{ all -> 0x07a3 }
            if (r15 <= 0) goto L_0x06f8
            int r15 = r14.getLength()     // Catch:{ all -> 0x07a3 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r10.<init>()     // Catch:{ all -> 0x07a3 }
            r24 = r8
            r8 = 0
        L_0x06a8:
            if (r8 >= r15) goto L_0x06f0
            org.w3c.dom.Node r18 = r14.item(r8)     // Catch:{ all -> 0x07a3 }
            r19 = r11
            java.lang.String r11 = r18.getNodeName()     // Catch:{ all -> 0x07a3 }
            r20 = r14
            java.lang.String r14 = "word"
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x07a3 }
            if (r11 == 0) goto L_0x06e1
            java.lang.String r11 = r18.getTextContent()     // Catch:{ all -> 0x07a3 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ all -> 0x07a3 }
            if (r14 != 0) goto L_0x06e1
            java.lang.String r14 = "word:%s"
            r21 = r1
            r18 = r15
            r15 = 1
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ all -> 0x0799 }
            r15 = 0
            r1[r15] = r11     // Catch:{ all -> 0x0799 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r14, r1)     // Catch:{ all -> 0x0799 }
            java.lang.String r1 = r11.trim()     // Catch:{ all -> 0x0799 }
            r10.add(r1)     // Catch:{ all -> 0x0799 }
            goto L_0x06e5
        L_0x06e1:
            r21 = r1
            r18 = r15
        L_0x06e5:
            int r8 = r8 + 1
            r15 = r18
            r11 = r19
            r14 = r20
            r1 = r21
            goto L_0x06a8
        L_0x06f0:
            r21 = r1
            r19 = r11
            r12.add(r10)     // Catch:{ all -> 0x0799 }
            goto L_0x06fe
        L_0x06f8:
            r21 = r1
            r24 = r8
            r19 = r11
        L_0x06fe:
            int r13 = r13 + 1
            r8 = r24
            r11 = r19
            r1 = r21
            r10 = 0
            goto L_0x068a
        L_0x0708:
            r21 = r1
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0799 }
            aq.g r0 = (p441aq.C92054g) r0     // Catch:{ all -> 0x0799 }
            r0.getClass()     // Catch:{ all -> 0x0799 }
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ all -> 0x0799 }
            boolean[] r1 = r0.f82769a     // Catch:{ all -> 0x0799 }
            monitor-enter(r1)     // Catch:{ all -> 0x0799 }
            wh3.k r0 = r0.f82782n     // Catch:{ all -> 0x0796 }
            monitor-exit(r1)     // Catch:{ all -> 0x0796 }
            r0.mo61535jo(r12)     // Catch:{ all -> 0x0799 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0799 }
            r0.<init>()     // Catch:{ all -> 0x0799 }
            java.lang.String r1 = i61.C98603i.m128192c()     // Catch:{ all -> 0x0799 }
            r0.append(r1)     // Catch:{ all -> 0x0799 }
            r0.append(r5)     // Catch:{ all -> 0x0799 }
            r0.append(r4)     // Catch:{ all -> 0x0799 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0799 }
            if (r0 != 0) goto L_0x073a
            r10 = 0
            goto L_0x073e
        L_0x073a:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ all -> 0x0799 }
        L_0x073e:
            if (r10 != 0) goto L_0x074a
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ all -> 0x0799 }
            r0.<init>()     // Catch:{ all -> 0x0799 }
            android.net.Uri$Builder r0 = r0.path(r7)     // Catch:{ all -> 0x0799 }
            goto L_0x0751
        L_0x074a:
            android.net.Uri$Builder r0 = r10.buildUpon()     // Catch:{ all -> 0x0799 }
            r0.appendPath(r7)     // Catch:{ all -> 0x0799 }
        L_0x0751:
            android.net.Uri r1 = r0.build()     // Catch:{ all -> 0x0799 }
            java.lang.String r4 = r1.getPath()     // Catch:{ all -> 0x0799 }
            if (r4 == 0) goto L_0x0772
            r5 = 0
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r5, r5)     // Catch:{ all -> 0x0799 }
            java.lang.String r5 = r1.getPath()     // Catch:{ all -> 0x0799 }
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x0799 }
            if (r5 != 0) goto L_0x0772
            android.net.Uri$Builder r0 = r0.path(r4)     // Catch:{ all -> 0x0799 }
            android.net.Uri r1 = r0.build()     // Catch:{ all -> 0x0799 }
        L_0x0772:
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163865u(r1)     // Catch:{ all -> 0x0799 }
            int r0 = p207nl.C100134k.m130830d(r0)     // Catch:{ all -> 0x0799 }
            i61.C98603i.f289101e = r0     // Catch:{ all -> 0x0799 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0799 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x0799 }
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_NEW_SUGGEST_INT     // Catch:{ all -> 0x0799 }
            int r4 = i61.C98603i.f289101e     // Catch:{ all -> 0x0799 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0799 }
            r0.mo119677K(r1, r4)     // Catch:{ all -> 0x0799 }
            if (r3 == 0) goto L_0x0794
            r3.close()     // Catch:{ Exception -> 0x07b3 }
        L_0x0794:
            r11 = 1
            goto L_0x07c9
        L_0x0796:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0796 }
            throw r0     // Catch:{ all -> 0x0799 }
        L_0x0799:
            r0 = move-exception
            goto L_0x07a6
        L_0x079b:
            r21 = r1
            if (r3 == 0) goto L_0x07c8
            r3.close()     // Catch:{ Exception -> 0x07b3 }
            goto L_0x07c8
        L_0x07a3:
            r0 = move-exception
            r21 = r1
        L_0x07a6:
            r1 = r0
            if (r3 == 0) goto L_0x07b2
            r3.close()     // Catch:{ all -> 0x07ad }
            goto L_0x07b2
        L_0x07ad:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch:{ Exception -> 0x07b3 }
        L_0x07b2:
            throw r1     // Catch:{ Exception -> 0x07b3 }
        L_0x07b3:
            r0 = move-exception
            goto L_0x07b8
        L_0x07b5:
            r0 = move-exception
            r21 = r1
        L_0x07b8:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.toString()
            r3 = 0
            r1[r3] = r0
            java.lang.String r0 = "parserEmojiDescConfig parseXML exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r1)
        L_0x07c8:
            r11 = 0
        L_0x07c9:
            r9.mo138518a(r11)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r0 = r9.f290706a
            r0.mo86054n()
            goto L_0x07da
        L_0x07d2:
            r21 = r1
            java.lang.String r0 = "updateEmojiSuggest config don't exist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x07da:
            di3.d r0 = di3.C86312j.m106911c(r2)
            fp.e r0 = (p523fp.C32147e) r0
            r1 = r21
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r1.f78743d
            int r2 = r1.f78744a
            int r3 = r1.f78745b
            int r1 = r1.f78747d
            r0.Y40(r2, r3, r1)
            goto L_0x0a7f
        L_0x07ef:
            java.lang.String r0 = "updateEmojiSuggest unzip file failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0a7f
        L_0x07f7:
            r0 = 5
            if (r3 != r0) goto L_0x0917
            i61.i r0 = i61.C98603i.m128193d()
            i61.i$a r3 = i61.C98603i.C98604a.EGG
            kl.g r4 = r0.mo138044e(r3)
            int r3 = r0.mo138043b(r3)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r9 = r1.f78743d
            java.lang.String r9 = r9.f78746c
            boolean r9 = r0.mo138042a(r9, r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = i61.C98603i.m128192c()
            r10.append(r11)
            r10.append(r5)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L_0x082a
            r10 = 0
            goto L_0x082e
        L_0x082a:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
        L_0x082e:
            if (r10 != 0) goto L_0x083a
            android.net.Uri$Builder r10 = new android.net.Uri$Builder
            r10.<init>()
            android.net.Uri$Builder r7 = r10.path(r7)
            goto L_0x0842
        L_0x083a:
            android.net.Uri$Builder r10 = r10.buildUpon()
            r10.appendPath(r7)
            r7 = r10
        L_0x0842:
            android.net.Uri r10 = r7.build()
            java.lang.String r11 = r10.getPath()
            if (r11 == 0) goto L_0x0863
            r12 = 0
            java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r12, r12)
            java.lang.String r12 = r10.getPath()
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x0863
            android.net.Uri$Builder r7 = r7.path(r11)
            android.net.Uri r10 = r7.build()
        L_0x0863:
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163865u(r10)
            int r7 = p207nl.C100134k.m130830d(r7)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r10 = r4.f290706a
            r10.f265435g = r3
            r10.f265436h = r7
            r4.mo138519b(r9)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r3 = r4.f290706a
            r7 = 0
            r3.f265434f = r7
            r3.mo86054n()
            java.lang.String r3 = "updateEmojiEgg unzip file failed."
            if (r9 == 0) goto L_0x0912
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = i61.C98603i.m128192c()
            r7.append(r9)
            r7.append(r5)
            java.lang.String r9 = "egg"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = i61.C98603i.m128192c()
            r7.append(r10)
            r7.append(r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = i61.C98603i.m128192c()
            r8.append(r10)
            r8.append(r5)
            r8.append(r9)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.vfs.C86013q1.m106462w(r7, r5)
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.String r7 = i61.C98603i.m128192c()
            r5.<init>((java.lang.String) r7, (java.lang.String) r9)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = "egg.xml"
            r7.<init>((com.tencent.p014mm.vfs.C86009m1) r5, (java.lang.String) r8)
            boolean r5 = r7.mo119967g()
            if (r5 == 0) goto L_0x090d
            boolean r3 = r0.mo138045f(r7)
            java.lang.Class<zp.b> r5 = p777zp.C112645b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            zp.b r5 = (p777zp.C112645b) r5
            uc0.g r0 = r0.f289105b
            r5.qh0(r0)
            r4.mo138518a(r3)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r0 = r4.f290706a
            r0.mo86054n()
            di3.d r0 = di3.C86312j.m106911c(r2)
            fp.e r0 = (p523fp.C32147e) r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r1.f78743d
            int r2 = r1.f78744a
            int r3 = r1.f78745b
            int r1 = r1.f78747d
            r0.Y40(r2, r3, r1)
            goto L_0x0a7f
        L_0x090d:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0a7f
        L_0x0912:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0a7f
        L_0x0917:
            r5 = 6
            if (r3 != r5) goto L_0x0990
            i61.i r0 = i61.C98603i.m128193d()
            i61.i$a r3 = i61.C98603i.C98604a.SUGGEST_WORD
            kl.g r3 = r0.mo138044e(r3)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r4 = r1.f78743d
            java.lang.String r4 = r4.f78746c
            java.lang.String r5 = "suggest_word"
            boolean r0 = r0.mo138042a(r4, r5)
            r3.mo138519b(r0)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r3 = r3.f290706a
            r3.mo86054n()
            if (r0 == 0) goto L_0x0a7f
            java.lang.String r0 = i61.C98603i.m128192c()
            if (r0 != 0) goto L_0x0941
            r10 = 0
            goto L_0x0945
        L_0x0941:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
        L_0x0945:
            if (r10 != 0) goto L_0x0951
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.path(r5)
            goto L_0x0958
        L_0x0951:
            android.net.Uri$Builder r0 = r10.buildUpon()
            r0.appendPath(r5)
        L_0x0958:
            android.net.Uri r3 = r0.build()
            java.lang.String r4 = r3.getPath()
            if (r4 == 0) goto L_0x0978
            r5 = 0
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r5, r5)
            java.lang.String r3 = r3.getPath()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0978
            android.net.Uri$Builder r0 = r0.path(r4)
            r0.build()
        L_0x0978:
            gl.j r0 = p534gl.C32477j.f86286a
            r0.mo58654c()
            di3.d r0 = di3.C86312j.m106911c(r2)
            fp.e r0 = (p523fp.C32147e) r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r1.f78743d
            int r2 = r1.f78744a
            int r3 = r1.f78745b
            int r1 = r1.f78747d
            r0.Y40(r2, r3, r1)
            goto L_0x0a7f
        L_0x0990:
            r5 = 7
            if (r3 != r5) goto L_0x09c7
            i61.i r0 = i61.C98603i.m128193d()
            r0.getClass()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r3 = r1.f78743d
            java.lang.String r3 = r3.f78746c
            i61.i$a r4 = i61.C98603i.C98604a.EMOJI_ANIM
            kl.g r4 = r0.mo138044e(r4)
            java.lang.String r5 = "emoji_anim"
            boolean r0 = r0.mo138042a(r3, r5)
            r4.mo138519b(r0)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r3 = r4.f290706a
            r3.mo86054n()
            if (r0 == 0) goto L_0x0a7f
            di3.d r0 = di3.C86312j.m106911c(r2)
            fp.e r0 = (p523fp.C32147e) r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r1.f78743d
            int r2 = r1.f78744a
            int r3 = r1.f78745b
            int r1 = r1.f78747d
            r0.Y40(r2, r3, r1)
            goto L_0x0a7f
        L_0x09c7:
            r5 = 9
            if (r3 != r5) goto L_0x09df
            java.lang.Class<iq.d> r0 = p564iq.C87790d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            iq.d r0 = (p564iq.C87790d) r0
            a61.o r2 = new a61.o
            r5 = r23
            r2.<init>(r5, r1)
            r0.nx0(r2)
            goto L_0x0a81
        L_0x09df:
            r5 = r23
            r7 = 8
            if (r3 != r7) goto L_0x0a81
            i61.i r3 = i61.C98603i.m128193d()
            r3.getClass()
            java.lang.String r3 = "updateAppleColorEmojiNew"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            kl.g r3 = new kl.g
            r3.<init>()
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r8 = r3.f290706a
            r8.f265437i = r7
            long r7 = java.lang.System.currentTimeMillis()
            boolean r9 = com.tencent.p014mm.smiley.C96965r.f284067d
            com.tencent.mm.smiley.r r9 = com.tencent.p014mm.smiley.C96965r.C44649c.f121057a
            r9.getClass()
            long r10 = r9.mo135554f()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r12 = r1.f78743d
            java.lang.String r12 = r12.f78746c
            com.tencent.mm.smiley.r$b r12 = r9.mo135552d(r12)
            int r13 = r12.f284075a
            long r14 = r12.f284076b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r12 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)
            r17 = 0
            r0[r17] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r10)
            r0[r12] = r16
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r17 = 2
            r0[r17] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r0[r4] = r12
            r4 = 4
            long r18 = java.lang.System.currentTimeMillis()
            long r18 = r18 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r18)
            r0[r4] = r7
            java.lang.String r4 = "color_emoji_new currentSupportVersion:%d current version:%d supportVersion:%d file version:%d use time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
            r4 = 1
            if (r13 != r4) goto L_0x0a50
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a50
            r0 = 1
            goto L_0x0a57
        L_0x0a50:
            java.lang.String r0 = "need not update color emoji new"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 0
        L_0x0a57:
            if (r0 == 0) goto L_0x0a6d
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r1.f78743d
            java.lang.String r0 = r0.f78746c
            r4 = 1
            r9.mo135549a(r0, r4)
            boolean r0 = r9.mo135557i()
            r3.mo138518a(r0)
            com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct r0 = r3.f290706a
            r0.mo86054n()
        L_0x0a6d:
            di3.d r0 = di3.C86312j.m106911c(r2)
            fp.e r0 = (p523fp.C32147e) r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r1.f78743d
            int r2 = r1.f78744a
            int r3 = r1.f78745b
            int r1 = r1.f78747d
            r0.Y40(r2, r3, r1)
            goto L_0x0a81
        L_0x0a7f:
            r5 = r23
        L_0x0a81:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a61.C91963p.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
