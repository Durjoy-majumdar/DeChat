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
import ky3.C88334c;
import o40.C61926c;
import qq3.C63318b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoSevFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment */
public final class DemoSevFragment extends BaseFragment {

    /* renamed from: f */
    public RecyclerView f164003f;

    /* renamed from: g */
    public C7353b f164004g;

    /* renamed from: h */
    public boolean f164005h = true;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment$a */
    public static final class C57253a implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoSevFragment f164006a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment$a$a */
        public static final class C57254a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoSevFragment f164007d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57254a(DemoSevFragment demoSevFragment) {
                super(0);
                this.f164007d = demoSevFragment;
            }

            public Object invoke() {
                int g = C88334c.f255322d.mo122718g(10) + 3;
                this.f164007d.mo80805Q();
                if (g < 10) {
                    this.f164007d.mo80801M().mo26600h();
                } else {
                    this.f164007d.mo80801M().mo26580f(true);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment$a$b */
        public static final class C57255b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoSevFragment f164008d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57255b(DemoSevFragment demoSevFragment) {
                super(0);
                this.f164008d = demoSevFragment;
            }

            public Object invoke() {
                int g = C88334c.f255322d.mo122718g(10) + 3;
                this.f164008d.mo80800K(g);
                if (g < 9) {
                    this.f164008d.mo80801M().mo26605m();
                } else {
                    this.f164008d.mo80801M().mo26604l(true);
                }
                return C13598b0.f38549a;
            }
        }

        public C57253a(DemoSevFragment demoSevFragment) {
            this.f164006a = demoSevFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57255b(this.f164006a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57254a(this.f164006a));
        }
    }

    /* renamed from: N */
    public void mo80802N() {
        if (this.f164005h) {
            this.f164005h = false;
            mo80801M().mo26573d();
        }
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.iio);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.recyclerView)");
        this.f164003f = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.refreshLayout)");
        this.f163965e = (WxRefreshLayout) findViewById2;
        List<String> list = this.f163964d;
        Context context = getContext();
        C87412m.m108591d(context);
        this.f164004g = new C7353b(list, context);
        RecyclerView recyclerView = this.f164003f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = this.f164003f;
            if (recyclerView2 != null) {
                C7353b bVar = this.f164004g;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                    mo80801M().setOnSimpleAction(new C57253a(this));
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
        C7353b bVar = this.f164004g;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsl;
    }
}
