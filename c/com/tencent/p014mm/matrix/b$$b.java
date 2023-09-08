package com.tencent.p014mm.matrix;

import android.app.Application;
import android.content.Context;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.matrix.b$$b */
public final /* synthetic */ class b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Application f79439d;

    public /* synthetic */ b$$b(Application application) {
        this.f79439d = application;
    }

    public final void run() {
        C76701a.makeText((Context) this.f79439d, (CharSequence) "Matrix NOT installed!!!\ncheck compile option -PEnableMatrix", 1).show();
    }
}
