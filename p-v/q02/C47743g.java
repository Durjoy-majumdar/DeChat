package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50210l32;
import te3.C50348m32;

/* renamed from: q02.g */
public class C47743g extends C75113f0 {

    /* renamed from: r */
    public C50348m32 f128258r;

    public C47743g(String str, long j, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50210l32();
        bVar.f127067b = new C50348m32();
        bVar.f127069d = 2815;
        bVar.f127068c = "/cgi-bin/mmpay-bin/gmcreditlinetoken";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C50210l32 l322 = (C50210l32) a.f127055a.f127080a;
        l322.f137150d = str;
        l322.f137151e = j;
        l322.f137152f = str2;
        Log.m105925i("MicroMsg.NetSceneMCreditLineTokenSign", "card_no: %s, credit_line: %s", str, Long.valueOf(j));
    }

    public int getType() {
        return 2815;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMCreditLineTokenSign", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50348m32 m322 = (C50348m32) ((C47350c) uVar).f127056b.f127083a;
        this.f128258r = m322;
        Log.m105925i("MicroMsg.NetSceneMCreditLineTokenSign", "retcode: %s, retmsg: %s", Integer.valueOf(m322.f137814e), this.f128258r.f137815f);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C50348m32 m322 = (C50348m32) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = m322.f137814e;
        this.f221038h = m322.f137815f;
    }
}
