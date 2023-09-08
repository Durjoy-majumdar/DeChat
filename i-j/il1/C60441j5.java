package il1;

import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveLoopBannerView;

/* renamed from: il1.j5 */
public final class C60441j5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveLoopBannerView<Object, RecyclerView.C16631z> f172328d;

    /* renamed from: e */
    public final /* synthetic */ Message f172329e;

    public C60441j5(FinderLiveLoopBannerView<Object, RecyclerView.C16631z> finderLiveLoopBannerView, Message message) {
        this.f172328d = finderLiveLoopBannerView;
        this.f172329e = message;
    }

    public final void run() {
        FinderLiveLoopBannerView<Object, RecyclerView.C16631z> finderLiveLoopBannerView = this.f172328d;
        finderLiveLoopBannerView.f160086n.sendMessageDelayed(this.f172329e, finderLiveLoopBannerView.getLoopDuration());
    }
}
