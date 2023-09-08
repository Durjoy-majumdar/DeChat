package p902gm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p902gm.C75979a;

/* renamed from: gm.d */
public class C75989d extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C75979a.C75985f f222826d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f222827e;

    /* renamed from: f */
    public final /* synthetic */ View f222828f;

    /* renamed from: g */
    public final /* synthetic */ C75979a f222829g;

    public C75989d(C75979a aVar, C75979a.C75985f fVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f222829g = aVar;
        this.f222826d = fVar;
        this.f222827e = viewPropertyAnimator;
        this.f222828f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f222827e.setListener((Animator.AnimatorListener) null);
        View view = this.f222828f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/feature/anim/DefaultItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222828f.setTranslationX(0.0f);
        this.f222828f.setTranslationY(0.0f);
        this.f222829g.mo17319h(this.f222826d.f222806b);
        this.f222829g.f222790r.remove(this.f222826d.f222806b);
        this.f222829g.mo106200F();
    }

    public void onAnimationStart(Animator animator) {
        C75979a aVar = this.f222829g;
        RecyclerView.C16631z zVar = this.f222826d.f222806b;
        aVar.getClass();
    }
}
