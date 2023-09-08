package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kf1.C9785i2;
import kf1.C9805j2;
import kf1.C9854m5;
import kotlin.Metadata;
import p185kq.C10383h;
import p217oq.C11716d;
import p217oq.C11717f;
import q31.C118148a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import tf1.C13913l;
import u24.C90599h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lkf1/j2;", "Lkf1/i2;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI */
public final class FinderFeedRelatedTimelineUI extends FinderLoaderFeedUI<FinderFeedRelTimelineLoader, C9805j2, C9785i2> {

    /* renamed from: E */
    public static final /* synthetic */ int f14285E = 0;

    /* renamed from: A */
    public boolean f14286A;

    /* renamed from: B */
    public final C13601g f14287B = C36568h.m40985a(new C2901g(this));

    /* renamed from: C */
    public View f14288C;

    /* renamed from: D */
    public final C2900f f14289D = new C2900f(this);

    /* renamed from: s */
    public long f14290s;

    /* renamed from: t */
    public C9785i2 f14291t;

    /* renamed from: u */
    public C9805j2 f14292u;

    /* renamed from: v */
    public FinderFeedRelTimelineLoader f14293v;

    /* renamed from: w */
    public final int f14294w = 2;

    /* renamed from: x */
    public long f14295x;

    /* renamed from: y */
    public String f14296y = "";

    /* renamed from: z */
    public String f14297z = "";

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$a */
    public static final class C2895a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedRelatedTimelineUI f14298a;

        /* renamed from: b */
        public final /* synthetic */ FinderFeedRelTimelineLoader f14299b;

        public C2895a(FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI, FinderFeedRelTimelineLoader finderFeedRelTimelineLoader) {
            this.f14298a = finderFeedRelatedTimelineUI;
            this.f14299b = finderFeedRelTimelineLoader;
        }

        public void call(int i) {
            C9805j2 j2Var = this.f14298a.f14292u;
            if (j2Var != null) {
                RecyclerView.LayoutManager layoutManager = j2Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14299b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$2", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$2", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            C87412m.m108603p("mViewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$b */
    public static final class C2896b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedRelatedTimelineUI f14300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2896b(FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
            super(1);
            this.f14300d = finderFeedRelatedTimelineUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            View view = this.f14300d.f14288C;
            View view2 = null;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9805j2 j2Var = this.f14300d.f14292u;
                if (j2Var != null) {
                    View loadMoreFooter = j2Var.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eat);
                    }
                    C9805j2 j2Var2 = this.f14300d.f14292u;
                    if (j2Var2 != null) {
                        View loadMoreFooter2 = j2Var2.mo10308D().getLoadMoreFooter();
                        if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setTextColor(this.f14300d.getResources().getColor(C0966R.color.FG_2));
                        }
                        C9805j2 j2Var3 = this.f14300d.f14292u;
                        if (j2Var3 != null) {
                            View loadMoreFooter3 = j2Var3.mo10308D().getLoadMoreFooter();
                            TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            C9805j2 j2Var4 = this.f14300d.f14292u;
                            if (j2Var4 != null) {
                                View loadMoreFooter4 = j2Var4.mo10308D().getLoadMoreFooter();
                                if (loadMoreFooter4 != null) {
                                    view2 = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                                }
                                if (view2 != null) {
                                    C9556a aVar2 = new C9556a();
                                    aVar2.mo10233c(0);
                                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            C87412m.m108603p("emptyView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$c */
    public static final class C2897c extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedRelatedTimelineUI f14301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2897c(FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
            super(1);
            this.f14301d = finderFeedRelatedTimelineUI;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            View view = this.f14301d.f14288C;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (iResponse instanceof FinderFeedRelTimelineLoader.C2664b) {
                    FinderFeedRelTimelineLoader.C2664b bVar = (FinderFeedRelTimelineLoader.C2664b) iResponse;
                    if (!Util.isNullOrNil(bVar.f13556a)) {
                        FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI = this.f14301d;
                        String str = bVar.f13556a;
                        finderFeedRelatedTimelineUI.f14297z = str;
                        finderFeedRelatedTimelineUI.setMMTitle(str);
                    }
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("emptyView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$d */
    public static final class C2898d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedRelatedTimelineUI f14302d;

        public C2898d(FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
            this.f14302d = finderFeedRelatedTimelineUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI = this.f14302d;
            int i = FinderFeedRelatedTimelineUI.f14285E;
            finderFeedRelatedTimelineUI.mo2973W7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$e */
    public static final class C2899e implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedRelatedTimelineUI f14303a;

        public C2899e(FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
            this.f14303a = finderFeedRelatedTimelineUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14303a.getIntent();
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
            Intent intent2 = this.f14303a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$f */
    public static final class C2900f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedRelatedTimelineUI f14304d;

        public C2900f(FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
            this.f14304d = finderFeedRelatedTimelineUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView recyclerView2 = recyclerView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView2);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView2, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI = this.f14304d;
            int i3 = FinderFeedRelatedTimelineUI.f14285E;
            if (17 == finderFeedRelatedTimelineUI.mo2972V7()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "40", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$g */
    public static final class C2901g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedRelatedTimelineUI f14305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2901g(FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
            super(0);
            this.f14305d = finderFeedRelatedTimelineUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14305d.getIntent().getIntExtra("GET_REL_SCENE", 5));
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        if (17 == mo2972V7()) {
            return 96;
        }
        return 24 == mo2972V7() ? 116 : 40;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f14293v;
        if (finderFeedRelTimelineLoader != null) {
            return finderFeedRelTimelineLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9785i2 i2Var = this.f14291t;
        if (i2Var != null) {
            return i2Var;
        }
        C87412m.m108603p("mPresenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9805j2 j2Var = this.f14292u;
        if (j2Var != null) {
            return j2Var;
        }
        C87412m.m108603p("mViewCallback");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0125, code lost:
        r3 = r3.f14079a;
     */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2941S7() {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            android.content.Intent r2 = r25.getIntent()
            java.lang.String r3 = "FEED_ID"
            r4 = 0
            long r2 = r2.getLongExtra(r3, r4)
            r0.f14295x = r2
            android.content.Intent r2 = r25.getIntent()
            java.lang.String r3 = "FEED_NONCE_ID"
            java.lang.String r2 = r2.getStringExtra(r3)
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0021
            r2 = r3
        L_0x0021:
            r0.f14296y = r2
            android.content.Intent r2 = r25.getIntent()
            java.lang.String r4 = "TITLE_WORDING"
            java.lang.String r2 = r2.getStringExtra(r4)
            if (r2 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r3 = r2
        L_0x0031:
            r0.f14297z = r3
            android.content.Intent r2 = r25.getIntent()
            java.lang.String r3 = "AUTO_REFRESH"
            r4 = 0
            boolean r2 = r2.getBooleanExtra(r3, r4)
            r0.f14286A = r2
            android.content.Intent r2 = r25.getIntent()
            r3 = 0
            java.lang.String r5 = "POI_LATITUDE"
            float r21 = r2.getFloatExtra(r5, r3)
            android.content.Intent r2 = r25.getIntent()
            java.lang.String r5 = "POI_LONGITUDE"
            float r22 = r2.getFloatExtra(r5, r3)
            r2 = 2131301604(0x7f0914e4, float:1.822127E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.emptyView)"
            gy3.C87412m.m108593f(r2, r3)
            r0.f14288C = r2
            boolean r3 = r0.f14286A
            if (r3 == 0) goto L_0x00a7
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r6 = r3.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI"
            java.lang.String r8 = "initOnCreate"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r2
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI"
            java.lang.String r7 = "initOnCreate"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x00a7:
            java.lang.String r2 = r0.f14297z
            r0.setMMTitle((java.lang.String) r2)
            kf1.i2 r2 = new kf1.i2
            int r3 = r0.f14294w
            boolean r5 = r0.f14286A
            r2.<init>(r0, r3, r5)
            r0.f14291t = r2
            kf1.j2 r3 = new kf1.j2
            int r5 = r0.f14294w
            int r6 = r25.mo2194I7()
            r3.<init>(r0, r2, r5, r6)
            r0.f14292u = r3
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader r2 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader
            r6 = r2
            long r7 = r0.f14295x
            java.lang.String r9 = r0.f14296y
            r10 = 0
            r11 = 0
            int r12 = r25.mo2972V7()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62444c(r0)
            java.lang.Class<rs1.s8> r5 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r5)
            rs1.s8 r3 = (rs1.C13442s8) r3
            te3.hj1 r20 = r3.mo12861q3()
            r23 = 4072(0xfe8, float:5.706E-42)
            r24 = 0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r3 = r0.f14286A
            r5 = 0
            if (r3 != 0) goto L_0x0152
            android.content.Intent r3 = r25.getIntent()
            r2.initFromCache(r3)
            r3 = 17
            int r6 = r25.mo2972V7()
            if (r3 != r6) goto L_0x0152
            com.tencent.mm.plugin.finder.feed.model.w0 r3 = r2.getCache()
            r6 = 1
            if (r3 == 0) goto L_0x011c
            java.util.ArrayList<cm1.i2> r3 = r3.f14079a
            if (r3 == 0) goto L_0x011c
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r6
            if (r3 != r6) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r6 = 0
        L_0x011d:
            if (r6 == 0) goto L_0x0152
            com.tencent.mm.plugin.finder.feed.model.w0 r3 = r2.getCache()
            if (r3 == 0) goto L_0x0130
            java.util.ArrayList<cm1.i2> r3 = r3.f14079a
            if (r3 == 0) goto L_0x0130
            java.lang.Object r3 = r3.get(r4)
            cm1.i2 r3 = (cm1.C0740i2) r3
            goto L_0x0131
        L_0x0130:
            r3 = r5
        L_0x0131:
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r4 == 0) goto L_0x0138
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            goto L_0x0139
        L_0x0138:
            r3 = r5
        L_0x0139:
            if (r3 == 0) goto L_0x0152
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            dp1.y0 r4 = (dp1.C58417y0) r4
            int r6 = r25.mo2194I7()
            r4.j80(r3, r6)
        L_0x0152:
            com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$a r3 = new com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$a
            r3.<init>(r0, r2)
            r2.setInitDone(r3)
            com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$b r3 = new com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$b
            r3.<init>(r0)
            r2.f13552t = r3
            com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$c r3 = new com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$c
            r3.<init>(r0)
            r2.f13553u = r3
            r0.f14293v = r2
            kf1.j2 r2 = r0.f14292u
            if (r2 == 0) goto L_0x01ca
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$f r3 = r0.f14289D
            r2.mo17043c(r3)
            r2 = 24
            int r3 = r25.mo2972V7()
            if (r2 != r3) goto L_0x0185
            long r2 = java.lang.System.currentTimeMillis()
            r0.f14290s = r2
        L_0x0185:
            com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$d r2 = new com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$d
            r2.<init>(r0)
            r0.setBackBtn(r2)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            o31.b r3 = o31.C11345b.FinderFeedRelatedTimelineUI
            r2.mo86178qr(r0, r3)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            o31.a r3 = o31.C76986a.Finder
            r2.mo86179qs(r0, r3)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            java.lang.String r3 = "FinderFeedRelatedTimelineUI"
            r2.mo86136FZ(r0, r3)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            r3 = 168(0xa8, float:2.35E-43)
            r4 = 24184(0x5e78, float:3.3889E-41)
            r2.mo86148No(r0, r3, r4)
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$e r2 = new com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI$e
            r2.<init>(r0)
            r1.E60(r0, r2)
            return
        L_0x01ca:
            java.lang.String r1 = "mViewCallback"
            gy3.C87412m.m108603p(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFeedRelatedTimelineUI.mo2941S7():void");
    }

    /* renamed from: V7 */
    public final int mo2972V7() {
        return ((Number) ((C36570n) this.f14287B).getValue()).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        r3 = r3.f134671e;
     */
    /* renamed from: W7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2973W7() {
        /*
            r22 = this;
            r0 = r22
            r22.finish()
            int r1 = r22.mo2972V7()
            r2 = 24
            if (r2 != r1) goto L_0x008d
            java.lang.Class<oq.f> r1 = p217oq.C11717f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            oq.f r1 = (p217oq.C11717f) r1
            java.lang.Class<h81.i> r2 = h81.C59774i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.i r2 = (h81.C59774i) r2
            java.lang.String r4 = r2.mo84751Wb()
            java.lang.String r5 = "FinderFeedRelatedTimelineUI"
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r0.f14290s
            long r6 = r2 - r8
            long r10 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader r2 = r0.f14293v
            r3 = 0
            java.lang.String r12 = "feedLoader"
            if (r2 == 0) goto L_0x0089
            te3.hj1 r2 = r2.getContextObj()
            java.lang.String r13 = ""
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = r2.f134672f
            if (r2 != 0) goto L_0x0043
        L_0x0042:
            r2 = r13
        L_0x0043:
            java.lang.Class<kq.h> r14 = p185kq.C10383h.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            kq.h r14 = (p185kq.C10383h) r14
            kq.l r14 = r14.mo10693DZ()
            z91.b r14 = (z91.C23462b) r14
            java.lang.String r14 = r14.mo36921e()
            r16 = 1
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader r15 = r0.f14293v
            if (r15 == 0) goto L_0x0085
            te3.hj1 r3 = r15.getContextObj()
            if (r3 == 0) goto L_0x0069
            java.lang.String r3 = r3.f134671e
            if (r3 != 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r18 = r3
            goto L_0x006b
        L_0x0069:
            r18 = r13
        L_0x006b:
            java.lang.String r21 = p217oq.C11716d.f34294a
            u91.c r13 = new u91.c
            r3 = r13
            r15 = 0
            r17 = 0
            r19 = 1280(0x500, float:1.794E-42)
            r20 = 0
            r12 = r2
            r2 = r13
            r13 = r14
            r14 = r16
            r16 = r21
            r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.f50(r2)
            goto L_0x008d
        L_0x0085:
            gy3.C87412m.m108603p(r12)
            throw r3
        L_0x0089:
            gy3.C87412m.m108603p(r12)
            throw r3
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFeedRelatedTimelineUI.mo2973W7():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ab_;
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo2973W7();
    }

    public void onDestroy() {
        C9805j2 j2Var = this.f14292u;
        if (j2Var != null) {
            j2Var.getRecyclerView().mo17098m1(this.f14289D);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("mViewCallback");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        r2 = r2.f134671e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r22 = this;
            r0 = r22
            super.onPause()
            int r1 = r22.mo2972V7()
            r2 = 17
            if (r2 != r1) goto L_0x000e
            return
        L_0x000e:
            java.lang.Class<ht1.j5> r1 = ht1.C8777j5.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r3 = r1
            ht1.j5 r3 = (ht1.C8777j5) r3
            kf1.j2 r1 = r0.f14292u
            if (r1 == 0) goto L_0x00bc
            androidx.recyclerview.widget.RecyclerView r4 = r1.getRecyclerView()
            ak1.f0$q r5 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
            ak1.i r7 = ak1.C0075i.EVENT_ON_PAUSE
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 112(0x70, float:1.57E-43)
            r13 = 0
            java.lang.String r6 = "40"
            ht1.C8777j5.C8778a.m8602c(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13)
            r1 = 24
            int r3 = r22.mo2972V7()
            if (r1 != r3) goto L_0x00bb
            java.lang.Class<oq.f> r1 = p217oq.C11717f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            oq.f r1 = (p217oq.C11717f) r1
            java.lang.Class<h81.i> r3 = h81.C59774i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.i r3 = (h81.C59774i) r3
            java.lang.String r5 = r3.mo84751Wb()
            java.lang.String r6 = "FinderFeedRelatedTimelineUI"
            long r3 = java.lang.System.currentTimeMillis()
            int r7 = p217oq.C11717f.f34295B0
            long r7 = p217oq.C11717f.C11718a.f34296a
            long r7 = r3 - r7
            long r9 = p217oq.C11717f.C11718a.f34296a
            long r11 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader r3 = r0.f14293v
            java.lang.String r4 = "feedLoader"
            if (r3 == 0) goto L_0x00b6
            te3.hj1 r3 = r3.getContextObj()
            java.lang.String r13 = ""
            if (r3 == 0) goto L_0x0074
            java.lang.String r3 = r3.f134672f
            if (r3 != 0) goto L_0x0075
        L_0x0074:
            r3 = r13
        L_0x0075:
            java.lang.Class<kq.h> r14 = p185kq.C10383h.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            kq.h r14 = (p185kq.C10383h) r14
            kq.l r14 = r14.mo10693DZ()
            z91.b r14 = (z91.C23462b) r14
            java.lang.String r14 = r14.mo36921e()
            r15 = 0
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader r2 = r0.f14293v
            if (r2 == 0) goto L_0x00b1
            te3.hj1 r2 = r2.getContextObj()
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = r2.f134671e
            if (r2 != 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            r19 = r2
            goto L_0x009c
        L_0x009a:
            r19 = r13
        L_0x009c:
            java.lang.String r17 = p217oq.C11716d.f34294a
            u91.c r2 = new u91.c
            r4 = r2
            r16 = 0
            r18 = 0
            r20 = 1280(0x500, float:1.794E-42)
            r21 = 0
            r13 = r3
            r4.<init>(r5, r6, r7, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.f50(r2)
            goto L_0x00bb
        L_0x00b1:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        L_0x00b6:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x00bb:
            return
        L_0x00bc:
            r1 = 0
            java.lang.String r2 = "mViewCallback"
            gy3.C87412m.m108603p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFeedRelatedTimelineUI.onPause():void");
    }

    public void onResume() {
        super.onResume();
        if (17 != mo2972V7()) {
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C9805j2 j2Var = this.f14292u;
            if (j2Var != null) {
                C8777j5.C8778a.m8602c(j5Var, j2Var.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "40", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
                if (24 == mo2972V7()) {
                    int i = C11717f.f34295B0;
                    C11717f.C11718a.f34296a = System.currentTimeMillis();
                    return;
                }
                return;
            }
            C87412m.m108603p("mViewCallback");
            throw null;
        }
    }
}
