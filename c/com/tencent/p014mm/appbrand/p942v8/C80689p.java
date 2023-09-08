package com.tencent.p014mm.appbrand.p942v8;

import android.webkit.ValueCallback;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;

/* renamed from: com.tencent.mm.appbrand.v8.p */
public class C80689p implements C40482o {

    /* renamed from: d */
    public final /* synthetic */ C80669j f236091d;

    /* renamed from: com.tencent.mm.appbrand.v8.p$a */
    public class C80690a implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback f236092a;

        public C80690a(C80689p pVar, ValueCallback valueCallback) {
            this.f236092a = valueCallback;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            ValueCallback valueCallback = this.f236092a;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(str);
            }
        }
    }

    public C80689p(C80681o oVar, C80669j jVar) {
        this.f236091d = jVar;
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        C80669j jVar = this.f236091d;
        if (jVar != null) {
            jVar.mo112500d(str, new C80690a(this, valueCallback));
        }
    }
}
