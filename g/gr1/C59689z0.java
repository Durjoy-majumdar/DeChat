package gr1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import di3.C86312j;
import ht1.C60157c5;

/* renamed from: gr1.z0 */
public final class C59689z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderThumbPlayerProxy f170517d;

    /* renamed from: e */
    public final /* synthetic */ String f170518e;

    public C59689z0(FinderThumbPlayerProxy finderThumbPlayerProxy, String str) {
        this.f170517d = finderThumbPlayerProxy;
        this.f170518e = str;
    }

    public final void run() {
        FinderThumbPlayerProxy finderThumbPlayerProxy = this.f170517d;
        if (finderThumbPlayerProxy.f161729W) {
            finderThumbPlayerProxy.f161752v = true;
            C60157c5 videoViewCallback = finderThumbPlayerProxy.getVideoViewCallback();
            if (videoViewCallback != null) {
                videoViewCallback.mo22957I3("", this.f170518e, Boolean.valueOf(this.f170517d.f161703B));
            }
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154546a.mo62457j1();
        }
    }
}
