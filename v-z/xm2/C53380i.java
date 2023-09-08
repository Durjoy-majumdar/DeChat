package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50208l30;
import te3.C50346m30;
import te3.ko4;

/* renamed from: xm2.i */
public class C53380i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150199d;

    /* renamed from: e */
    public final String f150200e;

    /* renamed from: f */
    public final int f150201f;

    /* renamed from: g */
    public boolean f150202g;

    public C53380i(String str, int i) {
        this.f150200e = str;
        this.f150201f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150199d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50208l30 l302 = new C50208l30();
        l302.f137142d = this.f150200e;
        l302.f137143e = this.f150201f;
        l302.f137144f = this.f150202g;
        bVar.f127066a = l302;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/deluserauth";
        bVar.f127067b = new C50346m30();
        bVar.f127069d = 1127;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return 1127;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        ko4 ko4 = ((C50346m30) ((C47350c) uVar).f127056b.f127083a).f137799d;
        if (ko4 != null) {
            i3 = ko4.f136919d;
            str = ko4.f136920e;
        }
        C11385n nVar = this.f150199d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
