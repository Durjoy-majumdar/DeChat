package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import dj2.C7353b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import mq3.C47093a;
import o40.C61926c;
import qq3.C63318b;
import qq3.C63319c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoEightFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment */
public final class DemoEightFragment extends BaseFragment {

    /* renamed from: f */
    public RecyclerView f163966f;

    /* renamed from: g */
    public C7353b f163967g;

    /* renamed from: h */
    public boolean f163968h = true;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment$a */
    public static final class C57232a implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoEightFragment f163969a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment$a$a */
        public static final class C57233a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoEightFragment f163970d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57233a(DemoEightFragment demoEightFragment) {
                super(0);
                this.f163970d = demoEightFragment;
            }

            public Object invoke() {
                this.f163970d.mo80805Q();
                this.f163970d.mo80801M().mo26580f(true);
                this.f163970d.mo80801M().getCommonConfig().f126542d = false;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment$a$b */
        public static final class C57234b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoEightFragment f163971d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57234b(DemoEightFragment demoEightFragment) {
                super(0);
                this.f163971d = demoEightFragment;
            }

            public Object invoke() {
                BaseFragment.m65952L(this.f163971d, 0, 1, (Object) null);
                this.f163971d.mo80801M().mo26604l(true);
                this.f163971d.mo80801M().getCommonConfig().f126541c = false;
                return C13598b0.f38549a;
            }
        }

        public C57232a(DemoEightFragment demoEightFragment) {
            this.f163969a = demoEightFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57234b(this.f163969a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57233a(this.f163969a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment$b */
    public static final class C57235b implements C63319c {
        /* renamed from: a */
        public void mo3374a(boolean z) {
        }

        public void onLoadMore() {
        }
    }

    /* renamed from: N */
    public void mo80802N() {
        if (this.f163968h) {
            this.f163968h = false;
            mo80801M().mo26573d();
        }
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.iio);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.recyclerView)");
        this.f163966f = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.refreshLayout)");
        this.f163965e = (WxRefreshLayout) findViewById2;
        List<String> list = this.f163964d;
        Context context = getContext();
        C87412m.m108591d(context);
        this.f163967g = new C7353b(list, context);
        RecyclerView recyclerView = this.f163966f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = this.f163966f;
            if (recyclerView2 != null) {
                C7353b bVar = this.f163967g;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                    C47093a aVar = new C47093a();
                    aVar.f126539a = 0.5f;
                    aVar.f126540b = 300;
                    aVar.f126541c = true;
                    aVar.f126543e = true;
                    aVar.f126544f = true;
                    aVar.f126545g = true;
                    aVar.f126546h = true;
                    aVar.f126547i = false;
                    aVar.f126548j = true;
                    aVar.f126549k = true;
                    aVar.f126550l = true;
                    aVar.f126551m = true;
                    aVar.f126552n = false;
                    aVar.f126553o = true;
                    aVar.f126554p = false;
                    aVar.f126555q = false;
                    mo80801M().setCommonConfig(aVar);
                    mo80801M().setOnSimpleAction(new C57232a(this));
                    mo80801M().setOnMultiAction(new C57235b());
                    return;
                }
                C87412m.m108603p("adapter");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: P */
    public void mo80804P() {
        C7353b bVar = this.f163967g;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsh;
    }
}
