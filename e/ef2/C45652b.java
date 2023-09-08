package ef2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51018qv3;
import te3.C51679vc2;
import te3.C51814wc2;

/* renamed from: ef2.b */
public class C45652b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123446d;

    /* renamed from: e */
    public final C47350c f123447e;

    /* renamed from: f */
    public String f123448f;

    public C45652b(String str, String str2) {
        this.f123448f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51679vc2();
        bVar.f127067b = new C51814wc2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getwburl";
        bVar.f127069d = 205;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123447e = a;
        C51679vc2 vc22 = (C51679vc2) a.f127055a.f127080a;
        vc22.f143428e = str2;
        String nullAsNil = Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(46, (Object) null));
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.decodeHexString(nullAsNil));
        vc22.f143427d = qv32;
        String nullAsNil2 = Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(72, (Object) null));
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(Util.decodeHexString(nullAsNil2));
        vc22.f143431h = qv33;
        Log.m105918d("MicroMsg.NetSceneGetWeiboURL", "dkwt get weibo url with id=" + str + ", a2=" + nullAsNil + " , newa2:" + nullAsNil2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123446d = nVar;
        return dispatch(gVar, this.f123447e, this);
    }

    public int getType() {
        return 205;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetWeiboURL", "dkwt onGYNetEnd:[%d,%d] get weibo url result:[%s] ", Integer.valueOf(i2), Integer.valueOf(i3), ((C51814wc2) this.f123447e.f127056b.f127083a).f143962d);
        this.f123446d.onSceneEnd(i2, i3, str, this);
    }
}
