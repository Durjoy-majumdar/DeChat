package jg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.wxmm.v2helper;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49781i04;
import te3.C49926j04;

/* renamed from: jg0.h */
public class C9396h extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f29335d;

    /* renamed from: e */
    public C11385n f29336e = null;

    public C9396h(C49781i04 i042) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = i042;
        bVar.f127067b = new C49926j04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendphoto2fbwall";
        bVar.f127069d = v2helper.EMethodSetSendToNetworkOff;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f29335d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29336e = nVar;
        return dispatch(gVar, this.f29335d, this);
    }

    public int getType() {
        return v2helper.EMethodSetSendToNetworkOff;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f29336e.onSceneEnd(i2, i3, str, this);
    }
}
