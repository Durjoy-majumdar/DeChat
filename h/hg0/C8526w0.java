package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50344m24;
import te3.C50486n24;

/* renamed from: hg0.w0 */
public class C8526w0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f27576d;

    /* renamed from: e */
    public final C47350c f27577e;

    public C8526w0(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50344m24();
        bVar.f127067b = new C50486n24();
        bVar.f127068c = "/cgi-bin/micromsg-bin/newsetemailpwd";
        bVar.f127069d = 382;
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD;
        bVar.f127071f = 1000000181;
        C47350c a = bVar.mo72403a();
        this.f27577e = a;
        ((C50344m24) a.f127055a.f127080a).f137776d = Util.getCutPasswordMD5(str);
        Log.m105918d("MicroMsg.NetSceneSetEmailPwd", "md5 " + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f27576d = nVar;
        return dispatch(gVar, this.f27577e, this);
    }

    public int getType() {
        return 382;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneSetEmailPwd", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        this.f27576d.onSceneEnd(i2, i3, str, this);
    }
}
