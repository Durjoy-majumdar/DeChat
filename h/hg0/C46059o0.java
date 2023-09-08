package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50913q42;
import te3.C51057r42;

/* renamed from: hg0.o0 */
public class C46059o0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f124184d;

    /* renamed from: e */
    public C11385n f124185e;

    /* renamed from: f */
    public int f124186f;

    public C46059o0(String str, int i, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3513;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getoldacctfriend";
        C50913q42 q422 = new C50913q42();
        this.f124186f = i;
        q422.f140129e = i;
        q422.f140128d = str;
        q422.f140130f = str2;
        bVar.f127066a = q422;
        bVar.f127067b = new C51057r42();
        this.f124184d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneGetOldAccountFriend", "get old account friend %s, max seq %d, session %s", str, Integer.valueOf(i), str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124185e = nVar;
        return dispatch(gVar, this.f124184d, this);
    }

    public int getType() {
        return 3513;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetOldAccountFriend", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0 && !((C51057r42) this.f124184d.f127056b.f127083a).f140688d.isEmpty()) {
            C47465a aVar = this.f124184d.f127056b.f127083a;
            this.f124186f = ((C51057r42) aVar).f140688d.get(((C51057r42) aVar).f140688d.size() - 1).f140713f;
        }
        this.f124185e.onSceneEnd(i2, i3, str, this);
    }
}
