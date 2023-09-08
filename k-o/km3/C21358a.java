package km3;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.widget.C103732g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import go3.C76019y;
import java.util.Arrays;
import nj3.C88990b;

/* renamed from: km3.a */
public class C21358a {

    /* renamed from: a */
    public int f60405a;

    /* renamed from: b */
    public int f60406b;

    /* renamed from: c */
    public int f60407c = -1;

    /* renamed from: d */
    public float[] f60408d;

    /* renamed from: e */
    public float[] f60409e;

    /* renamed from: f */
    public float[] f60410f;

    /* renamed from: g */
    public float[] f60411g;

    /* renamed from: h */
    public int[] f60412h;

    /* renamed from: i */
    public int[] f60413i;

    /* renamed from: j */
    public int[] f60414j;

    /* renamed from: k */
    public int f60415k;

    /* renamed from: l */
    public VelocityTracker f60416l;

    /* renamed from: m */
    public float f60417m;

    /* renamed from: n */
    public float f60418n;

    /* renamed from: o */
    public int f60419o;

    /* renamed from: p */
    public int f60420p;

    /* renamed from: q */
    public C103732g f60421q;

    /* renamed from: r */
    public final C21360b f60422r;

    /* renamed from: s */
    public View f60423s;

    /* renamed from: t */
    public boolean f60424t;

    /* renamed from: u */
    public final ViewGroup f60425u;

    /* renamed from: v */
    public final Runnable f60426v = new C21359a();

    /* renamed from: km3.a$a */
    public class C21359a implements Runnable {
        public C21359a() {
        }

        public void run() {
            C21358a.this.mo33437m(0);
        }
    }

    /* renamed from: km3.a$b */
    public static abstract class C21360b {
        /* renamed from: a */
        public abstract void mo26400a(View view, int i, int i2, int i3, int i4);
    }

    public C21358a(Context context, ViewGroup viewGroup, C21360b bVar, Interpolator interpolator) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (bVar != null) {
            this.f60425u = viewGroup;
            this.f60422r = bVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f60419o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f60406b = viewConfiguration.getScaledTouchSlop();
            this.f60417m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f60418n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f60421q = new C103732g(context, interpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public void mo33425a() {
        this.f60407c = -1;
        float[] fArr = this.f60408d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f60409e, 0.0f);
            Arrays.fill(this.f60410f, 0.0f);
            Arrays.fill(this.f60411g, 0.0f);
            Arrays.fill(this.f60412h, 0);
            Arrays.fill(this.f60413i, 0);
            Arrays.fill(this.f60414j, 0);
            this.f60415k = 0;
        }
        VelocityTracker velocityTracker = this.f60416l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f60416l = null;
        }
    }

    /* renamed from: b */
    public final boolean mo33426b(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f60412h[i] & i2) != i2 || (this.f60420p & i2) == 0 || (this.f60414j[i] & i2) == i2 || (this.f60413i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f60406b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f60422r.getClass();
        }
        return (this.f60413i[i] & i2) == 0 && abs > ((float) this.f60406b);
    }

    /* renamed from: c */
    public final void mo33427c(int i) {
        float[] fArr = this.f60408d;
        if (fArr != null) {
            fArr[i] = 0.0f;
            this.f60409e[i] = 0.0f;
            this.f60410f[i] = 0.0f;
            this.f60411g[i] = 0.0f;
            this.f60412h[i] = 0;
            this.f60413i[i] = 0;
            this.f60414j[i] = 0;
            this.f60415k = (~(1 << i)) & this.f60415k;
        }
    }

    /* renamed from: d */
    public final int mo33428d(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f60425u.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008a, code lost:
        if (r2 == 3) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r4.f56490n > r4.f56483d) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33429e(float r12, float r13) {
        /*
            r11 = this;
            r0 = 1
            r11.f60424t = r0
            km3.a$b r1 = r11.f60422r
            android.view.View r2 = r11.f60423s
            com.tencent.mm.ui.widget.SwipeBackLayout$e r1 = (com.tencent.p014mm.p136ui.widget.SwipeBackLayout.C19848e) r1
            r1.getClass()
            int r2 = r2.getWidth()
            r3 = 0
            r1.f56504b = r3
            r4 = 0
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0027
            if (r4 != 0) goto L_0x0025
            com.tencent.mm.ui.widget.SwipeBackLayout r4 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
            float r5 = r4.f56490n
            float r4 = r4.f56483d
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0032
        L_0x0027:
            com.tencent.mm.ui.widget.SwipeBackLayout r4 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
            android.graphics.drawable.Drawable r4 = r4.f56491o
            int r4 = r4.getIntrinsicWidth()
            int r2 = r2 + r4
            int r2 = r2 + 10
        L_0x0032:
            r1.f56504b = r2
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r2[r3] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r13)
            r2[r0] = r12
            int r12 = r1.f56504b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r2[r13] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r2[r4] = r12
            r12 = 4
            com.tencent.mm.ui.widget.SwipeBackLayout r5 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
            boolean r5 = r5.f56496t
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2[r12] = r5
            java.lang.String r12 = "MicroMsg.SwipeBackLayout"
            java.lang.String r5 = "ashutest::onViewReleased, xvel:%f yvel:%f, releaseLeft:%d, releaseTop:%d, translucent %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r2)
            com.tencent.mm.ui.widget.SwipeBackLayout r2 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
            r2.f56498v = r0
            com.tencent.mm.ui.widget.SwipeBackLayout$d r2 = r2.f56500x
            if (r2 == 0) goto L_0x008d
            int r5 = r1.f56504b
            if (r5 == 0) goto L_0x0073
            r5 = 1
            goto L_0x0074
        L_0x0073:
            r5 = 0
        L_0x0074:
            int r2 = r2.mo26411b(r5)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5[r3] = r6
            java.lang.String r6 = "intercepted by mSwipeBackListener.onViewReleased, result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r5)
            if (r2 != r13) goto L_0x008a
            r1.f56504b = r3
            goto L_0x008d
        L_0x008a:
            if (r2 != r4) goto L_0x008d
            goto L_0x00c3
        L_0x008d:
            com.tencent.mm.ui.widget.SwipeBackLayout r12 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
            boolean r13 = r12.f56496t
            if (r13 == 0) goto L_0x00c1
            km3.a r4 = r12.f56489j
            int r5 = r1.f56504b
            r6 = 0
            boolean r12 = r4.f60424t
            if (r12 == 0) goto L_0x00b9
            android.view.VelocityTracker r12 = r4.f60416l
            int r13 = r4.f60407c
            float r12 = r12.getXVelocity(r13)
            int r7 = (int) r12
            android.view.VelocityTracker r12 = r4.f60416l
            int r13 = r4.f60407c
            float r12 = r12.getYVelocity(r13)
            int r8 = (int) r12
            r9 = 0
            r4.mo33431g(r5, r6, r7, r8, r9)
            com.tencent.mm.ui.widget.SwipeBackLayout r12 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
            r12.invalidate()
            goto L_0x00c3
        L_0x00b9:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r12.<init>(r13)
            throw r12
        L_0x00c1:
            r12.f56499w = r0
        L_0x00c3:
            r11.f60424t = r3
            int r12 = r11.f60405a
            if (r12 != r0) goto L_0x00cc
            r11.mo33437m(r3)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km3.C21358a.mo33429e(float, float):void");
    }

    /* renamed from: f */
    public View mo33430f(int i, int i2) {
        for (int childCount = this.f60425u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f60425u;
            this.f60422r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo33431g(int i, int i2, int i3, int i4, long j) {
        long j2;
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f60423s.getLeft();
        int top = this.f60423s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f60421q.mo145035a();
            mo33437m(0);
            return false;
        }
        if (j == 0) {
            int i7 = (int) this.f60418n;
            int i8 = (int) this.f60417m;
            int abs = Math.abs(i3);
            if (abs < i7) {
                i8 = 0;
            } else if (abs <= i8) {
                i8 = i3;
            } else if (i3 <= 0) {
                i8 = -i8;
            }
            int i9 = (int) this.f60418n;
            int i15 = (int) this.f60417m;
            int abs2 = Math.abs(i4);
            if (abs2 < i9) {
                i15 = 0;
            } else if (abs2 <= i15) {
                i15 = i4;
            } else if (i4 <= 0) {
                i15 = -i15;
            }
            int abs3 = Math.abs(i5);
            int abs4 = Math.abs(i6);
            int abs5 = Math.abs(i8);
            int abs6 = Math.abs(i15);
            int i16 = abs5 + abs6;
            int i17 = abs3 + abs4;
            if (i8 != 0) {
                f2 = (float) abs5;
                f = (float) i16;
            } else {
                f2 = (float) abs3;
                f = (float) i17;
            }
            float f5 = f2 / f;
            if (i15 != 0) {
                f4 = (float) abs6;
                f3 = (float) i16;
            } else {
                f4 = (float) abs4;
                f3 = (float) i17;
            }
            this.f60422r.getClass();
            int d = mo33428d(i5, i8, 1);
            this.f60422r.getClass();
            j2 = (long) ((int) ((((float) d) * f5) + (((float) mo33428d(i6, i15, 0)) * (f4 / f3))));
        } else {
            j2 = j;
        }
        Log.m105919d("WxViewDragHelper", "ashutest:: xvel %d, yvel %d, dx %d, dy %d duration %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Long.valueOf(j2));
        this.f60421q.mo145038d(left, top, i5, i6, (int) j2);
        mo33437m(2);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c2 A[EDGE_INSN: B:105:0x01c2->B:90:0x01c2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01bf A[LOOP:1: B:77:0x0173->B:89:0x01bf, LOOP_END] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33432h(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            int r3 = r18.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r17.mo33425a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f60416l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f60416l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f60416l
            r4.addMovement(r1)
            r4 = 0
            if (r2 == 0) goto L_0x01d1
            r5 = 1
            if (r2 == r5) goto L_0x01c6
            r6 = 2
            if (r2 == r6) goto L_0x00db
            r6 = 3
            if (r2 == r6) goto L_0x00ce
            r6 = 5
            if (r2 == r6) goto L_0x0079
            r6 = 6
            if (r2 == r6) goto L_0x0034
            goto L_0x01f7
        L_0x0034:
            int r2 = r1.getPointerId(r3)
            int r3 = r0.f60405a
            if (r3 != r5) goto L_0x0074
            int r3 = r0.f60407c
            if (r2 != r3) goto L_0x0074
            int r3 = r18.getPointerCount()
        L_0x0044:
            r5 = -1
            if (r4 >= r3) goto L_0x006e
            int r6 = r1.getPointerId(r4)
            int r7 = r0.f60407c
            if (r6 != r7) goto L_0x0050
            goto L_0x006b
        L_0x0050:
            float r7 = r1.getX(r4)
            float r8 = r1.getY(r4)
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo33430f(r7, r8)
            android.view.View r8 = r0.f60423s
            if (r7 != r8) goto L_0x006b
            boolean r6 = r0.mo33439o(r8, r6)
            if (r6 == 0) goto L_0x006b
            int r1 = r0.f60407c
            goto L_0x006f
        L_0x006b:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x006e:
            r1 = -1
        L_0x006f:
            if (r1 != r5) goto L_0x0074
            r17.mo33433i()
        L_0x0074:
            r0.mo33427c(r2)
            goto L_0x01f7
        L_0x0079:
            int r2 = r1.getPointerId(r3)
            float r6 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo33435k(r6, r1, r2)
            int r3 = r0.f60405a
            if (r3 != 0) goto L_0x00a5
            int r3 = (int) r6
            int r1 = (int) r1
            android.view.View r1 = r0.mo33430f(r3, r1)
            r0.mo33439o(r1, r2)
            int[] r1 = r0.f60412h
            r1 = r1[r2]
            int r2 = r0.f60420p
            r1 = r1 & r2
            if (r1 == 0) goto L_0x01f7
            km3.a$b r1 = r0.f60422r
            r1.getClass()
            goto L_0x01f7
        L_0x00a5:
            int r3 = (int) r6
            int r1 = (int) r1
            android.view.View r6 = r0.f60423s
            if (r6 != 0) goto L_0x00ac
            goto L_0x00c5
        L_0x00ac:
            int r7 = r6.getLeft()
            if (r3 < r7) goto L_0x00c5
            int r7 = r6.getRight()
            if (r3 >= r7) goto L_0x00c5
            int r3 = r6.getTop()
            if (r1 < r3) goto L_0x00c5
            int r3 = r6.getBottom()
            if (r1 >= r3) goto L_0x00c5
            r4 = 1
        L_0x00c5:
            if (r4 == 0) goto L_0x01f7
            android.view.View r1 = r0.f60423s
            r0.mo33439o(r1, r2)
            goto L_0x01f7
        L_0x00ce:
            int r1 = r0.f60405a
            if (r1 != r5) goto L_0x00d6
            r1 = 0
            r0.mo33429e(r1, r1)
        L_0x00d6:
            r17.mo33425a()
            goto L_0x01f7
        L_0x00db:
            int r2 = r0.f60405a
            if (r2 != r5) goto L_0x016e
            int r2 = r0.f60407c
            int r2 = r1.findPointerIndex(r2)
            float r3 = r1.getX(r2)
            float r2 = r1.getY(r2)
            float[] r5 = r0.f60410f
            int r6 = r0.f60407c
            r5 = r5[r6]
            float r3 = r3 - r5
            int r3 = (int) r3
            float[] r5 = r0.f60411g
            r5 = r5[r6]
            float r2 = r2 - r5
            int r2 = (int) r2
            android.view.View r5 = r0.f60423s
            int r5 = r5.getLeft()
            int r5 = r5 + r3
            android.view.View r6 = r0.f60423s
            int r6 = r6.getTop()
            int r6 = r6 + r2
            android.view.View r7 = r0.f60423s
            int r7 = r7.getLeft()
            android.view.View r8 = r0.f60423s
            int r8 = r8.getTop()
            if (r3 == 0) goto L_0x0148
            km3.a$b r9 = r0.f60422r
            android.view.View r10 = r0.f60423s
            com.tencent.mm.ui.widget.SwipeBackLayout$e r9 = (com.tencent.p014mm.p136ui.widget.SwipeBackLayout.C19848e) r9
            com.tencent.mm.ui.widget.SwipeBackLayout r11 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
            boolean r11 = r11.f56496t
            if (r11 == 0) goto L_0x0138
            int r11 = r9.f56503a
            int r5 = java.lang.Math.max(r11, r5)
            r9.f56503a = r4
            int r9 = r10.getWidth()
            int r5 = java.lang.Math.max(r5, r4)
            int r5 = java.lang.Math.min(r9, r5)
            goto L_0x0141
        L_0x0138:
            int r10 = r9.f56503a
            int r5 = java.lang.Math.max(r10, r5)
            r9.f56503a = r5
            r5 = 0
        L_0x0141:
            android.view.View r9 = r0.f60423s
            int r10 = r5 - r7
            r9.offsetLeftAndRight(r10)
        L_0x0148:
            r13 = r5
            if (r2 == 0) goto L_0x0159
            km3.a$b r5 = r0.f60422r
            r5.getClass()
            android.view.View r5 = r0.f60423s
            int r6 = 0 - r8
            r5.offsetTopAndBottom(r6)
            r14 = 0
            goto L_0x015a
        L_0x0159:
            r14 = r6
        L_0x015a:
            if (r3 != 0) goto L_0x015e
            if (r2 == 0) goto L_0x0169
        L_0x015e:
            int r15 = r13 - r7
            int r16 = r14 - r8
            km3.a$b r11 = r0.f60422r
            android.view.View r12 = r0.f60423s
            r11.mo26400a(r12, r13, r14, r15, r16)
        L_0x0169:
            r17.mo33436l(r18)
            goto L_0x01f7
        L_0x016e:
            int r2 = r18.getPointerCount()
            r3 = 0
        L_0x0173:
            if (r3 >= r2) goto L_0x01c2
            int r6 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f60408d
            r9 = r9[r6]
            float r9 = r7 - r9
            float[] r10 = r0.f60409e
            r10 = r10[r6]
            float r10 = r8 - r10
            r0.mo33434j(r9, r10, r6)
            int r10 = r0.f60405a
            if (r10 != r5) goto L_0x0195
            goto L_0x01c2
        L_0x0195:
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo33430f(r7, r8)
            if (r7 != 0) goto L_0x019e
            goto L_0x01b5
        L_0x019e:
            km3.a$b r8 = r0.f60422r
            r8.getClass()
            km3.a$b r8 = r0.f60422r
            r8.getClass()
            float r8 = java.lang.Math.abs(r9)
            int r9 = r0.f60406b
            float r9 = (float) r9
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x01b5
            r8 = 1
            goto L_0x01b6
        L_0x01b5:
            r8 = 0
        L_0x01b6:
            if (r8 == 0) goto L_0x01bf
            boolean r6 = r0.mo33439o(r7, r6)
            if (r6 == 0) goto L_0x01bf
            goto L_0x01c2
        L_0x01bf:
            int r3 = r3 + 1
            goto L_0x0173
        L_0x01c2:
            r17.mo33436l(r18)
            goto L_0x01f7
        L_0x01c6:
            int r1 = r0.f60405a
            if (r1 != r5) goto L_0x01cd
            r17.mo33433i()
        L_0x01cd:
            r17.mo33425a()
            goto L_0x01f7
        L_0x01d1:
            float r2 = r18.getX()
            float r3 = r18.getY()
            int r1 = r1.getPointerId(r4)
            int r4 = (int) r2
            int r5 = (int) r3
            android.view.View r4 = r0.mo33430f(r4, r5)
            r0.mo33435k(r2, r3, r1)
            r0.mo33439o(r4, r1)
            int[] r2 = r0.f60412h
            r1 = r2[r1]
            int r2 = r0.f60420p
            r1 = r1 & r2
            if (r1 == 0) goto L_0x01f7
            km3.a$b r1 = r0.f60422r
            r1.getClass()
        L_0x01f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km3.C21358a.mo33432h(android.view.MotionEvent):void");
    }

    /* renamed from: i */
    public final void mo33433i() {
        this.f60416l.computeCurrentVelocity(1000, this.f60417m);
        float xVelocity = this.f60416l.getXVelocity(this.f60407c);
        float f = this.f60418n;
        float f2 = this.f60417m;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f60416l.getYVelocity(this.f60407c);
        float f4 = this.f60418n;
        float f5 = this.f60417m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity > 0.0f) {
                    f3 = f5;
                } else {
                    yVelocity = -f5;
                }
            }
            f3 = yVelocity;
        }
        mo33429e(xVelocity, f3);
    }

    /* renamed from: j */
    public final void mo33434j(float f, float f2, int i) {
        boolean b = mo33426b(f, f2, i, 1);
        if (mo33426b(f2, f, i, 4)) {
            b |= true;
        }
        if (mo33426b(f, f2, i, 2)) {
            b |= true;
        }
        if (mo33426b(f2, f, i, 8)) {
            b |= true;
        }
        if (b) {
            int[] iArr = this.f60413i;
            iArr[i] = iArr[i] | b;
            SwipeBackLayout.C19848e eVar = (SwipeBackLayout.C19848e) this.f60422r;
            SwipeBackLayout.C19854d dVar = SwipeBackLayout.this.f56500x;
            if (dVar != null) {
                dVar.mo26416j(b, i);
            }
            SwipeBackLayout.C19846b bVar = SwipeBackLayout.this.f56502z;
            if (bVar != null) {
                bVar.mo26396a(b ? 1 : 0);
            }
        }
    }

    /* renamed from: k */
    public final void mo33435k(float f, float f2, int i) {
        float[] fArr = this.f60408d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f60409e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f60410f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f60411g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f60412h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f60413i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f60414j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f60408d = fArr2;
            this.f60409e = fArr3;
            this.f60410f = fArr4;
            this.f60411g = fArr5;
            this.f60412h = iArr;
            this.f60413i = iArr2;
            this.f60414j = iArr3;
        }
        float[] fArr9 = this.f60408d;
        this.f60410f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f60409e;
        this.f60411g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f60412h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f60425u.getLeft() + this.f60419o) {
            i2 = 1;
        }
        if (i5 < this.f60425u.getTop() + this.f60419o) {
            i2 |= 4;
        }
        if (i4 > this.f60425u.getRight() - this.f60419o) {
            i2 |= 2;
        }
        if (i5 > this.f60425u.getBottom() - this.f60419o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f60415k |= 1 << i;
    }

    /* renamed from: l */
    public final void mo33436l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            this.f60410f[pointerId] = x;
            this.f60411g[pointerId] = y;
        }
    }

    /* renamed from: m */
    public void mo33437m(int i) {
        if (this.f60405a != i) {
            this.f60405a = i;
            SwipeBackLayout.C19848e eVar = (SwipeBackLayout.C19848e) this.f60422r;
            eVar.getClass();
            boolean z = false;
            Log.m105925i("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", Integer.valueOf(i), Boolean.valueOf(SwipeBackLayout.this.f56495s), Boolean.valueOf(SwipeBackLayout.this.f56499w));
            eVar.f56505c = i;
            if (1 == i) {
                Log.m105924i("MicroMsg.SwipeBackLayout", "ashutest:: on drag");
                if (SwipeBackLayout.this.getContext() instanceof Activity) {
                    SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                    if (swipeBackLayout.f56501y == null) {
                        swipeBackLayout.f56501y = ((Activity) swipeBackLayout.getContext()).getWindow().getDecorView().getBackground();
                        SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                        if (swipeBackLayout2.f56481B) {
                            ((Activity) swipeBackLayout2.getContext()).getWindow().getDecorView().setBackgroundResource(C0966R.color.ahf);
                        }
                    }
                }
                SwipeBackLayout.C19847c cVar = SwipeBackLayout.this.f56482C;
                if (cVar != null) {
                    cVar.onDrag();
                }
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                swipeBackLayout3.f56497u = false;
                if (swipeBackLayout3.f56496t) {
                    C76019y.m91314b(0.0f);
                }
            }
            if (i == 0 && !SwipeBackLayout.this.f56499w) {
                Log.m105924i("MicroMsg.SwipeBackLayout", "ashutest:: on cancel");
                SwipeBackLayout swipeBackLayout4 = SwipeBackLayout.this;
                if (swipeBackLayout4.f56482C != null) {
                    if (swipeBackLayout4.getContext() instanceof Activity) {
                        SwipeBackLayout swipeBackLayout5 = SwipeBackLayout.this;
                        if (swipeBackLayout5.f56501y != null) {
                            if (swipeBackLayout5.f56481B) {
                                ((Activity) swipeBackLayout5.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.this.f56501y);
                            }
                            SwipeBackLayout.this.f56501y = null;
                        }
                    }
                    SwipeBackLayout.this.f56482C.onCancel();
                }
                C76019y.m91314b(1.0f);
            }
            if (1 == i) {
                SwipeBackLayout swipeBackLayout6 = SwipeBackLayout.this;
                if (swipeBackLayout6.f56494r && (swipeBackLayout6.getContext() instanceof Activity)) {
                    SwipeBackLayout swipeBackLayout7 = SwipeBackLayout.this;
                    if (!swipeBackLayout7.f56496t && !swipeBackLayout7.f56495s) {
                        Log.m105924i("MicroMsg.SwipeBackLayout", "ashutest:: match dragging");
                        SwipeBackLayout swipeBackLayout8 = SwipeBackLayout.this;
                        swipeBackLayout8.f56495s = true;
                        C88990b.m111194c((Activity) swipeBackLayout8.getContext(), eVar);
                    }
                }
            }
            if (2 == i) {
                Log.m105925i("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", Integer.valueOf(eVar.f56504b));
                int i2 = eVar.f56504b;
                if (i2 > 0) {
                    z = true;
                }
                C76019y.m91313a(z, i2);
            }
            if (i == 0) {
                this.f60423s = null;
            }
        }
    }

    /* renamed from: n */
    public boolean mo33438n(MotionEvent motionEvent) {
        View f;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo33425a();
        }
        if (this.f60416l == null) {
            this.f60416l = VelocityTracker.obtain();
        }
        this.f60416l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            mo33435k(x, y, pointerId);
                            int i = this.f60405a;
                            if (i == 0) {
                                if ((this.f60412h[pointerId] & this.f60420p) != 0) {
                                    this.f60422r.getClass();
                                }
                            } else if (i == 2 && (f = mo33430f((int) x, (int) y)) == this.f60423s) {
                                mo33439o(f, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            mo33427c(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f60408d != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f2 = x2 - this.f60408d[pointerId2];
                        mo33434j(f2, y2 - this.f60409e[pointerId2], pointerId2);
                        if (this.f60405a == 1) {
                            break;
                        }
                        View f3 = mo33430f((int) x2, (int) y2);
                        if (f3 != null) {
                            this.f60422r.getClass();
                            this.f60422r.getClass();
                            if ((Math.abs(f2) > ((float) this.f60406b)) && mo33439o(f3, pointerId2)) {
                                break;
                            }
                        }
                    }
                    mo33436l(motionEvent);
                }
            }
            mo33425a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            mo33435k(x3, y3, pointerId3);
            View f4 = mo33430f((int) x3, (int) y3);
            if (f4 == this.f60423s && this.f60405a == 2) {
                mo33439o(f4, pointerId3);
            }
            if ((this.f60412h[pointerId3] & this.f60420p) != 0) {
                this.f60422r.getClass();
            }
        }
        return this.f60405a == 1;
    }

    /* renamed from: o */
    public boolean mo33439o(View view, int i) {
        if (view == this.f60423s && this.f60407c == i) {
            return true;
        }
        if (view != null) {
            C21358a aVar = SwipeBackLayout.this.f56489j;
            if (((aVar.f60415k & (1 << i)) != 0) && (aVar.f60412h[i] & 1) != 0) {
                this.f60407c = i;
                if (view.getParent() == this.f60425u) {
                    this.f60423s = view;
                    this.f60407c = i;
                    this.f60422r.getClass();
                    mo33437m(1);
                    return true;
                }
                throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f60425u + ")");
            }
        }
        return false;
    }
}
