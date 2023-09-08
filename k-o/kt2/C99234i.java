package kt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;
import nt2.C100165c;
import nt2.C100189m;

/* renamed from: kt2.i */
public class C99234i extends C99208a {

    /* renamed from: c */
    public C100189m f290955c;

    /* renamed from: d */
    public ValueAnimator f290956d;

    /* renamed from: e */
    public ValueAnimator f290957e;

    /* renamed from: f */
    public AnimatorSet f290958f;

    /* renamed from: g */
    public ViewGroup f290959g;

    /* renamed from: h */
    public LinearLayout.LayoutParams f290960h;

    /* renamed from: i */
    public FrameLayout.LayoutParams f290961i;

    /* renamed from: j */
    public int[] f290962j = new int[2];

    /* renamed from: kt2.i$a */
    public class C99235a implements ValueAnimator.AnimatorUpdateListener {
        public C99235a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                C99234i.m129237b(C99234i.this).f293413f.setScaleX(floatValue);
                C99234i.m129237b(C99234i.this).f293413f.setScaleY(floatValue);
                View view = C99234i.m129237b(C99234i.this).f293413f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$1");
        }
    }

    /* renamed from: kt2.i$b */
    public class C99236b implements ValueAnimator.AnimatorUpdateListener {
        public C99236b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$2");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99234i.m129237b(C99234i.this).f293548q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99234i.m129237b(C99234i.this).f293547p;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$2");
        }
    }

    /* renamed from: kt2.i$c */
    public class C99237c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f290965d;

        public C99237c(MMActivity mMActivity) {
            this.f290965d = mMActivity;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$3");
            Log.m105924i("MicroMsg.TurnCardAdDetailBackAnimation", "onAnimation end");
            ((ViewGroup) C99234i.this.f290916a.getBodyView().getParent()).removeView(C99234i.m129237b(C99234i.this).f293413f);
            View view = C99234i.m129237b(C99234i.this).f293413f;
            C99234i iVar = C99234i.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            LinearLayout.LayoutParams layoutParams = iVar.f290960h;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            ((ViewGroup) C99234i.m129237b(C99234i.this).f293414g).addView(view, layoutParams);
            View view2 = C99234i.m129237b(C99234i.this).f293413f;
            Float valueOf = Float.valueOf(1.0f);
            view2.setScaleX(1.0f);
            C99234i.m129237b(C99234i.this).f293413f.setScaleY(1.0f);
            View view3 = C99234i.m129237b(C99234i.this).f293413f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99234i.m129237b(C99234i.this).f293547p;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view6 = C99234i.m129237b(C99234i.this).f293548q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99234i.this.f290917b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$3");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$3");
            Log.m105924i("MicroMsg.TurnCardAdDetailBackAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99234i.this.f290917b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            View view = C99234i.m129237b(C99234i.this).f293548q;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99234i.m129237b(C99234i.this).f293547p;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99234i.m129237b(C99234i.this).f293413f.getLocationInWindow(C99234i.m129238c(C99234i.this));
            Log.m105925i("MicroMsg.TurnCardAdDetailBackAnimation", "location in window %s, %s", Integer.valueOf(C99234i.m129238c(C99234i.this)[0]), Integer.valueOf(C99234i.m129238c(C99234i.this)[1]));
            ((ViewGroup) C99234i.m129237b(C99234i.this).f293414g).removeView(C99234i.m129237b(C99234i.this).f293413f);
            ViewGroup.LayoutParams layoutParams = C99234i.m129237b(C99234i.this).f293414g.getLayoutParams();
            layoutParams.width = C99234i.m129237b(C99234i.this).f293413f.getWidth();
            int height = C99234i.m129237b(C99234i.this).f293413f.getHeight();
            C99234i iVar = C99234i.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            LinearLayout.LayoutParams layoutParams2 = iVar.f290960h;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            int i = height + layoutParams2.topMargin;
            C99234i iVar2 = C99234i.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            LinearLayout.LayoutParams layoutParams3 = iVar2.f290960h;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            layoutParams.height = i + layoutParams3.bottomMargin;
            C99234i.m129237b(C99234i.this).f293414g.setLayoutParams(layoutParams);
            C99234i iVar3 = C99234i.this;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            iVar3.f290961i = layoutParams4;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            C99234i.m129239d(C99234i.this).leftMargin = C99234i.m129238c(C99234i.this)[0];
            FrameLayout.LayoutParams d = C99234i.m129239d(C99234i.this);
            C99234i iVar4 = C99234i.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            ViewGroup viewGroup = iVar4.f290959g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            d.rightMargin = (viewGroup.getWidth() - C99234i.m129239d(C99234i.this).leftMargin) - C99234i.m129237b(C99234i.this).f293413f.getWidth();
            C99234i.m129239d(C99234i.this).topMargin = C99234i.m129238c(C99234i.this)[1] - C85875k4.m106198o(this.f290965d);
            FrameLayout.LayoutParams d2 = C99234i.m129239d(C99234i.this);
            C99234i iVar5 = C99234i.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            ViewGroup viewGroup2 = iVar5.f290959g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            d2.bottomMargin = (viewGroup2.getHeight() - C99234i.m129239d(C99234i.this).topMargin) - C99234i.m129237b(C99234i.this).f293413f.getHeight();
            C99234i iVar6 = C99234i.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            ViewGroup viewGroup3 = iVar6.f290959g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
            viewGroup3.addView(C99234i.m129237b(C99234i.this).f293413f, C99234i.m129239d(C99234i.this));
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation$3");
        }
    }

    public C99234i(MMActivity mMActivity, C100165c cVar) {
        this.f290916a = mMActivity;
        this.f290955c = (C100189m) cVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f290956d = ofFloat;
        ofFloat.addUpdateListener(new C99235a());
        this.f290956d.setDuration(400);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f290957e = ofFloat2;
        ofFloat2.addUpdateListener(new C99236b());
        this.f290957e.setDuration(100);
        this.f290957e.setStartDelay(300);
        this.f290960h = (LinearLayout.LayoutParams) this.f290955c.f293413f.getLayoutParams();
        this.f290959g = (FrameLayout) this.f290916a.getBodyView().getParent();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f290958f = animatorSet;
        animatorSet.playTogether(new Animator[]{this.f290956d, this.f290957e});
        this.f290958f.addListener(new C99237c(mMActivity));
    }

    /* renamed from: b */
    public static /* synthetic */ C100189m m129237b(C99234i iVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
        C100189m mVar = iVar.f290955c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
        return mVar;
    }

    /* renamed from: c */
    public static /* synthetic */ int[] m129238c(C99234i iVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
        int[] iArr = iVar.f290962j;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
        return iArr;
    }

    /* renamed from: d */
    public static /* synthetic */ FrameLayout.LayoutParams m129239d(C99234i iVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
        FrameLayout.LayoutParams layoutParams = iVar.f290961i;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
        return layoutParams;
    }

    /* renamed from: a */
    public void mo138560a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
        if (!this.f290958f.isStarted()) {
            this.f290958f.setStartDelay(j);
            this.f290958f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailBackAnimation");
    }
}
