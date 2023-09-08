package g83;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.xweb.WebViewCallbackClient;
import gy3.C87412m;

/* renamed from: g83.g */
public final class C45898g implements WebViewCallbackClient {

    /* renamed from: a */
    public final MMWebView.C45104c f123862a;

    public C45898g(MMWebView.C45104c cVar, BaseWebSearchWebView baseWebSearchWebView) {
        C87412m.m108594g(cVar, "scrollListener");
        C87412m.m108594g(baseWebSearchWebView, "webSearchWebView");
        this.f123862a = cVar;
    }

    public void onContentHeightChanged(int i) {
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
    }

    public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
        this.f123862a.mo70479a(i, i2, i3, i4, i5, i6, i7, i8, z);
        return true;
    }
}
