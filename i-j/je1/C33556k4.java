package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48746ap0;
import te3.C49712hj1;
import te3.C50946qd1;
import te3.C52289zo0;
import zc1.C66785b;

/* renamed from: je1.k4 */
public final class C33556k4 extends C60628i {

    /* renamed from: g */
    public C47350c f90846g;

    /* renamed from: h */
    public C11385n f90847h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33556k4(LinkedList<C50946qd1> linkedList) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(linkedList, "reqItems");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6218;
        C52289zo0 zo02 = new C52289zo0();
        zo02.f146150d = C46523h2.f125330a.mo71859a(6218);
        zo02.f146151e = linkedList;
        zo02.f146153g = C66785b.f191882e.mo90662O5();
        bVar.f127066a = zo02;
        bVar.f127067b = new C48746ap0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmsgsession";
        this.f90846g = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderSessionStatus", "NetSceneFinderSessionStatus");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90847h = nVar;
        return dispatch(gVar, this.f90846g, this);
    }

    public int getType() {
        return 6218;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (!(i2 == 0 && i3 == 0)) {
            C115669n nVar = C115669n.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(',');
            sb.append(i3);
            nVar.mo160131h(20492, 7L, sb.toString());
            nVar.mo175913w(1473, 7, 1);
        }
        C11385n nVar2 = this.f90847h;
        if (nVar2 != null) {
            C87412m.m108591d(nVar2);
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
