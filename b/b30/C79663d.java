package b30;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p209nt.C89091f;
import te3.C49717hk2;
import te3.C90412gk2;
import te3.w55;

/* renamed from: b30.d */
public class C79663d extends C117747y implements C1311n, C89091f {

    /* renamed from: d */
    public final C47350c f233571d;

    /* renamed from: e */
    public C11385n f233572e;

    /* renamed from: f */
    public C89091f.C89092a f233573f;

    public C79663d(String str, LinkedList<String> linkedList, int i, String str2, int i2, int i3, int i4, C89091f.C89092a aVar) {
        Log.m105925i("MicroMsg.webview.NetSceneJSLoginConfirm", "NetSceneJSLogin doScene appId [%s], login_type [%d], state [%s], versionType [%d], opt [%d], extScene [%d]", str, Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C90412gk2();
        bVar.f127067b = new C49717hk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-login-confirm";
        bVar.f127069d = 1117;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f233571d = a;
        C90412gk2 gk22 = (C90412gk2) a.f127055a.f127080a;
        if (i4 > 0) {
            w55 w55 = new w55();
            gk22.f259531j = w55;
            w55.f143869e = i4;
        }
        gk22.f259525d = str;
        gk22.f259526e = linkedList;
        gk22.f259527f = i;
        gk22.f259528g = str2;
        gk22.f259530i = i2;
        gk22.f259529h = i3;
        this.f233573f = aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSLoginConfirm", "doScene");
        this.f233572e = nVar;
        return dispatch(gVar, this.f233571d, this);
    }

    public int getType() {
        return 1117;
    }

    /* renamed from: j1 */
    public C49717hk2 mo109788j1() {
        return (C49717hk2) this.f233571d.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSLoginConfirm", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f233572e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C89091f.C89092a aVar = this.f233573f;
        if (aVar != null) {
            aVar.mo114566a(i2, i3, str, this);
        }
    }
}
