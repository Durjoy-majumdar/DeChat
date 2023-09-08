package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52174yv1;
import te3.C52313zv1;

/* renamed from: sb0.o */
public class C48360o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129466d;

    /* renamed from: e */
    public C47350c f129467e;

    /* renamed from: f */
    public boolean f129468f = false;

    public C48360o(String str, String str2, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52174yv1();
        bVar.f127067b = new C52313zv1();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getbizchatinfo";
        bVar.f127069d = 1352;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129467e = a;
        C52174yv1 yv12 = (C52174yv1) a.f127055a.f127080a;
        yv12.f145535e = str;
        yv12.f145534d = str2;
        this.f129468f = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129466d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneGetBizChatInfo", "do scene");
        return dispatch(gVar, this.f129467e, this);
    }

    public int getType() {
        return 1352;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneGetBizChatInfo", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129466d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
