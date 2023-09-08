package aj1;

import a14.C0000n0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C0680q1;
import cl1.C55006x0;
import cl1.C55009y0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.file.XVFSFile;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import fh1.C58999c1;
import fh1.C8036f1;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gh1.C59453p;
import gh1.C59461x;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import hh1.C8529e;
import java.util.List;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import org.libpag.PAGView;
import rx3.C13598b0;
import rx3.C13600d;
import sx3.C26236u;
import te3.C64300cx2;
import te3.C64622p31;
import te3.C64646q31;
import wx3.C15601d;
import wx3.C66212f;
import xi1.C66283a;
import xi1.C66285b;
import xx3.C15911a;
import y50.C15936n0;
import yi1.C66654a;
import yx3.C91590f;
import yx3.C91594j;
import zi1.C66829b;

/* renamed from: aj1.b */
public final class C54037b extends C8313a implements C66654a, C8529e {

    /* renamed from: j */
    public final String f151306j = ("MilestoneBannerController_" + hashCode());

    /* renamed from: n */
    public ViewGroup f151307n;

    /* renamed from: o */
    public ViewGroup f151308o;

    /* renamed from: p */
    public C59453p f151309p;

    /* renamed from: q */
    public final C66829b f151310q;

    /* renamed from: r */
    public C0680q1.C0681a f151311r;

    /* renamed from: aj1.b$a */
    public static final class C54038a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54037b f151312d;

        /* renamed from: e */
        public final /* synthetic */ C64622p31 f151313e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54038a(C54037b bVar, C64622p31 p312) {
            super(0);
            this.f151312d = bVar;
            this.f151313e = p312;
        }

        public Object invoke() {
            C54037b bVar = this.f151312d;
            bVar.mo74699F3(C58999c1.C59000a.LOTTERY_DONE, this.f151313e, new C54036a(bVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: aj1.b$b */
    public static final class C54039b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54037b f151314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54039b(C54037b bVar) {
            super(0);
            this.f151314d = bVar;
        }

        public Object invoke() {
            C58999c1 c1Var = (C58999c1) this.f151314d.controller(C58999c1.class);
            if (c1Var != null) {
                c1Var.mo84230m3();
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.milestone.controller.LiveMilestoneLotteryBannerController$onLiveActivate$1", mo125469f = "LiveMilestoneLotteryBannerController.kt", mo125470l = {54}, mo125471m = "invokeSuspend")
    /* renamed from: aj1.b$c */
    public static final class C54040c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f151315d;

        /* renamed from: e */
        public final /* synthetic */ C54037b f151316e;

        /* renamed from: aj1.b$c$a */
        public static final class C54041a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C54037b f151317d;

            public C54041a(C54037b bVar) {
                this.f151317d = bVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C64622p31 p312 = (C64622p31) obj;
                String str = this.f151317d.f151306j;
                Log.m105924i(str, "curLotteryInfo collect value " + p312);
                if (p312 != null) {
                    this.f151317d.f151310q.mo90803a(p312);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54040c(C54037b bVar, C15601d<? super C54040c> dVar) {
            super(2, dVar);
            this.f151316e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54040c(this.f151316e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C54040c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f151315d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<C64622p31> u0Var = ((C55006x0) this.f151316e.business(C55006x0.class)).f154454i;
                C54041a aVar2 = new C54041a(this.f151316e);
                this.f151315d = 1;
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.milestone.controller.LiveMilestoneLotteryBannerController$onLiveActivate$2", mo125469f = "LiveMilestoneLotteryBannerController.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
    /* renamed from: aj1.b$d */
    public static final class C54042d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f151318d;

        /* renamed from: e */
        public final /* synthetic */ C54037b f151319e;

        /* renamed from: aj1.b$d$a */
        public static final class C54043a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C54037b f151320d;

            public C54043a(C54037b bVar) {
                this.f151320d = bVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C64646q31 q312 = (C64646q31) obj;
                String str = this.f151320d.f151306j;
                Log.m105924i(str, "lotteryMetaInfo collect value " + q312);
                this.f151320d.mo74702I3(q312);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54042d(C54037b bVar, C15601d<? super C54042d> dVar) {
            super(2, dVar);
            this.f151319e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54042d(this.f151319e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C54042d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f151318d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<C64646q31> u0Var = ((C55006x0) this.f151319e.business(C55006x0.class)).f154452g;
                C54043a aVar2 = new C54043a(this.f151319e);
                this.f151318d = 1;
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.milestone.controller.LiveMilestoneLotteryBannerController$onLiveActivate$3", mo125469f = "LiveMilestoneLotteryBannerController.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
    /* renamed from: aj1.b$e */
    public static final class C54044e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f151321d;

        /* renamed from: e */
        public final /* synthetic */ C54037b f151322e;

        /* renamed from: aj1.b$e$a */
        public static final class C54045a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C54037b f151323d;

            public C54045a(C54037b bVar) {
                this.f151323d = bVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C64622p31 p312 = (C64622p31) obj;
                String str = this.f151323d.f151306j;
                Log.m105924i(str, "joinLiveLotteryInfo collect value " + p312);
                if (p312 != null) {
                    this.f151323d.mo74704m3(p312);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54044e(C54037b bVar, C15601d<? super C54044e> dVar) {
            super(2, dVar);
            this.f151322e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54044e(this.f151322e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C54044e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f151321d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<C64622p31> u0Var = ((C55006x0) this.f151322e.business(C55006x0.class)).f154456n;
                C54045a aVar2 = new C54045a(this.f151322e);
                this.f151321d = 1;
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

    /* renamed from: aj1.b$f */
    public static final class C54046f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f151324d;

        /* renamed from: e */
        public final /* synthetic */ C55006x0.C0697b f151325e;

        /* renamed from: f */
        public final /* synthetic */ C54037b f151326f;

        /* renamed from: g */
        public final /* synthetic */ boolean f151327g;

        /* renamed from: h */
        public final /* synthetic */ boolean f151328h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54046f(boolean z, C55006x0.C0697b bVar, C54037b bVar2, boolean z2, boolean z3) {
            super(0);
            this.f151324d = z;
            this.f151325e = bVar;
            this.f151326f = bVar2;
            this.f151327g = z2;
            this.f151328h = z3;
        }

        public Object invoke() {
            if (this.f151324d) {
                int i = this.f151325e.f1648a;
                C66283a aVar = null;
                if (i == 1) {
                    C54037b bVar = this.f151326f;
                    ViewGroup viewGroup = bVar.f151307n;
                    if (viewGroup != null) {
                        aVar = new C66283a(viewGroup, bVar);
                    }
                    if (aVar != null) {
                        aVar.f190820c.setVisibility(8);
                    }
                    C66285b n3 = bVar.mo74705n3();
                    if (n3 != null) {
                        n3.f190825f.setVisibility(0);
                    }
                    C59453p pVar = this.f151326f.f151309p;
                    if (pVar != null) {
                        pVar.mo84560c(0);
                    }
                    if (this.f151327g) {
                        C66285b n35 = this.f151326f.mo74705n3();
                        if (n35 != null) {
                            Log.m105924i("LiveMilestoneBubbleWidget", "startBubbleAnimateShow");
                            n35.f190825f.setVisibility(0);
                            n35.f190826g.setVisibility(8);
                            n35.f190828i.setProgress(0.0d);
                            n35.f190828i.play();
                        }
                    } else {
                        C66285b n36 = this.f151326f.mo74705n3();
                        if (n36 != null) {
                            String a = C15936n0.C15937a.m14866a(C15936n0.f42815a, this.f151325e.f1649b, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null);
                            Log.m105924i("LiveMilestoneBubbleWidget", "updateCountDown remainTime:" + a);
                            TextView textView = n36.f190826g;
                            if (textView != null) {
                                textView.setText(a);
                            }
                            PAGView pAGView = n36.f190828i;
                            if (pAGView != null) {
                                pAGView.setProgress(1.0d);
                            }
                            TextView textView2 = n36.f190826g;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                            }
                        }
                    }
                } else if (i == 2) {
                    C66285b n37 = this.f151326f.mo74705n3();
                    if (n37 != null) {
                        n37.f190825f.setVisibility(0);
                    }
                    C59453p pVar2 = this.f151326f.f151309p;
                    if (pVar2 != null) {
                        pVar2.mo84560c(0);
                    }
                    C66285b n38 = this.f151326f.mo74705n3();
                    if (n38 != null) {
                        Log.m105924i("LiveMilestoneBubbleWidget", "showLotteryComputing");
                        PAGView pAGView2 = n38.f190828i;
                        if (pAGView2 != null) {
                            pAGView2.setProgress(1.0d);
                        }
                        TextView textView3 = n38.f190826g;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                        TextView textView4 = n38.f190826g;
                        if (textView4 != null) {
                            textView4.setText(n38.f190823d.getContext().getResources().getString(C0966R.string.dsq));
                        }
                    }
                } else if (i == 3 && !this.f151328h && !this.f151327g) {
                    if (!this.f151326f.mo9310g3() || this.f151326f.mo74706o3() || C85875k4.m106167X()) {
                        this.f151326f.mo74699F3(C58999c1.C59000a.LOTTERY_DONE, this.f151325e.f1651d, (C32226l<? super Boolean, C13598b0>) null);
                    } else {
                        C54037b bVar2 = this.f151326f;
                        bVar2.mo9312j3(new C54050c(bVar2, this.f151325e));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: aj1.b$g */
    public static final class C54047g implements C59461x {

        /* renamed from: a */
        public final /* synthetic */ C59453p f151329a;

        public C54047g(C59453p pVar) {
            this.f151329a = pVar;
        }

        /* renamed from: a */
        public List<C59453p> mo9171a() {
            return C26236u.m33719b(this.f151329a);
        }

        /* renamed from: b */
        public List<C59453p> mo9172b() {
            return C26236u.m33719b(this.f151329a);
        }

        /* renamed from: c */
        public void mo9173c(boolean z) {
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.milestone.controller.LiveMilestoneLotteryBannerController$showLotteryResult$1", mo125469f = "LiveMilestoneLotteryBannerController.kt", mo125470l = {198}, mo125471m = "invokeSuspend")
    /* renamed from: aj1.b$h */
    public static final class C54048h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f151330d;

        /* renamed from: e */
        public final /* synthetic */ C54037b f151331e;

        /* renamed from: f */
        public final /* synthetic */ C58999c1.C59000a f151332f;

        /* renamed from: g */
        public final /* synthetic */ C64622p31 f151333g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f151334h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54048h(C54037b bVar, C58999c1.C59000a aVar, C64622p31 p312, C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C54048h> dVar) {
            super(2, dVar);
            this.f151331e = bVar;
            this.f151332f = aVar;
            this.f151333g = p312;
            this.f151334h = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54048h(this.f151331e, this.f151332f, this.f151333g, this.f151334h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54048h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f151330d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58999c1 c1Var = (C58999c1) this.f151331e.controller(C58999c1.class);
                if (c1Var != null) {
                    C58999c1.C59000a aVar2 = this.f151332f;
                    C64622p31 p312 = this.f151333g;
                    boolean u = C61926c.m72696u(p312.f184749g, 1);
                    C32226l<Boolean, C13598b0> lVar = this.f151334h;
                    this.f151330d = 1;
                    if (c1Var.mo84228F3(aVar2, p312, u, true, lVar, this) == aVar) {
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

    /* renamed from: aj1.b$i */
    public static final class C54049i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54037b f151335d;

        /* renamed from: e */
        public final /* synthetic */ String f151336e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54049i(C54037b bVar, String str) {
            super(0);
            this.f151335d = bVar;
            this.f151336e = str;
        }

        public Object invoke() {
            C8036f1 f1Var = (C8036f1) this.f151335d.controller(C8036f1.class);
            if (f1Var != null) {
                f1Var.mo9120G3(this.f151336e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54037b(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
        this.f151310q = new C66829b(liveRoomControllerStore, liveRoomControllerStore.getLiveRoomData());
    }

    /* renamed from: F3 */
    public final void mo74699F3(C58999c1.C59000a aVar, C64622p31 p312, C32226l<? super Boolean, C13598b0> lVar) {
        ViewGroup viewGroup = this.f151308o;
        Activity activity = null;
        Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        boolean isDestroyed = activity != null ? activity.isDestroyed() : false;
        String str = this.f151306j;
        C55009y0.m62070a(p312, str, "showLotteryResult source: " + aVar);
        if (isDestroyed) {
            Log.m105924i(this.f151306j, "showLotteryResult page isDestroyed");
            return;
        }
        C8036f1 f1Var = (C8036f1) controller(C8036f1.class);
        if (f1Var != null) {
            f1Var.mo9122m3();
        }
        String str2 = p312.f184746d;
        Log.m105924i("FinderLiveMilestoneUtil", "recordCardOpenLottery lottery: " + str2);
        MultiProcessMMKV p0 = C62042e.f176370a.mo87106p0();
        p0.putBoolean("milestone_" + str2, true);
        if (p312.f184749g > 0) {
            C11207i.m11071g(this, (C66212f) null, (C53934p0) null, new C54048h(this, aVar, p312, lVar, (C15601d<? super C54048h>) null), 3, (Object) null);
        }
    }

    /* renamed from: G3 */
    public final void mo74700G3(String str) {
        if (!mo9310g3() || mo74706o3() || C85875k4.m106167X()) {
            C8036f1 f1Var = (C8036f1) controller(C8036f1.class);
            if (f1Var != null) {
                f1Var.mo9120G3(str);
                return;
            }
            return;
        }
        mo9312j3(new C54049i(this, str));
    }

    /* renamed from: H2 */
    public void mo74701H2() {
        mo74700G3((String) null);
    }

    /* renamed from: I3 */
    public final void mo74702I3(C64646q31 q312) {
        C64300cx2 cx22;
        C64300cx2 cx23;
        C55006x0.C0697b e3 = ((C55006x0) business(C55006x0.class)).mo76053e3();
        C66283a aVar = null;
        C64622p31 p312 = e3 != null ? e3.f1651d : null;
        if (q312 == null && p312 == null) {
            C59453p pVar = this.f151309p;
            if (pVar != null) {
                pVar.mo84560c(8);
                return;
            }
            return;
        }
        boolean z = true;
        if (!((p312 == null || (cx23 = p312.f184747e) == null || cx23.f182599g != 1) ? false : true)) {
            if (p312 == null || (cx22 = p312.f184747e) == null || cx22.f182599g != 2) {
                z = false;
            }
            if (!z && q312 != null) {
                ViewGroup viewGroup = this.f151307n;
                C66283a aVar2 = viewGroup != null ? new C66283a(viewGroup, this) : null;
                if (aVar2 != null) {
                    TextView textView = aVar2.f190821d;
                    String str = q312.f184943e;
                    if (str == null) {
                        str = "";
                    }
                    textView.setText(str);
                }
                ViewGroup viewGroup2 = this.f151307n;
                if (viewGroup2 != null) {
                    aVar = new C66283a(viewGroup2, this);
                }
                if (aVar != null) {
                    aVar.f190820c.setVisibility(0);
                }
                C66285b n3 = mo74705n3();
                if (n3 != null) {
                    n3.f190825f.setVisibility(8);
                }
                C59453p pVar2 = this.f151309p;
                if (pVar2 != null) {
                    pVar2.mo84560c(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = r0.f1651d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74703b() {
        /*
            r5 = this;
            java.lang.Class<cl1.x0> r0 = cl1.C55006x0.class
            androidx.lifecycle.i0 r0 = r5.business(r0)
            cl1.x0 r0 = (cl1.C55006x0) r0
            cl1.x0$b r0 = r0.mo76053e3()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            te3.p31 r0 = r0.f1651d
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r0.f184746d
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            java.lang.String r2 = r5.f151306j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onBubbleClick currentLotteryId: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r2 = r2.mo87027N0()
            if (r2 == 0) goto L_0x0039
            r5.mo74700G3(r1)
            goto L_0x003c
        L_0x0039:
            r5.mo74700G3(r0)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aj1.C54037b.mo74703b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0.mo55921a(r2) != false) goto L_0x001b;
     */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74704m3(te3.C64622p31 r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x006c
            int r0 = r9.f184749g
            r1 = 1
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 == 0) goto L_0x001a
            bj1.a r0 = bj1.C28329a.f77951a
            java.lang.String r2 = r9.f184746d
            if (r2 != 0) goto L_0x0013
            java.lang.String r2 = ""
        L_0x0013:
            boolean r0 = r0.mo55921a(r2)
            if (r0 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r0 = r8.f151306j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkShowLotteryResult hasLottery: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " ext_flag: "
            r2.append(r3)
            int r3 = r9.f184749g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            if (r1 != 0) goto L_0x006c
            int r0 = r9.f184749g
            if (r0 <= 0) goto L_0x006c
            cl1.q1$a r0 = new cl1.q1$a
            cl1.q1$b r2 = cl1.C0680q1.C0682b.LOTTERY_RESULT_TOAST
            aj1.b$a r3 = new aj1.b$a
            r3.<init>(r8, r9)
            aj1.b$b r4 = new aj1.b$b
            r4.<init>(r8)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Class<cl1.q1> r9 = cl1.C0680q1.class
            androidx.lifecycle.i0 r9 = r8.business(r9)
            cl1.q1 r9 = (cl1.C0680q1) r9
            r9.getClass()
            cl1.s1 r1 = new cl1.s1
            r1.<init>(r9, r0)
            o40.C61926c.m72668M(r1)
            r8.f151311r = r0
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aj1.C54037b.mo74704m3(te3.p31):void");
    }

    /* renamed from: n3 */
    public final C66285b mo74705n3() {
        ViewGroup viewGroup = this.f151307n;
        if (viewGroup != null) {
            return new C66285b(viewGroup, this);
        }
        return null;
    }

    /* renamed from: o3 */
    public final boolean mo74706o3() {
        Context context = MMApplicationContext.getContext();
        return C85875k4.m106157N() && (C85875k4.m106156M(context) || C85875k4.m106155L(context.getContentResolver()));
    }

    public void onLiveActivate() {
        C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C54040c(this, (C15601d<? super C54040c>) null), 3, (Object) null);
        C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C54042d(this, (C15601d<? super C54042d>) null), 3, (Object) null);
        C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C54044e(this, (C15601d<? super C54044e>) null), 3, (Object) null);
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f151310q.mo90804b("onDestroy");
    }

    public void onLiveStartFromWindow() {
        C64622p31 p312 = (C64622p31) ((C58052j1) ((C55006x0) business(C55006x0.class)).f154454i).getValue();
        if (p312 != null) {
            String str = this.f151306j;
            StringBuilder sb = new StringBuilder();
            sb.append("onLiveStartFromWindow status: ");
            C64300cx2 cx22 = p312.f184747e;
            sb.append(cx22 != null ? Integer.valueOf(cx22.f182599g) : null);
            sb.append(" id: ");
            sb.append(p312.f184746d);
            Log.m105924i(str, sb.toString());
            C64300cx2 cx23 = p312.f184747e;
            boolean z = false;
            if (cx23 != null && cx23.f182599g == 3) {
                z = true;
            }
            if (z) {
                mo74704m3(p312);
            }
        }
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        this.f151307n = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.od9);
        this.f151308o = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.f358126od2);
        ViewGroup viewGroup2 = this.f151307n;
        if (viewGroup2 != null) {
            C59453p pVar = new C59453p(viewGroup2, this);
            this.f151309p = pVar;
            this.f27265i = new C54047g(pVar);
        }
        C59453p pVar2 = this.f151309p;
        if (pVar2 != null) {
            pVar2.mo84560c(8);
        }
        Class cls = C55006x0.class;
        C64622p31 p312 = (C64622p31) ((C58052j1) ((C55006x0) business(cls)).f154454i).getValue();
        if (p312 != null) {
            this.f151310q.mo90803a(p312);
        }
        C64646q31 q312 = (C64646q31) ((C58052j1) ((C55006x0) business(cls)).f154452g).getValue();
        if (q312 != null) {
            mo74702I3(q312);
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
    }

    /* renamed from: p2 */
    public void mo9129p2(C55006x0.C0697b bVar, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(bVar, "data");
        C61926c.m72668M(new C54046f(z, bVar, this, z2, z3));
    }
}
