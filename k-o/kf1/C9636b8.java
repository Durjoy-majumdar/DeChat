package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import gy3.C87412m;

/* renamed from: kf1.b8 */
public final class C9636b8 implements FinderVideoCore.C56519a {

    /* renamed from: a */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f29956a;

    public C9636b8(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        this.f29956a = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    /* renamed from: a */
    public boolean mo3742a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo3743b() {
        return true;
    }

    /* renamed from: c */
    public RecyclerView mo3744c() {
        C9745g8 g8Var = this.f29956a.f13143n;
        C87412m.m108591d(g8Var);
        return g8Var.getRecyclerView();
    }

    public DataBuffer<C0740i2> getData() {
        return this.f29956a.mo2583x().getDataList();
    }
}
