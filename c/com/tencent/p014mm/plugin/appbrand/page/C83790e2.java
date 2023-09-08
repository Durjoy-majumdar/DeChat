package com.tencent.p014mm.plugin.appbrand.page;

import aj0.C79583b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.page.e2 */
public final class C83790e2 extends RelativeLayout {

    /* renamed from: f */
    public static final C83792f f244632f = new C83792f((C8480h) null);

    /* renamed from: g */
    public static final C13601g<Integer> f244633g = C36568h.m40985a(C1947e.f11841d);

    /* renamed from: h */
    public static final C13601g<Integer> f244634h = C36568h.m40985a(C1945c.f11839d);

    /* renamed from: i */
    public static final C13601g<Float> f244635i = C36568h.m40985a(C83791a.f244640d);

    /* renamed from: j */
    public static final C13601g<Integer> f244636j = C36568h.m40985a(C1946d.f11840d);

    /* renamed from: n */
    public static final C13601g<Float> f244637n = C36568h.m40985a(C1944b.f11838d);

    /* renamed from: d */
    public View.OnClickListener f244638d;

    /* renamed from: e */
    public C79583b f244639e;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$b */
    public static final class C1944b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C1944b f11838d = new C1944b();

        public C1944b() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf((float) MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4125t5));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$c */
    public static final class C1945c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C1945c f11839d = new C1945c();

        public C1945c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4123t3));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$d */
    public static final class C1946d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C1946d f11840d = new C1946d();

        public C1946d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4122t2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$e */
    public static final class C1947e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C1947e f11841d = new C1947e();

        public C1947e() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4124t4));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$a */
    public static final class C83791a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C83791a f244640d = new C83791a();

        public C83791a() {
            super(0);
        }

        public Object invoke() {
            C83792f fVar = C83790e2.f244632f;
            return Float.valueOf(((float) C83792f.m103044c(fVar)) / ((float) C83792f.m103043b(fVar)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$f */
    public static final class C83792f {
        public C83792f(C8480h hVar) {
        }

        /* renamed from: a */
        public static final float m103042a(C83792f fVar) {
            fVar.getClass();
            return ((Number) ((C36570n) C83790e2.f244637n).getValue()).floatValue();
        }

        /* renamed from: b */
        public static final int m103043b(C83792f fVar) {
            fVar.getClass();
            return ((Number) ((C36570n) C83790e2.f244634h).getValue()).intValue();
        }

        /* renamed from: c */
        public static final int m103044c(C83792f fVar) {
            fVar.getClass();
            return ((Number) ((C36570n) C83790e2.f244633g).getValue()).intValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$g */
    public static final class C83793g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ GradientDrawable f244641d;

        /* renamed from: e */
        public final /* synthetic */ C83790e2 f244642e;

        public C83793g(GradientDrawable gradientDrawable, C83790e2 e2Var) {
            this.f244641d = gradientDrawable;
            this.f244642e = e2Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f244641d.setCornerRadii(new float[]{floatValue, floatValue, floatValue, floatValue, 0.0f, 0.0f, 0.0f, 0.0f});
            this.f244642e.f244639e.f233373e.setBackground(this.f244641d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$h */
    public static final class C83794h extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ GradientDrawable f244643d;

        /* renamed from: e */
        public final /* synthetic */ C83790e2 f244644e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f244645f;

        public C83794h(GradientDrawable gradientDrawable, C83790e2 e2Var, C32224a<C13598b0> aVar) {
            this.f244643d = gradientDrawable;
            this.f244644e = e2Var;
            this.f244645f = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            float a = C83792f.m103042a(C83790e2.f244632f);
            this.f244643d.setCornerRadii(new float[]{a, a, a, a, 0.0f, 0.0f, 0.0f, 0.0f});
            this.f244644e.f244639e.f233373e.setBackground(this.f244643d);
            this.f244645f.invoke();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$i */
    public static final class C83795i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C83790e2 f244646d;

        public C83795i(C83790e2 e2Var) {
            this.f244646d = e2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter$doSetAppInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View.OnClickListener onClickListener = this.f244646d.f244638d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter$doSetAppInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.e2$j */
    public static final class C83796j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C83790e2 f244647d;

        public C83796j(C83790e2 e2Var) {
            this.f244647d = e2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter$doSetAppInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View.OnClickListener onClickListener = this.f244647d.f244638d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter$doSetAppInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83790e2(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6472fs, this, false);
        addView(inflate);
        int i = C0966R.C0970id.jlo;
        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jlo);
        if (textView != null) {
            i = C0966R.C0970id.jlp;
            ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.jlp);
            if (imageView != null) {
                i = C0966R.C0970id.jlq;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.jlq);
                if (linearLayout != null) {
                    i = C0966R.C0970id.jlr;
                    TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jlr);
                    if (textView2 != null) {
                        i = C0966R.C0970id.jls;
                        TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jls);
                        if (textView3 != null) {
                            i = C0966R.C0970id.jlt;
                            ImageView imageView2 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.jlt);
                            if (imageView2 != null) {
                                i = C0966R.C0970id.jlu;
                                RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.jlu);
                                if (relativeLayout != null) {
                                    i = C0966R.C0970id.jlv;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.jlv);
                                    if (constraintLayout != null) {
                                        i = C0966R.C0970id.jlw;
                                        View a = C10462b.m10395a(inflate, C0966R.C0970id.jlw);
                                        if (a != null) {
                                            i = C0966R.C0970id.jlx;
                                            TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jlx);
                                            if (textView4 != null) {
                                                i = C0966R.C0970id.jly;
                                                ImageView imageView3 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.jly);
                                                if (imageView3 != null) {
                                                    i = C0966R.C0970id.jlz;
                                                    TextView textView5 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jlz);
                                                    if (textView5 != null) {
                                                        i = C0966R.C0970id.f359214jm0;
                                                        TextView textView6 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359214jm0);
                                                        if (textView6 != null) {
                                                            i = C0966R.C0970id.f359215jm1;
                                                            ImageView imageView4 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.f359215jm1);
                                                            if (imageView4 != null) {
                                                                i = C0966R.C0970id.f359216jm2;
                                                                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.f359216jm2);
                                                                if (linearLayout2 != null) {
                                                                    i = C0966R.C0970id.f359217jm3;
                                                                    LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.f359217jm3);
                                                                    if (linearLayout3 != null) {
                                                                        this.f244639e = new C79583b((RelativeLayout) inflate, textView, imageView, linearLayout, textView2, textView3, imageView2, relativeLayout, constraintLayout, a, textView4, imageView3, textView5, textView6, imageView4, linearLayout2, linearLayout3);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public final void mo116258a(boolean z, long j, C32224a<C13598b0> aVar) {
        float f = 0.0f;
        float a = z ? C83792f.m103042a(f244632f) : 0.0f;
        if (!z) {
            f = C83792f.m103042a(f244632f);
        }
        Drawable background = this.f244639e.f233373e.getBackground();
        C87412m.m108592e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{a, f});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addUpdateListener(new C83793g(gradientDrawable, this));
        ofFloat.addListener(new C83794h(gradientDrawable, this, aVar));
        ofFloat.start();
    }

    /* renamed from: b */
    public final void mo116259b(boolean z, String str, String str2, String str3, boolean z2, boolean z3) {
        String str4 = str3;
        boolean z4 = z && this.f244639e.f233373e.getVisibility() == 0;
        boolean z5 = !z;
        this.f244639e.f233381m.setVisibility(z ? 0 : 8);
        this.f244639e.f233373e.setVisibility((!z || z4) ? 0 : 8);
        C79583b bVar = this.f244639e;
        ImageView imageView = z ? bVar.f233377i : bVar.f233370b;
        C87412m.m108593f(imageView, "if (isNormalState) uiBin…ooterHighlightStateIconIv");
        C79583b bVar2 = this.f244639e;
        TextView textView = z ? bVar2.f233379k : bVar2.f233371c;
        C87412m.m108593f(textView, "if (isNormalState) uiBin…ooterHighlightStateNameTv");
        C79583b bVar3 = this.f244639e;
        TextView textView2 = z ? bVar3.f233376h : bVar3.f233369a;
        C87412m.m108593f(textView2, "if (isNormalState) uiBin…lightStateDebugTypeDescTv");
        C79583b bVar4 = this.f244639e;
        ImageView imageView2 = z ? bVar4.f233380l : bVar4.f233372d;
        C87412m.m108593f(imageView2, "if (isNormalState) uiBin…rHighlightStateOriginalIv");
        String str5 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122786b(imageView, str, C88393a.m110230a(), C88431k.f255437d);
        textView.setText(str2);
        if (str4 == null || str3.length() == 0) {
            textView2.setVisibility(8);
            imageView2.setVisibility(z3 ? 0 : 8);
        } else {
            textView2.setText(str4);
            textView2.setVisibility(0);
            imageView2.setVisibility(8);
        }
        if (z) {
            this.f244639e.f233378j.setOnClickListener(new C83795i(this));
            this.f244639e.f233378j.setText(z2 ? C0966R.string.f360126a91 : C0966R.string.f360125a90);
        } else {
            this.f244639e.f233373e.setOnClickListener(new C83796j(this));
        }
        if (z5) {
            ViewGroup.LayoutParams layoutParams = this.f244639e.f233381m.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            C83792f fVar = f244632f;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (C83792f.m103043b(fVar) - C83792f.m103044c(fVar)) - ((Number) ((C36570n) f244636j).getValue()).intValue();
            this.f244639e.f233381m.setVisibility(0);
            this.f244639e.f233374f.setVisibility(4);
            RelativeLayout relativeLayout = this.f244639e.f233373e;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, ((Number) ((C36570n) f244635i).getValue()).floatValue(), 1.0f, (float) C85875k4.m106196n(0.5f), (float) C83792f.m103043b(fVar));
            scaleAnimation.setDuration(150);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            relativeLayout.startAnimation(scaleAnimation);
            mo116258a(false, 150, new C83802f2(this));
        } else if (z4) {
            ViewGroup.LayoutParams layoutParams2 = this.f244639e.f233381m.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            C83792f fVar2 = f244632f;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (C83792f.m103043b(fVar2) - C83792f.m103044c(fVar2)) - ((Number) ((C36570n) f244636j).getValue()).intValue();
            this.f244639e.f233374f.setVisibility(8);
            RelativeLayout relativeLayout2 = this.f244639e.f233373e;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 1.0f, 1.0f, ((Number) ((C36570n) f244635i).getValue()).floatValue(), (float) C85875k4.m106196n(0.5f), (float) C83792f.m103043b(fVar2));
            scaleAnimation2.setDuration(200);
            scaleAnimation2.setInterpolator(new DecelerateInterpolator());
            relativeLayout2.startAnimation(scaleAnimation2);
            mo116258a(true, 200, new C83815h2(this));
        }
    }

    public final void setJumpBtnOnClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f244638d = onClickListener;
    }
}
