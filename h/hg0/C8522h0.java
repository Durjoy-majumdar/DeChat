package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51952xc;
import te3.C52096yc;

/* renamed from: hg0.h0 */
public class C8522h0 extends C117747y implements C1311n {

    /* renamed from: d */
    public int f27566d = -1;

    /* renamed from: e */
    public String f27567e;

    /* renamed from: f */
    public int f27568f = 0;

    /* renamed from: g */
    public final C47350c f27569g;

    /* renamed from: h */
    public C11385n f27570h;

    /* renamed from: hg0.h0$a */
    public enum C8523a {
        MM_BIND_GCONTACT_OPCODE_BIND,
        MM_BIND_GCONTACT_OPCODE_UNBIND
    }

    public C8522h0(C8523a aVar, String str, int i) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            this.f27566d = 1;
        } else if (ordinal == 1) {
            this.f27566d = 2;
        }
        this.f27567e = str;
        this.f27568f = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51952xc();
        bVar.f127067b = new C52096yc();
        bVar.f127068c = "/cgi-bin/micromsg-bin/bindgooglecontact";
        bVar.f127069d = 487;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f27569g = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
        this.f27570h = nVar;
        C47350c cVar = this.f27569g;
        C51952xc xcVar = (C51952xc) cVar.f127055a.f127080a;
        xcVar.f144581d = this.f27566d;
        xcVar.f144582e = this.f27567e;
        xcVar.f144583f = this.f27568f;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 487;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f27570h.onSceneEnd(i2, i3, str, this);
    }
}
