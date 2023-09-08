package op1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import np1.C61817a;
import ok1.C62042e;
import p40.C62192a;
import pp1.C11995e;
import pp1.C62430c;
import pp1.C62431d;
import qj1.C62660c;
import rx3.C13598b0;
import sk1.C13696v;
import sk1.C63947a;
import sx3.C36907w;
import te3.C51316sz0;
import te3.C51358t81;

/* renamed from: op1.a */
public final class C62075a extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final Context f176488d;

    /* renamed from: e */
    public boolean f176489e;

    /* renamed from: f */
    public final C45795b f176490f;

    /* renamed from: g */
    public final ArrayList<Integer> f176491g = new ArrayList<>();

    /* renamed from: h */
    public final ArrayList<Integer> f176492h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<Integer> f176493i = new ArrayList<>();

    /* renamed from: j */
    public final LinkedList<C0740i2> f176494j = new LinkedList<>();

    /* renamed from: n */
    public C61817a f176495n;

    /* renamed from: o */
    public boolean f176496o;

    /* renamed from: p */
    public FinderLiveShoppingCouponView.C3609a f176497p;

    /* renamed from: q */
    public final C62077b f176498q = new C62077b(this);

    /* renamed from: op1.a$a */
    public static final class C62076a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C62075a f176499d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f176500e;

        public C62076a(C62075a aVar, RecyclerView recyclerView) {
            this.f176499d = aVar;
            this.f176500e = recyclerView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingCouponListAdapter$onAttachedToRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                this.f176499d.mo87142g5(this.f176500e);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingCouponListAdapter$onAttachedToRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: op1.a$b */
    public static final class C62077b extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C62075a f176501d;

        public C62077b(C62075a aVar) {
            this.f176501d = aVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingCouponListAdapter$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i == 0) {
                this.f176501d.mo87142g5(recyclerView);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingCouponListAdapter$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingCouponListAdapter$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingCouponListAdapter$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: op1.a$c */
    public static final class C62078c extends C87413o implements C32227p<Boolean, C51316sz0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62075a f176502d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62078c(C62075a aVar) {
            super(2);
            this.f176502d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C51316sz0 sz02 = (C51316sz0) obj2;
            C62075a aVar = this.f176502d;
            aVar.f176496o = false;
            if (booleanValue) {
                if ((sz02 != null ? sz02.f141842d : null) != null) {
                    LinkedList<C51358t81> linkedList = sz02.f141842d;
                    C87412m.m108593f(linkedList, "resp.item_list");
                    ArrayList arrayList = new ArrayList();
                    for (C51358t81 t812 : linkedList) {
                        C63947a aVar2 = C63947a.f181274a;
                        C87412m.m108593f(t812, LocaleUtil.ITALIAN);
                        C13696v vVar = (C13696v) aVar2.mo88737w(t812);
                        if (vVar != null) {
                            arrayList.add(vVar);
                        }
                    }
                    aVar.f176496o = false;
                    Log.m105924i("Finder.FinderLiveShoppingCouponListAdapter", "before loadMoreCouponList,ori size:" + aVar.f176494j.size() + ",more size:" + arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Log.m105924i("Finder.FinderLiveShoppingCouponListAdapter", "load more coupon: " + ((C13696v) it.next()));
                    }
                    int size = aVar.f176491g.size();
                    ArrayList<Integer> arrayList2 = aVar.f176491g;
                    arrayList2.remove(arrayList2.size() - 1);
                    if (!aVar.f176491g.contains(1) && aVar.f176489e) {
                        aVar.f176491g.add(1);
                    }
                    ArrayList<Integer> arrayList3 = aVar.f176491g;
                    ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        C13696v vVar2 = (C13696v) it4.next();
                        arrayList4.add(2);
                    }
                    arrayList3.addAll(arrayList4);
                    aVar.f176494j.addAll(arrayList);
                    ((C54979h1) aVar.f176490f.mo71262a(C54979h1.class)).f154140o.f127225a.addAll(arrayList);
                    int size2 = aVar.f176494j.size();
                    for (int size3 = aVar.f176494j.size(); size3 < size2; size3++) {
                        aVar.f176493i.add(Integer.valueOf(size3));
                    }
                    if (aVar.mo87139F4()) {
                        aVar.f176491g.add(3);
                    }
                    int i = size - 1;
                    aVar.notifyItemRemoved(i);
                    aVar.notifyItemRangeInserted(i, arrayList.size() + (aVar.mo87139F4() ? 1 : 0));
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C62075a(Context context, boolean z, C45795b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        this.f176488d = context;
        this.f176489e = z;
        this.f176490f = bVar;
    }

    /* renamed from: F4 */
    public final boolean mo87139F4() {
        return ((C54979h1) this.f176490f.mo71262a(C54979h1.class)).f154110B;
    }

    /* renamed from: G4 */
    public final boolean mo87140G4() {
        if (!C62042e.f176370a.mo87027N0()) {
            C45795b.C32059a aVar = C45795b.f123697j;
            C45795b bVar = C45795b.f123698n;
            return bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154190D : false;
        }
    }

    /* renamed from: O4 */
    public final void mo87141O4(C13696v vVar) {
        C87412m.m108594g(vVar, "item");
        if (mo87140G4() && vVar.f38758E) {
            this.f176494j.remove(vVar);
            this.f176494j.addFirst(vVar);
            C62192a<C0740i2> aVar = ((C54979h1) this.f176490f.mo71262a(C54979h1.class)).f154140o;
            aVar.f127225a.remove(vVar);
            aVar.f127225a.add(0, vVar);
        }
        mo87143u5();
        notifyDataSetChanged();
    }

    /* renamed from: g5 */
    public final void mo87142g5(RecyclerView recyclerView) {
        C62660c cVar;
        C54795n5 D0;
        C87412m.m108594g(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).mo16959E() == this.f176491g.size() - 1) {
            if (!mo87139F4()) {
                this.f176496o = false;
            } else if (!this.f176496o) {
                this.f176496o = true;
                C61817a aVar = this.f176495n;
                if (aVar != null && (cVar = aVar.f175776i) != null && (D0 = cVar.mo14476D0()) != null) {
                    Context context = this.f176488d;
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    D0.mo75726b0((MMActivity) context, new C62078c(this));
                }
            }
        }
    }

    public int getItemCount() {
        return this.f176491g.size();
    }

    public int getItemViewType(int i) {
        Integer num = this.f176491g.get(i);
        C87412m.m108593f(num, "viewTypeArray[position]");
        return num.intValue();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.mo17043c(this.f176498q);
        recyclerView.setOnTouchListener(new C62076a(this, recyclerView));
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        boolean z;
        Object obj;
        String str;
        C62431d.C62432a aVar = C62431d.C62432a.Detail;
        C87412m.m108594g(zVar, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            boolean z2 = true;
            if (itemViewType == 1) {
                String q = C76577a.m92166q(this.f176488d, C0966R.string.e79);
                C87412m.m108593f(q, "getString(\n             …ing\n                    )");
                ((C62431d) zVar).mo87480z(q, aVar, true, false, false);
            } else if (itemViewType == 2) {
                LinkedList<C0740i2> linkedList = this.f176494j;
                if (this.f176489e) {
                    int i2 = -1;
                    if (i >= 0) {
                        int i3 = 0;
                        int i4 = -1;
                        z = true;
                        while (true) {
                            Integer num = this.f176491g.get(i3);
                            if (num == null || num.intValue() != 0) {
                                Integer num2 = this.f176491g.get(i3);
                                if (num2 != null && num2.intValue() == 1) {
                                    i4 = -1;
                                    z = false;
                                } else {
                                    i4++;
                                }
                            }
                            if (i3 == i) {
                                break;
                            }
                            i3++;
                        }
                        i2 = i4;
                    } else {
                        z = true;
                    }
                    if (i2 < 0) {
                        i = 0;
                    } else {
                        if (z) {
                            obj = this.f176492h.get(i2);
                            str = "sendingIndexArray[relativePos]";
                        } else {
                            obj = this.f176493i.get(i2);
                            str = "notSendingIndexArray[relativePos]";
                        }
                        C87412m.m108593f(obj, str);
                        i = ((Number) obj).intValue();
                    }
                }
                C0740i2 i2Var = linkedList.get(i);
                C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
                C13696v vVar = (C13696v) i2Var;
                C62430c cVar = (C62430c) zVar;
                FinderLiveShoppingCouponView finderLiveShoppingCouponView = cVar.f177410A;
                boolean G4 = mo87140G4();
                if (((C55001u) this.f176490f.mo71262a(C55001u.class)).f154420q.f182392d != 0) {
                    z2 = false;
                }
                finderLiveShoppingCouponView.mo3995b(vVar, G4, z2);
                cVar.f44854d.getLayoutParams().height = C76577a.m92155f(this.f176488d, mo87140G4() ? C0966R.dimen.a7y : C0966R.dimen.a7z);
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                ((C54116w) c).Tx0(C54067f0.C54081r0.CommerceActionCouponExpose, vVar, (String) null);
            } else if (itemViewType == 3) {
                ((C11995e) zVar).f34988z.mo82303c();
            }
        } else {
            String q2 = C76577a.m92166q(this.f176488d, C0966R.string.e7a);
            C87412m.m108593f(q2, "getString(\n             …ing\n                    )");
            ((C62431d) zVar).mo87480z(q2, aVar, false, false, false);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0 || i == 1) {
            View inflate = LayoutInflater.from(this.f176488d).inflate(C0966R.C0971layout.ajy, viewGroup, false);
            C87412m.m108593f(inflate, "from(context).inflate(la…ader_item, parent, false)");
            return new C62431d(inflate, mo87140G4());
        } else if (i != 3) {
            View inflate2 = LayoutInflater.from(this.f176488d).inflate(C0966R.C0971layout.ajw, viewGroup, false);
            C87412m.m108593f(inflate2, "from(context).inflate(la…upon_item, parent, false)");
            C62430c cVar = new C62430c(inflate2);
            cVar.f177410A.setCallback(this.f176497p);
            return cVar;
        } else {
            View inflate3 = LayoutInflater.from(this.f176488d).inflate(C0966R.C0971layout.ajz, viewGroup, false);
            C87412m.m108593f(inflate3, "from(context).inflate(la…load_more, parent, false)");
            return new C11995e(inflate3);
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.mo17098m1(this.f176498q);
    }

    /* renamed from: u5 */
    public final void mo87143u5() {
        this.f176492h.clear();
        this.f176493i.clear();
        int size = this.f176494j.size();
        for (int i = 0; i < size; i++) {
            C0740i2 i2Var = this.f176494j.get(i);
            C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
            if (((C13696v) i2Var).f38758E) {
                this.f176492h.add(Integer.valueOf(i));
            } else {
                this.f176493i.add(Integer.valueOf(i));
            }
        }
        this.f176491g.clear();
        if (!this.f176489e) {
            ArrayList<Integer> arrayList = this.f176491g;
            LinkedList<C0740i2> linkedList = this.f176494j;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C0740i2 i2Var2 : linkedList) {
                arrayList2.add(2);
            }
            arrayList.addAll(arrayList2);
        } else {
            if (!this.f176492h.isEmpty()) {
                this.f176491g.add(0);
                ArrayList<Integer> arrayList3 = this.f176491g;
                ArrayList<Integer> arrayList4 = this.f176492h;
                ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
                for (Number intValue : arrayList4) {
                    intValue.intValue();
                    arrayList5.add(2);
                }
                arrayList3.addAll(arrayList5);
            }
            if (!this.f176493i.isEmpty()) {
                this.f176491g.add(1);
                ArrayList<Integer> arrayList6 = this.f176491g;
                ArrayList<Integer> arrayList7 = this.f176493i;
                ArrayList arrayList8 = new ArrayList(C36907w.m41090l(arrayList7, 10));
                for (Number intValue2 : arrayList7) {
                    intValue2.intValue();
                    arrayList8.add(2);
                }
                arrayList6.addAll(arrayList8);
            }
        }
        if (mo87139F4()) {
            this.f176491g.add(3);
        }
    }
}
