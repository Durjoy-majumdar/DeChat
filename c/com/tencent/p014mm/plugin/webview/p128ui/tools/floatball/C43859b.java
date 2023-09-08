package com.tencent.p014mm.plugin.webview.p128ui.tools.floatball;

import aw0.C0225d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.HashSet;
import java.util.Set;
import uv0.C111237j;
import xv0.C112181e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.b */
public class C43859b extends C105052s {

    /* renamed from: v */
    public static final Set<String> f118776v;

    /* renamed from: s */
    public WebViewUI f118777s;

    /* renamed from: t */
    public boolean f118778t;

    /* renamed from: u */
    public boolean f118779u = false;

    static {
        HashSet hashSet = new HashSet();
        f118776v = hashSet;
        hashSet.add(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        hashSet.add(C74928u.C45093i.f122315g);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        hashSet.add(C74928u.C45093i.f122318j);
        hashSet.add("geta8key_scene");
        hashSet.add(C74928u.C45093i.f122325q);
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
    }

    public C43859b(C111237j jVar, WebViewUI webViewUI) {
        super(jVar);
        this.f118777s = webViewUI;
        Log.m105925i("MicroMsg.WebViewFloatBallHelper", "createFloatBallHelper, WebViewUI:%s", Integer.valueOf(webViewUI.hashCode()));
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        this.f118778t = true;
        Log.m105925i("MicroMsg.WebViewFloatBallHelper", "onCreate, type:%s, key:%s", Integer.valueOf(i), str);
        super.mo35648A(i, str);
        getReportInfo().f311717f = 3;
        this.f118777s.getClass();
        getReportInfo().f311716e = this.f118777s.f118513b1.mo67758z();
        if (mo68413C0(this.f118777s.mo6901n0())) {
            getReportInfo().f311720i = this.f118777s.getIntent().getStringExtra("srcUsername");
        }
        Log.m105919d("MicroMsg.WebViewFloatBallHelper", "initReportInfo generateScene %d", Integer.valueOf(getReportInfo().f311716e));
        mo68414O();
        if (this.f311808n.getIntent() != null && this.f311726d.f311678C != null) {
            C0225d.m179c(this.f311808n.getIntent(), this.f311726d.f311678C, f118776v);
            mo68414O();
        }
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        Log.m105925i("MicroMsg.WebViewFloatBallHelper", "onDestroy, WebViewUI:%s", Integer.valueOf(this.f118777s.hashCode()));
        super.mo67996A0();
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105925i("MicroMsg.WebViewFloatBallHelper", "onExitPage, WebViewUI:%s", Integer.valueOf(this.f118777s.hashCode()));
        super.mo64001C();
        this.f118779u = false;
    }

    /* renamed from: C0 */
    public boolean mo68413C0(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (!str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(HttpWrapperBase.PROTOCAL_HTTP);
            sb.append(WeChatHosts.domainString(C0966R.string.f360885fm3));
            sb.append("/");
            return str.startsWith(sb.toString());
        }
    }

    /* renamed from: O */
    public void mo68414O() {
        C112181e eVar;
        if (this.f118778t && (eVar = this.f311729g) != null) {
            eVar.mo149110a0(this.f311726d);
        }
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return this.f118777s.mo68243L8();
    }

    /* renamed from: b0 */
    public boolean mo68415b0() {
        return true;
    }

    /* renamed from: d0 */
    public BallInfo mo68416d0() {
        return mo149069e0();
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return this.f118777s.mo68243L8() && this.f311808n.mo23516g();
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.WebViewFloatBallHelper", "onReceivedBallInfoRemovedEvent, WebViewUI:%s", Integer.valueOf(this.f118777s.hashCode()));
        mo149200z0();
    }

    /* renamed from: k */
    public void mo68418k() {
        C112181e eVar;
        if (this.f118778t && (eVar = this.f311729g) != null) {
            eVar.mo149108Z(this.f311726d);
        }
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.WebViewFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, WebViewUI:%s", Integer.valueOf(this.f118777s.hashCode()));
        this.f311808n.mo23513d(false);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105925i("MicroMsg.WebViewFloatBallHelper", "onEnterPage, WebViewUI:%s, isEntered: %b", Integer.valueOf(this.f118777s.hashCode()), Boolean.valueOf(this.f118779u));
        if (!this.f118779u) {
            this.f118779u = true;
            super.mo64003o();
        }
    }

    /* renamed from: q0 */
    public void mo67998q0(String str) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo == null || Util.isNullOrNil(ballInfo.f311699t) || this.f311726d.f311699t.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || this.f311726d.f311699t.startsWith(HttpWrapperBase.PROTOCAL_HTTPS) || Util.isNullOrNil(str) || (!str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS))) {
            super.mo67998q0(str);
        }
    }

    /* renamed from: u */
    public void mo68419u() {
        C112181e eVar;
        if (this.f118778t && (eVar = this.f311729g) != null) {
            eVar.mo149095M(this.f311726d);
        }
    }
}
