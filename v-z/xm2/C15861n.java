package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49401fa2;
import te3.C49536ga2;

/* renamed from: xm2.n */
public class C15861n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f42711d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f42711d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49401fa2();
        bVar.f127067b = new C49536ga2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/gettrustedfriends";
        bVar.f127069d = 869;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return 869;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchIdNew(i);
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105921e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.f42711d.onSceneEnd(i2, i3, str, this);
    }
}
