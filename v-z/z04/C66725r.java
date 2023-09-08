package z04;

/* renamed from: z04.r */
public class C66725r extends C66724o {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m78728b(java.lang.String r18) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r18
            gy3.C87412m.m108594g(r1, r0)
            java.util.List r2 = z04.C112550d0.m153773I(r18)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x0014:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x002d
            java.lang.Object r5 = r4.next()
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = z04.C112551y.m153811k(r7)
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0014
            r3.add(r5)
            goto L_0x0014
        L_0x002d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r5 = r3.hasNext()
            r7 = 0
            if (r5 == 0) goto L_0x006e
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            int r8 = r5.length()
        L_0x004d:
            r9 = -1
            if (r7 >= r8) goto L_0x005f
            char r10 = r5.charAt(r7)
            boolean r10 = z04.C66713a.m78713b(r10)
            r10 = r10 ^ r6
            if (r10 == 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x005f:
            r7 = -1
        L_0x0060:
            if (r7 != r9) goto L_0x0066
            int r7 = r5.length()
        L_0x0066:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.add(r5)
            goto L_0x003c
        L_0x006e:
            java.lang.Comparable r3 = sx3.C110818d0.m150929a0(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x007b
            int r3 = r3.intValue()
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            int r1 = r18.length()
            int r4 = r2.size()
            int r4 = r4 * 0
            int r1 = r1 + r4
            java.lang.String r4 = ""
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0091
            r5 = 1
            goto L_0x0092
        L_0x0091:
            r5 = 0
        L_0x0092:
            if (r5 == 0) goto L_0x0097
            z04.p r4 = z04.C16092p.f43244d
            goto L_0x009d
        L_0x0097:
            z04.q r5 = new z04.q
            r5.<init>(r4)
            r4 = r5
        L_0x009d:
            int r5 = sx3.C64197v.m75536e(r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
            r9 = 0
        L_0x00ab:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0118
            java.lang.Object r10 = r2.next()
            int r11 = r9 + 1
            r12 = 0
            if (r9 < 0) goto L_0x0114
            java.lang.String r10 = (java.lang.String) r10
            if (r9 == 0) goto L_0x00c0
            if (r9 != r5) goto L_0x00c7
        L_0x00c0:
            boolean r9 = z04.C112551y.m153811k(r10)
            if (r9 == 0) goto L_0x00c7
            goto L_0x00ed
        L_0x00c7:
            gy3.C87412m.m108594g(r10, r0)
            if (r3 < 0) goto L_0x00ce
            r9 = 1
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            if (r9 == 0) goto L_0x00f4
            int r9 = r10.length()
            if (r3 <= r9) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r9 = r3
        L_0x00d9:
            java.lang.String r9 = r10.substring(r9)
            java.lang.String r12 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r9, r12)
            java.lang.Object r9 = r4.invoke(r9)
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x00ed
            r12 = r10
        L_0x00ed:
            if (r12 == 0) goto L_0x00f2
            r8.add(r12)
        L_0x00f2:
            r9 = r11
            goto L_0x00ab
        L_0x00f4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Requested character count "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " is less than zero."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0114:
            sx3.C64197v.m75542k()
            throw r12
        L_0x0118:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 124(0x7c, float:1.74E-43)
            r17 = 0
            java.lang.String r10 = "\n"
            r9 = r0
            sx3.C110818d0.m150920R(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z04.C66725r.m78728b(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m78729c(java.lang.String r17, java.lang.String r18, int r19, java.lang.Object r20) {
        /*
            r0 = 1
            r1 = r19 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = "|"
            goto L_0x000b
        L_0x0009:
            r1 = r18
        L_0x000b:
            java.lang.String r2 = "<this>"
            r3 = r17
            gy3.C87412m.m108594g(r3, r2)
            java.lang.String r2 = "marginPrefix"
            gy3.C87412m.m108594g(r1, r2)
            boolean r2 = z04.C112551y.m153811k(r1)
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x00d3
            java.util.List r2 = z04.C112550d0.m153773I(r17)
            int r3 = r17.length()
            int r4 = r2.size()
            r5 = 0
            int r4 = r4 * 0
            int r3 = r3 + r4
            java.lang.String r4 = ""
            int r6 = r4.length()
            if (r6 != 0) goto L_0x0038
            r6 = 1
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x003e
            z04.p r4 = z04.C16092p.f43244d
            goto L_0x0044
        L_0x003e:
            z04.q r6 = new z04.q
            r6.<init>(r4)
            r4 = r6
        L_0x0044:
            int r6 = sx3.C64197v.m75536e(r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
            r8 = 0
        L_0x0052:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00b5
            java.lang.Object r9 = r2.next()
            int r10 = r8 + 1
            r11 = 0
            if (r8 < 0) goto L_0x00b1
            java.lang.String r9 = (java.lang.String) r9
            if (r8 == 0) goto L_0x0067
            if (r8 != r6) goto L_0x006e
        L_0x0067:
            boolean r8 = z04.C112551y.m153811k(r9)
            if (r8 == 0) goto L_0x006e
            goto L_0x00aa
        L_0x006e:
            int r8 = r9.length()
            r12 = 0
        L_0x0073:
            r13 = -1
            if (r12 >= r8) goto L_0x0085
            char r14 = r9.charAt(r12)
            boolean r14 = z04.C66713a.m78713b(r14)
            r14 = r14 ^ r0
            if (r14 == 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            int r12 = r12 + 1
            goto L_0x0073
        L_0x0085:
            r12 = -1
        L_0x0086:
            if (r12 != r13) goto L_0x0089
            goto L_0x009e
        L_0x0089:
            boolean r8 = r9.startsWith(r1, r12)
            if (r8 == 0) goto L_0x009e
            int r8 = r1.length()
            int r12 = r12 + r8
            java.lang.String r11 = r9.substring(r12)
            java.lang.String r8 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r11, r8)
        L_0x009e:
            if (r11 == 0) goto L_0x00a9
            java.lang.Object r8 = r4.invoke(r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x00aa
        L_0x00a9:
            r11 = r9
        L_0x00aa:
            if (r11 == 0) goto L_0x00af
            r7.add(r11)
        L_0x00af:
            r8 = r10
            goto L_0x0052
        L_0x00b1:
            sx3.C64197v.m75542k()
            throw r11
        L_0x00b5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            java.lang.String r9 = "\n"
            r8 = r0
            sx3.C110818d0.m150920R(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        L_0x00d3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "marginPrefix must be non-blank string."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z04.C66725r.m78729c(java.lang.String, java.lang.String, int, java.lang.Object):java.lang.String");
    }
}
