package zd0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewTreeObserver;
import at0.C79630a;

/* renamed from: zd0.x */
public final class C23493x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C23466p f67389d;

    /* renamed from: zd0.x$a */
    public static final class C23494a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67390d;

        public C23494a(C23466p pVar) {
            this.f67390d = pVar;
        }

        public void onAnimationEnd(Animator animator) {
            C79630a.m96708a(this.f67390d.f67337t);
        }
    }

    public C23493x(C23466p pVar) {
        this.f67389d = pVar;
    }

    public void onGlobalLayout() {
        this.f67389d.f67337t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f67389d.mo36948i(true, new C23494a(this.f67389d));
    }
}
