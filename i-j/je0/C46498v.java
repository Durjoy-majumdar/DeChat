package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49211e04;
import te3.C49358f04;

/* renamed from: je0.v */
public class C46498v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125272d;

    /* renamed from: e */
    public final C47350c f125273e;

    /* renamed from: f */
    public String f125274f;

    public C46498v(String str, String str2, String str3, int i) {
        this.f125274f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49211e04();
        bVar.f127067b = new C49358f04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendopenimverifyrequest";
        bVar.f127069d = 243;
        C47350c a = bVar.mo72403a();
        this.f125273e = a;
        C49211e04 e042 = (C49211e04) a.f127055a.f127080a;
        e042.f132612d = str;
        e042.f132613e = str2;
        e042.f132614f = str3;
        e042.f132615g = (long) i;
        Log.m105925i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "init user:%s anti:%s", str, str3);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125272d = nVar;
        return dispatch(gVar, this.f125273e, this);
    }

    public int getType() {
        return 243;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125274f);
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105921e("MicroMsg.NetSceneSendOpenIMVerifyRequest", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.f125272d.onSceneEnd(i2, i3, str, this);
    }
}
