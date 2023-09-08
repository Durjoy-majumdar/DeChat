package q73;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import kr0.C33983a1;

/* renamed from: q73.i0 */
public final class C35808i0 implements C33983a1.C33985b {

    /* renamed from: a */
    public final /* synthetic */ String f95611a;

    public C35808i0(String str) {
        this.f95611a = str;
    }

    /* renamed from: b */
    public final void mo56555b(C29315z2 z2Var, String str) {
        C87412m.m108594g(z2Var, "record");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        Log.m105924i("MicroMsg.WebCanvasStorageLogic", "triggerPreDownload(appId:" + this.f95611a + "), onSuccess(path:" + str + ')');
    }
}
