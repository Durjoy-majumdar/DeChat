package il1;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54758g;
import cj1.C54785k6;
import cl1.C54991o;
import cl1.C54994o1;
import cl1.C55001u;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.view.LiveBottomSheetRL;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.C4239z4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import dj1.C45362g1;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import jp3.C9487b;
import kk1.C46729b;
import nj3.C76912y0;
import nr3.C89059e;
import ok1.C62042e;
import qk1.C63199c0;
import rx3.C13598b0;
import wg1.C66107x1;
import wg1.C66109y0;

/* renamed from: il1.s0 */
public final class C60505s0 implements View.OnClickListener {

    /* renamed from: d */
    public final LiveBottomSheetRL f172458d;

    /* renamed from: e */
    public final C45795b f172459e;

    /* renamed from: f */
    public final C66109y0 f172460f;

    /* renamed from: g */
    public final String f172461g = "FinderLiveAnchorMusicEditWidget";

    /* renamed from: h */
    public final FrameLayout f172462h;

    /* renamed from: i */
    public final View f172463i;

    /* renamed from: j */
    public final CheckBox f172464j;

    /* renamed from: n */
    public final TextView f172465n;

    /* renamed from: o */
    public final C63199c0 f172466o;

    /* renamed from: p */
    public C4239z4 f172467p;

    /* renamed from: il1.s0$a */
    public static final class C60506a extends C87413o implements C32228q<View, Integer, C54785k6, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60505s0 f172468d;

        /* renamed from: e */
        public final /* synthetic */ C63199c0 f172469e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60506a(C60505s0 s0Var, C63199c0 c0Var) {
            super(3);
            this.f172468d = s0Var;
            this.f172469e = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean z;
            ((Number) obj2).intValue();
            C87412m.m108594g((View) obj, "view");
            C87412m.m108594g((C54785k6) obj3, "musicItem");
            C60505s0 s0Var = this.f172468d;
            Iterator<C54785k6> it = this.f172469e.f179313f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f153569d) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            s0Var.mo85478b(z);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.s0$b */
    public static final class C60507b extends C16665p.C16673d {

        /* renamed from: d */
        public final /* synthetic */ C60505s0 f172470d;

        public C60507b(C60505s0 s0Var) {
            this.f172470d = s0Var;
        }

        /* renamed from: a */
        public void mo17547a(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            super.mo17547a(recyclerView, zVar);
            C62042e eVar = C62042e.f176370a;
            String str = this.f172470d.f172461g;
            eVar.mo86998D1(str, "clearView pos:" + zVar.mo17363j());
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(zVar, "p1");
            if (!this.f172470d.mo85477a()) {
                return C16665p.C16673d.m16132g(3, 0);
            }
            return 0;
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
            if (this.f172470d.mo85477a()) {
                return true;
            }
            int j = zVar.mo17363j();
            int j2 = zVar2.mo17363j();
            C62042e eVar = C62042e.f176370a;
            String str = this.f172470d.f172461g;
            eVar.mo86998D1(str, "onMove from:" + j + " - to:" + j2);
            C63199c0 c0Var = this.f172470d.f172466o;
            c0Var.getClass();
            try {
                Collections.swap(c0Var.f179313f, j, j2);
            } catch (Exception e) {
                C58739j4 j4Var = C58739j4.f168176a;
                j4Var.mo83712h0(e, c0Var.f179312e + ",movesongItem:");
            }
            this.f172470d.f172466o.notifyItemMoved(j, j2);
            return true;
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "p0");
        }
    }

    /* renamed from: il1.s0$c */
    public static final class C60508c extends C87413o implements C32227p<Integer, LinkedList<String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60505s0 f172471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60508c(C60505s0 s0Var) {
            super(2);
            this.f172471d = s0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            LinkedList linkedList = (LinkedList) obj2;
            Class cls = C54994o1.class;
            C87412m.m108594g(linkedList, "unComplianceList");
            if (intValue == 0) {
                C54758g gVar = ((C54994o1) this.f172471d.f172459e.mo71262a(cls)).f154399f;
                C60505s0 s0Var = this.f172471d;
                gVar.mo75660c(s0Var.f172466o.f179313f, ((C54994o1) s0Var.f172459e.mo71262a(cls)).f154400g.getValue(), new C60522t0(this.f172471d));
                if (!linkedList.isEmpty()) {
                    C54994o1 o1Var = (C54994o1) this.f172471d.f172459e.mo71262a(cls);
                    o1Var.f154404n.clear();
                    o1Var.f154404n.addAll(linkedList);
                    C76912y0.m92767f(this.f172471d.f172458d.getContext(), this.f172471d.f172458d.getContext().getResources().getString(C0966R.string.mbf));
                }
                this.f172471d.f172466o.f179313f.clear();
                C66109y0 y0Var = this.f172471d.f172460f;
                if (y0Var != null) {
                    y0Var.mo90047P0(true);
                }
            } else {
                C76912y0.m92773l(this.f172471d.f172458d.getContext(), "网络错误，请稍后再试");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.s0$d */
    public static final class C60509d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60505s0 f172472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60509d(C60505s0 s0Var) {
            super(0);
            this.f172472d = s0Var;
        }

        public Object invoke() {
            C60505s0 s0Var = this.f172472d;
            Class cls = C54994o1.class;
            s0Var.f172464j.setChecked(false);
            s0Var.mo85478b(false);
            if (s0Var.mo85477a()) {
                s0Var.f172462h.setVisibility(0);
            } else {
                s0Var.f172462h.setVisibility(8);
            }
            Iterator<C54785k6> it = ((C54994o1) s0Var.f172459e.mo71262a(cls)).f154399f.f153479b.iterator();
            while (it.hasNext()) {
                it.next().f153569d = false;
            }
            C63199c0 c0Var = s0Var.f172466o;
            ArrayList<C54785k6> arrayList = ((C54994o1) s0Var.f172459e.mo71262a(cls)).f154399f.f153479b;
            C54785k6 a = ((C54994o1) s0Var.f172459e.mo71262a(cls)).f154399f.mo75658a();
            c0Var.getClass();
            C87412m.m108594g(arrayList, "dataList");
            c0Var.f179313f.clear();
            c0Var.f179313f.addAll(arrayList);
            c0Var.f179314g = a;
            s0Var.f172466o.notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.s0$e */
    public static final class C60510e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60505s0 f172473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60510e(C60505s0 s0Var) {
            super(0);
            this.f172473d = s0Var;
        }

        public Object invoke() {
            this.f172473d.f172458d.setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    public C60505s0(LiveBottomSheetRL liveBottomSheetRL, C45795b bVar, C66109y0 y0Var) {
        C87412m.m108594g(liveBottomSheetRL, "root");
        C87412m.m108594g(bVar, "liveData");
        this.f172458d = liveBottomSheetRL;
        this.f172459e = bVar;
        this.f172460f = y0Var;
        WxRecyclerView wxRecyclerView = (WxRecyclerView) liveBottomSheetRL.findViewById(C0966R.C0970id.mvi);
        this.f172462h = (FrameLayout) liveBottomSheetRL.findViewById(C0966R.C0970id.mvg);
        this.f172463i = liveBottomSheetRL.findViewById(C0966R.C0970id.mqh);
        CheckBox checkBox = (CheckBox) liveBottomSheetRL.findViewById(C0966R.C0970id.mvb);
        this.f172464j = checkBox;
        TextView textView = (TextView) liveBottomSheetRL.findViewById(C0966R.C0970id.mvd);
        this.f172465n = textView;
        C63199c0 c0Var = new C63199c0(bVar);
        this.f172466o = c0Var;
        C16665p pVar = new C16665p(new C60507b(this));
        ((TextView) liveBottomSheetRL.findViewById(C0966R.C0970id.mva)).setOnClickListener(this);
        ((TextView) liveBottomSheetRL.findViewById(C0966R.C0970id.mve)).setOnClickListener(this);
        checkBox.setOnClickListener(this);
        textView.setOnClickListener(this);
        this.f172467p = new C4239z4();
        c0Var.f179315h = new C60506a(this, c0Var);
        wxRecyclerView.setAdapter(c0Var);
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        if (!mo85477a()) {
            pVar.mo17527j(wxRecyclerView);
        }
    }

    /* renamed from: a */
    public final boolean mo85477a() {
        return ((C54991o) this.f172459e.mo71262a(C54991o.class)).mo75999e4();
    }

    /* renamed from: b */
    public final void mo85478b(boolean z) {
        if (z) {
            this.f172465n.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0));
        } else {
            this.f172465n.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_2));
        }
    }

    /* renamed from: c */
    public final void mo85479c(boolean z, boolean z2) {
        if (z) {
            this.f172458d.setVisibility(0);
            C4239z4 z4Var = this.f172467p;
            if (z4Var != null) {
                z4Var.mo5105b(this.f172458d, new C60509d(this));
            }
        } else if (z2) {
            C4239z4 z4Var2 = this.f172467p;
            if (z4Var2 != null) {
                z4Var2.mo5106c(this.f172458d, new C60510e(this));
            }
        } else {
            this.f172458d.setVisibility(8);
        }
    }

    public void onClick(View view) {
        View view2 = view;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSingSongEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mva) {
            C66109y0 y0Var = this.f172460f;
            if (y0Var != null) {
                y0Var.mo90047P0(true);
            }
            mo85479c(false, true);
            C66107x1.f190022a.mo90147a(((C54991o) this.f172459e.mo71262a(cls2)).mo75999e4(), 10, 0);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mve) {
            C66109y0 y0Var2 = this.f172460f;
            if (y0Var2 != null) {
                y0Var2.mo90052l();
            }
            mo85479c(false, true);
            Context context = this.f172458d.getContext();
            C87412m.m108593f(context, "root.context");
            C63199c0 c0Var = this.f172466o;
            c0Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator<C54785k6> it = c0Var.f179313f.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f153566a);
            }
            long j = ((C55001u) this.f172459e.mo71262a(cls)).f154416j;
            long j2 = ((C55001u) this.f172459e.mo71262a(cls)).f154420q.f182392d;
            String str = ((C54991o) this.f172459e.mo71262a(cls2)).f154345o;
            C60508c cVar = new C60508c(this);
            C87412m.m108594g(str, "userName");
            C89059e i = new C45362g1(arrayList2, System.currentTimeMillis(), j, j2, str, (C45362g1.C45363a) null, 32, (C8480h) null).mo9225i();
            i.mo123420E(new C46729b(cVar));
            if (context instanceof MMActivity) {
                i.mo11397F((C9487b) context);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mvb) {
            if (this.f172464j.isChecked()) {
                Iterator<C54785k6> it4 = this.f172466o.f179313f.iterator();
                while (it4.hasNext()) {
                    it4.next().f153569d = true;
                }
                mo85478b(true);
            } else {
                Iterator<C54785k6> it5 = this.f172466o.f179313f.iterator();
                while (it5.hasNext()) {
                    it5.next().f153569d = false;
                }
                mo85478b(false);
            }
            this.f172466o.notifyDataSetChanged();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mvd) {
            C63199c0 c0Var2 = this.f172466o;
            c0Var2.getClass();
            ArrayList arrayList3 = new ArrayList();
            try {
                Iterator<C54785k6> it6 = c0Var2.f179313f.iterator();
                C87412m.m108593f(it6, "dataList.iterator()");
                boolean z = false;
                while (it6.hasNext()) {
                    C54785k6 next = it6.next();
                    C87412m.m108593f(next, "iterator.next()");
                    C54785k6 k6Var = next;
                    if (k6Var.f153569d) {
                        it6.remove();
                        arrayList3.add(k6Var);
                        String str2 = k6Var.f153566a;
                        C54785k6 k6Var2 = c0Var2.f179314g;
                        if (C87412m.m108589b(str2, k6Var2 != null ? k6Var2.f153566a : null)) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    c0Var2.f179314g = null;
                }
                c0Var2.f179313f.removeAll(arrayList3);
                String str3 = c0Var2.f179312e;
                Log.m105924i(str3, "curPlayItem:" + c0Var2.f179314g);
                c0Var2.mo88112F4(c0Var2.f179313f, "deletesongItems");
            } catch (Exception e) {
                C58739j4 j4Var = C58739j4.f168176a;
                j4Var.mo83712h0(e, c0Var2.f179312e + ",deletesongItems:");
            } catch (Throwable unused) {
            }
            this.f172466o.notifyDataSetChanged();
            mo85478b(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSingSongEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
