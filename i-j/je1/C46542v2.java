package je1;

import bl3.C39818r;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import os1.C62153d;
import rx3.C13604l;
import te3.C49712hj1;
import te3.C51392tg0;
import te3.C51541ug0;

/* renamed from: je1.v2 */
public final class C46542v2 extends C60628i {

    /* renamed from: g */
    public C47350c f125407g;

    /* renamed from: h */
    public C11385n f125408h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46542v2(String str, LinkedList<String> linkedList) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "friendUsername");
        C87412m.m108594g(linkedList, "bindList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4078;
        C51392tg0 tg02 = new C51392tg0();
        tg02.f142206d = C46523h2.f125330a.mo71859a(4078);
        tg02.f142208f = str;
        tg02.f142207e.addAll(linkedList);
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        tg02.f142209g = ((Number) X0.f38555d).floatValue();
        tg02.f142210h = ((Number) X0.f38556e).floatValue();
        bVar.f127066a = tg02;
        bVar.f127067b = new C51541ug0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderbindpoi";
        this.f125407g = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125408h = nVar;
        return dispatch(gVar, this.f125407g, this);
    }

    public int getType() {
        return 4078;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderBindPoiStream", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f125408h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
