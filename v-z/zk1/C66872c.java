package zk1;

import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import f50.C58924d;
import fh1.C59062p2;
import fy3.C32224a;
import gk1.C59522a;
import gy3.C87413o;
import j50.C60735a;
import ph1.C62291f;
import ph1.C62293i;
import ph1.C62297m;
import rx3.C13598b0;

/* renamed from: zk1.c */
public final class C66872c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f192104d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66872c(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC) {
        super(0);
        this.f192104d = finderLiveExitAnimateOpUIC;
    }

    public Object invoke() {
        C59062p2 p2Var;
        C58115i iVar;
        C62293i iVar2 = C62293i.f177081a;
        C62297m e = iVar2.mo87360e(this.f192104d.f160018j);
        String str = this.f192104d.f160012d;
        StringBuilder sb = new StringBuilder();
        sb.append("directorHashCode: ");
        sb.append(this.f192104d.f160021p);
        sb.append(" direct: ");
        boolean z = false;
        sb.append(e != null ? e.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        if (e instanceof C62291f) {
            C62291f fVar = (C62291f) e;
            if (fVar.mo84321f().f177095g != null) {
                int hashCode = fVar.hashCode();
                FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f192104d;
                if (hashCode == finderLiveExitAnimateOpUIC.f160021p) {
                    String str2 = finderLiveExitAnimateOpUIC.f160012d;
                    Log.m105920e(str2, "checkLeak auto stop " + this.f192104d.f160018j + " scene: " + fVar.mo84321f().f177089a);
                    this.f192104d.getClass();
                    e.mo84316a();
                    iVar2.mo87358c();
                    C58924d dVar = fVar.mo84321f().f177095g;
                    if (dVar != null) {
                        dVar.stopPlay(true);
                    }
                }
            }
        }
        FinderLiveService.f159376d.getClass();
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        if (!(liveRoomControllerStore == null || (p2Var = (C59062p2) liveRoomControllerStore.controller(C59062p2.class)) == null)) {
            if (p2Var.mo84271I3()) {
                Log.m105924i(p2Var.f168980j, "checkLeak not supportScrollSquare");
            } else {
                C60735a aVar = FinderLiveService.f159378f;
                if (!(aVar == null || (iVar = aVar.f172989A) == null || !iVar.mo82888j())) {
                    z = true;
                }
                if (z) {
                    boolean isShown = p2Var.mo84269F3().f170122e.isShown();
                    int i = p2Var.mo84269F3().f170120D;
                    String str3 = p2Var.f168980j;
                    Log.m105924i(str3, "checkLeak isWidgetShow: " + isShown + " curMode: " + i);
                    if (!isShown && i == C59522a.f170115I) {
                        p2Var.mo84279n3("checkLeak");
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
