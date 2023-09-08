package gl1;

import fy3.C32226l;
import gy3.C87413o;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50008jm0;

/* renamed from: gl1.j */
public final class C59556j extends C87413o implements C32226l<C89132b.C89134c<C50008jm0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170195d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59556j(C59559k kVar) {
        super(1);
        this.f170195d = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r8.f182392d == 0) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            ob0.b$c r8 = (ob0.C89132b.C89134c) r8
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "result"
            gy3.C87412m.m108594g(r8, r1)
            int r1 = r8.f256793a
            if (r1 != 0) goto L_0x0011
            int r2 = r8.f256794b
            if (r2 == 0) goto L_0x001b
        L_0x0011:
            er1.j4 r2 = er1.C58739j4.f168176a
            int r3 = r8.f256794b
            boolean r1 = r2.mo83681J(r1, r3)
            if (r1 == 0) goto L_0x00c7
        L_0x001b:
            T r8 = r8.f256796d
            te3.jm0 r8 = (te3.C50008jm0) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f136184e
            if (r8 == 0) goto L_0x00c7
            gl1.k r1 = r7.f170195d
            androidx.lifecycle.i0 r2 = r1.mo83051g(r0)
            cl1.o r2 = (cl1.C54991o) r2
            r2.mo76026x4(r8)
            androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
            r2 = 0
            if (r8 == 0) goto L_0x003c
            te3.c21 r8 = r8.liveInfo
            goto L_0x003d
        L_0x003c:
            r8 = r2
        L_0x003d:
            if (r8 == 0) goto L_0x0058
            androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
            if (r8 == 0) goto L_0x004c
            te3.c21 r8 = r8.liveInfo
            goto L_0x004d
        L_0x004c:
            r8 = r2
        L_0x004d:
            gy3.C87412m.m108591d(r8)
            long r3 = r8.f182392d
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x006f
        L_0x0058:
            androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
            if (r8 != 0) goto L_0x0063
            goto L_0x006f
        L_0x0063:
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r1.mo83051g(r3)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            r8.liveInfo = r3
        L_0x006f:
            qj1.ff r8 = r1.f170248q
            r3 = 0
            if (r8 == 0) goto L_0x0078
            r4 = 3
            qj1.C12399ff.m11974v1(r8, r2, r3, r4, r2)
        L_0x0078:
            qj1.ff r8 = r1.f170248q
            if (r8 == 0) goto L_0x007f
            r8.mo12093s1()
        L_0x007f:
            androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
            cl1.o r8 = (cl1.C54991o) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f154341n
            r4 = 1
            if (r8 == 0) goto L_0x0094
            te3.c21 r8 = r8.liveInfo
            if (r8 == 0) goto L_0x0094
            int r8 = r8.f182410x
            if (r8 != r4) goto L_0x0094
            r8 = 1
            goto L_0x0095
        L_0x0094:
            r8 = 0
        L_0x0095:
            if (r8 == 0) goto L_0x00a8
            vk1.b r8 = r1.f166842f
            if (r8 == 0) goto L_0x00c7
            androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154345o
            r1 = 2
            com.tencent.p014mm.plugin.finder.live.view.C56032b.fillBlurBg$default(r8, r0, r3, r1, r2)
            goto L_0x00c7
        L_0x00a8:
            androidx.lifecycle.i0 r8 = r1.mo83051g(r0)
            cl1.o r8 = (cl1.C54991o) r8
            int r8 = r8.f154291a1
            r2 = 524288(0x80000, float:7.34684E-40)
            boolean r8 = o40.C61926c.m72696u(r8, r2)
            if (r8 == 0) goto L_0x00c7
            vk1.b r8 = r1.f166842f
            if (r8 == 0) goto L_0x00c7
            androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154345o
            r8.fillBlurBg(r0, r4)
        L_0x00c7:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gl1.C59556j.invoke(java.lang.Object):java.lang.Object");
    }
}
