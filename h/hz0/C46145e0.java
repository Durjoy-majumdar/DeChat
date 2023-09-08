package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50813pd2;
import te3.C50947qd2;

/* renamed from: hz0.e0 */
public class C46145e0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124355d;

    /* renamed from: e */
    public C11385n f124356e;

    /* renamed from: f */
    public String f124357f;

    /* renamed from: g */
    public String f124358g;

    /* renamed from: h */
    public int f124359h;

    public C46145e0(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50813pd2();
        bVar.f127067b = new C50947qd2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/giftcarditem";
        bVar.f127069d = 1045;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124355d = a;
        C50813pd2 pd22 = (C50813pd2) a.f127055a.f127080a;
        pd22.f139705d = str;
        pd22.f139706e = str2;
        pd22.f139707f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124356e = nVar;
        return dispatch(gVar, this.f124355d, this);
    }

    public int getType() {
        return 1045;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGiftCardItem", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C50947qd2 qd22 = (C50947qd2) this.f124355d.f127056b.f127083a;
            if (qd22 != null) {
                this.f124357f = qd22.f140248d;
                this.f124358g = qd22.f140250f;
                this.f124359h = qd22.f140249e;
            }
        } else {
            C50947qd2 qd23 = (C50947qd2) this.f124355d.f127056b.f127083a;
            if (qd23 != null) {
                this.f124357f = qd23.f140248d;
                this.f124358g = qd23.f140250f;
                this.f124359h = qd23.f140249e;
            }
        }
        this.f124356e.onSceneEnd(i2, i3, str, this);
    }
}
