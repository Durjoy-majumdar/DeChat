package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.core.widget.a */
public abstract class C103722a implements View.OnTouchListener {

    /* renamed from: w */
    public static final int f306392w = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    public final C103723a f306393d;

    /* renamed from: e */
    public final Interpolator f306394e = new AccelerateInterpolator();

    /* renamed from: f */
    public final View f306395f;

    /* renamed from: g */
    public Runnable f306396g;

    /* renamed from: h */
    public float[] f306397h = {0.0f, 0.0f};

    /* renamed from: i */
    public float[] f306398i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    public int f306399j;

    /* renamed from: n */
    public int f306400n;

    /* renamed from: o */
    public float[] f306401o = {0.0f, 0.0f};

    /* renamed from: p */
    public float[] f306402p = {0.0f, 0.0f};

    /* renamed from: q */
    public float[] f306403q = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: r */
    public boolean f306404r;

    /* renamed from: s */
    public boolean f306405s;

    /* renamed from: t */
    public boolean f306406t;

    /* renamed from: u */
    public boolean f306407u;

    /* renamed from: v */
    public boolean f306408v;

    /* renamed from: androidx.core.widget.a$a */
    public static class C103723a {

        /* renamed from: a */
        public int f306409a;

        /* renamed from: b */
        public int f306410b;

        /* renamed from: c */
        public float f306411c;

        /* renamed from: d */
        public float f306412d;

        /* renamed from: e */
        public long f306413e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f306414f = 0;

        /* renamed from: g */
        public long f306415g = -1;

        /* renamed from: h */
        public float f306416h;

        /* renamed from: i */
        public int f306417i;

        /* renamed from: a */
        public final float mo145030a(long j) {
            long j2 = this.f306413e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f306415g;
            if (j3 < 0 || j < j3) {
                return C103722a.m138079b(((float) (j - j2)) / ((float) this.f306409a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f306416h;
            return (1.0f - f) + (f * C103722a.m138079b(((float) (j - j3)) / ((float) this.f306417i), 0.0f, 1.0f));
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    public class C103724b implements Runnable {
        public C103724b() {
        }

        public void run() {
            C103722a aVar = C103722a.this;
            if (aVar.f306407u) {
                if (aVar.f306405s) {
                    aVar.f306405s = false;
                    C103723a aVar2 = aVar.f306393d;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f306413e = currentAnimationTimeMillis;
                    aVar2.f306415g = -1;
                    aVar2.f306414f = currentAnimationTimeMillis;
                    aVar2.f306416h = 0.5f;
                }
                C103723a aVar3 = C103722a.this.f306393d;
                if ((aVar3.f306415g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f306415g + ((long) aVar3.f306417i)) || !C103722a.this.mo145028e()) {
                    C103722a.this.f306407u = false;
                    return;
                }
                C103722a aVar4 = C103722a.this;
                if (aVar4.f306406t) {
                    aVar4.f306406t = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f306395f.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f306414f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.mo145030a(currentAnimationTimeMillis2);
                    aVar3.f306414f = currentAnimationTimeMillis2;
                    ((C103728e) C103722a.this).f306421x.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar3.f306414f)) * ((-4.0f * a * a) + (a * 4.0f)) * aVar3.f306412d));
                    View view = C103722a.this.f306395f;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145185m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public C103722a(View view) {
        C103723a aVar = new C103723a();
        this.f306393d = aVar;
        this.f306395f = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f306403q;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f306402p;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f306399j = 1;
        float[] fArr3 = this.f306398i;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f306397h;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f306401o;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f306400n = f306392w;
        aVar.f306409a = 500;
        aVar.f306410b = 500;
    }

    /* renamed from: b */
    public static float m138079b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo145025a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f306397h
            r0 = r0[r4]
            float[] r1 = r3.f306398i
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m138079b(r0, r2, r1)
            float r1 = r3.mo145026c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.mo145026c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0028
            android.view.animation.Interpolator r6 = r3.f306394e
            float r5 = -r5
            android.view.animation.AccelerateInterpolator r6 = (android.view.animation.AccelerateInterpolator) r6
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0034
        L_0x0028:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x003d
            android.view.animation.Interpolator r6 = r3.f306394e
            android.view.animation.AccelerateInterpolator r6 = (android.view.animation.AccelerateInterpolator) r6
            float r5 = r6.getInterpolation(r5)
        L_0x0034:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m138079b(r5, r6, r0)
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            return r2
        L_0x0043:
            float[] r0 = r3.f306401o
            r0 = r0[r4]
            float[] r1 = r3.f306402p
            r1 = r1[r4]
            float[] r2 = r3.f306403q
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x005a
            float r5 = r5 * r0
            float r4 = m138079b(r5, r1, r4)
            return r4
        L_0x005a:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m138079b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C103722a.mo145025a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float mo145026c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f306399j;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f306407u || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: d */
    public final void mo145027d() {
        int i = 0;
        if (this.f306405s) {
            this.f306407u = false;
            return;
        }
        C103723a aVar = this.f306393d;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f306413e);
        int i3 = aVar.f306410b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f306417i = i;
        aVar.f306416h = aVar.mo145030a(currentAnimationTimeMillis);
        aVar.f306415g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo145028e() {
        /*
            r9 = this;
            androidx.core.widget.a$a r0 = r9.f306393d
            float r1 = r0.f306412d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f306411c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            androidx.core.widget.e r4 = (androidx.core.widget.C103728e) r4
            android.widget.ListView r4 = r4.f306421x
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C103722a.mo145028e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f306408v
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0081
        L_0x0016:
            r5.mo145027d()
            goto L_0x0081
        L_0x001a:
            r5.f306406t = r2
            r5.f306404r = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f306395f
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo145025a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f306395f
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo145025a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f306393d
            r7.f306411c = r0
            r7.f306412d = r6
            boolean r6 = r5.f306407u
            if (r6 != 0) goto L_0x0081
            boolean r6 = r5.mo145028e()
            if (r6 == 0) goto L_0x0081
            java.lang.Runnable r6 = r5.f306396g
            if (r6 != 0) goto L_0x0061
            androidx.core.widget.a$b r6 = new androidx.core.widget.a$b
            r6.<init>()
            r5.f306396g = r6
        L_0x0061:
            r5.f306407u = r2
            r5.f306405s = r2
            boolean r6 = r5.f306404r
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f306400n
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f306395f
            java.lang.Runnable r0 = r5.f306396g
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, e3.a0> r6 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145186n(r7, r0, r3)
            goto L_0x007f
        L_0x0078:
            java.lang.Runnable r6 = r5.f306396g
            androidx.core.widget.a$b r6 = (androidx.core.widget.C103722a.C103724b) r6
            r6.run()
        L_0x007f:
            r5.f306404r = r2
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C103722a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
