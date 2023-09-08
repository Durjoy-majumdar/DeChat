package p1131l8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.C104444c;

/* renamed from: l8.a */
public final class C109276a extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C104444c f327158d;

    public C109276a(C104444c cVar) {
        this.f327158d = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f327158d.mo146664a();
    }

    public void onAnimationStart(Animator animator) {
        this.f327158d.mo146666c();
    }
}
