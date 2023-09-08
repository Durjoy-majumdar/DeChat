package com.tencent.wework.api.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import j20.C117292a;
import k20.C9556a;

public class H5Activity extends HellActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null || !getIntent().hasExtra("url")) {
            finish();
            return;
        }
        setContentView(C0966R.C0971layout.civ);
        findViewById(C0966R.C0970id.a2w).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                H5Activity.this.finish();
            }
        });
        WebView webView = (WebView) findViewById(C0966R.C0970id.lm6);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setSupportMultipleWindows(false);
        webView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    H5Activity h5Activity = H5Activity.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(h5Activity, aVar.mo10232b(), "com/tencent/wework/api/view/H5Activity$2", "onDownloadStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    h5Activity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(h5Activity, "com/tencent/wework/api/view/H5Activity$2", "onDownloadStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Throwable unused) {
                }
            }
        });
        webView.setWebChromeClient(new WebChromeClient() {
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }

            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
            }

            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                super.onReceivedIcon(webView, bitmap);
            }

            public void onReceivedTitle(WebView webView, String str) {
                super.onReceivedTitle(webView, str);
                ((TextView) H5Activity.this.findViewById(C0966R.C0970id.knx)).setText(str);
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
            }

            public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            }

            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                try {
                    if (!Uri.parse(str).getScheme().toLowerCase().contains("http")) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        H5Activity h5Activity = H5Activity.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(h5Activity, aVar.mo10232b(), "com/tencent/wework/api/view/H5Activity$4", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        h5Activity.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(h5Activity, "com/tencent/wework/api/view/H5Activity$4", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return true;
                    }
                } catch (Throwable unused) {
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        webView.loadUrl(getIntent().getStringExtra("url"));
    }
}
