package il1;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dj1.C45381p0;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj3.C76912y0;
import nr3.C89059e;
import ok1.C62042e;
import org.json.JSONObject;
import qk1.C12794c1;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50401mh0;
import te3.C51660v81;

/* renamed from: il1.j4 */
public final class C9028j4 extends C9120u0 implements View.OnClickListener {

    /* renamed from: h */
    public final C45795b f28506h;

    /* renamed from: i */
    public final View f28507i;

    /* renamed from: j */
    public final View f28508j;

    /* renamed from: n */
    public final LiveBottomSheetPanel f28509n;

    /* renamed from: o */
    public final TextView f28510o;

    /* renamed from: p */
    public final RecyclerView f28511p;

    /* renamed from: q */
    public boolean f28512q;

    /* renamed from: r */
    public C12794c1 f28513r;

    /* renamed from: s */
    public C4191v0 f28514s;

    /* renamed from: t */
    public final C32226l<Boolean, C13598b0> f28515t = new C9029a(this);

    /* renamed from: il1.j4$a */
    public static final class C9029a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9028j4 f28516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9029a(C9028j4 j4Var) {
            super(1);
            this.f28516d = j4Var;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f28516d.f28510o.setEnabled(booleanValue);
            C62042e eVar = C62042e.f176370a;
            TextView textView = this.f28516d.f28510o;
            C87412m.m108593f(textView, "okBtn");
            eVar.mo87025M1(textView, booleanValue, true);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9028j4(Context context, C45795b bVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        this.f28506h = bVar;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.adw, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…nt_widget_ui, this, true)");
        this.f28507i = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.ctx);
        this.f28508j = findViewById;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) inflate.findViewById(C0966R.C0970id.ctz);
        this.f28509n = liveBottomSheetPanel;
        TextView textView = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.cu4);
        this.f28510o = textView;
        RecyclerView recyclerView = (RecyclerView) liveBottomSheetPanel.findViewById(C0966R.C0970id.cu5);
        this.f28511p = recyclerView;
        this.f28513r = new C12794c1(context);
        liveBottomSheetPanel.setOnVisibilityListener(new C9045k4(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        C12794c1 c1Var = this.f28513r;
        C9057l4 l4Var = new C9057l4(this);
        c1Var.getClass();
        c1Var.f36624i = l4Var;
        recyclerView.setAdapter(this.f28513r);
        textView.setEnabled(false);
        C62042e.f176370a.mo87025M1(textView, false, true);
        findViewById.setOnClickListener(this);
        liveBottomSheetPanel.setOnClickListener(this);
        ((TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.cty)).setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    /* renamed from: b */
    public final void mo9844b() {
        C4191v0 v0Var = this.f28514s;
        if (v0Var != null) {
            v0Var.mo5072g();
        }
        this.f28514s = null;
        this.f28509n.setTranslationY(0.0f);
    }

    /* renamed from: c */
    public final void mo9845c(ArrayList<String> arrayList) {
        Class cls = C54991o.class;
        C87412m.m108594g(arrayList, "dataListCache");
        ((C54991o) this.f28506h.mo71262a(cls)).f154390y2.clear();
        List<C51660v81> list = ((C54991o) this.f28506h.mo71262a(cls)).f154390y2;
        C51660v81 v812 = new C51660v81();
        v812.f143383d.addAll(arrayList);
        list.add(v812);
    }

    /* renamed from: d */
    public final void mo9846d() {
        Class cls = C54991o.class;
        List<C51660v81> list = ((C54991o) this.f28506h.mo71262a(cls)).f154390y2;
        ArrayList arrayList = new ArrayList();
        C51660v81 v812 = (C51660v81) C110818d0.m150916N(list);
        boolean z = true;
        if (v812 != null) {
            arrayList.addAll(v812.f143383d);
            if (!arrayList.isEmpty()) {
                this.f28512q = true;
            } else {
                this.f28512q = false;
            }
        }
        C12794c1 c1Var = this.f28513r;
        c1Var.getClass();
        c1Var.f36620e.clear();
        c1Var.f36620e.addAll(arrayList);
        int i = c1Var.f36621f;
        for (int size = arrayList.size(); size < i; size++) {
            c1Var.f36620e.add("");
        }
        c1Var.notifyDataSetChanged();
        if (this.f28513r.getItemCount() <= 0) {
            this.f28511p.setVisibility(8);
        } else {
            this.f28511p.setVisibility(0);
            this.f28513r.notifyDataSetChanged();
        }
        C4191v0 v0Var = new C4191v0(this.f28507i.getContext());
        C62042e eVar = C62042e.f176370a;
        eVar.mo87010H1(this.f28507i);
        v0Var.mo5071f(this.f28507i, new FrameLayout.LayoutParams(-1, -1));
        v0Var.mo5066a();
        v0Var.mo5073h();
        this.f28514s = v0Var;
        if (eVar.mo87027N0()) {
            Class cls2 = C54108o.class;
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(cls);
            if (oVar == null || !oVar.mo75999e4()) {
                z = false;
            }
            if (z) {
                ((C54108o) C86312j.m106911c(cls2)).mo9619wD(C0073g0.FANS_CLUB, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, (String) null);
            } else {
                ((C54108o) C86312j.m106911c(cls2)).tw0(27, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, (String) null);
            }
        }
    }

    public final C45795b getBuContext() {
        return this.f28506h;
    }

    public final C32226l<Boolean, C13598b0> getCanSendBtnEnable() {
        return this.f28515t;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFastCommentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ctx) {
            mo9844b();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.cty) {
            mo9844b();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.cu4) {
            Class cls = C55001u.class;
            Class cls2 = C54991o.class;
            JSONObject jSONObject = new JSONObject();
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator<String> it = this.f28513r.f36620e.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.length() > 0) {
                    arrayList2.add(next);
                }
            }
            C50401mh0 a = C45381p0.f122894u.mo70895a(arrayList2);
            if (((C54991o) this.f28506h.mo71262a(cls2)).mo75999e4()) {
                C89059e i = new C45381p0(((C55001u) this.f28506h.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f28506h.mo71262a(cls)).f154416j, 1, a).mo9225i();
                i.mo123420E(new C9063m4(this, arrayList2, jSONObject));
                if (getContext() instanceof MMActivity) {
                    Context context = getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i.mo11397F((MMActivity) context);
                }
            } else {
                jSONObject.put("anchor_status", "1");
                mo9845c(arrayList2);
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_FAST_COMMENT, jSONObject.toString(), (String) null, 4, (Object) null);
                ((C54991o) this.f28506h.mo71262a(cls2)).f154394z2 = arrayList2;
                if (this.f28512q) {
                    C76912y0.m92768g(this.f28507i.getContext(), this.f28507i.getContext().getString(C0966R.string.dej));
                } else {
                    C76912y0.m92768g(this.f28507i.getContext(), this.f28507i.getContext().getString(C0966R.string.dei));
                }
                mo9844b();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFastCommentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
