package ej3;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ej3.c */
public abstract class C45664c extends C45668e {

    /* renamed from: e */
    public final int f123463e;

    public C45664c(int i) {
        this.f123463e = i;
    }

    /* renamed from: a */
    public void mo71163a() {
        View view = this.f123474d;
        if (view != null) {
            int i = this.f123463e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/anim/inout/AnimOutAction", "afterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/anim/inout/AnimOutAction", "afterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public Interpolator mo71167c() {
        return super.mo71167c();
    }

    /* renamed from: d */
    public void mo71165d(ViewPropertyAnimator viewPropertyAnimator) {
        C87412m.m108594g(viewPropertyAnimator, "viewPropertyAnimator");
        C31608f fVar = this.f123471a;
        if (fVar != null) {
            viewPropertyAnimator.alpha(fVar.f84461a);
        }
        C45671i iVar = this.f123472b;
        if (iVar != null) {
            viewPropertyAnimator.scaleX(iVar.f123475a);
            viewPropertyAnimator.scaleY(iVar.f123476b);
        }
        C31609o oVar = this.f123473c;
        if (oVar != null) {
            C32226l<? super Float, Float> lVar = oVar.f84463a;
            View view = this.f123474d;
            float f = 0.0f;
            viewPropertyAnimator.translationX(lVar.invoke(Float.valueOf(view != null ? (float) view.getMeasuredWidth() : 0.0f)).floatValue());
            C32226l<? super Float, Float> lVar2 = oVar.f84464b;
            View view2 = this.f123474d;
            if (view2 != null) {
                f = (float) view2.getMeasuredHeight();
            }
            viewPropertyAnimator.translationY(lVar2.invoke(Float.valueOf(f)).floatValue());
        }
    }

    /* renamed from: f */
    public boolean mo71168f() {
        View view = this.f123474d;
        return view != null && view.getVisibility() == this.f123463e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45664c(int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 4 : i);
    }
}
