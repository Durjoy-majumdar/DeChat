package com.tencent.luggage.bridge.impl;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import p822sa.C48323t;

public class BridgedAndroidWebViewBase extends WebView implements C48323t {

    /* renamed from: com.tencent.luggage.bridge.impl.BridgedAndroidWebViewBase$a */
    public class C17637a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f47991d;

        public C17637a(String str) {
            this.f47991d = str;
        }

        public void run() {
            BridgedAndroidWebViewBase.this.mo21034a(this.f47991d);
        }
    }

    public BridgedAndroidWebViewBase(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo21034a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("BridgedAndroidWebViewBase", "Empty script");
        } else {
            super.evaluateJavascript(str, (ValueCallback) null);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        addJavascriptInterface(obj, str);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mo21034a(str);
        } else {
            post(new C17637a(str));
        }
    }

    public String getUserAgent() {
        return getSettings().getUserAgentString();
    }

    public BridgedAndroidWebViewBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BridgedAndroidWebViewBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
    }
}
