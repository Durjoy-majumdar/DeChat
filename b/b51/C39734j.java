package b51;

import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfoWrapper;
import com.tencent.p014mm.plugin.downloader.p796ui.GameCloudAppDownloadUI;
import qo3.C101218e0;

/* renamed from: b51.j */
public final class C39734j implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ GameCloudAppDownloadUI f106610a;

    /* renamed from: b */
    public final /* synthetic */ CloudGameAppInfoWrapper f106611b;

    public C39734j(GameCloudAppDownloadUI gameCloudAppDownloadUI, CloudGameAppInfoWrapper cloudGameAppInfoWrapper) {
        this.f106610a = gameCloudAppDownloadUI;
        this.f106611b = cloudGameAppInfoWrapper;
    }

    public final void dismiss() {
        GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f106610a;
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f106611b;
        GameCloudAppDownloadUI.m44406I7(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f110078g, cloudGameAppInfoWrapper.f110077f, cloudGameAppInfoWrapper.f110076e, true);
        this.f106610a.finish();
    }
}
