package q73;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import kotlin.Result;
import kr0.C33983a1;
import wx3.C15601d;

/* renamed from: q73.g0 */
public final class C35807g0 implements C33983a1.C33985b {

    /* renamed from: a */
    public final /* synthetic */ String f95609a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<Boolean> f95610b;

    public C35807g0(String str, C15601d<? super Boolean> dVar) {
        this.f95609a = str;
        this.f95610b = dVar;
    }

    /* renamed from: b */
    public final void mo56555b(C29315z2 z2Var, String str) {
        C87412m.m108594g(z2Var, "record");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        Log.m105924i("MicroMsg.WebCanvasStorageLogic", "fetchBizPrefetchPkg(appId:" + this.f95609a + "), onSuccess(path:" + str + ')');
        if (C86013q1.m106450k(str)) {
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", "fetchBizPrefetchPkg download success. appId=" + this.f95609a);
            C15601d<Boolean> dVar = this.f95610b;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            return;
        }
        C15601d<Boolean> dVar2 = this.f95610b;
        Result.Companion companion2 = Result.Companion;
        dVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
    }
}
