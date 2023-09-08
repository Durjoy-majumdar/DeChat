package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C75061i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64186f0;

/* renamed from: com.tencent.mm.vfs.b1 */
public final class C75057b1 implements C75061i {

    /* renamed from: a */
    public String f220824a;

    /* renamed from: b */
    public String f220825b;

    /* renamed from: c */
    public boolean f220826c;

    /* renamed from: d */
    public boolean f220827d;

    /* renamed from: e */
    public Boolean f220828e;

    /* renamed from: f */
    public Boolean f220829f;

    /* renamed from: g */
    public Boolean f220830g;

    /* renamed from: h */
    public boolean f220831h;

    /* renamed from: i */
    public int f220832i;

    /* renamed from: j */
    public C32226l<? super FileSystem, ? extends FileSystem> f220833j;

    /* renamed from: k */
    public final Map<String, Object> f220834k;

    /* renamed from: l */
    public List<String> f220835l;

    /* renamed from: m */
    public int f220836m;

    /* renamed from: n */
    public C75059d f220837n;

    /* renamed from: com.tencent.mm.vfs.b1$a */
    public static final class C75058a extends C87413o implements C32226l<C75063i0, C13598b0> {

        /* renamed from: d */
        public static final C75058a f220838d = new C75058a();

        public C75058a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C75063i0) obj, "$this$null");
            return C13598b0.f38549a;
        }
    }

    public C75057b1(String str) {
        C87412m.m108594g(str, "name");
        this.f220824a = str;
        this.f220825b = str;
        this.f220834k = new LinkedHashMap();
        this.f220835l = C64186f0.f181907d;
    }

    /* renamed from: e */
    public static /* synthetic */ void m90008e(C75057b1 b1Var, long j, C32226l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = C75058a.f220838d;
        }
        b1Var.mo104649d(j, lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        if (r13.f220826c == false) goto L_0x0089;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.vfs.C75055a1 mo104646a() {
        /*
            r13 = this;
            com.tencent.mm.vfs.d r0 = r13.f220837n
            if (r0 == 0) goto L_0x012d
            java.lang.Boolean r1 = r13.f220828e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            boolean r0 = r1.booleanValue()
            goto L_0x0017
        L_0x000f:
            int r0 = r0.f220839a
            r1 = 2
            if (r0 != r1) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r1 = r13.f220826c
            if (r1 == 0) goto L_0x001e
            r1 = 8
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            boolean r4 = r13.f220831h
            if (r4 == 0) goto L_0x0025
            r1 = r1 | 4
        L_0x0025:
            if (r0 == 0) goto L_0x0029
            r1 = r1 | 2
        L_0x0029:
            boolean r4 = r13.f220827d
            if (r4 == 0) goto L_0x002f
            r1 = r1 | 1
        L_0x002f:
            java.lang.Boolean r4 = r13.f220829f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r6 = gy3.C87412m.m108589b(r4, r5)
            r7 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x003c
            goto L_0x0058
        L_0x003c:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x0047
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x0058
        L_0x0047:
            com.tencent.mm.vfs.d r4 = r13.f220837n
            if (r4 == 0) goto L_0x0051
            int r4 = r4.f220839a
            if (r4 != 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            if (r4 == 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            r0 = r1 | r7
            java.lang.Boolean r1 = r13.f220830g
            boolean r4 = gy3.C87412m.m108589b(r1, r5)
            r5 = 32
            if (r4 == 0) goto L_0x0065
            goto L_0x0089
        L_0x0065:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r1 = gy3.C87412m.m108589b(r1, r4)
            if (r1 == 0) goto L_0x006e
            goto L_0x0088
        L_0x006e:
            int r1 = r13.f220832i
            boolean r1 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r13, r1, r5)
            if (r1 != 0) goto L_0x0089
            com.tencent.mm.vfs.d r1 = r13.f220837n
            if (r1 == 0) goto L_0x0080
            int r1 = r1.f220839a
            if (r1 != 0) goto L_0x0080
            r1 = 1
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            if (r1 == 0) goto L_0x0088
            boolean r1 = r13.f220826c
            if (r1 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            r0 = r0 | r5
            int r1 = r13.f220832i
            r4 = 2147483632(0x7ffffff0, float:NaN)
            r1 = r1 & r4
            r1 = r1 & -33
            r7 = r1 | r0
            java.lang.String r0 = r13.f220824a
            int r1 = r0.length()
            int r1 = r1 - r2
            r4 = 0
            r5 = 0
        L_0x009d:
            r6 = 47
            if (r4 > r1) goto L_0x00c5
            if (r5 != 0) goto L_0x00a5
            r8 = r4
            goto L_0x00a6
        L_0x00a5:
            r8 = r1
        L_0x00a6:
            char r8 = r0.charAt(r8)
            boolean r9 = z04.C66713a.m78713b(r8)
            if (r9 != 0) goto L_0x00b5
            if (r8 != r6) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r8 = 0
            goto L_0x00b6
        L_0x00b5:
            r8 = 1
        L_0x00b6:
            if (r5 != 0) goto L_0x00bf
            if (r8 != 0) goto L_0x00bc
            r5 = 1
            goto L_0x009d
        L_0x00bc:
            int r4 = r4 + 1
            goto L_0x009d
        L_0x00bf:
            if (r8 != 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            int r1 = r1 + -1
            goto L_0x009d
        L_0x00c5:
            int r1 = r1 + r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = r13.f220825b
            int r1 = r0.length()
            int r1 = r1 - r2
            r4 = 0
            r8 = 0
        L_0x00d7:
            if (r4 > r1) goto L_0x00fd
            if (r8 != 0) goto L_0x00dd
            r9 = r4
            goto L_0x00de
        L_0x00dd:
            r9 = r1
        L_0x00de:
            char r9 = r0.charAt(r9)
            boolean r10 = z04.C66713a.m78713b(r9)
            if (r10 != 0) goto L_0x00ed
            if (r9 != r6) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            r9 = 0
            goto L_0x00ee
        L_0x00ed:
            r9 = 1
        L_0x00ee:
            if (r8 != 0) goto L_0x00f7
            if (r9 != 0) goto L_0x00f4
            r8 = 1
            goto L_0x00d7
        L_0x00f4:
            int r4 = r4 + 1
            goto L_0x00d7
        L_0x00f7:
            if (r9 != 0) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            int r1 = r1 + -1
            goto L_0x00d7
        L_0x00fd:
            int r1 = r1 + r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            java.lang.String r6 = r0.toString()
            int r8 = r13.f220836m
            com.tencent.mm.vfs.d r9 = r13.f220837n
            gy3.C87412m.m108591d(r9)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r13.f220834k
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0118
            r10 = r2
            goto L_0x0119
        L_0x0118:
            r10 = r0
        L_0x0119:
            java.util.List<java.lang.String> r0 = r13.f220835l
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0123
            r11 = r2
            goto L_0x0124
        L_0x0123:
            r11 = r0
        L_0x0124:
            fy3.l<? super com.tencent.mm.vfs.FileSystem, ? extends com.tencent.mm.vfs.FileSystem> r12 = r13.f220833j
            com.tencent.mm.vfs.a1 r0 = new com.tencent.mm.vfs.a1
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x012d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Must specified clean policy for "
            r1.append(r2)
            java.lang.String r2 = r13.f220824a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C75057b1.mo104646a():com.tencent.mm.vfs.a1");
    }

    /* renamed from: b */
    public final void mo104647b(long j) {
        this.f220837n = new C75070z(j);
    }

    /* renamed from: c */
    public final void mo104648c(int... iArr) {
        C87412m.m108594g(iArr, "flagList");
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        this.f220826c = C75061i.C75062a.m90022c(this, i, 8);
        this.f220827d = C75061i.C75062a.m90022c(this, i, 1);
        this.f220831h = C75061i.C75062a.m90022c(this, i, 4);
        this.f220832i = i;
    }

    /* renamed from: d */
    public final void mo104649d(long j, C32226l<? super C75063i0, C13598b0> lVar) {
        C87412m.m108594g(lVar, "setup");
        C75063i0 i0Var = new C75063i0(j, false);
        lVar.invoke(i0Var);
        this.f220837n = i0Var.mo104656a();
    }

    /* renamed from: f */
    public final void mo104650f(long j, C32226l<? super C75063i0, C13598b0> lVar) {
        C87412m.m108594g(lVar, "setup");
        C75063i0 i0Var = new C75063i0(j, true);
        lVar.invoke(i0Var);
        this.f220837n = i0Var.mo104656a();
    }

    /* renamed from: g */
    public final void mo104651g() {
        this.f220837n = new C75067q0();
    }

    /* renamed from: h */
    public final void mo104652h(String str) {
        C87412m.m108594g(str, "v");
        this.f220835l = C26236u.m33719b(str);
    }

    /* renamed from: i */
    public final void mo104653i(C32226l<? super FileSystem, ? extends FileSystem> lVar) {
        C87412m.m108594g(lVar, "wrapper");
        this.f220833j = lVar;
    }

    public C75057b1() {
        this("");
    }
}
