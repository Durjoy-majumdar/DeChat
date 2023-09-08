package p33;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: p33.c */
public final class C11813c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ int f34554d;

    /* renamed from: e */
    public final /* synthetic */ View f34555e;

    /* renamed from: f */
    public final /* synthetic */ C110140b f34556f;

    public C11813c(int i, View view, C110140b bVar) {
        this.f34554d = i;
        this.f34555e = view;
        this.f34556f = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        int i = this.f34554d;
        if (i < 0 && Math.abs(i) > ViewConfiguration.get(this.f34555e.getContext()).getScaledTouchSlop()) {
            this.f34556f.mo150891o();
        }
    }
}
