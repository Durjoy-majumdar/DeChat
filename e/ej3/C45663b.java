package ej3;

import android.view.View;
import android.view.ViewPropertyAnimator;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ej3.b */
public abstract class C45663b extends C45668e {

    /* renamed from: e */
    public float f123462e;

    /* renamed from: a */
    public void mo71163a() {
    }

    /* renamed from: b */
    public void mo71164b() {
        super.mo71164b();
        View view = this.f123474d;
        if (view != null) {
            float f = this.f123462e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C31608f fVar = this.f123471a;
            if (fVar != null) {
                float f2 = fVar.f84461a;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(f2));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view2 = this.f123474d;
            float f3 = 0.0f;
            float measuredWidth = view2 != null ? (float) view2.getMeasuredWidth() : 0.0f;
            View view3 = this.f123474d;
            if (view3 != null) {
                f3 = (float) view3.getMeasuredHeight();
            }
            C31609o oVar = this.f123473c;
            if (oVar != null) {
                view.setTranslationX(oVar.f84463a.invoke(Float.valueOf(measuredWidth)).floatValue());
                view.setTranslationY(oVar.f84464b.invoke(Float.valueOf(f3)).floatValue());
            }
        }
    }

    /* renamed from: d */
    public void mo71165d(ViewPropertyAnimator viewPropertyAnimator) {
        C87412m.m108594g(viewPropertyAnimator, "viewPropertyAnimator");
        viewPropertyAnimator.alpha(1.0f);
        viewPropertyAnimator.scaleX(1.0f);
        viewPropertyAnimator.scaleY(1.0f);
        viewPropertyAnimator.translationX(0.0f);
        viewPropertyAnimator.translationY(0.0f);
    }

    /* renamed from: f */
    public void mo71166f() {
        C45671i iVar;
        View view = this.f123474d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f123474d;
        this.f123462e = view2 != null ? view2.getAlpha() : 0.0f;
        View view3 = this.f123474d;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        View view4 = this.f123474d;
        if (view4 != null && (iVar = this.f123472b) != null) {
            view4.setScaleX(iVar.f123475a);
            view4.setScaleY(iVar.f123476b);
        }
    }
}
