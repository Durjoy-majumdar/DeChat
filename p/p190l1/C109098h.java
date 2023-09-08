package p190l1;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l1.h */
public final class C109098h {

    /* renamed from: a */
    public long f326685a;

    /* renamed from: b */
    public final SparseLongArray f326686b = new SparseLongArray();

    /* renamed from: c */
    public final SparseBooleanArray f326687c = new SparseBooleanArray();

    /* renamed from: d */
    public final List<C109115v> f326688d = new ArrayList();

    /* renamed from: e */
    public int f326689e = -1;

    /* renamed from: f */
    public int f326690f = -1;

    /* JADX WARNING: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p190l1.C109114u mo160342a(android.view.MotionEvent r42, p190l1.C109089d0 r43) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r43
            java.lang.String r3 = "motionEvent"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "positionCalculator"
            gy3.C87412m.m108594g(r2, r3)
            int r3 = r42.getActionMasked()
            r4 = 3
            if (r3 != r4) goto L_0x0023
            android.util.SparseLongArray r1 = r0.f326686b
            r1.clear()
            android.util.SparseBooleanArray r1 = r0.f326687c
            r1.clear()
            r1 = 0
            return r1
        L_0x0023:
            int r5 = r42.getPointerCount()
            r6 = 0
            r7 = 1
            if (r5 == r7) goto L_0x002c
            goto L_0x004a
        L_0x002c:
            int r5 = r1.getToolType(r6)
            int r8 = r42.getSource()
            int r9 = r0.f326689e
            if (r5 != r9) goto L_0x003c
            int r9 = r0.f326690f
            if (r8 == r9) goto L_0x004a
        L_0x003c:
            r0.f326689e = r5
            r0.f326690f = r8
            android.util.SparseBooleanArray r5 = r0.f326687c
            r5.clear()
            android.util.SparseLongArray r5 = r0.f326686b
            r5.clear()
        L_0x004a:
            int r5 = r42.getActionMasked()
            r8 = 1
            r10 = 9
            if (r5 == 0) goto L_0x0072
            r11 = 5
            if (r5 == r11) goto L_0x0072
            if (r5 == r10) goto L_0x005a
            goto L_0x0099
        L_0x005a:
            int r5 = r1.getPointerId(r6)
            android.util.SparseLongArray r11 = r0.f326686b
            int r11 = r11.indexOfKey(r5)
            if (r11 >= 0) goto L_0x0099
            android.util.SparseLongArray r11 = r0.f326686b
            long r12 = r0.f326685a
            long r14 = r12 + r8
            r0.f326685a = r14
            r11.put(r5, r12)
            goto L_0x0099
        L_0x0072:
            int r5 = r42.getActionIndex()
            int r11 = r1.getPointerId(r5)
            android.util.SparseLongArray r12 = r0.f326686b
            int r12 = r12.indexOfKey(r11)
            if (r12 >= 0) goto L_0x0099
            android.util.SparseLongArray r12 = r0.f326686b
            long r13 = r0.f326685a
            long r6 = r8 + r13
            r0.f326685a = r6
            r12.put(r11, r13)
            int r5 = r1.getToolType(r5)
            if (r5 != r4) goto L_0x0099
            android.util.SparseBooleanArray r5 = r0.f326687c
            r6 = 1
            r5.put(r11, r6)
        L_0x0099:
            r5 = 10
            if (r3 == r5) goto L_0x00a5
            r6 = 7
            if (r3 == r6) goto L_0x00a5
            if (r3 != r10) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r6 = 0
            goto L_0x00a6
        L_0x00a5:
            r6 = 1
        L_0x00a6:
            r7 = 8
            if (r3 != r7) goto L_0x00ac
            r11 = 1
            goto L_0x00ad
        L_0x00ac:
            r11 = 0
        L_0x00ad:
            if (r6 == 0) goto L_0x00be
            int r12 = r42.getActionIndex()
            int r12 = r1.getPointerId(r12)
            android.util.SparseBooleanArray r13 = r0.f326687c
            r14 = 1
            r13.put(r12, r14)
            goto L_0x00bf
        L_0x00be:
            r14 = 1
        L_0x00bf:
            r12 = 6
            if (r3 == r14) goto L_0x00cb
            if (r3 == r12) goto L_0x00c6
            r3 = -1
            goto L_0x00cc
        L_0x00c6:
            int r3 = r42.getActionIndex()
            goto L_0x00cc
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            java.util.List<l1.v> r14 = r0.f326688d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            r14.clear()
            int r14 = r42.getPointerCount()
            r15 = 0
        L_0x00d8:
            if (r15 >= r14) goto L_0x0210
            java.util.List<l1.v> r13 = r0.f326688d
            if (r6 != 0) goto L_0x00eb
            if (r15 == r3) goto L_0x00eb
            if (r11 == 0) goto L_0x00e8
            int r16 = r42.getButtonState()
            if (r16 == 0) goto L_0x00eb
        L_0x00e8:
            r26 = 1
            goto L_0x00ed
        L_0x00eb:
            r26 = 0
        L_0x00ed:
            int r12 = r1.getPointerId(r15)
            android.util.SparseLongArray r10 = r0.f326686b
            int r10 = r10.indexOfKey(r12)
            if (r10 < 0) goto L_0x0106
            android.util.SparseLongArray r12 = r0.f326686b
            long r17 = r12.valueAt(r10)
            r33 = r6
            r34 = r11
            r18 = r17
            goto L_0x0117
        L_0x0106:
            r33 = r6
            long r5 = r0.f326685a
            r34 = r11
            long r10 = r5 + r8
            r0.f326685a = r10
            android.util.SparseLongArray r10 = r0.f326686b
            r10.put(r12, r5)
            r18 = r5
        L_0x0117:
            float r5 = r1.getX(r15)
            float r6 = r1.getY(r15)
            long r5 = p1166z0.C112540f.m153745a(r5, r6)
            if (r15 != 0) goto L_0x0136
            float r5 = r42.getRawX()
            float r6 = r42.getRawY()
            long r5 = p1166z0.C112540f.m153745a(r5, r6)
            long r10 = r2.mo144670l(r5)
            goto L_0x0146
        L_0x0136:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r10 < r11) goto L_0x014b
            l1.i r5 = p190l1.C109102i.f326697a
            long r5 = r5.mo160343a(r1, r15)
            long r10 = r2.mo144670l(r5)
        L_0x0146:
            r22 = r5
            r24 = r10
            goto L_0x0153
        L_0x014b:
            long r10 = r2.mo144667i(r5)
            r24 = r5
            r22 = r10
        L_0x0153:
            int r5 = r1.getToolType(r15)
            r6 = 2
            r10 = 4
            if (r5 == 0) goto L_0x0171
            r11 = 1
            if (r5 == r11) goto L_0x016e
            if (r5 == r6) goto L_0x016b
            if (r5 == r4) goto L_0x0168
            if (r5 == r10) goto L_0x0165
            goto L_0x0171
        L_0x0165:
            r27 = 4
            goto L_0x0173
        L_0x0168:
            r27 = 2
            goto L_0x0173
        L_0x016b:
            r27 = 3
            goto L_0x0173
        L_0x016e:
            r27 = 1
            goto L_0x0173
        L_0x0171:
            r27 = 0
        L_0x0173:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r42.getHistorySize()
            r10 = 0
        L_0x017d:
            if (r10 >= r6) goto L_0x01c5
            float r11 = r1.getHistoricalX(r15, r10)
            float r12 = r1.getHistoricalY(r15, r10)
            boolean r20 = java.lang.Float.isInfinite(r11)
            if (r20 != 0) goto L_0x0196
            boolean r20 = java.lang.Float.isNaN(r11)
            if (r20 != 0) goto L_0x0196
            r20 = 1
            goto L_0x0198
        L_0x0196:
            r20 = 0
        L_0x0198:
            if (r20 == 0) goto L_0x01c1
            boolean r20 = java.lang.Float.isInfinite(r12)
            if (r20 != 0) goto L_0x01a9
            boolean r20 = java.lang.Float.isNaN(r12)
            if (r20 != 0) goto L_0x01a9
            r20 = 1
            goto L_0x01ab
        L_0x01a9:
            r20 = 0
        L_0x01ab:
            if (r20 == 0) goto L_0x01c1
            l1.e r4 = new l1.e
            long r36 = r1.getHistoricalEventTime(r10)
            long r38 = p1166z0.C112540f.m153745a(r11, r12)
            r40 = 0
            r35 = r4
            r35.<init>(r36, r38, r40)
            r5.add(r4)
        L_0x01c1:
            int r10 = r10 + 1
            r4 = 3
            goto L_0x017d
        L_0x01c5:
            int r4 = r42.getActionMasked()
            if (r4 != r7) goto L_0x01dd
            r4 = 10
            float r6 = r1.getAxisValue(r4)
            r10 = 9
            float r11 = r1.getAxisValue(r10)
            float r11 = -r11
            long r11 = p1166z0.C112540f.m153745a(r6, r11)
            goto L_0x01e3
        L_0x01dd:
            r4 = 10
            r10 = 9
            long r11 = p1166z0.C112539e.f336955b
        L_0x01e3:
            r30 = r11
            android.util.SparseBooleanArray r6 = r0.f326687c
            int r11 = r1.getPointerId(r15)
            r12 = 0
            boolean r28 = r6.get(r11, r12)
            l1.v r11 = new l1.v
            long r20 = r42.getEventTime()
            r32 = 0
            r17 = r11
            r29 = r5
            r17.<init>(r18, r20, r22, r24, r26, r27, r28, r29, r30, r32)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.add(r11)
            int r15 = r15 + 1
            r6 = r33
            r11 = r34
            r4 = 3
            r5 = 10
            r12 = 6
            goto L_0x00d8
        L_0x0210:
            int r2 = r42.getActionMasked()
            r3 = 1
            if (r2 == r3) goto L_0x021c
            r3 = 6
            if (r2 == r3) goto L_0x021c
            r6 = 0
            goto L_0x0237
        L_0x021c:
            int r2 = r42.getActionIndex()
            int r2 = r1.getPointerId(r2)
            android.util.SparseBooleanArray r3 = r0.f326687c
            r6 = 0
            boolean r3 = r3.get(r2, r6)
            if (r3 != 0) goto L_0x0237
            android.util.SparseLongArray r3 = r0.f326686b
            r3.delete(r2)
            android.util.SparseBooleanArray r3 = r0.f326687c
            r3.delete(r2)
        L_0x0237:
            android.util.SparseLongArray r2 = r0.f326686b
            int r2 = r2.size()
            int r3 = r42.getPointerCount()
            if (r2 <= r3) goto L_0x0276
            android.util.SparseLongArray r2 = r0.f326686b
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            r4 = -1
        L_0x024c:
            if (r4 >= r2) goto L_0x0276
            android.util.SparseLongArray r5 = r0.f326686b
            int r5 = r5.keyAt(r2)
            int r7 = r42.getPointerCount()
            r8 = 0
        L_0x0259:
            if (r8 >= r7) goto L_0x0266
            int r9 = r1.getPointerId(r8)
            if (r9 != r5) goto L_0x0263
            r7 = 1
            goto L_0x0267
        L_0x0263:
            int r8 = r8 + 1
            goto L_0x0259
        L_0x0266:
            r7 = 0
        L_0x0267:
            if (r7 != 0) goto L_0x0273
            android.util.SparseLongArray r7 = r0.f326686b
            r7.removeAt(r2)
            android.util.SparseBooleanArray r7 = r0.f326687c
            r7.delete(r5)
        L_0x0273:
            int r2 = r2 + -1
            goto L_0x024c
        L_0x0276:
            l1.u r2 = new l1.u
            long r3 = r42.getEventTime()
            java.util.List<l1.v> r5 = r0.f326688d
            r2.<init>(r3, r5, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p190l1.C109098h.mo160342a(android.view.MotionEvent, l1.d0):l1.u");
    }
}
