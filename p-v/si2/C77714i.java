package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51800w83;
import te3.C78010x83;

/* renamed from: si2.i */
public class C77714i extends C48382b {

    /* renamed from: r */
    public C47350c f226498r;

    /* renamed from: s */
    public C78010x83 f226499s;

    /* renamed from: t */
    public C11385n f226500t;

    public C77714i() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51800w83();
        bVar.f127067b = new C78010x83();
        bVar.f127069d = 1280;
        bVar.f127068c = "/cgi-bin/mmpay-bin/operation_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f226498r = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f226500t = nVar;
        return dispatch(gVar, this.f226498r, this);
    }

    public int getType() {
        return 1280;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitOperation", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C78010x83 x832 = (C78010x83) ((C47350c) uVar).f127056b.f127083a;
        this.f226499s = x832;
        Log.m105925i("MicroMsg.NetSceneBankRemitOperation", "retcode: %s, retmsg: %s", Integer.valueOf(x832.f228378d), this.f226499s.f228379e);
        if (!this.f221039i && !this.f221040j) {
            Log.m105925i("MicroMsg.NetSceneBankRemitOperation", "min_poundage: %s, max_amount: %s", Integer.valueOf(this.f226499s.f228380f), Integer.valueOf(this.f226499s.f228381g));
            if (this.f226499s.f228380f >= 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_MIN_POUNDAGE_INT_SYNC, Integer.valueOf(this.f226499s.f228380f));
            }
            if (this.f226499s.f228381g > 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_MAX_TRANSFER_AMOUNT_INT_SYNC, Integer.valueOf(this.f226499s.f228381g));
            }
            if (!Util.isNullOrNil(this.f226499s.f228384j)) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_PAYLIST_STRING_SYNC, this.f226499s.f228384j);
            }
        }
        C11385n nVar = this.f226500t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C78010x83 x832 = (C78010x83) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = x832.f228378d;
        this.f221038h = x832.f228379e;
    }
}
