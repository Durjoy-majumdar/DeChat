package wi2;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.aj4;
import te3.zi4;

/* renamed from: wi2.b */
public class C53179b extends C53178a {

    /* renamed from: t */
    public aj4 f148362t;

    /* renamed from: u */
    public int f148363u;

    public C53179b(int i, String str, String str2, String str3, String str4, String str5) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new zi4();
        bVar.f127067b = new aj4();
        bVar.f127069d = 2694;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonecheckname";
        C47350c a = bVar.mo72403a();
        this.f148360r = a;
        zi4 zi4 = (zi4) a.f127055a.f127080a;
        zi4.f145984d = i;
        zi4.f145985e = str;
        zi4.f145986f = str2;
        zi4.f145987g = str3;
        zi4.f145988h = str4;
        zi4.f145989i = str5;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "do scene NetSceneMobileRemitCheckName reason:%s rcvrOpenid:%s rcvrToken:%s inputName:%s getRcvrExt:%s", Integer.valueOf(i), str, str2, str3, str4);
        this.f148363u = i;
    }

    public int getType() {
        return 2694;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        aj4 aj4 = (aj4) ((C47350c) uVar).f127056b.f127083a;
        this.f148362t = aj4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", Integer.valueOf(aj4.f130567d), this.f148362t.f130568e);
        C11385n nVar = this.f148361s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        aj4 aj4 = (aj4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = aj4.f130567d;
        this.f221038h = aj4.f130568e;
    }
}
