package com.tencent.p014mm.app;

import android.app.Activity;
import android.os.Bundle;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.app.c1$a$$h */
public final /* synthetic */ class c1$a$$h implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ Activity f343514a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f343515b;

    public /* synthetic */ c1$a$$h(Activity activity, Bundle bundle) {
        this.f343514a = activity;
        this.f343515b = bundle;
    }

    public final boolean invoke(C15510f fVar) {
        ((C114657b1) fVar).onActivitySaveInstanceState(this.f343514a, this.f343515b);
        return false;
    }
}
