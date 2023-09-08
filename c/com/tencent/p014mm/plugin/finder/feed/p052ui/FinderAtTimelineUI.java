package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import kf1.C9616a;
import kf1.C9630b;
import kf1.C9854m5;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import org.json.JSONObject;
import q31.C118148a;
import rs1.C13442s8;
import rs1.C63575n3;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90363p0;
import te3.C49712hj1;
import tf1.C13908i;
import tf1.C13913l;
import vf1.C14775i;
import vf1.C14780j;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/loader/FinderAtFeedLoader;", "Lkf1/b;", "Lkf1/a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI */
public final class FinderAtTimelineUI extends FinderLoaderFeedUI<FinderAtFeedLoader, C9630b, C9616a> {

    /* renamed from: G */
    public static ConcurrentHashMap<Long, FinderItem> f14230G = new ConcurrentHashMap<>();

    /* renamed from: A */
    public final C13601g f14231A = C36568h.m40985a(new C2884g(this));

    /* renamed from: B */
    public final C13601g f14232B = C36568h.m40985a(new C2888k(this));

    /* renamed from: C */
    public final C13601g f14233C = C36568h.m40985a(new C2879b(this));

    /* renamed from: D */
    public final int f14234D = 2;

    /* renamed from: E */
    public final MMHandler f14235E;

    /* renamed from: F */
    public int f14236F;

    /* renamed from: s */
    public final String f14237s = "Finder.FinderAtTimelineUI";

    /* renamed from: t */
    public int f14238t = -1;

    /* renamed from: u */
    public C9616a f14239u;

    /* renamed from: v */
    public C9630b f14240v;

    /* renamed from: w */
    public FinderAtFeedLoader f14241w;

    /* renamed from: x */
    public long f14242x;

    /* renamed from: y */
    public final C13601g f14243y = C36568h.m40985a(new C2889l(this));

    /* renamed from: z */
    public final C13601g f14244z = C36568h.m40985a(new C2878a(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$a */
    public static final class C2878a extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14245d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2878a(FinderAtTimelineUI finderAtTimelineUI) {
            super(0);
            this.f14245d = finderAtTimelineUI;
        }

        public Object invoke() {
            return ((C13442s8) C39818r.f106831a.mo62444c(this.f14245d).mo75002a(C13442s8.class)).mo12861q3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$b */
    public static final class C2879b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2879b(FinderAtTimelineUI finderAtTimelineUI) {
            super(0);
            this.f14246d = finderAtTimelineUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14246d.getIntent().getIntExtra("KEY_FROM_SCENE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$c */
    public static final class C2880c implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14247d;

        public C2880c(FinderAtTimelineUI finderAtTimelineUI) {
            this.f14247d = finderAtTimelineUI;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, StateEvent.Name.MESSAGE);
            int i = message.what;
            int i2 = -1;
            if (i == 1000) {
                C9630b bVar = this.f14247d.f14240v;
                if (bVar != null) {
                    RecyclerView.LayoutManager layoutManager = bVar.mo10308D().getRecyclerView().getLayoutManager();
                    FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
                    if (finderLinearLayoutManager != null) {
                        i2 = finderLinearLayoutManager.mo17004z();
                    }
                    FinderAtFeedLoader finderAtFeedLoader = this.f14247d.f14241w;
                    if (finderAtFeedLoader != null) {
                        finderAtFeedLoader.mo3453d(i2, true);
                    } else {
                        C87412m.m108603p("feedLoader");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else if (i == 1001) {
                C9630b bVar2 = this.f14247d.f14240v;
                if (bVar2 != null) {
                    RecyclerView.LayoutManager layoutManager2 = bVar2.mo10308D().getRecyclerView().getLayoutManager();
                    FinderLinearLayoutManager finderLinearLayoutManager2 = layoutManager2 instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager2 : null;
                    if (finderLinearLayoutManager2 != null) {
                        i2 = finderLinearLayoutManager2.mo17004z();
                    }
                    Object obj = message.obj;
                    if (obj != null) {
                        FinderAtFeedLoader finderAtFeedLoader2 = this.f14247d.f14241w;
                        if (finderAtFeedLoader2 != null) {
                            DataBuffer dataListJustForAdapter = finderAtFeedLoader2.getDataListJustForAdapter();
                            if (!(i2 >= 0 && i2 < dataListJustForAdapter.size())) {
                                dataListJustForAdapter = null;
                            }
                            C0740i2 i2Var = dataListJustForAdapter != null ? (C0740i2) dataListJustForAdapter.get(i2) : null;
                            C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                            if (C87412m.m108589b(obj, Long.valueOf(((BaseFinderFeed) i2Var).mo3513o().getId()))) {
                                Log.m105924i(this.f14247d.f14237s, "DISMISS_AT_FEED_TIP feedId:" + obj + " pos:" + i2);
                                FinderAtFeedLoader finderAtFeedLoader3 = this.f14247d.f14241w;
                                if (finderAtFeedLoader3 != null) {
                                    finderAtFeedLoader3.mo3453d(i2, false);
                                } else {
                                    C87412m.m108603p("feedLoader");
                                    throw null;
                                }
                            }
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
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$d */
    public static final class C2881d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2881d(FinderAtTimelineUI finderAtTimelineUI) {
            super(0);
            this.f14248d = finderAtTimelineUI;
        }

        public Object invoke() {
            TextView textView;
            TextView textView2;
            C9630b bVar = this.f14248d.f14240v;
            View view = null;
            if (bVar != null) {
                View loadMoreFooter = bVar.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C9630b bVar2 = this.f14248d.f14240v;
                if (bVar2 != null) {
                    View loadMoreFooter2 = bVar2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(this.f14248d.getResources().getColor(C0966R.color.FG_2));
                    }
                    C9630b bVar3 = this.f14248d.f14240v;
                    if (bVar3 != null) {
                        View loadMoreFooter3 = bVar3.mo10308D().getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        C9630b bVar4 = this.f14248d.f14240v;
                        if (bVar4 != null) {
                            View loadMoreFooter4 = bVar4.mo10308D().getLoadMoreFooter();
                            if (loadMoreFooter4 != null) {
                                view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                            }
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            return C13598b0.f38549a;
                        }
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$e */
    public static final class C2882e extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2882e(FinderAtTimelineUI finderAtTimelineUI) {
            super(1);
            this.f14249d = finderAtTimelineUI;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            FinderAtFeedLoader finderAtFeedLoader = this.f14249d.f14241w;
            if (finderAtFeedLoader != null) {
                if (finderAtFeedLoader.getSize() <= 0) {
                    View findViewById = this.f14249d.findViewById(C0966R.C0970id.g3m);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById2 = this.f14249d.findViewById(C0966R.C0970id.knh);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById3 = this.f14249d.findViewById(C0966R.C0970id.kne);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view3 = findViewById3;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View findViewById4 = this.f14249d.findViewById(C0966R.C0970id.g3m);
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = findViewById4;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("feedLoader");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$f */
    public static final class C2883f implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderAtTimelineUI f14250a;

        /* renamed from: b */
        public final /* synthetic */ FinderAtFeedLoader f14251b;

        public C2883f(FinderAtTimelineUI finderAtTimelineUI, FinderAtFeedLoader finderAtFeedLoader) {
            this.f14250a = finderAtTimelineUI;
            this.f14251b = finderAtFeedLoader;
        }

        public void call(int i) {
            C9630b bVar = this.f14250a.f14240v;
            if (bVar != null) {
                RecyclerView.LayoutManager layoutManager = bVar.mo10308D().getRecyclerView().getLayoutManager();
                FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
                if (finderLinearLayoutManager != null) {
                    int initPos = this.f14251b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                if (i > 0) {
                    View findViewById = this.f14250a.findViewById(C0966R.C0970id.g3m);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View findViewById2 = this.f14250a.findViewById(C0966R.C0970id.g3m);
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById3 = this.f14250a.findViewById(C0966R.C0970id.kne);
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view3 = findViewById3;
                    C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initOnCreate$1$3", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this.f14250a).mo75002a(C63575n3.class);
                C9630b bVar2 = this.f14250a.f14240v;
                if (bVar2 != null) {
                    n3Var.mo88422e3(bVar2.getRecyclerView());
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$g */
    public static final class C2884g extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2884g(FinderAtTimelineUI finderAtTimelineUI) {
            super(0);
            this.f14252d = finderAtTimelineUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f14252d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$h */
    public static final class C2885h implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderAtTimelineUI f14253a;

        public C2885h(FinderAtTimelineUI finderAtTimelineUI) {
            this.f14253a = finderAtTimelineUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            FinderAtTimelineUI finderAtTimelineUI = this.f14253a;
            ConcurrentHashMap<Long, FinderItem> concurrentHashMap = FinderAtTimelineUI.f14230G;
            return finderAtTimelineUI.mo2952X7() ? C90363p0.m113143b(new C13604l("is_author", 0)) : C90363p0.m113143b(new C13604l("is_author", 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$i */
    public static final class C2886i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14254d;

        public C2886i(FinderAtTimelineUI finderAtTimelineUI) {
            this.f14254d = finderAtTimelineUI;
        }

        public final void run() {
            FinderAtTimelineUI.m2707V7(this.f14254d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$j */
    public static final class C2887j implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderAtTimelineUI f14255a;

        public C2887j(FinderAtTimelineUI finderAtTimelineUI) {
            this.f14255a = finderAtTimelineUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            FinderAtTimelineUI finderAtTimelineUI = this.f14255a;
            ConcurrentHashMap<Long, FinderItem> concurrentHashMap = FinderAtTimelineUI.f14230G;
            return finderAtTimelineUI.mo2952X7() ? C90363p0.m113143b(new C13604l("is_author", 0)) : C90363p0.m113143b(new C13604l("is_author", 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$k */
    public static final class C2888k extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2888k(FinderAtTimelineUI finderAtTimelineUI) {
            super(0);
            this.f14256d = finderAtTimelineUI;
        }

        public Object invoke() {
            String stringExtra = this.f14256d.getIntent().getStringExtra("KEY_TITLE");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI$l */
    public static final class C2889l extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtTimelineUI f14257d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2889l(FinderAtTimelineUI finderAtTimelineUI) {
            super(0);
            this.f14257d = finderAtTimelineUI;
        }

        public Object invoke() {
            String stringExtra = this.f14257d.getIntent().getStringExtra("KEY_USERNAME");
            return stringExtra == null ? C66785b.f191882e.mo90662O5() : stringExtra;
        }
    }

    public FinderAtTimelineUI() {
        new FinderAtTimelineUI$updateAtFeedListener$1(this, C40008f.f107254d);
        this.f14235E = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C2880c(this));
        this.f14236F = -1;
    }

    /* renamed from: V7 */
    public static final void m2707V7(FinderAtTimelineUI finderAtTimelineUI) {
        FinderItem o;
        Class cls = C58417y0.class;
        C9630b bVar = finderAtTimelineUI.f14240v;
        C49712hj1 hj12 = null;
        if (bVar != null) {
            RecyclerView.LayoutManager layoutManager = bVar.getRecyclerView().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            int z = linearLayoutManager != null ? linearLayoutManager.mo17004z() : -1;
            if (finderAtTimelineUI.f14238t != z) {
                FinderAtFeedLoader finderAtFeedLoader = finderAtTimelineUI.f14241w;
                if (finderAtFeedLoader != null) {
                    DataBuffer dataListJustForAdapter = finderAtFeedLoader.getDataListJustForAdapter();
                    if (!(dataListJustForAdapter.size() > z && z >= 0)) {
                        dataListJustForAdapter = null;
                    }
                    C0740i2 i2Var = dataListJustForAdapter != null ? (C0740i2) dataListJustForAdapter.get(z) : null;
                    BaseFinderFeed baseFinderFeed = i2Var instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var : null;
                    if (!(baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || o.getMentionListSelected() != 3)) {
                        String xx02 = ((C58417y0) C86312j.m106911c(cls)).xx0(o.getId());
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("feedid", xx02);
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   … id)\n        }.toString()");
                        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(finderAtTimelineUI);
                        if (f != null) {
                            hj12 = f.mo12861q3();
                        }
                        y0Var.Fy0(0, "if_show_mentionedfeed", jSONObject2, hj12);
                    }
                    finderAtTimelineUI.f14238t = z;
                    return;
                }
                C87412m.m108603p("feedLoader");
                throw null;
            }
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        if (mo2951W7() == 1) {
            return mo2952X7() ? 62 : 63;
        }
        return 13;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderAtFeedLoader finderAtFeedLoader = this.f14241w;
        if (finderAtFeedLoader != null) {
            return finderAtFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9616a aVar = this.f14239u;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9630b bVar = this.f14240v;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        String str = (String) ((C36570n) this.f14232B).getValue();
        C87412m.m108593f(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (str.length() == 0) {
            setMMTitle((int) C0966R.string.d19);
        } else {
            setMMTitle((String) ((C36570n) this.f14232B).getValue());
        }
        this.f14242x = getIntent().getLongExtra("KEY_CACHE_ID", 0);
        String str2 = this.f14237s;
        Log.m105924i(str2, "[initOnCreate] cacheId:" + this.f14242x + " username=" + ((String) ((C36570n) this.f14243y).getValue()) + " fromScene=" + mo2951W7());
        f14230G.clear();
        if (mo2951W7() == 1) {
            C115669n.INSTANCE.mo160131h(21206, Integer.valueOf(C87412m.m108589b((String) ((C36570n) this.f14243y).getValue(), C66785b.f191882e.mo90662O5()) ? 1 : 0), 2);
        }
        boolean X7 = mo2952X7();
        String str3 = (String) ((C36570n) this.f14243y).getValue();
        C87412m.m108593f(str3, "username");
        C9616a aVar = new C9616a(this, X7, str3, this.f14234D, mo2951W7(), (C49712hj1) ((C36570n) this.f14244z).getValue());
        this.f14239u = aVar;
        this.f14240v = new C9630b(this, aVar, this.f14234D, mo2194I7(), mo2951W7() != 1);
        View findViewById = findViewById(C0966R.C0970id.g3m);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C13908i iVar = C13908i.FEED_AT_TIMELINE;
        String str4 = (String) ((C36570n) this.f14243y).getValue();
        C87412m.m108593f(str4, "username");
        FinderAtFeedLoader finderAtFeedLoader = new FinderAtFeedLoader(iVar, str4, (C49712hj1) ((C36570n) this.f14244z).getValue());
        finderAtFeedLoader.initFromCache(getIntent());
        finderAtFeedLoader.f15439n = getIntent().getIntExtra("key_from_page", 100);
        finderAtFeedLoader.f15435g = new C2881d(this);
        finderAtFeedLoader.f15436h = new C2882e(this);
        finderAtFeedLoader.setInitDone(new C2883f(this, finderAtFeedLoader));
        this.f14241w = finderAtFeedLoader;
        C9630b bVar = this.f14240v;
        if (bVar != null) {
            bVar.mo10308D().getRecyclerView().mo17043c(new C14780j(this));
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    /* renamed from: W7 */
    public final int mo2951W7() {
        return ((Number) ((C36570n) this.f14233C).getValue()).intValue();
    }

    /* renamed from: X7 */
    public final boolean mo2952X7() {
        return ((Boolean) ((C36570n) this.f14231A).getValue()).booleanValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359677a91;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        C11345b bVar = C11345b.FinderAtTimelineUI;
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C2885h(this));
        if (getIntent().getBooleanExtra("force_show_ad_tip", false)) {
            C9630b bVar2 = this.f14240v;
            if (bVar2 != null) {
                bVar2.getRecyclerView().mo17043c(new C14775i(this));
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        C9630b bVar3 = this.f14240v;
        if (bVar3 != null) {
            bVar3.getRecyclerView().post(new C2886i(this));
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar).mo86179qs(this, C76986a.Finder).E60(this, new C2887j(this));
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        f14230G.clear();
        this.f14235E.removeCallbacksAndMessages((Object) null);
    }
}
