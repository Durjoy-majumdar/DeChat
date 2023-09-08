package z50;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C48803b32;
import te3.C48949c32;

/* renamed from: z50.n */
public final class C16109n extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f43274d;

    /* renamed from: e */
    public C48803b32 f43275e;

    /* renamed from: f */
    public C48949c32 f43276f;

    /* renamed from: g */
    public C11385n f43277g;

    public C16109n(long j, List<String> list) {
        LinkedList<String> linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48803b32();
        bVar.f127067b = new C48949c32();
        bVar.f127069d = 3816;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getliveonlinememberbyid";
        boolean z = false;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43274d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveOnlineMemberByIdRequest");
        C48803b32 b322 = (C48803b32) aVar;
        this.f43275e = b322;
        b322.f130923d = j;
        if (!((list == null || list.isEmpty()) ? true : z) && (linkedList = this.f43275e.f130924e) != null) {
            linkedList.addAll(list);
        }
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveGetOnlineMemberById", "get live info liveId:" + j);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveGetOnlineMemberById", "doScene");
        this.f43277g = nVar;
        return dispatch(gVar, this.f43274d, this);
    }

    public int getType() {
        return 3816;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveGetOnlineMemberById", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveOnlineMemberByIdResponse");
        this.f43276f = (C48949c32) aVar;
        C11385n nVar = this.f43277g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
