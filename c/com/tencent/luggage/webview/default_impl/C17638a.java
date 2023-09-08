package com.tencent.luggage.webview.default_impl;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.ValueCallback;
import java.util.Map;
import p824tc.C48619a;
import p828wa.C53133t;

/* renamed from: com.tencent.luggage.webview.default_impl.a */
public class C17638a implements C48619a {

    /* renamed from: d */
    public Context f47993d;

    /* renamed from: e */
    public DefaultWebView f47994e;

    /* renamed from: f */
    public Handler f47995f = new Handler(Looper.getMainLooper());

    /* renamed from: com.tencent.luggage.webview.default_impl.a$b */
    public class C17639b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f47996d;

        public C17639b(String str) {
            this.f47996d = str;
        }

        public void run() {
            C17638a.this.f47994e.loadUrl(this.f47996d);
        }
    }

    /* renamed from: com.tencent.luggage.webview.default_impl.a$c */
    public class C17640c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object f47998d;

        /* renamed from: e */
        public final /* synthetic */ String f47999e;

        public C17640c(Object obj, String str) {
            this.f47998d = obj;
            this.f47999e = str;
        }

        public void run() {
            C17638a.this.f47994e.addJavascriptInterface(this.f47998d, this.f47999e);
        }
    }

    /* renamed from: com.tencent.luggage.webview.default_impl.a$d */
    public class C17641d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f48001d;

        /* renamed from: e */
        public final /* synthetic */ ValueCallback f48002e;

        public C17641d(String str, ValueCallback valueCallback) {
            this.f48001d = str;
            this.f48002e = valueCallback;
        }

        public void run() {
            C17638a.this.f47994e.evaluateJavascript(this.f48001d, this.f48002e);
        }
    }

    /* renamed from: com.tencent.luggage.webview.default_impl.a$a */
    public class C17642a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C48619a.C48620a f48004d;

        public C17642a(C48619a.C48620a aVar) {
            this.f48004d = aVar;
        }

        public void run() {
            C17638a aVar = C17638a.this;
            C48619a.C48620a aVar2 = this.f48004d;
            aVar.f47994e.setWebViewClient(new C40001b(aVar, aVar2));
            aVar.f47994e.setWebChromeClient(new DefaultWebCore$6(aVar, aVar2));
        }
    }

    public C17638a(Context context) {
        this.f47993d = context;
        this.f47994e = new DefaultWebView(context);
    }

    /* renamed from: A */
    public void mo21039A(C48619a.C48620a aVar) {
        C17642a aVar2 = new C17642a(aVar);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aVar2.run();
        } else {
            this.f47995f.post(aVar2);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        C17640c cVar = new C17640c(obj, str);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            cVar.run();
        } else {
            this.f47995f.post(cVar);
        }
    }

    public boolean canGoBack() {
        return this.f47994e.canGoBack();
    }

    public void destroy() {
        this.f47994e.destroy();
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        C17641d dVar = new C17641d(str, valueCallback);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dVar.run();
        } else {
            this.f47995f.post(dVar);
        }
    }

    public Context getContext() {
        return this.f47993d;
    }

    public String getUserAgent() {
        return "";
    }

    public View getView() {
        return this.f47994e;
    }

    public void goBack() {
        this.f47994e.goBack();
    }

    public void loadData(String str, String str2, String str3) {
        this.f47994e.loadData(str, str2, str3);
    }

    public void loadUrl(String str) {
        C17639b bVar = new C17639b(str);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            bVar.run();
        } else {
            this.f47995f.post(bVar);
        }
    }

    public void setContext(Context context) {
        Context context2 = this.f47993d;
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
    }

    public void setWebCore(C53133t tVar) {
    }

    public void stopLoading() {
        this.f47994e.stopLoading();
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.f47994e.loadUrl(str, map);
    }
}
