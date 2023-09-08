package com.tencent.luggage.sdk.customize.impl;

import android.os.Build;
import rk0.C36330g;
import rk0.C89996i;

/* renamed from: com.tencent.luggage.sdk.customize.impl.c */
public final class C80233c implements C89996i {

    /* renamed from: e */
    public static final C80233c f234907e = new C80233c();

    /* renamed from: d */
    public final /* synthetic */ C89996i f234908d;

    public C80233c() {
        this.f234908d = Build.VERSION.SDK_INT >= 24 ? C28638a.f78573d : C36330g.f96695d;
    }

    public boolean gx0() {
        return this.f234908d.gx0();
    }

    /* renamed from: ja */
    public void mo56170ja(int i) {
        this.f234908d.mo56170ja(i);
    }

    /* renamed from: pa */
    public int mo56171pa() {
        return this.f234908d.mo56171pa();
    }
}
