package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112935j0;
import androidx.fragment.app.FragmentManager;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.m */
public class C112942m extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f338116d;

    /* renamed from: e */
    public final /* synthetic */ View f338117e;

    /* renamed from: f */
    public final /* synthetic */ Fragment f338118f;

    /* renamed from: g */
    public final /* synthetic */ C112935j0.C112936a f338119g;

    /* renamed from: h */
    public final /* synthetic */ C112741b f338120h;

    public C112942m(ViewGroup viewGroup, View view, Fragment fragment, C112935j0.C112936a aVar, C112741b bVar) {
        this.f338116d = viewGroup;
        this.f338117e = view;
        this.f338118f = fragment;
        this.f338119g = aVar;
        this.f338120h = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f338116d.endViewTransition(this.f338117e);
        Animator animator2 = this.f338118f.getAnimator();
        this.f338118f.setAnimator((Animator) null);
        if (animator2 != null && this.f338116d.indexOfChild(this.f338117e) < 0) {
            ((FragmentManager.C112894d) this.f338119g).mo165134a(this.f338118f, this.f338120h);
        }
    }
}
