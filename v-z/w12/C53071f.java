package w12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49305em2;
import te3.C50010jm2;
import te3.C50150km2;

/* renamed from: w12.f */
public class C53071f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f148131d;

    /* renamed from: e */
    public final C47350c f148132e;

    public C53071f(String str, String str2, boolean z, int i, C49305em2 em22) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50010jm2 jm22 = new C50010jm2();
        C50150km2 km22 = new C50150km2();
        bVar.f127066a = jm22;
        bVar.f127067b = km22;
        bVar.f127068c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
        bVar.f127069d = 972;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        jm22.f136197d = str;
        jm22.f136198e = str2;
        jm22.f136200g = z;
        jm22.f136201h = i;
        jm22.f136202i = em22;
        this.f148132e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148131d = nVar;
        return dispatch(gVar, this.f148132e, this);
    }

    public int getType() {
        return 972;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f148131d.onSceneEnd(i2, i3, str, this);
    }
}
