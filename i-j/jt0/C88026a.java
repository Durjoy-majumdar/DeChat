package jt0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import gy3.C87412m;
import jt0.C88029d;

/* renamed from: jt0.a */
public class C88026a implements C88029d {

    /* renamed from: b */
    public final AppBrandRuntimeWC f254635b;

    /* renamed from: c */
    public int f254636c;

    /* renamed from: d */
    public int f254637d;

    /* renamed from: jt0.a$a */
    public static final class C88027a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C88026a f254638d;

        /* renamed from: e */
        public final /* synthetic */ int f254639e;

        /* renamed from: f */
        public final /* synthetic */ int f254640f;

        /* renamed from: g */
        public final /* synthetic */ long f254641g;

        /* renamed from: h */
        public final /* synthetic */ View f254642h;

        public C88027a(C88026a aVar, int i, int i2, long j, View view) {
            this.f254638d = aVar;
            this.f254639e = i;
            this.f254640f = i2;
            this.f254641g = j;
            this.f254642h = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                this.f254638d.mo122477h(this.f254639e, this.f254640f, this.f254641g, valueAnimator);
                C88026a aVar = this.f254638d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                aVar.f254637d = ((Integer) animatedValue).intValue();
                View view = this.f254642h;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
    }

    public C88026a(AppBrandRuntimeWC appBrandRuntimeWC, int i) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        this.f254635b = appBrandRuntimeWC;
        this.f254636c = i;
    }

    /* renamed from: a */
    public int mo122470a() {
        return Color.alpha(this.f254636c);
    }

    /* renamed from: b */
    public void mo122471b() {
    }

    /* renamed from: c */
    public int mo122472c() {
        return this.f254637d;
    }

    /* renamed from: d */
    public void mo122473d() {
        this.f254636c = Color.argb(0, Color.red(this.f254636c), Color.green(this.f254636c), Color.blue(this.f254636c));
        this.f254637d = 0;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.ValueAnimator mo122474e(int r10, int r11, long r12) {
        /*
            r9 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r10
            r1 = 1
            r0[r1] = r11
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r0.setDuration(r12)
            android.view.View r1 = r9.mo122476g()
            if (r1 == 0) goto L_0x001b
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r8 = r1
            android.view.View r8 = (android.view.View) r8
            jt0.a$a r1 = new jt0.a$a
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r8)
            r0.addUpdateListener(r1)
            r0.start()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "animator["
            r10.append(r11)
            r10.append(r0)
            r11 = 93
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.HalfScreenBackgroundCommonRenderer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jt0.C88026a.mo122474e(int, int, long):android.animation.ValueAnimator");
    }

    /* renamed from: f */
    public void mo122475f(Canvas canvas, View view) {
        int i = this.f254637d;
        int i2 = this.f254636c;
        if (canvas != null) {
            ColorDrawable colorDrawable = new ColorDrawable(Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2)));
            colorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            colorDrawable.draw(canvas);
        }
    }

    /* renamed from: g */
    public View mo122476g() {
        return this.f254635b.f238153r;
    }

    /* renamed from: h */
    public void mo122477h(int i, int i2, long j, ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
    }

    public void reset() {
        this.f254637d = 0;
    }

    public C88029d.C88032b type() {
        return C88029d.C88032b.TYPE_NORMAL;
    }
}
