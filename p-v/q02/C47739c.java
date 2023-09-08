package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48647a10;
import te3.C48791b10;

/* renamed from: q02.c */
public class C47739c extends C75113f0 {

    /* renamed from: r */
    public C48791b10 f128254r;

    public C47739c(String str, long j, String str2, String str3, int i, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48647a10();
        bVar.f127067b = new C48791b10();
        bVar.f127069d = 2662;
        bVar.f127068c = "/cgi-bin/mmpay-bin/createhoneypaycard";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C48647a10 a102 = (C48647a10) a.f127055a.f127080a;
        a102.f130196d = str;
        a102.f130197e = j;
        a102.f130198f = str2;
        a102.f130199g = str3;
        a102.f130200h = i;
        a102.f130201i = str4;
        Log.m105919d("MicroMsg.NetSceneCreateHoneyPayCard", "token: %s, take message: %s, wishing: %s", str, str3, str4);
        Log.m105925i("MicroMsg.NetSceneCreateHoneyPayCard", "username: %s, credit line: %s", str2, Long.valueOf(j));
    }

    public int getType() {
        return 2662;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCreateHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C48791b10 b102 = (C48791b10) ((C47350c) uVar).f127056b.f127083a;
        this.f128254r = b102;
        Log.m105925i("MicroMsg.NetSceneCreateHoneyPayCard", "retcode: %s, retmsg: %s", Integer.valueOf(b102.f130881d), this.f128254r.f130882e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C48791b10 b102 = (C48791b10) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = b102.f130881d;
        this.f221038h = b102.f130882e;
    }
}
