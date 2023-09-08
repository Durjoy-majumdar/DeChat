package eg1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;

/* renamed from: eg1.i0 */
public final class C58580i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveViewCallback f167706d;

    public C58580i0(FinderLiveViewCallback finderLiveViewCallback) {
        this.f167706d = finderLiveViewCallback;
    }

    public final void run() {
        RecyclerView.C16613e adapter = this.f167706d.f159220q.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
            this.f167706d.mo77515G0(1, 600);
        }
    }
}
