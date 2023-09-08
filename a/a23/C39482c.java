package a23;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C110965ic;
import te3.C49972jc;
import te3.C50108kc;
import te3.C50240lc;

/* renamed from: a23.c */
public final class C39482c extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f106024d;

    /* renamed from: e */
    public C49972jc f106025e;

    /* renamed from: f */
    public C11385n f106026f;

    public C39482c(long j, long j2, long j3, List<? extends C110965ic> list) {
        C87412m.m108594g(list, "behaviorList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49972jc();
        bVar.f127067b = new C50240lc();
        bVar.f127068c = "/cgi-bin/spr-bin/behaviorvlog";
        bVar.f127069d = 3525;
        C47350c a = bVar.mo72403a();
        this.f106024d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BehaviorVlogReq");
        this.f106025e = (C49972jc) aVar;
        C50108kc kcVar = new C50108kc();
        kcVar.f136650d = j;
        kcVar.f136651e = j2;
        kcVar.f136652f = j3;
        kcVar.f136653g.addAll(list);
        this.f106025e.f136005d = kcVar;
        Log.m105924i("MicroMsg.NetSceneVideoReport", "LogVlog: report vlog " + j + ' ' + list.size());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f106026f = nVar;
        return dispatch(gVar, this.f106024d, this);
    }

    public int getType() {
        return 3525;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneVideoReport", "onGYNetEnd " + i + ", " + i2 + ", " + i3 + ", " + str);
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BehaviorVlogResp");
        C50240lc lcVar = (C50240lc) aVar;
        C11385n nVar = this.f106026f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
