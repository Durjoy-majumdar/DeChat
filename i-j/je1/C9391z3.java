package je1;

import bd1.C39759i;
import bd1.C54447c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C49988jg1;
import te3.C50952qf0;
import te3.C51099rf0;
import zc1.C66785b;

/* renamed from: je1.z3 */
public final class C9391z3 extends C60628i {

    /* renamed from: g */
    public final boolean f29324g;

    /* renamed from: h */
    public C47350c f29325h;

    /* renamed from: i */
    public C11385n f29326i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9391z3(String str, boolean z, boolean z2, int i, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        z2 = (i & 4) != 0 ? false : z2;
        C87412m.m108594g(str, "username");
        int i2 = 1;
        this.f29324g = z2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3785;
        C50952qf0 qf02 = new C50952qf0();
        qf02.f140280d = str;
        qf02.f140282f = C46523h2.f125330a.mo71859a(3785);
        if (z2) {
            i2 = 3;
        } else if (!z) {
            i2 = 2;
        }
        qf02.f140281e = i2;
        bVar.f127066a = qf02;
        C51099rf0 rf02 = new C51099rf0();
        rf02.setBaseResponse(new C49966ja());
        bVar.f127067b = rf02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderapplyoriginal";
        this.f29325h = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderOriginal", "NetSceneFinderOriginal init " + z);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29326i = nVar;
        return dispatch(gVar, this.f29325h, this);
    }

    public int getType() {
        return 3785;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        FinderContact finderContact;
        Log.m105924i("Finder.NetSceneFinderOriginal", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29325h.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderApplyOriginalResponse");
            C51099rf0 rf02 = (C51099rf0) aVar;
            if (!this.f29324g && (finderContact = rf02.f140875d) != null) {
                String str2 = finderContact.username;
                C66785b bVar = C66785b.f191882e;
                if (Util.isEqual(str2, bVar.mo90662O5())) {
                    String str3 = finderContact.username;
                    if (str3 == null) {
                        str3 = "";
                    }
                    C54447c cVar = new C54447c(str3);
                    cVar.field_originalFlag = finderContact.originalFlag;
                    cVar.field_originalEntranceFlag = finderContact.originalEntranceFlag;
                    C49988jg1 jg12 = finderContact.originalInfo;
                    if (jg12 != null) {
                        cVar.field_originalInfo = jg12;
                    }
                    bVar.mo90672m1(cVar, C39759i.FINDER_ORIGINAL);
                }
            }
        }
        C11385n nVar = this.f29326i;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
