package gk3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gk3.p */
public final class C75919p {

    /* renamed from: a */
    public static final C75919p f222593a = new C75919p();

    /* renamed from: b */
    public static HashMap<Integer, Integer> f222594b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<Integer, Boolean> f222595c = new HashMap<>();

    /* renamed from: d */
    public static HashMap<Integer, ValueAnimator> f222596d = new HashMap<>();

    /* renamed from: gk3.p$a */
    public static final class C8333a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f27294d;

        public C8333a(View view) {
            this.f27294d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f27294d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: gk3.p$b */
    public static final class C75920b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public boolean f222597d;

        /* renamed from: e */
        public final /* synthetic */ View f222598e;

        /* renamed from: f */
        public final /* synthetic */ boolean f222599f;

        public C75920b(View view, boolean z) {
            this.f222598e = view;
            this.f222599f = z;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f222597d = true;
            View view = this.f222598e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f222598e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            Log.m105927v("MicroMsg.QuickButtonAnimationHelper", "alvinluo doAlphaAnimation cancel, show: %b, view: %s", Boolean.valueOf(this.f222599f), this.f222598e);
            C75919p pVar = C75919p.f222593a;
            C75919p.f222595c.remove(Integer.valueOf(this.f222598e.hashCode()));
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f222598e;
            int i = (!this.f222599f || this.f222597d) ? 8 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f222598e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            boolean z = true;
            Log.m105927v("MicroMsg.QuickButtonAnimationHelper", "alvinluo doAlphaAnimation end, show: %b, cancelled: %b, view: %s", Boolean.valueOf(this.f222599f), Boolean.valueOf(this.f222597d), this.f222598e);
            C75919p pVar = C75919p.f222593a;
            C75919p.f222595c.remove(Integer.valueOf(this.f222598e.hashCode()));
            View view4 = this.f222598e;
            Integer remove = C75919p.f222594b.remove(Integer.valueOf(view4.hashCode()));
            if (remove == null) {
                ValueAnimator valueAnimator = C75919p.f222596d.get(Integer.valueOf(view4.hashCode()));
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.removeAllListeners();
                    return;
                }
                return;
            }
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(remove.intValue() == 1);
            Log.m105927v("MicroMsg.QuickButtonAnimationHelper", "alvinluo runNextAnimation show: %b", objArr);
            if (remove.intValue() != 1) {
                z = false;
            }
            if (z) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper", "runNextAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper", "runNextAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            pVar.mo106177b(view4, z);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            Log.m105927v("MicroMsg.QuickButtonAnimationHelper", "alvinluo doAlphaAnimation start, show: %b, view: %s", Boolean.valueOf(this.f222599f), this.f222598e);
        }
    }

    /* renamed from: c */
    public static final void m91177c() {
        for (Map.Entry<Integer, ValueAnimator> value : f222596d.entrySet()) {
            ValueAnimator valueAnimator = (ValueAnimator) value.getValue();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        f222596d.clear();
        f222594b.clear();
        f222595c.clear();
    }

    /* renamed from: a */
    public final void mo106176a(View view, boolean z) {
        Boolean bool = f222595c.get(Integer.valueOf(view.hashCode()));
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        Log.m105919d("MicroMsg.QuickButtonAnimationHelper", "alvinluo addAnimation view: %s, isRunning: %b, show: %b", view, Boolean.valueOf(booleanValue), Boolean.valueOf(z));
        if (!booleanValue) {
            mo106177b(view, z);
        } else {
            f222594b.put(Integer.valueOf(view.hashCode()), Integer.valueOf(z ? 1 : 0));
        }
    }

    /* renamed from: b */
    public final void mo106177b(View view, boolean z) {
        f222595c.put(Integer.valueOf(view.hashCode()), Boolean.TRUE);
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        ValueAnimator valueAnimator = f222596d.get(Integer.valueOf(view.hashCode()));
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
            f222596d.put(Integer.valueOf(view.hashCode()), valueAnimator);
        }
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(z);
        String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
        if (resourceEntryName == null) {
            resourceEntryName = "";
        }
        objArr[1] = resourceEntryName;
        Log.m105919d("MicroMsg.QuickButtonAnimationHelper", "alvinluo doAlphaAnimation show: %b, view: %s", objArr);
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.setFloatValues(new float[]{f2, f});
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(150);
        valueAnimator.addUpdateListener(new C8333a(view));
        valueAnimator.addListener(new C75920b(view, z));
        valueAnimator.start();
    }
}
