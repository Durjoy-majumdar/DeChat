package vf1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kf1.C9640c;
import kf1.C9854m5;
import lp3.C88643g;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: vf1.b4 */
public final class C14729b4 extends C9854m5 {

    /* renamed from: q */
    public final C13601g f40695q;

    /* renamed from: r */
    public final C13601g f40696r;

    /* renamed from: s */
    public final C13601g f40697s;

    /* renamed from: t */
    public final C13601g f40698t;

    /* renamed from: vf1.b4$a */
    public static final class C14730a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f40699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14730a(MMActivity mMActivity) {
            super(0);
            this.f40699d = mMActivity;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89989a(this.f40699d));
        }
    }

    /* renamed from: vf1.b4$b */
    public static final class C14731b extends C87413o implements C32226l<Void, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14729b4 f40700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14731b(C14729b4 b4Var) {
            super(1);
            this.f40700d = b4Var;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            C9640c cVar = this.f40700d.f30123e;
            C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
            ((FinderLoaderFeedUIContract$Presenter) cVar).mo2565s1();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vf1.b4$c */
    public static final class C14732c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f40701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14732c(MMActivity mMActivity) {
            super(0);
            this.f40701d = mMActivity;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89994f(this.f40701d));
        }
    }

    /* renamed from: vf1.b4$d */
    public static final class C14733d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f40702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14733d(MMActivity mMActivity) {
            super(0);
            this.f40702d = mMActivity;
        }

        public Object invoke() {
            return this.f40702d.findViewById(C0966R.C0970id.a8c);
        }
    }

    /* renamed from: vf1.b4$e */
    public static final class C14734e extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f40703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14734e(MMActivity mMActivity) {
            super(0);
            this.f40703d = mMActivity;
        }

        public Object invoke() {
            return Float.valueOf(this.f40703d.getResources().getDimension(C0966R.dimen.f3761db));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14729b4(MMActivity mMActivity, C14719a4 a4Var, int i, int i2) {
        super(mMActivity, a4Var, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(a4Var, "presenter");
        this.f40695q = C36568h.m40985a(new C14732c(mMActivity));
        this.f40696r = C36568h.m40985a(new C14730a(mMActivity));
        this.f40697s = C36568h.m40985a(new C14733d(mMActivity));
        this.f40698t = C36568h.m40985a(new C14734e(mMActivity));
    }

    /* renamed from: F0 */
    public void mo5181F0() {
        Pattern pattern = C61926c.f176038a;
        C61926c.m72701z(C88643g.m110546d(), new C14731b(this));
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        RefreshLoadMoreLayout D = mo10308D();
        View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.azy, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…tab_refresh_header, null)");
        D.setRefreshHeaderView(inflate);
        RefreshLoadMoreLayout D2 = mo10308D();
        View inflate2 = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.b7u, (ViewGroup) null);
        C87412m.m108593f(inflate2, "getInflater(context).inf…d_more_footer_dark, null)");
        D2.setLoadMoreFooter(inflate2);
        RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = (RefreshLoadMoreLayout.StickTopLoadingLayout) this.f30122d.findViewById(C0966R.C0970id.eh5);
        stickTopLoadingLayout.setPadding(0, ((Number) ((C36570n) this.f40695q).getValue()).intValue() + (((Number) ((C36570n) this.f40696r).getValue()).intValue() / 2), 0, 0);
        mo10308D().setStickTopLoadingLayout(stickTopLoadingLayout);
        int dimension = (int) this.f30122d.getResources().getDimension(C0966R.dimen.a8a);
        mo10308D().setLimitTopRequest(dimension - ((int) ((Number) ((C36570n) this.f40698t).getValue()).floatValue()));
        mo10308D().setRefreshTargetY(-dimension);
        mo10308D().setDamping(1.6f);
        View findViewById = this.f30122d.findViewById(C0966R.C0970id.i6k);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.profile_recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (recyclerView instanceof FinderRecyclerView) {
            FinderRecyclerView finderRecyclerView = (FinderRecyclerView) recyclerView;
            if (finderRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                FinderRecyclerView.m63293z1(finderRecyclerView, (LinearLayoutManager) layoutManager, (String) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
