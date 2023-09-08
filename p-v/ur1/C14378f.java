package ur1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0793y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
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
import kf1.C10047xb;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: ur1.f */
public final class C14378f implements RecyclerViewDrawerSquares.C45117c {

    /* renamed from: d */
    public final C10047xb f39931d;

    /* renamed from: e */
    public TextView f39932e;

    /* renamed from: f */
    public RefreshLoadMoreLayout f39933f;

    /* renamed from: g */
    public FinderLikeDrawer f39934g;

    /* renamed from: h */
    public FrameLayout f39935h;

    /* renamed from: i */
    public View f39936i;

    /* renamed from: j */
    public TextView f39937j;

    /* renamed from: n */
    public View f39938n;

    /* renamed from: o */
    public Context f39939o;

    /* renamed from: p */
    public boolean f39940p;

    public C14378f(C10047xb xbVar) {
        C87412m.m108594g(xbVar, "presenter");
        this.f39931d = xbVar;
    }

    /* renamed from: a */
    public final void mo13676a(boolean z) {
        if (z) {
            mo13681i().setEnableRefresh(true);
            if (mo13681i().getRefreshHeader() == null) {
                RefreshLoadMoreLayout i = mo13681i();
                View inflate = C85868k2.m106137b(mo13677b()).inflate(C0966R.C0971layout.f359941br1, (ViewGroup) null);
                C87412m.m108593f(inflate, "getInflater(context).inf…out.refresh_header, null)");
                i.setRefreshHeaderView(inflate);
                return;
            }
            return;
        }
        mo13681i().setEnableRefresh(false);
    }

    /* renamed from: b */
    public final Context mo13677b() {
        Context context = this.f39939o;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* renamed from: c */
    public final FinderLikeDrawer mo13678c() {
        FinderLikeDrawer finderLikeDrawer = this.f39934g;
        if (finderLikeDrawer != null) {
            return finderLikeDrawer;
        }
        C87412m.m108603p("likeDrawer");
        throw null;
    }

    /* renamed from: d */
    public final TextView mo13679d() {
        TextView textView = this.f39937j;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("nothingView");
        throw null;
    }

    /* renamed from: e */
    public void mo9497e(float f) {
    }

    /* renamed from: f */
    public void mo9498f() {
        this.f39931d.onDetach();
        mo13678c().mo82543k(this);
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
        Class cls = C58417y0.class;
        if (z && z2) {
            C10047xb xbVar = this.f39931d;
            FinderItem feedObj = mo13678c().getFeedObj();
            C87412m.m108591d(feedObj);
            xbVar.mo2536g(this, feedObj, mo13678c().getLikeBuffer());
        } else if (!z && z2) {
            this.f39931d.onDetach();
        }
        if (!z) {
            int scene = this.f39931d.getScene();
            FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
            if (scene == 1 && !this.f39940p) {
                this.f39940p = true;
                RecyclerView.C16613e adapter = mo13681i().getRecyclerView().getAdapter();
                if (adapter != null && (adapter instanceof WxRecyclerAdapter)) {
                    String yP = ((C58417y0) C86312j.m106911c(cls)).mo83357yP();
                    int e = this.f39931d.mo2550e();
                    WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
                    int size = wxRecyclerAdapter.f165747z.size();
                    String str = "";
                    for (int i2 = 0; i2 < size; i2++) {
                        C33631s valueAt = wxRecyclerAdapter.f165747z.valueAt(i2);
                        C9493c cVar = valueAt.f91020a;
                        if (cVar instanceof C0793y) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            C0793y yVar = (C0793y) cVar;
                            sb.append(yVar.f1851d.f138729i);
                            sb.append(';');
                            sb.append(valueAt.f91022c);
                            sb.append(';');
                            sb.append(yVar.f1851d.f138727g);
                            sb.append('#');
                            str = sb.toString();
                        }
                    }
                    C58784w3 w3Var = C58784w3.f168295a;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(mo13677b());
                    C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                    FinderItem feedObj2 = mo13678c().getFeedObj();
                    C58739j4 j4Var = C58739j4.f168176a;
                    if (q3 != null && feedObj2 != null) {
                        ((C58417y0) C86312j.m106911c(cls)).Kx0(q3, str, feedObj2.getId(), e, yP);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f39940p = false;
    }

    /* renamed from: h */
    public final View mo13680h() {
        View view = this.f39938n;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: i */
    public final RefreshLoadMoreLayout mo13681i() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f39933f;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: j */
    public final void mo13682j() {
        FrameLayout frameLayout = this.f39935h;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            View view = this.f39936i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo13679d().setVisibility(8);
                View h = mo13680h();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = h;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                h.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("loadingView");
            throw null;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }
}
