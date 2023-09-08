package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import kk0.C88185j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49194dv1;
import te3.C90405cv1;

/* renamed from: hz0.i0 */
public class C87605i0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f253719d;

    /* renamed from: e */
    public C11385n f253720e;

    /* renamed from: f */
    public String f253721f;

    /* renamed from: g */
    public C89349b f253722g;

    /* renamed from: h */
    public boolean f253723h;

    public C87605i0(String str, int i, String str2, String str3, int i2, String str4, String str5, String str6, C89349b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C90405cv1();
        bVar2.f127067b = new C49194dv1();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/getavailablecard";
        bVar2.f127069d = C88185j.CTRL_INDEX;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C47350c a = bVar2.mo72403a();
        this.f253719d = a;
        C90405cv1 cv12 = (C90405cv1) a.f127055a.f127080a;
        cv12.f259444d = str;
        cv12.f259445e = i;
        cv12.f259446f = str2;
        cv12.f259447g = str3;
        cv12.f259448h = i2;
        cv12.f259449i = str4;
        cv12.f259450j = str5;
        cv12.f259451n = str6;
        cv12.f259452o = bVar;
        if ("INVOICE".equalsIgnoreCase(str6)) {
            cv12.f259453p = 1;
        } else {
            cv12.f259453p = 0;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f253720e = nVar;
        return dispatch(gVar, this.f253719d, this);
    }

    public int getType() {
        return C88185j.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetsceneGetAvailableCard", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C49194dv1 dv12 = (C49194dv1) this.f253719d.f127056b.f127083a;
            this.f253721f = dv12.f132543d;
            this.f253722g = dv12.f132545f;
            this.f253723h = dv12.f132544e != 0;
        }
        this.f253720e.onSceneEnd(i2, i3, str, this);
    }
}
