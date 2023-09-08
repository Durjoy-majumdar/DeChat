package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95944p;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;

/* renamed from: lt2.l */
public class C99637l extends C99593a {

    /* renamed from: c */
    public C95944p.C95951g f292026c;

    /* renamed from: d */
    public ValueAnimator f292027d;

    /* renamed from: e */
    public ValueAnimator f292028e;

    /* renamed from: f */
    public AnimatorSet f292029f;

    /* renamed from: g */
    public ViewGroup f292030g;

    /* renamed from: h */
    public LinearLayout.LayoutParams f292031h;

    /* renamed from: i */
    public FrameLayout.LayoutParams f292032i;

    /* renamed from: j */
    public int[] f292033j = new int[2];

    /* renamed from: lt2.l$a */
    public class C99638a implements ValueAnimator.AnimatorUpdateListener {
        public C99638a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Log.m105925i("MicroMsg.TurnCardAdBackAnimation", "value %f", Float.valueOf(floatValue));
            if (floatValue != 0.0f) {
                C99637l.m130043b(C99637l.this).f280162F0.setScaleX(floatValue);
                C99637l.m130043b(C99637l.this).f280162F0.setScaleY(floatValue);
                View view = C99637l.m130043b(C99637l.this).f280162F0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$1");
        }
    }

    /* renamed from: lt2.l$b */
    public class C99639b extends AnimatorListenerAdapter {
        public C99639b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$2");
            if (C99637l.m130043b(C99637l.this).f279985u0) {
                Log.m105924i("MicroMsg.TurnCardAdBackAnimation", "holder is busy");
                C99637l lVar = C99637l.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
                AnimatorSet animatorSet = lVar.f292029f;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
                Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$2");
                return;
            }
            C99637l.m130043b(C99637l.this).f279985u0 = true;
            View view = C99637l.m130043b(C99637l.this).f280165I0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99637l.m130043b(C99637l.this).f280166J0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99637l.m130043b(C99637l.this).f280162F0.getLocationInWindow(C99637l.m130044c(C99637l.this));
            Log.m105925i("MicroMsg.TurnCardAdBackAnimation", "location in window %s, %s", Integer.valueOf(C99637l.m130044c(C99637l.this)[0]), Integer.valueOf(C99637l.m130044c(C99637l.this)[1]));
            C99637l.m130043b(C99637l.this).f279972o.removeView(C99637l.m130043b(C99637l.this).f280162F0);
            ViewGroup.LayoutParams layoutParams = C99637l.m130043b(C99637l.this).f279972o.getLayoutParams();
            layoutParams.width = C99637l.m130043b(C99637l.this).f280162F0.getWidth();
            int height = C99637l.m130043b(C99637l.this).f280162F0.getHeight();
            C99637l lVar2 = C99637l.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            LinearLayout.LayoutParams layoutParams2 = lVar2.f292031h;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            int i = height + layoutParams2.topMargin;
            C99637l lVar3 = C99637l.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            LinearLayout.LayoutParams layoutParams3 = lVar3.f292031h;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            layoutParams.height = i + layoutParams3.bottomMargin;
            C99637l.m130043b(C99637l.this).f279972o.setLayoutParams(layoutParams);
            C99637l lVar4 = C99637l.this;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            lVar4.f292032i = layoutParams4;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            C99637l.m130045d(C99637l.this).leftMargin = C99637l.m130044c(C99637l.this)[0];
            FrameLayout.LayoutParams d = C99637l.m130045d(C99637l.this);
            C99637l lVar5 = C99637l.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            ViewGroup viewGroup = lVar5.f292030g;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            d.rightMargin = (viewGroup.getWidth() - C99637l.m130045d(C99637l.this).leftMargin) - C99637l.m130043b(C99637l.this).f280162F0.getWidth();
            C99637l.m130045d(C99637l.this).topMargin = C99637l.m130044c(C99637l.this)[1];
            FrameLayout.LayoutParams d2 = C99637l.m130045d(C99637l.this);
            C99637l lVar6 = C99637l.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            ViewGroup viewGroup2 = lVar6.f292030g;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            d2.bottomMargin = (viewGroup2.getHeight() - C99637l.m130045d(C99637l.this).topMargin) - C99637l.m130043b(C99637l.this).f280162F0.getHeight();
            C99637l lVar7 = C99637l.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            ViewGroup viewGroup3 = lVar7.f292030g;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            viewGroup3.addView(C99637l.m130043b(C99637l.this).f280162F0, C99637l.m130045d(C99637l.this));
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$2");
        }
    }

    /* renamed from: lt2.l$c */
    public class C99640c implements ValueAnimator.AnimatorUpdateListener {
        public C99640c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99637l.m130043b(C99637l.this).f280165I0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99637l.m130043b(C99637l.this).f280166J0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$3");
        }
    }

    /* renamed from: lt2.l$d */
    public class C99641d extends AnimatorListenerAdapter {
        public C99641d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$4");
            Log.m105924i("MicroMsg.TurnCardAdBackAnimation", "onAnimation end");
            ((ViewGroup) C99637l.m130043b(C99637l.this).f280162F0.getParent()).removeView(C99637l.m130043b(C99637l.this).f280162F0);
            LinearLayout linearLayout = C99637l.m130043b(C99637l.this).f279972o;
            View view = C99637l.m130043b(C99637l.this).f280162F0;
            C99637l lVar = C99637l.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            LinearLayout.LayoutParams layoutParams = lVar.f292031h;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
            linearLayout.addView(view, layoutParams);
            View view2 = C99637l.m130043b(C99637l.this).f280162F0;
            Float valueOf = Float.valueOf(1.0f);
            view2.setScaleX(1.0f);
            C99637l.m130043b(C99637l.this).f280162F0.setScaleY(1.0f);
            View view3 = C99637l.m130043b(C99637l.this).f280162F0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99637l.m130043b(C99637l.this).f280165I0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view6 = C99637l.m130043b(C99637l.this).f280166J0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99637l.this.f291959b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            C99637l.m130043b(C99637l.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$4");
            Log.m105924i("MicroMsg.TurnCardAdBackAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99637l.this.f291959b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation$4");
        }
    }

    public C99637l(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f291958a = mMActivity;
        this.f292026c = (C95944p.C95951g) baseViewHolder;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f292027d = ofFloat;
        ofFloat.addUpdateListener(new C99638a());
        this.f292027d.setDuration(400);
        this.f292027d.addListener(new C99639b());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f292028e = ofFloat2;
        ofFloat2.addUpdateListener(new C99640c());
        this.f292028e.setDuration(100);
        this.f292028e.setStartDelay(300);
        this.f292031h = (LinearLayout.LayoutParams) this.f292026c.f280162F0.getLayoutParams();
        this.f292030g = (FrameLayout) this.f291958a.getBodyView().getParent();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f292029f = animatorSet;
        animatorSet.playTogether(new Animator[]{this.f292027d, this.f292028e});
        this.f292029f.addListener(new C99641d());
    }

    /* renamed from: b */
    public static /* synthetic */ C95944p.C95951g m130043b(C99637l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
        C95944p.C95951g gVar = lVar.f292026c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
        return gVar;
    }

    /* renamed from: c */
    public static /* synthetic */ int[] m130044c(C99637l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
        int[] iArr = lVar.f292033j;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
        return iArr;
    }

    /* renamed from: d */
    public static /* synthetic */ FrameLayout.LayoutParams m130045d(C99637l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
        FrameLayout.LayoutParams layoutParams = lVar.f292032i;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
        return layoutParams;
    }

    /* renamed from: a */
    public void mo138969a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
        if (!this.f292029f.isStarted()) {
            this.f292029f.setStartDelay(j);
            this.f292029f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdBackAnimation");
    }
}
