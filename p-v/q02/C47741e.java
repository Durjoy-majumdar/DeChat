package q02;

import b63.C113146l;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import ob0.C11385n;
import ob0.C47350c;
import t02.C48527c;
import te3.C51329t12;
import te3.C51479u12;
import te3.C52131yl;

/* renamed from: q02.e */
public class C47741e extends C75113f0 {

    /* renamed from: r */
    public C51479u12 f128256r;

    public C47741e(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51329t12();
        bVar.f127067b = new C51479u12();
        bVar.f127069d = Exif.PARSE_EXIF_ERROR_NO_EXIF;
        bVar.f127068c = "/cgi-bin/mmpay-bin/gethpcard";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C51329t12 t122 = (C51329t12) a.f127055a.f127080a;
        t122.f141899d = str;
        t122.f141900e = C113146l.m154806d();
        Log.m105925i("MicroMsg.NetSceneGetHoneyPayCard", "card no: %s", str);
    }

    public int getType() {
        return Exif.PARSE_EXIF_ERROR_NO_EXIF;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51479u12 u122 = (C51479u12) ((C47350c) uVar).f127056b.f127083a;
        this.f128256r = u122;
        Log.m105925i("MicroMsg.NetSceneGetHoneyPayCard", "retcode: %s, retmsg: %s", Integer.valueOf(u122.f142545d), this.f128256r.f142546e);
        C52131yl ylVar = this.f128256r.f142548g;
        if (ylVar != null) {
            C48527c.m53915k(ylVar.f145352f, ylVar.f145350d, ylVar.f145351e, (String) null);
        }
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C51479u12 u122 = (C51479u12) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = u122.f142545d;
        this.f221038h = u122.f142546e;
    }
}
