package com.tencent.p014mm.pluginsdk.model;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.autogen.events.FinderLiveStatusRefreshEvent;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import di3.C86312j;
import eb0.C75604z3;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gw0.C76073b;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kr0.C88273g1;
import kr0.C88274h0;
import ob0.C47350c;
import p248ug.C14184u0;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s90.C77627f;
import s90.C77630j;
import sx3.C36907w;
import te3.C118459qf;
import te3.C118474vf;
import te3.C51536uf;
import te3.pg4;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.model.d */
public final class C19428d {

    /* renamed from: A */
    public static boolean f54854A;

    /* renamed from: B */
    public static boolean f54855B;

    /* renamed from: a */
    public static final C19428d f54856a;

    /* renamed from: b */
    public static final C13601g f54857b = C36568h.m40985a(C6656g.f23977d);

    /* renamed from: c */
    public static final MMKVSlotManager f54858c;

    /* renamed from: d */
    public static HashMap<String, Boolean> f54859d = new HashMap<>();

    /* renamed from: e */
    public static String f54860e;

    /* renamed from: f */
    public static final HashMap<String, String> f54861f = new HashMap<>();

    /* renamed from: g */
    public static final C13601g f54862g = C36568h.m40985a(C6657n.f23978d);

    /* renamed from: h */
    public static final C13601g f54863h = C36568h.m40985a(C19436o.f54896d);

    /* renamed from: i */
    public static final C13601g f54864i = C36568h.m40985a(C19435m.f54895d);

    /* renamed from: j */
    public static final C13601g f54865j = C36568h.m40985a(C19434l.f54894d);

    /* renamed from: k */
    public static final C13601g f54866k = C36568h.m40985a(C19433k.f54893d);

    /* renamed from: l */
    public static final C13601g f54867l = C36568h.m40985a(C19432j.f54892d);

    /* renamed from: m */
    public static final C13601g f54868m = C36568h.m40985a(C19437p.f54897d);

    /* renamed from: n */
    public static final C13601g f54869n = C36568h.m40985a(C6654e.f23975d);

    /* renamed from: o */
    public static final C13601g f54870o = C36568h.m40985a(C6655f.f23976d);

    /* renamed from: p */
    public static boolean f54871p;

    /* renamed from: q */
    public static boolean f54872q;

    /* renamed from: r */
    public static int f54873r = 2;

    /* renamed from: s */
    public static IListener<FinderLiveStatusRefreshEvent> f54874s;

    /* renamed from: t */
    public static final HashSet<String> f54875t = new HashSet<>();

    /* renamed from: u */
    public static final C13601g f54876u = C36568h.m40985a(C19439d.f54900d);

    /* renamed from: v */
    public static String f54877v;

    /* renamed from: w */
    public static String f54878w;

    /* renamed from: x */
    public static String f54879x;

    /* renamed from: y */
    public static MTimerHandler f54880y;

    /* renamed from: z */
    public static boolean f54881z;

    /* renamed from: com.tencent.mm.pluginsdk.model.d$e */
    public static final class C6654e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C6654e f23975d = new C6654e();

        public C6654e() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_biz_live_bar_item_max_expose_count, 1));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$f */
    public static final class C6655f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C6655f f23976d = new C6655f();

        public C6655f() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_biz_live_red_dot_max_expose_count, 1));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$g */
    public static final class C6656g extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C6656g f23977d = new C6656g();

        public C6656g() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("BizFinderLive");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$n */
    public static final class C6657n extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C6657n f23978d = new C6657n();

        public C6657n() {
            super(0);
        }

        public Object invoke() {
            Integer valueOf = Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_finder_live_2, 125));
            int intValue = valueOf.intValue();
            Log.m105924i("MicroMsg.BizFinderLiveLogic", "openFlag " + intValue);
            return valueOf;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.pluginsdk.model.BizFinderLiveLogic$checkFinderLive$1", mo125469f = "BizFinderLiveLogic.kt", mo125470l = {492}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.pluginsdk.model.d$b */
    public static final class C19429b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f54882d;

        /* renamed from: e */
        public final /* synthetic */ boolean f54883e;

        /* renamed from: f */
        public final /* synthetic */ String f54884f;

        /* renamed from: g */
        public final /* synthetic */ int f54885g;

        /* renamed from: h */
        public final /* synthetic */ C32228q<String, String, Boolean, C13598b0> f54886h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19429b(boolean z, String str, int i, C32228q<? super String, ? super String, ? super Boolean, C13598b0> qVar, C15601d<? super C19429b> dVar) {
            super(2, dVar);
            this.f54883e = z;
            this.f54884f = str;
            this.f54885g = i;
            this.f54886h = qVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C19429b(this.f54883e, this.f54884f, this.f54885g, this.f54886h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C19429b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f54882d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f54883e || C19428d.f54856a.mo25165R(this.f54884f)) {
                    if (C19428d.f54859d.containsKey(this.f54884f)) {
                        return C13598b0.f38549a;
                    }
                    C19428d.f54859d.put(this.f54884f, Boolean.TRUE);
                    Log.m105918d("MicroMsg.BizFinderLiveLogic", "checkFinderLive bizUserName=" + this.f54884f + ", force=" + this.f54883e);
                    C19428d dVar = C19428d.f54856a;
                    int i2 = this.f54885g;
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(this.f54884f);
                    C13598b0 b0Var = C13598b0.f38549a;
                    this.f54882d = 1;
                    obj = dVar.mo25171e(i2, linkedList, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C118474vf vfVar = (C118474vf) obj;
            C19428d.f54859d.remove(this.f54884f);
            LinkedList<C118459qf> linkedList2 = vfVar != null ? vfVar.f354494d : null;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                z = false;
            }
            if (!z) {
                String str = this.f54884f;
                C32228q<String, String, Boolean, C13598b0> qVar = this.f54886h;
                int i3 = this.f54885g;
                for (C118459qf qfVar : linkedList2) {
                    if (Util.isEqual(qfVar.f354270d, str)) {
                        C19428d dVar2 = C19428d.f54856a;
                        if (dVar2.mo25182q(qfVar.f354270d, qfVar.f354271e)) {
                            qVar.invoke(str, qfVar.f354271e, Boolean.TRUE);
                            Log.m105924i("MicroMsg.BizFinderLiveLogic", "checkFinderLive data change bizUserName=" + qfVar.f354270d);
                            dVar2.mo25153F(str, qfVar.f354271e, i3);
                        } else {
                            qVar.invoke(str, qfVar.f354271e, Boolean.FALSE);
                        }
                        dVar2.mo25159L(qfVar);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$c */
    public static final class C19430c implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f54887a;

        /* renamed from: b */
        public final /* synthetic */ C15601d<C118474vf> f54888b;

        /* renamed from: c */
        public final /* synthetic */ int f54889c;

        public C19430c(C8477a0 a0Var, C15601d<? super C118474vf> dVar, int i) {
            this.f54887a = a0Var;
            this.f54888b = dVar;
            this.f54889c = i;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C87412m.m108594g(cVar, "rr");
            Log.m105924i("MicroMsg.BizFinderLiveLogic", "getBizFinderLives callback " + i + ", " + i2);
            C8477a0 a0Var = this.f54887a;
            if (!a0Var.f27482d) {
                boolean z = true;
                a0Var.f27482d = true;
                Integer num = null;
                if (i == 0 && i2 == 0) {
                    try {
                        C19428d dVar = C19428d.f54856a;
                        dVar.mo25155H(1);
                        C47465a aVar = cVar.f127056b.f127083a;
                        if (!(aVar instanceof C118474vf)) {
                            this.f54888b.resumeWith(Result.m168114constructorimpl((Object) null));
                            return;
                        }
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizFinderLiveResp");
                        C118474vf vfVar = (C118474vf) aVar;
                        if (C14184u0.m13519a()) {
                            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
                            if (singleMMKV == null || singleMMKV.decodeInt("BizTimeLineFinderLiveStatus", 1) != 0) {
                                z = false;
                            }
                            if (z) {
                                vfVar.f354494d.clear();
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("getBizFinderLives card scene = ");
                        sb.append(this.f54889c);
                        sb.append(" size=");
                        LinkedList<C118459qf> linkedList = vfVar.f354494d;
                        if (linkedList != null) {
                            num = Integer.valueOf(linkedList.size());
                        }
                        sb.append(num);
                        sb.append(" interval=");
                        sb.append(vfVar.f354497g);
                        sb.append(" funcFlag=");
                        sb.append(vfVar.f354499i);
                        Log.m105924i("MicroMsg.BizFinderLiveLogic", sb.toString());
                        C89349b bVar = vfVar.f354495e;
                        if (bVar != null && bVar.f257327a.length > 0) {
                            dVar.mo25176k().encode("FinderLiveBuffer", vfVar.f354495e.mo123703f());
                        }
                        this.f54888b.resumeWith(Result.m168114constructorimpl(vfVar));
                    } catch (Exception e) {
                        C19428d.f54856a.mo25155H(3);
                        Log.m105920e("MicroMsg.BizFinderLiveLogic", "callback ex " + e.getMessage());
                    }
                } else {
                    C19428d.f54856a.mo25155H(2);
                    this.f54888b.resumeWith(Result.m168114constructorimpl((Object) null));
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.pluginsdk.model.BizFinderLiveLogic$onFinderLiveRedDotNotify$1", mo125469f = "BizFinderLiveLogic.kt", mo125470l = {855}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.pluginsdk.model.d$h */
    public static final class C19431h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f54890d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<String> f54891e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19431h(LinkedList<String> linkedList, C15601d<? super C19431h> dVar) {
            super(2, dVar);
            this.f54891e = linkedList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C19431h(this.f54891e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C19431h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0053 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f54890d
                r2 = 1
                java.lang.String r3 = "MicroMsg.BizFinderLiveLogic"
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0036
            L_0x000f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0017:
                kotlin.ResultKt.throwOnFailure(r13)
                com.tencent.mm.pluginsdk.model.d r13 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
                boolean r1 = com.tencent.p014mm.pluginsdk.model.C19428d.f54881z
                if (r1 == 0) goto L_0x0023
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            L_0x0023:
                com.tencent.p014mm.pluginsdk.model.C19428d.f54881z = r2
                java.lang.String r1 = "onFinderLiveRedDotNotify"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
                r1 = 6
                java.util.LinkedList<java.lang.String> r4 = r12.f54891e
                r12.f54890d = r2
                java.lang.Object r13 = r13.mo25171e(r1, r4, r12)
                if (r13 != r0) goto L_0x0036
                return r0
            L_0x0036:
                te3.vf r13 = (te3.C118474vf) r13
                r0 = 0
                com.tencent.p014mm.pluginsdk.model.C19428d.f54881z = r0
                if (r13 == 0) goto L_0x0040
                java.util.LinkedList<te3.qf> r13 = r13.f354494d
                goto L_0x0041
            L_0x0040:
                r13 = 0
            L_0x0041:
                if (r13 == 0) goto L_0x004c
                boolean r1 = r13.isEmpty()
                if (r1 == 0) goto L_0x004a
                goto L_0x004c
            L_0x004a:
                r1 = 0
                goto L_0x004d
            L_0x004c:
                r1 = 1
            L_0x004d:
                if (r1 != 0) goto L_0x0101
                java.util.Iterator r13 = r13.iterator()
            L_0x0053:
                boolean r1 = r13.hasNext()
                if (r1 == 0) goto L_0x0101
                java.lang.Object r1 = r13.next()
                te3.qf r1 = (te3.C118459qf) r1
                java.lang.String r4 = r1.f354271e
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x0053
                com.tencent.mm.pluginsdk.model.d r4 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
                java.lang.String r5 = r1.f354270d
                if (r5 != 0) goto L_0x006e
                goto L_0x00e3
            L_0x006e:
                com.tencent.mm.sdk.platformtools.MMKVSlotManager r6 = com.tencent.p014mm.pluginsdk.model.C19428d.f54858c
                java.lang.String r5 = r4.mo25170d(r5)
                java.lang.String r7 = ""
                java.lang.String r5 = r6.decodeString(r5, r7)
                java.lang.String r7 = r1.f354271e
                boolean r5 = gy3.C87412m.m108589b(r5, r7)
                if (r5 == 0) goto L_0x0088
                java.lang.String r5 = "canShowOftenReadRedDot same live return!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                goto L_0x00e3
            L_0x0088:
                rx3.g r5 = com.tencent.p014mm.pluginsdk.model.C19428d.f54870o
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                java.lang.String r7 = r1.f354270d
                java.lang.String r8 = "info.bizusername"
                gy3.C87412m.m108593f(r7, r8)
                long r8 = java.lang.System.currentTimeMillis()
                r10 = 86400000(0x5265c00, double:4.2687272E-316)
                long r8 = r8 / r10
                int r9 = (int) r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "date-"
                r8.append(r10)
                r8.append(r9)
                java.lang.String r9 = "-expose-live-red-dot-"
                r8.append(r9)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                int r6 = r6.decodeInt(r7, r0)
                if (r6 < r5) goto L_0x00e5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "canShowOftenReadRedDot return "
                r5.append(r7)
                java.lang.String r7 = r1.f354270d
                r5.append(r7)
                java.lang.String r7 = " : "
                r5.append(r7)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            L_0x00e3:
                r5 = 0
                goto L_0x00e6
            L_0x00e5:
                r5 = 1
            L_0x00e6:
                if (r5 == 0) goto L_0x0053
                java.lang.String r13 = "onFinderLiveRedDotNotify live start!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
                r4.mo25159L(r1)
                java.lang.String r13 = r1.f354270d
                java.lang.String r0 = r1.f354271e
                r4.mo25161N(r13, r0)
                com.tencent.p014mm.storage.C19636w0.m21161c()
                java.lang.String r13 = r1.f354275i
                com.tencent.p014mm.pluginsdk.model.C19428d.f54879x = r13
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            L_0x0101:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19428d.C19431h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$j */
    public static final class C19432j extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19432j f54892d = new C19432j();

        public C19432j() {
            super(0);
        }

        public Object invoke() {
            C19428d dVar = C19428d.f54856a;
            return Boolean.valueOf(dVar.mo25183r() || (dVar.mo25178m() & 16) != 0);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$k */
    public static final class C19433k extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19433k f54893d = new C19433k();

        public C19433k() {
            super(0);
        }

        public Object invoke() {
            C19428d dVar = C19428d.f54856a;
            return Boolean.valueOf(dVar.mo25183r() || (dVar.mo25178m() & 8) != 0);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$l */
    public static final class C19434l extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19434l f54894d = new C19434l();

        public C19434l() {
            super(0);
        }

        public Object invoke() {
            C19428d dVar = C19428d.f54856a;
            return Boolean.valueOf(dVar.mo25183r() || !((dVar.mo25178m() & 4) == 0 || (dVar.mo25180o() & 4) == 0));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$m */
    public static final class C19435m extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19435m f54895d = new C19435m();

        public C19435m() {
            super(0);
        }

        public Object invoke() {
            C19428d dVar = C19428d.f54856a;
            return Boolean.valueOf(dVar.mo25183r() || !((dVar.mo25178m() & 64) == 0 || (dVar.mo25180o() & 2) == 0));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$o */
    public static final class C19436o extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19436o f54896d = new C19436o();

        public C19436o() {
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
            if (r0 != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r5 = this;
                com.tencent.mm.pluginsdk.model.d r0 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
                boolean r1 = r0.mo25183r()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0033
                int r1 = r0.mo25178m()
                r1 = r1 & r3
                if (r1 == 0) goto L_0x0034
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo25176k()
                java.lang.String r1 = "SvrShowFinderLive"
                boolean r0 = r0.decodeBool(r1, r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "SvrShowFinderLive "
                r1.append(r4)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "MicroMsg.BizFinderLiveLogic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                if (r0 == 0) goto L_0x0034
            L_0x0033:
                r2 = 1
            L_0x0034:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19428d.C19436o.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$p */
    public static final class C19437p extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19437p f54897d = new C19437p();

        public C19437p() {
            super(0);
        }

        public Object invoke() {
            C19428d dVar = C19428d.f54856a;
            return Boolean.valueOf(dVar.mo25183r() || (dVar.mo25178m() & 32) != 0);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$a */
    public static final class C19438a {

        /* renamed from: a */
        public boolean f54898a;

        /* renamed from: b */
        public boolean f54899b;

        public C19438a(boolean z, boolean z2) {
            this.f54898a = z;
            this.f54899b = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19438a)) {
                return false;
            }
            C19438a aVar = (C19438a) obj;
            return this.f54898a == aVar.f54898a && this.f54899b == aVar.f54899b;
        }

        public int hashCode() {
            boolean z = this.f54898a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f54899b;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "ShowFinderDigestResult(showDigest=" + this.f54898a + ", showRedDot=" + this.f54899b + ')';
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$d */
    public static final class C19439d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19439d f54900d = new C19439d();

        public C19439d() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C19428d.f54856a.mo25176k().decodeBool("forceOpenLive", false));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.d$i */
    public static final class C19440i extends C87413o implements C32228q<String, String, Boolean, C13598b0> {

        /* renamed from: d */
        public static final C19440i f54901d = new C19440i();

        public C19440i() {
            super(3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            ((Boolean) obj3).booleanValue();
            return C13598b0.f38549a;
        }
    }

    static {
        C19428d dVar = new C19428d();
        f54856a = dVar;
        MultiProcessMMKV k = dVar.mo25176k();
        C87412m.m108593f(k, "mmkv");
        f54858c = new MMKVSlotManager(k, 15552000);
    }

    /* renamed from: S */
    public static final C19438a m20722S(long j) {
        C19428d dVar = f54856a;
        if (!dVar.mo25177l()) {
            return new C19438a(false, false);
        }
        if (dVar.mo25176k().decodeLong("KeyMainRedDotTime", 0) < j) {
            return new C19438a(false, false);
        }
        String str = "";
        String decodeString = dVar.mo25176k().decodeString("KeyMainCellRedDotUserName", str);
        String f = dVar.mo25172f(decodeString);
        if (decodeString != null) {
            MMKVSlotManager mMKVSlotManager = f54858c;
            str = mMKVSlotManager.decodeString("click-exportId-" + decodeString, str);
        }
        if (f == null || C112551y.m153811k(f)) {
            return new C19438a(false, false);
        }
        if (!Util.isEqual(f, str)) {
            return new C19438a(true, true);
        }
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            Log.m105918d("MicroMsg.BizFinderLiveLogic", "shouldShowFinderLiveRedDot clickExportId=" + str + " return");
        }
        return new C19438a(true, false);
    }

    /* renamed from: i */
    public static final String m20723i() {
        return f54856a.mo25176k().decodeString("KeyMainCellRedDotUserName");
    }

    /* renamed from: A */
    public final void mo25148A(LinkedList<pg4> linkedList) {
        C87412m.m108594g(linkedList, "list");
        LinkedList linkedList2 = new LinkedList();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (pg4 pg4 : linkedList) {
            arrayList.add(pg4.f354229d);
        }
        linkedList2.addAll(arrayList);
        if (!linkedList2.isEmpty()) {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C19431h(linkedList2, (C15601d<? super C19431h>) null), 2, (Object) null);
        }
    }

    /* renamed from: B */
    public final void mo25149B() {
        String f;
        String i = m20723i();
        if (i != null && (f = mo25172f(i)) != null) {
            ((MultiProcessMMKV) f54858c.getSlotForWrite()).encode("click-exportId-" + i, f);
            f54877v = i;
            f54878w = f;
        }
    }

    /* renamed from: C */
    public final void mo25150C(String str, String str2) {
        if (str != null && str2 != null) {
            MMKVSlotManager mMKVSlotManager = f54858c;
            if (!C87412m.m108589b(mMKVSlotManager.decodeString(mo25170d(str), ""), str2)) {
                int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
                int decodeInt = mMKVSlotManager.decodeInt("date-" + currentTimeMillis + "-expose-live-red-dot-" + str, 0) + 1;
                ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode("date-" + currentTimeMillis + "-expose-live-red-dot-" + str, decodeInt);
                StringBuilder sb = new StringBuilder();
                sb.append("updateRedDotExposeTimes currentExposeTimes = ");
                sb.append(decodeInt);
                Log.m105918d("MicroMsg.BizFinderLiveLogic", sb.toString());
            }
            ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(mo25170d(str), str2);
        }
    }

    /* renamed from: D */
    public final void mo25151D() {
        if (f54872q && f54873r != 2) {
            mo25155H(9);
            mo25167a(f54860e, true, 5, C19440i.f54901d);
        }
        f54872q = false;
    }

    /* renamed from: E */
    public final void mo25152E() {
        if (mo25177l()) {
            boolean z = true;
            if ((mo25176k().decodeInt("biz_finder_live_func_flag", 1) & 1) == 0) {
                z = false;
            }
            if (z) {
                int decodeInt = mo25176k().decodeInt("bar_list_refresh_interval-10", 0);
                if (decodeInt < 60) {
                    decodeInt = 60;
                }
                int i = decodeInt * 1000;
                long decodeLong = mo25176k().decodeLong("live_bar_list_last_refresh_time", 0);
                Log.m105918d("MicroMsg.BizFinderLiveLogic", "preCheckLiveBar listRefreshInterval = " + i);
                if (System.currentTimeMillis() - decodeLong > ((long) i)) {
                    C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C19442e((C15601d<? super C19442e>) null), 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: F */
    public final void mo25153F(String str, String str2, int i) {
        Log.m105918d("MicroMsg.BizFinderLiveLogic", "publishLiveStatusChangeEvent bizUserName=" + str + ", exportId=" + str2 + ", scene=" + i);
        BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = new BizFinderLineStatusChangedEvent();
        BizFinderLineStatusChangedEvent.C40040a aVar = bizFinderLineStatusChangedEvent.f107369d;
        aVar.f107370a = str;
        aVar.f107371b = str2;
        aVar.f107372c = i;
        bizFinderLineStatusChangedEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: G */
    public final String mo25154G(String str) {
        C87412m.m108594g(str, "<this>");
        return "refreshInterval-" + str;
    }

    /* renamed from: H */
    public final void mo25155H(long j) {
        C115669n.INSTANCE.idkeyStat(1703, j, 1, false);
    }

    /* renamed from: I */
    public final void mo25156I(String str, C19623o0 o0Var) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        int i = C19636w0.f55626c;
        long j = 0;
        if (o0Var != null) {
            j = mo25175j(o0Var);
        }
        C115669n.INSTANCE.mo160131h(15721, str, Long.valueOf(j), 26, Integer.valueOf(currentTimeMillis), Integer.valueOf(i));
    }

    /* renamed from: J */
    public final void mo25157J() {
        if (mo25176k().containsKey("KeyMainCellRedDotUserName")) {
            mo25176k().removeValueForKey("KeyMainCellRedDotUserName");
            mo25176k().removeValueForKey("KeyMainRedDotTime");
        }
    }

    /* renamed from: K */
    public final void mo25158K(String str) {
        String str2 = f54877v;
        if (str2 != null && C87412m.m108589b(str, str2)) {
            f54877v = null;
            f54878w = null;
            f54879x = null;
        }
    }

    /* renamed from: L */
    public final void mo25159L(C118459qf qfVar) {
        String str;
        if (qfVar != null && (str = qfVar.f354270d) != null) {
            MMKVSlotManager mMKVSlotManager = f54858c;
            ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(mo25169c(str), Util.nullAsNil(qfVar.f354271e));
            ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(mo25160M(str), System.currentTimeMillis());
            ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(mo25154G(str), qfVar.f354272f);
            ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode("live_scene-" + str, qfVar.f354274h);
            try {
                ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode("biz_finder_live_info-" + str, qfVar.toByteArray());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BizFinderLiveLogic", "saveBizFinderLiveInfo ex " + e.getMessage());
            }
            boolean z = true;
            if (qfVar.f354276j && !f54871p) {
                f54871p = true;
                ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113305TH(C88273g1.BIZ_TIME_LINE);
            }
            String str2 = qfVar.f354271e;
            if (str2 != null && !C112551y.m153811k(str2)) {
                z = false;
            }
            if (!z) {
                Log.m105924i("MicroMsg.BizFinderLiveLogic", "saveBizFinderLiveInfo " + qfVar.f354270d + ' ' + qfVar.f354271e + " useWeApp:" + qfVar.f354276j);
            }
        }
    }

    /* renamed from: M */
    public final String mo25160M(String str) {
        return "saveExportIdTime-" + str;
    }

    /* renamed from: N */
    public final void mo25161N(String str, String str2) {
        if (str != null && str2 != null) {
            Log.m105924i("MicroMsg.BizFinderLiveLogic", "saveFinderLiveRedDotInfo bizUserName=" + str + ", exportId=" + str2);
            mo25176k().encode("KeyMainCellRedDotUserName", str);
            mo25176k().encode("KeyMainRedDotTime", C75604z3.m90844p());
        }
    }

    /* renamed from: O */
    public final void mo25162O(int i, int i2) {
        MultiProcessMMKV k = mo25176k();
        k.encode("bar_list_keep_data_interval-" + i, i2);
    }

    /* renamed from: P */
    public final void mo25163P(int i, int i2) {
        MultiProcessMMKV k = mo25176k();
        k.encode("bar_list_refresh_interval-" + i, i2);
    }

    /* renamed from: Q */
    public final void mo25164Q(C118474vf vfVar) {
        C87412m.m108594g(vfVar, "resp");
        try {
            mo25176k().encode("live_bar_resp_data", vfVar.toByteArray());
            mo25176k().encode("biz_finder_live_func_flag", vfVar.f354499i);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.BizFinderLiveLogic", "saveLiveBarResp ex " + e.getMessage());
        }
    }

    /* renamed from: R */
    public final boolean mo25165R(String str) {
        if (str == null) {
            return false;
        }
        MMKVSlotManager mMKVSlotManager = f54858c;
        int decodeInt$default = MMKVSlotManager.decodeInt$default(mMKVSlotManager, mo25154G(str), 0, 2, (Object) null);
        return System.currentTimeMillis() - MMKVSlotManager.decodeLong$default(mMKVSlotManager, mo25160M(str), 0, 2, (Object) null) > ((long) ((decodeInt$default < 5 ? 5 : decodeInt$default) * 1000));
    }

    /* renamed from: T */
    public final void mo25166T() {
        if (f54880y != null) {
            Log.m105918d("MicroMsg.BizFinderLiveLogic", "stopCheckMaiCellRedDot");
            MTimerHandler mTimerHandler = f54880y;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            f54880y = null;
        }
    }

    /* renamed from: a */
    public final void mo25167a(String str, boolean z, int i, C32228q<? super String, ? super String, ? super Boolean, C13598b0> qVar) {
        C87412m.m108594g(qVar, "block");
        if (str != null) {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C19429b(z, str, i, qVar, (C15601d<? super C19429b>) null), 2, (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo25168b() {
        f54861f.clear();
        ((MultiProcessMMKV) f54858c.getSlotForWrite()).clearAll();
    }

    /* renamed from: c */
    public final String mo25169c(String str) {
        return "exportId-" + str;
    }

    /* renamed from: d */
    public final String mo25170d(String str) {
        return "expose-exportId-" + str;
    }

    /* renamed from: e */
    public final Object mo25171e(int i, LinkedList<String> linkedList, C15601d<? super C118474vf> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51536uf ufVar = new C51536uf();
        ufVar.f142823g = i;
        if (linkedList != null) {
            ufVar.f142820d = linkedList;
        }
        C19428d dVar2 = f54856a;
        dVar2.mo25176k().decodeBytes("FinderLiveBuffer");
        ufVar.f142822f = 30;
        bVar.f127066a = ufVar;
        bVar.f127067b = new C118474vf();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizfinderlive";
        bVar.f127069d = 4703;
        C47350c a = bVar.mo72403a();
        Log.m105924i("MicroMsg.BizFinderLiveLogic", "getBizFinderLives scene=" + i);
        dVar2.mo25155H(0);
        boolean z = false;
        if (1 <= i && i < 20) {
            z = true;
        }
        if (z) {
            dVar2.mo25155H(((long) i) + 40);
        }
        if (linkedList != null) {
            for (String str : linkedList) {
                C19428d dVar3 = f54856a;
                if (str != null) {
                    ((MultiProcessMMKV) f54858c.getSlotForWrite()).encode(dVar3.mo25160M(str), System.currentTimeMillis());
                }
            }
        }
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C19430c(new C8477a0(), hVar, i));
        return hVar.mo90314b();
    }

    /* renamed from: f */
    public final String mo25172f(String str) {
        if (str == null) {
            return null;
        }
        return MMKVSlotManager.decodeString$default(f54858c, mo25169c(str), (String) null, 2, (Object) null);
    }

    /* renamed from: g */
    public final C118474vf mo25173g() {
        C47465a aVar;
        byte[] decodeBytes;
        MultiProcessMMKV k = mo25176k();
        C87412m.m108593f(k, "mmkv");
        if (k.containsKey("live_bar_resp_data") && (decodeBytes = k.decodeBytes("live_bar_resp_data")) != null) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C118474vf newInstance = C118474vf.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
                return (C118474vf) aVar;
            }
        }
        aVar = null;
        return (C118474vf) aVar;
    }

    /* renamed from: h */
    public final int mo25174h(String str) {
        if (str == null) {
            return 0;
        }
        MMKVSlotManager mMKVSlotManager = f54858c;
        return mMKVSlotManager.decodeInt("live_scene-" + str, 0);
    }

    /* renamed from: j */
    public final long mo25175j(C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
        try {
            C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
            if (Util.isNullOrNil((List) JZ != null ? JZ.f226295i : null)) {
                return 0;
            }
            C77630j jVar = JZ.f226295i.get(0);
            if (!Util.isNullOrNil(jVar.f226326e)) {
                return Util.getLong(Uri.parse(jVar.f226326e).getQueryParameter("mid"), 0);
            }
            return 0;
        } catch (Exception e) {
            Log.m105929w("MicroMsg.BizFinderLiveLogic", "reportLiveClickOp exp %s", e.getMessage());
            return 0;
        }
    }

    /* renamed from: k */
    public final MultiProcessMMKV mo25176k() {
        return (MultiProcessMMKV) f54857b.getValue();
    }

    /* renamed from: l */
    public final boolean mo25177l() {
        return ((Boolean) ((C36570n) f54864i).getValue()).booleanValue();
    }

    /* renamed from: m */
    public final int mo25178m() {
        return ((Number) ((C36570n) f54862g).getValue()).intValue();
    }

    /* renamed from: n */
    public final boolean mo25179n() {
        return ((Boolean) ((C36570n) f54863h).getValue()).booleanValue();
    }

    /* renamed from: o */
    public final int mo25180o() {
        int decodeInt = mo25176k().decodeInt("SvrOpenFlag", 0);
        Log.m105924i("MicroMsg.BizFinderLiveLogic", "SvrOpenFlag " + decodeInt);
        return decodeInt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0071 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<te3.C118459qf> mo25181p(java.util.LinkedList<te3.C118459qf> r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "list"
            gy3.C87412m.m108594g(r12, r0)
            boolean r13 = r11.mo25188w(r13)
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x0068
            java.lang.String r13 = f54877v
            if (r13 == 0) goto L_0x001a
            boolean r13 = z04.C112551y.m153811k(r13)
            if (r13 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r13 = 0
            goto L_0x001b
        L_0x001a:
            r13 = 1
        L_0x001b:
            if (r13 != 0) goto L_0x0068
            java.lang.String r13 = f54878w
            if (r13 == 0) goto L_0x002a
            boolean r13 = z04.C112551y.m153811k(r13)
            if (r13 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r13 = 0
            goto L_0x002b
        L_0x002a:
            r13 = 1
        L_0x002b:
            if (r13 == 0) goto L_0x002e
            goto L_0x0068
        L_0x002e:
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x0035
            goto L_0x0051
        L_0x0035:
            java.util.Iterator r13 = r12.iterator()
        L_0x0039:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r13.next()
            te3.qf r2 = (te3.C118459qf) r2
            java.lang.String r2 = r2.f354270d
            java.lang.String r3 = f54877v
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x0039
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            if (r13 != 0) goto L_0x0068
            te3.qf r13 = new te3.qf
            r13.<init>()
            java.lang.String r2 = f54877v
            r13.f354270d = r2
            java.lang.String r2 = f54878w
            r13.f354271e = r2
            java.lang.String r2 = f54879x
            r13.f354275i = r2
            r12.add(r1, r13)
        L_0x0068:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0071:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x014c
            java.lang.Object r2 = r12.next()
            r3 = r2
            te3.qf r3 = (te3.C118459qf) r3
            com.tencent.mm.pluginsdk.model.d r4 = f54856a
            java.lang.String r5 = "info"
            gy3.C87412m.m108594g(r3, r5)
            java.lang.String r5 = r3.f354270d
            boolean r5 = eb0.C45628s0.m50740E(r5)
            java.lang.String r6 = "MicroMsg.BizFinderLiveLogic"
            if (r5 == 0) goto L_0x0124
            java.lang.String r5 = r3.f354271e
            if (r5 == 0) goto L_0x009c
            boolean r5 = z04.C112551y.m153811k(r5)
            if (r5 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r5 = 0
            goto L_0x009d
        L_0x009c:
            r5 = 1
        L_0x009d:
            if (r5 == 0) goto L_0x00a1
            goto L_0x0124
        L_0x00a1:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r4.mo25176k()
            java.lang.String r7 = "showLiveBarWhenExpose"
            boolean r5 = r5.decodeBool(r7, r1)
            if (r5 == 0) goto L_0x00af
            goto L_0x0122
        L_0x00af:
            java.lang.String r5 = r3.f354270d
            java.lang.String r7 = f54877v
            boolean r5 = gy3.C87412m.m108589b(r5, r7)
            if (r5 == 0) goto L_0x00ba
            goto L_0x0122
        L_0x00ba:
            java.lang.String r5 = r3.f354270d
            java.lang.String r7 = "info.bizusername"
            gy3.C87412m.m108593f(r5, r7)
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 / r9
            int r8 = (int) r7
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r7 = f54858c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "date-"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = "-expose-live-bar-"
            r9.append(r8)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            int r5 = r7.decodeInt(r5, r1)
            rx3.g r7 = f54869n
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r5 < r7) goto L_0x0122
            java.lang.String r7 = r3.f354270d
            java.lang.String r8 = r3.f354271e
            boolean r4 = r4.mo25184s(r7, r8)
            if (r4 != 0) goto L_0x0122
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "canShowLiveBarItem "
            r4.append(r7)
            java.lang.String r3 = r3.f354270d
            r4.append(r3)
            java.lang.String r3 = " hasShowTimes = "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0144
        L_0x0122:
            r3 = 1
            goto L_0x0145
        L_0x0124:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "canShowLiveBarItem return "
            r4.append(r5)
            java.lang.String r5 = r3.f354270d
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            java.lang.String r3 = r3.f354271e
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
        L_0x0144:
            r3 = 0
        L_0x0145:
            if (r3 == 0) goto L_0x0071
            r13.add(r2)
            goto L_0x0071
        L_0x014c:
            r12 = 30
            java.util.List r12 = sx3.C110818d0.m150947s0(r13, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19428d.mo25181p(java.util.LinkedList, boolean):java.util.List");
    }

    /* renamed from: q */
    public final boolean mo25182q(String str, String str2) {
        return !C87412m.m108589b(Util.nullAsNil(mo25172f(str)), Util.nullAsNil(str2));
    }

    /* renamed from: r */
    public final boolean mo25183r() {
        return ((Boolean) ((C36570n) f54876u).getValue()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo25184s(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str2 == null || C112551y.m153811k(str2)) {
            return false;
        }
        MMKVSlotManager mMKVSlotManager = f54858c;
        return C87412m.m108589b(MMKVSlotManager.decodeString$default(mMKVSlotManager, "live_bar_expose-exportId-" + str, (String) null, 2, (Object) null), str2);
    }

    /* renamed from: t */
    public final boolean mo25185t(String str) {
        if (str == null) {
            return false;
        }
        MMKVSlotManager mMKVSlotManager = f54858c;
        String decodeString$default = MMKVSlotManager.decodeString$default(mMKVSlotManager, mo25169c(str), (String) null, 2, (Object) null);
        if (decodeString$default == null || C112551y.m153811k(decodeString$default)) {
            return false;
        }
        if (System.currentTimeMillis() - mMKVSlotManager.decodeLong(mo25160M(str), 0) <= 21600000) {
            return true;
        }
        Log.m105924i("MicroMsg.BizFinderLiveLogic", "isLiveNow expired live status");
        return false;
    }

    /* renamed from: u */
    public final boolean mo25186u(String str) {
        if (C87412m.m108589b(str, f54877v)) {
            String str2 = f54878w;
            if (!(str2 == null || C112551y.m153811k(str2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo25187v(String str, String str2) {
        if (mo25186u(str)) {
            return true;
        }
        boolean z = false;
        if (str2 == null || C112551y.m153811k(str2)) {
            return false;
        }
        if (str != null) {
            if (!(str2 == null || C112551y.m153811k(str2))) {
                MMKVSlotManager mMKVSlotManager = f54858c;
                z = C87412m.m108589b(str2, MMKVSlotManager.decodeString$default(mMKVSlotManager, "oftenread-click-" + str, (String) null, 2, (Object) null));
            }
        }
        return !z;
    }

    /* renamed from: w */
    public final boolean mo25188w(boolean z) {
        if (z) {
            String str = f54877v;
            if (!(str == null || C112551y.m153811k(str))) {
                String str2 = f54878w;
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: x */
    public final void mo25189x(String str, String str2) {
        C87412m.m108594g(str, "bizUserName");
        ((MultiProcessMMKV) f54858c.getSlotForWrite()).encode("oftenread-click-" + str, str2);
    }

    /* renamed from: y */
    public final void mo25190y(Context context, String str, String str2, int i, int i2, List<? extends C118459qf> list) {
        C87412m.m108594g(context, "context");
        mo25191z(context, str, str2, i, i2, list, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x021f  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25191z(android.content.Context r17, java.lang.String r18, java.lang.String r19, int r20, int r21, java.util.List<? extends te3.C118459qf> r22, java.lang.String r23) {
        /*
            r16 = this;
            r1 = r16
            r3 = r17
            r9 = r18
            r10 = r20
            r2 = r21
            r4 = r23
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r3, r0)
            if (r9 != 0) goto L_0x0014
            return
        L_0x0014:
            r5 = 2
            r6 = 0
            if (r19 != 0) goto L_0x0023
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = f54858c
            java.lang.String r7 = r1.mo25169c(r9)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMKVSlotManager.decodeString$default(r0, r7, r6, r5, r6)
            goto L_0x0025
        L_0x0023:
            r0 = r19
        L_0x0025:
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0032
            boolean r7 = z04.C112551y.m153811k(r0)
            if (r7 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r7 = 0
            goto L_0x0033
        L_0x0032:
            r7 = 1
        L_0x0033:
            if (r7 == 0) goto L_0x003f
            java.lang.String r7 = f54877v
            boolean r7 = gy3.C87412m.m108589b(r9, r7)
            if (r7 == 0) goto L_0x003f
            java.lang.String r0 = f54878w
        L_0x003f:
            r7 = r0
            if (r7 == 0) goto L_0x004b
            boolean r0 = z04.C112551y.m153811k(r7)
            if (r0 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r0 = 0
            goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            java.lang.String r8 = "onClick bizUserName="
            java.lang.String r13 = "MicroMsg.BizFinderLiveLogic"
            if (r0 == 0) goto L_0x006a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r9)
            java.lang.String r2 = ", exportId is null"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return
        L_0x006a:
            if (r12 != r10) goto L_0x006f
            r1.mo25189x(r9, r7)
        L_0x006f:
            boolean r0 = com.tencent.p014mm.storage.C19601c0.f55457l
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = m20723i()
            boolean r0 = gy3.C87412m.m108589b(r0, r9)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "onClick update expose status"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            r16.mo25149B()
            r16.mo25157J()
            com.tencent.p014mm.storage.C19636w0.m21161c()
        L_0x008b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = ", exportId="
            r0.append(r8)
            r0.append(r7)
            java.lang.String r8 = ", liveScene="
            r0.append(r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = f54858c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "biz_finder_live_info-"
            r8.append(r14)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r0 = r0.findSlot(r8)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0
            if (r0 == 0) goto L_0x00f6
            boolean r14 = r0.containsKey(r8)
            if (r14 == 0) goto L_0x00f6
            byte[] r0 = r0.decodeBytes(r8)
            if (r0 == 0) goto L_0x00f6
            int r8 = r0.length
            if (r8 != 0) goto L_0x00d9
            r8 = 1
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            r8 = r8 ^ r12
            if (r8 == 0) goto L_0x00f6
            java.lang.Class<te3.qf> r8 = te3.C118459qf.class
            java.lang.Object r8 = r8.newInstance()     // Catch:{ Exception -> 0x00ec }
            r14 = r8
            pe3.a r14 = (pe3.C47465a) r14     // Catch:{ Exception -> 0x00ec }
            r14.parseFrom(r0)     // Catch:{ Exception -> 0x00ec }
            pe3.a r8 = (pe3.C47465a) r8     // Catch:{ Exception -> 0x00ec }
            goto L_0x00f7
        L_0x00ec:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r14 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r15 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r15, r8)
        L_0x00f6:
            r8 = r6
        L_0x00f7:
            te3.qf r8 = (te3.C118459qf) r8
            if (r8 == 0) goto L_0x0181
            boolean r0 = r8.f354276j
            if (r0 == 0) goto L_0x0181
            te3.fz4 r0 = r8.f354277n
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = r0.f354021d
            if (r0 == 0) goto L_0x010f
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 != r12) goto L_0x010f
            r0 = 1
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            if (r0 != 0) goto L_0x0181
            com.tencent.mm.pluginsdk.model.d r0 = f54856a
            r2 = 68
            r0.mo25155H(r2)
            di0.o r0 = new di0.o
            r0.<init>()
            te3.fz4 r2 = r8.f354277n
            java.lang.String r3 = r2.f354021d
            r0.f250930b = r3
            int r3 = r2.f354022e
            r0.f250931c = r3
            r3 = 1214(0x4be, float:1.701E-42)
            r0.f250939k = r3
            com.tencent.mm.pluginsdk.model.j r3 = new com.tencent.mm.pluginsdk.model.j
            r3.<init>()
            pe3.b r2 = r2.f354023f
            if (r2 == 0) goto L_0x013b
            java.lang.String r2 = r2.mo123705h()
            r3.f164779d = r2
        L_0x013b:
            r3.f164780e = r10
            r3.f164781f = r4
            r0.f250937i = r3
            te3.fz4 r2 = r8.f354277n
            java.lang.String r2 = r2.f354024g
            r0.f250934f = r2
            java.lang.Class<kr0.x0> r2 = kr0.C76630x0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            kr0.x0 r2 = (kr0.C76630x0) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.mo106898tv(r3, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onClick use WeApp appId = "
            r2.append(r3)
            java.lang.String r3 = r0.f250930b
            r2.append(r3)
            java.lang.String r3 = ", versionType="
            r2.append(r3)
            int r3 = r0.f250931c
            r2.append(r3)
            java.lang.String r3 = ", enterPath="
            r2.append(r3)
            java.lang.String r0 = r0.f250934f
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            return
        L_0x0181:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = f54858c
            java.lang.Object r0 = r0.getSlotForWrite()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "userName-"
            r13.append(r14)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r0.encode((java.lang.String) r13, (java.lang.String) r9)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveStatusRefreshEvent> r0 = f54874s
            if (r0 != 0) goto L_0x01ae
            com.tencent.mm.app.f r0 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.pluginsdk.model.BizFinderLiveLogic$addFinderLiveStatusRefreshEventListener$1 r13 = new com.tencent.mm.pluginsdk.model.BizFinderLiveLogic$addFinderLiveStatusRefreshEventListener$1
            r13.<init>(r0)
            f54874s = r13
            r13.alive()
        L_0x01ae:
            if (r2 <= 0) goto L_0x021f
            r13 = 66
            r1.mo25155H(r13)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            if (r10 == r12) goto L_0x01c4
            if (r10 == r5) goto L_0x01c4
            r5 = 3
            if (r10 == r5) goto L_0x01c4
            r5 = 27
            goto L_0x01c6
        L_0x01c4:
            r5 = 26
        L_0x01c6:
            java.lang.String r13 = "key_entry_scene"
            r0.putExtra(r13, r5)
            java.lang.String r5 = "key_biz_user_name"
            r0.putExtra(r5, r9)
            java.lang.String r5 = "key_feed_export_id"
            r0.putExtra(r5, r7)
            if (r8 == 0) goto L_0x01d9
            java.lang.String r6 = r8.f354273g
        L_0x01d9:
            if (r6 == 0) goto L_0x01e4
            boolean r5 = z04.C112551y.m153811k(r6)
            if (r5 == 0) goto L_0x01e2
            goto L_0x01e4
        L_0x01e2:
            r5 = 0
            goto L_0x01e5
        L_0x01e4:
            r5 = 1
        L_0x01e5:
            if (r5 == 0) goto L_0x0202
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            java.lang.String r5 = r5.getDisplayName(r9)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131822617(0x7f110819, float:1.927801E38)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r11] = r5
            java.lang.String r6 = r6.getString(r7, r8)
        L_0x0202:
            java.lang.String r5 = "key_page_title"
            r0.putExtra(r5, r6)
            java.lang.String r5 = "key_request_scene"
            r0.putExtra(r5, r2)
            if (r4 == 0) goto L_0x0213
            java.lang.String r2 = "key_by_pass"
            r0.putExtra(r2, r4)
        L_0x0213:
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            r2.Qw0(r3, r0)
            goto L_0x0272
        L_0x021f:
            r4 = 67
            r1.mo25155H(r4)
            if (r22 == 0) goto L_0x022f
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x022d
            goto L_0x022f
        L_0x022d:
            r0 = 0
            goto L_0x0230
        L_0x022f:
            r0 = 1
        L_0x0230:
            if (r0 != 0) goto L_0x025b
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            if (r22 == 0) goto L_0x0259
            java.util.Iterator r4 = r22.iterator()
        L_0x0242:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0259
            java.lang.Object r5 = r4.next()
            te3.qf r5 = (te3.C118459qf) r5
            java.lang.String r6 = r5.f354271e
            r0.add(r6)
            java.lang.String r5 = r5.f354270d
            r2.add(r5)
            goto L_0x0242
        L_0x0259:
            r8 = r2
            goto L_0x025d
        L_0x025b:
            r0 = r6
            r8 = r0
        L_0x025d:
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ir.n r2 = (p565ir.C60606n) r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r3 = r17
            r4 = r7
            r5 = r18
            r7 = r0
            r2.R70(r3, r4, r5, r6, r7, r8)
        L_0x0272:
            f54872q = r12
            f54860e = r9
            f54873r = r10
            r2 = 20
            r1.mo25155H(r2)
            if (r12 > r10) goto L_0x0284
            r0 = 20
            if (r10 >= r0) goto L_0x0284
            r11 = 1
        L_0x0284:
            if (r11 == 0) goto L_0x028b
            long r4 = (long) r10
            long r4 = r4 + r2
            r1.mo25155H(r4)
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19428d.mo25191z(android.content.Context, java.lang.String, java.lang.String, int, int, java.util.List, java.lang.String):void");
    }
}
