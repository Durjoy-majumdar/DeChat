package com.tencent.p014mm.plugin.finder.viewmodel.component;

import a14.C0000n0;
import a14.C53851a;
import a14.C53884f2;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import ej0.C58606a;
import ej0.C58608e;
import ej0.C86524b;
import ej0.C86525c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import nj3.C76912y0;
import o40.C61926c;
import rs1.C63558j8;
import rs1.C63609o8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C49100d53;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C113200q(initialMode = 2)
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j */
public final class C56711j extends UIComponent implements C58606a.C58607a {

    /* renamed from: A */
    public C53973z1 f162577A;

    /* renamed from: B */
    public C53973z1 f162578B;

    /* renamed from: C */
    public long f162579C;

    /* renamed from: D */
    public int f162580D = 1;

    /* renamed from: E */
    public long f162581E;

    /* renamed from: F */
    public final C13601g f162582F;

    /* renamed from: G */
    public int f162583G;

    /* renamed from: H */
    public boolean f162584H;

    /* renamed from: I */
    public final C13601g f162585I;

    /* renamed from: J */
    public final int f162586J;

    /* renamed from: K */
    public int f162587K;

    /* renamed from: L */
    public final C13601g f162588L;

    /* renamed from: d */
    public final C13601g f162589d;

    /* renamed from: e */
    public final C13601g f162590e = C36568h.m40985a(new C56722g(this));

    /* renamed from: f */
    public final C13601g f162591f = C36568h.m40985a(new C56717c0(this));

    /* renamed from: g */
    public final C13601g f162592g = C36568h.m40985a(new C56721f(this));

    /* renamed from: h */
    public final C13601g f162593h = C36568h.m40985a(new C56720e(this));

    /* renamed from: i */
    public final C13601g f162594i = C36568h.m40985a(new C56738z(this));

    /* renamed from: j */
    public final C13601g f162595j = C36568h.m40985a(new C56732r(this));

    /* renamed from: n */
    public final C13601g f162596n = C36568h.m40985a(new C56733s(this));

    /* renamed from: o */
    public final C13601g f162597o = C36568h.m40985a(new C56724i(this));

    /* renamed from: p */
    public final C13601g f162598p = C36568h.m40985a(new C56725j(this));

    /* renamed from: q */
    public final C13601g f162599q = C36568h.m40985a(new C56730p(this));

    /* renamed from: r */
    public final C13601g f162600r = C36568h.m40985a(new C56729o(this));

    /* renamed from: s */
    public final C13601g f162601s = C36568h.m40985a(new C56728n(this));

    /* renamed from: t */
    public final C13601g f162602t = C36568h.m40985a(C56723h.f162624d);

    /* renamed from: u */
    public final C13601g f162603u = C36568h.m40985a(new C56718d(this));

    /* renamed from: v */
    public final C13601g f162604v = C36568h.m40985a(new C56731q(this));

    /* renamed from: w */
    public C86525c f162605w;

    /* renamed from: x */
    public long f162606x;

    /* renamed from: y */
    public long f162607y;

    /* renamed from: z */
    public final C13601g f162608z = C36568h.m40985a(C56727l.f162628d);

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$m */
    public static final class C4335m extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f18815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4335m(C56711j jVar) {
            super(1);
            this.f18815d = jVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                View i3 = this.f18815d.mo80095i3();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(i3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$hidePanel$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(i3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$hidePanel$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View decorView = this.f18815d.getActivity().getWindow().getDecorView();
                C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).removeView(this.f18815d.mo80095i3());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$w */
    public static final class C4336w implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C56711j f18816d;

        public C4336w(C56711j jVar) {
            this.f18816d = jVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$refreshByMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18816d.mo80099m3(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$refreshByMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$x */
    public static final class C4337x extends ClickableSpan {
        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$refreshByMode$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$refreshByMode$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(Color.parseColor("#7D90A9"));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$a */
    public final class C56712a extends RecyclerView.C16613e<C56714b> {
        public C56712a() {
        }

        public int getItemCount() {
            return C56711j.this.mo80093f3().size();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
            r1 = r1.f251382a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r8, int r9) {
            /*
                r7 = this;
                com.tencent.mm.plugin.finder.viewmodel.component.j$b r8 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56714b) r8
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r8, r0)
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.this
                java.util.ArrayList r0 = r0.mo80093f3()
                java.lang.Object r9 = sx3.C110818d0.m150917O(r0, r9)
                com.tencent.mm.plugin.finder.viewmodel.component.j$c r9 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56716c) r9
                if (r9 == 0) goto L_0x0092
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.this
                ej0.c r1 = r9.f162616a
                r2 = 0
                if (r1 == 0) goto L_0x0023
                ej0.b r1 = r1.f251382a
                if (r1 == 0) goto L_0x0023
                java.lang.String r1 = r1.f251378g
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                android.widget.TextView r3 = r8.f162614z
                r3.setText(r1)
                android.widget.ProgressBar r1 = r8.f162613A
                r3 = 8
                r1.setVisibility(r3)
                android.view.View r1 = r8.f44854d
                com.tencent.mm.plugin.finder.viewmodel.component.i r3 = new com.tencent.mm.plugin.finder.viewmodel.component.i
                r3.<init>(r0, r9)
                r1.setOnClickListener(r3)
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                android.app.Activity r1 = r0.getContext()
                rs1.s8 r9 = r9.mo12873f(r1)
                if (r9 == 0) goto L_0x004b
                te3.hj1 r9 = r9.mo12861q3()
                goto L_0x004c
            L_0x004b:
                r9 = r2
            L_0x004c:
                java.lang.Class<l31.e> r1 = l31.C61212e.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                l31.e r1 = (l31.C61212e) r1
                android.view.View r3 = r8.f44854d
                java.lang.String r4 = "projection_choice"
                r1.o30(r3, r4)
                android.view.View r3 = r8.f44854d
                r4 = 40
                r5 = 25496(0x6398, float:3.5728E-41)
                r1.mo86175pO(r3, r4, r5)
                android.view.View r8 = r8.f44854d
                r3 = 2
                rx3.l[] r3 = new rx3.C13604l[r3]
                r4 = 0
                long r5 = r0.f162607y
                java.lang.String r0 = o40.C61926c.m72691p(r5)
                rx3.l r5 = new rx3.l
                java.lang.String r6 = "feed_id"
                r5.<init>(r6, r0)
                r3[r4] = r5
                r0 = 1
                if (r9 == 0) goto L_0x0082
                int r9 = r9.f134675i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            L_0x0082:
                rx3.l r9 = new rx3.l
                java.lang.String r4 = "comment_scene"
                r9.<init>(r4, r2)
                r3[r0] = r9
                java.util.Map r9 = sx3.C90364q0.m113147f(r3)
                r1.mo86149PM(r8, r9)
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56712a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "view");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.d9v, (ViewGroup) null);
            inflate.setBackground(viewGroup.getContext().getResources().getDrawable(C0966R.C0969drawable.f5162yu));
            return new C56714b(C56711j.this, inflate);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$selectDevice$1", mo125469f = "FinderProjectionScreenUIC.kt", mo125470l = {358}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$a0 */
    public static final class C56713a0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f162610d;

        /* renamed from: e */
        public final /* synthetic */ C56711j f162611e;

        /* renamed from: f */
        public final /* synthetic */ C86525c f162612f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56713a0(C56711j jVar, C86525c cVar, C15601d<? super C56713a0> dVar) {
            super(2, dVar);
            this.f162611e = jVar;
            this.f162612f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56713a0(this.f162611e, this.f162612f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56713a0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C53973z1 z1Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f162610d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var2 = this.f162611e.f162577A;
                if ((z1Var2 != null && ((C53851a) z1Var2).mo74466a()) && (z1Var = this.f162611e.f162577A) != null) {
                    this.f162610d = 1;
                    if (((C53884f2) z1Var).mo74521O(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56711j jVar = this.f162611e;
            String j3 = jVar.mo80096j3(jVar.f162607y);
            if (!(j3 == null || j3.length() == 0)) {
                z = false;
            }
            if (z) {
                Log.m105920e("FinderProjectionScreenUIC", "videoUrl is nullOrNil!!, return");
                C76912y0.makeText((Context) this.f162611e.getContext(), (int) C0966R.string.f360542nd2, 0).show();
                return C13598b0.f38549a;
            }
            C56711j jVar2 = this.f162611e;
            C86525c cVar = this.f162612f;
            jVar2.f162605w = cVar;
            jVar2.f162606x = jVar2.f162607y;
            if (cVar != null) {
                cVar.mo121003e(new C63609o8(jVar2, j3));
            }
            Log.m105924i("FinderProjectionScreenUIC", "selectDevice: " + this.f162611e.f162605w);
            this.f162611e.f162578B = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$b */
    public final class C56714b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ProgressBar f162613A;

        /* renamed from: z */
        public final TextView f162614z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56714b(C56711j jVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f162614z = (TextView) view.findViewById(C0966R.C0970id.odq);
            this.f162613A = (ProgressBar) view.findViewById(C0966R.C0970id.odp);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$b0 */
    public static final class C56715b0 extends C87413o implements C32224a<C56741m> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56715b0(C56711j jVar) {
            super(0);
            this.f162615d = jVar;
        }

        public Object invoke() {
            return new C56741m(this.f162615d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$c */
    public static final class C56716c {

        /* renamed from: a */
        public C86525c f162616a;

        public C56716c(C86525c cVar) {
            this.f162616a = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C56716c) && C87412m.m108589b(this.f162616a, ((C56716c) obj).f162616a);
        }

        public int hashCode() {
            C86525c cVar = this.f162616a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "DeviceInfo(device=" + this.f162616a + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$c0 */
    public static final class C56717c0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56717c0(C56711j jVar) {
            super(0);
            this.f162617d = jVar;
        }

        public Object invoke() {
            return this.f162617d.mo80095i3().findViewById(C0966R.C0970id.f358274oe2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$d */
    public static final class C56718d extends C87413o implements C32224a<C56712a> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56718d(C56711j jVar) {
            super(0);
            this.f162618d = jVar;
        }

        public Object invoke() {
            return new C56712a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$d0 */
    public static final class C56719d0 extends C87413o implements C32224a<FinderProjectionScreenUIC$videoEndListener$2$1> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f162619d;

        /* renamed from: e */
        public final /* synthetic */ C56711j f162620e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56719d0(AppCompatActivity appCompatActivity, C56711j jVar) {
            super(0);
            this.f162619d = appCompatActivity;
            this.f162620e = jVar;
        }

        public Object invoke() {
            return new FinderProjectionScreenUIC$videoEndListener$2$1(this.f162619d, this.f162620e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$e */
    public static final class C56720e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56720e(C56711j jVar) {
            super(0);
            this.f162621d = jVar;
        }

        public Object invoke() {
            return this.f162621d.mo80095i3().findViewById(C0966R.C0970id.ods);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$f */
    public static final class C56721f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56721f(C56711j jVar) {
            super(0);
            this.f162622d = jVar;
        }

        public Object invoke() {
            return this.f162622d.mo80095i3().findViewById(C0966R.C0970id.odl);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$g */
    public static final class C56722g extends C87413o implements C32224a<LiveBottomSheetPanel> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56722g(C56711j jVar) {
            super(0);
            this.f162623d = jVar;
        }

        public Object invoke() {
            return (LiveBottomSheetPanel) this.f162623d.mo80095i3().findViewById(C0966R.C0970id.odn);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$h */
    public static final class C56723h extends C87413o implements C32224a<ArrayList<C56716c>> {

        /* renamed from: d */
        public static final C56723h f162624d = new C56723h();

        public C56723h() {
            super(0);
        }

        public Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$i */
    public static final class C56724i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56724i(C56711j jVar) {
            super(0);
            this.f162625d = jVar;
        }

        public Object invoke() {
            return this.f162625d.mo80095i3().findViewById(C0966R.C0970id.odx);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$j */
    public static final class C56725j extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56725j(C56711j jVar) {
            super(0);
            this.f162626d = jVar;
        }

        public Object invoke() {
            return (RecyclerView) this.f162626d.mo80095i3().findViewById(C0966R.C0970id.ody);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$k */
    public static final class C56726k extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56726k(C56711j jVar) {
            super(0);
            this.f162627d = jVar;
        }

        public Object invoke() {
            return new MTimerHandler("finder_device_search", (MTimerHandler.CallBack) new C56739k(this.f162627d), true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$l */
    public static final class C56727l extends C87413o implements C32224a<HashMap<Long, C49100d53>> {

        /* renamed from: d */
        public static final C56727l f162628d = new C56727l();

        public C56727l() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$n */
    public static final class C56728n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56728n(C56711j jVar) {
            super(0);
            this.f162629d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f162629d.mo80095i3().findViewById(C0966R.C0970id.odt);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$o */
    public static final class C56729o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56729o(C56711j jVar) {
            super(0);
            this.f162630d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f162630d.mo80095i3().findViewById(C0966R.C0970id.odu);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$p */
    public static final class C56730p extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56730p(C56711j jVar) {
            super(0);
            this.f162631d = jVar;
        }

        public Object invoke() {
            return this.f162631d.mo80095i3().findViewById(C0966R.C0970id.odv);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$q */
    public static final class C56731q extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56731q(C56711j jVar) {
            super(0);
            this.f162632d = jVar;
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C56740l(this.f162632d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$r */
    public static final class C56732r extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56732r(C56711j jVar) {
            super(0);
            this.f162633d = jVar;
        }

        public Object invoke() {
            return this.f162633d.mo80095i3().findViewById(C0966R.C0970id.odz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$s */
    public static final class C56733s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56733s(C56711j jVar) {
            super(0);
            this.f162634d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f162634d.mo80095i3().findViewById(C0966R.C0970id.f358272oe0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$t */
    public static final class C56734t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86525c f162635d;

        /* renamed from: e */
        public final /* synthetic */ C56711j f162636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56734t(C86525c cVar, C56711j jVar) {
            super(0);
            this.f162635d = cVar;
            this.f162636e = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
            r5 = r5.f251382a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                ej0.c r0 = r7.f162635d
                if (r0 == 0) goto L_0x0075
                ej0.b r0 = r0.f251382a
                if (r0 == 0) goto L_0x0075
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r7.f162636e
                int r1 = r0.f162583G
                r2 = 3
                if (r1 == r2) goto L_0x0075
                java.util.ArrayList r0 = r0.mo80093f3()
                ej0.c r1 = r7.f162635d
                monitor-enter(r0)
                java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0072 }
            L_0x001a:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0072 }
                r4 = 0
                if (r3 == 0) goto L_0x0041
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0072 }
                r5 = r3
                com.tencent.mm.plugin.finder.viewmodel.component.j$c r5 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56716c) r5     // Catch:{ all -> 0x0072 }
                ej0.c r5 = r5.f162616a     // Catch:{ all -> 0x0072 }
                if (r5 == 0) goto L_0x0033
                ej0.b r5 = r5.f251382a     // Catch:{ all -> 0x0072 }
                if (r5 == 0) goto L_0x0033
                java.lang.String r5 = r5.f251380i     // Catch:{ all -> 0x0072 }
                goto L_0x0034
            L_0x0033:
                r5 = r4
            L_0x0034:
                ej0.b r6 = r1.f251382a     // Catch:{ all -> 0x0072 }
                if (r6 == 0) goto L_0x003a
                java.lang.String r4 = r6.f251380i     // Catch:{ all -> 0x0072 }
            L_0x003a:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0072 }
                if (r4 == 0) goto L_0x001a
                r4 = r3
            L_0x0041:
                monitor-exit(r0)
                com.tencent.mm.plugin.finder.viewmodel.component.j$c r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56716c) r4
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r7.f162636e
                r1 = 2
                r0.mo80099m3(r1)
                if (r4 != 0) goto L_0x0075
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r7.f162636e
                java.util.ArrayList r0 = r0.mo80093f3()
                com.tencent.mm.plugin.finder.viewmodel.component.j$c r1 = new com.tencent.mm.plugin.finder.viewmodel.component.j$c
                ej0.c r2 = r7.f162635d
                r1.<init>(r2)
                r0.add(r1)
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r7.f162636e
                com.tencent.mm.plugin.finder.viewmodel.component.j$a r0 = r0.mo80092e3()
                com.tencent.mm.plugin.finder.viewmodel.component.j r1 = r7.f162636e
                java.util.ArrayList r1 = r1.mo80093f3()
                int r1 = r1.size()
                int r1 = r1 + -1
                r0.notifyItemInserted(r1)
                goto L_0x0075
            L_0x0072:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0075:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56734t.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$u */
    public static final class C56735u extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86525c f162637d;

        /* renamed from: e */
        public final /* synthetic */ C56711j f162638e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56735u(C86525c cVar, C56711j jVar) {
            super(0);
            this.f162637d = cVar;
            this.f162638e = jVar;
        }

        public Object invoke() {
            int i;
            C86524b bVar;
            C86525c cVar = this.f162637d;
            if (!(cVar == null || cVar.f251382a == null)) {
                C56711j jVar = this.f162638e;
                if (jVar.f162583G != 3) {
                    ArrayList<C56716c> f3 = jVar.mo80093f3();
                    C86525c cVar2 = this.f162637d;
                    synchronized (f3) {
                        int i2 = 0;
                        i = -1;
                        for (T next : f3) {
                            int i3 = i2 + 1;
                            String str = null;
                            if (i2 >= 0) {
                                C56716c cVar3 = (C56716c) next;
                                C86524b bVar2 = cVar2.f251382a;
                                String str2 = bVar2 != null ? bVar2.f251380i : null;
                                C86525c cVar4 = cVar3.f162616a;
                                if (!(cVar4 == null || (bVar = cVar4.f251382a) == null)) {
                                    str = bVar.f251380i;
                                }
                                if (Util.isEqual(str2, str)) {
                                    i = i2;
                                }
                                i2 = i3;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                    if (i != -1 && i > 0 && i < this.f162638e.mo80093f3().size()) {
                        this.f162638e.mo80093f3().remove(i);
                        this.f162638e.mo80092e3().notifyItemRemoved(i);
                    }
                    if (this.f162638e.mo80093f3().isEmpty()) {
                        this.f162638e.mo80099m3(1);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$v */
    public static final class C56736v extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86525c f162639d;

        /* renamed from: e */
        public final /* synthetic */ C56711j f162640e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56736v(C86525c cVar, C56711j jVar) {
            super(0);
            this.f162639d = cVar;
            this.f162640e = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
            r9 = r9.f251382a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r11 = this;
                ej0.c r0 = r11.f162639d
                if (r0 == 0) goto L_0x0073
                ej0.b r0 = r0.f251382a
                if (r0 == 0) goto L_0x0073
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r11.f162640e
                int r1 = r0.f162583G
                r2 = 3
                if (r1 == r2) goto L_0x0073
                java.util.ArrayList r0 = r0.mo80093f3()
                ej0.c r1 = r11.f162639d
                monitor-enter(r0)
                r2 = 0
                java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0070 }
                r4 = -1
                r5 = -1
            L_0x001d:
                boolean r6 = r3.hasNext()     // Catch:{ all -> 0x0070 }
                if (r6 == 0) goto L_0x004f
                java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0070 }
                int r7 = r2 + 1
                r8 = 0
                if (r2 < 0) goto L_0x004b
                com.tencent.mm.plugin.finder.viewmodel.component.j$c r6 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56716c) r6     // Catch:{ all -> 0x0070 }
                ej0.c r9 = r6.f162616a     // Catch:{ all -> 0x0070 }
                if (r9 == 0) goto L_0x0039
                ej0.b r9 = r9.f251382a     // Catch:{ all -> 0x0070 }
                if (r9 == 0) goto L_0x0039
                java.lang.String r9 = r9.f251380i     // Catch:{ all -> 0x0070 }
                goto L_0x003a
            L_0x0039:
                r9 = r8
            L_0x003a:
                ej0.b r10 = r1.f251382a     // Catch:{ all -> 0x0070 }
                if (r10 == 0) goto L_0x0040
                java.lang.String r8 = r10.f251380i     // Catch:{ all -> 0x0070 }
            L_0x0040:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r8)     // Catch:{ all -> 0x0070 }
                if (r8 == 0) goto L_0x0049
                r6.f162616a = r1     // Catch:{ all -> 0x0070 }
                r5 = r2
            L_0x0049:
                r2 = r7
                goto L_0x001d
            L_0x004b:
                sx3.C64197v.m75542k()     // Catch:{ all -> 0x0070 }
                throw r8     // Catch:{ all -> 0x0070 }
            L_0x004f:
                monitor-exit(r0)
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r11.f162640e
                r1 = 2
                r0.mo80099m3(r1)
                if (r5 == r4) goto L_0x0073
                if (r5 <= 0) goto L_0x0073
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r11.f162640e
                java.util.ArrayList r0 = r0.mo80093f3()
                int r0 = r0.size()
                if (r5 >= r0) goto L_0x0073
                com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r11.f162640e
                com.tencent.mm.plugin.finder.viewmodel.component.j$a r0 = r0.mo80092e3()
                r0.notifyItemChanged(r5)
                goto L_0x0073
            L_0x0070:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0073:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56736v.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$y */
    public static final class C56737y extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f162641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56737y(AppCompatActivity appCompatActivity) {
            super(0);
            this.f162641d = appCompatActivity;
        }

        public Object invoke() {
            return C85868k2.m106137b(this.f162641d).inflate(C0966R.C0971layout.d9w, (ViewGroup) null, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.j$z */
    public static final class C56738z extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56738z(C56711j jVar) {
            super(0);
            this.f162642d = jVar;
        }

        public Object invoke() {
            return this.f162642d.mo80095i3().findViewById(C0966R.C0970id.f358273oe1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56711j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f162589d = C36568h.m40985a(new C56737y(appCompatActivity));
        this.f162582F = C36568h.m40985a(new C56719d0(appCompatActivity, this));
        this.f162583G = -1;
        this.f162585I = C36568h.m40985a(new C56715b0(this));
        this.f162586J = 10;
        this.f162588L = C36568h.m40985a(new C56726k(this));
    }

    /* renamed from: c3 */
    public static final void m65452c3(C56711j jVar, String str, String str2) {
        jVar.getClass();
        Log.m105924i("FinderProjectionScreenUIC", "internalPlay: source=" + str2 + ", videoUrl=" + str + ", feedId=" + C61926c.m72691p(jVar.f162606x));
        C86525c cVar = jVar.f162605w;
        if (cVar != null) {
            cVar.f251386e.f167798a = C58608e.C58609a.Stopped;
        }
        if (cVar != null) {
            cVar.mo121002d(str, new C63558j8(jVar));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:5|3)|13|6|7|8|9|10|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0063 */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80091d3() {
        /*
            r6 = this;
            java.lang.String r0 = "FinderProjectionScreenUIC"
            java.lang.String r1 = "cleanUp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            rx3.g r1 = r6.f162588L     // Catch:{ Exception -> 0x0069 }
            rx3.n r1 = (rx3.C36570n) r1     // Catch:{ Exception -> 0x0069 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0069 }
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = (com.tencent.p014mm.sdk.platformtools.MTimerHandler) r1     // Catch:{ Exception -> 0x0069 }
            r1.stopTimer()     // Catch:{ Exception -> 0x0069 }
            java.util.ArrayList r1 = r6.mo80093f3()     // Catch:{ Exception -> 0x0069 }
            r1.clear()     // Catch:{ Exception -> 0x0069 }
            com.tencent.mm.plugin.finder.viewmodel.component.j$a r1 = r6.mo80092e3()     // Catch:{ Exception -> 0x0069 }
            r1.notifyDataSetChanged()     // Catch:{ Exception -> 0x0069 }
            ej0.a r1 = ej0.C58606a.m68054a()     // Catch:{ Exception -> 0x0069 }
            r2 = 1
            r1.f167795a = r2     // Catch:{ Exception -> 0x0069 }
            java.util.Map<java.lang.String, ej0.c> r2 = r1.f167796b     // Catch:{ Exception -> 0x0069 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0069 }
            java.util.Collection r2 = r2.values()     // Catch:{ Exception -> 0x0069 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0069 }
        L_0x0035:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0069 }
            r4 = 0
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0069 }
            ej0.c r3 = (ej0.C86525c) r3     // Catch:{ Exception -> 0x0069 }
            java.lang.String r5 = "device"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x0069 }
            r3.mo121007h()     // Catch:{ Exception -> 0x0069 }
            r3.mo121008i()     // Catch:{ Exception -> 0x0069 }
            r3.f251389h = r4     // Catch:{ Exception -> 0x0069 }
            goto L_0x0035
        L_0x0050:
            r1.mo83499d(r6)     // Catch:{ Exception -> 0x0069 }
            java.util.Map<java.lang.String, ej0.c> r1 = r1.f167796b     // Catch:{ Exception -> 0x0069 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0069 }
            r1.clear()     // Catch:{ Exception -> 0x0069 }
            ej0.C58606a.f167794d = r4     // Catch:{ Exception -> 0x0069 }
            int r1 = fj0.C86898q.f252215h     // Catch:{ a -> 0x0063 }
            fj0.q r1 = fj0.C86898q.C59104e.f169066a     // Catch:{ a -> 0x0063 }
            r1.mo121345a()     // Catch:{ a -> 0x0063 }
        L_0x0063:
            fj0.l r1 = fj0.C86883l.C86886c.f252190a     // Catch:{ Exception -> 0x0069 }
            r1.mo121336a()     // Catch:{ Exception -> 0x0069 }
            goto L_0x0082
        L_0x0069:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error happen while cleaning up "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.mo80091d3():void");
    }

    /* renamed from: e3 */
    public final C56712a mo80092e3() {
        return (C56712a) ((C36570n) this.f162603u).getValue();
    }

    /* renamed from: f3 */
    public final ArrayList<C56716c> mo80093f3() {
        return (ArrayList) ((C36570n) this.f162602t).getValue();
    }

    /* renamed from: g3 */
    public final TextView mo80094g3() {
        return (TextView) ((C36570n) this.f162596n).getValue();
    }

    /* renamed from: i3 */
    public final View mo80095i3() {
        return (View) ((C36570n) this.f162589d).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo80096j3(long r8) {
        /*
            r7 = this;
            rx3.g r0 = r7.f162608z
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r8 = r0.get(r8)
            te3.d53 r8 = (te3.C49100d53) r8
            r9 = 0
            if (r8 == 0) goto L_0x0045
            long r0 = r8.f132136f
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 * r2
            long r2 = eb0.C31543z5.m39453c()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x003d
            java.lang.String r0 = r8.f132135e
            if (r0 == 0) goto L_0x0039
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != r5) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x003d
            r4 = 1
        L_0x003d:
            if (r4 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r8 = r9
        L_0x0041:
            if (r8 == 0) goto L_0x0045
            java.lang.String r9 = r8.f132135e
        L_0x0045:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.mo80096j3(long):java.lang.String");
    }

    /* renamed from: k3 */
    public final boolean mo80097k3() {
        return this.f162584H && mo80095i3().getVisibility() == 0;
    }

    /* renamed from: l3 */
    public final void mo80098l3() {
        if (this.f162605w == null) {
            mo80091d3();
        }
        this.f162607y = 0;
        ((LiveBottomSheetPanel) ((C36570n) this.f162590e).getValue()).setOnVisibilityListener(new C4335m(this));
        ((LiveBottomSheetPanel) ((C36570n) this.f162590e).getValue()).mo78802a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x01aa, code lost:
        r12 = r12.f251382a;
     */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80099m3(int r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.f162583G
            if (r1 == r2) goto L_0x06f9
            r0.f162583G = r1
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 8
            r8 = 0
            r10 = 0
            if (r1 == 0) goto L_0x04ec
            if (r1 == r6) goto L_0x0329
            if (r1 == r5) goto L_0x01bd
            if (r1 == r3) goto L_0x001d
            goto L_0x0674
        L_0x001d:
            if (r2 != r5) goto L_0x0021
            r0.f162580D = r5
        L_0x0021:
            rx3.g r1 = r0.f162591f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162594i
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162595j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162597o
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r7)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162599q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r7)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162600r
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.View r2 = r24.mo80095i3()
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r7 = 2131827126(0x7f1119b6, float:1.9287156E38)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            ej0.c r12 = r0.f162605w
            if (r12 == 0) goto L_0x01b1
            ej0.b r12 = r12.f251382a
            if (r12 == 0) goto L_0x01b1
            java.lang.String r12 = r12.f251378g
            goto L_0x01b2
        L_0x01b1:
            r12 = r4
        L_0x01b2:
            r11[r10] = r12
            java.lang.String r2 = r2.getString(r7, r11)
            r1.setText(r2)
            goto L_0x0674
        L_0x01bd:
            rx3.g r1 = r0.f162591f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162594i
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162595j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162597o
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162599q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r7)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0674
        L_0x0329:
            rx3.g r1 = r0.f162591f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162594i
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162595j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162597o
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162599q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r7)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.text.SpannableString r1 = new android.text.SpannableString
            android.view.View r2 = r24.mo80095i3()
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r7 = 2131826637(0x7f1117cd, float:1.9286164E38)
            java.lang.String r2 = r2.getString(r7)
            r1.<init>(r2)
            r20 = 0
            r21 = 0
            r22 = 6
            r23 = 0
            java.lang.String r19 = "，"
            r18 = r1
            int r2 = z04.C112550d0.m153769E(r18, r19, r20, r21, r22, r23)
            r7 = -1
            if (r2 == r7) goto L_0x0674
            if (r2 <= 0) goto L_0x0674
            int r7 = r1.length()
            int r7 = r7 - r6
            if (r2 >= r7) goto L_0x0674
            com.tencent.mm.plugin.finder.viewmodel.component.j$x r7 = new com.tencent.mm.plugin.finder.viewmodel.component.j$x
            r7.<init>()
            int r2 = r2 + r6
            int r11 = r1.length()
            r12 = 33
            r1.setSpan(r7, r2, r11, r12)
            android.widget.TextView r2 = r24.mo80094g3()
            r2.setText(r1)
            android.widget.TextView r1 = r24.mo80094g3()
            com.tencent.mm.plugin.finder.viewmodel.component.j$w r2 = new com.tencent.mm.plugin.finder.viewmodel.component.j$w
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            goto L_0x0674
        L_0x04ec:
            rx3.g r1 = r0.f162591f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162594i
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162595j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162597o
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r1 = r0.f162599q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r7)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            r0.f162587K = r10
            rx3.g r1 = r0.f162588L
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = (com.tencent.p014mm.sdk.platformtools.MTimerHandler) r1
            r1.stopTimer()
            rx3.g r1 = r0.f162588L
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = (com.tencent.p014mm.sdk.platformtools.MTimerHandler) r1
            r11 = 3000(0xbb8, double:1.482E-320)
            r1.startTimer(r8, r11)
        L_0x0674:
            int r1 = r0.f162583G
            if (r1 == r5) goto L_0x06ed
            if (r1 != 0) goto L_0x067b
            goto L_0x06ed
        L_0x067b:
            long r1 = r0.f162579C
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x06f9
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            android.app.Activity r2 = r24.getContext()
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x0692
            te3.hj1 r1 = r1.mo12861q3()
            goto L_0x0693
        L_0x0692:
            r1 = r4
        L_0x0693:
            long r11 = eb0.C31543z5.m39453c()
            long r13 = r0.f162579C
            long r11 = r11 - r13
            java.lang.Class<l31.e> r2 = l31.C61212e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            l31.e r2 = (l31.C61212e) r2
            r7 = 4
            rx3.l[] r7 = new rx3.C13604l[r7]
            rx3.l r13 = new rx3.l
            java.lang.String r14 = "view_id"
            java.lang.String r15 = "projection_search"
            r13.<init>(r14, r15)
            r7[r10] = r13
            long r13 = r0.f162607y
            java.lang.String r10 = o40.C61926c.m72691p(r13)
            rx3.l r13 = new rx3.l
            java.lang.String r14 = "feed_id"
            r13.<init>(r14, r10)
            r7[r6] = r13
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "projection_search_time"
            r10.<init>(r11, r6)
            r7[r5] = r10
            if (r1 == 0) goto L_0x06d5
            int r1 = r1.f134675i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L_0x06d5:
            rx3.l r1 = new rx3.l
            java.lang.String r5 = "comment_scene"
            r1.<init>(r5, r4)
            r7[r3] = r1
            java.util.Map r1 = sx3.C90364q0.m113147f(r7)
            r3 = 25496(0x6398, float:3.5728E-41)
            java.lang.String r4 = "view_exp"
            r2.mo86168ix(r4, r1, r3)
            r0.f162579C = r8
            goto L_0x06f9
        L_0x06ed:
            long r1 = r0.f162579C
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x06f9
            long r1 = eb0.C31543z5.m39453c()
            r0.f162579C = r1
        L_0x06f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.mo80099m3(int):void");
    }

    /* renamed from: n */
    public void mo80100n(C86525c cVar) {
        C61926c.m72668M(new C56734t(cVar, this));
    }

    /* renamed from: n3 */
    public final void mo80101n3(C86525c cVar) {
        C53973z1 z1Var = this.f162578B;
        boolean z = true;
        if (z1Var == null || !z1Var.mo74466a()) {
            z = false;
        }
        if (!z) {
            this.f162578B = C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C56713a0(this, cVar, (C15601d<? super C56713a0>) null), 3, (Object) null);
        }
    }

    public boolean onBackPressed() {
        if (!mo80097k3()) {
            return false;
        }
        mo80098l3();
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        mo80091d3();
    }

    /* renamed from: q */
    public void mo80102q(C86525c cVar) {
        C61926c.m72668M(new C56735u(cVar, this));
    }

    /* renamed from: t */
    public void mo80103t(C86525c cVar) {
        C61926c.m72668M(new C56736v(cVar, this));
    }
}
