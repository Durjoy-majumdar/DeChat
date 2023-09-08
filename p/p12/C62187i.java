package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C75592q0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C110972vi3;
import te3.C64751ui3;
import z33.C112597j;

/* renamed from: p12.i */
public class C62187i extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f176804d = null;

    /* renamed from: e */
    public C64751ui3 f176805e = null;

    /* renamed from: f */
    public C110972vi3 f176806f = null;

    /* renamed from: g */
    public C11385n f176807g = null;

    public C62187i(String str, String str2, int i, int i2, int i3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64751ui3();
        bVar.f127067b = new C110972vi3();
        bVar.f127069d = 991;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstninvite";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f176804d = bVar.mo72403a();
        long currentTimeMillis = System.currentTimeMillis();
        int e = C112597j.m153940e(MMApplicationContext.getContext());
        C64751ui3 ui32 = (C64751ui3) this.f176804d.f127055a.f127080a;
        ui32.f185742d = C75592q0.m90789s();
        ui32.f185743e = str2;
        ui32.f185747i = str;
        ui32.f185746h = i;
        ui32.f185744f = e;
        ui32.f185748j = 1;
        ui32.f185745g = currentTimeMillis;
        ui32.f185749n = i2;
        ui32.f185750o = i3;
        this.f176805e = ui32;
        Log.m105925i("MicroMsg.NetSceneIPCallInvite", "toUsername: %s, phoneNumber: %s, invitedId: %s, netType: %d, dialScene: %d, countryType: %d", str, str2, Integer.valueOf(i), Integer.valueOf(e), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f176807g = nVar;
        return dispatch(gVar, this.f176804d, this);
    }

    public int getType() {
        return 991;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallInvite", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f176806f = (C110972vi3) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 || i3 == 0) {
            C11385n nVar = this.f176807g;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f176807g;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
