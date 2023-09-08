package z04;

import gy3.C87412m;

/* renamed from: z04.x */
public class C66731x extends C66730w {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer m78731e(java.lang.String r11) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r11, r0)
            r0 = 10
            z04.C66713a.m78712a(r0)
            int r1 = r11.length()
            r2 = 0
            if (r1 != 0) goto L_0x0012
            goto L_0x006a
        L_0x0012:
            r3 = 0
            char r4 = r11.charAt(r3)
            r5 = 48
            int r5 = gy3.C87412m.m108596i(r4, r5)
            r6 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r7 = 1
            if (r5 >= 0) goto L_0x0034
            if (r1 != r7) goto L_0x0026
            goto L_0x006a
        L_0x0026:
            r5 = 45
            if (r4 != r5) goto L_0x002e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            goto L_0x0036
        L_0x002e:
            r5 = 43
            if (r4 != r5) goto L_0x006a
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r8 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L_0x003c:
            if (r4 >= r1) goto L_0x005d
            char r9 = r11.charAt(r4)
            int r9 = java.lang.Character.digit(r9, r0)
            if (r9 >= 0) goto L_0x0049
            goto L_0x006a
        L_0x0049:
            if (r3 >= r8) goto L_0x0052
            if (r8 != r5) goto L_0x006a
            int r8 = r6 / 10
            if (r3 >= r8) goto L_0x0052
            goto L_0x006a
        L_0x0052:
            int r3 = r3 * 10
            int r10 = r6 + r9
            if (r3 >= r10) goto L_0x0059
            goto L_0x006a
        L_0x0059:
            int r3 = r3 - r9
            int r4 = r4 + 1
            goto L_0x003c
        L_0x005d:
            if (r7 == 0) goto L_0x0064
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            goto L_0x0069
        L_0x0064:
            int r11 = -r3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L_0x0069:
            r2 = r11
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z04.C66731x.m78731e(java.lang.String):java.lang.Integer");
    }

    /* renamed from: f */
    public static final Long m78732f(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "<this>");
        C66713a.m78712a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        int i = 1;
        if (C87412m.m108596i(charAt, 48) >= 0) {
            i = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            }
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        long j4 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit(str2.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j4) {
                if (j4 != j3) {
                    return null;
                }
                j4 = j / ((long) 10);
                if (j2 < j4) {
                    return null;
                }
            }
            long j5 = j2 * ((long) 10);
            long j6 = (long) digit;
            if (j5 < j + j6) {
                return null;
            }
            j2 = j5 - j6;
            i++;
            j3 = -256204778801521550L;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
