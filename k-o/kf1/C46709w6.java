package kf1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import zt3.C119157j;

/* renamed from: kf1.w6 */
public final class C46709w6 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ C46697b7 f125746a;

    /* renamed from: kf1.w6$a */
    public static final class C46710a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C46697b7 f125747d;

        /* renamed from: e */
        public final /* synthetic */ View f125748e;

        /* renamed from: kf1.w6$a$a */
        public static final class C46711a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C46697b7 f125749d;

            public C46711a(C46697b7 b7Var) {
                this.f125749d = b7Var;
            }

            public final void run() {
                C46704t6 t6Var = this.f125749d.f125716e;
                if (t6Var.f125737p) {
                    t6Var.f125731g = null;
                    t6Var.mo71952e(false, 1);
                    return;
                }
                t6Var.f125731g = null;
                t6Var.mo71952e(false, 2);
            }
        }

        public C46710a(C46697b7 b7Var, View view) {
            this.f125747d = b7Var;
            this.f125748e = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4$onRefreshEnd$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4$onRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4$onRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C46697b7.m52000p(this.f125747d, false);
            View findViewById = this.f125748e.findViewById(C0966R.C0970id.i7j);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = findViewById;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4$onRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4$onRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C46711a(this.f125747d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4$onRefreshEnd$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C46709w6(C46697b7 b7Var) {
        this.f125746a = b7Var;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        this.f125746a.f125716e.mo71952e(true, 2);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C46697b7 b7Var = this.f125746a;
        if (!b7Var.f125716e.f125736o) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = b7Var.f125717f;
            if (refreshLoadMoreLayout != null) {
                RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        C46704t6 t6Var = this.f125746a.f125716e;
        t6Var.f125731g = null;
        t6Var.mo71952e(false, 2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, fy3.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        ? r1;
        RefreshLoadMoreLayout.C7080c<Object> cVar2 = cVar;
        C87412m.m108594g(cVar2, TPReportKeys.PlayerStep.PLAYER_REASON);
        View findViewById = this.f125746a.f125715d.findViewById(C0966R.C0970id.cjg);
        if (findViewById != null) {
            C46697b7 b7Var = this.f125746a;
            RefreshLoadMoreLayout refreshLoadMoreLayout = b7Var.f125717f;
            if (refreshLoadMoreLayout != null) {
                RecyclerView.C16613e adapter = refreshLoadMoreLayout.getRecyclerView().getAdapter();
                WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
                if (cVar2.f24947b != -1) {
                    if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) <= 0) {
                        View findViewById2 = b7Var.f125715d.findViewById(C0966R.C0970id.cjg);
                        if (findViewById2 != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view = findViewById2;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            RefreshLoadMoreLayout refreshLoadMoreLayout2 = b7Var.f125717f;
                            if (refreshLoadMoreLayout2 != null) {
                                refreshLoadMoreLayout2.setVisibility(8);
                                TextView textView = (TextView) findViewById2.findViewById(C0966R.C0970id.cj7);
                                if (textView != null) {
                                    textView.setVisibility(0);
                                }
                                View findViewById3 = findViewById2.findViewById(C0966R.C0970id.i7j);
                                if (findViewById3 != null) {
                                    C9556a aVar2 = new C9556a();
                                    aVar2.mo10233c(8);
                                    View view2 = findViewById3;
                                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                View findViewById4 = findViewById2.findViewById(C0966R.C0970id.is_);
                                if (findViewById4 != null) {
                                    C9556a aVar3 = new C9556a();
                                    aVar3.mo10233c(8);
                                    View view3 = findViewById4;
                                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        }
                    } else {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view4 = findViewById;
                        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = b7Var.f125717f;
                        if (refreshLoadMoreLayout3 != null) {
                            refreshLoadMoreLayout3.setVisibility(0);
                        } else {
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                    }
                } else {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view5 = findViewById;
                    C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = b7Var.f125717f;
                    if (refreshLoadMoreLayout4 != null) {
                        refreshLoadMoreLayout4.setVisibility(8);
                        TextView textView2 = (TextView) findViewById.findViewById(C0966R.C0970id.cj7);
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        TextView textView3 = (TextView) findViewById.findViewById(C0966R.C0970id.is_);
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                        View findViewById5 = findViewById.findViewById(C0966R.C0970id.i7j);
                        if (findViewById5 != null) {
                            C9556a aVar6 = new C9556a();
                            aVar6.mo10233c(8);
                            C117292a.m165358d(findViewById5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                            C117292a.m165359e(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C46697b7.m52000p(b7Var, true);
                        View findViewById6 = findViewById.findViewById(C0966R.C0970id.is_);
                        if (findViewById6 != null) {
                            findViewById6.setOnClickListener(new C46710a(b7Var, findViewById));
                        }
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                }
                r1 = 0;
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        } else {
            r1 = 0;
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f125746a.f125717f;
        if (refreshLoadMoreLayout5 != null) {
            RefreshLoadMoreLayout.m66898r(refreshLoadMoreLayout5, r1, 1, r1);
        } else {
            C87412m.m108603p("rlLayout");
            throw r1;
        }
    }
}
