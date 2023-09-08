package com.tencent.midas.jsbridge;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pay.tool.APMidasCommMethod;
import com.pay.tool.APMidasTools;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.comm.APProgressDialog;
import com.tencent.midas.control.APMidasPayHelper;
import com.tencent.midas.data.APPluginDataInterface;
import com.tencent.midas.data.APPluginReportManager;

public class APSystemWebPage implements IAPWebPage {
    private static final int HEADER_BACK = 1;
    private static final int HEADER_CLOSE = 2;
    private static final int HEADER_REFRESH = 4;
    private static final String TAG = "APSystemWebPage";
    /* access modifiers changed from: private */
    public Activity activity;
    /* access modifiers changed from: private */
    public APProgressDialog waitDialog;
    /* access modifiers changed from: private */
    public APWebView webView;
    private IAPWebViewCallback webviewCallback = new IAPWebViewCallback() {
        public boolean WebChromeClientJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            APLog.m161210d(APSystemWebPage.TAG, "WebChromeClientJsAlert message=" + str2);
            APWebProtocol.AnalyzeWebEntry(APSystemWebPage.this.activity, APSystemWebPage.this.webView.getWebView(), APSystemWebPage.this, str2);
            return true;
        }

        public boolean WebChromeClientJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        public void WebViewClientPageFinished(WebView webView, String str) {
            if (!APSystemWebPage.this.activity.isFinishing() && APSystemWebPage.this.waitDialog != null && APSystemWebPage.this.waitDialog.isShowing()) {
                APSystemWebPage.this.waitDialog.dismiss();
            }
        }

        public void WebViewClientPageStarted(WebView webView, String str, Bitmap bitmap) {
            APSystemWebPage.this.waitDialog.show();
        }

        public void WebViewClientReceivedError(WebView webView, int i, String str, String str2) {
            if (!APSystemWebPage.this.activity.isFinishing() && APSystemWebPage.this.waitDialog != null && APSystemWebPage.this.waitDialog.isShowing()) {
                APSystemWebPage.this.waitDialog.dismiss();
            }
        }
    };

    public APProgressDialog createDialog() {
        APProgressDialog aPProgressDialog = new APProgressDialog(this.activity);
        aPProgressDialog.setMessage("请稍候...");
        return aPProgressDialog;
    }

    public void initHead(final Activity activity2, String str, String str2) {
        int i;
        try {
            APPluginReportManager instance = APPluginReportManager.getInstance();
            String launchInterface = APPluginDataInterface.singleton().getLaunchInterface();
            instance.insertData(launchInterface, APPluginReportManager.MIDASPLUGIN_WEBPAGE_HEAD_INIT, "", "headControl=" + str + "&headTitle=" + str2);
            try {
                i = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
                i = 0;
            }
            if (!TextUtils.isEmpty(str2)) {
                str2 = APMidasTools.urlDecode(str2, 1);
            }
            LinearLayout linearLayout = (LinearLayout) activity2.findViewById(APMidasCommMethod.getId(activity2, "midas_header_layout"));
            if (i > 0 || !TextUtils.isEmpty(str2)) {
                linearLayout.setVisibility(0);
                TextView textView = (TextView) activity2.findViewById(APMidasCommMethod.getId(activity2, "midas_header_title"));
                if (!TextUtils.isEmpty(str2)) {
                    textView.setVisibility(0);
                    textView.setText(str2);
                } else {
                    textView.setVisibility(8);
                }
                ImageButton imageButton = (ImageButton) activity2.findViewById(APMidasCommMethod.getId(activity2, "midas_header_back"));
                if ((i & 1) == 1) {
                    imageButton.setVisibility(0);
                    imageButton.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            APLog.m161210d(APSystemWebPage.TAG, "backBtn() clicked");
                            boolean z = (APSystemWebPage.this.webView == null || APSystemWebPage.this.webView.getWebView() == null) ? false : true;
                            APPluginReportManager instance = APPluginReportManager.getInstance();
                            String launchInterface = APPluginDataInterface.singleton().getLaunchInterface();
                            instance.insertData(launchInterface, APPluginReportManager.MIDASPLUGIN_WEBPAGE_BACK, "", "webviewNotNull=" + z);
                            if (z && APSystemWebPage.this.webView.getWebView().canGoBack()) {
                                APSystemWebPage.this.webView.getWebView().goBack();
                            }
                        }
                    });
                } else {
                    imageButton.setVisibility(8);
                }
                ImageButton imageButton2 = (ImageButton) activity2.findViewById(APMidasCommMethod.getId(activity2, "midas_header_close"));
                if ((i & 2) == 2) {
                    imageButton2.setVisibility(0);
                    imageButton2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            APLog.m161210d(APSystemWebPage.TAG, "closeBtn() clicked");
                            APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_WEBPAGE_CLOSE, "", "");
                            APMidasResponse aPMidasResponse = new APMidasResponse();
                            aPMidasResponse.resultCode = 100;
                            aPMidasResponse.resultMsg = "关闭";
                            APMidasPayHelper.midasCallBack(aPMidasResponse);
                            activity2.finish();
                        }
                    });
                } else {
                    imageButton2.setVisibility(8);
                }
                ImageButton imageButton3 = (ImageButton) activity2.findViewById(APMidasCommMethod.getId(activity2, "midas_header_refresh"));
                if ((i & 4) == 4) {
                    imageButton3.setVisibility(0);
                    imageButton3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            APLog.m161210d(APSystemWebPage.TAG, "refreshBtn() clicked");
                            APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_WEBPAGE_REFRESH, "", "");
                            if (APSystemWebPage.this.webView != null && APSystemWebPage.this.webView.getWebView() != null) {
                                APSystemWebPage.this.webView.getWebView().reload();
                            }
                        }
                    });
                    return;
                }
                imageButton3.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(8);
        } catch (Throwable unused2) {
        }
    }

    public void initUI(Activity activity2) {
        this.activity = activity2;
        activity2.setContentView(APMidasCommMethod.getLayoutId(activity2, "unipay_layout_activity_web"));
        this.webView = new APWebView(activity2, (WebView) activity2.findViewById(APMidasCommMethod.getId(activity2, "unipay_id_WebView")), this.webviewCallback);
        APProgressDialog createDialog = createDialog();
        this.waitDialog = createDialog;
        createDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
            }
        });
    }

    public void loadUrl(String str) {
        this.webView.loadUrl(str);
    }

    public void toPureH5Pay(Activity activity2, APMidasBaseRequest aPMidasBaseRequest) {
        this.activity = activity2;
        activity2.setContentView(APMidasCommMethod.getLayoutId(activity2, "unipay_layout_activity_web"));
        WebView webView2 = (WebView) activity2.findViewById(APMidasCommMethod.getId(activity2, "unipay_id_WebView"));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity2.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) webView2.getLayoutParams();
        layoutParams.width = (int) (((float) displayMetrics.widthPixels) * 0.85f);
        layoutParams.height = (int) (((float) displayMetrics.heightPixels) * 0.85f);
        webView2.setLayoutParams(layoutParams);
        this.webView = new APWebView(activity2, webView2, this.webviewCallback);
        APProgressDialog createDialog = createDialog();
        this.waitDialog = createDialog;
        createDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
            }
        });
    }

    public void updateWebViewSize(String str) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.webView.getWebView().getLayoutParams();
        APLog.m161214i("webviewclient == ", "updateWebViewSize ");
        String urlParamsValue = APMidasTools.getUrlParamsValue(str, "mpwidth");
        int i = 0;
        int intValue = !TextUtils.isEmpty(urlParamsValue) ? Integer.valueOf(urlParamsValue).intValue() : 0;
        String urlParamsValue2 = APMidasTools.getUrlParamsValue(str, "mpheight");
        if (!TextUtils.isEmpty(urlParamsValue2)) {
            i = Integer.valueOf(urlParamsValue2).intValue();
        }
        if (i != 0 && intValue != 0) {
            layoutParams.width = APMidasCommMethod.dip2px(this.activity, (float) intValue);
            layoutParams.height = APMidasCommMethod.dip2px(this.activity, (float) i);
            this.webView.getWebView().setLayoutParams(layoutParams);
        }
    }
}
