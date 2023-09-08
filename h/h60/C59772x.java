package h60;

import com.tencent.p014mm.live.view.LiveVisitorPluginLayout;
import d60.C58121a;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: h60.x */
public final class C59772x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorPluginLayout f170665d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59772x(LiveVisitorPluginLayout liveVisitorPluginLayout) {
        super(0);
        this.f170665d = liveVisitorPluginLayout;
    }

    public Object invoke() {
        LiveVisitorPluginLayout liveVisitorPluginLayout = this.f170665d;
        if (liveVisitorPluginLayout.f157320E) {
            CopyOnWriteArrayList<C58121a> pluginList = liveVisitorPluginLayout.getPluginList();
            LiveVisitorPluginLayout liveVisitorPluginLayout2 = this.f170665d;
            for (C58121a aVar : pluginList) {
                if (aVar != null) {
                    if (!C64197v.m75537f(liveVisitorPluginLayout2.f157330f, liveVisitorPluginLayout2.f157340s, liveVisitorPluginLayout2.f157331g, liveVisitorPluginLayout2.f157318C).contains(aVar) && aVar.mo14483f0() == 0) {
                        aVar.mo10792g(4);
                        liveVisitorPluginLayout2.f157322G.add(aVar);
                    }
                }
            }
        } else {
            Iterator<C58121a> it = liveVisitorPluginLayout.f157322G.iterator();
            while (it.hasNext()) {
                it.next().mo10792g(0);
            }
            this.f170665d.f157322G.clear();
        }
        LiveVisitorPluginLayout liveVisitorPluginLayout3 = this.f170665d;
        liveVisitorPluginLayout3.f157320E = !liveVisitorPluginLayout3.f157320E;
        return C13598b0.f38549a;
    }
}
