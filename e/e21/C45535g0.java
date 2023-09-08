package e21;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49481fw3;
import te3.C49622gw3;

/* renamed from: e21.g0 */
public class C45535g0 extends C75113f0 {

    /* renamed from: r */
    public C49622gw3 f123204r;

    public C45535g0(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49481fw3();
        bVar.f127067b = new C49622gw3();
        bVar.f127069d = 1800;
        bVar.f127068c = "/cgi-bin/mmpay-bin/scanf2fmaterialcode";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C49481fw3 fw32 = (C49481fw3) a.f127055a.f127080a;
        fw32.f133717d = str;
        fw32.f133718e = i;
        Log.m105925i("MicroMsg.NetSceneF2fMaterial", "req url: %s, %s", str, Integer.valueOf(i));
    }

    public int getType() {
        return 1800;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C49622gw3 gw32 = (C49622gw3) ((C47350c) uVar).f127056b.f127083a;
        this.f123204r = gw32;
        Log.m105925i("MicroMsg.NetSceneF2fMaterial", "retcode: %s, retmsg: %s", Integer.valueOf(gw32.f134329d), this.f123204r.f134330e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49622gw3 gw32 = (C49622gw3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = gw32.f134329d;
        this.f221038h = gw32.f134330e;
    }
}
