package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.l0 */
public class C44337l0 extends C44307k0 {

    /* renamed from: C */
    public C44239b0 f120160C;

    /* renamed from: D */
    public C44339m0 f120161D = null;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.l0$a */
    public class C44338a extends C44339m0 {
        public C44338a() {
        }

        public boolean callback(int i, Bundle bundle) {
            C44239b0 b0Var = C44337l0.this.f120160C;
            if (b0Var != null) {
                return b0Var.callback(i, bundle);
            }
            return false;
        }

        /* renamed from: d */
        public void mo7036d(Bundle bundle) {
            C44239b0 b0Var = C44337l0.this.f120160C;
            if (b0Var instanceof C44243c0) {
                ((C44243c0) b0Var).mo63040d(bundle);
            }
        }
    }

    public C44337l0(MMWebView mMWebView, boolean z, C44239b0 b0Var, Bundle bundle) {
        super(mMWebView, z, bundle);
        this.f120160C = b0Var;
    }

    /* renamed from: M */
    public C44339m0 mo68624M() {
        if (this.f120161D == null) {
            this.f120161D = new C44338a();
        }
        return this.f120161D;
    }

    /* renamed from: N */
    public boolean mo69045N(String str) {
        C44239b0 b0Var = this.f120160C;
        if (b0Var == null || !(b0Var instanceof C44243c0)) {
            return false;
        }
        return ((C44243c0) b0Var).mo63037b(str);
    }

    /* renamed from: V */
    public void mo68629V(WebView webView, String str) {
        C44239b0 b0Var = this.f120160C;
        if (b0Var instanceof C44243c0) {
            ((C44243c0) b0Var).mo63038c((MMWebView) webView, str);
        }
    }

    /* renamed from: W */
    public void mo68630W(WebView webView, String str, Bitmap bitmap) {
        C44239b0 b0Var = this.f120160C;
        if (b0Var instanceof C44243c0) {
            ((C44243c0) b0Var).mo63036a((MMWebView) webView, str);
        }
    }
}
