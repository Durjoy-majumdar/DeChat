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
import te3.C49381f51;
import te3.C49516g51;
import te3.C49521g61;
import te3.C49712hj1;
import wg1.C15320l4;

/* renamed from: je1.w4 */
public final class C9386w4 extends C60628i {

    /* renamed from: g */
    public C47350c f29320g;

    /* renamed from: h */
    public C11385n f29321h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9386w4(String str, String str2) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "anchorUserName");
        C87412m.m108594g(str2, "noticeId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivenoticeqrcode";
        bVar.f127069d = 4214;
        C49381f51 f512 = new C49381f51();
        f512.f133298e = str;
        f512.f133299f = str2;
        C15320l4 l4Var = C15320l4.f41639a;
        f512.f133300g = C15320l4.f41640b;
        f512.f133297d = C46523h2.f125330a.mo71859a(4214);
        C49516g51 g512 = new C49516g51();
        bVar.f127066a = f512;
        bVar.f127067b = g512;
        this.f29320g = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneGetLiveNoticeQrCode", "NetSceneGetLiveNoticeQrCode init userName:" + str + ", noticeId:" + str2 + ' ');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29321h = nVar;
        C47350c cVar = this.f29320g;
        if (cVar != null) {
            return dispatch(gVar, cVar, this);
        }
        C87412m.m108603p("rr");
        throw null;
    }

    public int getType() {
        return 4214;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneGetLiveNoticeQrCode", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C49521g61 g612 = mo10114l1().f133863j;
        if (g612 != null) {
            C15320l4.f41639a.mo14172c(g612.f133890f, g612.f133889e, g612.f133888d);
        }
        C11385n nVar = this.f29321h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public final C49516g51 mo10114l1() {
        C47350c cVar = this.f29320g;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveNoticeQRCodeResponse");
            return (C49516g51) aVar;
        }
        C87412m.m108603p("rr");
        throw null;
    }
}
