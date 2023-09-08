package androidx.fragment.app;

import android.animation.Animator;
import android.view.View;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.k */
public class C112938k implements C112741b.C112742a {

    /* renamed from: a */
    public final /* synthetic */ Fragment f338110a;

    public C112938k(Fragment fragment) {
        this.f338110a = fragment;
    }

    public void onCancel() {
        if (this.f338110a.getAnimatingAway() != null) {
            View animatingAway = this.f338110a.getAnimatingAway();
            this.f338110a.setAnimatingAway((View) null);
            animatingAway.clearAnimation();
        }
        this.f338110a.setAnimator((Animator) null);
    }
}
