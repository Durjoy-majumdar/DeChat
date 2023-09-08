package zf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C33631s;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import jq3.C9500j;
import kf1.C9732g;
import kf1.C9753h;

/* renamed from: zf1.e */
public final class C16147e extends C9732g {

    /* renamed from: h */
    public final C66792b f43337h;

    /* renamed from: i */
    public final int f43338i;

    /* renamed from: zf1.e$a */
    public static final class C16148a implements C60907t {

        /* renamed from: a */
        public final /* synthetic */ C16147e f43339a;

        public C16148a(C16147e eVar) {
            this.f43339a = eVar;
        }

        /* renamed from: a */
        public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(rVar, "wxRVData");
            int i = rVar.f173505a;
            if (i == 0 || i == 8) {
                LinkedList<C33631s> linkedList = rVar.f173510f;
                C16147e eVar = this.f43339a;
                for (C33631s sVar : linkedList) {
                    C9493c cVar = sVar.f91020a;
                    if (cVar instanceof BaseFinderFeed) {
                        C66800f.f191913a.mo90796d(cVar.getItemId(), eVar.f43338i, -1, "");
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16147e(MMActivity mMActivity, BaseFinderFeedLoader baseFinderFeedLoader, C66792b bVar, int i) {
        super(mMActivity, 0, 0, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
        C87412m.m108594g(bVar, "galleryConfig");
        this.f43337h = bVar;
        this.f43338i = i;
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        return this.f43337h.mo77476a(this.f43338i);
    }

    /* renamed from: n */
    public void mo2519n() {
        C9753h hVar = this.f30176f;
        if (hVar != null) {
            hVar.mo9297d(this.f30175e.getDataListJustForAdapter());
        }
    }

    /* renamed from: o */
    public void mo2521o() {
        BaseFeedLoader.requestLoadMore$default(this.f30175e, false, 1, (Object) null);
    }

    /* renamed from: q */
    public void mo2523q() {
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    public void requestRefresh() {
        this.f30175e.requestRefresh();
    }

    /* renamed from: t */
    public void mo2525t(C9753h hVar) {
        C87412m.m108594g(hVar, "callback");
        super.mo2525t(hVar);
        C9753h hVar2 = this.f30176f;
        WxRecyclerAdapter<?> D = hVar2 != null ? hVar2.mo10346D() : null;
        if (D != null) {
            D.f165737C = new C16148a(this);
        }
    }
}
