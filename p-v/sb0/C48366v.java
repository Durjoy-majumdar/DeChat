package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48880bm3;
import te3.C49024cm3;

/* renamed from: sb0.v */
public class C48366v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129483d;

    /* renamed from: e */
    public C47350c f129484e;

    public C48366v(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48880bm3();
        bVar.f127067b = new C49024cm3();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/qymsgstatenotify";
        bVar.f127069d = 1361;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129484e = a;
        C48880bm3 bm32 = (C48880bm3) a.f127055a.f127080a;
        bm32.f131206d = str;
        bm32.f131207e = str2;
        bm32.f131208f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129483d = nVar;
        Log.m105924i("MicroMsg.NetSceneQyMsgStateNotify", "do scene");
        return dispatch(gVar, this.f129484e, this);
    }

    public int getType() {
        return 1361;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneQyMsgStateNotify", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129483d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
