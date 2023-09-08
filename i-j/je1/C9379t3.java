package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48749aq0;
import te3.C48893bq0;

/* renamed from: je1.t3 */
public final class C9379t3 extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f29292d = "Finder.NetSceneFinderGetUser";

    /* renamed from: e */
    public C47350c f29293e;

    /* renamed from: f */
    public C11385n f29294f;

    /* renamed from: g */
    public List<String> f29295g;

    public C9379t3(List<String> list) {
        C87412m.m108594g(list, "urlList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C48749aq0 aq02 = new C48749aq0();
        aq02.f130720d.addAll(list);
        C48893bq0 bq02 = new C48893bq0();
        bVar.f127066a = aq02;
        bVar.f127067b = bq02;
        bVar.f127069d = 3512;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetuser";
        this.f29293e = bVar.mo72403a();
        this.f29295g = list;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29294f = nVar;
        return dispatch(gVar, this.f29293e, this);
    }

    public int getType() {
        return 3512;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f29292d;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f29294f;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
