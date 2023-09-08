package b30;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p209nt.C11272e;
import te3.C90418ik2;
import te3.C90421jk2;
import te3.w55;

/* renamed from: b30.c */
public class C79662c extends C117747y implements C1311n, C11272e {

    /* renamed from: d */
    public final C47350c f233568d;

    /* renamed from: e */
    public C11385n f233569e;

    /* renamed from: f */
    public C11272e.C11273a f233570f;

    public C79662c(String str, LinkedList<String> linkedList, int i, String str2, String str3, int i2, int i3, C11272e.C11273a aVar) {
        Log.m105925i("MicroMsg.webview.NetSceneJSLogin", "NetSceneJSLogin doScene appId [%s], loginType [%d], url [%s], state [%s], versionType [%d], extScene [%d]", str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2), Integer.valueOf(i3));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C90418ik2();
        bVar.f127067b = new C90421jk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-login";
        bVar.f127069d = 1029;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f233568d = a;
        C90418ik2 ik22 = (C90418ik2) a.f127055a.f127080a;
        ik22.f259576d = str;
        ik22.f259577e = linkedList;
        ik22.f259578f = i;
        ik22.f259579g = str2;
        ik22.f259580h = str3;
        ik22.f259581i = i2;
        if (i3 > 0) {
            w55 w55 = new w55();
            ik22.f259582j = w55;
            w55.f143869e = i3;
        }
        this.f233570f = aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSLogin", "doScene");
        this.f233569e = nVar;
        return dispatch(gVar, this.f233568d, this);
    }

    public int getType() {
        return 1029;
    }

    /* renamed from: j1 */
    public C90421jk2 mo109787j1() {
        return (C90421jk2) this.f233568d.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSLogin", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f233569e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C11272e.C11273a aVar = this.f233570f;
        if (aVar != null) {
            aVar.mo11330a(i2, i3, str, this);
        }
    }
}
