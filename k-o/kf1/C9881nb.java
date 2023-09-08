package kf1;

import ak1.C0075i;
import ak1.C54067f0;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import ef1.C58556f;
import ef1.C58563g;
import fo1.C8178c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C33631s;
import jq3.C60905o;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import os1.C11744g;
import os1.C11749q;
import rs1.C13442s8;
import rs1.C13502w6;
import rs1.C63586o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import tr1.C78080i;
import up1.C37521f;

/* renamed from: kf1.nb */
public final class C9881nb implements C9878n9, HeadFooterLayout.C57874a {

    /* renamed from: d */
    public final MMActivity f30474d;

    /* renamed from: e */
    public final C9860m9 f30475e;

    /* renamed from: f */
    public final View f30476f;

    /* renamed from: g */
    public final Fragment f30477g;

    /* renamed from: h */
    public final C13601g f30478h = C36568h.m40985a(new C9893k(this));

    /* renamed from: i */
    public FinderLikeDrawer f30479i;

    /* renamed from: j */
    public final C13601g f30480j = C36568h.m40985a(new C9894l(this));

    /* renamed from: n */
    public final C13601g f30481n = C36568h.m40985a(new C9884c(this));

    /* renamed from: o */
    public final C13601g f30482o;

    /* renamed from: p */
    public final C13601g f30483p;

    /* renamed from: q */
    public final C13601g f30484q;

    /* renamed from: r */
    public boolean f30485r;

    /* renamed from: s */
    public final C13601g f30486s;

    /* renamed from: t */
    public int f30487t;

    /* renamed from: kf1.nb$a */
    public final class C9882a<D extends C9493c> extends WxRecyclerAdapter<D> {

        /* renamed from: G */
        public boolean f30488G;

        /* renamed from: H */
        public final /* synthetic */ C9881nb f30489H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9882a(C9881nb nbVar, C9500j jVar, ArrayList<D> arrayList, boolean z) {
            super(jVar, arrayList, z);
            C87412m.m108594g(jVar, "itemConvertFactory");
            C87412m.m108594g(arrayList, "data");
            this.f30489H = nbVar;
        }

        /* renamed from: l6 */
        public String mo10423l6(Exception exc, RecyclerView.C16631z zVar, int i, List list) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(exc, "e");
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(list, "payloads");
            C0740i2 i2Var = (C0740i2) oVar.f173503E;
            if (i2Var instanceof BaseFinderFeed) {
                return i2Var.toString();
            }
            return "Feed[" + i2Var + "] is not BaseFinderFeed";
        }

        /* renamed from: m6 */
        public String mo10424m6(Exception exc, int i) {
            C87412m.m108594g(exc, "e");
            return super.mo10424m6(exc, i);
        }

        /* renamed from: o6 */
        public void mo10426w5(C60905o oVar, int i) {
            C87412m.m108594g(oVar, "holder");
            super.mo10426w5(oVar, i);
            if (!this.f30488G) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).N40(this.f30489H.f30475e.mo2595E(), "ShowResult");
                this.f30488G = true;
            }
        }

        /* renamed from: w6 */
        public void mo10297w6(RecyclerView recyclerView) {
            C87412m.m108594g(recyclerView, "recyclerView");
        }
    }

    /* renamed from: kf1.nb$b */
    public static final class C9883b extends C87413o implements C32224a<C63586o> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9883b(C9881nb nbVar) {
            super(0);
            this.f30490d = nbVar;
        }

        public Object invoke() {
            Fragment fragment = this.f30490d.f30477g;
            if (fragment == null) {
                return null;
            }
            return (C63586o) C39818r.f106831a.mo62445d(fragment).mo75002a(C63586o.class);
        }
    }

    /* renamed from: kf1.nb$c */
    public static final class C9884c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9884c(C9881nb nbVar) {
            super(0);
            this.f30491d = nbVar;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89989a(this.f30491d.f30474d));
        }
    }

    /* renamed from: kf1.nb$d */
    public static final class C9885d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30492d;

        /* renamed from: e */
        public final /* synthetic */ boolean f30493e;

        /* renamed from: f */
        public final /* synthetic */ boolean f30494f;

        public C9885d(C9881nb nbVar, boolean z, boolean z2) {
            this.f30492d = nbVar;
            this.f30493e = z;
            this.f30494f = z2;
        }

        public final void run() {
            this.f30492d.mo10422y().mo82439E(this.f30493e, this.f30494f);
            this.f30492d.getClass();
        }
    }

    /* renamed from: kf1.nb$e */
    public static final class C9886e extends C87413o implements C32224a<RecyclerView.C16623q> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9886e(C9881nb nbVar) {
            super(0);
            this.f30495d = nbVar;
        }

        public Object invoke() {
            return ((C11744g) C39818r.f106831a.mo62444c(this.f30495d.f30474d).mo75002a(C11744g.class)).f34389d;
        }
    }

    /* renamed from: kf1.nb$f */
    public static final class C9887f extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C9881nb f30496a;

        public C9887f(C9881nb nbVar) {
            this.f30496a = nbVar;
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C63586o oVar;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            if (cVar.f24953h <= 0) {
                CharSequence charSequence = cVar.f24948c;
                if (!(charSequence == null || charSequence.length() == 0) && (oVar = (C63586o) ((C36570n) this.f30496a.f30482o).getValue()) != null) {
                    C63586o.m74921g3(oVar, true, cVar.f24948c, 0, (Drawable) null, 12, (Object) null);
                }
            }
            C63586o oVar2 = (C63586o) ((C36570n) this.f30496a.f30482o).getValue();
            if (oVar2 != null) {
                oVar2.mo88434c3();
            }
        }
    }

    /* renamed from: kf1.nb$g */
    public static final class C9888g extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9888g(C9881nb nbVar) {
            super(1);
            this.f30497d = nbVar;
        }

        public Object invoke(Object obj) {
            ViewGroup viewGroup;
            float floatValue = ((Number) obj).floatValue();
            C63586o oVar = (C63586o) ((C36570n) this.f30497d.f30482o).getValue();
            if (!(oVar == null || oVar.f180310j == null || (viewGroup = (ViewGroup) ((C36570n) oVar.f180305e).getValue()) == null)) {
                viewGroup.setTranslationY(floatValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.nb$h */
    public static final class C9889h implements C60907t {

        /* renamed from: a */
        public final /* synthetic */ int f30498a;

        public C9889h(int i) {
            this.f30498a = i;
        }

        /* renamed from: a */
        public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(rVar, "data");
            C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11749q.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…reamUnreadVM::class.java)");
            C11749q qVar = (C11749q) a;
            if (this.f30498a == 4) {
                LinkedList<C33631s> linkedList = rVar.f173511g;
                ArrayList<C33631s> arrayList = new ArrayList<>();
                for (T next : linkedList) {
                    if (((C33631s) next).f91020a instanceof BaseFinderFeed) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                for (C33631s sVar : arrayList) {
                    C9493c cVar = sVar.f91020a;
                    C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    arrayList2.add((BaseFinderFeed) cVar);
                }
                qVar.mo11612c3(20, arrayList2);
            }
        }
    }

    /* renamed from: kf1.nb$i */
    public static final class C9890i extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public boolean f30499a = true;

        /* renamed from: b */
        public final /* synthetic */ C9881nb f30500b;

        /* renamed from: c */
        public final /* synthetic */ RecyclerView f30501c;

        /* renamed from: d */
        public final /* synthetic */ int f30502d;

        /* renamed from: kf1.nb$i$a */
        public static final class C9891a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RecyclerView f30503d;

            public C9891a(RecyclerView recyclerView) {
                this.f30503d = recyclerView;
            }

            public final void run() {
                int childCount = this.f30503d.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    this.f30503d.getChildAt(i).setTranslationY(0.0f);
                }
                this.f30503d.setItemAnimator(new C54234f());
            }
        }

        public C9890i(C9881nb nbVar, RecyclerView recyclerView, int i) {
            this.f30500b = nbVar;
            this.f30501c = recyclerView;
            this.f30502d = i;
        }

        /* renamed from: a */
        public void mo3747a(int i) {
            if (this.f30499a && i > 0) {
                C58556f n3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f30500b.f30474d).mo75002a(C13442s8.class)).mo12858n3(this.f30500b.f30475e.mo2617s3());
                if (n3 != null) {
                    new C58563g(n3).onScrollStateChanged(this.f30501c, 5);
                }
                this.f30499a = false;
            }
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            this.f30500b.f30475e.mo2612e4(i == 2);
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            Log.m105924i("Finder.TimelineViewCallback", "[onLoadMoreEnd] isHasAnyMore=" + cVar);
            if (!cVar.f24951f && this.f30501c.getChildCount() > 0) {
                RecyclerView recyclerView = this.f30501c;
                View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                RecyclerView.C16631z F0 = this.f30501c.mo17021F0(childAt);
                Integer valueOf = F0 != null ? Integer.valueOf(F0.f44859i) : null;
                if (childAt.getHeight() > 0 && ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8))) {
                    C9881nb nbVar = this.f30500b;
                    nbVar.getClass();
                    int height = C8178c.C8179a.m8259a(nbVar).getDisplayMetrics().heightPixels - childAt.getHeight();
                    this.f30500b.mo10422y().setExtraOverScrollFooterDx(height / 3);
                    Log.m105924i("Finder.TimelineViewCallback", "extraOverScrollFooterDx=" + height);
                    C115669n.INSTANCE.mo175913w(1311, 2, 1);
                }
            }
            this.f30500b.f30475e.mo2594A7(cVar);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            C13442s8 f;
            this.f30500b.f30475e.requestRefresh();
            if (!this.f30500b.mo10421D()) {
                if (i != 2) {
                    this.f30501c.setItemAnimator(new C78080i());
                } else {
                    this.f30501c.setItemAnimator((RecyclerView.C16616j) null);
                }
            }
            if (i == 1) {
                C37521f.f99374d.getClass();
                if (C37521f.f99420i1.mo60266n().intValue() == 1 && (f = C13442s8.f38060Q0.mo12873f(this.f30500b.f30474d)) != null) {
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    ((C58417y0) c).zx0(f.mo12861q3(), 3, 0);
                }
            }
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30500b.f30475e.onRefreshEnd(cVar);
            if (!this.f30500b.mo10421D()) {
                RecyclerView recyclerView = this.f30501c;
                recyclerView.postDelayed(new C9891a(recyclerView), 1000);
            } else {
                this.f30500b.f30485r = true;
            }
            if (this.f30500b.f30475e.mo2617s3() == 1) {
                C7335d c = C86312j.m106911c(C8777j5.class);
                C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                C8777j5.C8778a.m8602c((C8777j5) c, this.f30501c, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_9", C0075i.EVENT_ON_REFRESH, 0, 0, 0, 112, (Object) null);
            }
            C13502w6 w6Var = (C13502w6) C39818r.f106831a.mo62444c(this.f30500b.f30474d).mo62449e(C13502w6.class);
            if (w6Var != null) {
                int i = this.f30502d;
                if (i == 1) {
                    w6Var.f38278j = true;
                    Log.m105924i("Finder.FinderNpsSurveyUIC", "onRefreshEnd friend tab");
                } else if (i == 3) {
                    w6Var.f38277i = true;
                    Log.m105924i("Finder.FinderNpsSurveyUIC", "onRefreshEnd follow tab");
                } else if (i == 4) {
                    w6Var.f38279n = true;
                    Log.m105924i("Finder.FinderNpsSurveyUIC", "onRefreshEnd machine tab");
                }
                C13502w6.C13503a aVar = C13502w6.f38267r;
                C13502w6.f38269t.clear();
                C13502w6.f38270u.clear();
                C13502w6.f38271v.clear();
            }
        }
    }

    /* renamed from: kf1.nb$j */
    public static final class C9892j extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30504d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9892j(C9881nb nbVar) {
            super(0);
            this.f30504d = nbVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f30504d.f30474d.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6);
        }
    }

    /* renamed from: kf1.nb$k */
    public static final class C9893k extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9893k(C9881nb nbVar) {
            super(0);
            this.f30505d = nbVar;
        }

        public Object invoke() {
            return (RefreshLoadMoreLayout) this.f30505d.f30476f.findViewById(C0966R.C0970id.ivb);
        }
    }

    /* renamed from: kf1.nb$l */
    public static final class C9894l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9894l(C9881nb nbVar) {
            super(0);
            this.f30506d = nbVar;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89994f(this.f30506d.f30474d));
        }
    }

    /* renamed from: kf1.nb$m */
    public static final class C9895m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9895m(C9881nb nbVar) {
            super(0);
            this.f30507d = nbVar;
        }

        public Object invoke() {
            return Integer.valueOf(((Number) ((C36570n) this.f30507d.f30480j).getValue()).intValue() + ((Number) ((C36570n) this.f30507d.f30481n).getValue()).intValue());
        }
    }

    /* renamed from: kf1.nb$n */
    public static final class C9896n extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C9881nb f30508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9896n(C9881nb nbVar) {
            super(0);
            this.f30508d = nbVar;
        }

        public Object invoke() {
            return Float.valueOf(this.f30508d.f30474d.getResources().getDimension(C0966R.dimen.f3761db));
        }
    }

    public C9881nb(MMActivity mMActivity, C9860m9 m9Var, View view, Fragment fragment) {
        C87412m.m108594g(mMActivity, "baseContext");
        C87412m.m108594g(m9Var, "presenter");
        C87412m.m108594g(view, "parent");
        this.f30474d = mMActivity;
        this.f30475e = m9Var;
        this.f30476f = view;
        this.f30477g = fragment;
        C36568h.m40985a(new C9895m(this));
        this.f30482o = C36568h.m40985a(new C9883b(this));
        this.f30483p = C36568h.m40985a(new C9896n(this));
        this.f30484q = C36568h.m40985a(new C9892j(this));
        this.f30486s = C36568h.m40985a(new C9886e(this));
    }

    /* renamed from: C0 */
    public void mo10414C0(boolean z) {
        View findViewById = this.f30476f.findViewById(C0966R.C0970id.f358005cz3);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: D */
    public final boolean mo10421D() {
        return ((Boolean) ((C36570n) this.f30484q).getValue()).booleanValue() && this.f30487t == 4 && !this.f30485r;
    }

    /* renamed from: b */
    public View mo10415b() {
        return this.f30476f;
    }

    /* renamed from: c */
    public RefreshLoadMoreLayout mo10416c() {
        return mo10422y();
    }

    /* renamed from: g0 */
    public void mo10417g0(long j, boolean z, boolean z2) {
        if (j <= 0) {
            mo10422y().mo82439E(z, z2);
        } else {
            mo10422y().postDelayed(new C9885d(this, z, z2), j);
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30474d;
    }

    public RecyclerView getRecyclerView() {
        return mo10422y().getRecyclerView();
    }

    public boolean onBackPressed() {
        FinderLikeDrawer finderLikeDrawer = this.f30479i;
        if (finderLikeDrawer == null) {
            C87412m.m108603p("friendLikeDrawer");
            throw null;
        } else if (!finderLikeDrawer.mo82541i()) {
            return false;
        } else {
            FinderLikeDrawer finderLikeDrawer2 = this.f30479i;
            if (finderLikeDrawer2 != null) {
                finderLikeDrawer2.mo4615l();
                return true;
            }
            C87412m.m108603p("friendLikeDrawer");
            throw null;
        }
    }

    /* renamed from: p */
    public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
        return false;
    }

    /* renamed from: v */
    public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x012b, code lost:
        if (r5 == null) goto L_0x012d;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10420w(java.util.ArrayList<cm1.C0740i2> r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "data"
            gy3.C87412m.m108594g(r1, r3)
            r0.f30487t = r2
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer$Companion r3 = com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer.f17829D
            com.tencent.mm.ui.MMActivity r4 = r0.f30474d
            android.view.Window r5 = r4.getWindow()
            java.lang.String r6 = "getActivity().window"
            gy3.C87412m.m108593f(r5, r6)
            r6 = 1
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r3 = r3.mo4621a(r4, r5, r6)
            r0.f30479i = r3
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r19.mo10422y()
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            android.view.View r4 = r0.f30476f
            r5 = 2131305310(0x7f09235e, float:1.8228787E38)
            android.view.View r4 = r4.findViewById(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout$StickTopLoadingLayout r4 = (com.tencent.p014mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout) r4
            rx3.g r5 = r0.f30480j
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            rx3.g r7 = r0.f30481n
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r15 = 2
            int r7 = r7 / r15
            int r5 = r5 + r7
            r14 = 0
            r4.setPadding(r14, r5, r14, r14)
            kf1.nb$f r5 = new kf1.nb$f
            r5.<init>(r0)
            r4.setActionCallback(r5)
            kf1.nb$g r5 = new kf1.nb$g
            r5.<init>(r0)
            r4.setOnScrollCallback(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r5 = r19.mo10422y()
            r5.setStickTopLoadingLayout(r4)
            android.view.View r4 = r0.f30476f
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131166538(0x7f07054a, float:1.7947324E38)
            float r4 = r4.getDimension(r5)
            int r4 = (int) r4
            rx3.g r5 = r0.f30483p
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (int) r5
            com.tencent.mm.view.RefreshLoadMoreLayout r7 = r19.mo10422y()
            int r5 = r4 - r5
            r7.setLimitTopRequest(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r5 = r19.mo10422y()
            int r4 = -r4
            r5.setRefreshTargetY(r4)
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r19.mo10422y()
            r5 = 1070386381(0x3fcccccd, float:1.6)
            r4.setDamping(r5)
            rx3.g r4 = r0.f30486s
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            androidx.recyclerview.widget.RecyclerView$q r4 = (androidx.recyclerview.widget.RecyclerView.C16623q) r4
            r3.setRecycledViewPool(r4)
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r4 = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager
            com.tencent.mm.ui.MMActivity r5 = r0.f30474d
            r4.<init>(r5)
            r5 = 1103626240(0x41c80000, float:25.0)
            r4.f162360w = r5
            r5 = 100
            r4.f162361x = r5
            r4.setItemPrefetchEnabled(r14)
            r3.setLayoutManager(r4)
            boolean r5 = r3 instanceof com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView
            if (r5 == 0) goto L_0x00d6
            r5 = r3
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r5 = (com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView) r5
            java.lang.String r7 = java.lang.String.valueOf(r21)
            r5.mo77205y1(r4, r7)
        L_0x00d6:
            kf1.nb$a r4 = new kf1.nb$a
            kf1.m9 r5 = r0.f30475e
            jq3.j r5 = r5.mo2611U()
            r7 = 4
            if (r2 != r7) goto L_0x00e3
            r7 = 1
            goto L_0x00e4
        L_0x00e3:
            r7 = 0
        L_0x00e4:
            r4.<init>(r0, r5, r1, r7)
            kf1.nb$h r1 = new kf1.nb$h
            r1.<init>(r2)
            r4.f165737C = r1
            r1 = r3
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            android.content.Context r5 = r3.getContext()
            boolean r7 = r5 instanceof androidx.lifecycle.C0123n0
            r13 = 0
            if (r7 == 0) goto L_0x00fd
            androidx.lifecycle.n0 r5 = (androidx.lifecycle.C0123n0) r5
            goto L_0x00fe
        L_0x00fd:
            r5 = r13
        L_0x00fe:
            if (r5 == 0) goto L_0x012d
            androidx.lifecycle.k0 r7 = new androidx.lifecycle.k0
            androidx.lifecycle.m0 r8 = r5.getViewModelStore()
            boolean r9 = r5 instanceof androidx.lifecycle.C0121i
            if (r9 == 0) goto L_0x0111
            androidx.lifecycle.i r5 = (androidx.lifecycle.C0121i) r5
            androidx.lifecycle.k0$b r5 = r5.getDefaultViewModelProviderFactory()
            goto L_0x011e
        L_0x0111:
            androidx.lifecycle.k0$d r5 = androidx.lifecycle.C54209k0.C39628d.f106389a
            if (r5 != 0) goto L_0x011c
            androidx.lifecycle.k0$d r5 = new androidx.lifecycle.k0$d
            r5.<init>()
            androidx.lifecycle.C54209k0.C39628d.f106389a = r5
        L_0x011c:
            androidx.lifecycle.k0$d r5 = androidx.lifecycle.C54209k0.C39628d.f106389a
        L_0x011e:
            r7.<init>((androidx.lifecycle.C39630m0) r8, (androidx.lifecycle.C54209k0.C54210b) r5)
            java.lang.Class<com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$RecycledViewPoolViewModel> r5 = com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.RecycledViewPoolViewModel.class
            androidx.lifecycle.i0 r5 = r7.mo75002a(r5)
            com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$RecycledViewPoolViewModel r5 = (com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.RecycledViewPoolViewModel) r5
            en3.h r5 = r5.f24719d
            if (r5 != 0) goto L_0x0132
        L_0x012d:
            en3.h r5 = new en3.h
            r5.<init>()
        L_0x0132:
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r16 = up1.C37521f.f99277R7
            java.lang.Object r7 = r16.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 < r6) goto L_0x016d
            r8 = 2
            r9 = 10
            r10 = 0
            r12 = 0
            r17 = 20
            r18 = 0
            r7 = r3
            r11 = r5
            r13 = r17
            r6 = 0
            r14 = r18
            com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension r7 = en3.C97675c.m125886d(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r7 == 0) goto L_0x016e
            java.lang.Object r8 = r16.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r15) goto L_0x0169
            r14 = 1
            goto L_0x016a
        L_0x0169:
            r14 = 0
        L_0x016a:
            r7.f56358c = r14
            goto L_0x016e
        L_0x016d:
            r6 = 0
        L_0x016e:
            java.lang.Object r7 = r16.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = -1
            if (r7 != r8) goto L_0x01a2
            r7 = 3
            int[][] r7 = new int[r7][]
            int[] r8 = new int[r15]
            r8 = {4, 8} // fill-array
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r7[r6] = r8
            int[] r8 = new int[r15]
            r8 = {2, 3} // fill-array
            r9 = 1
            r7[r9] = r8
            int[] r8 = new int[r15]
            r8 = {9, 3} // fill-array
            r7[r15] = r8
            java.util.List r8 = sx3.C64197v.m75537f(r7)
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r3
            r9 = r5
            en3.C97675c.m125887e(r7, r8, r9, r10, r11, r12)
        L_0x01a2:
            r1.setAdapter(r4)
            r5 = 1
            r3.setHasFixedSize(r5)
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99262Q1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r1.setFlingSpeedFactor(r5)
            com.tencent.mm.plugin.finder.ui.x0 r5 = new com.tencent.mm.plugin.finder.ui.x0
            r5.<init>()
            r5.mo75025b(r3)
            boolean r5 = r19.mo10421D()
            if (r5 != 0) goto L_0x01cb
            r5 = 0
            r3.setItemAnimator(r5)
            goto L_0x01d4
        L_0x01cb:
            r5 = 0
            androidx.recyclerview.widget.f r7 = new androidx.recyclerview.widget.f
            r7.<init>()
            r1.setItemAnimator(r7)
        L_0x01d4:
            kf1.m9 r1 = r0.f30475e
            java.util.List r1 = r1.getHeaderInfo()
            java.util.Iterator r1 = r1.iterator()
        L_0x01de:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01ee
            java.lang.Object r7 = r1.next()
            jq3.l$a r7 = (jq3.C60898l.C60899a) r7
            jq3.C60898l.m71328U5(r4, r7, r6, r15, r5)
            goto L_0x01de
        L_0x01ee:
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r19.mo10422y()
            kf1.nb$i r4 = new kf1.nb$i
            r4.<init>(r0, r3, r2)
            r1.setActionCallback(r4)
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r3 = r0.f30474d
            bl3.r$a r1 = r1.mo62444c(r3)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            rs1.s8 r1 = (rs1.C13442s8) r1
            kf1.m9 r3 = r0.f30475e
            int r3 = r3.mo2617s3()
            ef1.f r1 = r1.mo12858n3(r3)
            if (r1 == 0) goto L_0x0221
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r19.mo10422y()
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            r1.mo83455c(r3)
        L_0x0221:
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r19.mo10422y()
            r1.setOverCallback(r0)
            dp1.v r1 = dp1.C7453v.f25647a
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r19.mo10422y()
            android.view.View r3 = r3.getLoadMoreFooter()
            boolean r4 = r1.mo8600a()
            if (r4 == 0) goto L_0x0239
            goto L_0x0243
        L_0x0239:
            if (r3 == 0) goto L_0x0243
            dp1.w r4 = new dp1.w
            r4.<init>(r2, r6)
            zp3.C23564m.m28138h(r3, r4)
        L_0x0243:
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r19.mo10422y()
            com.tencent.mm.view.RefreshLoadMoreLayout$StickTopLoadingLayout r3 = r3.getStickTopLoadingLayout()
            if (r3 == 0) goto L_0x0252
            com.tencent.mm.ui.widget.MMProcessBar r13 = r3.getProgressBar()
            goto L_0x0253
        L_0x0252:
            r13 = r5
        L_0x0253:
            boolean r1 = r1.mo8600a()
            if (r1 == 0) goto L_0x025a
            goto L_0x0265
        L_0x025a:
            if (r13 == 0) goto L_0x0265
            dp1.w r1 = new dp1.w
            r3 = 1
            r1.<init>(r2, r3)
            zp3.C23564m.m28138h(r13, r1)
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9881nb.mo10420w(java.util.ArrayList, int):void");
    }

    /* renamed from: x */
    public void mo3720x(int i) {
        Log.m105924i("Finder.TimelineViewCallback", "[onOverStop]");
    }

    /* renamed from: y */
    public final RefreshLoadMoreLayout mo10422y() {
        Object value = ((C36570n) this.f30478h).getValue();
        C87412m.m108593f(value, "<get-rlLayout>(...)");
        return (RefreshLoadMoreLayout) value;
    }
}
