package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qj1.ve */
public final class C63061ve extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C63111xe f178961d;

    public C63061ve(C63111xe xeVar) {
        this.f178961d = xeVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f178961d.mo10792g(8);
        C63111xe xeVar = this.f178961d;
        xeVar.f179102s.setText(String.valueOf(xeVar.f179100q));
        this.f178961d.f166287d.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f178961d.mo10792g(8);
        C63111xe xeVar = this.f178961d;
        int i = xeVar.f179100q;
        xeVar.f179101r = i;
        xeVar.f179102s.setText(String.valueOf(i));
        this.f178961d.f166287d.setAlpha(1.0f);
    }
}
