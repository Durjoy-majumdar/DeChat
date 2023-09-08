package si2;

import android.util.Base64;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45119n;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C77971o4;
import te3.C77974ot3;
import te3.C77980pt3;

/* renamed from: si2.m */
public class C77715m extends C48382b implements C45119n {

    /* renamed from: r */
    public C47350c f226501r;

    /* renamed from: s */
    public C77980pt3 f226502s;

    /* renamed from: t */
    public C11385n f226503t;

    public C77715m(String str, String str2, String str3, int i, int i2, String str4, int i3, int i4, String str5, String str6, C89349b bVar, int i5) {
        Log.m105925i("MicroMsg.NetSceneBankRemitRequestOrder", "unique_id:%s last_transfer_bill_id:%s unpay_type:%s", Util.nullAsNil(str6), Base64.encodeToString(bVar.mo123703f(), 2), Integer.valueOf(i5));
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C77974ot3();
        bVar2.f127067b = new C77980pt3();
        bVar2.f127069d = 1380;
        bVar2.f127068c = "/cgi-bin/mmpay-bin/request_tsbc";
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C47350c a = bVar2.mo72403a();
        this.f226501r = a;
        C77974ot3 ot32 = (C77974ot3) a.f127055a.f127080a;
        ot32.f227968d = str;
        ot32.f227969e = str2;
        ot32.f227970f = str3;
        ot32.f227971g = i;
        ot32.f227972h = i2;
        ot32.f227973i = str4;
        ot32.f227974j = i3;
        ot32.f227975n = i4;
        ot32.f227976o = str5;
        ot32.f227977p = str6;
        ot32.f227978q = bVar;
        ot32.f227979r = i5;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f226503t = nVar;
        return dispatch(gVar, this.f226501r, this);
    }

    public int getType() {
        return 1380;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitRequestOrder", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C77980pt3 pt32 = (C77980pt3) ((C47350c) uVar).f127056b.f127083a;
        this.f226502s = pt32;
        Log.m105925i("MicroMsg.NetSceneBankRemitRequestOrder", "retcode: %s, retmsg: %s", Integer.valueOf(pt32.f228038d), this.f226502s.f228039e);
        C11385n nVar = this.f226503t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C77980pt3 pt32 = (C77980pt3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = pt32.f228038d;
        this.f221038h = pt32.f228039e;
    }

    /* renamed from: o1 */
    public boolean mo104822o1() {
        C77971o4 o4Var = this.f226502s.f228045n;
        return o4Var == null || o4Var.f227901d != 1;
    }
}
