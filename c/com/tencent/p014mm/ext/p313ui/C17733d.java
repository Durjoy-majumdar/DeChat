package com.tencent.p014mm.ext.p313ui;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.widget.C103732g;
import com.tencent.p014mm.ext.p313ui.SwipeBackLayout;
import java.util.Arrays;
import p1005ma.C88718b;

/* renamed from: com.tencent.mm.ext.ui.d */
public class C17733d {

    /* renamed from: a */
    public int f48820a;

    /* renamed from: b */
    public int f48821b;

    /* renamed from: c */
    public int f48822c = -1;

    /* renamed from: d */
    public float[] f48823d;

    /* renamed from: e */
    public float[] f48824e;

    /* renamed from: f */
    public float[] f48825f;

    /* renamed from: g */
    public float[] f48826g;

    /* renamed from: h */
    public int[] f48827h;

    /* renamed from: i */
    public int[] f48828i;

    /* renamed from: j */
    public int[] f48829j;

    /* renamed from: k */
    public int f48830k;

    /* renamed from: l */
    public VelocityTracker f48831l;

    /* renamed from: m */
    public float f48832m;

    /* renamed from: n */
    public float f48833n;

    /* renamed from: o */
    public int f48834o;

    /* renamed from: p */
    public int f48835p;

    /* renamed from: q */
    public C103732g f48836q;

    /* renamed from: r */
    public final C17735b f48837r;

    /* renamed from: s */
    public View f48838s;

    /* renamed from: t */
    public boolean f48839t;

    /* renamed from: u */
    public final ViewGroup f48840u;

    /* renamed from: v */
    public final Runnable f48841v = new C17734a();

    /* renamed from: com.tencent.mm.ext.ui.d$a */
    public class C17734a implements Runnable {
        public C17734a() {
        }

        public void run() {
            C17733d.this.mo21306l(0);
        }
    }

    /* renamed from: com.tencent.mm.ext.ui.d$b */
    public static abstract class C17735b {
        /* renamed from: a */
        public abstract void mo21283a(View view, int i, int i2, int i3, int i4);
    }

    public C17733d(Context context, ViewGroup viewGroup, C17735b bVar, Interpolator interpolator) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (bVar != null) {
            this.f48840u = viewGroup;
            this.f48837r = bVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f48834o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f48821b = viewConfiguration.getScaledTouchSlop();
            this.f48832m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f48833n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f48836q = new C103732g(context, interpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public void mo21295a() {
        this.f48822c = -1;
        float[] fArr = this.f48823d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f48824e, 0.0f);
            Arrays.fill(this.f48825f, 0.0f);
            Arrays.fill(this.f48826g, 0.0f);
            Arrays.fill(this.f48827h, 0);
            Arrays.fill(this.f48828i, 0);
            Arrays.fill(this.f48829j, 0);
            this.f48830k = 0;
        }
        VelocityTracker velocityTracker = this.f48831l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f48831l = null;
        }
    }

    /* renamed from: b */
    public final boolean mo21296b(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f48827h[i] & i2) != i2 || (this.f48835p & i2) == 0 || (this.f48829j[i] & i2) == i2 || (this.f48828i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f48821b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f48837r.getClass();
        }
        return (this.f48828i[i] & i2) == 0 && abs > ((float) this.f48821b);
    }

    /* renamed from: c */
    public final void mo21297c(int i) {
        float[] fArr = this.f48823d;
        if (fArr != null) {
            fArr[i] = 0.0f;
            this.f48824e[i] = 0.0f;
            this.f48825f[i] = 0.0f;
            this.f48826g[i] = 0.0f;
            this.f48827h[i] = 0;
            this.f48828i[i] = 0;
            this.f48829j[i] = 0;
            this.f48830k = (~(1 << i)) & this.f48830k;
        }
    }

    /* renamed from: d */
    public final int mo21298d(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f48840u.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        if (r5.f48799o > r5.f48791d) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0074  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21299e(float r18, float r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            r0.f48839t = r1
            com.tencent.mm.ext.ui.d$b r2 = r0.f48837r
            android.view.View r3 = r0.f48838s
            com.tencent.mm.ext.ui.SwipeBackLayout$d r2 = (com.tencent.p014mm.ext.p313ui.SwipeBackLayout.C17725d) r2
            r2.getClass()
            int r3 = r3.getWidth()
            r4 = 0
            r2.f48812b = r4
            r5 = 0
            int r5 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0029
            if (r5 != 0) goto L_0x0027
            com.tencent.mm.ext.ui.SwipeBackLayout r5 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
            float r6 = r5.f48799o
            float r5 = r5.f48791d
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            goto L_0x0034
        L_0x0029:
            com.tencent.mm.ext.ui.SwipeBackLayout r5 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
            android.graphics.drawable.Drawable r5 = r5.f48800p
            int r5 = r5.getIntrinsicWidth()
            int r3 = r3 + r5
            int r3 = r3 + 10
        L_0x0034:
            r2.f48812b = r3
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r18)
            r3[r4] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r19)
            r3[r1] = r5
            int r5 = r2.f48812b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r3[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 3
            r3[r6] = r5
            com.tencent.mm.ext.ui.SwipeBackLayout r5 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
            boolean r5 = r5.f48805u
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 4
            r3[r6] = r5
            java.lang.String r5 = "MicroMsg.SwipeBackLayout"
            java.lang.String r6 = "ashutest::onViewReleased, xvel:%f yvel:%f, releaseLeft:%d, releaseTop:%d, translucent %B"
            p1005ma.C88718b.m110681c(r5, r6, r3)
            com.tencent.mm.ext.ui.SwipeBackLayout r3 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
            r3.f48807w = r1
            r3.getClass()
            com.tencent.mm.ext.ui.SwipeBackLayout r1 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
            boolean r3 = r1.f48805u
            if (r3 == 0) goto L_0x0163
            com.tencent.mm.ext.ui.d r1 = r1.f48798n
            int r3 = r2.f48812b
            boolean r5 = r1.f48839t
            if (r5 == 0) goto L_0x015b
            android.view.VelocityTracker r5 = r1.f48831l
            int r6 = r1.f48822c
            float r5 = r5.getXVelocity(r6)
            int r5 = (int) r5
            android.view.VelocityTracker r6 = r1.f48831l
            int r7 = r1.f48822c
            float r6 = r6.getYVelocity(r7)
            int r6 = (int) r6
            android.view.View r7 = r1.f48838s
            int r9 = r7.getLeft()
            android.view.View r7 = r1.f48838s
            int r10 = r7.getTop()
            int r11 = r3 - r9
            int r12 = 0 - r10
            if (r11 != 0) goto L_0x00ac
            if (r12 != 0) goto L_0x00ac
            androidx.core.widget.g r3 = r1.f48836q
            r3.mo145035a()
            r1.mo21306l(r4)
            goto L_0x0154
        L_0x00ac:
            float r3 = r1.f48833n
            int r3 = (int) r3
            float r4 = r1.f48832m
            int r4 = (int) r4
            int r7 = java.lang.Math.abs(r5)
            if (r7 >= r3) goto L_0x00ba
            r4 = 0
            goto L_0x00c2
        L_0x00ba:
            if (r7 <= r4) goto L_0x00c1
            if (r5 <= 0) goto L_0x00bf
            goto L_0x00c2
        L_0x00bf:
            int r4 = -r4
            goto L_0x00c2
        L_0x00c1:
            r4 = r5
        L_0x00c2:
            float r3 = r1.f48833n
            int r3 = (int) r3
            float r7 = r1.f48832m
            int r7 = (int) r7
            int r8 = java.lang.Math.abs(r6)
            if (r8 >= r3) goto L_0x00d0
            r7 = 0
            goto L_0x00d8
        L_0x00d0:
            if (r8 <= r7) goto L_0x00d7
            if (r6 <= 0) goto L_0x00d5
            goto L_0x00d8
        L_0x00d5:
            int r7 = -r7
            goto L_0x00d8
        L_0x00d7:
            r7 = r6
        L_0x00d8:
            int r3 = java.lang.Math.abs(r11)
            int r8 = java.lang.Math.abs(r12)
            int r13 = java.lang.Math.abs(r4)
            int r14 = java.lang.Math.abs(r7)
            int r15 = r13 + r14
            int r0 = r3 + r8
            if (r4 == 0) goto L_0x00f1
            float r3 = (float) r13
            float r13 = (float) r15
            goto L_0x00f3
        L_0x00f1:
            float r3 = (float) r3
            float r13 = (float) r0
        L_0x00f3:
            float r3 = r3 / r13
            if (r7 == 0) goto L_0x00f9
            float r0 = (float) r14
            float r8 = (float) r15
            goto L_0x0100
        L_0x00f9:
            float r8 = (float) r8
            float r0 = (float) r0
            r16 = r8
            r8 = r0
            r0 = r16
        L_0x0100:
            float r0 = r0 / r8
            com.tencent.mm.ext.ui.d$b r8 = r1.f48837r
            r8.getClass()
            r8 = 1
            int r4 = r1.mo21298d(r11, r4, r8)
            com.tencent.mm.ext.ui.d$b r8 = r1.f48837r
            r8.getClass()
            r8 = 0
            int r7 = r1.mo21298d(r12, r7, r8)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r3 = (float) r7
            float r3 = r3 * r0
            float r4 = r4 + r3
            int r0 = (int) r4
            long r3 = (long) r0
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 1
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r6 = 2
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r6 = 3
            r0[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r6 = 4
            r0[r6] = r5
            java.lang.String r5 = "WxViewDragHelper"
            java.lang.String r6 = "ashutest:: xvel %d, yvel %d, dx %d, dy %d duration %d"
            p1005ma.C88718b.m110679a(r5, r6, r0)
            androidx.core.widget.g r8 = r1.f48836q
            int r13 = (int) r3
            r8.mo145038d(r9, r10, r11, r12, r13)
            r0 = 2
            r1.mo21306l(r0)
        L_0x0154:
            com.tencent.mm.ext.ui.SwipeBackLayout r0 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
            r0.invalidate()
            r0 = 1
            goto L_0x0166
        L_0x015b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r0.<init>(r1)
            throw r0
        L_0x0163:
            r0 = 1
            r1.f48808x = r0
        L_0x0166:
            r1 = 0
            r2 = r17
            r2.f48839t = r1
            int r3 = r2.f48820a
            if (r3 != r0) goto L_0x0172
            r2.mo21306l(r1)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ext.p313ui.C17733d.mo21299e(float, float):void");
    }

    /* renamed from: f */
    public View mo21300f(int i, int i2) {
        for (int childCount = this.f48840u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f48840u;
            this.f48837r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c2 A[EDGE_INSN: B:105:0x01c2->B:90:0x01c2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01bf A[LOOP:1: B:77:0x0173->B:89:0x01bf, LOOP_END] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21301g(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            int r3 = r18.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r17.mo21295a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f48831l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f48831l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f48831l
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
            int r3 = r0.f48820a
            if (r3 != r5) goto L_0x0074
            int r3 = r0.f48822c
            if (r2 != r3) goto L_0x0074
            int r3 = r18.getPointerCount()
        L_0x0044:
            r5 = -1
            if (r4 >= r3) goto L_0x006e
            int r6 = r1.getPointerId(r4)
            int r7 = r0.f48822c
            if (r6 != r7) goto L_0x0050
            goto L_0x006b
        L_0x0050:
            float r7 = r1.getX(r4)
            float r8 = r1.getY(r4)
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo21300f(r7, r8)
            android.view.View r8 = r0.f48838s
            if (r7 != r8) goto L_0x006b
            boolean r6 = r0.mo21308n(r8, r6)
            if (r6 == 0) goto L_0x006b
            int r1 = r0.f48822c
            goto L_0x006f
        L_0x006b:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x006e:
            r1 = -1
        L_0x006f:
            if (r1 != r5) goto L_0x0074
            r17.mo21302h()
        L_0x0074:
            r0.mo21297c(r2)
            goto L_0x01f7
        L_0x0079:
            int r2 = r1.getPointerId(r3)
            float r6 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo21304j(r6, r1, r2)
            int r3 = r0.f48820a
            if (r3 != 0) goto L_0x00a5
            int r3 = (int) r6
            int r1 = (int) r1
            android.view.View r1 = r0.mo21300f(r3, r1)
            r0.mo21308n(r1, r2)
            int[] r1 = r0.f48827h
            r1 = r1[r2]
            int r2 = r0.f48835p
            r1 = r1 & r2
            if (r1 == 0) goto L_0x01f7
            com.tencent.mm.ext.ui.d$b r1 = r0.f48837r
            r1.getClass()
            goto L_0x01f7
        L_0x00a5:
            int r3 = (int) r6
            int r1 = (int) r1
            android.view.View r6 = r0.f48838s
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
            android.view.View r1 = r0.f48838s
            r0.mo21308n(r1, r2)
            goto L_0x01f7
        L_0x00ce:
            int r1 = r0.f48820a
            if (r1 != r5) goto L_0x00d6
            r1 = 0
            r0.mo21299e(r1, r1)
        L_0x00d6:
            r17.mo21295a()
            goto L_0x01f7
        L_0x00db:
            int r2 = r0.f48820a
            if (r2 != r5) goto L_0x016e
            int r2 = r0.f48822c
            int r2 = r1.findPointerIndex(r2)
            float r3 = r1.getX(r2)
            float r2 = r1.getY(r2)
            float[] r5 = r0.f48825f
            int r6 = r0.f48822c
            r5 = r5[r6]
            float r3 = r3 - r5
            int r3 = (int) r3
            float[] r5 = r0.f48826g
            r5 = r5[r6]
            float r2 = r2 - r5
            int r2 = (int) r2
            android.view.View r5 = r0.f48838s
            int r5 = r5.getLeft()
            int r5 = r5 + r3
            android.view.View r6 = r0.f48838s
            int r6 = r6.getTop()
            int r6 = r6 + r2
            android.view.View r7 = r0.f48838s
            int r7 = r7.getLeft()
            android.view.View r8 = r0.f48838s
            int r8 = r8.getTop()
            if (r3 == 0) goto L_0x0148
            com.tencent.mm.ext.ui.d$b r9 = r0.f48837r
            android.view.View r10 = r0.f48838s
            com.tencent.mm.ext.ui.SwipeBackLayout$d r9 = (com.tencent.p014mm.ext.p313ui.SwipeBackLayout.C17725d) r9
            com.tencent.mm.ext.ui.SwipeBackLayout r11 = com.tencent.p014mm.ext.p313ui.SwipeBackLayout.this
            boolean r11 = r11.f48805u
            if (r11 == 0) goto L_0x0138
            int r11 = r9.f48811a
            int r5 = java.lang.Math.max(r11, r5)
            r9.f48811a = r4
            int r9 = r10.getWidth()
            int r5 = java.lang.Math.max(r5, r4)
            int r5 = java.lang.Math.min(r9, r5)
            goto L_0x0141
        L_0x0138:
            int r10 = r9.f48811a
            int r5 = java.lang.Math.max(r10, r5)
            r9.f48811a = r5
            r5 = 0
        L_0x0141:
            android.view.View r9 = r0.f48838s
            int r10 = r5 - r7
            r9.offsetLeftAndRight(r10)
        L_0x0148:
            r13 = r5
            if (r2 == 0) goto L_0x0159
            com.tencent.mm.ext.ui.d$b r5 = r0.f48837r
            r5.getClass()
            android.view.View r5 = r0.f48838s
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
            com.tencent.mm.ext.ui.d$b r11 = r0.f48837r
            android.view.View r12 = r0.f48838s
            r11.mo21283a(r12, r13, r14, r15, r16)
        L_0x0169:
            r17.mo21305k(r18)
            goto L_0x01f7
        L_0x016e:
            int r2 = r18.getPointerCount()
            r3 = 0
        L_0x0173:
            if (r3 >= r2) goto L_0x01c2
            int r6 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f48823d
            r9 = r9[r6]
            float r9 = r7 - r9
            float[] r10 = r0.f48824e
            r10 = r10[r6]
            float r10 = r8 - r10
            r0.mo21303i(r9, r10, r6)
            int r10 = r0.f48820a
            if (r10 != r5) goto L_0x0195
            goto L_0x01c2
        L_0x0195:
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo21300f(r7, r8)
            if (r7 != 0) goto L_0x019e
            goto L_0x01b5
        L_0x019e:
            com.tencent.mm.ext.ui.d$b r8 = r0.f48837r
            r8.getClass()
            com.tencent.mm.ext.ui.d$b r8 = r0.f48837r
            r8.getClass()
            float r8 = java.lang.Math.abs(r9)
            int r9 = r0.f48821b
            float r9 = (float) r9
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x01b5
            r8 = 1
            goto L_0x01b6
        L_0x01b5:
            r8 = 0
        L_0x01b6:
            if (r8 == 0) goto L_0x01bf
            boolean r6 = r0.mo21308n(r7, r6)
            if (r6 == 0) goto L_0x01bf
            goto L_0x01c2
        L_0x01bf:
            int r3 = r3 + 1
            goto L_0x0173
        L_0x01c2:
            r17.mo21305k(r18)
            goto L_0x01f7
        L_0x01c6:
            int r1 = r0.f48820a
            if (r1 != r5) goto L_0x01cd
            r17.mo21302h()
        L_0x01cd:
            r17.mo21295a()
            goto L_0x01f7
        L_0x01d1:
            float r2 = r18.getX()
            float r3 = r18.getY()
            int r1 = r1.getPointerId(r4)
            int r4 = (int) r2
            int r5 = (int) r3
            android.view.View r4 = r0.mo21300f(r4, r5)
            r0.mo21304j(r2, r3, r1)
            r0.mo21308n(r4, r1)
            int[] r2 = r0.f48827h
            r1 = r2[r1]
            int r2 = r0.f48835p
            r1 = r1 & r2
            if (r1 == 0) goto L_0x01f7
            com.tencent.mm.ext.ui.d$b r1 = r0.f48837r
            r1.getClass()
        L_0x01f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ext.p313ui.C17733d.mo21301g(android.view.MotionEvent):void");
    }

    /* renamed from: h */
    public final void mo21302h() {
        this.f48831l.computeCurrentVelocity(1000, this.f48832m);
        float xVelocity = this.f48831l.getXVelocity(this.f48822c);
        float f = this.f48833n;
        float f2 = this.f48832m;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f48831l.getYVelocity(this.f48822c);
        float f4 = this.f48833n;
        float f5 = this.f48832m;
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
        mo21299e(xVelocity, f3);
    }

    /* renamed from: i */
    public final void mo21303i(float f, float f2, int i) {
        boolean b = mo21296b(f, f2, i, 1);
        if (mo21296b(f2, f, i, 4)) {
            b |= true;
        }
        if (mo21296b(f, f2, i, 2)) {
            b |= true;
        }
        if (mo21296b(f2, f, i, 8)) {
            b |= true;
        }
        if (b) {
            int[] iArr = this.f48828i;
            iArr[i] = iArr[i] | b;
            this.f48837r.getClass();
        }
    }

    /* renamed from: j */
    public final void mo21304j(float f, float f2, int i) {
        float[] fArr = this.f48823d;
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
                float[] fArr6 = this.f48824e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f48825f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f48826g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f48827h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f48828i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f48829j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f48823d = fArr2;
            this.f48824e = fArr3;
            this.f48825f = fArr4;
            this.f48826g = fArr5;
            this.f48827h = iArr;
            this.f48828i = iArr2;
            this.f48829j = iArr3;
        }
        float[] fArr9 = this.f48823d;
        this.f48825f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f48824e;
        this.f48826g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f48827h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f48840u.getLeft() + this.f48834o) {
            i2 = 1;
        }
        if (i5 < this.f48840u.getTop() + this.f48834o) {
            i2 |= 4;
        }
        if (i4 > this.f48840u.getRight() - this.f48834o) {
            i2 |= 2;
        }
        if (i5 > this.f48840u.getBottom() - this.f48834o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f48830k |= 1 << i;
    }

    /* renamed from: k */
    public final void mo21305k(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            this.f48825f[pointerId] = x;
            this.f48826g[pointerId] = y;
        }
    }

    /* renamed from: l */
    public void mo21306l(int i) {
        if (this.f48820a != i) {
            this.f48820a = i;
            SwipeBackLayout.C17725d dVar = (SwipeBackLayout.C17725d) this.f48837r;
            dVar.getClass();
            boolean z = false;
            C88718b.m110681c("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", Integer.valueOf(i), Boolean.valueOf(SwipeBackLayout.this.f48804t), Boolean.valueOf(SwipeBackLayout.this.f48808x));
            if (1 == i) {
                C88718b.m110681c("MicroMsg.SwipeBackLayout", "ashutest:: on drag", new Object[0]);
                if (SwipeBackLayout.this.getContext() instanceof Activity) {
                    SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                    if (swipeBackLayout.f48810z == null) {
                        swipeBackLayout.f48810z = ((Activity) swipeBackLayout.getContext()).getWindow().getDecorView().getBackground();
                        SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                        if (swipeBackLayout2.f48789C) {
                            ((Activity) swipeBackLayout2.getContext()).getWindow().getDecorView().setBackgroundResource(17170445);
                        }
                    }
                }
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                SwipeBackLayout.C17731b bVar = swipeBackLayout3.f48790D;
                swipeBackLayout3.f48806v = false;
                if (swipeBackLayout3.f48805u) {
                    C114718c.m161370b(0.0f);
                }
            }
            if (i == 0 && !SwipeBackLayout.this.f48808x) {
                C88718b.m110681c("MicroMsg.SwipeBackLayout", "ashutest:: on cancel", new Object[0]);
                SwipeBackLayout swipeBackLayout4 = SwipeBackLayout.this;
                if (swipeBackLayout4.f48790D != null) {
                    if (swipeBackLayout4.getContext() instanceof Activity) {
                        SwipeBackLayout swipeBackLayout5 = SwipeBackLayout.this;
                        if (swipeBackLayout5.f48810z != null) {
                            if (swipeBackLayout5.f48789C) {
                                ((Activity) swipeBackLayout5.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.this.f48810z);
                            }
                            SwipeBackLayout.this.f48810z = null;
                        }
                    }
                    SwipeBackLayout.this.f48790D.getClass();
                }
                C114718c.m161370b(1.0f);
            }
            if (1 == i) {
                SwipeBackLayout swipeBackLayout6 = SwipeBackLayout.this;
                if (swipeBackLayout6.f48803s && (swipeBackLayout6.getContext() instanceof Activity)) {
                    SwipeBackLayout swipeBackLayout7 = SwipeBackLayout.this;
                    if (!swipeBackLayout7.f48805u && !swipeBackLayout7.f48804t) {
                        C88718b.m110681c("MicroMsg.SwipeBackLayout", "ashutest:: match dragging", new Object[0]);
                        SwipeBackLayout swipeBackLayout8 = SwipeBackLayout.this;
                        swipeBackLayout8.f48804t = true;
                        C80847a.m98692a((Activity) swipeBackLayout8.getContext(), dVar);
                    }
                }
            }
            if (2 == i) {
                C88718b.m110681c("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", Integer.valueOf(dVar.f48812b));
                int i2 = dVar.f48812b;
                if (i2 > 0) {
                    z = true;
                }
                C114718c.m161369a(z, i2);
            }
            if (i == 0) {
                this.f48838s = null;
            }
        }
    }

    /* renamed from: m */
    public boolean mo21307m(MotionEvent motionEvent) {
        View f;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo21295a();
        }
        if (this.f48831l == null) {
            this.f48831l = VelocityTracker.obtain();
        }
        this.f48831l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        int pointerId = motionEvent.getPointerId(i);
                        float x = motionEvent.getX(i);
                        float y = motionEvent.getY(i);
                        float f2 = x - this.f48823d[pointerId];
                        mo21303i(f2, y - this.f48824e[pointerId], pointerId);
                        if (this.f48820a == 1) {
                            break;
                        }
                        View f3 = mo21300f((int) x, (int) y);
                        if (f3 != null) {
                            this.f48837r.getClass();
                            this.f48837r.getClass();
                            if ((Math.abs(f2) > ((float) this.f48821b)) && mo21308n(f3, pointerId)) {
                                break;
                            }
                        }
                    }
                    mo21305k(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        mo21304j(x2, y2, pointerId2);
                        int i2 = this.f48820a;
                        if (i2 == 0) {
                            if ((this.f48827h[pointerId2] & this.f48835p) != 0) {
                                this.f48837r.getClass();
                            }
                        } else if (i2 == 2 && (f = mo21300f((int) x2, (int) y2)) == this.f48838s) {
                            mo21308n(f, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        mo21297c(motionEvent.getPointerId(actionIndex));
                    }
                }
            }
            mo21295a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            mo21304j(x3, y3, pointerId3);
            View f4 = mo21300f((int) x3, (int) y3);
            if (f4 == this.f48838s && this.f48820a == 2) {
                mo21308n(f4, pointerId3);
            }
            if ((this.f48827h[pointerId3] & this.f48835p) != 0) {
                this.f48837r.getClass();
            }
        }
        return this.f48820a == 1;
    }

    /* renamed from: n */
    public boolean mo21308n(View view, int i) {
        if (view == this.f48838s && this.f48822c == i) {
            return true;
        }
        if (view != null) {
            C17733d dVar = SwipeBackLayout.this.f48798n;
            if (((dVar.f48830k & (1 << i)) != 0) && (dVar.f48827h[i] & 1) != 0) {
                this.f48822c = i;
                if (view.getParent() == this.f48840u) {
                    this.f48838s = view;
                    this.f48822c = i;
                    this.f48837r.getClass();
                    mo21306l(1);
                    return true;
                }
                throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f48840u + ")");
            }
        }
        return false;
    }
}
