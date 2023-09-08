package je0;

import bp3.C79758p;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p239sv.C48464g;
import pe3.C89349b;
import sj0.C90202a;
import te3.C50908q3;
import te3.C51053r3;
import wf3.C111798a;

/* renamed from: je0.e */
public class C46472e extends C117747y implements C1311n, C48464g {

    /* renamed from: d */
    public C11385n f125200d;

    /* renamed from: e */
    public final C47350c f125201e;

    /* renamed from: f */
    public String f125202f;

    public C46472e(String str, String str2, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50908q3();
        bVar.f127067b = new C51053r3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addopenimcontact";
        bVar.f127069d = C90202a.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f125201e = a;
        this.f125202f = str;
        C50908q3 q3Var = (C50908q3) a.f127055a.f127080a;
        q3Var.f140112d = str;
        q3Var.f140113e = str2;
        if (bArr != null && bArr.length > 0) {
            q3Var.f140115g = C89349b.m111674a(bArr);
        }
        Log.m105925i("MicroMsg.Openim.NetSceneAddOpenIMContact", "tp_username: %s, antispam_ticket:%s spamContext:%s", str, str2, bArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125200d = nVar;
        return dispatch(gVar, this.f125201e, this);
    }

    public int getType() {
        return C90202a.CTRL_INDEX;
    }

    /* renamed from: i */
    public String mo71849i() {
        return this.f125202f;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int intValue = ((Integer) C79758p.f233760a.mo109880c(new C111798a())).intValue();
        if (intValue == 1) {
            i3 = -1;
        }
        Log.m105925i("MicroMsg.Openim.NetSceneAddOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s rValue:%s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125202f, Integer.valueOf(intValue));
        C11385n nVar = this.f125200d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
