package eg1;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: eg1.r */
public final class C58593r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58589p f167757d;

    /* renamed from: e */
    public final /* synthetic */ boolean f167758e;

    /* renamed from: f */
    public final /* synthetic */ Context f167759f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58593r(C58589p pVar, boolean z, Context context) {
        super(0);
        this.f167757d = pVar;
        this.f167758e = z;
        this.f167759f = context;
    }

    public Object invoke() {
        if (((ArrayList) this.f167757d.f167748n).size() >= 2) {
            String str = this.f167757d.f167747j;
            Log.m105924i(str, "checkProduceVisitorView: do not need to produce, view size = " + ((ArrayList) this.f167757d.f167748n).size());
        } else if (this.f167758e) {
            C61926c.m72666K(0, new C58592q(this.f167757d, this.f167759f));
        } else {
            C58589p pVar = this.f167757d;
            Context context = this.f167759f;
            pVar.getClass();
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = new FinderLiveVisitorPluginLayout(context, pVar.f167741d, (AttributeSet) null, pVar.f167744g);
            synchronized (pVar.f167748n) {
                ((ArrayList) pVar.f167748n).add(finderLiveVisitorPluginLayout);
            }
        }
        return C13598b0.f38549a;
    }
}
