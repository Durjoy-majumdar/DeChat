package com.tencent.p014mm.plugin.webview.core;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.core.b */
public final class C5840b<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C32226l<String, C13598b0> f22022a;

    public C5840b(C32226l<? super String, C13598b0> lVar) {
        this.f22022a = lVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        C32226l<String, C13598b0> lVar = this.f22022a;
        C87412m.m108593f(str, LocaleUtil.ITALIAN);
        lVar.invoke(str);
    }
}
