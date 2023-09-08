package sp1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import op1.C62080b;
import rx3.C13598b0;
import sk1.C63965x;
import sx3.C36907w;
import sx3.C64197v;

/* renamed from: sp1.l0 */
public final class C64100l0 implements View.OnClickListener {

    /* renamed from: d */
    public final View f181745d;

    /* renamed from: e */
    public final LinkedList<C0740i2> f181746e;

    /* renamed from: f */
    public FinderLiveShoppingPriceView.C56321b f181747f;

    /* renamed from: g */
    public final C64102b f181748g;

    /* renamed from: h */
    public final String f181749h = "FinderLiveShoppingEditWidget";

    /* renamed from: i */
    public final View f181750i;

    /* renamed from: j */
    public final View f181751j;

    /* renamed from: n */
    public final TextView f181752n;

    /* renamed from: o */
    public final TextView f181753o;

    /* renamed from: p */
    public final TextView f181754p;

    /* renamed from: q */
    public final C62080b f181755q;

    /* renamed from: sp1.l0$a */
    public static final class C64101a extends C87413o implements C32228q<View, Integer, C0740i2, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64100l0 f181756d;

        /* renamed from: e */
        public final /* synthetic */ C62080b f181757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64101a(C64100l0 l0Var, C62080b bVar) {
            super(3);
            this.f181756d = l0Var;
            this.f181757e = bVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean z;
            ((Number) obj2).intValue();
            C87412m.m108594g((View) obj, "<anonymous parameter 0>");
            C87412m.m108594g((C0740i2) obj3, "productInfo");
            C64100l0 l0Var = this.f181756d;
            Iterator<C62080b.C62081a> it = this.f181757e.f176506e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f176513b) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            l0Var.mo88850a(z);
            this.f181756d.mo88851b();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sp1.l0$b */
    public interface C64102b {
        /* renamed from: a */
        void mo88211a(List<Long> list, boolean z);

        /* renamed from: b */
        void mo88212b();
    }

    /* renamed from: sp1.l0$c */
    public static final class C64103c extends C16665p.C16673d {

        /* renamed from: d */
        public final /* synthetic */ C64100l0 f181758d;

        public C64103c(C64100l0 l0Var) {
            this.f181758d = l0Var;
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(zVar, "p1");
            return C16665p.C16673d.m16132g(3, 0);
        }

        /* renamed from: e */
        public boolean mo17551e() {
            return false;
        }

        /* renamed from: i */
        public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, FirebaseAnalytics.C113379b.SOURCE);
            C87412m.m108594g(zVar2, "target");
            int j = zVar.mo17363j();
            int j2 = zVar2.mo17363j();
            C62080b bVar = this.f181758d.f181755q;
            bVar.getClass();
            try {
                Collections.swap(bVar.f176506e, j, j2);
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "FinderLiveShoppingEditAdapter,moveProductItem:");
            }
            this.f181758d.f181755q.notifyItemMoved(j, j2);
            C62042e eVar = C62042e.f176370a;
            String str = this.f181758d.f181749h;
            eVar.mo86998D1(str, "onMove from:" + j + " - to:" + j2);
            C62080b bVar2 = this.f181758d.f181755q;
            bVar2.notifyItemRangeChanged(0, bVar2.getItemCount(), 1);
            return true;
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "p0");
        }
    }

    public C64100l0(View view, LinkedList<C0740i2> linkedList, FinderLiveShoppingPriceView.C56321b bVar, C64102b bVar2) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(linkedList, "shoppingListData");
        C87412m.m108594g(bVar, "config");
        this.f181745d = view;
        this.f181746e = linkedList;
        this.f181747f = bVar;
        this.f181748g = bVar2;
        WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.lwr);
        this.f181750i = view.findViewById(C0966R.C0970id.lwy);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0966R.C0970id.jjl);
        View findViewById = view.findViewById(C0966R.C0970id.jjf);
        this.f181751j = findViewById;
        this.f181752n = (TextView) view.findViewById(C0966R.C0970id.lwq);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.lwp);
        this.f181753o = textView;
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.jjj);
        this.f181754p = textView2;
        C62080b bVar3 = new C62080b(false, 1, (C8480h) null);
        this.f181755q = bVar3;
        C16665p pVar = new C16665p(new C64103c(this));
        findViewById.setOnClickListener(this);
        weImageView.setOnClickListener(this);
        C62042e.m72803Q1(C62042e.f176370a, weImageView, 0, 0, 6, (Object) null);
        ((TextView) view.findViewById(C0966R.C0970id.lws)).setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        bVar3.f176510i = new C64101a(this, bVar3);
        recyclerView.setAdapter(bVar3);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        pVar.mo17527j(recyclerView);
        C85875k4.m106189j0(((TextView) view.findViewById(C0966R.C0970id.lwt)).getPaint(), 0.8f);
    }

    /* renamed from: c */
    public static void m75430c(C64100l0 l0Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if (z) {
            View view = l0Var.f181745d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C62080b bVar = l0Var.f181755q;
            LinkedList<C0740i2> linkedList = l0Var.f181746e;
            FinderLiveShoppingPriceView.C56321b bVar2 = l0Var.f181747f;
            bVar.getClass();
            C87412m.m108594g(linkedList, "dataList");
            C87412m.m108594g(bVar2, "priceViewConfig");
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                if (!(((C0740i2) next) instanceof C63965x)) {
                    arrayList.add(next);
                }
            }
            bVar.f176508g = arrayList;
            StringBuilder sb = new StringBuilder("updateProductList otherItem:");
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next2 = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('[');
                    sb4.append(i2);
                    sb4.append(',');
                    sb4.append(((C0740i2) next2).getItemId());
                    sb4.append(']');
                    sb.append(sb4.toString());
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Log.m105924i("FinderLiveShoppingEditAdapter", sb.toString());
            bVar.f176506e.clear();
            bVar.f176507f.clear();
            ArrayList<C62080b.C62081a> arrayList2 = bVar.f176506e;
            ArrayList arrayList3 = new ArrayList();
            for (T next3 : linkedList) {
                if (next3 instanceof C63965x) {
                    arrayList3.add(next3);
                }
            }
            ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new C62080b.C62081a((C63965x) it4.next(), false, 2, (C8480h) null));
            }
            arrayList2.addAll(arrayList4);
            bVar.mo87147O4(bVar.f176506e, "updateProductList dataList");
            bVar.f176509h = bVar2;
            l0Var.f181755q.notifyDataSetChanged();
            l0Var.mo88850a(false);
            l0Var.mo88851b();
        } else if (z2) {
            l0Var.f181745d.animate().translationY((float) C75044y4.m89990b(MMApplicationContext.getContext()).y).setListener(new C64105m0(l0Var)).start();
        } else {
            Iterator<C62080b.C62081a> it5 = l0Var.f181755q.f176506e.iterator();
            while (it5.hasNext()) {
                it5.next().f176513b = false;
            }
            View view3 = l0Var.f181745d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: a */
    public final void mo88850a(boolean z) {
        if (z) {
            this.f181754p.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3412rz));
            this.f181754p.setEnabled(true);
            this.f181753o.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3412rz));
            this.f181753o.setEnabled(true);
            return;
        }
        this.f181754p.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
        this.f181754p.setEnabled(false);
        this.f181753o.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
        this.f181753o.setEnabled(false);
    }

    /* renamed from: b */
    public final void mo88851b() {
        int i;
        ArrayList<C62080b.C62081a> arrayList = this.f181755q.f176506e;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<C62080b.C62081a> it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().f176513b && (i = i + 1) < 0) {
                    C64197v.m75541j();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (i > 0) {
            TextView textView = this.f181752n;
            textView.setText(textView.getContext().getString(C0966R.string.lqt, new Object[]{Integer.valueOf(i)}));
            this.f181752n.setVisibility(0);
            return;
        }
        this.f181752n.setText("");
        this.f181752n.setVisibility(8);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.lwr) {
            if (((ArrayList) this.f181755q.mo87145F4()).isEmpty()) {
                C64102b bVar = this.f181748g;
                if (bVar != null) {
                    bVar.mo88211a(this.f181755q.f176507f, true);
                }
            } else {
                C64102b bVar2 = this.f181748g;
                if (bVar2 != null) {
                    bVar2.mo88211a(this.f181755q.mo87145F4(), false);
                }
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.lws) {
            C64102b bVar3 = this.f181748g;
            if (bVar3 != null) {
                bVar3.mo88212b();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.lwp) {
            C62080b bVar4 = this.f181755q;
            bVar4.getClass();
            try {
                ArrayList<C62080b.C62081a> arrayList2 = bVar4.f176506e;
                ArrayList arrayList3 = new ArrayList();
                Iterator<C62080b.C62081a> it = arrayList2.iterator();
                while (it.hasNext()) {
                    C62080b.C62081a next = it.next();
                    if (next.f176513b) {
                        arrayList3.add(next);
                    }
                }
                ArrayList<C62080b.C62081a> arrayList4 = bVar4.f176506e;
                ArrayList arrayList5 = new ArrayList();
                Iterator<C62080b.C62081a> it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    C62080b.C62081a next2 = it4.next();
                    if (!next2.f176513b) {
                        arrayList5.add(next2);
                    }
                }
                bVar4.f176506e.clear();
                bVar4.f176506e.addAll(arrayList3);
                bVar4.f176506e.addAll(arrayList5);
                bVar4.mo87147O4(bVar4.f176506e, "after moveSelectItem");
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "FinderLiveShoppingEditAdapter,moveSelectItem:");
            }
            this.f181755q.notifyDataSetChanged();
            Iterator<C62080b.C62081a> it5 = this.f181755q.f176506e.iterator();
            while (it5.hasNext()) {
                it5.next().f176513b = false;
            }
            mo88850a(false);
            mo88851b();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.jjj) {
            C62080b bVar5 = this.f181755q;
            bVar5.getClass();
            try {
                Iterator<C62080b.C62081a> it6 = bVar5.f176506e.iterator();
                C87412m.m108593f(it6, "dataList.iterator()");
                while (it6.hasNext()) {
                    C62080b.C62081a next3 = it6.next();
                    C87412m.m108593f(next3, "iterator.next()");
                    C62080b.C62081a aVar = next3;
                    if (aVar.f176513b) {
                        it6.remove();
                        bVar5.f176507f.add(Long.valueOf(aVar.f176512a.f181347t));
                    }
                }
                bVar5.mo87147O4(bVar5.f176506e, "after deleteProducts");
            } catch (Exception e2) {
                C58739j4.f168176a.mo83712h0(e2, "FinderLiveShoppingEditAdapter,deleteProducts:");
            }
            this.f181755q.notifyDataSetChanged();
            mo88850a(false);
            mo88851b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
