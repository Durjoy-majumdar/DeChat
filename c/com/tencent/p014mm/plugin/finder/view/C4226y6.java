package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import qo3.C12925w;
import rx3.C13598b0;
import sx3.C36907w;
import tf1.C13914m;

/* renamed from: com.tencent.mm.plugin.finder.view.y6 */
public final class C4226y6 {

    /* renamed from: a */
    public final Context f18535a;

    /* renamed from: b */
    public final C32226l<Integer, C13598b0> f18536b;

    /* renamed from: c */
    public C12925w f18537c;

    /* renamed from: d */
    public final ArrayList<C4228b> f18538d = new ArrayList<>();

    /* renamed from: e */
    public WxRecyclerAdapter<C4228b> f18539e;

    /* renamed from: f */
    public final C4021b7 f18540f = new C4021b7(new C4230d(this));

    /* renamed from: com.tencent.mm.plugin.finder.view.y6$a */
    public interface C4227a {
        /* renamed from: a */
        void mo5096a(int i);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.y6$b */
    public static final class C4228b implements C0740i2 {

        /* renamed from: d */
        public final int f18541d;

        public C4228b(int i) {
            this.f18541d = i;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        /* renamed from: f */
        public int mo76f(C13914m mVar) {
            C87412m.m108594g(mVar, "obj");
            return (!(mVar instanceof C4228b) || this.f18541d != ((C4228b) mVar).f18541d) ? 1 : 0;
        }

        public long getItemId() {
            return (long) this.f18541d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.y6$c */
    public final class C4229c extends C60896i<C4228b> {

        /* renamed from: e */
        public final C32226l<Integer, Boolean> f18542e;

        /* renamed from: f */
        public final /* synthetic */ C4226y6 f18543f;

        public C4229c(C4226y6 y6Var, C32226l<? super Integer, Boolean> lVar) {
            C87412m.m108594g(lVar, "isLast");
            this.f18543f = y6Var;
            this.f18542e = lVar;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.cy7;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            Integer num;
            Integer num2;
            C60905o oVar2 = oVar;
            int i3 = i;
            C4228b bVar = (C4228b) cVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(bVar, "item");
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.f358143dm2);
            View D = oVar2.mo85812D(C0966R.C0970id.dlz);
            View D2 = oVar2.mo85812D(C0966R.C0970id.f358144dm3);
            if (i3 == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = D2;
                num = 8;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                num2 = null;
            } else {
                num = 8;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = D2;
                num2 = 0;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (i3 == this.f18543f.f18538d.size() - 1) {
                textView.setTextSize(1, 17.0f);
                textView.setText(textView.getContext().getString(C0966R.string.dij));
            } else {
                textView.setTextSize(1, 20.0f);
                textView.setText(String.valueOf(bVar.f18541d));
            }
            if (this.f18542e.invoke(Integer.valueOf(i)).booleanValue()) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(num2);
                View view3 = D;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(num);
            View view4 = D;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f358143dm2);
            C58739j4 j4Var = C58739j4.f168176a;
            C87412m.m108593f(textView, "this");
            j4Var.mo83703c0(textView, false);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.y6$d */
    public static final class C4230d implements C4227a {

        /* renamed from: a */
        public final /* synthetic */ C4226y6 f18544a;

        public C4230d(C4226y6 y6Var) {
            this.f18544a = y6Var;
        }

        /* renamed from: a */
        public void mo5096a(int i) {
            this.f18544a.f18536b.invoke(Integer.valueOf(i));
            C12925w wVar = this.f18544a.f18537c;
            if (wVar != null) {
                wVar.mo5085n();
            }
        }
    }

    public C4226y6(Context context, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "selectListener");
        this.f18535a = context;
        this.f18536b = lVar;
    }

    /* renamed from: a */
    public final void mo5095a(List<Integer> list) {
        C87412m.m108594g(list, "dataList");
        C12925w wVar = new C12925w(this.f18535a);
        View inflate = LayoutInflater.from(this.f18535a).inflate(C0966R.C0971layout.afo, new FrameLayout(this.f18535a), false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fsh);
        if (textView != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
        }
        WxRecyclerView wxRecyclerView = (WxRecyclerView) inflate.findViewById(C0966R.C0970id.fsf);
        WxRecyclerAdapter<C4228b> wxRecyclerAdapter = new WxRecyclerAdapter<>(new LiveChargeBottomSheet$createSelectView$2$1(this), this.f18538d, false);
        wxRecyclerAdapter.f173488o = new C4241z6(this);
        this.f18539e = wxRecyclerAdapter;
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        wxRecyclerView.setAdapter(this.f18539e);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.fse)).setOnClickListener(new C4017a7(this));
        wVar.mo12471k(inflate);
        wVar.f36921B.setBackgroundResource(C0966R.C0969drawable.az7);
        wVar.mo5086o();
        this.f18538d.clear();
        ArrayList<C4228b> arrayList = this.f18538d;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        for (Number intValue : list) {
            arrayList2.add(new C4228b(intValue.intValue()));
        }
        arrayList.addAll(arrayList2);
        this.f18538d.add(new C4228b(0));
        WxRecyclerAdapter<C4228b> wxRecyclerAdapter2 = this.f18539e;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        this.f18537c = wVar;
    }
}
