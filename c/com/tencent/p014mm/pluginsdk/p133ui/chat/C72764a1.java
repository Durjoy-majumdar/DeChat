package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.a1 */
public final class C72764a1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C72852z0 f212095d;

    /* renamed from: e */
    public final /* synthetic */ int f212096e;

    /* renamed from: f */
    public final /* synthetic */ int f212097f;

    /* renamed from: g */
    public final /* synthetic */ int f212098g;

    /* renamed from: h */
    public final /* synthetic */ int f212099h;

    /* renamed from: i */
    public final /* synthetic */ int f212100i;

    /* renamed from: j */
    public final /* synthetic */ int f212101j;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.a1$a */
    public static final class C72765a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ int f212102a;

        /* renamed from: b */
        public final /* synthetic */ float f212103b;

        /* renamed from: c */
        public final /* synthetic */ int f212104c;

        /* renamed from: d */
        public final /* synthetic */ int f212105d;

        /* renamed from: e */
        public final /* synthetic */ int f212106e;

        /* renamed from: f */
        public final /* synthetic */ int f212107f;

        /* renamed from: g */
        public final /* synthetic */ int f212108g;

        /* renamed from: h */
        public final /* synthetic */ float f212109h;

        /* renamed from: i */
        public final /* synthetic */ float f212110i;

        /* renamed from: j */
        public final /* synthetic */ C72852z0 f212111j;

        public C72765a(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, float f3, C72852z0 z0Var) {
            this.f212102a = i;
            this.f212103b = f;
            this.f212104c = i2;
            this.f212105d = i3;
            this.f212106e = i4;
            this.f212107f = i5;
            this.f212108g = i6;
            this.f212109h = f2;
            this.f212110i = f3;
            this.f212111j = z0Var;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            int width = view.getWidth();
            int height = view.getHeight();
            float f = (float) 0;
            float f2 = this.f212103b;
            float f3 = (((float) (this.f212102a - 0)) * f2) + f;
            float f4 = f + (((float) (this.f212104c - 0)) * f2);
            float f5 = ((float) width) + (((float) (this.f212105d - width)) * f2);
            float f6 = ((float) height) + (((float) (this.f212106e - height)) * f2);
            int i = this.f212107f;
            float f7 = ((float) i) + (((float) (this.f212108g - i)) * f2);
            float f8 = this.f212109h;
            outline.setRoundRect((int) f3, (int) f4, (int) f5, (int) f6, f7);
            Object value = ((C36570n) this.f212111j.f212324h).getValue();
            C87412m.m108593f(value, "<get-vMask>(...)");
            View view2 = (View) value;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f8 + ((this.f212110i - f8) * f2)));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animClose$2$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public C72764a1(C72852z0 z0Var, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        this.f212095d = z0Var;
        this.f212096e = i;
        this.f212097f = i2;
        this.f212098g = i3;
        this.f212099h = i4;
        this.f212100i = i5;
        this.f212101j = i6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f212095d.mo100693f().setOutlineProvider(new C72765a(this.f212096e, valueAnimator.getAnimatedFraction(), this.f212097f, this.f212098g, this.f212099h, this.f212100i, this.f212101j, 0.5f, 0.0f, this.f212095d));
    }
}
