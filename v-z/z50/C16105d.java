package z50;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13604l;
import te3.C49089d32;
import te3.C49226e32;
import te3.C49459fq2;

/* renamed from: z50.d */
public final class C16105d extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f43264d;

    /* renamed from: e */
    public C47350c f43265e;

    /* renamed from: f */
    public C11385n f43266f;

    public C16105d(long j, String str) {
        C87412m.m108594g(str, "wechatRoomId");
        this.f43264d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49089d32();
        bVar.f127067b = new C49226e32();
        bVar.f127069d = 3700;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getliveonlinestatebyroom";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43265e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveOnlineStateByRoomRequest");
        C49089d32 d322 = (C49089d32) aVar;
        d322.f132097d = j;
        d322.f132098e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetLiveInfo", "doScene");
        this.f43266f = nVar;
        return dispatch(gVar, this.f43265e, this);
    }

    public int getType() {
        return 3700;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneGetLiveOnlineStateRoom", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveOnlineStateByRoomResponse");
        C49226e32 e322 = (C49226e32) aVar;
        if (i2 == 0 && i3 == 0) {
            if (RoomLiveService.f157194e.get(this.f43264d) == null) {
                RoomLiveService.f157194e.put(this.f43264d, new C13604l(new ArrayList(), 0));
            }
            C13604l lVar = RoomLiveService.f157194e.get(this.f43264d);
            ArrayList arrayList = lVar != null ? (ArrayList) lVar.f38555d : null;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList arrayList2 = new ArrayList();
            LinkedList<C49459fq2> linkedList = e322.f132659d;
            C87412m.m108593f(linkedList, "it.user_online_state_list");
            for (C49459fq2 fq22 : linkedList) {
                arrayList2.add(fq22.f133636d);
            }
            if (arrayList != null) {
                arrayList.addAll(arrayList2);
            }
            Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetLiveOnlineStateRoom", "idList:" + arrayList2);
            RoomLiveService.f157197h.f133055i = arrayList2.size();
        } else {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneGetLiveOnlineStateRoom", "onGYNetEnd error");
        }
        C11385n nVar = this.f43266f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
