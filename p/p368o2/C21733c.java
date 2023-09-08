package p368o2;

/* renamed from: o2.c */
public class C21733c {
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0207, code lost:
        if (r7.f61531b == r6) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d0, code lost:
        if (r12.f61531b == r5) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0155, code lost:
        if (r13 == 2) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x044b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x021f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24726a(p368o2.C21740g r27, p363n2.C21589e r28, int r29) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            o2.f$a r3 = p368o2.C21738f.C21739a.MATCH_CONSTRAINT
            r4 = 2
            if (r2 != 0) goto L_0x0011
            int r6 = r0.f61619m0
            o2.d[] r7 = r0.f61622p0
            r8 = 0
            goto L_0x0016
        L_0x0011:
            int r6 = r0.f61620n0
            o2.d[] r7 = r0.f61621o0
            r8 = 2
        L_0x0016:
            r9 = 0
        L_0x0017:
            if (r9 >= r6) goto L_0x0457
            r10 = r7[r9]
            boolean r11 = r10.f61529q
            r12 = 0
            r13 = 8
            r15 = 1
            if (r11 != 0) goto L_0x0101
            int r11 = r10.f61524l
            int r11 = r11 * 2
            o2.f r5 = r10.f61513a
            r16 = r5
            r17 = 0
        L_0x002d:
            if (r17 != 0) goto L_0x00e3
            int r14 = r10.f61521i
            int r14 = r14 + r15
            r10.f61521i = r14
            o2.f[] r14 = r5.f61592h0
            int r15 = r10.f61524l
            r14[r15] = r12
            o2.f[] r14 = r5.f61590g0
            r14[r15] = r12
            int r14 = r5.f61575Y
            if (r14 == r13) goto L_0x00b0
            o2.f r12 = r10.f61514b
            if (r12 != 0) goto L_0x0048
            r10.f61514b = r5
        L_0x0048:
            r10.f61516d = r5
            o2.f$a[] r12 = r5.f61553C
            r12 = r12[r15]
            if (r12 != r3) goto L_0x00b0
            int[] r13 = r5.f61589g
            r13 = r13[r15]
            r4 = 3
            if (r13 == 0) goto L_0x005c
            if (r13 == r4) goto L_0x005c
            r4 = 2
            if (r13 != r4) goto L_0x00b0
        L_0x005c:
            int r4 = r10.f61522j
            r18 = 1
            int r4 = r4 + 1
            r10.f61522j = r4
            float[] r4 = r5.f61588f0
            r4 = r4[r15]
            r15 = 0
            int r22 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r22 <= 0) goto L_0x0072
            float r15 = r10.f61523k
            float r15 = r15 + r4
            r10.f61523k = r15
        L_0x0072:
            r15 = 8
            if (r14 == r15) goto L_0x007f
            if (r12 != r3) goto L_0x007f
            if (r13 == 0) goto L_0x007d
            r12 = 3
            if (r13 != r12) goto L_0x007f
        L_0x007d:
            r12 = 1
            goto L_0x0080
        L_0x007f:
            r12 = 0
        L_0x0080:
            if (r12 == 0) goto L_0x009e
            r12 = 0
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x008b
            r4 = 1
            r10.f61526n = r4
            goto L_0x008e
        L_0x008b:
            r4 = 1
            r10.f61527o = r4
        L_0x008e:
            java.util.ArrayList<o2.f> r4 = r10.f61520h
            if (r4 != 0) goto L_0x0099
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r10.f61520h = r4
        L_0x0099:
            java.util.ArrayList<o2.f> r4 = r10.f61520h
            r4.add(r5)
        L_0x009e:
            o2.f r4 = r10.f61518f
            if (r4 != 0) goto L_0x00a4
            r10.f61518f = r5
        L_0x00a4:
            o2.f r4 = r10.f61519g
            if (r4 == 0) goto L_0x00ae
            o2.f[] r4 = r4.f61590g0
            int r12 = r10.f61524l
            r4[r12] = r5
        L_0x00ae:
            r10.f61519g = r5
        L_0x00b0:
            r4 = r16
            if (r4 == r5) goto L_0x00ba
            o2.f[] r4 = r4.f61592h0
            int r12 = r10.f61524l
            r4[r12] = r5
        L_0x00ba:
            o2.e[] r4 = r5.f61551A
            int r12 = r11 + 1
            r4 = r4[r12]
            o2.e r4 = r4.f61533d
            if (r4 == 0) goto L_0x00d2
            o2.f r4 = r4.f61531b
            o2.e[] r12 = r4.f61551A
            r12 = r12[r11]
            o2.e r12 = r12.f61533d
            if (r12 == 0) goto L_0x00d2
            o2.f r12 = r12.f61531b
            if (r12 == r5) goto L_0x00d3
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            if (r4 == 0) goto L_0x00d6
            goto L_0x00d9
        L_0x00d6:
            r4 = r5
            r17 = 1
        L_0x00d9:
            r16 = r5
            r12 = 0
            r13 = 8
            r15 = 1
            r5 = r4
            r4 = 2
            goto L_0x002d
        L_0x00e3:
            r10.f61515c = r5
            int r4 = r10.f61524l
            if (r4 != 0) goto L_0x00f0
            boolean r4 = r10.f61525m
            if (r4 == 0) goto L_0x00f0
            r10.f61517e = r5
            goto L_0x00f4
        L_0x00f0:
            o2.f r4 = r10.f61513a
            r10.f61517e = r4
        L_0x00f4:
            boolean r4 = r10.f61527o
            if (r4 == 0) goto L_0x00fe
            boolean r4 = r10.f61526n
            if (r4 == 0) goto L_0x00fe
            r4 = 1
            goto L_0x00ff
        L_0x00fe:
            r4 = 0
        L_0x00ff:
            r10.f61528p = r4
        L_0x0101:
            r4 = 1
            r10.f61529q = r4
            r4 = 4
            boolean r4 = r0.mo34061J(r4)
            if (r4 == 0) goto L_0x043e
            o2.f r4 = r10.f61513a
            o2.f r5 = r10.f61515c
            o2.f r11 = r10.f61514b
            o2.f r12 = r10.f61516d
            o2.f r13 = r10.f61517e
            float r14 = r10.f61523k
            o2.f$a[] r15 = r0.f61553C
            r15 = r15[r2]
            if (r2 != 0) goto L_0x0142
            int r13 = r13.f61584d0
            r15 = 1
            if (r13 != 0) goto L_0x0125
            r18 = 1
            goto L_0x0127
        L_0x0125:
            r18 = 0
        L_0x0127:
            if (r13 != r15) goto L_0x012d
            r15 = 2
            r16 = 1
            goto L_0x0130
        L_0x012d:
            r15 = 2
            r16 = 0
        L_0x0130:
            if (r13 != r15) goto L_0x013a
            r15 = r16
            r17 = r18
            r16 = r6
            r6 = 2
            goto L_0x0157
        L_0x013a:
            r15 = r16
            r17 = r18
            r16 = r6
            r6 = 2
            goto L_0x0159
        L_0x0142:
            r15 = 2
            int r13 = r13.f61586e0
            r15 = 1
            if (r13 != 0) goto L_0x014b
            r17 = 1
            goto L_0x014d
        L_0x014b:
            r17 = 0
        L_0x014d:
            r16 = r6
            r6 = 2
            if (r13 != r15) goto L_0x0154
            r15 = 1
            goto L_0x0155
        L_0x0154:
            r15 = 0
        L_0x0155:
            if (r13 != r6) goto L_0x0159
        L_0x0157:
            r13 = 1
            goto L_0x015a
        L_0x0159:
            r13 = 0
        L_0x015a:
            r6 = r4
            r23 = r7
            r24 = r9
            r7 = 0
            r9 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0167:
            if (r22 != 0) goto L_0x021f
            int r0 = r6.f61575Y
            r25 = r10
            r10 = 8
            if (r0 == r10) goto L_0x01b5
            int r7 = r7 + 1
            if (r2 != 0) goto L_0x017a
            int r0 = r6.mo34049q()
            goto L_0x017e
        L_0x017a:
            int r0 = r6.mo34043k()
        L_0x017e:
            float r0 = (float) r0
            float r20 = r20 + r0
            if (r6 == r11) goto L_0x018e
            o2.e[] r0 = r6.f61551A
            r0 = r0[r8]
            int r0 = r0.mo34025b()
            float r0 = (float) r0
            float r20 = r20 + r0
        L_0x018e:
            if (r6 == r12) goto L_0x019d
            o2.e[] r0 = r6.f61551A
            int r10 = r8 + 1
            r0 = r0[r10]
            int r0 = r0.mo34025b()
            float r0 = (float) r0
            float r20 = r20 + r0
        L_0x019d:
            o2.e[] r0 = r6.f61551A
            r0 = r0[r8]
            int r0 = r0.mo34025b()
            float r0 = (float) r0
            float r21 = r21 + r0
            o2.e[] r0 = r6.f61551A
            int r10 = r8 + 1
            r0 = r0[r10]
            int r0 = r0.mo34025b()
            float r0 = (float) r0
            float r21 = r21 + r0
        L_0x01b5:
            o2.e[] r0 = r6.f61551A
            r10 = r0[r8]
            int r10 = r6.f61575Y
            r26 = r7
            r7 = 8
            if (r10 == r7) goto L_0x01f3
            o2.f$a[] r7 = r6.f61553C
            r7 = r7[r2]
            if (r7 != r3) goto L_0x01f3
            int r9 = r9 + 1
            if (r2 != 0) goto L_0x01d9
            int r7 = r6.f61585e
            if (r7 == 0) goto L_0x01d0
        L_0x01cf:
            goto L_0x01dd
        L_0x01d0:
            int r7 = r6.f61591h
            if (r7 != 0) goto L_0x01dd
            int r7 = r6.f61593i
            if (r7 == 0) goto L_0x01eb
            goto L_0x01dd
        L_0x01d9:
            int r7 = r6.f61587f
            if (r7 == 0) goto L_0x01e2
        L_0x01dd:
            r12 = r1
            r22 = r3
            goto L_0x0433
        L_0x01e2:
            int r7 = r6.f61595k
            if (r7 != 0) goto L_0x01dd
            int r7 = r6.f61596l
            if (r7 == 0) goto L_0x01eb
            goto L_0x01f2
        L_0x01eb:
            float r7 = r6.f61557G
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x01f3
        L_0x01f2:
            goto L_0x01cf
        L_0x01f3:
            int r7 = r8 + 1
            r0 = r0[r7]
            o2.e r0 = r0.f61533d
            if (r0 == 0) goto L_0x0209
            o2.f r0 = r0.f61531b
            o2.e[] r7 = r0.f61551A
            r7 = r7[r8]
            o2.e r7 = r7.f61533d
            if (r7 == 0) goto L_0x0209
            o2.f r7 = r7.f61531b
            if (r7 == r6) goto L_0x020a
        L_0x0209:
            r0 = 0
        L_0x020a:
            if (r0 == 0) goto L_0x0215
            r6 = r0
            r10 = r25
            r7 = r26
            r0 = r27
            goto L_0x0167
        L_0x0215:
            r22 = 1
            r0 = r27
            r10 = r25
            r7 = r26
            goto L_0x0167
        L_0x021f:
            r25 = r10
            o2.e[] r0 = r4.f61551A
            r0 = r0[r8]
            o2.l r0 = r0.f61530a
            o2.e[] r10 = r5.f61551A
            int r19 = r8 + 1
            r10 = r10[r19]
            o2.l r10 = r10.f61530a
            r22 = r3
            o2.l r3 = r0.f61651d
            if (r3 == 0) goto L_0x0432
            r26 = r4
            o2.l r4 = r10.f61651d
            if (r4 != 0) goto L_0x023d
            goto L_0x0432
        L_0x023d:
            int r3 = r3.f61662b
            r1 = 1
            if (r3 != r1) goto L_0x024b
            int r3 = r4.f61662b
            if (r3 == r1) goto L_0x0247
            goto L_0x024b
        L_0x0247:
            if (r9 <= 0) goto L_0x024f
            if (r9 == r7) goto L_0x024f
        L_0x024b:
            r12 = r28
            goto L_0x0433
        L_0x024f:
            if (r13 != 0) goto L_0x0258
            if (r17 != 0) goto L_0x0258
            if (r15 == 0) goto L_0x0256
            goto L_0x0258
        L_0x0256:
            r1 = 0
            goto L_0x0271
        L_0x0258:
            if (r11 == 0) goto L_0x0264
            o2.e[] r1 = r11.f61551A
            r1 = r1[r8]
            int r1 = r1.mo34025b()
            float r1 = (float) r1
            goto L_0x0265
        L_0x0264:
            r1 = 0
        L_0x0265:
            if (r12 == 0) goto L_0x0271
            o2.e[] r3 = r12.f61551A
            r3 = r3[r19]
            int r3 = r3.mo34025b()
            float r3 = (float) r3
            float r1 = r1 + r3
        L_0x0271:
            o2.l r3 = r0.f61651d
            float r3 = r3.f61654g
            o2.l r4 = r10.f61651d
            float r4 = r4.f61654g
            int r10 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x027f
            float r4 = r4 - r3
            goto L_0x0281
        L_0x027f:
            float r4 = r3 - r4
        L_0x0281:
            float r4 = r4 - r20
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 <= 0) goto L_0x030d
            if (r9 != r7) goto L_0x030d
            o2.f r1 = r6.f61554D
            if (r1 == 0) goto L_0x0296
            o2.f$a[] r1 = r1.f61553C
            r1 = r1[r2]
            o2.f$a r6 = p368o2.C21738f.C21739a.WRAP_CONTENT
            if (r1 != r6) goto L_0x0296
            goto L_0x024b
        L_0x0296:
            float r4 = r4 + r20
            float r4 = r4 - r21
            r1 = r26
        L_0x029c:
            if (r1 == 0) goto L_0x0308
            o2.f[] r6 = r1.f61592h0
            r6 = r6[r2]
            if (r6 != 0) goto L_0x02aa
            if (r1 != r5) goto L_0x02a7
            goto L_0x02aa
        L_0x02a7:
            r12 = r28
            goto L_0x0306
        L_0x02aa:
            float r7 = (float) r9
            float r7 = r4 / r7
            r11 = 0
            int r12 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x02bf
            float[] r7 = r1.f61588f0
            r7 = r7[r2]
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 != 0) goto L_0x02bc
            r15 = 0
            goto L_0x02c0
        L_0x02bc:
            float r7 = r7 * r4
            float r7 = r7 / r14
        L_0x02bf:
            r15 = r7
        L_0x02c0:
            int r7 = r1.f61575Y
            r11 = 8
            if (r7 != r11) goto L_0x02c7
            r15 = 0
        L_0x02c7:
            o2.e[] r7 = r1.f61551A
            r7 = r7[r8]
            int r7 = r7.mo34025b()
            float r7 = (float) r7
            float r3 = r3 + r7
            o2.e[] r7 = r1.f61551A
            r7 = r7[r8]
            o2.l r7 = r7.f61530a
            o2.l r11 = r0.f61653f
            r7.mo34073k(r11, r3)
            o2.e[] r7 = r1.f61551A
            r7 = r7[r19]
            o2.l r7 = r7.f61530a
            o2.l r11 = r0.f61653f
            float r3 = r3 + r15
            r7.mo34073k(r11, r3)
            o2.e[] r7 = r1.f61551A
            r7 = r7[r8]
            o2.l r7 = r7.f61530a
            r12 = r28
            r7.mo34068f(r12)
            o2.e[] r7 = r1.f61551A
            r7 = r7[r19]
            o2.l r7 = r7.f61530a
            r7.mo34068f(r12)
            o2.e[] r1 = r1.f61551A
            r1 = r1[r19]
            int r1 = r1.mo34025b()
            float r1 = (float) r1
            float r3 = r3 + r1
        L_0x0306:
            r1 = r6
            goto L_0x029c
        L_0x0308:
            r12 = r28
        L_0x030a:
            r15 = 1
            goto L_0x0434
        L_0x030d:
            r12 = r28
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0318
            r13 = 1
            r15 = 0
            r17 = 0
        L_0x0318:
            if (r13 == 0) goto L_0x0382
            float r4 = r4 - r1
            if (r2 != 0) goto L_0x0322
            r6 = r26
            float r10 = r6.f61572V
            goto L_0x0329
        L_0x0322:
            r6 = r26
            r1 = 1
            if (r2 != r1) goto L_0x0329
            float r10 = r6.f61573W
        L_0x0329:
            float r4 = r4 * r10
            float r3 = r3 + r4
            r4 = r6
        L_0x032d:
            if (r4 == 0) goto L_0x0389
            o2.f[] r1 = r4.f61592h0
            r1 = r1[r2]
            if (r1 != 0) goto L_0x0337
            if (r4 != r5) goto L_0x0380
        L_0x0337:
            if (r2 != 0) goto L_0x033e
            int r6 = r4.mo34049q()
            goto L_0x0342
        L_0x033e:
            int r6 = r4.mo34043k()
        L_0x0342:
            float r6 = (float) r6
            o2.e[] r7 = r4.f61551A
            r7 = r7[r8]
            int r7 = r7.mo34025b()
            float r7 = (float) r7
            float r3 = r3 + r7
            o2.e[] r7 = r4.f61551A
            r7 = r7[r8]
            o2.l r7 = r7.f61530a
            o2.l r9 = r0.f61653f
            r7.mo34073k(r9, r3)
            o2.e[] r7 = r4.f61551A
            r7 = r7[r19]
            o2.l r7 = r7.f61530a
            o2.l r9 = r0.f61653f
            float r3 = r3 + r6
            r7.mo34073k(r9, r3)
            o2.e[] r6 = r4.f61551A
            r6 = r6[r8]
            o2.l r6 = r6.f61530a
            r6.mo34068f(r12)
            o2.e[] r6 = r4.f61551A
            r6 = r6[r19]
            o2.l r6 = r6.f61530a
            r6.mo34068f(r12)
            o2.e[] r4 = r4.f61551A
            r4 = r4[r19]
            int r4 = r4.mo34025b()
            float r4 = (float) r4
            float r3 = r3 + r4
        L_0x0380:
            r4 = r1
            goto L_0x032d
        L_0x0382:
            r6 = r26
            if (r17 != 0) goto L_0x038c
            if (r15 == 0) goto L_0x0389
            goto L_0x038c
        L_0x0389:
            r9 = 1
            goto L_0x030a
        L_0x038c:
            if (r17 == 0) goto L_0x038f
            goto L_0x0391
        L_0x038f:
            if (r15 == 0) goto L_0x0392
        L_0x0391:
            float r4 = r4 - r1
        L_0x0392:
            int r1 = r7 + 1
            float r1 = (float) r1
            float r1 = r4 / r1
            if (r15 == 0) goto L_0x03a4
            r9 = 1
            if (r7 <= r9) goto L_0x03a0
            int r1 = r7 + -1
            float r1 = (float) r1
            goto L_0x03a2
        L_0x03a0:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x03a2:
            float r1 = r4 / r1
        L_0x03a4:
            int r4 = r6.f61575Y
            r9 = 8
            if (r4 == r9) goto L_0x03ad
            float r4 = r3 + r1
            goto L_0x03ae
        L_0x03ad:
            r4 = r3
        L_0x03ae:
            r9 = 1
            if (r15 == 0) goto L_0x03bd
            if (r7 <= r9) goto L_0x03bd
            o2.e[] r4 = r11.f61551A
            r4 = r4[r8]
            int r4 = r4.mo34025b()
            float r4 = (float) r4
            float r4 = r4 + r3
        L_0x03bd:
            if (r17 == 0) goto L_0x03cb
            if (r11 == 0) goto L_0x03cb
            o2.e[] r3 = r11.f61551A
            r3 = r3[r8]
            int r3 = r3.mo34025b()
            float r3 = (float) r3
            float r4 = r4 + r3
        L_0x03cb:
            r3 = r4
        L_0x03cc:
            r4 = r6
            if (r4 == 0) goto L_0x030a
            o2.f[] r6 = r4.f61592h0
            r6 = r6[r2]
            if (r6 != 0) goto L_0x03db
            if (r4 != r5) goto L_0x03d8
            goto L_0x03db
        L_0x03d8:
            r7 = 8
            goto L_0x03cc
        L_0x03db:
            if (r2 != 0) goto L_0x03e2
            int r7 = r4.mo34049q()
            goto L_0x03e6
        L_0x03e2:
            int r7 = r4.mo34043k()
        L_0x03e6:
            float r7 = (float) r7
            if (r4 == r11) goto L_0x03f3
            o2.e[] r10 = r4.f61551A
            r10 = r10[r8]
            int r10 = r10.mo34025b()
            float r10 = (float) r10
            float r3 = r3 + r10
        L_0x03f3:
            o2.e[] r10 = r4.f61551A
            r10 = r10[r8]
            o2.l r10 = r10.f61530a
            o2.l r13 = r0.f61653f
            r10.mo34073k(r13, r3)
            o2.e[] r10 = r4.f61551A
            r10 = r10[r19]
            o2.l r10 = r10.f61530a
            o2.l r13 = r0.f61653f
            float r14 = r3 + r7
            r10.mo34073k(r13, r14)
            o2.e[] r10 = r4.f61551A
            r10 = r10[r8]
            o2.l r10 = r10.f61530a
            r10.mo34068f(r12)
            o2.e[] r10 = r4.f61551A
            r10 = r10[r19]
            o2.l r10 = r10.f61530a
            r10.mo34068f(r12)
            o2.e[] r4 = r4.f61551A
            r4 = r4[r19]
            int r4 = r4.mo34025b()
            float r4 = (float) r4
            float r7 = r7 + r4
            float r3 = r3 + r7
            if (r6 == 0) goto L_0x03d8
            int r4 = r6.f61575Y
            r7 = 8
            if (r4 == r7) goto L_0x03cc
            float r3 = r3 + r1
            goto L_0x03cc
        L_0x0432:
            r12 = r1
        L_0x0433:
            r15 = 0
        L_0x0434:
            r0 = r27
            if (r15 != 0) goto L_0x044b
            r1 = r25
            m24727b(r0, r12, r2, r8, r1)
            goto L_0x044b
        L_0x043e:
            r12 = r1
            r22 = r3
            r16 = r6
            r23 = r7
            r24 = r9
            r1 = r10
            m24727b(r0, r12, r2, r8, r1)
        L_0x044b:
            int r9 = r24 + 1
            r1 = r12
            r6 = r16
            r3 = r22
            r7 = r23
            r4 = 2
            goto L_0x0017
        L_0x0457:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21733c.m24726a(o2.g, n2.e, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: o2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: n2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: n2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: o2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: n2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: o2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: n2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: o2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: o2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: n2.h} */
    /* JADX WARNING: type inference failed for: r5v10, types: [n2.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r7 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r7 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x039f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24727b(p368o2.C21740g r30, p363n2.C21589e r31, int r32, int r33, p368o2.C21734d r34) {
        /*
            r0 = r30
            r9 = r31
            r1 = r34
            o2.f r10 = r1.f61513a
            o2.f r11 = r1.f61515c
            o2.f r12 = r1.f61514b
            o2.f r13 = r1.f61516d
            o2.f r2 = r1.f61517e
            float r3 = r1.f61523k
            o2.f$a[] r4 = r0.f61553C
            r4 = r4[r32]
            o2.f$a r5 = p368o2.C21738f.C21739a.WRAP_CONTENT
            r14 = 1
            if (r4 != r5) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r32 != 0) goto L_0x0030
            int r7 = r2.f61584d0
            if (r7 != 0) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            if (r7 != r14) goto L_0x002c
            r15 = 1
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r7 != r5) goto L_0x0040
            goto L_0x003e
        L_0x0030:
            int r7 = r2.f61586e0
            if (r7 != 0) goto L_0x0036
            r8 = 1
            goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            if (r7 != r14) goto L_0x003b
            r15 = 1
            goto L_0x003c
        L_0x003b:
            r15 = 0
        L_0x003c:
            if (r7 != r5) goto L_0x0040
        L_0x003e:
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r16 = r15
            r7 = 0
            r15 = r8
            r8 = r10
        L_0x0046:
            r19 = 0
            if (r7 != 0) goto L_0x0111
            o2.e[] r14 = r8.f61551A
            r14 = r14[r33]
            if (r4 != 0) goto L_0x0056
            if (r5 == 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            r21 = 4
            goto L_0x0058
        L_0x0056:
            r21 = 1
        L_0x0058:
            int r22 = r14.mo34025b()
            o2.e r6 = r14.f61533d
            if (r6 == 0) goto L_0x0068
            if (r8 == r10) goto L_0x0068
            int r6 = r6.mo34025b()
            int r22 = r22 + r6
        L_0x0068:
            r6 = r22
            if (r5 == 0) goto L_0x0076
            if (r8 == r10) goto L_0x0076
            if (r8 == r12) goto L_0x0076
            r22 = r3
            r21 = r7
            r3 = 6
            goto L_0x0086
        L_0x0076:
            if (r15 == 0) goto L_0x0080
            if (r4 == 0) goto L_0x0080
            r22 = r3
            r21 = r7
            r3 = 4
            goto L_0x0086
        L_0x0080:
            r22 = r3
            r3 = r21
            r21 = r7
        L_0x0086:
            o2.e r7 = r14.f61533d
            if (r7 == 0) goto L_0x00af
            if (r8 != r12) goto L_0x0099
            r23 = r15
            n2.h r15 = r14.f61538i
            n2.h r7 = r7.f61538i
            r24 = r2
            r2 = 5
            r9.mo33839f(r15, r7, r6, r2)
            goto L_0x00a5
        L_0x0099:
            r24 = r2
            r23 = r15
            n2.h r2 = r14.f61538i
            n2.h r7 = r7.f61538i
            r15 = 6
            r9.mo33839f(r2, r7, r6, r15)
        L_0x00a5:
            n2.h r2 = r14.f61538i
            o2.e r7 = r14.f61533d
            n2.h r7 = r7.f61538i
            r9.mo33837d(r2, r7, r6, r3)
            goto L_0x00b3
        L_0x00af:
            r24 = r2
            r23 = r15
        L_0x00b3:
            if (r4 == 0) goto L_0x00e6
            int r2 = r8.f61575Y
            r3 = 8
            if (r2 == r3) goto L_0x00d5
            o2.f$a[] r2 = r8.f61553C
            r2 = r2[r32]
            o2.f$a r3 = p368o2.C21738f.C21739a.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00d5
            o2.e[] r2 = r8.f61551A
            int r3 = r33 + 1
            r3 = r2[r3]
            n2.h r3 = r3.f61538i
            r2 = r2[r33]
            n2.h r2 = r2.f61538i
            r6 = 5
            r7 = 0
            r9.mo33839f(r3, r2, r7, r6)
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            o2.e[] r2 = r8.f61551A
            r2 = r2[r33]
            n2.h r2 = r2.f61538i
            o2.e[] r3 = r0.f61551A
            r3 = r3[r33]
            n2.h r3 = r3.f61538i
            r6 = 6
            r9.mo33839f(r2, r3, r7, r6)
        L_0x00e6:
            o2.e[] r2 = r8.f61551A
            int r3 = r33 + 1
            r2 = r2[r3]
            o2.e r2 = r2.f61533d
            if (r2 == 0) goto L_0x0101
            o2.f r2 = r2.f61531b
            o2.e[] r3 = r2.f61551A
            r3 = r3[r33]
            o2.e r3 = r3.f61533d
            if (r3 == 0) goto L_0x0101
            o2.f r3 = r3.f61531b
            if (r3 == r8) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r19 = r2
        L_0x0101:
            if (r19 == 0) goto L_0x0108
            r8 = r19
            r7 = r21
            goto L_0x0109
        L_0x0108:
            r7 = 1
        L_0x0109:
            r3 = r22
            r15 = r23
            r2 = r24
            goto L_0x0046
        L_0x0111:
            r24 = r2
            r22 = r3
            r23 = r15
            if (r13 == 0) goto L_0x0135
            o2.e[] r2 = r11.f61551A
            int r3 = r33 + 1
            r2 = r2[r3]
            o2.e r2 = r2.f61533d
            if (r2 == 0) goto L_0x0135
            o2.e[] r6 = r13.f61551A
            r3 = r6[r3]
            n2.h r6 = r3.f61538i
            n2.h r2 = r2.f61538i
            int r3 = r3.mo34025b()
            int r3 = -r3
            r7 = 5
            r9.mo33840g(r6, r2, r3, r7)
            goto L_0x0136
        L_0x0135:
            r7 = 5
        L_0x0136:
            if (r4 == 0) goto L_0x014e
            o2.e[] r0 = r0.f61551A
            int r2 = r33 + 1
            r0 = r0[r2]
            n2.h r0 = r0.f61538i
            o2.e[] r3 = r11.f61551A
            r2 = r3[r2]
            n2.h r3 = r2.f61538i
            int r2 = r2.mo34025b()
            r4 = 6
            r9.mo33839f(r0, r3, r2, r4)
        L_0x014e:
            java.util.ArrayList<o2.f> r0 = r1.f61520h
            if (r0 == 0) goto L_0x025d
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x025d
            boolean r3 = r1.f61526n
            if (r3 == 0) goto L_0x0165
            boolean r3 = r1.f61528p
            if (r3 != 0) goto L_0x0165
            int r3 = r1.f61522j
            float r3 = (float) r3
            goto L_0x0167
        L_0x0165:
            r3 = r22
        L_0x0167:
            r4 = 0
            r8 = r19
            r6 = 0
            r14 = 0
        L_0x016c:
            if (r6 >= r2) goto L_0x025d
            java.lang.Object r15 = r0.get(r6)
            o2.f r15 = (p368o2.C21738f) r15
            float[] r7 = r15.f61588f0
            r7 = r7[r32]
            r21 = r0
            int r22 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r22 >= 0) goto L_0x019d
            boolean r7 = r1.f61528p
            if (r7 == 0) goto L_0x0198
            o2.e[] r0 = r15.f61551A
            int r7 = r33 + 1
            r7 = r0[r7]
            n2.h r7 = r7.f61538i
            r0 = r0[r33]
            n2.h r0 = r0.f61538i
            r4 = 0
            r15 = 4
            r9.mo33837d(r7, r0, r4, r15)
            r7 = 6
            r15 = 0
            r18 = 4
            goto L_0x01b4
        L_0x0198:
            r18 = 4
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x019f
        L_0x019d:
            r18 = 4
        L_0x019f:
            int r22 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r22 != 0) goto L_0x01bc
            o2.e[] r0 = r15.f61551A
            int r4 = r33 + 1
            r4 = r0[r4]
            n2.h r4 = r4.f61538i
            r0 = r0[r33]
            n2.h r0 = r0.f61538i
            r7 = 6
            r15 = 0
            r9.mo33837d(r4, r0, r15, r7)
        L_0x01b4:
            r26 = r2
            r27 = r11
            r17 = 6
            goto L_0x024f
        L_0x01bc:
            r4 = 0
            r17 = 6
            if (r8 == 0) goto L_0x0246
            o2.e[] r8 = r8.f61551A
            r4 = r8[r33]
            n2.h r4 = r4.f61538i
            int r25 = r33 + 1
            r8 = r8[r25]
            n2.h r8 = r8.f61538i
            o2.e[] r0 = r15.f61551A
            r26 = r2
            r2 = r0[r33]
            n2.h r2 = r2.f61538i
            r0 = r0[r25]
            n2.h r0 = r0.f61538i
            r25 = r15
            n2.b r15 = r31.mo33844k()
            r1 = 0
            r15.f61128b = r1
            r27 = r11
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r28 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r28 == 0) goto L_0x022c
            int r28 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r28 != 0) goto L_0x01ef
            goto L_0x022c
        L_0x01ef:
            int r28 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r28 != 0) goto L_0x0200
            n2.a r0 = r15.f61129c
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mo33825f(r4, r2)
            n2.a r0 = r15.f61129c
            r0.mo33825f(r8, r11)
            goto L_0x0242
        L_0x0200:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r22 != 0) goto L_0x020f
            n2.a r4 = r15.f61129c
            r4.mo33825f(r2, r1)
            n2.a r1 = r15.f61129c
            r1.mo33825f(r0, r11)
            goto L_0x0242
        L_0x020f:
            float r14 = r14 / r3
            float r22 = r7 / r3
            float r14 = r14 / r22
            n2.a r11 = r15.f61129c
            r11.mo33825f(r4, r1)
            n2.a r1 = r15.f61129c
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mo33825f(r8, r11)
            n2.a r1 = r15.f61129c
            r1.mo33825f(r0, r14)
            n2.a r0 = r15.f61129c
            float r1 = -r14
            r0.mo33825f(r2, r1)
            goto L_0x0242
        L_0x022c:
            r1 = 1065353216(0x3f800000, float:1.0)
            n2.a r14 = r15.f61129c
            r14.mo33825f(r4, r1)
            n2.a r4 = r15.f61129c
            r4.mo33825f(r8, r11)
            n2.a r4 = r15.f61129c
            r4.mo33825f(r0, r1)
            n2.a r0 = r15.f61129c
            r0.mo33825f(r2, r11)
        L_0x0242:
            r9.mo33836c(r15)
            goto L_0x024c
        L_0x0246:
            r26 = r2
            r27 = r11
            r25 = r15
        L_0x024c:
            r14 = r7
            r8 = r25
        L_0x024f:
            int r6 = r6 + 1
            r1 = r34
            r0 = r21
            r2 = r26
            r11 = r27
            r4 = 0
            r7 = 5
            goto L_0x016c
        L_0x025d:
            r27 = r11
            r17 = 6
            r18 = 4
            if (r12 == 0) goto L_0x02be
            if (r12 == r13) goto L_0x0269
            if (r5 == 0) goto L_0x02be
        L_0x0269:
            o2.e[] r0 = r10.f61551A
            r0 = r0[r33]
            r11 = r27
            o2.e[] r1 = r11.f61551A
            int r2 = r33 + 1
            r1 = r1[r2]
            o2.e r3 = r0.f61533d
            if (r3 == 0) goto L_0x027c
            n2.h r3 = r3.f61538i
            goto L_0x027e
        L_0x027c:
            r3 = r19
        L_0x027e:
            o2.e r4 = r1.f61533d
            if (r4 == 0) goto L_0x0286
            n2.h r4 = r4.f61538i
            r5 = r4
            goto L_0x0288
        L_0x0286:
            r5 = r19
        L_0x0288:
            if (r12 != r13) goto L_0x0295
            o2.e[] r0 = r12.f61551A
            r1 = r0[r33]
            r0 = r0[r2]
            r29 = r1
            r1 = r0
            r0 = r29
        L_0x0295:
            if (r3 == 0) goto L_0x04bb
            if (r5 == 0) goto L_0x04bb
            if (r32 != 0) goto L_0x02a0
            r2 = r24
            float r2 = r2.f61572V
            goto L_0x02a4
        L_0x02a0:
            r2 = r24
            float r2 = r2.f61573W
        L_0x02a4:
            r4 = r2
            int r6 = r0.mo34025b()
            int r7 = r1.mo34025b()
            n2.h r2 = r0.f61538i
            n2.h r8 = r1.f61538i
            r10 = 5
            r0 = r31
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo33835b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04bb
        L_0x02be:
            r11 = r27
            if (r23 == 0) goto L_0x03a3
            if (r12 == 0) goto L_0x03a3
            r0 = r34
            int r1 = r0.f61522j
            if (r1 <= 0) goto L_0x02d1
            int r0 = r0.f61521i
            if (r0 != r1) goto L_0x02d1
            r20 = 1
            goto L_0x02d3
        L_0x02d1:
            r20 = 0
        L_0x02d3:
            r14 = r12
            r15 = r14
        L_0x02d5:
            if (r14 == 0) goto L_0x04bb
            o2.f[] r0 = r14.f61592h0
            r0 = r0[r32]
            r8 = r0
        L_0x02dc:
            if (r8 == 0) goto L_0x02e9
            int r0 = r8.f61575Y
            r1 = 8
            if (r0 != r1) goto L_0x02e9
            o2.f[] r0 = r8.f61592h0
            r8 = r0[r32]
            goto L_0x02dc
        L_0x02e9:
            if (r8 != 0) goto L_0x02f2
            if (r14 != r13) goto L_0x02ee
            goto L_0x02f2
        L_0x02ee:
            r21 = r8
            goto L_0x0398
        L_0x02f2:
            o2.e[] r0 = r14.f61551A
            r0 = r0[r33]
            n2.h r1 = r0.f61538i
            o2.e r2 = r0.f61533d
            if (r2 == 0) goto L_0x02ff
            n2.h r2 = r2.f61538i
            goto L_0x0301
        L_0x02ff:
            r2 = r19
        L_0x0301:
            if (r15 == r14) goto L_0x030c
            o2.e[] r2 = r15.f61551A
            int r3 = r33 + 1
            r2 = r2[r3]
            n2.h r2 = r2.f61538i
            goto L_0x031d
        L_0x030c:
            if (r14 != r12) goto L_0x031d
            if (r15 != r14) goto L_0x031d
            o2.e[] r2 = r10.f61551A
            r2 = r2[r33]
            o2.e r2 = r2.f61533d
            if (r2 == 0) goto L_0x031b
            n2.h r2 = r2.f61538i
            goto L_0x031d
        L_0x031b:
            r2 = r19
        L_0x031d:
            int r0 = r0.mo34025b()
            o2.e[] r3 = r14.f61551A
            int r4 = r33 + 1
            r3 = r3[r4]
            int r3 = r3.mo34025b()
            if (r8 == 0) goto L_0x033a
            o2.e[] r5 = r8.f61551A
            r5 = r5[r33]
            n2.h r6 = r5.f61538i
            o2.e[] r7 = r14.f61551A
            r7 = r7[r4]
            n2.h r7 = r7.f61538i
            goto L_0x034d
        L_0x033a:
            o2.e[] r5 = r11.f61551A
            r5 = r5[r4]
            o2.e r5 = r5.f61533d
            if (r5 == 0) goto L_0x0345
            n2.h r6 = r5.f61538i
            goto L_0x0347
        L_0x0345:
            r6 = r19
        L_0x0347:
            o2.e[] r7 = r14.f61551A
            r7 = r7[r4]
            n2.h r7 = r7.f61538i
        L_0x034d:
            if (r5 == 0) goto L_0x0354
            int r5 = r5.mo34025b()
            int r3 = r3 + r5
        L_0x0354:
            if (r15 == 0) goto L_0x035f
            o2.e[] r5 = r15.f61551A
            r5 = r5[r4]
            int r5 = r5.mo34025b()
            int r0 = r0 + r5
        L_0x035f:
            if (r1 == 0) goto L_0x02ee
            if (r2 == 0) goto L_0x02ee
            if (r6 == 0) goto L_0x02ee
            if (r7 == 0) goto L_0x02ee
            if (r14 != r12) goto L_0x0371
            o2.e[] r0 = r12.f61551A
            r0 = r0[r33]
            int r0 = r0.mo34025b()
        L_0x0371:
            r5 = r0
            if (r14 != r13) goto L_0x037f
            o2.e[] r0 = r13.f61551A
            r0 = r0[r4]
            int r0 = r0.mo34025b()
            r21 = r0
            goto L_0x0381
        L_0x037f:
            r21 = r3
        L_0x0381:
            if (r20 == 0) goto L_0x0386
            r22 = 6
            goto L_0x0388
        L_0x0386:
            r22 = 4
        L_0x0388:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r31
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r21
            r21 = r8
            r8 = r22
            r0.mo33835b(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0398:
            int r0 = r14.f61575Y
            r1 = 8
            if (r0 == r1) goto L_0x039f
            r15 = r14
        L_0x039f:
            r14 = r21
            goto L_0x02d5
        L_0x03a3:
            r0 = r34
            if (r16 == 0) goto L_0x04bb
            if (r12 == 0) goto L_0x04bb
            int r1 = r0.f61522j
            if (r1 <= 0) goto L_0x03b4
            int r0 = r0.f61521i
            if (r0 != r1) goto L_0x03b4
            r20 = 1
            goto L_0x03b6
        L_0x03b4:
            r20 = 0
        L_0x03b6:
            r14 = r12
            r15 = r14
        L_0x03b8:
            if (r14 == 0) goto L_0x045d
            o2.f[] r0 = r14.f61592h0
            r0 = r0[r32]
        L_0x03be:
            if (r0 == 0) goto L_0x03cb
            int r1 = r0.f61575Y
            r2 = 8
            if (r1 != r2) goto L_0x03cb
            o2.f[] r0 = r0.f61592h0
            r0 = r0[r32]
            goto L_0x03be
        L_0x03cb:
            if (r14 == r12) goto L_0x0453
            if (r14 == r13) goto L_0x0453
            if (r0 == 0) goto L_0x0453
            if (r0 != r13) goto L_0x03d6
            r8 = r19
            goto L_0x03d7
        L_0x03d6:
            r8 = r0
        L_0x03d7:
            o2.e[] r0 = r14.f61551A
            r0 = r0[r33]
            n2.h r1 = r0.f61538i
            o2.e r2 = r0.f61533d
            if (r2 == 0) goto L_0x03e3
            n2.h r2 = r2.f61538i
        L_0x03e3:
            o2.e[] r2 = r15.f61551A
            int r3 = r33 + 1
            r2 = r2[r3]
            n2.h r2 = r2.f61538i
            int r0 = r0.mo34025b()
            o2.e[] r4 = r14.f61551A
            r4 = r4[r3]
            int r4 = r4.mo34025b()
            if (r8 == 0) goto L_0x0409
            o2.e[] r5 = r8.f61551A
            r5 = r5[r33]
            n2.h r6 = r5.f61538i
            o2.e r7 = r5.f61533d
            if (r7 == 0) goto L_0x0406
            n2.h r7 = r7.f61538i
            goto L_0x041e
        L_0x0406:
            r7 = r19
            goto L_0x041e
        L_0x0409:
            o2.e[] r5 = r14.f61551A
            r5 = r5[r3]
            o2.e r6 = r5.f61533d
            if (r6 == 0) goto L_0x0414
            n2.h r7 = r6.f61538i
            goto L_0x0416
        L_0x0414:
            r7 = r19
        L_0x0416:
            n2.h r5 = r5.f61538i
            r29 = r7
            r7 = r5
            r5 = r6
            r6 = r29
        L_0x041e:
            if (r5 == 0) goto L_0x0425
            int r5 = r5.mo34025b()
            int r4 = r4 + r5
        L_0x0425:
            r21 = r4
            o2.e[] r4 = r15.f61551A
            r3 = r4[r3]
            int r3 = r3.mo34025b()
            int r3 = r3 + r0
            if (r20 == 0) goto L_0x0435
            r22 = 6
            goto L_0x0437
        L_0x0435:
            r22 = 4
        L_0x0437:
            if (r1 == 0) goto L_0x044f
            if (r2 == 0) goto L_0x044f
            if (r6 == 0) goto L_0x044f
            if (r7 == 0) goto L_0x044f
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r31
            r5 = r6
            r6 = r7
            r7 = r21
            r21 = r8
            r8 = r22
            r0.mo33835b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0451
        L_0x044f:
            r21 = r8
        L_0x0451:
            r0 = r21
        L_0x0453:
            int r1 = r14.f61575Y
            r2 = 8
            if (r1 == r2) goto L_0x045a
            r15 = r14
        L_0x045a:
            r14 = r0
            goto L_0x03b8
        L_0x045d:
            o2.e[] r0 = r12.f61551A
            r0 = r0[r33]
            o2.e[] r1 = r10.f61551A
            r1 = r1[r33]
            o2.e r1 = r1.f61533d
            o2.e[] r2 = r13.f61551A
            int r3 = r33 + 1
            r10 = r2[r3]
            o2.e[] r2 = r11.f61551A
            r2 = r2[r3]
            o2.e r14 = r2.f61533d
            if (r1 == 0) goto L_0x04aa
            if (r12 == r13) goto L_0x0484
            n2.h r2 = r0.f61538i
            n2.h r1 = r1.f61538i
            int r0 = r0.mo34025b()
            r15 = 5
            r9.mo33837d(r2, r1, r0, r15)
            goto L_0x04ab
        L_0x0484:
            r15 = 5
            if (r14 == 0) goto L_0x04ab
            n2.h r2 = r0.f61538i
            n2.h r3 = r1.f61538i
            int r4 = r0.mo34025b()
            r5 = 1056964608(0x3f000000, float:0.5)
            n2.h r6 = r10.f61538i
            n2.h r7 = r14.f61538i
            int r8 = r10.mo34025b()
            r17 = 5
            r0 = r31
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.mo33835b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04ab
        L_0x04aa:
            r15 = 5
        L_0x04ab:
            if (r14 == 0) goto L_0x04bb
            if (r12 == r13) goto L_0x04bb
            n2.h r0 = r10.f61538i
            n2.h r1 = r14.f61538i
            int r2 = r10.mo34025b()
            int r2 = -r2
            r9.mo33837d(r0, r1, r2, r15)
        L_0x04bb:
            if (r23 != 0) goto L_0x04bf
            if (r16 == 0) goto L_0x0514
        L_0x04bf:
            if (r12 == 0) goto L_0x0514
            o2.e[] r0 = r12.f61551A
            r1 = r0[r33]
            o2.e[] r2 = r13.f61551A
            r3 = 1
            int r3 = r33 + 1
            r2 = r2[r3]
            o2.e r4 = r1.f61533d
            if (r4 == 0) goto L_0x04d3
            n2.h r4 = r4.f61538i
            goto L_0x04d5
        L_0x04d3:
            r4 = r19
        L_0x04d5:
            o2.e r5 = r2.f61533d
            if (r5 == 0) goto L_0x04dc
            n2.h r5 = r5.f61538i
            goto L_0x04de
        L_0x04dc:
            r5 = r19
        L_0x04de:
            if (r11 == r13) goto L_0x04ee
            o2.e[] r5 = r11.f61551A
            r5 = r5[r3]
            o2.e r5 = r5.f61533d
            if (r5 == 0) goto L_0x04ec
            n2.h r5 = r5.f61538i
            r19 = r5
        L_0x04ec:
            r5 = r19
        L_0x04ee:
            if (r12 != r13) goto L_0x04f2
            r2 = r0[r3]
        L_0x04f2:
            if (r4 == 0) goto L_0x0514
            if (r5 == 0) goto L_0x0514
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.mo34025b()
            o2.e[] r0 = r13.f61551A
            r0 = r0[r3]
            int r8 = r0.mo34025b()
            n2.h r1 = r1.f61538i
            n2.h r10 = r2.f61538i
            r11 = 5
            r0 = r31
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.mo33835b(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0514:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21733c.m24727b(o2.g, n2.e, int, int, o2.d):void");
    }
}
