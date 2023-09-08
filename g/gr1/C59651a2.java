package gr1;

import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: gr1.a2 */
public final class C59651a2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170467d;

    public C59651a2(FinderVideoLayout finderVideoLayout) {
        this.f170467d = finderVideoLayout;
    }

    public final void run() {
        FinderVideoLayout finderVideoLayout = this.f170467d;
        boolean z = false;
        finderVideoLayout.f161862S = false;
        C59670o2 videoView = finderVideoLayout.getVideoView();
        if ((videoView != null ? videoView.getAlpha() : 0.0f) == 0.0f) {
            z = true;
        }
        if (!z) {
            C32227p<Boolean, FinderVideoLayout.C56521b, C13598b0> thumbShowCallback = this.f170467d.getThumbShowCallback();
            if (thumbShowCallback != null) {
                thumbShowCallback.invoke(Boolean.TRUE, this.f170467d.getPlayInfo());
            }
            C59670o2 videoView2 = this.f170467d.getVideoView();
            if (videoView2 != null) {
                videoView2.setAlpha(0.0f);
            }
            String fTPPTag = this.f170467d.getFTPPTag();
            Log.m105924i(fTPPTag, "[showThumb] " + this.f170467d.mo79549P());
        }
    }
}
