package je1;

import bo1.C0344g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61937h;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50984qn0;
import te3.C51129rn0;
import te3.C51974xh1;
import wp1.C15585f;
import zc1.C66785b;

/* renamed from: je1.m3 */
public final class C9339m3 extends C9255j {

    /* renamed from: g */
    public C47350c f29169g;

    /* renamed from: h */
    public C11385n f29170h;

    /* renamed from: i */
    public final String f29171i;

    /* renamed from: j */
    public List<? extends FinderItem> f29172j;

    /* renamed from: n */
    public int f29173n;

    /* renamed from: o */
    public String f29174o;

    /* renamed from: p */
    public boolean f29175p;

    /* renamed from: q */
    public int f29176q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9339m3(long j, C89349b bVar, int i, String str, C49712hj1 hj12, int i2, boolean z, int i3, C8480h hVar) {
        super(hj12);
        i = (i3 & 4) != 0 ? 0 : i;
        str = (i3 & 8) != 0 ? "" : str;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        z = (i3 & 64) != 0 ? true : z;
        C87412m.m108594g(str, "targetUsername");
        this.f29171i = "Finder.NetSceneFinderGetLikedList";
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3965;
        this.f29173n = i;
        this.f29174o = str;
        this.f29175p = z;
        C50984qn0 qn02 = new C50984qn0();
        qn02.f140400d = j;
        qn02.f140402f = bVar;
        qn02.f140401e = C66785b.f191882e.mo90662O5();
        if (!C87412m.m108589b(str, C75592q0.m90789s())) {
            qn02.f140404h = str;
        }
        qn02.f140405i = i2;
        C46523h2 h2Var = C46523h2.f125330a;
        qn02.f140406j = h2Var.mo71867j();
        this.f29176q = i2;
        qn02.f140403g = h2Var.mo71860b(3965, hj12);
        bVar2.f127066a = qn02;
        bVar2.f127069d = 3965;
        bVar2.f127067b = new C51129rn0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        this.f29169g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetLikedList", "NetSceneFinderGetLikedList init: " + j + ' ' + qn02.f140401e + "， targetUsername：" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29170h = nVar;
        return dispatch(gVar, this.f29169g, this);
    }

    public int getType() {
        return 3965;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        String str2 = this.f29171i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29169g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            C87412m.m108593f(((C51129rn0) aVar).f141036d, "rr.responseProtoBuf as F…dListResponse).liked_list");
            C47465a aVar2 = this.f29169g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            C51129rn0 rn02 = (C51129rn0) aVar2;
            C0344g gVar = C0344g.f929a;
            C51974xh1 xh12 = rn02.f141043n;
            LinkedList<FinderObject> linkedList = rn02.f141036d;
            C87412m.m108593f(linkedList, "resp.liked_list");
            gVar.mo386b(xh12, linkedList, 3965);
            LinkedList<FinderObject> linkedList2 = rn02.f141036d;
            C87412m.m108593f(linkedList2, "resp.liked_list");
            boolean z = false;
            if (linkedList2.size() > 0) {
                FinderObject finderObject = linkedList2.get(0);
                C87412m.m108593f(finderObject, "list[0]");
                String str3 = this.f29171i;
                Log.m105924i(str3, "onGYNetEnd list:" + linkedList2.size() + " firstItem:" + C61937h.m72709h(finderObject));
            }
            String str4 = this.f29171i;
            StringBuilder sb = new StringBuilder();
            sb.append("onGYNetEnd list:");
            sb.append(linkedList2.size());
            sb.append(", continueFlag:");
            sb.append(rn02.f141038f);
            sb.append(", maxId:");
            FinderObject finderObject2 = (FinderObject) C110818d0.m150925W(linkedList2);
            sb.append(finderObject2 != null ? Long.valueOf(finderObject2.displayId) : null);
            sb.append(' ');
            Log.m105924i(str4, sb.toString());
            if (this.f29173n != 2 && Util.isNullOrNil(this.f29174o)) {
                z = true;
            }
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList2) {
                if (C58784w3.f168295a.mo83866E0((FinderObject) next)) {
                    arrayList.add(next);
                }
            }
            C15585f.C15586a aVar3 = C15585f.f42211a;
            List<FinderItem> f = aVar3.mo14343f(arrayList, 4, this.f172736d);
            this.f29172j = f;
            if (z && this.f29176q != 1 && this.f29175p) {
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(f, 10));
                Iterator it = ((ArrayList) f).iterator();
                while (it.hasNext()) {
                    arrayList2.add(C15585f.f42211a.mo14348k((FinderItem) it.next()));
                }
                aVar3.mo14346i(arrayList2, 4, "", z);
            }
        }
        C11385n nVar = this.f29170h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        C47465a aVar = this.f29169g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
        LinkedList<FinderObject> linkedList = ((C51129rn0) aVar).f141036d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…dListResponse).liked_list");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject b : linkedList) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f29169g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListRequest");
        C49842ig0 ig02 = ((C50984qn0) aVar).f140403g;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
