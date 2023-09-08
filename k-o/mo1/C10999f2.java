package mo1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileReplayFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import qg1.C12222g0;
import rx3.C13598b0;
import te3.C50102ka1;

/* renamed from: mo1.f2 */
public final class C10999f2 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f32710d;

    /* renamed from: mo1.f2$a */
    public static final class C11000a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f32711d;

        /* renamed from: e */
        public final /* synthetic */ List<FinderObject> f32712e;

        /* renamed from: f */
        public final /* synthetic */ C117747y f32713f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11000a(FinderProfileTabUIC finderProfileTabUIC, List<? extends FinderObject> list, C117747y yVar) {
            super(0);
            this.f32711d = finderProfileTabUIC;
            this.f32712e = list;
            this.f32713f = yVar;
        }

        public Object invoke() {
            boolean z = !this.f32711d.mo80041M3().isEmpty();
            FinderProfileTabUIC finderProfileTabUIC = this.f32711d;
            FinderProfileTabUIC.C3524c cVar = new FinderProfileTabUIC.C3524c(C0966R.string.ekc);
            cVar.f174601b = 20;
            C13598b0 b0Var = C13598b0.f38549a;
            FinderProfileReplayFragment finderProfileReplayFragment = new FinderProfileReplayFragment();
            List<FinderObject> list = this.f32712e;
            C117747y yVar = this.f32713f;
            finderProfileReplayFragment.f16337q = list;
            C47465a aVar = ((C12222g0) yVar).f35288i.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
            finderProfileReplayFragment.f16338r = ((C50102ka1) aVar).f136634f;
            FinderTabUIC.m65394e3(finderProfileTabUIC, z ? 1 : 0, cVar, finderProfileReplayFragment, false, 8, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C10999f2(FinderProfileTabUIC finderProfileTabUIC) {
        this.f32710d = finderProfileTabUIC;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(5870, this);
        if (yVar instanceof C12222g0) {
            C12222g0 g0Var = (C12222g0) yVar;
            if (!C87412m.m108589b(g0Var.f35286g, this.f32710d.f160650G)) {
                Log.m105924i("Finder.FinderProfileTabUIC", "checkLiveTab fail for targetUsername:" + g0Var.f35286g + " != " + this.f32710d.f160650G);
            } else if (i == 0 && i2 == 0) {
                List<FinderObject> l1 = g0Var.mo11954l1();
                Log.m105924i("Finder.FinderProfileTabUIC", "checkLiveTab feedList size:" + ((LinkedList) l1).size());
                if (!l1.isEmpty()) {
                    C61926c.m72668M(new C11000a(this.f32710d, l1, yVar));
                }
            }
        }
    }
}
