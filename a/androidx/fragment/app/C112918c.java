package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112912b;
import androidx.fragment.app.C112950q0;

/* renamed from: androidx.fragment.app.c */
public class C112918c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f338021d;

    /* renamed from: e */
    public final /* synthetic */ View f338022e;

    /* renamed from: f */
    public final /* synthetic */ boolean f338023f;

    /* renamed from: g */
    public final /* synthetic */ C112950q0.C112954d f338024g;

    /* renamed from: h */
    public final /* synthetic */ C112912b.C112914b f338025h;

    public C112918c(C112912b bVar, ViewGroup viewGroup, View view, boolean z, C112950q0.C112954d dVar, C112912b.C112914b bVar2) {
        this.f338021d = viewGroup;
        this.f338022e = view;
        this.f338023f = z;
        this.f338024g = dVar;
        this.f338025h = bVar2;
    }

    public void onAnimationEnd(Animator animator) {
        this.f338021d.endViewTransition(this.f338022e);
        if (this.f338023f) {
            this.f338024g.f338142a.mo165245a(this.f338022e);
        }
        this.f338025h.mo165186a();
    }
}
