package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51163rv3;
import te3.C51766w04;
import te3.C51906x04;

/* renamed from: hg0.v0 */
public class C46066v0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f124206d;

    /* renamed from: e */
    public final C47350c f124207e;

    public C46066v0(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51766w04();
        bVar.f127067b = new C51906x04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendverifyemail";
        bVar.f127069d = 108;
        bVar.f127070e = 43;
        bVar.f127071f = 1000000043;
        C47350c a = bVar.mo72403a();
        this.f124207e = a;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        ((C51766w04) a.f127055a.f127080a).f143801d = rv32;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124206d = nVar;
        return dispatch(gVar, this.f124207e, this);
    }

    public int getType() {
        return 108;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f124206d.onSceneEnd(i2, i3, str, this);
    }
}
