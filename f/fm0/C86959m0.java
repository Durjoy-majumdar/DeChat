package fm0;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83825i1;

/* renamed from: fm0.m0 */
public class C86959m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252402d;

    /* renamed from: e */
    public final /* synthetic */ int f252403e;

    /* renamed from: f */
    public final /* synthetic */ int f252404f;

    /* renamed from: g */
    public final /* synthetic */ int f252405g;

    /* renamed from: h */
    public final /* synthetic */ int f252406h;

    /* renamed from: i */
    public final /* synthetic */ String f252407i;

    /* renamed from: j */
    public final /* synthetic */ C8134n0 f252408j;

    /* renamed from: fm0.m0$a */
    public class C86960a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f252409d;

        public C86960a(C86959m0 m0Var, C83780d1 d1Var) {
            this.f252409d = d1Var;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f252409d.mo116191q1(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: fm0.m0$b */
    public class C86961b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f252410d;

        public C86961b(C86959m0 m0Var, C83780d1 d1Var) {
            this.f252410d = d1Var;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f252410d.mo116195s1(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public C86959m0(C8134n0 n0Var, C81879g gVar, int i, int i2, int i3, int i4, String str) {
        this.f252408j = n0Var;
        this.f252402d = gVar;
        this.f252403e = i;
        this.f252404f = i2;
        this.f252405g = i3;
        this.f252406h = i4;
        this.f252407i = str;
    }

    public void run() {
        C83780d1 a = C82644m7.m101430a(this.f252402d);
        if (a == null) {
            this.f252402d.mo109647a(this.f252403e, this.f252408j.mo115109j("fail:page don't exist"));
        } else if (a.isRunning() && !a.f244575V0) {
            a.mo116188p0();
            if (this.f252404f <= 0) {
                a.mo116195s1(this.f252405g);
                a.mo116191q1(this.f252406h);
                return;
            }
            int backgroundColor = a.f244554F.getBackgroundColor();
            int foregroundColor = a.f244554F.getForegroundColor();
            TimeInterpolator timeInterpolator = null;
            if ("linear".equals(this.f252407i)) {
                timeInterpolator = new LinearInterpolator();
            } else if ("easeIn".equals(this.f252407i)) {
                timeInterpolator = new AccelerateInterpolator();
            } else if ("easeOut".equals(this.f252407i)) {
                timeInterpolator = new DecelerateInterpolator();
            } else if ("easeInOut".equals(this.f252407i)) {
                timeInterpolator = new AccelerateDecelerateInterpolator();
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{backgroundColor, this.f252406h});
            valueAnimator.setEvaluator(new ArgbEvaluator());
            valueAnimator.setDuration((long) this.f252404f);
            valueAnimator.setInterpolator(timeInterpolator);
            valueAnimator.addUpdateListener(new C86960a(this, a));
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setIntValues(new int[]{foregroundColor, this.f252405g});
            valueAnimator2.setEvaluator(new ArgbEvaluator());
            valueAnimator2.setDuration((long) this.f252404f);
            valueAnimator2.setInterpolator(timeInterpolator);
            valueAnimator2.addUpdateListener(new C86961b(this, a));
            valueAnimator.start();
            valueAnimator2.start();
            Animator[] animatorArr = {valueAnimator, valueAnimator2};
            for (int i = 0; i < 2; i++) {
                Animator animator = animatorArr[i];
                a.f244579Z.add(animator);
                animator.addListener(new C83825i1(a));
            }
        }
    }
}
