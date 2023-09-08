package je1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32230s;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9251d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9360p1;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50424mn0;
import te3.C50566nn0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.f0 */
public final class C9306f0 extends C9251d<C50566nn0> {

    /* renamed from: s */
    public final int f29086s;

    /* renamed from: t */
    public final int f29087t;

    /* renamed from: u */
    public final C32230s<Integer, Integer, String, C50566nn0, C117747y, C13598b0> f29088u;

    /* renamed from: v */
    public final C9360p1.C9362b f29089v;

    /* renamed from: w */
    public final boolean f29090w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9306f0(int i, int i2, C32230s<? super Integer, ? super Integer, ? super String, ? super C50566nn0, ? super C117747y, C13598b0> sVar, C9360p1.C9362b bVar, C89349b bVar2, boolean z, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(sVar, "callback");
        this.f29086s = i;
        this.f29087t = i2;
        this.f29088u = sVar;
        this.f29089v = bVar;
        this.f29090w = z;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        C50424mn0 mn02 = new C50424mn0();
        mn02.f138111d = C66785b.f191882e.mo90662O5();
        mn02.f138114g = i2;
        if (z) {
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C58784w3.f168295a.mo83914a0(i2), "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            mn02.f138112e = C89349b.m111674a(Util.decodeHexString((String) f));
        } else {
            mn02.f138112e = bVar2;
        }
        Log.m105924i("Finder.CgiFinderGetHistory", "[request] tabType=" + i2 + " pullType=" + i + " useGlobalLastBuffer=" + z);
        mn02.f138113f = C46523h2.f125330a.mo71860b(3814, hj12);
        bVar3.f127066a = mn02;
        C50566nn0 nn02 = new C50566nn0();
        nn02.setBaseResponse(new C49966ja());
        nn02.getBaseResponse().f135956e = new C51163rv3();
        bVar3.f127067b = nn02;
        bVar3.f127068c = "/cgi-bin/micromsg-bin/findergethistory";
        bVar3.f127069d = 3814;
        mo123453j(bVar3.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50566nn0 nn02 = (C50566nn0) eu32;
        C87412m.m108594g(nn02, "resp");
        super.mo332r(i, i2, str, nn02, yVar);
        C9360p1.C9362b bVar = this.f29089v;
        boolean z = true;
        if (bVar == null || !bVar.mo2804a(i, i2, str, nn02)) {
            z = false;
        }
        if (z) {
            Log.m105928w("Finder.CgiFinderGetHistory", "has consume.");
            return;
        }
        LinkedList<FinderObject> linkedList = nn02.f138688d;
        C87412m.m108591d(linkedList);
        Log.m105924i("Finder.CgiFinderGetHistory", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " pullType=" + this.f29086s + " list=" + linkedList.size() + " last_buffer=" + nn02.f138689e);
        if (i == 0 && i2 == 0 && this.f29090w) {
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a a0 = C58784w3.f168295a.mo83914a0(this.f29087t);
            C89349b bVar2 = nn02.f138689e;
            String str2 = null;
            if (bVar2 != null) {
                str2 = Util.encodeHexString(bVar2.mo123703f());
            }
            i3.mo119677K(a0, str2);
        }
        Log.m105924i("Finder.CgiFinderGetHistory", C9311g2.f29093a.mo10062a(linkedList));
        this.f29088u.mo237D(Integer.valueOf(i), Integer.valueOf(i2), str, nn02, yVar);
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C50566nn0 nn02 = (C50566nn0) eu32;
        C87412m.m108594g(nn02, "resp");
        LinkedList<FinderObject> linkedList = nn02.f138688d;
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
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetHistoryRequest");
        C49842ig0 ig02 = ((C50424mn0) aVar).f138113f;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
