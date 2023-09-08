package zk1;

import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveVisitorFragment;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import f50.C58924d;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import jj1.C60874a;
import o40.C61926c;
import ph1.C62293i;
import ph1.C62294j;
import r50.C63367f;
import rx3.C13598b0;
import uh1.C65358b;
import x50.C15625a;

/* renamed from: zk1.f */
public final class C66875f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f192111d;

    /* renamed from: e */
    public final /* synthetic */ C65358b f192112e;

    /* renamed from: f */
    public final /* synthetic */ C62294j f192113f;

    /* renamed from: g */
    public final /* synthetic */ FinderLiveVisitorFragment f192114g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66875f(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, C65358b bVar, C62294j jVar, FinderLiveVisitorFragment finderLiveVisitorFragment) {
        super(0);
        this.f192111d = finderLiveExitAnimateOpUIC;
        this.f192112e = bVar;
        this.f192113f = jVar;
        this.f192114g = finderLiveVisitorFragment;
    }

    public Object invoke() {
        Class cls = C66881u0.class;
        FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f192111d;
        C65358b bVar = this.f192112e;
        C62294j jVar = this.f192113f;
        FinderLiveVisitorFragment finderLiveVisitorFragment = this.f192114g;
        if (finderLiveVisitorFragment != null) {
            finderLiveExitAnimateOpUIC.getClass();
            if (jVar.f177095g != null) {
                C60874a d3 = ((C66881u0) C39818r.f106831a.mo62445d(finderLiveVisitorFragment).mo75002a(cls)).mo90880d3();
                C63367f c = d3 != null ? d3.mo84888c() : null;
                if (c != null) {
                    View view = c.f179749i;
                    if (view instanceof C15625a) {
                        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.live.core.view.FluentSwitchRelativeLayout");
                        C15625a aVar = (C15625a) view;
                        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(MMApplicationContext.getContext());
                        aVar.addView(tXCloudVideoView);
                        C58924d dVar = jVar.f177095g;
                        if (dVar != null) {
                            dVar.setRenderMode(0);
                        }
                        C58924d dVar2 = jVar.f177095g;
                        if (dVar2 != null) {
                            dVar2.setPlayerView(tXCloudVideoView);
                        }
                        String str = finderLiveExitAnimateOpUIC.f160012d;
                        Log.m105924i(str, "attachToWindow visibility : " + aVar.getVisibility() + ", player:" + jVar.f177095g);
                        C8477a0 a0Var = new C8477a0();
                        aVar.setNotifyVisibilityFunction(new C66870a(finderLiveExitAnimateOpUIC, a0Var, bVar, aVar));
                        C61926c.m72666K(150, new C66871b(finderLiveExitAnimateOpUIC, a0Var, bVar));
                        ((C66881u0) C39818r.f106831a.mo62445d(this.f192114g).mo75002a(cls)).mo90884i3();
                        C62293i.f177085e = true;
                        this.f192111d.mo78201d3("onWindowExit");
                        return C13598b0.f38549a;
                    }
                }
                bVar.mo84316a();
                C62293i.f177081a.mo87358c();
                ((C66881u0) C39818r.f106831a.mo62445d(this.f192114g).mo75002a(cls)).mo90884i3();
                C62293i.f177085e = true;
                this.f192111d.mo78201d3("onWindowExit");
                return C13598b0.f38549a;
            }
        }
        Log.m105920e(finderLiveExitAnimateOpUIC.f160012d, "start attachToWindow data = null");
        bVar.mo84316a();
        C62293i.f177081a.mo87358c();
        ((C66881u0) C39818r.f106831a.mo62445d(this.f192114g).mo75002a(cls)).mo90884i3();
        C62293i.f177085e = true;
        this.f192111d.mo78201d3("onWindowExit");
        return C13598b0.f38549a;
    }
}
