package com.tencent.p014mm.plugin.scanner.word;

import com.tencent.p014mm.plugin.scanner.word.C94533d;

/* renamed from: com.tencent.mm.plugin.scanner.word.b */
public class C19149b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f53900d;

    /* renamed from: e */
    public final /* synthetic */ C94533d.C94534a f53901e;

    /* renamed from: f */
    public final /* synthetic */ long f53902f;

    /* renamed from: g */
    public final /* synthetic */ ImageWordScanDetailEngine f53903g;

    public C19149b(ImageWordScanDetailEngine imageWordScanDetailEngine, String str, C94533d.C94534a aVar, long j) {
        this.f53903g = imageWordScanDetailEngine;
        this.f53900d = str;
        this.f53901e = aVar;
        this.f53902f = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a8, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2) == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01aa, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.WordDetectModHelper", "in decodeFile, file == null");
        r0 = com.tencent.worddetect.C20118a.C20119a.f57012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b3, code lost:
        if (r0 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b5, code lost:
        r6.f66375b.f273350f.put(r6.f66374a, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01be, code lost:
        com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine.m119539a(r6.f66375b, r6.f66374a, new xl2.C102690c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01cc, code lost:
        r9 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d2, code lost:
        if (com.tencent.worddetect.C20118a.f57011d != null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d4, code lost:
        com.tencent.worddetect.C20118a.f57011d = new rw3.C13588a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0 = wl2.C15516e.m14538a(new wl2.C15517f(r2, r3), com.tencent.worddetect.C20118a.f57011d).f42061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ea, code lost:
        if (r0 != null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ec, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.WordDetectModHelper", "decodeFileForDetail decode bitmap is null!");
        com.tencent.worddetect.C20118a.m21901b(r6, (com.tencent.worddetect.WordDetectNative.WordDetectDetailResult) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f9, code lost:
        r5 = com.tencent.worddetect.C20118a.m21900a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0201, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r5) == false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0203, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.WordDetectModHelper", "decodeFileForDetail bitmap to BGR error");
        com.tencent.worddetect.C20118a.m21901b(r6, com.tencent.worddetect.C20118a.C20119a.f57012a);
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175911u(1259, com.tencent.xweb.util.WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0218, code lost:
        r7 = r0.getWidth();
        r0 = r0.getHeight();
        r11 = com.tencent.worddetect.C20118a.f57009b.scanImage(r5, r7, r0, 3);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.WordDetectModHelper", "decodeFileForDetail data length = %d, w = %d, h = %d, scanImage result %d, session: %s", java.lang.Integer.valueOf(r5.length), java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r11), java.lang.Long.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0255, code lost:
        if (r11 == 0) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0257, code lost:
        com.tencent.worddetect.C20118a.m21901b(r6, com.tencent.worddetect.C20118a.C20119a.f57012a);
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175911u(1259, java.lang.Math.abs(r11) + 180);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0269, code lost:
        r0 = new com.tencent.worddetect.WordDetectNative.WordDetectDetailResult();
        r5 = com.tencent.worddetect.C20118a.f57009b.getDetailResult(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0274, code lost:
        if (r5 == 0) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0276, code lost:
        com.tencent.worddetect.C20118a.m21901b(r6, com.tencent.worddetect.C20118a.C20119a.f57012a);
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175911u(1259, java.lang.Math.abs(r5) + 190);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0287, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.WordDetectModHelper", "decodeFileForDetail result %s, detectResult.width: %s, detectResult.height: %s, cost %d, session: %s", r0.rate_lang, java.lang.Integer.valueOf(r0.width), java.lang.Integer.valueOf(r0.height), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r9), java.lang.Long.valueOf(r3));
        com.tencent.worddetect.C20118a.m21901b(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02be, code lost:
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175911u(1259, com.tencent.xweb.util.WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB);
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.WordDetectModHelper", r0, "decodeFileForDetail error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02cf, code lost:
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175911u(1259, com.tencent.xweb.util.WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB);
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.WordDetectModHelper", r0, "decodeFileForDetail exception", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02de, code lost:
        com.tencent.worddetect.C20118a.m21901b(r6, com.tencent.worddetect.C20118a.C20119a.f57012a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r1 = r19
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r0 = r1.f53903g
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.plugin.scanner.word.d$a<java.lang.String, xl2.c>>> r0 = r0.f273351g
            java.lang.String r2 = r1.f53900d
            java.lang.Object r0 = r0.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r2 = r1.f53903g
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.plugin.scanner.word.d$a<java.lang.String, xl2.c>>> r2 = r2.f273351g
            java.lang.String r3 = r1.f53900d
            r2.put(r3, r0)
        L_0x001e:
            com.tencent.mm.plugin.scanner.word.d$a r2 = r1.f53901e
            boolean r2 = r0.contains(r2)
            com.tencent.mm.plugin.scanner.word.d$a r3 = r1.f53901e
            if (r3 == 0) goto L_0x0033
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x0033
            com.tencent.mm.plugin.scanner.word.d$a r3 = r1.f53901e
            r0.add(r3)
        L_0x0033:
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r0 = r1.f53903g
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.worddetect.WordDetectNative$WordDetectDetailResult> r0 = r0.f273350f
            java.lang.String r3 = r1.f53900d
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0059
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r0 = r1.f53903g
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.worddetect.WordDetectNative$WordDetectDetailResult> r0 = r0.f273350f
            java.lang.String r2 = r1.f53900d
            java.lang.Object r0 = r0.get(r2)
            com.tencent.worddetect.WordDetectNative$WordDetectDetailResult r0 = (com.tencent.worddetect.WordDetectNative.WordDetectDetailResult) r0
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r2 = r1.f53903g
            java.lang.String r3 = r1.f53900d
            xl2.c r4 = new xl2.c
            r4.<init>(r0)
            com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine.m119539a(r2, r3, r4)
            goto L_0x02ef
        L_0x0059:
            if (r2 != 0) goto L_0x02e7
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r0 = r1.f53903g
            java.lang.String r2 = r1.f53900d
            long r3 = r1.f53902f
            boolean r5 = r0.f273352h
            if (r5 == 0) goto L_0x006e
            java.lang.String r0 = "MicroMsg.ImageWordScanDetailEngine"
            java.lang.String r2 = "doRequestScan is destroyed and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x02ef
        L_0x006e:
            com.tencent.mm.ui.MMActivity r5 = r0.f273348d
            if (r5 != 0) goto L_0x007b
            java.lang.String r0 = "MicroMsg.ImageWordScanDetailEngine"
            java.lang.String r2 = "doRequestScan activity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x02ef
        L_0x007b:
            xl2.a r6 = new xl2.a
            r6.<init>(r0, r2)
            java.lang.Class<com.tencent.worddetect.a> r7 = com.tencent.worddetect.C20118a.class
            com.tencent.worddetect.WordDetectNative$ConfigParam r0 = com.tencent.worddetect.C20118a.f57010c
            r8 = 4
            r13 = 0
            if (r0 != 0) goto L_0x0131
            java.lang.String r0 = "word_detect_mode_version_2"
            java.lang.String r14 = "MicroMsg.WordDetectModHelper"
            java.io.File r15 = r5.getFilesDir()     // Catch:{ Exception -> 0x011e }
            java.lang.String r15 = r15.getAbsolutePath()     // Catch:{ Exception -> 0x011e }
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x011e }
            java.lang.String r11 = "word_detect"
            r9.<init>((java.lang.String) r15, (java.lang.String) r11)     // Catch:{ Exception -> 0x011e }
            boolean r11 = r9.mo119967g()     // Catch:{ Exception -> 0x011e }
            if (r11 != 0) goto L_0x00a6
            r9.mo119987x()     // Catch:{ Exception -> 0x011e }
        L_0x00a6:
            java.lang.String r9 = r9.mo119971i()     // Catch:{ Exception -> 0x011e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
            r11.<init>()     // Catch:{ Exception -> 0x011e }
            r11.append(r9)     // Catch:{ Exception -> 0x011e }
            java.lang.String r10 = "/net_fc.bin"
            r11.append(r10)     // Catch:{ Exception -> 0x011e }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x011e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
            r11.<init>()     // Catch:{ Exception -> 0x011e }
            r11.append(r9)     // Catch:{ Exception -> 0x011e }
            java.lang.String r12 = "/net_fc.param"
            r11.append(r12)     // Catch:{ Exception -> 0x011e }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x011e }
            java.lang.String r12 = "word_detect_mode_lib"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12)     // Catch:{ Exception -> 0x011e }
            boolean r17 = r12.getBoolean(r0, r13)     // Catch:{ Exception -> 0x011e }
            java.lang.String r13 = "getWordDetectParam rootPath: %s, qBarRootPath: %s, version: %s, isCopy: %s"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x011e }
            r18 = 0
            r1[r18] = r15     // Catch:{ Exception -> 0x011e }
            r15 = 1
            r1[r15] = r9     // Catch:{ Exception -> 0x011e }
            r9 = 2
            r1[r9] = r0     // Catch:{ Exception -> 0x011e }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r17)     // Catch:{ Exception -> 0x011e }
            r15 = 3
            r1[r15] = r9     // Catch:{ Exception -> 0x011e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r1)     // Catch:{ Exception -> 0x011e }
            if (r17 != 0) goto L_0x00fb
            com.tencent.p014mm.vfs.C86013q1.m106447h(r10)     // Catch:{ Exception -> 0x011e }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r11)     // Catch:{ Exception -> 0x011e }
            r1 = 1
            r12.putBoolean(r0, r1)     // Catch:{ Exception -> 0x011e }
        L_0x00fb:
            if (r17 == 0) goto L_0x0103
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ Exception -> 0x011e }
            if (r0 != 0) goto L_0x0114
        L_0x0103:
            java.lang.String r0 = "getWordDetectParam copy model file from assets"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ Exception -> 0x011e }
            java.lang.String r0 = "qbar/net_fc.bin"
            com.tencent.p014mm.sdk.platformtools.FilesCopy.copyAssets(r5, r0, r10)     // Catch:{ Exception -> 0x011e }
            java.lang.String r0 = "qbar/net_fc.param"
            com.tencent.p014mm.sdk.platformtools.FilesCopy.copyAssets(r5, r0, r11)     // Catch:{ Exception -> 0x011e }
        L_0x0114:
            com.tencent.worddetect.WordDetectNative$ConfigParam r0 = new com.tencent.worddetect.WordDetectNative$ConfigParam     // Catch:{ Exception -> 0x011e }
            r0.<init>()     // Catch:{ Exception -> 0x011e }
            r0.detect_model_bin = r10     // Catch:{ Exception -> 0x011e }
            r0.detect_model_param = r11     // Catch:{ Exception -> 0x011e }
            goto L_0x012f
        L_0x011e:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r1 = 0
            r5[r1] = r0
            java.lang.String r0 = "getWordDetectParam err %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r5)
            r0 = 0
        L_0x012f:
            com.tencent.worddetect.C20118a.f57010c = r0
        L_0x0131:
            com.tencent.worddetect.WordDetectNative$ConfigParam r0 = com.tencent.worddetect.C20118a.f57010c
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = "MicroMsg.WordDetectModHelper"
            java.lang.String r1 = "decodeFileForDetail wordDetectConfig invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x02ef
        L_0x013e:
            com.tencent.worddetect.WordDetectNative r0 = com.tencent.worddetect.C20118a.f57009b
            r1 = 1259(0x4eb, float:1.764E-42)
            if (r0 != 0) goto L_0x0194
            monitor-enter(r7)
            com.tencent.worddetect.WordDetectNative r0 = com.tencent.worddetect.C20118a.f57009b     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x014d
            boolean r0 = com.tencent.worddetect.C20118a.f57008a     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x018f
        L_0x014d:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0191 }
            com.tencent.worddetect.WordDetectNative r0 = new com.tencent.worddetect.WordDetectNative     // Catch:{ all -> 0x0191 }
            r0.<init>()     // Catch:{ all -> 0x0191 }
            com.tencent.worddetect.C20118a.f57009b = r0     // Catch:{ all -> 0x0191 }
            com.tencent.worddetect.WordDetectNative$ConfigParam r5 = com.tencent.worddetect.C20118a.f57010c     // Catch:{ all -> 0x0191 }
            int r0 = r0.init(r5)     // Catch:{ all -> 0x0191 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0191 }
            if (r0 < 0) goto L_0x0168
            r5 = 1
            com.tencent.worddetect.C20118a.f57008a = r5     // Catch:{ all -> 0x0191 }
            goto L_0x0176
        L_0x0168:
            r5 = 0
            com.tencent.worddetect.C20118a.f57008a = r5     // Catch:{ all -> 0x0191 }
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0191 }
            int r13 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0191 }
            int r13 = r13 + 180
            r5.mo175911u(r1, r13)     // Catch:{ all -> 0x0191 }
        L_0x0176:
            java.lang.String r5 = "MicroMsg.WordDetectModHelper"
            java.lang.String r13 = "decodeFileForDetail wordDetectNative.init ret: %s, cost: %s"
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0191 }
            r14 = 0
            r15[r14] = r0     // Catch:{ all -> 0x0191 }
            long r11 = r11 - r9
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0191 }
            r9 = 1
            r15[r9] = r0     // Catch:{ all -> 0x0191 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r15)     // Catch:{ all -> 0x0191 }
        L_0x018f:
            monitor-exit(r7)     // Catch:{ all -> 0x0191 }
            goto L_0x0194
        L_0x0191:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0191 }
            throw r0
        L_0x0194:
            monitor-enter(r7)
            boolean r0 = com.tencent.worddetect.C20118a.f57008a     // Catch:{ all -> 0x02e4 }
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "MicroMsg.WordDetectModHelper"
            java.lang.String r1 = "decodeFileForDetail not init"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x02e4 }
            monitor-exit(r7)     // Catch:{ all -> 0x02e4 }
            goto L_0x02ef
        L_0x01a3:
            monitor-exit(r7)     // Catch:{ all -> 0x02e4 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x01cc
            java.lang.String r0 = "MicroMsg.WordDetectModHelper"
            java.lang.String r1 = "in decodeFile, file == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            com.tencent.worddetect.WordDetectNative$WordDetectDetailResult r0 = com.tencent.worddetect.C20118a.C20119a.f57012a
            if (r0 == 0) goto L_0x01be
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r1 = r6.f66375b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.worddetect.WordDetectNative$WordDetectDetailResult> r1 = r1.f273350f
            java.lang.String r2 = r6.f66374a
            r1.put(r2, r0)
        L_0x01be:
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine r1 = r6.f66375b
            java.lang.String r2 = r6.f66374a
            xl2.c r3 = new xl2.c
            r3.<init>(r0)
            com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine.m119539a(r1, r2, r3)
            goto L_0x02ef
        L_0x01cc:
            long r9 = java.lang.System.currentTimeMillis()
            wl2.i r0 = com.tencent.worddetect.C20118a.f57011d
            if (r0 != 0) goto L_0x01db
            rw3.a r0 = new rw3.a
            r0.<init>()
            com.tencent.worddetect.C20118a.f57011d = r0
        L_0x01db:
            wl2.f r0 = new wl2.f
            r0.<init>(r2, r3)
            wl2.i r2 = com.tencent.worddetect.C20118a.f57011d
            wl2.h r0 = wl2.C15516e.m14538a(r0, r2)
            r2 = 223(0xdf, float:3.12E-43)
            android.graphics.Bitmap r0 = r0.f42061a     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            if (r0 != 0) goto L_0x01f9
            java.lang.String r0 = "MicroMsg.WordDetectModHelper"
            java.lang.String r3 = "decodeFileForDetail decode bitmap is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r3 = 0
            com.tencent.worddetect.C20118a.m21901b(r6, r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            goto L_0x02ef
        L_0x01f9:
            byte[] r5 = com.tencent.worddetect.C20118a.m21900a(r0)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r5)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            if (r7 == 0) goto L_0x0218
            java.lang.String r0 = "MicroMsg.WordDetectModHelper"
            java.lang.String r3 = "decodeFileForDetail bitmap to BGR error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.worddetect.WordDetectNative$WordDetectDetailResult r0 = com.tencent.worddetect.C20118a.C20119a.f57012a     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.worddetect.C20118a.m21901b(r6, r0)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r3 = 222(0xde, float:3.11E-43)
            r0.mo175911u(r1, r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            goto L_0x02ef
        L_0x0218:
            int r7 = r0.getWidth()     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r0 = r0.getHeight()     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.worddetect.WordDetectNative r11 = com.tencent.worddetect.C20118a.f57009b     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r12 = 3
            int r11 = r11.scanImage(r5, r7, r0, r12)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.String r12 = "MicroMsg.WordDetectModHelper"
            java.lang.String r13 = "decodeFileForDetail data length = %d, w = %d, h = %d, scanImage result %d, session: %s"
            r14 = 5
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r5 = r5.length     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r16 = 0
            r15[r16] = r5     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r7 = 1
            r15[r7] = r5     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r5 = 2
            r15[r5] = r0     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r5 = 3
            r15[r5] = r0     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r15[r8] = r0     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r15)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            if (r11 == 0) goto L_0x0269
            com.tencent.worddetect.WordDetectNative$WordDetectDetailResult r0 = com.tencent.worddetect.C20118a.C20119a.f57012a     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.worddetect.C20118a.m21901b(r6, r0)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r3 = java.lang.Math.abs(r11)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r3 = r3 + 180
            r0.mo175911u(r1, r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            goto L_0x02ef
        L_0x0269:
            com.tencent.worddetect.WordDetectNative$WordDetectDetailResult r0 = new com.tencent.worddetect.WordDetectNative$WordDetectDetailResult     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r0.<init>()     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.worddetect.WordDetectNative r5 = com.tencent.worddetect.C20118a.f57009b     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r5 = r5.getDetailResult(r0)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            if (r5 == 0) goto L_0x0287
            com.tencent.worddetect.WordDetectNative$WordDetectDetailResult r0 = com.tencent.worddetect.C20118a.C20119a.f57012a     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.worddetect.C20118a.m21901b(r6, r0)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r3 = java.lang.Math.abs(r5)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r3 = r3 + 190
            r0.mo175911u(r1, r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            goto L_0x02ef
        L_0x0287:
            java.lang.String r5 = "MicroMsg.WordDetectModHelper"
            java.lang.String r7 = "decodeFileForDetail result %s, detectResult.width: %s, detectResult.height: %s, cost %d, session: %s"
            java.lang.Object[] r11 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            float[] r12 = r0.rate_lang     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r13 = 0
            r11[r13] = r12     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r12 = r0.width     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r13 = 1
            r11[r13] = r12     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            int r12 = r0.height     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r13 = 2
            r11[r13] = r12     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r10 = 3
            r11[r10] = r9     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            r11[r8] = r3     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r11)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            com.tencent.worddetect.C20118a.m21901b(r6, r0)     // Catch:{ Exception -> 0x02ce, Error -> 0x02bd }
            goto L_0x02ef
        L_0x02bd:
            r0 = move-exception
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3.mo175911u(r1, r2)
            java.lang.String r1 = "MicroMsg.WordDetectModHelper"
            java.lang.String r2 = "decodeFileForDetail error"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            goto L_0x02de
        L_0x02ce:
            r0 = move-exception
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3.mo175911u(r1, r2)
            java.lang.String r1 = "MicroMsg.WordDetectModHelper"
            java.lang.String r2 = "decodeFileForDetail exception"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
        L_0x02de:
            com.tencent.worddetect.WordDetectNative$WordDetectDetailResult r0 = com.tencent.worddetect.C20118a.C20119a.f57012a
            com.tencent.worddetect.C20118a.m21901b(r6, r0)
            goto L_0x02ef
        L_0x02e4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x02e4 }
            throw r0
        L_0x02e7:
            java.lang.String r0 = "MicroMsg.ImageWordScanDetailEngine"
            java.lang.String r1 = "wordDetect input is already running and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x02ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.word.C19149b.run():void");
    }
}
