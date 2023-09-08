package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51872wt;
import te3.C52016xt;

/* renamed from: q02.a */
public class C47737a extends C75113f0 {

    /* renamed from: r */
    public C52016xt f128251r;

    public C47737a() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51872wt();
        bVar.f127067b = new C52016xt();
        bVar.f127069d = 2618;
        bVar.f127068c = "/cgi-bin/mmpay-bin/checkhoneypayer";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C51872wt wtVar = (C51872wt) a.f127055a.f127080a;
    }

    public int getType() {
        return 2618;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckHoneyPayer", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C52016xt xtVar = (C52016xt) ((C47350c) uVar).f127056b.f127083a;
        this.f128251r = xtVar;
        Log.m105925i("MicroMsg.NetSceneCheckHoneyPayer", "retcode: %s, retmsg: %s", Integer.valueOf(xtVar.f144930d), this.f128251r.f144931e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C52016xt xtVar = (C52016xt) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = xtVar.f144930d;
        this.f221038h = xtVar.f144931e;
    }
}
