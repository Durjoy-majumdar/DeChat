package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import jq3.C60898l;

/* renamed from: kf1.jb */
public final class C9816jb extends C87413o implements C32226l<Integer, C0740i2> {

    /* renamed from: d */
    public final /* synthetic */ C9878n9 f30353d;

    /* renamed from: e */
    public final /* synthetic */ FinderTimelinePresenter f30354e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9816jb(C9878n9 n9Var, FinderTimelinePresenter finderTimelinePresenter) {
        super(1);
        this.f30353d = n9Var;
        this.f30354e = finderTimelinePresenter;
    }

    public Object invoke(Object obj) {
        C0740i2 i2Var;
        int intValue = ((Number) obj).intValue();
        RecyclerView.C16613e adapter = this.f30353d.getRecyclerView().getAdapter();
        int c6 = adapter != null ? intValue - ((C60898l) adapter).mo85796c6() : -1;
        Log.m105918d("Finder.FinderCommentPreloader", "preloadFirstPageComment, pos: " + c6);
        int size = this.f30354e.f13285z.getDataListJustForAdapter().size();
        if (size <= 0) {
            return null;
        }
        boolean z = false;
        if (c6 >= 0 && c6 < size) {
            z = true;
        }
        if (!z || (i2Var = (C0740i2) this.f30354e.f13285z.safeGet(c6)) == null || !(i2Var instanceof BaseFinderFeed)) {
            return null;
        }
        return (BaseFinderFeed) i2Var;
    }
}
