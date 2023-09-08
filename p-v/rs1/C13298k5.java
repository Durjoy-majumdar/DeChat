package rs1;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C7881t2;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import j20.C117292a;
import je1.C46547x1;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C9788i3;
import kf1.C9806j3;
import nr3.C89059e;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49946j51;
import up1.C37521f;
import up1.C65426w0;

/* renamed from: rs1.k5 */
public final class C13298k5 extends UIComponent {

    /* renamed from: d */
    public long f37737d;

    /* renamed from: e */
    public int f37738e = 1;

    /* renamed from: f */
    public String f37739f = "";

    /* renamed from: g */
    public String f37740g = "";

    /* renamed from: h */
    public C9788i3 f37741h;

    /* renamed from: i */
    public C9806j3 f37742i;

    /* renamed from: j */
    public FinderFeedShareRelativeListLoader f37743j;

    /* renamed from: n */
    public C55018j0 f37744n;

    /* renamed from: o */
    public final int f37745o;

    /* renamed from: p */
    public final C13601g f37746p;

    /* renamed from: q */
    public final C13601g f37747q;

    /* renamed from: r */
    public WxRecyclerAdapter<?> f37748r;

    /* renamed from: s */
    public final C13601g f37749s;

    /* renamed from: rs1.k5$a */
    public static final class C13299a extends C87413o implements C32224a<C13287j5> {

        /* renamed from: d */
        public final /* synthetic */ C13298k5 f37750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13299a(C13298k5 k5Var) {
            super(0);
            this.f37750d = k5Var;
        }

        public Object invoke() {
            return new C13287j5(this.f37750d);
        }
    }

    /* renamed from: rs1.k5$b */
    public static final class C13300b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13298k5 f37751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13300b(C13298k5 k5Var) {
            super(0);
            this.f37751d = k5Var;
        }

        public Object invoke() {
            return this.f37751d.getContext().findViewById(C0966R.C0970id.f357793n71);
        }
    }

    /* renamed from: rs1.k5$c */
    public static final class C13301c extends C87413o implements C32226l<FinderObject, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13298k5 f37752d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13301c(C13298k5 k5Var) {
            super(1);
            this.f37752d = k5Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((FinderObject) obj, LocaleUtil.ITALIAN);
            this.f37752d.mo12753l3(false);
            C13298k5.m12652c3(this.f37752d, false);
            View e3 = this.f37752d.mo12747e3();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = e3;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62443b(this.f37752d.getContext()).mo75002a(C63575n3.class);
            n3Var.mo88427k3(true);
            n3Var.mo88424g3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.k5$d */
    public static final class C13302d extends C87413o implements C32227p<Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13298k5 f37753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13302d(C13298k5 k5Var) {
            super(2);
            this.f37753d = k5Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            boolean z = false;
            this.f37753d.mo12753l3(false);
            View e3 = this.f37753d.mo12747e3();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(e3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(e3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((C63575n3) C39818r.f106831a.mo62443b(this.f37753d.getContext()).mo75002a(C63575n3.class)).mo88427k3(false);
            TextView textView = (TextView) this.f37753d.getContext().findViewById(C0966R.C0970id.c1m);
            View findViewById = this.f37753d.getContext().findViewById(C0966R.C0970id.f359187ji0);
            WeImageView weImageView = (WeImageView) this.f37753d.getContext().findViewById(C0966R.C0970id.a2z);
            if (weImageView != null) {
                weImageView.setIconColor(this.f37753d.getContext().getResources().getColor(C0966R.color.f3133gi));
            }
            if (intValue != -5002) {
                if (intValue == -4036) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.eoh);
                } else if (intValue == -4033) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.d_8);
                } else if (intValue != -4011) {
                    C13298k5.m12652c3(this.f37753d, true);
                } else {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            textView.setText(str);
                        }
                    }
                    textView.setText(C0966R.string.f360503d90);
                }
            } else if (str != null) {
                C7881t2.f26501a.mo8997b(this.f37753d.getContext(), str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.k5$e */
    public static final class C13303e extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C13298k5 f37754d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13303e(C13298k5 k5Var) {
            super(0);
            this.f37754d = k5Var;
        }

        public Object invoke() {
            View view = ((FinderHorizontalVideoDrawerUIC) C39818r.f106831a.mo62443b(this.f37754d.getContext()).mo75002a(FinderHorizontalVideoDrawerUIC.class)).f18675e;
            if (view != null) {
                return (RefreshLoadMoreLayout) view.findViewById(C0966R.C0970id.l84);
            }
            C87412m.m108603p("drawerContainer");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13298k5(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        this.f37745o = f != null ? f.f38096i : 0;
        this.f37746p = C36568h.m40985a(new C13300b(this));
        this.f37747q = C36568h.m40985a(new C13303e(this));
        this.f37749s = C36568h.m40985a(new C13299a(this));
    }

    /* renamed from: c3 */
    public static final void m12652c3(C13298k5 k5Var, boolean z) {
        k5Var.getClass();
        Log.m105924i("FinderHorizontalVideoNewFormUIC", "showRetryTips ifShow:" + z);
        View findViewById = k5Var.getContext().findViewById(C0966R.C0970id.is8);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C13487v5(k5Var, findViewById));
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d3 */
    public final void mo12746d3(BaseFinderFeed baseFinderFeed) {
        RecyclerView.C16613e adapter;
        DataBuffer<C0740i2> dataList;
        DataBuffer<C0740i2> dataList2;
        C87412m.m108594g(baseFinderFeed, "feed");
        C9788i3 i3Var = this.f37741h;
        if (i3Var != null) {
            BaseFeedLoader<C0740i2> baseFeedLoader = i3Var.f13124s;
            if (!(baseFeedLoader == null || (dataList2 = baseFeedLoader.getDataList()) == null)) {
                dataList2.clear();
            }
            C9788i3 i3Var2 = this.f37741h;
            if (i3Var2 != null) {
                BaseFeedLoader<C0740i2> baseFeedLoader2 = i3Var2.f13124s;
                if (!(baseFeedLoader2 == null || (dataList = baseFeedLoader2.getDataList()) == null)) {
                    dataList.add(baseFinderFeed);
                }
                C9806j3 j3Var = this.f37742i;
                if (j3Var != null) {
                    RecyclerView recyclerView = j3Var.getRecyclerView();
                    if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                    this.f37737d = baseFinderFeed.getItemId();
                    mo12749g3().f13561d = baseFinderFeed.mo3513o().getId();
                    mo12749g3().mo2706d(baseFinderFeed.mo3513o().getObjectNonceId());
                    mo12749g3().getDataListJustForAdapter().clear();
                    RecyclerView.C16613e adapter2 = mo12750i3().getRecyclerView().getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyDataSetChanged();
                    }
                    mo12749g3().requestRefresh();
                    mo12752k3(true);
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: e3 */
    public final View mo12747e3() {
        return (View) ((C36570n) this.f37746p).getValue();
    }

    /* renamed from: f3 */
    public final C60905o mo12748f3() {
        C9806j3 j3Var = this.f37742i;
        if (j3Var == null) {
            return null;
        }
        if (j3Var != null) {
            RecyclerView recyclerView = j3Var.getRecyclerView();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager == null) {
                return null;
            }
            int C = finderLinearLayoutManager.mo16957C();
            Log.m105924i("FinderHorizontalVideoNewFormUIC", "getCurrentVideoHolder: pos=" + C);
            RecyclerView.C16631z I0 = recyclerView.mo17023I0(C);
            if (I0 instanceof C60905o) {
                return (C60905o) I0;
            }
            return null;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: g3 */
    public final FinderFeedShareRelativeListLoader mo12749g3() {
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f37743j;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        C87412m.m108603p("recommendFeedLoader");
        throw null;
    }

    /* renamed from: i3 */
    public final RefreshLoadMoreLayout mo12750i3() {
        Object value = this.f37747q.getValue();
        C87412m.m108593f(value, "<get-rlLayout>(...)");
        return (RefreshLoadMoreLayout) value;
    }

    /* renamed from: j3 */
    public final void mo12751j3() {
        C13301c cVar = new C13301c(this);
        C13302d dVar = new C13302d(this);
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).Sn0()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99180G6.mo60266n().intValue() == 1) {
                C61926c.m72668M(new C13440s5(dVar, this));
                return;
            }
        }
        long j = this.f37737d;
        String str = this.f37740g;
        int i = this.f37745o;
        String str2 = this.f37739f;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        C89059e i2 = new C46547x1(j, str, i, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 118720, (C8480h) null).mo9225i();
        Activity context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i2.mo11397F((MMActivity) context);
        i2.mo123062e(new C13477u5(this, dVar, cVar));
    }

    /* renamed from: k3 */
    public final void mo12752k3(boolean z) {
        View findViewById = getContext().findViewById(C0966R.C0970id.nah);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: l3 */
    public final void mo12753l3(boolean z) {
        View findViewById = getContext().findViewById(C0966R.C0970id.f359188ji1);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
