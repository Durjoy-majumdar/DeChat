package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.DialogInterface;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.finder.view.z */
public final class C56675z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C56583a0 f162455d;

    /* renamed from: e */
    public final /* synthetic */ Context f162456e;

    /* renamed from: f */
    public final /* synthetic */ CharSequence f162457f;

    /* renamed from: g */
    public final /* synthetic */ boolean f162458g;

    /* renamed from: h */
    public final /* synthetic */ int f162459h;

    /* renamed from: i */
    public final /* synthetic */ DialogInterface.OnCancelListener f162460i;

    public C56675z(C56583a0 a0Var, Context context, CharSequence charSequence, boolean z, int i, DialogInterface.OnCancelListener onCancelListener) {
        this.f162455d = a0Var;
        this.f162456e = context;
        this.f162457f = charSequence;
        this.f162458g = z;
        this.f162459h = i;
        this.f162460i = onCancelListener;
    }

    public final void run() {
        this.f162455d.f162214a = C89779i0.m112248e(this.f162456e, this.f162457f, this.f162458g, this.f162459h, this.f162460i);
    }
}
