package de1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8479f0;
import rx3.C13598b0;

/* renamed from: de1.m */
public final class C7285m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f25381d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f25382e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f25383f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<View, C13598b0> f25384g;

    public C7285m(C8479f0<View> f0Var, RecyclerView recyclerView, C8478d0 d0Var, C32226l<? super View, C13598b0> lVar) {
        this.f25381d = f0Var;
        this.f25382e = recyclerView;
        this.f25383f = d0Var;
        this.f25384g = lVar;
    }

    public final void run() {
        C8479f0<View> f0Var = this.f25381d;
        RecyclerView.C16631z I0 = this.f25382e.mo17023I0(this.f25383f.f27483d);
        f0Var.f27484d = I0 != null ? I0.f44854d : null;
        this.f25384g.invoke(this.f25381d.f27484d);
    }
}
