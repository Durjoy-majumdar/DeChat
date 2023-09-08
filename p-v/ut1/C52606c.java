package ut1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.android.wechat.TenpayUtil;
import f40.C86709a0;
import mv2.C21541f;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import p623nr.C47295h;
import pv2.C110259i;
import pv2.C77292s;
import te3.aa4;
import te3.z94;
import xt3.C53447b;
import xt3.C53448e;

/* renamed from: ut1.c */
public class C52606c extends C21541f implements C53448e, C47295h {

    /* renamed from: d */
    public C11385n f146916d;

    /* renamed from: e */
    public C53447b<C53448e.C53450b> f146917e = null;

    /* renamed from: f */
    public C47350c f146918f;

    /* renamed from: g */
    public String f146919g;

    /* renamed from: h */
    public int f146920h;

    /* renamed from: i */
    public int f146921i;

    public C52606c(String str, int i) {
        this.f146919g = str;
        this.f146920h = i;
        this.f146921i = i;
    }

    /* renamed from: D */
    public void mo36515D() {
        C86709a0.m107524d().mo123460f(this);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146916d = nVar;
        return dispatch(gVar, this.f146918f, this);
    }

    public int getType() {
        return 1665;
    }

    /* renamed from: j1 */
    public void mo33748j1() {
        Log.m105924i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: authkey required");
        C11385n nVar = this.f146916d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
        if (this.f146917e != null) {
            Log.m105920e("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "alvinluo pay auth key expired when upload pay auth key");
            this.f146917e.mo36822a(new C53448e.C53450b(false));
        }
    }

    /* renamed from: k1 */
    public void mo33749k1(int i, int i2, String str) {
        Log.m105925i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: onError: errType: %d, errcode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        C11385n nVar = this.f146916d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
    }

    /* renamed from: l1 */
    public void mo33750l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "onGYNetEnd errType: %d , errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f146916d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C77292s.f225404c = str;
        C53447b<C53448e.C53450b> bVar = this.f146917e;
        if (bVar == null) {
            return;
        }
        if (i2 == 0 && i3 == 0) {
            bVar.mo36822a(new C53448e.C53450b(true));
        } else {
            bVar.mo36822a(new C53448e.C53450b(false));
        }
    }

    /* renamed from: o */
    public void mo36516o(C53447b<C53448e.C53450b> bVar) {
        this.f146917e = bVar;
    }

    /* renamed from: x0 */
    public void mo36517x0(Object obj) {
        C53448e.C53449a aVar = (C53448e.C53449a) obj;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new z94();
        bVar.f127067b = new aa4();
        bVar.f127068c = "/cgi-bin/mmpay-bin/soterupdateauthkey";
        bVar.f127069d = 1665;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f146918f = a;
        z94 z94 = (z94) a.f127055a.f127080a;
        z94.f145777e = this.f146919g;
        z94.f145776d = aVar.f150351a;
        z94.f145778f = aVar.f150352b;
        z94.f145779g = TenpayUtil.signWith3Des("passwd=" + z94.f145777e);
        z94.f145780h = this.f146920h;
        z94.f145781i = this.f146921i;
        try {
            JSONObject jSONObject = new JSONObject(aVar.f150351a);
            C110259i.m149875b(jSONObject.getString("cpu_id"), jSONObject.getString("uid"));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", e, "save device info exception", new Object[0]);
        }
        Log.m105925i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "json: %s, sign: %s", aVar.f150351a, aVar.f150352b);
    }
}
