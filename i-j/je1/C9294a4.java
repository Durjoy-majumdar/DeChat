package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import gy3.C8480h;
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
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50398mg1;
import te3.C50538ng1;
import wp1.C15585f;
import zc1.C66785b;

/* renamed from: je1.a4 */
public final class C9294a4 extends C9255j {

    /* renamed from: g */
    public final String f29061g;

    /* renamed from: h */
    public final long f29062h;

    /* renamed from: i */
    public final int f29063i;

    /* renamed from: j */
    public final String f29064j = "Finder.NetSceneFinderOriginalUserFeeds";

    /* renamed from: n */
    public C47350c f29065n;

    /* renamed from: o */
    public C11385n f29066o;

    /* renamed from: p */
    public List<? extends FinderItem> f29067p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9294a4(String str, long j, String str2, C89349b bVar, int i) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "refObjectNonceId");
        this.f29061g = str;
        this.f29062h = j;
        this.f29063i = i;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3581;
        C50398mg1 mg12 = new C50398mg1();
        mg12.f138015d = str;
        mg12.f138016e = j;
        mg12.f138019h = str2;
        mg12.f138017f = C66785b.f191882e.mo90662O5();
        mg12.f138018g = bVar;
        mg12.f138020i = C46523h2.f125330a.mo71859a(3581);
        bVar2.f127066a = mg12;
        bVar2.f127069d = 3581;
        bVar2.f127067b = new C50538ng1();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderoriginaluserfeeds";
        this.f29065n = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderOriginalUserFeeds", "NetSceneFinderOriginalUserFeeds " + j);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29066o = nVar;
        return dispatch(gVar, this.f29065n, this);
    }

    public int getType() {
        return 3581;
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        C47465a aVar = this.f29065n.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOriginalUserFeedsResponse");
        LinkedList<FinderObject> linkedList = ((C50538ng1) aVar).f138591d;
        C87412m.m108593f(linkedList, "getResp().`object`");
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
        C47465a aVar = this.f29065n.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOriginalUserFeedsRequest");
        C49842ig0 ig02 = ((C50398mg1) aVar).f138020i;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f29064j;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29065n.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOriginalUserFeedsResponse");
            LinkedList<FinderObject> linkedList = ((C50538ng1) aVar).f138591d;
            C87412m.m108591d(linkedList);
            String str3 = this.f29064j;
            Log.m105924i(str3, "onGYNetEnd list:" + linkedList.size());
            boolean z = this.f29063i != 2;
            C15585f.C15586a aVar2 = C15585f.f42211a;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                if (C58784w3.f168295a.mo83866E0((FinderObject) next)) {
                    arrayList.add(next);
                }
            }
            List<FinderItem> f = aVar2.mo14343f(arrayList, 2, (C49712hj1) null);
            this.f29067p = f;
            if (z) {
                C15585f.C15586a aVar3 = C15585f.f42211a;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(f, 10));
                for (FinderItem k : f) {
                    arrayList2.add(C15585f.f42211a.mo14348k(k));
                }
                aVar3.mo14346i(arrayList2, 2, this.f29061g, z);
            }
        }
        C11385n nVar = this.f29066o;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
