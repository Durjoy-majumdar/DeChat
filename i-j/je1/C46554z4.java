package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.ArrayList;
import java.util.List;
import o40.C61926c;
import ob0.C11385n;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C36907w;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C49715hk0;
import te3.C49842ig0;
import te3.C49859ik0;
import te3.C49966ja;
import zc1.C66785b;

/* renamed from: je1.z4 */
public final class C46554z4 extends C60628i {

    /* renamed from: g */
    public final int f125441g;

    /* renamed from: h */
    public final List<C48978cb0> f125442h;

    /* renamed from: i */
    public final String f125443i = "Finder.NetSceneReportScreenShot";

    /* renamed from: j */
    public C47350c f125444j;

    /* renamed from: n */
    public C11385n f125445n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46554z4(int i, List<? extends C48978cb0> list) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(list, "extStats");
        this.f125441g = i;
        this.f125442h = list;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6681;
        C49715hk0 hk02 = new C49715hk0();
        C46523h2 h2Var = C46523h2.f125330a;
        hk02.f134697g = h2Var.mo71859a(6681);
        hk02.f134694d = C66785b.f191882e.mo90662O5();
        hk02.f134695e = i;
        hk02.f134696f.addAll(list);
        C49842ig0 ig02 = hk02.f134697g;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C48978cb0 cb02 : list) {
            C49712hj1 hj12 = this.f172736d;
            arrayList.add(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134675i : 0), Long.valueOf(cb02.f131607d)));
        }
        h2Var.mo71865g(ig02, arrayList, (C49712hj1) null);
        bVar.f127066a = hk02;
        C49859ik0 ik02 = new C49859ik0();
        ik02.setBaseResponse(new C49966ja());
        bVar.f127067b = ik02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        this.f125444j = bVar.mo72403a();
        StringBuilder sb = new StringBuilder("");
        for (C48978cb0 cb03 : this.f125442h) {
            sb.append(C61926c.m72691p(cb03.f131607d));
            sb.append(",");
        }
        String str = this.f125443i;
        Log.m105924i(str, "NetSceneReportScreenShot start " + this.f125441g + ", " + sb);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125445n = nVar;
        return dispatch(gVar, this.f125444j, this);
    }

    public int getType() {
        return 6681;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125443i;
        Log.m105924i(str2, "onGYNetEnd " + i + ' ' + i2 + ' ' + i3 + ' ' + str + ' ');
        C11385n nVar = this.f125445n;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
