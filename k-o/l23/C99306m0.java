package l23;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import d23.C106976a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import k60.C99099a;
import k60.C99101e;
import l60.C99342a;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: l23.m0 */
public final class C99306m0 extends C99417a {

    /* renamed from: f */
    public ViewGroup f291203f;

    /* renamed from: g */
    public final View f291204g;

    /* renamed from: h */
    public final C99308b f291205h;

    /* renamed from: l23.m0$a */
    public static final class C99307a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f291206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99307a(C101198e eVar) {
            super(1);
            this.f291206d = eVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_1_INT", intValue);
            this.f291206d.mo14585p(C101198e.C101199b.EDIT_CHOOSE_TEMPLATE, bundle);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.m0$b */
    public static final class C99308b extends RecyclerView.C16613e<C99309a> implements View.OnClickListener {

        /* renamed from: d */
        public final ArrayList<C106976a.C31054c> f291207d = new ArrayList<>();

        /* renamed from: e */
        public int f291208e;

        /* renamed from: f */
        public C32226l<? super Integer, C13598b0> f291209f;

        /* renamed from: l23.m0$b$a */
        public static final class C99309a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final ImageView f291210A;

            /* renamed from: B */
            public final View f291211B;

            /* renamed from: z */
            public final TextView f291212z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99309a(View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                View findViewById = view.findViewById(C0966R.C0970id.kgs);
                C87412m.m108593f(findViewById, "itemView.findViewById(R.id.template_name)");
                this.f291212z = (TextView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.kgp);
                C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.template_cover)");
                this.f291210A = (ImageView) findViewById2;
                this.f291211B = view.findViewById(C0966R.C0970id.ja7);
            }
        }

        public int getItemCount() {
            return this.f291207d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C99309a aVar = (C99309a) zVar;
            C87412m.m108594g(aVar, "holder");
            C99099a aVar2 = C99101e.f290571b;
            this.f291207d.get(i2).getClass();
            ((C99342a) aVar2.mo138472g((String) null)).mo85954d(aVar.f291210A);
            TextView textView = aVar.f291212z;
            this.f291207d.get(i2).getClass();
            textView.setText((CharSequence) null);
            if (this.f291208e == i2) {
                View view = aVar.f291211B;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = aVar.f291211B;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(4);
                View view4 = view3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            aVar.f44854d.setTag(Integer.valueOf(i));
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Integer num = (Integer) (view != null ? view.getTag() : null);
            int intValue = num != null ? num.intValue() : -1;
            if (intValue >= 0) {
                this.f291208e = intValue;
                notifyDataSetChanged();
                C32226l<? super Integer, C13598b0> lVar = this.f291209f;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(intValue));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "view");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c8p, viewGroup, false);
            inflate.setOnClickListener(this);
            return new C99309a(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99306m0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f291203f = viewGroup;
        this.f291204g = viewGroup.findViewById(C0966R.C0970id.kgr);
        View findViewById = this.f291203f.findViewById(C0966R.C0970id.kgq);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.template_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        C99308b bVar = new C99308b();
        this.f291205h = bVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f291203f.getContext());
        linearLayoutManager.mo16974W(0);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new C54234f());
        recyclerView.setHasFixedSize(true);
        LinkedList<C106976a.C31054c> linkedList = C106976a.f320212e;
        C87412m.m108594g(linkedList, "list");
        bVar.f291207d.clear();
        bVar.f291207d.addAll(linkedList);
        bVar.notifyDataSetChanged();
        recyclerView.setAdapter(bVar);
        bVar.f291209f = new C99307a(eVar);
        bVar.f291208e = 0;
        bVar.notifyDataSetChanged();
    }

    public void setVisibility(int i) {
        View view = this.f291204g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: x */
    public final C106976a.C31054c mo138709x() {
        C99308b bVar = this.f291205h;
        C106976a.C31054c cVar = bVar.f291207d.get(bVar.f291208e);
        C87412m.m108593f(cVar, "templateList[currentSelectedPos]");
        return cVar;
    }
}
