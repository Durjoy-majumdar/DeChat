package zo1;

import a14.C53851a;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import qj1.C12252b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: zo1.b0 */
public final class C16344b0 extends C12252b {

    /* renamed from: A */
    public boolean f43697A;

    /* renamed from: q */
    public final C58124b f43698q;

    /* renamed from: r */
    public final String f43699r = "ReplayTransitionLazyPlugin";

    /* renamed from: s */
    public final C13601g f43700s;

    /* renamed from: t */
    public final C13601g f43701t;

    /* renamed from: u */
    public final C13601g f43702u;

    /* renamed from: v */
    public final C13601g f43703v;

    /* renamed from: w */
    public final C13601g f43704w;

    /* renamed from: x */
    public final C13601g f43705x;

    /* renamed from: y */
    public Runnable f43706y;

    /* renamed from: z */
    public C53973z1 f43707z;

    /* renamed from: zo1.b0$a */
    public static final class C16345a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f43708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16345a(ViewGroup viewGroup) {
            super(0);
            this.f43708d = viewGroup;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f43708d.findViewById(C0966R.C0970id.bu7);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            return textView;
        }
    }

    /* renamed from: zo1.b0$b */
    public static final class C16346b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f43709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16346b(ViewGroup viewGroup) {
            super(0);
            this.f43709d = viewGroup;
        }

        public Object invoke() {
            return this.f43709d.findViewById(C0966R.C0970id.nyp);
        }
    }

    /* renamed from: zo1.b0$c */
    public static final class C16347c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f43710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16347c(ViewGroup viewGroup) {
            super(0);
            this.f43710d = viewGroup;
        }

        public Object invoke() {
            return this.f43710d.findViewById(C0966R.C0970id.gol);
        }
    }

    /* renamed from: zo1.b0$d */
    public static final class C16348d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f43711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16348d(ViewGroup viewGroup) {
            super(0);
            this.f43711d = viewGroup;
        }

        public Object invoke() {
            return (TextView) this.f43711d.findViewById(C0966R.C0970id.nzn);
        }
    }

    /* renamed from: zo1.b0$e */
    public static final class C16349e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f43712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16349e(ViewGroup viewGroup) {
            super(0);
            this.f43712d = viewGroup;
        }

        public Object invoke() {
            return (TextView) this.f43712d.findViewById(C0966R.C0970id.nyr);
        }
    }

    /* renamed from: zo1.b0$f */
    public static final class C16350f extends C87413o implements C32224a<FinderLiveOnliveWidget> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f43713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16350f(ViewGroup viewGroup) {
            super(0);
            this.f43713d = viewGroup;
        }

        public Object invoke() {
            return (FinderLiveOnliveWidget) this.f43713d.findViewById(C0966R.C0970id.nys);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16344b0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f43698q = bVar;
        this.f43700s = C36568h.m40985a(new C16350f(viewGroup));
        this.f43701t = C36568h.m40985a(new C16349e(viewGroup));
        this.f43702u = C36568h.m40985a(new C16348d(viewGroup));
        this.f43703v = C36568h.m40985a(new C16346b(viewGroup));
        this.f43704w = C36568h.m40985a(new C16345a(viewGroup));
        this.f43705x = C36568h.m40985a(new C16347c(viewGroup));
        Log.m105924i("ReplayTransitionLazyPlugin", "ReplayTransition0,init root:" + viewGroup.hashCode());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m15192Z0(zo1.C16344b0 r8, wx3.C15601d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof zo1.C16357g0
            if (r0 == 0) goto L_0x0016
            r0 = r9
            zo1.g0 r0 = (zo1.C16357g0) r0
            int r1 = r0.f43732g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f43732g = r1
            goto L_0x001b
        L_0x0016:
            zo1.g0 r0 = new zo1.g0
            r0.<init>(r8, r9)
        L_0x001b:
            java.lang.Object r9 = r0.f43730e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f43732g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r8 = r0.f43729d
            zo1.b0 r8 = (zo1.C16344b0) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0080
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            java.lang.Object r8 = r0.f43729d
            zo1.b0 r8 = (zo1.C16344b0) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0059
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = r8.f43699r
            java.lang.String r2 = "ReplayTransition2.2:playReplay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            r6 = 1200(0x4b0, double:5.93E-321)
            r0.f43729d = r8
            r0.f43732g = r4
            java.lang.Object r9 = a14.C53965x0.m60607b(r6, r0)
            if (r9 != r1) goto L_0x0059
            goto L_0x008f
        L_0x0059:
            com.tencent.mm.plugin.finder.live.view.b r9 = r8.mo14484z0()
            vo1.a0$b r2 = vo1.C65770a0.f189184r
            vo1.a0 r2 = r2.mo89819a()
            yo1.c r2 = r2.f189188b
            if (r2 == 0) goto L_0x006c
            al1.h r2 = r2.mo14672a()
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            gy3.C87412m.m108591d(r2)
            r9.activate(r2, r5, r5)
            r6 = 800(0x320, double:3.953E-321)
            r0.f43729d = r8
            r0.f43732g = r3
            java.lang.Object r9 = a14.C53965x0.m60607b(r6, r0)
            if (r9 != r1) goto L_0x0080
            goto L_0x008f
        L_0x0080:
            r8.mo3211w0()
            java.lang.Class<bp1.d> r9 = bp1.C54519d.class
            androidx.lifecycle.i0 r8 = r8.mo87696x0(r9)
            bp1.d r8 = (bp1.C54519d) r8
            r8.f152842D = r5
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zo1.C16344b0.m15192Z0(zo1.b0, wx3.d):java.lang.Object");
    }

    /* renamed from: e1 */
    public static void m15193e1(C16344b0 b0Var, TextView textView, String str, List list, long j, int i, Object obj) {
        C53973z1 z1Var;
        C16344b0 b0Var2 = b0Var;
        TextView textView2 = textView;
        long j2 = (i & 8) != 0 ? 500 : j;
        b0Var.getClass();
        if (!list.isEmpty()) {
            int size = list.size();
            String string = textView.getContext().getResources().getString(C0966R.string.fow);
            C87412m.m108593f(string, "target.context.resources…e_charge_replay_auditing)");
            String str2 = string + str;
            textView2.setText(str2);
            boolean z = false;
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = textView.getMeasuredWidth();
            textView2.setText(string);
            if (measuredWidth > 0) {
                textView2.setMinWidth(measuredWidth);
            }
            Log.m105924i(b0Var2.f43699r, "playAppendAnim minWidth:" + measuredWidth + " for text:" + str2);
            C8478d0 d0Var = new C8478d0();
            C53973z1 z1Var2 = b0Var2.f43707z;
            if (z1Var2 != null && ((C53851a) z1Var2).mo74466a()) {
                z = true;
            }
            if (z && (z1Var = b0Var2.f43707z) != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            b0Var2.f43707z = C53895h.m60466d(b0Var.mo14484z0().getViewScope(), (C66212f) null, (C53934p0) null, new C16356f0(b0Var, d0Var, textView, string, list, size, j2, (C15601d<? super C16356f0>) null), 3, (Object) null);
        }
    }

    /* renamed from: a1 */
    public final View mo14822a1() {
        Object value = ((C36570n) this.f43705x).getValue();
        C87412m.m108593f(value, "<get-mask>(...)");
        return (View) value;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final TextView mo14823b1() {
        Object value = ((C36570n) this.f43702u).getValue();
        C87412m.m108593f(value, "<get-playingTips>(...)");
        return (TextView) value;
    }

    /* renamed from: c1 */
    public final TextView mo14824c1() {
        Object value = ((C36570n) this.f43701t).getValue();
        C87412m.m108593f(value, "<get-subTitle>(...)");
        return (TextView) value;
    }

    /* renamed from: d1 */
    public final FinderLiveOnliveWidget mo14825d1() {
        Object value = ((C36570n) this.f43700s).getValue();
        C87412m.m108593f(value, "<get-title>(...)");
        return (FinderLiveOnliveWidget) value;
    }

    /* renamed from: f1 */
    public final void mo14826f1() {
        Runnable runnable = this.f43706y;
        if (runnable != null) {
            this.f166287d.removeCallbacks(runnable);
        }
        this.f43706y = null;
        C53973z1 z1Var = this.f43707z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f43707z = null;
        this.f43697A = false;
        View a1 = mo14822a1();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = a1;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "unInitUIUpdateTask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a1.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "unInitUIUpdateTask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Log.m105924i(this.f43699r, "ReplayTransition100:unMount");
        mo14826f1();
        this.f166287d.setVisibility(8);
    }
}
