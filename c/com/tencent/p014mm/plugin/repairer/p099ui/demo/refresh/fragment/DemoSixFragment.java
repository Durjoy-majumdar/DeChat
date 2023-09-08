package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import p1050v2.C111325g;
import qq3.C63318b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoSixFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "a", "b", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment */
public final class DemoSixFragment extends BaseFragment {

    /* renamed from: f */
    public RecyclerView f164009f;

    /* renamed from: g */
    public C57257b f164010g;

    /* renamed from: h */
    public boolean f164011h = true;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment$a */
    public final class C57256a extends RecyclerView.C16631z {

        /* renamed from: z */
        public ImageView f164012z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57256a(DemoSixFragment demoSixFragment, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f3e);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.imageView)");
            this.f164012z = (ImageView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment$b */
    public final class C57257b extends RecyclerView.C16613e<C57256a> {
        public C57257b() {
        }

        public int getItemCount() {
            return ((ArrayList) DemoSixFragment.this.f163964d).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C57256a aVar = (C57256a) zVar;
            C87412m.m108594g(aVar, "holder");
            if (i % 2 == 0) {
                ImageView imageView = aVar.f164012z;
                Resources resources = DemoSixFragment.this.getResources();
                ThreadLocal<TypedValue> threadLocal = C111325g.f333301a;
                imageView.setImageDrawable(resources.getDrawable(C0966R.C0969drawable.bfa, (Resources.Theme) null));
                return;
            }
            ImageView imageView2 = aVar.f164012z;
            Resources resources2 = DemoSixFragment.this.getResources();
            ThreadLocal<TypedValue> threadLocal2 = C111325g.f333301a;
            imageView2.setImageDrawable(resources2.getDrawable(C0966R.C0969drawable.bfc, (Resources.Theme) null));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            DemoSixFragment demoSixFragment = DemoSixFragment.this;
            View inflate = LayoutInflater.from(demoSixFragment.getContext()).inflate(C0966R.C0971layout.bsc, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(context)\n          …_demo_rf_snap_item, null)");
            return new C57256a(demoSixFragment, inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment$c */
    public static final class C57258c implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoSixFragment f164014a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment$c$a */
        public static final class C57259a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoSixFragment f164015d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57259a(DemoSixFragment demoSixFragment) {
                super(0);
                this.f164015d = demoSixFragment;
            }

            public Object invoke() {
                this.f164015d.mo80805Q();
                this.f164015d.mo80801M().mo26580f(true);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment$c$b */
        public static final class C57260b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoSixFragment f164016d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57260b(DemoSixFragment demoSixFragment) {
                super(0);
                this.f164016d = demoSixFragment;
            }

            public Object invoke() {
                BaseFragment.m65952L(this.f164016d, 0, 1, (Object) null);
                this.f164016d.mo80801M().mo26604l(true);
                return C13598b0.f38549a;
            }
        }

        public C57258c(DemoSixFragment demoSixFragment) {
            this.f164014a = demoSixFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57260b(this.f164014a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57259a(this.f164014a));
        }
    }

    /* renamed from: N */
    public void mo80802N() {
        if (this.f164011h) {
            this.f164011h = false;
            mo80801M().mo26573d();
        }
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.refreshLayout)");
        this.f163965e = (WxRefreshLayout) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.iio);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.recyclerView)");
        this.f164009f = (RecyclerView) findViewById2;
        this.f164010g = new C57257b();
        RecyclerView recyclerView = this.f164009f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = this.f164009f;
            if (recyclerView2 != null) {
                C57257b bVar = this.f164010g;
                if (bVar != null) {
                    recyclerView2.setAdapter(bVar);
                    RecyclerView recyclerView3 = this.f164009f;
                    if (recyclerView3 != null) {
                        recyclerView3.setHasFixedSize(true);
                        C54259z zVar = new C54259z();
                        RecyclerView recyclerView4 = this.f164009f;
                        if (recyclerView4 != null) {
                            zVar.mo75025b(recyclerView4);
                            mo80801M().setOnSimpleAction(new C57258c(this));
                            return;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
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
        C57257b bVar = this.f164010g;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsm;
    }
}
