package pc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import g34.C116918i;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48710ag3;
import te3.C64881zf3;
import te3.ek4;
import tn3.C118493b;

/* renamed from: pc0.q */
public class C62259q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f176973d;

    /* renamed from: e */
    public C47350c f176974e;

    public C62259q(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64881zf3();
        bVar.f127067b = new C48710ag3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/postinvitefriendsmsg";
        bVar.f127069d = 1804;
        C47350c a = bVar.mo72403a();
        this.f176974e = a;
        C64881zf3 zf32 = (C64881zf3) a.f127055a.f127080a;
        zf32.f186700d = i;
        zf32.f186702f = str;
        if ((i & 16) > 0) {
            C118493b bVar2 = new C118493b();
            ek4 ek4 = new ek4();
            C116918i iVar = bVar2.f354643b;
            if (iVar == null) {
                ek4 = null;
            } else if (!Util.isNullOrNil(iVar.f350347d)) {
                C116918i iVar2 = bVar2.f354643b;
                ek4.f182993d = iVar2.f350347d;
                ek4.f182994e = iVar2.f350348e;
            }
            zf32.f186703g = ek4;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetScenePostInviteFriendsMsg", "doScene");
        this.f176973d = nVar;
        return dispatch(gVar, this.f176974e, this);
    }

    public int getType() {
        return 1804;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetScenePostInviteFriendsMsg", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            this.f176973d.onSceneEnd(i2, i3, str, this);
        } else {
            this.f176973d.onSceneEnd(i2, i3, str, this);
        }
    }
}
