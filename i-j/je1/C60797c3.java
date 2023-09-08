package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49110d81;

/* renamed from: je1.c3 */
public final class C60797c3 extends C60628i {

    /* renamed from: g */
    public C47350c f173166g;

    /* renamed from: h */
    public C11385n f173167h;

    /* renamed from: i */
    public C49110d81 f173168i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60797c3(java.lang.String r1, java.lang.String r2, int r3, te3.C49712hj1 r4, int r5, gy3.C8480h r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0005
            r3 = 0
        L_0x0005:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x000a
            r4 = 0
        L_0x000a:
            java.lang.String r5 = "query"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "offset"
            gy3.C87412m.m108594g(r2, r5)
            r0.<init>(r4)
            te3.d81 r4 = new te3.d81
            r4.<init>()
            r0.f173168i = r4
            ob0.c$b r4 = new ob0.c$b
            r4.<init>()
            r5 = 4140(0x102c, float:5.801E-42)
            r4.f127069d = r5
            java.lang.String r5 = "/cgi-bin/micromsg-bin/finderlivesearchmoregames"
            r4.f127068c = r5
            te3.c81 r5 = new te3.c81
            r5.<init>()
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            r5.f182426d = r6
            r5.f182427e = r1
            r5.f182428f = r2
            r5.f182429g = r3
            er1.w0 r6 = er1.C58782w0.f168290a
            te3.ma0 r6 = r6.mo83846e()
            r5.f182430h = r6
            r4.f127066a = r5
            te3.d81 r5 = new te3.d81
            r5.<init>()
            r4.f127067b = r5
            ob0.c r4 = r4.mo72403a()
            r0.f173166g = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NetSceneFinderGameSearch init: query = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ", offset = "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = ", scene = "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "Finder.NetSceneFinderGameSearch"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60797c3.<init>(java.lang.String, java.lang.String, int, te3.hj1, int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173167h = nVar;
        return dispatch(gVar, this.f173166g, this);
    }

    public int getType() {
        return 4140;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("Finder.NetSceneFinderGameSearch", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C47465a aVar = this.f173166g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveSearchMoreGamesResponse");
        this.f173168i = (C49110d81) aVar;
        C11385n nVar = this.f173167h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
