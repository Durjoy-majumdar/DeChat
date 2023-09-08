package je1;

import com.tencent.midas.data.APMidasPluginInfo;
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
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50537ng0;
import te3.C50676og0;
import te3.C50824pg0;
import te3.C51163rv3;

/* renamed from: je1.m */
public class C9335m extends C9251d<C50824pg0> {

    /* renamed from: s */
    public final LinkedList<C50676og0> f29161s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9335m(LinkedList<C50676og0> linkedList, C49712hj1 hj12, int i) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(linkedList, "objectIds");
        this.f29161s = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50537ng0 ng02 = new C50537ng0();
        ng02.f138589e = linkedList;
        ng02.f138588d = C46523h2.f125330a.mo71860b(8755, hj12);
        ng02.f138590f = i;
        bVar.f127066a = ng02;
        C50824pg0 pg02 = new C50824pg0();
        pg02.setBaseResponse(new C49966ja());
        pg02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = pg02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderbatchloadobject";
        bVar.f127069d = 8755;
        mo123453j(bVar.mo72403a());
        Log.m105924i("CgiFinderBatchLoadObject", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50824pg0 pg02 = (C50824pg0) eu32;
        C87412m.m108594g(pg02, "resp");
        super.mo332r(i, i2, str, pg02, yVar);
        Log.m105924i("CgiFinderBatchLoadObject", "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " resp=" + pg02);
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C50824pg0 pg02 = (C50824pg0) eu32;
        C87412m.m108594g(pg02, "resp");
        LinkedList<FinderObject> linkedList = pg02.f139748d;
        C87412m.m108593f(linkedList, "resp.objects");
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
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBatchLoadObjectRequest");
        C49842ig0 ig02 = ((C50537ng0) aVar).f138588d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
