package tx2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51664v90;
import te3.C51802w90;

/* renamed from: tx2.b */
public class C52383b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146424d;

    /* renamed from: e */
    public final C47350c f146425e;

    /* renamed from: f */
    public int f146426f;

    public C52383b(int i, long j, String str, int i2) {
        this.f146426f = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51664v90();
        bVar.f127067b = new C51802w90();
        bVar.f127068c = "/cgi-bin/micromsg-bin/exittalkroom";
        bVar.f127069d = 333;
        bVar.f127070e = 148;
        bVar.f127071f = 1000000148;
        C47350c a = bVar.mo72403a();
        this.f146425e = a;
        C51664v90 v902 = (C51664v90) a.f127055a.f127080a;
        v902.f143393f = str;
        v902.f143391d = i;
        v902.f143392e = j;
        v902.f143394g = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105919d("MicroMsg.NetSceneExitTalkRoom", "doScene %d", Integer.valueOf(this.f146426f));
        this.f146424d = nVar;
        return dispatch(gVar, this.f146425e, this);
    }

    public int getType() {
        return 333;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneExitTalkRoom", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            this.f146424d.onSceneEnd(i2, i3, str, this);
        } else {
            this.f146424d.onSceneEnd(i2, i3, str, this);
        }
    }
}
