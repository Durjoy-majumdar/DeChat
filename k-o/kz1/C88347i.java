package kz1;

import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60216z4;
import java.util.ArrayList;
import java.util.List;
import kz1.C88341h;
import te3.C50073k31;

/* renamed from: kz1.i */
public final class C88347i<T> implements C60216z4.C8821a {

    /* renamed from: a */
    public final /* synthetic */ C88341h.C88342a f255344a;

    public C88347i(C88341h.C88342a aVar) {
        this.f255344a = aVar;
    }

    /* renamed from: a */
    public void mo6382a(Object obj) {
        List<C50073k31> list = (List) obj;
        C87412m.m108592e(list, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.FinderLiveMemberListInfo>");
        ArrayList arrayList = new ArrayList();
        for (C50073k31 k312 : list) {
            GameLiveAppbrandEventService.LiveMemberInfoPayload liveMemberInfoPayload = new GameLiveAppbrandEventService.LiveMemberInfoPayload((String) null, 0, 3, (C8480h) null);
            liveMemberInfoPayload.f248283d = k312.f136528d;
            liveMemberInfoPayload.f248284e = k312.f136529e;
            arrayList.add(liveMemberInfoPayload);
        }
        GameLiveAppbrandEventService.LiveMemberInfoListPayload liveMemberInfoListPayload = new GameLiveAppbrandEventService.LiveMemberInfoListPayload((List) null, 1, (C8480h) null);
        liveMemberInfoListPayload.f248282d = arrayList;
        this.f255344a.mo112617a(liveMemberInfoListPayload);
    }
}
