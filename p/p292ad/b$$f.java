package p292ad;

import p830xc.C91165a;

/* renamed from: ad.b$$f */
public final /* synthetic */ class b$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233119d;

    /* renamed from: e */
    public final /* synthetic */ C91165a f233120e;

    public /* synthetic */ b$$f(C79502b bVar, C91165a aVar) {
        this.f233119d = bVar;
        this.f233120e = aVar;
    }

    /* JADX WARNING: type inference failed for: r5v25, types: [com.tencent.mm.plugin.appbrand.jsapi.f] */
    /* JADX WARNING: type inference failed for: r9v25, types: [com.tencent.mm.plugin.appbrand.jsapi.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0492  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            ad.b r0 = r15.f233119d
            xc.a r1 = r15.f233120e
            r0.getClass()
            java.lang.String r2 = r1.mo62543f()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0013
            goto L_0x06a4
        L_0x0013:
            org.json.JSONObject r3 = r1.mo62539b()
            java.lang.String r4 = r0.mo109516v()
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r0.mo122122p()
            r8 = 0
            r6[r8] = r7
            r7 = 1
            r6[r7] = r2
            java.lang.String r9 = r3.toString()
            r10 = 2
            r6[r10] = r9
            java.lang.String r9 = "*** handler(%s) handleJsApi(%s), data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r6)
            r3.toString()
            boolean r3 = r0.mo109517w()
            java.lang.String r4 = "insert"
            boolean r4 = r2.contains(r4)
            r6 = 0
            java.lang.String r9 = "backgroundPoster"
            java.lang.String r11 = "title"
            java.lang.String r12 = "autoPauseIfOpenNative"
            java.lang.String r13 = "autoPauseIfNavigate"
            if (r4 == 0) goto L_0x01c5
            r0.mo109502C(r7)
            org.json.JSONObject r4 = r1.mo62539b()
            java.lang.String r5 = "mode"
            int r5 = r4.optInt(r5, r8)
            if (r5 != r10) goto L_0x005f
            r0.f233087M = r7
            goto L_0x0061
        L_0x005f:
            r0.f233087M = r8
        L_0x0061:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r14 = r1.getAppId()
            r5[r8] = r14
            java.lang.String r14 = "weixin_%s"
            java.lang.String r5 = java.lang.String.format(r14, r5)
            com.tencent.rtmp.TXLiveBase.setAppVersion(r5)
            r0.f233101o = r1
            com.tencent.mm.plugin.appbrand.jsapi.f r5 = r1.mo62544g()
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r5 == 0) goto L_0x0085
            boolean r5 = com.tencent.p014mm.plugin.appbrand.extendplugin.C81824c.m100433a(r1)
            r5 = r5 ^ r7
            r0.f233078D = r5
            goto L_0x008e
        L_0x0085:
            java.lang.String r5 = r0.mo109516v()
            java.lang.String r14 = "insert, component is not AppBrandPageView"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r14)
        L_0x008e:
            ad.j r5 = new ad.j
            r5.<init>(r0)
            r0.f233102p = r5
            r1.mo62538a(r5)
            bd.a r5 = r0.f233100n
            if (r5 == 0) goto L_0x00a7
            jo0.c r5 = (jo0.C87995c) r5
            boolean r14 = r1 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b
            if (r14 == 0) goto L_0x00a7
            r14 = r1
            com.tencent.mm.plugin.appbrand.extendplugin.b r14 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r14
            r5.f254603b = r14
        L_0x00a7:
            r0.mo109520z(r1, r4)
            r0.mo109519y(r4)
            boolean r5 = r4.optBoolean(r13, r7)
            r0.f233107u = r5
            boolean r5 = r4.optBoolean(r12, r7)
            r0.f233108v = r5
            java.lang.String r5 = r0.f233092S
            java.lang.String r5 = r4.optString(r11, r5)
            r0.f233092S = r5
            java.lang.String r5 = r0.f233093T
            java.lang.String r5 = r4.optString(r9, r5)
            r0.f233093T = r5
            com.tencent.mm.plugin.appbrand.jsapi.f r5 = r1.mo62544g()
            if (r5 != 0) goto L_0x00da
            java.lang.String r5 = r0.mo109516v()
            java.lang.String r6 = "updateReferrers, component is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            goto L_0x0146
        L_0x00da:
            java.lang.Class<km0.a> r9 = km0.C88224a.class
            ra.b r9 = p224ra.C89909e.m112436a(r9)
            km0.a r9 = (km0.C88224a) r9
            if (r9 != 0) goto L_0x00ef
            java.lang.String r5 = r0.mo109516v()
            java.lang.String r6 = "updateReferrers, referrerHelper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            goto L_0x0146
        L_0x00ef:
            km0.c r11 = r0.f233109w
            if (r11 != 0) goto L_0x00f9
            km0.c r11 = r9.mo117491e4()
            r0.f233109w = r11
        L_0x00f9:
            km0.c r11 = r9.mo117493f2(r4, r5)
            if (r11 == 0) goto L_0x0101
            r0.f233109w = r11
        L_0x0101:
            java.lang.String r11 = r0.mo109516v()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "updateReferrers, mReferrerPolicy: "
            r12.append(r13)
            km0.c r13 = r0.f233109w
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            km0.c r11 = km0.C88226c.NO_REFERRER
            km0.c r12 = r0.f233109w
            if (r11 != r12) goto L_0x0125
            r0.f233110x = r6
            goto L_0x0146
        L_0x0125:
            java.lang.String r5 = r9.mo117489A4(r5)
            r0.f233110x = r5
            java.lang.String r5 = r0.mo109516v()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "updateReferrers, mReferrer: "
            r6.append(r9)
            java.lang.String r9 = r0.f233110x
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
        L_0x0146:
            java.lang.String r5 = r0.f233110x
            if (r5 == 0) goto L_0x016e
            java.lang.String r6 = "referrer"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0151 }
            goto L_0x016e
        L_0x0151:
            r5 = move-exception
            java.lang.String r6 = r0.mo109516v()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "insert, put referrer fail since "
            r9.append(r11)
            java.lang.String r5 = r5.toString()
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r5)
        L_0x016e:
            r0.mo109500A(r4)
            ad.a r5 = r0.f233097h
            if (r5 != 0) goto L_0x0185
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "insert, adapter is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            fl0.c r4 = fl0.C86920e.f252314d
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x0185:
            android.os.Bundle r4 = p1068zc.C91660a.m115195a(r4)
            ad.a r5 = r0.f233097h
            ad.m r5 = (p292ad.C79513m) r5
            ml0.u r5 = r5.mo14926f(r4)
            java.lang.String r6 = r0.mo109516v()
            java.lang.Object[] r9 = new java.lang.Object[r10]
            int r10 = r5.f60905a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r8] = r10
            java.lang.String r10 = r5.f60906b
            r9[r7] = r10
            java.lang.String r10 = "insert, code:%d info:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r9)
            int r6 = r5.f60905a
            if (r6 != 0) goto L_0x01af
            fl0.c r6 = fl0.C86920e.f252311a
            goto L_0x01b1
        L_0x01af:
            fl0.c r6 = fl0.C86920e.f252314d
        L_0x01b1:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r5.f60907c
            r1.mo62547h(r6, r9)
            int r5 = r5.f60905a
            if (r5 != 0) goto L_0x0623
            bd.a r5 = r0.f233100n
            if (r5 == 0) goto L_0x0623
            jo0.c r5 = (jo0.C87995c) r5
            r5.mo122446a(r1, r4)
            goto L_0x0623
        L_0x01c5:
            java.lang.String r4 = "update"
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L_0x026b
            r0.mo109502C(r10)
            org.json.JSONObject r4 = r1.mo62539b()
            boolean r5 = r4.has(r13)
            if (r5 == 0) goto L_0x01e1
            boolean r5 = r4.optBoolean(r13, r7)
            r0.f233107u = r5
        L_0x01e1:
            boolean r5 = r4.has(r12)
            if (r5 == 0) goto L_0x01ed
            boolean r5 = r4.optBoolean(r12, r7)
            r0.f233108v = r5
        L_0x01ed:
            bd.a r5 = r0.f233100n
            if (r5 == 0) goto L_0x01fc
            jo0.c r5 = (jo0.C87995c) r5
            boolean r6 = r1 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b
            if (r6 == 0) goto L_0x01fc
            r6 = r1
            com.tencent.mm.plugin.appbrand.extendplugin.b r6 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r6
            r5.f254603b = r6
        L_0x01fc:
            r0.mo109520z(r1, r4)
            r0.mo109519y(r4)
            java.lang.String r5 = r0.f233092S
            java.lang.String r5 = r4.optString(r11, r5)
            r0.f233092S = r5
            java.lang.String r5 = r0.f233093T
            java.lang.String r5 = r4.optString(r9, r5)
            r0.f233093T = r5
            r0.mo109500A(r4)
            ad.a r5 = r0.f233097h
            if (r5 != 0) goto L_0x022a
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "update, adapter is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            fl0.c r4 = fl0.C86920e.f252314d
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x022a:
            android.os.Bundle r4 = p1068zc.C91660a.m115195a(r4)
            ad.a r5 = r0.f233097h
            ad.m r5 = (p292ad.C79513m) r5
            ml0.u r5 = r5.mo14925e(r4)
            java.lang.String r6 = r0.mo109516v()
            java.lang.Object[] r9 = new java.lang.Object[r10]
            int r10 = r5.f60905a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r8] = r10
            java.lang.String r10 = r5.f60906b
            r9[r7] = r10
            java.lang.String r10 = "update, code:%d info:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r9)
            int r6 = r5.f60905a
            if (r6 != 0) goto L_0x0255
            fl0.c r6 = fl0.C86920e.f252311a
            goto L_0x0257
        L_0x0255:
            fl0.c r6 = fl0.C86920e.f252314d
        L_0x0257:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r5.f60907c
            r1.mo62547h(r6, r9)
            int r5 = r5.f60905a
            if (r5 != 0) goto L_0x0623
            bd.a r5 = r0.f233100n
            if (r5 == 0) goto L_0x0623
            jo0.c r5 = (jo0.C87995c) r5
            r5.mo122446a(r1, r4)
            goto L_0x0623
        L_0x026b:
            java.lang.String r4 = "operate"
            boolean r9 = r2.contains(r4)
            java.lang.String r10 = "stop"
            java.lang.String r11 = "type"
            if (r9 == 0) goto L_0x02d0
            java.lang.String r9 = "Background"
            boolean r9 = r2.contains(r9)
            if (r9 == 0) goto L_0x02d0
            org.json.JSONObject r4 = r1.mo62539b()
            java.lang.String r4 = r4.optString(r11)
            java.lang.String r5 = r0.mo109516v()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r8] = r4
            java.lang.String r9 = "operateBackground, type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r6)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x02c9
            ad.a r5 = r0.f233097h
            if (r5 == 0) goto L_0x02c9
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x02c2
            r0.mo109514t(r1)
            boolean r4 = r0.f233077C
            if (r4 == 0) goto L_0x0623
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "operateBackground, isRuntimeInBackground, setPlayingWhenEnterBackground false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r8)
            r0.f233079E = r4
            goto L_0x0623
        L_0x02c2:
            fl0.c r4 = fl0.C86920e.f252314d
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x02c9:
            fl0.c r4 = fl0.C86920e.f252314d
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x02d0:
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L_0x0609
            r0.mo109502C(r5)
            org.json.JSONObject r4 = r1.mo62539b()
            java.lang.String r5 = r4.optString(r11)
            java.lang.String r9 = r0.mo109516v()
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r8] = r5
            java.lang.String r12 = "operate, type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r11)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 == 0) goto L_0x02fe
            fl0.c r4 = fl0.C86920e.f252314d
            java.lang.String r5 = "fail:missing operateType"
            r1.mo62552m(r5, r4)
            goto L_0x0623
        L_0x02fe:
            ad.a r9 = r0.f233097h
            if (r9 != 0) goto L_0x0309
            fl0.c r4 = fl0.C86920e.f252314d
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x0309:
            java.lang.String r9 = "snapshot"
            boolean r11 = r5.equals(r9)
            if (r11 == 0) goto L_0x036a
            ad.a r4 = r0.f233097h
            if (r4 != 0) goto L_0x0327
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "operateSnapshot, adapter is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            fl0.c r4 = fl0.C86920e.f252314d
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x0327:
            ad.k r5 = new ad.k
            r5.<init>(r0, r1)
            ad.m r4 = (p292ad.C79513m) r4
            r4.mo33724j(r5)
            ad.a r4 = r0.f233097h
            org.json.JSONObject r5 = r1.mo62539b()
            ad.m r4 = (p292ad.C79513m) r4
            ml0.u r4 = r4.mo33727m(r9, r5)
            int r5 = r4.f60905a
            if (r5 == 0) goto L_0x035e
            java.lang.String r5 = r0.mo109516v()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            int r9 = r4.f60905a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6[r8] = r9
            java.lang.String r9 = "operateSnapshot, fail:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r6)
            fl0.c r5 = fl0.C86920e.f252314d
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f60907c
            r1.mo62547h(r5, r4)
            goto L_0x0623
        L_0x035e:
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "operateSnapshot, success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x0623
        L_0x036a:
            java.lang.String r9 = "snapshotView"
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x03a9
            ad.a r4 = r0.f233097h
            if (r4 != 0) goto L_0x0388
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "operateSnapshotView, adapter is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            fl0.c r4 = fl0.C86920e.f252314d
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x0388:
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "takeScreenshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r0.f233080F = r1
            kd.c r4 = r0.f253973f
            java.lang.String r5 = r0.f253972e
            int r6 = r0.f253971d
            p830xc.C91167d.m114401b(r4, r5, r6)
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "operateSnapshotView, success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x0623
        L_0x03a9:
            java.lang.String r9 = "requestFullScreen"
            boolean r9 = r5.equalsIgnoreCase(r9)
            java.lang.String r11 = "MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler"
            java.lang.String r12 = "MicroMsg.SameLayer.LivePlayerPluginHandler"
            if (r9 == 0) goto L_0x043c
            bd.a r4 = r0.f233100n
            if (r4 == 0) goto L_0x0421
            jo0.c r4 = (jo0.C87995c) r4
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b
            if (r5 != 0) goto L_0x03c1
            goto L_0x041c
        L_0x03c1:
            org.json.JSONObject r5 = r1.mo62539b()
            r9 = r1
            com.tencent.mm.plugin.appbrand.extendplugin.b r9 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r9
            com.tencent.mm.plugin.appbrand.jsapi.f r9 = r9.mo62544g()
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r10 == 0) goto L_0x03d4
            r6 = r9
            com.tencent.mm.plugin.appbrand.page.d1 r6 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r6
            goto L_0x03de
        L_0x03d4:
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.appbrand.C81925i2
            if (r10 == 0) goto L_0x03de
            com.tencent.mm.plugin.appbrand.i2 r9 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r9
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r9.mo114341l0()
        L_0x03de:
            if (r6 != 0) goto L_0x03e7
            java.lang.String r4 = "requestFullscreen, page view is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r4)
            goto L_0x041c
        L_0x03e7:
            if (r5 == 0) goto L_0x041c
            java.lang.String r9 = "data"
            boolean r10 = r5.has(r9)
            if (r10 == 0) goto L_0x041c
            org.json.JSONArray r5 = r5.optJSONArray(r9)
            if (r5 == 0) goto L_0x0416
            int r9 = r5.length()
            if (r9 != 0) goto L_0x03fe
            goto L_0x0416
        L_0x03fe:
            int r5 = r5.optInt(r8, r8)
            r9 = -90
            if (r5 == r9) goto L_0x040c
            if (r5 == 0) goto L_0x040b
            r9 = 90
            goto L_0x040c
        L_0x040b:
            r9 = 0
        L_0x040c:
            jo0.a r5 = new jo0.a
            r5.<init>(r4, r6, r9)
            r6.mo109673t(r5)
            r4 = 1
            goto L_0x041d
        L_0x0416:
            java.lang.String r4 = "requestFullscreen, data array is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r4)
        L_0x041c:
            r4 = 0
        L_0x041d:
            if (r4 == 0) goto L_0x0421
            r4 = 1
            goto L_0x0422
        L_0x0421:
            r4 = 0
        L_0x0422:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r8] = r6
            java.lang.String r6 = "operateRequestFullscreen, result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r5)
            if (r4 == 0) goto L_0x0435
            fl0.c r4 = fl0.C86920e.f252311a
            goto L_0x0437
        L_0x0435:
            fl0.c r4 = fl0.C86920e.f252314d
        L_0x0437:
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x043c:
            java.lang.String r9 = "exitFullScreen"
            boolean r9 = r5.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0499
            bd.a r4 = r0.f233100n
            if (r4 == 0) goto L_0x047e
            jo0.c r4 = (jo0.C87995c) r4
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b
            if (r5 != 0) goto L_0x044f
            goto L_0x046f
        L_0x044f:
            r5 = r1
            com.tencent.mm.plugin.appbrand.extendplugin.b r5 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r5
            com.tencent.mm.plugin.appbrand.jsapi.f r5 = r5.mo62544g()
            boolean r9 = r5 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r9 == 0) goto L_0x045e
            r6 = r5
            com.tencent.mm.plugin.appbrand.page.d1 r6 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r6
            goto L_0x0468
        L_0x045e:
            boolean r9 = r5 instanceof com.tencent.p014mm.plugin.appbrand.C81925i2
            if (r9 == 0) goto L_0x0468
            com.tencent.mm.plugin.appbrand.i2 r5 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r5
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r5.mo114341l0()
        L_0x0468:
            if (r6 != 0) goto L_0x0471
            java.lang.String r4 = "exitFullscreen, page view is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r4)
        L_0x046f:
            r4 = 0
            goto L_0x047a
        L_0x0471:
            jo0.b r5 = new jo0.b
            r5.<init>(r4, r6)
            r6.mo109673t(r5)
            r4 = 1
        L_0x047a:
            if (r4 == 0) goto L_0x047e
            r4 = 1
            goto L_0x047f
        L_0x047e:
            r4 = 0
        L_0x047f:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r8] = r6
            java.lang.String r6 = "operateExitFullscreen, result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r5)
            if (r4 == 0) goto L_0x0492
            fl0.c r4 = fl0.C86920e.f252311a
            goto L_0x0494
        L_0x0492:
            fl0.c r4 = fl0.C86920e.f252314d
        L_0x0494:
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x0499:
            java.lang.String r9 = "exitPictureInPicture"
            boolean r9 = r5.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x04a8
            yc.d<ad.r> r4 = r0.f233082H
            r4.mo125356b(r1)
            goto L_0x0623
        L_0x04a8:
            java.lang.String r9 = "requestBackgroundPlayback"
            boolean r9 = r5.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x05b4
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "enableBackgroundPlayAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            java.lang.String r4 = r0.f233083I
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x04d2
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "enableBackgroundPlayAudio, playerUrl is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            fl0.c r4 = fl0.C86921f.f252336j
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x04d2:
            boolean r4 = r0.f233087M
            if (r4 == 0) goto L_0x04e6
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "enableBackgroundPlayAudio, mIsRTCMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            fl0.c r4 = fl0.C86921f.f252337k
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x04e6:
            boolean r4 = r0.f233077C
            if (r4 == 0) goto L_0x04fa
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "enableBackgroundPlayAudio, isRuntimeInBackground"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            fl0.c r4 = fl0.C86921f.f252338l
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x04fa:
            boolean r4 = r0.f233088N
            if (r4 != 0) goto L_0x0550
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "registerAddOnPlayAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            java.lang.Class<yc.r> r4 = p1066yc.C91422r.class
            ad.l r5 = new ad.l
            r5.<init>(r0)
            r0.mo109504E(r4, r5)
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "registerAddOnVideoController"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            java.lang.Class<yc.s> r4 = p1066yc.C91423s.class
            ad.c r5 = new ad.c
            r5.<init>(r0)
            r0.mo109504E(r4, r5)
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "registerAddOnInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            java.lang.Class<yc.q> r4 = p1066yc.C91421q.class
            ad.d r5 = new ad.d
            r5.<init>(r0)
            r0.mo109504E(r4, r5)
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "registerAddOnGetSnapshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            java.lang.Class<yc.p> r4 = p1066yc.C91420p.class
            ad.g r5 = new ad.g
            r5.<init>(r0)
            r0.mo109504E(r4, r5)
            r0.f233088N = r7
        L_0x0550:
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "enableBackgroundPlayAudioInternal"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            co0.a r4 = p1066yc.C91412i.m114704a(r1)
            if (r4 != 0) goto L_0x056a
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "enableBackgroundPlayAudioInternal, audioOfVideoBackgroundPlayManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            r4 = 0
            goto L_0x056e
        L_0x056a:
            boolean r4 = r4.mo110369l(r0, r7)
        L_0x056e:
            if (r4 == 0) goto L_0x0597
            ad.a r4 = r0.f233097h
            if (r4 == 0) goto L_0x0588
            ad.m r4 = (p292ad.C79513m) r4
            boolean r4 = r4.isPlaying()
            if (r4 != 0) goto L_0x0588
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f233091R
            r4.set(r7)
            ad.a r4 = r0.f233097h
            ad.m r4 = (p292ad.C79513m) r4
            r4.setSurface(r6)
        L_0x0588:
            r0.f233089P = r7
            bd.b r4 = r0.f233099j
            if (r4 == 0) goto L_0x0595
            int r5 = r0.f253971d
            jo0.d r4 = (jo0.C87997d) r4
            r4.mo122452b(r5, r7)
        L_0x0595:
            r4 = 1
            goto L_0x0598
        L_0x0597:
            r4 = 0
        L_0x0598:
            java.lang.String r5 = r0.mo109516v()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            r6[r8] = r9
            java.lang.String r9 = "enableBackgroundPlayAudio, result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r6)
            if (r4 == 0) goto L_0x05ae
            fl0.c r4 = fl0.C86920e.f252311a
            goto L_0x05b0
        L_0x05ae:
            fl0.c r4 = fl0.C86920e.f252314d
        L_0x05b0:
            r1.mo62551l(r4)
            goto L_0x0623
        L_0x05b4:
            java.lang.String r6 = "exitBackgroundPlayback"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x05c0
            r0.mo109514t(r1)
            goto L_0x0623
        L_0x05c0:
            ad.a r6 = r0.f233097h
            ad.m r6 = (p292ad.C79513m) r6
            ml0.u r4 = r6.mo33727m(r5, r4)
            int r6 = r4.f60905a
            if (r6 != 0) goto L_0x05cf
            fl0.c r6 = fl0.C86920e.f252311a
            goto L_0x05d1
        L_0x05cf:
            fl0.c r6 = fl0.C86920e.f252314d
        L_0x05d1:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r4.f60907c
            r1.mo62547h(r6, r9)
            r0.mo109518x(r5, r4)
            boolean r4 = r5.equalsIgnoreCase(r10)
            if (r4 != 0) goto L_0x05e8
            java.lang.String r4 = "pause"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0623
        L_0x05e8:
            yc.d<ad.r> r4 = r0.f233082H
            r4.mo125359k(r1)
            boolean r4 = r5.equalsIgnoreCase(r10)
            if (r4 == 0) goto L_0x0623
            boolean r4 = r0.f233077C
            if (r4 == 0) goto L_0x0623
            java.lang.String r4 = r0.mo109516v()
            java.lang.String r5 = "operate, isRuntimeInBackground, setPlayingWhenEnterBackground false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r8)
            r0.f233079E = r4
            goto L_0x0623
        L_0x0609:
            java.lang.String r4 = "remove"
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L_0x0623
            r4 = 4
            r0.mo109502C(r4)
            r0.mo109501B()
            fl0.c r4 = fl0.C86920e.f252311a
            r1.mo62551l(r4)
            yc.d<ad.r> r4 = r0.f233082H
            r4.mo125359k(r1)
        L_0x0623:
            yc.c r4 = r0.f233081G
            r4.mo109535a(r2, r1)
            org.json.JSONObject r2 = r1.mo62539b()
            if (r2 != 0) goto L_0x0638
            java.lang.String r2 = r0.mo109516v()
            java.lang.String r4 = "handleAutoPlay, null == dataJsonObj"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
            goto L_0x0642
        L_0x0638:
            boolean r4 = r0.f233086L
            java.lang.String r5 = "autoplay"
            boolean r2 = r2.optBoolean(r5, r4)
            r0.f233086L = r2
        L_0x0642:
            org.json.JSONObject r2 = r1.mo62539b()
            if (r2 != 0) goto L_0x0652
            java.lang.String r2 = r0.mo109516v()
            java.lang.String r4 = "handlePlayerUrl, null == dataJsonObj"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
            goto L_0x065d
        L_0x0652:
            java.lang.String r4 = r0.f233083I
            java.lang.String r5 = "playUrl"
            java.lang.String r2 = r2.optString(r5, r4)
            r0.f233083I = r2
        L_0x065d:
            yc.d<ad.r> r2 = r0.f233082H
            java.lang.String r4 = r0.f233083I
            r2.mo125358j(r1, r4)
            boolean r1 = r0.mo109517w()
            if (r1 == r3) goto L_0x066c
            r2 = 1
            goto L_0x066d
        L_0x066c:
            r2 = 0
        L_0x066d:
            ad.a r3 = r0.f233097h
            if (r3 == 0) goto L_0x067a
            ad.m r3 = (p292ad.C79513m) r3
            boolean r3 = r3.isPlaying()
            if (r3 == 0) goto L_0x067a
            r8 = 1
        L_0x067a:
            r2 = r2 & r8
            if (r2 == 0) goto L_0x06a4
            boolean r2 = r0.f233078D
            if (r2 != 0) goto L_0x06a4
            boolean r2 = r0.f233077C
            if (r2 != 0) goto L_0x06a4
            if (r1 == 0) goto L_0x0696
            java.lang.String r1 = r0.mo109516v()
            java.lang.String r2 = "live muted, abandonFocus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.appbrand.jsapi.media.i2 r0 = r0.f233111y
            r0.mo115002L()
            goto L_0x06a4
        L_0x0696:
            java.lang.String r1 = r0.mo109516v()
            java.lang.String r2 = "live unmuted, requestFocus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.appbrand.jsapi.media.i2 r0 = r0.f233111y
            r0.requestFocus()
        L_0x06a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p292ad.b$$f.run():void");
    }
}
