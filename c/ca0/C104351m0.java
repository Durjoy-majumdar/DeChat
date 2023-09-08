package ca0;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: ca0.m0 */
public final class C104351m0 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<Integer> f308969d;

    /* renamed from: e */
    public final /* synthetic */ int f308970e;

    /* renamed from: f */
    public final /* synthetic */ boolean f308971f;

    /* renamed from: g */
    public final /* synthetic */ float f308972g;

    /* renamed from: h */
    public final /* synthetic */ long f308973h;

    /* renamed from: i */
    public final /* synthetic */ float f308974i;

    /* renamed from: j */
    public final /* synthetic */ float f308975j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104351m0(C60690y0<Integer> y0Var, int i, boolean z, float f, float f2, long j, float f3, float f4) {
        super(2);
        this.f308969d = y0Var;
        this.f308970e = i;
        this.f308971f = z;
        this.f308972g = f2;
        this.f308973h = j;
        this.f308974i = f3;
        this.f308975j = f4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: ca0.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: ca0.l0} */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009f, code lost:
        if (r4 == p175j0.C108504h.C60656a.f172772a) goto L_0x00a1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            j0.h r1 = (p175j0.C108504h) r1
            r2 = r22
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r2 = r2 & 11
            r3 = 2
            if (r2 != r3) goto L_0x001f
            boolean r2 = r1.mo51575a()
            if (r2 != 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r1.mo51581d()
            goto L_0x0153
        L_0x001f:
            v0.j$a r2 = p721v0.C65503j.C65504a.f188490d
            r4 = 0
            r5 = 1
            r6 = 0
            v0.j r2 = p435a0.C103214y0.m136590f(r2, r4, r5, r6)
            r4 = 8
            java.lang.Object[] r7 = new java.lang.Object[r4]
            j0.y0<java.lang.Integer> r8 = r0.f308969d
            r9 = 0
            r7[r9] = r8
            int r8 = r0.f308970e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            boolean r5 = r0.f308971f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7[r3] = r5
            r3 = 3
            r5 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7[r3] = r5
            r3 = 4
            float r5 = r0.f308972g
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7[r3] = r5
            r3 = 5
            long r10 = r0.f308973h
            a1.w r5 = new a1.w
            r5.<init>(r10)
            r7[r3] = r5
            r3 = 6
            float r5 = r0.f308974i
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7[r3] = r5
            r3 = 7
            float r5 = r0.f308975j
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7[r3] = r5
            int r11 = r0.f308970e
            boolean r12 = r0.f308971f
            float r14 = r0.f308972g
            r3 = r14
            long r13 = r0.f308973h
            float r5 = r0.f308974i
            float r8 = r0.f308975j
            j0.y0<java.lang.Integer> r15 = r0.f308969d
            r10 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.mo51557H(r10)
            r10 = 0
            r16 = 0
        L_0x0088:
            if (r10 >= r4) goto L_0x0097
            r4 = r7[r10]
            boolean r4 = r1.mo51619x(r4)
            r16 = r16 | r4
            int r10 = r10 + 1
            r4 = 8
            goto L_0x0088
        L_0x0097:
            java.lang.Object r4 = r1.mo51606q()
            if (r16 != 0) goto L_0x00a1
            java.lang.Object r7 = p175j0.C108504h.C60656a.f172772a
            if (r4 != r7) goto L_0x00ba
        L_0x00a1:
            ca0.l0 r4 = new ca0.l0
            r10 = r4
            r16 = r13
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r13 = r7
            r14 = r3
            r3 = r15
            r15 = r16
            r17 = r5
            r18 = r8
            r19 = r3
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19)
            r1.mo51553F(r4)
        L_0x00ba:
            r1.mo51565P()
            fy3.l r4 = (fy3.C32226l) r4
            v0.j r2 = p868x0.C111983i.m152700a(r2, r4)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.mo51557H(r3)
            v0.a r3 = p721v0.C111294a.C111295a.f333219a
            o1.y r3 = p435a0.C103141f.m136472c(r3, r9, r1, r9)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo51557H(r4)
            j0.f1<i2.d> r4 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r4 = r1.mo51598m(r4)
            i2.d r4 = (p560i2.C108322d) r4
            j0.f1<i2.o> r5 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r5 = r1.mo51598m(r5)
            i2.o r5 = (p560i2.C33183o) r5
            j0.f1<androidx.compose.ui.platform.i2> r7 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r7 = r1.mo51598m(r7)
            androidx.compose.ui.platform.i2 r7 = (androidx.compose.p002ui.platform.C103633i2) r7
            q1.a$a r8 = p658q1.C110269a.f329831D0
            r8.getClass()
            fy3.a<q1.a> r8 = p658q1.C110269a.C110270a.f329833b
            fy3.q r2 = p631o1.C109863q.m149330a(r2)
            j0.d r10 = r1.mo51543A()
            boolean r10 = r10 instanceof p175j0.C24665d
            if (r10 == 0) goto L_0x0156
            r1.mo51615v()
            boolean r6 = r1.mo51621y()
            if (r6 == 0) goto L_0x010d
            r1.mo51612t(r8)
            goto L_0x0110
        L_0x010d:
            r1.mo51579c()
        L_0x0110:
            r1.mo51561L()
            fy3.p<q1.a, o1.y, rx3.b0> r6 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r1, r3, r6)
            fy3.p<q1.a, i2.d, rx3.b0> r3 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r1, r4, r3)
            fy3.p<q1.a, i2.o, rx3.b0> r3 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r1, r5, r3)
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r3 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r1, r7, r3)
            r1.mo51590i()
            j0.x1 r3 = new j0.x1
            r3.<init>(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            q0.b r2 = (p415q0.C35747b) r2
            r2.invoke(r3, r1, r4)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo51557H(r2)
            r2 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r1.mo51557H(r2)
            r1.mo51565P()
            r1.mo51565P()
            r1.mo51610s()
            r1.mo51565P()
            r1.mo51565P()
        L_0x0153:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0156:
            p175j0.C108501g.m147000a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C104351m0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
