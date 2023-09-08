package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48676a73;
import te3.C48959c52;
import te3.C49099d52;

/* renamed from: je0.n */
public class C33544n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f90814d;

    /* renamed from: e */
    public final C47350c f90815e;

    /* renamed from: f */
    public String f90816f;

    /* renamed from: g */
    public String f90817g;

    /* renamed from: h */
    public C48676a73 f90818h;

    public C33544n(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48959c52();
        bVar.f127067b = new C49099d52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenimcontact";
        bVar.f127069d = 881;
        C47350c a = bVar.mo72403a();
        this.f90815e = a;
        this.f90816f = str;
        String nullAs = Util.nullAs(str2, "");
        this.f90817g = nullAs;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMContact", "get openim username: %s, roomname: %s, ticket:%s", str, nullAs, str3);
        C48959c52 c522 = (C48959c52) a.f127055a.f127080a;
        c522.f131526d = str;
        c522.f131527e = this.f90817g;
        c522.f131528f = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90814d = nVar;
        return dispatch(gVar, this.f90815e, this);
    }

    public int getType() {
        return 881;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f90816f);
        if (i2 == 0 && i3 == 0) {
            C49099d52 d522 = (C49099d52) this.f90815e.f127056b.f127083a;
            this.f90818h = d522.f132133e;
            C46502z.m51788b(d522);
            this.f90814d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f90814d.onSceneEnd(i2, i3, str, this);
    }
}
