package com.tencent.p014mm.plugin.appbrand;

import android.webkit.ValueCallback;
import com.tencent.p014mm.appbrand.p942v8.C80669j;

/* renamed from: com.tencent.mm.plugin.appbrand.a */
public final class C81104a implements C81596c {

    /* renamed from: d */
    public final /* synthetic */ C80669j f238370d;

    /* renamed from: com.tencent.mm.plugin.appbrand.a$a */
    public static final class C81105a implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback<String> f238371a;

        public C81105a(ValueCallback<String> valueCallback) {
            this.f238371a = valueCallback;
        }

        /* renamed from: a */
        public final void mo112506a(String str, C80669j.C80676g gVar) {
            ValueCallback<String> valueCallback = this.f238371a;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(str);
            }
        }
    }

    public C81104a(C80669j jVar) {
        this.f238370d = jVar;
    }

    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f238370d.mo112500d(str, new C81105a(valueCallback));
    }
}
