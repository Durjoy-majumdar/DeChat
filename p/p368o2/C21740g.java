package p368o2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p363n2.C21589e;
import p368o2.C21735e;
import p368o2.C21738f;

/* renamed from: o2.g */
public class C21740g extends C21750p {

    /* renamed from: j0 */
    public boolean f61616j0 = false;

    /* renamed from: k0 */
    public C21589e f61617k0 = new C21589e();

    /* renamed from: l0 */
    public C21748o f61618l0;

    /* renamed from: m0 */
    public int f61619m0 = 0;

    /* renamed from: n0 */
    public int f61620n0 = 0;

    /* renamed from: o0 */
    public C21734d[] f61621o0 = new C21734d[4];

    /* renamed from: p0 */
    public C21734d[] f61622p0 = new C21734d[4];

    /* renamed from: q0 */
    public List<C21741h> f61623q0 = new ArrayList();

    /* renamed from: r0 */
    public boolean f61624r0 = false;

    /* renamed from: s0 */
    public boolean f61625s0 = false;

    /* renamed from: t0 */
    public boolean f61626t0 = false;

    /* renamed from: u0 */
    public int f61627u0 = 0;

    /* renamed from: v0 */
    public int f61628v0 = 0;

    /* renamed from: w0 */
    public int f61629w0 = 7;

    /* renamed from: x0 */
    public boolean f61630x0 = false;

    /* renamed from: y0 */
    public boolean f61631y0 = false;

    /* renamed from: z0 */
    public boolean f61632z0 = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: o2.g} */
    /* JADX WARNING: type inference failed for: r5v17, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r12v20, types: [boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0400  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34058G() {
        /*
            r28 = this;
            r1 = r28
            o2.f$a r2 = p368o2.C21738f.C21739a.MATCH_CONSTRAINT
            o2.f$a r3 = p368o2.C21738f.C21739a.WRAP_CONTENT
            o2.f$a r4 = p368o2.C21738f.C21739a.FIXED
            int r5 = r1.f61559I
            int r6 = r1.f61560J
            int r0 = r28.mo34049q()
            r7 = 0
            int r8 = java.lang.Math.max(r7, r0)
            int r0 = r28.mo34043k()
            int r9 = java.lang.Math.max(r7, r0)
            r1.f61631y0 = r7
            r1.f61632z0 = r7
            o2.f r0 = r1.f61554D
            if (r0 == 0) goto L_0x00b6
            o2.o r0 = r1.f61618l0
            if (r0 != 0) goto L_0x0030
            o2.o r0 = new o2.o
            r0.<init>(r1)
            r1.f61618l0 = r0
        L_0x0030:
            o2.o r0 = r1.f61618l0
            r0.getClass()
            int r10 = r1.f61559I
            r0.f61663a = r10
            int r10 = r1.f61560J
            r0.f61664b = r10
            int r10 = r28.mo34049q()
            r0.f61665c = r10
            int r10 = r28.mo34043k()
            r0.f61666d = r10
            java.util.ArrayList<o2.o$a> r10 = r0.f61667e
            int r10 = r10.size()
            r11 = 0
        L_0x0050:
            if (r11 >= r10) goto L_0x0089
            java.util.ArrayList<o2.o$a> r12 = r0.f61667e
            java.lang.Object r12 = r12.get(r11)
            o2.o$a r12 = (p368o2.C21748o.C21749a) r12
            o2.e r13 = r12.f61668a
            o2.e$b r13 = r13.f61532c
            o2.e r13 = r1.mo34038f(r13)
            r12.f61668a = r13
            if (r13 == 0) goto L_0x007b
            o2.e r14 = r13.f61533d
            r12.f61669b = r14
            int r13 = r13.mo34025b()
            r12.f61670c = r13
            o2.e r13 = r12.f61668a
            o2.e$a r14 = r13.f61536g
            r12.f61671d = r14
            int r13 = r13.f61537h
            r12.f61672e = r13
            goto L_0x0086
        L_0x007b:
            r13 = 0
            r12.f61669b = r13
            r12.f61670c = r7
            o2.e$a r13 = p368o2.C21735e.C21736a.STRONG
            r12.f61671d = r13
            r12.f61672e = r7
        L_0x0086:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x0089:
            r1.f61559I = r7
            r1.f61560J = r7
            o2.f r0 = r1.f61554D
            if (r0 == 0) goto L_0x0097
            boolean r10 = r0 instanceof p368o2.C21740g
            if (r10 == 0) goto L_0x0097
            o2.g r0 = (p368o2.C21740g) r0
        L_0x0097:
            java.util.ArrayList<o2.e> r0 = r1.f61552B
            int r0 = r0.size()
            r10 = 0
        L_0x009e:
            if (r10 >= r0) goto L_0x00ae
            java.util.ArrayList<o2.e> r11 = r1.f61552B
            java.lang.Object r11 = r11.get(r10)
            o2.e r11 = (p368o2.C21735e) r11
            r11.mo34027d()
            int r10 = r10 + 1
            goto L_0x009e
        L_0x00ae:
            n2.e r0 = r1.f61617k0
            n2.c r0 = r0.f61145k
            r1.mo34055w(r0)
            goto L_0x00ba
        L_0x00b6:
            r1.f61559I = r7
            r1.f61560J = r7
        L_0x00ba:
            int r0 = r1.f61629w0
            r10 = 8
            r11 = 32
            r12 = 1
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r1.mo34061J(r10)
            if (r0 != 0) goto L_0x00e3
            java.util.ArrayList<o2.f> r0 = r1.f61673i0
            int r0 = r0.size()
            r28.mo34022v()
            r13 = 0
        L_0x00d3:
            if (r13 >= r0) goto L_0x00e3
            java.util.ArrayList<o2.f> r14 = r1.f61673i0
            java.lang.Object r14 = r14.get(r13)
            o2.f r14 = (p368o2.C21738f) r14
            r14.mo34022v()
            int r13 = r13 + 1
            goto L_0x00d3
        L_0x00e3:
            boolean r0 = r1.mo34061J(r11)
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r1.mo34061J(r10)
            if (r0 != 0) goto L_0x00f4
            int r0 = r1.f61629w0
            r1.mo34021c(r0)
        L_0x00f4:
            r28.mo34062K()
        L_0x00f7:
            n2.e r0 = r1.f61617k0
            r0.f61140f = r12
            goto L_0x0100
        L_0x00fc:
            n2.e r0 = r1.f61617k0
            r0.f61140f = r7
        L_0x0100:
            o2.f$a[] r0 = r1.f61553C
            r13 = r0[r12]
            r14 = r0[r7]
            r1.f61619m0 = r7
            r1.f61620n0 = r7
            java.util.List<o2.h> r0 = r1.f61623q0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0129
            java.util.List<o2.h> r0 = r1.f61623q0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<o2.h> r0 = r1.f61623q0
            o2.h r15 = new o2.h
            java.util.ArrayList<o2.f> r10 = r1.f61673i0
            r15.<init>(r10)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r7, r15)
        L_0x0129:
            java.util.List<o2.h> r0 = r1.f61623q0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r10 = r0.size()
            java.util.ArrayList<o2.f> r15 = r1.f61673i0
            o2.f$a[] r0 = r1.f61553C
            r11 = r0[r7]
            if (r11 == r3) goto L_0x0140
            r0 = r0[r12]
            if (r0 != r3) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r11 = 0
            goto L_0x0141
        L_0x0140:
            r11 = 1
        L_0x0141:
            r0 = 0
            r12 = 0
        L_0x0143:
            if (r12 >= r10) goto L_0x0480
            boolean r7 = r1.f61630x0
            if (r7 != 0) goto L_0x0480
            java.util.List<o2.h> r7 = r1.f61623q0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r12)
            o2.h r7 = (p368o2.C21741h) r7
            boolean r7 = r7.f61634b
            if (r7 == 0) goto L_0x0162
            r22 = r5
            r21 = r6
            r18 = r10
            r7 = r12
            r23 = r15
            goto L_0x0473
        L_0x0162:
            r7 = 32
            boolean r16 = r1.mo34061J(r7)
            if (r16 == 0) goto L_0x01f4
            o2.f$a[] r7 = r1.f61553C
            r18 = r10
            r17 = 0
            r10 = r7[r17]
            if (r10 != r4) goto L_0x01df
            r10 = 1
            r7 = r7[r10]
            if (r7 != r4) goto L_0x01df
            java.util.List<o2.h> r7 = r1.f61623q0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r12)
            o2.h r7 = (p368o2.C21741h) r7
            java.util.List<o2.f> r10 = r7.f61640h
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0194
            java.util.List<o2.f> r7 = r7.f61640h
            r19 = r0
            r21 = r6
            goto L_0x01da
        L_0x0194:
            java.util.List<o2.f> r10 = r7.f61633a
            int r10 = r10.size()
            r19 = r0
            r0 = 0
        L_0x019d:
            if (r0 >= r10) goto L_0x01bd
            r20 = r10
            java.util.List<o2.f> r10 = r7.f61633a
            java.lang.Object r10 = r10.get(r0)
            o2.f r10 = (p368o2.C21738f) r10
            r21 = r6
            boolean r6 = r10.f61578a0
            if (r6 != 0) goto L_0x01b6
            java.util.List<o2.f> r6 = r7.f61640h
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r7.mo34064b(r6, r10)
        L_0x01b6:
            int r0 = r0 + 1
            r10 = r20
            r6 = r21
            goto L_0x019d
        L_0x01bd:
            r21 = r6
            java.util.List<o2.f> r0 = r7.f61641i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<o2.f> r0 = r7.f61641i
            java.util.List<o2.f> r6 = r7.f61633a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r6)
            java.util.List<o2.f> r0 = r7.f61641i
            java.util.List<o2.f> r6 = r7.f61640h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.removeAll(r6)
            java.util.List<o2.f> r7 = r7.f61640h
        L_0x01da:
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f61673i0 = r7
            goto L_0x01fa
        L_0x01df:
            r19 = r0
            r21 = r6
            java.util.List<o2.h> r0 = r1.f61623q0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r12)
            o2.h r0 = (p368o2.C21741h) r0
            java.util.List<o2.f> r0 = r0.f61633a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1.f61673i0 = r0
            goto L_0x01fa
        L_0x01f4:
            r19 = r0
            r21 = r6
            r18 = r10
        L_0x01fa:
            r6 = 0
            r1.f61619m0 = r6
            r1.f61620n0 = r6
            java.util.ArrayList<o2.f> r0 = r1.f61673i0
            int r6 = r0.size()
            r0 = 0
        L_0x0206:
            if (r0 >= r6) goto L_0x021c
            java.util.ArrayList<o2.f> r7 = r1.f61673i0
            java.lang.Object r7 = r7.get(r0)
            o2.f r7 = (p368o2.C21738f) r7
            boolean r10 = r7 instanceof p368o2.C21750p
            if (r10 == 0) goto L_0x0219
            o2.p r7 = (p368o2.C21750p) r7
            r7.mo34058G()
        L_0x0219:
            int r0 = r0 + 1
            goto L_0x0206
        L_0x021c:
            r0 = 0
            r7 = 1
        L_0x021e:
            if (r7 == 0) goto L_0x0444
            r20 = r7
            r10 = 1
            int r7 = r0 + 1
            n2.e r0 = r1.f61617k0     // Catch:{ Exception -> 0x02a1 }
            r0.mo33850q()     // Catch:{ Exception -> 0x02a1 }
            r10 = 0
            r1.f61619m0 = r10     // Catch:{ Exception -> 0x02a1 }
            r1.f61620n0 = r10     // Catch:{ Exception -> 0x02a1 }
            n2.e r0 = r1.f61617k0     // Catch:{ Exception -> 0x02a1 }
            r1.mo34037e(r0)     // Catch:{ Exception -> 0x02a1 }
            r0 = 0
        L_0x0235:
            if (r0 >= r6) goto L_0x024b
            java.util.ArrayList<o2.f> r10 = r1.f61673i0     // Catch:{ Exception -> 0x02a1 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ Exception -> 0x02a1 }
            o2.f r10 = (p368o2.C21738f) r10     // Catch:{ Exception -> 0x02a1 }
            r22 = r5
            n2.e r5 = r1.f61617k0     // Catch:{ Exception -> 0x029d }
            r10.mo34037e(r5)     // Catch:{ Exception -> 0x029d }
            int r0 = r0 + 1
            r5 = r22
            goto L_0x0235
        L_0x024b:
            r22 = r5
            n2.e r0 = r1.f61617k0     // Catch:{ Exception -> 0x029d }
            r1.mo34060I(r0)     // Catch:{ Exception -> 0x029d }
            n2.e r0 = r1.f61617k0     // Catch:{ Exception -> 0x0297 }
            boolean r5 = r0.f61140f     // Catch:{ Exception -> 0x0297 }
            if (r5 == 0) goto L_0x028b
            r5 = 0
        L_0x0259:
            int r10 = r0.f61143i     // Catch:{ Exception -> 0x0297 }
            if (r5 >= r10) goto L_0x026a
            n2.b[] r10 = r0.f61139e     // Catch:{ Exception -> 0x0297 }
            r10 = r10[r5]     // Catch:{ Exception -> 0x0297 }
            boolean r10 = r10.f61130d     // Catch:{ Exception -> 0x0297 }
            if (r10 != 0) goto L_0x0267
            r5 = 0
            goto L_0x026b
        L_0x0267:
            int r5 = r5 + 1
            goto L_0x0259
        L_0x026a:
            r5 = 1
        L_0x026b:
            if (r5 != 0) goto L_0x0275
            n2.e$a r5 = r0.f61136b     // Catch:{ Exception -> 0x0297 }
            r0.mo33848o(r5)     // Catch:{ Exception -> 0x0297 }
        L_0x0272:
            r23 = r15
            goto L_0x0292
        L_0x0275:
            r5 = 0
        L_0x0276:
            int r10 = r0.f61143i     // Catch:{ Exception -> 0x0297 }
            if (r5 >= r10) goto L_0x0272
            n2.b[] r10 = r0.f61139e     // Catch:{ Exception -> 0x0297 }
            r10 = r10[r5]     // Catch:{ Exception -> 0x0297 }
            r23 = r15
            n2.h r15 = r10.f61127a     // Catch:{ Exception -> 0x0295 }
            float r10 = r10.f61128b     // Catch:{ Exception -> 0x0295 }
            r15.f61154d = r10     // Catch:{ Exception -> 0x0295 }
            int r5 = r5 + 1
            r15 = r23
            goto L_0x0276
        L_0x028b:
            r23 = r15
            n2.e$a r5 = r0.f61136b     // Catch:{ Exception -> 0x0295 }
            r0.mo33848o(r5)     // Catch:{ Exception -> 0x0295 }
        L_0x0292:
            r20 = 1
            goto L_0x02bb
        L_0x0295:
            r0 = move-exception
            goto L_0x029a
        L_0x0297:
            r0 = move-exception
            r23 = r15
        L_0x029a:
            r20 = 1
            goto L_0x02a5
        L_0x029d:
            r0 = move-exception
        L_0x029e:
            r23 = r15
            goto L_0x02a5
        L_0x02a1:
            r0 = move-exception
            r22 = r5
            goto L_0x029e
        L_0x02a5:
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "EXCEPTION : "
            r10.append(r15)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r5.println(r0)
        L_0x02bb:
            r0 = 2
            if (r20 == 0) goto L_0x0319
            n2.e r5 = r1.f61617k0
            boolean[] r10 = p368o2.C21744k.f61649a
            r17 = 0
            r10[r0] = r17
            r1.mo34035F(r5)
            java.util.ArrayList<o2.f> r15 = r1.f61673i0
            int r15 = r15.size()
            r0 = 0
        L_0x02d0:
            if (r0 >= r15) goto L_0x0316
            r24 = r15
            java.util.ArrayList<o2.f> r15 = r1.f61673i0
            java.lang.Object r15 = r15.get(r0)
            o2.f r15 = (p368o2.C21738f) r15
            r15.mo34035F(r5)
            r25 = r5
            o2.f$a[] r5 = r15.f61553C
            r5 = r5[r17]
            if (r5 != r2) goto L_0x02f6
            int r5 = r15.mo34049q()
            r26 = r12
            int r12 = r15.f61570T
            if (r5 >= r12) goto L_0x02f8
            r5 = 2
            r12 = 1
            r10[r5] = r12
            goto L_0x02fa
        L_0x02f6:
            r26 = r12
        L_0x02f8:
            r5 = 2
            r12 = 1
        L_0x02fa:
            o2.f$a[] r5 = r15.f61553C
            r5 = r5[r12]
            if (r5 != r2) goto L_0x030b
            int r5 = r15.mo34043k()
            int r15 = r15.f61571U
            if (r5 >= r15) goto L_0x030b
            r5 = 2
            r10[r5] = r12
        L_0x030b:
            int r0 = r0 + 1
            r15 = r24
            r5 = r25
            r12 = r26
            r17 = 0
            goto L_0x02d0
        L_0x0316:
            r26 = r12
            goto L_0x0359
        L_0x0319:
            r26 = r12
            n2.e r0 = r1.f61617k0
            r1.mo34035F(r0)
            r0 = 0
        L_0x0321:
            if (r0 >= r6) goto L_0x0359
            java.util.ArrayList<o2.f> r5 = r1.f61673i0
            java.lang.Object r5 = r5.get(r0)
            o2.f r5 = (p368o2.C21738f) r5
            o2.f$a[] r10 = r5.f61553C
            r12 = 0
            r10 = r10[r12]
            if (r10 != r2) goto L_0x0341
            int r10 = r5.mo34049q()
            int r12 = r5.f61570T
            if (r10 >= r12) goto L_0x0341
            boolean[] r0 = p368o2.C21744k.f61649a
            r10 = 2
            r12 = 1
            r0[r10] = r12
            goto L_0x0359
        L_0x0341:
            r10 = 2
            r12 = 1
            o2.f$a[] r15 = r5.f61553C
            r15 = r15[r12]
            if (r15 != r2) goto L_0x0356
            int r15 = r5.mo34043k()
            int r5 = r5.f61571U
            if (r15 >= r5) goto L_0x0356
            boolean[] r0 = p368o2.C21744k.f61649a
            r0[r10] = r12
            goto L_0x0359
        L_0x0356:
            int r0 = r0 + 1
            goto L_0x0321
        L_0x0359:
            if (r11 == 0) goto L_0x03c4
            r5 = 8
            if (r7 >= r5) goto L_0x03c4
            boolean[] r0 = p368o2.C21744k.f61649a
            r10 = 2
            boolean r0 = r0[r10]
            if (r0 == 0) goto L_0x03c4
            r0 = 0
            r10 = 0
            r12 = 0
        L_0x0369:
            if (r0 >= r6) goto L_0x038f
            java.util.ArrayList<o2.f> r15 = r1.f61673i0
            java.lang.Object r15 = r15.get(r0)
            o2.f r15 = (p368o2.C21738f) r15
            int r5 = r15.f61559I
            int r20 = r15.mo34049q()
            int r5 = r5 + r20
            int r10 = java.lang.Math.max(r10, r5)
            int r5 = r15.f61560J
            int r15 = r15.mo34043k()
            int r5 = r5 + r15
            int r12 = java.lang.Math.max(r12, r5)
            int r0 = r0 + 1
            r5 = 8
            goto L_0x0369
        L_0x038f:
            int r0 = r1.f61568R
            int r0 = java.lang.Math.max(r0, r10)
            int r5 = r1.f61569S
            int r5 = java.lang.Math.max(r5, r12)
            if (r14 != r3) goto L_0x03af
            int r10 = r28.mo34049q()
            if (r10 >= r0) goto L_0x03af
            r1.mo34033D(r0)
            o2.f$a[] r0 = r1.f61553C
            r10 = 0
            r0[r10] = r3
            r0 = 1
            r19 = 1
            goto L_0x03b0
        L_0x03af:
            r0 = 0
        L_0x03b0:
            if (r13 != r3) goto L_0x03c5
            int r10 = r28.mo34043k()
            if (r10 >= r5) goto L_0x03c5
            r1.mo34057z(r5)
            o2.f$a[] r0 = r1.f61553C
            r5 = 1
            r0[r5] = r3
            r0 = 1
            r19 = 1
            goto L_0x03c5
        L_0x03c4:
            r0 = 0
        L_0x03c5:
            int r5 = r1.f61568R
            int r10 = r28.mo34049q()
            int r5 = java.lang.Math.max(r5, r10)
            int r10 = r28.mo34049q()
            if (r5 <= r10) goto L_0x03e0
            r1.mo34033D(r5)
            o2.f$a[] r0 = r1.f61553C
            r5 = 0
            r0[r5] = r4
            r0 = 1
            r19 = 1
        L_0x03e0:
            int r5 = r1.f61569S
            int r10 = r28.mo34043k()
            int r5 = java.lang.Math.max(r5, r10)
            int r10 = r28.mo34043k()
            if (r5 <= r10) goto L_0x03fb
            r1.mo34057z(r5)
            o2.f$a[] r0 = r1.f61553C
            r5 = 1
            r0[r5] = r4
            r0 = 1
            r10 = 1
            goto L_0x03fe
        L_0x03fb:
            r5 = 1
            r10 = r19
        L_0x03fe:
            if (r10 != 0) goto L_0x0435
            o2.f$a[] r12 = r1.f61553C
            r15 = 0
            r12 = r12[r15]
            if (r12 != r3) goto L_0x041a
            if (r8 <= 0) goto L_0x041a
            int r12 = r28.mo34049q()
            if (r12 <= r8) goto L_0x041a
            r1.f61631y0 = r5
            o2.f$a[] r0 = r1.f61553C
            r0[r15] = r4
            r1.mo34033D(r8)
            r0 = 1
            r10 = 1
        L_0x041a:
            o2.f$a[] r12 = r1.f61553C
            r12 = r12[r5]
            if (r12 != r3) goto L_0x0435
            if (r9 <= 0) goto L_0x0435
            int r12 = r28.mo34043k()
            if (r12 <= r9) goto L_0x0435
            r1.f61632z0 = r5
            o2.f$a[] r0 = r1.f61553C
            r0[r5] = r4
            r1.mo34057z(r9)
            r0 = 1
            r19 = 1
            goto L_0x0437
        L_0x0435:
            r19 = r10
        L_0x0437:
            r5 = r22
            r15 = r23
            r12 = r26
            r27 = r7
            r7 = r0
            r0 = r27
            goto L_0x021e
        L_0x0444:
            r22 = r5
            r26 = r12
            r23 = r15
            java.util.List<o2.h> r0 = r1.f61623q0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r7 = r26
            java.lang.Object r0 = r0.get(r7)
            o2.h r0 = (p368o2.C21741h) r0
            java.util.List<o2.f> r5 = r0.f61641i
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r6 = 0
        L_0x045f:
            if (r6 >= r5) goto L_0x0471
            java.util.List<o2.f> r10 = r0.f61641i
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r6)
            o2.f r10 = (p368o2.C21738f) r10
            r0.mo34065c(r10)
            int r6 = r6 + 1
            goto L_0x045f
        L_0x0471:
            r0 = r19
        L_0x0473:
            int r12 = r7 + 1
            r10 = r18
            r6 = r21
            r5 = r22
            r15 = r23
            r7 = 0
            goto L_0x0143
        L_0x0480:
            r19 = r0
            r22 = r5
            r21 = r6
            r2 = r15
            r1.f61673i0 = r2
            o2.f r0 = r1.f61554D
            if (r0 == 0) goto L_0x04f4
            int r0 = r1.f61568R
            int r2 = r28.mo34049q()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.f61569S
            int r3 = r28.mo34043k()
            int r2 = java.lang.Math.max(r2, r3)
            o2.o r3 = r1.f61618l0
            int r4 = r3.f61663a
            r1.f61559I = r4
            int r4 = r3.f61664b
            r1.f61560J = r4
            int r4 = r3.f61665c
            r1.mo34033D(r4)
            int r4 = r3.f61666d
            r1.mo34057z(r4)
            java.util.ArrayList<o2.o$a> r4 = r3.f61667e
            int r4 = r4.size()
            r5 = 0
        L_0x04bc:
            if (r5 >= r4) goto L_0x04e8
            java.util.ArrayList<o2.o$a> r6 = r3.f61667e
            java.lang.Object r6 = r6.get(r5)
            o2.o$a r6 = (p368o2.C21748o.C21749a) r6
            o2.e r7 = r6.f61668a
            o2.e$b r7 = r7.f61532c
            o2.e r20 = r1.mo34038f(r7)
            o2.e r7 = r6.f61669b
            int r8 = r6.f61670c
            o2.e$a r9 = r6.f61671d
            int r6 = r6.f61672e
            r23 = -1
            r26 = 0
            r21 = r7
            r22 = r8
            r24 = r9
            r25 = r6
            r20.mo34024a(r21, r22, r23, r24, r25, r26)
            int r5 = r5 + 1
            goto L_0x04bc
        L_0x04e8:
            r5 = 0
            int r0 = r0 + r5
            int r0 = r0 + r5
            r1.mo34033D(r0)
            int r2 = r2 + r5
            int r2 = r2 + r5
            r1.mo34057z(r2)
            goto L_0x04fd
        L_0x04f4:
            r2 = r22
            r5 = 0
            r1.f61559I = r2
            r2 = r21
            r1.f61560J = r2
        L_0x04fd:
            if (r19 == 0) goto L_0x0506
            o2.f$a[] r0 = r1.f61553C
            r0[r5] = r14
            r2 = 1
            r0[r2] = r13
        L_0x0506:
            n2.e r0 = r1.f61617k0
            n2.c r0 = r0.f61145k
            r1.mo34055w(r0)
            o2.f r0 = r1.f61554D
            r2 = r1
        L_0x0510:
            if (r0 == 0) goto L_0x051d
            o2.f r3 = r0.f61554D
            boolean r4 = r0 instanceof p368o2.C21740g
            if (r4 == 0) goto L_0x051b
            r2 = r0
            o2.g r2 = (p368o2.C21740g) r2
        L_0x051b:
            r0 = r3
            goto L_0x0510
        L_0x051d:
            if (r1 != r2) goto L_0x0522
            r28.mo34034E()
        L_0x0522:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21740g.mo34058G():void");
    }

    /* renamed from: H */
    public void mo34059H(C21738f fVar, int i) {
        if (i == 0) {
            int i2 = this.f61619m0 + 1;
            C21734d[] dVarArr = this.f61622p0;
            if (i2 >= dVarArr.length) {
                this.f61622p0 = (C21734d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
            }
            C21734d[] dVarArr2 = this.f61622p0;
            int i3 = this.f61619m0;
            dVarArr2[i3] = new C21734d(fVar, 0, this.f61616j0);
            this.f61619m0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f61620n0 + 1;
            C21734d[] dVarArr3 = this.f61621o0;
            if (i4 >= dVarArr3.length) {
                this.f61621o0 = (C21734d[]) Arrays.copyOf(dVarArr3, dVarArr3.length * 2);
            }
            C21734d[] dVarArr4 = this.f61621o0;
            int i5 = this.f61620n0;
            dVarArr4[i5] = new C21734d(fVar, 1, this.f61616j0);
            this.f61620n0 = i5 + 1;
        }
    }

    /* renamed from: I */
    public boolean mo34060I(C21589e eVar) {
        C21738f.C21739a aVar = C21738f.C21739a.FIXED;
        C21738f.C21739a aVar2 = C21738f.C21739a.WRAP_CONTENT;
        mo34019a(eVar);
        int size = this.f61673i0.size();
        for (int i = 0; i < size; i++) {
            C21738f fVar = this.f61673i0.get(i);
            if (fVar instanceof C21740g) {
                C21738f.C21739a[] aVarArr = fVar.f61553C;
                C21738f.C21739a aVar3 = aVarArr[0];
                C21738f.C21739a aVar4 = aVarArr[1];
                if (aVar3 == aVar2) {
                    fVar.mo34030A(aVar);
                }
                if (aVar4 == aVar2) {
                    fVar.mo34032C(aVar);
                }
                fVar.mo34019a(eVar);
                if (aVar3 == aVar2) {
                    fVar.mo34030A(aVar3);
                }
                if (aVar4 == aVar2) {
                    fVar.mo34032C(aVar4);
                }
            } else {
                C21738f.C21739a aVar5 = C21738f.C21739a.MATCH_PARENT;
                if (this.f61553C[0] != aVar2 && fVar.f61553C[0] == aVar5) {
                    int i2 = fVar.f61603s.f61534e;
                    int q = mo34049q() - fVar.f61605u.f61534e;
                    C21735e eVar2 = fVar.f61603s;
                    eVar2.f61538i = eVar.mo33843j(eVar2);
                    C21735e eVar3 = fVar.f61605u;
                    eVar3.f61538i = eVar.mo33843j(eVar3);
                    eVar.mo33838e(fVar.f61603s.f61538i, i2);
                    eVar.mo33838e(fVar.f61605u.f61538i, q);
                    fVar.f61577a = 2;
                    fVar.f61559I = i2;
                    int i3 = q - i2;
                    fVar.f61555E = i3;
                    int i4 = fVar.f61568R;
                    if (i3 < i4) {
                        fVar.f61555E = i4;
                    }
                }
                if (this.f61553C[1] != aVar2 && fVar.f61553C[1] == aVar5) {
                    int i5 = fVar.f61604t.f61534e;
                    int k = mo34043k() - fVar.f61606v.f61534e;
                    C21735e eVar4 = fVar.f61604t;
                    eVar4.f61538i = eVar.mo33843j(eVar4);
                    C21735e eVar5 = fVar.f61606v;
                    eVar5.f61538i = eVar.mo33843j(eVar5);
                    eVar.mo33838e(fVar.f61604t.f61538i, i5);
                    eVar.mo33838e(fVar.f61606v.f61538i, k);
                    if (fVar.f61567Q > 0 || fVar.f61575Y == 8) {
                        C21735e eVar6 = fVar.f61607w;
                        eVar6.f61538i = eVar.mo33843j(eVar6);
                        eVar.mo33838e(fVar.f61607w.f61538i, fVar.f61567Q + i5);
                    }
                    fVar.f61579b = 2;
                    fVar.f61560J = i5;
                    int i6 = k - i5;
                    fVar.f61556F = i6;
                    int i7 = fVar.f61569S;
                    if (i6 < i7) {
                        fVar.f61556F = i7;
                    }
                }
                fVar.mo34019a(eVar);
            }
        }
        if (this.f61619m0 > 0) {
            C21733c.m24726a(this, eVar, 0);
        }
        if (this.f61620n0 > 0) {
            C21733c.m24726a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: J */
    public boolean mo34061J(int i) {
        return (this.f61629w0 & i) == i;
    }

    /* renamed from: K */
    public void mo34062K() {
        C21745l lVar = mo34038f(C21735e.C21737b.LEFT).f61530a;
        C21745l lVar2 = mo34038f(C21735e.C21737b.TOP).f61530a;
        lVar.mo34073k((C21745l) null, 0.0f);
        lVar2.mo34073k((C21745l) null, 0.0f);
    }

    /* renamed from: c */
    public void mo34021c(int i) {
        super.mo34021c(i);
        int size = this.f61673i0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f61673i0.get(i2).mo34021c(i);
        }
    }

    /* renamed from: u */
    public void mo34054u() {
        this.f61617k0.mo33850q();
        ((ArrayList) this.f61623q0).clear();
        this.f61630x0 = false;
        super.mo34054u();
    }
}
