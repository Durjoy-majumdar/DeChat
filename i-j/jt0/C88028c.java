package jt0;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import gy3.C87412m;
import jt0.C88029d;

/* renamed from: jt0.c */
public final class C88028c extends C88026a {

    /* renamed from: e */
    public float f254643e;

    /* renamed from: f */
    public Bitmap f254644f;

    /* renamed from: g */
    public volatile boolean f254645g;

    /* renamed from: h */
    public volatile boolean f254646h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88028c(AppBrandRuntimeWC appBrandRuntimeWC, int i) {
        super(appBrandRuntimeWC, i);
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
    }

    /* renamed from: b */
    public void mo122471b() {
        C83231l.C83235e d = C83231l.m102143d(this.f254635b.f238147j);
        if (d != C83231l.C83235e.HOME_PRESSED && d != C83231l.C83235e.RECENT_APPS_PRESSED && d != C83231l.C83235e.LAUNCH_NATIVE_PAGE && d != C83231l.C83235e.LAUNCH_MINI_PROGRAM) {
            Bitmap bitmap = this.f254644f;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f254644f = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.tencent.mm.plugin.appbrand.AppBrandRuntime] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122475f(android.graphics.Canvas r14, android.view.View r15) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x011a
            android.graphics.Bitmap r0 = r13.f254644f
            r1 = 0
            if (r0 == 0) goto L_0x0048
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            float r2 = r13.f254643e
            r3 = 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r2 = r2 * r3
            int r2 = (int) r2
            r0.setAlpha(r2)
            android.graphics.Bitmap r2 = r13.f254644f
            gy3.C87412m.m108591d(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            android.graphics.Bitmap r4 = r13.f254644f
            gy3.C87412m.m108591d(r4)
            int r4 = r4.getWidth()
            android.graphics.Bitmap r5 = r13.f254644f
            gy3.C87412m.m108591d(r5)
            int r5 = r5.getHeight()
            r3.<init>(r1, r1, r4, r5)
            android.graphics.RectF r1 = new android.graphics.RectF
            int r4 = r14.getWidth()
            float r4 = (float) r4
            int r5 = r14.getHeight()
            float r5 = (float) r5
            r6 = 0
            r1.<init>(r6, r6, r4, r5)
            r14.drawBitmap(r2, r3, r1, r0)
            goto L_0x011a
        L_0x0048:
            boolean r0 = r13.f254645g
            if (r0 != 0) goto L_0x011a
            boolean r0 = r13.f254646h
            if (r0 != 0) goto L_0x011a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r13.f254635b
            java.lang.String r2 = "embedWxa"
            gy3.C87412m.m108594g(r0, r2)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r0.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r2.f234815R0
            java.lang.String r3 = "embedWxa.initConfig.halfScreenConfig"
            gy3.C87412m.m108593f(r2, r3)
            boolean r3 = r2.mo76931c()
            r4 = 1
            if (r3 == 0) goto L_0x0071
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r2 = r2.f157932C
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r3 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
            if (r2 != r3) goto L_0x0071
            r2 = 1
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r3 = 0
            if (r2 == 0) goto L_0x0087
            com.tencent.mm.plugin.appbrand.e3 r2 = r0.f238142e
            if (r2 != 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            boolean r5 = r2.mo113124e(r0)
            if (r5 == 0) goto L_0x0087
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r2.mo113136o(r0)
            r3 = r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r3
        L_0x0087:
            if (r3 == 0) goto L_0x011a
            r13.f254645g = r4
            android.graphics.Bitmap r0 = r3.mo113173D1()
            vp3.b r2 = new vp3.b
            r2.<init>()
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r3 = 1058642330(0x3f19999a, float:0.6)
            r10.postScale(r3, r3)
            r6 = 0
            r7 = 0
            int r8 = r0.getWidth()
            int r9 = r0.getHeight()
            r11 = 1
            r5 = r0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r5 = "resizeBmp"
            gy3.C87412m.m108593f(r3, r5)
            r2.mo89891b(r3)
            int r5 = r14.getWidth()
            int r6 = r14.getHeight()
            r2.f189363b = r5
            r2.f189364c = r6
            vp3.c r5 = r2.f189366e
            com.tencent.mm.xeffect.effect.EffectManager r5 = r5.f334033b
            rr3.b r5 = r5.mo154922b()
            r6 = 1073741824(0x40000000, float:2.0)
            r5.mo162186d(r6)
            long r6 = java.lang.System.currentTimeMillis()
            jt0.b r12 = new jt0.b     // Catch:{ UnsatisfiedLinkError -> 0x00e3 }
            r5 = r12
            r8 = r13
            r9 = r15
            r10 = r0
            r11 = r3
            r5.<init>(r6, r8, r9, r10, r11)     // Catch:{ UnsatisfiedLinkError -> 0x00e3 }
            r2.mo89890a(r12)     // Catch:{ UnsatisfiedLinkError -> 0x00e3 }
            goto L_0x011a
        L_0x00e3:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "requestEffect fail for ["
            r5.append(r6)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            r2 = 93
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "MicroMsg.HalfScreenBackgroundEmbedRenderer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            boolean r2 = r0.isRecycled()
            if (r2 != 0) goto L_0x010d
            r0.recycle()
        L_0x010d:
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L_0x0116
            r3.recycle()
        L_0x0116:
            r13.f254646h = r4
            r13.f254645g = r1
        L_0x011a:
            super.mo122475f(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jt0.C88028c.mo122475f(android.graphics.Canvas, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo122476g() {
        /*
            r3 = this;
            r0 = 0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r3.f254635b     // Catch:{ all -> 0x000c }
            com.tencent.mm.plugin.appbrand.e3 r2 = r1.f238142e     // Catch:{ all -> 0x000c }
            if (r2 == 0) goto L_0x000d
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r2.mo113136o(r1)     // Catch:{ all -> 0x000c }
            goto L_0x000e
        L_0x000c:
        L_0x000d:
            r1 = r0
        L_0x000e:
            if (r1 == 0) goto L_0x0018
            qq0.e r1 = r1.f238159x
            if (r1 == 0) goto L_0x0018
            qq0.c r0 = r1.mo124089b()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jt0.C88028c.mo122476g():android.view.View");
    }

    /* renamed from: h */
    public void mo122477h(int i, int i2, long j, ValueAnimator valueAnimator) {
        float f;
        C87412m.m108594g(valueAnimator, "animation");
        if (i - i2 == 0) {
            f = 1.0f;
        } else {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            f = ((float) (((Integer) animatedValue).intValue() - i)) / ((float) (i2 - i));
        }
        this.f254643e = f;
    }

    public C88029d.C88032b type() {
        return C88029d.C88032b.TYPE_EMBED;
    }
}
