package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8801r5;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C48722aj0;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C49801i51;
import te3.C49842ig0;
import te3.C51066r7;
import te3.C52268zi0;

/* renamed from: je1.p2 */
public final class C9363p2 extends C60628i implements C8801r5 {

    /* renamed from: g */
    public C47350c f29238g;

    /* renamed from: h */
    public C11385n f29239h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9363p2(String str, C49098d51 d512, int i, C49712hj1 hj12, LinkedList<C51066r7> linkedList, C49801i51 i512, String str2, int i2, C8480h hVar) {
        super(hj12);
        linkedList = (i2 & 16) != 0 ? null : linkedList;
        i512 = (i2 & 32) != 0 ? null : i512;
        str2 = (i2 & 64) != 0 ? null : str2;
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(d512, "noticeInfo");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercreatelivenotice";
        bVar.f127069d = 6653;
        C52268zi0 zi02 = new C52268zi0();
        zi02.f145971e = str;
        zi02.f145972f = d512;
        zi02.f145973g = i;
        zi02.f145977n = str2;
        if (linkedList != null) {
            zi02.f145975i = linkedList;
        }
        if (i512 != null) {
            zi02.f145976j = i512;
        }
        C49842ig0 b = C46523h2.f125330a.mo71860b(6653, hj12);
        zi02.f145970d = b;
        b.f135313e = hj12 != null ? hj12.f134677n : 0;
        C48722aj0 aj02 = new C48722aj0();
        bVar.f127066a = zi02;
        bVar.f127067b = aj02;
        this.f29238g = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneCreateLiveNotice", "NetSceneCreateLiveNotice init userName:" + str + ", startTime:" + d512.f132118d + " ,opType:" + i + ' ');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29239h = nVar;
        C47350c cVar = this.f29238g;
        if (cVar != null) {
            return dispatch(gVar, cVar, this);
        }
        C87412m.m108603p("rr");
        throw null;
    }

    public C48722aj0 getResponse() {
        C47350c cVar = this.f29238g;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCreateLiveNoticeResponse");
            return (C48722aj0) aVar;
        }
        C87412m.m108603p("rr");
        throw null;
    }

    public int getType() {
        return 6653;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneCreateLiveNotice", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f29239h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
