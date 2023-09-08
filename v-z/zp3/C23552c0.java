package zp3;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.MediaBanner;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;

/* renamed from: zp3.c0 */
public final class C23552c0 extends RecyclerHorizontalViewPager {

    /* renamed from: F1 */
    public final /* synthetic */ MediaBanner<RecyclerView.C16631z> f67531F1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23552c0(MediaBanner<RecyclerView.C16631z> mediaBanner, Context context) {
        super(context);
        this.f67531F1 = mediaBanner;
        C87412m.m108593f(context, "context");
    }

    /* renamed from: x1 */
    public void mo4595x1(int i, boolean z, boolean z2) {
        super.mo4595x1(i, z, z2);
        this.f67531F1.setFocusPosition(i);
        this.f67531F1.getIndicator().setCurrentIndex(i);
        MediaBanner.C19881b pageChangeCallback = this.f67531F1.getPageChangeCallback();
        if (pageChangeCallback != null) {
            pageChangeCallback.mo26567a(i, z, z2);
        }
    }
}
