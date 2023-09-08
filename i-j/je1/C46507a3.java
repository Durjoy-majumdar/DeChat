package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51554uj1;

/* renamed from: je1.a3 */
public final class C46507a3 extends C60628i {

    /* renamed from: g */
    public final String f125290g;

    /* renamed from: h */
    public C47350c f125291h;

    /* renamed from: i */
    public C11385n f125292i;

    /* renamed from: j */
    public C51554uj1 f125293j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46507a3(java.lang.String r3, pe3.C89349b r4, te3.C49712hj1 r5, int r6, gy3.C8480h r7) {
        /*
            r2 = this;
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            java.lang.String r6 = "query"
            gy3.C87412m.m108594g(r3, r6)
            r2.<init>(r5)
            java.lang.String r6 = "Finder.NetSceneFinderFansSearch"
            r2.f125290g = r6
            ob0.c$b r7 = new ob0.c$b
            r7.<init>()
            r0 = 6665(0x1a09, float:9.34E-42)
            r7.f127069d = r0
            java.lang.String r1 = "/cgi-bin/micromsg-bin/findersearchfans"
            r7.f127068c = r1
            te3.tj1 r1 = new te3.tj1
            r1.<init>()
            r1.f142246f = r3
            r1.f142245e = r4
            je1.h2 r4 = je1.C46523h2.f125330a
            te3.ig0 r4 = r4.mo71860b(r0, r5)
            r1.f142244d = r4
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            r1.f142247g = r4
            r7.f127066a = r1
            te3.uj1 r4 = new te3.uj1
            r4.<init>()
            r7.f127067b = r4
            ob0.c r4 = r7.mo72403a()
            r2.f125291h = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NetSceneFinderFansSearch init query "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            te3.uj1 r3 = new te3.uj1
            r3.<init>()
            r2.f125293j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46507a3.<init>(java.lang.String, pe3.b, te3.hj1, int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125292i = nVar;
        return dispatch(gVar, this.f125291h, this);
    }

    public int getType() {
        return 6665;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f125290g, "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C47465a aVar = this.f125291h.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchFansResponse");
        this.f125293j = (C51554uj1) aVar;
        C11385n nVar = this.f125292i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
