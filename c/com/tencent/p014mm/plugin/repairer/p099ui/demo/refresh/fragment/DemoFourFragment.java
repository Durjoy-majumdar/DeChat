package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import dj2.C7352a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import p910lj.C76701a;
import qq3.C63318b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "Landroid/widget/AdapterView$OnItemClickListener;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment */
public final class DemoFourFragment extends BaseFragment implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public ListView f163980f;

    /* renamed from: g */
    public C7352a f163981g;

    /* renamed from: h */
    public boolean f163982h = true;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment$a */
    public static final class C57241a implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ DemoFourFragment f163983a;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment$a$a */
        public static final class C57242a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoFourFragment f163984d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57242a(DemoFourFragment demoFourFragment) {
                super(0);
                this.f163984d = demoFourFragment;
            }

            public Object invoke() {
                if (((ArrayList) this.f163984d.f163964d).size() > 30) {
                    this.f163984d.mo80801M().mo26600h();
                    C7352a aVar = this.f163984d.f163981g;
                    if (aVar != null) {
                        aVar.notifyDataSetChanged();
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } else {
                    this.f163984d.mo80805Q();
                    this.f163984d.mo80801M().mo26580f(true);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment$a$b */
        public static final class C57243b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ DemoFourFragment f163985d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57243b(DemoFourFragment demoFourFragment) {
                super(0);
                this.f163985d = demoFourFragment;
            }

            public Object invoke() {
                BaseFragment.m65952L(this.f163985d, 0, 1, (Object) null);
                this.f163985d.mo80801M().mo26604l(true);
                this.f163985d.mo80801M().getCommonConfig().f126542d = true;
                return C13598b0.f38549a;
            }
        }

        public C57241a(DemoFourFragment demoFourFragment) {
            this.f163983a = demoFourFragment;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C61926c.m72666K(1000, new C57243b(this.f163983a));
        }

        public void onLoadMore() {
            C61926c.m72666K(1000, new C57242a(this.f163983a));
        }
    }

    /* renamed from: N */
    public void mo80802N() {
        if (this.f163982h) {
            this.f163982h = false;
            mo80801M().mo26573d();
        }
    }

    /* renamed from: O */
    public void mo80803O(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.ije);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.refreshLayout)");
        this.f163965e = (WxRefreshLayout) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f358552fp2);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.listView)");
        ListView listView = (ListView) findViewById2;
        this.f163980f = listView;
        listView.setOnItemClickListener(this);
        Context context = getContext();
        C87412m.m108591d(context);
        C7352a aVar = new C7352a(context, this.f163964d);
        this.f163981g = aVar;
        ListView listView2 = this.f163980f;
        if (listView2 != null) {
            listView2.setAdapter(aVar);
            mo80801M().setOnSimpleAction(new C57241a(this));
            return;
        }
        C87412m.m108603p("listView");
        throw null;
    }

    /* renamed from: P */
    public void mo80804P() {
        C7352a aVar = this.f163981g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsj;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Context context = getContext();
        C76701a.makeText(context, (CharSequence) i + "", 0).show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
