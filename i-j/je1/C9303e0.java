package je1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9251d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49872in0;
import te3.C49966ja;
import te3.C50012jn0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.e0 */
public final class C9303e0 extends C9251d<C50012jn0> {
    public C9303e0(C89349b bVar, C49712hj1 hj12) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C49872in0 in02 = new C49872in0();
        in02.f135515d = C46523h2.f125330a.mo71859a(11452);
        in02.f135516e = C66785b.f191882e.mo90662O5();
        in02.f135517f = bVar;
        C50012jn0 jn02 = new C50012jn0();
        jn02.setBaseResponse(new C49966ja());
        jn02.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = in02;
        bVar2.f127067b = jn02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetglobalfavlist";
        bVar2.f127069d = 11452;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderGetCollectionList", "init, lastBuffer:" + bVar);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50012jn0 jn02 = (C50012jn0) eu32;
        C87412m.m108594g(jn02, "resp");
        super.mo332r(i, i2, str, jn02, yVar);
        Log.m105924i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C50012jn0 jn02 = (C50012jn0) eu32;
        C87412m.m108594g(jn02, "resp");
        LinkedList<FinderObject> linkedList = jn02.f136205d;
        C87412m.m108593f(linkedList, "resp.`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            FinderItem.C56324a aVar = FinderItem.Companion;
            C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
            arrayList.add(aVar.mo79056a(finderObject, 0));
        }
        return arrayList;
    }

    /* renamed from: t */
    public long mo10028t() {
        C47465a aVar = this.f256789f.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetGlobalFavListRequest");
        C49842ig0 ig02 = ((C49872in0) aVar).f135515d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
