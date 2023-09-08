package com.tencent.p014mm.app;

import android.app.Activity;
import android.os.Bundle;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.app.c1$a$$g */
public final /* synthetic */ class c1$a$$g implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ Activity f343512a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f343513b;

    public /* synthetic */ c1$a$$g(Activity activity, Bundle bundle) {
        this.f343512a = activity;
        this.f343513b = bundle;
    }

    public final boolean invoke(C15510f fVar) {
        ((C114657b1) fVar).onActivityPostCreated(this.f343512a, this.f343513b);
        return false;
    }
}
