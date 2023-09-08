package er1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: er1.b5 */
public final class C58698b5 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<C58799z4> f168031d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<Float, Boolean, C13598b0> f168032e;

    /* renamed from: er1.b5$a */
    public static final class C58699a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58799z4 f168033d;

        public C58699a(C58799z4 z4Var) {
            this.f168033d = z4Var;
        }

        public final void run() {
            this.f168033d.f168342a.getLayoutParams().height = this.f168033d.f168344c.f167979a;
            if (BuildInfo.DEBUG) {
                Log.m105924i("LucianTest", this.f168033d.f168342a + " height:" + this.f168033d.f168342a.getLayoutParams().height + '!');
            }
        }
    }

    /* renamed from: er1.b5$b */
    public static final class C58700b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58799z4 f168034d;

        public C58700b(C58799z4 z4Var) {
            this.f168034d = z4Var;
        }

        public final void run() {
            C58799z4 z4Var = this.f168034d;
            View view = z4Var.f168342a;
            float f = z4Var.f168345d.f84631a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/InAndOutAnimUtil$anim$1$1$2$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/utils/InAndOutAnimUtil$anim$1$1$2$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public C58698b5(LinkedList<C58799z4> linkedList, C32227p<? super Float, ? super Boolean, C13598b0> pVar, float f) {
        this.f168031d = linkedList;
        this.f168032e = pVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        Iterator<T> it = this.f168031d.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            C58799z4 z4Var = (C58799z4) it.next();
            C58683a5 a5Var = z4Var.f168344c;
            if (a5Var.f167980b != a5Var.f167981c) {
                ViewGroup.LayoutParams layoutParams = z4Var.f168342a.getLayoutParams();
                C58683a5 a5Var2 = z4Var.f168344c;
                int i = a5Var2.f167980b;
                layoutParams.height = (int) (((float) i) + (((float) (a5Var2.f167981c - i)) * floatValue));
                if (BuildInfo.DEBUG) {
                    Log.m105924i("LucianTest", z4Var.f168342a + " height:" + z4Var.f168342a.getLayoutParams().height + '!');
                }
                z = true;
            } else {
                z = false;
            }
            C31686y4 y4Var = z4Var.f168345d;
            float f = y4Var.f84632b;
            float f2 = y4Var.f84633c;
            if (!(f == f2)) {
                View view = z4Var.f168342a;
                float f3 = f + ((f2 - f) * floatValue);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f3));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/InAndOutAnimUtil$anim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/utils/InAndOutAnimUtil$anim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                z2 = z;
            }
            if (z2) {
                z4Var.f168342a.requestLayout();
            }
        }
        C32227p<Float, Boolean, C13598b0> pVar = this.f168032e;
        if (pVar != null) {
            pVar.invoke(Float.valueOf(floatValue), Boolean.valueOf(floatValue == 1.0f));
        }
        if (floatValue == 1.0f) {
            for (C58799z4 z4Var2 : this.f168031d) {
                if (z4Var2.f168343b) {
                    C58683a5 a5Var3 = z4Var2.f168344c;
                    if (a5Var3.f167980b != a5Var3.f167981c) {
                        z4Var2.f168342a.post(new C58699a(z4Var2));
                    }
                    C31686y4 y4Var2 = z4Var2.f168345d;
                    if (!(y4Var2.f84632b == y4Var2.f84633c)) {
                        z4Var2.f168342a.post(new C58700b(z4Var2));
                    }
                }
            }
        }
    }
}
