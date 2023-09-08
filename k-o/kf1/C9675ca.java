package kf1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0716c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderLbsConfig$getItemConvertFactory$1;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dp1.C20480e0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import rs1.C13442s8;
import rx3.C13600d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import up1.C14359r;
import ve1.C14443a1;
import xr1.C15881b;

/* renamed from: kf1.ca */
public final class C9675ca implements C9940q9<C0716c> {

    /* renamed from: d */
    public final MMActivity f30060d;

    /* renamed from: e */
    public final C9930p9<C0716c> f30061e;

    /* renamed from: f */
    public final View f30062f;

    /* renamed from: g */
    public C14359r f30063g;

    /* renamed from: h */
    public final C13601g f30064h = C36568h.m40985a(new C9679d(this));

    /* renamed from: kf1.ca$a */
    public static final class C9676a extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C9675ca f30065a;

        public C9676a(C9675ca caVar) {
            this.f30065a = caVar;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            this.f30065a.f30061e.onLoadMore();
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C20480e0.m22094n(C20480e0.f57583a, 2, false, (C49712hj1) null, false, 0, false, 60, (Object) null);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            this.f30065a.f30061e.onRefresh();
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30065a.f30061e.onRefreshEnd(cVar);
            C20480e0.m22094n(C20480e0.f57583a, 2, false, ((C13442s8) C39818r.f106831a.mo62444c(this.f30065a.f30060d).mo75002a(C13442s8.class)).mo12861q3(), false, 0, false, 56, (Object) null);
        }
    }

    /* renamed from: kf1.ca$b */
    public static final class C9677b extends WxRecyclerAdapter<C0716c> {
        public C9677b(ArrayList<C0716c> arrayList, C9500j jVar) {
            super(jVar, arrayList, false);
        }

        /* renamed from: w6 */
        public void mo10297w6(RecyclerView recyclerView) {
            C87412m.m108594g(recyclerView, "recyclerView");
        }

        /* renamed from: z6 */
        public void onViewAttachedToWindow(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            super.onViewAttachedToWindow(oVar);
        }
    }

    /* renamed from: kf1.ca$c */
    public static final class C9678c extends C87413o implements C32226l<Integer, C60896i<?>> {

        /* renamed from: d */
        public final /* synthetic */ C9675ca f30066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9678c(C9675ca caVar) {
            super(1);
            this.f30066d = caVar;
        }

        public Object invoke(Object obj) {
            if (((Number) obj).intValue() == -1) {
                return new C14443a1(new C9690da(this.f30066d), new C9701ea(this.f30066d), false, 4, (C8480h) null);
            }
            C87412m.m108591d((Object) null);
            throw new C13600d();
        }
    }

    /* renamed from: kf1.ca$d */
    public static final class C9679d extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C9675ca f30067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9679d(C9675ca caVar) {
            super(0);
            this.f30067d = caVar;
        }

        public Object invoke() {
            return (RefreshLoadMoreLayout) this.f30067d.f30062f.findViewById(C0966R.C0970id.ivb);
        }
    }

    public C9675ca(MMActivity mMActivity, C9930p9<C0716c> p9Var, View view) {
        C87412m.m108594g(mMActivity, "baseContext");
        C87412m.m108594g(p9Var, "presenter");
        C87412m.m108594g(view, "parent");
        this.f30060d = mMActivity;
        this.f30061e = p9Var;
        this.f30062f = view;
        this.f30063g = new C14359r((String) null, (String) null, mMActivity, 3, (C8480h) null);
    }

    /* renamed from: c */
    public RefreshLoadMoreLayout mo10293c() {
        return mo10296p();
    }

    /* renamed from: d */
    public void mo10294d(ArrayList<C0716c> arrayList) {
        C87412m.m108594g(arrayList, "data");
        Resources resources = MMApplicationContext.getContext().getResources();
        mo10296p().setLimitTopRequest(((int) resources.getDimension(C0966R.dimen.a8a)) - ((int) resources.getDimension(C0966R.dimen.f3709c2)));
        mo10296p().setRefreshTargetY(((int) resources.getDimension(C0966R.dimen.f3758d_)) - ((int) resources.getDimension(C0966R.dimen.a8a)));
        mo10296p().setDamping(1.85f);
        RecyclerView recyclerView = mo10296p().getRecyclerView();
        C14359r rVar = this.f30063g;
        Context context = this.f30062f.getContext();
        C87412m.m108593f(context, "parent.context");
        rVar.getClass();
        recyclerView.setLayoutManager(new FinderLinearLayoutManager(context));
        C14359r rVar2 = this.f30063g;
        Context context2 = this.f30062f.getContext();
        C87412m.m108593f(context2, "parent.context");
        rVar2.getClass();
        recyclerView.mo17085h0(new C15881b(new ColorDrawable(context2.getResources().getColor(C0966R.color.BW_93)), (int) context2.getResources().getDimension(C0966R.dimen.a5w)));
        C14359r rVar3 = this.f30063g;
        C9678c cVar = new C9678c(this);
        C9930p9<C0716c> p9Var = this.f30061e;
        rVar3.getClass();
        C87412m.m108594g(p9Var, "presenter");
        recyclerView.setAdapter(new C9677b(arrayList, new FinderLbsConfig$getItemConvertFactory$1(p9Var, cVar, rVar3)));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        mo10296p().setActionCallback(new C9676a(this));
    }

    public MMFragmentActivity getActivity() {
        return this.f30060d;
    }

    public RecyclerView getRecyclerView() {
        return mo10296p().getRecyclerView();
    }

    /* renamed from: p */
    public final RefreshLoadMoreLayout mo10296p() {
        Object value = ((C36570n) this.f30064h).getValue();
        C87412m.m108593f(value, "<get-rlLayout>(...)");
        return (RefreshLoadMoreLayout) value;
    }
}
