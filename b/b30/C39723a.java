package b30;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p209nt.C11270c;
import te3.C49297ek2;
import te3.C90411fk2;
import te3.t65;
import te3.w55;

/* renamed from: b30.a */
public class C39723a extends C117747y implements C1311n, C11270c {

    /* renamed from: d */
    public final C47350c f106580d;

    /* renamed from: e */
    public C11385n f106581e;

    /* renamed from: f */
    public C11270c.C11271a f106582f;

    public C39723a(String str, t65 t65, LinkedList<String> linkedList, int i, int i2, C11270c.C11271a aVar) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene appId [%s], versionType [%d], extScene[%d]", str, Integer.valueOf(i), Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49297ek2();
        bVar.f127067b = new C90411fk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-authorize";
        bVar.f127069d = 1157;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106580d = a;
        C49297ek2 ek22 = (C49297ek2) a.f127055a.f127080a;
        if (i2 > 0) {
            w55 w55 = new w55();
            ek22.f132986g = w55;
            w55.f143869e = i2;
        }
        ek22.f132983d = str;
        ek22.f132984e = linkedList;
        ek22.f132985f = i;
        ek22.f132988i = t65;
        if (t65 != null) {
            Log.m105924i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene req.plugin_info plugin_appid=" + ek22.f132988i.f141999d + "  custom_version=" + ek22.f132988i.f142000e + "  inner_version=" + ek22.f132988i.f142001f);
        }
        this.f106582f = aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSAuthorize", "doScene");
        this.f106581e = nVar;
        return dispatch(gVar, this.f106580d, this);
    }

    public int getType() {
        return 1157;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAuthorize", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f106581e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C11270c.C11271a aVar = this.f106582f;
        if (aVar != null) {
            aVar.mo11329a(i2, i3, str, this);
        }
    }
}
