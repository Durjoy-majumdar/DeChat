package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48771aw1;
import te3.C48916bw1;

/* renamed from: sb0.q */
public class C48362q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129472d;

    /* renamed from: e */
    public C47350c f129473e;

    /* renamed from: f */
    public Object f129474f;

    public C48362q(String str, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48771aw1();
        bVar.f127067b = new C48916bw1();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getbizchatmyuserinfo";
        bVar.f127069d = 1354;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129473e = a;
        ((C48771aw1) a.f127055a.f127080a).f130795d = str;
        this.f129474f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129472d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "do scene");
        return dispatch(gVar, this.f129473e, this);
    }

    public int getType() {
        return 1354;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129472d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
