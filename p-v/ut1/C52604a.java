package ut1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import mv2.C21541f;
import ob0.C11385n;
import ob0.C47350c;
import p623nr.C76955f;
import pv2.C110259i;
import pv2.C110260j;
import st1.C77761h0;
import te3.v94;
import te3.w94;

/* renamed from: ut1.a */
public class C52604a extends C21541f implements C76955f {

    /* renamed from: d */
    public C11385n f146909d;

    /* renamed from: e */
    public final C47350c f146910e;

    /* renamed from: f */
    public String f146911f = "";

    /* renamed from: g */
    public boolean f146912g = false;

    public C52604a(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new v94();
        bVar.f127067b = new w94();
        bVar.f127068c = "/cgi-bin/mmpay-bin/sotergetchallenge";
        bVar.f127069d = 1586;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f146910e = a;
        v94 v94 = (v94) a.f127055a.f127080a;
        C110260j a2 = C110259i.m149874a();
        String str = a2.f329808a;
        String str2 = a2.f329809b;
        Log.m105925i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: cpu_id: %s, uid: %s", str, str2);
        v94.f143400e = str;
        v94.f143401f = str2;
        v94.f143399d = 0;
        v94.f143402g = i;
        v94.f143403h = 1;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146909d = nVar;
        return dispatch(gVar, this.f146910e, this);
    }

    public int getType() {
        return 1586;
    }

    /* renamed from: j1 */
    public void mo33748j1() {
        Log.m105920e("MicroMsg.NetSceneSoterGetPayChallenge", "hy: auth key expired");
        C11385n nVar = this.f146909d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
    }

    /* renamed from: k1 */
    public void mo33749k1(int i, int i2, String str) {
        C11385n nVar = this.f146909d;
        if (nVar != null) {
            nVar.onSceneEnd(4, -1, "", this);
        }
    }

    /* renamed from: l1 */
    public void mo33750l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneSoterGetPayChallenge", "hy: onGYNetEnd errType %d errCode%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            w94 w94 = (w94) ((C47350c) uVar).f127056b.f127083a;
            String str2 = w94.f143936d;
            this.f146911f = str2;
            C77761h0 h0Var = C77761h0.IML;
            h0Var.f226590d = str2;
            int i4 = w94.f143937e;
            this.f146912g = 1 == i4;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(1 == i4);
            Log.m105919d("MicroMsg.NetSceneSoterGetPayChallenge", "get pay challenge needChangeAuthKey: %b", objArr);
            boolean z = this.f146912g;
            h0Var.f226592f = z;
            Log.m105925i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: challenge: %s, need auth key: %b", this.f146911f, Boolean.valueOf(z));
        }
        this.f146909d.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: w0 */
    public String mo73581w0() {
        return this.f146911f;
    }
}
