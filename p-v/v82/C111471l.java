package v82;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: v82.l */
public class C111471l extends Animation {

    /* renamed from: d */
    public final /* synthetic */ View f333732d;

    /* renamed from: e */
    public final /* synthetic */ int f333733e;

    /* renamed from: f */
    public final /* synthetic */ CollapseView f333734f;

    public C111471l(CollapseView collapseView, View view, int i) {
        this.f333734f = collapseView;
        this.f333732d = view;
        this.f333733e = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        float f2 = 1.0f;
        if (f == 1.0f) {
            View view = this.f333734f.f314966o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f333732d.getLayoutParams().height = this.f333733e;
            this.f333734f.getClass();
        } else {
            CollapseView collapseView = this.f333734f;
            if (f >= collapseView.f314968q) {
                View view3 = collapseView.f314966o;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                CollapseView collapseView2 = this.f333734f;
                View view5 = collapseView2.f314966o;
                float f3 = (f - collapseView2.f314968q) + 0.1f;
                if (((double) f3) * 2.5d < 1.0d) {
                    f2 = 2.5f * f3;
                }
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(Float.valueOf(f2));
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ((LinearLayout.LayoutParams) this.f333732d.getLayoutParams()).topMargin = (int) (((float) C111418b0.f333549j) * f);
            ((LinearLayout.LayoutParams) this.f333732d.getLayoutParams()).bottomMargin = (int) (((float) C111418b0.f333544e) * f);
            this.f333732d.getLayoutParams().height = (int) (((float) this.f333733e) * f);
        }
        this.f333732d.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
