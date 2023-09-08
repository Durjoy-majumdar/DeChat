package xm1;

import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import qq3.C63318b;

/* renamed from: xm1.u */
public final class C15850u implements C63318b {

    /* renamed from: a */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f42678a;

    public C15850u(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback) {
        this.f42678a = liveEntranceFragmentViewCallback;
    }

    /* renamed from: a */
    public void mo3374a(boolean z) {
        if (z) {
            this.f42678a.mo3624d(true, "rv-auto-refresh", true);
        } else {
            this.f42678a.mo3624d(true, "rv-refresh", false);
        }
    }

    public void onLoadMore() {
        this.f42678a.mo3624d(false, "rv-load-more", false);
    }
}
