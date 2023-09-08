package com.tencent.p014mm.app;

import android.app.Activity;
import android.os.Bundle;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.app.c1$a$$a */
public final /* synthetic */ class c1$a$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ Activity f343502a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f343503b;

    public /* synthetic */ c1$a$$a(Activity activity, Bundle bundle) {
        this.f343502a = activity;
        this.f343503b = bundle;
    }

    public final boolean invoke(C15510f fVar) {
        ((C114657b1) fVar).onActivityPreSaveInstanceState(this.f343502a, this.f343503b);
        return false;
    }
}
