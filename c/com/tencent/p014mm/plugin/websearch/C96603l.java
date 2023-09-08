package com.tencent.p014mm.plugin.websearch;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import bp3.C104160f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.websearch.C96598h;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import i40.C98598e;
import java.util.ArrayList;
import jo3.C76430b;
import kv1.C99260q;
import ob0.C89137b0;
import org.json.JSONObject;
import p196ln.C76706g;
import u73.C101977i1;
import u73.C101978k0;
import u73.C101980n;
import u73.C14129j;
import u73.C14130k;
import u73.C14131l;
import u73.C14132m;
import u73.C14135q;
import u73.C52469w0;
import xi3.C78844a;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.websearch.l */
public class C96603l extends C98598e implements C101980n {

    /* renamed from: i */
    public C96598h f282815i;

    /* renamed from: j */
    public FTSWebViewLogic f282816j;

    /* renamed from: n */
    public FTSWebViewImageLogic f282817n;

    /* renamed from: o */
    public C96595d f282818o;

    /* renamed from: p */
    public MultiProcessMMKV f282819p;

    /* renamed from: com.tencent.mm.plugin.websearch.l$a */
    public class C30558a implements Runnable {

        /* renamed from: d */
        public boolean f82327d;

        public C30558a(boolean z) {
            this.f82327d = z;
        }

        public void run() {
            C96603l lVar = C96603l.this;
            boolean z = this.f82327d;
            lVar.getClass();
            if (!MMApplicationContext.isMainProcess()) {
                Log.m105924i("MicroMsg.WebSearch.PluginWebSearch", "only work in main process");
                return;
            }
            Log.m105925i("MicroMsg.WebSearch.PluginWebSearch", "checkWebSearchTemplate %b", Boolean.valueOf(z));
            int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            for (int i = 0; i < 12; i++) {
                C43471q.m46983g(iArr[i]).mo71061l();
            }
        }
    }

    /* renamed from: BU */
    public String mo134682BU(String str) {
        JSONObject optJSONObject;
        try {
            JSONObject optJSONObject2 = new JSONObject(" { \"exposedWords\": { \"express\": { \"zh_CN\": \"查快递\", \"zh_HK\": \"查快遞\", \"zh_TW\": \"查快遞\", \"en\": \"express\" } } }").optJSONObject("exposedWords");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(str)) == null) {
                return "";
            }
            String applicationLanguage = LocaleUtil.getApplicationLanguage();
            String optString = optJSONObject.optString(applicationLanguage);
            return (!TextUtils.isEmpty(optString) || TextUtils.equals(applicationLanguage, "en")) ? optString : optJSONObject.optString("en");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WebSearch.PluginWebSearch", th, "getExposedWord:%s", str);
            return "";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: D6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo134683D6(u73.C101983r r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.Class<vr.e> r1 = p255vr.C65873e.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            com.tencent.mm.storage.f4 r3 = r0.f300284c
            int r4 = r0.f300285d
            r8 = 0
            switch(r4) {
                case 1: goto L_0x001f;
                case 2: goto L_0x001f;
                case 3: goto L_0x001f;
                case 4: goto L_0x001f;
                case 5: goto L_0x001d;
                case 6: goto L_0x001b;
                case 7: goto L_0x0019;
                case 8: goto L_0x0019;
                case 9: goto L_0x0016;
                case 10: goto L_0x001d;
                case 11: goto L_0x0013;
                case 12: goto L_0x0013;
                case 13: goto L_0x0013;
                case 14: goto L_0x0013;
                case 15: goto L_0x0013;
                case 16: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            goto L_0x002e
        L_0x0013:
            r3 = 11
            goto L_0x002e
        L_0x0016:
            r3 = 9
            goto L_0x002e
        L_0x0019:
            r3 = 7
            goto L_0x002e
        L_0x001b:
            r3 = 6
            goto L_0x002e
        L_0x001d:
            r3 = 5
            goto L_0x002e
        L_0x001f:
            if (r3 == 0) goto L_0x0011
            java.lang.String r3 = r3.mo108768t()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 3
        L_0x002e:
            int r4 = r0.f300285d
            java.lang.String r9 = "key_source"
            r2.putExtra(r9, r4)
            java.lang.String r4 = "key_scan_goods_request_type"
            r2.putExtra(r4, r3)
            int r3 = r0.f300285d
            r10 = 17
            r11 = 0
            java.lang.String r13 = "key_upload_image_use_cdn_opt"
            java.lang.String r14 = "key_scene"
            java.lang.String r15 = "startImageSearch %s %s %s %s %s"
            java.lang.String r5 = "key_sns_image_path"
            java.lang.String r7 = "com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI"
            r16 = 2
            r17 = 1
            java.lang.String r6 = "MicroMsg.WebSearch.PluginWebSearch"
            java.lang.String r4 = "key_session_id"
            switch(r3) {
                case 5: goto L_0x0183;
                case 6: goto L_0x0183;
                case 7: goto L_0x0183;
                case 8: goto L_0x0183;
                case 9: goto L_0x0183;
                case 10: goto L_0x0183;
                case 11: goto L_0x0108;
                case 12: goto L_0x0108;
                case 13: goto L_0x0108;
                case 14: goto L_0x0108;
                case 15: goto L_0x0108;
                case 16: goto L_0x005c;
                case 17: goto L_0x00ad;
                case 18: goto L_0x0108;
                case 19: goto L_0x0108;
                case 20: goto L_0x0108;
                case 21: goto L_0x0108;
                default: goto L_0x005c;
            }
        L_0x005c:
            r8 = r9
            r9 = r4
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.e r1 = (p255vr.C65873e) r1
            r4 = 67
            long r4 = r1.vk0(r4)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r7 = "com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI"
            r2.setClassName(r1, r7)
            int r1 = r0.f300285d
            r2.putExtra(r8, r1)
            com.tencent.mm.storage.f4 r1 = r0.f300284c
            long r7 = r1.getMsgId()
            java.lang.String r1 = "key_msg_id"
            r2.putExtra(r1, r7)
            r2.putExtra(r9, r4)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mm.storage.f4 r7 = r0.f300284c
            long r7 = r7.getMsgId()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r3 = 0
            r1[r3] = r7
            int r7 = r0.f300285d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r17] = r7
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r16] = r4
            java.lang.String r4 = "startImageSearch %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r1)
            goto L_0x01e0
        L_0x00ad:
            r2.putExtra(r13, r8)
            r18 = r9
            long r8 = r0.f300282a
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00b9
            goto L_0x00c3
        L_0x00b9:
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.e r1 = (p255vr.C65873e) r1
            long r8 = r1.vk0(r10)
        L_0x00c3:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r2.setClassName(r1, r7)
            java.lang.String r1 = r0.f300288g
            r2.putExtra(r5, r1)
            r2.putExtra(r4, r8)
            int r1 = r0.f300285d
            r4 = r18
            r2.putExtra(r4, r1)
            int r1 = r0.f300290i
            r2.putExtra(r14, r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r1)
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r0.f300286e
            r3 = 0
            r1[r3] = r4
            java.lang.String r4 = r0.f300287f
            r1[r17] = r4
            java.lang.String r4 = r0.f300288g
            r1[r16] = r4
            int r4 = r0.f300285d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r1[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r5 = 4
            r1[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r15, r1)
            goto L_0x01e0
        L_0x0108:
            r8 = r9
            r3 = 0
            r2.putExtra(r13, r3)
            r9 = r4
            long r3 = r0.f300282a
            int r18 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r18 == 0) goto L_0x0115
            goto L_0x011f
        L_0x0115:
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.e r1 = (p255vr.C65873e) r1
            long r3 = r1.vk0(r10)
        L_0x011f:
            r10 = r3
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r2.setClassName(r1, r7)
            java.lang.String r1 = r0.f300288g
            r2.putExtra(r5, r1)
            r2.putExtra(r9, r10)
            int r1 = r0.f300285d
            r2.putExtra(r8, r1)
            int r1 = r0.f300285d
            r3 = 15
            if (r1 == r3) goto L_0x0155
            r3 = 16
            if (r1 == r3) goto L_0x0155
            r3 = 18
            if (r1 == r3) goto L_0x0155
            r3 = 19
            if (r1 == r3) goto L_0x0155
            r3 = 20
            if (r1 == r3) goto L_0x0155
            r3 = 21
            if (r1 != r3) goto L_0x014f
            goto L_0x0155
        L_0x014f:
            r1 = 83
            r2.putExtra(r14, r1)
            goto L_0x015a
        L_0x0155:
            int r1 = r0.f300290i
            r2.putExtra(r14, r1)
        L_0x015a:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r1)
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r0.f300286e
            r4 = 0
            r1[r4] = r3
            java.lang.String r4 = r0.f300287f
            r1[r17] = r4
            java.lang.String r4 = r0.f300288g
            r1[r16] = r4
            int r4 = r0.f300285d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r1[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r5 = 4
            r1[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r15, r1)
            goto L_0x01e0
        L_0x0183:
            r9 = r4
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.e r1 = (p255vr.C65873e) r1
            r4 = 81
            long r10 = r1.vk0(r4)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r2.setClassName(r1, r7)
            java.lang.String r1 = r0.f300286e
            java.lang.String r4 = "key_sns_id"
            r2.putExtra(r4, r1)
            java.lang.String r1 = r0.f300287f
            java.lang.String r4 = "key_sns_username"
            r2.putExtra(r4, r1)
            java.lang.String r1 = r0.f300288g
            r2.putExtra(r5, r1)
            r2.putExtra(r9, r10)
            te3.kv2 r1 = r0.f300289h
            if (r1 == 0) goto L_0x01bd
            java.lang.String r4 = "key_sns_media"
            byte[] r1 = r1.toByteArray()     // Catch:{ Exception -> 0x01bd }
            r2.putExtra(r4, r1)     // Catch:{ Exception -> 0x01bd }
        L_0x01bd:
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r0.f300286e
            r3 = 0
            r1[r3] = r4
            java.lang.String r4 = r0.f300287f
            r1[r17] = r4
            java.lang.String r4 = r0.f300288g
            r1[r16] = r4
            int r4 = r0.f300285d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r1[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r5 = 4
            r1[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r15, r1)
        L_0x01e0:
            android.content.Context r0 = r0.f300283b
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r2)
            java.lang.Object[] r8 = r1.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/websearch/PluginWebSearch"
            java.lang.String r10 = "startImageSearch"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/websearch/api/ImageSearchContext;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/websearch/PluginWebSearch"
            java.lang.String r9 = "startImageSearch"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/websearch/api/ImageSearchContext;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.C96603l.mo134683D6(u73.r):void");
    }

    /* renamed from: EO */
    public boolean mo134684EO() {
        return true;
    }

    /* renamed from: Hw */
    public String mo134685Hw() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_editor_helper_conf, "{\n    \"reuseBrands\":[\"vivo\",\"samsung\"],\n    \"reuseItems\":[\"剪贴板\",\"Clipboard\",\"剪貼板\"],\n    \"sysMenuConfig\":{\n    \t\"vivo\" : [\n    \t\t{\n    \t\t\t\"idName\" : \"clipboard\",\n    \t\t\t\"idPackage\": \"vivo\",\n    \t\t\t\"titleName\": \"vivo_clipboard_title\",\n    \t\t\t\"titlePackage\" : \"vivo\"\n    \t\t}\n    \t],\n    \t\"samsung\" : [\n    \t\t{\n    \t\t\t\"idName\" : \"clipboard\",\n    \t\t\t\"idPackage\": \"android\",\n    \t\t\t\"titleName\": \"tw_clipboard_title_text\",\n    \t\t\t\"titlePackage\" : \"android\"\n    \t\t}\n    \t]\n    }\n}");
    }

    /* renamed from: JM */
    public C14131l mo134686JM() {
        if (this.f282817n == null) {
            this.f282817n = new FTSWebViewImageLogic();
        }
        return this.f282817n;
    }

    public boolean Kr0() {
        boolean h = C78844a.C15689b.f42385a.mo108842h(true);
        if (h) {
            C76430b.m91852a(10);
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_is_use_sys_edit_text, C104160f.RepairerConfig_Global_EditText_Int, 1) == 1 || h) {
            return true;
        }
        if (C85875k4.f250154E == null) {
            C85875k4.f250154E = Boolean.valueOf("meizu".equalsIgnoreCase(Build.MANUFACTURER));
        }
        return C85875k4.f250154E.booleanValue();
    }

    /* renamed from: g9 */
    public C14132m mo134688g9() {
        if (this.f282816j == null) {
            this.f282816j = new FTSWebViewLogic();
        }
        return this.f282816j;
    }

    /* renamed from: gk */
    public C14129j mo134689gk() {
        if (this.f282818o == null) {
            C96595d dVar = new C96595d();
            this.f282818o = dVar;
            C86709a0.m107524d().mo123455a(1532, dVar);
        }
        return this.f282818o;
    }

    /* renamed from: lS */
    public C14130k mo134690lS() {
        if (this.f282815i == null) {
            this.f282815i = new C96598h();
        }
        return this.f282815i;
    }

    public boolean n30() {
        return true;
    }

    /* renamed from: sm */
    public MultiProcessMMKV mo134692sm() {
        if (this.f282819p == null) {
            this.f282819p = MultiProcessMMKV.getMMKV("WebSearchLogic", 2);
        }
        return this.f282819p;
    }

    /* renamed from: tB */
    public boolean mo134693tB() {
        return true;
    }

    public void xx0(Context context) {
        ((C14135q) C86312j.m106911c(C14135q.class)).init();
        ((C119157j) C119157j.f356862d).mo183876g(new C30558a(C86709a0.m107523b().f251754e.f222289a), "WebSearchThread");
        ((C119157j) C119157j.f356862d).mo183876g(new C101977i1(-1), "WebSearchThread");
        if (this.f282815i == null) {
            this.f282815i = new C96598h();
        }
    }

    public void zx0() {
        C52469w0.f146609a = null;
        C96598h hVar = this.f282815i;
        if (hVar != null) {
            C96598h.C96601d dVar = hVar.f282797p;
            if (dVar.f282808d != null) {
                C86709a0.m107524d().mo123458d(dVar.f282808d);
            }
            C96598h.C96601d.C96602a aVar = dVar.f282810f;
            if (aVar != null) {
                aVar.f282813e = true;
            }
            C96598h.C5830e eVar = hVar.f282799r;
            if (eVar.f21989a != null) {
                C89137b0 d = C86709a0.m107524d();
                ((C101978k0) eVar.f21989a).getClass();
                d.mo123470p(1161, C96598h.this);
            }
            if (hVar.f282800s != null) {
                ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(hVar.f282800s);
                hVar.f282800s = null;
            }
            ((ArrayList) ((C96604n) hVar.f282796o).f282821b).clear();
            hVar.f282795n.removeCallbacksAndMessages((Object) null);
            hVar.f282795n.quit();
            this.f282815i = null;
        }
        FTSWebViewLogic fTSWebViewLogic = this.f282816j;
        if (fTSWebViewLogic != null) {
            fTSWebViewLogic.getClass();
            C86709a0.m107524d().mo123470p(2975, fTSWebViewLogic);
            fTSWebViewLogic.f282768p.dead();
            if (fTSWebViewLogic.f282763h != null) {
                C86709a0.m107524d().mo123470p(1048, fTSWebViewLogic);
                C86709a0.m107524d().mo123458d(fTSWebViewLogic.f282763h);
                fTSWebViewLogic.f282763h = null;
            }
            this.f282816j = null;
        }
        FTSWebViewImageLogic fTSWebViewImageLogic = this.f282817n;
        if (fTSWebViewImageLogic != null) {
            fTSWebViewImageLogic.f21972n.dead();
            fTSWebViewImageLogic.f21971j.dead();
            ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg().remove(fTSWebViewImageLogic);
            this.f282817n = null;
        }
        C96595d dVar2 = this.f282818o;
        if (dVar2 != null) {
            dVar2.getClass();
            C86709a0.m107524d().mo123470p(1532, dVar2);
            this.f282818o = null;
        }
    }
}
