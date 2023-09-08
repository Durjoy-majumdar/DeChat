package vi1;

import a14.C53872d1;
import a14.C53934p0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import cl1.C39981t0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hj1.C32931b;
import hj1.C59918a;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nk1.C11207i;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;
import p910lj.C76701a;
import qj1.C62660c;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import ui1.C14195b;
import ui1.C52578a;
import ui1.C52581e;
import wi1.C66119d;
import wx3.C15601d;

/* renamed from: vi1.a */
public final class C65750a extends C62660c implements View.OnClickListener {

    /* renamed from: A */
    public float f189143A;

    /* renamed from: p */
    public final ConstraintLayout f189144p;

    /* renamed from: q */
    public final ViewGroup f189145q;

    /* renamed from: r */
    public long f189146r;

    /* renamed from: s */
    public long f189147s;

    /* renamed from: t */
    public long f189148t;

    /* renamed from: u */
    public int f189149u = 1;

    /* renamed from: v */
    public String f189150v = "";

    /* renamed from: w */
    public final C52578a f189151w = new C52581e(this);

    /* renamed from: x */
    public final RelativeLayout f189152x;

    /* renamed from: y */
    public final C13601g f189153y;

    /* renamed from: z */
    public final C13601g f189154z;

    /* renamed from: vi1.a$b */
    public static final class C14873b implements C107204q {

        /* renamed from: a */
        public final /* synthetic */ C65750a f40899a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f40900b;

        /* renamed from: c */
        public final /* synthetic */ int f40901c;

        public C14873b(C65750a aVar, ViewGroup viewGroup, int i) {
            this.f40899a = aVar;
            this.f40900b = viewGroup;
            this.f40901c = i;
        }

        /* renamed from: a */
        public final C107179f0 mo12075a(View view, C107179f0 f0Var) {
            if (!this.f40899a.mo82893g0()) {
                int c = C75044y4.m89991c(this.f40900b.getContext());
                ViewGroup.LayoutParams layoutParams = this.f40900b.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f40901c + c;
                Log.m105924i("FinderLiveMicIntercomBo", "onApplyWindowInsets navigationHeight: " + c);
            }
            return C107207u.m145167h(view, f0Var);
        }
    }

    /* renamed from: vi1.a$c */
    public static final class C14874c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ View f40902d;

        public C14874c(View view) {
            this.f40902d = view;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f40902d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin$hideBottomLayout$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin$hideBottomLayout$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: vi1.a$e */
    public static final class C14875e extends C87413o implements C32224a<Vibrator> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f40903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14875e(ViewGroup viewGroup) {
            super(0);
            this.f40903d = viewGroup;
        }

        public Object invoke() {
            Object systemService = this.f40903d.getContext().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    /* renamed from: vi1.a$a */
    public static final class C65751a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C65750a f189155d;

        public C65751a(C65750a aVar) {
            this.f189155d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x017b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
            /*
                r16 = this;
                r6 = r16
                r7 = r18
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r17
                r0.add(r1)
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin$1"
                java.lang.String r1 = "android/view/View$OnTouchListener"
                java.lang.String r2 = "onTouch"
                java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r16
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                r0 = 0
                if (r7 == 0) goto L_0x0031
                int r1 = r18.getAction()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0032
            L_0x0031:
                r1 = r0
            L_0x0032:
                r2 = 0
                r7 = 1
                if (r1 != 0) goto L_0x0038
                goto L_0x020f
            L_0x0038:
                int r3 = r1.intValue()
                if (r3 != 0) goto L_0x020f
                vi1.a r1 = r6.f189155d
                r1.getClass()
                long r3 = java.lang.System.currentTimeMillis()
                long r8 = r1.f189146r
                long r8 = r3 - r8
                long r10 = r1.f189147s
                long r3 = r3 - r10
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r10 = "checkClickEnable downTime: "
                r5.append(r10)
                r5.append(r8)
                java.lang.String r10 = " max: "
                r5.append(r10)
                pe1.c<java.lang.Integer> r11 = gg1.C32444a.f86097S
                java.lang.Object r12 = r11.mo60266n()
                java.lang.Number r12 = (java.lang.Number) r12
                int r12 = r12.intValue()
                long r12 = (long) r12
                r5.append(r12)
                java.lang.String r12 = " upTime: "
                r5.append(r12)
                r5.append(r3)
                r5.append(r10)
                pe1.c<java.lang.Integer> r10 = gg1.C32444a.f86100T
                java.lang.Object r12 = r10.mo60266n()
                java.lang.Number r12 = (java.lang.Number) r12
                int r12 = r12.intValue()
                long r12 = (long) r12
                r14 = 300(0x12c, double:1.48E-321)
                long r12 = r12 + r14
                r5.append(r12)
                java.lang.String r5 = r5.toString()
                java.lang.String r13 = "FinderLiveMicIntercomBo"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
                java.lang.Object r5 = r11.mo60266n()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                long r11 = (long) r5
                int r5 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r5 <= 0) goto L_0x00b9
                java.lang.Object r5 = r10.mo60266n()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                long r8 = (long) r5
                long r8 = r8 + r14
                int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r5 > 0) goto L_0x00b7
                goto L_0x00b9
            L_0x00b7:
                r3 = 1
                goto L_0x00ca
            L_0x00b9:
                android.view.ViewGroup r3 = r1.f166287d
                android.content.Context r3 = r3.getContext()
                r4 = 2131828047(0x7f111d4f, float:1.9289024E38)
                android.widget.Toast r3 = p910lj.C76701a.makeText((android.content.Context) r3, (int) r4, (int) r2)
                r3.show()
                r3 = 0
            L_0x00ca:
                if (r3 != 0) goto L_0x00ce
                goto L_0x022b
            L_0x00ce:
                r3 = 0
                r1.f189148t = r3
                ui1.b r5 = ui1.C14195b.f39649a
                r12 = 2
                r5.mo13576a(r12, r3)
                long r3 = java.lang.System.currentTimeMillis()
                r1.f189146r = r3
                android.widget.RelativeLayout r3 = r1.f189152x
                android.view.ViewParent r3 = r3.getParent()
                boolean r4 = r3 instanceof android.view.ViewGroup
                if (r4 == 0) goto L_0x00eb
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                goto L_0x00ec
            L_0x00eb:
                r3 = r0
            L_0x00ec:
                if (r3 == 0) goto L_0x00f1
                r3.requestDisallowInterceptTouchEvent(r7)
            L_0x00f1:
                java.lang.Class<cl1.o> r3 = cl1.C54991o.class
                r10 = 80
                r11 = 0
                r4 = 4
                r5 = 0
                java.lang.String r9 = "android.permission.RECORD_AUDIO"
                r8 = r1
                r14 = 2
                r12 = r4
                r4 = r13
                r13 = r5
                boolean r5 = d60.C58121a.m67274c0(r8, r9, r10, r11, r12, r13)
                if (r5 != 0) goto L_0x010c
                java.lang.String r5 = "requestEnterMicIntercom request permission"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                r4 = 0
                goto L_0x010d
            L_0x010c:
                r4 = 1
            L_0x010d:
                if (r4 != 0) goto L_0x0110
                goto L_0x0174
            L_0x0110:
                androidx.lifecycle.i0 r4 = r1.mo87696x0(r3)
                cl1.o r4 = (cl1.C54991o) r4
                int r4 = r4.f154291a1
                r5 = 524288(0x80000, float:7.34684E-40)
                boolean r4 = o40.C61926c.m72696u(r4, r5)
                if (r4 == 0) goto L_0x013f
                fj1.b r4 = r1.mo87684A0()
                androidx.lifecycle.i0 r3 = r4.mo71262a(r3)
                cl1.o r3 = (cl1.C54991o) r3
                boolean r3 = r3.f154305d3
                if (r3 != 0) goto L_0x0174
                android.view.ViewGroup r3 = r1.f166287d
                android.content.Context r3 = r3.getContext()
                r4 = 2131828050(0x7f111d52, float:1.928903E38)
                android.widget.Toast r3 = p910lj.C76701a.makeText((android.content.Context) r3, (int) r4, (int) r2)
                r3.show()
                goto L_0x0174
            L_0x013f:
                android.view.ViewGroup r3 = r1.f166287d
                android.content.Context r3 = r3.getContext()
                java.lang.String r4 = "phone"
                java.lang.Object r3 = r3.getSystemService(r4)
                java.lang.String r4 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
                gy3.C87412m.m108592e(r3, r4)
                android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
                int r4 = r3.getCallState()
                if (r14 == r4) goto L_0x0161
                int r3 = r3.getCallState()
                if (r7 != r3) goto L_0x015f
                goto L_0x0161
            L_0x015f:
                r3 = 0
                goto L_0x0162
            L_0x0161:
                r3 = 1
            L_0x0162:
                if (r3 == 0) goto L_0x0176
                android.view.ViewGroup r3 = r1.f166287d
                android.content.Context r3 = r3.getContext()
                r4 = 2131828051(0x7f111d53, float:1.9289032E38)
                android.widget.Toast r3 = p910lj.C76701a.makeText((android.content.Context) r3, (int) r4, (int) r2)
                r3.show()
            L_0x0174:
                r3 = 0
                goto L_0x0177
            L_0x0176:
                r3 = 1
            L_0x0177:
                if (r3 != 0) goto L_0x017b
                goto L_0x022b
            L_0x017b:
                rx3.g r3 = r1.f189154z
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                android.os.Vibrator r3 = (android.os.Vibrator) r3
                r4 = 50
                r3.vibrate(r4)
                wi1.d r3 = r1.mo89761c1()
                androidx.lifecycle.z r3 = r3.mo71666a()
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                r3.postValue(r4)
                a14.h0 r9 = a14.C53872d1.f151119c
                r10 = 0
                vi1.f r11 = new vi1.f
                r11.<init>(r1, r0)
                r12 = 2
                r13 = 0
                r8 = r1
                nk1.C11207i.m11072h(r8, r9, r10, r11, r12, r13)
                wi1.d r0 = r1.mo89761c1()
                r0.f190050r = r7
                long r3 = java.lang.System.currentTimeMillis()
                r0.f190047o = r3
                r0.mo90160c()
                nh1.j r1 = r0.f190043h
                android.widget.FrameLayout r1 = r1.f175462c
                android.view.ViewPropertyAnimator r1 = r1.animate()
                r3 = 0
                android.view.ViewPropertyAnimator r1 = r1.translationY(r3)
                r3 = 300(0x12c, double:1.48E-321)
                android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
                android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
                r3.<init>()
                android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r3)
                wi1.g r3 = new wi1.g
                r3.<init>(r0)
                android.view.ViewPropertyAnimator r1 = r1.setListener(r3)
                r1.start()
                nh1.j r1 = r0.f190043h
                android.widget.FrameLayout r1 = r1.f175463d
                android.view.ViewPropertyAnimator r1 = r1.animate()
                int r3 = r0.f190046n
                float r3 = (float) r3
                android.view.ViewPropertyAnimator r1 = r1.translationY(r3)
                r3 = 300(0x12c, double:1.48E-321)
                android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
                android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
                r3.<init>()
                android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r3)
                r1.start()
                rx3.g r1 = r0.f190044i
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                nj3.s0 r1 = (nj3.C76901s0) r1
                android.view.View r0 = r0.f190041f
                r3 = 49
                r1.showAtLocation(r0, r3, r2, r2)
                goto L_0x022b
            L_0x020f:
                r0 = 3
                if (r1 != 0) goto L_0x0213
                goto L_0x021a
            L_0x0213:
                int r3 = r1.intValue()
                if (r3 != r0) goto L_0x021a
                goto L_0x0223
            L_0x021a:
                if (r1 != 0) goto L_0x021d
                goto L_0x0224
            L_0x021d:
                int r0 = r1.intValue()
                if (r0 != r7) goto L_0x0224
            L_0x0223:
                r2 = 1
            L_0x0224:
                if (r2 == 0) goto L_0x022b
                vi1.a r0 = r6.f189155d
                vi1.C65750a.m77372Z0(r0)
            L_0x022b:
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r16
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vi1.C65750a.C65751a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: vi1.a$d */
    public static final class C65752d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C65750a f189156d;

        public C65752d(C65750a aVar) {
            this.f189156d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f189156d.f166287d.setVisibility(4);
        }
    }

    /* renamed from: vi1.a$f */
    public static final class C65753f extends C87413o implements C32224a<C66119d> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f189157d;

        /* renamed from: e */
        public final /* synthetic */ C65750a f189158e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65753f(ViewGroup viewGroup, C65750a aVar) {
            super(0);
            this.f189157d = viewGroup;
            this.f189158e = aVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f189157d;
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "root.context");
            return new C66119d(viewGroup, context, this.f189158e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65750a(ViewGroup viewGroup, C58124b bVar, ConstraintLayout constraintLayout, ViewGroup viewGroup2) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(constraintLayout, "bottomLayout");
        this.f189144p = constraintLayout;
        this.f189145q = viewGroup2;
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.ize);
        this.f189152x = relativeLayout;
        this.f189153y = C36568h.m40985a(new C65753f(viewGroup, this));
        this.f189154z = C36568h.m40985a(new C14875e(viewGroup));
        ((FrameLayout) viewGroup.findViewById(C0966R.C0970id.mcj)).setOnClickListener(this);
        relativeLayout.setOnClickListener(this);
        relativeLayout.setOnTouchListener(new C65751a(this));
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (!mo82893g0()) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = C75044y4.m89991c(viewGroup.getContext()) + i;
        }
        C14873b bVar2 = new C14873b(this, viewGroup, i);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145236u(viewGroup, bVar2);
        mo10792g(8);
    }

    /* renamed from: Z0 */
    public static final void m77372Z0(C65750a aVar) {
        if (aVar.f189148t > 0) {
            C14195b.f39649a.mo13576a(4, System.currentTimeMillis() - aVar.f189148t);
            aVar.f189148t = 0;
        }
        aVar.f189147s = System.currentTimeMillis();
        ViewParent parent = aVar.f189152x.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        aVar.mo89763e1();
    }

    /* renamed from: a1 */
    public static final void m77373a1(C65750a aVar) {
        aVar.getClass();
        aVar.f189148t = System.currentTimeMillis();
        C14195b.f39649a.mo13576a(3, 0);
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C32931b l = finderLiveService.mo77638l("activeMicHeartBeat");
        if (l != null) {
            l.mo58875d();
        }
        C32931b l2 = finderLiveService.mo77638l("activeMicHeartBeat");
        C59918a aVar2 = l2 instanceof C59918a ? (C59918a) l2 : null;
        if (aVar2 != null) {
            aVar2.f171025e = false;
            String str = aVar.f189150v;
            C87412m.m108594g(str, "<set-?>");
            aVar2.f171026f = str;
        }
        C32931b l3 = finderLiveService.mo77638l("activeMicHeartBeat");
        if (l3 != null) {
            l3.mo58874c(0);
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final float mo89760b1() {
        if (this.f189143A == 0.0f) {
            int[] iArr = new int[2];
            this.f189144p.getLocationOnScreen(iArr);
            this.f189143A = (float) (((C75044y4.m89990b(MMApplicationContext.getContext()).y - iArr[1]) + this.f189144p.getHeight()) * 2);
        }
        return this.f189143A;
    }

    /* renamed from: c1 */
    public final C66119d mo89761c1() {
        return (C66119d) this.f189153y.getValue();
    }

    /* renamed from: d1 */
    public final void mo89762d1(View view) {
        if (view != null) {
            view.animate().translationY(mo89760b1()).setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new C14874c(view)).start();
        }
    }

    /* renamed from: e1 */
    public final void mo89763e1() {
        Log.m105924i("FinderLiveMicIntercomBo", "hideWindow");
        mo89761c1().mo90159b();
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        boolean z = false;
        if (aVar != null) {
            aVar.mo85679W().enableMixExternalAudioFrame(false, false);
        }
        C60735a aVar2 = FinderLiveService.f159378f;
        if (aVar2 != null) {
            aVar2.mo85684b0(true);
        }
        C60735a aVar3 = FinderLiveService.f159378f;
        if (aVar3 != null) {
            aVar3.mo85699r0(false);
        }
        C32931b l = finderLiveService.mo77638l("activeMicHeartBeat");
        if (l != null) {
            l.mo58875d();
        }
        C32931b l2 = finderLiveService.mo77638l("activeMicHeartBeat");
        C59918a aVar4 = l2 instanceof C59918a ? (C59918a) l2 : null;
        if (aVar4 != null) {
            aVar4.f171025e = true;
        }
        C32931b l3 = finderLiveService.mo77638l("activeMicHeartBeat");
        if (l3 != null) {
            l3.mo58874c(0);
        }
        String str = this.f189150v;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            C11207i.m11072h(this, C53872d1.f151119c, (C53934p0) null, new C52917b(this, (C15601d<? super C52917b>) null), 2, (Object) null);
        }
    }

    /* renamed from: f1 */
    public final void mo89764f1() {
        this.f189144p.setVisibility(0);
        this.f189144p.setTranslationY(0.0f);
        ViewGroup viewGroup = this.f189145q;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.f189145q;
        if (viewGroup2 != null) {
            viewGroup2.setTranslationY(0.0f);
        }
        this.f166287d.setVisibility(8);
        this.f166287d.setTranslationY(mo89760b1());
        this.f189149u = 1;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (i == 8 && mo89761c1().f190050r) {
            mo89761c1().mo90159b();
        }
    }

    /* renamed from: g1 */
    public final void mo89765g1(View view) {
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin", "showBottomLayout", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin", "showBottomLayout", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setTranslationY(mo89760b1());
            view.animate().translationY(0.0f).setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: o0 */
    public void mo82895o0(int i, int i2, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        Log.m105924i("FinderLiveMicIntercomBo", "onRequestPermissionsResult requestCode: " + i + " businessCode: " + i2);
        if (i2 == hashCode() && i == 80) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Log.m105924i("FinderLiveMicIntercomBo", "FinderLive request permission " + i + " failed");
                C76879j.m92709C(this.f166287d.getContext(), this.f166287d.getContext().getResources().getString(C0966R.string.f361130hi2), this.f166287d.getContext().getResources().getString(C0966R.string.hif), this.f166287d.getContext().getResources().getString(C0966R.string.fyd), this.f166287d.getContext().getResources().getString(C0966R.string.f7926wf), false, new C14877g(this), C37737h.f99952d);
                return;
            }
            Log.m105924i("FinderLiveMicIntercomBo", "onRequestPermissionsResult microphone granted");
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mcj) {
            this.f189149u = 1;
            mo89765g1(this.f189144p);
            mo89765g1(this.f189145q);
            this.f166287d.animate().translationY(mo89760b1()).setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new C65752d(this)).start();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/micintercom/plugin/FinderLiveMicIntercomBottomPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        if (mo89761c1().f190050r) {
            Log.m105920e("FinderLiveMicIntercomBo", "page pause start exit mic");
            mo89763e1();
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C39981t0.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            ((C39981t0) mo87696x0(cls)).f107198j.observe(this, new C52920c(this));
            ((C39981t0) mo87696x0(cls)).f107199n.observe(this, new C65754d(this));
            ((C39981t0) mo87696x0(cls)).f107201p.observe(this, new C65755e(this));
        } else if (ordinal != 174) {
            if (ordinal == 212) {
                C14195b.f39649a.mo13576a(1, 0);
                this.f189149u = 2;
                this.f166287d.setTranslationY(mo89760b1());
                mo10792g(0);
                mo89762d1(this.f189144p);
                mo89762d1(this.f189145q);
                this.f166287d.animate().translationY(0.0f).setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
            } else if (ordinal == 218) {
                if ((bundle != null && bundle.getBoolean("isShow")) || this.f189149u == 1) {
                    mo89764f1();
                    return;
                }
                this.f189149u = 2;
                this.f166287d.setTranslationY(0.0f);
                this.f166287d.setVisibility(0);
                this.f189144p.setTranslationY(mo89760b1());
                this.f189144p.setVisibility(4);
                ViewGroup viewGroup = this.f189145q;
                if (viewGroup != null) {
                    viewGroup.setTranslationY(mo89760b1());
                }
                ViewGroup viewGroup2 = this.f189145q;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
            } else if (ordinal == 27 || ordinal == 28) {
                mo10792g(8);
            }
        } else if (mo89761c1().f190050r && C87412m.m108589b(((C39981t0) mo87696x0(cls)).f107198j.getValue(), Boolean.TRUE)) {
            C76701a.makeText(this.f166287d.getContext(), (int) C0966R.string.f360633fq3, 0).show();
            Log.m105920e("FinderLiveMicIntercomBo", "receive anchor pause start exit mic");
            mo89763e1();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo89764f1();
    }
}
