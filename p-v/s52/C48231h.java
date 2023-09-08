package s52;

import c63.C67345b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import di3.C86312j;
import ft3.C45807d;
import java.io.IOException;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50451mu1;
import te3.C50594nu1;
import ub3.C78144b;

/* renamed from: s52.h */
public class C48231h extends C75123k0 {

    /* renamed from: d */
    public final C47350c f129222d;

    /* renamed from: e */
    public C11385n f129223e;

    /* renamed from: f */
    public C50451mu1 f129224f;

    /* renamed from: g */
    public int f129225g;

    public C48231h(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50451mu1();
        bVar.f127067b = new C50594nu1();
        bVar.f127069d = 4362;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getallfunction";
        C47350c a = bVar.mo72403a();
        this.f129222d = a;
        this.f129224f = (C50451mu1) a.f127055a.f127080a;
        this.f129225g = i;
        Log.m105925i("MicroMsg.NetSceneGetPayFunctionListNew", "walletRegion: %s", Integer.valueOf(i));
        this.f129224f.f138211d = this.f129225g;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129223e = nVar;
        return dispatch(gVar, this.f129222d, this);
    }

    public int getType() {
        return 4362;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        C50594nu1 nu12;
        Log.m105925i("MicroMsg.NetSceneGetPayFunctionListNew", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0 && (nu12 = (C50594nu1) ((C47350c) uVar).f127056b.f127083a) != null) {
            int i4 = this.f129225g;
            Class cls = C78144b.class;
            try {
                ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C67345b.m79692f(i4), C45807d.m51084a(nu12.toByteArray()));
                ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119990a(true);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.MallLogic", "save config exp, " + e.getLocalizedMessage());
            }
        }
        C11385n nVar = this.f129223e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
