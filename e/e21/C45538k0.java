package e21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49036cq;
import te3.C49179dq;

/* renamed from: e21.k0 */
public class C45538k0 extends C75123k0 {

    /* renamed from: d */
    public C47350c f123205d;

    /* renamed from: e */
    public C49179dq f123206e;

    /* renamed from: f */
    public C11385n f123207f;

    /* renamed from: g */
    public String f123208g;

    public C45538k0(int i, int i2, C89349b bVar, C89349b bVar2, String str) {
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = new C49036cq();
        bVar3.f127067b = new C49179dq();
        bVar3.f127069d = 1317;
        bVar3.f127068c = "/cgi-bin/mmpay-bin/getmdrcvvoice";
        bVar3.f127070e = 0;
        bVar3.f127071f = 0;
        C47350c a = bVar3.mo72403a();
        this.f123205d = a;
        C49036cq cqVar = (C49036cq) a.f127055a.f127080a;
        cqVar.f131895d = i;
        cqVar.f131899h = i2;
        cqVar.f131898g = str;
        cqVar.f131896e = bVar;
        cqVar.f131897f = bVar2;
        this.f123208g = str;
        Log.m105925i("MicroMsg.NetSceneMDRcvVoice", "amount: %d, outtradeno: %s", Integer.valueOf(i), str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123207f = nVar;
        return dispatch(gVar, this.f123205d, this);
    }

    public int getType() {
        return 1317;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneMDRcvVoice", "errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49179dq dqVar = (C49179dq) ((C47350c) uVar).f127056b.f127083a;
        this.f123206e = dqVar;
        C49179dq dqVar2 = this.f123206e;
        Log.m105925i("MicroMsg.NetSceneMDRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", Integer.valueOf(dqVar.f132472d), dqVar2.f132473e, Integer.valueOf(dqVar2.f132475g));
        C11385n nVar = this.f123207f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
