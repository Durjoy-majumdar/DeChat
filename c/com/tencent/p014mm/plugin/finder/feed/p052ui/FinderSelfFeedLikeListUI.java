package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.p056ui.C3845j3;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C9330k3;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C50581nr0;
import te3.C51431tq1;
import te3.C52136ym0;
import te3.C52283zm0;
import te3.C64707sc1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "Lht1/p5;", "Lte3/sc1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelfFeedLikeListUI */
public final class FinderSelfFeedLikeListUI extends MMFinderUI implements C11385n, C8794p5<C64707sc1> {

    /* renamed from: A */
    public static final /* synthetic */ int f14802A = 0;

    /* renamed from: o */
    public WxRecyclerView f14803o;

    /* renamed from: p */
    public TextView f14804p;

    /* renamed from: q */
    public MMProcessBar f14805q;

    /* renamed from: r */
    public TextView f14806r;

    /* renamed from: s */
    public C3845j3 f14807s = new C3845j3();

    /* renamed from: t */
    public View f14808t;

    /* renamed from: u */
    public final ArrayList<C50581nr0> f14809u = new ArrayList<>();

    /* renamed from: v */
    public boolean f14810v;

    /* renamed from: w */
    public C89349b f14811w;

    /* renamed from: x */
    public int f14812x;

    /* renamed from: y */
    public long f14813y;

    /* renamed from: z */
    public boolean f14814z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelfFeedLikeListUI$a */
    public static final class C3048a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfFeedLikeListUI f14815d;

        public C3048a(FinderSelfFeedLikeListUI finderSelfFeedLikeListUI) {
            this.f14815d = finderSelfFeedLikeListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14815d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelfFeedLikeListUI$b */
    public static final class C3049b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfFeedLikeListUI f14816d;

        public C3049b(FinderSelfFeedLikeListUI finderSelfFeedLikeListUI) {
            this.f14816d = finderSelfFeedLikeListUI;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int N0 = recyclerView.mo17029N0(view);
            int dimension = (int) this.f14816d.getContext().getResources().getDimension(C0966R.dimen.f3736cp);
            int dimension2 = (int) this.f14816d.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
            int dimension3 = (int) this.f14816d.getContext().getResources().getDimension(C0966R.dimen.f3743cv);
            int dimension4 = (int) this.f14816d.getContext().getResources().getDimension(C0966R.dimen.f3766df);
            if (N0 < 5) {
                rect.top = dimension;
            } else {
                rect.top = dimension2;
            }
            int i = N0 % 5;
            if (i == 0) {
                rect.left = dimension3;
                rect.right = dimension4;
            } else if (i != 4) {
                rect.left = dimension4;
                rect.right = dimension4;
            } else {
                rect.left = dimension4;
                rect.right = dimension3;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelfFeedLikeListUI$c */
    public static final class C3050c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfFeedLikeListUI f14817d;

        public C3050c(FinderSelfFeedLikeListUI finderSelfFeedLikeListUI) {
            this.f14817d = finderSelfFeedLikeListUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI$initView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                FinderSelfFeedLikeListUI finderSelfFeedLikeListUI = this.f14817d;
                if (!recyclerView.canScrollVertically(1)) {
                    if (finderSelfFeedLikeListUI.f14810v) {
                        finderSelfFeedLikeListUI.mo3107O7();
                    } else {
                        finderSelfFeedLikeListUI.mo3106N7();
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI$initView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI$initView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI$initView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelfFeedLikeListUI$d */
    public static final class C3051d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfFeedLikeListUI f14818d;

        public C3051d(FinderSelfFeedLikeListUI finderSelfFeedLikeListUI) {
            this.f14818d = finderSelfFeedLikeListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderSelfFeedLikeListUI finderSelfFeedLikeListUI = this.f14818d;
            int i = FinderSelfFeedLikeListUI.f14802A;
            finderSelfFeedLikeListUI.mo3107O7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelfFeedLikeListUI$e */
    public static final class C3052e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfFeedLikeListUI f14819d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f14820e;

        /* renamed from: f */
        public final /* synthetic */ boolean f14821f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3052e(FinderSelfFeedLikeListUI finderSelfFeedLikeListUI, C117747y yVar, boolean z) {
            super(0);
            this.f14819d = finderSelfFeedLikeListUI;
            this.f14820e = yVar;
            this.f14821f = z;
        }

        public Object invoke() {
            FinderSelfFeedLikeListUI finderSelfFeedLikeListUI = this.f14819d;
            C47465a aVar = ((C9330k3) this.f14820e).f29152g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
            LinkedList<C50581nr0> linkedList = ((C52283zm0) aVar).f146092d;
            C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…edLikedListResp).likeList");
            boolean z = this.f14821f;
            int i = FinderSelfFeedLikeListUI.f14802A;
            finderSelfFeedLikeListUI.getClass();
            Log.m105924i("Finder.FinderSelfFeedLikeListUI", "friend list: " + linkedList.size());
            if (!z || linkedList.size() != 0) {
                TextView textView = finderSelfFeedLikeListUI.f14804p;
                if (textView != null) {
                    textView.setVisibility(8);
                    WxRecyclerView wxRecyclerView = finderSelfFeedLikeListUI.f14803o;
                    if (wxRecyclerView != null) {
                        wxRecyclerView.setVisibility(0);
                        MMProcessBar mMProcessBar = finderSelfFeedLikeListUI.f14805q;
                        if (mMProcessBar != null) {
                            mMProcessBar.setVisibility(8);
                            TextView textView2 = finderSelfFeedLikeListUI.f14806r;
                            if (textView2 != null) {
                                textView2.setVisibility(8);
                                View view = finderSelfFeedLikeListUI.f14808t;
                                if (view != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar2.mo10233c(8);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    finderSelfFeedLikeListUI.f14809u.addAll(linkedList);
                                    C3845j3 j3Var = finderSelfFeedLikeListUI.f14807s;
                                    ArrayList<C50581nr0> arrayList = finderSelfFeedLikeListUI.f14809u;
                                    j3Var.getClass();
                                    C87412m.m108594g(arrayList, "datalist");
                                    j3Var.f17383d = arrayList;
                                    finderSelfFeedLikeListUI.f14807s.notifyDataSetChanged();
                                    if (!finderSelfFeedLikeListUI.f14810v) {
                                        finderSelfFeedLikeListUI.mo3106N7();
                                    }
                                } else {
                                    C87412m.m108603p("emptyFooter");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("retryTips");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("loadingBar");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("listView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            } else {
                TextView textView3 = finderSelfFeedLikeListUI.f14804p;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    WxRecyclerView wxRecyclerView2 = finderSelfFeedLikeListUI.f14803o;
                    if (wxRecyclerView2 != null) {
                        wxRecyclerView2.setVisibility(8);
                        MMProcessBar mMProcessBar2 = finderSelfFeedLikeListUI.f14805q;
                        if (mMProcessBar2 != null) {
                            mMProcessBar2.setVisibility(8);
                            TextView textView4 = finderSelfFeedLikeListUI.f14806r;
                            if (textView4 != null) {
                                textView4.setVisibility(8);
                                View view3 = finderSelfFeedLikeListUI.f14808t;
                                if (view3 != null) {
                                    C9556a aVar3 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar3.mo10233c(8);
                                    View view4 = view3;
                                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } else {
                                    C87412m.m108603p("emptyFooter");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("retryTips");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("loadingBar");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("listView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: N7 */
    public final void mo3106N7() {
        View view = this.f14808t;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "addNoMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "addNoMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = this.f14804p;
            if (textView != null) {
                textView.setVisibility(8);
                MMProcessBar mMProcessBar = this.f14805q;
                if (mMProcessBar != null) {
                    mMProcessBar.setVisibility(8);
                } else {
                    C87412m.m108603p("loadingBar");
                    throw null;
                }
            } else {
                C87412m.m108603p("emptyTip");
                throw null;
            }
        } else {
            C87412m.m108603p("emptyFooter");
            throw null;
        }
    }

    /* renamed from: O7 */
    public final void mo3107O7() {
        C86709a0.m107524d().mo123460f(new C9330k3(this.f14811w, this.f14813y, this.f14814z));
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C64707sc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.apb;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.jaw);
        C87412m.m108593f(findViewById, "findViewById(R.id.self_liked_recycler_view)");
        this.f14803o = (WxRecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cj7);
        C87412m.m108593f(findViewById2, "findViewById(R.id.empty_tip)");
        this.f14804p = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f358619g33);
        C87412m.m108593f(findViewById3, "findViewById(R.id.loading_bar)");
        this.f14805q = (MMProcessBar) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.isa);
        C87412m.m108593f(findViewById4, "findViewById(R.id.retry_tips)");
        this.f14806r = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.civ);
        C87412m.m108593f(findViewById5, "findViewById(R.id.empty_footer)");
        this.f14808t = findViewById5;
        setMMTitle(getString(C0966R.string.fo6, new Object[]{Integer.valueOf(this.f14812x)}));
        setBackBtn(new C3048a(this));
        WxRecyclerView wxRecyclerView = this.f14803o;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.f14807s);
            WxRecyclerView wxRecyclerView2 = this.f14803o;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setLayoutManager(new GridLayoutManager(getContext(), 5));
                WxRecyclerView wxRecyclerView3 = this.f14803o;
                if (wxRecyclerView3 != null) {
                    wxRecyclerView3.mo17085h0(new C3049b(this));
                    WxRecyclerView wxRecyclerView4 = this.f14803o;
                    if (wxRecyclerView4 != null) {
                        wxRecyclerView4.setOnScrollListener(new C3050c(this));
                        TextView textView = this.f14806r;
                        if (textView != null) {
                            textView.setOnClickListener(new C3051d(this));
                            TextView textView2 = this.f14804p;
                            if (textView2 != null) {
                                textView2.setVisibility(8);
                                WxRecyclerView wxRecyclerView5 = this.f14803o;
                                if (wxRecyclerView5 != null) {
                                    wxRecyclerView5.setVisibility(8);
                                    MMProcessBar mMProcessBar = this.f14805q;
                                    if (mMProcessBar != null) {
                                        mMProcessBar.setVisibility(0);
                                        TextView textView3 = this.f14806r;
                                        if (textView3 != null) {
                                            textView3.setVisibility(8);
                                            View view = this.f14808t;
                                            if (view != null) {
                                                C9556a aVar = new C9556a();
                                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                                aVar.mo10233c(8);
                                                View view2 = view;
                                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                return;
                                            }
                                            C87412m.m108603p("emptyFooter");
                                            throw null;
                                        }
                                        C87412m.m108603p("retryTips");
                                        throw null;
                                    }
                                    C87412m.m108603p("loadingBar");
                                    throw null;
                                }
                                C87412m.m108603p("listView");
                                throw null;
                            }
                            C87412m.m108603p("emptyTip");
                            throw null;
                        }
                        C87412m.m108603p("retryTips");
                        throw null;
                    }
                    C87412m.m108603p("listView");
                    throw null;
                }
                C87412m.m108603p("listView");
                throw null;
            }
            C87412m.m108603p("listView");
            throw null;
        }
        C87412m.m108603p("listView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(3593, this);
        C86709a0.m107524d().mo123455a(3638, this);
        try {
            C47465a parseFrom = new C51431tq1().parseFrom(getIntent().getByteArrayExtra("ACTION_INFO"));
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FriendLikeFinderObject");
            C51431tq1 tq12 = (C51431tq1) parseFrom;
            long longExtra = getIntent().getLongExtra("FEED_ID", 0);
            this.f14813y = longExtra;
            if (longExtra == 0) {
                finish();
                Log.m105928w("Finder.FinderSelfFeedLikeListUI", "feedId is 0, invalid!");
                return;
            }
            this.f14812x = getIntent().getIntExtra("INIT_TOTAL_COUNT", 0);
            this.f14814z = getIntent().getBooleanExtra("VIEW_BY_POSTER", false);
            initView();
            mo3107O7();
        } catch (Throwable unused) {
            finish();
            Log.m105928w("Finder.FinderSelfFeedLikeListUI", "actionInfo invalid!");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3593, this);
        C86709a0.m107524d().mo123470p(3638, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C9330k3) {
            Log.m105924i("Finder.FinderSelfFeedLikeListUI", "NetSceneFinderGetFriendRecommendList errType " + i + ", errCode " + i2 + ", errMsg " + str);
            boolean z = false;
            if (i == 0 && i2 == 0) {
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFriendRecommendList");
                C9330k3 k3Var = (C9330k3) yVar;
                C47465a aVar = k3Var.f29152g.f127055a.f127080a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListReq");
                if (!C87412m.m108589b(this.f14811w, ((C52136ym0) aVar).f145396g)) {
                    Log.m105924i("Finder.FinderSelfFeedLikeListUI", "not my buf, ignore!");
                    return;
                }
                boolean z2 = this.f14811w == null;
                if (z2) {
                    C47465a aVar2 = k3Var.f29152g.f127056b.f127083a;
                    C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
                    int i3 = ((C52283zm0) aVar2).f146095g;
                    this.f14812x = i3;
                    setMMTitle(getString(C0966R.string.fo6, new Object[]{Integer.valueOf(i3)}));
                }
                C47465a aVar3 = k3Var.f29152g.f127056b.f127083a;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
                if (((C52283zm0) aVar3).f146094f != 0) {
                    z = true;
                }
                this.f14810v = z;
                C47465a aVar4 = k3Var.f29152g.f127056b.f127083a;
                C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
                this.f14811w = ((C52283zm0) aVar4).f146093e;
                C61926c.m72668M(new C3052e(this, yVar, z2));
            } else if (this.f14811w == null) {
                TextView textView = this.f14804p;
                if (textView != null) {
                    textView.setVisibility(8);
                    WxRecyclerView wxRecyclerView = this.f14803o;
                    if (wxRecyclerView != null) {
                        wxRecyclerView.setVisibility(8);
                        MMProcessBar mMProcessBar = this.f14805q;
                        if (mMProcessBar != null) {
                            mMProcessBar.setVisibility(8);
                            TextView textView2 = this.f14806r;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                                View view = this.f14808t;
                                if (view != null) {
                                    C9556a aVar5 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar5.mo10233c(8);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfFeedLikeListUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    return;
                                }
                                C87412m.m108603p("emptyFooter");
                                throw null;
                            }
                            C87412m.m108603p("retryTips");
                            throw null;
                        }
                        C87412m.m108603p("loadingBar");
                        throw null;
                    }
                    C87412m.m108603p("listView");
                    throw null;
                }
                C87412m.m108603p("emptyTip");
                throw null;
            }
        }
    }
}
