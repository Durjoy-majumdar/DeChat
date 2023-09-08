package com.tencent.p014mm.plugin.webview.p128ui.tools;

import ba3.C39754e;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import t83.C48590l;
import we0.C53156a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.n2 */
public final class C44097n2 extends C43830a {

    /* renamed from: b */
    public int f119458b;

    /* renamed from: c */
    public int f119459c = -1;

    /* renamed from: d */
    public C53156a f119460d;

    /* renamed from: e */
    public C39754e f119461e = new C44098a(this);

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.n2$a */
    public static final class C44098a extends C39754e {

        /* renamed from: a */
        public final /* synthetic */ C44097n2 f119462a;

        public C44098a(C44097n2 n2Var) {
            this.f119462a = n2Var;
        }

        /* renamed from: a */
        public void mo62392a() {
            C48590l lVar;
            try {
                WebViewUI b = this.f119462a.mo68388b();
                if (!(b == null || (lVar = b.f118508Z) == null)) {
                    lVar.mo73211H();
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WebViewVideoFullScreenHelper", "onEnterFullscreen fail", e);
            }
            C53156a aVar = this.f119462a.f119460d;
            if (aVar != null) {
                aVar.enable();
            }
        }

        /* renamed from: b */
        public void mo62393b() {
            C48590l lVar;
            try {
                WebViewUI b = this.f119462a.mo68388b();
                if (!(b == null || (lVar = b.f118508Z) == null)) {
                    lVar.mo73212I();
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WebViewVideoFullScreenHelper", "onExitFullscreen fail", e);
            }
            C53156a aVar = this.f119462a.f119460d;
            if (aVar != null) {
                aVar.disable();
            }
        }
    }

    public C44097n2(WebViewUI webViewUI) {
        super(webViewUI);
    }
}
