package ay0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43503a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: ay0.l */
public final class C28158l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f77635d;

    /* renamed from: e */
    public final /* synthetic */ MpWebViewController f77636e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28158l(int i, MpWebViewController mpWebViewController) {
        super(0);
        this.f77635d = i;
        this.f77636e = mpWebViewController;
    }

    public Object invoke() {
        ConcurrentHashMap<Integer, MpWebViewController> concurrentHashMap = C39656k.f106418b;
        if (C87412m.m108589b(concurrentHashMap.get(Integer.valueOf(this.f77635d)), this.f77636e)) {
            concurrentHashMap.remove(Integer.valueOf(this.f77635d));
            MpWebViewController mpWebViewController = this.f77636e;
            mpWebViewController.getClass();
            C61926c.m72668M(new C43503a(mpWebViewController));
            Log.m105920e("MicroMsg.Preload.TmplWebViewManager", "remove preload when tmpl fail:" + this.f77635d + ", " + this.f77636e.mo67719g());
        }
        return C13598b0.f38549a;
    }
}
