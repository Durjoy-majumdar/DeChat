package zp3;

import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.MediaBanner;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;

/* renamed from: zp3.y */
public final class C23573y implements RecyclerHorizontalViewPager.C57876b {

    /* renamed from: a */
    public float f67572a;

    /* renamed from: b */
    public final /* synthetic */ MediaBanner<RecyclerView.C16631z> f67573b;

    public C23573y(MediaBanner<RecyclerView.C16631z> mediaBanner) {
        this.f67573b = mediaBanner;
    }

    /* renamed from: a */
    public void mo37032a(MotionEvent motionEvent) {
        RecyclerView.LayoutManager layoutManager;
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 1) {
            MediaBanner<RecyclerView.C16631z> mediaBanner = this.f67573b;
            mediaBanner.getClass();
            Log.m105924i("MicroMsg.MediaBanner", "[pauseLoopPlay] isAutoPlay:" + mediaBanner.f56646n);
            if (mediaBanner.f56646n) {
                mediaBanner.f56652t.removeMessages(1);
                mediaBanner.f56652t.sendEmptyMessageDelayed(1, 2000);
            }
        }
        RecyclerView parentRecyclerView = this.f67573b.getParentRecyclerView();
        LinearLayoutManager linearLayoutManager = null;
        RecyclerView.LayoutManager layoutManager2 = parentRecyclerView != null ? parentRecyclerView.getLayoutManager() : null;
        if ((layoutManager2 instanceof MediaBanner.C19880a) && (layoutManager = this.f67573b.getPagerView().getLayoutManager()) != null) {
            if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getItemCount() > 1) {
                linearLayoutManager = layoutManager;
            }
            if (linearLayoutManager != null) {
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                if (motionEvent.getAction() == 0) {
                    this.f67572a = motionEvent.getRawX();
                } else if (motionEvent.getAction() == 2 && Math.abs(motionEvent.getRawX() - this.f67572a) >= 10.0f) {
                    ((MediaBanner.C19880a) layoutManager2).mo26566o(false);
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ((MediaBanner.C19880a) layoutManager2).mo26566o(true);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo37033b(int i, MotionEvent motionEvent, boolean z) {
        C87412m.m108594g(motionEvent, "event");
        this.f67573b.getClass();
        return z;
    }
}
