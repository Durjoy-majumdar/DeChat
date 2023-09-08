package com.tencent.p014mm.p136ui;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.g4 */
public class C57839g4 extends TouchDelegate {

    /* renamed from: c */
    public static final Rect f165466c = new Rect();

    /* renamed from: a */
    public ArrayList<C57840h4> f165467a;

    /* renamed from: b */
    public C57840h4 f165468b;

    public C57839g4(View view) {
        super(f165466c, view);
    }

    /* renamed from: a */
    public void mo82266a(C57840h4 h4Var) {
        if (this.f165467a == null) {
            this.f165467a = new ArrayList<>();
        }
        this.f165467a.add(h4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 != 3) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getAction()
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0023
            if (r2 == r6) goto L_0x001b
            if (r2 == r3) goto L_0x0018
            r3 = 3
            if (r2 == r3) goto L_0x001b
        L_0x0015:
            r2 = 0
            goto L_0x00dc
        L_0x0018:
            com.tencent.mm.ui.h4 r4 = r0.f165468b
            goto L_0x0020
        L_0x001b:
            com.tencent.mm.ui.h4 r2 = r0.f165468b
            r0.f165468b = r4
            r4 = r2
        L_0x0020:
            r2 = 0
            goto L_0x00dd
        L_0x0023:
            java.util.ArrayList<com.tencent.mm.ui.h4> r2 = r0.f165467a
            if (r2 == 0) goto L_0x0015
            float r2 = r18.getX()
            float r7 = r18.getY()
            java.util.ArrayList<com.tencent.mm.ui.h4> r8 = r0.f165467a
            java.util.Iterator r8 = r8.iterator()
            r9 = r4
        L_0x0036:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0058
            java.lang.Object r10 = r8.next()
            com.tencent.mm.ui.h4 r10 = (com.tencent.p014mm.p136ui.C57840h4) r10
            r1.setLocation(r2, r7)
            if (r10 == 0) goto L_0x0036
            boolean r11 = r10.onTouchEvent(r1)
            if (r11 == 0) goto L_0x0036
            if (r9 != 0) goto L_0x0054
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0054:
            r9.add(r10)
            goto L_0x0036
        L_0x0058:
            r1.setLocation(r2, r7)
            if (r9 != 0) goto L_0x0060
        L_0x005d:
            r2 = 0
            goto L_0x00d6
        L_0x0060:
            int r2 = r9.size()
            if (r2 >= r6) goto L_0x0067
            goto L_0x005d
        L_0x0067:
            if (r2 != r6) goto L_0x0071
            java.lang.Object r2 = r9.get(r5)
            com.tencent.mm.ui.h4 r2 = (com.tencent.p014mm.p136ui.C57840h4) r2
            r4 = r2
            goto L_0x005d
        L_0x0071:
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = r4
            r10 = 0
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x0079:
            if (r10 >= r2) goto L_0x00c9
            java.lang.Object r12 = r9.get(r10)
            com.tencent.mm.ui.h4 r12 = (com.tencent.p014mm.p136ui.C57840h4) r12
            r12.getClass()
            int[] r13 = new int[r3]
            android.view.View r14 = r12.f165469a
            r14.getLocationOnScreen(r13)
            r14 = r13[r5]
            android.view.View r15 = r12.f165469a
            int r15 = r15.getWidth()
            int r15 = r15 / r3
            int r14 = r14 + r15
            r13 = r13[r6]
            android.view.View r15 = r12.f165469a
            int r15 = r15.getHeight()
            int r15 = r15 / r3
            int r13 = r13 + r15
            float r15 = r18.getRawX()
            float r14 = (float) r14
            float r15 = r15 - r14
            double r14 = (double) r15
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r14, r3)
            float r16 = r18.getRawY()
            float r13 = (float) r13
            float r13 = r16 - r13
            double r5 = (double) r13
            double r3 = java.lang.Math.pow(r5, r3)
            double r14 = r14 + r3
            double r3 = java.lang.Math.sqrt(r14)
            int r3 = (int) r3
            if (r3 >= r11) goto L_0x00c2
            r11 = r3
            r8 = r12
        L_0x00c2:
            int r10 = r10 + 1
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            goto L_0x0079
        L_0x00c9:
            if (r11 != r7) goto L_0x00d4
            r2 = 0
            java.lang.Object r3 = r9.get(r2)
            com.tencent.mm.ui.h4 r3 = (com.tencent.p014mm.p136ui.C57840h4) r3
            r4 = r3
            goto L_0x00d6
        L_0x00d4:
            r2 = 0
            r4 = r8
        L_0x00d6:
            if (r4 == 0) goto L_0x00dc
            r0.f165468b = r4
            r1 = 1
            return r1
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            if (r4 != 0) goto L_0x00e1
            r5 = 0
            goto L_0x00e5
        L_0x00e1:
            boolean r5 = r4.onTouchEvent(r1)
        L_0x00e5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C57839g4.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
