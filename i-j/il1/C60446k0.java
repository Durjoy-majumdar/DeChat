package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54754f;
import cj1.C54768h6;
import cl1.C54991o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import qk1.C63224j;
import rx3.C13598b0;
import wg1.C66089v;

/* renamed from: il1.k0 */
public final class C60446k0 implements View.OnClickListener {

    /* renamed from: d */
    public final ViewGroup f172343d;

    /* renamed from: e */
    public final C45795b f172344e;

    /* renamed from: f */
    public final C66089v f172345f;

    /* renamed from: g */
    public final String f172346g = "FinderLiveAnchorMusicEditWidget";

    /* renamed from: h */
    public final WxRecyclerView f172347h;

    /* renamed from: i */
    public final View f172348i;

    /* renamed from: j */
    public final CheckBox f172349j;

    /* renamed from: n */
    public final TextView f172350n;

    /* renamed from: o */
    public final ProgressBar f172351o;

    /* renamed from: p */
    public final C63224j f172352p;

    /* renamed from: il1.k0$a */
    public static final class C60447a extends C87413o implements C32228q<View, Integer, C54768h6, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60446k0 f172353d;

        /* renamed from: e */
        public final /* synthetic */ C63224j f172354e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60447a(C60446k0 k0Var, C63224j jVar) {
            super(3);
            this.f172353d = k0Var;
            this.f172354e = jVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean z;
            ((Number) obj2).intValue();
            C87412m.m108594g((View) obj, "view");
            C87412m.m108594g((C54768h6) obj3, "musicItem");
            C60446k0 k0Var = this.f172353d;
            Iterator<C54768h6> it = this.f172354e.f179415f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f153502e) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            k0Var.mo85413a(z);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.k0$b */
    public static final class C60448b extends C16665p.C16673d {

        /* renamed from: d */
        public final /* synthetic */ C60446k0 f172355d;

        public C60448b(C60446k0 k0Var) {
            this.f172355d = k0Var;
        }

        /* renamed from: a */
        public void mo17547a(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            super.mo17547a(recyclerView, zVar);
            C62042e eVar = C62042e.f176370a;
            String str = this.f172355d.f172346g;
            eVar.mo86998D1(str, "clearView pos:" + zVar.mo17363j());
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(zVar, "p1");
            return C16665p.C16673d.m16132g(3, 0);
        }

        /* renamed from: i */
        public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, FirebaseAnalytics.C113379b.SOURCE);
            C87412m.m108594g(zVar2, "target");
            int j = zVar.mo17363j();
            int j2 = zVar2.mo17363j();
            C62042e eVar = C62042e.f176370a;
            String str = this.f172355d.f172346g;
            eVar.mo86998D1(str, "onMove from:" + j + " - to:" + j2);
            C63224j jVar = this.f172355d.f172352p;
            jVar.getClass();
            try {
                Collections.swap(jVar.f179415f, j, j2);
                Collections.swap(jVar.f179414e, j, j2);
            } catch (Exception e) {
                C58739j4 j4Var = C58739j4.f168176a;
                j4Var.mo83712h0(e, jVar.f179413d + ",moveMusicItem:");
            }
            this.f172355d.f172352p.notifyItemMoved(j, j2);
            return true;
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "p0");
        }
    }

    /* renamed from: il1.k0$c */
    public static final class C60449c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60446k0 f172356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60449c(C60446k0 k0Var) {
            super(1);
            this.f172356d = k0Var;
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            this.f172356d.mo85416d();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.k0$d */
    public static final class C60450d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C60446k0 f172357d;

        public C60450d(C60446k0 k0Var) {
            this.f172357d = k0Var;
        }

        public void onAnimationEnd(Animator animator) {
            this.f172357d.f172343d.setTranslationY(0.0f);
        }
    }

    public C60446k0(ViewGroup viewGroup, C45795b bVar, C66089v vVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "liveData");
        this.f172343d = viewGroup;
        this.f172344e = bVar;
        this.f172345f = vVar;
        WxRecyclerView wxRecyclerView = (WxRecyclerView) viewGroup.findViewById(C0966R.C0970id.h68);
        this.f172347h = wxRecyclerView;
        this.f172348i = viewGroup.findViewById(C0966R.C0970id.dcu);
        CheckBox checkBox = (CheckBox) viewGroup.findViewById(C0966R.C0970id.f358805h63);
        this.f172349j = checkBox;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.h65);
        this.f172350n = textView;
        this.f172351o = (ProgressBar) viewGroup.findViewById(C0966R.C0970id.h67);
        C63224j jVar = new C63224j();
        this.f172352p = jVar;
        C16665p pVar = new C16665p(new C60448b(this));
        ((TextView) viewGroup.findViewById(C0966R.C0970id.f358804h62)).setOnClickListener(this);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.h66)).setOnClickListener(this);
        checkBox.setOnClickListener(this);
        textView.setOnClickListener(this);
        jVar.f179418i = new C60447a(this, jVar);
        wxRecyclerView.setAdapter(jVar);
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        pVar.mo17527j(wxRecyclerView);
    }

    /* renamed from: a */
    public final void mo85413a(boolean z) {
        if (z) {
            this.f172350n.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0));
        } else {
            this.f172350n.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_2));
        }
    }

    /* renamed from: b */
    public final void mo85414b(boolean z) {
        if (z) {
            this.f172351o.setVisibility(0);
            this.f172347h.setVisibility(4);
            View view = this.f172348i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f172351o.setVisibility(8);
        this.f172347h.setVisibility(0);
        View view3 = this.f172348i;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: c */
    public final void mo85415c(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            this.f172343d.setVisibility(0);
            C54754f fVar = ((C54991o) this.f172344e.mo71262a(C54991o.class)).f154232N2;
            fVar.getClass();
            Log.m105924i("FinderLiveAnchorMusicData", "isMusicInfoComplete musicSize:" + fVar.f153469f.size() + ", songIdSize:" + fVar.f153468e.size());
            if (fVar.f153469f.size() == fVar.f153468e.size()) {
                z3 = true;
            }
            if (z3) {
                mo85416d();
                return;
            }
            mo85414b(true);
            C66089v vVar = this.f172345f;
            if (vVar != null) {
                vVar.mo73860e(true, new C60449c(this));
            }
        } else if (z2) {
            this.f172343d.animate().translationY((float) C75044y4.m89990b(MMApplicationContext.getContext()).y).setListener(new C60450d(this)).start();
        } else {
            Iterator<C54768h6> it = this.f172352p.f179415f.iterator();
            while (it.hasNext()) {
                it.next().f153502e = false;
            }
            this.f172343d.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo85416d() {
        Class cls = C54991o.class;
        this.f172349j.setChecked(false);
        mo85413a(false);
        mo85414b(false);
        Iterator<C54768h6> it = ((C54991o) this.f172344e.mo71262a(cls)).f154232N2.f153469f.iterator();
        while (it.hasNext()) {
            it.next().f153502e = false;
        }
        C63224j jVar = this.f172352p;
        LinkedList<Integer> linkedList = ((C54991o) this.f172344e.mo71262a(cls)).f154232N2.f153468e;
        ArrayList<C54768h6> arrayList = ((C54991o) this.f172344e.mo71262a(cls)).f154232N2.f153469f;
        C54768h6 c = ((C54991o) this.f172344e.mo71262a(cls)).f154232N2.mo75646c();
        jVar.getClass();
        C87412m.m108594g(linkedList, "songIdList");
        C87412m.m108594g(arrayList, "dataList");
        jVar.f179414e.clear();
        jVar.f179414e.addAll(linkedList);
        jVar.f179415f.clear();
        jVar.f179415f.addAll(arrayList);
        jVar.f179416g = c;
        jVar.f179417h = c;
        this.f172352p.notifyDataSetChanged();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f2, code lost:
        if (r2.f153499b == 1) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x020f, code lost:
        if (r1 == null) goto L_0x0211;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r21) {
        /*
            r20 = this;
            r7 = r20
            r0 = r21
            java.lang.Class<cl1.u> r8 = cl1.C55001u.class
            java.lang.Class<cl1.o> r9 = cl1.C54991o.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r20
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x002f
            int r0 = r21.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r2 = 2131309779(0x7f0934d3, float:1.8237851E38)
            r3 = 10
            r4 = 0
            if (r0 != 0) goto L_0x0039
            goto L_0x005c
        L_0x0039:
            int r5 = r0.intValue()
            if (r5 != r2) goto L_0x005c
            wg1.v r0 = r7.f172345f
            if (r0 == 0) goto L_0x0046
            r0.mo89996Y()
        L_0x0046:
            r7.mo85415c(r4, r4)
            wg1.x1 r0 = wg1.C66107x1.f190022a
            fj1.b r1 = r7.f172344e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r9)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            r0.mo90147a(r1, r3, r4)
            goto L_0x03cc
        L_0x005c:
            r2 = 2131309783(0x7f0934d7, float:1.823786E38)
            if (r0 != 0) goto L_0x0063
            goto L_0x0286
        L_0x0063:
            int r6 = r0.intValue()
            if (r6 != r2) goto L_0x0286
            fj1.b r0 = r7.f172344e
            androidx.lifecycle.i0 r0 = r0.mo71262a(r9)
            cl1.o r0 = (cl1.C54991o) r0
            cj1.f r0 = r0.f154232N2
            cj1.h6 r2 = r0.mo75646c()
            fj1.b r0 = r7.f172344e
            androidx.lifecycle.i0 r0 = r0.mo71262a(r9)
            cl1.o r0 = (cl1.C54991o) r0
            cj1.f r0 = r0.f154232N2
            qk1.j r3 = r7.f172352p
            java.util.LinkedList<java.lang.Integer> r6 = r3.f179414e
            java.util.ArrayList<cj1.h6> r3 = r3.f179415f
            r0.getClass()
            java.lang.String r10 = ",playItem:"
            java.lang.String r11 = ", curPlayPos:"
            java.lang.String r12 = ", musicList id size:"
            java.lang.String r13 = "FinderLiveAnchorMusicData"
            java.lang.String r14 = "songIdList"
            gy3.C87412m.m108594g(r6, r14)
            java.lang.String r14 = "musicList"
            gy3.C87412m.m108594g(r3, r14)
            cj1.h6 r14 = r0.mo75646c()     // Catch:{ Exception -> 0x013a }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
            r15.<init>()     // Catch:{ Exception -> 0x013a }
            java.lang.String r4 = "before replaceAnchorMusicData songId size:"
            r15.append(r4)     // Catch:{ Exception -> 0x013a }
            int r4 = r6.size()     // Catch:{ Exception -> 0x013a }
            r15.append(r4)     // Catch:{ Exception -> 0x013a }
            r15.append(r12)     // Catch:{ Exception -> 0x013a }
            int r4 = r3.size()     // Catch:{ Exception -> 0x013a }
            r15.append(r4)     // Catch:{ Exception -> 0x013a }
            r15.append(r11)     // Catch:{ Exception -> 0x013a }
            int r4 = r0.f153467d     // Catch:{ Exception -> 0x013a }
            r15.append(r4)     // Catch:{ Exception -> 0x013a }
            r15.append(r10)     // Catch:{ Exception -> 0x013a }
            r15.append(r14)     // Catch:{ Exception -> 0x013a }
            java.lang.String r4 = r15.toString()     // Catch:{ Exception -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)     // Catch:{ Exception -> 0x013a }
            r4 = -1
            r0.f153467d = r4     // Catch:{ Exception -> 0x013a }
            java.util.LinkedList<java.lang.Integer> r4 = r0.f153468e     // Catch:{ Exception -> 0x013a }
            r4.clear()     // Catch:{ Exception -> 0x013a }
            java.util.LinkedList<java.lang.Integer> r4 = r0.f153468e     // Catch:{ Exception -> 0x013a }
            r4.addAll(r6)     // Catch:{ Exception -> 0x013a }
            java.util.ArrayList<cj1.h6> r4 = r0.f153469f     // Catch:{ Exception -> 0x013a }
            r4.clear()     // Catch:{ Exception -> 0x013a }
            java.util.ArrayList<cj1.h6> r4 = r0.f153469f     // Catch:{ Exception -> 0x013a }
            r4.addAll(r3)     // Catch:{ Exception -> 0x013a }
            if (r14 == 0) goto L_0x0143
            java.util.ArrayList<cj1.h6> r4 = r0.f153469f     // Catch:{ Exception -> 0x013a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x013a }
            r15 = 0
        L_0x00f1:
            boolean r16 = r4.hasNext()     // Catch:{ Exception -> 0x013a }
            if (r16 == 0) goto L_0x013d
            java.lang.Object r16 = r4.next()     // Catch:{ Exception -> 0x013a }
            int r17 = r15 + 1
            if (r15 < 0) goto L_0x0133
            r5 = r16
            cj1.h6 r5 = (cj1.C54768h6) r5     // Catch:{ Exception -> 0x013a }
            te3.x41 r1 = r5.f153498a     // Catch:{ Exception -> 0x013a }
            int r1 = r1.f144442d     // Catch:{ Exception -> 0x013a }
            r19 = r4
            te3.x41 r4 = r14.f153498a     // Catch:{ Exception -> 0x013a }
            if (r4 == 0) goto L_0x0113
            int r4 = r4.f144442d     // Catch:{ Exception -> 0x013a }
            if (r1 != r4) goto L_0x0113
            r4 = 1
            goto L_0x0114
        L_0x0113:
            r4 = 0
        L_0x0114:
            if (r4 == 0) goto L_0x012e
            java.util.LinkedList<java.lang.Integer> r4 = r0.f153468e     // Catch:{ Exception -> 0x013a }
            java.lang.Object r4 = r4.get(r15)     // Catch:{ Exception -> 0x013a }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x013a }
            if (r4 != 0) goto L_0x0121
            goto L_0x012e
        L_0x0121:
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x013a }
            if (r1 != r4) goto L_0x012e
            int r1 = r14.f153499b     // Catch:{ Exception -> 0x013a }
            r5.f153499b = r1     // Catch:{ Exception -> 0x013a }
            r0.f153467d = r15     // Catch:{ Exception -> 0x013a }
            goto L_0x013d
        L_0x012e:
            r15 = r17
            r4 = r19
            goto L_0x00f1
        L_0x0133:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x013a }
            r1 = 0
            throw r1     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            goto L_0x017f
        L_0x013a:
            r0 = move-exception
            r1 = 0
            goto L_0x017f
        L_0x013d:
            r1 = 0
            cj1.h6 r14 = r0.mo75646c()     // Catch:{ Exception -> 0x0138 }
            goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r4.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = "after replaceAnchorMusicData songId size:"
            r4.append(r5)     // Catch:{ Exception -> 0x0138 }
            int r5 = r6.size()     // Catch:{ Exception -> 0x0138 }
            r4.append(r5)     // Catch:{ Exception -> 0x0138 }
            r4.append(r12)     // Catch:{ Exception -> 0x0138 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x0138 }
            r4.append(r3)     // Catch:{ Exception -> 0x0138 }
            r4.append(r11)     // Catch:{ Exception -> 0x0138 }
            int r3 = r0.f153467d     // Catch:{ Exception -> 0x0138 }
            r4.append(r3)     // Catch:{ Exception -> 0x0138 }
            r4.append(r10)     // Catch:{ Exception -> 0x0138 }
            r4.append(r14)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)     // Catch:{ Exception -> 0x0138 }
            cj1.f$a r3 = cj1.C54754f.f153463k     // Catch:{ Exception -> 0x0138 }
            java.util.ArrayList<cj1.h6> r0 = r0.f153469f     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "replaceAnchorMusicData"
            r5 = 1
            r3.mo75656a(r0, r4, r5)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0186
        L_0x017f:
            er1.j4 r3 = er1.C58739j4.f168176a
            java.lang.String r4 = "FinderLiveAnchorMusicData,replaceAnchorMusicData:"
            r3.mo83712h0(r0, r4)
        L_0x0186:
            qk1.j r0 = r7.f172352p
            cj1.h6 r0 = r0.f179417h
            fj1.b r3 = r7.f172344e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r9)
            cl1.o r3 = (cl1.C54991o) r3
            cj1.f r3 = r3.f154232N2
            if (r0 == 0) goto L_0x019d
            te3.x41 r4 = r0.f153498a
            if (r4 == 0) goto L_0x019d
            int r4 = r4.f144442d
            goto L_0x019e
        L_0x019d:
            r4 = 0
        L_0x019e:
            rx3.l r3 = r3.mo75644a(r4)
            java.lang.String r4 = r7.f172346g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "music_edit_finish_tv nextPlayItem:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ",find playItem:"
            r5.append(r0)
            A r0 = r3.f38555d
            cj1.h6 r0 = (cj1.C54768h6) r0
            r5.append(r0)
            java.lang.String r0 = ", pos:"
            r5.append(r0)
            B r0 = r3.f38556e
            java.lang.Integer r0 = (java.lang.Integer) r0
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            if (r2 == 0) goto L_0x01d5
            te3.x41 r0 = r2.f153498a
            goto L_0x01d6
        L_0x01d5:
            r0 = r1
        L_0x01d6:
            if (r0 == 0) goto L_0x01f4
            A r0 = r3.f38555d
            cj1.h6 r0 = (cj1.C54768h6) r0
            if (r0 == 0) goto L_0x01ec
            te3.x41 r0 = r0.f153498a
            if (r0 == 0) goto L_0x01ec
            te3.x41 r4 = r2.f153498a
            int r4 = r4.f144442d
            int r0 = r0.f144442d
            if (r4 != r0) goto L_0x01ec
            r0 = 1
            goto L_0x01ed
        L_0x01ec:
            r0 = 0
        L_0x01ed:
            if (r0 == 0) goto L_0x01f4
            int r0 = r2.f153499b
            r2 = 1
            if (r0 == r2) goto L_0x021a
        L_0x01f4:
            A r0 = r3.f38555d
            r11 = r0
            cj1.h6 r11 = (cj1.C54768h6) r11
            if (r11 == 0) goto L_0x0211
            wg1.v r10 = r7.f172345f
            if (r10 == 0) goto L_0x020f
            B r0 = r3.f38556e
            java.lang.Number r0 = (java.lang.Number) r0
            int r12 = r0.intValue()
            r13 = 0
            r14 = 4
            r15 = 0
            wg1.C66089v.C66090a.m77877a(r10, r11, r12, r13, r14, r15)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x020f:
            if (r1 != 0) goto L_0x021a
        L_0x0211:
            wg1.v r0 = r7.f172345f
            if (r0 == 0) goto L_0x021a
            r0.mo90008x0()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x021a:
            wg1.v r0 = r7.f172345f
            if (r0 == 0) goto L_0x0221
            r0.mo89996Y()
        L_0x0221:
            r1 = 0
            r7.mo85415c(r1, r1)
            fj1.b r0 = r7.f172344e
            androidx.lifecycle.i0 r0 = r0.mo71262a(r8)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r0 = r0.f182392d
            fj1.b r2 = r7.f172344e
            androidx.lifecycle.i0 r2 = r2.mo71262a(r8)
            cl1.u r2 = (cl1.C55001u) r2
            byte[] r2 = r2.f154417n
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            fj1.b r4 = r7.f172344e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r8)
            cl1.u r4 = (cl1.C55001u) r4
            long r4 = r4.f154416j
            fj1.b r6 = r7.f172344e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r9)
            cl1.o r6 = (cl1.C54991o) r6
            cj1.f r6 = r6.f154232N2
            te3.zv0 r6 = r6.mo75648e()
            r18 = 3
            dj1.o0 r8 = new dj1.o0
            kk1.a r19 = new kk1.a
            r10 = r19
            r11 = r0
            r13 = r2
            r14 = r3
            r15 = r4
            r17 = r6
            r10.<init>(r11, r13, r14, r15, r17)
            r10 = r8
            r10.<init>(r11, r13, r14, r15, r17, r18, r19)
            r8.mo9225i()
            wg1.x1 r0 = wg1.C66107x1.f190022a
            fj1.b r1 = r7.f172344e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r9)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            r2 = 7
            r3 = 0
            r0.mo90147a(r1, r2, r3)
            goto L_0x03cc
        L_0x0286:
            r1 = 2131309780(0x7f0934d4, float:1.8237853E38)
            if (r0 != 0) goto L_0x028c
            goto L_0x02da
        L_0x028c:
            int r2 = r0.intValue()
            if (r2 != r1) goto L_0x02da
            android.widget.CheckBox r0 = r7.f172349j
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x02b7
            qk1.j r0 = r7.f172352p
            java.util.ArrayList<cj1.h6> r0 = r0.f179415f
            java.util.Iterator r0 = r0.iterator()
        L_0x02a2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02b2
            java.lang.Object r1 = r0.next()
            cj1.h6 r1 = (cj1.C54768h6) r1
            r2 = 1
            r1.f153502e = r2
            goto L_0x02a2
        L_0x02b2:
            r2 = 1
            r7.mo85413a(r2)
            goto L_0x02d3
        L_0x02b7:
            qk1.j r0 = r7.f172352p
            java.util.ArrayList<cj1.h6> r0 = r0.f179415f
            java.util.Iterator r0 = r0.iterator()
        L_0x02bf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02cf
            java.lang.Object r1 = r0.next()
            cj1.h6 r1 = (cj1.C54768h6) r1
            r2 = 0
            r1.f153502e = r2
            goto L_0x02bf
        L_0x02cf:
            r2 = 0
            r7.mo85413a(r2)
        L_0x02d3:
            qk1.j r0 = r7.f172352p
            r0.notifyDataSetChanged()
            goto L_0x03cc
        L_0x02da:
            r2 = 1
            r1 = 2131309782(0x7f0934d6, float:1.8237858E38)
            if (r0 != 0) goto L_0x02e2
            goto L_0x03cc
        L_0x02e2:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x03cc
            qk1.j r1 = r7.f172352p
            r1.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList<cj1.h6> r0 = r1.f179415f     // Catch:{ Exception -> 0x0380 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0380 }
            java.lang.String r5 = "dataList.iterator()"
            gy3.C87412m.m108593f(r0, r5)     // Catch:{ Exception -> 0x0380 }
            r5 = 0
            r6 = 0
        L_0x02ff:
            boolean r8 = r0.hasNext()     // Catch:{ Exception -> 0x0380 }
            if (r8 == 0) goto L_0x0341
            java.lang.Object r8 = r0.next()     // Catch:{ Exception -> 0x0380 }
            java.lang.String r10 = "iterator.next()"
            gy3.C87412m.m108593f(r8, r10)     // Catch:{ Exception -> 0x0380 }
            cj1.h6 r8 = (cj1.C54768h6) r8     // Catch:{ Exception -> 0x0380 }
            boolean r10 = r8.f153502e     // Catch:{ Exception -> 0x0380 }
            if (r10 == 0) goto L_0x0339
            r0.remove()     // Catch:{ Exception -> 0x0380 }
            te3.x41 r10 = r8.f153498a     // Catch:{ Exception -> 0x0380 }
            int r10 = r10.f144442d     // Catch:{ Exception -> 0x0380 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0380 }
            r4.add(r10)     // Catch:{ Exception -> 0x0380 }
            cj1.h6 r10 = r1.f179417h     // Catch:{ Exception -> 0x0380 }
            if (r10 == 0) goto L_0x0334
            te3.x41 r10 = r10.f153498a     // Catch:{ Exception -> 0x0380 }
            if (r10 == 0) goto L_0x0334
            te3.x41 r8 = r8.f153498a     // Catch:{ Exception -> 0x0380 }
            int r8 = r8.f144442d     // Catch:{ Exception -> 0x0380 }
            int r10 = r10.f144442d     // Catch:{ Exception -> 0x0380 }
            if (r8 != r10) goto L_0x0334
            r8 = 1
            goto L_0x0335
        L_0x0334:
            r8 = 0
        L_0x0335:
            if (r8 == 0) goto L_0x02ff
            r5 = 1
            goto L_0x02ff
        L_0x0339:
            if (r5 == 0) goto L_0x02ff
            if (r6 != 0) goto L_0x02ff
            r1.f179417h = r8     // Catch:{ Exception -> 0x0380 }
            r6 = 1
            goto L_0x02ff
        L_0x0341:
            if (r5 == 0) goto L_0x034f
            if (r6 != 0) goto L_0x034f
            java.util.ArrayList<cj1.h6> r0 = r1.f179415f     // Catch:{ Exception -> 0x0380 }
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ Exception -> 0x0380 }
            cj1.h6 r0 = (cj1.C54768h6) r0     // Catch:{ Exception -> 0x0380 }
            r1.f179417h = r0     // Catch:{ Exception -> 0x0380 }
        L_0x034f:
            java.util.LinkedList<java.lang.Integer> r0 = r1.f179414e     // Catch:{ Exception -> 0x0380 }
            r0.removeAll(r4)     // Catch:{ Exception -> 0x0380 }
            java.lang.String r0 = r1.f179413d     // Catch:{ Exception -> 0x0380 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0380 }
            r2.<init>()     // Catch:{ Exception -> 0x0380 }
            java.lang.String r5 = "curPlayItem:"
            r2.append(r5)     // Catch:{ Exception -> 0x0380 }
            cj1.h6 r5 = r1.f179416g     // Catch:{ Exception -> 0x0380 }
            r2.append(r5)     // Catch:{ Exception -> 0x0380 }
            java.lang.String r5 = ", nextPlayItem:"
            r2.append(r5)     // Catch:{ Exception -> 0x0380 }
            cj1.h6 r5 = r1.f179417h     // Catch:{ Exception -> 0x0380 }
            r2.append(r5)     // Catch:{ Exception -> 0x0380 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0380 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0380 }
            java.util.ArrayList<cj1.h6> r0 = r1.f179415f     // Catch:{ Exception -> 0x0380 }
            java.lang.String r2 = "deleteMusicItems"
            r1.mo88133F4(r0, r2)     // Catch:{ Exception -> 0x0380 }
            goto L_0x0399
        L_0x037e:
            goto L_0x0399
        L_0x0380:
            r0 = move-exception
            er1.j4 r2 = er1.C58739j4.f168176a     // Catch:{ all -> 0x037e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x037e }
            r5.<init>()     // Catch:{ all -> 0x037e }
            java.lang.String r1 = r1.f179413d     // Catch:{ all -> 0x037e }
            r5.append(r1)     // Catch:{ all -> 0x037e }
            java.lang.String r1 = ",deleteMusicItems:"
            r5.append(r1)     // Catch:{ all -> 0x037e }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x037e }
            r2.mo83712h0(r0, r1)     // Catch:{ all -> 0x037e }
        L_0x0399:
            qk1.j r0 = r7.f172352p
            r0.notifyDataSetChanged()
            r1 = 0
            r7.mo85413a(r1)
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x03cc
            wg1.x1 r0 = wg1.C66107x1.f190022a
            fj1.b r1 = r7.f172344e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r9)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            r2 = 6
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            if (r6 <= r3) goto L_0x03c0
            goto L_0x03c1
        L_0x03c0:
            r3 = r6
        L_0x03c1:
            r6 = 0
            java.util.List r3 = r4.subList(r6, r3)
            r5.<init>(r3)
            r0.mo90148b(r1, r2, r5)
        L_0x03cc:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r7, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60446k0.onClick(android.view.View):void");
    }
}
