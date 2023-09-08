package sl1;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import al1.C0082q;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cl1.C0654b;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C7349u;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import ky2.C10432i;
import l31.C61212e;
import mp3.C88819d;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import og1.C62009b;
import ok1.C62042e;
import p50.C62197e;
import pe3.C47465a;
import pe3.C89349b;
import q40.C12040d;
import q40.C89456b;
import rl1.C13022d0;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50880pv0;
import te3.C52204z21;
import te3.pq4;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: sl1.c */
public final class C64039c extends C62009b implements C11385n {

    /* renamed from: r */
    public final C58124b f181567r;

    /* renamed from: s */
    public final C0000n0 f181568s = C53930o0.m60555b();

    /* renamed from: t */
    public C53973z1 f181569t;

    /* renamed from: u */
    public C64042j f181570u;

    /* renamed from: v */
    public C13712a f181571v;

    /* renamed from: w */
    public C64042j f181572w;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.bubble.FinderLiveLotteryBubblePlugin$finallyRequestAttendLotteryWithFollowCondition$1", mo125469f = "FinderLiveLotteryBubblePlugin.kt", mo125470l = {306}, mo125471m = "invokeSuspend")
    /* renamed from: sl1.c$a */
    public static final class C13714a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f38795d;

        /* renamed from: e */
        public final /* synthetic */ Integer f38796e;

        /* renamed from: f */
        public final /* synthetic */ C64039c f38797f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13714a(Integer num, C64039c cVar, C15601d<? super C13714a> dVar) {
            super(2, dVar);
            this.f38796e = num;
            this.f38797f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13714a(this.f38796e, this.f38797f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13714a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C58115i iVar;
            Class cls = C55001u.class;
            Class cls2 = C13022d0.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f38795d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int intValue = this.f38796e.intValue();
                long j = ((C55001u) this.f38797f.mo87696x0(cls)).f154416j;
                C45795b.C32059a aVar2 = C45795b.f123697j;
                C45795b bVar = C45795b.f123698n;
                C7349u uVar = new C7349u(intValue, j, C89349b.m111674a(bVar != null ? ((C55001u) bVar.mo71262a(cls)).f154417n : null), C66785b.f191882e.mo90662O5());
                this.f38795d = 1;
                obj = C89456b.m111831a(uVar, 0, (C88819d) null, this, 3, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (C12040d e) {
                    Log.m105924i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowCondition errorCode=" + e.f35058f + " errorType=" + e.f35057e + " error.message " + e.f35059g);
                    return C13598b0.f38549a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C50880pv0 pv02 = (C50880pv0) obj;
            Log.m105924i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowCondition resp " + pv02.f139996d);
            boolean j3 = ((C13022d0) this.f38797f.mo87696x0(cls2)).mo12543j3();
            C62197e e0 = FinderLiveService.f159376d.mo77631e0();
            boolean z = (e0 == null || (iVar = e0.f172989A) == null || !iVar.mo82886h()) ? false : true;
            Log.m105924i("FinderLiveLotteryBubblePlugin", "finallyRequestAttendLotteryWithFollowCondition isRunning:" + j3 + ",normalMode:" + z);
            if (j3) {
                if (pv02.f139996d == 1) {
                    if (z) {
                        this.f38797f.mo88788b1();
                    } else {
                        C13022d0 d0Var = (C13022d0) this.f38797f.mo87696x0(cls2);
                        d0Var.f37104t = d0Var.f37098n;
                        Log.m105924i("MMFinder.LiveLotterySlice", "cacheLotteryInfo:" + d0Var.f37104t);
                    }
                } else if (C61926c.m72696u(pv02.f139997e, 4)) {
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.f8127mj), 0).show();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sl1.c$d */
    public static final class C13715d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64039c f38798d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13715d(C64039c cVar) {
            super(0);
            this.f38798d = cVar;
        }

        public Object invoke() {
            C52204z21 z212;
            C52204z21 z213;
            Class cls = C13022d0.class;
            if (((C54991o) this.f38798d.mo87696x0(C54991o.class)).mo75999e4()) {
                C0082q qVar = (C0082q) C110818d0.m150916N(((C13022d0) this.f38798d.mo87696x0(cls)).f37097j);
                String str = null;
                C52204z21 z214 = qVar != null ? qVar.f509d : null;
                if (z214 == null || Util.isNullOrNil(z214.f145640d)) {
                    C0082q qVar2 = ((C13022d0) this.f38798d.mo87696x0(cls)).f37098n;
                    String str2 = (qVar2 == null || (z213 = qVar2.f509d) == null) ? null : z213.f145640d;
                    if (!(str2 == null || str2.length() == 0)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("updateLottery error firstLotteryInfo id:");
                        sb.append(z214 != null ? z214.f145640d : null);
                        sb.append(",local lottery id:");
                        C0082q qVar3 = ((C13022d0) this.f38798d.mo87696x0(cls)).f37098n;
                        if (!(qVar3 == null || (z212 = qVar3.f509d) == null)) {
                            str = z212.f145640d;
                        }
                        sb.append(str);
                        Log.m105924i("FinderLiveLotteryBubblePlugin", sb.toString());
                    }
                    if (!((C13022d0) this.f38798d.mo87696x0(cls)).f37097j.isEmpty()) {
                        ((C13022d0) this.f38798d.mo87696x0(cls)).f37097j.removeFirst();
                    }
                } else {
                    C13712a aVar = this.f38798d.f181571v;
                    if (aVar != null) {
                        aVar.mo13090z0(qVar);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sl1.c$b */
    public static final class C64040b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64040b(C64042j jVar) {
            super(0);
            this.f181573d = jVar;
        }

        public Object invoke() {
            Log.m105924i(this.f181573d.f181578j, "showPrepareLottery finish!");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sl1.c$c */
    public static final class C64041c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C64041c f181574d = new C64041c();

        public C64041c() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("FinderLiveLotteryBubblePlugin", "showPrepareLottery finish!");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64039c(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        Class cls = C61212e.class;
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f181567r = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f181571v = new C13717e(context, mo87684A0(), bVar);
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176279q;
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C64042j jVar = new C64042j(false, viewGroup, frameBubbleContentLayout, (MMActivity) context2, this.f181571v);
        this.f181570u = jVar;
        this.f181572w = jVar;
        C13712a aVar = this.f181571v;
        if (aVar != null) {
            ((C13717e) aVar).onAttach(jVar);
        }
        if (bVar.getLiveRole() == 0) {
            View findViewById = viewGroup.findViewById(C0966R.C0970id.dqo);
            if (findViewById != null) {
                ((C61212e) C86312j.m106911c(cls)).o30(findViewById, "finder_live_lottery_bubble");
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById, 40, 25561);
            }
            View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f357800bu0);
            if (findViewById2 != null) {
                ((C61212e) C86312j.m106911c(cls)).o30(findViewById2, "finder_live_lottery_bubble");
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById2, 8, 25561);
            }
        }
        Log.m105924i("FinderLiveLotteryBubblePlugin", "enable :" + ((C13022d0) mo87696x0(C13022d0.class)).f37102r);
    }

    /* renamed from: P0 */
    public void mo12077P0(C117747y yVar, boolean z) {
        Class cls = C0654b.class;
        Log.m105924i("FinderLiveLotteryBubblePlugin", "#onSceneEnd MMFunc_FinderFollow,isFollow:" + z);
        if (!C62042e.f176370a.mo87027N0() && !((C0654b) mo87696x0(cls)).f1544f && ((C0654b) mo87696x0(cls)).mo623c3()) {
            mo88789c1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r1 = r1.f509d;
     */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88787a1() {
        /*
            r7 = this;
            java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r1 = r1.mo87027N0()
            if (r1 != 0) goto L_0x0081
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r1)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            if (r1 != 0) goto L_0x001a
            goto L_0x0081
        L_0x001a:
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r0)
            rl1.d0 r1 = (rl1.C13022d0) r1
            al1.q r1 = r1.f37104t
            r2 = 0
            if (r1 == 0) goto L_0x002c
            te3.z21 r1 = r1.f509d
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = r1.f145640d
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            androidx.lifecycle.i0 r3 = r7.mo87696x0(r0)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0042
            int r6 = r1.length()
            if (r6 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r6 = 0
            goto L_0x0043
        L_0x0042:
            r6 = 1
        L_0x0043:
            if (r6 != 0) goto L_0x0081
            if (r3 == 0) goto L_0x004e
            te3.z21 r6 = r3.f509d
            if (r6 == 0) goto L_0x004e
            java.lang.String r6 = r6.f145640d
            goto L_0x004f
        L_0x004e:
            r6 = r2
        L_0x004f:
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 == 0) goto L_0x0081
            if (r3 == 0) goto L_0x005c
            int r1 = r3.f506a
            if (r1 != r5) goto L_0x005c
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0081
            r7.mo88788b1()
            androidx.lifecycle.i0 r0 = r7.mo87696x0(r0)
            rl1.d0 r0 = (rl1.C13022d0) r0
            r0.f37104t = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "resetCacheLotteryInfo:"
            r1.append(r2)
            al1.q r0 = r0.f37104t
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MMFinder.LiveLotterySlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.C64039c.mo88787a1():void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo88788b1() {
        C56032b z0 = mo14484z0();
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dso);
        C87412m.m108593f(string, "getContext().resources.g…er_live_lottery_attended)");
        z0.showCenterCustomizeToast(string, C0966R.raw.icons_outlined_done);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.my0((C54116w) c, C54067f0.C0071v0.FOLLOW_SUC, (String) null, (String) null, 0, 12, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = (r0 = r0.f509d).f145645i;
     */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88789c1() {
        /*
            r10 = this;
            java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
            androidx.lifecycle.i0 r0 = r10.mo87696x0(r0)
            rl1.d0 r0 = (rl1.C13022d0) r0
            al1.q r0 = r0.f37098n
            r1 = 0
            if (r0 == 0) goto L_0x001c
            te3.z21 r0 = r0.f509d
            if (r0 == 0) goto L_0x001c
            te3.u21 r0 = r0.f145645i
            if (r0 == 0) goto L_0x001c
            int r0 = r0.f142563d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#finallyRequestAttendLotteryWithFollowCondition begin , lotteryAttendType: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveLotteryBubblePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r2 = 4
            if (r0 != 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r4 = r0.intValue()
            if (r4 == r2) goto L_0x004d
        L_0x003d:
            r2 = 5
            if (r0 != 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            int r4 = r0.intValue()
            if (r4 == r2) goto L_0x004d
        L_0x0047:
            java.lang.String r0 = "#finallyRequestAttendLotteryWithFollowCondition Condition not invalid "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        L_0x004d:
            a14.z1 r2 = r10.f181569t
            if (r2 == 0) goto L_0x0055
            r3 = 1
            a14.C53973z1.C53974a.m60623a(r2, r1, r3, r1)
        L_0x0055:
            a14.n0 r4 = r10.f181568s
            r5 = 0
            r6 = 0
            sl1.c$a r7 = new sl1.c$a
            r7.<init>(r0, r10, r1)
            r8 = 3
            r9 = 0
            a14.z1 r0 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            r10.f181569t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.C64039c.mo88789c1():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88790d1() {
        /*
            r7 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r0)
            cl1.d0 r1 = (cl1.C54963d0) r1
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r1 = r1.f154077t
            java.lang.Object r1 = r1.getValue()
            gi1.c r1 = (gi1.C59464c) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0052
            int r4 = r1.f169898c
            if (r4 != r3) goto L_0x0052
            java.util.LinkedList<gi1.a> r1 = r1.f169896a
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0042
            java.lang.Object r4 = r1.next()
            r5 = r4
            gi1.a r5 = (gi1.C59463a) r5
            java.lang.String r5 = r5.mo84561a()
            java.lang.Class<cl1.u> r6 = cl1.C55001u.class
            androidx.lifecycle.i0 r6 = r7.mo87696x0(r6)
            cl1.u r6 = (cl1.C55001u) r6
            te3.bq2 r6 = r6.f154419p
            java.lang.String r6 = r6.f182319n
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            gi1.a r4 = (gi1.C59463a) r4
            if (r4 == 0) goto L_0x0052
            gi1.f r1 = r4.f169895b
            if (r1 == 0) goto L_0x0052
            int r1 = r1.f169903g
            r4 = 2
            if (r1 != r4) goto L_0x0052
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 != 0) goto L_0x006f
            androidx.lifecycle.i0 r0 = r7.mo87696x0(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.mo75912T3()
            if (r0 != 0) goto L_0x006f
            java.lang.Class<cl1.c0> r0 = cl1.C54949c0.class
            androidx.lifecycle.i0 r0 = r7.mo87696x0(r0)
            cl1.c0 r0 = (cl1.C54949c0) r0
            boolean r0 = r0.mo75866g3()
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r2 = 1
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.C64039c.mo88790d1():boolean");
    }

    /* renamed from: e1 */
    public final void mo88791e1(String str) {
        C0082q qVar = ((C13022d0) mo87696x0(C13022d0.class)).f37098n;
        if ((qVar != null ? qVar.f509d : null) == null) {
            Log.m105924i("FinderLiveLotteryBubblePlugin", str + " lotteryInfo is empty!");
        }
    }

    /* renamed from: f0 */
    public int mo14483f0() {
        View view;
        if (!mo88790d1()) {
            return mo86896Z0().getVisibility();
        }
        C64042j jVar = this.f181572w;
        if (jVar == null || (view = jVar.mo86891b()) == null) {
            view = mo86896Z0();
        }
        return view.getVisibility();
    }

    /* renamed from: f1 */
    public final void mo88792f1() {
        C61926c.m72668M(new C13715d(this));
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (mo88790d1()) {
            C64042j jVar = this.f181572w;
            View b = jVar != null ? jVar.mo86891b() : null;
            if (b != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view = b;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f177938i = i;
        } else if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w("FinderLiveLotteryBubblePlugin", "setVisible return for isTeenMode");
        } else {
            View Z0 = mo86896Z0();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(Z0, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Z0.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(Z0, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            super.mo10792g(i);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        StringBuilder sb = new StringBuilder();
        sb.append("mount ");
        sb.append(hashCode());
        sb.append(" presenter is empty:");
        boolean z = true;
        sb.append(this.f181571v == null);
        sb.append(",viewCallback is empty:");
        if (this.f181572w != null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("FinderLiveLotteryBubblePlugin", sb.toString());
        super.mo8357i0();
        if (this.f181571v == null || this.f181572w == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            this.f181571v = new C13717e(context, mo87684A0(), this.f181567r);
            ViewGroup viewGroup = this.f166287d;
            FrameBubbleContentLayout frameBubbleContentLayout = this.f176279q;
            Context context2 = viewGroup.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f181572w = new C64042j(false, viewGroup, frameBubbleContentLayout, (MMActivity) context2, this.f181571v);
        }
        C13712a aVar = this.f181571v;
        if (aVar != null) {
            C64042j jVar = this.f181572w;
            C87412m.m108591d(jVar);
            aVar.onAttach(jVar);
        }
        C86709a0.m107524d().mo123455a(30, this);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (gy3.C87412m.m108589b(r5 != null ? r5.mo86891b() : null, r2) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        if (gy3.C87412m.m108589b(r2 != null ? r2.mo86891b() : null, r1.f166287d) == false) goto L_0x0178;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0254  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11992m0(java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.String r2 = "micUserMap"
            r3 = r24
            gy3.C87412m.m108594g(r3, r2)
            java.lang.Class<ii1.e> r2 = ii1.C60291e.class
            qj1.c r2 = r1.mo87687E0(r2)
            ii1.e r2 = (ii1.C60291e) r2
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0065
            li1.a r2 = r2.mo85276Z0()
            boolean r5 = r2.mo85558f()
            if (r5 != 0) goto L_0x0022
            goto L_0x0065
        L_0x0022:
            com.tencent.mm.view.ratio.RatioLayout r5 = r2.mo85556d()
            int r5 = r5.getChildCount()
            r6 = 0
        L_0x002b:
            if (r6 >= r5) goto L_0x0065
            com.tencent.mm.view.ratio.RatioLayout r7 = r2.mo85556d()
            android.view.View r7 = r7.getChildAt(r6)
            boolean r8 = r7 instanceof si1.C63902g
            if (r8 == 0) goto L_0x003c
            si1.g r7 = (si1.C63902g) r7
            goto L_0x003d
        L_0x003c:
            r7 = r3
        L_0x003d:
            if (r7 == 0) goto L_0x0062
            al1.j r8 = r7.getCurBindLinkMicUser()
            if (r8 == 0) goto L_0x0048
            java.lang.String r8 = r8.f151997a
            goto L_0x0049
        L_0x0048:
            r8 = r3
        L_0x0049:
            qj1.c r9 = r2.f174398c
            java.lang.Class<cl1.u> r10 = cl1.C55001u.class
            androidx.lifecycle.i0 r9 = r9.mo87696x0(r10)
            cl1.u r9 = (cl1.C55001u) r9
            te3.bq2 r9 = r9.f154419p
            java.lang.String r9 = r9.f182319n
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x0062
            android.view.ViewGroup r2 = r7.getLotteryBubbleRootView()
            goto L_0x0066
        L_0x0062:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0065:
            r2 = r3
        L_0x0066:
            boolean r5 = r23.mo88790d1()
            r13 = 8
            r14 = 1
            if (r5 == 0) goto L_0x015b
            if (r2 == 0) goto L_0x015b
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x007b
            boolean r6 = r5.f181575g
            if (r6 != 0) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 != 0) goto L_0x008c
            if (r5 == 0) goto L_0x0085
            android.view.View r5 = r5.mo86891b()
            goto L_0x0086
        L_0x0085:
            r5 = r3
        L_0x0086:
            boolean r5 = gy3.C87412m.m108589b(r5, r2)
            if (r5 != 0) goto L_0x024a
        L_0x008c:
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x0095
            int r5 = r5.mo86888G0()
            goto L_0x0097
        L_0x0095:
            r5 = 8
        L_0x0097:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r5)
            java.lang.Object[] r6 = r15.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r8 = "onMicUserChanged"
            java.lang.String r9 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r2
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r15.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r7 = "onMicUserChanged"
            java.lang.String r8 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r2
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x00e2
            android.view.View r5 = r5.mo86891b()
            r6 = r5
            goto L_0x00e3
        L_0x00e2:
            r6 = r3
        L_0x00e3:
            if (r6 != 0) goto L_0x00e6
            goto L_0x0124
        L_0x00e6:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r7)
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r18 = "onMicUserChanged"
            java.lang.String r19 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r8 = "onMicUserChanged"
            java.lang.String r9 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x0124:
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x012c
            android.os.Bundle r3 = r5.mo88798N0()
        L_0x012c:
            sl1.j r11 = new sl1.j
            r6 = 1
            r8 = 0
            android.view.ViewGroup r5 = r1.f166287d
            android.content.Context r5 = r5.getContext()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r5, r7)
            r9 = r5
            com.tencent.mm.ui.MMActivity r9 = (com.tencent.p014mm.p136ui.MMActivity) r9
            sl1.a r10 = r1.f181571v
            r5 = r11
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            sl1.a r2 = r1.f181571v
            if (r2 == 0) goto L_0x014c
            r2.onAttach(r11)
        L_0x014c:
            r11.mo88793I0(r3)
            sl1.c$b r2 = new sl1.c$b
            r2.<init>(r11)
            r11.mo13094p0(r2)
            r1.f181572w = r11
            goto L_0x024a
        L_0x015b:
            sl1.j r2 = r1.f181572w
            if (r2 == 0) goto L_0x0165
            boolean r5 = r2.f181575g
            if (r5 != r14) goto L_0x0165
            r5 = 1
            goto L_0x0166
        L_0x0165:
            r5 = 0
        L_0x0166:
            if (r5 != 0) goto L_0x0178
            if (r2 == 0) goto L_0x016f
            android.view.View r2 = r2.mo86891b()
            goto L_0x0170
        L_0x016f:
            r2 = r3
        L_0x0170:
            android.view.ViewGroup r5 = r1.f166287d
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
            if (r2 != 0) goto L_0x024a
        L_0x0178:
            sl1.j r2 = r1.f181572w
            if (r2 == 0) goto L_0x0181
            int r2 = r2.mo86888G0()
            goto L_0x0183
        L_0x0181:
            r2 = 8
        L_0x0183:
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x018d
            android.view.View r5 = r5.mo86891b()
            r6 = r5
            goto L_0x018e
        L_0x018d:
            r6 = r3
        L_0x018e:
            if (r6 != 0) goto L_0x0191
            goto L_0x01d1
        L_0x0191:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r7)
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r18 = "onMicUserChanged"
            java.lang.String r19 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r8 = "onMicUserChanged"
            java.lang.String r9 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x01d1:
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x01da
            android.os.Bundle r5 = r5.mo88798N0()
            goto L_0x01db
        L_0x01da:
            r5 = r3
        L_0x01db:
            sl1.j r6 = r1.f181570u
            if (r6 == 0) goto L_0x024a
            int r7 = r6.mo86888G0()
            if (r7 != r13) goto L_0x01ea
            if (r2 != 0) goto L_0x01ea
            r6.mo11421k0()
        L_0x01ea:
            r1.f181572w = r6
            sl1.a r7 = r1.f181571v
            if (r7 == 0) goto L_0x01f3
            r7.onAttach(r6)
        L_0x01f3:
            r6.mo88793I0(r5)
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x01ff
            sl1.c$c r6 = sl1.C64039c.C64041c.f181574d
            r5.mo13094p0(r6)
        L_0x01ff:
            sl1.j r5 = r1.f181572w
            if (r5 == 0) goto L_0x0207
            android.view.View r3 = r5.mo86891b()
        L_0x0207:
            if (r3 != 0) goto L_0x020a
            goto L_0x024a
        L_0x020a:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13.mo10233c(r2)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r8 = "onMicUserChanged"
            java.lang.String r9 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r3
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r13.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin"
            java.lang.String r7 = "onMicUserChanged"
            java.lang.String r8 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x024a:
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r0)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x029a
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r2 = r0.f154074q
            java.lang.String r0 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r0)
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0297 }
            r0.<init>()     // Catch:{ all -> 0x0297 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0297 }
        L_0x026b:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0297 }
            if (r5 == 0) goto L_0x0287
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0297 }
            r6 = r5
            al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x0297 }
            java.lang.Boolean r6 = r6.f152016t     // Catch:{ all -> 0x0297 }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0297 }
            boolean r6 = gy3.C87412m.m108589b(r6, r7)     // Catch:{ all -> 0x0297 }
            r6 = r6 ^ r14
            if (r6 == 0) goto L_0x026b
            r0.add(r5)     // Catch:{ all -> 0x0297 }
            goto L_0x026b
        L_0x0287:
            monitor-exit(r2)
            int r0 = r0.size()
            r2 = 2
            if (r0 < r2) goto L_0x029a
            sl1.j r0 = r1.f181572w
            if (r0 == 0) goto L_0x02a1
            r0.mo88797M0(r14)
            goto L_0x02a1
        L_0x0297:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x029a:
            sl1.j r0 = r1.f181572w
            if (r0 == 0) goto L_0x02a1
            r0.mo88797M0(r4)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.C64039c.mo11992m0(java.util.LinkedHashMap):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C0654b.class;
        if (!C62042e.f176370a.mo87027N0()) {
            pq4 pq4 = null;
            Integer valueOf = yVar != null ? Integer.valueOf(yVar.getType()) : null;
            if (valueOf != null && valueOf.intValue() == 30 && i == 0 && i2 == 0) {
                Log.m105924i("FinderLiveLotteryBubblePlugin", "#onSceneEnd MMFunc_VerifyUser");
                C114799u reqResp = yVar.getReqResp();
                C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                if (aVar instanceof pq4) {
                    pq4 = (pq4) aVar;
                }
                if (pq4 != null && ((C0654b) mo87696x0(cls)).f1544f && C87412m.m108589b(pq4.f139905d, ((C0654b) mo87696x0(cls)).f1545g)) {
                    mo88789c1();
                }
            }
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 27) {
            C13712a aVar = this.f181571v;
            if (aVar != null) {
                ((C13717e) aVar).onDetach();
            }
        } else if (ordinal == 139) {
            mo88791e1("FINDER_LIVE_LOTTERY_UPDATE");
            mo88792f1();
        } else if (ordinal != 141) {
            switch (ordinal) {
                case 133:
                    mo88791e1("FINDER_LIVE_CREATE_LOTTERY_SUCCESS");
                    mo88792f1();
                    return;
                case 134:
                    mo88791e1("FINDER_LIVE_CANCEL_LOTTERY_SUCCESS");
                    mo88792f1();
                    return;
                case 135:
                    C0082q qVar = ((C13022d0) mo87696x0(C13022d0.class)).f37098n;
                    boolean z = qVar != null && qVar.f506a == 4;
                    Log.m105924i("FinderLiveLotteryBubblePlugin", "FINDER_LIVE_LOTTERY_BUBBLE_SHOW  isCancel: " + z + " getVisible: " + mo14483f0() + " cacheVisibility:" + false + ",screenclear:" + ((C54991o) mo87696x0(cls)).f154286Z);
                    mo88791e1("FINDER_LIVE_LOTTERY_BUBBLE_SHOW cacheVisibility:false");
                    if (mo14483f0() != 0 && !z) {
                        mo10792g(0);
                        C64042j jVar = this.f181572w;
                        if (jVar != null) {
                            jVar.mo11421k0();
                        }
                    }
                    if (this.f181567r.getLiveRole() == 0) {
                        C7335d c = C86312j.m106911c(C54116w.class);
                        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                        C54116w.my0((C54116w) c, C54067f0.C0071v0.EXPOSURE_BLESS_BAG, "", (String) null, 0, 12, (Object) null);
                        return;
                    }
                    return;
                case 136:
                    Log.m105924i("FinderLiveLotteryBubblePlugin", "FINDER_LIVE_LOTTERY_BUBBLE_HIDE cacheVisibility:" + false + ",screenclear:" + ((C54991o) mo87696x0(cls)).f154286Z);
                    mo88791e1("FINDER_LIVE_LOTTERY_BUBBLE_HIDE cacheVisibility:false");
                    mo10792g(8);
                    C64042j jVar2 = this.f181572w;
                    if (jVar2 != null) {
                        jVar2.mo86889H0();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            mo88789c1();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        StringBuilder sb = new StringBuilder();
        sb.append("unMount ");
        sb.append(hashCode());
        sb.append(" presenter is empty:");
        boolean z = false;
        sb.append(this.f181571v == null);
        sb.append(",viewCallback is empty:");
        if (this.f181572w == null) {
            z = true;
        }
        sb.append(z);
        Log.m105924i("FinderLiveLotteryBubblePlugin", sb.toString());
        super.mo3211w0();
        C13712a aVar = this.f181571v;
        if (aVar != null) {
            ((C13717e) aVar).onDetach();
        }
        C64042j jVar = this.f181572w;
        if (jVar != null) {
            jVar.mo86889H0();
        }
        mo10792g(8);
        this.f181572w = null;
        C86709a0.m107524d().mo123470p(30, this);
        C53973z1 z1Var = this.f181569t;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
