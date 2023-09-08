package p964fd;

import p830xc.C91165a;

/* renamed from: fd.e$$q */
public class e$$q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91165a f252078d;

    /* renamed from: e */
    public final /* synthetic */ C86826e f252079e;

    public e$$q(C86826e eVar, C91165a aVar) {
        this.f252079e = eVar;
        this.f252078d = aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:314|315|(2:318|316)|496|319|320|321|322|323) */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0816, code lost:
        if (r0.mo121938O(r3) != false) goto L_0x0818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0836, code lost:
        if (r0.mo121931H(r3) != false) goto L_0x0818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0b89, code lost:
        if (r0.mo121938O(r3) != false) goto L_0x0b8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0ba4, code lost:
        if (r0.mo121931H(r3) != false) goto L_0x0b8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0bc3, code lost:
        if (r0.mo121940r(r3) != false) goto L_0x0bc5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:322:0x08eb */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0cac  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0cd5  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0d26  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0d28  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r36 = this;
            r1 = r36
            fd.e r2 = r1.f252079e
            xc.a r3 = r1.f252078d
            r2.getClass()
            java.lang.String r4 = r3.mo62543f()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 == 0) goto L_0x0015
            goto L_0x0d2f
        L_0x0015:
            org.json.JSONObject r0 = r3.mo62539b()
            java.lang.String r5 = r2.mo121291y()
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = r2.mo122122p()
            r9 = 0
            r7[r9] = r8
            r8 = 1
            r7[r8] = r4
            java.lang.String r0 = r0.toString()
            r10 = 2
            r7[r10] = r0
            java.lang.String r0 = "*** handler(%s) handleJsApi(%s), data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)
            java.lang.String r0 = "insert"
            boolean r0 = r4.contains(r0)
            java.lang.String r5 = "contain"
            java.lang.String r7 = "objectFit"
            java.lang.String r11 = "position"
            java.lang.String r12 = "needEvent"
            java.lang.String r13 = "autoPauseIfOpenNative"
            java.lang.String r14 = "autoPauseIfNavigate"
            java.lang.String r15 = "muted"
            java.lang.String r6 = "loop"
            java.lang.String r10 = "initialTime"
            java.lang.String r8 = "autoplay"
            java.lang.String r9 = ""
            r19 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.String r1 = "ok"
            r21 = r4
            java.lang.String r4 = "backgroundPoster"
            r22 = r1
            java.lang.String r1 = "title"
            r23 = r4
            java.lang.String r4 = "height"
            r24 = r1
            java.lang.String r1 = "width"
            r25 = r5
            java.lang.String r5 = "filePath"
            r26 = r5
            java.lang.String r5 = "licenseUrl"
            r27 = r5
            java.lang.String r5 = "provisionUrl"
            r28 = r5
            java.lang.String r5 = "isLive"
            r29 = r5
            java.lang.String r5 = "isDrm"
            r30 = r5
            java.lang.String r5 = "preferredPeakBitRate"
            r31 = r5
            java.lang.String r5 = "data"
            r32 = r4
            r33 = r5
            if (r0 == 0) goto L_0x030f
            r2.f252049s = r3
            fd.a r0 = r2.f252016V0
            if (r0 == 0) goto L_0x009d
            com.tencent.mm.plugin.appbrand.jsapi.f r5 = r3.mo62544g()
            r0.mo121258a(r5)
        L_0x009d:
            in0.d r0 = r2.f252033h
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r5 = "insert, media player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
            xc.a r0 = r2.f252049s
            r2.mo121288v(r0)
        L_0x00af:
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r5 = "registerLifecycleListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            fd.j r0 = new fd.j
            r0.<init>(r2)
            r2.f252050t = r0
            r3.mo62538a(r0)
            hd.b r0 = r2.f252047q
            if (r0 == 0) goto L_0x00ca
            r0.mo121933J(r3)
        L_0x00ca:
            android.view.Surface r0 = r2.f252031g
            if (r0 == 0) goto L_0x00e2
            in0.d r0 = r2.f252033h
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r5 = "insert, setSurface"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            in0.d r0 = r2.f252033h
            android.view.Surface r5 = r2.f252031g
            r0.setSurface(r5)
        L_0x00e2:
            org.json.JSONObject r0 = r3.mo62539b()
            r5 = 0
            boolean r8 = r0.optBoolean(r8, r5)
            r2.f252058z = r8
            r4 = 0
            double r4 = r0.optDouble(r10, r4)
            double r4 = r4 * r19
            long r4 = (long) r4
            r2.f252056y = r4
            r4 = 0
            boolean r5 = r0.optBoolean(r6, r4)
            r2.f251993D = r5
            boolean r5 = r0.optBoolean(r15, r4)
            r2.f251994E = r5
            in0.d r6 = r2.f252033h
            r6.setMute(r5)
            r5 = 1
            boolean r6 = r0.optBoolean(r14, r5)
            r2.f252005Q = r6
            boolean r6 = r0.optBoolean(r13, r5)
            r2.f252007R = r6
            boolean r5 = r0.optBoolean(r12, r4)
            r2.f251991B = r5
            if (r5 == 0) goto L_0x0153
            hd.d r4 = r2.f252035i
            if (r4 == 0) goto L_0x0153
            po0.g r4 = (po0.C89421g) r4
            boolean r5 = r3 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b
            if (r5 == 0) goto L_0x012e
            r6 = r3
            com.tencent.mm.plugin.appbrand.extendplugin.b r6 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r6
            r4.f257445b = r6
        L_0x012e:
            r4 = r33
            java.lang.String r6 = r0.optString(r4, r9)
            hd.d r8 = r2.f252035i
            po0.g r8 = (po0.C89421g) r8
            r8.f257449f = r6
            hd.a r8 = r2.f252037j
            if (r8 == 0) goto L_0x0153
            po0.a r8 = (po0.C89392a) r8
            if (r5 == 0) goto L_0x0147
            r5 = r3
            com.tencent.mm.plugin.appbrand.extendplugin.b r5 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r5
            r8.f257403c = r5
        L_0x0147:
            hd.a r5 = r2.f252037j
            po0.a r5 = (po0.C89392a) r5
            r5.getClass()
            gy3.C87412m.m108594g(r6, r4)
            r5.f257402b = r6
        L_0x0153:
            boolean r4 = r0.has(r11)
            if (r4 == 0) goto L_0x0193
            org.json.JSONObject r4 = r0.optJSONObject(r11)
            if (r4 == 0) goto L_0x0193
            r5 = 0
            int r1 = r4.optInt(r1, r5)
            int r1 = js0.C88020k.m109553d(r1)
            r2.f251995F = r1
            r1 = r32
            int r1 = r4.optInt(r1, r5)
            int r1 = js0.C88020k.m109553d(r1)
            r2.f251996G = r1
            java.lang.String r1 = r2.mo121291y()
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r4 = r2.f251995F
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r5] = r4
            int r4 = r2.f251996G
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r6[r5] = r4
            java.lang.String r4 = "insert, size:[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r6)
        L_0x0193:
            r5 = r25
            java.lang.String r1 = r0.optString(r7, r5)
            r2.f252004P = r1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x01a3
            r2.f252004P = r5
        L_0x01a3:
            r1 = 1
            r2.mo121283q(r1)
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r3.mo62544g()
            if (r1 != 0) goto L_0x01b8
            java.lang.String r1 = r2.mo121291y()
            java.lang.String r4 = "updateReferrers, component is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            goto L_0x0225
        L_0x01b8:
            java.lang.Class<km0.a> r4 = km0.C88224a.class
            ra.b r4 = p224ra.C89909e.m112436a(r4)
            km0.a r4 = (km0.C88224a) r4
            if (r4 != 0) goto L_0x01cd
            java.lang.String r1 = r2.mo121291y()
            java.lang.String r4 = "updateReferrers, referrerHelper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            goto L_0x0225
        L_0x01cd:
            km0.c r5 = r2.f252010S0
            if (r5 != 0) goto L_0x01d7
            km0.c r5 = r4.mo117491e4()
            r2.f252010S0 = r5
        L_0x01d7:
            km0.c r5 = r4.mo117493f2(r0, r1)
            if (r5 == 0) goto L_0x01df
            r2.f252010S0 = r5
        L_0x01df:
            java.lang.String r5 = r2.mo121291y()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "updateReferrers, mReferrerPolicy: "
            r6.append(r7)
            km0.c r7 = r2.f252010S0
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            km0.c r5 = km0.C88226c.NO_REFERRER
            km0.c r6 = r2.f252010S0
            if (r5 != r6) goto L_0x0204
            r5 = 0
            r2.f252012T0 = r5
            goto L_0x0225
        L_0x0204:
            java.lang.String r1 = r4.mo117489A4(r1)
            r2.f252012T0 = r1
            java.lang.String r1 = r2.mo121291y()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "updateReferrers, mReferrer: "
            r4.append(r5)
            java.lang.String r5 = r2.f252012T0
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
        L_0x0225:
            in0.d r1 = r2.f252033h
            r4 = r31
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L_0x0236
            double r4 = r0.optDouble(r4)
            r1.mo22535e(r4)
        L_0x0236:
            r1 = r26
            java.lang.String r1 = r0.optString(r1)
            r2.f252003N = r1
            boolean r1 = r2.f252019X
            r4 = r30
            boolean r1 = r0.optBoolean(r4, r1)
            r2.f252019X = r1
            boolean r1 = r2.f252021Y
            r4 = r29
            boolean r1 = r0.optBoolean(r4, r1)
            r2.f252021Y = r1
            java.lang.String r1 = r2.f252023Z
            r4 = r28
            java.lang.String r1 = r0.optString(r4, r1)
            r2.f252023Z = r1
            java.lang.String r1 = r2.f252046p0
            r4 = r27
            java.lang.String r1 = r0.optString(r4, r1)
            r2.f252046p0 = r1
            java.lang.String r1 = r2.f252003N
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x02f0
            hd.b r1 = r2.f252047q
            if (r1 == 0) goto L_0x027b
            xc.a r4 = r2.f252049s
            in0.d r5 = r2.f252033h
            java.lang.String r6 = r2.f252003N
            r1.mo121925B(r4, r5, r6)
        L_0x027b:
            java.lang.String r1 = r2.f252003N
            hd.b r4 = r2.f252047q
            if (r4 == 0) goto L_0x0285
            java.lang.String r1 = r4.mo121930G(r3, r1)
        L_0x0285:
            java.lang.String r4 = r2.mo121291y()
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r2.f252003N
            r7 = 0
            r6[r7] = r5
            r5 = 1
            r6[r5] = r1
            java.lang.String r5 = "insert, path:%s, proxy:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x02f0
            boolean r4 = r2.f252019X
            if (r4 == 0) goto L_0x02dc
            java.lang.String r4 = r2.f252023Z
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x02ad
            r4 = 0
            goto L_0x02af
        L_0x02ad:
            java.lang.String r4 = r2.f252023Z
        L_0x02af:
            java.lang.String r5 = r2.f252046p0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x02b9
            r5 = 0
            goto L_0x02bb
        L_0x02b9:
            java.lang.String r5 = r2.f252046p0
        L_0x02bb:
            boolean r6 = r2.f252021Y
            java.lang.String r7 = r2.mo121291y()
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r10 = 0
            r8[r10] = r4
            r10 = 1
            r8[r10] = r5
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            r11 = 2
            r8[r11] = r10
            java.lang.String r10 = "insert, isDrm, provisionUrl:%s, licenseUrl:%s, isLive: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r8)
            in0.d r7 = r2.f252033h
            r7.mo22547r(r1, r4, r5, r6)
            goto L_0x02e3
        L_0x02dc:
            in0.d r4 = r2.f252033h
            java.lang.String r5 = r2.f252012T0
            r4.mo22534d(r1, r5)
        L_0x02e3:
            java.lang.String r1 = r2.mo121291y()
            java.lang.String r4 = "insert, media player prepare async"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r1 = 1
            r2.mo121271F(r1)
        L_0x02f0:
            java.lang.String r1 = r2.f252039k1
            r4 = r24
            java.lang.String r1 = r0.optString(r4, r1)
            r2.f252039k1 = r1
            java.lang.String r1 = r2.f252040l1
            r4 = r23
            java.lang.String r1 = r0.optString(r4, r1)
            r2.f252040l1 = r1
            r2.mo121286t(r3, r0)
            r1 = r22
            r3.mo62549j(r1)
            r1 = r9
            goto L_0x06c0
        L_0x030f:
            r34 = r22
            r5 = r26
            r0 = r28
            r4 = r31
            r26 = r1
            r22 = r7
            r28 = r9
            r7 = r27
            r1 = r29
            r27 = r11
            r11 = r30
            java.lang.String r9 = "update"
            r29 = r12
            r12 = r21
            boolean r9 = r12.contains(r9)
            java.lang.String r12 = "fail"
            r30 = r13
            java.lang.String r13 = "MicroMsg.VideoCast.AppBrandVideoCastHandler"
            r31 = r13
            if (r9 == 0) goto L_0x06c4
            in0.d r9 = r2.f252033h
            if (r9 != 0) goto L_0x034f
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r1 = "update, media player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            r3.mo62549j(r12)
            r1 = r28
            goto L_0x06c0
        L_0x034f:
            org.json.JSONObject r9 = r3.mo62539b()
            in0.d r12 = r2.f252033h
            boolean r35 = r9.has(r4)
            if (r35 == 0) goto L_0x0365
            r35 = r14
            double r13 = r9.optDouble(r4)
            r12.mo22535e(r13)
            goto L_0x0367
        L_0x0365:
            r35 = r14
        L_0x0367:
            boolean r4 = r2.f252019X
            boolean r4 = r9.optBoolean(r11, r4)
            r2.f252019X = r4
            boolean r4 = r2.f252021Y
            boolean r1 = r9.optBoolean(r1, r4)
            r2.f252021Y = r1
            java.lang.String r1 = r2.f252023Z
            java.lang.String r0 = r9.optString(r0, r1)
            r2.f252023Z = r0
            java.lang.String r0 = r2.f252046p0
            java.lang.String r0 = r9.optString(r7, r0)
            r2.f252046p0 = r0
            boolean r0 = r9.has(r5)
            if (r0 == 0) goto L_0x0427
            java.lang.String r0 = r9.optString(r5)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0427
            java.lang.String r1 = r2.f252003N
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0427
            r2.f252003N = r0
            hd.b r1 = r2.f252047q
            if (r1 == 0) goto L_0x03a9
            java.lang.String r0 = r1.mo121930G(r3, r0)
        L_0x03a9:
            java.lang.String r1 = r2.mo121291y()
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r4 = r2.f252003N
            r11 = 0
            r7[r11] = r4
            r4 = 1
            r7[r4] = r0
            java.lang.String r4 = "update, path:%s, proxy:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r7)
            in0.d r1 = r2.f252033h
            if (r1 == 0) goto L_0x03c8
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x03d0
        L_0x03c8:
            r2.f252009S = r11
            r2.mo121281P()
            r2.mo121275J(r3)
        L_0x03d0:
            hd.b r1 = r2.f252047q
            if (r1 == 0) goto L_0x03dd
            xc.a r4 = r2.f252049s
            in0.d r7 = r2.f252033h
            java.lang.String r11 = r2.f252003N
            r1.mo121925B(r4, r7, r11)
        L_0x03dd:
            r2.mo121280O()
            boolean r1 = r2.f252019X
            if (r1 == 0) goto L_0x041e
            java.lang.String r1 = r2.f252023Z
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x03ee
            r1 = 0
            goto L_0x03f0
        L_0x03ee:
            java.lang.String r1 = r2.f252023Z
        L_0x03f0:
            java.lang.String r4 = r2.f252046p0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x03fa
            r4 = 0
            goto L_0x03fc
        L_0x03fa:
            java.lang.String r4 = r2.f252046p0
        L_0x03fc:
            boolean r7 = r2.f252021Y
            java.lang.String r11 = r2.mo121291y()
            r12 = 3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r12 = 0
            r13[r12] = r1
            r12 = 1
            r13[r12] = r4
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r7)
            r14 = 2
            r13[r14] = r12
            java.lang.String r12 = "update, isDrm, provisionUrl:%s, licenseUrl:%s, isLive: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r13)
            in0.d r11 = r2.f252033h
            r11.mo22547r(r0, r1, r4, r7)
            goto L_0x0425
        L_0x041e:
            in0.d r1 = r2.f252033h
            java.lang.String r4 = r2.f252012T0
            r1.mo22534d(r0, r4)
        L_0x0425:
            r0 = 1
            goto L_0x0428
        L_0x0427:
            r0 = 0
        L_0x0428:
            android.view.Surface r1 = r2.f252031g
            if (r1 == 0) goto L_0x0482
            in0.d r1 = r2.f252033h
            if (r1 == 0) goto L_0x0482
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f252038j1
            boolean r1 = r1.get()
            java.lang.String r4 = r2.mo121291y()
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            boolean r11 = r2.f252011T
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12 = 0
            r7[r12] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r12 = 1
            r7[r12] = r11
            android.view.Surface r11 = r2.f252014U0
            if (r11 == 0) goto L_0x0453
            r11 = 1
            goto L_0x0454
        L_0x0453:
            r11 = 0
        L_0x0454:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12 = 2
            r7[r12] = r11
            java.lang.String r11 = "update, setSurface, WebViewInBackground: %b, JustPlayAudio: %b, SurfacePipSet exist: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r7)
            boolean r4 = r2.f252011T
            if (r4 != 0) goto L_0x046f
            if (r1 != 0) goto L_0x0482
            in0.d r1 = r2.f252033h
            android.view.Surface r4 = r2.f252031g
            r1.setSurface(r4)
            goto L_0x0482
        L_0x046f:
            android.view.Surface r4 = r2.f252014U0
            if (r4 == 0) goto L_0x0479
            in0.d r1 = r2.f252033h
            r1.setSurface(r4)
            goto L_0x0482
        L_0x0479:
            if (r1 != 0) goto L_0x0482
            in0.d r1 = r2.f252033h
            android.view.Surface r4 = r2.f252031g
            r1.setSurface(r4)
        L_0x0482:
            boolean r1 = r9.has(r8)
            if (r1 == 0) goto L_0x0490
            boolean r1 = r2.f252058z
            boolean r1 = r9.optBoolean(r8, r1)
            r2.f252058z = r1
        L_0x0490:
            boolean r1 = r9.has(r10)
            if (r1 == 0) goto L_0x04a1
            r7 = 0
            double r7 = r9.optDouble(r10, r7)
            double r7 = r7 * r19
            long r7 = (long) r7
            r2.f252056y = r7
        L_0x04a1:
            boolean r1 = r9.has(r6)
            if (r1 == 0) goto L_0x04af
            boolean r1 = r2.f251993D
            boolean r1 = r9.optBoolean(r6, r1)
            r2.f251993D = r1
        L_0x04af:
            boolean r1 = r9.has(r15)
            if (r1 == 0) goto L_0x04f7
            boolean r1 = r2.f251994E
            boolean r4 = r9.optBoolean(r15, r1)
            r2.f251994E = r4
            in0.d r6 = r2.f252033h
            r6.setMute(r4)
            boolean r4 = r2.f251994E
            if (r4 == r1) goto L_0x04f7
            boolean r1 = r2.mo121268C()
            if (r1 == 0) goto L_0x04f7
            boolean r1 = r2.f252011T
            if (r1 != 0) goto L_0x04f7
            boolean r1 = r2.f252015V
            if (r1 != 0) goto L_0x04f7
            boolean r1 = r2.f251994E
            if (r1 == 0) goto L_0x04e8
            java.lang.String r1 = r2.mo121291y()
            java.lang.String r4 = "video muted, abandonFocus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            com.tencent.mm.plugin.appbrand.jsapi.media.i2 r1 = r2.f252018W0
            r1.mo115002L()
            goto L_0x04f7
        L_0x04e8:
            java.lang.String r1 = r2.mo121291y()
            java.lang.String r4 = "video unmuted, requestFocus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            com.tencent.mm.plugin.appbrand.jsapi.media.i2 r1 = r2.f252018W0
            r1.requestFocus()
        L_0x04f7:
            r1 = r35
            boolean r4 = r9.has(r1)
            if (r4 == 0) goto L_0x0507
            boolean r4 = r2.f252005Q
            boolean r1 = r9.optBoolean(r1, r4)
            r2.f252005Q = r1
        L_0x0507:
            r1 = r30
            boolean r4 = r9.has(r1)
            if (r4 == 0) goto L_0x0517
            boolean r4 = r2.f252007R
            boolean r1 = r9.optBoolean(r1, r4)
            r2.f252007R = r1
        L_0x0517:
            r1 = r29
            boolean r4 = r9.has(r1)
            if (r4 == 0) goto L_0x0527
            boolean r4 = r2.f251991B
            boolean r1 = r9.optBoolean(r1, r4)
            r2.f251991B = r1
        L_0x0527:
            boolean r1 = r2.f251991B
            if (r1 == 0) goto L_0x0573
            hd.d r1 = r2.f252035i
            if (r1 == 0) goto L_0x0573
            po0.g r1 = (po0.C89421g) r1
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b
            if (r4 == 0) goto L_0x053a
            r6 = r3
            com.tencent.mm.plugin.appbrand.extendplugin.b r6 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r6
            r1.f257445b = r6
        L_0x053a:
            r1 = r28
            r6 = r33
            java.lang.String r7 = r9.optString(r6, r1)
            boolean r8 = r9.has(r6)
            if (r8 == 0) goto L_0x054e
            hd.d r8 = r2.f252035i
            po0.g r8 = (po0.C89421g) r8
            r8.f257449f = r7
        L_0x054e:
            hd.a r8 = r2.f252037j
            if (r8 == 0) goto L_0x0575
            boolean r8 = r9.has(r6)
            if (r8 == 0) goto L_0x0564
            hd.a r8 = r2.f252037j
            po0.a r8 = (po0.C89392a) r8
            r8.getClass()
            gy3.C87412m.m108594g(r7, r6)
            r8.f257402b = r7
        L_0x0564:
            hd.a r6 = r2.f252037j
            po0.a r6 = (po0.C89392a) r6
            r6.getClass()
            if (r4 == 0) goto L_0x0575
            r4 = r3
            com.tencent.mm.plugin.appbrand.extendplugin.b r4 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r4
            r6.f257403c = r4
            goto L_0x0575
        L_0x0573:
            r1 = r28
        L_0x0575:
            r4 = r27
            boolean r6 = r9.has(r4)
            if (r6 == 0) goto L_0x05ce
            org.json.JSONObject r4 = r9.optJSONObject(r4)
            if (r4 == 0) goto L_0x05c8
            int r6 = r2.f251995F
            int r7 = r2.f251996G
            r8 = r26
            int r8 = r4.optInt(r8, r6)
            int r8 = js0.C88020k.m109553d(r8)
            r2.f251995F = r8
            r8 = r32
            int r4 = r4.optInt(r8, r7)
            int r4 = js0.C88020k.m109553d(r4)
            r2.f251996G = r4
            java.lang.String r4 = r2.mo121291y()
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r10 = r2.f251995F
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 0
            r8[r11] = r10
            int r10 = r2.f251996G
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 1
            r8[r11] = r10
            java.lang.String r10 = "update, size:[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r8)
            int r4 = r2.f251995F
            if (r4 != r6) goto L_0x05c6
            int r4 = r2.f251996G
            if (r4 == r7) goto L_0x05c8
        L_0x05c6:
            r4 = 1
            goto L_0x05c9
        L_0x05c8:
            r4 = 0
        L_0x05c9:
            r6 = r4
            r7 = r22
            r4 = 1
            goto L_0x05d2
        L_0x05ce:
            r7 = r22
            r4 = 0
            r6 = 0
        L_0x05d2:
            boolean r8 = r9.has(r7)
            if (r8 == 0) goto L_0x05f4
            java.lang.String r4 = r2.f252004P
            java.lang.String r7 = r9.optString(r7, r4)
            r2.f252004P = r7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x05ea
            r7 = r25
            r2.f252004P = r7
        L_0x05ea:
            java.lang.String r7 = r2.f252004P
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x05f3
            r6 = 0
        L_0x05f3:
            r4 = 1
        L_0x05f4:
            if (r4 == 0) goto L_0x05f9
            r2.mo121283q(r6)
        L_0x05f9:
            r2.mo121286t(r3, r9)
            java.lang.String r4 = r9.optString(r5)
            po0.b r5 = r2.f252048r
            if (r5 == 0) goto L_0x0697
            po0.b r5 = r2.f252048r
            boolean r6 = r5.f257412g
            if (r6 != 0) goto L_0x060d
            r18 = 0
            goto L_0x0611
        L_0x060d:
            boolean r5 = r5.f257413h
            r18 = r5
        L_0x0611:
            if (r18 == 0) goto L_0x0697
            po0.b r5 = r2.f252048r
            r5.getClass()
            java.lang.String r6 = "updateVideoPath"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "updateVideoPath: ["
            r6.append(r7)
            r6.append(r4)
            r7 = 93
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.lang.CharSequence r6 = z04.C112550d0.m153799i0(r4)
            java.lang.String r6 = r6.toString()
            boolean r6 = z04.C112551y.m153811k(r6)
            if (r6 == 0) goto L_0x0649
            goto L_0x0697
        L_0x0649:
            qo0.q r6 = r5.mo123733b()
            r6.mo124051h()
            java.lang.String r6 = r5.f257411f
            boolean r6 = gy3.C87412m.m108589b(r4, r6)
            if (r6 == 0) goto L_0x0659
            goto L_0x0697
        L_0x0659:
            qo0.c r6 = r5.f257409d
            if (r6 == 0) goto L_0x0660
            r6.setVideoPath(r4)
        L_0x0660:
            r5.f257411f = r4
            r4 = 1
            r5.mo123734c(r4)
            qo0.q r4 = r5.mo123733b()
            po0.d r6 = new po0.d
            r6.<init>(r5)
            r4.getClass()
            qo0.d0 r8 = r4.f258094e
            ej0.c r8 = r8.mo124027b()
            qo0.c0 r10 = new qo0.c0
            r10.<init>(r4, r6)
            r8.mo121003e(r10)
            qo0.q r4 = r5.mo123733b()
            int r4 = r4.f258093d
            r6 = -1
            if (r4 != r6) goto L_0x0692
            qo0.q r4 = r5.mo123733b()
            r5 = 8
            r4.f258093d = r5
            goto L_0x0697
        L_0x0692:
            java.lang.String r4 = "discard a updateVideoPath report event"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
        L_0x0697:
            java.lang.String r4 = r2.f252039k1
            r5 = r24
            java.lang.String r4 = r9.optString(r5, r4)
            r2.f252039k1 = r4
            java.lang.String r4 = r2.f252040l1
            r5 = r23
            java.lang.String r4 = r9.optString(r5, r4)
            r2.f252040l1 = r4
            if (r0 == 0) goto L_0x06bb
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r4 = "update, media player prepare async"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            r4 = 1
            r2.mo121271F(r4)
        L_0x06bb:
            r4 = r34
            r3.mo62549j(r4)
        L_0x06c0:
            r28 = r1
            goto L_0x0cfc
        L_0x06c4:
            r1 = r28
            r7 = r31
            r6 = r33
            r4 = r34
            java.lang.String r0 = "operate"
            r5 = r21
            boolean r8 = r5.contains(r0)
            java.lang.String r9 = "stop"
            java.lang.String r10 = "type"
            if (r8 == 0) goto L_0x0744
            java.lang.String r8 = "Background"
            boolean r8 = r5.contains(r8)
            if (r8 == 0) goto L_0x0744
            in0.d r0 = r2.f252033h
            if (r0 != 0) goto L_0x06f8
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r4 = "operateBackground, media player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            r3.mo62549j(r12)
            goto L_0x0cf8
        L_0x06f8:
            org.json.JSONObject r0 = r3.mo62539b()
            java.lang.String r0 = r0.optString(r10)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x0cf8
            java.lang.String r6 = r2.mo121291y()
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r0
            java.lang.String r8 = "operateBackground, type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x073a
            boolean r0 = r2.mo121289w(r3)
            if (r0 == 0) goto L_0x0738
            boolean r6 = r2.f252015V
            if (r6 == 0) goto L_0x0738
            java.lang.String r6 = r2.mo121291y()
            java.lang.String r7 = "operateBackground, isRuntimeInBackground, setPlayingWhenEnterBackground false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r7 = 0
            r6.<init>(r7)
            r2.f252017W = r6
        L_0x0738:
            r9 = r0
            goto L_0x073b
        L_0x073a:
            r9 = 0
        L_0x073b:
            if (r9 == 0) goto L_0x073e
            goto L_0x073f
        L_0x073e:
            r4 = r12
        L_0x073f:
            r3.mo62549j(r4)
            goto L_0x0cf8
        L_0x0744:
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0cff
            in0.d r0 = r2.f252033h
            if (r0 != 0) goto L_0x075d
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r4 = "operate, media player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            r3.mo62549j(r12)
            goto L_0x0cf8
        L_0x075d:
            org.json.JSONObject r0 = r3.mo62539b()
            java.lang.String r8 = r0.optString(r10)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r11 != 0) goto L_0x0cf8
            java.lang.String r11 = r2.mo121291y()
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r13 = 0
            r14[r13] = r8
            java.lang.String r13 = "operate, type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r14)
            java.lang.String r11 = "startCasting"
            boolean r13 = r8.equalsIgnoreCase(r11)
            if (r13 == 0) goto L_0x0786
            r13 = 1
            goto L_0x0795
        L_0x0786:
            po0.b r13 = r2.f252048r
            if (r13 != 0) goto L_0x078c
        L_0x078a:
            r13 = 0
            goto L_0x0795
        L_0x078c:
            po0.b r13 = r2.f252048r
            boolean r14 = r13.f257412g
            if (r14 != 0) goto L_0x0793
            goto L_0x078a
        L_0x0793:
            boolean r13 = r13.f257413h
        L_0x0795:
            java.lang.String r14 = "exitPictureInPicture"
            java.lang.String r15 = "seek"
            r28 = r1
            java.lang.String r1 = "exitFullScreen"
            r16 = r12
            java.lang.String r12 = "requestFullScreen"
            r22 = r4
            java.lang.String r4 = "play"
            r21 = r5
            java.lang.String r5 = "pause"
            r17 = r14
            java.lang.String r14 = "exitFullscreen"
            r23 = r9
            java.lang.String r9 = "requestFullscreen"
            r24 = r4
            r25 = r5
            if (r13 == 0) goto L_0x0a6f
            java.lang.String r13 = r2.mo121291y()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r8
            java.lang.String r4 = "video cast operate, type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r5)
            po0.b r4 = r2.f252048r
            if (r4 != 0) goto L_0x07df
            po0.b r4 = r2.f252048r
            if (r4 == 0) goto L_0x07d5
            goto L_0x07df
        L_0x07d5:
            hd.b r4 = r2.f252047q
            hd.a r5 = r2.f252037j
            po0.b r4 = r4.mo121935L(r5, r3)
            r2.f252048r = r4
        L_0x07df:
            po0.b r4 = r2.f252048r
            java.lang.String r5 = r2.f252003N
            r4.getClass()
            java.lang.String r13 = "path"
            gy3.C87412m.m108594g(r5, r13)
            qo0.c r13 = r4.f257409d
            if (r13 == 0) goto L_0x07f3
            r13.setVideoPath(r5)
        L_0x07f3:
            r4.f257411f = r5
            po0.b r4 = r2.f252048r
            in0.d r5 = r2.f252033h
            if (r5 == 0) goto L_0x07fe
            r5.getCurrentPosition()
        L_0x07fe:
            r4.getClass()
            boolean r4 = r8.equalsIgnoreCase(r12)
            if (r4 == 0) goto L_0x0821
            java.lang.String r0 = r2.mo121291y()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            hd.b r0 = r2.f252047q
            if (r0 == 0) goto L_0x081a
            boolean r0 = r0.mo121938O(r3)
            if (r0 == 0) goto L_0x081a
        L_0x0818:
            r9 = 1
            goto L_0x081b
        L_0x081a:
            r9 = 0
        L_0x081b:
            r4 = r23
            r5 = r25
            goto L_0x0ba7
        L_0x0821:
            boolean r1 = r8.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0839
            java.lang.String r0 = r2.mo121291y()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            hd.b r0 = r2.f252047q
            if (r0 == 0) goto L_0x081a
            boolean r0 = r0.mo121931H(r3)
            if (r0 == 0) goto L_0x081a
            goto L_0x0818
        L_0x0839:
            po0.b r1 = r2.f252048r
            r1.getClass()
            java.lang.String r4 = r0.optString(r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "handleOperate: type = "
            r5.append(r9)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            if (r4 == 0) goto L_0x0a68
            int r5 = r4.hashCode()
            java.lang.String r9 = "action"
            switch(r5) {
                case -1983381905: goto L_0x0a4a;
                case -1491869371: goto L_0x0a0f;
                case 3443508: goto L_0x09fb;
                case 3526264: goto L_0x0984;
                case 106440182: goto L_0x094b;
                case 420897153: goto L_0x092d;
                case 1082113260: goto L_0x0863;
                default: goto L_0x0861;
            }
        L_0x0861:
            goto L_0x0a68
        L_0x0863:
            java.lang.String r0 = "reconnectCasting"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x086e
            goto L_0x0a68
        L_0x086e:
            qo0.c r0 = r1.f257409d
            if (r0 == 0) goto L_0x0876
            r4 = 5
            r0.mo116774es(r4)
        L_0x0876:
            qo0.q r0 = r1.mo123733b()
            qo0.d0 r1 = r0.f258094e
            ej0.c r1 = r1.mo124027b()
            ej0.e r1 = r1.f251386e
            ej0.e$a r1 = r1.f167798a
            ej0.e$a r4 = ej0.C58608e.C58609a.Playing
            if (r1 != r4) goto L_0x0896
            hd.a r0 = r0.f258091b
            po0.a r0 = (po0.C89392a) r0
            r1 = 1
            r0.mo123731e(r1)
            r4 = r23
            r5 = r25
            goto L_0x0bc5
        L_0x0896:
            qo0.d0 r1 = r0.f258094e
            qo0.x r4 = new qo0.x
            r4.<init>(r0)
            r1.getClass()
            java.lang.String r5 = "MicroMsg.VideoCast.VideoCastDeviceManager"
            v34.b r0 = r1.f258036g     // Catch:{ Exception -> 0x08f1 }
            r0.mo183371b()     // Catch:{ Exception -> 0x08f1 }
            ej0.a r0 = ej0.C58606a.m68054a()     // Catch:{ Exception -> 0x08f1 }
            r6 = 1
            r0.f167795a = r6     // Catch:{ Exception -> 0x08f1 }
            java.util.Map<java.lang.String, ej0.c> r6 = r0.f167796b     // Catch:{ Exception -> 0x08f1 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x08f1 }
            java.util.Collection r6 = r6.values()     // Catch:{ Exception -> 0x08f1 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x08f1 }
        L_0x08ba:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x08f1 }
            if (r7 == 0) goto L_0x08d0
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x08f1 }
            ej0.c r7 = (ej0.C86525c) r7     // Catch:{ Exception -> 0x08f1 }
            r7.mo121007h()     // Catch:{ Exception -> 0x08f1 }
            r7.mo121008i()     // Catch:{ Exception -> 0x08f1 }
            r9 = 0
            r7.f251389h = r9     // Catch:{ Exception -> 0x08f1 }
            goto L_0x08ba
        L_0x08d0:
            qo0.d0$a r6 = r1.f258039j     // Catch:{ Exception -> 0x08f1 }
            r0.mo83499d(r6)     // Catch:{ Exception -> 0x08f1 }
            qo0.d0$b r6 = r1.f258038i     // Catch:{ Exception -> 0x08f1 }
            r0.mo83499d(r6)     // Catch:{ Exception -> 0x08f1 }
            java.util.Map<java.lang.String, ej0.c> r0 = r0.f167796b     // Catch:{ Exception -> 0x08f1 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x08f1 }
            r0.clear()     // Catch:{ Exception -> 0x08f1 }
            r6 = 0
            ej0.C58606a.f167794d = r6     // Catch:{ Exception -> 0x08f1 }
            int r0 = fj0.C86898q.f252215h     // Catch:{ a -> 0x08eb }
            fj0.q r0 = fj0.C86898q.C59104e.f169066a     // Catch:{ a -> 0x08eb }
            r0.mo121345a()     // Catch:{ a -> 0x08eb }
        L_0x08eb:
            fj0.l r0 = fj0.C86883l.C86886c.f252190a     // Catch:{ Exception -> 0x08f1 }
            r0.mo121336a()     // Catch:{ Exception -> 0x08f1 }
            goto L_0x090a
        L_0x08f1:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Error happen while cleaning up "
            r6.append(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x090a:
            boolean r0 = r1.mo124029e()
            if (r0 != 0) goto L_0x0918
            java.lang.String r0 = "reconnect: not enableRouter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0a68
        L_0x0918:
            r1.f258037h = r4
            ej0.a r0 = ej0.C58606a.m68054a()
            qo0.d0$b r4 = r1.f258038i
            r0.mo83497b(r4)
            r1.mo124028c()
            r4 = 0
            r5 = 1
            qo0.C89731d0.m112187d(r1, r4, r5, r4)
            goto L_0x0a68
        L_0x092d:
            r5 = 1
            boolean r0 = r4.equals(r11)
            if (r0 != 0) goto L_0x0936
            goto L_0x0a68
        L_0x0936:
            qo0.q r0 = r1.mo123733b()
            po0.c r4 = new po0.c
            r4.<init>(r1)
            r0.f258097h = r4
            qo0.q r0 = r1.mo123733b()
            r1 = 0
            r0.mo124048e(r5, r1)
            goto L_0x0a68
        L_0x094b:
            r5 = r25
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L_0x0955
            goto L_0x0a19
        L_0x0955:
            qo0.q r0 = r1.mo123733b()
            qo0.s r1 = qo0.C12897s.f36882d
            r0.getClass()
            gy3.C87412m.m108594g(r1, r9)
            qo0.d0 r4 = r0.f258094e
            ej0.c r4 = r4.mo124027b()
            qo0.t r6 = new qo0.t
            r6.<init>(r0, r1)
            ej0.f r0 = r4.f251384c
            if (r0 == 0) goto L_0x0a6a
            dj0.f r1 = new dj0.f
            java.lang.String r0 = r4.mo120999a(r0)
            ej0.f r7 = r4.f251384c
            java.lang.String r7 = r7.f251396a
            r1.<init>(r0, r7)
            fj0.q r0 = r4.f251383b
            r0.mo121351g(r1, r6)
            goto L_0x0a6a
        L_0x0984:
            r5 = r25
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x098e
            goto L_0x0a19
        L_0x098e:
            r9 = -1
            boolean r4 = r0.has(r6)
            if (r4 == 0) goto L_0x09dc
            org.json.JSONArray r0 = r0.optJSONArray(r6)
            if (r0 == 0) goto L_0x09d6
            int r4 = r0.length()
            if (r4 != 0) goto L_0x09a3
            goto L_0x09d6
        L_0x09a3:
            r4 = 0
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r11 = r0.optDouble(r4, r11)
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x09c0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            r0[r4] = r11
            java.lang.String r11 = "parseSeekPosition, invalid position:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r11, r0)
            goto L_0x09dc
        L_0x09c0:
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Double r6 = java.lang.Double.valueOf(r11)
            r0[r4] = r6
            java.lang.String r4 = "parseSeekPosition, position:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            double r9 = (double) r0
            double r11 = r11 * r9
            long r9 = (long) r11
            goto L_0x09dc
        L_0x09d6:
            java.lang.String r0 = "parseSeekPosition, data array is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x09dc:
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x09f2
            qo0.q r0 = r1.mo123733b()
            po0.b$c r1 = po0.C89402b.f257404m
            int r4 = (int) r9
            java.lang.String r1 = r1.mo87462a(r4)
            r0.mo124049f(r1)
            goto L_0x0a6a
        L_0x09f2:
            java.lang.String r0 = "invalid seek position"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = r23
            goto L_0x0b06
        L_0x09fb:
            r7 = r24
            r5 = r25
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L_0x0a06
            goto L_0x0a55
        L_0x0a06:
            qo0.q r0 = r1.mo123733b()
            r1 = -1
            r0.mo124047d(r1, r1)
            goto L_0x0a6a
        L_0x0a0f:
            r5 = r25
            java.lang.String r0 = "exitCasting"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0a1a
        L_0x0a19:
            goto L_0x0a55
        L_0x0a1a:
            qo0.c r0 = r1.f257409d
            if (r0 == 0) goto L_0x0a22
            r4 = 6
            r0.mo116774es(r4)
        L_0x0a22:
            qo0.q r0 = r1.mo123733b()
            qo0.b0 r4 = qo0.C12895b0.f36880d
            r0.getClass()
            gy3.C87412m.m108594g(r4, r9)
            qo0.d0 r6 = r0.f258094e
            ej0.c r6 = r6.mo124027b()
            qo0.c0 r7 = new qo0.c0
            r7.<init>(r0, r4)
            r6.mo121003e(r7)
            qo0.q r0 = r1.mo123733b()
            r0.mo124045b()
            r0 = 0
            r1.f257413h = r0
            r1.mo123734c(r0)
            goto L_0x0a6a
        L_0x0a4a:
            r5 = r25
            java.lang.String r0 = "switchCasting"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0a56
        L_0x0a55:
            goto L_0x0a6a
        L_0x0a56:
            qo0.c r0 = r1.f257409d
            if (r0 == 0) goto L_0x0a5e
            r4 = 4
            r0.mo116774es(r4)
        L_0x0a5e:
            qo0.q r0 = r1.mo123733b()
            r4 = 0
            r10 = 1
            r0.mo124048e(r4, r10)
            goto L_0x0a6b
        L_0x0a68:
            r5 = r25
        L_0x0a6a:
            r10 = 1
        L_0x0a6b:
            r4 = r23
            goto L_0x0bc5
        L_0x0a6f:
            r7 = r24
            r5 = r25
            r4 = 0
            r10 = 1
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0a84
            boolean r0 = r2.mo121270E(r4, r10)
        L_0x0a7f:
            r9 = r0
            r4 = r23
            goto L_0x0ba7
        L_0x0a84:
            boolean r7 = r8.equalsIgnoreCase(r5)
            if (r7 == 0) goto L_0x0a8f
            boolean r0 = r2.mo121269D(r4)
            goto L_0x0a7f
        L_0x0a8f:
            r4 = r23
            boolean r7 = r8.equalsIgnoreCase(r4)
            if (r7 == 0) goto L_0x0ab6
            boolean r0 = r2.mo121281P()
            if (r0 == 0) goto L_0x0ab3
            boolean r1 = r2.f252015V
            if (r1 == 0) goto L_0x0ab3
            java.lang.String r1 = r2.mo121291y()
            java.lang.String r6 = "stop, isRuntimeInBackground, setPlayingWhenEnterBackground false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r6 = 0
            r1.<init>(r6)
            r2.f252017W = r1
        L_0x0ab3:
            r9 = r0
            goto L_0x0ba7
        L_0x0ab6:
            boolean r7 = r8.equalsIgnoreCase(r15)
            if (r7 == 0) goto L_0x0b09
            in0.d r1 = r2.f252033h
            if (r1 == 0) goto L_0x0b06
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x0b06
            org.json.JSONArray r0 = r0.optJSONArray(r6)
            if (r0 == 0) goto L_0x0afc
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0ad3
            goto L_0x0afc
        L_0x0ad3:
            r1 = 0
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r6 = r0.optDouble(r1, r6)
            r9 = 0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0af4
            java.lang.String r0 = r2.mo121291y()
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r9[r1] = r6
            java.lang.String r1 = "seek, invalid position:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r9)
            goto L_0x0b06
        L_0x0af4:
            double r6 = r6 * r19
            long r0 = (long) r6
            r2.mo121277L(r0)
            goto L_0x0bc5
        L_0x0afc:
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r1 = "seek, data array is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x0b06:
            r6 = 0
            goto L_0x0bca
        L_0x0b09:
            java.lang.String r7 = "playbackRate"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0b73
            in0.d r1 = r2.f252033h
            if (r1 == 0) goto L_0x0b06
            boolean r1 = r0.has(r6)
            if (r1 == 0) goto L_0x0b06
            org.json.JSONArray r0 = r0.optJSONArray(r6)
            if (r0 == 0) goto L_0x0b67
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0b29
            goto L_0x0b67
        L_0x0b29:
            r6 = 0
            r9 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r0 = r0.optDouble(r6, r9)
            r9 = 0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0b4b
            java.lang.String r7 = r2.mo121291y()
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9[r6] = r0
            java.lang.String r0 = "speed, invalid rate:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r0, r9)
            goto L_0x0bca
        L_0x0b4b:
            r9 = 1
            java.lang.String r7 = r2.mo121291y()
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            r9[r6] = r10
            java.lang.String r6 = "speed, speed:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r9)
            in0.d r6 = r2.f252033h
            float r0 = (float) r0
            boolean r0 = r6.mo22543l(r0)
            goto L_0x0ab3
        L_0x0b67:
            r6 = 0
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r1 = "speed, data array is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x0bca
        L_0x0b73:
            r6 = 0
            boolean r0 = r8.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0b8f
            java.lang.String r0 = r2.mo121291y()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            hd.b r0 = r2.f252047q
            if (r0 == 0) goto L_0x0b8d
            boolean r0 = r0.mo121938O(r3)
            if (r0 == 0) goto L_0x0b8d
        L_0x0b8b:
            r9 = 1
            goto L_0x0ba7
        L_0x0b8d:
            r9 = 0
            goto L_0x0ba7
        L_0x0b8f:
            boolean r0 = r8.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0bab
            java.lang.String r0 = r2.mo121291y()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            hd.b r0 = r2.f252047q
            if (r0 == 0) goto L_0x0b8d
            boolean r0 = r0.mo121931H(r3)
            if (r0 == 0) goto L_0x0b8d
            goto L_0x0b8b
        L_0x0ba7:
            r1 = r17
            goto L_0x0ca3
        L_0x0bab:
            java.lang.String r0 = "setScreenBrightness"
            boolean r1 = r8.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0bce
            java.lang.String r1 = r2.mo121291y()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            hd.b r0 = r2.f252047q
            if (r0 == 0) goto L_0x0bca
            boolean r0 = r0.mo121940r(r3)
            if (r0 == 0) goto L_0x0bca
        L_0x0bc5:
            r1 = r17
            r7 = 1
            goto L_0x0c93
        L_0x0bca:
            r1 = r17
            goto L_0x0ca2
        L_0x0bce:
            r1 = r17
            boolean r0 = r8.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0bdd
            yc.d<fd.e0> r0 = r2.f252025a1
            r0.mo125356b(r3)
            goto L_0x0ca2
        L_0x0bdd:
            java.lang.String r0 = "requestBackgroundPlayback"
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0c95
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "enableBackgroundPlayAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            java.lang.String r0 = r2.f252003N
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0c02
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "enableBackgroundPlayAudio, videoPath is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            goto L_0x0ca2
        L_0x0c02:
            boolean r0 = r2.f252032g1
            if (r0 != 0) goto L_0x0c59
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "registerAddOnPlayAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            java.lang.Class<yc.r> r0 = p1066yc.C91422r.class
            fd.s r7 = new fd.s
            r7.<init>(r2)
            r2.mo121278M(r0, r7)
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "registerAddOnVideoController"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            java.lang.Class<yc.s> r0 = p1066yc.C91423s.class
            fd.t r7 = new fd.t
            r7.<init>(r2)
            r2.mo121278M(r0, r7)
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "registerAddOnInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            java.lang.Class<yc.q> r0 = p1066yc.C91421q.class
            fd.u r7 = new fd.u
            r7.<init>(r2)
            r2.mo121278M(r0, r7)
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "registerAddOnGetSnapshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            java.lang.Class<yc.p> r0 = p1066yc.C91420p.class
            fd.w r7 = new fd.w
            r7.<init>(r2)
            r2.mo121278M(r0, r7)
            r7 = 1
            r2.f252032g1 = r7
        L_0x0c59:
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "enableBackgroundPlayAudioInternal"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            co0.a r0 = p1066yc.C91412i.m114704a(r3)
            if (r0 != 0) goto L_0x0c74
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r7 = "enableBackgroundPlayAudioInternal, audioOfVideoBackgroundPlayManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r7)
            r0 = 0
            r7 = 1
            goto L_0x0c79
        L_0x0c74:
            r7 = 1
            boolean r0 = r0.mo110369l(r2, r7)
        L_0x0c79:
            if (r0 == 0) goto L_0x0ca2
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f252038j1
            r0.set(r7)
            in0.d r0 = r2.f252033h
            if (r0 == 0) goto L_0x0c88
            r6 = 0
            r0.setSurface(r6)
        L_0x0c88:
            r2.f252034h1 = r7
            hd.d r0 = r2.f252035i
            if (r0 == 0) goto L_0x0c93
            po0.g r0 = (po0.C89421g) r0
            r0.mo123743d(r7)
        L_0x0c93:
            r9 = 1
            goto L_0x0ca3
        L_0x0c95:
            java.lang.String r0 = "exitBackgroundPlayback"
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0ca2
            boolean r9 = r2.mo121289w(r3)
            goto L_0x0ca3
        L_0x0ca2:
            r9 = 0
        L_0x0ca3:
            java.lang.String r0 = "snapshot"
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0cd5
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r1 = "getSnapshotCached"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            hd.b r0 = r2.f252047q
            if (r0 != 0) goto L_0x0cbf
            java.lang.String r0 = "fail:snapshot error"
            r3.mo62549j(r0)
            goto L_0x0ce6
        L_0x0cbf:
            r2.f252008R0 = r3
            java.lang.String r0 = r2.mo121291y()
            java.lang.String r1 = "takeScreenshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            kd.c r0 = r2.f253973f
            java.lang.String r1 = r2.f253972e
            int r6 = r2.f253971d
            p830xc.C91167d.m114401b(r0, r1, r6)
            goto L_0x0ce6
        L_0x0cd5:
            boolean r0 = r8.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0cdc
            goto L_0x0ce6
        L_0x0cdc:
            if (r9 == 0) goto L_0x0ce1
            r1 = r22
            goto L_0x0ce3
        L_0x0ce1:
            r1 = r16
        L_0x0ce3:
            r3.mo62549j(r1)
        L_0x0ce6:
            boolean r0 = r8.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x0cf2
            boolean r0 = r8.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x0cfc
        L_0x0cf2:
            yc.d<fd.e0> r0 = r2.f252025a1
            r0.mo125359k(r3)
            goto L_0x0cfc
        L_0x0cf8:
            r28 = r1
            r21 = r5
        L_0x0cfc:
            r1 = r21
            goto L_0x0d1d
        L_0x0cff:
            r28 = r1
            r22 = r4
            r21 = r5
            java.lang.String r0 = "remove"
            r1 = r21
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0d1d
            r2.mo121273H()
            r4 = r22
            r3.mo62549j(r4)
            yc.d<fd.e0> r0 = r2.f252025a1
            r0.mo125359k(r3)
        L_0x0d1d:
            yc.c r0 = r2.f252024Z0
            r0.mo109535a(r1, r3)
            java.lang.String r0 = r2.f252003N
            if (r0 == 0) goto L_0x0d28
            r9 = r0
            goto L_0x0d2a
        L_0x0d28:
            r9 = r28
        L_0x0d2a:
            yc.d<fd.e0> r0 = r2.f252025a1
            r0.mo125358j(r3, r9)
        L_0x0d2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p964fd.e$$q.run():void");
    }
}
