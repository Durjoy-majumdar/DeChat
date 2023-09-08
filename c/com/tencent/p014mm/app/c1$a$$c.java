package com.tencent.p014mm.app;

import android.app.Activity;
import android.os.Bundle;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.app.c1$a$$c */
public final /* synthetic */ class c1$a$$c implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ Activity f343506a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f343507b;

    public /* synthetic */ c1$a$$c(Activity activity, Bundle bundle) {
        this.f343506a = activity;
        this.f343507b = bundle;
    }

    public final boolean invoke(C15510f fVar) {
        ((C114657b1) fVar).onActivityPreCreated(this.f343506a, this.f343507b);
        return false;
    }
}
