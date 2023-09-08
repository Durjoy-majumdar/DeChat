package bj3;

import android.view.View;
import android.view.ViewPropertyAnimator;
import fj3.C20713c;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import my3.C109647f;

/* renamed from: bj3.c */
public final class C54476c {

    /* renamed from: bj3.c$a */
    public static final class C54477a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f152737d;

        public C54477a(C32224a aVar) {
            this.f152737d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f152737d.invoke();
        }
    }

    /* renamed from: a */
    public static void m61195a(View view, C109647f fVar, boolean z, C32224a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        C54477a aVar2 = null;
        if ((i & 4) != 0) {
            aVar = null;
        }
        C87412m.m108594g(view, "<this>");
        C87412m.m108594g(fVar, "range");
        float doubleValue = (float) ((Number) fVar.mo59687f0()).doubleValue();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(Float.valueOf(doubleValue));
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/ui/anim/basic/AnimBasicKt", "fade", "(Landroid/view/View;Lkotlin/ranges/ClosedFloatingPointRange;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/anim/basic/AnimBasicKt", "fade", "(Landroid/view/View;Lkotlin/ranges/ClosedFloatingPointRange;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (z) {
            ViewPropertyAnimator animate = view.animate();
            animate.setInterpolator(C20713c.f58572a.mo32435a()).setUpdateListener(new C0305a(view, (float) ((Number) fVar.mo59688g0()).doubleValue())).withEndAction(new C54475b(animate, aVar)).start();
            return;
        }
        ViewPropertyAnimator interpolator = view.animate().alpha((float) ((Number) fVar.mo59688g0()).doubleValue()).setInterpolator(C20713c.f58572a.mo32435a());
        if (aVar != null) {
            aVar2 = new C54477a(aVar);
        }
        interpolator.withEndAction(aVar2).start();
    }
}
