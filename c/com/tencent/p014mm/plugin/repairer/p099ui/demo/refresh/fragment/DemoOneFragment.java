package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import dj2.C7353b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import o40.C61926c;
import oq3.C21802a;
import qq3.C63318b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoOneFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment */
public final class DemoOneFragment extends BaseFragment {

    /* renamed from: f */
    public RecyclerView f163997f;

    /* renamed from: g */
    public C7353b f163998g;

    /* renamed from: h */
    public boolean f163999h = true;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment$a */
    public static final class C57249a implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoOneFragment f164000a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment$a$a */
        public static final class C57250a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoOneFragment f164001d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57250a(DemoOneFragment demoOneFragment) {
                super(0);
                this.f164001d = demoOneFragment;
            }

            public Object invoke() {
                this.f164001d.mo80805Q();
                this.f164001d.mo80801M().mo26580f(true);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment$a$b */
        public static final class C57251b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoOneFragment f164002d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57251b(DemoOneFragment demoOneFragment) {
                super(0);
                this.f164002d = demoOneFragment;
            }

            public Object invoke() {
                BaseFragment.m65952L(this.f164002d, 0, 1, (Object) null);
                this.f164002d.mo80801M().mo26604l(true);
                return C13598b0.f38549a;
            }
        }

        public C57249a(DemoOneFragment demoOneFragment) {
            this.f164000a = demoOneFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57251b(this.f164000a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57250a(this.f164000a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment$b */
    public static final class C57252b implements C21802a {
        /* renamed from: a */
        public void mo8478a(int i, int i2) {
            Log.m105924i("DemoOneFragment", "onOverScroll dx: " + i + "，dy: " + i2);
        }

        /* renamed from: b */
        public void mo8479b() {
            Log.m105924i("DemoOneFragment", "onOverStop");
        }
    }

    /* renamed from: N */
    public void mo80802N() {
        if (this.f163999h) {
            this.f163999h = false;
            mo80801M().mo26573d();
        }
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.iio);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.recyclerView)");
        this.f163997f = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.refreshLayout)");
        this.f163965e = (WxRefreshLayout) findViewById2;
        List<String> list = this.f163964d;
        Context context = getContext();
        C87412m.m108591d(context);
        this.f163998g = new C7353b(list, context);
        RecyclerView recyclerView = this.f163997f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = this.f163997f;
            if (recyclerView2 != null) {
                C7353b bVar = this.f163998g;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                    mo80801M().setOnSimpleAction(new C57249a(this));
                    mo80801M().setOverScrollCallback(new C57252b());
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
        C7353b bVar = this.f163998g;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsk;
    }
}
