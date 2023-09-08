package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.refreshLayout.horizontal.WxHRefreshLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import o40.C61926c;
import qq3.C63318b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoNineFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "a", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment */
public final class DemoNineFragment extends BaseFragment {

    /* renamed from: f */
    public RecyclerView f163986f;

    /* renamed from: g */
    public RecyclerView.C16613e<RecyclerView.C16631z> f163987g;

    /* renamed from: h */
    public final ArrayList<Void> f163988h = new ArrayList<>();

    /* renamed from: i */
    public WxHRefreshLayout f163989i;

    /* renamed from: j */
    public boolean f163990j = true;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment$a */
    public final class C57244a extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f163991z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57244a(DemoNineFragment demoNineFragment, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.kv8);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.tvTest)");
            this.f163991z = (TextView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment$b */
    public static final class C57245b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public int[] f163992d = {17170451, 17170453, 17170455, 17170457};

        /* renamed from: e */
        public final /* synthetic */ DemoNineFragment f163993e;

        public C57245b(DemoNineFragment demoNineFragment) {
            this.f163993e = demoNineFragment;
        }

        public int getItemCount() {
            return this.f163993e.f163988h.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            View view = zVar.f44854d;
            int[] iArr = this.f163992d;
            view.setBackgroundResource(iArr[i % iArr.length]);
            TextView textView = ((C57244a) zVar).f163991z;
            textView.setText("这是数据项" + i);
            textView.setTextColor(textView.getResources().getColor(C0966R.color.al6));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f163993e.getContext()).inflate(C0966R.C0971layout.cpv, (ViewGroup) null);
            DemoNineFragment demoNineFragment = this.f163993e;
            C87412m.m108593f(inflate, "view");
            return new C57244a(demoNineFragment, inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment$c */
    public static final class C57246c implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoNineFragment f163994a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment$c$a */
        public static final class C57247a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoNineFragment f163995d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57247a(DemoNineFragment demoNineFragment) {
                super(0);
                this.f163995d = demoNineFragment;
            }

            public Object invoke() {
                this.f163995d.mo80805Q();
                WxHRefreshLayout wxHRefreshLayout = this.f163995d.f163989i;
                if (wxHRefreshLayout != null) {
                    wxHRefreshLayout.mo26580f(true);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("hRefreshLayout");
                throw null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment$c$b */
        public static final class C57248b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoNineFragment f163996d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57248b(DemoNineFragment demoNineFragment) {
                super(0);
                this.f163996d = demoNineFragment;
            }

            public Object invoke() {
                BaseFragment.m65952L(this.f163996d, 0, 1, (Object) null);
                WxHRefreshLayout wxHRefreshLayout = this.f163996d.f163989i;
                if (wxHRefreshLayout != null) {
                    wxHRefreshLayout.mo26604l(true);
                    WxHRefreshLayout wxHRefreshLayout2 = this.f163996d.f163989i;
                    if (wxHRefreshLayout2 != null) {
                        wxHRefreshLayout2.getCommonConfig().f126542d = false;
                        wxHRefreshLayout2.getCommonConfig().f126541c = false;
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("hRefreshLayout");
                    throw null;
                }
                C87412m.m108603p("hRefreshLayout");
                throw null;
            }
        }

        public C57246c(DemoNineFragment demoNineFragment) {
            this.f163994a = demoNineFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57248b(this.f163994a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57247a(this.f163994a));
        }
    }

    /* renamed from: K */
    public void mo80800K(int i) {
        this.f163988h.clear();
        this.f163988h.addAll(mo80808R());
        mo80804P();
    }

    /* renamed from: N */
    public void mo80802N() {
        if (this.f163990j) {
            this.f163990j = false;
            WxHRefreshLayout wxHRefreshLayout = this.f163989i;
            if (wxHRefreshLayout != null) {
                wxHRefreshLayout.mo26573d();
            } else {
                C87412m.m108603p("hRefreshLayout");
                throw null;
            }
        }
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.iio);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.recyclerView)");
        this.f163986f = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.refreshLayout)");
        this.f163989i = (WxHRefreshLayout) findViewById2;
        this.f163987g = new C57245b(this);
        RecyclerView recyclerView = this.f163986f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            RecyclerView recyclerView2 = this.f163986f;
            if (recyclerView2 != null) {
                RecyclerView.C16613e<RecyclerView.C16631z> eVar = this.f163987g;
                if (eVar != null) {
                    recyclerView2.setAdapter(eVar);
                    WxHRefreshLayout wxHRefreshLayout = this.f163989i;
                    if (wxHRefreshLayout != null) {
                        wxHRefreshLayout.setOnSimpleAction(new C57246c(this));
                    } else {
                        C87412m.m108603p("hRefreshLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: P */
    public void mo80804P() {
        RecyclerView.C16613e<RecyclerView.C16631z> eVar = this.f163987g;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    /* renamed from: Q */
    public void mo80805Q() {
        this.f163988h.addAll(mo80808R());
        mo80804P();
    }

    /* renamed from: R */
    public final Collection<Void> mo80808R() {
        List asList = Arrays.asList(new Void[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
        C87412m.m108593f(asList, "asList<Void>(\n          …           null\n        )");
        return asList;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cpu;
    }
}
