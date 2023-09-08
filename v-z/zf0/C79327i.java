package zf0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50760p;
import te3.C77983q;

/* renamed from: zf0.i */
public class C79327i extends C75123k0 {

    /* renamed from: d */
    public C47350c f232888d;

    /* renamed from: e */
    public C77983q f232889e;

    /* renamed from: f */
    public C11385n f232890f;

    public C79327i() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50760p();
        bVar.f127067b = new C77983q();
        bVar.f127069d = 1698;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaaoperation";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f232888d = a;
        C50760p pVar = (C50760p) a.f127055a.f127080a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f232890f = nVar;
        return dispatch(gVar, this.f232888d, this);
    }

    public int getType() {
        return 1698;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneAAOperation", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C77983q qVar = (C77983q) ((C47350c) uVar).f127056b.f127083a;
        this.f232889e = qVar;
        if (i2 == 0 && i3 == 0) {
            C77983q qVar2 = this.f232889e;
            C77983q qVar3 = this.f232889e;
            Log.m105925i("MicroMsg.NetSceneAAOperation", "retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", Integer.valueOf(qVar.f228097d), qVar2.f228098e, Integer.valueOf(qVar2.f228099f), Integer.valueOf(this.f232889e.f228100g), Integer.valueOf(this.f232889e.f228101h), Long.valueOf(this.f232889e.f228102i), Long.valueOf(this.f232889e.f228103j), qVar3.f228104n, qVar3.f228105o);
        }
        C11385n nVar = this.f232890f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
