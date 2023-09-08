package eg1;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: eg1.q */
public final class C58592q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58589p f167755d;

    /* renamed from: e */
    public final /* synthetic */ Context f167756e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58592q(C58589p pVar, Context context) {
        super(0);
        this.f167755d = pVar;
        this.f167756e = context;
    }

    public Object invoke() {
        C58589p pVar = this.f167755d;
        Context context = this.f167756e;
        pVar.getClass();
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = new FinderLiveVisitorPluginLayout(context, pVar.f167741d, (AttributeSet) null, pVar.f167744g);
        synchronized (pVar.f167748n) {
            ((ArrayList) pVar.f167748n).add(finderLiveVisitorPluginLayout);
        }
        return C13598b0.f38549a;
    }
}
