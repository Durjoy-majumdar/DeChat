package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import p828wa.C53096b;
import p828wa.C53104i;
import p828wa.C53106j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.x0 */
public class C5999x0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.x0$a */
    public class C6000a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f22247d;

        /* renamed from: e */
        public final /* synthetic */ C53096b.C53097a f22248e;

        /* renamed from: f */
        public final /* synthetic */ String f22249f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f22250g;

        public C6000a(C5999x0 x0Var, boolean z, C53096b.C53097a aVar, String str, Bundle bundle) {
            this.f22247d = z;
            this.f22248e = aVar;
            this.f22249f = str;
            this.f22250g = bundle;
        }

        public void run() {
            if (this.f22247d) {
                C53106j jVar = C53106j.this;
                String str = this.f22249f;
                Bundle bundle = this.f22250g;
                C53104i pop = jVar.f148204d.size() == 0 ? null : jVar.f148204d.pop();
                if (pop != null) {
                    jVar.mo73795j(pop);
                }
                jVar.mo73793h(str, bundle, false);
                return;
            }
            C53106j.this.mo73792g(this.f22249f, this.f22250g);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "openCustomWebview";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        if (r0.equals("vertical") != false) goto L_0x0051;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5385e(p828wa.C53096b<com.tencent.p014mm.plugin.webview.luggage.C43658n>.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.JsApiOpenCustomWebView"
            java.lang.String r1 = "invokeInOwn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            sa.k r1 = r11.f148190b
            org.json.JSONObject r1 = r1.f129368c
            java.lang.String r2 = "url"
            java.lang.String r7 = r1.optString(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r1 == 0) goto L_0x001f
            r0 = 0
            java.lang.String r1 = "invalid_url"
            r11.mo73778c(r1, r0)
            return
        L_0x001f:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r7
            java.lang.String r4 = "url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r2)
            sa.k r0 = r11.f148190b
            org.json.JSONObject r0 = r0.f129368c
            java.lang.String r2 = "orientation"
            java.lang.String r0 = r0.optString(r2)
            r2 = -1
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = "horizontal"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0046
            r1 = 0
            goto L_0x0051
        L_0x0046:
            java.lang.String r4 = "vertical"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r1 = -1
        L_0x0051:
            sa.k r0 = r11.f148190b
            org.json.JSONObject r0 = r0.f129368c
            java.lang.String r2 = "fullscreen"
            boolean r0 = r0.optBoolean(r2)
            sa.k r2 = r11.f148190b
            org.json.JSONObject r2 = r2.f129368c
            java.lang.String r4 = "finish_recent_webview"
            java.lang.String r2 = r2.optString(r4)
            java.lang.String r4 = "1"
            boolean r5 = r2.equals(r4)
            sa.k r2 = r11.f148190b
            org.json.JSONObject r2 = r2.f129368c
            java.lang.String r6 = "disable_swipe_back"
            java.lang.String r2 = r2.optString(r6)
            boolean r2 = r2.equals(r4)
            sa.k r4 = r11.f148190b
            org.json.JSONObject r4 = r4.f129368c
            java.lang.String r8 = "username"
            java.lang.String r4 = r4.optString(r8)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = "rawUrl"
            r8.putString(r9, r7)
            java.lang.String r9 = "screen_orientation"
            r8.putInt(r9, r1)
            java.lang.String r1 = "show_full_screen"
            r8.putBoolean(r1, r0)
            r8.putBoolean(r6, r2)
            java.lang.String r0 = "shortcut_user_name"
            r8.putString(r0, r4)
            sa.k r0 = r11.f148190b
            org.json.JSONObject r0 = r0.f129368c
            java.lang.String r1 = "gameAppid"
            java.lang.String r0 = r0.optString(r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r1 = "game_hv_menu_appid"
            r8.putString(r1, r0)
            CONTEXT r0 = r11.f148189a
            com.tencent.mm.plugin.webview.luggage.n r0 = (com.tencent.p014mm.plugin.webview.luggage.C43658n) r0
            android.os.Bundle r0 = r0.f148261n
            java.lang.String r1 = "from_find_more_friend"
            boolean r0 = r0.getBoolean(r1, r3)
            r8.putBoolean(r1, r0)
            com.tencent.mm.plugin.webview.luggage.jsapi.x0$a r0 = new com.tencent.mm.plugin.webview.luggage.jsapi.x0$a
            r3 = r0
            r4 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            r11.mo73776a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.jsapi.C5999x0.mo5385e(wa.b$a):void");
    }
}
