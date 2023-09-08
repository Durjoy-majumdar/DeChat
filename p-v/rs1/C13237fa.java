package rs1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: rs1.fa */
public final class C13237fa extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C13194da f37588d;

    /* renamed from: e */
    public final /* synthetic */ View f37589e;

    public C13237fa(C13194da daVar, View view) {
        this.f37588d = daVar;
        this.f37589e = view;
    }

    public void onAnimationEnd(Animator animator) {
        View decorView = this.f37588d.getActivity().getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f37588d.mo12689g3());
        }
        this.f37589e.animate().setListener((Animator.AnimatorListener) null).cancel();
    }
}
