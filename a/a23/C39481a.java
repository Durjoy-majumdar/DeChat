package a23;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import qe3.C89631w;
import te3.C48912bv2;
import te3.C49080d14;
import te3.C49894it1;
import te3.C50035jt1;
import te3.C50177kt1;

/* renamed from: a23.a */
public final class C39481a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f106020d;

    /* renamed from: e */
    public C49894it1 f106021e;

    /* renamed from: f */
    public C50177kt1 f106022f;

    /* renamed from: g */
    public C11385n f106023g;

    public C39481a(long j, long j2, int i, LinkedList<C48912bv2> linkedList, C49080d14 d142, int i2, int i3, boolean z, int i4, int i5) {
        C87412m.m108594g(linkedList, "materials");
        C87412m.m108594g(d142, "serverConf");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49894it1();
        bVar.f127067b = new C50177kt1();
        bVar.f127069d = 1469;
        bVar.f127068c = "/cgi-bin/spr-bin/generatevlog";
        bVar.f127070e = 0;
        Log.m105918d("MicroMsg.NetSceneGenerateVlog", "GenerateVlog with reqId: " + j + ", uin: " + j2 + ", businessId: " + i + ", materials: " + linkedList.size() + ", sid: " + i4 + ", fid: " + i5);
        C47350c a = bVar.mo72403a();
        this.f106020d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GenerateVlogReq");
        this.f106021e = (C49894it1) aVar;
        C50035jt1 jt12 = new C50035jt1();
        jt12.f136315d = j;
        jt12.f136316e = j2;
        jt12.f136317f = (long) i;
        jt12.f136318g = linkedList;
        jt12.f136319h = d142;
        jt12.f136320i = (long) i2;
        jt12.f136321j = (long) i3;
        jt12.f136322n = z;
        jt12.f136324p = (long) i4;
        jt12.f136325q = (long) i5;
        C49894it1 it12 = this.f106021e;
        it12.f135655d = jt12;
        it12.setBaseRequest(C89631w.m112065a(this.f106020d.getReqObj()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGenerateVlog", "do scene");
        this.f106023g = nVar;
        return dispatch(gVar, this.f106020d, this);
    }

    public int getType() {
        return 1469;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGenerateVlog", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GenerateVlogResp");
        this.f106022f = (C50177kt1) aVar;
        C11385n nVar = this.f106023g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
