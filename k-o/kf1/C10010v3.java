package kf1;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0793y;
import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32226l;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C50581nr0;
import u60.C14121l;
import u60.C65234n;
import ur1.C14377e;
import ur1.C14378f;

/* renamed from: kf1.v3 */
public final class C10010v3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32226l<LinkedList<C50581nr0>, LinkedList<C50581nr0>> f30699a;

    /* renamed from: b */
    public final /* synthetic */ FinderLikeDrawerPresenter f30700b;

    /* renamed from: c */
    public final /* synthetic */ boolean f30701c;

    /* renamed from: d */
    public final /* synthetic */ long f30702d;

    /* renamed from: e */
    public final /* synthetic */ C14121l f30703e;

    public C10010v3(C32226l<? super LinkedList<C50581nr0>, ? extends LinkedList<C50581nr0>> lVar, FinderLikeDrawerPresenter finderLikeDrawerPresenter, boolean z, long j, C14121l lVar2) {
        this.f30699a = lVar;
        this.f30700b = finderLikeDrawerPresenter;
        this.f30701c = z;
        this.f30702d = j;
        this.f30703e = lVar2;
    }

    public Object call(Object obj) {
        LinkedList linkedList;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        RecyclerView recyclerView2;
        RecyclerView.C16613e adapter2;
        C14378f fVar;
        C13604l lVar = (C13604l) obj;
        C32226l<LinkedList<C50581nr0>, LinkedList<C50581nr0>> lVar2 = this.f30699a;
        if (lVar2 == null || (linkedList = lVar2.invoke(lVar.f38556e)) == null) {
            linkedList = (LinkedList) lVar.f38556e;
        }
        C14378f fVar2 = this.f30700b.f13106j;
        if (fVar2 != null) {
            FrameLayout frameLayout = fVar2.f39935h;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                fVar2.mo13680h().setOnClickListener((View.OnClickListener) null);
            } else {
                C87412m.m108603p("loadingLayout");
                throw null;
            }
        }
        boolean z = true;
        if (!this.f30701c) {
            C14378f fVar3 = this.f30700b.f13106j;
            if (fVar3 != null) {
                fVar3.mo13681i().mo82442H(linkedList != null ? linkedList.size() : 0);
            }
        } else {
            FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f30700b;
            if (!finderLikeDrawerPresenter.f13108o && (fVar = finderLikeDrawerPresenter.f13106j) != null) {
                RefreshLoadMoreLayout.m66896C(fVar.mo13681i(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }
        if (this.f30701c) {
            FinderLikeDrawerPresenter finderLikeDrawerPresenter2 = this.f30700b;
            if (!finderLikeDrawerPresenter2.f13107n) {
                C14378f fVar4 = finderLikeDrawerPresenter2.f13106j;
                if (fVar4 != null) {
                    fVar4.mo13676a(false);
                }
                C14378f fVar5 = finderLikeDrawerPresenter2.f13106j;
                if (fVar5 != null) {
                    fVar5.mo13678c().mo82529d(true);
                }
            }
        }
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105924i("Finder.DrawerPresenter", "refresh header title...");
            this.f30700b.mo2555o();
            if (this.f30701c) {
                this.f30700b.f13103g.clear();
                C14378f fVar6 = this.f30700b.f13106j;
                if (!(fVar6 == null || (recyclerView = fVar6.mo13681i().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    adapter.notifyDataSetChanged();
                }
                if (((Boolean) lVar.f38555d).booleanValue()) {
                    C14378f fVar7 = this.f30700b.f13106j;
                    if (fVar7 != null) {
                        FrameLayout frameLayout2 = fVar7.f39935h;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(0);
                            View view = fVar7.f39936i;
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                fVar7.mo13679d().setVisibility(0);
                                View h = fVar7.mo13680h();
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(8);
                                View view3 = h;
                                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                h.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                C87412m.m108603p("loadingView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("loadingLayout");
                            throw null;
                        }
                    }
                } else {
                    FinderLikeDrawerPresenter finderLikeDrawerPresenter3 = this.f30700b;
                    C14378f fVar8 = finderLikeDrawerPresenter3.f13106j;
                    if (fVar8 != null) {
                        C9997u3 u3Var = new C9997u3(finderLikeDrawerPresenter3);
                        FrameLayout frameLayout3 = fVar8.f39935h;
                        if (frameLayout3 != null) {
                            frameLayout3.setVisibility(0);
                            View view4 = fVar8.f39936i;
                            if (view4 != null) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar3.mo10233c(8);
                                View view5 = view4;
                                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                fVar8.mo13679d().setVisibility(8);
                                View h2 = fVar8.mo13680h();
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(0);
                                View view6 = h2;
                                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                h2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                fVar8.mo13680h().setOnClickListener(new C14377e(u3Var));
                            } else {
                                C87412m.m108603p("loadingView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("loadingLayout");
                            throw null;
                        }
                    }
                }
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C50581nr0 nr02 = (C50581nr0) it.next();
                ArrayList<C0793y> arrayList = this.f30700b.f13103g;
                C87412m.m108593f(nr02, "finderLikeInfo");
                C0793y yVar = new C0793y(nr02);
                if (this.f30700b.f13101e != null && yVar.f1851d.f138731n == 1) {
                    yVar.f1852e = true;
                }
                arrayList.add(yVar);
            }
            C14378f fVar9 = this.f30700b.f13106j;
            if (!(fVar9 == null || (recyclerView2 = fVar9.mo13681i().getRecyclerView()) == null || (adapter2 = recyclerView2.getAdapter()) == null)) {
                adapter2.notifyDataSetChanged();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[refreshData] Cost=");
        sb.append(System.currentTimeMillis() - this.f30702d);
        sb.append("ms, succ:");
        if (linkedList == null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("Finder.DrawerPresenter", sb.toString());
        this.f30703e.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
