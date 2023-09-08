package jn3;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import gy3.C87412m;

/* renamed from: jn3.a */
public final class C76419a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatTipsBarGroup f223736d;

    /* renamed from: e */
    public final /* synthetic */ int f223737e;

    /* renamed from: jn3.a$a */
    public static final class C76420a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ int f223738a;

        /* renamed from: b */
        public final /* synthetic */ float f223739b;

        public C76420a(int i, float f) {
            this.f223738a = i;
            this.f223739b = f;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            int height = view.getHeight();
            int i = this.f223738a;
            outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) i) + (((float) (height - i)) * this.f223739b)), 0.0f);
        }
    }

    public C76419a(ChatTipsBarGroup chatTipsBarGroup, int i) {
        this.f223736d = chatTipsBarGroup;
        this.f223737e = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f223736d.f219954e.setOutlineProvider(new C76420a(this.f223737e, valueAnimator.getAnimatedFraction()));
        this.f223736d.f219954e.invalidate();
    }
}
