package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C50968qj0;
import te3.C51115rj0;

/* renamed from: je1.x2 */
public final class C46548x2 extends C60628i {

    /* renamed from: g */
    public final long f125428g;

    /* renamed from: h */
    public C47350c f125429h;

    /* renamed from: i */
    public C11385n f125430i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46548x2(String str, long j, C49712hj1 hj12, long j2, long j3, C89349b bVar, int i) {
        super(hj12);
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(bVar, "lastBuffer");
        this.f125428g = j;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6690;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderdelmention";
        C50968qj0 qj02 = new C50968qj0();
        qj02.f140345e = str;
        qj02.f140346f = j;
        qj02.f140347g = bVar;
        qj02.f140348h = j2;
        qj02.f140349i = j3;
        qj02.f140350j = i;
        qj02.f140344d = C46523h2.f125330a.mo71860b(6690, hj12);
        bVar2.f127066a = qj02;
        bVar2.f127067b = new C51115rj0();
        this.f125429h = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderDelMessage", "NetSceneFinderDelMessage init  userName: " + str + " mentionId:" + j);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125430i = nVar;
        return dispatch(gVar, this.f125429h, this);
    }

    public int getType() {
        return 6690;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105924i("Finder.NetSceneFinderDelMessage", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f125430i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
