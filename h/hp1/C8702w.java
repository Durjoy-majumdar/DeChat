package hp1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import gy3.C87412m;

/* renamed from: hp1.w */
public final class C8702w implements FinderVideoCore.C56519a {

    /* renamed from: a */
    public final /* synthetic */ FinderFeedSearchUI f27926a;

    public C8702w(FinderFeedSearchUI finderFeedSearchUI) {
        this.f27926a = finderFeedSearchUI;
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
        RecyclerView recyclerView = this.f27926a.f16470I;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public DataBuffer<C0740i2> getData() {
        return this.f27926a.f16513x;
    }
}
