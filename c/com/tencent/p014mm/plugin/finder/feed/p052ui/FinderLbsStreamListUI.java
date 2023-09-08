package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C7335d;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kf1.C9854m5;
import kf1.C9906o3;
import kf1.C9924p3;
import kotlin.Metadata;
import l31.C61212e;
import o31.C76986a;
import o40.C61926c;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import tf1.C13913l;
import u24.C90599h;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderLbsStreamFeedLoader;", "Lkf1/p3;", "Lkf1/o3;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI */
public final class FinderLbsStreamListUI extends FinderLoaderFeedUI<FinderLbsStreamFeedLoader, C9924p3, C9906o3> {

    /* renamed from: s */
    public C9906o3 f14472s;

    /* renamed from: t */
    public C9924p3 f14473t;

    /* renamed from: u */
    public FinderLbsStreamFeedLoader f14474u;

    /* renamed from: v */
    public boolean f14475v;

    /* renamed from: w */
    public final int f14476w = 2;

    /* renamed from: x */
    public final C2953d f14477x = new C2953d();

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI$a */
    public static final class C2950a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderLbsStreamListUI f14478a;

        /* renamed from: b */
        public final /* synthetic */ FinderLbsStreamFeedLoader f14479b;

        public C2950a(FinderLbsStreamListUI finderLbsStreamListUI, FinderLbsStreamFeedLoader finderLbsStreamFeedLoader) {
            this.f14478a = finderLbsStreamListUI;
            this.f14479b = finderLbsStreamFeedLoader;
        }

        public void call(int i) {
            C9924p3 p3Var = this.f14478a.f14473t;
            if (p3Var != null) {
                RecyclerView.LayoutManager layoutManager = p3Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14479b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI$b */
    public static final class C2951b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLbsStreamListUI f14480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2951b(FinderLbsStreamListUI finderLbsStreamListUI) {
            super(1);
            this.f14480d = finderLbsStreamListUI;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            C61926c.m72668M(new C3109h(this.f14480d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI$c */
    public static final class C2952c implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderLbsStreamListUI f14481a;

        public C2952c(FinderLbsStreamListUI finderLbsStreamListUI) {
            this.f14481a = finderLbsStreamListUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14481a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str3 = "";
            if (Wb == null) {
                Wb = str3;
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str3;
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 != null) {
                str3 = S0;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str3);
            lVarArr[3] = new C13604l("extra_info", valueOf);
            Intent intent2 = this.f14481a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI$d */
    public static final class C2953d extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$onHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$onHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$onHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "16", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$onHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 16;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = this.f14474u;
        if (finderLbsStreamFeedLoader != null) {
            return finderLbsStreamFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9906o3 o3Var = this.f14472s;
        if (o3Var != null) {
            return o3Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9924p3 p3Var = this.f14473t;
        if (p3Var != null) {
            return p3Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        Class cls = C61212e.class;
        String stringExtra = getIntent().getStringExtra("KEY_UI_TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        setTitle(stringExtra);
        setMMTitle(getTitle());
        this.f14475v = getIntent().getBooleanExtra("KEY_SAVE_RESULT", false);
        C9906o3 o3Var = new C9906o3(this, this.f14476w, 0, 4, (C8480h) null);
        this.f14472s = o3Var;
        this.f14473t = new C9924p3(this, o3Var, this.f14476w, 16);
        FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = new FinderLbsStreamFeedLoader(C66785b.f191882e.mo90662O5(), ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
        finderLbsStreamFeedLoader.initFromCache(getIntent());
        finderLbsStreamFeedLoader.setInitDone(new C2950a(this, finderLbsStreamFeedLoader));
        finderLbsStreamFeedLoader.f13689e = new C2951b(this);
        this.f14474u = finderLbsStreamFeedLoader;
        C9924p3 p3Var = this.f14473t;
        if (p3Var != null) {
            p3Var.getRecyclerView().mo17043c(this.f14477x);
            ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
            ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderLbsStreamListUI");
            ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 24184);
            ((C61212e) C86312j.m106911c(cls)).E60(this, new C2952c(this));
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void finish() {
        if (this.f14475v) {
            C9924p3 p3Var = this.f14473t;
            if (p3Var != null) {
                RecyclerView.LayoutManager layoutManager = p3Var.getRecyclerView().getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    C58784w3 w3Var = C58784w3.f168295a;
                    FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = this.f14474u;
                    if (finderLbsStreamFeedLoader != null) {
                        setResult(-1, w3Var.mo83970v(finderLbsStreamFeedLoader, (LinearLayoutManager) layoutManager));
                    } else {
                        C87412m.m108603p("feedLoader");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.adg;
    }

    public void onDestroy() {
        C9924p3 p3Var = this.f14473t;
        if (p3Var != null) {
            p3Var.getRecyclerView().mo17098m1(this.f14477x);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "16", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "16", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
    }
}
