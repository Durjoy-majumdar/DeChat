package kf1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55033u;
import cm1.C55034v;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.feed.model.C55772k;
import com.tencent.p014mm.plugin.finder.view.FinderCommentFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import er1.C58784w3;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C13604l;
import u60.C14121l;
import u60.C65234n;
import ur1.C65468g;

/* renamed from: kf1.e1 */
public final class C61024e1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentDrawerPresenter f173790a;

    /* renamed from: b */
    public final /* synthetic */ boolean f173791b;

    /* renamed from: c */
    public final /* synthetic */ long f173792c;

    /* renamed from: d */
    public final /* synthetic */ C14121l f173793d;

    public C61024e1(FinderCommentDrawerPresenter finderCommentDrawerPresenter, boolean z, long j, C14121l lVar) {
        this.f173790a = finderCommentDrawerPresenter;
        this.f173791b = z;
        this.f173792c = j;
        this.f173793d = lVar;
    }

    public Object call(Object obj) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        RecyclerView recyclerView2;
        int u0;
        RecyclerView recyclerView3;
        RecyclerView.C16613e adapter2;
        RecyclerView recyclerView4;
        RecyclerView.C16613e adapter3;
        C65468g gVar;
        C13604l lVar = (C13604l) obj;
        boolean booleanValue = lVar.f38555d.booleanValue();
        List<C55033u> list = lVar.f38556e;
        C65468g gVar2 = this.f173790a.f158622n;
        if (gVar2 != null) {
            gVar2.mo89592q();
        }
        LinearLayoutManager linearLayoutManager = null;
        boolean z = true;
        if (!this.f173791b) {
            C65468g gVar3 = this.f173790a.f158622n;
            if (gVar3 != null) {
                gVar3.mo89591p().mo82442H(list != null ? list.size() : 0);
            }
        } else {
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173790a;
            if (!finderCommentDrawerPresenter.f158628t && (gVar = finderCommentDrawerPresenter.f158622n) != null) {
                RefreshLoadMoreLayout.m66896C(gVar.mo89591p(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }
        if (this.f173791b) {
            FinderCommentDrawerPresenter.m63415t(this.f173790a);
        }
        if (list == null || list.size() <= 0) {
            Log.m105924i("Finder.DrawerPresenter", "refresh header title...");
            this.f173790a.mo77321N0();
            if (this.f173791b) {
                C55772k kVar = this.f173790a.f158618g;
                kVar.f158793d.clear();
                C55034v vVar = kVar.f158792c;
                if (vVar != null) {
                    kVar.f158792c = vVar;
                    kVar.f158793d.add(vVar);
                }
                C65468g gVar4 = this.f173790a.f158622n;
                if (!(gVar4 == null || (recyclerView = gVar4.mo89591p().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    adapter.notifyDataSetChanged();
                }
                if (booleanValue) {
                    C65468g gVar5 = this.f173790a.f158622n;
                    if (gVar5 != null) {
                        gVar5.mo89594s();
                    }
                } else {
                    FinderCommentDrawerPresenter finderCommentDrawerPresenter2 = this.f173790a;
                    C65468g gVar6 = finderCommentDrawerPresenter2.f158622n;
                    if (gVar6 != null) {
                        gVar6.mo89595t(new C61023d1(finderCommentDrawerPresenter2));
                    }
                }
            }
        } else {
            FinderCommentDrawerPresenter finderCommentDrawerPresenter3 = this.f173790a;
            if (finderCommentDrawerPresenter3.f158632x == 0) {
                C55772k kVar2 = finderCommentDrawerPresenter3.f158618g;
                kVar2.f158793d.clear();
                C55034v vVar2 = kVar2.f158792c;
                if (vVar2 != null) {
                    kVar2.f158792c = vVar2;
                    kVar2.f158793d.add(vVar2);
                }
                C55772k kVar3 = this.f173790a.f158618g;
                kVar3.getClass();
                for (C55033u a : list) {
                    kVar3.mo77381a(a);
                }
                C65468g gVar7 = this.f173790a.f158622n;
                if (!(gVar7 == null || (recyclerView4 = gVar7.mo89591p().getRecyclerView()) == null || (adapter3 = recyclerView4.getAdapter()) == null)) {
                    adapter3.notifyDataSetChanged();
                }
            } else {
                int g = finderCommentDrawerPresenter3.f158618g.mo77387g();
                this.f173790a.f158618g.mo77382b(list, true, false);
                C65468g gVar8 = this.f173790a.f158622n;
                if (!(gVar8 == null || (recyclerView3 = gVar8.mo89591p().getRecyclerView()) == null || (adapter2 = recyclerView3.getAdapter()) == null)) {
                    adapter2.notifyItemRangeInserted(0, this.f173790a.f158618g.mo77387g() - g);
                }
                if (this.f173791b) {
                    FinderCommentDrawerPresenter finderCommentDrawerPresenter4 = this.f173790a;
                    Iterator<C55033u> it = finderCommentDrawerPresenter4.f158618g.f158793d.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (it.next().getItemId() == finderCommentDrawerPresenter4.f158632x) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        C55033u uVar = this.f173790a.f158618g.f158793d.get(i);
                        FinderCommentDrawerPresenter finderCommentDrawerPresenter5 = this.f173790a;
                        C55033u uVar2 = uVar;
                        C65468g gVar9 = finderCommentDrawerPresenter5.f158622n;
                        if (gVar9 != null) {
                            FinderCommentFooter k = gVar9.mo89586k();
                            String p0 = C58784w3.f168295a.mo83955p0(finderCommentDrawerPresenter5.f158621j);
                            String spannableString = uVar2.f154495g.toString();
                            C87412m.m108593f(spannableString, "refCommentObject.displayNickname.toString()");
                            k.mo79744g(p0, spannableString, uVar2.f154492d);
                        }
                        long j = uVar2.f154492d.field_actionInfo.f186500h;
                        if (j != 0 && (u0 = finderCommentDrawerPresenter5.mo77343u0(j)) >= 0) {
                            i = u0;
                        }
                        C65468g gVar10 = this.f173790a.f158622n;
                        RecyclerView.LayoutManager layoutManager = (gVar10 == null || (recyclerView2 = gVar10.mo89591p().getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                        }
                        if (linearLayoutManager != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            aVar.mo10233c(Integer.valueOf(i));
                            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                            C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$refreshFromGetFinderFeedCommentList$2", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$refreshFromGetFinderFeedCommentList$2", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[refreshData] Cost=");
        sb.append(System.currentTimeMillis() - this.f173792c);
        sb.append("ms, succ:");
        if (list == null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("Finder.DrawerPresenter", sb.toString());
        this.f173793d.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
