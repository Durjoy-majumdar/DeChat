package ul2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ul2.t */
public final class C14246t extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f39773d;

    public C14246t(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f39773d = scanCodeProductMergeMaskView;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f39773d.f316026R0;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.7f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$switchScanProductViewExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$switchScanProductViewExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f39773d.f316026R0;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$switchScanProductViewExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$switchScanProductViewExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("maskView");
            throw null;
        }
        C87412m.m108603p("maskView");
        throw null;
    }
}
