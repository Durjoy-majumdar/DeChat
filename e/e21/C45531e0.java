package e21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50293lp;
import te3.C50430mp;

/* renamed from: e21.e0 */
public class C45531e0 extends C75123k0 {

    /* renamed from: d */
    public C47350c f123193d;

    /* renamed from: e */
    public C11385n f123194e;

    /* renamed from: f */
    public C50430mp f123195f;

    /* renamed from: g */
    public String f123196g;

    /* renamed from: h */
    public int f123197h;

    /* renamed from: i */
    public long f123198i;

    /* renamed from: j */
    public long f123199j;

    /* renamed from: n */
    public long f123200n = System.currentTimeMillis();

    public C45531e0(int i, int i2, C89349b bVar, C89349b bVar2, String str, int i3, long j) {
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = new C50293lp();
        bVar3.f127067b = new C50430mp();
        bVar3.f127069d = 1384;
        bVar3.f127068c = "/cgi-bin/mmpay-bin/getf2frcvvoice";
        bVar3.f127070e = 0;
        bVar3.f127071f = 0;
        C47350c a = bVar3.mo72403a();
        this.f123193d = a;
        C50293lp lpVar = (C50293lp) a.f127055a.f127080a;
        lpVar.f137555d = i;
        lpVar.f137559h = i2;
        lpVar.f137558g = str;
        lpVar.f137556e = bVar;
        lpVar.f137557f = bVar2;
        this.f123196g = str;
        this.f123197h = i3;
        this.f123198i = j;
        Log.m105925i("MicroMsg.NetSceneF2FRcvVoice", "amount: %d, outtradeno: %s", Integer.valueOf(i), str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123194e = nVar;
        return dispatch(gVar, this.f123193d, this);
    }

    public int getType() {
        return 1384;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneF2FRcvVoice", "errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50430mp mpVar = (C50430mp) ((C47350c) uVar).f127056b.f127083a;
        this.f123195f = mpVar;
        C50430mp mpVar2 = this.f123195f;
        Log.m105925i("MicroMsg.NetSceneF2FRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", Integer.valueOf(mpVar.f138136d), mpVar2.f138137e, Integer.valueOf(mpVar2.f138139g));
        this.f123199j = System.currentTimeMillis() - this.f123200n;
        C11385n nVar = this.f123194e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
