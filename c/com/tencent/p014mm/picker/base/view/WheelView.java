package com.tencent.p014mm.picker.base.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.concurrent.Future;
import k20.C9556a;
import kf0.C21332b;
import lf0.C21424a;
import lf0.C21425b;
import mf0.C117553a;
import mf0.C117554b;
import mf0.C21500d;
import mf0.C21501e;
import pf0.C21966a;

/* renamed from: com.tencent.mm.picker.base.view.WheelView */
public class WheelView extends View {

    /* renamed from: A */
    public boolean f49123A;

    /* renamed from: B */
    public float f49124B;

    /* renamed from: C */
    public float f49125C;

    /* renamed from: D */
    public float f49126D;

    /* renamed from: E */
    public int f49127E;

    /* renamed from: F */
    public int f49128F;

    /* renamed from: G */
    public int f49129G;

    /* renamed from: H */
    public int f49130H;

    /* renamed from: I */
    public int f49131I;

    /* renamed from: J */
    public int f49132J;

    /* renamed from: K */
    public int f49133K;

    /* renamed from: L */
    public float f49134L;

    /* renamed from: M */
    public long f49135M;

    /* renamed from: N */
    public int f49136N;

    /* renamed from: P */
    public int f49137P;

    /* renamed from: Q */
    public int f49138Q;

    /* renamed from: R */
    public Context f49139R;

    /* renamed from: S */
    public Rect f49140S;

    /* renamed from: d */
    public int f49141d;

    /* renamed from: e */
    public int f49142e;

    /* renamed from: f */
    public int f49143f;

    /* renamed from: g */
    public Handler f49144g;

    /* renamed from: h */
    public GestureDetector f49145h;

    /* renamed from: i */
    public C21425b f49146i;

    /* renamed from: j */
    public String f49147j;

    /* renamed from: n */
    public boolean f49148n;

    /* renamed from: o */
    public boolean f49149o;

    /* renamed from: p */
    public final C117554b f49150p;

    /* renamed from: q */
    public Future<?> f49151q;

    /* renamed from: r */
    public Paint f49152r;

    /* renamed from: s */
    public Paint f49153s;

    /* renamed from: t */
    public C21332b<?> f49154t;

    /* renamed from: u */
    public String f49155u;

    /* renamed from: v */
    public int f49156v;

    /* renamed from: w */
    public int f49157w;

    /* renamed from: x */
    public float f49158x;

    /* renamed from: y */
    public int f49159y;

    /* renamed from: z */
    public boolean f49160z;

    /* renamed from: com.tencent.mm.picker.base.view.WheelView$a */
    public enum C17836a {
        CLICK,
        FLING,
        DAGGLE
    }

    /* renamed from: com.tencent.mm.picker.base.view.WheelView$b */
    public enum C17837b {
        FILL
    }

    public WheelView(Context context) {
        this(context, (AttributeSet) null);
        this.f49139R = context;
    }

    /* renamed from: a */
    public void mo22028a() {
        Future<?> future = this.f49151q;
        if (future != null && !future.isCancelled()) {
            this.f49151q.cancel(true);
            this.f49151q = null;
        }
    }

    /* renamed from: b */
    public final String mo22029b(int i) {
        if (this.f49160z) {
            int itemsCount = this.f49154t.getItemsCount();
            if (itemsCount == 0) {
                i = itemsCount;
            } else {
                i %= itemsCount;
                if (i < 0) {
                    i += itemsCount;
                }
            }
        }
        return this.f49154t.mo33223a(i);
    }

    /* renamed from: c */
    public final boolean mo22030c() {
        return this.f49152r.measureText(this.f49147j) <= ((float) ((this.f49132J - getPaddingLeft()) - getPaddingRight()));
    }

    /* renamed from: d */
    public final void mo22031d() {
        if (this.f49154t != null) {
            float paddingBottom = (float) (this.f49141d + getPaddingBottom() + getPaddingTop());
            this.f49158x = paddingBottom;
            this.f49131I = (int) (paddingBottom * ((float) this.f49130H));
            this.f49132J = View.MeasureSpec.getSize(this.f49136N);
            int i = this.f49131I;
            float f = this.f49158x;
            this.f49124B = (((float) i) - f) / 2.0f;
            this.f49125C = (((float) i) + f) / 2.0f;
            if (this.f49127E == -1) {
                if (this.f49160z) {
                    this.f49127E = (this.f49154t.getItemsCount() + 1) / 2;
                } else {
                    this.f49127E = 0;
                }
            }
            this.f49129G = this.f49127E;
        }
    }

    /* renamed from: e */
    public WheelView mo22032e(int i) {
        this.f49142e = i;
        this.f49152r.setColor(i);
        this.f49143f = (int) ((((float) ((i >> 24) & 255)) / 255.0f) * 255.0f);
        return this;
    }

    /* renamed from: f */
    public void mo22033f(C17836a aVar) {
        mo22028a();
        if (aVar == C17836a.FLING || aVar == C17836a.DAGGLE) {
            float f = this.f49126D;
            float f2 = this.f49158x;
            int i = (int) (((f % f2) + f2) % f2);
            this.f49133K = i;
            if (((float) i) > f2 / 2.0f) {
                this.f49133K = (int) (f2 - ((float) i));
            } else {
                this.f49133K = -i;
            }
        }
        this.f49151q = this.f49150p.mo109820a(new C21501e(this, this.f49133K), 0, 10);
    }

    public final C21332b getAdapter() {
        return this.f49154t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = r3.f49128F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getCurrentItem() {
        /*
            r3 = this;
            kf0.b<?> r0 = r3.f49154t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r3.f49123A
            if (r2 == 0) goto L_0x0010
            int r2 = r3.f49128F
            if (r2 != 0) goto L_0x0010
            r0 = -1
            return r0
        L_0x0010:
            boolean r2 = r3.f49160z
            if (r2 == 0) goto L_0x0040
            int r2 = r3.f49128F
            if (r2 < 0) goto L_0x001e
            int r0 = r0.getItemsCount()
            if (r2 < r0) goto L_0x0040
        L_0x001e:
            int r0 = r3.f49128F
            int r0 = java.lang.Math.abs(r0)
            kf0.b<?> r2 = r3.f49154t
            int r2 = r2.getItemsCount()
            int r0 = r0 - r2
            int r0 = java.lang.Math.abs(r0)
            kf0.b<?> r2 = r3.f49154t
            int r2 = r2.getItemsCount()
            int r2 = r2 + -1
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0040:
            int r0 = r3.f49128F
            kf0.b<?> r2 = r3.f49154t
            int r2 = r2.getItemsCount()
            int r2 = r2 + -1
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.picker.base.view.WheelView.getCurrentItem():int");
    }

    public Handler getHandler() {
        return this.f49144g;
    }

    public int getInitPosition() {
        return this.f49127E;
    }

    public float getItemHeight() {
        return this.f49158x;
    }

    public int getItemsCount() {
        C21332b<?> bVar = this.f49154t;
        if (bVar != null) {
            return bVar.getItemsCount();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f49126D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r0 = r20
            super.onDraw(r21)
            kf0.b<?> r1 = r0.f49154t
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            int r1 = r0.f49127E
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            kf0.b<?> r3 = r0.f49154t
            int r3 = r3.getItemsCount()
            r4 = 1
            int r3 = r3 - r4
            int r1 = java.lang.Math.min(r1, r3)
            r0.f49127E = r1
            int r3 = r0.f49130H
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            float r7 = r0.f49126D
            float r8 = r0.f49158x
            float r7 = r7 / r8
            int r7 = (int) r7
            kf0.b<?> r8 = r0.f49154t     // Catch:{ ArithmeticException -> 0x003e }
            int r8 = r8.getItemsCount()     // Catch:{ ArithmeticException -> 0x003e }
            int r7 = r7 % r8
            int r1 = r1 + r7
            r0.f49129G = r1     // Catch:{ ArithmeticException -> 0x003e }
            goto L_0x0048
        L_0x003e:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r7 = "WheelView"
            java.lang.String r8 = "出错了！adapter.getItemsCount() == 0，联动数据不匹配"
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r7, r8, r1)
        L_0x0048:
            boolean r1 = r0.f49160z
            if (r1 != 0) goto L_0x0067
            int r1 = r0.f49129G
            if (r1 >= 0) goto L_0x0052
            r0.f49129G = r2
        L_0x0052:
            int r1 = r0.f49129G
            kf0.b<?> r7 = r0.f49154t
            int r7 = r7.getItemsCount()
            int r7 = r7 - r4
            if (r1 <= r7) goto L_0x008c
            kf0.b<?> r1 = r0.f49154t
            int r1 = r1.getItemsCount()
            int r1 = r1 - r4
            r0.f49129G = r1
            goto L_0x008c
        L_0x0067:
            int r1 = r0.f49129G
            if (r1 >= 0) goto L_0x0076
            kf0.b<?> r1 = r0.f49154t
            int r1 = r1.getItemsCount()
            int r7 = r0.f49129G
            int r1 = r1 + r7
            r0.f49129G = r1
        L_0x0076:
            int r1 = r0.f49129G
            kf0.b<?> r7 = r0.f49154t
            int r7 = r7.getItemsCount()
            int r7 = r7 - r4
            if (r1 <= r7) goto L_0x008c
            int r1 = r0.f49129G
            kf0.b<?> r7 = r0.f49154t
            int r7 = r7.getItemsCount()
            int r1 = r1 - r7
            r0.f49129G = r1
        L_0x008c:
            float r1 = r0.f49126D
            float r7 = r0.f49158x
            float r1 = r1 % r7
            r7 = 0
        L_0x0092:
            int r8 = r0.f49130H
            if (r7 >= r8) goto L_0x00b8
            int r9 = r0.f49129G
            int r8 = r8 / 2
            int r8 = r8 - r7
            int r9 = r9 - r8
            if (r7 != 0) goto L_0x00a4
            int r5 = r9 + -1
            java.lang.String r5 = r0.mo22029b(r5)
        L_0x00a4:
            int r8 = r0.f49130H
            int r8 = r8 - r4
            if (r7 != r8) goto L_0x00af
            int r6 = r9 + 1
            java.lang.String r6 = r0.mo22029b(r6)
        L_0x00af:
            java.lang.String r8 = r0.mo22029b(r9)
            r3[r7] = r8
            int r7 = r7 + 1
            goto L_0x0092
        L_0x00b8:
            r9 = 0
            float r12 = r0.f49124B
            int r7 = r0.f49132J
            float r11 = (float) r7
            android.graphics.Paint r13 = r0.f49153s
            r8 = r21
            r10 = r12
            r8.drawLine(r9, r10, r11, r12, r13)
            r15 = 0
            float r7 = r0.f49125C
            int r8 = r0.f49132J
            float r8 = (float) r8
            android.graphics.Paint r9 = r0.f49153s
            r14 = r21
            r16 = r7
            r17 = r8
            r18 = r7
            r19 = r9
            r14.drawLine(r15, r16, r17, r18, r19)
            r7 = 0
        L_0x00dc:
            int r8 = r0.f49130H
            int r8 = r8 + 2
            if (r7 >= r8) goto L_0x0349
            if (r7 != 0) goto L_0x00e6
            r8 = r5
            goto L_0x00f0
        L_0x00e6:
            int r8 = r8 + -1
            if (r7 != r8) goto L_0x00ec
            r8 = r6
            goto L_0x00f0
        L_0x00ec:
            int r8 = r7 + -1
            r8 = r3[r8]
        L_0x00f0:
            float r9 = r0.f49158x
            float r10 = (float) r7
            float r10 = r10 * r9
            float r10 = r10 - r1
            r11 = 1073741824(0x40000000, float:2.0)
            float r12 = r9 / r11
            float r10 = r10 + r12
            float r10 = r10 - r9
            boolean r9 = r0.f49149o
            java.lang.String r12 = ""
            if (r9 != 0) goto L_0x014e
            java.lang.String r9 = r0.f49155u
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x014e
            if (r8 != 0) goto L_0x010e
            r9 = r12
            goto L_0x0112
        L_0x010e:
            java.lang.String r9 = r8.toString()
        L_0x0112:
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x014e
            boolean r9 = r0.f49123A
            if (r9 == 0) goto L_0x0132
            android.content.Context r9 = r0.f49139R
            r13 = 2131834003(0x7f113493, float:1.9301104E38)
            java.lang.String r9 = r9.getString(r13)
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0132
            java.lang.String r8 = r8.toString()
            r0.f49147j = r8
            goto L_0x0158
        L_0x0132:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            if (r8 != 0) goto L_0x013b
            r8 = r12
            goto L_0x013f
        L_0x013b:
            java.lang.String r8 = r8.toString()
        L_0x013f:
            r9.append(r8)
            java.lang.String r8 = r0.f49155u
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r0.f49147j = r8
            goto L_0x0158
        L_0x014e:
            if (r8 != 0) goto L_0x0152
            r8 = r12
            goto L_0x0156
        L_0x0152:
            java.lang.String r8 = r8.toString()
        L_0x0156:
            r0.f49147j = r8
        L_0x0158:
            android.graphics.Paint r8 = r0.f49152r
            java.lang.String r9 = r0.f49147j
            int r13 = r9.length()
            android.graphics.Rect r14 = r0.f49140S
            r8.getTextBounds(r9, r2, r13, r14)
            int r8 = r0.f49137P
            r9 = 3
            if (r8 == r9) goto L_0x02b8
            r9 = 5
            if (r8 == r9) goto L_0x02ac
            r9 = 17
            if (r8 == r9) goto L_0x0173
            goto L_0x02ba
        L_0x0173:
            boolean r8 = r0.f49148n
            if (r8 != 0) goto L_0x0199
            java.lang.String r8 = r0.f49155u
            if (r8 == 0) goto L_0x0199
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0199
            boolean r8 = r0.f49149o
            if (r8 != 0) goto L_0x0186
            goto L_0x0199
        L_0x0186:
            int r8 = r0.f49132J
            android.graphics.Rect r9 = r0.f49140S
            int r9 = r9.width()
            int r8 = r8 - r9
            double r8 = (double) r8
            r12 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r8 = r8 * r12
            int r8 = (int) r8
            r0.f49138Q = r8
            goto L_0x02ba
        L_0x0199:
            int r8 = r0.f49132J
            android.graphics.Rect r9 = r0.f49140S
            int r9 = r9.width()
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r8 >= r9) goto L_0x029c
            int r8 = r0.f49156v
            android.graphics.Paint r9 = r0.f49152r
            float r14 = (float) r8
            r9.setTextSize(r14)
        L_0x01ad:
            int r9 = r0.f49157w
            if (r8 <= r9) goto L_0x01c0
            boolean r9 = r20.mo22030c()
            if (r9 != 0) goto L_0x01c0
            int r8 = r8 + -1
            android.graphics.Paint r9 = r0.f49152r
            float r14 = (float) r8
            r9.setTextSize(r14)
            goto L_0x01ad
        L_0x01c0:
            boolean r8 = r20.mo22030c()
            if (r8 != 0) goto L_0x027f
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.graphics.Paint r9 = r0.f49152r
            java.lang.String r14 = r0.f49147j
            int r15 = r14.length()
            r9.getTextBounds(r14, r2, r15, r8)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.graphics.Paint r9 = r0.f49152r
            java.lang.String r14 = r0.f49147j
            r9.getTextBounds(r14, r2, r2, r8)
            java.lang.String r8 = r0.f49147j
            int r8 = r8.length()
            r9 = 0
        L_0x01e9:
            int r14 = r8 - r9
            if (r14 <= r4) goto L_0x022c
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            int r14 = r14 >> 1
            int r14 = r14 + r9
            android.graphics.Paint r4 = r0.f49152r
            java.lang.String r11 = r0.f49147j
            r4.getTextBounds(r11, r2, r14, r15)
            int r4 = r15.width()
            int r11 = r0.f49132J
            int r18 = r20.getPaddingLeft()
            int r11 = r11 - r18
            int r18 = r20.getPaddingRight()
            int r11 = r11 - r18
            if (r4 < r11) goto L_0x0214
            int r14 = r14 + -1
            r8 = r14
            goto L_0x0228
        L_0x0214:
            int r4 = r15.width()
            int r11 = r0.f49132J
            int r15 = r20.getPaddingLeft()
            int r11 = r11 - r15
            int r15 = r20.getPaddingRight()
            int r11 = r11 - r15
            if (r4 >= r11) goto L_0x0228
            int r9 = r14 + 1
        L_0x0228:
            r4 = 1
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e9
        L_0x022c:
            java.lang.String r4 = r0.f49147j
            java.lang.String r4 = r4.substring(r2, r9)
            r0.f49147j = r4
        L_0x0234:
            android.graphics.Paint r4 = r0.f49152r
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = r0.f49147j
            r8.append(r11)
            java.lang.String r11 = "..."
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            float r4 = r4.measureText(r8)
            int r8 = r0.f49132J
            int r14 = r20.getPaddingLeft()
            int r8 = r8 - r14
            int r14 = r20.getPaddingRight()
            int r8 = r8 - r14
            float r8 = (float) r8
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x026c
            int r9 = r9 + -1
            if (r9 > 0) goto L_0x0263
            goto L_0x026c
        L_0x0263:
            java.lang.String r4 = r0.f49147j
            java.lang.String r4 = r4.substring(r2, r9)
            r0.f49147j = r4
            goto L_0x0234
        L_0x026c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = r0.f49147j
            r4.append(r8)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            r0.f49147j = r4
        L_0x027f:
            android.graphics.Paint r4 = r0.f49152r
            java.lang.String r8 = r0.f49147j
            int r9 = r8.length()
            android.graphics.Rect r11 = r0.f49140S
            r4.getTextBounds(r8, r2, r9, r11)
            int r4 = r0.f49132J
            android.graphics.Rect r8 = r0.f49140S
            int r8 = r8.width()
            int r4 = r4 - r8
            double r8 = (double) r4
            double r8 = r8 * r12
            int r4 = (int) r8
            r0.f49138Q = r4
            goto L_0x02ba
        L_0x029c:
            int r4 = r0.f49132J
            android.graphics.Rect r8 = r0.f49140S
            int r8 = r8.width()
            int r4 = r4 - r8
            double r8 = (double) r4
            double r8 = r8 * r12
            int r4 = (int) r8
            r0.f49138Q = r4
            goto L_0x02ba
        L_0x02ac:
            int r4 = r0.f49132J
            android.graphics.Rect r8 = r0.f49140S
            int r8 = r8.width()
            int r4 = r4 - r8
            r0.f49138Q = r4
            goto L_0x02ba
        L_0x02b8:
            r0.f49138Q = r2
        L_0x02ba:
            int r4 = r0.f49131I
            float r4 = (float) r4
            r8 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r8
            float r8 = r10 - r4
            float r8 = r8 / r4
            float r4 = java.lang.Math.abs(r8)
            android.view.animation.AccelerateInterpolator r8 = new android.view.animation.AccelerateInterpolator
            r9 = 1050253722(0x3e99999a, float:0.3)
            r8.<init>(r9)
            float r4 = r8.getInterpolation(r4)
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 - r4
            int r4 = r0.f49143f
            float r9 = (float) r4
            float r8 = r8 * r9
            int r8 = (int) r8
            float r11 = (float) r8
            r12 = 1041194025(0x3e0f5c29, float:0.14)
            float r9 = r9 * r12
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x02e8
            int r4 = (int) r9
            goto L_0x02ec
        L_0x02e8:
            if (r8 <= r4) goto L_0x02eb
            goto L_0x02ec
        L_0x02eb:
            r4 = r8
        L_0x02ec:
            android.graphics.Paint r8 = r0.f49152r
            r8.setAlpha(r4)
            float r4 = r0.f49124B
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x030a
            float r4 = r0.f49125C
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x030a
            int r4 = r0.f49129G
            int r8 = r0.f49130H
            int r8 = r8 / 2
            int r8 = r8 - r7
            int r4 = r4 - r8
            r8 = 1
            int r4 = r4 - r8
            r0.f49128F = r4
            goto L_0x030b
        L_0x030a:
            r8 = 1
        L_0x030b:
            r4 = 0
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x033a
            int r4 = r0.f49131I
            float r4 = (float) r4
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x033a
            java.lang.String r4 = r0.f49147j
            int r9 = r0.f49138Q
            float r9 = (float) r9
            android.graphics.Paint r11 = r0.f49152r
            android.graphics.Paint$FontMetricsInt r11 = r11.getFontMetricsInt()
            int r12 = r11.top
            int r12 = java.lang.Math.abs(r12)
            float r12 = (float) r12
            int r11 = r11.bottom
            float r11 = (float) r11
            float r10 = r10 - r11
            float r12 = r12 + r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r11
            float r10 = r10 + r12
            android.graphics.Paint r11 = r0.f49152r
            r12 = r21
            r12.drawText(r4, r9, r10, r11)
            goto L_0x033c
        L_0x033a:
            r12 = r21
        L_0x033c:
            int r7 = r7 + 1
            android.graphics.Paint r4 = r0.f49152r
            int r9 = r0.f49156v
            float r9 = (float) r9
            r4.setTextSize(r9)
            r4 = 1
            goto L_0x00dc
        L_0x0349:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.picker.base.view.WheelView.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i, int i2) {
        this.f49136N = i;
        mo22031d();
        setMeasuredDimension(this.f49132J, this.f49131I);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f49145h;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/picker/base/view/WheelView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean z = false;
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/picker/base/view/WheelView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        float f = ((float) (-this.f49127E)) * this.f49158x;
        float itemsCount = ((float) ((this.f49154t.getItemsCount() - 1) - this.f49127E)) * this.f49158x;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f49135M = System.currentTimeMillis();
            mo22028a();
            this.f49134L = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f49134L - motionEvent.getRawY();
            this.f49134L = motionEvent.getRawY();
            float f2 = this.f49126D + rawY;
            this.f49126D = f2;
            if (!this.f49160z) {
                float f3 = this.f49158x;
                if ((f2 - (f3 * 0.25f) < f && rawY < 0.0f) || ((f3 * 0.25f) + f2 > itemsCount && rawY > 0.0f)) {
                    this.f49126D = f2 - rawY;
                    z = true;
                }
            }
        } else if (!onTouchEvent) {
            if (System.currentTimeMillis() - this.f49135M > 120) {
                mo22033f(C17836a.DAGGLE);
            } else {
                int y = (int) (motionEvent.getY() - (((float) this.f49131I) / 2.0f));
                int i = (int) (y > 0 ? ((float) y) + (this.f49158x / 2.0f) : ((float) y) - (this.f49158x / 2.0f));
                float f4 = this.f49158x;
                if (f4 != 0.0f) {
                    this.f49133K = (int) (((float) ((int) (((float) i) / f4))) * f4);
                    mo22033f(C17836a.CLICK);
                }
            }
        }
        if (!z && motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(C21332b<?> bVar) {
        this.f49154t = bVar;
        mo22031d();
        invalidate();
    }

    public final void setCurrentItem(int i) {
        this.f49128F = i;
        this.f49127E = i;
        this.f49126D = 0.0f;
        String b = mo22029b(getCurrentItem());
        String obj = b == null ? "" : b.toString();
        if (!TextUtils.isEmpty(obj)) {
            setContentDescription(obj);
        }
        invalidate();
    }

    public final void setCyclic(boolean z) {
        this.f49160z = z;
    }

    public void setDividerColor(int i) {
        if (i != 0) {
            this.f49159y = i;
            this.f49153s.setColor(i);
        }
    }

    public void setDividerHeight(float f) {
        this.f49153s.setStrokeWidth(f);
    }

    public void setGravity(int i) {
        this.f49137P = i;
    }

    public void setIsOptions(boolean z) {
        this.f49148n = z;
    }

    public void setLabel(String str) {
        this.f49155u = str;
    }

    public void setLongTermMonthDay(boolean z) {
    }

    public void setLongTermYear(boolean z) {
        this.f49123A = z;
    }

    public final void setOnItemSelectedListener(C21425b bVar) {
        this.f49146i = bVar;
    }

    public void setTotalScrollY(float f) {
        this.f49126D = f;
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49141d = 0;
        this.f49142e = Color.rgb(255, 255, 255);
        this.f49147j = "";
        this.f49148n = false;
        this.f49149o = true;
        if (C21966a.f62183p == null) {
            C21966a.f62183p = new C117553a();
        }
        this.f49150p = C21966a.f62183p;
        this.f49130H = 5;
        this.f49133K = 0;
        this.f49134L = 0.0f;
        this.f49135M = 0;
        this.f49137P = 17;
        this.f49138Q = 0;
        this.f49140S = new Rect();
        this.f49139R = context;
        this.f49156v = getResources().getDimensionPixelSize(C0966R.dimen.ajf);
        this.f49157w = getResources().getDimensionPixelSize(C0966R.dimen.aje);
        this.f49137P = 17;
        this.f49159y = -2763307;
        this.f49144g = new C21500d(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C21424a(this));
        this.f49145h = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f49160z = true;
        this.f49126D = 0.0f;
        this.f49127E = -1;
        Paint paint = new Paint();
        this.f49152r = paint;
        paint.setColor(this.f49142e);
        this.f49152r.setAntiAlias(true);
        this.f49152r.setTextSize((float) this.f49156v);
        Paint paint2 = new Paint();
        this.f49153s = paint2;
        paint2.setColor(this.f49159y);
        this.f49153s.setAntiAlias(true);
        setLayerType(2, (Paint) null);
    }
}
