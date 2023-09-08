package com.tencent.p014mm.plugin.finder.feed.p052ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke1.C9603s;
import kf1.C9854m5;
import kf1.C9949r2;
import kf1.C9983t2;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13442s8;
import rs1.C13502w6;
import rx3.C13598b0;
import tf1.C13908i;
import tf1.C13913l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderTimelineFeedLoader;", "Lkf1/t2;", "Lkf1/r2;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI */
public final class FinderFollowTimelineUI extends FinderLoaderFeedUI<FinderTimelineFeedLoader, C9983t2, C9949r2> {

    /* renamed from: s */
    public C9949r2 f14320s;

    /* renamed from: t */
    public C9983t2 f14321t;

    /* renamed from: u */
    public FinderTimelineFeedLoader f14322u;

    /* renamed from: v */
    public final int f14323v = 2;

    /* renamed from: w */
    public final int f14324w = 3;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI$a */
    public static final class C2905a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderFollowTimelineUI f14325a;

        /* renamed from: b */
        public final /* synthetic */ FinderTimelineFeedLoader f14326b;

        public C2905a(FinderFollowTimelineUI finderFollowTimelineUI, FinderTimelineFeedLoader finderTimelineFeedLoader) {
            this.f14325a = finderFollowTimelineUI;
            this.f14326b = finderTimelineFeedLoader;
        }

        public void call(int i) {
            C9983t2 t2Var = this.f14325a.f14321t;
            if (t2Var != null) {
                RecyclerView.LayoutManager layoutManager = t2Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14326b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI$b */
    public static final class C2906b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTimelineUI f14327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2906b(FinderFollowTimelineUI finderFollowTimelineUI) {
            super(1);
            this.f14327d = finderFollowTimelineUI;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            C61926c.m72668M(new C3102a(iResponse, this.f14327d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 156;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderTimelineFeedLoader finderTimelineFeedLoader = this.f14322u;
        if (finderTimelineFeedLoader != null) {
            return finderTimelineFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9949r2 r2Var = this.f14320s;
        if (r2Var != null) {
            return r2Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9983t2 t2Var = this.f14321t;
        if (t2Var != null) {
            return t2Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        int i = getResources().getConfiguration().orientation;
        C9949r2 r2Var = new C9949r2(this, this.f14323v);
        this.f14320s = r2Var;
        this.f14321t = new C9983t2(this, r2Var, this.f14323v, 156);
        C13908i a = C13908i.f39090e.mo13382a(3);
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        FinderTimelineFeedLoader finderTimelineFeedLoader = new FinderTimelineFeedLoader(a, 1, ((C13442s8) rVar.mo62444c(context).mo75002a(C13442s8.class)).mo12853i3(this.f14324w), (C9603s) null, (C32227p) null, 24, (C8480h) null);
        finderTimelineFeedLoader.initFromCache(getIntent());
        finderTimelineFeedLoader.setInitDone(new C2905a(this, finderTimelineFeedLoader));
        finderTimelineFeedLoader.f13849o = new C2906b(this);
        this.f14322u = finderTimelineFeedLoader;
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public void finish() {
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cuy;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C13502w6.class);
    }
}
