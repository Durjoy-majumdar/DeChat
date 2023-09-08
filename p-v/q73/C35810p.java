package q73;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import kr0.C33983a1;

/* renamed from: q73.p */
public final class C35810p implements C33983a1.C33985b {

    /* renamed from: a */
    public final /* synthetic */ String f95613a;

    public C35810p(String str) {
        this.f95613a = str;
    }

    /* renamed from: b */
    public final void mo56555b(C29315z2 z2Var, String str) {
        C87412m.m108594g(z2Var, "record");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "checkPreviewVersion(appId:" + this.f95613a + "), onSuccess(path:" + str + ')');
    }
}
