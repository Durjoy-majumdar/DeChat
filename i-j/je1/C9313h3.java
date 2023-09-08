package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C36907w;
import te3.C48740an0;
import te3.C48882bn0;
import te3.C49712hj1;
import te3.C49842ig0;

/* renamed from: je1.h3 */
public final class C9313h3 extends C9255j {

    /* renamed from: g */
    public final String f29097g;

    /* renamed from: h */
    public final long f29098h;

    /* renamed from: i */
    public C47350c f29099i;

    /* renamed from: j */
    public C11385n f29100j;

    /* renamed from: n */
    public final String f29101n = "Finder.NetSceneFinderGetFoldedList";

    /* renamed from: o */
    public int f29102o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9313h3(String str, long j, String str2, C89349b bVar, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "friendUsername");
        C87412m.m108594g(str2, "nonceId");
        this.f29097g = str;
        this.f29098h = j;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3904;
        C48740an0 an02 = new C48740an0();
        an02.f130645f = str;
        an02.f130646g = j;
        an02.f130644e = bVar;
        an02.f130647h = str2;
        an02.f130643d = C46523h2.f125330a.mo71860b(3904, hj12);
        bVar2.f127066a = an02;
        bVar2.f127067b = new C48882bn0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfoldedlist";
        this.f29099i = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetFoldedList", "NetSceneFinderGetFoldedList friendUsername:" + str + " feedId:" + j + " nonceId:" + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29100j = nVar;
        return dispatch(gVar, this.f29099i, this);
    }

    public int getType() {
        return 3904;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        String str2 = this.f29101n;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C117407d.INSTANCE.idkeyStat(1279, 9, 1, false);
            String str3 = this.f29101n;
            Log.m105924i(str3, "friendUsername " + this.f29097g + "  feedId:" + this.f29098h + ' ' + C9311g2.f29093a.mo10062a(mo10067n1()));
            for (FinderObject dv : mo10067n1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(dv, this.f172736d);
            }
        } else {
            C117407d.INSTANCE.idkeyStat(1279, 10, 1, false);
        }
        C11385n nVar = this.f29100j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        LinkedList<FinderObject> n1 = mo10067n1();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
        for (FinderObject b : n1) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f29099i.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFoldedListRequest");
        C49842ig0 ig02 = ((C48740an0) aVar).f130643d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: n1 */
    public final LinkedList<FinderObject> mo10067n1() {
        C47465a aVar = this.f29099i.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFoldedListResponse");
        LinkedList<FinderObject> linkedList = ((C48882bn0) aVar).f131211d;
        return linkedList == null ? new LinkedList<>() : linkedList;
    }
}
