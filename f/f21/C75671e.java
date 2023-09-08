package f21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64663qq;
import te3.C77979pq;

/* renamed from: f21.e */
public class C75671e extends C45737a {

    /* renamed from: j */
    public C47350c f222269j;

    /* renamed from: n */
    public C64663qq f222270n;

    /* renamed from: o */
    public C11385n f222271o;

    public C75671e(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, String str6, String str7, String str8, int i4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77979pq();
        bVar.f127067b = new C64663qq();
        bVar.f127069d = 1336;
        bVar.f127068c = "/cgi-bin/mmpay-bin/rewardqrcodeplaceorder";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f222269j = a;
        C77979pq pqVar = (C77979pq) a.f127055a.f127080a;
        pqVar.f228027e = i;
        pqVar.f228030h = i2;
        pqVar.f228026d = str;
        pqVar.f228028f = str2;
        pqVar.f228029g = str3;
        pqVar.f228031i = i3;
        pqVar.f228032j = str4;
        pqVar.f228033n = str5;
        pqVar.f228034o = str6;
        pqVar.f228035p = str7;
        pqVar.f228036q = str8;
        pqVar.f228037r = i4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f222271o = nVar;
        return dispatch(gVar, this.f222269j, this);
    }

    public int getType() {
        return 1336;
    }

    /* renamed from: k1 */
    public void mo71232k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneQrRewardPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C64663qq qqVar = (C64663qq) ((C47350c) uVar).f127056b.f127083a;
        this.f222270n = qqVar;
        Log.m105925i("MicroMsg.NetSceneQrRewardPlaceOrder", "retcode: %s, retmsg: %s", Integer.valueOf(qqVar.f185063d), this.f222270n.f185064e);
        if (!this.f123590h && this.f222270n.f185063d != 0) {
            this.f123591i = true;
        }
        C11385n nVar = this.f222271o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
