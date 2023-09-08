package xm3;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p1136n3.C109678b;

/* renamed from: xm3.h */
public final class C78901h implements C7020t0 {

    /* renamed from: d */
    public final /* synthetic */ C78904i f231764d;

    /* renamed from: xm3.h$a */
    public static final class C78902a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public static final C78902a f231765d = new C78902a();

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue("translationY");
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            Log.m105925i("MicroMsg.SelectContactBottomMenuUIC", "onAnimationUpdate %s", Float.valueOf(((Float) animatedValue).floatValue()));
        }
    }

    public C78901h(C78904i iVar) {
        this.f231764d = iVar;
    }

    /* renamed from: Q1 */
    public final void mo531Q1(int i, boolean z) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        Log.m105925i("MicroMsg.SelectContactBottomMenuUIC", "height:%s", Integer.valueOf(i));
        ObjectAnimator objectAnimator3 = this.f231764d.f231769f;
        if ((objectAnimator3 != null && objectAnimator3.isRunning()) && (objectAnimator2 = this.f231764d.f231769f) != null) {
            objectAnimator2.cancel();
        }
        C78904i iVar = this.f231764d;
        if (i > 0) {
            if (!(iVar.mo108901g3().mo109053k().getTranslationY() == 0.0f)) {
                this.f231764d.mo108901g3().mo109053k().setTranslationY(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(this.f231764d.mo108901g3().mo109053k(), "translationY", new float[]{0.0f, -((float) i)});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(iVar.mo108901g3().mo109053k(), "translationY", new float[]{this.f231764d.mo108901g3().mo109053k().getTranslationY(), 0.0f});
        }
        iVar.f231769f = objectAnimator;
        ObjectAnimator objectAnimator4 = this.f231764d.f231769f;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(200);
        }
        ObjectAnimator objectAnimator5 = this.f231764d.f231769f;
        if (objectAnimator5 != null) {
            objectAnimator5.setInterpolator(new C109678b());
        }
        ObjectAnimator objectAnimator6 = this.f231764d.f231769f;
        if (objectAnimator6 != null) {
            objectAnimator6.addUpdateListener(C78902a.f231765d);
        }
        ObjectAnimator objectAnimator7 = this.f231764d.f231769f;
        if (objectAnimator7 != null) {
            objectAnimator7.start();
        }
    }
}
