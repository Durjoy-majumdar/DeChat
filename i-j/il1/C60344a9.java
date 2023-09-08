package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: il1.a9 */
public final class C60344a9 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C60351b9 f172003d;

    public C60344a9(C60351b9 b9Var) {
        this.f172003d = b9Var;
    }

    public void onAnimationCancel(Animator animator) {
        View view = this.f172003d.f172022c;
        Drawable background = view != null ? view.getBackground() : null;
        if (background != null) {
            background.setAlpha(0);
        }
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f172003d.f172022c;
        Drawable background = view != null ? view.getBackground() : null;
        if (background != null) {
            background.setAlpha(0);
        }
    }
}
