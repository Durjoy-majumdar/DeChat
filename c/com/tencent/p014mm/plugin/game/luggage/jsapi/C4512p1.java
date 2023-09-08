package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.OutputStream;
import k83.C9566b;
import k83.C9568c;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.p1 */
public class C4512p1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.p1$a */
    public class C4513a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ String f19277d;

        /* renamed from: e */
        public final /* synthetic */ C53096b.C53097a f19278e;

        public C4513a(C4512p1 p1Var, String str, C53096b.C53097a aVar) {
            this.f19277d = str;
            this.f19278e = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            OutputStream outputStream = null;
            if (bundle.getBoolean("backRet")) {
                boolean z = bundle.getBoolean("backIsFile", false);
                String string = bundle.getString("backFileName");
                if (z && !Util.isNullOrNil(string)) {
                    Log.m105925i("MicroMsg.JsApiSetGameData", "store data to file. fileName:%s", string);
                    C9566b c = C9566b.m9247c();
                    String str = this.f19277d;
                    c.getClass();
                    if (!Util.isNullOrNil(string) && !Util.isNullOrNil(str)) {
                        Log.m105919d("MicroMsg.WebViewDataCenter", "PageCache cache_size:%d, cache_content:%s", Integer.valueOf(str.getBytes().length), str);
                        String str2 = C9568c.m9252bD() + string;
                        C86009m1 m1Var = new C86009m1(C9568c.m9252bD());
                        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                            m1Var.mo119987x();
                        }
                        try {
                            byte[] bytes = str.getBytes();
                            outputStream = C86013q1.m106429K(str2, false);
                            outputStream.write(bytes);
                        } catch (IOException e) {
                            Log.m105920e("MicroMsg.WebViewDataCenter", "savePageCache: " + e.getMessage());
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
                this.f19278e.mo73776a();
                return;
            }
            this.f19278e.mo73778c("exceed_size", (JSONObject) null);
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.p1$b */
    public static class C4514b implements C80883e<Bundle, Bundle> {
        private C4514b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            boolean z;
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("appId");
            String string2 = bundle.getString("key");
            String string3 = bundle.getString("value");
            String string4 = bundle.getString("weight");
            String string5 = bundle.getString("expireTime");
            boolean z2 = bundle.getBoolean("autoClean");
            long j = bundle.getLong("storeSize");
            Bundle bundle2 = new Bundle();
            if (!Util.isNullOrNil(string3)) {
                C9566b c = C9566b.m9247c();
                c.getClass();
                z = c.mo10246e(string, string2, string3, string4, string5, z2, (long) (string2.getBytes().length + string3.getBytes().length), "");
            } else {
                boolean e = C9566b.m9247c().mo10246e(string, string2, "", string4, string5, z2, j, string2);
                bundle2.putBoolean("backIsFile", true);
                bundle2.putString("backFileName", string2);
                z = e;
            }
            bundle2.putBoolean("backRet", z);
            gVar.mo894a(bundle2);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "setGameData";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0146  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5385e(p828wa.C53096b<p828wa.C53095a>.a r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "MicroMsg.JsApiSetGameData"
            java.lang.String r2 = "invokeInOwn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            sa.k r2 = r0.f148190b
            org.json.JSONObject r2 = r2.f129368c
            r3 = 0
            if (r2 != 0) goto L_0x001b
            java.lang.String r2 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            java.lang.String r1 = "null_data"
            r0.mo73778c(r1, r3)
            return
        L_0x001b:
            CONTEXT r4 = r0.f148189a
            wa.a r4 = (p828wa.C53095a) r4
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.game.luggage.page.GameWebPage
            if (r5 == 0) goto L_0x0061
            r6 = r4
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r6 = (com.tencent.p014mm.plugin.game.luggage.page.GameWebPage) r6
            com.tencent.mm.plugin.webview.luggage.m1 r7 = r6.f117923M
            java.lang.String r7 = r7.mo67920b()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x0064
            java.lang.String r6 = r6.mo67941t()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r7 = r6.getHost()
            if (r7 == 0) goto L_0x0056
            java.lang.String r6 = r6.getHost()
            r7 = 2131831302(0x7f112a06, float:1.9295626E38)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r7)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0056
            goto L_0x0061
        L_0x0056:
            java.lang.String r2 = "appId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r1 = "appid_null"
            r0.mo73778c(r1, r3)
            return
        L_0x0061:
            java.lang.String r7 = "wx62d9035fd4fd2059"
        L_0x0064:
            java.lang.String r6 = "key"
            java.lang.String r8 = r2.optString(r6)
            java.lang.String r9 = "value"
            java.lang.String r10 = r2.optString(r9)
            java.lang.String r11 = "weight"
            java.lang.String r12 = "1"
            java.lang.String r12 = r2.optString(r11, r12)
            java.lang.String r13 = "expireTime"
            java.lang.String r14 = r2.optString(r13)
            java.lang.String r15 = "autoClean"
            r3 = 1
            boolean r0 = r2.optBoolean(r15, r3)
            java.lang.String r3 = "pageCache"
            r16 = r1
            r1 = 0
            boolean r2 = r2.optBoolean(r3, r1)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r3 != 0) goto L_0x0146
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r3 != 0) goto L_0x0146
            int r3 = r8.length()
            r1 = 80
            if (r3 <= r1) goto L_0x00a6
            goto L_0x0146
        L_0x00a6:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "appId"
            r1.putString(r3, r7)
            r1.putString(r6, r8)
            r1.putString(r11, r12)
            r1.putString(r13, r14)
            r1.putBoolean(r15, r0)
            k83.b r0 = k83.C9566b.m9247c()
            r0.getClass()
            byte[] r0 = r8.getBytes()
            int r0 = r0.length
            byte[] r3 = r10.getBytes()
            int r3 = r3.length
            int r0 = r0 + r3
            long r6 = (long) r0
            java.lang.String r0 = "storeSize"
            r1.putLong(r0, r6)
            r11 = 204800(0x32000, double:1.011846E-318)
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x00e1
            if (r2 != 0) goto L_0x00e1
            r1.putString(r9, r10)
        L_0x00e1:
            if (r2 == 0) goto L_0x0135
            java.lang.String r0 = "ban_set_page_cache"
            if (r5 == 0) goto L_0x012e
            java.lang.Class<v10.e> r2 = v10.C52735e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            v10.e r2 = (v10.C52735e) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_game_open_page_cache
            r5 = 0
            int r2 = r2.mo61266Ad(r3, r5)
            r3 = 1
            if (r2 != r3) goto L_0x00fb
            r2 = 1
            goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            com.tencent.mm.plugin.game.luggage.page.GameWebPage r4 = (com.tencent.p014mm.plugin.game.luggage.page.GameWebPage) r4
            kb3.m r4 = r4.mo65799f0()
            boolean r4 = r4.f125663p
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r6[r5] = r7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r6[r3] = r5
            java.lang.String r3 = "isOpenPageCache:%b, allowSetPageCache:%b"
            r5 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r6)
            if (r2 != 0) goto L_0x0125
            java.lang.String r0 = "close_page_cache"
            r2 = r18
            r3 = 0
            r2.mo73778c(r0, r3)
            return
        L_0x0125:
            r2 = r18
            r3 = 0
            if (r4 != 0) goto L_0x0137
            r2.mo73778c(r0, r3)
            return
        L_0x012e:
            r2 = r18
            r3 = 0
            r2.mo73778c(r0, r3)
            goto L_0x0137
        L_0x0135:
            r2 = r18
        L_0x0137:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            java.lang.Class<com.tencent.mm.plugin.game.luggage.jsapi.p1$b> r3 = com.tencent.p014mm.plugin.game.luggage.jsapi.C4512p1.C4514b.class
            com.tencent.mm.plugin.game.luggage.jsapi.p1$a r4 = new com.tencent.mm.plugin.game.luggage.jsapi.p1$a
            r6 = r17
            r4.<init>(r6, r10, r2)
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r0, r1, r3, r4)
            return
        L_0x0146:
            r6 = r17
            r2 = r18
            r5 = r16
            java.lang.String r0 = "key or value is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.String r0 = "null_key"
            r1 = 0
            r2.mo73778c(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C4512p1.mo5385e(wa.b$a):void");
    }
}
