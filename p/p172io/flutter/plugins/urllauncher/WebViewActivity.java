package p172io.flutter.plugins.urllauncher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugins.urllauncher.WebViewActivity */
public class WebViewActivity extends HellActivity {
    public static String ACTION_CLOSE = "close action";
    private static String ENABLE_DOM_EXTRA = "enableDomStorage";
    private static String ENABLE_JS_EXTRA = "enableJavaScript";
    private static String URL_EXTRA = "url";
    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.ACTION_CLOSE.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    };
    private IntentFilter closeIntentFilter = new IntentFilter(ACTION_CLOSE);
    private final WebViewClient webViewClient = new WebViewClient() {
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    };
    /* access modifiers changed from: private */
    public WebView webview;

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$FlutterWebChromeClient */
    public class FlutterWebChromeClient extends WebChromeClient {
        private FlutterWebChromeClient() {
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            C1172611 r1 = new WebViewClient() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    WebViewActivity.this.webview.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    WebViewActivity.this.webview.loadUrl(str);
                    return true;
                }
            };
            WebView webView2 = new WebView(WebViewActivity.this.webview.getContext());
            webView2.setWebViewClient(r1);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent createIntent(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(URL_EXTRA, str).putExtra(ENABLE_JS_EXTRA, z).putExtra(ENABLE_DOM_EXTRA, z2).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> extractHeaders(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            hashMap.put(next, bundle.getString(next));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.webview = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(URL_EXTRA);
        boolean booleanExtra = intent.getBooleanExtra(ENABLE_JS_EXTRA, false);
        boolean booleanExtra2 = intent.getBooleanExtra(ENABLE_DOM_EXTRA, false);
        this.webview.loadUrl(stringExtra, extractHeaders(intent.getBundleExtra("com.android.browser.headers")));
        this.webview.getSettings().setJavaScriptEnabled(booleanExtra);
        this.webview.getSettings().setDomStorageEnabled(booleanExtra2);
        this.webview.setWebViewClient(this.webViewClient);
        this.webview.getSettings().setSupportMultipleWindows(true);
        this.webview.setWebChromeClient(new FlutterWebChromeClient());
        registerReceiver(this.broadcastReceiver, this.closeIntentFilter);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.broadcastReceiver);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.webview.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.webview.goBack();
        return true;
    }
}
