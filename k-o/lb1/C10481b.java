package lb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49925j02;
import te3.C50061k02;

/* renamed from: lb1.b */
public class C10481b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f31719d;

    /* renamed from: e */
    public C47350c f31720e;

    /* renamed from: f */
    public C50061k02 f31721f;

    public C10481b(int i, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49925j02();
        bVar.f127067b = new C50061k02();
        bVar.f127069d = 5965;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getfacechecklivetype";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f31720e = a;
        C49925j02 j022 = (C49925j02) a.f127055a.f127080a;
        j022.f135796d = i;
        j022.f135797e = str;
        j022.f135798f = str2;
        Log.m105925i("MicroMsg.NetSceneGetFaceCheckLiveType", "NetSceneGetFaceCheckLiveType: %s, packageName: %s, packageSign: %s", Integer.valueOf(i), str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f31719d = nVar;
        return dispatch(gVar, this.f31720e, this);
    }

    public int getType() {
        return 5965;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetFaceCheckLiveType", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f31721f = (C50061k02) ((C47350c) uVar).f127056b.f127083a;
        this.f31719d.onSceneEnd(i2, i3, str, this);
    }
}
