package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;

/* renamed from: kf1.ib */
public final class C9803ib implements FinderVideoCore.C56519a {

    /* renamed from: a */
    public final /* synthetic */ C9878n9 f30339a;

    /* renamed from: b */
    public final /* synthetic */ FinderTimelinePresenter f30340b;

    public C9803ib(C9878n9 n9Var, FinderTimelinePresenter finderTimelinePresenter) {
        this.f30339a = n9Var;
        this.f30340b = finderTimelinePresenter;
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
        return this.f30339a.getRecyclerView();
    }

    public DataBuffer<C0740i2> getData() {
        return this.f30340b.f13285z.getDataListJustForAdapter();
    }
}
