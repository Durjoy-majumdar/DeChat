package kk2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51910x12;
import te3.C52052y12;

/* renamed from: kk2.b */
public final class C46731b extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f125807d = "MicroMsg.Rtos.NetSceneGetIlinkDeviceOauthTicket";

    /* renamed from: e */
    public C11385n f125808e;

    /* renamed from: f */
    public C47350c f125809f;

    public C46731b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51910x12();
        bVar.f127067b = new C52052y12();
        bVar.f127068c = "/cgi-bin/micromsg-bin/get_ilink_device_oauth_ticket";
        bVar.f127069d = 9076;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f125809f = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125808e = nVar;
        return dispatch(gVar, this.f125809f, this);
    }

    public int getType() {
        return 9076;
    }

    /* renamed from: j1 */
    public final C52052y12 mo71965j1() {
        C47350c cVar = this.f125809f;
        if (cVar != null) {
            C87412m.m108591d(cVar);
            if (cVar.f127056b.f127083a != null) {
                C47350c cVar2 = this.f125809f;
                C87412m.m108591d(cVar2);
                C47465a aVar = cVar2.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetILinkDeviceOAuthTicketResp");
                return (C52052y12) aVar;
            }
        }
        return null;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125807d;
        Log.m105924i(str2, "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + ' ' + str);
        C11385n nVar = this.f125808e;
        C87412m.m108591d(nVar);
        nVar.onSceneEnd(i2, i3, str, this);
    }
}
