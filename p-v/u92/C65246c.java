package u92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import u92.C65238a;

/* renamed from: u92.c */
public final class C65246c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C65238a f187828d;

    /* renamed from: e */
    public final /* synthetic */ C65238a.C65239a f187829e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f187830f;

    /* renamed from: g */
    public final /* synthetic */ View f187831g;

    /* renamed from: h */
    public final /* synthetic */ float f187832h;

    /* renamed from: i */
    public final /* synthetic */ float f187833i;

    public C65246c(C65238a aVar, C65238a.C65239a aVar2, ViewPropertyAnimator viewPropertyAnimator, View view, float f, float f2) {
        this.f187828d = aVar;
        this.f187829e = aVar2;
        this.f187830f = viewPropertyAnimator;
        this.f187831g = view;
        this.f187832h = f;
        this.f187833i = f2;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187830f.setListener((Animator.AnimatorListener) null);
        View view = this.f187831g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$animateChangeImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$animateChangeImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f187831g.setTranslationX(this.f187832h);
        this.f187831g.setTranslationY(this.f187833i);
        this.f187828d.mo17319h(this.f187829e.f187801a);
        this.f187828d.f187800v.remove(this.f187829e.f187801a);
        this.f187828d.mo89368F();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
        C65238a aVar = this.f187828d;
        RecyclerView.C16631z zVar = this.f187829e.f187801a;
        aVar.getClass();
    }
}
