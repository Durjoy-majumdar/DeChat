package gt0;

import android.animation.Animator;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;

/* renamed from: gt0.v */
public class C45957v implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f123965d;

    /* renamed from: e */
    public final /* synthetic */ C84926a f123966e;

    public C45957v(C84926a aVar, Runnable runnable) {
        this.f123966e = aVar;
        this.f123965d = runnable;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f123966e.mo117754a();
        this.f123965d.run();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
