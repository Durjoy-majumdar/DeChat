package com.tencent.p014mm.app;

import android.app.Activity;
import android.os.Bundle;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.app.c1$a$$d */
public final /* synthetic */ class c1$a$$d implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ Activity f343508a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f343509b;

    public /* synthetic */ c1$a$$d(Activity activity, Bundle bundle) {
        this.f343508a = activity;
        this.f343509b = bundle;
    }

    public final boolean invoke(C15510f fVar) {
        ((C114657b1) fVar).onActivityPostSaveInstanceState(this.f343508a, this.f343509b);
        return false;
    }
}
