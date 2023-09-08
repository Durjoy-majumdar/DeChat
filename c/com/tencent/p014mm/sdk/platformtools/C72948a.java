package com.tencent.p014mm.sdk.platformtools;

/* renamed from: com.tencent.mm.sdk.platformtools.a */
public final /* synthetic */ class C72948a {
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ long m85548a(java.lang.String r28) {
        /*
            r0 = r28
            int r1 = r28.length()
            int r2 = r1 + 0
            if (r2 == 0) goto L_0x00b5
            r3 = 10
            long r4 = (long) r3
            r6 = -9223372036854775808
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r12 = 0
            r13 = -1
            r15 = 1
            int r16 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r16 >= 0) goto L_0x002a
            long r17 = r4 ^ r6
            int r19 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0027
            r17 = r10
            goto L_0x0040
        L_0x0027:
            r17 = 1
            goto L_0x0040
        L_0x002a:
            long r17 = r8 / r4
            long r17 = r17 << r15
            long r19 = r17 * r4
            long r19 = r13 - r19
            long r19 = r19 ^ r6
            long r21 = r4 ^ r6
            int r23 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r23 < 0) goto L_0x003c
            r13 = 1
            goto L_0x003d
        L_0x003c:
            r13 = 0
        L_0x003d:
            long r13 = (long) r13
            long r17 = r17 + r13
        L_0x0040:
            char r13 = r0.charAt(r12)
            r14 = 43
            if (r13 != r14) goto L_0x004b
            if (r2 <= r15) goto L_0x004b
            r12 = 1
        L_0x004b:
            r13 = r10
        L_0x004c:
            if (r12 >= r1) goto L_0x00b4
            char r2 = r0.charAt(r12)
            int r2 = java.lang.Character.digit(r2, r3)
            r3 = -1
            if (r2 == r3) goto L_0x00ae
            int r3 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x00a2
            int r3 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r3 > 0) goto L_0x00a2
            if (r3 != 0) goto L_0x0095
            if (r16 >= 0) goto L_0x0077
            long r22 = r4 ^ r6
            int r3 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r3 >= 0) goto L_0x0070
            r6 = -1
            r19 = -1
            goto L_0x0091
        L_0x0070:
            r19 = -1
            long r22 = r19 - r4
        L_0x0074:
            r6 = r22
            goto L_0x0091
        L_0x0077:
            r19 = -1
            long r22 = r8 / r4
            long r22 = r22 << r15
            long r22 = r22 * r4
            long r22 = r19 - r22
            long r24 = r22 ^ r6
            long r26 = r4 ^ r6
            int r3 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r3 < 0) goto L_0x008c
            r24 = r4
            goto L_0x008e
        L_0x008c:
            r24 = r10
        L_0x008e:
            long r22 = r22 - r24
            goto L_0x0074
        L_0x0091:
            int r3 = (int) r6
            if (r2 > r3) goto L_0x00a2
            goto L_0x0097
        L_0x0095:
            r19 = -1
        L_0x0097:
            long r13 = r13 * r4
            long r2 = (long) r2
            long r13 = r13 + r2
            int r12 = r12 + 1
            r3 = 10
            r6 = -9223372036854775808
            goto L_0x004c
        L_0x00a2:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Too large for unsigned long: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x00ae:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L_0x00b4:
            return r13
        L_0x00b5:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "empty string"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.C72948a.m85548a(java.lang.String):long");
    }
}
