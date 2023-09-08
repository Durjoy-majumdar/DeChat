package pd2;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.xweb.util.WXWebReporter;
import fm0.C86991y0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51374tb3;
import te3.C51523ub3;

/* renamed from: pd2.e */
public class C47463e extends C75123k0 {

    /* renamed from: d */
    public C11385n f127311d;

    /* renamed from: e */
    public C47350c f127312e;

    public C47463e(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51374tb3();
        bVar.f127067b = new C51523ub3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/paydeluserroll";
        bVar.f127069d = C86991y0.CTRL_INDEX;
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED;
        bVar.f127071f = 1000000187;
        C47350c a = bVar.mo72403a();
        this.f127312e = a;
        C51374tb3 tb32 = (C51374tb3) a.f127055a.f127080a;
        tb32.f142103d = i;
        if (!Util.isNullOrNil(str)) {
            tb32.f142104e = str;
        }
        if (!Util.isNullOrNil(str2)) {
            tb32.f142106g = str2;
        }
        tb32.f142107h = C113146l.m154805c();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127311d = nVar;
        return dispatch(gVar, this.f127312e, this);
    }

    public int getType() {
        return C86991y0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetScenePayDelUserRoll", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        this.f127311d.onSceneEnd(i2, i3, str, this);
    }
}
