package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.l */
public class C81123l extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 748;
    public static final String NAME = "showSplashAd";

    /* JADX WARNING: Removed duplicated region for block: B:42:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x028e  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r30, org.json.JSONObject r31, int r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            r2 = r32
            r3 = r30
            kr0.e r3 = (kr0.C88267e) r3
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r3.getRuntime()
            java.lang.String r5 = r3.getAppId()
            java.lang.String r6 = "show"
            r7 = 0
            boolean r6 = r1.optBoolean(r6, r7)
            java.lang.String r8 = "errCode"
            int r8 = r1.optInt(r8, r7)
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r7] = r5
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r12 = 1
            r10[r12] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 2
            r10[r13] = r11
            java.lang.String r11 = "MicroMsg.AppBrand.JsApiShowSplashAd[AppBrandSplashAd]"
            java.lang.String r14 = "showSplashAd, appId:%s, showSplashAd:%s, errCode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r10)
            java.lang.String r10 = "adCallTime"
            r14 = 0
            long r12 = r1.optLong(r10, r14)
            java.lang.String r10 = "eventReceivedTime"
            r18 = r8
            long r7 = r1.optLong(r10, r14)
            java.lang.String r10 = "cgiFetchStart"
            long r9 = r1.optLong(r10, r14)
            java.lang.String r2 = "cgiFetchCallBack"
            long r1 = r1.optLong(r2, r14)
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r19 = r3
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r20 = r5
            r21 = r6
            long r5 = r3.f233272f
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r3.f233273g = r7
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r3.f233275i = r14
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r3.f233274h = r12
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r22 = r12
            long r12 = r3.f233282p
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r24 = r12
            long r12 = r3.f233283q
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r3.f233281o = r9
            ai0.d r3 = ai0.C79570o.m96621a(r4)
            r3.f233284r = r1
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r26 = r1 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r26)
            r17 = 0
            r0[r17] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r26 = 1
            r0[r26] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r16 = 2
            r0[r16] = r3
            java.lang.String r3 = "showSplashAd, adOperateCallCostTime:%s, callbackTime:%s, startTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r0)
            r0 = 17
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r17] = r20
            long r27 = r14 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r27)
            r0[r26] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0[r16] = r3
            long r5 = r7 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 3
            r0[r5] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r5 = 4
            r0[r5] = r3
            long r5 = r9 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 5
            r0[r5] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r5 = 6
            r0[r5] = r3
            long r5 = r24 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 7
            r0[r5] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r24)
            r5 = 8
            r0[r5] = r3
            long r5 = r12 - r24
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 9
            r0[r5] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r5 = 10
            r0[r5] = r3
            long r5 = r1 - r12
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 11
            r0[r5] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r5 = 12
            r0[r5] = r3
            long r12 = r22 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r2 = 13
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r22)
            r2 = 14
            r0[r2] = r1
            long r1 = r14 - r22
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 15
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r2 = 16
            r0[r2] = r1
            java.lang.String r1 = "showSplashAd(%s):%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r1, r0)
            if (r4 == 0) goto L_0x0268
            ai0.d r0 = ai0.C79570o.m96621a(r4)
            r1 = r21
            r0.f233267a = r1
            ai0.d r0 = ai0.C79570o.m96621a(r4)
            r2 = r18
            r0.f233276j = r2
            ai0.q r0 = r4.f238294v1
            if (r0 == 0) goto L_0x0268
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            long r6 = r0.f233337h
            long r6 = r2 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = "MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]"
            java.lang.String r6 = "showSplashAd, startTimerToShow costTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            long r5 = r0.f233337h
            long r2 = r2 - r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r0.f233331b
            com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct r5 = ai0.C79570o.m96623c(r5)
            if (r5 == 0) goto L_0x018e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r0.f233331b
            com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct r5 = ai0.C79570o.m96623c(r5)
            r5.f236358r = r2
        L_0x018e:
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r0.f233335f
            if (r2 == 0) goto L_0x019a
            boolean r2 = r2.stopped()
            if (r2 == 0) goto L_0x019a
            r2 = 1
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            if (r2 == 0) goto L_0x01ae
            java.lang.String r1 = "showSplashAd, check ad time out"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r1 = 3
            r0.f233334e = r1
            r0.mo109689g()
            r0.mo109692k()
            goto L_0x0268
        L_0x01ae:
            if (r1 == 0) goto L_0x024f
            java.lang.String r1 = "showSplashAd, show splash ad"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r0.f233331b
            com.tencent.mm.plugin.appbrand.ui.k4 r2 = r1.f238154s
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.C84518d
            if (r3 == 0) goto L_0x0223
            com.tencent.mm.plugin.appbrand.ui.d r2 = (com.tencent.p014mm.plugin.appbrand.p026ui.C84518d) r2
            boolean r1 = ai0.C79575q.m96625h(r1)
            if (r1 == 0) goto L_0x01e1
            ai0.i r1 = r2.f246658f
            r1.getClass()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()
            if (r3 == 0) goto L_0x01d9
            r3 = 0
            r1.setVisibility(r3)
            r1.bringToFront()
            goto L_0x01e1
        L_0x01d9:
            ai0.g r3 = new ai0.g
            r3.<init>(r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
        L_0x01e1:
            ai0.i r1 = r2.getRuntimeAdViewContainer()
            if (r1 == 0) goto L_0x01f3
            android.view.ViewGroup r1 = r1.getContentContainer()
            ai0.q$$a r3 = new ai0.q$$a
            r3.<init>(r0, r1)
            r1.addOnLayoutChangeListener(r3)
        L_0x01f3:
            int r1 = r2.getProgress()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "progress:  "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            r2 = 100
            if (r1 != r2) goto L_0x021a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r0.f233331b
            ai0.d r1 = ai0.C79570o.m96621a(r1)
            r2 = 1
            r1.f233286t = r2
            goto L_0x0223
        L_0x021a:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r0.f233331b
            ai0.d r1 = ai0.C79570o.m96621a(r1)
            r2 = 0
            r1.f233286t = r2
        L_0x0223:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r0.f233331b
            boolean r1 = ai0.C79575q.m96625h(r1)
            if (r1 == 0) goto L_0x0233
            boolean r1 = r0.f233340k
            if (r1 == 0) goto L_0x0233
            r1 = 0
            r0.mo109688f(r1)
        L_0x0233:
            r1 = 1
            r0.f233334e = r1
            com.tencent.mm.plugin.appbrand.ad.jsapi.g r1 = new com.tencent.mm.plugin.appbrand.ad.jsapi.g
            r1.<init>()
            java.lang.String r2 = "launch"
            r1.f238395i = r2
            kr0.e r2 = r0.mo109687e()
            r1.mo113282s(r2)
            java.lang.String r1 = "showSplashAd(true)"
            r0.mo109694m(r1)
            r0 = 1
            r1 = 2
            goto L_0x026a
        L_0x024f:
            java.lang.String r1 = "showSplashAd, not show splash ad"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r1 = 2
            r0.f233334e = r1
            r0.mo109689g()
            r0.mo109684b()
            java.lang.String r2 = "showSplashAd(false)"
            r0.mo109694m(r2)
            r0.mo109692k()
            goto L_0x0269
        L_0x0268:
            r1 = 2
        L_0x0269:
            r0 = 0
        L_0x026a:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r20
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "showSplashAd, appId:%s, ad showed:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = "ok"
            r1 = r29
            java.lang.String r0 = r1.mo115109j(r0)
            r2 = r32
            r3 = r19
            r3.mo109647a(r2, r0)
            goto L_0x029d
        L_0x028e:
            r1 = r29
            r2 = r32
            r3 = r19
            java.lang.String r0 = "fail:cannot show splash ad after loading pushed"
            java.lang.String r0 = r1.mo115109j(r0)
            r3.mo109647a(r2, r0)
        L_0x029d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81123l.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
