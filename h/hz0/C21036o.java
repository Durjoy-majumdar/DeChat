package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C22510m0;
import te3.C50472n0;
import te3.xa4;

/* renamed from: hz0.o */
public class C21036o extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f59518d;

    /* renamed from: e */
    public C11385n f59519e;

    /* renamed from: f */
    public String f59520f;

    /* renamed from: g */
    public int f59521g;

    /* renamed from: h */
    public String f59522h;

    public C21036o(String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, xa4 xa4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C22510m0();
        bVar.f127067b = new C50472n0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/acceptcarditem";
        bVar.f127069d = 1037;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f59518d = a;
        C22510m0 m0Var = (C22510m0) a.f127055a.f127080a;
        m0Var.f64191f = str;
        m0Var.f64189d = str2;
        m0Var.f64190e = i;
        m0Var.f64192g = str3;
        m0Var.f64194i = str4;
        m0Var.f64193h = str5;
        m0Var.f64195j = i2;
        m0Var.f64196n = i3;
        m0Var.f64197o = xa4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f59519e = nVar;
        return dispatch(gVar, this.f59518d, this);
    }

    public int getType() {
        return 1037;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneAcceptCardItem", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C50472n0 n0Var = (C50472n0) this.f59518d.f127056b.f127083a;
            if (n0Var != null) {
                this.f59520f = n0Var.f138299d;
                this.f59521g = n0Var.f138300e;
                this.f59522h = n0Var.f138301f;
            }
        } else {
            C50472n0 n0Var2 = (C50472n0) this.f59518d.f127056b.f127083a;
            if (n0Var2 != null) {
                this.f59520f = n0Var2.f138299d;
                this.f59521g = n0Var2.f138300e;
                this.f59522h = n0Var2.f138301f;
            }
        }
        this.f59519e.onSceneEnd(i2, i3, str, this);
    }
}
