package com.tencent.luggage.bridge.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p822sa.C48319p;
import p822sa.C48321r;

public class BridgedAndroidWebView extends BridgedAndroidWebViewBase {

    /* renamed from: d */
    public C48319p f107228d;

    /* renamed from: e */
    public WebViewClient f107229e;

    /* renamed from: f */
    public WebChromeClient f107230f;

    /* renamed from: com.tencent.luggage.bridge.impl.BridgedAndroidWebView$a */
    public class C39998a extends WebViewClient {
        public C39998a() {
        }

        public void onPageFinished(WebView webView, String str) {
            ((C48321r) BridgedAndroidWebView.this.f107228d.f129380d).f129385a.mo73016a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            BridgedAndroidWebView.this.f107228d.f129380d.getClass();
        }
    }

    public BridgedAndroidWebView(Context context) {
        this(context, (AttributeSet) null);
    }

    public C48319p getBridge() {
        return this.f107228d;
    }

    public BridgedAndroidWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BridgedAndroidWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107229e = new C39998a();
        this.f107230f = new WebChromeClient() {
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                String a = ((C48321r) BridgedAndroidWebView.this.f107228d.f129380d).mo73017a(str2);
                if (a == null) {
                    return false;
                }
                jsPromptResult.confirm(a);
                return true;
            }
        };
        this.f107228d = new C48319p(this);
        setWebViewClient(this.f107229e);
        setWebChromeClient(this.f107230f);
    }
}
