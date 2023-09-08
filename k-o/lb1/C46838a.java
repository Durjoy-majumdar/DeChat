package lb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49635h02;
import te3.C49779i02;

/* renamed from: lb1.a */
public class C46838a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125986d;

    /* renamed from: e */
    public C47350c f125987e;

    /* renamed from: f */
    public C49779i02 f125988f;

    public C46838a(int i, String str, String str2) {
        this(i, str, str2, 1, new byte[1]);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125986d = nVar;
        return dispatch(gVar, this.f125987e, this);
    }

    public int getType() {
        return 2696;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetFaceCheckAction", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f125988f = (C49779i02) ((C47350c) uVar).f127056b.f127083a;
        this.f125986d.onSceneEnd(i2, i3, str, this);
    }

    public C46838a(int i, String str, String str2, int i2, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49635h02();
        bVar.f127067b = new C49779i02();
        bVar.f127069d = 2696;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getfacecheckaction";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125987e = a;
        C49635h02 h022 = (C49635h02) a.f127055a.f127080a;
        h022.f134385d = i;
        h022.f134386e = str;
        h022.f134387f = str2;
        h022.f134388g = i2;
        h022.f134389h = C89349b.m111674a(bArr);
        Log.m105925i("MicroMsg.NetSceneGetFaceCheckAction", "create GetFaceCheckAction, scene: %s, packageName: %s, packageSign: %s", Integer.valueOf(i), str, str2);
    }
}
