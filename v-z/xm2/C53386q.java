package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50471mz2;
import te3.C50615nz2;
import te3.ko4;

/* renamed from: xm2.q */
public class C53386q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150217d;

    /* renamed from: e */
    public final String f150218e;

    /* renamed from: f */
    public final String f150219f;

    /* renamed from: g */
    public final int f150220g;

    public C53386q(String str, String str2, int i, int i2) {
        this.f150218e = str;
        this.f150219f = str2;
        this.f150220g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150217d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50471mz2 mz22 = new C50471mz2();
        mz22.f138293d = this.f150218e;
        mz22.f138294e = this.f150219f;
        mz22.f138295f = this.f150220g;
        bVar.f127066a = mz22;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/moduserauth";
        bVar.f127067b = new C50615nz2();
        bVar.f127069d = 1144;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return 1144;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C11385n nVar = this.f150217d;
        ko4 ko4 = ((C50615nz2) ((C47350c) uVar).f127056b.f127083a).f138863d;
        nVar.onSceneEnd(i2, ko4.f136919d, ko4.f136920e, this);
    }
}
