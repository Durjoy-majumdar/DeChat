package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43859b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.FontChooserView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.WebView;
import di3.C86312j;
import gy3.C87412m;
import i93.C8866a;
import j20.C117292a;
import java.net.URL;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import o00.C47315c;
import o40.C61926c;
import qo3.C77407n;
import sf0.C48374j0;
import te3.C52018xt1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0 */
public final class WebViewUI$$k0 extends C43505b0 {

    /* renamed from: c */
    public C43823a f118640c = new C43823a((WebViewUI.C438121) null);

    /* renamed from: d */
    public C43824b f118641d = new C43824b((WebViewUI.C438121) null);

    /* renamed from: e */
    public final /* synthetic */ WebViewUI f118642e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0$a */
    public final class C43823a extends C43519u {
        public C43823a(WebViewUI.C438121 r2) {
        }

        /* renamed from: a */
        public void mo67809a(WebView webView, String str, boolean z) {
            WebViewUI$$k0.this.f118642e.f118531h2.mo68756a();
            if (WebViewUI$$k0.this.f118642e.f118480P1 != null && NetStatusUtil.isConnected(MMApplicationContext.getContext()) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
                WebViewUI$$k0.this.f118642e.f118480P1.mo149079t0("rawUrl", str);
                C43859b bVar = WebViewUI$$k0.this.f118642e.f118480P1;
                bVar.getReportInfo().f311718g = str;
                bVar.mo68414O();
            }
            if (WebViewUI$$k0.this.f118642e.f118483Q1 != null && NetStatusUtil.isConnected(MMApplicationContext.getContext()) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
                WebViewUI$$k0.this.f118642e.f118483Q1.f150468z.f135051e = str;
            }
            WebViewUI$$k0.this.f118642e.mo68228C9(str);
            WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
            webViewUI.mo68288i9(webViewUI.mo68256S8());
        }

        /* renamed from: b */
        public void mo64752b(WebView webView, String str) {
            WebViewUIStyleHelper webViewUIStyleHelper = WebViewUI$$k0.this.f118642e.f118477N1;
            webViewUIStyleHelper.getClass();
            Log.m105925i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageCommitVisible, url:%s", str);
            ((C47315c) C86312j.m106911c(C47315c.class)).mo72370uk(str, webViewUIStyleHelper.f118667d);
            webViewUIStyleHelper.f118670g = str;
            WebViewUI.m47807I7(WebViewUI$$k0.this.f118642e, webView, str);
        }

        /* renamed from: c */
        public void mo64753c(WebView webView, String str) {
            if (WebViewUI$$k0.this.f118642e.f118480P1 != null && NetStatusUtil.isConnected(MMApplicationContext.getContext()) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
                WebViewUI$$k0.this.f118642e.f118480P1.mo149079t0("rawUrl", str);
                C43859b bVar = WebViewUI$$k0.this.f118642e.f118480P1;
                bVar.getReportInfo().f311718g = str;
                bVar.mo68414O();
            }
            if (WebViewUI$$k0.this.f118642e.f118483Q1 != null && NetStatusUtil.isConnected(MMApplicationContext.getContext()) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
                WebViewUI$$k0.this.f118642e.f118483Q1.f150468z.f135051e = str;
            }
            WebViewUI$$k0.this.f118642e.mo68228C9(str);
            WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
            if (!webViewUI.f118545n1) {
                webViewUI.f118545n1 = true;
                webViewUI.f118459E1.mo68006b().f118137a = true;
            }
            Log.m105925i("MicroMsg.WebViewUI", "onPageFinished, old title = %s, new title = %s, fixedTitle = %b, showTitle = %b, loadUrl = %s", WebViewUI$$k0.this.f118642e.getMMTitle(), WebViewUI$$k0.this.f118642e.f118523f.getTitle(), Boolean.valueOf(WebViewUI$$k0.this.f118642e.f118517d), Boolean.valueOf(WebViewUI$$k0.this.f118642e.f118484R), WebViewUI$$k0.this.f118642e.f118513b1.f117597w);
            WebViewUI webViewUI2 = WebViewUI$$k0.this.f118642e;
            webViewUI2.f118531h2.mo68761f(webViewUI2.getCurrentURL());
            WebViewUI$$k0.this.f118642e.setProgressBarIndeterminateVisibility(false);
            WebViewUI$$k0.this.f118642e.f118535j.mo25981a();
            WebViewUIStyleHelper webViewUIStyleHelper = WebViewUI$$k0.this.f118642e.f118477N1;
            if (webViewUIStyleHelper != null && !webViewUIStyleHelper.f118664a) {
                Log.m105925i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageFinished, url:%s", str);
                webViewUIStyleHelper.f118670g = str;
            }
            if (!Util.isEqual(str, WebViewUI$$k0.this.f118642e.f118562s2)) {
                Log.m105924i("MicroMsg.WebViewUI", "onPageFinished  checkWeixinReady:" + str);
                WebViewUI.m47807I7(WebViewUI$$k0.this.f118642e, webView, str);
            } else {
                Log.m105924i("MicroMsg.WebViewUI", "onPageFinished no need checkWeixinReady again:" + str);
            }
            WebViewUI$$k0.this.f118642e.mo68266X8(webView, str);
        }

        /* renamed from: d */
        public void mo62156d(WebView webView, String str) {
            WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
            if (!webViewUI.f118546n2) {
                webViewUI.f118465H1.mo68590z();
            }
            WebViewUI$$k0.this.f118642e.f118531h2.mo68756a();
            WebViewUI$$k0.this.f118642e.f118531h2.mo68761f(str);
            WebViewUI$$k0.this.f118642e.setProgressBarIndeterminateVisibility(false);
            WebViewUI webViewUI2 = WebViewUI$$k0.this.f118642e;
            webViewUI2.f118465H1.mo68569C(str, webViewUI2.getIntent());
            WebViewUI$$k0.this.f118642e.mo68304q9(true, false);
            WebViewUIStyleHelper webViewUIStyleHelper = WebViewUI$$k0.this.f118642e.f118477N1;
            if (webViewUIStyleHelper != null && !webViewUIStyleHelper.f118664a) {
                webViewUIStyleHelper.getClass();
                Log.m105925i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageStart, url:%s", str);
                webViewUIStyleHelper.f118670g = str;
                webViewUIStyleHelper.mo68379k();
                webViewUIStyleHelper.mo68381m();
            }
            WebViewUI webViewUI3 = WebViewUI$$k0.this.f118642e;
            webViewUI3.f118570v1 = 0;
            webViewUI3.f118453C = false;
        }

        /* renamed from: e */
        public void mo64754e(WebView webView, int i, String str, String str2) {
            WebViewUI$$k0.this.f118642e.f118465H1.f119141n = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0$b */
    public final class C43824b extends C43558z {
        public C43824b(WebViewUI.C438121 r2) {
        }

        /* renamed from: a */
        public void mo67848a(int i, String str) {
            C43977g1 g1Var = WebViewUI$$k0.this.f118642e.f118465H1;
            if (g1Var.mo68388b() == null || g1Var.mo68388b().f118523f == null || g1Var.mo68388b().f118491T0 == null) {
                Log.m105920e("MicroMsg.WebViewMenuHelper", "setShareFuncFlag params failed");
                return;
            }
            String url = g1Var.mo68388b().f118523f.getUrl();
            if (!Util.isNullOrNil(url)) {
                try {
                    if (new URL(url).getHost().equals(WeChatHosts.domainString(C0966R.string.f360885fm3))) {
                        int y = g1Var.mo68589y();
                        if (g1Var.mo68388b().f118508Z != null) {
                            g1Var.mo68388b().f118508Z.mo73221R("setFuncFlag", y);
                        }
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WebViewMenuHelper", "create url fail : " + e.getLocalizedMessage());
                }
            }
        }

        /* renamed from: b */
        public void mo64861b(int i, String str, int i2, int i3, String str2) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(154, 12, 1, false);
            Integer num = C8866a.f28131c.get(Integer.valueOf(i));
            if (num == null) {
                num = -1;
            }
            nVar.idkeyStat(154, (long) num.intValue(), 1, false);
            WebViewUI$$k0.this.f118642e.mo68304q9(true, true);
            WebViewUI$$k0.this.f118642e.f118465H1.f119141n = false;
            if (!(i == 0 || i == 2)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        return;
                }
            }
            C44130p1.f119545i.mo68773d(i2);
            if (WebViewUI$$k0.this.f118642e.f118536j1 != null && this.f117774a.mo67673G()) {
                WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
                View view = webViewUI.f118536j1;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                webViewUI.mo68236G9();
                webViewUI.mo68317w8();
            }
            WebViewUI$$k0.this.f118642e.f118459E1.mo68006b().f118138b = false;
            C43704h2 h2Var = WebViewUI$$k0.this.f118642e.f118459E1;
            if (h2Var.f118119b == null) {
                h2Var.f118119b = new C43704h2.C43714k(h2Var);
            }
            h2Var.f118119b.mo68020a(str, false);
            WebViewUI webViewUI2 = WebViewUI$$k0.this.f118642e;
            if (webViewUI2.f118496V) {
                webViewUI2.finish();
            }
        }

        /* renamed from: c */
        public void mo67849c(int i, String str) {
            C87412m.m108594g(str, "reqUrl");
            if (i != 5) {
                WebViewUI$$k0.this.f118642e.mo68304q9(true, false);
            }
        }

        /* renamed from: d */
        public void mo67850d() {
            boolean z = false;
            Log.m105925i("MicroMsg.WebViewUI", "WebView-Trace onAuthSucc: url %s", WebViewUI$$k0.this.f118642e.f118564t1);
            WebViewUI$$k0.this.f118642e.mo68230D9(this.f117774a.mo67669E().mo70860c());
            C43977g1 g1Var = WebViewUI$$k0.this.f118642e.f118465H1;
            ((HashSet) g1Var.f119142o).add(6);
            ((HashSet) g1Var.f119142o).add(1);
            ((HashSet) g1Var.f119142o).add(3);
            ((HashSet) g1Var.f119142o).add(2);
            C43977g1 g1Var2 = WebViewUI$$k0.this.f118642e.f118465H1;
            g1Var2.f119141n = true;
            C77407n nVar = g1Var2.f119144q;
            if (nVar != null) {
                z = nVar.mo107563h();
            }
            if (z) {
                WebViewUI$$k0.this.f118642e.mo68318w9();
            }
        }

        /* renamed from: e */
        public void mo64862e() {
            WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
            if (webViewUI.f118448A1) {
                Log.m105920e("MicroMsg.WebViewUI", "edw postBinded hasDoPostBind");
                return;
            }
            webViewUI.f118448A1 = true;
            webViewUI.mo63385a9();
        }

        /* renamed from: f */
        public void mo67851f() {
            WebViewUI$$k0.this.f118642e.finish();
        }

        /* renamed from: g */
        public void mo67852g(int i) {
            FontChooserView fontChooserView;
            View view = WebViewUI$$k0.this.f118642e.f118569v;
            if (view != null && (fontChooserView = (FontChooserView) view.findViewById(C0966R.C0970id.ecv)) != null) {
                fontChooserView.setSliderIndex(i - 1);
            }
        }

        /* renamed from: h */
        public void mo67853h() {
            WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
            webViewUI.getClass();
            Log.m105924i("MicroMsg.WebViewUI", "forceQuit");
            C61926c.m72669N(new C44198t1(webViewUI));
        }

        /* renamed from: i */
        public void mo67854i() {
            WebViewUI$$k0.this.f118642e.mo66459s8();
        }

        /* renamed from: j */
        public void mo63706j() {
            WebViewUI$$k0.this.f118642e.mo68304q9(true, true);
            WebViewUI$$k0.this.f118642e.mo68260U8("onCreate");
        }

        /* renamed from: k */
        public void mo67855k(int i, String str, C52018xt1 xt12) {
            WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
            webViewUI.f118564t1 = xt12.f144941d;
            webViewUI.f118509Z0 = webViewUI.f118491T0.mo70860c().mo69447f(24);
            WebViewUI$$k0.this.f118642e.f118459E1.mo68006b().f118138b = true;
            WebViewUI$$k0.this.f118642e.f118505Y = C48374j0.m53715d(xt12.f144936A);
            Log.m105919d("MicroMsg.WebViewUI", "onPermissionUpdate, getA8Key = %s", Util.encodeHexString(WebViewUI$$k0.this.f118642e.f118505Y));
        }

        /* renamed from: l */
        public void mo67856l(int i, String str, C52018xt1 xt12) {
            if (i != 5) {
                WebViewUI$$k0.this.f118642e.f118465H1.f119137j = xt12.f144937B;
            }
        }

        /* renamed from: m */
        public void mo67857m() {
            WebViewUI$$k0.this.f118642e.f118535j.mo25981a();
            WebViewUI$$k0.this.f118642e.mo68317w8();
        }

        /* renamed from: n */
        public void mo67858n() {
            WebViewUI webViewUI = WebViewUI$$k0.this.f118642e;
            if (webViewUI.f118550p != null && webViewUI.mo68237H8()) {
                webViewUI.f118550p.setVisibility(0);
                webViewUI.f118558r1 = true;
            }
            if (!WebViewUI$$k0.this.f118642e.f118558r1) {
                WebViewUI webViewUI2 = WebViewUI$$k0.this.f118642e;
                if (!webViewUI2.f118561s1) {
                    webViewUI2.f118535j.mo25983c();
                }
            }
        }

        /* renamed from: o */
        public void mo67859o(String str) {
            WebViewUI$$k0.this.f118642e.f118465H1.mo68583s(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r1.f118644b.f118642e;
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67860p(boolean r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x0016
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$k0.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.f118642e
                com.tencent.mm.ui.widget.MMWebView r0 = r2.f118523f
                if (r0 == 0) goto L_0x0016
                android.view.View$OnLongClickListener r2 = r2.f118543m2
                r0.setOnLongClickListener(r2)
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$k0.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.f118642e
                r0 = 1
                r2.f118541l2 = r0
            L_0x0016:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$k0.C43824b.mo67860p(boolean):void");
        }

        /* renamed from: q */
        public void mo67861q(int i, String str, C52018xt1 xt12) {
            if (!Util.isNullOrNil(xt12.f144944g)) {
                WebViewUI$$k0.this.f118642e.setMMTitle(xt12.f144944g);
            }
            if (xt12.f144943f == 6) {
                WebViewUI$$k0.this.f118642e.mo68225B8(false);
            }
        }
    }

    public WebViewUI$$k0(WebViewUI webViewUI) {
        this.f118642e = webViewUI;
    }

    /* renamed from: b */
    public C43519u mo67776b() {
        return this.f118640c;
    }

    /* renamed from: d */
    public C43558z mo63687d() {
        return this.f118641d;
    }

    /* renamed from: e */
    public int mo67778e() {
        return this.f118642e.f118447A;
    }

    /* renamed from: g */
    public boolean mo62379g(WebView webView, int i, String str, String str2) {
        WebViewUI webViewUI = this.f118642e;
        if (webViewUI.getIntent().getBooleanExtra("hide_close_btn", false)) {
            Log.m105928w("MicroMsg.WebViewUI", "page load error. reallow close and return");
            webViewUI.setBackBtnVisible(true);
            webViewUI.getIntent().putExtra("hide_close_btn", false);
        }
        return false;
    }

    /* renamed from: u */
    public boolean mo67787u() {
        WebViewUI webViewUI = this.f118642e;
        return webViewUI.f118577x1 || webViewUI.f118581y1 || webViewUI.isFinishing();
    }
}
