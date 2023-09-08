package rb3;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49601gr3;
import te3.C49744hr3;

/* renamed from: rb3.i */
public class C48015i extends C75123k0 {

    /* renamed from: d */
    public C11385n f128797d;

    /* renamed from: e */
    public C47350c f128798e;

    public C48015i(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49601gr3();
        bVar.f127067b = new C49744hr3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/removevirtualbankcard";
        bVar.f127069d = 600;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128798e = a;
        C49601gr3 gr32 = (C49601gr3) a.f127055a.f127080a;
        gr32.f134214e = str;
        gr32.f134213d = Util.getInt(str2, 0);
        gr32.f134215f = C113146l.m154805c();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128797d = nVar;
        return dispatch(gVar, this.f128798e, this);
    }

    public int getType() {
        return 600;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetSceneRemoveVirtualBankCard", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C49744hr3 hr32 = (C49744hr3) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f128797d.onSceneEnd(i2, i3, str, this);
    }
}
