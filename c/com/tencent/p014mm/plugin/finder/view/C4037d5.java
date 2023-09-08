package com.tencent.p014mm.plugin.finder.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import rx3.C13598b0;
import zp3.C16382e;

/* renamed from: com.tencent.mm.plugin.finder.view.d5 */
public final class C4037d5 extends C16382e {

    /* renamed from: d */
    public final /* synthetic */ FinderSnsHeaderView f18112d;

    /* renamed from: com.tencent.mm.plugin.finder.view.d5$a */
    public static final class C4038a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f18113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4038a(FinderSnsHeaderView finderSnsHeaderView) {
            super(0);
            this.f18113d = finderSnsHeaderView;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter = this.f18113d.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            RecyclerView.LayoutManager layoutManager = this.f18113d.getRecyclerView().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(0);
                C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$viewCallback$1$onChanged$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$viewCallback$1$onChanged$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            this.f18113d.mo4696a();
            this.f18113d.mo4697b();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.d5$b */
    public static final class C4039b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f18114d;

        /* renamed from: e */
        public final /* synthetic */ int f18115e;

        /* renamed from: f */
        public final /* synthetic */ int f18116f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4039b(FinderSnsHeaderView finderSnsHeaderView, int i, int i2) {
            super(0);
            this.f18114d = finderSnsHeaderView;
            this.f18115e = i;
            this.f18116f = i2;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter = this.f18114d.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeChanged(this.f18115e, this.f18116f);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.d5$c */
    public static final class C4040c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f18117d;

        /* renamed from: e */
        public final /* synthetic */ int f18118e;

        /* renamed from: f */
        public final /* synthetic */ int f18119f;

        /* renamed from: g */
        public final /* synthetic */ Object f18120g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4040c(FinderSnsHeaderView finderSnsHeaderView, int i, int i2, Object obj) {
            super(0);
            this.f18117d = finderSnsHeaderView;
            this.f18118e = i;
            this.f18119f = i2;
            this.f18120g = obj;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter = this.f18117d.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeChanged(this.f18118e, this.f18119f, this.f18120g);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.d5$d */
    public static final class C4041d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f18121d;

        /* renamed from: e */
        public final /* synthetic */ int f18122e;

        /* renamed from: f */
        public final /* synthetic */ int f18123f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4041d(FinderSnsHeaderView finderSnsHeaderView, int i, int i2) {
            super(0);
            this.f18121d = finderSnsHeaderView;
            this.f18122e = i;
            this.f18123f = i2;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter;
            RecyclerView.C16613e adapter2 = this.f18121d.getRecyclerView().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(this.f18122e, this.f18123f);
            }
            if (this.f18122e > 0 && (adapter = this.f18121d.getRecyclerView().getAdapter()) != null) {
                adapter.notifyItemChanged(this.f18122e - 1);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.d5$e */
    public static final class C4042e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsHeaderView f18124d;

        /* renamed from: e */
        public final /* synthetic */ int f18125e;

        /* renamed from: f */
        public final /* synthetic */ int f18126f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4042e(FinderSnsHeaderView finderSnsHeaderView, int i, int i2) {
            super(0);
            this.f18124d = finderSnsHeaderView;
            this.f18125e = i;
            this.f18126f = i2;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter = this.f18124d.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeRemoved(this.f18125e, this.f18126f);
            }
            this.f18124d.mo4696a();
            return C13598b0.f38549a;
        }
    }

    public C4037d5(FinderSnsHeaderView finderSnsHeaderView) {
        this.f18112d = finderSnsHeaderView;
    }

    public void onChanged() {
        C61926c.m72668M(new C4038a(this.f18112d));
    }

    public void onItemRangeChanged(int i, int i2) {
        C61926c.m72668M(new C4039b(this.f18112d, i, i2));
    }

    public void onItemRangeInserted(int i, int i2) {
        C61926c.m72668M(new C4041d(this.f18112d, i, i2));
    }

    public void onItemRangeRemoved(int i, int i2) {
        C61926c.m72668M(new C4042e(this.f18112d, i, i2));
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        C61926c.m72668M(new C4040c(this.f18112d, i, i2, obj));
    }
}
