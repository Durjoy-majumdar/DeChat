package f21;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49763hw3;
import te3.C49909iw3;

/* renamed from: f21.c */
public class C45741c extends C75113f0 {

    /* renamed from: r */
    public C49909iw3 f123596r;

    public C45741c(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49763hw3();
        bVar.f127067b = new C49909iw3();
        bVar.f127069d = 2811;
        bVar.f127068c = "/cgi-bin/mmpay-bin/scanrewardmaterialcode";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C49763hw3 hw32 = (C49763hw3) a.f127055a.f127080a;
        hw32.f134914d = str;
        hw32.f134915e = i;
        Log.m105925i("MicroMsg.NetSceneQrRewardMaterial", "req url: %s, %s", str, Integer.valueOf(i));
    }

    public int getType() {
        return 2811;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C49909iw3 iw32 = (C49909iw3) ((C47350c) uVar).f127056b.f127083a;
        this.f123596r = iw32;
        Log.m105925i("MicroMsg.NetSceneQrRewardMaterial", "retcode: %s, retmsg: %s", Integer.valueOf(iw32.f135725d), this.f123596r.f135726e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49909iw3 iw32 = (C49909iw3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = iw32.f135725d;
        this.f221038h = iw32.f135726e;
    }
}
