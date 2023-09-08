package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C52165yt;
import te3.C52302zt;

/* renamed from: q02.b */
public class C47738b extends C75113f0 {

    /* renamed from: r */
    public C52302zt f128252r;

    /* renamed from: s */
    public String f128253s;

    public C47738b(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52165yt();
        bVar.f127067b = new C52302zt();
        bVar.f127069d = 2926;
        bVar.f127068c = "/cgi-bin/mmpay-bin/checkhoneyuser";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C52165yt ytVar = (C52165yt) a.f127055a.f127080a;
        ytVar.f145502d = str;
        ytVar.f145503e = i;
        this.f128253s = str;
    }

    public int getType() {
        return 2926;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckHoneyUser", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C52302zt ztVar = (C52302zt) ((C47350c) uVar).f127056b.f127083a;
        this.f128252r = ztVar;
        Log.m105925i("MicroMsg.NetSceneCheckHoneyUser", "retcode: %s, retmsg: %s", Integer.valueOf(ztVar.f146201d), this.f128252r.f146202e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C52302zt ztVar = (C52302zt) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = ztVar.f146201d;
        this.f221038h = ztVar.f146202e;
    }
}
