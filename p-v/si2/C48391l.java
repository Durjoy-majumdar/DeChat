package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51008qs3;
import te3.C51151rs3;

/* renamed from: si2.l */
public class C48391l extends C48382b {

    /* renamed from: r */
    public C47350c f129535r;

    /* renamed from: s */
    public C11385n f129536s;

    public C48391l(String str, String str2, int i) {
        Log.m105925i("MicroMsg.NetSceneBankRemitReportPayRes", "NetSceneBankRemitReportPayRes() transfer_bill_id:%s unique_id:%s unpay_type:%s", str, str2, Integer.valueOf(i));
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51008qs3 qs32 = new C51008qs3();
        qs32.f140529d = new C89349b(("" + str).getBytes());
        qs32.f140530e = str2;
        qs32.f140531f = i;
        bVar.f127066a = qs32;
        bVar.f127067b = new C51151rs3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/reportpayres_tsbc";
        bVar.f127069d = 2739;
        this.f129535r = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129536s = nVar;
        return dispatch(gVar, this.f129535r, this);
    }

    public int getType() {
        return 2739;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitReportPayRes", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51151rs3 rs32 = (C51151rs3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f129536s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C51151rs3 rs32 = (C51151rs3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = rs32.f141114d;
        this.f221038h = rs32.f141115e;
    }
}
