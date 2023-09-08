package wm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.p947ui.launcher.API_openWeAppSearch;
import fl0.C86920e;
import org.json.JSONObject;

/* renamed from: wm0.d */
public final class C91037d<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C81879g f261184a;

    /* renamed from: b */
    public final /* synthetic */ int f261185b;

    /* renamed from: c */
    public final /* synthetic */ API_openWeAppSearch f261186c;

    public C91037d(C81879g gVar, int i, API_openWeAppSearch aPI_openWeAppSearch) {
        this.f261184a = gVar;
        this.f261185b = i;
        this.f261186c = aPI_openWeAppSearch;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        this.f261184a.mo109647a(this.f261185b, this.f261186c.mo115111l((String) null, ((API_openWeAppSearch.OpenSearchResponse) processResult).f242771d ? C86920e.f252311a : C86920e.f252314d, (JSONObject) null));
    }
}
