package h83;

import com.tencent.p014mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: h83.b */
public class C98322b implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ WebSearchWebVideoViewControlBar f288179d;

    public C98322b(WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar) {
        this.f288179d = webSearchWebVideoViewControlBar;
    }

    public boolean onTimerExpired() {
        WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f288179d;
        int i = WebSearchWebVideoViewControlBar.f282897P;
        return webSearchWebVideoViewControlBar.mo134724C();
    }
}
