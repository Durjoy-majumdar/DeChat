package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49712hj1;
import te3.C51244sh1;
import te3.C51396th1;

/* renamed from: je1.g4 */
public final class C9312g4 extends C60628i {

    /* renamed from: g */
    public C47350c f29094g;

    /* renamed from: h */
    public C11385n f29095h;

    /* renamed from: i */
    public long f29096i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9312g4(String str, String str2, String str3, String str4, long j, int i, int i2, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        str2 = (i2 & 2) != 0 ? "" : str2;
        str3 = (i2 & 4) != 0 ? "" : str3;
        str4 = (i2 & 8) != 0 ? "" : str4;
        j = (i2 & 16) != 0 ? 0 : j;
        i = (i2 & 32) != 0 ? 0 : i;
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "eventName");
        C87412m.m108594g(str3, "eventDesc");
        C87412m.m108594g(str4, "coverUrl");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderprecreateevent";
        bVar.f127069d = 4050;
        C51244sh1 sh12 = new C51244sh1();
        sh12.f141513e = str;
        sh12.f141514f = str2;
        sh12.f141515g = str3;
        sh12.f141516h = str4;
        sh12.f141512d = C46523h2.f125330a.mo71859a(4050);
        sh12.f141517i = j;
        sh12.f141518j = i;
        bVar.f127066a = sh12;
        bVar.f127067b = new C51396th1();
        Log.m105924i("Finder.LogPost.NetSceneFinderPreCreate", "post userName:" + str + " eventName:" + str2 + " eventDesc:" + str3 + " scene:" + i);
        this.f29094g = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29095h = nVar;
        return dispatch(gVar, this.f29094g, this);
    }

    public int getType() {
        return 4050;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29094g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPreCreateEventResponse");
            this.f29096i = ((C51396th1) aVar).f142218d;
        }
        C11385n nVar = this.f29095h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
