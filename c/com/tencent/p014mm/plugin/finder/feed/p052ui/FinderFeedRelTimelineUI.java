package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9737g2;
import kf1.C9763h2;
import kf1.C9854m5;
import kotlin.Metadata;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49203dy1;
import te3.C50159kp0;
import te3.db4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFeedRelTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lkf1/h2;", "Lkf1/g2;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI */
public final class FinderFeedRelTimelineUI extends FinderLoaderFeedUI<FinderFeedRelTimelineLoader, C9763h2, C9737g2> {

    /* renamed from: s */
    public C9737g2 f14278s;

    /* renamed from: t */
    public C9763h2 f14279t;

    /* renamed from: u */
    public FinderFeedRelTimelineLoader f14280u;

    /* renamed from: v */
    public final int f14281v = 2;

    /* renamed from: w */
    public long f14282w;

    /* renamed from: x */
    public int f14283x;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI$a */
    public static final class C2894a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedRelTimelineUI f14284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2894a(FinderFeedRelTimelineUI finderFeedRelTimelineUI) {
            super(1);
            this.f14284d = finderFeedRelTimelineUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            C9763h2 h2Var = this.f14284d.f14279t;
            View view = null;
            if (h2Var != null) {
                View loadMoreFooter = h2Var.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C9763h2 h2Var2 = this.f14284d.f14279t;
                if (h2Var2 != null) {
                    View loadMoreFooter2 = h2Var2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(this.f14284d.getResources().getColor(C0966R.color.FG_2));
                    }
                    C9763h2 h2Var3 = this.f14284d.f14279t;
                    if (h2Var3 != null) {
                        View loadMoreFooter3 = h2Var3.mo10308D().getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        C9763h2 h2Var4 = this.f14284d.f14279t;
                        if (h2Var4 != null) {
                            View loadMoreFooter4 = h2Var4.mo10308D().getLoadMoreFooter();
                            if (loadMoreFooter4 != null) {
                                view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                            }
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelTimelineUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelTimelineUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            return C13598b0.f38549a;
                        }
                        C87412m.m108603p("mViewCallback");
                        throw null;
                    }
                    C87412m.m108603p("mViewCallback");
                    throw null;
                }
                C87412m.m108603p("mViewCallback");
                throw null;
            }
            C87412m.m108603p("mViewCallback");
            throw null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 20;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f14280u;
        if (finderFeedRelTimelineLoader != null) {
            return finderFeedRelTimelineLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9737g2 g2Var = this.f14278s;
        if (g2Var != null) {
            return g2Var;
        }
        C87412m.m108603p("mPresenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9763h2 h2Var = this.f14279t;
        if (h2Var != null) {
            return h2Var;
        }
        C87412m.m108603p("mViewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        this.f14282w = getIntent().getLongExtra("FEED_ID", 0);
        this.f14283x = getIntent().getIntExtra("TAB_TYPE", 0);
        setMMTitle("");
        C9737g2 g2Var = new C9737g2(this, this.f14282w, this.f14281v);
        this.f14278s = g2Var;
        this.f14279t = new C9763h2(this, g2Var, this.f14281v, 20);
        FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = new FinderFeedRelTimelineLoader(this.f14282w, "", this.f14283x, (String) null, 0, false, (C89349b) null, (C49203dy1) null, (C89349b) null, (db4) null, 0, (C50159kp0) null, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), 0.0f, 0.0f, 28664, (C8480h) null);
        finderFeedRelTimelineLoader.f13552t = new C2894a(this);
        this.f14280u = finderFeedRelTimelineLoader;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ab9;
    }
}
