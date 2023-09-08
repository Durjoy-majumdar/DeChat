package ag2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: ag2.a0 */
public class C39565a0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f106212d;

    /* renamed from: e */
    public C11385n f106213e;

    public C39565a0() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3889;
        bVar.f127066a = new C39591l0();
        bVar.f127067b = new C39592m0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/unbindxmail";
        this.f106212d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106213e = nVar;
        return dispatch(gVar, this.f106212d, this);
    }

    public int getType() {
        return 3889;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f106213e.onSceneEnd(i2, i3, str, this);
    }
}
