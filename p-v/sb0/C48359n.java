package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51725vq1;
import te3.C51762w00;
import te3.C51902x00;

/* renamed from: sb0.n */
public class C48359n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129463d;

    /* renamed from: e */
    public C47350c f129464e;

    /* renamed from: f */
    public Object f129465f;

    public C48359n(String str, C51725vq1 vq12, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51762w00();
        bVar.f127067b = new C51902x00();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/createbizchatinfo";
        bVar.f127069d = 1355;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129464e = a;
        C51762w00 w002 = (C51762w00) a.f127055a.f127080a;
        w002.f143792d = str;
        w002.f143793e = vq12;
        this.f129465f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129463d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "do scene");
        return dispatch(gVar, this.f129464e, this);
    }

    public int getType() {
        return 1355;
    }

    /* renamed from: j1 */
    public C51902x00 mo73080j1() {
        C47465a aVar;
        C47350c cVar = this.f129464e;
        if (cVar == null || (aVar = cVar.f127056b.f127083a) == null) {
            return null;
        }
        return (C51902x00) aVar;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129463d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
