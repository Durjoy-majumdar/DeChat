package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import t02.C48527c;
import te3.C51259sk3;
import te3.C51409tk3;
import te3.C52131yl;

/* renamed from: q02.m */
public class C47749m extends C75113f0 {

    /* renamed from: r */
    public C51409tk3 f128266r;

    public C47749m(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51259sk3();
        bVar.f127067b = new C51409tk3();
        bVar.f127069d = 2613;
        bVar.f127068c = "/cgi-bin/mmpay-bin/qryhpusererdetail";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        ((C51259sk3) a.f127055a.f127080a).f141577d = str;
        Log.m105925i("MicroMsg.NetSceneQryHoneyUserDetail", "card no: %s", str);
    }

    public int getType() {
        return 2613;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneQryHoneyUserDetail", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51409tk3 tk32 = (C51409tk3) ((C47350c) uVar).f127056b.f127083a;
        this.f128266r = tk32;
        Log.m105925i("MicroMsg.NetSceneQryHoneyUserDetail", "retcode: %s, retmsg: %s", Integer.valueOf(tk32.f142258d), this.f128266r.f142259e);
        C52131yl ylVar = this.f128266r.f142263i;
        if (ylVar != null) {
            C48527c.m53915k(ylVar.f145352f, ylVar.f145350d, ylVar.f145351e, (String) null);
        }
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C51409tk3 tk32 = (C51409tk3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = tk32.f142258d;
        this.f221038h = tk32.f142259e;
    }
}
