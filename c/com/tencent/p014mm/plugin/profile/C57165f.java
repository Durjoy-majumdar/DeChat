package com.tencent.p014mm.plugin.profile;

import ob0.C11385n;

/* renamed from: com.tencent.mm.plugin.profile.f */
public class C57165f implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ NewContactWidgetNormal f163809d;

    public C57165f(NewContactWidgetNormal newContactWidgetNormal) {
        this.f163809d = newContactWidgetNormal;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r4 = r4.f135956e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r4, int r5, java.lang.String r6, ob0.C117747y r7) {
        /*
            r3 = this;
            r6 = 1
            r7.setHasCallbackToQueue(r6)
            ef2.a r7 = (ef2.C58565a) r7
            r0 = 0
            java.lang.String r1 = "MicroMsg.NewContactWidgetNormal"
            if (r4 != 0) goto L_0x004d
            if (r5 != 0) goto L_0x004d
            te3.l52 r4 = r7.f167641f
            if (r4 != 0) goto L_0x001b
            ob0.c r4 = r7.f167640e
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            te3.l52 r4 = (te3.C50218l52) r4
            r7.f167641f = r4
        L_0x001b:
            te3.l52 r4 = r7.f167641f
            java.lang.String r4 = r4.f137183d
            r5 = 0
            android.net.Uri r5 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0033
        L_0x0025:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r7 = r7.getMessage()
            r2[r0] = r7
            java.lang.String r7 = "goToWework() Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r2)
        L_0x0033:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r7.<init>(r2, r5)
            com.tencent.mm.plugin.profile.NewContactWidgetNormal r5 = r3.f163809d
            com.tencent.mm.ui.MMActivity r5 = r5.f202419d
            r2 = 111(0x6f, float:1.56E-43)
            r5.startActivityForResult((android.content.Intent) r7, (int) r2)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r0] = r4
            java.lang.String r4 = "goToWework() success! openurl:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)
            return
        L_0x004d:
            java.lang.String r4 = "goToWework() fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            te3.l52 r4 = r7.f167641f
            if (r4 != 0) goto L_0x0060
            ob0.c r4 = r7.f167640e
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            te3.l52 r4 = (te3.C50218l52) r4
            r7.f167641f = r4
        L_0x0060:
            te3.l52 r4 = r7.f167641f
            te3.ja r4 = r4.BaseResponse
            if (r4 == 0) goto L_0x0071
            te3.rv3 r4 = r4.f135956e
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = r4.f141175d
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            goto L_0x0073
        L_0x0071:
            java.lang.String r4 = r7.f167642g
        L_0x0073:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0084
            com.tencent.mm.plugin.profile.NewContactWidgetNormal r4 = r3.f163809d
            com.tencent.mm.ui.MMActivity r4 = r4.f202419d
            r5 = 2131833866(0x7f11340a, float:1.9300826E38)
            java.lang.String r4 = r4.getString(r5)
        L_0x0084:
            com.tencent.mm.plugin.profile.NewContactWidgetNormal r5 = r3.f163809d
            com.tencent.mm.ui.MMActivity r5 = r5.f202419d
            r6 = 2131838029(0x7f11444d, float:1.930927E38)
            java.lang.String r6 = r5.getString(r6)
            nj3.C76879j.m92712F(r5, r4, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.C57165f.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
