package bu0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bu0.a */
public class C79817a extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ Runnable f233935d;

    /* renamed from: e */
    public final /* synthetic */ Animator f233936e;

    /* renamed from: f */
    public final /* synthetic */ C79819c f233937f;

    public C79817a(C79819c cVar, Runnable runnable, Animator animator) {
        this.f233937f = cVar;
        this.f233935d = runnable;
        this.f233936e = animator;
    }

    public void onAnimationEnd(Animator animator) {
        Runnable runnable = this.f233935d;
        if (runnable != null) {
            this.f233937f.post(runnable);
        }
        this.f233936e.removeListener(this);
    }
}
