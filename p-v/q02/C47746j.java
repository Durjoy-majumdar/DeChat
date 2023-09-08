package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48644a03;
import te3.C48789b03;
import te3.C49546gd3;

/* renamed from: q02.j */
public class C47746j extends C75113f0 {

    /* renamed from: r */
    public C48789b03 f128263r;

    public C47746j(C49546gd3 gd32, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48644a03();
        bVar.f127067b = new C48789b03();
        bVar.f127069d = 2941;
        bVar.f127068c = "/cgi-bin/mmpay-bin/modifyhppayerpayway";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C48644a03 a032 = (C48644a03) a.f127055a.f127080a;
        a032.f130185d = gd32;
        a032.f130186e = str;
        a032.f130187f = str2;
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "cardNo: %s, suffix: %s, bankType: %s sessionId: %s", str, gd32.f133979h, gd32.f133977f, str2);
    }

    public int getType() {
        return 2941;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C48789b03 b032 = (C48789b03) ((C47350c) uVar).f127056b.f127083a;
        this.f128263r = b032;
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "retcode: %s, retmsg: %s", Integer.valueOf(b032.f130872d), this.f128263r.f130873e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C48789b03 b032 = (C48789b03) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = b032.f130872d;
        this.f221038h = b032.f130873e;
    }
}
