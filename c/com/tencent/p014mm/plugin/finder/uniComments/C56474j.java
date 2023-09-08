package com.tencent.p014mm.plugin.finder.uniComments;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import lq1.C10639h0;
import lq1.C61346b0;
import lq1.C61356g0;
import rx3.C13598b0;
import rx3.C13604l;
import sq1.C64151e;
import u60.C14121l;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.uniComments.j */
public final class C56474j<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ UniCommentDrawerPresenter f161467a;

    /* renamed from: b */
    public final /* synthetic */ boolean f161468b;

    /* renamed from: c */
    public final /* synthetic */ long f161469c;

    /* renamed from: d */
    public final /* synthetic */ C14121l f161470d;

    public C56474j(UniCommentDrawerPresenter uniCommentDrawerPresenter, boolean z, long j, C14121l lVar) {
        this.f161467a = uniCommentDrawerPresenter;
        this.f161468b = z;
        this.f161469c = j;
        this.f161470d = lVar;
    }

    public Object call(Object obj) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        int i;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.C16613e adapter2;
        RecyclerView recyclerView4;
        RecyclerView.C16613e adapter3;
        C61356g0 g0Var;
        C13604l lVar = (C13604l) obj;
        boolean booleanValue = lVar.f38555d.booleanValue();
        List<C64151e> list = lVar.f38556e;
        C61356g0 g0Var2 = this.f161467a.f161382j;
        LinearLayoutManager linearLayoutManager = null;
        if (g0Var2 != null) {
            g0Var2.mo86317n().setVisibility(8);
            g0Var2.mo86319p().setOnClickListener((View.OnClickListener) null);
        }
        if (!this.f161468b) {
            C61356g0 g0Var3 = this.f161467a.f161382j;
            if (g0Var3 != null) {
                g0Var3.mo86320q().mo82442H(list != null ? list.size() : 0);
            }
        } else {
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161467a;
            if (!uniCommentDrawerPresenter.f161387r && (g0Var = uniCommentDrawerPresenter.f161382j) != null) {
                RefreshLoadMoreLayout.m66896C(g0Var.mo86320q(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }
        if (this.f161468b) {
            UniCommentDrawerPresenter uniCommentDrawerPresenter2 = this.f161467a;
            if (!uniCommentDrawerPresenter2.f161386q) {
                C61356g0 g0Var4 = uniCommentDrawerPresenter2.f161382j;
                if (g0Var4 != null) {
                    g0Var4.mo86311h(false);
                }
                C61356g0 g0Var5 = uniCommentDrawerPresenter2.f161382j;
                if (g0Var5 != null) {
                    g0Var5.mo86312i().mo82529d(true);
                }
            }
        }
        if (list == null || list.size() <= 0) {
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "refresh header title...");
            this.f161467a.mo79241n0();
            if (this.f161468b) {
                this.f161467a.f161378f.f174500a.clear();
                C61356g0 g0Var6 = this.f161467a.f161382j;
                if (!(g0Var6 == null || (recyclerView = g0Var6.mo86320q().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    adapter.notifyDataSetChanged();
                }
                if (booleanValue) {
                    C61356g0 g0Var7 = this.f161467a.f161382j;
                    if (g0Var7 != null) {
                        g0Var7.mo86317n().setVisibility(0);
                        View view = g0Var7.f174531n;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            if (g0Var7.mo86312i().getCloseComment()) {
                                View o = g0Var7.mo86318o();
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(8);
                                View view3 = o;
                                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                o.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                View o2 = g0Var7.mo86318o();
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(0);
                                View view4 = o2;
                                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                o2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View p = g0Var7.mo86319p();
                            C9556a aVar4 = new C9556a();
                            aVar4.mo10233c(8);
                            View view5 = p;
                            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            p.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("loadingView");
                            throw null;
                        }
                    }
                } else {
                    UniCommentDrawerPresenter uniCommentDrawerPresenter3 = this.f161467a;
                    C61356g0 g0Var8 = uniCommentDrawerPresenter3.f161382j;
                    if (g0Var8 != null) {
                        C56473i iVar = new C56473i(uniCommentDrawerPresenter3);
                        g0Var8.mo86317n().setVisibility(0);
                        View view6 = g0Var8.f174531n;
                        if (view6 != null) {
                            C9556a aVar5 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar5.mo10233c(8);
                            View view7 = view6;
                            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View o3 = g0Var8.mo86318o();
                            C9556a aVar6 = new C9556a();
                            aVar6.mo10233c(8);
                            View view8 = o3;
                            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            o3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View p2 = g0Var8.mo86319p();
                            C9556a aVar7 = new C9556a();
                            aVar7.mo10233c(0);
                            View view9 = p2;
                            C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            p2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            g0Var8.mo86319p().setOnClickListener(new C10639h0(iVar));
                        } else {
                            C87412m.m108603p("loadingView");
                            throw null;
                        }
                    }
                }
            }
        } else {
            UniCommentDrawerPresenter uniCommentDrawerPresenter4 = this.f161467a;
            if (uniCommentDrawerPresenter4.f161390u == 0) {
                uniCommentDrawerPresenter4.f161378f.f174500a.clear();
                C61346b0 b0Var = this.f161467a.f161378f;
                b0Var.getClass();
                for (C64151e a : list) {
                    b0Var.mo86296a(a, true);
                }
                C61356g0 g0Var9 = this.f161467a.f161382j;
                if (!(g0Var9 == null || (recyclerView4 = g0Var9.mo86320q().getRecyclerView()) == null || (adapter3 = recyclerView4.getAdapter()) == null)) {
                    adapter3.notifyDataSetChanged();
                }
            } else {
                int f = uniCommentDrawerPresenter4.f161378f.mo86301f();
                this.f161467a.f161378f.mo86297b(list, true, false);
                C61356g0 g0Var10 = this.f161467a.f161382j;
                if (!(g0Var10 == null || (recyclerView3 = g0Var10.mo86320q().getRecyclerView()) == null || (adapter2 = recyclerView3.getAdapter()) == null)) {
                    adapter2.notifyItemRangeInserted(0, this.f161467a.f161378f.mo86301f() - f);
                }
                if (this.f161468b) {
                    UniCommentDrawerPresenter uniCommentDrawerPresenter5 = this.f161467a;
                    Iterator<C64151e> it = uniCommentDrawerPresenter5.f161378f.f174500a.iterator();
                    int i2 = 0;
                    while (true) {
                        i = -1;
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        Iterator<C64151e> it4 = it;
                        if (it.next().getItemId() == uniCommentDrawerPresenter5.f161390u) {
                            break;
                        }
                        i2++;
                        it = it4;
                    }
                    if (i2 >= 0) {
                        C64151e eVar = this.f161467a.f161378f.f174500a.get(i2);
                        UniCommentDrawerPresenter uniCommentDrawerPresenter6 = this.f161467a;
                        C64151e eVar2 = eVar;
                        C61356g0 g0Var11 = uniCommentDrawerPresenter6.f161382j;
                        if (g0Var11 != null) {
                            UniCommentFooter k = g0Var11.mo86314k();
                            C58784w3 w3Var = C58784w3.f168295a;
                            k.mo79255g(w3Var.mo83955p0(uniCommentDrawerPresenter6.f161381i), w3Var.mo83898R(eVar2.f181868d.getUsername(), eVar2.f181868d.getNickname(), false), eVar2.f181868d);
                        }
                        long j = eVar2.f181868d.field_actionInfo.f186500h;
                        int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                        if (i3 != 0) {
                            if (i3 != 0) {
                                Iterator<C64151e> it5 = uniCommentDrawerPresenter6.f161378f.f174500a.iterator();
                                int i4 = 0;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    if (it5.next().f181868d.mo88875m2() == j) {
                                        i = i4;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            if (i >= 0) {
                                i2 = i;
                            }
                        }
                        C61356g0 g0Var12 = this.f161467a.f161382j;
                        RecyclerView.LayoutManager layoutManager = (g0Var12 == null || (recyclerView2 = g0Var12.mo86320q().getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                        }
                        if (linearLayoutManager != null) {
                            C9556a aVar8 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar8.mo10233c(0);
                            aVar8.mo10233c(Integer.valueOf(i2));
                            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                            C117292a.m165358d(linearLayoutManager2, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            linearLayoutManager.mo16973V(((Integer) aVar8.mo10231a(0)).intValue(), ((Integer) aVar8.mo10231a(1)).intValue());
                            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[refreshData] Cost=");
        sb.append(System.currentTimeMillis() - this.f161469c);
        sb.append("ms, succ:");
        sb.append(list != null);
        Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", sb.toString());
        this.f161470d.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
