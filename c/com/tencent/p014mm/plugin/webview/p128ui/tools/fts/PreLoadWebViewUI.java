package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import g83.C45900i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js0.C46574u;
import p224ra.C89909e;
import t83.C48574a1;
import t83.C48590l;
import u93.C52478a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI */
public abstract class PreLoadWebViewUI extends WebViewUI implements C52478a {

    /* renamed from: Q2 */
    public static final /* synthetic */ int f119057Q2 = 0;

    /* renamed from: I2 */
    public boolean f119058I2;

    /* renamed from: J2 */
    public String f119059J2;

    /* renamed from: K2 */
    public String f119060K2;

    /* renamed from: L2 */
    public C48574a1 f119061L2;

    /* renamed from: M2 */
    public List<Runnable> f119062M2;

    /* renamed from: N2 */
    public boolean f119063N2;

    /* renamed from: O2 */
    public C45900i f119064O2 = new C45900i(0);

    /* renamed from: P2 */
    public boolean f119065P2 = false;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI$a */
    public class C43951a extends BaseWebSearchWebView {
        public C43951a(PreLoadWebViewUI preLoadWebViewUI, Context context) {
            super(context);
        }

        public String getUserAgentString() {
            return C46574u.m51897a(getContext(), getSettings().getUserAgentString(), (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI$b */
    public class C43952b extends C43558z {
        public C43952b() {
        }

        /* renamed from: j */
        public void mo63706j() {
            Log.m105924i("MicroMsg.WebSearch.PreLoadWebViewUI", "onJsReady");
            PreLoadWebViewUI.this.mo68474N9();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI$c */
    public class C43953c extends C43505b0 {
        public C43953c() {
        }

        /* renamed from: f */
        public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
            return PreLoadWebViewUI.this.f119064O2.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI$d */
    public class C43954d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f119068d;

        public C43954d(Runnable runnable) {
            this.f119068d = runnable;
        }

        public void run() {
            PreLoadWebViewUI preLoadWebViewUI = PreLoadWebViewUI.this;
            Runnable runnable = this.f119068d;
            int i = PreLoadWebViewUI.f119057Q2;
            preLoadWebViewUI.mo68550K9(runnable);
        }
    }

    /* renamed from: H9 */
    public boolean mo63698H9() {
        return false;
    }

    /* renamed from: I9 */
    public void mo68473I9() {
    }

    /* renamed from: J9 */
    public void mo68549J9(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo68550K9(runnable);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C43954d(runnable));
    }

    /* renamed from: K9 */
    public final void mo68550K9(Runnable runnable) {
        if (mo68521L9() == null || !mo68521L9().f130003h || !this.f119065P2) {
            Log.m105924i("MicroMsg.WebSearch.PreLoadWebViewUI", "jsapi not ready, waiting");
            if (this.f119062M2 == null) {
                this.f119062M2 = new ArrayList();
            }
            this.f119062M2.add(runnable);
            return;
        }
        runnable.run();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.p136ui.widget.MMWebView mo63700L7() {
        /*
            r6 = this;
            r6.getIntent()
            java.lang.String r0 = "MicroMsg.WebSearch.PreLoadWebViewUI"
            java.lang.String r1 = "createWebView start get preloaded webview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            u93.h r1 = u93.C52495g.f146647a
            r2 = 0
            if (r1 == 0) goto L_0x002c
            oa1.d r3 = oa1.C117731d.m166007c()
            yf3.b r4 = new yf3.b
            r4.<init>()
            int r3 = r3.mo182440a(r4)
            if (r3 != 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f146652e
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x002c
            u93.C52495g.f146647a = r2
            goto L_0x002d
        L_0x0029:
            u93.C52495g.f146647a = r2
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0035
            t83.a1 r2 = r1.f146650c
            r6.f119061L2 = r2
            com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView r2 = r1.f146649b
        L_0x0035:
            r3 = 0
            if (r2 != 0) goto L_0x0050
            java.lang.String r1 = "no available preloaded webview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r6.f119058I2 = r3
            com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI$a r2 = new com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI$a
            r2.<init>(r6, r6)
            u93.c r0 = new u93.c
            r0.<init>(r6)
            java.lang.String r1 = "webSearchJSApi"
            r2.addJavascriptInterface(r0, r1)
            goto L_0x007f
        L_0x0050:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r2.toString()
            r4[r3] = r5
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f146652e
            boolean r3 = r3.get()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = "use preloaded webview %s js ready:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f146652e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0076
            r6.f119058I2 = r5
        L_0x0076:
            r2.mo70470f(r6)
            u93.c r0 = r1.f146651d
            if (r0 == 0) goto L_0x007f
            r0.f150904a = r6
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.fts.PreLoadWebViewUI.mo63700L7():com.tencent.mm.ui.widget.MMWebView");
    }

    /* renamed from: L9 */
    public C48590l mo68521L9() {
        return this.f118508Z;
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        C43522y M7 = super.mo63701M7();
        M7.mo67741p(new C43952b());
        M7.mo67679J(new C43953c());
        return M7;
    }

    /* renamed from: M8 */
    public boolean mo68244M8() {
        return this.f119058I2;
    }

    /* renamed from: M9 */
    public Map<String, Object> mo68522M9() {
        return null;
    }

    /* renamed from: N9 */
    public void mo68474N9() {
        Log.m105924i("MicroMsg.WebSearch.PreLoadWebViewUI", "onJsReady");
        this.f119065P2 = true;
        Log.m105925i("MicroMsg.WebSearch.PreLoadWebViewUI", "sendOnUIInit isPreload:%s", Boolean.valueOf(this.f119058I2));
        mo68549J9(new C43974q(this));
        List<Runnable> list = this.f119062M2;
        if (list != null && !((ArrayList) list).isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f119062M2);
            Log.m105925i("MicroMsg.WebSearch.PreLoadWebViewUI", "jsapi ready callback, running jsapi count %d", Integer.valueOf(arrayList.size()));
            ((ArrayList) this.f119062M2).clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* renamed from: O9 */
    public Map<String, Object> mo68551O9() {
        String n0 = mo6901n0();
        if (TextUtils.isEmpty(n0)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Uri parse = Uri.parse(n0);
        for (String next : parse.getQueryParameterNames()) {
            hashMap.put(next, parse.getQueryParameter(next));
        }
        return hashMap;
    }

    /* renamed from: f8 */
    public C48574a1 mo68279f8() {
        return this.f119061L2;
    }

    public BaseWebSearchWebView getWebView() {
        return (BaseWebSearchWebView) this.f118523f;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f119059J2 = getIntent().getStringExtra("sessionId");
        this.f119060K2 = Util.nullAs(getIntent().getStringExtra("subSessionId"), this.f119059J2);
        this.f119063N2 = getIntent().getBooleanExtra("key_back_and_clear_query", false);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPointerCaptureChanged(boolean z) {
        super.onPointerCaptureChanged(z);
    }

    /* renamed from: z8 */
    public void mo68187z8() {
        int intExtra = getIntent().getIntExtra("webview_bg_color_rsID", -1);
        if (intExtra == -1 || getContentView() == null) {
            this.f118523f.setBackgroundColor(getResources().getColor(C0966R.color.akk));
            return;
        }
        setBackGroundColorResource(intExtra);
        getContentView().setBackgroundResource(intExtra);
        this.f118523f.setBackgroundResource(17170445);
        this.f118572w.setBackgroundResource(17170445);
        this.f118575x.setBackgroundResource(17170445);
    }
}
