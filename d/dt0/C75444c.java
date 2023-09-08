package dt0;

import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dt0.c */
public final class C75444c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f221758d;

    /* renamed from: e */
    public final /* synthetic */ int f221759e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandDesktopContainerView f221760f;

    public C75444c(int i, int i2, AppBrandDesktopContainerView appBrandDesktopContainerView) {
        this.f221758d = i;
        this.f221759e = i2;
        this.f221760f = appBrandDesktopContainerView;
    }

    public final void run() {
        Log.m105924i("MicroMsg.AppBrandDesktopContainerView", "notifyCloseHeader " + this.f221758d + ' ' + this.f221759e);
        this.f221760f.f197226f.mo94411X(false);
        AppBrandDesktopContainerView appBrandDesktopContainerView = this.f221760f;
        appBrandDesktopContainerView.getClass();
        Log.m105924i("MicroMsg.AppBrandDesktopContainerView", "hideDesktopViewDirectly");
        appBrandDesktopContainerView.f197224d.setVisibility(8);
        appBrandDesktopContainerView.f197225e.setVisibility(8);
        appBrandDesktopContainerView.f197226f.mo94411X(false);
    }
}
