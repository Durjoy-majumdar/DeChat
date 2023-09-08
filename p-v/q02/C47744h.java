package q02;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51899wz2;
import te3.C52042xz2;

/* renamed from: q02.h */
public class C47744h extends C75113f0 {

    /* renamed from: r */
    public C52042xz2 f128259r;

    /* renamed from: s */
    public long f128260s;

    public C47744h(long j, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51899wz2();
        bVar.f127067b = new C52042xz2();
        bVar.f127069d = 2685;
        bVar.f127068c = "/cgi-bin/mmpay-bin/modifyhppayercreditline";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C51899wz2 wz22 = (C51899wz2) a.f127055a.f127080a;
        wz22.f144364d = j;
        wz22.f144365e = str;
        wz22.f144366f = str2;
        this.f128260s = j;
        Log.m105919d("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "cardNo: %s, authToken: %s", str2, str);
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "credit line: %s", Long.valueOf(j));
    }

    public int getType() {
        return 2685;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C52042xz2 xz22 = (C52042xz2) ((C47350c) uVar).f127056b.f127083a;
        this.f128259r = xz22;
        Log.m105925i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "retcode: %s, retmsg: %s", Integer.valueOf(xz22.f145038d), this.f128259r.f145039e);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C52042xz2 xz22 = (C52042xz2) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = xz22.f145038d;
        this.f221038h = xz22.f145039e;
    }
}
