package com.tencent.p014mm.plugin.game.luggage.page;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.q */
public class C41977q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameWebPage f113079d;

    public C41977q(GameWebPage gameWebPage) {
        this.f113079d = gameWebPage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0082 A[SYNTHETIC, Splitter:B:14:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r0 = r7.f113079d
            com.tencent.mm.plugin.webview.luggage.n0 r0 = r0.f117951u
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r4 = "MicroMsg.GameWebPage"
            if (r0 == 0) goto L_0x002f
            int r0 = r0.getTopBarHeight()
            int r0 = js0.C88020k.m109555f(r0)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r2] = r0
            java.lang.String r0 = "javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTopBarHeight__= %d; })()"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r0
            java.lang.String r6 = "gameTopHeight:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r5 = r7.f113079d
            r5.mo67937p(r0, r3)
        L_0x002f:
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r0 = r7.f113079d
            java.lang.String r0 = r0.mo65795c0()
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r5 = r7.f113079d
            r5.getClass()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0048 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x0048 }
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x006c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r0
            java.lang.String r6 = "javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gamePreInjectData__= %s; })()"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r2] = r0
            java.lang.String r0 = "preInjectData, size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r6)
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r0 = r7.f113079d
            r0.mo67937p(r5, r3)
        L_0x006c:
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r0 = r7.f113079d
            android.os.Bundle r0 = r0.f148261n
            java.lang.String r5 = "game_liteapp_pass_data"
            java.lang.String r0 = r0.getString(r5)
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r5 = r7.f113079d
            r5.getClass()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x0082
            goto L_0x0089
        L_0x0082:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0089 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x0089 }
            r5 = 1
            goto L_0x008a
        L_0x0089:
            r5 = 0
        L_0x008a:
            if (r5 == 0) goto L_0x00ad
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r0
            java.lang.String r6 = "javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__passbyData__= %s; })()"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            java.lang.String r0 = "liteAppPassByData, size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r1)
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r0 = r7.f113079d
            r0.mo67937p(r5, r3)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.page.C41977q.run():void");
    }
}
