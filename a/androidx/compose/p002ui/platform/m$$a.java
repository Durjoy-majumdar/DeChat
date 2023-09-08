package androidx.compose.p002ui.platform;

/* renamed from: androidx.compose.ui.platform.m$$a */
public final /* synthetic */ class m$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C103662m f306178d;

    public /* synthetic */ m$$a(C103662m mVar) {
        this.f306178d = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: u1.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v87, types: [w1.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0515, code lost:
        if (r1.f332591b != null) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x051c, code lost:
        if (r1.f332591b == null) goto L_0x051e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r37 = this;
            r0 = r37
            androidx.compose.ui.platform.m r8 = r0.f306178d
            java.lang.String r1 = "this$0"
            gy3.C87412m.m108594g(r8, r1)
            androidx.compose.ui.platform.AndroidComposeView r1 = r8.f306159e
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 1
            r12 = 0
            p658q1.C110282c0.C110283a.m149951a(r1, r9, r11, r12)
            androidx.compose.ui.platform.AndroidComposeView r1 = r8.f306159e
            u1.u r1 = r1.getSemanticsOwner()
            u1.s r1 = r1.mo162843a()
            androidx.compose.ui.platform.m$$g r2 = r8.f306176y
            r8.mo144793v(r1, r2)
            java.util.Map r13 = r8.mo144781g()
            java.lang.String r1 = "newSemanticsNodes"
            gy3.C87412m.m108594g(r13, r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.List<androidx.compose.ui.platform.u1> r1 = r8.f306157B
            r14.<init>(r1)
            java.util.List<androidx.compose.ui.platform.u1> r1 = r8.f306157B
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r15 = r1.iterator()
            r1 = r8
        L_0x0044:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0587
            java.lang.Object r2 = r15.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r5 = r2.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.m$$g> r2 = r1.f306175x
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r2 = r2.get(r3)
            r4 = r2
            androidx.compose.ui.platform.m$$g r4 = (androidx.compose.p002ui.platform.m$$g) r4
            if (r4 != 0) goto L_0x0066
            goto L_0x0044
        L_0x0066:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r13.get(r2)
            androidx.compose.ui.platform.v1 r2 = (androidx.compose.p002ui.platform.C103703v1) r2
            if (r2 == 0) goto L_0x0076
            u1.s r2 = r2.f306289a
            r3 = r2
            goto L_0x0077
        L_0x0076:
            r3 = r12
        L_0x0077:
            gy3.C87412m.m108591d(r3)
            u1.k r2 = r3.f332640e
            java.util.Iterator r23 = r2.iterator()
            r2 = r1
            r24 = 0
        L_0x0083:
            boolean r1 = r23.hasNext()
            if (r1 == 0) goto L_0x053e
            java.lang.Object r1 = r23.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getKey()
            u1.z<u1.i> r7 = p246u1.C111092v.f332658m
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 != 0) goto L_0x00aa
            java.lang.Object r6 = r1.getKey()
            u1.z<u1.i> r9 = p246u1.C111092v.f332659n
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 == 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r9 = 0
            goto L_0x00cf
        L_0x00aa:
            androidx.compose.ui.platform.u1 r6 = androidx.compose.p002ui.platform.C103678q.m137968c(r14, r5)
            if (r6 == 0) goto L_0x00b2
            r9 = 0
            goto L_0x00c8
        L_0x00b2:
            androidx.compose.ui.platform.u1 r6 = new androidx.compose.ui.platform.u1
            java.util.List<androidx.compose.ui.platform.u1> r9 = r2.f306157B
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r6
            r17 = r5
            r18 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r9 = 1
        L_0x00c8:
            java.util.List<androidx.compose.ui.platform.u1> r12 = r2.f306157B
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.add(r6)
        L_0x00cf:
            if (r9 != 0) goto L_0x00e8
            java.lang.Object r6 = r1.getValue()
            u1.k r9 = r4.f306187a
            java.lang.Object r12 = r1.getKey()
            u1.z r12 = (p246u1.C111096z) r12
            java.lang.Object r9 = p246u1.C111076l.m151465a(r9, r12)
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 == 0) goto L_0x00e8
            goto L_0x010b
        L_0x00e8:
            java.lang.Object r6 = r1.getKey()
            u1.z r6 = (p246u1.C111096z) r6
            u1.z<java.lang.String> r9 = p246u1.C111092v.f332649d
            boolean r12 = gy3.C87412m.m108589b(r6, r9)
            r11 = 8
            if (r12 == 0) goto L_0x011a
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = (java.lang.String) r1
            u1.k r6 = r4.f306187a
            boolean r6 = r6.mo162823i(r9)
            if (r6 == 0) goto L_0x010b
            r2.mo144790t(r5, r11, r1)
        L_0x010b:
            r0 = r2
            r9 = r3
            r26 = r4
            r12 = r5
            goto L_0x02a9
        L_0x0112:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            r1.<init>(r2)
            throw r1
        L_0x011a:
            u1.z<java.lang.String> r9 = p246u1.C111092v.f332647b
            boolean r9 = gy3.C87412m.m108589b(r6, r9)
            if (r9 == 0) goto L_0x0124
            r9 = 1
            goto L_0x012a
        L_0x0124:
            u1.z<v1.a> r9 = p246u1.C111092v.f332668w
            boolean r9 = gy3.C87412m.m108589b(r6, r9)
        L_0x012a:
            r12 = 64
            if (r9 == 0) goto L_0x0165
            int r6 = r2.mo144787p(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r9 = 0
            r11 = 8
            r12 = 0
            r18 = 2048(0x800, float:2.87E-42)
            r1 = r8
            r25 = r2
            r2 = r6
            r6 = r3
            r3 = r18
            r26 = r4
            r4 = r7
            r7 = r5
            r5 = r9
            r9 = r6
            r6 = r11
            r11 = r7
            r0 = 32
            r7 = r12
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            r12 = r25
            int r2 = r12.mo144787p(r11)
            r5 = 0
            r6 = 8
            r7 = 0
            r3 = 2048(0x800, float:2.87E-42)
            r4 = r10
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            r0 = r12
            r12 = r11
            goto L_0x02a9
        L_0x0165:
            r9 = r3
            r26 = r4
            r0 = 32
            r4 = r2
            u1.z<u1.g> r2 = p246u1.C111092v.f332648c
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x01a6
            int r2 = r4.mo144787p(r5)
            r11 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r18 = 8
            r19 = 0
            r3 = 2048(0x800, float:2.87E-42)
            r7 = 0
            r20 = 8
            r21 = 0
            r1 = r8
            r0 = r4
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r6
            r6 = r20
            r12 = r7
            r7 = r21
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            int r2 = r0.mo144787p(r12)
            r3 = r11
            r4 = r10
            r5 = 0
            r6 = r18
            r7 = r19
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02a9
        L_0x01a6:
            r0 = r4
            r12 = r5
            r2 = 64
            u1.z<java.lang.Boolean> r3 = p246u1.C111092v.f332667v
            boolean r4 = gy3.C87412m.m108589b(r6, r3)
            r5 = 4
            if (r4 == 0) goto L_0x028c
            u1.k r1 = r9.mo162837f()
            u1.z<u1.h> r4 = p246u1.C111092v.f332661p
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r4)
            u1.h r1 = (p246u1.C111072h) r1
            if (r1 != 0) goto L_0x01c2
            goto L_0x01c8
        L_0x01c2:
            int r1 = r1.f332604a
            if (r1 != r5) goto L_0x01c8
            r1 = 1
            goto L_0x01c9
        L_0x01c8:
            r1 = 0
        L_0x01c9:
            if (r1 == 0) goto L_0x025b
            u1.k r1 = r9.mo162837f()
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r3)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x024b
            int r1 = r0.mo144787p(r12)
            android.view.accessibility.AccessibilityEvent r1 = r0.mo144777c(r1, r5)
            u1.s r2 = new u1.s
            u1.m r3 = r9.f332636a
            r4 = 1
            r2.<init>(r3, r4)
            u1.k r3 = r2.mo162837f()
            u1.z<java.util.List<java.lang.String>> r4 = p246u1.C111092v.f332646a
            java.lang.Object r3 = p246u1.C111076l.m151465a(r3, r4)
            r27 = r3
            java.util.List r27 = (java.util.List) r27
            if (r27 == 0) goto L_0x0210
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 62
            r35 = 0
            java.lang.String r28 = ","
            java.lang.String r3 = p721v0.C111306l.m151789a(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0211
        L_0x0210:
            r3 = 0
        L_0x0211:
            u1.k r2 = r2.mo162837f()
            u1.z<java.util.List<w1.a>> r4 = p246u1.C111092v.f332663r
            java.lang.Object r2 = p246u1.C111076l.m151465a(r2, r4)
            r27 = r2
            java.util.List r27 = (java.util.List) r27
            if (r27 == 0) goto L_0x0236
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 62
            r35 = 0
            java.lang.String r28 = ","
            java.lang.String r2 = p721v0.C111306l.m151789a(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0237
        L_0x0236:
            r2 = 0
        L_0x0237:
            if (r3 == 0) goto L_0x023e
            r1.setContentDescription(r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x023e:
            if (r2 == 0) goto L_0x0247
            java.util.List r3 = r1.getText()
            r3.add(r2)
        L_0x0247:
            r0.mo144788q(r1)
            goto L_0x02a9
        L_0x024b:
            int r2 = r0.mo144787p(r12)
            r3 = 2048(0x800, float:2.87E-42)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r4 = r10
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02a9
        L_0x025b:
            int r3 = r0.mo144787p(r12)
            r11 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r18 = 0
            r19 = 8
            r20 = 0
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 0
            r7 = 8
            r21 = 0
            r1 = r8
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r21
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            int r2 = r0.mo144787p(r12)
            r3 = r11
            r4 = r10
            r5 = r18
            r6 = r19
            r7 = r20
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02a9
        L_0x028c:
            u1.z<java.util.List<java.lang.String>> r2 = p246u1.C111092v.f332646a
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x02b5
            int r2 = r0.mo144787p(r12)
            r3 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x02ad
            java.util.List r1 = (java.util.List) r1
            r0.mo144789r(r2, r3, r4, r1)
        L_0x02a9:
            r36 = r26
            goto L_0x044f
        L_0x02ad:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            r0.<init>(r1)
            throw r0
        L_0x02b5:
            u1.z<w1.a> r2 = p246u1.C111092v.f332664s
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0360
            boolean r1 = androidx.compose.p002ui.platform.C103678q.m137971f(r9)
            if (r1 == 0) goto L_0x0349
            r11 = r26
            u1.k r1 = r11.f306187a
            w1.a r1 = r0.mo144784i(r1)
            if (r1 == 0) goto L_0x02d0
            goto L_0x02d1
        L_0x02d0:
            r1 = r3
        L_0x02d1:
            u1.k r2 = r9.f332640e
            w1.a r2 = r0.mo144784i(r2)
            if (r2 == 0) goto L_0x02da
            r3 = r2
        L_0x02da:
            int r2 = r1.length()
            int r5 = r3.length()
            if (r2 <= r5) goto L_0x02e6
            r6 = r5
            goto L_0x02e7
        L_0x02e6:
            r6 = r2
        L_0x02e7:
            r7 = 0
        L_0x02e8:
            if (r7 >= r6) goto L_0x02fc
            char r4 = r1.charAt(r7)
            r26 = r11
            char r11 = r3.charAt(r7)
            if (r4 == r11) goto L_0x02f7
            goto L_0x02fe
        L_0x02f7:
            int r7 = r7 + 1
            r11 = r26
            goto L_0x02e8
        L_0x02fc:
            r26 = r11
        L_0x02fe:
            r4 = 0
        L_0x02ff:
            int r11 = r6 - r7
            if (r4 >= r11) goto L_0x031c
            int r11 = r2 + -1
            int r11 = r11 - r4
            char r11 = r1.charAt(r11)
            int r19 = r5 + -1
            r20 = r6
            int r6 = r19 - r4
            char r6 = r3.charAt(r6)
            if (r11 == r6) goto L_0x0317
            goto L_0x031c
        L_0x0317:
            int r4 = r4 + 1
            r6 = r20
            goto L_0x02ff
        L_0x031c:
            int r2 = r2 - r4
            int r2 = r2 - r7
            int r5 = r5 - r4
            int r5 = r5 - r7
            int r4 = r0.mo144787p(r12)
            r11 = 16
            android.view.accessibility.AccessibilityEvent r4 = r0.mo144777c(r4, r11)
            r4.setFromIndex(r7)
            r4.setRemovedCount(r2)
            r4.setAddedCount(r5)
            r4.setBeforeText(r1)
            java.util.List r1 = r4.getText()
            r2 = 100000(0x186a0, float:1.4013E-40)
            java.lang.CharSequence r2 = r0.mo144796y(r3, r2)
            r1.add(r2)
            r0.mo144788q(r4)
            goto L_0x02a9
        L_0x0349:
            r11 = 16
            int r2 = r0.mo144787p(r12)
            r3 = 2048(0x800, float:2.87E-42)
            r1 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02a9
        L_0x0360:
            r5 = r26
            r4 = 16
            u1.z<w1.x> r2 = p246u1.C111092v.f332665t
            boolean r19 = gy3.C87412m.m108589b(r6, r2)
            if (r19 == 0) goto L_0x03c8
            u1.k r1 = r9.f332640e
            w1.a r1 = r0.mo144784i(r1)
            if (r1 == 0) goto L_0x037a
            java.lang.String r1 = r1.f100413d
            if (r1 != 0) goto L_0x0379
            goto L_0x037a
        L_0x0379:
            r3 = r1
        L_0x037a:
            u1.k r1 = r9.f332640e
            java.lang.Object r1 = r1.mo162825k(r2)
            w1.x r1 = (p735w1.C38006x) r1
            long r1 = r1.f100500a
            int r0 = r0.mo144787p(r12)
            r26 = r5
            r6 = 32
            long r4 = r1 >> r6
            int r5 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            int r1 = p735w1.C38006x.m41695c(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = r3.length()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r1 = 100000(0x186a0, float:1.4013E-40)
            java.lang.CharSequence r1 = r8.mo144796y(r3, r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r8
            r2 = r0
            r3 = r4
            r0 = 16
            r4 = r5
            r11 = r26
            r5 = r6
            r6 = r7
            android.view.accessibility.AccessibilityEvent r1 = r1.mo144778d(r2, r3, r4, r5, r6)
            r8.mo144788q(r1)
            int r1 = r9.f332641f
            r8.mo144791u(r1)
            r2 = r8
            r36 = r11
            goto L_0x0450
        L_0x03c8:
            boolean r2 = gy3.C87412m.m108589b(r6, r7)
            if (r2 == 0) goto L_0x03d0
            r2 = 1
            goto L_0x03d6
        L_0x03d0:
            u1.z<u1.i> r2 = p246u1.C111092v.f332659n
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
        L_0x03d6:
            if (r2 == 0) goto L_0x0416
            q1.j r1 = r9.f332642g
            r0.mo144786k(r1)
            java.util.List<androidx.compose.ui.platform.u1> r1 = r0.f306157B
            androidx.compose.ui.platform.u1 r1 = androidx.compose.p002ui.platform.C103678q.m137968c(r1, r12)
            gy3.C87412m.m108591d(r1)
            u1.k r2 = r9.f332640e
            java.lang.Object r2 = p246u1.C111076l.m151465a(r2, r7)
            u1.i r2 = (p246u1.C111073i) r2
            r1.f306265h = r2
            u1.k r2 = r9.f332640e
            u1.z<u1.i> r3 = p246u1.C111092v.f332659n
            java.lang.Object r2 = p246u1.C111076l.m151465a(r2, r3)
            u1.i r2 = (p246u1.C111073i) r2
            r1.f306266i = r2
            boolean r2 = r1.isValid()
            if (r2 != 0) goto L_0x0403
            goto L_0x0413
        L_0x0403:
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f306159e
            q1.f0 r2 = r2.getSnapshotObserver()
            fy3.l<androidx.compose.ui.platform.u1, rx3.b0> r3 = r0.f306158C
            androidx.compose.ui.platform.o r6 = new androidx.compose.ui.platform.o
            r6.<init>(r1, r0)
            r2.mo161693a(r1, r3, r6)
        L_0x0413:
            r36 = r5
            goto L_0x044f
        L_0x0416:
            u1.z<java.lang.Boolean> r2 = p246u1.C111092v.f332656k
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x045d
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x0455
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0439
            int r1 = r9.f332641f
            int r1 = r0.mo144787p(r1)
            android.view.accessibility.AccessibilityEvent r1 = r0.mo144777c(r1, r11)
            r0.mo144788q(r1)
        L_0x0439:
            int r1 = r9.f332641f
            int r2 = r0.mo144787p(r1)
            r3 = 2048(0x800, float:2.87E-42)
            r6 = 0
            r7 = 8
            r11 = 0
            r1 = r8
            r4 = r10
            r36 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
        L_0x044f:
            r2 = r0
        L_0x0450:
            r3 = r36
            r11 = 0
            goto L_0x04d8
        L_0x0455:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            r0.<init>(r1)
            throw r0
        L_0x045d:
            r36 = r5
            u1.z<java.util.List<u1.d>> r2 = p246u1.C111074j.f332623p
            boolean r3 = gy3.C87412m.m108589b(r6, r2)
            if (r3 == 0) goto L_0x04db
            u1.k r1 = r9.f332640e
            java.lang.Object r1 = r1.mo162825k(r2)
            java.util.List r1 = (java.util.List) r1
            r3 = r36
            u1.k r4 = r3.f306187a
            java.lang.Object r2 = p246u1.C111076l.m151465a(r4, r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x04cd
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r5 = r1.size()
            r6 = 0
        L_0x0485:
            if (r6 >= r5) goto L_0x0497
            java.lang.Object r7 = r1.get(r6)
            u1.d r7 = (p246u1.C14098d) r7
            r7.getClass()
            r7 = 0
            r4.add(r7)
            int r6 = r6 + 1
            goto L_0x0485
        L_0x0497:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r5 = r2.size()
            r6 = 0
        L_0x04a1:
            if (r6 >= r5) goto L_0x04b3
            java.lang.Object r7 = r2.get(r6)
            u1.d r7 = (p246u1.C14098d) r7
            r7.getClass()
            r11 = 0
            r1.add(r11)
            int r6 = r6 + 1
            goto L_0x04a1
        L_0x04b3:
            r11 = 0
            boolean r2 = r4.containsAll(r1)
            if (r2 == 0) goto L_0x04c8
            boolean r1 = r1.containsAll(r4)
            if (r1 != 0) goto L_0x04c1
            goto L_0x04c8
        L_0x04c1:
            r2 = r0
            r16 = 1
            r24 = 0
            goto L_0x0534
        L_0x04c8:
            r2 = r0
            r16 = 1
            goto L_0x0532
        L_0x04cd:
            r11 = 0
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x04d7
            goto L_0x052f
        L_0x04d7:
            r2 = r0
        L_0x04d8:
            r16 = 1
            goto L_0x0534
        L_0x04db:
            r3 = r36
            r11 = 0
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof p246u1.C111063a
            if (r2 == 0) goto L_0x052f
            java.lang.Object r2 = r1.getValue()
            if (r2 == 0) goto L_0x0527
            u1.a r2 = (p246u1.C111063a) r2
            u1.k r4 = r3.f306187a
            java.lang.Object r1 = r1.getKey()
            u1.z r1 = (p246u1.C111096z) r1
            java.lang.Object r1 = p246u1.C111076l.m151465a(r4, r1)
            if (r2 != r1) goto L_0x04fd
            goto L_0x0520
        L_0x04fd:
            boolean r4 = r1 instanceof p246u1.C111063a
            if (r4 != 0) goto L_0x0502
            goto L_0x051e
        L_0x0502:
            java.lang.String r4 = r2.f332590a
            u1.a r1 = (p246u1.C111063a) r1
            java.lang.String r5 = r1.f332590a
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 != 0) goto L_0x050f
            goto L_0x051e
        L_0x050f:
            T r2 = r2.f332591b
            if (r2 != 0) goto L_0x0518
            T r4 = r1.f332591b
            if (r4 == 0) goto L_0x0518
            goto L_0x051e
        L_0x0518:
            if (r2 == 0) goto L_0x0520
            T r1 = r1.f332591b
            if (r1 != 0) goto L_0x0520
        L_0x051e:
            r4 = 0
            goto L_0x0521
        L_0x0520:
            r4 = 1
        L_0x0521:
            r16 = 1
            r24 = r4 ^ 1
            r2 = r0
            goto L_0x0534
        L_0x0527:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            r0.<init>(r1)
            throw r0
        L_0x052f:
            r16 = 1
            r2 = r0
        L_0x0532:
            r24 = 1
        L_0x0534:
            r0 = r37
            r4 = r3
            r3 = r9
            r5 = r12
            r9 = 0
            r12 = r11
            r11 = 1
            goto L_0x0083
        L_0x053e:
            r0 = r2
            r9 = r3
            r3 = r4
            r11 = r12
            r16 = 1
            r12 = r5
            if (r24 != 0) goto L_0x056e
            u1.k r1 = r3.f306187a
            java.util.Iterator r1 = r1.iterator()
        L_0x054d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x056c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            u1.k r3 = r9.mo162837f()
            java.lang.Object r2 = r2.getKey()
            u1.z r2 = (p246u1.C111096z) r2
            boolean r2 = r3.mo162823i(r2)
            if (r2 != 0) goto L_0x054d
            r24 = 1
            goto L_0x056e
        L_0x056c:
            r24 = 0
        L_0x056e:
            if (r24 == 0) goto L_0x057f
            int r2 = r0.mo144787p(r12)
            r3 = 2048(0x800, float:2.87E-42)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r4 = r10
            androidx.compose.p002ui.platform.C103662m.m137847s(r1, r2, r3, r4, r5, r6, r7)
        L_0x057f:
            r1 = r0
            r12 = r11
            r9 = 0
            r11 = 1
            r0 = r37
            goto L_0x0044
        L_0x0587:
            r11 = r12
            u.d<java.lang.Integer> r0 = r1.f306174w
            java.util.Iterator r0 = r0.iterator()
        L_0x058e:
            r2 = r0
            u.h$a r2 = (p1042u.C118556h.C118557a) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05ea
            java.lang.Object r2 = r2.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Map r3 = r8.mo144781g()
            java.lang.Object r3 = r3.get(r2)
            androidx.compose.ui.platform.v1 r3 = (androidx.compose.p002ui.platform.C103703v1) r3
            if (r3 == 0) goto L_0x05ac
            u1.s r7 = r3.f306289a
            goto L_0x05ad
        L_0x05ac:
            r7 = r11
        L_0x05ad:
            if (r7 == 0) goto L_0x05bb
            u1.k r3 = r7.mo162837f()
            u1.z<java.lang.String> r4 = p246u1.C111092v.f332649d
            boolean r3 = r3.mo162823i(r4)
            if (r3 != 0) goto L_0x058e
        L_0x05bb:
            u.d<java.lang.Integer> r3 = r1.f306174w
            r3.remove(r2)
            java.lang.String r3 = "id"
            gy3.C87412m.m108593f(r2, r3)
            int r3 = r2.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.m$$g> r4 = r1.f306175x
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r2 = r4.get(r2)
            androidx.compose.ui.platform.m$$g r2 = (androidx.compose.p002ui.platform.m$$g) r2
            if (r2 == 0) goto L_0x05e3
            u1.k r2 = r2.f306187a
            if (r2 == 0) goto L_0x05e3
            u1.z<java.lang.String> r4 = p246u1.C111092v.f332649d
            java.lang.Object r2 = p246u1.C111076l.m151465a(r2, r4)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x05e4
        L_0x05e3:
            r7 = r11
        L_0x05e4:
            r2 = 32
            r1.mo144790t(r3, r2, r7)
            goto L_0x058e
        L_0x05ea:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.m$$g> r0 = r1.f306175x
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            java.util.Map r0 = r8.mo144781g()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x05fd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0666
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.compose.ui.platform.v1 r3 = (androidx.compose.p002ui.platform.C103703v1) r3
            u1.s r3 = r3.f306289a
            u1.k r3 = r3.mo162837f()
            u1.z<java.lang.String> r4 = p246u1.C111092v.f332649d
            boolean r3 = r3.mo162823i(r4)
            if (r3 == 0) goto L_0x0649
            u.d<java.lang.Integer> r3 = r1.f306174w
            java.lang.Object r5 = r2.getKey()
            boolean r3 = r3.add(r5)
            if (r3 == 0) goto L_0x0649
            java.lang.Object r3 = r2.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r5 = r2.getValue()
            androidx.compose.ui.platform.v1 r5 = (androidx.compose.p002ui.platform.C103703v1) r5
            u1.s r5 = r5.f306289a
            u1.k r5 = r5.f332640e
            java.lang.Object r4 = r5.mo162825k(r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 16
            r1.mo144790t(r3, r5, r4)
            goto L_0x064b
        L_0x0649:
            r5 = 16
        L_0x064b:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.m$$g> r3 = r1.f306175x
            java.lang.Object r4 = r2.getKey()
            androidx.compose.ui.platform.m$$g r6 = new androidx.compose.ui.platform.m$$g
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.platform.v1 r2 = (androidx.compose.p002ui.platform.C103703v1) r2
            u1.s r2 = r2.f306289a
            java.util.Map r7 = r8.mo144781g()
            r6.<init>(r2, r7)
            r3.put(r4, r6)
            goto L_0x05fd
        L_0x0666:
            androidx.compose.ui.platform.m$$g r0 = new androidx.compose.ui.platform.m$$g
            androidx.compose.ui.platform.AndroidComposeView r2 = r1.f306159e
            u1.u r2 = r2.getSemanticsOwner()
            u1.s r2 = r2.mo162843a()
            java.util.Map r3 = r8.mo144781g()
            r0.<init>(r2, r3)
            r1.f306176y = r0
            r0 = 0
            r1.f306177z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.m$$a.run():void");
    }
}
