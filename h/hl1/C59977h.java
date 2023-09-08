package hl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import al1.C54129i;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cj1.C54738b1;
import cl1.C0668l;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import dj1.C58284o;
import fh1.C58989a;
import fh1.C59004d;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import kotlin.ResultKt;
import nk1.C11207i;
import ok1.C62042e;
import p165hr.C60106t;
import pe3.C89349b;
import qj1.C12669t4;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sg1.C63888h;
import sg1.C63889i;
import sk1.C63947a;
import te3.C49712hj1;
import te3.C52153yq0;
import te3.C64337e61;
import te3.C64390ga1;
import te3.C64414h71;
import tf0.C13887q1;
import vk1.C65762c;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;
import zk1.C66880s0;

/* renamed from: hl1.h */
public final class C59977h {

    /* renamed from: a */
    public static final C59977h f171128a = new C59977h();

    /* renamed from: b */
    public static final C13601g f171129b = C36568h.m40985a(C32943c.f89528d);

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorLivingHelper$checkChargeLiveInvalid$1", mo125469f = "FinderLiveVisitorLivingHelper.kt", mo125470l = {201}, mo125471m = "invokeSuspend")
    /* renamed from: hl1.h$a */
    public static final class C8552a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f27626d;

        /* renamed from: e */
        public final /* synthetic */ C59988k f27627e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorLivingHelper$checkChargeLiveInvalid$1$invalid$1", mo125469f = "FinderLiveVisitorLivingHelper.kt", mo125470l = {202}, mo125471m = "invokeSuspend")
        /* renamed from: hl1.h$a$a */
        public static final class C8553a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

            /* renamed from: d */
            public int f27628d;

            /* renamed from: e */
            public final /* synthetic */ C59988k f27629e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8553a(C59988k kVar, C15601d<? super C8553a> dVar) {
                super(2, dVar);
                this.f27629e = kVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C8553a(this.f27629e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C8553a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                Class cls = C55001u.class;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f27628d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = ((C55001u) this.f27629e.mo83051g(cls)).f154416j;
                    String str = ((C55001u) this.f27629e.mo83051g(cls)).f154423t;
                    long j2 = ((C55001u) this.f27629e.mo83051g(cls)).f154420q.f182392d;
                    this.f27628d = 1;
                    obj = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13359tY(j, str, j2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8552a(C59988k kVar, C15601d<? super C8552a> dVar) {
            super(2, dVar);
            this.f27627e = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8552a(this.f27627e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8552a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C12669t4 t4Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f27626d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C8553a aVar2 = new C8553a(this.f27627e, (C15601d<? super C8553a>) null);
                this.f27626d = 1;
                obj = C53895h.m60469g(h0Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                ((C60106t) C86312j.m106911c(C60106t.class)).yx0().mo9438Ow(((C55001u) this.f27627e.mo83051g(C55001u.class)).f154420q.f182392d);
                C62042e.f176370a.mo87041S1(this.f27627e.f166847e, "charge live invalid!");
                C65762c cVar = this.f27627e.f166848f;
                if (cVar != null) {
                    C58124b.C7172a.m7372a(cVar, C58124b.C58125b.FINDER_LIVE_CHARGE_FREE_TIME_OVER, (Bundle) null, 2, (Object) null);
                }
                C65762c cVar2 = this.f27627e.f166848f;
                if (!(cVar2 == null || (t4Var = (C12669t4) cVar2.getPlugin(C12669t4.class)) == null)) {
                    t4Var.mo12249c1();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hl1.h$b */
    public static final class C8554b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59988k f27630d;

        /* renamed from: e */
        public final /* synthetic */ long f27631e;

        public C8554b(C59988k kVar, long j) {
            this.f27630d = kVar;
            this.f27631e = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r1 = (qj1.C12475jc) r1.getPlugin(qj1.C12475jc.class);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                java.lang.Class<cl1.l> r0 = cl1.C0668l.class
                hl1.k r1 = r13.f27630d
                vk1.c r1 = r1.f166848f
                r2 = 0
                if (r1 == 0) goto L_0x0017
                java.lang.Class<qj1.jc> r3 = qj1.C12475jc.class
                qj1.c r1 = r1.getPlugin(r3)
                qj1.jc r1 = (qj1.C12475jc) r1
                if (r1 == 0) goto L_0x0017
                android.view.ViewGroup r1 = r1.f166287d
                r10 = r1
                goto L_0x0018
            L_0x0017:
                r10 = r2
            L_0x0018:
                hl1.k r1 = r13.f27630d
                vk1.c r1 = r1.f166848f
                if (r1 == 0) goto L_0x0048
                java.lang.Class<qj1.e4> r3 = qj1.C12317e4.class
                qj1.c r1 = r1.getPlugin(r3)
                r3 = r1
                qj1.e4 r3 = (qj1.C12317e4) r3
                if (r3 == 0) goto L_0x0048
                qj1.e4$b r4 = qj1.C12317e4.C12319b.CHARGE_FREE
                r5 = 1
                hl1.k r1 = r13.f27630d
                androidx.lifecycle.i0 r1 = r1.mo83051g(r0)
                cl1.l r1 = (cl1.C0668l) r1
                te3.e61 r1 = r1.mo630d3()
                if (r1 == 0) goto L_0x003c
                java.lang.String r2 = r1.f182927n
            L_0x003c:
                r6 = r2
                r7 = 0
                r8 = 0
                r11 = 24
                r12 = 0
                boolean r1 = qj1.C12317e4.m11869Z0(r3, r4, r5, r6, r7, r8, r10, r11, r12)
                goto L_0x0049
            L_0x0048:
                r1 = 0
            L_0x0049:
                hl1.k r2 = r13.f27630d
                java.lang.String r2 = r2.f171222i
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "checkLiveCharge show promoteInfo delay:"
                r3.append(r4)
                long r4 = r13.f27631e
                r3.append(r4)
                java.lang.String r4 = ", result:"
                r3.append(r4)
                r3.append(r1)
                r4 = 33
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                if (r1 == 0) goto L_0x0085
                hl1.k r1 = r13.f27630d
                androidx.lifecycle.i0 r0 = r1.mo83051g(r0)
                cl1.l r0 = (cl1.C0668l) r0
                te3.e61 r0 = r0.mo630d3()
                if (r0 != 0) goto L_0x0081
                goto L_0x0085
            L_0x0081:
                java.lang.String r1 = ""
                r0.f182927n = r1
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hl1.C59977h.C8554b.run():void");
        }
    }

    /* renamed from: hl1.h$c */
    public static final class C32943c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C32943c f89528d = new C32943c();

        public C32943c() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (C32444a.f86095R0.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public final void mo84860a(C59988k kVar) {
        C87412m.m108594g(kVar, "<this>");
        String str = kVar.f171222i;
        Log.m105924i(str, "checkChargeLiveInvalid live info:" + C63947a.f181274a.mo88736v(((C55001u) kVar.mo83051g(C55001u.class)).f154420q));
        if (((C0668l) kVar.mo83051g(C0668l.class)).mo631g3()) {
            C65762c cVar = kVar.f166848f;
            C65762c cVar2 = cVar instanceof C56032b ? cVar : null;
            if (cVar2 != null) {
                C11207i.m11070f(cVar2, (C66212f) null, (C53934p0) null, new C8552a(kVar, (C15601d<? super C8552a>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo84861b(C59988k kVar) {
        C65762c cVar;
        C58989a aVar;
        C12669t4 t4Var;
        C12669t4 t4Var2;
        ViewGroup viewGroup;
        C58989a aVar2;
        Class cls = C12669t4.class;
        Class cls2 = C58989a.class;
        Class cls3 = C0668l.class;
        Class cls4 = C55001u.class;
        C87412m.m108594g(kVar, "<this>");
        String str = kVar.f171222i;
        Log.m105924i(str, "checkLiveCharge info:" + C63947a.f181274a.mo88736v(((C55001u) kVar.mo83051g(cls4)).f154420q));
        C13598b0 b0Var = null;
        boolean z = true;
        if (C0668l.m589e3((C0668l) kVar.mo83051g(cls3), (C64337e61) null, 1, (Object) null)) {
            if (C32444a.f86111W1.mo60266n().intValue() == 1) {
                C62042e.f176370a.mo87022L1(kVar.f166847e, 8192, 8192);
            } else {
                C62042e.f176370a.mo87127x(kVar.f166847e, 8192);
            }
            C64337e61 d3 = ((C0668l) kVar.mo83051g(cls3)).mo630d3();
            if (d3 != null && d3.f182921e) {
                C65762c cVar2 = kVar.f166848f;
                if (cVar2 != null) {
                    cVar2.applyLiveScene(0);
                }
                C65762c cVar3 = kVar.f166848f;
                if (!(cVar3 == null || (aVar2 = (C58989a) cVar3.getController(cls2)) == null)) {
                    aVar2.mo84225o3();
                }
                C65762c cVar4 = kVar.f166848f;
                if (cVar4 == null || (t4Var2 = (C12669t4) cVar4.getPlugin(cls)) == null || (viewGroup = t4Var2.f166287d) == null || viewGroup.getVisibility() != 0) {
                    z = false;
                }
                long j = z ? 300 : 0;
                C65762c cVar5 = kVar.f166848f;
                if (cVar5 != null) {
                    cVar5.postDelayed(new C8554b(kVar, j), j);
                    return;
                }
                return;
            }
            C65762c cVar6 = kVar.f166848f;
            if (cVar6 != null) {
                cVar6.applyLiveScene(1);
            }
            C12669t4 t4Var3 = kVar.f171170L1;
            if (t4Var3 != null) {
                t4Var3.mo12252f1(C63889i.f181100a.mo88654a(((C55001u) kVar.mo83051g(cls4)).f154420q.f182392d, ((C0668l) kVar.mo83051g(cls3)).f1577j), true);
            }
            if (((C60106t) C86312j.m106911c(C60106t.class)).yx0().mo9441qq(((C55001u) kVar.mo83051g(cls4)).f154420q.f182392d)) {
                C62042e.f176370a.mo87041S1(kVar.f166847e, "charge live invalid!");
                C65762c cVar7 = kVar.f166848f;
                if (cVar7 != null && (t4Var = (C12669t4) cVar7.getPlugin(cls)) != null) {
                    t4Var.mo12249c1();
                    return;
                }
                return;
            }
            C64390ga1 ga12 = ((C0668l) kVar.mo83051g(cls3)).f1577j;
            if (!(ga12 == null || (cVar = kVar.f166848f) == null || (aVar = (C58989a) cVar.getController(cls2)) == null)) {
                long j2 = ((C55001u) kVar.mo83051g(cls4)).f154420q.f182392d;
                String str2 = aVar.f168783j;
                StringBuilder sb = new StringBuilder();
                sb.append("startChargeLiveCountDown liveId:");
                sb.append(j2);
                sb.append(",t");
                sb.append("FinderLiveUrlOption:[" + ga12.f183296e + ',' + ga12.f183298g + ']');
                sb.append('!');
                Log.m105924i(str2, sb.toString());
                if (aVar.f168784n == null) {
                    C63888h hVar = new C63888h(1, j2, 0, 0, 12, (C8480h) null);
                    hVar.f181092f = new C59004d(aVar);
                    aVar.f168784n = hVar;
                }
                C63888h hVar2 = aVar.f168784n;
                if (hVar2 != null) {
                    hVar2.mo88652c(ga12);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e(kVar.f171222i, "checkLiveCharge but trialInfo is null!");
                return;
            }
            return;
        }
        C62042e.f176370a.mo87127x(kVar.f166847e, 8192);
    }

    /* renamed from: c */
    public final void mo84862c(C59988k kVar) {
        Intent intent;
        String stringExtra;
        C54738b1 b1Var;
        String str;
        C59988k kVar2 = kVar;
        Class cls = C55001u.class;
        C87412m.m108594g(kVar2, "<this>");
        if (((Boolean) ((C36570n) f171129b).getValue()).booleanValue()) {
            ((C0668l) kVar2.mo83051g(C0668l.class)).mo633j3(1);
            C65762c cVar = kVar2.f166848f;
            if (cVar != null) {
                C62042e.f176370a.mo87055X1(kVar2.f166851d, cVar, false);
            }
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            feedUpdateEvent.f9173d.f9174a = ((C55001u) kVar2.mo83051g(cls)).f154420q.f182392d;
            feedUpdateEvent.f9173d.f9175b = 14;
            feedUpdateEvent.publish();
            C65762c cVar2 = kVar2.f166848f;
            if (cVar2 != null) {
                C62042e.f176370a.mo87124v1(kVar2.f166851d, cVar2);
            }
            C65762c cVar3 = kVar2.f166848f;
            if (cVar3 != null) {
                C56032b.hideLoadingLayer$default(cVar3, false, 1, (Object) null);
                return;
            }
            return;
        }
        Class<C66880s0> cls2 = C66880s0.class;
        Class cls3 = C54991o.class;
        long j = ((C55001u) kVar2.mo83051g(cls)).f154420q.f182392d;
        String O5 = C66785b.f191882e.mo90662O5();
        long j2 = ((C55001u) kVar2.mo83051g(cls)).f154416j;
        String str2 = ((C55001u) kVar2.mo83051g(cls)).f154423t;
        String str3 = ((C55001u) kVar2.mo83051g(cls)).f154424u;
        String str4 = ((C54991o) kVar2.mo83051g(cls3)).f154204G2;
        int i = ((C54991o) kVar2.mo83051g(cls3)).f154208H2;
        C49712hj1 hj12 = kVar2.f166850h;
        C52153yq0 yq02 = ((C54991o) kVar2.mo83051g(cls3)).f154344n3;
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        String str5 = aVar != null ? aVar.f173005Q0 : null;
        C54129i iVar = FinderLiveService.f159398z;
        String str6 = (iVar == null || (b1Var = iVar.f151991f) == null || (str = b1Var.f153437z) == null) ? "" : str;
        String str7 = str4;
        C49712hj1 hj13 = hj12;
        int i2 = i;
        Class<C66880s0> cls4 = cls2;
        String str8 = ((C55001u) kVar2.mo83051g(cls)).f154426w;
        C64414h71 H = C62042e.f176370a.mo87008H(kVar2.f166847e, ((C55001u) kVar2.mo83051g(cls)).f154420q.f182392d, kVar2.f171222i);
        String str9 = str2;
        long j3 = ((C55001u) kVar2.mo83051g(cls)).f154414h;
        AppCompatActivity appCompatActivity = kVar2.f166847e;
        if (!(appCompatActivity instanceof Activity)) {
            appCompatActivity = null;
        }
        C58284o oVar = r5;
        C58284o oVar2 = new C58284o(j, (byte[]) null, O5, j2, 2, str9, str3, str7, i2, hj13, 0, yq02, str5, str6, 0, str8, H, j3, 0, (appCompatActivity == null || (intent = appCompatActivity.getIntent()) == null || (stringExtra = intent.getStringExtra("key_enter_live_param_source_web_url")) == null) ? "" : stringExtra, (C89349b) null, 1328128, (C8480h) null);
        C39818r rVar = C39818r.f106831a;
        Class<C66880s0> cls5 = cls4;
        C58284o oVar3 = oVar;
        ((C66880s0) rVar.mo62444c(kVar2.f166847e).mo75002a(cls5)).mo90876d3(oVar3.f166895v);
        ((C66880s0) rVar.mo62444c(kVar2.f166847e).mo75002a(cls5)).mo90877e3(((C55001u) kVar2.mo83051g(cls)).f154414h, oVar3.f166895v.f186166d);
        oVar3.mo9225i().mo123420E(new C59980i(kVar2));
    }
}
