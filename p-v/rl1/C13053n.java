package rl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54108o;
import al1.C0082q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import il1.C9120u0;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.ResultKt;
import nj3.C76912y0;
import ok1.C62042e;
import qj1.C62660c;
import qo3.C12925w;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48659a31;
import te3.C50334m01;
import te3.C64273c21;
import tf0.C13883o1;
import tf0.C64916p1;
import uo3.C78253a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rl1.n */
public final class C13053n extends C9120u0 implements View.OnClickListener {

    /* renamed from: h */
    public final C45795b f37175h;

    /* renamed from: i */
    public final int f37176i;

    /* renamed from: j */
    public final boolean f37177j;

    /* renamed from: n */
    public final C13601g f37178n;

    /* renamed from: o */
    public final View f37179o;

    /* renamed from: p */
    public final View f37180p;

    /* renamed from: q */
    public final LiveBottomSheetPanel f37181q;

    /* renamed from: r */
    public final View f37182r;

    /* renamed from: s */
    public final View f37183s;

    /* renamed from: t */
    public final TextView f37184t;

    /* renamed from: u */
    public final RecyclerView f37185u;

    /* renamed from: v */
    public C12925w f37186v;

    /* renamed from: w */
    public final C13601g f37187w;

    /* renamed from: x */
    public final int[] f37188x;

    /* renamed from: y */
    public RecyclerView.C16622o f37189y;

    /* renamed from: z */
    public C13044k f37190z;

    /* renamed from: rl1.n$a */
    public static final class C13054a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C13053n f37191d;

        public C13054a(C13053n nVar) {
            this.f37191d = nVar;
        }

        public void onChanged(Object obj) {
            C50334m01 m012 = (C50334m01) obj;
            if (this.f37191d.f37185u.isShown()) {
                C13053n nVar = this.f37191d;
                C13044k kVar = nVar.f37190z;
                RecyclerView recyclerView = nVar.f37185u;
                C87412m.m108593f(recyclerView, "lotteryList");
                C87412m.m108593f(m012, LocaleUtil.ITALIAN);
                kVar.mo12552O4(recyclerView, m012);
                return;
            }
            Log.m105924i("FinderLiveLotteryPanelWidget", "updateLotteryList but invisible!");
        }
    }

    /* renamed from: rl1.n$b */
    public static final class C13055b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C13053n f37192d;

        public C13055b(C13053n nVar) {
            this.f37192d = nVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                C12925w wVar = this.f37192d.f37186v;
                boolean z = true;
                if (wVar == null || !wVar.mo12466f()) {
                    z = false;
                }
                if (z) {
                    this.f37192d.f37184t.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: rl1.n$c */
    public static final class C13056c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C13053n f37193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13056c(C13053n nVar) {
            super(0);
            this.f37193d = nVar;
        }

        public Object invoke() {
            float f;
            C13053n nVar = this.f37193d;
            if (nVar.f37177j) {
                float height = nVar.getHEIGHT();
                float width = this.f37193d.getWIDTH();
                if (height > width) {
                    height = width;
                }
                f = height - ((float) MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
            } else {
                f = nVar.getHEIGHT() * (((float) C32444a.f86121a.mo58621b()) / 100.0f);
            }
            return Integer.valueOf((int) f);
        }
    }

    /* renamed from: rl1.n$d */
    public static final class C13057d extends C87413o implements C32227p<C48659a31, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13053n f37194d;

        /* renamed from: e */
        public final /* synthetic */ C13044k f37195e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13057d(C13053n nVar, C13044k kVar) {
            super(2);
            this.f37194d = nVar;
            this.f37195e = kVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C48659a31 a312 = (C48659a31) obj;
            ((Number) obj2).intValue();
            Class cls = C13022d0.class;
            if (a312 != null) {
                C13022d0 d0Var = (C13022d0) this.f37194d.mo12557c(cls);
                boolean z = false;
                if (!(d0Var != null && d0Var.mo12543j3())) {
                    C13022d0 d0Var2 = (C13022d0) this.f37194d.mo12557c(cls);
                    if (d0Var2 != null) {
                        C0082q qVar = d0Var2.f37098n;
                        if (qVar != null && qVar.f506a == 2) {
                            z = true;
                        }
                    }
                    if (!z) {
                        C53895h.m60466d(this.f37194d.getScope(), C53872d1.f151119c, (C53934p0) null, new C13075s(this.f37194d, a312, this.f37195e, (C15601d<? super C13075s>) null), 2, (Object) null);
                    }
                }
                C76912y0.m92773l(this.f37194d.f37179o.getContext(), this.f37194d.f37179o.getContext().getResources().getString(C0966R.string.mnj));
            } else {
                Log.m105920e("FinderLiveLotteryPanelWidget", "statusBtnClick error, data is null!");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rl1.n$e */
    public static final class C13058e extends C87413o implements C32228q<C48659a31, View, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13044k f37196d;

        /* renamed from: e */
        public final /* synthetic */ C13053n f37197e;

        /* renamed from: f */
        public final /* synthetic */ Context f37198f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13058e(C13044k kVar, C13053n nVar, Context context) {
            super(3);
            this.f37196d = kVar;
            this.f37197e = nVar;
            this.f37198f = context;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C48659a31 a312 = (C48659a31) obj;
            View view = (View) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(a312, "item");
            C87412m.m108594g(view, "itemView");
            C13044k kVar = this.f37196d;
            int[] iArr = this.f37197e.f37188x;
            if (iArr[0] == 0 || iArr[1] == 0) {
                C62042e eVar = C62042e.f176370a;
                eVar.mo86998D1("FinderLiveLotteryPanelWidget", "onItemLongClickCallback before change x:" + this.f37197e.f37188x[0] + ", original y:" + this.f37197e.f37188x[1]);
                view.getLocationOnScreen(this.f37197e.f37188x);
                eVar.mo86998D1("FinderLiveLotteryPanelWidget", "onItemLongClickCallback after change x:" + this.f37197e.f37188x[0] + ", original y:" + this.f37197e.f37188x[1]);
            }
            this.f37197e.getPopupMenu().mo108266a();
            C78253a b = this.f37197e.getPopupMenu();
            C13077t tVar = new C13077t(this.f37198f);
            C13053n nVar = this.f37197e;
            C13078u uVar = new C13078u(nVar, a312, intValue, kVar);
            int[] iArr2 = nVar.f37188x;
            b.mo108273h(view, tVar, uVar, iArr2[0], iArr2[1]);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rl1.n$f */
    public static final class C13059f extends C87413o implements C32224a<C78253a> {

        /* renamed from: d */
        public final /* synthetic */ Context f37199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13059f(Context context) {
            super(0);
            this.f37199d = context;
        }

        public Object invoke() {
            return new C78253a(this.f37199d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryPanelWidget$show$1", mo125469f = "FinderLiveLotteryPanelWidget.kt", mo125470l = {205}, mo125471m = "invokeSuspend")
    /* renamed from: rl1.n$g */
    public static final class C13060g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f37200d;

        /* renamed from: e */
        public final /* synthetic */ C13053n f37201e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13060g(C13053n nVar, C15601d<? super C13060g> dVar) {
            super(2, dVar);
            this.f37201e = nVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13060g(this.f37201e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13060g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37200d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C13022d0 d0Var = (C13022d0) this.f37201e.mo12557c(C13022d0.class);
                if (d0Var != null) {
                    this.f37200d = 1;
                    obj = d0Var.mo12540f3(true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) obj;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryPanelWidget$show$2", mo125469f = "FinderLiveLotteryPanelWidget.kt", mo125470l = {213}, mo125471m = "invokeSuspend")
    /* renamed from: rl1.n$h */
    public static final class C13061h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f37202d;

        /* renamed from: e */
        public final /* synthetic */ C13053n f37203e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13061h(C13053n nVar, C15601d<? super C13061h> dVar) {
            super(2, dVar);
            this.f37203e = nVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13061h(this.f37203e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13061h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37202d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C13022d0 d0Var = (C13022d0) this.f37203e.mo12557c(C13022d0.class);
                if (d0Var != null) {
                    this.f37202d = 1;
                    obj = d0Var.mo12546m3(2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) obj;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13053n(Context context, C45795b bVar, int i) {
        super(context);
        C54219z<Boolean> zVar;
        LiveData<C50334m01> liveData;
        Class cls = C13022d0.class;
        C87412m.m108594g(context, "context");
        this.f37175h = bVar;
        this.f37176i = i;
        boolean z = context.getResources().getConfiguration().orientation == 2;
        this.f37177j = z;
        this.f37178n = C36568h.m40985a(new C13056c(this));
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cyb, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…st_widget_ui, this, true)");
        this.f37179o = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.naq);
        this.f37180p = findViewById;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) inflate.findViewById(C0966R.C0970id.nar);
        this.f37181q = liveBottomSheetPanel;
        View findViewById2 = liveBottomSheetPanel.findViewById(C0966R.C0970id.nap);
        this.f37182r = findViewById2;
        View findViewById3 = liveBottomSheetPanel.findViewById(C0966R.C0970id.nau);
        this.f37183s = findViewById3;
        TextView textView = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.naw);
        this.f37184t = textView;
        RecyclerView recyclerView = (RecyclerView) liveBottomSheetPanel.findViewById(C0966R.C0970id.nas);
        this.f37185u = recyclerView;
        this.f37187w = C36568h.m40985a(new C13059f(context));
        this.f37188x = new int[2];
        C13044k kVar = new C13044k();
        kVar.f37154e = new C13057d(this, kVar);
        kVar.f37155f = new C13058e(kVar, this, context);
        this.f37190z = kVar;
        liveBottomSheetPanel.getLayoutParams().height = getDEFAULT_PANEL_HEIGHT();
        liveBottomSheetPanel.setOnVisibilityListener(new C13063o(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f37190z);
        recyclerView.mo17085h0(new C13070p(this));
        C13072q qVar = new C13072q(this);
        recyclerView.mo17092j0(qVar);
        this.f37189y = qVar;
        findViewById.setOnClickListener(this);
        liveBottomSheetPanel.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        C13022d0 d0Var = (C13022d0) mo12557c(cls);
        if (!(d0Var == null || (liveData = d0Var.f37095h) == null)) {
            liveData.observe((MMActivity) context, new C13054a(this));
        }
        C13022d0 d0Var2 = (C13022d0) mo12557c(cls);
        if (!(d0Var2 == null || (zVar = d0Var2.f37101q) == null)) {
            zVar.observe((MMActivity) context, new C13055b(this));
        }
        Log.m105924i("FinderLiveLotteryPanelWidget", "init sourceScene:" + i + " isLand:" + z + ", DEFAULT_PANEL_HEIGHT:" + getDEFAULT_PANEL_HEIGHT());
    }

    private final int getDEFAULT_PANEL_HEIGHT() {
        return ((Number) ((C36570n) this.f37178n).getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final C78253a getPopupMenu() {
        return (C78253a) ((C36570n) this.f37187w).getValue();
    }

    /* renamed from: c */
    public final <T extends C39622i0> T mo12557c(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        C45795b bVar = this.f37175h;
        if (bVar != null) {
            return bVar.mo71262a(cls);
        }
        C62660c basePlugin = getBasePlugin();
        if (basePlugin != null) {
            return basePlugin.mo87696x0(cls);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo12558d() {
        C12925w wVar = this.f37186v;
        if (wVar != null) {
            if (wVar != null) {
                wVar.mo5085n();
            }
            this.f37186v = null;
        }
        this.f37181q.setTranslationY(0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        r0 = r0.f37101q;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12559e(te3.C50334m01 r11) {
        /*
            r10 = this;
            int r0 = r10.f37176i
            r1 = 0
            if (r0 != 0) goto L_0x0016
            a14.n0 r2 = r10.getScope()
            a14.h0 r3 = a14.C53872d1.f151119c
            r4 = 0
            rl1.n$g r5 = new rl1.n$g
            r5.<init>(r10, r1)
            r6 = 2
            r7 = 0
            a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
        L_0x0016:
            java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
            androidx.lifecycle.i0 r0 = r10.mo12557c(r0)
            rl1.d0 r0 = (rl1.C13022d0) r0
            r2 = 0
            if (r0 == 0) goto L_0x0030
            androidx.lifecycle.z<java.lang.Boolean> r0 = r0.f37101q
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0048
            android.widget.TextView r0 = r10.f37184t
            r0.setVisibility(r2)
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.o r0 = (ak1.C54108o) r0
            ak1.f0$c r1 = ak1.C54067f0.C0051c.LOTTERY_PANEL_HISTORY_EXPOSE
            java.lang.String r3 = ""
            r0.Mx0(r1, r3)
            goto L_0x0060
        L_0x0048:
            a14.n0 r4 = r10.getScope()
            a14.h0 r5 = a14.C53872d1.f151119c
            r6 = 0
            rl1.n$h r7 = new rl1.n$h
            r7.<init>(r10, r1)
            r8 = 2
            r9 = 0
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            android.widget.TextView r0 = r10.f37184t
            r1 = 8
            r0.setVisibility(r1)
        L_0x0060:
            java.lang.String r0 = "FinderLiveLotteryPanelWidget"
            if (r11 == 0) goto L_0x008b
            rl1.k r1 = r10.f37190z
            androidx.recyclerview.widget.RecyclerView r3 = r10.f37185u
            java.lang.String r4 = "lotteryList"
            gy3.C87412m.m108593f(r3, r4)
            r1.mo12552O4(r3, r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "show init lottery panel data:"
            r1.append(r3)
            rl1.o0 r3 = rl1.C13064o0.f37206a
            java.lang.String r11 = r3.mo12567f(r11)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
        L_0x008b:
            qo3.w r11 = r10.f37186v
            r1 = 1
            if (r11 == 0) goto L_0x0097
            boolean r11 = r11.mo12466f()
            if (r11 != r1) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r1 == 0) goto L_0x00a1
            java.lang.String r11 = "showPanel but bottomSheet is showing!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            goto L_0x00c8
        L_0x00a1:
            qo3.w r11 = new qo3.w
            android.view.View r0 = r10.f37179o
            android.content.Context r0 = r0.getContext()
            r11.<init>(r0)
            ok1.e r0 = ok1.C62042e.f176370a
            android.view.View r1 = r10.f37179o
            r0.mo87010H1(r1)
            android.view.View r0 = r10.f37179o
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r1.<init>(r3, r3)
            android.view.ViewGroup r3 = r11.f36921B
            r3.addView(r0, r2, r1)
            r11.mo12461a()
            r11.mo5086o()
            r10.f37186v = r11
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.C13053n.mo12559e(te3.m01):void");
    }

    public final C45795b getLiveData() {
        return this.f37175h;
    }

    public final int getSourceScene() {
        return this.f37176i;
    }

    public void onClick(View view) {
        C64273c21 c212;
        String str;
        String str2;
        C64273c21 c213;
        View view2 = view;
        Class cls = C13883o1.class;
        Class cls2 = C13022d0.class;
        Class cls3 = C55001u.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        boolean z = false;
        if ((valueOf != null && valueOf.intValue() == C0966R.C0970id.naq) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.nau)) {
            mo12558d();
        } else {
            long j = 0;
            String str3 = "";
            if (valueOf != null && valueOf.intValue() == C0966R.C0970id.naw) {
                if (C58739j4.f168176a.mo83683L()) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.CLICK_LOTTERY_PANEL_HISTORY, str3);
                Class cls4 = C54991o.class;
                Intent intent = new Intent();
                C54991o oVar = (C54991o) mo12557c(cls4);
                if (oVar != null && oVar.f154190D) {
                    z = true;
                }
                intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", z ? 3 : 1);
                C55001u uVar = (C55001u) mo12557c(cls3);
                intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", (uVar == null || (c213 = uVar.f154420q) == null) ? 0 : c213.f182392d);
                C55001u uVar2 = (C55001u) mo12557c(cls3);
                if (uVar2 != null) {
                    j = uVar2.f154416j;
                }
                intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", j);
                C55001u uVar3 = (C55001u) mo12557c(cls3);
                if (uVar3 == null || (str = uVar3.f154423t) == null) {
                    str = str3;
                }
                intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", str);
                C54991o oVar2 = (C54991o) mo12557c(cls4);
                if (!(oVar2 == null || (str2 = oVar2.f154345o) == null)) {
                    str3 = str2;
                }
                intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", str3);
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                Context context = this.f37179o.getContext();
                C87412m.m108593f(context, "root.context");
                C64916p1.C64917a.m76443j((C64916p1) c, context, intent, 0, (String) null, 0, 0, false, 124, (Object) null);
                Context context2 = this.f37179o.getContext();
                C87412m.m108593f(context2, "root.context");
                ((C13883o1) C86312j.m106911c(cls)).mo13295yB(context2, intent, true);
            } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.nap) {
                C13022d0 d0Var = (C13022d0) mo12557c(cls2);
                if (!(d0Var != null && d0Var.mo12543j3())) {
                    C13022d0 d0Var2 = (C13022d0) mo12557c(cls2);
                    if (d0Var2 != null) {
                        C0082q qVar = d0Var2.f37098n;
                        if (qVar != null && qVar.f506a == 2) {
                            z = true;
                        }
                    }
                    if (!z) {
                        C13022d0 d0Var3 = (C13022d0) mo12557c(cls2);
                        if ((d0Var3 != null ? d0Var3.f37093f : 100) <= this.f37190z.getItemCount()) {
                            C76912y0.m92767f(this.f37179o.getContext(), this.f37179o.getContext().getResources().getString(C0966R.string.mni));
                        } else {
                            C55001u uVar4 = (C55001u) mo12557c(cls3);
                            Long valueOf2 = (uVar4 == null || (c212 = uVar4.f154420q) == null) ? null : Long.valueOf(c212.f182392d);
                            C55001u uVar5 = (C55001u) mo12557c(cls3);
                            Long valueOf3 = uVar5 != null ? Long.valueOf(uVar5.f154416j) : null;
                            C55001u uVar6 = (C55001u) mo12557c(cls3);
                            String str4 = uVar6 != null ? uVar6.f154423t : null;
                            Log.m105924i("FinderLiveLotteryPanelWidget", "enterFinderCreateLotteryUI liveId:" + valueOf2 + ",objectId:" + valueOf3 + ",nonceId:" + str4 + ",sourceScene:" + this.f37176i);
                            C13883o1 o1Var = (C13883o1) C86312j.m106911c(cls);
                            Context context3 = this.f37179o.getContext();
                            C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                            Activity activity = (Activity) context3;
                            Intent intent2 = new Intent();
                            intent2.putExtra("KEY_PARAMS_LOTTERY_SOURCE", this.f37176i);
                            intent2.putExtra("KEY_PARAMS_LIVE_ID", valueOf2 != null ? valueOf2.longValue() : 0);
                            if (valueOf3 != null) {
                                j = valueOf3.longValue();
                            }
                            intent2.putExtra("KEY_PARAMS_OBJECT_ID", j);
                            if (str4 != null) {
                                str3 = str4;
                            }
                            intent2.putExtra("KEY_PARAMS_NONCE_ID", str3);
                            C13598b0 b0Var = C13598b0.f38549a;
                            o1Var.mo13250CN(activity, intent2, 1002);
                        }
                    }
                }
                C76912y0.m92773l(this.f37179o.getContext(), this.f37179o.getContext().getResources().getString(C0966R.string.mnj));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
