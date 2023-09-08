package hl1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: hl1.b3 */
public final class C59954b3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171083d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59954b3(C59988k kVar) {
        super(0);
        this.f171083d = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        r5 = (r5 = r5.f176822Y0).f152628b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r9 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<cl1.z0> r1 = cl1.C0702z0.class
            hl1.k r2 = r9.f171083d
            qj1.mf r3 = r2.f171234p0
            if (r3 == 0) goto L_0x001a
            androidx.lifecycle.i0 r2 = r2.mo83051g(r1)
            cl1.z0 r2 = (cl1.C0702z0) r2
            java.util.List<te3.r41> r2 = r2.f1674h
            java.lang.String r4 = "business(LiveMsgSlice::class.java).topMsgList"
            gy3.C87412m.m108593f(r2, r4)
            r3.mo12155e1(r2)
        L_0x001a:
            hl1.k r2 = r9.f171083d
            qj1.e5 r3 = r2.f171250x
            if (r3 == 0) goto L_0x0034
            androidx.lifecycle.i0 r2 = r2.mo83051g(r1)
            cl1.z0 r2 = (cl1.C0702z0) r2
            java.util.List<cj1.o5> r4 = r2.f1672f
            java.lang.String r2 = "business(LiveMsgSlice::class.java).msgList"
            gy3.C87412m.m108593f(r4, r2)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            qj1.C12322e5.m11877s1(r3, r4, r5, r6, r7, r8)
        L_0x0034:
            hl1.k r2 = r9.f171083d
            qj1.dg r2 = r2.f171228m1
            r3 = 0
            if (r2 == 0) goto L_0x003e
            r2.mo87747Z0(r3)
        L_0x003e:
            hl1.k r2 = r9.f171083d
            sl1.c r2 = r2.f171194V0
            if (r2 == 0) goto L_0x0047
            r2.mo88792f1()
        L_0x0047:
            hl1.k r2 = r9.f171083d
            xs1.d r2 = r2.f171200X0
            if (r2 == 0) goto L_0x0050
            r2.mo90516c1()
        L_0x0050:
            hl1.k r2 = r9.f171083d
            vk1.c r4 = r2.f166848f
            if (r4 == 0) goto L_0x005b
            androidx.appcompat.app.AppCompatActivity r2 = r2.f166847e
            r4.showAlertInfo(r2)
        L_0x005b:
            hl1.k r2 = r9.f171083d
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r5 = r2.mo83051g(r0)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154300c2
            r6 = 0
            if (r5 != 0) goto L_0x006b
            goto L_0x00ca
        L_0x006b:
            p50.e r5 = r2.mo84868C()
            if (r5 == 0) goto L_0x007c
            b50.g r5 = r5.f176822Y0
            if (r5 == 0) goto L_0x007c
            d50.g r5 = r5.f152628b
            if (r5 == 0) goto L_0x007c
            int r5 = r5.f166240j
            goto L_0x007d
        L_0x007c:
            r5 = -1
        L_0x007d:
            if (r5 < 0) goto L_0x0080
            goto L_0x00ca
        L_0x0080:
            androidx.lifecycle.i0 r5 = r2.mo83051g(r0)
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.mo75996d3()
            r7 = 1
            if (r5 != r7) goto L_0x00ca
            androidx.lifecycle.i0 r5 = r2.mo83051g(r4)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            te3.j31 r5 = r5.f182400o
            if (r5 == 0) goto L_0x00ca
            androidx.lifecycle.i0 r4 = r2.mo83051g(r4)
            cl1.u r4 = (cl1.C55001u) r4
            d50.h r4 = r4.f154421r
            if (r4 == 0) goto L_0x00ae
            d50.g r4 = r4.f166251b
            if (r4 == 0) goto L_0x00ae
            int r7 = r5.f135842f
            java.lang.String r4 = r4.mo82870c(r7)
            goto L_0x00af
        L_0x00ae:
            r4 = r6
        L_0x00af:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 == 0) goto L_0x00b7
            java.lang.String r4 = r5.f135843g
        L_0x00b7:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x00ca
            p50.e r2 = r2.mo84868C()
            if (r2 == 0) goto L_0x00ca
            b50.g r2 = r2.f176822Y0
            if (r2 == 0) goto L_0x00ca
            r2.mo75231e(r4)
        L_0x00ca:
            hl1.k r2 = r9.f171083d
            qj1.v9 r4 = r2.f171155E
            if (r4 == 0) goto L_0x00e5
            androidx.lifecycle.i0 r1 = r2.mo83051g(r1)
            cl1.z0 r1 = (cl1.C0702z0) r1
            java.util.List<te3.xs0> r1 = r1.f1675i
            java.lang.String r2 = "business(LiveMsgSlice::c….java).highLightCheerList"
            gy3.C87412m.m108593f(r1, r2)
            qj1.aa r2 = new qj1.aa
            r2.<init>(r4, r1)
            o40.C61926c.m72668M(r2)
        L_0x00e5:
            hl1.k r1 = r9.f171083d
            qj1.ea r1 = r1.f171237q1
            if (r1 == 0) goto L_0x00ee
            r1.mo87760d1()
        L_0x00ee:
            hl1.k r1 = r9.f171083d
            androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154190D
            if (r0 == 0) goto L_0x0107
            hl1.k r0 = r9.f171083d
            qj1.pe r0 = r0.f171173N
            if (r0 == 0) goto L_0x0107
            np1.a r0 = r0.f178556r
            if (r0 == 0) goto L_0x0107
            r0.mo86751h()
        L_0x0107:
            hl1.k r0 = r9.f171083d
            vk1.c r0 = r0.f166848f
            if (r0 == 0) goto L_0x0113
            d60.b$b r1 = d60.C58124b.C58125b.FINDER_LIVE_UPDATE_LIVE_MSG
            r2 = 2
            d60.C58124b.C7172a.m7372a(r0, r1, r6, r2, r6)
        L_0x0113:
            hl1.k r0 = r9.f171083d
            qj1.v9 r0 = r0.f171155E
            if (r0 == 0) goto L_0x011c
            r0.mo87992g1()
        L_0x011c:
            hl1.k r0 = r9.f171083d
            qj1.a0 r0 = r0.f171206Z0
            if (r0 == 0) goto L_0x012b
            wg1.a r0 = r0.f35311p
            if (r0 == 0) goto L_0x012b
            wg1.h r0 = (wg1.C15300h) r0
            r0.mo14163q()
        L_0x012b:
            hl1.k r0 = r9.f171083d
            qj1.ff r0 = r0.f171244u
            if (r0 == 0) goto L_0x0135
            r1 = 3
            qj1.C12399ff.m11974v1(r0, r6, r3, r1, r6)
        L_0x0135:
            hl1.k r0 = r9.f171083d
            qj1.ff r0 = r0.f171244u
            if (r0 == 0) goto L_0x013e
            r0.mo12079c1()
        L_0x013e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59954b3.invoke():java.lang.Object");
    }
}
