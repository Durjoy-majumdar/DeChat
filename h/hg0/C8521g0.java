package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76708i;
import te3.C48692ac0;
import te3.C48837bc0;

/* renamed from: hg0.g0 */
public class C8521g0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f27563d;

    /* renamed from: e */
    public C47350c f27564e;

    /* renamed from: f */
    public int f27565f;

    public C8521g0(int i, String str) {
        this.f27565f = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48692ac0();
        bVar.f127067b = new C48837bc0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/facebookauth";
        bVar.f127069d = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f27564e = a;
        C48692ac0 ac02 = (C48692ac0) a.f127055a.f127080a;
        ac02.f130425e = Util.isNullOrNil(str) ? "" : str;
        ac02.f130424d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f27563d = nVar;
        return dispatch(gVar, this.f27564e, this);
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        Log.m105918d("MicroMsg.NetSceneFaceBookAuth", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            C48837bc0 bc02 = (C48837bc0) this.f27564e.f127056b.f127083a;
            int i4 = bc02.getBaseResponse().f135955d;
            if (i4 != 0) {
                Log.m105920e("MicroMsg.NetSceneFaceBookAuth", "baseresponse.ret = " + i4);
                this.f27563d.onSceneEnd(4, i4, str, this);
                return;
            }
            Log.m105918d("MicroMsg.NetSceneFaceBookAuth", "fbuserid = " + bc02.f131042d + ", fbusername = " + bc02.f131043e);
            int i5 = this.f27565f;
            if (i5 == 0 || i5 == 1) {
                C85801v1 i6 = C86709a0.m107535s().mo121142i();
                i6.mo119676J(65825, "" + bc02.f131042d);
                ((C76708i) C86312j.m106911c(C76708i.class)).g40("" + bc02.f131042d);
                C85801v1 i7 = C86709a0.m107535s().mo121142i();
                i7.mo119676J(65826, "" + bc02.f131043e);
                C86709a0.m107535s().mo121142i().mo119681a(true);
            }
        }
        this.f27563d.onSceneEnd(i2, i3, str, this);
    }
}
