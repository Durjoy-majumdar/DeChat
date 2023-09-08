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

/* renamed from: kt2.j */
public class C99238j extends C99209b {

    /* renamed from: c */
    public C100189m f290967c;

    /* renamed from: d */
    public ValueAnimator f290968d;

    /* renamed from: e */
    public ValueAnimator f290969e;

    /* renamed from: f */
    public AnimatorSet f290970f;

    /* renamed from: g */
    public ViewGroup f290971g;

    /* renamed from: h */
    public LinearLayout.LayoutParams f290972h;

    /* renamed from: i */
    public FrameLayout.LayoutParams f290973i;

    /* renamed from: j */
    public int[] f290974j = new int[2];

    /* renamed from: kt2.j$a */
    public class C99239a implements ValueAnimator.AnimatorUpdateListener {
        public C99239a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (((double) floatValue) != 1.0d) {
                C99238j.m129241b(C99238j.this).f293413f.setScaleX(floatValue);
                C99238j.m129241b(C99238j.this).f293413f.setScaleY(floatValue);
                View view = C99238j.m129241b(C99238j.this).f293413f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$1");
        }
    }

    /* renamed from: kt2.j$b */
    public class C99240b implements ValueAnimator.AnimatorUpdateListener {
        public C99240b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$2");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99238j.m129241b(C99238j.this).f293548q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99238j.m129241b(C99238j.this).f293547p;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$2");
        }
    }

    /* renamed from: kt2.j$c */
    public class C99241c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f290977d;

        public C99241c(MMActivity mMActivity) {
            this.f290977d = mMActivity;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$3");
            Log.m105924i("MicroMsg.TurnCardAdDetailClickAnimation", "onAnimation end");
            ((ViewGroup) C99238j.this.f290918a.getBodyView().getParent()).removeView(C99238j.m129241b(C99238j.this).f293413f);
            View view = C99238j.m129241b(C99238j.this).f293413f;
            C99238j jVar = C99238j.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            LinearLayout.LayoutParams layoutParams = jVar.f290972h;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            ((ViewGroup) C99238j.m129241b(C99238j.this).f293414g).addView(view, layoutParams);
            View view2 = C99238j.m129241b(C99238j.this).f293413f;
            Float valueOf = Float.valueOf(1.0f);
            view2.setScaleX(1.0f);
            C99238j.m129241b(C99238j.this).f293413f.setScaleY(1.0f);
            View view3 = C99238j.m129241b(C99238j.this).f293413f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99238j.m129241b(C99238j.this).f293548q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view6 = C99238j.m129241b(C99238j.this).f293547p;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/animation/detail/TurnCardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99238j.this.f290919b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$3");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$3");
            Log.m105924i("MicroMsg.TurnCardAdDetailClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99238j.this.f290919b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            C99238j.m129241b(C99238j.this).f293413f.getLocationInWindow(C99238j.m129242c(C99238j.this));
            Log.m105925i("MicroMsg.TurnCardAdDetailClickAnimation", "location in window %s, %s", Integer.valueOf(C99238j.m129242c(C99238j.this)[0]), Integer.valueOf(C99238j.m129242c(C99238j.this)[1]));
            ((ViewGroup) C99238j.m129241b(C99238j.this).f293414g).removeView(C99238j.m129241b(C99238j.this).f293413f);
            ViewGroup.LayoutParams layoutParams = C99238j.m129241b(C99238j.this).f293414g.getLayoutParams();
            layoutParams.width = C99238j.m129241b(C99238j.this).f293413f.getWidth();
            int height = C99238j.m129241b(C99238j.this).f293413f.getHeight();
            C99238j jVar = C99238j.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            LinearLayout.LayoutParams layoutParams2 = jVar.f290972h;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            int i = height + layoutParams2.topMargin;
            C99238j jVar2 = C99238j.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            LinearLayout.LayoutParams layoutParams3 = jVar2.f290972h;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            layoutParams.height = i + layoutParams3.bottomMargin;
            C99238j.m129241b(C99238j.this).f293414g.setLayoutParams(layoutParams);
            C99238j jVar3 = C99238j.this;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            jVar3.f290973i = layoutParams4;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            C99238j.m129243d(C99238j.this).leftMargin = C99238j.m129242c(C99238j.this)[0];
            FrameLayout.LayoutParams d = C99238j.m129243d(C99238j.this);
            C99238j jVar4 = C99238j.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            ViewGroup viewGroup = jVar4.f290971g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            d.rightMargin = (viewGroup.getWidth() - C99238j.m129243d(C99238j.this).leftMargin) - C99238j.m129241b(C99238j.this).f293413f.getWidth();
            C99238j.m129243d(C99238j.this).topMargin = C99238j.m129242c(C99238j.this)[1] - C85875k4.m106198o(this.f290977d);
            FrameLayout.LayoutParams d2 = C99238j.m129243d(C99238j.this);
            C99238j jVar5 = C99238j.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            ViewGroup viewGroup2 = jVar5.f290971g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            d2.bottomMargin = (viewGroup2.getHeight() - C99238j.m129243d(C99238j.this).topMargin) - C99238j.m129241b(C99238j.this).f293413f.getHeight();
            C99238j jVar6 = C99238j.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            ViewGroup viewGroup3 = jVar6.f290971g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
            viewGroup3.addView(C99238j.m129241b(C99238j.this).f293413f, C99238j.m129243d(C99238j.this));
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation$3");
        }
    }

    public C99238j(MMActivity mMActivity, C100165c cVar) {
        this.f290918a = mMActivity;
        this.f290967c = (C100189m) cVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f290968d = ofFloat;
        ofFloat.addUpdateListener(new C99239a());
        this.f290968d.setDuration(400);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f290969e = ofFloat2;
        ofFloat2.addUpdateListener(new C99240b());
        this.f290969e.setDuration(100);
        this.f290972h = (LinearLayout.LayoutParams) this.f290967c.f293413f.getLayoutParams();
        this.f290971g = (FrameLayout) this.f290918a.getBodyView().getParent();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f290970f = animatorSet;
        animatorSet.playTogether(new Animator[]{this.f290968d, this.f290969e});
        this.f290970f.addListener(new C99241c(mMActivity));
    }

    /* renamed from: b */
    public static /* synthetic */ C100189m m129241b(C99238j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
        C100189m mVar = jVar.f290967c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
        return mVar;
    }

    /* renamed from: c */
    public static /* synthetic */ int[] m129242c(C99238j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
        int[] iArr = jVar.f290974j;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
        return iArr;
    }

    /* renamed from: d */
    public static /* synthetic */ FrameLayout.LayoutParams m129243d(C99238j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
        FrameLayout.LayoutParams layoutParams = jVar.f290973i;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
        return layoutParams;
    }

    /* renamed from: a */
    public void mo138561a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
        if (!this.f290970f.isStarted()) {
            this.f290970f.setStartDelay(j);
            this.f290970f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.TurnCardAdDetailClickAnimation");
    }
}
