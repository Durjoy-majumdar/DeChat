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

/* renamed from: jt2.d */
public class C99027d extends C99022a {

    /* renamed from: jt2.d$a */
    public class C99028a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f290320d;

        public C99028a(boolean z) {
            this.f290320d = z;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f290320d) {
                View view = C99027d.this.f290302b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f - (0.2f * floatValue)));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                View view3 = C99027d.this.f290302b;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f - floatValue));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (floatValue != 0.0f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C99027d.this.f290302b.getLayoutParams();
                C99027d dVar = C99027d.this;
                layoutParams.leftMargin = (int) (((float) dVar.f290305e) * floatValue);
                layoutParams.topMargin = (int) (((float) dVar.f290306f) * floatValue);
                ViewGroup viewGroup = (ViewGroup) dVar.f290302b.getParent();
                if (this.f290320d) {
                    C99027d dVar2 = C99027d.this;
                    layoutParams.rightMargin = (int) ((((float) viewGroup.getWidth()) - (((float) dVar2.f290312l) - (((float) dVar2.f290310j) * floatValue))) - ((float) layoutParams.leftMargin));
                    C99027d dVar3 = C99027d.this;
                    layoutParams.bottomMargin = (int) ((((float) viewGroup.getHeight()) - (((float) dVar3.f290311k) - (((float) dVar3.f290309i) * floatValue))) - ((float) layoutParams.topMargin));
                } else {
                    layoutParams.rightMargin = (int) (((((float) viewGroup.getWidth()) * floatValue) - (((float) C99027d.this.f290307g) * floatValue)) - ((float) layoutParams.leftMargin));
                    layoutParams.bottomMargin = (int) (((((float) viewGroup.getHeight()) * floatValue) - (((float) C99027d.this.f290308h) * floatValue)) - ((float) layoutParams.topMargin));
                }
                C99027d.this.f290302b.setLayoutParams(layoutParams);
            }
            C99023b bVar = C99027d.this.f290304d;
            if (bVar != null) {
                bVar.mo130378a(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$1");
        }
    }

    /* renamed from: jt2.d$b */
    public class C99029b extends AnimatorListenerAdapter {
        public C99029b() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$2");
            C99023b bVar = C99027d.this.f290304d;
            if (bVar != null) {
                bVar.onAnimationEnd();
            }
            View view = C99027d.this.f290302b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$2");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$2");
            C99023b bVar = C99027d.this.f290304d;
            if (bVar != null) {
                bVar.onAnimationStart();
            }
            View view = C99027d.this.f290302b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$2");
        }
    }

    public C99027d(Activity activity, View view, boolean z) {
        super(activity, view, z);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f290303c = ofFloat;
        ofFloat.addUpdateListener(new C99028a(z));
        this.f290303c.addListener(new C99029b());
        if (z) {
            this.f290303c.setDuration(300);
        } else {
            this.f290303c.setDuration(400);
        }
    }
}
