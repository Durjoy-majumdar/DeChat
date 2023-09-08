package yz2;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCardFeedsActivity;
import gy3.C87412m;

/* renamed from: yz2.k0 */
public final class C53690k0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f150776d;

    /* renamed from: e */
    public final /* synthetic */ int f150777e;

    /* renamed from: f */
    public final /* synthetic */ int f150778f;

    /* renamed from: g */
    public final /* synthetic */ TextStatusCardFeedsActivity f150779g;

    /* renamed from: h */
    public final /* synthetic */ int f150780h;

    /* renamed from: yz2.k0$a */
    public static final class C53691a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ int f150781a;

        /* renamed from: b */
        public final /* synthetic */ int f150782b;

        /* renamed from: c */
        public final /* synthetic */ float f150783c;

        /* renamed from: d */
        public final /* synthetic */ TextStatusCardFeedsActivity f150784d;

        /* renamed from: e */
        public final /* synthetic */ int f150785e;

        public C53691a(int i, int i2, float f, TextStatusCardFeedsActivity textStatusCardFeedsActivity, int i3) {
            this.f150781a = i;
            this.f150782b = i2;
            this.f150783c = f;
            this.f150784d = textStatusCardFeedsActivity;
            this.f150785e = i3;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            if (!(view.getWidth() == 0 || view.getHeight() == 0)) {
                float width = ((float) this.f150781a) / ((float) view.getWidth());
                float f = this.f150783c;
                view.setScaleX(((width - 1.0f) * f) + 1.0f);
                view.setScaleY((((((float) this.f150782b) / ((float) view.getHeight())) - 1.0f) * f) + 1.0f);
                if (this.f150783c >= 0.6f) {
                    TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f150784d;
                    TextStatusCardFeedsActivity.C43198a aVar = TextStatusCardFeedsActivity.f116896j;
                    textStatusCardFeedsActivity.mo67428I7().setAlpha(((this.f150783c - 0.6f) / 0.4f) * 1.0f);
                }
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f150785e);
        }
    }

    public C53690k0(View view, int i, int i2, TextStatusCardFeedsActivity textStatusCardFeedsActivity, int i3) {
        this.f150776d = view;
        this.f150777e = i;
        this.f150778f = i2;
        this.f150779g = textStatusCardFeedsActivity;
        this.f150780h = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        View view = this.f150776d;
        if (view != null) {
            view.setOutlineProvider(new C53691a(this.f150777e, this.f150778f, animatedFraction, this.f150779g, this.f150780h));
        }
    }
}
