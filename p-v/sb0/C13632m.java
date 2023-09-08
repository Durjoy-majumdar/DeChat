package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50198l00;
import te3.C50333m00;

/* renamed from: sb0.m */
public class C13632m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f38625d;

    /* renamed from: e */
    public C47350c f38626e;

    /* renamed from: f */
    public String f38627f;

    /* renamed from: g */
    public Object f38628g;

    public C13632m(String str, String str2, String str3, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50198l00();
        bVar.f127067b = new C50333m00();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/convertbizchat";
        bVar.f127069d = 1315;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f38626e = a;
        C50198l00 l002 = (C50198l00) a.f127055a.f127080a;
        l002.f137115d = str;
        l002.f137117f = str2;
        l002.f137116e = str3;
        this.f38628g = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f38625d = nVar;
        Log.m105924i("MicroMsg.NetSceneConvertBizChat", "do scene");
        return dispatch(gVar, this.f38626e, this);
    }

    public int getType() {
        return 1315;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneConvertBizChat", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f38625d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
