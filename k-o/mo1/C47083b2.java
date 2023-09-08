package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46519f3;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import te3.C50848pm0;

/* renamed from: mo1.b2 */
public final class C47083b2 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f126520d;

    public C47083b2(FinderProfileTabUIC finderProfileTabUIC) {
        this.f126520d = finderProfileTabUIC;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(5801, this);
        if (!(yVar instanceof C46519f3)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            C46519f3 f3Var = (C46519f3) yVar;
            C47465a aVar = f3Var.f125321g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse");
            LinkedList<FinderObject> linkedList = ((C50848pm0) aVar).f139830d;
            C87412m.m108593f(linkedList, "commReqResp.responseProt…etDraftResponse).`object`");
            boolean z = false;
            if (linkedList.isEmpty()) {
                FinderProfileTabUIC finderProfileTabUIC = this.f126520d;
                finderProfileTabUIC.getClass();
                Log.m105924i("Finder.FinderProfileTabUIC", "removeDraftFragment");
                C61926c.m72668M(new C47086g2(finderProfileTabUIC));
                return;
            }
            FinderProfileTabUIC finderProfileTabUIC2 = this.f126520d;
            C47465a aVar2 = f3Var.f125321g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse");
            if (((C50848pm0) aVar2).f139833g == 1) {
                z = true;
            }
            finderProfileTabUIC2.getClass();
            Log.m105924i("Finder.FinderProfileTabUIC", "addDraftFragment");
            C61926c.m72668M(new C61547x1(finderProfileTabUIC2, z));
            return;
        }
        FinderProfileTabUIC finderProfileTabUIC3 = this.f126520d;
        finderProfileTabUIC3.getClass();
        Log.m105924i("Finder.FinderProfileTabUIC", "removeDraftFragment");
        C61926c.m72668M(new C47086g2(finderProfileTabUIC3));
    }
}
