package com.tencent.luggage.webview.default_impl;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import p822sa.C48321r;
import p824tc.C48619a;
import p828wa.C53133t;

class DefaultWebCore$6 extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ C48619a.C48620a f107233a;

    public DefaultWebCore$6(C17638a aVar, C48619a.C48620a aVar2) {
        this.f107233a = aVar2;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String a = ((C48321r) C53133t.this.f148246j.f129380d).mo73017a(str2);
        if (a == null) {
            return false;
        }
        jsPromptResult.confirm(a);
        return true;
    }
}
