package lb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50475n02;
import te3.C50618o02;

/* renamed from: lb1.d */
public class C10482d extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f31722d;

    /* renamed from: e */
    public C50618o02 f31723e;

    /* renamed from: f */
    public C11385n f31724f;

    public C10482d(int i, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50475n02();
        bVar.f127067b = new C50618o02();
        bVar.f127069d = 1108;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getfacecontractstatus";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f31722d = a;
        C50475n02 n022 = (C50475n02) a.f127055a.f127080a;
        n022.f138314d = i;
        n022.f138315e = str;
        n022.f138316f = str2;
        Log.m105925i("MicroMsg.FaceAgreementUICGI", "[cgi-request]NetSceneGetFaceContract scene:%s,userInfo:%s,sign:%s", Integer.valueOf(i), str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f31724f = nVar;
        return dispatch(gVar, this.f31722d, this);
    }

    public int getType() {
        return 1108;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.FaceAgreementUICGI", "[cgi-ret]onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f31723e = (C50618o02) ((C47350c) uVar).f127056b.f127083a;
        this.f31724f.onSceneEnd(i2, i3, str, this);
    }
}
