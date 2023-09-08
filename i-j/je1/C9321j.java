package je1;

import bl3.C39818r;
import bo1.C0344g;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C20480e0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9251d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import os1.C62153d;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C36907w;
import te3.C48707ag0;
import te3.C48852bg0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51974xh1;

/* renamed from: je1.j */
public final class C9321j extends C9251d<C48852bg0> {

    /* renamed from: s */
    public int f29127s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9321j(long j, String str, int i, C89349b bVar, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "nonceId");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C48707ag0 ag02 = new C48707ag0();
        C46523h2 h2Var = C46523h2.f125330a;
        ag02.f130491d = h2Var.mo71860b(11856, hj12);
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        ag02.f130495h = ((Number) X0.f38555d).floatValue();
        ag02.f130496i = ((Number) X0.f38556e).floatValue();
        ag02.f130500p = h2Var.mo71867j();
        ag02.f130493f = j;
        ag02.f130497j = str;
        ag02.f130494g = i;
        ag02.f130492e = bVar;
        bVar2.f127066a = ag02;
        C48852bg0 bg02 = new C48852bg0();
        bg02.setBaseResponse(new C49966ja());
        bg02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = bg02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderauthorsingleflow";
        bVar2.f127069d = 11856;
        mo123453j(bVar2.mo72403a());
        boolean z = true;
        C20480e0.f57583a.mo32039l(1001, true);
        StringBuilder sb = new StringBuilder();
        sb.append("init feeId:");
        sb.append(C61926c.m72691p(j));
        sb.append(", displayTabType=");
        sb.append(i);
        sb.append(", lastBuffer=");
        sb.append(bVar == null ? false : z);
        Log.m105924i("CgiFinderAuthorSingleFlow", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C48852bg0 bg02 = (C48852bg0) eu32;
        C87412m.m108594g(bg02, "resp");
        super.mo332r(i, i2, str, bg02, yVar);
        Log.m105924i("CgiFinderAuthorSingleFlow", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " resp=" + bg02);
        C20480e0 e0Var = C20480e0.f57583a;
        e0Var.mo32039l(1001, false);
        if (i == 0 && i2 == 0) {
            e0Var.mo32034g(1001, false);
            C0344g gVar = C0344g.f929a;
            C51974xh1 xh12 = bg02.f131097h;
            LinkedList<FinderObject> linkedList = bg02.f131093d;
            C87412m.m108593f(linkedList, "resp.`object`");
            gVar.mo386b(xh12, linkedList, 3688);
            e0Var.mo32028a(1001, bg02.f131093d.size());
            return;
        }
        e0Var.mo32046u(1001, this.f172731j);
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C48852bg0 bg02 = (C48852bg0) eu32;
        C87412m.m108594g(bg02, "resp");
        LinkedList<FinderObject> linkedList = bg02.f131093d;
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
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAuthorSingleFlowReq");
        C49842ig0 ig02 = ((C48707ag0) aVar).f130491d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
