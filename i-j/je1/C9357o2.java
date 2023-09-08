package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C52132yl0;
import te3.C52279zl0;

/* renamed from: je1.o2 */
public final class C9357o2 extends C60628i {

    /* renamed from: g */
    public final String f29226g = "NetSceneBlockPosterList";

    /* renamed from: h */
    public C47350c f29227h;

    /* renamed from: i */
    public C11385n f29228i;

    public C9357o2(C89349b bVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 5905;
        C52132yl0 yl02 = new C52132yl0();
        yl02.f145353d = bVar;
        yl02.f145354e = C46523h2.f125330a.mo71859a(5905);
        bVar2.f127066a = yl02;
        bVar2.f127067b = new C52279zl0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetblockposterlist";
        this.f29227h = bVar2.mo72403a();
        Log.m105924i("NetSceneBlockPosterList", "NetSceneBlockPosterList init, scene ");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29228i = nVar;
        return dispatch(gVar, this.f29227h, this);
    }

    public int getType() {
        return 5905;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f29226g, "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f29228i;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
