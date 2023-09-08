package hl1;

import fy3.C32226l;
import gy3.C87412m;
import java.lang.ref.SoftReference;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50008jm0;

/* renamed from: hl1.d4 */
public final class C59966d4 implements C32226l<C89132b.C89134c<C50008jm0>, C13598b0> {

    /* renamed from: d */
    public SoftReference<C59988k> f171105d;

    /* renamed from: e */
    public final String f171106e;

    public C59966d4(SoftReference<C59988k> softReference, String str) {
        C87412m.m108594g(str, "tag");
        this.f171105d = softReference;
        this.f171106e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        if (((r10 == null || (r10 = r10.liveInfo) == null || r10.f182392d != 0) ? false : true) != false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "result"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.ref.SoftReference<hl1.k> r1 = r9.f171105d
            if (r1 == 0) goto L_0x0126
            java.lang.Object r1 = r1.get()
            hl1.k r1 = (hl1.C59988k) r1
            if (r1 == 0) goto L_0x0126
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkFinderObject  result "
            r3.append(r4)
            int r4 = r10.f256793a
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            int r4 = r10.f256794b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            int r3 = r10.f256793a
            if (r3 != 0) goto L_0x003f
            int r4 = r10.f256794b
            if (r4 == 0) goto L_0x0049
        L_0x003f:
            er1.j4 r4 = er1.C58739j4.f168176a
            int r5 = r10.f256794b
            boolean r3 = r4.mo83681J(r3, r5)
            if (r3 == 0) goto L_0x0126
        L_0x0049:
            T r10 = r10.f256796d
            te3.jm0 r10 = (te3.C50008jm0) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f136184e
            if (r10 == 0) goto L_0x0126
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "newFeed "
            r3.append(r4)
            java.lang.String r4 = r10.nickname
            r3.append(r4)
            java.lang.String r4 = " id:"
            r3.append(r4)
            long r4 = r10.f164794id
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            qt1.b r3 = qt1.C63329b.f179694a
            java.lang.String r4 = r9.f171106e
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "detailCgiLog.toString()"
            gy3.C87412m.m108593f(r2, r5)
            r3.mo88233d(r4, r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r0)
            cl1.o r2 = (cl1.C54991o) r2
            r2.mo76026x4(r10)
            androidx.lifecycle.i0 r10 = r1.mo83051g(r0)
            cl1.o r10 = (cl1.C54991o) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f154341n
            r2 = 0
            if (r10 == 0) goto L_0x0098
            te3.c21 r10 = r10.liveInfo
            goto L_0x0099
        L_0x0098:
            r10 = r2
        L_0x0099:
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x00b8
            androidx.lifecycle.i0 r10 = r1.mo83051g(r0)
            cl1.o r10 = (cl1.C54991o) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f154341n
            if (r10 == 0) goto L_0x00b5
            te3.c21 r10 = r10.liveInfo
            if (r10 == 0) goto L_0x00b5
            long r5 = r10.f182392d
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00b5
            r10 = 1
            goto L_0x00b6
        L_0x00b5:
            r10 = 0
        L_0x00b6:
            if (r10 == 0) goto L_0x00cf
        L_0x00b8:
            androidx.lifecycle.i0 r10 = r1.mo83051g(r0)
            cl1.o r10 = (cl1.C54991o) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f154341n
            if (r10 != 0) goto L_0x00c3
            goto L_0x00cf
        L_0x00c3:
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            androidx.lifecycle.i0 r5 = r1.mo83051g(r5)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            r10.liveInfo = r5
        L_0x00cf:
            androidx.lifecycle.i0 r10 = r1.mo83051g(r0)
            cl1.o r10 = (cl1.C54991o) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f154341n
            if (r10 == 0) goto L_0x00e3
            te3.c21 r10 = r10.liveInfo
            if (r10 == 0) goto L_0x00e3
            int r10 = r10.f182410x
            if (r10 != r4) goto L_0x00e3
            r10 = 1
            goto L_0x00e4
        L_0x00e3:
            r10 = 0
        L_0x00e4:
            if (r10 == 0) goto L_0x00f6
            vk1.c r10 = r1.f166848f
            if (r10 == 0) goto L_0x00f6
            androidx.lifecycle.i0 r5 = r1.mo83051g(r0)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.f154345o
            r6 = 2
            com.tencent.p014mm.plugin.finder.live.view.C56032b.fillBlurBg$default(r10, r5, r3, r6, r2)
        L_0x00f6:
            androidx.lifecycle.i0 r10 = r1.mo83051g(r0)
            cl1.o r10 = (cl1.C54991o) r10
            int r10 = r10.f154291a1
            r0 = 524288(0x80000, float:7.34684E-40)
            boolean r10 = o40.C61926c.m72696u(r10, r0)
            if (r10 == 0) goto L_0x0110
            vk1.c r10 = r1.f166848f
            if (r10 == 0) goto L_0x010d
            r10.forceScreenToPortrait()
        L_0x010d:
            r1.mo84881P()
        L_0x0110:
            qj1.ff r10 = r1.f171244u
            if (r10 == 0) goto L_0x0118
            r0 = 3
            qj1.C12399ff.m11974v1(r10, r2, r3, r0, r2)
        L_0x0118:
            qj1.ff r10 = r1.f171244u
            if (r10 == 0) goto L_0x011f
            r10.mo12093s1()
        L_0x011f:
            qj1.ff r10 = r1.f171244u
            if (r10 == 0) goto L_0x0126
            qj1.C12399ff.m11972g1(r10, r3, r4, r2)
        L_0x0126:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59966d4.invoke(java.lang.Object):java.lang.Object");
    }
}
