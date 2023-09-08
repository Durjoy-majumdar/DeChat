package w53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48695ac3;
import te3.C52243zb3;

/* renamed from: w53.a */
public class C53081a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f148148d;

    /* renamed from: e */
    public C47350c f148149e;

    public C53081a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52243zb3();
        bVar.f127067b = new C48695ac3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payibgcheckjsapisign";
        bVar.f127069d = 1767;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f148149e = a;
        C52243zb3 zb32 = (C52243zb3) a.f127055a.f127080a;
        zb32.f145788d = str;
        zb32.f145791g = str4;
        zb32.f145789e = str2;
        zb32.f145792h = str5;
        zb32.f145793i = str6;
        zb32.f145790f = str3;
        zb32.f145794j = str7;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148148d = nVar;
        return dispatch(gVar, this.f148149e, this);
    }

    public int getType() {
        return 1767;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIbgCheckJsapi", "check jsapi: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C48695ac3 ac32 = (C48695ac3) ((C47350c) uVar).f127056b.f127083a;
        if (i3 == 0 && i2 == 0) {
            i3 = ac32.f130431d;
            str = ac32.f130432e;
        }
        this.f148148d.onSceneEnd(i2, i3, str, this);
    }
}
