package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import gy3.C87413o;
import jy3.C117370c;
import jy3.C88045a;
import kotlin.Metadata;
import ny3.C89104m;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010H\u001a\u00020G\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR+\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR+\u0010 \u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR+\u0010$\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR+\u0010+\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8F@FX\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010/\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8F@FX\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R+\u00103\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8F@FX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u001b\u00109\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010=R\u001b\u0010D\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u0010=R\u0014\u0010F\u001a\u00020%8BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010(¨\u0006M"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandCircleProgressView;", "Landroid/view/View;", "", "d", "I", "getTransitionTimingMs", "()I", "setTransitionTimingMs", "(I)V", "transitionTimingMs", "", "e", "J", "getAnimDuration", "()J", "setAnimDuration", "(J)V", "animDuration", "value", "f", "getProgress", "setProgress", "progress", "<set-?>", "g", "Ljy3/c;", "getCircleColor", "setCircleColor", "circleColor", "h", "getDotColor", "setDotColor", "dotColor", "i", "getProgressColor", "setProgressColor", "progressColor", "", "j", "getCircleStrokeWidth", "()F", "setCircleStrokeWidth", "(F)V", "circleStrokeWidth", "n", "getDotWidth", "setDotWidth", "dotWidth", "o", "getProgressWidth", "setProgressWidth", "progressWidth", "Landroid/animation/ValueAnimator;", "p", "Lrx3/g;", "getAnimator", "()Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/Paint;", "q", "getCirclePaint", "()Landroid/graphics/Paint;", "circlePaint", "r", "getDotPaint", "dotPaint", "s", "getProgressPaint", "progressPaint", "getRadius", "radius", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView */
public final class AppBrandCircleProgressView extends View {

    /* renamed from: z */
    public static final /* synthetic */ C89104m<Object>[] f345392z = {C24560g0.m30726b(new C24570s(AppBrandCircleProgressView.class, "circleColor", "getCircleColor()I", 0)), C24560g0.m30726b(new C24570s(AppBrandCircleProgressView.class, "dotColor", "getDotColor()I", 0)), C24560g0.m30726b(new C24570s(AppBrandCircleProgressView.class, "progressColor", "getProgressColor()I", 0)), C24560g0.m30726b(new C24570s(AppBrandCircleProgressView.class, "circleStrokeWidth", "getCircleStrokeWidth()F", 0)), C24560g0.m30726b(new C24570s(AppBrandCircleProgressView.class, "dotWidth", "getDotWidth()F", 0)), C24560g0.m30726b(new C24570s(AppBrandCircleProgressView.class, "progressWidth", "getProgressWidth()F", 0))};

    /* renamed from: d */
    public int f345393d = 2000;

    /* renamed from: e */
    public long f345394e = 1500;

    /* renamed from: f */
    public int f345395f;

    /* renamed from: g */
    public final C117370c f345396g = new C115260e(-7829368, this);

    /* renamed from: h */
    public final C117370c f345397h = new C115261f(-7829368, this);

    /* renamed from: i */
    public final C117370c f345398i = new C115262g(-16711936, this);

    /* renamed from: j */
    public final C117370c f345399j;

    /* renamed from: n */
    public final C117370c f345400n;

    /* renamed from: o */
    public final C117370c f345401o;

    /* renamed from: p */
    public final C13601g f345402p;

    /* renamed from: q */
    public final C13601g f345403q;

    /* renamed from: r */
    public final C13601g f345404r;

    /* renamed from: s */
    public final C13601g f345405s;

    /* renamed from: t */
    public long f345406t;

    /* renamed from: u */
    public float f345407u;

    /* renamed from: v */
    public float f345408v;

    /* renamed from: w */
    public float f345409w;

    /* renamed from: x */
    public int f345410x;

    /* renamed from: y */
    public float f345411y;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$a */
    public static final class C115256a extends C87413o implements C32224a<ValueAnimator> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCircleProgressView f345412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115256a(AppBrandCircleProgressView appBrandCircleProgressView) {
            super(0);
            this.f345412d = appBrandCircleProgressView;
        }

        public Object invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-1.5707964f, 4.712389f});
            AppBrandCircleProgressView appBrandCircleProgressView = this.f345412d;
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(appBrandCircleProgressView.getAnimDuration());
            ofFloat.setInterpolator(new LinearInterpolator());
            return ofFloat;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$b */
    public static final class C115257b extends C87413o implements C32224a<Paint> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCircleProgressView f345413d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115257b(AppBrandCircleProgressView appBrandCircleProgressView) {
            super(0);
            this.f345413d = appBrandCircleProgressView;
        }

        public Object invoke() {
            Paint paint = new Paint(1);
            AppBrandCircleProgressView appBrandCircleProgressView = this.f345413d;
            paint.setStrokeWidth(appBrandCircleProgressView.getCircleStrokeWidth());
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(appBrandCircleProgressView.getCircleColor());
            return paint;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$c */
    public static final class C115258c extends C87413o implements C32224a<Paint> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCircleProgressView f345414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115258c(AppBrandCircleProgressView appBrandCircleProgressView) {
            super(0);
            this.f345414d = appBrandCircleProgressView;
        }

        public Object invoke() {
            Paint paint = new Paint(1);
            AppBrandCircleProgressView appBrandCircleProgressView = this.f345414d;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(appBrandCircleProgressView.getDotWidth());
            return paint;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$d */
    public static final class C115259d extends C87413o implements C32224a<Paint> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCircleProgressView f345415d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115259d(AppBrandCircleProgressView appBrandCircleProgressView) {
            super(0);
            this.f345415d = appBrandCircleProgressView;
        }

        public Object invoke() {
            Paint paint = new Paint(1);
            AppBrandCircleProgressView appBrandCircleProgressView = this.f345415d;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(appBrandCircleProgressView.getProgressWidth());
            paint.setColor(appBrandCircleProgressView.getProgressColor());
            return paint;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$e */
    public static final class C115260e extends C88045a<Integer> {

        /* renamed from: b */
        public final /* synthetic */ AppBrandCircleProgressView f345416b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115260e(Object obj, AppBrandCircleProgressView appBrandCircleProgressView) {
            super(obj);
            this.f345416b = appBrandCircleProgressView;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Integer num, Integer num2) {
            C87412m.m108594g(mVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            this.f345416b.getCirclePaint().setColor(intValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$f */
    public static final class C115261f extends C88045a<Integer> {

        /* renamed from: b */
        public final /* synthetic */ AppBrandCircleProgressView f345417b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115261f(Object obj, AppBrandCircleProgressView appBrandCircleProgressView) {
            super(obj);
            this.f345417b = appBrandCircleProgressView;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Integer num, Integer num2) {
            C87412m.m108594g(mVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            this.f345417b.getDotPaint().setColor(intValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$g */
    public static final class C115262g extends C88045a<Integer> {

        /* renamed from: b */
        public final /* synthetic */ AppBrandCircleProgressView f345418b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115262g(Object obj, AppBrandCircleProgressView appBrandCircleProgressView) {
            super(obj);
            this.f345418b = appBrandCircleProgressView;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Integer num, Integer num2) {
            C87412m.m108594g(mVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            this.f345418b.getProgressPaint().setColor(intValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$h */
    public static final class C115263h extends C88045a<Float> {

        /* renamed from: b */
        public final /* synthetic */ AppBrandCircleProgressView f345419b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115263h(Object obj, AppBrandCircleProgressView appBrandCircleProgressView) {
            super(obj);
            this.f345419b = appBrandCircleProgressView;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Float f, Float f2) {
            C87412m.m108594g(mVar, "property");
            float floatValue = f2.floatValue();
            f.floatValue();
            this.f345419b.getCirclePaint().setStrokeWidth(floatValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$i */
    public static final class C115264i extends C88045a<Float> {

        /* renamed from: b */
        public final /* synthetic */ AppBrandCircleProgressView f345420b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115264i(Object obj, AppBrandCircleProgressView appBrandCircleProgressView) {
            super(obj);
            this.f345420b = appBrandCircleProgressView;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Float f, Float f2) {
            C87412m.m108594g(mVar, "property");
            float floatValue = f2.floatValue();
            f.floatValue();
            this.f345420b.getDotPaint().setStrokeWidth(floatValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$j */
    public static final class C115265j extends C88045a<Float> {

        /* renamed from: b */
        public final /* synthetic */ AppBrandCircleProgressView f345421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115265j(Object obj, AppBrandCircleProgressView appBrandCircleProgressView) {
            super(obj);
            this.f345421b = appBrandCircleProgressView;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Float f, Float f2) {
            C87412m.m108594g(mVar, "property");
            float floatValue = f2.floatValue();
            f.floatValue();
            this.f345421b.getProgressPaint().setStrokeWidth(floatValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView$k */
    public static final class C115266k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCircleProgressView f345422d;

        public C115266k(AppBrandCircleProgressView appBrandCircleProgressView) {
            this.f345422d = appBrandCircleProgressView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f345422d.f345406t = valueAnimator.getCurrentPlayTime();
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            AppBrandCircleProgressView appBrandCircleProgressView = this.f345422d;
            double d = (double) floatValue;
            appBrandCircleProgressView.f345407u = appBrandCircleProgressView.getRadius() * ((float) Math.cos(d));
            AppBrandCircleProgressView appBrandCircleProgressView2 = this.f345422d;
            appBrandCircleProgressView2.f345408v = appBrandCircleProgressView2.getRadius() * ((float) Math.sin(d));
            AppBrandCircleProgressView appBrandCircleProgressView3 = this.f345422d;
            appBrandCircleProgressView3.f345409w = (float) (((double) (floatValue * 360.0f)) / 6.283185307179586d);
            appBrandCircleProgressView3.invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandCircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "ctx");
        Float valueOf = Float.valueOf(1.0f);
        this.f345399j = new C115263h(valueOf, this);
        this.f345400n = new C115264i(valueOf, this);
        this.f345401o = new C115265j(Float.valueOf(3.0f), this);
        this.f345402p = C36568h.m40985a(new C115256a(this));
        this.f345403q = C36568h.m40985a(new C115257b(this));
        this.f345404r = C36568h.m40985a(new C115258c(this));
        this.f345405s = C36568h.m40985a(new C115259d(this));
        this.f345410x = 1;
        this.f345411y = (float) this.f345395f;
    }

    private final ValueAnimator getAnimator() {
        Object value = ((C36570n) this.f345402p).getValue();
        C87412m.m108593f(value, "<get-animator>(...)");
        return (ValueAnimator) value;
    }

    /* access modifiers changed from: private */
    public final Paint getCirclePaint() {
        return (Paint) ((C36570n) this.f345403q).getValue();
    }

    /* access modifiers changed from: private */
    public final Paint getDotPaint() {
        return (Paint) ((C36570n) this.f345404r).getValue();
    }

    /* access modifiers changed from: private */
    public final Paint getProgressPaint() {
        return (Paint) ((C36570n) this.f345405s).getValue();
    }

    /* access modifiers changed from: private */
    public final float getRadius() {
        if (!isLaidOut()) {
            return 0.0f;
        }
        float f = (float) 2;
        return Math.min(((float) getMeasuredHeight()) - (Math.max(getProgressWidth(), getDotWidth()) * f), ((float) getMeasuredWidth()) - (f * Math.max(getProgressWidth(), getDotWidth()))) / 2.0f;
    }

    /* renamed from: e */
    public final void mo175030e() {
        this.f345393d = 0;
        getAnimator().setDuration(1000);
        this.f345410x = 5;
    }

    /* renamed from: f */
    public final void mo175031f() {
        this.f345406t = 0;
        getAnimator().addUpdateListener(new C115266k(this));
        getAnimator().start();
    }

    public final long getAnimDuration() {
        return this.f345394e;
    }

    public final int getCircleColor() {
        return ((Number) ((C88045a) this.f345396g).mo122486c(this, f345392z[0])).intValue();
    }

    public final float getCircleStrokeWidth() {
        return ((Number) ((C88045a) this.f345399j).mo122486c(this, f345392z[3])).floatValue();
    }

    public final int getDotColor() {
        return ((Number) ((C88045a) this.f345397h).mo122486c(this, f345392z[1])).intValue();
    }

    public final float getDotWidth() {
        return ((Number) ((C88045a) this.f345400n).mo122486c(this, f345392z[4])).floatValue();
    }

    public final int getProgress() {
        return this.f345395f;
    }

    public final int getProgressColor() {
        return ((Number) ((C88045a) this.f345398i).mo122486c(this, f345392z[2])).intValue();
    }

    public final float getProgressWidth() {
        return ((Number) ((C88045a) this.f345401o).mo122486c(this, f345392z[5])).floatValue();
    }

    public final int getTransitionTimingMs() {
        return this.f345393d;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAnimator().cancel();
        getAnimator().removeAllUpdateListeners();
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        boolean z = false;
        if (!(this.f345407u == 0.0f)) {
            if (this.f345408v == 0.0f) {
                z = true;
            }
            if (!z) {
                float measuredWidth = (float) getMeasuredWidth();
                float measuredHeight = (float) getMeasuredHeight();
                canvas.drawCircle(measuredWidth / 2.0f, measuredHeight / 2.0f, getRadius(), getCirclePaint());
                if (this.f345406t <= ((long) this.f345393d)) {
                    canvas.drawCircle(this.f345407u + getRadius() + Math.max(getProgressWidth(), getDotWidth()), this.f345408v + getRadius() + Math.max(getProgressWidth(), getDotWidth()), getDotWidth(), getDotPaint());
                    return;
                }
                float f = this.f345411y;
                if (f < ((float) this.f345395f)) {
                    this.f345411y = f + ((float) this.f345410x);
                } else if (f <= 80.0f) {
                    this.f345411y = f + 0.5f;
                }
                float f2 = (float) 2;
                float f3 = measuredWidth / f2;
                float f4 = measuredHeight / f2;
                canvas.drawArc(f3 - getRadius(), f4 - getRadius(), getRadius() + f3, getRadius() + f4, this.f345409w, (this.f345411y * ((float) v2helper.VOIP_ENC_HEIGHT_LV1)) / 100.0f, false, getProgressPaint());
                if (this.f345411y >= 100.0f) {
                    getAnimator().cancel();
                    getAnimator().removeAllUpdateListeners();
                }
            }
        }
    }

    public final void setAnimDuration(long j) {
        this.f345394e = j;
    }

    public final void setCircleColor(int i) {
        ((C88045a) this.f345396g).mo122487d(this, f345392z[0], Integer.valueOf(i));
    }

    public final void setCircleStrokeWidth(float f) {
        ((C88045a) this.f345399j).mo122487d(this, f345392z[3], Float.valueOf(f));
    }

    public final void setDotColor(int i) {
        ((C88045a) this.f345397h).mo122487d(this, f345392z[1], Integer.valueOf(i));
    }

    public final void setDotWidth(float f) {
        ((C88045a) this.f345400n).mo122487d(this, f345392z[4], Float.valueOf(f));
    }

    public final void setProgress(int i) {
        Log.m105918d("AppBrandCircleProgressView", "hash = " + hashCode() + " progress = " + i);
        this.f345395f = i;
    }

    public final void setProgressColor(int i) {
        ((C88045a) this.f345398i).mo122487d(this, f345392z[2], Integer.valueOf(i));
    }

    public final void setProgressWidth(float f) {
        ((C88045a) this.f345401o).mo122487d(this, f345392z[5], Float.valueOf(f));
    }

    public final void setTransitionTimingMs(int i) {
        this.f345393d = i;
    }
}
