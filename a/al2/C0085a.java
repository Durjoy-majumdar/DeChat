package al2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51540ug;
import te3.C51690vg;

/* renamed from: al2.a */
public class C0085a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f517d;

    /* renamed from: e */
    public String f518e;

    /* renamed from: f */
    public C11385n f519f;

    public C0085a(int i, int i2, String str, byte[] bArr, int i3) {
        this.f518e = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2693;
        C51540ug ugVar = new C51540ug();
        ugVar.f142841d = new C89349b(bArr, 0, bArr.length);
        ugVar.f142844g = str;
        ugVar.f142843f = i;
        ugVar.f142842e = i2;
        ugVar.f142845h = i3;
        bVar.f127066a = ugVar;
        bVar.f127068c = "/cgi-bin/mmpay-bin/ocrgetbankcardinfo";
        bVar.f127067b = new C51690vg();
        this.f517d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f519f = nVar;
        return dispatch(gVar, this.f517d, this);
    }

    public int getType() {
        return 2693;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f519f.onSceneEnd(i2, i3, str, this);
    }
}
