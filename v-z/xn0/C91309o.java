package xn0;

import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import di3.C86312j;
import h81.C32735h;

/* renamed from: xn0.o */
public final class C91309o implements C84967l0.C84970c {

    /* renamed from: d */
    public int f261924d;

    /* renamed from: e */
    public final /* synthetic */ C91304m f261925e;

    public C91309o(C91304m mVar) {
        this.f261925e = mVar;
    }

    /* renamed from: d */
    public void mo117850d(boolean z) {
        this.f261925e.getController().mo74063w(z, this.f261924d);
        int i = (!z || 1 != ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_android_appbrand_html_webview_adjust_resize_for_keyboard, 1)) ? 0 : this.f261924d;
        MMWebView mMWebView = this.f261925e.f261909q;
        mMWebView.setPadding(mMWebView.getPaddingLeft(), this.f261925e.f261909q.getPaddingTop(), this.f261925e.f261909q.getPaddingRight(), i);
    }

    /* renamed from: e */
    public void mo117851e(int i) {
        this.f261924d = i;
    }

    public int getHeight() {
        return this.f261924d;
    }
}
