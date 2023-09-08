package nw2;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentItemView;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: nw2.c */
public final class C76967c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f224895d;

    /* renamed from: e */
    public final /* synthetic */ int f224896e;

    /* renamed from: f */
    public final /* synthetic */ CommentItemView f224897f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<C32224a<C13598b0>> f224898g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f224899h;

    public C76967c(int i, int i2, CommentItemView commentItemView, float f, C8479f0<C32224a<C13598b0>> f0Var, C32224a<C13598b0> aVar) {
        this.f224895d = i;
        this.f224896e = i2;
        this.f224897f = commentItemView;
        this.f224898g = f0Var;
        this.f224899h = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        long j;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        int i = (int) (((float) (this.f224895d - this.f224896e)) * (((float) 1) - floatValue));
        float f = (float) i;
        this.f224897f.setTranslationY(f);
        if (floatValue < 0.1f) {
            float f2 = floatValue / 0.1f;
            this.f224897f.setScaleX(f2);
            this.f224897f.setScaleY(f2);
            this.f224897f.setAlpha((f2 * 0.5f) + 0.5f);
        } else {
            this.f224897f.setScaleX(1.0f);
            this.f224897f.setScaleY(1.0f);
            this.f224897f.setAlpha(1.0f);
            C32224a aVar = (C32224a) this.f224898g.f27484d;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f224898g.f27484d = null;
            CommentItemView commentItemView = this.f224897f;
            if (!commentItemView.f206293j) {
                commentItemView.f206293j = true;
                if (!commentItemView.f206292i.f286814g) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new C76966b(commentItemView));
                    j = 300;
                    ofFloat.setDuration(300);
                    ofFloat.start();
                } else {
                    ViewGroup.LayoutParams layoutParams = commentItemView.getLayoutParams();
                    layoutParams.width = commentItemView.f206296p;
                    layoutParams.height = commentItemView.f206295o;
                    commentItemView.setLayoutParams(layoutParams);
                    j = 0;
                }
                commentItemView.getContentLayout().setVisibility(0);
                commentItemView.getContentLayout().setAlpha(0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(commentItemView.getContentLayout(), "alpha", new float[]{0.0f, 1.0f});
                ofFloat2.setStartDelay(j);
                ofFloat2.setDuration(100);
                ofFloat2.start();
            }
        }
        if (i < 100) {
            this.f224897f.setAlpha(f / 100.0f);
        }
        if (this.f224897f.getAlpha() < 0.05f) {
            ValueAnimator normalAnimator = this.f224897f.getNormalAnimator();
            if (normalAnimator != null) {
                normalAnimator.removeAllUpdateListeners();
            }
            C32224a<C13598b0> aVar2 = this.f224899h;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }
}
