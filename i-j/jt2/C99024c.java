package jt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: jt2.c */
public class C99024c extends C99022a {

    /* renamed from: m */
    public int f290313m = 0;

    /* renamed from: n */
    public long f290314n = 0;

    /* renamed from: o */
    public long f290315o = 0;

    /* renamed from: jt2.c$a */
    public class C99025a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f290316d;

        public C99025a(boolean z) {
            this.f290316d = z;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$1");
            C99024c cVar = C99024c.this;
            SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            cVar.f290313m++;
            SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99024c.this.f290302b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f - floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (floatValue != 1.0f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C99024c.this.f290302b.getLayoutParams();
                C99024c cVar2 = C99024c.this;
                layoutParams.leftMargin = (int) (((float) cVar2.f290305e) * floatValue);
                layoutParams.topMargin = (int) (((float) cVar2.f290306f) * floatValue);
                ViewGroup viewGroup = (ViewGroup) cVar2.f290302b.getParent();
                if (this.f290316d) {
                    C99024c cVar3 = C99024c.this;
                    layoutParams.rightMargin = (int) ((((float) viewGroup.getWidth()) - (((float) cVar3.f290312l) - (((float) cVar3.f290310j) * floatValue))) - ((float) layoutParams.leftMargin));
                    C99024c cVar4 = C99024c.this;
                    layoutParams.bottomMargin = (int) ((((float) viewGroup.getHeight()) - (((float) cVar4.f290311k) - (((float) cVar4.f290309i) * floatValue))) - ((float) layoutParams.topMargin));
                } else {
                    layoutParams.rightMargin = (int) (((((float) viewGroup.getWidth()) * floatValue) - (((float) C99024c.this.f290307g) * floatValue)) - ((float) layoutParams.leftMargin));
                    layoutParams.bottomMargin = (int) (((((float) viewGroup.getHeight()) * floatValue) - (((float) C99024c.this.f290308h) * floatValue)) - ((float) layoutParams.topMargin));
                }
                C99024c.this.f290302b.setLayoutParams(layoutParams);
            }
            C99023b bVar = C99024c.this.f290304d;
            if (bVar != null) {
                bVar.mo130378a(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$1");
        }
    }

    /* renamed from: jt2.c$b */
    public class C99026b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ boolean f290318d;

        public C99026b(boolean z) {
            this.f290318d = z;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
            C99024c cVar = C99024c.this;
            long currentTimeMillis = System.currentTimeMillis();
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            cVar.f290315o = currentTimeMillis;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            C99023b bVar = C99024c.this.f290304d;
            if (bVar != null) {
                bVar.onAnimationEnd();
            }
            if (!this.f290318d) {
                View view = C99024c.this.f290302b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
            C99024c cVar = C99024c.this;
            long currentTimeMillis = System.currentTimeMillis();
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            cVar.f290314n = currentTimeMillis;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C99024c.this.f290302b.getLayoutParams();
            C99024c cVar2 = C99024c.this;
            layoutParams.leftMargin = cVar2.f290305e;
            layoutParams.topMargin = cVar2.f290306f;
            ViewGroup viewGroup = (ViewGroup) cVar2.f290302b.getParent();
            if (this.f290318d) {
                int width = viewGroup.getWidth();
                C99024c cVar3 = C99024c.this;
                layoutParams.rightMargin = (width - (cVar3.f290312l - cVar3.f290310j)) - layoutParams.leftMargin;
                int height = viewGroup.getHeight();
                C99024c cVar4 = C99024c.this;
                layoutParams.bottomMargin = (height - (cVar4.f290311k - cVar4.f290309i)) - layoutParams.topMargin;
            } else {
                layoutParams.rightMargin = (viewGroup.getWidth() - C99024c.this.f290307g) - layoutParams.leftMargin;
                layoutParams.bottomMargin = (viewGroup.getHeight() - C99024c.this.f290308h) - layoutParams.topMargin;
            }
            C99024c.this.f290302b.setLayoutParams(layoutParams);
            View view = C99024c.this.f290302b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C99023b bVar = C99024c.this.f290304d;
            if (bVar != null) {
                bVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
        }
    }

    public C99024c(Activity activity, View view, boolean z) {
        super(activity, view, z);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f290303c = ofFloat;
        ofFloat.addUpdateListener(new C99025a(z));
        this.f290303c.addListener(new C99026b(z));
        this.f290303c.setDuration(400);
    }
}
