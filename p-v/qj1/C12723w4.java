package qj1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C0047e0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import bp1.C54519d;
import cj1.C0630w0;
import cj1.C0638y0;
import cj1.C54809s0;
import cl1.C0668l;
import cl1.C0689t;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import dj1.C58291w0;
import er1.C58739j4;
import f40.C86709a0;
import fh1.C58989a;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C8777j5;
import ik1.C8923b;
import jp3.C9487b;
import kotlin.ResultKt;
import m53.C10756c;
import m53.C10761g;
import nj3.C76912y0;
import nk1.C11207i;
import nr3.C89059e;
import o40.C61926c;
import org.json.JSONObject;
import p165hr.C60106t;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sg1.C63888h;
import sk1.C63947a;
import sx3.C64186f0;
import te3.C49712hj1;
import te3.C64337e61;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: qj1.w4 */
public final class C12723w4 {

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveChargePayPluginExKt$payForLive$1", mo125469f = "FinderLiveChargePayPluginEx.kt", mo125470l = {234, 246}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.w4$a */
    public static final class C12724a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f36449d;

        /* renamed from: e */
        public long f36450e;

        /* renamed from: f */
        public int f36451f;

        /* renamed from: g */
        public final /* synthetic */ C12669t4 f36452g;

        /* renamed from: h */
        public final /* synthetic */ boolean f36453h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveChargePayPluginExKt$payForLive$1$paySuccess$1", mo125469f = "FinderLiveChargePayPluginEx.kt", mo125470l = {247}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.w4$a$a */
        public static final class C12725a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

            /* renamed from: d */
            public int f36454d;

            /* renamed from: e */
            public final /* synthetic */ long f36455e;

            /* renamed from: f */
            public final /* synthetic */ long f36456f;

            /* renamed from: g */
            public final /* synthetic */ String f36457g;

            /* renamed from: h */
            public final /* synthetic */ C12669t4 f36458h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12725a(long j, long j2, String str, C12669t4 t4Var, C15601d<? super C12725a> dVar) {
                super(2, dVar);
                this.f36455e = j;
                this.f36456f = j2;
                this.f36457g = str;
                this.f36458h = t4Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12725a(this.f36455e, this.f36456f, this.f36457g, this.f36458h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12725a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f36454d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C12669t4 t4Var = this.f36458h;
                    long j = this.f36455e;
                    long j2 = this.f36456f;
                    String str = this.f36457g;
                    int i2 = t4Var.f36278B;
                    this.f36454d = 1;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    Log.m105924i("FinderLiveChargePayPluginEx", "pay, giftId:" + null + " price:" + i2 + ",comboId:" + str + ",liveId:" + j + ",objectId:" + j2);
                    Context context = t4Var.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    C45795b A0 = t4Var.mo87684A0();
                    C12734x4 x4Var = new C12734x4(hVar, t4Var);
                    Class cls = C55001u.class;
                    C87412m.m108594g(A0, "buContext");
                    C54991o oVar = (C54991o) A0.mo71262a(C54991o.class);
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo175911u(1581, 70);
                    String O5 = C66785b.f191882e.mo90662O5();
                    String n = C58739j4.f168176a.mo83718n();
                    nVar.mo160131h(22129, 1, n, "", 1, 1, 0, "");
                    C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62443b(context).mo62447c(C60172g4.class)).mo12861q3();
                    long j3 = ((C55001u) A0.mo71262a(cls)).f154420q.f182392d;
                    long j4 = ((C55001u) A0.mo71262a(cls)).f154416j;
                    String str2 = ((C55001u) A0.mo71262a(cls)).f154424u;
                    byte[] bArr = ((C55001u) A0.mo71262a(cls)).f154417n;
                    C64186f0 f0Var = C64186f0.f181907d;
                    C54809s0 s0Var = r8;
                    C66218h hVar2 = hVar;
                    String str3 = str;
                    C54809s0 s0Var2 = new C54809s0(i2, x4Var, n, context, 7, (String) null, 1, str3);
                    C89059e i3 = new C58291w0(j3, j4, (String) null, 1, O5, i2, n, str3, "", q3, str2, 1, (C89349b) null, bArr, f0Var, (String) null, (String) null, s0Var).mo9225i();
                    if (context instanceof MMActivity) {
                        i3.mo11397F((C9487b) context);
                    }
                    Object b = hVar2.mo90314b();
                    return b == aVar ? aVar : b;
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveChargePayPluginExKt$payForLive$1$wecoinResult$1", mo125469f = "FinderLiveChargePayPluginEx.kt", mo125470l = {235}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.w4$a$b */
        public static final class C12726b extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends Boolean, ? extends Long>>, Object> {

            /* renamed from: d */
            public int f36459d;

            public C12726b(C15601d<? super C12726b> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12726b(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                return new C12726b((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f36459d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f36459d = 1;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    long currentTimeMillis = System.currentTimeMillis();
                    C12266c5 c5Var = new C12266c5(currentTimeMillis, hVar);
                    Log.m105924i("FinderLiveAssistant2", "[WeCoin] getWeCoinBalance: requestId:" + currentTimeMillis);
                    ((C10756c) C86709a0.m107533q(C10756c.class)).mo11000qy(new C0630w0(currentTimeMillis, c5Var));
                    obj = hVar.mo90314b();
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
        public C12724a(C12669t4 t4Var, boolean z, C15601d<? super C12724a> dVar) {
            super(2, dVar);
            this.f36452g = t4Var;
            this.f36453h = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12724a(this.f36452g, this.f36453h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12724a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Class<cl1.u> r1 = cl1.C55001u.class
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r0.f36451f
                r4 = 0
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L_0x0031
                if (r3 == r6) goto L_0x0027
                if (r3 != r5) goto L_0x001f
                long r1 = r0.f36450e
                java.lang.Object r3 = r0.f36449d
                qo3.i0 r3 = (qo3.C89779i0) r3
                kotlin.ResultKt.throwOnFailure(r18)
                r4 = r18
                goto L_0x00e5
            L_0x001f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0027:
                java.lang.Object r3 = r0.f36449d
                qo3.i0 r3 = (qo3.C89779i0) r3
                kotlin.ResultKt.throwOnFailure(r18)
                r6 = r18
                goto L_0x0062
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r18)
                qj1.t4 r3 = r0.f36452g
                android.view.ViewGroup r3 = r3.f166287d
                android.content.Context r3 = r3.getContext()
                qj1.t4 r8 = r0.f36452g
                android.view.ViewGroup r8 = r8.f166287d
                android.content.Context r8 = r8.getContext()
                r9 = 2131821739(0x7f1104ab, float:1.927623E38)
                java.lang.String r8 = r8.getString(r9)
                r9 = 3
                qo3.i0 r3 = qo3.C89779i0.m112248e(r3, r8, r4, r9, r7)
                a14.h0 r8 = a14.C53872d1.f151119c
                qj1.w4$a$b r9 = new qj1.w4$a$b
                r9.<init>(r7)
                r0.f36449d = r3
                r0.f36451f = r6
                java.lang.Object r6 = a14.C53895h.m60469g(r8, r9, r0)
                if (r6 != r2) goto L_0x0062
                return r2
            L_0x0062:
                rx3.l r6 = (rx3.C13604l) r6
                A r8 = r6.f38555d
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x0110
                B r4 = r6.f38556e
                java.lang.Number r4 = (java.lang.Number) r4
                long r8 = r4.longValue()
                qj1.t4 r4 = r0.f36452g
                int r6 = r4.f36278B
                long r10 = (long) r6
                int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r6 < 0) goto L_0x00f6
                androidx.lifecycle.i0 r4 = r4.mo87696x0(r1)
                cl1.u r4 = (cl1.C55001u) r4
                te3.c21 r4 = r4.f154420q
                long r14 = r4.f182392d
                qj1.t4 r4 = r0.f36452g
                androidx.lifecycle.i0 r1 = r4.mo87696x0(r1)
                cl1.u r1 = (cl1.C55001u) r1
                long r11 = r1.f154416j
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = eb0.C75592q0.m90789s()
                if (r4 == 0) goto L_0x00aa
                java.nio.charset.Charset r6 = z04.C119027c.f356488a
                byte[] r7 = r4.getBytes(r6)
                java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
                gy3.C87412m.m108593f(r7, r4)
            L_0x00aa:
                java.lang.String r4 = p823sg.C90193h.m112878f(r7)
                r1.append(r4)
                r4 = 95
                r1.append(r4)
                java.util.UUID r4 = java.util.UUID.randomUUID()
                r1.append(r4)
                java.lang.String r13 = r1.toString()
                a14.h0 r1 = a14.C53872d1.f151119c
                qj1.w4$a$a r4 = new qj1.w4$a$a
                qj1.t4 r6 = r0.f36452g
                r7 = 0
                r8 = r4
                r9 = r14
                r18 = r1
                r16 = r2
                r1 = r14
                r14 = r6
                r15 = r7
                r8.<init>(r9, r11, r13, r14, r15)
                r0.f36449d = r3
                r0.f36450e = r1
                r0.f36451f = r5
                r5 = r18
                java.lang.Object r4 = a14.C53895h.m60469g(r5, r4, r0)
                r5 = r16
                if (r4 != r5) goto L_0x00e5
                return r5
            L_0x00e5:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x00f2
                qj1.t4 r4 = r0.f36452g
                qj1.C12723w4.m12224c(r4, r1)
            L_0x00f2:
                r3.dismiss()
                goto L_0x0135
            L_0x00f6:
                r3.dismiss()
                boolean r1 = r0.f36453h
                if (r1 == 0) goto L_0x0105
                qj1.t4 r1 = r0.f36452g
                r2 = 16
                qj1.C12723w4.m12222a(r1, r2)
                goto L_0x0135
            L_0x0105:
                qj1.t4 r1 = r0.f36452g
                qj1.b5 r2 = new qj1.b5
                r2.<init>(r1)
                o40.C61926c.m72668M(r2)
                goto L_0x0135
            L_0x0110:
                r3.dismiss()
                qj1.t4 r1 = r0.f36452g
                android.view.ViewGroup r1 = r1.f166287d
                android.content.Context r1 = r1.getContext()
                qj1.t4 r2 = r0.f36452g
                android.view.ViewGroup r2 = r2.f166287d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131827139(0x7f1119c3, float:1.9287182E38)
                java.lang.String r2 = r2.getString(r3)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r4)
                r1.show()
            L_0x0135:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12723w4.C12724a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m12222a(C12669t4 t4Var, int i) {
        long j;
        Class cls = C54116w.class;
        Class cls2 = C54991o.class;
        if (t4Var.f166287d.getContext() instanceof FragmentActivity) {
            StringBuilder sb = new StringBuilder();
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C54991o oVar = (C54991o) finderLiveService.mo77630e(cls2);
            boolean z = false;
            if (oVar != null && oVar.f154287Z0 == 2) {
                C54519d dVar = (C54519d) finderLiveService.mo77630e(C54519d.class);
                j = dVar != null ? dVar.f152847g : 0;
            } else {
                j = ((C54116w) C86312j.m106911c(cls)).f151950p;
            }
            sb.append(j);
            sb.append('_');
            sb.append(System.currentTimeMillis());
            String sb4 = sb.toString();
            Context context = t4Var.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            C12766z4 z4Var = new C12766z4(t4Var);
            C87412m.m108594g(sb4, "sessionId");
            Log.m105924i("FinderLiveAssistant2", "showRechargeFoodsDialog sessionId:" + sb4);
            C10761g gVar = new C10761g();
            gVar.f32222a = i;
            gVar.f32224c = sb4;
            gVar.f32225d = new C0638y0(fragmentActivity, z4Var);
            ((C10756c) C86709a0.m107533q(C10756c.class)).q10(fragmentActivity, gVar);
            if (i == 16) {
                C0047e0 e0Var = C0047e0.f58a;
                if (((C54991o) t4Var.mo87696x0(cls2)).f154287Z0 == 2) {
                    z = true;
                }
                long j2 = ((C55001u) t4Var.mo87696x0(C55001u.class)).f154416j;
                if (z) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("object_id", C61926c.m72691p(j2));
                    e0Var.mo54a(jSONObject);
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "this.toString()");
                    ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_pay", jSONObject2);
                    return;
                }
                ((C54116w) C86312j.m106911c(cls)).Nx0(C54067f0.C54076o0.CHARGE_LIVE, 6, System.currentTimeMillis() - ((C54116w) C86312j.m106911c(cls)).f151950p);
            }
        }
    }

    /* renamed from: b */
    public static final void m12223b(C12669t4 t4Var, boolean z) {
        C87412m.m108594g(t4Var, "<this>");
        Log.printInfoStack("FinderLiveChargePayPluginEx", "payForLive fromClick:" + z, new Object[0]);
        if (z) {
            C0047e0.f58a.mo55c(false, ((C54991o) t4Var.mo87696x0(C54991o.class)).f154287Z0 == 2, ((C55001u) t4Var.mo87696x0(C55001u.class)).f154416j);
        }
        C11207i.m11067c(t4Var, (C66212f) null, (C53934p0) null, new C12724a(t4Var, z, (C15601d<? super C12724a>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public static final void m12224c(C12669t4 t4Var, long j) {
        C63888h hVar;
        C12669t4 t4Var2 = t4Var;
        long j2 = j;
        Class cls = C54519d.class;
        Class cls2 = C0689t.class;
        Class cls3 = C55001u.class;
        C87412m.m108594g(t4Var2, "<this>");
        if (((C0689t) t4Var2.mo87696x0(cls2)).mo649c3()) {
            ((C0689t) t4Var2.mo87696x0(cls2)).f1625g = true;
        }
        t4Var2.mo12250d1(false);
        C0668l lVar = (C0668l) t4Var2.mo87696x0(C0668l.class);
        StringBuilder sb = new StringBuilder();
        sb.append("before setPurchased ");
        sb.append(true);
        sb.append(',');
        C63947a aVar = C63947a.f181274a;
        sb.append(aVar.mo88736v(((C55001u) lVar.business(cls3)).f154420q));
        Log.m105924i("LiveChargeSlice", sb.toString());
        C64337e61 d3 = lVar.mo630d3();
        if (d3 != null) {
            d3.f182921e = true;
        }
        Log.m105924i("LiveChargeSlice", "after setPurchased " + true + ',' + aVar.mo88736v(((C55001u) lVar.business(cls3)).f154420q));
        C76912y0.m92769h(t4Var2.f166287d.getContext(), t4Var2.f166287d.getContext().getString(C0966R.string.dj9), C0966R.raw.icons_outlined_done);
        C58989a aVar2 = (C58989a) t4Var2.mo87685B0(C58989a.class);
        if (!(aVar2 == null || (hVar = aVar2.f168784n) == null)) {
            hVar.mo88650a(((C55001u) t4Var2.mo87696x0(cls3)).f154420q.f182392d, true, true);
        }
        C8923b bVar = (C8923b) ((C60106t) C86312j.m106911c(C60106t.class)).yx0();
        if (!bVar.f28224f) {
            bVar.mo9437Lo();
        }
        C8923b.C8924a aVar3 = bVar.f28225g.get(Long.valueOf(j));
        if (aVar3 != null) {
            aVar3.f28229d = 1;
            aVar3.f28230e = 0;
        } else {
            C8923b.C8924a aVar4 = r1;
            C8923b.C8924a aVar5 = new C8923b.C8924a(j, 0, 0, 1, 0);
            C8923b.C8924a put = bVar.f28225g.put(Long.valueOf(j), aVar4);
        }
        C8923b.C8924a aVar6 = bVar.f28225g.get(Long.valueOf(j));
        C87412m.m108593f(aVar6, "chargeInfoCache.get(liveId)");
        bVar.mo9735bD(j2, aVar6);
        Log.m105924i("FinderLiveChargeInfoStorage", "setPayForLive liveId:" + j2 + ",cache size:" + bVar.f28225g.size());
        C58124b.C7172a.m7372a(t4Var2.f36285q, C58124b.C58125b.FINDER_LIVE_CHARGE_PAY_SUCESS, (Bundle) null, 2, (Object) null);
        C55001u uVar = (C55001u) FinderLiveService.f159376d.mo77630e(cls3);
        if (uVar != null) {
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar7 = feedUpdateEvent.f9173d;
            aVar7.f9174a = uVar.f154420q.f182392d;
            aVar7.f9175b = 21;
            aVar7.f9177d = 1;
            feedUpdateEvent.publish();
            FeedUpdateEvent feedUpdateEvent2 = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar8 = feedUpdateEvent2.f9173d;
            aVar8.f9174a = uVar.f154420q.f182392d;
            aVar8.f9175b = 28;
            aVar8.f9177d = 1;
            feedUpdateEvent2.publish();
        }
        t4Var2.mo10792g(8);
        C0047e0 e0Var = C0047e0.f58a;
        int i = t4Var2.f36278B;
        boolean z = ((C54991o) t4Var2.mo87696x0(C54991o.class)).f154287Z0 == 2;
        long j3 = ((C55001u) t4Var2.mo87696x0(cls3)).f154416j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = ((C54519d) t4Var2.mo87696x0(cls)).f152847g;
        long j5 = (j4 <= 0 || j4 >= elapsedRealtime) ? 0 : elapsedRealtime - j4;
        int i2 = ((C54519d) t4Var2.mo87696x0(cls)).f152854q;
        Class cls4 = C54116w.class;
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("object_id", C61926c.m72691p(j3));
            jSONObject.put("amount", i);
            jSONObject.put("duration", j5 <= 0 ? Integer.valueOf(i2) : Long.valueOf(j5));
            e0Var.mo54a(jSONObject);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "this.toString()");
            ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("pay_live_record", jSONObject2);
            return;
        }
        ((C54116w) C86312j.m106911c(cls4)).Nx0(C54067f0.C54076o0.CHARGE_LIVE, 2, System.currentTimeMillis() - ((C54116w) C86312j.m106911c(cls4)).f151950p);
    }
}
