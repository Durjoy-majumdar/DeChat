package b30;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p209nt.C47296d;
import te3.C49014ck2;
import te3.C49158dk2;
import te3.w55;
import wm0.C91035a;

/* renamed from: b30.b */
public class C39724b extends C117747y implements C1311n, C47296d {

    /* renamed from: d */
    public final C47350c f106583d;

    /* renamed from: e */
    public C11385n f106584e;

    /* renamed from: f */
    public C47296d.C47297a f106585f;

    public C39724b(String str, LinkedList<String> linkedList, int i, int i2, int i3, C47296d.C47297a aVar) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "NetSceneJSLogin doScene appId [%s], versionType [%d], opt [%d], extScene [%d]", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49014ck2();
        bVar.f127067b = new C49158dk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
        bVar.f127069d = C91035a.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106583d = a;
        C49014ck2 ck22 = (C49014ck2) a.f127055a.f127080a;
        if (i3 > 0) {
            w55 w55 = new w55();
            ck22.f131799h = w55;
            w55.f143869e = i3;
        }
        ck22.f131795d = str;
        ck22.f131796e = linkedList;
        ck22.f131798g = i;
        ck22.f131797f = i2;
        this.f106585f = aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "doScene");
        this.f106584e = nVar;
        return dispatch(gVar, this.f106583d, this);
    }

    public int getType() {
        return C91035a.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f106584e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C47296d.C47297a aVar = this.f106585f;
        if (aVar != null) {
            aVar.mo72338a(i2, i3, str, this);
        }
    }
}
