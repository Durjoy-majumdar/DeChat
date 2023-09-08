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

/* renamed from: lt2.m */
public class C99642m extends C99594b {

    /* renamed from: c */
    public C95944p.C95951g f292038c;

    /* renamed from: d */
    public ValueAnimator f292039d;

    /* renamed from: e */
    public ValueAnimator f292040e;

    /* renamed from: f */
    public AnimatorSet f292041f;

    /* renamed from: g */
    public ViewGroup f292042g;

    /* renamed from: h */
    public LinearLayout.LayoutParams f292043h;

    /* renamed from: i */
    public FrameLayout.LayoutParams f292044i;

    /* renamed from: j */
    public int[] f292045j = new int[2];

    /* renamed from: lt2.m$a */
    public class C99643a implements ValueAnimator.AnimatorUpdateListener {
        public C99643a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Log.m105925i("MicroMsg.TurnCardAdClickAnimation", "value %f", Float.valueOf(floatValue));
            if (floatValue != 1.0f) {
                C99642m.m130047b(C99642m.this).f280162F0.setScaleX(floatValue);
                C99642m.m130047b(C99642m.this).f280162F0.setScaleY(floatValue);
                View view = C99642m.m130047b(C99642m.this).f280162F0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$1");
        }
    }

    /* renamed from: lt2.m$b */
    public class C99644b extends AnimatorListenerAdapter {
        public C99644b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$2");
            if (C99642m.m130047b(C99642m.this).f279985u0) {
                Log.m105924i("MicroMsg.TurnCardAdClickAnimation", "holder is busy");
                C99642m mVar = C99642m.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
                AnimatorSet animatorSet = mVar.f292041f;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
                Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$2");
                return;
            }
            C99642m.m130047b(C99642m.this).f279985u0 = true;
            C99642m.m130047b(C99642m.this).f280162F0.getLocationInWindow(C99642m.m130048c(C99642m.this));
            Log.m105925i("MicroMsg.TurnCardAdClickAnimation", "location in window %s, %s, %s, %s", Integer.valueOf(C99642m.m130048c(C99642m.this)[0]), Integer.valueOf(C99642m.m130048c(C99642m.this)[1]), Integer.valueOf(C99642m.m130047b(C99642m.this).f280162F0.getWidth()), Integer.valueOf(C99642m.m130047b(C99642m.this).f280162F0.getHeight()));
            C99642m.m130047b(C99642m.this).f279972o.removeView(C99642m.m130047b(C99642m.this).f280162F0);
            ViewGroup.LayoutParams layoutParams = C99642m.m130047b(C99642m.this).f279972o.getLayoutParams();
            layoutParams.width = C99642m.m130047b(C99642m.this).f280162F0.getWidth();
            int height = C99642m.m130047b(C99642m.this).f280162F0.getHeight();
            C99642m mVar2 = C99642m.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            LinearLayout.LayoutParams layoutParams2 = mVar2.f292043h;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            int i = height + layoutParams2.topMargin;
            C99642m mVar3 = C99642m.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            LinearLayout.LayoutParams layoutParams3 = mVar3.f292043h;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            layoutParams.height = i + layoutParams3.bottomMargin;
            C99642m.m130047b(C99642m.this).f279972o.setLayoutParams(layoutParams);
            C99642m mVar4 = C99642m.this;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            mVar4.f292044i = layoutParams4;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            C99642m.m130049d(C99642m.this).leftMargin = C99642m.m130048c(C99642m.this)[0];
            FrameLayout.LayoutParams d = C99642m.m130049d(C99642m.this);
            C99642m mVar5 = C99642m.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            ViewGroup viewGroup = mVar5.f292042g;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            d.rightMargin = (viewGroup.getWidth() - C99642m.m130049d(C99642m.this).leftMargin) - C99642m.m130047b(C99642m.this).f280162F0.getWidth();
            C99642m.m130049d(C99642m.this).topMargin = C99642m.m130048c(C99642m.this)[1];
            FrameLayout.LayoutParams d2 = C99642m.m130049d(C99642m.this);
            C99642m mVar6 = C99642m.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            ViewGroup viewGroup2 = mVar6.f292042g;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            d2.bottomMargin = (viewGroup2.getHeight() - C99642m.m130049d(C99642m.this).topMargin) - C99642m.m130047b(C99642m.this).f280162F0.getHeight();
            C99642m mVar7 = C99642m.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            ViewGroup viewGroup3 = mVar7.f292042g;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            viewGroup3.addView(C99642m.m130047b(C99642m.this).f280162F0, C99642m.m130049d(C99642m.this));
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$2");
        }
    }

    /* renamed from: lt2.m$c */
    public class C99645c implements ValueAnimator.AnimatorUpdateListener {
        public C99645c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99642m.m130047b(C99642m.this).f280165I0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99642m.m130047b(C99642m.this).f280166J0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$3");
        }
    }

    /* renamed from: lt2.m$d */
    public class C99646d extends AnimatorListenerAdapter {
        public C99646d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$4");
            Log.m105924i("MicroMsg.TurnCardAdClickAnimation", "onAnimation end");
            ((ViewGroup) C99642m.m130047b(C99642m.this).f280162F0.getParent()).removeView(C99642m.m130047b(C99642m.this).f280162F0);
            LinearLayout linearLayout = C99642m.m130047b(C99642m.this).f279972o;
            View view = C99642m.m130047b(C99642m.this).f280162F0;
            C99642m mVar = C99642m.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            LinearLayout.LayoutParams layoutParams = mVar.f292043h;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
            linearLayout.addView(view, layoutParams);
            View view2 = C99642m.m130047b(C99642m.this).f280162F0;
            Float valueOf = Float.valueOf(1.0f);
            view2.setScaleX(1.0f);
            C99642m.m130047b(C99642m.this).f280162F0.setScaleY(1.0f);
            View view3 = C99642m.m130047b(C99642m.this).f280162F0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99642m.m130047b(C99642m.this).f280165I0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view6 = C99642m.m130047b(C99642m.this).f280166J0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/animation/timeline/TurnCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99642m.this.f291961b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            C99642m.m130047b(C99642m.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$4");
            Log.m105924i("MicroMsg.TurnCardAdClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99642m.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation$4");
        }
    }

    public C99642m(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f291960a = mMActivity;
        this.f292038c = (C95944p.C95951g) baseViewHolder;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f292039d = ofFloat;
        ofFloat.addUpdateListener(new C99643a());
        this.f292039d.setDuration(400);
        this.f292039d.addListener(new C99644b());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f292040e = ofFloat2;
        ofFloat2.addUpdateListener(new C99645c());
        this.f292040e.setDuration(100);
        this.f292043h = (LinearLayout.LayoutParams) this.f292038c.f280162F0.getLayoutParams();
        this.f292042g = (FrameLayout) this.f291960a.getBodyView().getParent();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f292041f = animatorSet;
        animatorSet.playTogether(new Animator[]{this.f292039d, this.f292040e});
        this.f292041f.addListener(new C99646d());
    }

    /* renamed from: b */
    public static /* synthetic */ C95944p.C95951g m130047b(C99642m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
        C95944p.C95951g gVar = mVar.f292038c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
        return gVar;
    }

    /* renamed from: c */
    public static /* synthetic */ int[] m130048c(C99642m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
        int[] iArr = mVar.f292045j;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
        return iArr;
    }

    /* renamed from: d */
    public static /* synthetic */ FrameLayout.LayoutParams m130049d(C99642m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
        FrameLayout.LayoutParams layoutParams = mVar.f292044i;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
        return layoutParams;
    }

    /* renamed from: a */
    public void mo138970a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
        if (!this.f292041f.isStarted()) {
            this.f292041f.setStartDelay(j);
            this.f292041f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.TurnCardAdClickAnimation");
    }
}
