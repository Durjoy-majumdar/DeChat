package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49892is3;
import te3.C50032js3;

/* renamed from: hz0.h0 */
public class C46152h0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124389d;

    /* renamed from: e */
    public C11385n f124390e;

    public C46152h0(String str, byte[] bArr, float f, float f2, float f3, boolean z, boolean z2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49892is3();
        bVar.f127067b = new C50032js3();
        bVar.f127068c = "/cgi-bin/card/reportlotionorbluetoothinfo";
        bVar.f127069d = 2574;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124389d = a;
        C49892is3 is32 = (C49892is3) a.f127055a.f127080a;
        is32.f135647h = str;
        is32.f135646g = C89349b.m111674a(bArr);
        is32.f135643d = f;
        is32.f135644e = f2;
        is32.f135645f = f3;
        is32.f135648i = z;
        is32.f135649j = z2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124390e = nVar;
        return dispatch(gVar, this.f124389d, this);
    }

    public int getType() {
        return 2574;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneReportLotionOrBluetoothInfo", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        this.f124390e.onSceneEnd(i2, i3, str, this);
    }
}
