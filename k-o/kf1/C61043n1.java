package kf1;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0787w;
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
import te3.C50557nk0;
import u60.C14121l;
import u60.C65234n;
import ur1.C14375b;
import ur1.C65467c;

/* renamed from: kf1.n1 */
public final class C61043n1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32226l<LinkedList<C50557nk0>, LinkedList<C50557nk0>> f173838a;

    /* renamed from: b */
    public final /* synthetic */ C61028h1 f173839b;

    /* renamed from: c */
    public final /* synthetic */ boolean f173840c;

    /* renamed from: d */
    public final /* synthetic */ long f173841d;

    /* renamed from: e */
    public final /* synthetic */ C14121l f173842e;

    public C61043n1(C32226l<? super LinkedList<C50557nk0>, ? extends LinkedList<C50557nk0>> lVar, C61028h1 h1Var, boolean z, long j, C14121l lVar2) {
        this.f173838a = lVar;
        this.f173839b = h1Var;
        this.f173840c = z;
        this.f173841d = j;
        this.f173842e = lVar2;
    }

    public Object call(Object obj) {
        LinkedList linkedList;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        RecyclerView recyclerView2;
        RecyclerView.C16613e adapter2;
        C65467c cVar;
        C13604l lVar = (C13604l) obj;
        C32226l<LinkedList<C50557nk0>, LinkedList<C50557nk0>> lVar2 = this.f173838a;
        if (lVar2 == null || (linkedList = lVar2.invoke(lVar.f38556e)) == null) {
            linkedList = (LinkedList) lVar.f38556e;
        }
        C65467c cVar2 = this.f173839b.f173805n;
        if (cVar2 != null) {
            FrameLayout frameLayout = cVar2.f188393h;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                cVar2.mo89581d().setOnClickListener((View.OnClickListener) null);
            } else {
                C87412m.m108603p("loadingLayout");
                throw null;
            }
        }
        boolean z = true;
        if (!this.f173840c) {
            C65467c cVar3 = this.f173839b.f173805n;
            if (cVar3 != null) {
                cVar3.mo89582h().mo82442H(linkedList != null ? linkedList.size() : 0);
            }
        } else {
            C61028h1 h1Var = this.f173839b;
            if (!h1Var.f173809r && (cVar = h1Var.f173805n) != null) {
                RefreshLoadMoreLayout.m66896C(cVar.mo89582h(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }
        if (this.f173840c) {
            C61028h1 h1Var2 = this.f173839b;
            if (!h1Var2.f173808q) {
                C65467c cVar4 = h1Var2.f173805n;
                if (cVar4 != null) {
                    cVar4.mo89578a(false);
                }
                C65467c cVar5 = h1Var2.f173805n;
                if (cVar5 != null) {
                    cVar5.mo89579b().mo82529d(true);
                }
            }
        }
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105924i("Finder.FavListDrawerPresenter", "refresh header title...");
            this.f173839b.mo85989l();
            if (this.f173840c) {
                this.f173839b.f173804j.clear();
                C65467c cVar6 = this.f173839b.f173805n;
                if (!(cVar6 == null || (recyclerView = cVar6.mo89582h().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    adapter.notifyDataSetChanged();
                }
                if (((Boolean) lVar.f38555d).booleanValue()) {
                    C65467c cVar7 = this.f173839b.f173805n;
                    if (cVar7 != null) {
                        FrameLayout frameLayout2 = cVar7.f188393h;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(0);
                            View view = cVar7.f188394i;
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                cVar7.mo89580c().setVisibility(0);
                                View d = cVar7.mo89581d();
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(8);
                                View view3 = d;
                                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                d.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                    C61028h1 h1Var3 = this.f173839b;
                    C65467c cVar8 = h1Var3.f173805n;
                    if (cVar8 != null) {
                        C61041m1 m1Var = new C61041m1(h1Var3);
                        FrameLayout frameLayout3 = cVar8.f188393h;
                        if (frameLayout3 != null) {
                            frameLayout3.setVisibility(0);
                            View view4 = cVar8.f188394i;
                            if (view4 != null) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar3.mo10233c(8);
                                View view5 = view4;
                                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                cVar8.mo89580c().setVisibility(8);
                                View d2 = cVar8.mo89581d();
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(0);
                                View view6 = d2;
                                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                d2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                cVar8.mo89581d().setOnClickListener(new C14375b(m1Var));
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
                C50557nk0 nk02 = (C50557nk0) it.next();
                ArrayList<C0787w> arrayList = this.f173839b.f173804j;
                C87412m.m108593f(nk02, "FinderFavInfo");
                arrayList.add(new C0787w(nk02));
            }
            C65467c cVar9 = this.f173839b.f173805n;
            if (!(cVar9 == null || (recyclerView2 = cVar9.mo89582h().getRecyclerView()) == null || (adapter2 = recyclerView2.getAdapter()) == null)) {
                adapter2.notifyDataSetChanged();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[refreshData] Cost=");
        sb.append(System.currentTimeMillis() - this.f173841d);
        sb.append("ms, succ:");
        if (linkedList == null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("Finder.FavListDrawerPresenter", sb.toString());
        this.f173842e.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
