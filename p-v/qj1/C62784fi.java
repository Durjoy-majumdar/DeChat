package qj1;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C54979h1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dh1.C7329b;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import o40.C61937h;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C62042e;
import p239sv.C13784j;
import pe3.C89349b;
import qj1.C62966ri;
import qo3.C89779i0;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63960p;
import te3.C64822x51;
import xk0.C91263b;

/* renamed from: qj1.fi */
public final class C62784fi implements C62966ri, C11385n {

    /* renamed from: d */
    public final Context f178219d;

    /* renamed from: e */
    public final C45795b f178220e;

    /* renamed from: f */
    public final C58124b f178221f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f178222g;

    /* renamed from: h */
    public C63956k f178223h;

    /* renamed from: i */
    public final String f178224i = "FinderLiveWecomBubble";

    /* renamed from: j */
    public ViewGroup f178225j;

    /* renamed from: n */
    public C89779i0 f178226n;

    /* renamed from: qj1.fi$a */
    public static final class C62785a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62784fi f178227d;

        /* renamed from: e */
        public final /* synthetic */ C63960p f178228e;

        public C62785a(C62784fi fiVar, C63960p pVar) {
            this.f178227d = fiVar;
            this.f178228e = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super C63956k, C13598b0> lVar = this.f178227d.f178222g;
            if (lVar != null) {
                lVar.invoke(this.f178228e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.fi$b */
    public static final class C62786b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62784fi f178229d;

        /* renamed from: e */
        public final /* synthetic */ C63960p f178230e;

        public C62786b(C62784fi fiVar, C63960p pVar) {
            this.f178229d = fiVar;
            this.f178230e = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = this.f178229d.f178224i;
            Log.m105924i(str, "close promote, data:" + C61937h.m72703b(this.f178230e.f181312s));
            C7329b.m7474c(C7329b.f25441a, this.f178229d.f178220e, 2, 3, (String) null, 0, (String) null, 0, 120, (Object) null);
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63960p pVar = this.f178230e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = pVar.f181291d;
                x512.f186254d = 3;
                x512.f186256f = new C89349b(pVar.f181312s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar.statusChange(bVar2, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.fi$c */
    public static final class C62787c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62784fi f178231d;

        /* renamed from: e */
        public final /* synthetic */ C63960p f178232e;

        public C62787c(C62784fi fiVar, C63960p pVar) {
            this.f178231d = fiVar;
            this.f178232e = pVar;
        }

        /* JADX WARNING: type inference failed for: r14v22, types: [d60.b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r14) {
            /*
                r13 = this;
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r14)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$3"
                java.lang.String r3 = "android/view/View$OnClickListener"
                java.lang.String r4 = "onClick"
                java.lang.String r5 = "(Landroid/view/View;)V"
                r6 = r13
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                qj1.fi r14 = r13.f178231d
                fy3.l<? super sk1.k, rx3.b0> r14 = r14.f178222g
                if (r14 == 0) goto L_0x0028
                sk1.p r1 = r13.f178232e
                r14.invoke(r1)
            L_0x0028:
                ob0.b0 r14 = f40.C86709a0.m107524d()
                r1 = 372(0x174, float:5.21E-43)
                qj1.fi r2 = r13.f178231d
                r14.mo123455a(r1, r2)
                sk1.p r14 = r13.f178232e
                te3.u51 r14 = r14.f181312s
                java.lang.String r14 = r14.f185717g
                qj1.fi r1 = r13.f178231d
                java.lang.String r1 = r1.f178224i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "click to see wecom : "
                r2.append(r3)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                er1.j4 r1 = er1.C58739j4.f168176a
                boolean r1 = r1.mo83692U()
                r2 = 0
                if (r1 == 0) goto L_0x0084
                qj1.fi r1 = r13.f178231d
                android.view.ViewGroup r1 = r1.f178225j
                if (r1 == 0) goto L_0x007e
                android.content.Context r1 = r1.getContext()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "contactid:"
                r3.append(r4)
                r3.append(r14)
                java.lang.String r3 = r3.toString()
                r4 = 0
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r3, (int) r4)
                r1.show()
                goto L_0x0084
            L_0x007e:
                java.lang.String r14 = "root"
                gy3.C87412m.m108603p(r14)
                throw r2
            L_0x0084:
                qj1.fi r1 = r13.f178231d
                java.lang.String r1 = r1.f178224i
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "wecomBubble clicke joinLiveTraceBuff = "
                r3.append(r4)
                qj1.fi r4 = r13.f178231d
                fj1.b r4 = r4.f178220e
                androidx.lifecycle.i0 r4 = r4.mo71262a(r0)
                cl1.o r4 = (cl1.C54991o) r4
                java.lang.String r4 = r4.f154241Q
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                ob0.b0 r1 = f40.C86709a0.m107524d()
                java.lang.Class<sv.p> r3 = p239sv.C77792p.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                sv.p r3 = (p239sv.C77792p) r3
                te3.d73 r4 = new te3.d73
                r4.<init>()
                qj1.fi r5 = r13.f178231d
                fj1.b r6 = r5.f178220e
                androidx.lifecycle.i0 r6 = r6.mo71262a(r0)
                cl1.o r6 = (cl1.C54991o) r6
                java.lang.String r6 = r6.f154345o
                r4.f182645e = r6
                r6 = 2
                r4.f182644d = r6
                fj1.b r5 = r5.f178220e
                androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
                cl1.o r5 = (cl1.C54991o) r5
                java.lang.String r5 = r5.f154241Q
                r4.f182646f = r5
                rx3.b0 r5 = rx3.C13598b0.f38549a
                r5 = 1
                sv.j r14 = r3.X20(r14, r5, r4)
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase"
                gy3.C87412m.m108592e(r14, r3)
                ob0.y r14 = (ob0.C117747y) r14
                r1.mo123460f(r14)
                qj1.fi r14 = r13.f178231d
                android.content.Context r1 = r14.f178219d
                r3 = 2131832198(0x7f112d86, float:1.9297443E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 3
                qo3.i0 r1 = qo3.C89779i0.m112248e(r1, r3, r5, r4, r2)
                r14.f178226n = r1
                dh1.b r3 = dh1.C7329b.f25441a
                qj1.fi r14 = r13.f178231d
                fj1.b r4 = r14.f178220e
                r5 = 5
                r6 = 3
                sk1.p r14 = r13.f178232e
                te3.u51 r14 = r14.f181312s
                java.lang.String r14 = r14.f185717g
                if (r14 != 0) goto L_0x010c
                java.lang.String r14 = ""
            L_0x010c:
                r7 = r14
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 112(0x70, float:1.57E-43)
                r12 = 0
                dh1.C7329b.m7474c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                qj1.fi r14 = r13.f178231d
                fj1.b r14 = r14.f178220e
                androidx.lifecycle.i0 r14 = r14.mo71262a(r0)
                cl1.o r14 = (cl1.C54991o) r14
                boolean r14 = r14.mo75990Y3()
                if (r14 == 0) goto L_0x0144
                qj1.fi r14 = r13.f178231d
                d60.b r14 = r14.f178221f
                boolean r0 = r14 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
                if (r0 == 0) goto L_0x0131
                r2 = r14
                com.tencent.mm.plugin.finder.live.view.b r2 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r2
            L_0x0131:
                if (r2 == 0) goto L_0x0144
                java.lang.Class<hq1.d> r14 = hq1.C60085d.class
                qj1.c r14 = r2.getPlugin(r14)
                hq1.d r14 = (hq1.C60085d) r14
                if (r14 == 0) goto L_0x0144
                hq1.e r14 = r14.f171450r
                if (r14 == 0) goto L_0x0144
                r14.mo84956b()
            L_0x0144:
                java.lang.String r14 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$3"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r13, r14, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62784fi.C62787c.onClick(android.view.View):void");
        }
    }

    public C62784fi(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f178219d = context;
        this.f178220e = bVar;
        this.f178221f = bVar2;
        this.f178222g = lVar;
        this.f178223h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.al4, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f178225j = (ViewGroup) inflate;
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63960p) {
            C63960p pVar = (C63960p) obj;
            mo87782a(pVar);
            C7329b bVar = C7329b.f25441a;
            C45795b bVar2 = this.f178220e;
            String str = pVar.f181312s.f185717g;
            if (str == null) {
                str = "";
            }
            C7329b.m7474c(bVar, bVar2, 1, 3, str, 0, (String) null, 0, 112, (Object) null);
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f178223h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.f358111dh0;
    }

    /* renamed from: a */
    public final void mo87782a(C63960p pVar) {
        C63960p pVar2 = pVar;
        ViewGroup viewGroup = this.f178225j;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(C0966R.C0970id.f358111dh0);
            ViewGroup viewGroup2 = this.f178225j;
            if (viewGroup2 != null) {
                TextView textView = (TextView) viewGroup2.findViewById(C0966R.C0970id.e2j);
                ViewGroup viewGroup3 = this.f178225j;
                if (viewGroup3 != null) {
                    View findViewById2 = viewGroup3.findViewById(C0966R.C0970id.fad);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    ViewGroup viewGroup4 = this.f178225j;
                    if (viewGroup4 != null) {
                        TextView textView2 = (TextView) viewGroup4.findViewById(C0966R.C0970id.e2i);
                        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                        textView.setText(pVar2.f181312s.f185714d);
                        C62042e eVar = C62042e.f176370a;
                        if (eVar.mo87027N0()) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(4);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setOnClickListener(new C62785a(this, pVar2));
                            textView2.setVisibility(4);
                            return;
                        }
                        int i = 4;
                        textView2.setVisibility(0);
                        if (!eVar.mo87032P0(this.f178220e)) {
                            i = 0;
                        }
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Integer.valueOf(i));
                        View view2 = findViewById;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setOnClickListener(new C62786b(this, pVar2));
                        findViewById2.setOnClickListener(new C62787c(this, pVar2));
                        return;
                    }
                    C87412m.m108603p("root");
                    throw null;
                }
                C87412m.m108603p("root");
                throw null;
            }
            C87412m.m108603p("root");
            throw null;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.fad;
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        ViewGroup viewGroup = this.f178225j;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f178226n;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            C54979h1 h1Var = (C54979h1) this.f178220e.mo71262a(C54979h1.class);
            ViewGroup viewGroup = this.f178225j;
            if (viewGroup != null) {
                Context context = viewGroup.getContext();
                C87412m.m108593f(context, "root.context");
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.feature.openim.api.INetSceneSearchOpenIMContact");
                h1Var.mo75940f3(context, (C13784j) yVar);
            } else {
                C87412m.m108603p("root");
                throw null;
            }
        }
        C86709a0.m107524d().mo123470p(C91263b.CTRL_INDEX, this);
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63960p) {
            mo87782a((C63960p) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
    }
}
