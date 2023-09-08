package ur1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0787w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import jq3.C33631s;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kf1.C61072yb;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: ur1.c */
public final class C65467c implements RecyclerViewDrawerSquares.C45117c {

    /* renamed from: d */
    public final C61072yb f188389d;

    /* renamed from: e */
    public TextView f188390e;

    /* renamed from: f */
    public RefreshLoadMoreLayout f188391f;

    /* renamed from: g */
    public FinderFavDrawer f188392g;

    /* renamed from: h */
    public FrameLayout f188393h;

    /* renamed from: i */
    public View f188394i;

    /* renamed from: j */
    public TextView f188395j;

    /* renamed from: n */
    public View f188396n;

    /* renamed from: o */
    public Context f188397o;

    /* renamed from: p */
    public boolean f188398p;

    public C65467c(C61072yb ybVar) {
        C87412m.m108594g(ybVar, "presenter");
        this.f188389d = ybVar;
    }

    /* renamed from: a */
    public final void mo89578a(boolean z) {
        if (z) {
            mo89582h().setEnableRefresh(true);
            if (mo89582h().getRefreshHeader() == null) {
                RefreshLoadMoreLayout h = mo89582h();
                Context context = this.f188397o;
                if (context != null) {
                    View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f359941br1, (ViewGroup) null);
                    C87412m.m108593f(inflate, "getInflater(context).inf…out.refresh_header, null)");
                    h.setRefreshHeaderView(inflate);
                    return;
                }
                C87412m.m108603p("context");
                throw null;
            }
            return;
        }
        mo89582h().setEnableRefresh(false);
    }

    /* renamed from: b */
    public final FinderFavDrawer mo89579b() {
        FinderFavDrawer finderFavDrawer = this.f188392g;
        if (finderFavDrawer != null) {
            return finderFavDrawer;
        }
        C87412m.m108603p("favDrawer");
        throw null;
    }

    /* renamed from: c */
    public final TextView mo89580c() {
        TextView textView = this.f188395j;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("nothingView");
        throw null;
    }

    /* renamed from: d */
    public final View mo89581d() {
        View view = this.f188396n;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: e */
    public void mo9497e(float f) {
    }

    /* renamed from: f */
    public void mo9498f() {
        this.f188389d.onDetach();
        mo89579b().mo82543k(this);
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
        Class cls = C58417y0.class;
        if (z && z2) {
            C61072yb ybVar = this.f188389d;
            FinderItem feedObj = mo89579b().getFeedObj();
            C87412m.m108591d(feedObj);
            ybVar.mo85984g(this, feedObj);
        } else if (!z && z2) {
            this.f188389d.onDetach();
        }
        if (!z) {
            int scene = this.f188389d.getScene();
            FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
            if (scene == 1 && !this.f188398p) {
                this.f188398p = true;
                RecyclerView.C16613e adapter = mo89582h().getRecyclerView().getAdapter();
                if (adapter != null && (adapter instanceof WxRecyclerAdapter)) {
                    String yP = ((C58417y0) C86312j.m106911c(cls)).mo83357yP();
                    int e = this.f188389d.mo85982e();
                    WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
                    int size = wxRecyclerAdapter.f165747z.size();
                    String str = "";
                    for (int i2 = 0; i2 < size; i2++) {
                        C33631s valueAt = wxRecyclerAdapter.f165747z.valueAt(i2);
                        C9493c cVar = valueAt.f91020a;
                        if (cVar instanceof C0787w) {
                            str = str + ((C0787w) cVar).f1843d.f138638g + ';' + valueAt.f91022c + "}#";
                        }
                    }
                    C58784w3 w3Var = C58784w3.f168295a;
                    C13442s8.C13443a aVar = C13442s8.f38060Q0;
                    Context context = this.f188397o;
                    if (context != null) {
                        C13442s8 f = aVar.mo12873f(context);
                        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                        FinderItem feedObj2 = mo89579b().getFeedObj();
                        C58739j4 j4Var = C58739j4.f168176a;
                        if (q3 != null && feedObj2 != null) {
                            ((C58417y0) C86312j.m106911c(cls)).Kx0(q3, str, feedObj2.getId(), e, yP);
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("context");
                    throw null;
                }
                return;
            }
            return;
        }
        this.f188398p = false;
    }

    /* renamed from: h */
    public final RefreshLoadMoreLayout mo89582h() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f188391f;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: i */
    public final void mo89583i() {
        FrameLayout frameLayout = this.f188393h;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            View view = this.f188394i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo89580c().setVisibility(8);
                View d = mo89581d();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = d;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                d.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("loadingView");
            throw null;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }
}
