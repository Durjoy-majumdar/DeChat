package km1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: km1.e */
public final class C61113e implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C61117j f173987d;

    public C61113e(C61117j jVar) {
        this.f173987d = jVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C61117j jVar = this.f173987d;
        long j = jVar.f174003m;
        Runnable runnable = jVar.f174007q;
        if (runnable != null) {
            jVar.f174006p.removeCallbacks(runnable);
            jVar.f174007q = null;
        }
        C61116i iVar = new C61116i(jVar);
        jVar.f174007q = iVar;
        jVar.f174006p.postDelayed(iVar, j);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View view = this.f173987d.f173993c;
        if (view != null) {
            view.setTag(C0966R.C0970id.haa, "loading");
        }
    }
}
