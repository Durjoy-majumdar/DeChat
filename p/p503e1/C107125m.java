package p503e1;

import p436a1.C103272w;

/* renamed from: e1.m */
public final class C107125m {

    /* renamed from: a */
    public static final /* synthetic */ int f320673a = 0;

    static {
        int i = C103272w.f304516h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d4, code lost:
        if (r17 == false) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x00fe A[EDGE_INSN: B:111:0x00fe->B:71:0x00fe ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f9 A[LOOP:4: B:43:0x00b7->B:70:0x00f9, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<p503e1.C31381e> m144990a(java.lang.String r20) {
        /*
            r0 = r20
            if (r0 != 0) goto L_0x0008
            sx3.f0 r0 = sx3.C64186f0.f181907d
            goto L_0x015f
        L_0x0008:
            e1.f r1 = new e1.f
            r1.<init>()
            java.util.List<e1.e> r2 = r1.f84037a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            r2 = 0
            r3 = 1
            r4 = 1
            r5 = 0
        L_0x0018:
            int r6 = r20.length()
            if (r4 >= r6) goto L_0x014a
        L_0x001e:
            int r6 = r20.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0044
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r9 = r9 * r10
            if (r9 <= 0) goto L_0x003c
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r9 = r9 * r10
            if (r9 > 0) goto L_0x0041
        L_0x003c:
            if (r6 == r8) goto L_0x0041
            if (r6 == r7) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0044:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r5, r6)
            int r9 = r5.length()
            int r9 = r9 - r3
            r10 = 0
            r11 = 0
        L_0x0054:
            r12 = 32
            if (r10 > r9) goto L_0x0079
            if (r11 != 0) goto L_0x005c
            r13 = r10
            goto L_0x005d
        L_0x005c:
            r13 = r9
        L_0x005d:
            char r13 = r5.charAt(r13)
            int r13 = gy3.C87412m.m108596i(r13, r12)
            if (r13 > 0) goto L_0x0069
            r13 = 1
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            if (r11 != 0) goto L_0x0073
            if (r13 != 0) goto L_0x0070
            r11 = 1
            goto L_0x0054
        L_0x0070:
            int r10 = r10 + 1
            goto L_0x0054
        L_0x0073:
            if (r13 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            int r9 = r9 + -1
            goto L_0x0054
        L_0x0079:
            int r9 = r9 + 1
            java.lang.CharSequence r5 = r5.subSequence(r10, r9)
            java.lang.String r5 = r5.toString()
            int r9 = r5.length()
            if (r9 <= 0) goto L_0x008b
            r9 = 1
            goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            if (r9 == 0) goto L_0x0143
            char r9 = r5.charAt(r2)
            r10 = 122(0x7a, float:1.71E-43)
            if (r9 == r10) goto L_0x013a
            char r9 = r5.charAt(r2)
            r10 = 90
            if (r9 != r10) goto L_0x00a0
            goto L_0x013a
        L_0x00a0:
            int r9 = r5.length()
            float[] r10 = new float[r9]
            int r11 = r5.length()
            r13 = 1
            r14 = 0
        L_0x00ac:
            if (r13 >= r11) goto L_0x011a
            r15 = r13
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x00b7:
            int r3 = r5.length()
            if (r15 >= r3) goto L_0x00fe
            char r3 = r5.charAt(r15)
            if (r3 != r12) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            r12 = 44
            if (r3 != r12) goto L_0x00ca
        L_0x00c8:
            r12 = 1
            goto L_0x00cb
        L_0x00ca:
            r12 = 0
        L_0x00cb:
            if (r12 == 0) goto L_0x00ce
            goto L_0x00e2
        L_0x00ce:
            r12 = 45
            if (r3 != r12) goto L_0x00d7
            if (r15 == r13) goto L_0x00f4
            if (r17 != 0) goto L_0x00f4
            goto L_0x00e0
        L_0x00d7:
            r12 = 46
            if (r3 != r12) goto L_0x00e7
            if (r16 != 0) goto L_0x00e0
            r16 = 1
            goto L_0x00f4
        L_0x00e0:
            r18 = 1
        L_0x00e2:
            r17 = 0
            r19 = 1
            goto L_0x00f6
        L_0x00e7:
            if (r3 != r8) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            if (r3 != r7) goto L_0x00ee
        L_0x00ec:
            r3 = 1
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            r17 = 1
            goto L_0x00f6
        L_0x00f4:
            r17 = 0
        L_0x00f6:
            if (r19 == 0) goto L_0x00f9
            goto L_0x00fe
        L_0x00f9:
            int r15 = r15 + 1
            r12 = 32
            goto L_0x00b7
        L_0x00fe:
            if (r13 >= r15) goto L_0x0110
            int r3 = r14 + 1
            java.lang.String r12 = r5.substring(r13, r15)
            gy3.C87412m.m108593f(r12, r6)
            float r12 = java.lang.Float.parseFloat(r12)
            r10[r14] = r12
            r14 = r3
        L_0x0110:
            if (r18 == 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            int r15 = r15 + 1
        L_0x0115:
            r13 = r15
            r3 = 1
            r12 = 32
            goto L_0x00ac
        L_0x011a:
            if (r14 < 0) goto L_0x0134
            if (r9 < 0) goto L_0x012e
            int r14 = r14 + 0
            int r9 = r9 + 0
            int r3 = java.lang.Math.min(r14, r9)
            float[] r6 = new float[r14]
            int r3 = r3 + r2
            int r3 = r3 - r2
            java.lang.System.arraycopy(r10, r2, r6, r2, r3)
            goto L_0x013c
        L_0x012e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L_0x0134:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x013a:
            float[] r6 = new float[r2]
        L_0x013c:
            char r3 = r5.charAt(r2)
            r1.mo58147a(r3, r6)
        L_0x0143:
            int r3 = r4 + 1
            r5 = r4
            r4 = r3
            r3 = 1
            goto L_0x0018
        L_0x014a:
            int r4 = r4 - r5
            r3 = 1
            if (r4 != r3) goto L_0x015d
            int r3 = r20.length()
            if (r5 >= r3) goto L_0x015d
            char r0 = r0.charAt(r5)
            float[] r2 = new float[r2]
            r1.mo58147a(r0, r2)
        L_0x015d:
            java.util.List<e1.e> r0 = r1.f84037a
        L_0x015f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p503e1.C107125m.m144990a(java.lang.String):java.util.List");
    }
}
