package ut1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.android.wechat.TenpayUtil;
import mv2.C21541f;
import ob0.C11385n;
import ob0.C47350c;
import p623nr.C47294g;
import st1.C48462m;
import te3.x94;
import te3.y94;

/* renamed from: ut1.b */
public class C52605b extends C21541f implements C47294g {

    /* renamed from: d */
    public C11385n f146913d;

    /* renamed from: e */
    public final C47350c f146914e;

    /* renamed from: f */
    public int f146915f;

    public C52605b(String str, String str2, String str3, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new x94();
        bVar.f127067b = new y94();
        bVar.f127068c = "/cgi-bin/mmpay-bin/soteropenfppayment";
        bVar.f127069d = 1638;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f146914e = a;
        x94 x94 = (x94) a.f127055a.f127080a;
        x94.f144549d = str;
        x94.f144550e = str2;
        x94.f144551f = str3;
        x94.f144552g = TenpayUtil.signWith3Des("passwd=" + x94.f144551f);
        x94.f144553h = i;
        x94.f144554i = 1;
        this.f146915f = i;
        Log.m105925i("MicroMsg.NetSceneSoterOpenTouchPay", "soter type: %s", Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146913d = nVar;
        return dispatch(gVar, this.f146914e, this);
    }

    public int getType() {
        return 1638;
    }

    /* renamed from: j1 */
    public void mo33748j1() {
        Log.m105924i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: authkey required");
        C11385n nVar = this.f146913d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
    }

    /* renamed from: k1 */
    public void mo33749k1(int i, int i2, String str) {
        Log.m105925i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: onError: errType: %d, errcode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        C11385n nVar = this.f146913d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
    }

    /* renamed from: l1 */
    public void mo33750l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay success");
            if (this.f146915f == 1) {
                C48462m.m53818b(true);
                C48462m.m53819c(false);
            } else {
                C48462m.m53819c(true);
                C48462m.m53818b(false);
            }
        } else {
            Log.m105920e("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay failed");
        }
        this.f146913d.onSceneEnd(i2, i3, "", this);
    }
}
