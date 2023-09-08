package zf0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51036r;
import te3.C51181s;

/* renamed from: zf0.j */
public class C53775j extends C75123k0 implements C45119n {

    /* renamed from: d */
    public C47350c f150927d;

    /* renamed from: e */
    public C51036r f150928e;

    /* renamed from: f */
    public C51181s f150929f;

    /* renamed from: g */
    public C11385n f150930g;

    public C53775j(String str, long j, int i, String str2, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51036r();
        bVar.f127067b = new C51181s();
        bVar.f127069d = 1629;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaapay";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150927d = a;
        C51036r rVar = (C51036r) a.f127055a.f127080a;
        this.f150928e = rVar;
        rVar.f140632d = str;
        rVar.f140633e = j;
        rVar.f140634f = i;
        rVar.f140635g = str2;
        rVar.f140636h = str3;
        rVar.f140637i = str4;
        Log.m105925i("MicroMsg.NetSceneAAPay", "NetSceneAAPay, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s", str, Long.valueOf(j), Integer.valueOf(this.f150928e.f140634f), this.f150928e.f140635g);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150930g = nVar;
        return dispatch(gVar, this.f150927d, this);
    }

    public int getType() {
        return 1629;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneAAPay", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C51181s sVar = (C51181s) ((C47350c) uVar).f127056b.f127083a;
        this.f150929f = sVar;
        C51181s sVar2 = this.f150929f;
        Log.m105925i("MicroMsg.NetSceneAAPay", "retcode: %s, retmsg: %s, paymsgid:%s", Integer.valueOf(sVar.f141236d), sVar2.f141237e, sVar2.f141239g);
        C11385n nVar = this.f150930g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
