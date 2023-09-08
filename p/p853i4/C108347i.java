package p853i4;

/* renamed from: i4.i */
public class C108347i extends C108338b0 {

    /* renamed from: b */
    public int f324374b = 80;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r6 != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (r6 != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r8 = 5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0102  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo158802a(android.view.ViewGroup r19, androidx.transition.Transition r20, p853i4.C108353o r21, p853i4.C108353o r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 0
            if (r2 != 0) goto L_0x000d
            if (r22 != 0) goto L_0x000d
            return r3
        L_0x000d:
            androidx.transition.Transition$d r5 = r1.f306711F
            if (r5 != 0) goto L_0x0013
            r5 = 0
            goto L_0x0017
        L_0x0013:
            android.graphics.Rect r5 = r5.mo145345a(r1)
        L_0x0017:
            r6 = 1
            if (r22 == 0) goto L_0x0039
            r7 = 8
            if (r2 != 0) goto L_0x001f
            goto L_0x0032
        L_0x001f:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f324391a
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.String r9 = "android:visibilityPropagation:visibility"
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            int r7 = r8.intValue()
        L_0x0032:
            if (r7 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r2 = r22
            r7 = 1
            goto L_0x003a
        L_0x0039:
            r7 = -1
        L_0x003a:
            r8 = 0
            int r9 = p853i4.C108338b0.m146753b(r2, r8)
            int r2 = p853i4.C108338b0.m146753b(r2, r6)
            r10 = 2
            int[] r11 = new int[r10]
            r12 = r19
            r12.getLocationOnScreen(r11)
            r13 = r11[r8]
            float r14 = r19.getTranslationX()
            int r14 = java.lang.Math.round(r14)
            int r13 = r13 + r14
            r11 = r11[r6]
            float r14 = r19.getTranslationY()
            int r14 = java.lang.Math.round(r14)
            int r11 = r11 + r14
            int r14 = r19.getWidth()
            int r14 = r14 + r13
            int r15 = r19.getHeight()
            int r15 = r15 + r11
            if (r5 == 0) goto L_0x0076
            int r10 = r5.centerX()
            int r5 = r5.centerY()
            goto L_0x0082
        L_0x0076:
            int r5 = r13 + r14
            int r5 = r5 / r10
            int r16 = r11 + r15
            int r10 = r16 / 2
            r17 = r10
            r10 = r5
            r5 = r17
        L_0x0082:
            int r8 = r0.f324374b
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3 = 3
            if (r8 != r4) goto L_0x0097
            java.util.WeakHashMap<android.view.View, e3.a0> r8 = p849e3.C107207u.f320808a
            int r8 = p849e3.C107207u.C107209c.m145195d(r19)
            if (r8 != r6) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r6 = 0
        L_0x0094:
            if (r6 == 0) goto L_0x00a8
            goto L_0x00aa
        L_0x0097:
            r4 = 8388613(0x800005, float:1.175495E-38)
            if (r8 != r4) goto L_0x00ab
            java.util.WeakHashMap<android.view.View, e3.a0> r4 = p849e3.C107207u.f320808a
            int r4 = p849e3.C107207u.C107209c.m145195d(r19)
            if (r4 != r6) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00aa
        L_0x00a8:
            r8 = 3
            goto L_0x00ab
        L_0x00aa:
            r8 = 5
        L_0x00ab:
            if (r8 == r3) goto L_0x00d5
            r4 = 5
            if (r8 == r4) goto L_0x00cc
            r4 = 48
            if (r8 == r4) goto L_0x00c3
            r4 = 80
            if (r8 == r4) goto L_0x00ba
            r8 = 0
            goto L_0x00dd
        L_0x00ba:
            int r2 = r2 - r11
            int r10 = r10 - r9
            int r4 = java.lang.Math.abs(r10)
            int r8 = r2 + r4
            goto L_0x00dd
        L_0x00c3:
            int r15 = r15 - r2
            int r10 = r10 - r9
            int r2 = java.lang.Math.abs(r10)
            int r8 = r2 + r15
            goto L_0x00dd
        L_0x00cc:
            int r9 = r9 - r13
            int r5 = r5 - r2
            int r2 = java.lang.Math.abs(r5)
            int r8 = r2 + r9
            goto L_0x00dd
        L_0x00d5:
            int r14 = r14 - r9
            int r5 = r5 - r2
            int r2 = java.lang.Math.abs(r5)
            int r8 = r2 + r14
        L_0x00dd:
            float r2 = (float) r8
            int r4 = r0.f324374b
            if (r4 == r3) goto L_0x00f4
            r3 = 5
            if (r4 == r3) goto L_0x00f4
            r3 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 == r3) goto L_0x00f4
            r3 = 8388613(0x800005, float:1.175495E-38)
            if (r4 == r3) goto L_0x00f4
            int r3 = r19.getHeight()
            goto L_0x00f8
        L_0x00f4:
            int r3 = r19.getWidth()
        L_0x00f8:
            float r3 = (float) r3
            float r2 = r2 / r3
            long r3 = r1.f306715f
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0104
            r3 = 300(0x12c, double:1.48E-321)
        L_0x0104:
            long r5 = (long) r7
            long r3 = r3 * r5
            float r1 = (float) r3
            r3 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r3
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            long r1 = (long) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p853i4.C108347i.mo158802a(android.view.ViewGroup, androidx.transition.Transition, i4.o, i4.o):long");
    }
}
