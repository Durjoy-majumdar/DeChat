package zg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p1070zf.C91675a;
import te3.C48663a40;
import te3.C48806b40;

/* renamed from: zg0.c */
public class C53780c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150944d;

    /* renamed from: e */
    public C47350c f150945e;

    public C53780c(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48663a40();
        bVar.f127067b = new C48806b40();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
        bVar.f127069d = C91675a.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f150945e = a;
        C48663a40 a402 = (C48663a40) a.f127055a.f127080a;
        a402.f130301e = "invoice_info";
        a402.f130302f = i;
        a402.f130303g = 2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150944d = nVar;
        return dispatch(gVar, this.f150945e, this);
    }

    public int getType() {
        return C91675a.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneDeleteUserAutoFillInfo", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneDeleteUserAutoFillInfo", "");
        }
        this.f150944d.onSceneEnd(i2, i3, str, this);
    }
}
