package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49884iq3;
import te3.C50024jq3;

/* renamed from: eb1.o */
public class C45641o extends C117747y implements C1311n, C116765c {

    /* renamed from: d */
    public C11385n f123425d;

    /* renamed from: e */
    public C47350c f123426e;

    /* renamed from: f */
    public String f123427f = null;

    public C45641o(long j, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49884iq3();
        bVar.f127067b = new C50024jq3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/registerface";
        bVar.f127069d = 918;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123426e = a;
        C49884iq3 iq32 = (C49884iq3) a.f127055a.f127080a;
        iq32.f135590d = j;
        iq32.f135591e = str;
        iq32.f135592f = str2;
    }

    /* renamed from: F */
    public String mo71155F() {
        return this.f123427f;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123425d = nVar;
        return dispatch(gVar, this.f123426e, this);
    }

    public int getType() {
        return 918;
    }

    /* renamed from: o0 */
    public boolean mo71156o0() {
        return true;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C50024jq3 jq32 = (C50024jq3) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            i3 = jq32.f136260f;
            boolean z = i3 == 0;
            this.f123427f = jq32.f136258d;
            Log.m105925i("MicroMsg.NetSceneFaceRegFace", "hy: is Verified: %b", Boolean.valueOf(z));
        } else if (!(jq32 == null || jq32.f136260f == 0)) {
            Log.m105924i("MicroMsg.NetSceneFaceRegFace", "hy: has detail ret. use");
            i3 = jq32.f136260f;
        }
        C11385n nVar = this.f123425d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
