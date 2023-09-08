package pc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49084d22;
import te3.C49220e22;

/* renamed from: pc0.n */
public class C11885n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f34729d;

    /* renamed from: e */
    public C47350c f34730e;

    /* renamed from: f */
    public String f34731f = "";

    /* renamed from: g */
    public String f34732g = "";

    /* renamed from: h */
    public int f34733h = 0;

    public C11885n(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49084d22();
        bVar.f127067b = new C49220e22();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getinvitefriendsmsg";
        bVar.f127069d = 1803;
        C47350c a = bVar.mo72403a();
        this.f34730e = a;
        ((C49084d22) a.f127055a.f127080a).f132075d = i;
        this.f34733h = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneGetInviteFriendsMsg", "doScene");
        this.f34729d = nVar;
        return dispatch(gVar, this.f34730e, this);
    }

    public int getType() {
        return 1803;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetInviteFriendsMsg", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            C49220e22 e222 = (C49220e22) this.f34730e.f127056b.f127083a;
            this.f34731f = e222.f132644d;
            this.f34732g = e222.f132645e;
            this.f34729d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f34729d.onSceneEnd(i2, i3, str, this);
    }
}
