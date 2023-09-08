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

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.c1 */
public final class C72773c1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C72852z0 f212119d;

    /* renamed from: e */
    public final /* synthetic */ int f212120e;

    /* renamed from: f */
    public final /* synthetic */ int f212121f;

    /* renamed from: g */
    public final /* synthetic */ int f212122g;

    /* renamed from: h */
    public final /* synthetic */ int f212123h;

    /* renamed from: i */
    public final /* synthetic */ int f212124i;

    /* renamed from: j */
    public final /* synthetic */ int f212125j;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.c1$a */
    public static final class C72774a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ int f212126a;

        /* renamed from: b */
        public final /* synthetic */ float f212127b;

        /* renamed from: c */
        public final /* synthetic */ int f212128c;

        /* renamed from: d */
        public final /* synthetic */ int f212129d;

        /* renamed from: e */
        public final /* synthetic */ int f212130e;

        /* renamed from: f */
        public final /* synthetic */ int f212131f;

        /* renamed from: g */
        public final /* synthetic */ int f212132g;

        /* renamed from: h */
        public final /* synthetic */ float f212133h;

        /* renamed from: i */
        public final /* synthetic */ float f212134i;

        /* renamed from: j */
        public final /* synthetic */ C72852z0 f212135j;

        public C72774a(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, float f3, C72852z0 z0Var) {
            this.f212126a = i;
            this.f212127b = f;
            this.f212128c = i2;
            this.f212129d = i3;
            this.f212130e = i4;
            this.f212131f = i5;
            this.f212132g = i6;
            this.f212133h = f2;
            this.f212134i = f3;
            this.f212135j = z0Var;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            int i = this.f212126a;
            float f = this.f212127b;
            float f2 = ((float) i) + (((float) (0 - i)) * f);
            int i2 = this.f212128c;
            float f3 = ((float) i2) + (((float) (0 - i2)) * f);
            float width = ((float) this.f212129d) + (((float) (view.getWidth() - this.f212129d)) * this.f212127b);
            float f4 = this.f212127b;
            float height = ((float) this.f212130e) + (((float) (view.getHeight() - this.f212130e)) * f4);
            int i3 = this.f212131f;
            float f5 = ((float) i3) + (((float) (this.f212132g - i3)) * f4);
            float f6 = this.f212133h;
            outline.setRoundRect((int) f2, (int) f3, (int) width, (int) height, f5);
            Object value = ((C36570n) this.f212135j.f212324h).getValue();
            C87412m.m108593f(value, "<get-vMask>(...)");
            View view2 = (View) value;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f6 + ((this.f212134i - f6) * f4)));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public C72773c1(C72852z0 z0Var, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        this.f212119d = z0Var;
        this.f212120e = i;
        this.f212121f = i2;
        this.f212122g = i3;
        this.f212123h = i4;
        this.f212124i = i5;
        this.f212125j = i6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f212119d.mo100693f().setOutlineProvider(new C72774a(this.f212120e, valueAnimator.getAnimatedFraction(), this.f212121f, this.f212122g, this.f212123h, this.f212124i, this.f212125j, 0.0f, 0.5f, this.f212119d));
    }
}
