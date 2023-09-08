package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83421k;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.e */
public class C83414e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f243770d;

    /* renamed from: e */
    public final /* synthetic */ C83421k.C83422a f243771e;

    public C83414e(C83421k.C83422a aVar, AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f243771e = aVar;
        this.f243770d = appBrandInitConfigWC;
    }

    public void run() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ((C119157j) C119157j.f356862d).mo183870a(this);
            return;
        }
        try {
            C83421k kVar = C83421k.this;
            kVar.f243787f.mo115709e(this.f243770d, kVar.f243785d.f243738o);
        } finally {
            C83421k.this.f243785d.mo115682c();
        }
    }
}
