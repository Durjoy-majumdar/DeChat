package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFiveFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "<init>", "()V", "a", "b", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment */
public final class DemoFiveFragment extends BaseFragment {

    /* renamed from: f */
    public RecyclerView f163972f;

    /* renamed from: g */
    public C57237b f163973g;

    /* renamed from: h */
    public boolean f163974h = true;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment$a */
    public final class C57236a extends RecyclerView.C16631z {

        /* renamed from: z */
        public ImageView f163975z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57236a(DemoFiveFragment demoFiveFragment, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f3e);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.imageView)");
            this.f163975z = (ImageView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment$b */
    public final class C57237b extends RecyclerView.C16613e<C57236a> {
        public C57237b() {
        }

        public int getItemCount() {
            return ((ArrayList) DemoFiveFragment.this.f163964d).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C57236a aVar = (C57236a) zVar;
            C87412m.m108594g(aVar, "holder");
            if (i % 2 == 0) {
                ImageView imageView = aVar.f163975z;
                Resources resources = DemoFiveFragment.this.getResources();
                ThreadLocal<TypedValue> threadLocal = C111325g.f333301a;
                imageView.setImageDrawable(resources.getDrawable(C0966R.C0969drawable.bfa, (Resources.Theme) null));
                return;
            }
            ImageView imageView2 = aVar.f163975z;
            Resources resources2 = DemoFiveFragment.this.getResources();
            ThreadLocal<TypedValue> threadLocal2 = C111325g.f333301a;
            imageView2.setImageDrawable(resources2.getDrawable(C0966R.C0969drawable.bzh, (Resources.Theme) null));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            DemoFiveFragment demoFiveFragment = DemoFiveFragment.this;
            View inflate = LayoutInflater.from(demoFiveFragment.getContext()).inflate(C0966R.C0971layout.bsd, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(context)\n          …mo_rf_stagger_item, null)");
            return new C57236a(demoFiveFragment, inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment$c */
    public static final class C57238c implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoFiveFragment f163977a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment$c$a */
        public static final class C57239a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoFiveFragment f163978d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57239a(DemoFiveFragment demoFiveFragment) {
                super(0);
                this.f163978d = demoFiveFragment;
            }

            public Object invoke() {
                this.f163978d.mo80805Q();
                this.f163978d.mo80801M().mo26580f(true);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment$c$b */
        public static final class C57240b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoFiveFragment f163979d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57240b(DemoFiveFragment demoFiveFragment) {
                super(0);
                this.f163979d = demoFiveFragment;
            }

            public Object invoke() {
                BaseFragment.m65952L(this.f163979d, 0, 1, (Object) null);
                this.f163979d.mo80801M().mo26604l(true);
                return C13598b0.f38549a;
            }
        }

        public C57238c(DemoFiveFragment demoFiveFragment) {
            this.f163977a = demoFiveFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57240b(this.f163977a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57239a(this.f163977a));
        }
    }

    /* renamed from: N */
    public void mo80802N() {
        if (this.f163974h) {
            this.f163974h = false;
            mo80801M().mo26573d();
        }
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.iio);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.recyclerView)");
        this.f163972f = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.refreshLayout)");
        this.f163965e = (WxRefreshLayout) findViewById2;
        C57237b bVar = new C57237b();
        this.f163973g = bVar;
        RecyclerView recyclerView = this.f163972f;
        if (recyclerView != null) {
            recyclerView.setAdapter(bVar);
            mo80801M().setOnSimpleAction(new C57238c(this));
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: P */
    public void mo80804P() {
        C57237b bVar = this.f163973g;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsi;
    }
}
