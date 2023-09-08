package com.tencent.p014mm.plugin.finder.feed.p052ui;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFloatBallDetailLoader;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kf1.C9849m2;
import kf1.C9854m5;
import kf1.C9865n2;
import kotlin.Metadata;
import o40.C61926c;
import os1.C62168u;
import rs1.C13442s8;
import rs1.C63648v;
import rx3.C13598b0;
import tf1.C13913l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFloatBallDetailLoader;", "Lkf1/n2;", "Lkf1/m2;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI */
public class FinderFloatBallDetailUI extends FinderLoaderFeedUI<FinderFloatBallDetailLoader, C9865n2, C9849m2> {

    /* renamed from: s */
    public C9849m2 f14306s;

    /* renamed from: t */
    public C9865n2 f14307t;

    /* renamed from: u */
    public FinderFloatBallDetailLoader f14308u;

    /* renamed from: v */
    public boolean f14309v;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI$a */
    public static final class C2902a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderFloatBallDetailUI f14310a;

        /* renamed from: b */
        public final /* synthetic */ FinderFloatBallDetailLoader f14311b;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI$a$a */
        public static final class C2903a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderLinearLayoutManager f14312d;

            /* renamed from: e */
            public final /* synthetic */ FinderFloatBallDetailLoader f14313e;

            /* renamed from: f */
            public final /* synthetic */ FinderFloatBallDetailUI f14314f;

            /* renamed from: g */
            public final /* synthetic */ RecyclerView f14315g;

            /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI$a$a$a */
            public static final class C2904a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ FinderLinearLayoutManager f14316d;

                /* renamed from: e */
                public final /* synthetic */ RecyclerView f14317e;

                /* renamed from: f */
                public final /* synthetic */ FinderFloatBallDetailUI f14318f;

                /* renamed from: g */
                public final /* synthetic */ long f14319g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2904a(FinderLinearLayoutManager finderLinearLayoutManager, RecyclerView recyclerView, FinderFloatBallDetailUI finderFloatBallDetailUI, long j) {
                    super(0);
                    this.f14316d = finderLinearLayoutManager;
                    this.f14317e = recyclerView;
                    this.f14318f = finderFloatBallDetailUI;
                    this.f14319g = j;
                }

                public Object invoke() {
                    FinderVideoLayout finderVideoLayout;
                    C9493c cVar;
                    RecyclerView.C16631z I0 = this.f14317e.mo17023I0(this.f14316d.mo16957C());
                    C55018j0 j0Var = null;
                    C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
                    float floatExtra = this.f14318f.getIntent().getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f);
                    ((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87219c3((oVar == null || (cVar = (C9493c) oVar.f173503E) == null) ? 0 : cVar.getItemId());
                    C9493c cVar2 = oVar != null ? (C9493c) oVar.f173503E : null;
                    if (cVar2 instanceof C55018j0) {
                        j0Var = (C55018j0) cVar2;
                    }
                    if (j0Var != null) {
                        j0Var.f154481f = true;
                    }
                    if (!(oVar == null || (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) == null)) {
                        FinderVideoLayout.m65079J(finderVideoLayout, this.f14319g, 0, floatExtra, false, (ITPPlayerListener.IOnSeekCompleteListener) null, 26, (Object) null);
                    }
                    return C13598b0.f38549a;
                }
            }

            public C2903a(FinderLinearLayoutManager finderLinearLayoutManager, FinderFloatBallDetailLoader finderFloatBallDetailLoader, FinderFloatBallDetailUI finderFloatBallDetailUI, RecyclerView recyclerView) {
                this.f14312d = finderLinearLayoutManager;
                this.f14313e = finderFloatBallDetailLoader;
                this.f14314f = finderFloatBallDetailUI;
                this.f14315g = recyclerView;
            }

            public final void run() {
                FinderLinearLayoutManager finderLinearLayoutManager = this.f14312d;
                int initPos = this.f14313e.getInitPos();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(initPos));
                C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI$initOnCreate$1$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI$initOnCreate$1$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                long longExtra = this.f14314f.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0);
                if (longExtra > 0) {
                    C61926c.m72666K(0, new C2904a(this.f14312d, this.f14315g, this.f14314f, longExtra));
                }
            }
        }

        public C2902a(FinderFloatBallDetailUI finderFloatBallDetailUI, FinderFloatBallDetailLoader finderFloatBallDetailLoader) {
            this.f14310a = finderFloatBallDetailUI;
            this.f14311b = finderFloatBallDetailLoader;
        }

        public void call(int i) {
            C9865n2 n2Var = this.f14310a.f14307t;
            if (n2Var != null) {
                RecyclerView recyclerView = n2Var.getRecyclerView();
                if (recyclerView != null) {
                    FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f14311b;
                    FinderFloatBallDetailUI finderFloatBallDetailUI = this.f14310a;
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                    recyclerView.post(new C2903a((FinderLinearLayoutManager) layoutManager, finderFloatBallDetailLoader, finderFloatBallDetailUI, recyclerView));
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 113;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f14308u;
        if (finderFloatBallDetailLoader != null) {
            return finderFloatBallDetailLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9849m2 m2Var = this.f14306s;
        if (m2Var != null) {
            return m2Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9865n2 n2Var = this.f14307t;
        if (n2Var != null) {
            return n2Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        this.f14309v = getIntent().getByteArrayExtra("KEY_FLOAT_BALL_INFO") != null;
        C9849m2 m2Var = new C9849m2(this);
        this.f14306s = m2Var;
        this.f14307t = new C9865n2(this, m2Var, 2, mo2194I7());
        C39818r rVar = C39818r.f106831a;
        FinderFloatBallDetailLoader finderFloatBallDetailLoader = new FinderFloatBallDetailLoader(((C13442s8) rVar.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
        finderFloatBallDetailLoader.f13600d = getIntent().getLongExtra("KEY_CACHE_OBJECT_ID", 0);
        String stringExtra = getIntent().getStringExtra("KEY_CACHE_OBJECT_NONCE_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        finderFloatBallDetailLoader.f13601e = stringExtra;
        finderFloatBallDetailLoader.initFromCache(getIntent());
        finderFloatBallDetailLoader.setInitDone(new C2902a(this, finderFloatBallDetailLoader));
        this.f14308u = finderFloatBallDetailLoader;
        ((C63648v) rVar.mo62444c(this).mo75002a(C63648v.class)).f180443i = this.f14309v;
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359673a81;
    }
}
