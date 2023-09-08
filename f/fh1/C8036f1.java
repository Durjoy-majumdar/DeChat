package fh1;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53922m0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import cl1.C55006x0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import f14.C58901s;
import fy3.C32227p;
import fy3.C32228q;
import gh1.C59440c;
import gh1.C8313a;
import gy3.C87412m;
import hh1.C8529e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import jh1.C60834n;
import jh1.C60838o;
import jh1.C9421t;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import te3.C64646q31;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.f1 */
public final class C8036f1 extends C8313a implements C8529e, C59440c {

    /* renamed from: j */
    public final String f26739j = "Finder.LiveMilestoneLotteryMainController";

    /* renamed from: n */
    public View f26740n;

    /* renamed from: o */
    public C60838o f26741o;

    /* renamed from: p */
    public C60834n f26742p;

    /* renamed from: q */
    public C9421t f26743q;

    /* renamed from: r */
    public C0000n0 f26744r;

    /* renamed from: s */
    public C0000n0 f26745s;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveMilestoneLotteryMainController", mo125469f = "LiveMilestoneLotteryMainController.kt", mo125470l = {118, 120}, mo125471m = "jumpLottery")
    /* renamed from: fh1.f1$a */
    public static final class C8037a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f26746d;

        /* renamed from: e */
        public final /* synthetic */ C8036f1 f26747e;

        /* renamed from: f */
        public int f26748f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8037a(C8036f1 f1Var, C15601d<? super C8037a> dVar) {
            super(dVar);
            this.f26747e = f1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f26746d = obj;
            this.f26748f |= Integer.MIN_VALUE;
            return this.f26747e.mo9123n3((String) null, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveMilestoneLotteryMainController$jumpVote$1$1", mo125469f = "LiveMilestoneLotteryMainController.kt", mo125470l = {157}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.f1$b */
    public static final class C8038b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f26749d;

        /* renamed from: e */
        public final /* synthetic */ C8036f1 f26750e;

        /* renamed from: f */
        public final /* synthetic */ String f26751f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8038b(C8036f1 f1Var, String str, C15601d<? super C8038b> dVar) {
            super(2, dVar);
            this.f26750e = f1Var;
            this.f26751f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8038b(this.f26750e, this.f26751f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8038b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f26749d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8036f1 f1Var = this.f26750e;
                C60834n nVar = f1Var.f26742p;
                if (nVar != null) {
                    nVar.f173304d = null;
                }
                C9421t tVar = f1Var.f26743q;
                if (tVar != null) {
                    String str = this.f26751f;
                    this.f26749d = 1;
                    if (tVar.mo10140c(str, true, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fh1.f1$c */
    public static final class C8039c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8036f1 f26752d;

        public C8039c(C8036f1 f1Var) {
            this.f26752d = f1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController$showMainPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f26752d.mo9122m3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController$showMainPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fh1.f1$d */
    public static final class C8040d implements View.OnClickListener {

        /* renamed from: d */
        public static final C8040d f26753d = new C8040d();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController$showMainPage$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController$showMainPage$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveMilestoneLotteryMainController$showMainPage$3$3", mo125469f = "LiveMilestoneLotteryMainController.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.f1$e */
    public static final class C8041e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f26754d;

        /* renamed from: e */
        public final /* synthetic */ C8036f1 f26755e;

        /* renamed from: fh1.f1$e$a */
        public static final class C8042a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C8036f1 f26756d;

            public C8042a(C8036f1 f1Var) {
                this.f26756d = f1Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                C60838o oVar;
                C64646q31 q312 = (C64646q31) obj;
                Log.m105924i(this.f26756d.f26739j, "updateMetaInfo");
                if (!(q312 == null || (oVar = this.f26756d.f26741o) == null)) {
                    oVar.mo85756d(q312);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8041e(C8036f1 f1Var, C15601d<? super C8041e> dVar) {
            super(2, dVar);
            this.f26755e = f1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8041e(this.f26755e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C8041e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f26754d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<C64646q31> u0Var = ((C55006x0) this.f26755e.business(C55006x0.class)).f154452g;
                C8042a aVar2 = new C8042a(this.f26755e);
                this.f26754d = 1;
                if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveMilestoneLotteryMainController$showMainPage$3$4", mo125469f = "LiveMilestoneLotteryMainController.kt", mo125470l = {82}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.f1$f */
    public static final class C8043f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f26757d;

        /* renamed from: e */
        public final /* synthetic */ C8036f1 f26758e;

        /* renamed from: f */
        public final /* synthetic */ String f26759f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8043f(C8036f1 f1Var, String str, C15601d<? super C8043f> dVar) {
            super(2, dVar);
            this.f26758e = f1Var;
            this.f26759f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8043f(this.f26758e, this.f26759f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8043f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f26757d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8036f1 f1Var = this.f26758e;
                String str = this.f26759f;
                this.f26757d = 1;
                if (f1Var.mo9123n3(str, false, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8036f1(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: F3 */
    public final void mo9119F3(View view, View view2, boolean z) {
        C87412m.m108594g(view, "beforePage");
        C87412m.m108594g(view2, "afterPage");
        Log.m105924i(this.f26739j, "pageAnimate");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float b = (float) C76577a.m92151b(view2.getContext(), 334);
        view.animate().cancel();
        view2.animate().cancel();
        if (z) {
            view.setTranslationX(0.0f);
            view.animate().translationX(0.0f - b).setDuration(300).start();
            view2.setTranslationX(b);
            view2.animate().translationX(0.0f).setDuration(300).start();
            return;
        }
        view.setTranslationX(0.0f);
        view.animate().translationX(b).setDuration(300).start();
        view2.setTranslationX(0.0f - b);
        view2.animate().translationX(0.0f).setDuration(300).start();
    }

    /* renamed from: G3 */
    public final void mo9120G3(String str) {
        C13598b0 b0Var;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator animate3;
        String str2 = str;
        Log.m105924i(this.f26739j, "showMainPage");
        C64646q31 q312 = (C64646q31) ((C58052j1) ((C55006x0) business(C55006x0.class)).f154452g).getValue();
        if (q312 == null) {
            Log.m105924i(this.f26739j, "showMainPage but metaInfo null");
            return;
        }
        C0000n0 n0Var = this.f26745s;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        boolean z = true;
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        this.f26745s = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a).plus(new C53922m0("lotteryPageScope")));
        ViewGroup viewGroup = (ViewGroup) mo9308e3(C0966R.C0970id.odd);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(0);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d_f, viewGroup, false);
            this.f26740n = inflate;
            viewGroup.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e(this.f26739j, "cannot find finder_live_milestone_main_container");
            this.f26740n = null;
        }
        View view = this.f26740n;
        if (view != null) {
            view.setOnClickListener(new C8039c(this));
            view.findViewById(C0966R.C0970id.obm).setOnClickListener(C8040d.f26753d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f26741o = new C60838o(view, this);
            Log.m105924i(this.f26739j, "resetPage");
            View view3 = this.f26740n;
            View findViewById = view3 != null ? view3.findViewById(C0966R.C0970id.f358703oh1) : null;
            View view4 = this.f26740n;
            View findViewById2 = view4 != null ? view4.findViewById(C0966R.C0970id.ogb) : null;
            View view5 = this.f26740n;
            View findViewById3 = view5 != null ? view5.findViewById(C0966R.C0970id.oji) : null;
            if (findViewById != null) {
                findViewById.setTranslationX(0.0f);
            }
            if (!(findViewById == null || (animate3 = findViewById.animate()) == null)) {
                animate3.cancel();
            }
            if (findViewById2 != null) {
                findViewById2.setTranslationX(0.0f);
            }
            if (!(findViewById2 == null || (animate2 = findViewById2.animate()) == null)) {
                animate2.cancel();
            }
            if (findViewById3 != null) {
                findViewById3.setTranslationX(0.0f);
            }
            if (!(findViewById3 == null || (animate = findViewById3.animate()) == null)) {
                animate.cancel();
            }
            C60838o oVar = this.f26741o;
            if (oVar != null) {
                oVar.mo85754b(q312, true, false);
            }
            C0000n0 n0Var2 = this.f26745s;
            if (n0Var2 != null) {
                C53895h.m60466d(n0Var2, (C66212f) null, (C53934p0) null, new C8041e(this, (C15601d<? super C8041e>) null), 3, (Object) null);
            }
            if (!(str2 == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                View view6 = this.f26740n;
                View findViewById4 = view6 != null ? view6.findViewById(C0966R.C0970id.f358703oh1) : null;
                if (findViewById4 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view7 = findViewById4;
                    C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C0000n0 n0Var3 = this.f26745s;
                if (n0Var3 != null) {
                    C53895h.m60466d(n0Var3, (C66212f) null, (C53934p0) null, new C8043f(this, str2, (C15601d<? super C8043f>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo9121e() {
        Log.m105924i(this.f26739j, "onBackPress");
        View view = this.f26740n;
        if (!(view != null && view.getVisibility() == 0)) {
            return false;
        }
        mo9122m3();
        return true;
    }

    /* renamed from: m3 */
    public final void mo9122m3() {
        Log.m105924i(this.f26739j, "hideMainPage");
        ViewGroup viewGroup = (ViewGroup) mo9308e3(C0966R.C0970id.odd);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        View view = this.f26740n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "hideMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "hideMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f26740n = null;
        C60834n nVar = this.f26742p;
        if (nVar != null) {
            nVar.f173304d = null;
        }
        C9421t tVar = this.f26743q;
        if (tVar != null) {
            tVar.f29397i = null;
        }
        this.f26741o = null;
        this.f26742p = null;
        this.f26743q = null;
        C0000n0 n0Var = this.f26745s;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f26745s = null;
        C0000n0 n0Var2 = this.f26744r;
        if (n0Var2 != null) {
            C53930o0.m60556c(n0Var2, (CancellationException) null);
        }
        this.f26744r = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9123n3(java.lang.String r8, boolean r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof fh1.C8036f1.C8037a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            fh1.f1$a r0 = (fh1.C8036f1.C8037a) r0
            int r1 = r0.f26748f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26748f = r1
            goto L_0x0018
        L_0x0013:
            fh1.f1$a r0 = new fh1.f1$a
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f26746d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f26748f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 == r4) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b8
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r7.f26739j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "jumpLottery lottery id:"
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r10 = 0
            if (r8 == 0) goto L_0x0059
            int r2 = r8.length()
            if (r2 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = 0
            goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            if (r2 == 0) goto L_0x0066
            java.lang.String r8 = r7.f26739j
            java.lang.String r9 = "jumpLottery lottery_id empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        L_0x0066:
            a14.n0 r2 = r7.f26744r
            r5 = 0
            if (r2 == 0) goto L_0x006e
            a14.C53930o0.m60556c(r2, r5)
        L_0x006e:
            a14.w r2 = a14.C53959v2.m60598a(r5, r4, r5)
            a14.h0 r5 = a14.C53872d1.f151117a
            a14.k2 r5 = f14.C58901s.f168555a
            a14.f2 r2 = (a14.C53884f2) r2
            wx3.f r2 = r2.plus(r5)
            a14.m0 r5 = new a14.m0
            java.lang.String r6 = "lotteryPageScope"
            r5.<init>(r6)
            wx3.f r2 = r2.plus(r5)
            a14.n0 r2 = a14.C53930o0.m60554a(r2)
            r7.f26744r = r2
            android.view.View r2 = r7.f26740n
            if (r2 == 0) goto L_0x00b8
            jh1.n r5 = r7.f26742p
            if (r5 != 0) goto L_0x009c
            jh1.n r5 = new jh1.n
            r5.<init>(r2, r7)
            r7.f26742p = r5
        L_0x009c:
            if (r9 == 0) goto L_0x00ab
            jh1.n r9 = r7.f26742p
            if (r9 == 0) goto L_0x00b8
            r0.f26748f = r4
            java.lang.Object r8 = r9.mo85749e(r8, r4, r10, r0)
            if (r8 != r1) goto L_0x00b8
            return r1
        L_0x00ab:
            jh1.n r9 = r7.f26742p
            if (r9 == 0) goto L_0x00b8
            r0.f26748f = r3
            java.lang.Object r8 = r9.mo85749e(r8, r10, r10, r0)
            if (r8 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C8036f1.mo9123n3(java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: o3 */
    public final void mo9124o3(String str) {
        String str2 = this.f26739j;
        Log.m105924i(str2, "jumpVote " + str);
        View view = this.f26740n;
        if (view != null) {
            if (this.f26743q == null) {
                this.f26743q = new C9421t(view, this);
            }
            C0000n0 n0Var = this.f26744r;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C8038b(this, str, (C15601d<? super C8038b>) null), 3, (Object) null);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onLiveActivate() {
    }

    public void onNewIntent(Intent intent) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C59440c.C8315a.m8366a(this, i, strArr, iArr);
    }

    public boolean onSwipeBack() {
        return false;
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        Log.m105924i(this.f26739j, "onViewUnmount");
        this.f27265i = null;
        mo9122m3();
    }

    /* renamed from: p2 */
    public void mo9129p2(C55006x0.C0697b bVar, boolean z, boolean z2, boolean z3) {
        C32228q<? super C55006x0.C0697b, ? super Boolean, ? super Boolean, C13598b0> qVar;
        C32228q<? super C55006x0.C0697b, ? super Boolean, ? super Boolean, C13598b0> qVar2;
        C87412m.m108594g(bVar, "data");
        C60834n nVar = this.f26742p;
        if (!(nVar == null || (qVar2 = nVar.f173304d) == null)) {
            qVar2.invoke(bVar, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        C9421t tVar = this.f26743q;
        if (tVar != null && (qVar = tVar.f29397i) != null) {
            qVar.invoke(bVar, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    public void resume() {
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
    }
}
