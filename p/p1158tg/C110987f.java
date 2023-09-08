package p1158tg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import cq3.C106952a;

/* renamed from: tg.f */
public class C110987f extends C110983b {

    /* renamed from: c */
    public C106952a f332409c;

    /* renamed from: d */
    public ValueAnimator f332410d;

    /* renamed from: e */
    public float f332411e = 1.0f;

    /* renamed from: f */
    public float f332412f;

    /* renamed from: g */
    public float f332413g;

    /* renamed from: h */
    public boolean f332414h = true;

    /* renamed from: i */
    public boolean f332415i = false;

    /* renamed from: tg.f$a */
    public class C110988a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public float f332416d = 0.0f;

        /* renamed from: e */
        public float f332417e = 0.0f;

        /* renamed from: f */
        public int f332418f = 0;

        /* renamed from: g */
        public float f332419g;

        public C110988a(float f) {
            this.f332419g = (float) Math.pow((double) (C110987f.this.f332411e / f), 0.25d);
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            float f2;
            float floatValue = ((Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
            float floatValue2 = ((Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
            if (this.f332418f < 4) {
                C110987f fVar = C110987f.this;
                if (fVar.f332414h) {
                    Matrix mainMatrix = fVar.f332409c.getMainMatrix();
                    float f3 = this.f332419g;
                    mainMatrix.postScale(f3, f3);
                    this.f332418f++;
                }
            }
            RectF curValidImageRect = C110987f.this.f332409c.getCurValidImageRect();
            Rect boardRect = C110987f.this.f332409c.getBoardRect();
            C110987f fVar2 = C110987f.this;
            if (!fVar2.f332415i) {
                float f4 = fVar2.f332412f + (floatValue2 - this.f332417e);
                fVar2.f332412f = f4;
                fVar2.f332413g += floatValue - this.f332416d;
                f2 = f4 - curValidImageRect.centerX();
                f = C110987f.this.f332413g - curValidImageRect.centerY();
            } else {
                float f5 = curValidImageRect.top;
                int i = boardRect.top;
                float f6 = f5 > ((float) i) ? ((float) i) - f5 : 0.0f;
                float f7 = curValidImageRect.right;
                int i2 = boardRect.right;
                float f8 = f7 < ((float) i2) ? ((float) i2) - f7 : 0.0f;
                float f9 = curValidImageRect.bottom;
                int i3 = boardRect.bottom;
                if (f9 < ((float) i3)) {
                    f6 = ((float) i3) - f9;
                }
                f = f6;
                float f15 = curValidImageRect.left;
                int i4 = boardRect.left;
                f2 = f15 > ((float) i4) ? ((float) i4) - f15 : f8;
            }
            C110987f.this.f332409c.getMainMatrix().postTranslate(f2, f);
            C110987f.this.f332409c.postInvalidate();
            this.f332416d = floatValue;
            this.f332417e = floatValue2;
        }
    }

    /* renamed from: tg.f$b */
    public class C110989b implements Animator.AnimatorListener {
        public C110989b() {
        }

        public void onAnimationCancel(Animator animator) {
            C110987f.this.f332399a = true;
        }

        public void onAnimationEnd(Animator animator) {
            C110987f.this.f332399a = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C110987f.this.f332399a = false;
        }
    }

    public C110987f(C106952a aVar) {
        this.f332409c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r6 != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo162659a() {
        /*
            r15 = this;
            boolean r0 = r15.f332399a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = "MicroMsg.StickRoundAnim"
            java.lang.String r1 = "[play] start"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            cq3.a r1 = r15.f332409c
            android.graphics.RectF r1 = r1.getCurValidImageRect()
            cq3.a r2 = r15.f332409c
            android.graphics.Rect r2 = r2.getBoardRect()
            float r3 = r1.centerX()
            r15.f332412f = r3
            float r3 = r1.centerY()
            r15.f332413g = r3
            cq3.a r3 = r15.f332409c
            int r3 = r3.getBoardRectCenterY()
            float r3 = (float) r3
            float r4 = r15.f332413g
            float r3 = r3 - r4
            int r4 = r2.centerX()
            float r4 = (float) r4
            float r5 = r1.centerX()
            float r4 = r4 - r5
            cq3.a r5 = r15.f332409c
            float r5 = r5.getCurScale()
            cq3.a r6 = r15.f332409c
            float r6 = r6.getMaxScale()
            cq3.a r7 = r15.f332409c
            float r7 = r7.getMinScale()
            r8 = 0
            r9 = 1
            int r10 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0055
            r15.f332411e = r6
            r15.f332414h = r9
            goto L_0x0060
        L_0x0055:
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x005e
            r15.f332411e = r7
            r15.f332414h = r9
            goto L_0x0060
        L_0x005e:
            r15.f332414h = r8
        L_0x0060:
            int r6 = r2.height()
            float r6 = (float) r6
            float r7 = r1.height()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x006f
            r6 = 1
            goto L_0x0070
        L_0x006f:
            r6 = 0
        L_0x0070:
            int r7 = r2.width()
            float r7 = (float) r7
            float r11 = r1.width()
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x007f
            r7 = 1
            goto L_0x0080
        L_0x007f:
            r7 = 0
        L_0x0080:
            r11 = 0
            if (r6 == 0) goto L_0x0084
            r3 = 0
        L_0x0084:
            if (r7 == 0) goto L_0x0087
            r4 = 0
        L_0x0087:
            float r12 = r1.top
            int r13 = r2.top
            float r14 = (float) r13
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0095
            if (r6 == 0) goto L_0x0095
        L_0x0092:
            float r3 = (float) r13
            float r3 = r3 - r12
            goto L_0x00a1
        L_0x0095:
            float r12 = r1.bottom
            int r13 = r2.bottom
            float r14 = (float) r13
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a1
            if (r6 == 0) goto L_0x00a1
            goto L_0x0092
        L_0x00a1:
            float r6 = r1.left
            int r12 = r2.left
            float r13 = (float) r12
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b0
            if (r7 == 0) goto L_0x00b0
            float r1 = (float) r12
            float r4 = r1 - r6
            goto L_0x00be
        L_0x00b0:
            float r1 = r1.right
            int r2 = r2.right
            float r6 = (float) r2
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00be
            if (r7 == 0) goto L_0x00be
            float r2 = (float) r2
            float r4 = r2 - r1
        L_0x00be:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Float r6 = java.lang.Float.valueOf(r4)
            r2[r8] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            r2[r9] = r6
            java.lang.String r6 = "%s %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r6, r2)
            if (r10 <= 0) goto L_0x00d7
            r15.f332415i = r9
            goto L_0x00d9
        L_0x00d7:
            r15.f332415i = r8
        L_0x00d9:
            float[] r0 = new float[r1]
            r0[r8] = r11
            r0[r9] = r3
            java.lang.String r2 = "deltaY"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r2, r0)
            float[] r2 = new float[r1]
            r2[r8] = r11
            r2[r9] = r4
            java.lang.String r3 = "deltaX"
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r3, r2)
            float[] r3 = new float[r1]
            r3 = {0, 1117782016} // fill-array
            java.lang.String r4 = "scale"
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r4, r3)
            r4 = 3
            android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r4]
            r4[r8] = r0
            r4[r9] = r2
            r4[r1] = r3
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofPropertyValuesHolder(r4)
            r15.f332410d = r0
            tg.f$a r1 = new tg.f$a
            r1.<init>(r5)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r15.f332410d
            tg.f$b r1 = new tg.f$b
            r1.<init>()
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r15.f332410d
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r15.f332410d
            r1 = 80
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r15.f332410d
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1158tg.C110987f.mo162659a():void");
    }
}
