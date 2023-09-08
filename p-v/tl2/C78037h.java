package tl2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: tl2.h */
public final class C78037h {

    /* renamed from: tl2.h$a */
    public static final class C78038a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C71029e f228783d;

        public C78038a(C71029e eVar) {
            this.f228783d = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            C71029e eVar = this.f228783d;
            if (eVar != null) {
                eVar.mo24256a(false);
            }
        }

        public void onAnimationStart(Animator animator) {
            C71029e eVar = this.f228783d;
            if (eVar != null) {
                eVar.mo24257b();
            }
        }
    }

    /* renamed from: a */
    public static final void m94188a(View view, C71029e eVar) {
        C87412m.m108594g(view, "successMarkView");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationHelper", "animateDefaultSuccessView", "(Landroid/view/View;Lcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationHelper", "animateDefaultSuccessView", "(Landroid/view/View;Lcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300).setListener(new C78038a(eVar)).setInterpolator(new LinearInterpolator()).start();
    }
}
