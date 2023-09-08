package w22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import rm0.C90021d;
import te3.C51941x90;
import te3.C52087y90;

/* renamed from: w22.a */
public class C53073a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f148133d;

    /* renamed from: e */
    public final C47350c f148134e;

    public C53073a(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51941x90();
        bVar.f127067b = new C52087y90();
        bVar.f127068c = "/cgi-bin/micromsg-bin/exittrackroom";
        bVar.f127069d = C90021d.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f148134e = a;
        ((C51941x90) a.f127055a.f127080a).f144529d = str;
        Log.m105918d("MicroMsg.NetSceneExitTrackRoom", "trackRoomId:" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148133d = nVar;
        return dispatch(gVar, this.f148134e, this);
    }

    public int getType() {
        return C90021d.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneExitTrackRoom", "onGYNetEnd errType %d errCode%d", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f148133d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
