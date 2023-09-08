package pf1;

/* renamed from: pf1.e */
public final class C62266e extends C11896f {
    /* renamed from: n */
    public void mo11790n() {
        C11920q qVar = this.f34765b;
        if (qVar != null) {
            C62262d0.f176978a.mo87329v(qVar);
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [android.content.Context] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r2 = r0.app_id;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11775r(jq3.C60905o r36, android.view.View r37, pf1.C11920q r38) {
        /*
            r35 = this;
            r14 = r36
            r15 = r38
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "jumpView"
            r1 = r37
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "infoEx"
            gy3.C87412m.m108594g(r15, r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = r15.f34827a
            java.lang.String r12 = "Finder.AdStoreJumperClickHandler"
            com.tencent.mm.protocal.protobuf.MiniAppInfo r0 = r13.mini_app_info
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0026
            java.lang.String r2 = r0.app_id
            if (r2 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r10 = r2
            goto L_0x0027
        L_0x0026:
            r10 = r11
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r0.path
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r0 = r11
        L_0x002e:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r15.f34830d
            if (r2 == 0) goto L_0x0042
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = r2.getUserName()
            if (r2 != 0) goto L_0x003f
            goto L_0x0042
        L_0x003f:
            r16 = r2
            goto L_0x0044
        L_0x0042:
            r16 = r11
        L_0x0044:
            byte[] r9 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
            r2 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x005b }
            java.lang.String r5 = r13.ext_info     // Catch:{ Exception -> 0x005b }
            if (r5 != 0) goto L_0x0051
            r5 = r11
        L_0x0051:
            r4.<init>(r5)     // Catch:{ Exception -> 0x005b }
            java.lang.String r5 = "product_id"
            long r2 = r4.optLong(r5, r2)     // Catch:{ Exception -> 0x005b }
            goto L_0x0060
        L_0x005b:
            java.lang.String r4 = "parse ext_info failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r4)
        L_0x0060:
            r7 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "enter store with ext info = "
            r2.append(r3)
            java.lang.String r3 = r13.ext_info
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            di0.o r6 = new di0.o
            r6.<init>()
            r6.f250930b = r10
            com.tencent.mm.protocal.protobuf.MiniAppInfo r2 = r13.mini_app_info
            r17 = 0
            if (r2 == 0) goto L_0x0087
            java.lang.String r3 = r2.appusername
            goto L_0x0089
        L_0x0087:
            r3 = r17
        L_0x0089:
            r6.f250929a = r3
            r6.f250934f = r0
            r0 = 1184(0x4a0, float:1.659E-42)
            r6.f250939k = r0
            if (r2 == 0) goto L_0x0097
            java.lang.String r0 = r2.request_id
            if (r0 != 0) goto L_0x0098
        L_0x0097:
            r0 = r11
        L_0x0098:
            r6.f250940l = r0
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r0.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.tencent.mm.protocal.protobuf.MiniAppInfo r3 = r13.mini_app_info
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = r3.product_path_cookie
            if (r3 != 0) goto L_0x00ad
        L_0x00ac:
            r3 = r11
        L_0x00ad:
            java.lang.String r4 = "cookies"
            r2.put(r4, r3)
            r5 = 1
            r0.f239396d = r5
            java.lang.String r2 = r2.toString()
            r0.f239399g = r2
            r6.f250947s = r0
            pf1.d0 r0 = pf1.C62262d0.f176978a
            boolean r2 = r0.mo87317h(r15)
            java.lang.String r4 = "holder.context"
            if (r2 == 0) goto L_0x012c
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r15.f34827a
            com.tencent.mm.protocal.protobuf.MiniAppInfo r2 = r2.mini_app_info
            if (r2 == 0) goto L_0x00d0
            boolean r2 = r2.hide_default_bar
            goto L_0x00d1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            pe1.c<java.lang.Integer> r18 = gg1.C32444a.f86113X0
            java.lang.Object r18 = r18.mo60266n()
            java.lang.Number r18 = (java.lang.Number) r18
            int r3 = r18.intValue()
            if (r3 != r5) goto L_0x00e2
            r18 = 1
            goto L_0x00e4
        L_0x00e2:
            r18 = r2
        L_0x00e4:
            android.content.Context r2 = r14.f173499A
            gy3.C87412m.m108593f(r2, r4)
            java.lang.Class r1 = r37.getClass()
            java.lang.String r3 = r1.getName()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r15.f34830d
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 960(0x3c0, float:1.345E-42)
            r25 = 0
            r26 = r1
            r1 = r2
            r2 = r6
            r27 = r4
            r4 = r26
            r5 = r36
            r28 = r6
            r6 = r18
            r29 = r7
            r7 = r19
            r8 = r20
            r31 = r9
            r9 = r21
            r32 = r10
            r10 = r22
            r33 = r11
            r11 = r23
            r34 = r12
            r12 = r24
            r14 = r13
            r13 = r25
            pf1.C62262d0.m73169g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x013b
        L_0x012c:
            r27 = r4
            r28 = r6
            r29 = r7
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r14 = r13
        L_0x013b:
            cj1.l6 r0 = new cj1.l6
            r0.<init>()
            r1 = r29
            r0.f153584e = r1
            r3 = r33
            r0.f153587h = r3
            java.lang.String r4 = "push"
            r0.f153586g = r4
            r4 = 2
            r0.f153591o = r4
            r5 = r31
            r0.f153592p = r5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r15.f34830d
            if (r5 == 0) goto L_0x0163
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            if (r5 == 0) goto L_0x0163
            java.lang.String r11 = r5.getUserName()
            if (r11 != 0) goto L_0x0164
        L_0x0163:
            r11 = r3
        L_0x0164:
            r0.f153589j = r11
            r0.f153588i = r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "anchorUsername:"
            r5.append(r6)
            java.lang.String r6 = r0.f153589j
            r5.append(r6)
            java.lang.String r6 = ", finderLiveToken empty"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = r28
            r5.f250937i = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.f250945q = r0
            java.lang.Class<tf0.q1> r0 = tf0.C13887q1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.q1 r0 = (tf0.C13887q1) r0
            int r0 = r0.mo13313J()
            r5.f250931c = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "[enterAdStore]  appId="
            r0.append(r7)
            java.lang.String r7 = r5.f250930b
            r0.append(r7)
            java.lang.String r7 = " enterPath="
            r0.append(r7)
            java.lang.String r7 = r5.f250934f
            r0.append(r7)
            java.lang.String r7 = " sceneNote="
            r0.append(r7)
            com.tencent.mm.protocal.protobuf.MiniAppInfo r7 = r14.mini_app_info
            if (r7 == 0) goto L_0x01c0
            java.lang.String r7 = r7.request_id
            goto L_0x01c2
        L_0x01c0:
            r7 = r17
        L_0x01c2:
            r0.append(r7)
            java.lang.String r7 = " pathCookie="
            r0.append(r7)
            com.tencent.mm.protocal.protobuf.MiniAppInfo r7 = r14.mini_app_info
            if (r7 == 0) goto L_0x01d2
            java.lang.String r11 = r7.product_path_cookie
            if (r11 != 0) goto L_0x01d3
        L_0x01d2:
            r11 = r3
        L_0x01d3:
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = r36
            android.content.Context r6 = r0.f173499A
            boolean r7 = r6 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r7 == 0) goto L_0x01e9
            r17 = r6
            com.tencent.mm.ui.MMActivity r17 = (com.tencent.p014mm.p136ui.MMActivity) r17
        L_0x01e9:
            if (r17 == 0) goto L_0x0252
            android.content.Intent r6 = r17.getIntent()
            java.lang.String r7 = "report_scene"
            r8 = 0
            int r6 = r6.getIntExtra(r7, r8)
            android.content.Intent r7 = r17.getIntent()
            java.lang.String r9 = "from_user"
            java.lang.String r7 = r7.getStringExtra(r9)
            android.content.Intent r9 = r17.getIntent()
            java.lang.String r10 = "key_from_user_name"
            java.lang.String r9 = r9.getStringExtra(r10)
            r10 = 1
            if (r6 == r10) goto L_0x0220
            if (r6 == r4) goto L_0x0220
            r4 = 3
            if (r6 == r4) goto L_0x0213
            goto L_0x022c
        L_0x0213:
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder r4 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.f210858a
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo r8 = new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo
            r8.<init>(r7, r3)
            r11 = r32
            r4.mo99898a(r11, r8)
            goto L_0x022c
        L_0x0220:
            r11 = r32
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder r4 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.f210858a
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo r10 = new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo
            r10.<init>(r7, r9, r8, r3)
            r4.mo99898a(r11, r10)
        L_0x022c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "scene :"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " fromUser:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " fromUserName："
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
        L_0x0252:
            java.lang.Class<ir.q> r3 = p565ir.C60612q.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ir.q r3 = (p565ir.C60612q) r3
            android.content.Context r4 = r0.f173499A
            r0 = r27
            gy3.C87412m.m108593f(r4, r0)
            r6 = r16
            r7 = r1
            r3.mo84963pH(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62266e.mo11775r(jq3.o, android.view.View, pf1.q):void");
    }

    /* renamed from: t */
    public boolean mo11795t() {
        return true;
    }
}
