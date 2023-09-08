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

/* renamed from: u92.h */
public final class C65251h extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C65238a f187852d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView.C16631z f187853e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f187854f;

    /* renamed from: g */
    public final /* synthetic */ View f187855g;

    public C65251h(C65238a aVar, RecyclerView.C16631z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f187852d = aVar;
        this.f187853e = zVar;
        this.f187854f = viewPropertyAnimator;
        this.f187855g = view;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187854f.setListener((Animator.AnimatorListener) null);
        View view = this.f187855g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$animateRemoveImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$animateRemoveImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f187852d.mo91176x(this.f187853e);
        this.f187852d.f187799u.remove(this.f187853e);
        this.f187852d.mo89368F();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187852d.mo91174B(this.f187853e);
    }
}
