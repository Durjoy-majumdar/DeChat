package com.tencent.p014mm.plugin.webview.webcompt;

import android.webkit.ValueCallback;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.n */
public final class C30623n<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C32226l<String, C13598b0> f82444a;

    public C30623n(C32226l<? super String, C13598b0> lVar) {
        this.f82444a = lVar;
    }

    public void onReceiveValue(Object obj) {
        this.f82444a.invoke((String) obj);
    }
}
