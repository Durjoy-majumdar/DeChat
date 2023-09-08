package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.webkit.ValueCallback;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.d2 */
public class C44634d2 implements C44625c2.C44629d {

    /* renamed from: a */
    public final /* synthetic */ WebView f121033a;

    public C44634d2(WebView webView) {
        this.f121033a = webView;
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f121033a.evaluateJavascript(str, valueCallback);
    }
}
