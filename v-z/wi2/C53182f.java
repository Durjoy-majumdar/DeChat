package wi2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.lj4;
import te3.mj4;

/* renamed from: wi2.f */
public class C53182f extends C75123k0 {

    /* renamed from: d */
    public C47350c f148367d;

    /* renamed from: e */
    public mj4 f148368e;

    /* renamed from: f */
    public C11385n f148369f;

    public C53182f(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new lj4();
        bVar.f127067b = new mj4();
        bVar.f127069d = 2817;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonepaycheck";
        C47350c a = bVar.mo72403a();
        this.f148367d = a;
        lj4 lj4 = (lj4) a.f127055a.f127080a;
        lj4.f137460d = str;
        lj4.f137461e = str2;
        lj4.f137462f = str3;
        lj4.f137463g = str4;
        lj4.f137464h = j;
        lj4.f137465i = str5;
        lj4.f137466j = str6;
        lj4.f137467n = str7;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "do scene NetSceneMobileRemitPayCheck reqKey:%s transferId:%s transactionId:%s receiverOpenid:%s fee:%s extendStr:%s rcvrToken:%s placeorderToken:%s", str, str2, str3, str4, Long.valueOf(j), str5, str6, str7);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148369f = nVar;
        return dispatch(gVar, this.f148367d, this);
    }

    public int getType() {
        return 2817;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        mj4 mj4 = (mj4) ((C47350c) uVar).f127056b.f127083a;
        this.f148368e = mj4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", Integer.valueOf(mj4.f138073d), this.f148368e.f138074e);
        C11385n nVar = this.f148369f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
