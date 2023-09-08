package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.om4;
import te3.pm4;

/* renamed from: mi.z */
public class C47054z extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126459d;

    /* renamed from: e */
    public final C47350c f126460e;

    /* renamed from: f */
    public pm4 f126461f;

    /* renamed from: g */
    public String f126462g;

    public C47054z(String str, String str2, int i) {
        Log.m105925i("MicroMsg.NetSceneUpgradeAssociateChatRoom", "NetSceneUpgradeAssociateChatRoom roomname:%s", Util.nullAs(str, ""));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/upgradeassociatechatroom";
        bVar.f127069d = 3927;
        bVar.f127066a = new om4();
        bVar.f127067b = new pm4();
        C47350c a = bVar.mo72403a();
        this.f126460e = a;
        this.f126462g = str;
        om4 om4 = (om4) a.f127055a.f127080a;
        om4.f139259d = str;
        om4.f139260e = str2;
        om4.f139261f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126459d = nVar;
        C47350c cVar = this.f126460e;
        this.f126461f = (pm4) cVar.f127056b.f127083a;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 3927;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneUpgradeAssociateChatRoom", "onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f126459d.onSceneEnd(i2, i3, str, this);
    }
}
