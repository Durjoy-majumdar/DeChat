package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewTestUI */
public class WebViewTestUI extends MMActivity {

    /* renamed from: d */
    public MMWebViewWithJsApi f118440d;

    /* renamed from: e */
    public WebViewClient f118441e = new C43811a(this);

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewTestUI$a */
    public class C43811a extends WebViewClient {
        public C43811a(WebViewTestUI webViewTestUI) {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("rawUrl");
        MMWebViewWithJsApi mMWebViewWithJsApi = new MMWebViewWithJsApi(this, (AttributeSet) null);
        this.f118440d = mMWebViewWithJsApi;
        mMWebViewWithJsApi.setWebViewClient(this.f118441e);
        setContentView((View) this.f118440d);
        this.f118440d.loadUrl(stringExtra);
    }
}
