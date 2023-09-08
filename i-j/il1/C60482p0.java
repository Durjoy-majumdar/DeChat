package il1;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54785k6;
import cl1.C54991o;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.view.LiveBottomSheetRL;
import com.tencent.p014mm.plugin.finder.view.C4239z4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.util.WXWebReporter;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import qk1.C63257t;
import rx3.C13598b0;
import wg1.C66107x1;
import wg1.C66109y0;

/* renamed from: il1.p0 */
public final class C60482p0 implements View.OnClickListener {

    /* renamed from: d */
    public final LiveBottomSheetRL f172399d;

    /* renamed from: e */
    public final C45795b f172400e;

    /* renamed from: f */
    public final C66109y0 f172401f;

    /* renamed from: g */
    public final String f172402g = "FinderLiveAnchorSingSongAddWidget";

    /* renamed from: h */
    public final TextView f172403h;

    /* renamed from: i */
    public final WxRecyclerView f172404i;

    /* renamed from: j */
    public C63257t f172405j;

    /* renamed from: n */
    public C4239z4 f172406n;

    /* renamed from: o */
    public int f172407o;

    /* renamed from: p */
    public int f172408p;

    /* renamed from: il1.p0$a */
    public static final class C60483a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60482p0 f172409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60483a(C60482p0 p0Var) {
            super(1);
            this.f172409d = p0Var;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue <= 0) {
                C60482p0 p0Var = this.f172409d;
                p0Var.f172403h.setText(p0Var.f172399d.getResources().getString(C0966R.string.ma7));
            } else {
                C60482p0 p0Var2 = this.f172409d;
                p0Var2.f172403h.setText(p0Var2.f172399d.getResources().getString(C0966R.string.ma6, new Object[]{Integer.valueOf(intValue)}));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.p0$b */
    public static final class C60484b extends C87413o implements C32228q<Integer, Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerView f172410d;

        /* renamed from: e */
        public final /* synthetic */ C60482p0 f172411e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60484b(WxRecyclerView wxRecyclerView, C60482p0 p0Var) {
            super(3);
            this.f172410d = wxRecyclerView;
            this.f172411e = p0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Number) obj3).intValue();
            int i = this.f172410d.getContext().getResources().getDisplayMetrics().heightPixels;
            C60482p0 p0Var = this.f172411e;
            p0Var.f172407o = (int) (((float) (i - intValue)) + p0Var.f172404i.getTranslationY());
            if (booleanValue) {
                C60482p0 p0Var2 = this.f172411e;
                p0Var2.mo85442a(p0Var2.f172408p);
            }
            String str = this.f172411e.f172402g;
            Log.m105924i(str, "moveRv empty: " + i + " - " + intValue + " = " + this.f172411e.f172407o);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.p0$c */
    public static final class C60485c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60482p0 f172412d;

        /* renamed from: e */
        public final /* synthetic */ WxRecyclerView f172413e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60485c(C60482p0 p0Var, WxRecyclerView wxRecyclerView) {
            super(1);
            this.f172412d = p0Var;
            this.f172413e = wxRecyclerView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C60482p0 p0Var = this.f172412d;
            Context context = p0Var.f172399d.getContext();
            C87412m.m108593f(context, "root.context");
            C60487e eVar = new C60487e(p0Var, context);
            eVar.f44872a = intValue;
            RecyclerView.LayoutManager layoutManager = this.f172413e.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(eVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.p0$d */
    public static final class C60486d extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerView f172414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60486d(WxRecyclerView wxRecyclerView) {
            super(1);
            this.f172414d = wxRecyclerView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            RecyclerView.LayoutManager layoutManager = this.f172414d.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int b = C76577a.m92151b(this.f172414d.getContext(), 40);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(b));
                aVar.mo10233c(Integer.valueOf(intValue));
                C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSingSongAddWidget$1$4", "invoke", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSingSongAddWidget$1$4", "invoke", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.p0$e */
    public final class C60487e extends C54256s {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60487e(C60482p0 p0Var, Context context) {
            super(context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: n */
        public int mo65616n() {
            return -1;
        }

        /* renamed from: o */
        public int mo10341o() {
            return -1;
        }
    }

    /* renamed from: il1.p0$f */
    public static final class C60488f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60482p0 f172415d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60488f(C60482p0 p0Var) {
            super(0);
            this.f172415d = p0Var;
        }

        public Object invoke() {
            C60482p0 p0Var = this.f172415d;
            p0Var.f172404i.post(new C60499r0(p0Var));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.p0$g */
    public static final class C60489g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60482p0 f172416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60489g(C60482p0 p0Var) {
            super(0);
            this.f172416d = p0Var;
        }

        public Object invoke() {
            int i;
            C60482p0 p0Var = this.f172416d;
            Class cls = C54994o1.class;
            Iterator<C54785k6> it = ((C54994o1) p0Var.f172400e.mo71262a(cls)).f154399f.f153479b.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                it.next().f153569d = false;
            }
            C63257t tVar = p0Var.f172405j;
            ArrayList<C54785k6> arrayList = ((C54994o1) p0Var.f172400e.mo71262a(cls)).f154399f.f153479b;
            tVar.getClass();
            C87412m.m108594g(arrayList, "dataList");
            tVar.f179514q = -1;
            tVar.f179515r = true;
            tVar.f179507g.clear();
            tVar.f179507g.addAll(arrayList);
            if (tVar.f179507g.size() < tVar.f179508h) {
                tVar.f179507g.add(new C54785k6("", 0, 3, false, false, false, false, (String) null, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (C8480h) null));
            }
            if (tVar.f179507g.size() < tVar.f179508h) {
                ArrayList<C54785k6> arrayList2 = tVar.f179507g;
                C54785k6 k6Var = r4;
                C54785k6 k6Var2 = new C54785k6("", 0, 1, false, false, false, false, (String) null, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (C8480h) null);
                arrayList2.add(k6Var);
                i = 1;
            }
            C32226l<? super Integer, C13598b0> lVar = tVar.f179512o;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(tVar.f179507g.size() - 1));
            }
            tVar.notifyDataSetChanged();
            C32226l<? super Integer, C13598b0> lVar2 = tVar.f179510j;
            if (lVar2 != null) {
                lVar2.invoke(Integer.valueOf(tVar.f179507g.size() - i));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.p0$h */
    public static final class C60490h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60482p0 f172417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60490h(C60482p0 p0Var) {
            super(0);
            this.f172417d = p0Var;
        }

        public Object invoke() {
            this.f172417d.f172399d.setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    public C60482p0(LiveBottomSheetRL liveBottomSheetRL, C45795b bVar, C66109y0 y0Var) {
        C87412m.m108594g(liveBottomSheetRL, "root");
        C87412m.m108594g(bVar, "liveData");
        this.f172399d = liveBottomSheetRL;
        this.f172400e = bVar;
        this.f172401f = y0Var;
        View findViewById = liveBottomSheetRL.findViewById(C0966R.C0970id.f359209mv3);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.sing_song_add_cancel_tv)");
        View findViewById2 = liveBottomSheetRL.findViewById(C0966R.C0970id.mv4);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.sing_song_add_finish_tv)");
        View findViewById3 = liveBottomSheetRL.findViewById(C0966R.C0970id.mv7);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.sing_song_add_tv)");
        this.f172403h = (TextView) findViewById3;
        View findViewById4 = liveBottomSheetRL.findViewById(C0966R.C0970id.mv6);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.sing_song_add_rv_view)");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById4;
        this.f172404i = wxRecyclerView;
        Context context = liveBottomSheetRL.getContext();
        C87412m.m108593f(context, "root.context");
        this.f172405j = new C63257t(context, bVar);
        ((TextView) findViewById).setOnClickListener(this);
        ((TextView) findViewById2).setOnClickListener(this);
        wxRecyclerView.setAdapter(this.f172405j);
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        this.f172405j.f179510j = new C60483a(this);
        this.f172405j.f179511n = new C60484b(wxRecyclerView, this);
        this.f172405j.f179513p = new C60485c(this, wxRecyclerView);
        this.f172405j.f179512o = new C60486d(wxRecyclerView);
        this.f172406n = new C4239z4();
        this.f172407o = -1;
        this.f172408p = -1;
    }

    /* renamed from: a */
    public final void mo85442a(int i) {
        if (i < 1800 && i != 0) {
            this.f172408p = i;
        }
        if (i == 0) {
            this.f172404i.animate().translationY(0.0f).setDuration(90).start();
            return;
        }
        int b = (this.f172407o - this.f172408p) - C76577a.m92151b(this.f172399d.getContext(), 40);
        if (b < 0) {
            this.f172404i.animate().translationY((float) b).setDuration(90).start();
        }
        String str = this.f172402g;
        Log.m105924i(str, "moveRv: " + this.f172407o + " - " + this.f172408p + " = " + (this.f172407o - this.f172408p));
    }

    /* renamed from: b */
    public final void mo85443b(boolean z, boolean z2) {
        if (z) {
            this.f172399d.setVisibility(0);
            C4239z4 z4Var = this.f172406n;
            if (z4Var != null) {
                z4Var.mo5105b(this.f172399d, new C60489g(this));
            }
        } else if (z2) {
            C4239z4 z4Var2 = this.f172406n;
            if (z4Var2 != null) {
                z4Var2.mo5106c(this.f172399d, new C60490h(this));
            }
        } else {
            this.f172399d.setVisibility(8);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSingSongAddWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f359209mv3) {
            C66109y0 y0Var = this.f172401f;
            if (y0Var != null) {
                y0Var.mo90047P0(true);
            }
            mo85443b(false, true);
            Object systemService = this.f172399d.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f172399d.getWindowToken(), 0);
            C66107x1.f190022a.mo90147a(((C54991o) this.f172400e.mo71262a(C54991o.class)).mo75999e4(), 10, 0);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mv4) {
            C63257t tVar = this.f172405j;
            tVar.f179519v = new C60488f(this);
            tVar.notifyItemChanged(tVar.f179514q, Boolean.TRUE);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSingSongAddWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
