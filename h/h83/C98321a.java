package h83;

import com.tencent.p014mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: h83.a */
public class C98321a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ WebSearchWebVideoViewControlBar f288178d;

    public C98321a(WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar) {
        this.f288178d = webSearchWebVideoViewControlBar;
    }

    public boolean onTimerExpired() {
        this.f288178d.setVisibility(8);
        this.f288178d.f282905L.stopTimer();
        return false;
    }
}
