package dw2;

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
import te3.C51018qv3;
import te3.dc4;
import te3.ec4;
import te3.fc4;
import te3.gc4;
import te3.ic4;
import te3.jc4;
import te3.kc4;

/* renamed from: dw2.e */
public final class C45456e extends C117747y implements C1311n {

    /* renamed from: d */
    public final List<C45454a> f123034d;

    /* renamed from: e */
    public final List<Integer> f123035e;

    /* renamed from: f */
    public final C47350c f123036f;

    /* renamed from: g */
    public C11385n f123037g;

    public C45456e(List<? extends C45454a> list, List<Integer> list2) {
        C87412m.m108594g(list, "opList");
        C87412m.m108594g(list2, "localIdList");
        this.f123034d = list;
        this.f123035e = list2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new jc4();
        bVar.f127067b = new kc4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmstoryobjectop";
        bVar.f127069d = 764;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123036f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpRequest");
        jc4 jc4 = (jc4) aVar;
        jc4.f136015d = list.size();
        for (C45454a aVar2 : list) {
            ic4 ic4 = new ic4();
            ic4.f135223d = aVar2.f123026a;
            ic4.f135224e = aVar2.f123027b;
            Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", "op.id:" + aVar2.f123026a + " op.type:" + aVar2.f123027b);
            if (aVar2 instanceof C45467j) {
                fc4 fc4 = new fc4();
                fc4.f133436d = aVar2.f123026a;
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(fc4.toByteArray());
                ic4.f135225f = qv32;
            } else if (aVar2 instanceof C45465h) {
                dc4 dc4 = new dc4();
                dc4.f132239d = ((C45465h) aVar2).f123062c;
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(dc4.toByteArray());
                ic4.f135225f = qv33;
            } else if (aVar2 instanceof C45468k) {
                gc4 gc4 = new gc4();
                gc4.f133969e = ((C45468k) aVar2).f123064c;
                gc4.f133968d = aVar2.f123026a;
                C51018qv3 qv34 = new C51018qv3();
                qv34.mo73350k(gc4.toByteArray());
                ic4.f135225f = qv34;
            } else if (aVar2 instanceof C45466i) {
                ec4 ec4 = new ec4();
                ec4.f132867e = ((C45466i) aVar2).f123063c;
                ec4.f132866d = aVar2.f123026a;
                C51018qv3 qv35 = new C51018qv3();
                qv35.mo73350k(ec4.toByteArray());
                ic4.f135225f = qv35;
            }
            jc4.f136016e.add(ic4);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f123037g = nVar;
        return dispatch(gVar, this.f123036f, this);
    }

    public int getType() {
        return 764;
    }

    /* renamed from: j1 */
    public final C45454a mo70944j1() {
        List<C45454a> list = this.f123034d;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return this.f123034d.get(0);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        C47465a aVar = this.f123036f.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpResponse");
        int i4 = ((kc4) aVar).f136667d;
        StringBuilder sb = new StringBuilder();
        sb.append("respCount=");
        sb.append(i4);
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", sb.toString());
        C11385n nVar = this.f123037g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        } else {
            C87412m.m108603p("callback");
            throw null;
        }
    }
}
