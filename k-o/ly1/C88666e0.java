package ly1;

import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: ly1.e0 */
public class C88666e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99730g0 f255984d;

    public C88666e0(C99730g0 g0Var) {
        this.f255984d = g0Var;
    }

    public void run() {
        C88668z zVar = this.f255984d.f292294h;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zVar.f249188g, "translationY", new float[]{0.0f, (float) zVar.getStayHeight()});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
        ofFloat.addUpdateListener(new C88667y(zVar));
        zVar.mo118899e();
    }
}
