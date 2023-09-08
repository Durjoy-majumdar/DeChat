package kz1;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService;

/* renamed from: kz1.f */
public final class C88340f<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public static final C88340f<R> f255331a = new C88340f<>();

    public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        GameLiveAppbrandProcessService.EnterFinderLiveResult enterFinderLiveResult = (GameLiveAppbrandProcessService.EnterFinderLiveResult) processResult;
    }
}
