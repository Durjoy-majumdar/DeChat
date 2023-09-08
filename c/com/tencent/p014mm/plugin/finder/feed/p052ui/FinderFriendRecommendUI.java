package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedLikeEvent;
import com.tencent.p014mm.autogen.events.FinderUninterestEvent;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.p056ui.C3881w0;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46541v0;
import je1.C9330k3;
import je1.C9384w2;
import kotlin.Metadata;
import nj3.C76912y0;
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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFriendRecommendUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "Lht1/p5;", "Lte3/sc1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI */
public final class FinderFriendRecommendUI extends MMFinderUI implements C11385n, C8794p5<C64707sc1> {

    /* renamed from: C */
    public static final /* synthetic */ int f14360C = 0;

    /* renamed from: A */
    public final int f14361A = 2;

    /* renamed from: B */
    public IListener<FeedLikeEvent> f14362B;

    /* renamed from: o */
    public ListView f14363o;

    /* renamed from: p */
    public TextView f14364p;

    /* renamed from: q */
    public MMProcessBar f14365q;

    /* renamed from: r */
    public TextView f14366r;

    /* renamed from: s */
    public final C3881w0 f14367s = new C3881w0(this);

    /* renamed from: t */
    public final ArrayList<C50581nr0> f14368t = new ArrayList<>();

    /* renamed from: u */
    public boolean f14369u;

    /* renamed from: v */
    public C89349b f14370v;

    /* renamed from: w */
    public C51431tq1 f14371w;

    /* renamed from: x */
    public int f14372x;

    /* renamed from: y */
    public long f14373y;

    /* renamed from: z */
    public boolean f14374z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI$a */
    public static final class C2915a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendRecommendUI f14375d;

        public C2915a(FinderFriendRecommendUI finderFriendRecommendUI) {
            this.f14375d = finderFriendRecommendUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderFriendRecommendUI finderFriendRecommendUI = this.f14375d;
            int i = FinderFriendRecommendUI.f14360C;
            finderFriendRecommendUI.mo2980O7();
            this.f14375d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI$b */
    public static final class C2916b implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendRecommendUI f14376d;

        public C2916b(FinderFriendRecommendUI finderFriendRecommendUI) {
            this.f14376d = finderFriendRecommendUI;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFriendRecommendUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendRecommendUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFriendRecommendUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView != null) {
                FinderFriendRecommendUI finderFriendRecommendUI = this.f14376d;
                if (!absListView.canScrollVertically(1)) {
                    if (finderFriendRecommendUI.f14369u) {
                        finderFriendRecommendUI.mo2981P7();
                    } else {
                        finderFriendRecommendUI.mo2979N7();
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendRecommendUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI$c */
    public static final class C2917c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendRecommendUI f14377d;

        public C2917c(FinderFriendRecommendUI finderFriendRecommendUI) {
            this.f14377d = finderFriendRecommendUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFriendRecommendUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFriendRecommendUI finderFriendRecommendUI = this.f14377d;
            int i = FinderFriendRecommendUI.f14360C;
            finderFriendRecommendUI.mo2981P7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendRecommendUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI$d */
    public static final class C2918d extends C87413o implements C32226l<C50581nr0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendRecommendUI f14378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2918d(FinderFriendRecommendUI finderFriendRecommendUI) {
            super(1);
            this.f14378d = finderFriendRecommendUI;
        }

        public Object invoke(Object obj) {
            C50581nr0 nr02 = (C50581nr0) obj;
            C87412m.m108594g(nr02, "likeInfo");
            C51431tq1 tq12 = this.f14378d.f14371w;
            if (tq12 != null) {
                new C46541v0(tq12, nr02, tq12.f142360g).mo9225i();
                return C13598b0.f38549a;
            }
            C87412m.m108603p("actionInfo");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI$e */
    public static final class C2919e extends C87413o implements C32226l<C50581nr0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendRecommendUI f14379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2919e(FinderFriendRecommendUI finderFriendRecommendUI) {
            super(1);
            this.f14379d = finderFriendRecommendUI;
        }

        public Object invoke(Object obj) {
            C9384w2 w2Var;
            C50581nr0 nr02 = (C50581nr0) obj;
            C87412m.m108594g(nr02, "likeInfo");
            if (nr02.f138728h == 1) {
                String str = nr02.f138729i;
                C51431tq1 tq12 = this.f14379d.f14371w;
                if (tq12 != null) {
                    w2Var = new C9384w2(str, 1, tq12.f142359f);
                } else {
                    C87412m.m108603p("actionInfo");
                    throw null;
                }
            } else {
                String str2 = nr02.f138729i;
                C51431tq1 tq13 = this.f14379d.f14371w;
                if (tq13 != null) {
                    w2Var = new C9384w2(str2, 2, tq13.f142359f);
                } else {
                    C87412m.m108603p("actionInfo");
                    throw null;
                }
            }
            w2Var.f29315n = nr02;
            C86709a0.m107524d().mo123460f(w2Var);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI$f */
    public static final class C2920f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendRecommendUI f14380d;

        public C2920f(FinderFriendRecommendUI finderFriendRecommendUI) {
            this.f14380d = finderFriendRecommendUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
            AppCompatActivity context = this.f14380d.getContext();
            C87412m.m108593f(context, "context");
            bVar.getClass();
            C58684b.Cx0(bVar, context, (Intent) null, 1, 2, (Object) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendRecommendUI$g */
    public static final class C2921g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendRecommendUI f14381d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f14382e;

        /* renamed from: f */
        public final /* synthetic */ boolean f14383f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2921g(FinderFriendRecommendUI finderFriendRecommendUI, C117747y yVar, boolean z) {
            super(0);
            this.f14381d = finderFriendRecommendUI;
            this.f14382e = yVar;
            this.f14383f = z;
        }

        public Object invoke() {
            FinderFriendRecommendUI finderFriendRecommendUI = this.f14381d;
            if (!finderFriendRecommendUI.f14369u) {
                finderFriendRecommendUI.mo2979N7();
            }
            FinderFriendRecommendUI finderFriendRecommendUI2 = this.f14381d;
            C47465a aVar = ((C9330k3) this.f14382e).f29152g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
            LinkedList<C50581nr0> linkedList = ((C52283zm0) aVar).f146092d;
            C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…edLikedListResp).likeList");
            boolean z = this.f14383f;
            finderFriendRecommendUI2.getClass();
            Log.m105924i("Finder.FinderFriendRecommendUI", "friend list: " + linkedList.size());
            if (!z || linkedList.size() != 0) {
                TextView textView = finderFriendRecommendUI2.f14364p;
                if (textView != null) {
                    textView.setVisibility(8);
                    ListView listView = finderFriendRecommendUI2.f14363o;
                    if (listView != null) {
                        listView.setVisibility(0);
                        MMProcessBar mMProcessBar = finderFriendRecommendUI2.f14365q;
                        if (mMProcessBar != null) {
                            mMProcessBar.setVisibility(8);
                            TextView textView2 = finderFriendRecommendUI2.f14366r;
                            if (textView2 != null) {
                                textView2.setVisibility(8);
                                finderFriendRecommendUI2.f14368t.addAll(linkedList);
                                C3881w0 w0Var = finderFriendRecommendUI2.f14367s;
                                ArrayList<C50581nr0> arrayList = finderFriendRecommendUI2.f14368t;
                                w0Var.getClass();
                                C87412m.m108594g(arrayList, "contacts");
                                w0Var.f17436e.clear();
                                w0Var.f17436e.addAll(arrayList);
                                finderFriendRecommendUI2.f14367s.notifyDataSetChanged();
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
                TextView textView3 = finderFriendRecommendUI2.f14364p;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    ListView listView2 = finderFriendRecommendUI2.f14363o;
                    if (listView2 != null) {
                        listView2.setVisibility(8);
                        MMProcessBar mMProcessBar2 = finderFriendRecommendUI2.f14365q;
                        if (mMProcessBar2 != null) {
                            mMProcessBar2.setVisibility(8);
                            TextView textView4 = finderFriendRecommendUI2.f14366r;
                            if (textView4 != null) {
                                textView4.setVisibility(8);
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
    public final void mo2979N7() {
        ListView listView = this.f14363o;
        if (listView == null) {
            C87412m.m108603p("listView");
            throw null;
        } else if (listView.getFooterViewsCount() == 0) {
            ListView listView2 = this.f14363o;
            if (listView2 != null) {
                listView2.addFooterView(View.inflate(this, C0966R.C0971layout.al_, (ViewGroup) null));
            } else {
                C87412m.m108603p("listView");
                throw null;
            }
        }
    }

    /* renamed from: O7 */
    public final void mo2980O7() {
        if (this.f14372x == 1 && this.f14368t.size() == 1) {
            C50581nr0 nr02 = this.f14368t.get(0);
            C87412m.m108593f(nr02, "contactList[0]");
            C50581nr0 nr03 = nr02;
            if (nr03.f138728h == 1) {
                FinderUninterestEvent finderUninterestEvent = new FinderUninterestEvent();
                finderUninterestEvent.f9262d.f9263a = nr03.f138729i;
                finderUninterestEvent.publish();
            }
        }
    }

    /* renamed from: P7 */
    public final void mo2981P7() {
        C86709a0.m107524d().mo123460f(new C9330k3(this.f14370v, this.f14373y, this.f14374z));
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C64707sc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.adk;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.daa);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_liked_list)");
        this.f14363o = (ListView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cj7);
        C87412m.m108593f(findViewById2, "findViewById(R.id.empty_tip)");
        this.f14364p = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f358619g33);
        C87412m.m108593f(findViewById3, "findViewById(R.id.loading_bar)");
        this.f14365q = (MMProcessBar) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.isa);
        C87412m.m108593f(findViewById4, "findViewById(R.id.retry_tips)");
        this.f14366r = (TextView) findViewById4;
        setMMTitle(getString(C0966R.string.de9, new Object[]{Integer.valueOf(this.f14372x)}));
        setBackBtn(new C2915a(this));
        ListView listView = this.f14363o;
        if (listView != null) {
            listView.setAdapter(this.f14367s);
            ListView listView2 = this.f14363o;
            if (listView2 != null) {
                listView2.setSelector(new ColorDrawable(0));
                ListView listView3 = this.f14363o;
                if (listView3 != null) {
                    listView3.setOnScrollListener(new C2916b(this));
                    TextView textView = this.f14366r;
                    if (textView != null) {
                        textView.setOnClickListener(new C2917c(this));
                        this.f14367s.f17437f = new C2918d(this);
                        this.f14367s.f17438g = new C2919e(this);
                        addIconOptionMenu(this.f14361A, -1, (int) C0966R.raw.actionbar_icon_dark_more, (MenuItem.OnMenuItemClickListener) new C2920f(this));
                        FinderFriendRecommendUI$initView$7 finderFriendRecommendUI$initView$7 = new FinderFriendRecommendUI$initView$7(this, C40008f.f107254d);
                        this.f14362B = finderFriendRecommendUI$initView$7;
                        finderFriendRecommendUI$initView$7.alive();
                        TextView textView2 = this.f14364p;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                            ListView listView4 = this.f14363o;
                            if (listView4 != null) {
                                listView4.setVisibility(8);
                                MMProcessBar mMProcessBar = this.f14365q;
                                if (mMProcessBar != null) {
                                    mMProcessBar.setVisibility(0);
                                    TextView textView3 = this.f14366r;
                                    if (textView3 != null) {
                                        textView3.setVisibility(8);
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
                        C87412m.m108603p("retryTips");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("listView");
                    throw null;
                }
            } else {
                C87412m.m108603p("listView");
                throw null;
            }
        } else {
            C87412m.m108603p("listView");
            throw null;
        }
    }

    public void onBackPressed() {
        mo2980O7();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(3593, this);
        C86709a0.m107524d().mo123455a(3638, this);
        try {
            C47465a parseFrom = new C51431tq1().parseFrom(getIntent().getByteArrayExtra("ACTION_INFO"));
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FriendLikeFinderObject");
            this.f14371w = (C51431tq1) parseFrom;
            long longExtra = getIntent().getLongExtra("FEED_ID", 0);
            this.f14373y = longExtra;
            if (longExtra == 0) {
                finish();
                Log.m105928w("Finder.FinderFriendRecommendUI", "feedId is 0, invalid!");
                return;
            }
            this.f14372x = getIntent().getIntExtra("INIT_TOTAL_COUNT", 0);
            this.f14374z = getIntent().getBooleanExtra("VIEW_BY_POSTER", false);
            initView();
            mo2981P7();
        } catch (Throwable unused) {
            finish();
            Log.m105928w("Finder.FinderFriendRecommendUI", "actionInfo invalid!");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3593, this);
        C86709a0.m107524d().mo123470p(3638, this);
        IListener<FeedLikeEvent> iListener = this.f14362B;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        if (yVar instanceof C9330k3) {
            Log.m105924i("Finder.FinderFriendRecommendUI", "NetSceneFinderGetFriendRecommendList errType " + i + ", errCode " + i2 + ", errMsg " + str);
            if (i == 0 && i2 == 0) {
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFriendRecommendList");
                C9330k3 k3Var = (C9330k3) yVar;
                C47465a aVar = k3Var.f29152g.f127055a.f127080a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListReq");
                if (!C87412m.m108589b(this.f14370v, ((C52136ym0) aVar).f145396g)) {
                    Log.m105924i("Finder.FinderFriendRecommendUI", "not my buf, ignore!");
                    return;
                }
                boolean z2 = this.f14370v == null;
                if (z2) {
                    C47465a aVar2 = k3Var.f29152g.f127056b.f127083a;
                    C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
                    int i3 = ((C52283zm0) aVar2).f146095g;
                    this.f14372x = i3;
                    setMMTitle(getString(C0966R.string.de9, new Object[]{Integer.valueOf(i3)}));
                }
                C47465a aVar3 = k3Var.f29152g.f127056b.f127083a;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
                if (((C52283zm0) aVar3).f146094f != 0) {
                    z = true;
                }
                this.f14369u = z;
                C47465a aVar4 = k3Var.f29152g.f127056b.f127083a;
                C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFeedLikedListResp");
                this.f14370v = ((C52283zm0) aVar4).f146093e;
                C61926c.m72668M(new C2921g(this, yVar, z2));
            } else if (this.f14370v == null) {
                TextView textView = this.f14364p;
                if (textView != null) {
                    textView.setVisibility(8);
                    ListView listView = this.f14363o;
                    if (listView != null) {
                        listView.setVisibility(8);
                        MMProcessBar mMProcessBar = this.f14365q;
                        if (mMProcessBar != null) {
                            mMProcessBar.setVisibility(8);
                            TextView textView2 = this.f14366r;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
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
        } else if (yVar instanceof C9384w2) {
            Log.m105924i("Finder.FinderFriendRecommendUI", "NetSceneFinderContactTag errType " + i + ", errCode " + i2 + ", errMsg " + str);
            if (i == 0 && i2 == 0) {
                C50581nr0 nr02 = ((C9384w2) yVar).f29315n;
            } else {
                C76912y0.makeText((Context) this, (int) C0966R.string.f7965xp, 0).show();
            }
        }
    }
}
