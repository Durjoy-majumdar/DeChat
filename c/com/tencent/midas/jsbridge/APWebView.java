package com.tencent.midas.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.download.APMidasPluginDownloadUtils;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C9556a;

public class APWebView {
    private static final String TAG = "APWebView";
    /* access modifiers changed from: private */
    public IAPWebViewCallback callback = null;
    private WebChromeClient mChromeClient = new WebChromeClient() {
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            APLog.m161212e("inner onJsAlert message", str2);
            APLog.m161212e(APWebView.TAG, " url = " + str);
            APLog.m161212e(APWebView.TAG, " message = " + str2);
            if (APMidasPluginDownloadUtils.handlePureH5UpdateJsAlertLogic(APWebView.this.mContext, str2)) {
                APLog.m161210d(APWebView.TAG, "onJsAlert is pure h5 update! Cancel alert!");
                jsResult.cancel();
                return true;
            }
            APLog.m161210d(APWebView.TAG, "onJsAlert not pure h5 update!");
            if (APWebProtocol.hookH5Method(APWebView.this.mContext, APWebView.this.mWebview, str, str2, jsResult, APWebView.this.callback)) {
                APLog.m161210d(APWebView.TAG, "hookH5Method is processed");
                jsResult.cancel();
                return true;
            } else if (APMidasPayAPI.h5PayHook(APWebView.this.mContext, APWebView.this.mWebview, str, str2, jsResult) != 0) {
                return super.onJsAlert(webView, str, str2, jsResult);
            } else {
                APWebView.this.callback.WebChromeClientJsAlert(webView, str, str2, jsResult);
                jsResult.cancel();
                return true;
            }
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return APWebView.this.callback.WebChromeClientJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    };
    /* access modifiers changed from: private */
    public Activity mContext = null;
    private WebViewClient mWebViewClient = new WebViewClient() {
        private byte _hellAccFlag_;

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            APLog.m161210d(APWebView.TAG, "onPageFinished!");
            APLog.m161214i("APWebView url == ", str);
            APWebView.this.mWebview.setVisibility(0);
            APMidasPayAPI.InnerH5PayInit(APWebView.this.mContext, APWebView.this.mWebview);
            APWebView.this.callback.WebViewClientPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            APLog.m161210d(APWebView.TAG, "onPageStarted!");
            APWebView.this.callback.WebViewClientPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            APLog.m161210d(APWebView.TAG, "onReceivedError!");
            APWebView.this.callback.WebViewClientReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            APLog.m161210d(APWebView.TAG, "shouldOverrideUrlLoading url = " + str);
            if (!str.startsWith("http://unipay.sdk.android/?") && !str.startsWith("wsj://") && !str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                webView.loadUrl(str);
                APLog.m161210d(APWebView.TAG, "shouldOverrideUrlLoading loadUrl = ");
            }
            if (!str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (intent.resolveActivity(APWebView.this.mContext.getPackageManager()) != null) {
                Context context = webView.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/midas/jsbridge/APWebView$2", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/midas/jsbridge/APWebView$2", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            Toast.makeText(APWebView.this.mContext, "抱歉，你未安装相应客户端", 1).show();
            APLog.m161222w(APWebView.TAG, "shouldOverrideUrlLoading() intent.resolveActivity == Null ");
            return true;
        }
    };
    /* access modifiers changed from: private */
    public WebView mWebview = null;

    public APWebView(Activity activity, WebView webView, IAPWebViewCallback iAPWebViewCallback) {
        this.mContext = activity;
        this.mWebview = webView;
        this.callback = iAPWebViewCallback;
        InitWebView();
    }

    private void InitWebView() {
        WebSettings settings = this.mWebview.getSettings();
        settings.setJavaScriptEnabled(true);
        APMidasPayAPI.env.equals(APMidasPayAPI.ENV_TEST);
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(this.mContext.getApplicationContext().getDir(XWalkPlugin.PRIVATE_CACHE_DIR_NAME, 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        this.mWebview.setScrollBarStyle(0);
        this.mWebview.setWebChromeClient(this.mChromeClient);
        this.mWebview.setWebViewClient(this.mWebViewClient);
        removeInterface();
    }

    private void removeInterface() {
        try {
            Method method = this.mWebview.getClass().getMethod("removeJavascriptInterface", new Class[]{String.class});
            if (method != null) {
                method.invoke(this.mWebview, new Object[]{"searchBoxJavaBridge_"});
                method.invoke(this.mWebview, new Object[]{"accessibility"});
                method.invoke(this.mWebview, new Object[]{"accessibilityTraversal"});
            }
        } catch (Exception e) {
            APLog.m161214i("removeJavascriptInterface", e.toString());
        }
    }

    public WebView getWebView() {
        return this.mWebview;
    }

    public void loadUrl(String str) {
        this.mWebview.loadUrl(str);
    }
}
