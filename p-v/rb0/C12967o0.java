package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49907iw1;
import te3.C50046jw1;

/* renamed from: rb0.o0 */
public class C12967o0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f36990d;

    /* renamed from: e */
    public C47350c f36991e;

    /* renamed from: f */
    public Object f36992f;

    public C12967o0(String str, int i, String str2, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49907iw1();
        bVar.f127067b = new C50046jw1();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getbizjsapiresult";
        bVar.f127069d = 1285;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f36991e = a;
        C49907iw1 iw12 = (C49907iw1) a.f127055a.f127080a;
        iw12.f135705d = str;
        iw12.f135706e = i;
        iw12.f135707f = str2;
        this.f36992f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f36990d = nVar;
        Log.m105924i("MicroMsg.NetSceneGetBizJsApiResult", "do scene");
        return dispatch(gVar, this.f36991e, this);
    }

    public int getType() {
        return 1285;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetBizJsApiResult", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f36990d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
