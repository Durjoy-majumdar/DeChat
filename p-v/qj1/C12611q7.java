package qj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53916l;
import a14.C53921m;
import a14.C53934p0;
import a14.C53973z1;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.camera.core.FocusMeteringAction;
import cl1.C39975j;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import k20.C60958c;
import k20.C9556a;
import kotlin.Result;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import p277yf.C15996c;
import ql1.C12874a;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C51769w11;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.q7 */
public final class C12611q7 extends C62660c {

    /* renamed from: p */
    public final C58124b f36151p;

    /* renamed from: q */
    public final PAGView f36152q;

    /* renamed from: r */
    public final View f36153r;

    /* renamed from: s */
    public ViewPropertyAnimator f36154s;

    /* renamed from: t */
    public String f36155t;

    /* renamed from: u */
    public C53973z1 f36156u;

    /* renamed from: v */
    public final ConcurrentLinkedQueue<C51769w11> f36157v = new ConcurrentLinkedQueue<>();

    /* renamed from: w */
    public final MTimerHandler f36158w = new MTimerHandler("Finder.FinderLiveGiftPlayPlugin", (MTimerHandler.CallBack) new C12614c(this), true);

    /* renamed from: qj1.q7$a */
    public static final class C12612a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C12611q7 f36159d;

        public C12612a(C12611q7 q7Var) {
            this.f36159d = q7Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                C12611q7 q7Var = this.f36159d;
                q7Var.f36152q.setAlpha(0.0f);
                q7Var.f36152q.setClickable(false);
                View view2 = q7Var.f36153r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = q7Var.f36153r;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ViewPropertyAnimator viewPropertyAnimator = q7Var.f36154s;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, Boolean.TRUE);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: qj1.q7$b */
    public static final class C12613b extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C12611q7 f36160d;

        public C12613b(C12611q7 q7Var) {
            this.f36160d = q7Var;
        }

        public void onAnimationCancel(PAGView pAGView) {
            Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "onAnimationCancel");
        }

        public void onAnimationEnd(PAGView pAGView) {
            Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "onAnimationEnd");
        }

        public void onAnimationRepeat(PAGView pAGView) {
            Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "onAnimationRepeat");
        }

        public void onAnimationStart(PAGView pAGView) {
            Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "onAnimationStart");
            this.f36160d.f36152q.setVisibility(0);
        }
    }

    /* renamed from: qj1.q7$c */
    public static final class C12614c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C12611q7 f36161d;

        /* renamed from: qj1.q7$c$a */
        public static final class C12615a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12611q7 f36162d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12615a(C12611q7 q7Var) {
                super(0);
                this.f36162d = q7Var;
            }

            public Object invoke() {
                Log.m105924i("Finder.FinderLiveGiftPlayPlugin", this.f36162d.f36155t + " gift animation repeat");
                this.f36162d.f36152q.setAlpha(1.0f);
                this.f36162d.f36152q.setClickable(true);
                return C13598b0.f38549a;
            }
        }

        public C12614c(C12611q7 q7Var) {
            this.f36161d = q7Var;
        }

        public final boolean onTimerExpired() {
            C61926c.m72668M(new C12615a(this.f36161d));
            return true;
        }
    }

    /* renamed from: qj1.q7$d */
    public static final class C12616d extends C87413o implements C32226l<C51769w11, CharSequence> {

        /* renamed from: d */
        public static final C12616d f36163d = new C12616d();

        public C12616d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C51769w11 w112 = (C51769w11) obj;
            C87412m.m108594g(w112, LocaleUtil.ITALIAN);
            StringBuilder sb = new StringBuilder();
            String str = w112.f143810d;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(',');
            return sb.toString();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveGiftPlayPlugin$playRandomGiftAnimation$2", mo125469f = "FinderLiveGiftPlayPlugin.kt", mo125470l = {215}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.q7$e */
    public static final class C12617e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f36164d;

        /* renamed from: e */
        public /* synthetic */ Object f36165e;

        /* renamed from: f */
        public final /* synthetic */ C12611q7 f36166f;

        /* renamed from: g */
        public final /* synthetic */ C8916d f36167g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveGiftPlayPlugin$playRandomGiftAnimation$2$1", mo125469f = "FinderLiveGiftPlayPlugin.kt", mo125470l = {417}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.q7$e$a */
        public static final class C12618a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f36168d;

            /* renamed from: e */
            public Object f36169e;

            /* renamed from: f */
            public int f36170f;

            /* renamed from: g */
            public final /* synthetic */ C12611q7 f36171g;

            /* renamed from: h */
            public final /* synthetic */ String f36172h;

            /* renamed from: qj1.q7$e$a$a */
            public static final class C12619a extends SimplePAGViewUpdateListener {

                /* renamed from: d */
                public final /* synthetic */ C8477a0 f36173d;

                /* renamed from: e */
                public final /* synthetic */ C12611q7 f36174e;

                /* renamed from: f */
                public final /* synthetic */ C53916l<C13598b0> f36175f;

                public C12619a(C8477a0 a0Var, C12611q7 q7Var, C53916l<? super C13598b0> lVar) {
                    this.f36173d = a0Var;
                    this.f36174e = q7Var;
                    this.f36175f = lVar;
                }

                public void onAnimationCancel(PAGView pAGView) {
                    Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, onAnimationCancel");
                    C8477a0 a0Var = this.f36173d;
                    if (!a0Var.f27482d) {
                        a0Var.f27482d = true;
                        this.f36174e.f36152q.removeListener(this);
                        C53916l<C13598b0> lVar = this.f36175f;
                        Result.Companion companion = Result.Companion;
                        lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                    }
                }

                public void onAnimationEnd(PAGView pAGView) {
                    Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, onAnimationEnd");
                    C8477a0 a0Var = this.f36173d;
                    if (!a0Var.f27482d) {
                        a0Var.f27482d = true;
                        this.f36174e.f36152q.removeListener(this);
                        C53916l<C13598b0> lVar = this.f36175f;
                        Result.Companion companion = Result.Companion;
                        lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                    }
                }

                public void onAnimationRepeat(PAGView pAGView) {
                }

                public void onAnimationStart(PAGView pAGView) {
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12618a(C12611q7 q7Var, String str, C15601d<? super C12618a> dVar) {
                super(2, dVar);
                this.f36171g = q7Var;
                this.f36172h = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12618a(this.f36171g, this.f36172h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12618a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f36170f;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C12611q7.m12130Z0(this.f36171g);
                    Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "playGiftAnimation launch timer by " + (this.f36171g.f36152q.duration() / 1000));
                    this.f36171g.f36152q.setVisibility(0);
                    C12611q7 q7Var = this.f36171g;
                    String str = this.f36172h;
                    this.f36168d = q7Var;
                    this.f36169e = str;
                    this.f36170f = 1;
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    q7Var.f36152q.addListener(new C12619a(new C8477a0(), q7Var, mVar));
                    Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, playOnce!");
                    C15996c a = C12874a.f36849a.mo12389a();
                    if (str == null) {
                        str = "";
                    }
                    C15996c.C15997a.m14902b(a, str, q7Var.f36152q, (String) null, 4, (Object) null);
                    if (mVar.mo74608o() == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    String str2 = (String) this.f36169e;
                    C12611q7 q7Var2 = (C12611q7) this.f36168d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f36171g.f36152q.setVisibility(8);
                Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, playOnce end!");
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12617e(C12611q7 q7Var, C8916d dVar, C15601d<? super C12617e> dVar2) {
            super(2, dVar2);
            this.f36166f = q7Var;
            this.f36167g = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C12617e eVar = new C12617e(this.f36166f, this.f36167g, dVar);
            eVar.f36165e = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12617e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ca A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0022 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r10.f36164d
                r2 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                java.lang.Object r1 = r10.f36165e
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0021
            L_0x0011:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.f36165e
                a14.n0 r11 = (a14.C0000n0) r11
                r1 = r11
            L_0x0021:
                r11 = r10
            L_0x0022:
                qj1.q7 r3 = r11.f36166f
                java.util.concurrent.ConcurrentLinkedQueue<te3.w11> r3 = r3.f36157v
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r2
                if (r3 == 0) goto L_0x00cb
                boolean r3 = a14.C53930o0.m60560g(r1)
                if (r3 == 0) goto L_0x00cb
                qj1.q7 r3 = r11.f36166f
                java.util.concurrent.ConcurrentLinkedQueue<te3.w11> r3 = r3.f36157v
                java.lang.Object r3 = r3.poll()
                te3.w11 r3 = (te3.C51769w11) r3
                if (r3 != 0) goto L_0x0041
                goto L_0x00cb
            L_0x0041:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "start random gift animation, animation_id:"
                r4.append(r5)
                java.lang.String r5 = r3.f143810d
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "Finder.FinderLiveGiftPlayPlugin"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                ig1.d r4 = r11.f36167g
                te3.x03 r4 = r4.field_multiAnimationList
                r6 = 0
                if (r4 == 0) goto L_0x0085
                java.util.LinkedList<te3.w03> r4 = r4.f144381d
                if (r4 == 0) goto L_0x0085
                java.util.Iterator r4 = r4.iterator()
            L_0x0069:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x0081
                java.lang.Object r7 = r4.next()
                r8 = r7
                te3.w03 r8 = (te3.C51765w03) r8
                java.lang.String r8 = r8.f143798d
                java.lang.String r9 = r3.f143810d
                boolean r8 = gy3.C87412m.m108589b(r8, r9)
                if (r8 == 0) goto L_0x0069
                goto L_0x0082
            L_0x0081:
                r7 = r6
            L_0x0082:
                te3.w03 r7 = (te3.C51765w03) r7
                goto L_0x0086
            L_0x0085:
                r7 = r6
            L_0x0086:
                if (r7 != 0) goto L_0x008f
                java.lang.String r3 = "start random gift animation, multiAnimation null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                goto L_0x0022
            L_0x008f:
                qj1.q7 r3 = r11.f36166f
                boolean r3 = r3.mo82893g0()
                if (r3 == 0) goto L_0x009e
                te3.du3 r3 = r7.f143800f
                if (r3 == 0) goto L_0x00a5
                java.lang.String r3 = r3.f132536d
                goto L_0x00a6
            L_0x009e:
                te3.du3 r3 = r7.f143799e
                if (r3 == 0) goto L_0x00a5
                java.lang.String r3 = r3.f132536d
                goto L_0x00a6
            L_0x00a5:
                r3 = r6
            L_0x00a6:
                qj1.q7 r4 = r11.f36166f
                org.libpag.PAGView r4 = r4.f36152q
                r5 = 3
                r4.setScaleMode(r5)
                qj1.q7 r4 = r11.f36166f
                org.libpag.PAGView r4 = r4.f36152q
                r4.setRepeatCount(r2)
                a14.h0 r4 = a14.C53872d1.f151117a
                a14.k2 r4 = f14.C58901s.f168555a
                qj1.q7$e$a r5 = new qj1.q7$e$a
                qj1.q7 r7 = r11.f36166f
                r5.<init>(r7, r3, r6)
                r11.f36165e = r1
                r11.f36164d = r2
                java.lang.Object r3 = a14.C53895h.m60469g(r4, r5, r11)
                if (r3 != r0) goto L_0x0022
                return r0
            L_0x00cb:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12611q7.C12617e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qj1.q7$f */
    public static final class C12620f extends C87413o implements C32226l<C51769w11, CharSequence> {

        /* renamed from: d */
        public static final C12620f f36176d = new C12620f();

        public C12620f() {
            super(1);
        }

        public Object invoke(Object obj) {
            return ((C51769w11) obj).f143810d + ',';
        }
    }

    /* renamed from: qj1.q7$g */
    public static final class C12621g extends C87413o implements C32226l<C51769w11, CharSequence> {

        /* renamed from: d */
        public static final C12621g f36177d = new C12621g();

        public C12621g() {
            super(1);
        }

        public Object invoke(Object obj) {
            return ((C51769w11) obj).f143810d + ',';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12611q7(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36151p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358148dn0);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_gift_play_view)");
        PAGView pAGView = (PAGView) findViewById;
        this.f36152q = pAGView;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dmb);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…live_gift_hide_tip_group)");
        this.f36153r = findViewById2;
        findViewById2.getLayoutParams().height = ((int) (((float) C75044y4.m89990b(viewGroup.getContext()).y) * 0.16f)) + C75044y4.m89991c(viewGroup.getContext());
        findViewById2.setPadding(0, 0, 0, C74942w4.m89784a(viewGroup.getContext(), 48) + C75044y4.m89991c(viewGroup.getContext()));
        if (!C62042e.f176370a.mo87027N0()) {
            pAGView.setOnTouchListener(new C12612a(this));
        } else {
            pAGView.setOnClickListener((View.OnClickListener) null);
            pAGView.setClickable(false);
        }
        pAGView.addListener(new C12613b(this));
    }

    /* renamed from: Z0 */
    public static final void m12130Z0(C12611q7 q7Var) {
        q7Var.getClass();
        if (!C62042e.f176370a.mo87027N0()) {
            long duration = q7Var.f36152q.duration() / 1000;
            MTimerHandler mTimerHandler = q7Var.f36158w;
            if (duration <= 0) {
                duration = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
            }
            mTimerHandler.startTimer(duration);
            boolean z = !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, false);
            if (z) {
                C61926c.m72666K(1000, new C12672t7(q7Var));
            }
            Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "tryShowHideTip showGiftTip:" + z);
        }
    }

    /* renamed from: a1 */
    public final void mo12210a1(LinkedList<C51769w11> linkedList, C8916d dVar) {
        Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, randomGifts:" + C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C12616d.f36163d, 31, (Object) null));
        this.f36157v.addAll(linkedList);
        this.f36156u = C11207i.m11072h(this, C53872d1.f151119c, (C53934p0) null, new C12617e(this, dVar, (C15601d<? super C12617e>) null), 2, (Object) null);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C39975j) mo87696x0(C39975j.class)).mo62578e3()) {
            super.mo10792g(8);
        } else {
            super.mo10792g(i);
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

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0213  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r27
            java.lang.String r0 = "status"
            r3 = r26
            gy3.C87412m.m108594g(r3, r0)
            int r0 = r26.ordinal()
            r3 = 1
            r4 = 0
            r5 = 218(0xda, float:3.05E-43)
            r6 = 8
            if (r0 == r5) goto L_0x03e4
            java.lang.String r5 = "PARAM_LIVE_GIFT_INFO"
            java.lang.String r7 = "safeParser"
            java.lang.String r8 = "PARAM_LIVE_GIFT_RANDOM_ITEM"
            java.lang.String r9 = ", "
            java.lang.String r10 = ""
            java.lang.String r11 = "Finder.FinderLiveGiftPlayPlugin"
            r12 = 0
            switch(r0) {
                case 71: goto L_0x01b8;
                case 72: goto L_0x010f;
                case 73: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x03f9
        L_0x002b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "hide full screen gift, id:"
            r0.append(r2)
            java.lang.String r2 = r1.f36155t
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r1.mo10792g(r6)
            a14.z1 r0 = r1.f36156u
            if (r0 == 0) goto L_0x004b
            a14.C53973z1.C53974a.m60623a(r0, r12, r3, r12)
        L_0x004b:
            org.libpag.PAGView r0 = r1.f36152q
            r0.setVisibility(r6)
            org.libpag.PAGView r0 = r1.f36152q
            r0.stop()
            org.libpag.PAGView r0 = r1.f36152q
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r2)
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87027N0()
            if (r0 != 0) goto L_0x0069
            org.libpag.PAGView r0 = r1.f36152q
            r0.setClickable(r3)
        L_0x0069:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r1.f36158w
            r0.stopTimer()
            android.view.View r0 = r1.f36153r
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r5)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin"
            java.lang.String r10 = "hideGift"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin"
            java.lang.String r9 = "hideGift"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r0 = r1.f36153r
            r2 = 0
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r5.mo10233c(r2)
            java.lang.Object[] r15 = r5.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin"
            java.lang.String r17 = "hideGift"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r5.mo10231a(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0.setAlpha(r2)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin"
            java.lang.String r16 = "hideGift"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setAlpha"
            java.lang.String r20 = "(F)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.ViewPropertyAnimator r0 = r1.f36154s
            if (r0 == 0) goto L_0x00f8
            r0.cancel()
        L_0x00f8:
            c50.b r0 = c50.C54655b.f153178f1
            if (r0 == 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r3 = 0
        L_0x00fe:
            if (r3 == 0) goto L_0x03f9
            java.lang.Class<fh1.p> r0 = fh1.C8070p.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r1.mo87685B0(r0)
            fh1.p r0 = (fh1.C8070p) r0
            if (r0 == 0) goto L_0x03f9
            r0.mo9156G3()
            goto L_0x03f9
        L_0x010f:
            te3.v11 r0 = new te3.v11
            r0.<init>()
            if (r2 == 0) goto L_0x011b
            byte[] r6 = r2.getByteArray(r8)
            goto L_0x011c
        L_0x011b:
            r6 = r12
        L_0x011c:
            if (r6 != 0) goto L_0x011f
            goto L_0x012c
        L_0x011f:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0123 }
            goto L_0x012d
        L_0x0123:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r10, r0)
        L_0x012c:
            r0 = r12
        L_0x012d:
            if (r2 == 0) goto L_0x0137
            java.lang.String r2 = r2.getString(r5)
            if (r2 != 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r10 = r2
        L_0x0137:
            if (r0 == 0) goto L_0x013c
            java.util.LinkedList<te3.w11> r2 = r0.f143244e
            goto L_0x013d
        L_0x013c:
            r2 = r12
        L_0x013d:
            cj1.y1 r5 = cj1.C0639y1.f1510a
            ig1.d r5 = r5.mo612d(r10)
            if (r2 == 0) goto L_0x014e
            boolean r6 = r2.isEmpty()
            r6 = r6 ^ r3
            if (r6 != r3) goto L_0x014e
            r6 = 1
            goto L_0x014f
        L_0x014e:
            r6 = 0
        L_0x014f:
            if (r6 == 0) goto L_0x03f9
            if (r5 == 0) goto L_0x03f9
            a14.z1 r6 = r1.f36156u
            if (r6 == 0) goto L_0x0160
            a14.a r6 = (a14.C53851a) r6
            boolean r6 = r6.mo74466a()
            if (r6 != r3) goto L_0x0160
            r4 = 1
        L_0x0160:
            if (r4 == 0) goto L_0x01a7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "append random gift, "
            r3.append(r4)
            java.util.LinkedList<te3.w11> r4 = r0.f143244e
            if (r4 == 0) goto L_0x0179
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x017a
        L_0x0179:
            r4 = r12
        L_0x017a:
            r3.append(r4)
            r3.append(r9)
            java.util.LinkedList<te3.w11> r13 = r0.f143244e
            if (r13 == 0) goto L_0x0196
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            qj1.q7$g r19 = qj1.C12611q7.C12621g.f36177d
            r20 = 31
            r21 = 0
            java.lang.String r12 = sx3.C110818d0.m150921S(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0196:
            r3.append(r12)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.util.concurrent.ConcurrentLinkedQueue<te3.w11> r0 = r1.f36157v
            r0.addAll(r2)
            goto L_0x03f9
        L_0x01a7:
            a14.z1 r0 = r1.f36156u
            if (r0 == 0) goto L_0x01ae
            a14.C53973z1.C53974a.m60623a(r0, r12, r3, r12)
        L_0x01ae:
            java.lang.String r0 = "append random gift, restart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r1.mo12210a1(r2, r5)
            goto L_0x03f9
        L_0x01b8:
            if (r2 == 0) goto L_0x01c2
            java.lang.String r0 = "PARAM_LIVE_GIFT_GESTURE_ID"
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x01c3
        L_0x01c2:
            r6 = 0
        L_0x01c3:
            if (r2 == 0) goto L_0x01d0
            java.lang.String r0 = "PARAM_LIVE_GIFT_COMBO_ID"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x01ce
            goto L_0x01d0
        L_0x01ce:
            r13 = r0
            goto L_0x01d1
        L_0x01d0:
            r13 = r10
        L_0x01d1:
            if (r2 == 0) goto L_0x01db
            java.lang.String r0 = "PARAM_LIVE_GIFT_IS_FROM_SELF"
            boolean r0 = r2.getBoolean(r0, r4)
            r14 = r0
            goto L_0x01dc
        L_0x01db:
            r14 = 0
        L_0x01dc:
            if (r2 == 0) goto L_0x01e7
            java.lang.String r0 = r2.getString(r5)
            if (r0 != 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r5 = r0
            goto L_0x01e8
        L_0x01e7:
            r5 = r10
        L_0x01e8:
            if (r2 == 0) goto L_0x01f2
            java.lang.String r0 = "PARAM_LIVE_GIFT_IS_FORCE_REPLACE"
            boolean r0 = r2.getBoolean(r0, r4)
            r15 = r0
            goto L_0x01f3
        L_0x01f2:
            r15 = 0
        L_0x01f3:
            te3.v11 r0 = new te3.v11
            r0.<init>()
            if (r2 == 0) goto L_0x01ff
            byte[] r2 = r2.getByteArray(r8)
            goto L_0x0200
        L_0x01ff:
            r2 = r12
        L_0x0200:
            if (r2 != 0) goto L_0x0203
            goto L_0x0210
        L_0x0203:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0207 }
            goto L_0x0211
        L_0x0207:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r10, r0)
        L_0x0210:
            r0 = r12
        L_0x0211:
            if (r0 == 0) goto L_0x0258
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "show random gift, "
            r2.append(r7)
            java.util.LinkedList<te3.w11> r7 = r0.f143244e
            if (r7 == 0) goto L_0x022b
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x022c
        L_0x022b:
            r7 = r12
        L_0x022c:
            r2.append(r7)
            r2.append(r9)
            java.util.LinkedList<te3.w11> r7 = r0.f143244e
            if (r7 == 0) goto L_0x024d
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            qj1.q7$f r22 = qj1.C12611q7.C12620f.f36176d
            r23 = 31
            r24 = 0
            r16 = r7
            java.lang.String r7 = sx3.C110818d0.m150921S(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x024e
        L_0x024d:
            r7 = r12
        L_0x024e:
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
        L_0x0258:
            cj1.y1 r2 = cj1.C0639y1.f1510a
            ig1.d r7 = r2.mo612d(r5)
            if (r7 == 0) goto L_0x0268
            boolean r8 = r7.mo9724o2()
            if (r8 != r3) goto L_0x0268
            r8 = 1
            goto L_0x0269
        L_0x0268:
            r8 = 0
        L_0x0269:
            if (r7 == 0) goto L_0x03c6
            if (r8 != 0) goto L_0x0275
            java.lang.String r10 = r7.field_animationPagUrl
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x03c6
        L_0x0275:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "show full screen gift,id:"
            r10.append(r12)
            r10.append(r5)
            java.lang.String r12 = ", isRandomGift:"
            r10.append(r12)
            r10.append(r8)
            java.lang.String r8 = ", info:"
            r10.append(r8)
            r10.append(r7)
            java.lang.String r7 = ",isForceReplace:"
            r10.append(r7)
            r10.append(r15)
            java.lang.String r7 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            r1.f36155t = r5
            r1.mo10792g(r4)
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r1.mo87696x0(r5)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154391y3
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r7 = r7.mo87027N0()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "playGiftAnimation playViewIsPlaying:"
            r8.append(r10)
            org.libpag.PAGView r10 = r1.f36152q
            boolean r10 = r10.isPlaying()
            r8.append(r10)
            java.lang.String r10 = ", randomItem:"
            r8.append(r10)
            if (r0 == 0) goto L_0x02de
            java.util.LinkedList<te3.w11> r10 = r0.f143244e
            if (r10 == 0) goto L_0x02de
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x02df
        L_0x02de:
            r10 = 0
        L_0x02df:
            r8.append(r10)
            java.lang.String r10 = ", isForceReplace:"
            r8.append(r10)
            r8.append(r15)
            java.lang.String r10 = ", isLandscape:"
            r8.append(r10)
            boolean r10 = r25.mo82893g0()
            r8.append(r10)
            java.lang.String r10 = ", effectOff:"
            r8.append(r10)
            r8.append(r5)
            java.lang.String r10 = ", isAnchor:"
            r8.append(r10)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)
            org.libpag.PAGView r8 = r1.f36152q
            boolean r8 = r8.isPlaying()
            if (r8 == 0) goto L_0x0319
            if (r15 != 0) goto L_0x0319
            goto L_0x03f9
        L_0x0319:
            if (r7 != 0) goto L_0x0321
            if (r5 == 0) goto L_0x0321
            if (r14 != 0) goto L_0x0321
            goto L_0x03f9
        L_0x0321:
            java.lang.String r5 = r1.f36155t
            ig1.d r5 = r2.mo612d(r5)
            if (r5 != 0) goto L_0x0341
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "playGiftAnimation: giftInfo is null for id:"
            r0.append(r2)
            java.lang.String r2 = r1.f36155t
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x03f9
        L_0x0341:
            boolean r7 = r5.mo9724o2()
            if (r7 != 0) goto L_0x036d
            boolean r8 = r25.mo82893g0()
            if (r8 == 0) goto L_0x036d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "playGiftAnimation: isLandscape and gift not ready, isLandscapeGift: "
            r0.append(r2)
            java.lang.String r2 = r5.field_landscapePagUrl
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r2 = r2 ^ r3
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x03f9
        L_0x036d:
            qj1.r7 r8 = new qj1.r7
            r8.<init>(r1, r6, r13)
            o40.C61926c.m72668M(r8)
            if (r7 == 0) goto L_0x038e
            if (r0 == 0) goto L_0x037c
            java.util.LinkedList<te3.w11> r12 = r0.f143244e
            goto L_0x037d
        L_0x037c:
            r12 = 0
        L_0x037d:
            if (r12 == 0) goto L_0x0387
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ r3
            if (r0 != r3) goto L_0x0387
            goto L_0x0388
        L_0x0387:
            r3 = 0
        L_0x0388:
            if (r3 == 0) goto L_0x03f9
            r1.mo12210a1(r12, r5)
            goto L_0x03f9
        L_0x038e:
            boolean r0 = r25.mo82893g0()
            if (r0 == 0) goto L_0x039c
            java.lang.String r0 = r1.f36155t
            r3 = 0
            java.lang.String r0 = r2.mo615g(r0, r3)
            goto L_0x03a3
        L_0x039c:
            r3 = 0
            java.lang.String r0 = r1.f36155t
            java.lang.String r0 = r2.mo616h(r0, r4, r3)
        L_0x03a3:
            java.lang.String r2 = r5.mo9722m2()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "customText:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            org.libpag.PAGView r3 = r1.f36152q
            qj1.s7 r4 = new qj1.s7
            r4.<init>(r1, r5, r2, r0)
            r3.post(r4)
            goto L_0x03f9
        L_0x03c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "skip show full screen gift id:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = ", giftPath is null, isRandomGift:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x03f9
        L_0x03e4:
            if (r2 == 0) goto L_0x03ef
            java.lang.String r0 = "isShow"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r3) goto L_0x03ef
            goto L_0x03f0
        L_0x03ef:
            r3 = 0
        L_0x03f0:
            if (r3 == 0) goto L_0x03f6
            r1.mo10792g(r6)
            goto L_0x03f9
        L_0x03f6:
            r1.mo10792g(r4)
        L_0x03f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12611q7.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C53973z1 z1Var = this.f36156u;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f36152q.setAlpha(1.0f);
        if (!C62042e.f176370a.mo87027N0()) {
            this.f36152q.setClickable(true);
        }
        this.f36158w.stopTimer();
        View view = this.f36153r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f36153r;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ViewPropertyAnimator viewPropertyAnimator = this.f36154s;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }
}
