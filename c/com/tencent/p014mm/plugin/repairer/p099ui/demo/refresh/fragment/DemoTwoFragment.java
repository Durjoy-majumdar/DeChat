package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import qq3.C63318b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoTwoFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoTwoFragment */
public final class DemoTwoFragment extends BaseFragment {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoTwoFragment$a */
    public static final class C57262a implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoTwoFragment f164019a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoTwoFragment$a$a */
        public static final class C57263a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoTwoFragment f164020d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57263a(DemoTwoFragment demoTwoFragment) {
                super(0);
                this.f164020d = demoTwoFragment;
            }

            public Object invoke() {
                this.f164020d.mo80801M().mo26580f(true);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoTwoFragment$a$b */
        public static final class C57264b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoTwoFragment f164021d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57264b(DemoTwoFragment demoTwoFragment) {
                super(0);
                this.f164021d = demoTwoFragment;
            }

            public Object invoke() {
                this.f164021d.mo80801M().mo26604l(true);
                return C13598b0.f38549a;
            }
        }

        public C57262a(DemoTwoFragment demoTwoFragment) {
            this.f164019a = demoTwoFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57264b(this.f164019a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57263a(this.f164019a));
        }
    }

    /* renamed from: N */
    public void mo80802N() {
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.refreshLayout)");
        this.f163965e = (WxRefreshLayout) findViewById;
        mo80801M().setOnSimpleAction(new C57262a(this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bso;
    }
}
