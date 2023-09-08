package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50825pg1;
import te3.C50956qg1;

/* renamed from: je1.b4 */
public final class C33554b4 extends C60628i {

    /* renamed from: g */
    public final String f90842g = "Finder.NetSceneFinderPassReport";

    /* renamed from: h */
    public C47350c f90843h;

    /* renamed from: i */
    public C11385n f90844i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33554b4(int i, String str) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "reportData");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4093;
        C50825pg1 pg12 = new C50825pg1();
        pg12.f139750d = i;
        pg12.f139751e = str;
        bVar.f127066a = pg12;
        C50956qg1 qg12 = new C50956qg1();
        qg12.setBaseResponse(new C49966ja());
        bVar.f127067b = qg12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderpassreport";
        this.f90843h = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderPassReport", "NetSceneFinderPassReport " + i + ", " + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90844i = nVar;
        Log.m105924i(this.f90842g, "NetSceneFinderPassReport doScene");
        return dispatch(gVar, this.f90843h, this);
    }

    public int getType() {
        return 4093;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f90842g;
        Log.m105924i(str2, "NetSceneFinderPassReport onGYNetEnd " + i2 + ' ' + i3 + ' ' + str + ' ');
        C11385n nVar = this.f90844i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
