package l62;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48956c43;
import te3.C49095d43;

/* renamed from: l62.a */
public class C10468a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f31700d;

    /* renamed from: e */
    public final C47350c f31701e;

    /* renamed from: f */
    public C49095d43 f31702f;

    /* renamed from: g */
    public int f31703g;

    public C10468a(String str, String str2, String str3, int i) {
        Log.m105925i("MicroMsg.openim.NetSceneOpenImNotAutoSucceed", "NetSceneNotAutoSucceed action:%s originTpusername:%s op:%s heirTpusername%s", Integer.valueOf(i), Util.nullAs(str, ""), Util.nullAs(str, ""), Util.secPrint(str3));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/notautosucceed";
        bVar.f127069d = 3713;
        bVar.f127066a = new C48956c43();
        bVar.f127067b = new C49095d43();
        C47350c a = bVar.mo72403a();
        this.f31701e = a;
        this.f31703g = i;
        C48956c43 c432 = (C48956c43) a.f127055a.f127080a;
        c432.f131503d = Util.nullAs(str, "");
        c432.f131504e = Util.nullAs(str2, "");
        c432.f131505f = Util.nullAs(str3, "");
        c432.f131506g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f31700d = nVar;
        C47350c cVar = this.f31701e;
        this.f31702f = (C49095d43) cVar.f127056b.f127083a;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 3713;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.openim.NetSceneOpenImNotAutoSucceed", "onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f31700d.onSceneEnd(i2, i3, str, this);
    }
}
