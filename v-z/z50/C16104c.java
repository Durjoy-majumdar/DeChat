package z50;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13604l;
import te3.C48660a32;
import te3.C49317ep2;
import te3.C52205z22;

/* renamed from: z50.c */
public final class C16104c extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f43260d;

    /* renamed from: e */
    public final boolean f43261e;

    /* renamed from: f */
    public C47350c f43262f;

    /* renamed from: g */
    public C11385n f43263g;

    public C16104c(long j, String str, boolean z) {
        C87412m.m108594g(str, "wechatRoomId");
        this.f43260d = str;
        this.f43261e = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52205z22();
        bVar.f127067b = new C48660a32();
        bVar.f127069d = 3662;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getliveonlinebyroom";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43262f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveOnlineByRoomRequest");
        C52205z22 z222 = (C52205z22) aVar;
        z222.f145655d = j;
        z222.f145656e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetLiveInfo", "doScene");
        this.f43263g = nVar;
        return dispatch(gVar, this.f43262f, this);
    }

    public int getType() {
        return 3662;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = 0;
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneGetLiveOnlineByRoom", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveOnlineByRoomResponse");
        C48660a32 a322 = (C48660a32) aVar;
        if (i2 == 0 && i3 == 0) {
            if (RoomLiveService.f157194e.get(this.f43260d) == null) {
                RoomLiveService.f157194e.put(this.f43260d, new C13604l(new ArrayList(), 0));
            }
            C13604l lVar = RoomLiveService.f157194e.get(this.f43260d);
            ArrayList arrayList = lVar != null ? (ArrayList) lVar.f38555d : null;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (arrayList != null) {
                LinkedList<String> linkedList = a322.f130276d;
                C87412m.m108593f(linkedList, "it.identity_id_list");
                ArrayList arrayList2 = new ArrayList();
                for (T next : linkedList) {
                    if (!Util.isEqual(RoomLiveService.f157199j, (String) next)) {
                        arrayList2.add(next);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            C49317ep2 ep22 = RoomLiveService.f157197h;
            if (arrayList != null) {
                i4 = arrayList.size();
            }
            ep22.f133055i = i4;
            Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetLiveOnlineByRoom", "it.identity_id_list:" + a322.f130276d);
        } else {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneGetLiveInfo", "onGYNetEnd error");
        }
        C11385n nVar = this.f43263g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
