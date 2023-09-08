package h60;

import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import d60.C58121a;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: h60.o */
public final class C59763o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170656d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59763o(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        super(0);
        this.f170656d = liveAnchorPluginLayout;
    }

    public Object invoke() {
        LiveAnchorPluginLayout liveAnchorPluginLayout = this.f170656d;
        if (liveAnchorPluginLayout.f157276J) {
            CopyOnWriteArrayList<C58121a> pluginList = liveAnchorPluginLayout.getPluginList();
            LiveAnchorPluginLayout liveAnchorPluginLayout2 = this.f170656d;
            for (C58121a aVar : pluginList) {
                if (aVar != null) {
                    if (!C64197v.m75537f(liveAnchorPluginLayout2.f157290n, liveAnchorPluginLayout2.f157302z).contains(aVar) && aVar.mo14483f0() == 0) {
                        aVar.mo10792g(4);
                        liveAnchorPluginLayout2.f157275I.add(aVar);
                    }
                }
            }
        } else {
            Iterator<C58121a> it = liveAnchorPluginLayout.f157275I.iterator();
            while (it.hasNext()) {
                it.next().mo10792g(0);
            }
            this.f170656d.f157275I.clear();
        }
        LiveAnchorPluginLayout liveAnchorPluginLayout3 = this.f170656d;
        liveAnchorPluginLayout3.f157276J = !liveAnchorPluginLayout3.f157276J;
        return C13598b0.f38549a;
    }
}
