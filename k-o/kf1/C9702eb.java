package kf1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFeedRelTimelineUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig$getItemConvertFactory$1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dq1.C7461a;
import ef1.C58556f;
import er1.C58684b;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import k20.C9556a;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import up1.C14367u0;
import ve1.C14590p;
import ve1.C14599p3;

/* renamed from: kf1.eb */
public final class C9702eb implements C10005ua {

    /* renamed from: d */
    public final MMActivity f30109d;

    /* renamed from: e */
    public final C9990ta f30110e;

    /* renamed from: f */
    public final View f30111f;

    /* renamed from: g */
    public final Fragment f30112g;

    /* renamed from: h */
    public final String f30113h = "FinderTimelineMachineContract.ViewCallback";

    /* renamed from: i */
    public C14367u0 f30114i = new FinderStaggeredConfig(0, (C7461a) null, 3, (C8480h) null);

    /* renamed from: j */
    public WxRecyclerAdapter<C0740i2> f30115j;

    /* renamed from: n */
    public final C13601g f30116n = C36568h.m40985a(new C9706d(this));

    /* renamed from: kf1.eb$a */
    public static final class C9703a extends C87413o implements C32226l<Integer, C60896i<?>> {

        /* renamed from: d */
        public final /* synthetic */ C9702eb f30117d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9703a(C9702eb ebVar) {
            super(1);
            this.f30117d = ebVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == -6) {
                return new C14599p3(this.f30117d);
            }
            C58784w3.f168295a.mo83916b(this.f30117d.f30113h, intValue);
            return new C14590p();
        }
    }

    /* renamed from: kf1.eb$b */
    public static final class C9704b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C0740i2> f30118d;

        /* renamed from: e */
        public final /* synthetic */ C9702eb f30119e;

        public C9704b(ArrayList<C0740i2> arrayList, C9702eb ebVar) {
            this.f30118d = arrayList;
            this.f30119e = ebVar;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            RecyclerView.C16613e eVar2 = eVar;
            int i2 = i;
            C87412m.m108594g(eVar2, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            int c6 = ((WxRecyclerAdapter) eVar2).mo85796c6();
            if (i2 >= c6) {
                C0740i2 i2Var = this.f30118d.get(i2 - c6);
                C87412m.m108593f(i2Var, "data[position - headCount]");
                C0740i2 i2Var2 = i2Var;
                if (i2Var2 instanceof BaseFinderFeed) {
                    Intent intent = new Intent();
                    intent.putExtra("FEED_ID", ((BaseFinderFeed) i2Var2).mo3513o().getId());
                    C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f30119e.f30109d, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                    MMActivity mMActivity = this.f30119e.f30109d;
                    ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                    C87412m.m108594g(mMActivity, "context");
                    intent.setClass(mMActivity, FinderFeedRelTimelineUI.class);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    MMActivity mMActivity2 = mMActivity;
                    C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFeedRelUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFeedRelUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
    }

    /* renamed from: kf1.eb$c */
    public static final class C9705c extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C9702eb f30120a;

        public C9705c(C9702eb ebVar) {
            this.f30120a = ebVar;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            this.f30120a.f30110e.onLoadMore();
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            this.f30120a.f30110e.onRefresh();
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30120a.f30110e.onRefreshEnd(cVar);
        }
    }

    /* renamed from: kf1.eb$d */
    public static final class C9706d extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C9702eb f30121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9706d(C9702eb ebVar) {
            super(0);
            this.f30121d = ebVar;
        }

        public Object invoke() {
            return (RefreshLoadMoreLayout) this.f30121d.f30111f.findViewById(C0966R.C0970id.ivb);
        }
    }

    public C9702eb(MMActivity mMActivity, C9990ta taVar, View view, Fragment fragment) {
        C87412m.m108594g(mMActivity, "baseContext");
        C87412m.m108594g(taVar, "presenter");
        C87412m.m108594g(view, "parent");
        this.f30109d = mMActivity;
        this.f30110e = taVar;
        this.f30111f = view;
        this.f30112g = fragment;
    }

    /* renamed from: b */
    public View mo2654b() {
        return this.f30111f;
    }

    /* renamed from: c */
    public RefreshLoadMoreLayout mo10303c() {
        return mo10307p();
    }

    /* renamed from: d */
    public void mo10304d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        Resources resources = MMApplicationContext.getContext().getResources();
        mo10307p().setLimitTopRequest(((int) resources.getDimension(C0966R.dimen.a8a)) - ((int) resources.getDimension(C0966R.dimen.f3709c2)));
        mo10307p().setRefreshTargetY(((int) resources.getDimension(C0966R.dimen.f3758d_)) - ((int) resources.getDimension(C0966R.dimen.a8a)));
        mo10307p().setDamping(1.85f);
        RecyclerView recyclerView = mo10307p().getRecyclerView();
        recyclerView.setRecycledViewPool(this.f30114i.mo3667e(this.f30109d));
        C14367u0 u0Var = this.f30114i;
        C9703a aVar = new C9703a(this);
        FinderStaggeredConfig finderStaggeredConfig = (FinderStaggeredConfig) u0Var;
        finderStaggeredConfig.getClass();
        this.f30115j = new WxRecyclerAdapter<>(new FinderStaggeredConfig$getItemConvertFactory$1(finderStaggeredConfig, aVar), arrayList, false);
        C14367u0 u0Var2 = this.f30114i;
        Context context = this.f30111f.getContext();
        C87412m.m108593f(context, "parent.context");
        recyclerView.setLayoutManager(u0Var2.mo3666d(context));
        ((FinderStaggeredConfig) this.f30114i).getClass();
        recyclerView.mo17085h0(new FinderStaggeredConfig.C3631b());
        for (C60898l.C60899a aVar2 : this.f30110e.getHeaderInfo()) {
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f30115j;
            if (wxRecyclerAdapter != null) {
                C60898l.m71328U5(wxRecyclerAdapter, aVar2, false, 2, (Object) null);
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter2 = this.f30115j;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f173488o = new C9704b(arrayList, this);
            if (wxRecyclerAdapter2 != null) {
                recyclerView.setAdapter(wxRecyclerAdapter2);
                recyclerView.setHasFixedSize(true);
                recyclerView.setItemViewCacheSize(4);
                mo10307p().setActionCallback(new C9705c(this));
                C58556f j3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f30109d).mo75002a(C13442s8.class)).mo12854j3(4);
                if (j3 != null) {
                    j3.mo83455c(mo10307p().getRecyclerView());
                    return;
                }
                return;
            }
            C87412m.m108603p("adapter");
            throw null;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    /* renamed from: d0 */
    public WxRecyclerAdapter<C0740i2> mo10305d0() {
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f30115j;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public MMFragmentActivity getActivity() {
        return this.f30109d;
    }

    public RecyclerView getRecyclerView() {
        return mo10307p().getRecyclerView();
    }

    /* renamed from: p */
    public final RefreshLoadMoreLayout mo10307p() {
        Object value = ((C36570n) this.f30116n).getValue();
        C87412m.m108593f(value, "<get-rlLayout>(...)");
        return (RefreshLoadMoreLayout) value;
    }
}
