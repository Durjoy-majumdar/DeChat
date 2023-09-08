package com.tencent.midas.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.download.APMidasPluginDownloadUtils;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C9556a;

public class APX5WebView {
    private static final String TAG = "APX5WebView";
    /* access modifiers changed from: private */
    public IAPX5WebViewCallback callback = null;
    private WebChromeClient mChromeClient = new WebChromeClient() {
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            APLog.m161212e("inner onJsAlert message", str2);
            APLog.m161212e(APX5WebView.TAG, " url = " + str);
            APLog.m161212e(APX5WebView.TAG, " message = " + str2);
            if (APMidasPluginDownloadUtils.handlePureH5UpdateJsAlertLogic(APX5WebView.this.mContext, str2)) {
                APLog.m161210d(APX5WebView.TAG, "onJsAlert is pure h5 update! Cancel alert!");
                jsResult.cancel();
                return true;
            }
            APLog.m161210d(APX5WebView.TAG, "onJsAlert not pure h5 update!");
            if (APWebProtocol.hookH5Method(APX5WebView.this.mContext, APX5WebView.this.mWebview, str, str2, jsResult, APX5WebView.this.callback)) {
                APLog.m161210d(APX5WebView.TAG, "hookH5Method is processed");
                jsResult.cancel();
                return true;
            } else if (APMidasPayAPI.h5PayHookX5(APX5WebView.this.mContext, APX5WebView.this.mWebview, str, str2, jsResult) != 0) {
                return APX5WebView.super.onJsAlert(webView, str, str2, jsResult);
            } else {
                APX5WebView.this.callback.WebChromeClientJsAlert(webView, str, str2, jsResult);
                jsResult.cancel();
                return true;
            }
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return APX5WebView.this.callback.WebChromeClientJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    };
    /* access modifiers changed from: private */
    public Activity mContext = null;
    private WebViewClient mWebViewClient = new WebViewClient() {
        private byte _hellAccFlag_;

        public void onPageFinished(WebView webView, String str) {
            APX5WebView.super.onPageFinished(webView, str);
            APLog.m161210d(APX5WebView.TAG, "onPageFinished!");
            APLog.m161214i("APWebView url == ", str);
            APX5WebView.this.mWebview.setVisibility(0);
            APMidasPayAPI.InnerH5PayInitX5(APX5WebView.this.mContext, APX5WebView.this.mWebview);
            APX5WebView.this.callback.WebViewClientPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            APX5WebView.super.onPageStarted(webView, str, bitmap);
            APLog.m161210d(APX5WebView.TAG, "onPageStarted!");
            APX5WebView.this.callback.WebViewClientPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            APX5WebView.super.onReceivedError(webView, i, str, str2);
            APLog.m161210d(APX5WebView.TAG, "onReceivedError!");
            APX5WebView.this.callback.WebViewClientReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            APLog.m161210d(APX5WebView.TAG, "shouldOverrideUrlLoading url = " + str);
            if (!str.startsWith("http://unipay.sdk.android/?") && !str.startsWith("wsj://") && !str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                webView.loadUrl(str);
                APLog.m161210d(APX5WebView.TAG, "shouldOverrideUrlLoading loadUrl = ");
            }
            if (!str.startsWith("mqqapi://") && !str.startsWith("weixin://") && !str.startsWith("sms://")) {
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (intent.resolveActivity(APX5WebView.this.mContext.getPackageManager()) != null) {
                Context context = webView.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/midas/jsbridge/APX5WebView$2", "shouldOverrideUrlLoading", "(Lcom/tencent/smtt/sdk/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/midas/jsbridge/APX5WebView$2", "shouldOverrideUrlLoading", "(Lcom/tencent/smtt/sdk/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            Toast.makeText(APX5WebView.this.mContext, "抱歉，你未安装相应客户端", 1).show();
            APLog.m161222w(APX5WebView.TAG, "shouldOverrideUrlLoading() intent.resolveActivity == Null ");
            return true;
        }
    };
    /* access modifiers changed from: private */
    public WebView mWebview = null;

    public APX5WebView(Activity activity, WebView webView, IAPX5WebViewCallback iAPX5WebViewCallback) {
        this.mContext = activity;
        this.mWebview = webView;
        this.callback = iAPX5WebViewCallback;
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
