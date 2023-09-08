package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C36907w;
import te3.C48700ae1;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C52248zd1;
import wp1.C15585f;
import zc1.C66785b;

/* renamed from: je1.x3 */
public final class C46549x3 extends C9255j {

    /* renamed from: g */
    public final String f125431g;

    /* renamed from: h */
    public C11385n f125432h;

    /* renamed from: i */
    public C47350c f125433i;

    /* renamed from: j */
    public int f125434j;

    /* renamed from: n */
    public List<? extends FinderItem> f125435n;

    public C46549x3(int i, String str, String str2, C89349b bVar, int i2, C49712hj1 hj12) {
        super(hj12);
        this.f125431g = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C52248zd1 zd12 = new C52248zd1();
        bVar2.f127066a = zd12;
        zd12.f145834d = str;
        zd12.f145836f = str2 == null ? C66785b.f191882e.mo90662O5() : str2;
        zd12.f145838h = i;
        zd12.f145837g = bVar;
        this.f125434j = i2;
        zd12.f145835e = C46523h2.f125330a.mo71860b(5999, hj12);
        bVar2.f127067b = new C48700ae1();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findermusicuserpage";
        bVar2.f127069d = 5999;
        this.f125433i = bVar2.mo72403a();
        Log.m105924i("Finder.CgiFinderModMentioned", "NetSceneFinderMVUserPage init finderUserName " + str + " finderSelfUserName: " + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125432h = nVar;
        return dispatch(gVar, this.f125433i, this);
    }

    public int getType() {
        return 5999;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        Log.m105924i("Finder.CgiFinderModMentioned", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125433i.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicUserPageResponse");
            C15585f.C15586a aVar2 = C15585f.f42211a;
            LinkedList<FinderObject> linkedList = ((C48700ae1) aVar).f130466d;
            C87412m.m108593f(linkedList, "resp.`object`");
            this.f125435n = aVar2.mo14343f(linkedList, 196608, this.f172736d);
        }
        C11385n nVar = this.f125432h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        C47465a aVar = this.f125433i.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicUserPageResponse");
        LinkedList<FinderObject> linkedList = ((C48700ae1) aVar).f130466d;
        C87412m.m108593f(linkedList, "commReqResp.responseProt…serPageResponse).`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            FinderItem.C56324a aVar2 = FinderItem.Companion;
            C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
            arrayList.add(aVar2.mo79056a(finderObject, 0));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f125433i.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicUserPageRequest");
        C49842ig0 ig02 = ((C52248zd1) aVar).f145835e;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
