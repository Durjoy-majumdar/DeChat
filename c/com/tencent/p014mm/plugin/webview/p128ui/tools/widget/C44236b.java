package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.xweb.WebView;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.b */
public final class C44236b extends C43505b0 {

    /* renamed from: c */
    public final C44237a f119886c;

    /* renamed from: d */
    public final C44238b f119887d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.b$a */
    public static final class C44237a extends C43519u {

        /* renamed from: a */
        public final WeakReference<C44363v> f119888a;

        public C44237a(WeakReference<C44363v> weakReference) {
            C87412m.m108594g(weakReference, "commWebView");
            this.f119888a = weakReference;
        }

        /* renamed from: a */
        public void mo67809a(WebView webView, String str, boolean z) {
            C44363v vVar;
            WeakReference<C44363v> weakReference = this.f119888a;
            if (weakReference != null && (vVar = weakReference.get()) != null) {
                vVar.mo68887n(webView, str, z);
            }
        }

        /* renamed from: b */
        public void mo64752b(WebView webView, String str) {
            C44363v vVar;
            WeakReference<C44363v> weakReference = this.f119888a;
            if (weakReference != null && (vVar = weakReference.get()) != null) {
                vVar.mo68892r(webView, str);
            }
        }

        /* renamed from: c */
        public void mo64753c(WebView webView, String str) {
            C44363v vVar;
            WeakReference<C44363v> weakReference = this.f119888a;
            if (weakReference != null && (vVar = weakReference.get()) != null) {
                vVar.mo68893s(webView, str);
            }
        }

        /* renamed from: d */
        public void mo62156d(WebView webView, String str) {
            C44363v vVar;
            WeakReference<C44363v> weakReference = this.f119888a;
            if (weakReference != null && (vVar = weakReference.get()) != null) {
                vVar.mo68894t(webView, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.b$b */
    public static final class C44238b extends C43558z {

        /* renamed from: b */
        public final WeakReference<C44363v> f119889b;

        public C44238b(WeakReference<C44363v> weakReference) {
            C87412m.m108594g(weakReference, "commWebView");
            this.f119889b = weakReference;
        }

        /* renamed from: b */
        public void mo64861b(int i, String str, int i2, int i3, String str2) {
            C44363v vVar;
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "errMsg");
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
            WeakReference<C44363v> weakReference = this.f119889b;
            if (weakReference != null && (vVar = weakReference.get()) != null) {
                vVar.mo69083l();
            }
        }

        /* renamed from: m */
        public void mo67857m() {
            C44363v vVar;
            WeakReference<C44363v> weakReference = this.f119889b;
            if (weakReference != null && (vVar = weakReference.get()) != null) {
                vVar.mo69084v();
            }
        }
    }

    public C44236b(WeakReference<C44363v> weakReference) {
        C87412m.m108594g(weakReference, "commWebView");
        this.f119886c = new C44237a(weakReference);
        this.f119887d = new C44238b(weakReference);
    }

    /* renamed from: b */
    public C43519u mo67776b() {
        return this.f119886c;
    }

    /* renamed from: d */
    public C43558z mo63687d() {
        return this.f119887d;
    }
}
