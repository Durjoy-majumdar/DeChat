package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.h */
public class C81120h extends C82926s {
    private static final int CTRL_INDEX = 750;
    public static final String NAME = "shouldShowSplashAd";

    /* renamed from: i */
    public String f238399i = "launch";

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0181, code lost:
        if (r11 > r12) goto L_0x0183;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113283s(com.tencent.p014mm.plugin.appbrand.C81925i2 r17, android.content.Context r18, com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o r19) {
        /*
            r16 = this;
            r0 = r16
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r17.getRuntime()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r2
            java.lang.String r3 = r2.f238147j
            java.lang.String r4 = "appId"
            r1.put(r4, r3)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r2.mo113210l1()
            java.lang.String r3 = r3.f239363e
            java.lang.String r4 = "appName"
            r1.put(r4, r3)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r2.mo113210l1()
            java.lang.String r3 = r3.f239364f
            java.lang.String r4 = "appIcon"
            r1.put(r4, r3)
            int r3 = r2.mo113208k1()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "scene"
            r1.put(r4, r3)
            java.lang.String r3 = r0.f238399i
            java.lang.String r4 = "launch"
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r4 = "source"
            r1.put(r4, r3)
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "isDarkMode"
            r1.put(r5, r4)
            boolean r4 = r2.mo121254q1()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.String r6 = "isGame"
            r1.put(r6, r5)
            java.util.Set<java.lang.Integer> r5 = ai0.C27903c.f77075a
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_appbrand_ad_code_block_time
            r7 = 0
            int r5 = r5.mo58779Qe(r6, r7)
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8[r7] = r9
            java.lang.String r9 = "MicroMsg.AppBrandAdABTests[AppBrandSplashAd]"
            java.lang.String r10 = "getCodeBlockTimeThreshold, timeThreshold:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.String r9 = "timeThreshold"
            r1.put(r9, r8)
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9[r7] = r10
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            r11 = 10000(0x2710, float:1.4013E-41)
            int r10 = r10.nextInt(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r6] = r10
            java.lang.String r10 = "%s_%s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            int r10 = f40.C86718e.m107549h()
            if (r10 == 0) goto L_0x00d0
            long r10 = (long) r10
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = "_"
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
        L_0x00d0:
            java.lang.String r10 = "instanceId"
            r1.put(r10, r9)
            r10 = 0
            int r11 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.formatVersion(r10, r11)
            java.lang.String r11 = "weixinVersion"
            r1.put(r11, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.String r11 = "osType"
            r1.put(r11, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Android "
            r10.append(r11)
            java.lang.String r11 = android.os.Build.VERSION.RELEASE
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "osVersion"
            r1.put(r11, r10)
            java.lang.String r10 = p156gj.C87203t.m108275k()
            java.lang.String r11 = "model"
            r1.put(r11, r10)
            if (r18 != 0) goto L_0x0115
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            goto L_0x0117
        L_0x0115:
            r10 = r18
        L_0x0117:
            tm0.k$e r10 = tm0.C90538k.m113361x(r10)
            java.lang.String r11 = r10.f260172d
            java.lang.String r12 = "networkType"
            r1.put(r12, r11)
            if (r18 == 0) goto L_0x0137
            android.content.res.Resources r11 = r18.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int[] r12 = new int[r8]
            int r13 = r11.widthPixels
            r12[r7] = r13
            int r11 = r11.heightPixels
            r12[r6] = r11
            goto L_0x013b
        L_0x0137:
            int[] r12 = com.tencent.p014mm.plugin.appbrand.utils.C84752i2.m104413a(r17)
        L_0x013b:
            r11 = r12[r7]
            r12 = r12[r6]
            int r11 = js0.C88020k.m109555f(r11)
            int r12 = js0.C88020k.m109555f(r12)
            boolean r13 = r2.mo121254q1()
            if (r13 == 0) goto L_0x0186
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r13 = r2.mo113210l1()
            if (r13 == 0) goto L_0x0167
            java.lang.String r13 = r13.f239366h
            br0.e$b r13 = br0.C79778e.C79780b.m96933b(r13)
            br0.e$b r14 = br0.C79778e.C79780b.LANDSCAPE_SENSOR
            if (r13 == r14) goto L_0x0165
            br0.e$b r14 = br0.C79778e.C79780b.LANDSCAPE_LEFT
            if (r13 == r14) goto L_0x0165
            br0.e$b r14 = br0.C79778e.C79780b.LANDSCAPE_RIGHT
            if (r13 != r14) goto L_0x0167
        L_0x0165:
            r13 = 1
            goto L_0x0168
        L_0x0167:
            r13 = 0
        L_0x0168:
            if (r13 == 0) goto L_0x016c
            if (r11 < r12) goto L_0x0183
        L_0x016c:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r13 = r2.mo113210l1()
            if (r13 == 0) goto L_0x017e
            java.lang.String r13 = r13.f239366h
            br0.e$b r13 = br0.C79778e.C79780b.m96933b(r13)
            br0.e$b r14 = br0.C79778e.C79780b.PORTRAIT
            if (r13 != r14) goto L_0x017e
            r13 = 1
            goto L_0x017f
        L_0x017e:
            r13 = 0
        L_0x017f:
            if (r13 == 0) goto L_0x0186
            if (r11 <= r12) goto L_0x0186
        L_0x0183:
            r15 = r12
            r12 = r11
            r11 = r15
        L_0x0186:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.String r14 = "screenWidth"
            r1.put(r14, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.String r14 = "screenHeight"
            r1.put(r14, r13)
            float r13 = js0.C88020k.m109556g()
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.String r14 = "pixelRatio"
            r1.put(r14, r13)
            android.content.Context r13 = r17.getContext()
            r14 = 1090519040(0x41000000, float:8.0)
            int r13 = zp3.C79406f.m96347a(r13, r14)
            int r14 = tm0.C90551r.m113380y(r17)
            int r13 = r13 + r14
            int r13 = js0.C88020k.m109555f(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "rightButtonTop"
            r1.put(r14, r13)
            r13 = 8
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r7] = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r13[r8] = r5
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r13[r5] = r6
            r5 = 4
            float r6 = js0.C88020k.m109556g()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r13[r5] = r6
            r5 = 5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r13[r5] = r3
            r3 = 6
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r13[r3] = r4
            r3 = 7
            r13[r3] = r10
            java.lang.String r3 = "MicroMsg.JsApiEventShouldShowSplashAd[AppBrandSplashAd]"
            java.lang.String r4 = "dispatch, instanceId:%s, timeThreshold:%s, screenSize[%s, %s], pixelRatio:%s, isDarkMode:%s, isGame:%s, networkType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r13)
            ai0.d r2 = ai0.C79570o.m96621a(r2)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r2.f233272f = r3
            r0.mo115165o(r1)
            r16.mo115194p(r17)
            r1 = r19
            r0.mo115159i(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81120h.mo113283s(com.tencent.mm.plugin.appbrand.i2, android.content.Context, com.tencent.mm.plugin.appbrand.jsruntime.o):void");
    }
}
