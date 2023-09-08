package wa1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51670va2;
import te3.C51807wa2;

/* renamed from: wa1.a */
public final class C53141a extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f148265d;

    /* renamed from: e */
    public final String f148266e;

    /* renamed from: f */
    public final String f148267f;

    /* renamed from: g */
    public final C11385n f148268g;

    /* renamed from: h */
    public C11385n f148269h;

    /* renamed from: i */
    public C51807wa2 f148270i;

    public C53141a(String str, String str2, String str3, C11385n nVar) {
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(str2, "packageName");
        C87412m.m108594g(str3, "signature");
        this.f148265d = str;
        this.f148266e = str2;
        this.f148267f = str3;
        this.f148268g = nVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148269h = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51670va2 va22 = new C51670va2();
        va22.f143411d = this.f148265d;
        va22.f143412e = this.f148266e;
        va22.f143413f = this.f148267f;
        bVar.f127066a = va22;
        C51807wa2 wa22 = new C51807wa2();
        this.f148270i = wa22;
        bVar.f127067b = wa22;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/getuserauth";
        bVar.f127069d = 2711;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return 2711;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C11385n nVar = this.f148268g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C11385n nVar2 = this.f148269h;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
