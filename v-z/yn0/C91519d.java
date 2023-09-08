package yn0;

import android.webkit.ValueCallback;

/* renamed from: yn0.d */
public final class C91519d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91520e f262326d;

    /* renamed from: e */
    public final /* synthetic */ String f262327e;

    /* renamed from: f */
    public final /* synthetic */ ValueCallback<String> f262328f;

    public C91519d(C91520e eVar, String str, ValueCallback<String> valueCallback) {
        this.f262326d = eVar;
        this.f262327e = str;
        this.f262328f = valueCallback;
    }

    public final void run() {
        if (!this.f262326d.f262329a.getWebView().f122358h) {
            this.f262326d.f262329a.getWebView().evaluateJavascript(this.f262327e, this.f262328f);
        }
    }
}
