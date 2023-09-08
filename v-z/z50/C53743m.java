package z50;

import c60.C39902d;
import com.google.android.gms.common.internal.ImagesContract;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87412m;
import i60.C46169a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49317ep2;
import te3.C50020jp2;
import te3.C50710oo2;
import te3.C51634v22;
import te3.C51774w22;
import te3.C52146yo2;
import y50.C53496k;
import y50.C66519j0;

/* renamed from: z50.m */
public final class C53743m extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150871d;

    /* renamed from: e */
    public C11385n f150872e;

    /* renamed from: f */
    public long f150873f;

    public C53743m(long j, String str, boolean z) {
        C87412m.m108594g(str, "wechatRoomId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51634v22();
        bVar.f127067b = new C51774w22();
        bVar.f127069d = 3767;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlivemessage";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127075j = true;
        bVar.f127076k = 25000;
        C47350c a = bVar.mo72403a();
        this.f150871d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveMessageRequest");
        C51634v22 v222 = (C51634v22) aVar;
        v222.f143264e = j;
        v222.f143265f = str;
        v222.f143263d = C89349b.m111674a(RoomLiveService.f157196g);
        v222.f143266g = z;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveGetLiveMessage", "get live message:" + j + " wechatRoomId:" + str + " offline:" + z);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150873f = System.currentTimeMillis();
        this.f150872e = nVar;
        return dispatch(gVar, this.f150871d, this);
    }

    public int getType() {
        return 3767;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C46169a b;
        C89349b bVar;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C114799u uVar2 = uVar;
        C87412m.m108594g(uVar2, "rr");
        boolean z = false;
        Log.m105925i("MicroMsg.LiveNetScene.NetSceneLiveGetLiveMessage", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f150873f = System.currentTimeMillis() - this.f150873f;
        if (i4 == 4 && i5 == -100020) {
            C66519j0.f191358d.mo90600d(0);
            C11385n nVar = this.f150872e;
            if (nVar != null) {
                nVar.onSceneEnd(i4, i5, str2, this);
                return;
            }
            return;
        }
        C47465a aVar = ((C47350c) uVar2).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveMessageResponse");
        C51774w22 w222 = (C51774w22) aVar;
        if (i4 == 0 && i5 == 0) {
            Integer num = null;
            if (w222.f143836i) {
                if (RoomLiveService.f157197h.f133055i != w222.f143833f) {
                    for (Map.Entry<String, C32224a<C13598b0>> value : C53496k.f150441f.entrySet()) {
                        ((C32224a) value.getValue()).invoke();
                    }
                }
                C49317ep2 ep22 = RoomLiveService.f157197h;
                ep22.f133055i = w222.f143833f;
                ep22.f133057n = Math.max(ep22.f133057n, w222.f143835h);
                RoomLiveService.f157193d.clear();
                ArrayList<String> arrayList = RoomLiveService.f157193d;
                Collection collection = w222.f143834g;
                if (collection == null) {
                    collection = new ArrayList();
                }
                arrayList.addAll(collection);
                C50710oo2 oo22 = new C50710oo2();
                RoomLiveService.f157203n = oo22;
                C52146yo2 yo22 = w222.f143837j;
                byte[] bArr2 = (yo22 == null || (bVar = yo22.f145437d) == null) ? null : bVar.f257327a;
                if (bArr2 != null) {
                    try {
                        oo22.parseFrom(bArr2);
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                    }
                }
                C39902d dVar = C39902d.f106987a;
                ArrayList<C46169a> arrayList2 = RoomLiveService.f157195f;
                List<C50020jp2> list = w222.f143831d;
                if (list == null) {
                    list = new ArrayList<>();
                }
                String s = C75592q0.m90789s();
                C87412m.m108593f(s, "getUsernameFromUserInfo()");
                C87412m.m108594g(arrayList2, ImagesContract.LOCAL);
                if (arrayList2.size() == 0) {
                    arrayList2.addAll(dVar.mo62511c(list));
                    dVar.mo62509a(arrayList2);
                } else {
                    int i6 = ((C46169a) C110818d0.m150923U(arrayList2)).f124461e;
                    for (C50020jp2 jp22 : list) {
                        if (jp22.f136244h > i6) {
                            z = true;
                        }
                        if (z && !C87412m.m108589b(jp22.f136240d, s) && (b = C39902d.f106987a.mo62510b(jp22)) != null) {
                            arrayList2.add(b);
                        }
                    }
                    if (list.size() - arrayList2.size() > 10) {
                        arrayList2.clear();
                        arrayList2.addAll(dVar.mo62511c(list));
                    }
                    dVar.mo62509a(arrayList2);
                }
                C53496k.f150436a.mo74169b();
            }
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157196g = w222.f143832e.f257327a;
            StringBuilder sb = new StringBuilder();
            sb.append("onlineCount:");
            sb.append(RoomLiveService.f157197h.f133055i);
            sb.append(" headerList:");
            sb.append(RoomLiveService.f157193d.size());
            sb.append(" remoteMsgSize:");
            LinkedList<C50020jp2> linkedList = w222.f143831d;
            if (linkedList != null) {
                num = Integer.valueOf(linkedList.size());
            }
            sb.append(num);
            sb.append(", msgSize:");
            sb.append(RoomLiveService.f157195f.size());
            sb.append(" likeCount:");
            sb.append(RoomLiveService.f157197h.f133057n);
            sb.append(", needUpdate:");
            sb.append(w222.f143836i);
            Log.m105924i("MicroMsg.LiveNetScene.NetSceneLiveGetLiveMessage", sb.toString());
        } else {
            Log.m105920e("MicroMsg.LiveNetScene.NetSceneLiveGetLiveMessage", "onGYNetEnd error");
            if (i5 == -100056) {
                for (Map.Entry<String, C32224a<C13598b0>> value2 : C53496k.f150437b.entrySet()) {
                    ((C32224a) value2.getValue()).invoke();
                }
            }
        }
        C11385n nVar2 = this.f150872e;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i4, i5, str2, this);
        }
    }
}
