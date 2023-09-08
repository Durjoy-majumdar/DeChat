package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51960xe;
import te3.hl4;
import te3.il4;

/* renamed from: sb0.w */
public class C48367w extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129485d;

    /* renamed from: e */
    public C47350c f129486e;

    /* renamed from: f */
    public Object f129487f;

    public C48367w(String str, C51960xe xeVar, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new hl4();
        bVar.f127067b = new il4();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/updatebizchat";
        bVar.f127069d = 1356;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129486e = a;
        hl4 hl4 = (hl4) a.f127055a.f127080a;
        hl4.f134719d = str;
        hl4.f134720e = xeVar;
        this.f129487f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129485d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneUpdateBizChat", "do scene");
        return dispatch(gVar, this.f129486e, this);
    }

    public int getType() {
        return 1356;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneUpdateBizChat", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129485d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
