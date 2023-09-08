package dx2;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import kr0.C33983a1;

/* renamed from: dx2.a */
public final class C31341a implements C33983a1.C33985b {

    /* renamed from: a */
    public final /* synthetic */ String f83888a;

    public C31341a(String str) {
        this.f83888a = str;
    }

    /* renamed from: b */
    public final void mo56555b(C29315z2 z2Var, String str) {
        C87412m.m108594g(z2Var, "record");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        Log.m105924i("MicroMsg.SurfaceApp.PackageDownloadManager", "checkPreviewVersion(appId:" + this.f83888a + "), onSuccess(path:" + str + ')');
    }
}
