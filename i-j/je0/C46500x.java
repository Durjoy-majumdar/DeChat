package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import lm0.C88585e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p239sv.C13785l;
import te3.xp4;
import te3.yp4;

/* renamed from: je0.x */
public class C46500x extends C117747y implements C1311n, C13785l {

    /* renamed from: d */
    public C11385n f125278d;

    /* renamed from: e */
    public final C47350c f125279e;

    /* renamed from: f */
    public String f125280f;

    /* renamed from: g */
    public String f125281g;

    /* renamed from: h */
    public String f125282h;

    public C46500x(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new xp4();
        bVar.f127067b = new yp4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/verifyopenimcontact";
        bVar.f127069d = C88585e.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f125279e = a;
        this.f125280f = str;
        this.f125281g = str2;
        xp4 xp4 = (xp4) a.f127055a.f127080a;
        xp4.f144800d = str;
        xp4.f144801e = str2;
        xp4.f144802f = (long) i;
        Log.m105925i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "tp_username: %s, verify_ticket:%s", str, str2);
    }

    /* renamed from: E0 */
    public String mo13146E0() {
        return this.f125281g;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125278d = nVar;
        return dispatch(gVar, this.f125279e, this);
    }

    public int getType() {
        return C88585e.CTRL_INDEX;
    }

    /* renamed from: i */
    public String mo13147i() {
        return this.f125280f;
    }

    /* renamed from: k0 */
    public void mo13148k0(String str) {
        this.f125282h = str;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125280f);
        C11385n nVar = this.f125278d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: u */
    public String mo13149u() {
        return this.f125282h;
    }
}
