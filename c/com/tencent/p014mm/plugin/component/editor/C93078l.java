package com.tencent.p014mm.plugin.component.editor;

/* renamed from: com.tencent.mm.plugin.component.editor.l */
public class C93078l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditorUI f268125d;

    public C93078l(EditorUI editorUI) {
        this.f268125d = editorUI;
    }

    /* JADX WARNING: type inference failed for: r14v16, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r14v27 */
    /* JADX WARNING: type inference failed for: r14v35 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x07d8, code lost:
        if (r7 != null) goto L_0x07ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x07ec, code lost:
        if (r7 == null) goto L_0x07f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x07f5 A[SYNTHETIC, Splitter:B:257:0x07f5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r25 = this;
            r1 = r25
            u21.c r0 = u21.C101941c.m134173q()
            java.lang.String r0 = r0.mo141459o()
            u21.c r2 = u21.C101941c.m134173q()
            r2.getClass()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r7 = 2
            r8 = 6
            r9 = 18
            r10 = 0
            r11 = 0
            r12 = 1
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = "MicroMsg.EditorDataManager"
            java.lang.String r2 = "getFavProtoItem error, htmlstr is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            r5 = r11
            goto L_0x064d
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            monitor-enter(r2)
            r13 = 0
        L_0x002f:
            java.util.ArrayList<p21.a> r14 = r2.f300117a     // Catch:{ all -> 0x080a }
            int r14 = r14.size()     // Catch:{ all -> 0x080a }
            r15 = 4
            if (r13 >= r14) goto L_0x0206
            java.util.ArrayList<p21.a> r14 = r2.f300117a     // Catch:{ all -> 0x080a }
            java.lang.Object r14 = r14.get(r13)     // Catch:{ all -> 0x080a }
            p21.a r14 = (p21.C100616a) r14     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r14.f294795a     // Catch:{ all -> 0x080a }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x080a }
            if (r4 == 0) goto L_0x0052
            java.lang.String r4 = r14.toString()     // Catch:{ all -> 0x080a }
            java.lang.String r4 = o21.C100273b.m131073a(r4, r9)     // Catch:{ all -> 0x080a }
            r14.f294795a = r4     // Catch:{ all -> 0x080a }
        L_0x0052:
            int r4 = r14.mo140076b()     // Catch:{ all -> 0x080a }
            r5 = -1
            if (r4 != r5) goto L_0x00aa
            int r4 = r3.size()     // Catch:{ all -> 0x080a }
            if (r4 <= 0) goto L_0x0090
            int r4 = r3.size()     // Catch:{ all -> 0x080a }
            int r4 = r4 - r12
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x080a }
            p21.e r4 = (p21.C100620e) r4     // Catch:{ all -> 0x080a }
            int r4 = r4.f294811p     // Catch:{ all -> 0x080a }
            if (r4 != r12) goto L_0x0090
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            int r5 = r3.size()     // Catch:{ all -> 0x080a }
            int r5 = r5 - r12
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x080a }
            p21.m r5 = (p21.C100628m) r5     // Catch:{ all -> 0x080a }
            java.lang.String r14 = r5.f294819s     // Catch:{ all -> 0x080a }
            r4.append(r14)     // Catch:{ all -> 0x080a }
            java.lang.String r14 = "\n"
            r4.append(r14)     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x080a }
            r5.f294819s = r4     // Catch:{ all -> 0x080a }
            goto L_0x0202
        L_0x0090:
            p21.m r4 = new p21.m     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            java.lang.String r5 = "\n"
            r4.f294819s = r5     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.f294795a     // Catch:{ all -> 0x080a }
            r4.f294795a = r5     // Catch:{ all -> 0x080a }
            java.lang.String r5 = "-1"
            r4.f294807l = r5     // Catch:{ all -> 0x080a }
            r4.f294811p = r12     // Catch:{ all -> 0x080a }
            r4.f294808m = r11     // Catch:{ all -> 0x080a }
            r3.add(r4)     // Catch:{ all -> 0x080a }
            goto L_0x0202
        L_0x00aa:
            int r4 = r14.mo140076b()     // Catch:{ all -> 0x080a }
            if (r4 >= r5) goto L_0x00b2
            goto L_0x0202
        L_0x00b2:
            int r4 = r14.mo140076b()     // Catch:{ all -> 0x080a }
            if (r4 == r8) goto L_0x00be
            int r4 = r14.mo140076b()     // Catch:{ all -> 0x080a }
            if (r4 != r15) goto L_0x00fc
        L_0x00be:
            r4 = r14
            p21.e r4 = (p21.C100620e) r4     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r4.f294813r     // Catch:{ all -> 0x080a }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x080a }
            if (r4 == 0) goto L_0x00fc
            te3.rc0 r4 = new te3.rc0     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.f294795a     // Catch:{ all -> 0x080a }
            r4.mo141257m(r5)     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.mo140075a()     // Catch:{ all -> 0x080a }
            r4.mo141261q(r5)     // Catch:{ all -> 0x080a }
            java.lang.String r4 = o21.C100273b.m131075c(r4)     // Catch:{ all -> 0x080a }
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)     // Catch:{ all -> 0x080a }
            if (r5 == 0) goto L_0x00fc
            java.lang.String r5 = "MicroMsg.EditorDataManager"
            java.lang.String r15 = "getFavProtoItem, type = %d, localfile exist, but localpath is null or nil, set path here"
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x080a }
            int r16 = r14.mo140076b()     // Catch:{ all -> 0x080a }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x080a }
            r6[r10] = r16     // Catch:{ all -> 0x080a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r15, r6)     // Catch:{ all -> 0x080a }
            r5 = r14
            p21.e r5 = (p21.C100620e) r5     // Catch:{ all -> 0x080a }
            r5.f294813r = r4     // Catch:{ all -> 0x080a }
        L_0x00fc:
            int r4 = r14.mo140076b()     // Catch:{ all -> 0x080a }
            if (r4 == r12) goto L_0x0109
            p21.e r14 = (p21.C100620e) r14     // Catch:{ all -> 0x080a }
            r3.add(r14)     // Catch:{ all -> 0x080a }
            goto L_0x0202
        L_0x0109:
            p21.m r14 = (p21.C100628m) r14     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r14.f294819s     // Catch:{ all -> 0x080a }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x080a }
            if (r4 == 0) goto L_0x0168
            int r4 = r3.size()     // Catch:{ all -> 0x080a }
            if (r4 <= 0) goto L_0x014c
            int r4 = r3.size()     // Catch:{ all -> 0x080a }
            int r4 = r4 - r12
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x080a }
            p21.e r4 = (p21.C100620e) r4     // Catch:{ all -> 0x080a }
            int r4 = r4.mo140076b()     // Catch:{ all -> 0x080a }
            if (r4 != r12) goto L_0x014c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            int r5 = r3.size()     // Catch:{ all -> 0x080a }
            int r5 = r5 - r12
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x080a }
            p21.m r5 = (p21.C100628m) r5     // Catch:{ all -> 0x080a }
            java.lang.String r6 = r5.f294819s     // Catch:{ all -> 0x080a }
            r4.append(r6)     // Catch:{ all -> 0x080a }
            java.lang.String r6 = "<br/>"
            r4.append(r6)     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x080a }
            r5.f294819s = r4     // Catch:{ all -> 0x080a }
            goto L_0x0202
        L_0x014c:
            p21.m r4 = new p21.m     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            java.lang.String r5 = "<br/>"
            r4.f294819s = r5     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.f294795a     // Catch:{ all -> 0x080a }
            r4.f294795a = r5     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.f294807l     // Catch:{ all -> 0x080a }
            r4.f294807l = r5     // Catch:{ all -> 0x080a }
            int r5 = r14.f294811p     // Catch:{ all -> 0x080a }
            r4.f294811p = r5     // Catch:{ all -> 0x080a }
            r4.f294808m = r11     // Catch:{ all -> 0x080a }
            r3.add(r4)     // Catch:{ all -> 0x080a }
            goto L_0x0202
        L_0x0168:
            int r4 = r3.size()     // Catch:{ all -> 0x080a }
            if (r4 <= 0) goto L_0x01a0
            int r4 = r3.size()     // Catch:{ all -> 0x080a }
            int r4 = r4 - r12
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x080a }
            p21.e r4 = (p21.C100620e) r4     // Catch:{ all -> 0x080a }
            int r4 = r4.mo140076b()     // Catch:{ all -> 0x080a }
            if (r4 != r12) goto L_0x01a0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            int r5 = r3.size()     // Catch:{ all -> 0x080a }
            int r5 = r5 - r12
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x080a }
            p21.m r5 = (p21.C100628m) r5     // Catch:{ all -> 0x080a }
            java.lang.String r6 = r5.f294819s     // Catch:{ all -> 0x080a }
            r4.append(r6)     // Catch:{ all -> 0x080a }
            java.lang.String r6 = r14.f294819s     // Catch:{ all -> 0x080a }
            r4.append(r6)     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x080a }
            r5.f294819s = r4     // Catch:{ all -> 0x080a }
            goto L_0x01ba
        L_0x01a0:
            p21.m r4 = new p21.m     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.f294819s     // Catch:{ all -> 0x080a }
            r4.f294819s = r5     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.f294795a     // Catch:{ all -> 0x080a }
            r4.f294795a = r5     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r14.f294807l     // Catch:{ all -> 0x080a }
            r4.f294807l = r5     // Catch:{ all -> 0x080a }
            int r5 = r14.f294811p     // Catch:{ all -> 0x080a }
            r4.f294811p = r5     // Catch:{ all -> 0x080a }
            r4.f294808m = r11     // Catch:{ all -> 0x080a }
            r3.add(r4)     // Catch:{ all -> 0x080a }
        L_0x01ba:
            int r4 = r13 + 1
            java.util.ArrayList<p21.a> r5 = r2.f300117a     // Catch:{ all -> 0x080a }
            int r5 = r5.size()     // Catch:{ all -> 0x080a }
            if (r4 >= r5) goto L_0x0202
            java.util.ArrayList<p21.a> r5 = r2.f300117a     // Catch:{ all -> 0x080a }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x080a }
            p21.a r5 = (p21.C100616a) r5     // Catch:{ all -> 0x080a }
            int r5 = r5.mo140076b()     // Catch:{ all -> 0x080a }
            if (r5 != r12) goto L_0x0202
            java.util.ArrayList<p21.a> r5 = r2.f300117a     // Catch:{ all -> 0x080a }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x080a }
            p21.m r4 = (p21.C100628m) r4     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r4.f294819s     // Catch:{ all -> 0x080a }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x080a }
            if (r4 != 0) goto L_0x0202
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x080a }
            r4.<init>()     // Catch:{ all -> 0x080a }
            int r5 = r3.size()     // Catch:{ all -> 0x080a }
            int r5 = r5 - r12
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x080a }
            p21.m r5 = (p21.C100628m) r5     // Catch:{ all -> 0x080a }
            java.lang.String r6 = r5.f294819s     // Catch:{ all -> 0x080a }
            r4.append(r6)     // Catch:{ all -> 0x080a }
            java.lang.String r6 = "<br/>"
            r4.append(r6)     // Catch:{ all -> 0x080a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x080a }
            r5.f294819s = r4     // Catch:{ all -> 0x080a }
        L_0x0202:
            int r13 = r13 + 1
            goto L_0x002f
        L_0x0206:
            monitor-exit(r2)     // Catch:{ all -> 0x080a }
            java.lang.String r4 = "<wx-"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r7)
            java.util.regex.Matcher r0 = r4.matcher(r0)
            java.lang.String r4 = "<"
            java.lang.String r0 = r0.replaceAll(r4)
            java.lang.String r4 = "</wx-"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r7)
            java.util.regex.Matcher r0 = r4.matcher(r0)
            java.lang.String r4 = "</"
            java.lang.String r4 = r0.replaceAll(r4)
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r4.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x022f }
            r5 = 0
            goto L_0x0243
        L_0x022f:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.EditorDataManager"
            java.lang.String r6 = ""
            java.lang.Object[] r13 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r13)
            java.lang.String r0 = "MicroMsg.EditorDataManager"
            java.lang.String r5 = "writehtmlfile, use utf-8 encoding error, use default encoding"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            r0 = r11
            r5 = 1
        L_0x0243:
            te3.rc0 r6 = r2.f300119c
            r13 = 8
            r6.mo141260p(r13)
            te3.rc0 r6 = r2.f300119c
            java.lang.String r14 = "WeNoteHtmlFile"
            r6.mo141228A(r14)
            te3.rc0 r6 = r2.f300119c
            r6.mo141232F(r12)
            te3.rc0 r6 = r2.f300119c
            java.lang.String r14 = ".htm"
            r6.mo141261q(r14)
            te3.rc0 r6 = r2.f300119c
            java.lang.String r14 = r6.toString()
            java.lang.String r14 = o21.C100273b.m131073a(r14, r9)
            r6.mo141257m(r14)
            te3.rc0 r6 = r2.f300119c
            java.lang.String r6 = o21.C100273b.m131075c(r6)
            java.lang.String r14 = "MicroMsg.EditorDataManager"
            java.lang.String r11 = "getFavProtoItem: save note html file, path is %s"
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r9[r10] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r11, r9)
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            r9.<init>((java.lang.String) r6)
            boolean r11 = r9.mo119967g()
            if (r11 == 0) goto L_0x0289
            r9.mo119966f()
        L_0x0289:
            boolean r11 = r9.mo119967g()
            if (r11 != 0) goto L_0x02a0
            r9.mo119964e()     // Catch:{ IOException -> 0x0293 }
            goto L_0x02a0
        L_0x0293:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "MicroMsg.EditorDataManager"
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r4)
            goto L_0x064c
        L_0x02a0:
            if (r5 != 0) goto L_0x062e
            int r5 = r0.length
            int r0 = com.tencent.p014mm.vfs.C86013q1.m106438T(r6, r0, r10, r5)
            if (r0 != 0) goto L_0x062e
            te3.rc0 r0 = r2.f300119c
            r0.f299284V = r6
            java.lang.String r0 = "MicroMsg.EditorDataManager"
            java.lang.String r5 = "do EditorBase.ConvertNote2FavProtoItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            te3.rc0 r0 = r2.f300119c
            int r2 = o21.C100272a.f293764a
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            te3.kd0 r5 = new te3.kd0
            r5.<init>()
            java.lang.String r6 = "WeNoteHtmlFile"
            if (r0 == 0) goto L_0x02ca
            r2.add(r0)
            goto L_0x0306
        L_0x02ca:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x0306
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0306
            java.lang.String r0 = pb1.C11881t1.m11564b()
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            r4.mo141260p(r13)
            r4.mo141228A(r6)
            r4.mo141232F(r12)
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r4.mo141269y(r10)
            java.lang.String r10 = ".htm"
            r4.mo141261q(r10)
            r2.add(r4)
            java.lang.String r10 = o21.C100273b.m131075c(r4)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r11 != 0) goto L_0x0304
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r10)
        L_0x0304:
            r4.f299284V = r10
        L_0x0306:
            java.util.Iterator r0 = r3.iterator()
        L_0x030a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0481
            java.lang.Object r4 = r0.next()
            p21.e r4 = (p21.C100620e) r4
            if (r4 != 0) goto L_0x0319
            goto L_0x030a
        L_0x0319:
            te3.rc0 r10 = r4.f294808m
            if (r10 == 0) goto L_0x0321
            r2.add(r10)
            goto L_0x030a
        L_0x0321:
            te3.rc0 r10 = new te3.rc0
            r10.<init>()
            te3.sc0 r11 = new te3.sc0
            r11.<init>()
            te3.tc0 r14 = new te3.tc0
            r14.<init>()
            r14.mo141309p(r8)
            r11.f299405d = r14
            r10.f299296c1 = r11
            int r11 = r4.f294811p
            switch(r11) {
                case 1: goto L_0x043f;
                case 2: goto L_0x03f9;
                case 3: goto L_0x03c3;
                case 4: goto L_0x0396;
                case 5: goto L_0x0373;
                case 6: goto L_0x033e;
                default: goto L_0x033c;
            }
        L_0x033c:
            goto L_0x0475
        L_0x033e:
            r10.mo141260p(r15)
            r11 = r4
            p21.o r11 = (p21.C100630o) r11
            java.lang.String r14 = r4.f294795a
            r10.mo141257m(r14)
            java.lang.String r14 = r11.f294813r
            r10.f299284V = r14
            java.lang.String r14 = r11.f294827s
            r10.f299286W = r14
            java.lang.Class<dy.f> r14 = p500dy.C97560f.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            dy.f r14 = (p500dy.C97560f) r14
            java.lang.String r9 = r11.f294813r
            com.tencent.mm.plugin.sight.base.a r9 = r14.Z40(r9)
            if (r9 == 0) goto L_0x0369
            int r9 = r9.mo130041a()
            r10.mo141266v(r9)
            goto L_0x036c
        L_0x0369:
            r10.mo141266v(r12)
        L_0x036c:
            java.lang.String r9 = r11.f294829u
            r10.mo141261q(r9)
            goto L_0x0475
        L_0x0373:
            r10.mo141260p(r13)
            r9 = r4
            p21.h r9 = (p21.C100623h) r9
            java.lang.String r11 = r4.f294795a
            r10.mo141257m(r11)
            java.lang.String r11 = r9.f294813r
            r10.f299284V = r11
            r10.mo141232F(r12)
            java.lang.String r11 = r9.f294820s
            r10.mo141246U(r11)
            java.lang.String r11 = r9.f294821t
            r10.mo141265u(r11)
            java.lang.String r9 = r9.f294822u
            r10.mo141261q(r9)
            goto L_0x0475
        L_0x0396:
            r9 = 3
            r10.mo141260p(r9)
            r9 = r4
            p21.i r9 = (p21.C100624i) r9
            java.lang.String r11 = r4.f294795a
            r10.mo141257m(r11)
            java.lang.String r11 = r9.f294813r
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r14 != 0) goto L_0x030a
            int r14 = r11.length()
            if (r14 != 0) goto L_0x03b2
            goto L_0x030a
        L_0x03b2:
            r10.f299284V = r11
            int r11 = r9.f294826v
            r10.mo141266v(r11)
            r10.mo141232F(r12)
            java.lang.String r9 = r9.f294823s
            r10.mo141261q(r9)
            goto L_0x0475
        L_0x03c3:
            r10.mo141260p(r8)
            r9 = r4
            p21.f r9 = (p21.C100621f) r9
            java.lang.String r11 = r4.f294795a
            r10.mo141257m(r11)
            te3.zc0 r11 = new te3.zc0
            r11.<init>()
            java.lang.String r14 = r9.f294818w
            r11.mo141339v(r14)
            double r13 = r9.f294815t
            r11.mo141340w(r13)
            double r13 = r9.f294816u
            r11.mo141341x(r13)
            double r13 = r9.f294817v
            int r13 = (int) r13
            r11.mo141323F(r13)
            java.lang.String r9 = r9.f294814s
            r11.mo141322E(r9)
            r10.mo141231E(r12)
            r10.mo141232F(r12)
            te3.sc0 r9 = r10.f299296c1
            r9.f299406e = r11
            goto L_0x0475
        L_0x03f9:
            r10.mo141260p(r7)
            r9 = r4
            p21.d r9 = (p21.C100619d) r9
            java.lang.String r11 = r9.f294806s
            r10.f299284V = r11
            java.lang.String r13 = r9.f294795a
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0415
            java.lang.String r11 = r4.f294795a
            r10.mo141257m(r11)
            java.lang.String r9 = r9.f294813r
            r10.f299286W = r9
            goto L_0x043b
        L_0x0415:
            java.lang.String r9 = r9.toString()
            r13 = 18
            java.lang.String r9 = o21.C100273b.m131073a(r9, r13)
            r10.mo141257m(r9)
            r19 = 150(0x96, float:2.1E-43)
            r20 = 150(0x96, float:2.1E-43)
            android.graphics.Bitmap$CompressFormat r21 = android.graphics.Bitmap.CompressFormat.JPEG
            r22 = 90
            java.lang.String r23 = o21.C100273b.m131077e(r10)
            r24 = 1
            r18 = r11
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r18, (int) r19, (int) r20, (android.graphics.Bitmap.CompressFormat) r21, (int) r22, (java.lang.String) r23, (boolean) r24)
            java.lang.String r9 = o21.C100273b.m131077e(r10)
            r10.f299286W = r9
        L_0x043b:
            r10.mo141260p(r7)
            goto L_0x0475
        L_0x043f:
            r10.mo141260p(r12)
            r10.mo141231E(r12)
            r10.mo141232F(r12)
            r9 = r4
            p21.m r9 = (p21.C100628m) r9
            java.lang.String r11 = r4.f294795a
            r10.mo141257m(r11)
            java.lang.String r9 = r9.f294819s
            java.lang.String r9 = com.tencent.p014mm.plugin.component.editor.C93088r.m117441k(r9)
            r10.mo141265u(r9)
            java.lang.String r9 = r10.f299301f
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0475
            java.lang.String r9 = r10.f299301f
            int r9 = r9.length()
            r11 = 1000(0x3e8, float:1.401E-42)
            if (r9 <= r11) goto L_0x0475
            java.lang.String r9 = r10.f299301f
            r13 = 0
            java.lang.String r11 = r9.substring(r13, r11)
            r10.mo141265u(r11)
        L_0x0475:
            java.lang.String r4 = r4.f294807l
            r10.mo141228A(r4)
            r2.add(r10)
            r13 = 8
            goto L_0x030a
        L_0x0481:
            java.lang.String r0 = "MicroMsg.EditorBase"
            java.lang.String r4 = "do EditorBase.setExtraInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x062a
            int r4 = r2.size()
            r10 = 0
        L_0x0493:
            if (r10 >= r4) goto L_0x062a
            java.lang.Object r11 = r2.get(r10)
            te3.rc0 r11 = (te3.C101834rc0) r11
            if (r10 <= 0) goto L_0x04dc
            java.lang.String r13 = r11.f299325s
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x04dc
            java.lang.String r13 = r11.toString()
            r14 = 18
            java.lang.String r13 = o21.C100273b.m131073a(r13, r14)
            r11.mo141257m(r13)
            int r13 = r10 + -1
            if (r13 < 0) goto L_0x04c9
            int r14 = r3.size()
            if (r13 >= r14) goto L_0x04c9
            int r14 = r3.size()
            if (r14 <= 0) goto L_0x04c9
            java.lang.Object r13 = r3.get(r13)
            p21.e r13 = (p21.C100620e) r13
            goto L_0x04ca
        L_0x04c9:
            r13 = 0
        L_0x04ca:
            if (r13 == 0) goto L_0x04dc
            java.lang.String r14 = r13.f294807l
            if (r14 == 0) goto L_0x04dc
            java.lang.String r15 = r11.f299308i1
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x04dc
            java.lang.String r14 = r11.f299280T
            r13.f294795a = r14
        L_0x04dc:
            if (r10 <= 0) goto L_0x04f6
            java.lang.String r13 = r11.f299325s
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x04f6
            java.lang.String r13 = r11.f299329u
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x04f6
            r11.mo141231E(r12)
            r11.mo141232F(r12)
            goto L_0x0625
        L_0x04f6:
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r9 = 0
            r13[r9] = r14
            int r14 = r11.f299258I
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r12] = r14
            java.lang.String r14 = "datalist.get[%d].type = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r14, r13)
            java.lang.String r13 = r11.f299284V
            boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r14 == 0) goto L_0x0594
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r9] = r13
            java.lang.String r15 = "datapath exist,pathname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r15, r14)
            java.lang.String r14 = com.tencent.p014mm.vfs.C86013q1.m106456q(r13)
            r15 = 256(0x100, float:3.59E-43)
            byte[] r17 = com.tencent.p014mm.vfs.C86013q1.m106433O(r13, r9, r15)
            java.lang.String r15 = p823sg.C90193h.m112878f(r17)
            r11.mo141268x(r14)
            r11.mo141270z(r15)
            android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r15 = r14.getPath()
            if (r15 == 0) goto L_0x0555
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r9, r9)
            java.lang.String r9 = r14.getPath()
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x0555
            android.net.Uri$Builder r9 = r14.buildUpon()
            android.net.Uri$Builder r9 = r9.path(r15)
            android.net.Uri r14 = r9.build()
        L_0x0555:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r9 = r9.mo177799l(r14, r15)
            boolean r14 = r9.mo177810a()
            if (r14 != 0) goto L_0x0563
            goto L_0x056d
        L_0x0563:
            com.tencent.mm.vfs.FileSystem$c r14 = r9.f348991a
            java.lang.String r9 = r9.f348992b
            com.tencent.mm.vfs.b0 r9 = r14.mo119945q(r9)
            if (r9 != 0) goto L_0x0570
        L_0x056d:
            r14 = 0
            goto L_0x0572
        L_0x0570:
            long r14 = r9.f250473c
        L_0x0572:
            r11.mo141269y(r14)
            java.lang.String r9 = o21.C100273b.m131075c(r11)
            boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            boolean r15 = r13.equals(r9)
            if (r15 != 0) goto L_0x0592
            if (r14 != 0) goto L_0x0592
            java.lang.String r14 = r11.f299308i1
            boolean r14 = r6.equals(r14)
            if (r14 != 0) goto L_0x0592
            com.tencent.p014mm.vfs.C86013q1.m106463x(r13, r9)
            r11.f299284V = r9
        L_0x0592:
            r14 = 0
            goto L_0x059e
        L_0x0594:
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r14 = 0
            r9[r14] = r13
            java.lang.String r13 = "datapath not exist, %s not exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r13, r9)
        L_0x059e:
            java.lang.String r13 = r11.f299286W
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r9 == 0) goto L_0x061a
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r9[r14] = r13
            java.lang.String r15 = "thumbPath exist,pathname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r15, r9)
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106456q(r13)
            r15 = 256(0x100, float:3.59E-43)
            java.lang.String r7 = p823sg.C90193h.m112877e(r13, r14, r15)
            r11.mo141245T(r9)
            r11.mo141244S(r7)
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r9 = r7.getPath()
            if (r9 == 0) goto L_0x05e4
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r14, r14)
            java.lang.String r14 = r7.getPath()
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x05e4
            android.net.Uri$Builder r7 = r7.buildUpon()
            android.net.Uri$Builder r7 = r7.path(r15)
            android.net.Uri r7 = r7.build()
        L_0x05e4:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r7 = r14.mo177799l(r7, r15)
            boolean r14 = r7.mo177810a()
            if (r14 != 0) goto L_0x05f2
            goto L_0x05fc
        L_0x05f2:
            com.tencent.mm.vfs.FileSystem$c r14 = r7.f348991a
            java.lang.String r7 = r7.f348992b
            com.tencent.mm.vfs.b0 r7 = r14.mo119945q(r7)
            if (r7 != 0) goto L_0x05ff
        L_0x05fc:
            r14 = 0
            goto L_0x0601
        L_0x05ff:
            long r14 = r7.f250473c
        L_0x0601:
            r11.mo141243R(r14)
            java.lang.String r7 = o21.C100273b.m131077e(r11)
            boolean r14 = r13.equals(r7)
            if (r14 != 0) goto L_0x0625
            boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r14 != 0) goto L_0x0625
            com.tencent.p014mm.vfs.C86013q1.m106463x(r13, r7)
            r11.f299286W = r7
            goto L_0x0625
        L_0x061a:
            java.lang.Object[] r7 = new java.lang.Object[r12]
            r9 = 0
            r7[r9] = r13
            java.lang.String r11 = "thumbPath not exist, pathname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r11, r7)
        L_0x0625:
            int r10 = r10 + 1
            r7 = 2
            goto L_0x0493
        L_0x062a:
            r5.mo141211f(r2)
            goto L_0x064d
        L_0x062e:
            java.lang.String r0 = "MicroMsg.EditorDataManager"
            java.lang.String r2 = "writefile error, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131825770(0x7f11146a, float:1.9284406E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r12)
            r0.show()
        L_0x064c:
            r5 = 0
        L_0x064d:
            if (r5 != 0) goto L_0x0658
            java.lang.String r0 = "MicroMsg.EditorActivityUI"
            java.lang.String r2 = "protoItem is null, return!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return
        L_0x0658:
            com.tencent.mm.plugin.component.editor.EditorUI r0 = r1.f268125d
            java.util.LinkedList<te3.rc0> r0 = r0.f268039G
            r0.clear()
            com.tencent.mm.plugin.component.editor.EditorUI r0 = r1.f268125d
            java.util.LinkedList<te3.rc0> r0 = r0.f268039G
            java.util.LinkedList<te3.rc0> r2 = r5.f298618f
            r0.addAll(r2)
            com.tencent.mm.plugin.component.editor.EditorUI r0 = r1.f268125d
            java.util.LinkedList<te3.rc0> r2 = r0.f268039G
            long r3 = java.lang.System.currentTimeMillis()
            pb1.z r5 = r0.f268038F
            if (r5 != 0) goto L_0x067b
            pb1.z r5 = new pb1.z
            r5.<init>()
            r0.f268038F = r5
        L_0x067b:
            pb1.z r5 = r0.f268038F
            r6 = 18
            r5.field_type = r6
            r5.field_sourceType = r8
            te3.rd0 r5 = r0.mo94183L7(r5)
            pb1.z r6 = r0.f268038F
            te3.kd0 r6 = r6.field_favProto
            r6.mo141219q(r5)
            pb1.z r6 = r0.f268038F
            java.lang.String r7 = r5.f299348f
            r6.field_fromUser = r7
            java.lang.String r5 = r5.f299350h
            r6.field_toUser = r5
            te3.kd0 r5 = r6.field_favProto
            r5.mo141222t(r12)
            pb1.z r5 = r0.f268038F
            te3.kd0 r5 = r5.field_favProto
            r6 = 127(0x7f, float:1.78E-43)
            r5.mo141210d(r6)
            pb1.z r5 = r0.f268038F
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r5.field_edittime = r6
            pb1.z r5 = r0.f268038F
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r5.field_updateTime = r6
            pb1.z r5 = r0.f268038F
            te3.kd0 r6 = r5.field_favProto
            long r7 = r5.field_edittime
            r6.mo141213k(r7)
            pb1.z r5 = r0.f268038F
            te3.kd0 r5 = r5.field_favProto
            te3.rd0 r5 = r5.f298616d
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r5.mo141273f(r6)
            pb1.z r5 = r0.f268038F
            r6 = 9
            r5.field_itemStatus = r6
            r5.field_localId = r3
            te3.kd0 r3 = r5.field_favProto
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f
            if (r3 == r2) goto L_0x06e4
            r3.clear()
            pb1.z r3 = r0.f268038F
            te3.kd0 r3 = r3.field_favProto
            r3.mo141211f(r2)
        L_0x06e4:
            pb1.z r2 = r0.f268038F
            r0.f268038F = r2
            com.tencent.mm.plugin.component.editor.EditorUI r0 = r1.f268125d
            r2 = 0
        L_0x06eb:
            java.util.LinkedList<te3.rc0> r3 = r0.f268039G
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0809
            java.util.LinkedList<te3.rc0> r3 = r0.f268039G
            java.lang.Object r3 = r3.get(r2)
            te3.rc0 r3 = (te3.C101834rc0) r3
            java.lang.String r4 = r3.f299280T
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0712
            java.lang.String r4 = r3.toString()
            pb1.z r5 = r0.f268038F
            int r5 = r5.field_type
            java.lang.String r4 = o21.C100273b.m131073a(r4, r5)
            r3.mo141257m(r4)
        L_0x0712:
            java.lang.String r4 = r3.f299284V
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            java.lang.String r6 = "MicroMsg.EditorActivityUI"
            if (r5 == 0) goto L_0x0785
            java.lang.String r5 = p823sg.C90193h.m112876d(r4)
            r7 = 256(0x100, float:3.59E-43)
            r8 = 0
            java.lang.String r9 = p823sg.C90193h.m112877e(r4, r8, r7)
            r3.mo141268x(r5)
            r3.mo141270z(r9)
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
            java.lang.String r7 = r5.getPath()
            if (r7 == 0) goto L_0x0751
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r8, r8)
            java.lang.String r8 = r5.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0751
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r7)
            android.net.Uri r5 = r5.build()
        L_0x0751:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r5 = r7.mo177799l(r5, r15)
            boolean r7 = r5.mo177810a()
            if (r7 != 0) goto L_0x075f
            goto L_0x0769
        L_0x075f:
            com.tencent.mm.vfs.FileSystem$c r7 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            com.tencent.mm.vfs.b0 r5 = r7.mo119945q(r5)
            if (r5 != 0) goto L_0x076c
        L_0x0769:
            r7 = 0
            goto L_0x076e
        L_0x076c:
            long r7 = r5.f250473c
        L_0x076e:
            r3.mo141269y(r7)
            java.lang.String r5 = o21.C100273b.m131075c(r3)
            boolean r7 = r4.equals(r5)
            if (r7 != 0) goto L_0x077e
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r5)
        L_0x077e:
            com.tencent.mm.plugin.component.editor.a$a r4 = com.tencent.p014mm.plugin.component.editor.C93062a.C93063a.TYPE_FILE
            r0.mo127492a8(r3, r4)
            r5 = 2
            goto L_0x0799
        L_0x0785:
            r5 = 2
            r15 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r8 = r3.f299258I
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            r7[r12] = r4
            java.lang.String r4 = "copy file fail, type: %d,%s not exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r7)
        L_0x0799:
            java.lang.String r4 = r3.f299286W
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r7 == 0) goto L_0x07f9
            java.io.InputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106423E(r4)     // Catch:{ FileNotFoundException -> 0x07e4, all -> 0x07e1 }
            r8 = 4096(0x1000, float:5.74E-42)
            java.lang.String r8 = p823sg.C90193h.m112874b(r7, r8)     // Catch:{ FileNotFoundException -> 0x07de }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ FileNotFoundException -> 0x07de }
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)     // Catch:{ FileNotFoundException -> 0x07de }
            r13 = 102400(0x19000, float:1.43493E-40)
            r9 = 0
            r14 = 256(0x100, float:3.59E-43)
            java.lang.String r13 = p823sg.C90193h.m112875c(r7, r13, r9, r14)     // Catch:{ FileNotFoundException -> 0x07e7 }
            r3.mo141245T(r8)     // Catch:{ FileNotFoundException -> 0x07e7 }
            r3.mo141244S(r13)     // Catch:{ FileNotFoundException -> 0x07e7 }
            r3.mo141243R(r10)     // Catch:{ FileNotFoundException -> 0x07e7 }
            java.lang.String r8 = o21.C100273b.m131077e(r3)     // Catch:{ FileNotFoundException -> 0x07e7 }
            boolean r10 = r4.equals(r8)     // Catch:{ FileNotFoundException -> 0x07e7 }
            if (r10 != 0) goto L_0x07d3
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r8)     // Catch:{ FileNotFoundException -> 0x07e7 }
        L_0x07d3:
            com.tencent.mm.plugin.component.editor.a$a r4 = com.tencent.p014mm.plugin.component.editor.C93062a.C93063a.TYPE_THUMB     // Catch:{ FileNotFoundException -> 0x07e7 }
            r0.mo127492a8(r3, r4)     // Catch:{ FileNotFoundException -> 0x07e7 }
            if (r7 == 0) goto L_0x07f1
            goto L_0x07ee
        L_0x07db:
            r0 = move-exception
            r11 = r7
            goto L_0x07f3
        L_0x07de:
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x07e7
        L_0x07e1:
            r0 = move-exception
            r11 = r15
            goto L_0x07f3
        L_0x07e4:
            r14 = 256(0x100, float:3.59E-43)
            r7 = r15
        L_0x07e7:
            java.lang.String r3 = "VFSFileOp thumbPath error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r3)     // Catch:{ all -> 0x07db }
            if (r7 == 0) goto L_0x07f1
        L_0x07ee:
            r7.close()     // Catch:{ Exception -> 0x07f1 }
        L_0x07f1:
            r7 = 0
            goto L_0x0805
        L_0x07f3:
            if (r11 == 0) goto L_0x07f8
            r11.close()     // Catch:{ Exception -> 0x07f8 }
        L_0x07f8:
            throw r0
        L_0x07f9:
            r14 = 256(0x100, float:3.59E-43)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r7 = 0
            r3[r7] = r4
            java.lang.String r4 = "copy thumb fail, %s not exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r3)
        L_0x0805:
            int r2 = r2 + 1
            goto L_0x06eb
        L_0x0809:
            return
        L_0x080a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x080a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.C93078l.run():void");
    }
}
