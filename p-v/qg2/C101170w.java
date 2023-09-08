package qg2;

import a14.C0000n0;
import a14.C53934p0;
import a70.C112760b;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import og2.C100346q;
import p1081gi.C98124g;
import pb1.C100734q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.ki4;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: qg2.w */
public final class C101170w extends C98597b {

    /* renamed from: f */
    public final C13601g f296121f = C36568h.m40985a(C101171a.f296124d);

    /* renamed from: g */
    public final C13601g f296122g = C36568h.m40985a(C35871e.f95731d);

    /* renamed from: h */
    public final C13601g f296123h;

    /* renamed from: qg2.w$e */
    public static final class C35871e extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C35871e f95731d = new C35871e();

        public C35871e() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "_RecordFavFSC";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: qg2.w$a */
    public static final class C101171a extends C87413o implements C32224a<FlowController> {

        /* renamed from: d */
        public static final C101171a f296124d = new C101171a();

        public C101171a() {
            super(0);
        }

        public Object invoke() {
            return new FlowController(1, C12235v.f35307d);
        }
    }

    /* renamed from: qg2.w$b */
    public static final class C101172b extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ C98598e f296125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101172b(C98598e eVar) {
            super(0);
            this.f296125d = eVar;
        }

        public Object invoke() {
            return new LifecycleScope("RecordFavFSC", this.f296125d, 0, 4, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.record.model.RecordFromFavSendFSC$start$1", mo125469f = "RecordFromFavSendFSC.kt", mo125470l = {76, 79, 81, 82}, mo125471m = "invokeSuspend")
    /* renamed from: qg2.w$c */
    public static final class C101173c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f296126d;

        /* renamed from: e */
        public Object f296127e;

        /* renamed from: f */
        public Object f296128f;

        /* renamed from: g */
        public int f296129g;

        /* renamed from: h */
        public final /* synthetic */ C101170w f296130h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101173c(C101170w wVar, C15601d<? super C101173c> dVar) {
            super(2, dVar);
            this.f296130h = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C101173c(this.f296130h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C101173c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0151 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r14.f296129g
                r2 = 2
                r3 = 3
                r4 = 4
                java.lang.String r5 = "MicroMsg.RecordFromFavSendFSC"
                r6 = 1
                if (r1 == 0) goto L_0x0065
                if (r1 == r6) goto L_0x0061
                if (r1 == r2) goto L_0x004a
                if (r1 == r3) goto L_0x0033
                if (r1 != r4) goto L_0x002b
                java.lang.Object r1 = r14.f296128f
                og2.q r1 = (og2.C100346q) r1
                java.lang.Object r6 = r14.f296127e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r14.f296126d
                qg2.w r7 = (qg2.C101170w) r7
                kotlin.ResultKt.throwOnFailure(r15)
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r14
                goto L_0x0152
            L_0x002b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0033:
                java.lang.Object r1 = r14.f296128f
                og2.q r1 = (og2.C100346q) r1
                java.lang.Object r6 = r14.f296127e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r14.f296126d
                qg2.w r7 = (qg2.C101170w) r7
                kotlin.ResultKt.throwOnFailure(r15)
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r14
                goto L_0x0133
            L_0x004a:
                java.lang.Object r1 = r14.f296128f
                og2.q r1 = (og2.C100346q) r1
                java.lang.Object r6 = r14.f296127e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r14.f296126d
                qg2.w r7 = (qg2.C101170w) r7
                kotlin.ResultKt.throwOnFailure(r15)
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r14
                goto L_0x0106
            L_0x0061:
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x007d
            L_0x0065:
                kotlin.ResultKt.throwOnFailure(r15)
                qg2.w r15 = r14.f296130h
                rx3.g r15 = r15.f296121f
                rx3.n r15 = (rx3.C36570n) r15
                java.lang.Object r15 = r15.getValue()
                com.tencent.mm.sdk.coroutines.FlowController r15 = (com.tencent.p014mm.sdk.coroutines.FlowController) r15
                r14.f296129g = r6
                java.lang.Object r15 = r15.currentFlowInfo(r14)
                if (r15 != r0) goto L_0x007d
                return r0
            L_0x007d:
                qg2.w r1 = r14.f296130h
                java.util.List r15 = (java.util.List) r15
                int r7 = r15.size()
                if (r7 >= r6) goto L_0x017e
                java.lang.Class<og2.e> r15 = og2.C100336e.class
                di3.d r15 = di3.C86312j.m106911c(r15)
                og2.e r15 = (og2.C100336e) r15
                og2.k r15 = r15.k10()
                qg2.h0 r15 = (qg2.C101143h0) r15
                r15.getClass()
                com.tencent.mm.sdk.storage.sql.SingleTable r7 = p749xh.C102674v7.f303023q
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.selectAll()
                com.tencent.mm.sdk.storage.sql.Column r8 = p749xh.C102674v7.f303025s
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                com.tencent.mm.sdk.storage.sql.SingleCondition r8 = r8.equal((java.lang.Number) r9)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.where(r8)
                com.tencent.mm.sdk.storage.sql.Column r8 = p749xh.C102674v7.f303024r
                com.tencent.mm.sdk.storage.sql.ISqlOrder r8 = r8.orderInc()
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.orderBy((com.tencent.p014mm.sdk.storage.sql.ISqlOrder) r8)
                r8 = 0
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r6 = r7.limit(r6, r8)
                com.tencent.mm.sdk.storage.sql.SelectSql r6 = r6.build()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r15.f296046d
                java.lang.Class<og2.q> r7 = og2.C100346q.class
                java.util.List r15 = r6.multiQuery(r15, r7)
                java.lang.String r6 = "getService(IPluginRecord…RecordInfo(MAX_FLOW_SIZE)"
                gy3.C87412m.m108593f(r15, r6)
                java.util.Iterator r15 = r15.iterator()
                r6 = r15
                r7 = r1
                r15 = r14
            L_0x00d3:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0193
                java.lang.Object r1 = r6.next()
                og2.q r1 = (og2.C100346q) r1
                rx3.g r8 = r7.f296121f
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                com.tencent.mm.sdk.coroutines.FlowController r8 = (com.tencent.p014mm.sdk.coroutines.FlowController) r8
                long r9 = r1.field_msgId
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r15.f296126d = r7
                r15.f296127e = r6
                r15.f296128f = r1
                r15.f296129g = r2
                java.lang.Object r8 = r8.inFlow(r9, r15)
                if (r8 != r0) goto L_0x00fe
                return r0
            L_0x00fe:
                r13 = r0
                r0 = r15
                r15 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r13
            L_0x0106:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto L_0x0177
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r9 = "int flow id:"
                r15.append(r9)
                long r9 = r5.field_msgId
                r15.append(r9)
                java.lang.String r15 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
                r0.f296126d = r8
                r0.f296127e = r7
                r0.f296128f = r5
                r0.f296129g = r3
                java.lang.Object r15 = r8.mo140618l3(r5, r0)
                if (r15 != r1) goto L_0x0133
                return r1
            L_0x0133:
                rx3.g r15 = r8.f296121f
                rx3.n r15 = (rx3.C36570n) r15
                java.lang.Object r15 = r15.getValue()
                com.tencent.mm.sdk.coroutines.FlowController r15 = (com.tencent.p014mm.sdk.coroutines.FlowController) r15
                long r9 = r5.field_msgId
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r0.f296126d = r8
                r0.f296127e = r7
                r0.f296128f = r5
                r0.f296129g = r4
                java.lang.Object r15 = r15.outFlow(r9, r0)
                if (r15 != r1) goto L_0x0152
                return r1
            L_0x0152:
                java.lang.Number r15 = (java.lang.Number) r15
                long r9 = r15.longValue()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r11 = "out flow id:"
                r15.append(r11)
                long r11 = r5.field_msgId
                r15.append(r11)
                java.lang.String r5 = " cost:"
                r15.append(r5)
                r15.append(r9)
                java.lang.String r15 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            L_0x0177:
                r15 = r0
                r0 = r1
                r5 = r6
                r6 = r7
                r7 = r8
                goto L_0x00d3
            L_0x017e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "start max flow, do not add cdn info "
                r0.append(r1)
                r0.append(r15)
                java.lang.String r15 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r15)
            L_0x0193:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: qg2.C101170w.C101173c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.record.model.RecordFromFavSendFSC", mo125469f = "RecordFromFavSendFSC.kt", mo125470l = {117, 179, 210, 235, 267, 322}, mo125471m = "startSend")
    /* renamed from: qg2.w$d */
    public static final class C101174d extends C66704d {

        /* renamed from: d */
        public Object f296131d;

        /* renamed from: e */
        public Object f296132e;

        /* renamed from: f */
        public Object f296133f;

        /* renamed from: g */
        public Object f296134g;

        /* renamed from: h */
        public Object f296135h;

        /* renamed from: i */
        public Object f296136i;

        /* renamed from: j */
        public Object f296137j;

        /* renamed from: n */
        public Object f296138n;

        /* renamed from: o */
        public int f296139o;

        /* renamed from: p */
        public /* synthetic */ Object f296140p;

        /* renamed from: q */
        public final /* synthetic */ C101170w f296141q;

        /* renamed from: r */
        public int f296142r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101174d(C101170w wVar, C15601d<? super C101174d> dVar) {
            super(dVar);
            this.f296141q = wVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f296140p = obj;
            this.f296142r |= Integer.MIN_VALUE;
            return this.f296141q.mo140618l3((C100346q) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.record.model.RecordFromFavSendFSC", mo125469f = "RecordFromFavSendFSC.kt", mo125470l = {331}, mo125471m = "uploadTask")
    /* renamed from: qg2.w$f */
    public static final class C101175f extends C66704d {

        /* renamed from: d */
        public Object f296143d;

        /* renamed from: e */
        public Object f296144e;

        /* renamed from: f */
        public Object f296145f;

        /* renamed from: g */
        public /* synthetic */ Object f296146g;

        /* renamed from: h */
        public final /* synthetic */ C101170w f296147h;

        /* renamed from: i */
        public int f296148i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101175f(C101170w wVar, C15601d<? super C101175f> dVar) {
            super(dVar);
            this.f296147h = wVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f296146g = obj;
            this.f296148i |= Integer.MIN_VALUE;
            return this.f296147h.mo140620n3((C98124g) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101170w(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
        this.f296123h = C36568h.m40985a(new C101172b(eVar));
    }

    /* renamed from: g3 */
    public final C98124g mo140614g3(String str, String str2, int i, String str3, String str4) {
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_RecordMsgCDNService";
        gVar.field_mediaId = str;
        gVar.f287661e = true;
        gVar.field_priority = 1;
        gVar.field_needStorage = false;
        gVar.field_totalLen = (int) C86013q1.m106451l(str2);
        gVar.field_aesKey = str3;
        gVar.field_fullpath = str2;
        gVar.field_fileType = i;
        gVar.field_talker = str4;
        gVar.field_force_aeskeycdn = false;
        gVar.field_trysafecdn = true;
        gVar.field_enable_hitcheck = false;
        Log.m105925i("MicroMsg.RecordFromFavSendFSC", "[record] summersafecdn doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", false, Integer.valueOf(gVar.field_fileType), gVar.field_aesKey, Boolean.valueOf(gVar.field_force_aeskeycdn), Boolean.valueOf(gVar.field_trysafecdn), Boolean.valueOf(gVar.field_enable_hitcheck), gVar.field_mediaId);
        return gVar;
    }

    /* renamed from: i3 */
    public final void mo140615i3(List<ki4> list, Map<Integer, C101834rc0> map, Map<Integer, C101834rc0> map2, C101801kd0 kd02) {
        LinkedList<C101834rc0> linkedList;
        ki4 ki4;
        if (kd02 != null && (linkedList = kd02.f298618f) != null) {
            for (C101834rc0 rc02 : linkedList) {
                if (C100734q.m131833X(rc02.f299258I)) {
                    mo140615i3(list, map, map2, rc02.f299275Q1);
                } else {
                    String str = rc02.f299325s;
                    boolean z = true;
                    ki4 ki42 = null;
                    if (!(str == null || C112551y.m153811k(str))) {
                        ki4 = new ki4();
                        ki4.f136811e = rc02.f299325s;
                        ki4.f136812f = rc02.f299329u;
                        ki4.f136813g = rc02.f299258I;
                        ki4.f136814h = (long) ((int) rc02.f299276R);
                        ki4.f136810d = Util.nullAs(rc02.f299280T, "").hashCode();
                    } else {
                        ki4 = null;
                    }
                    String str2 = rc02.f299305h;
                    if (str2 != null && !C112551y.m153811k(str2)) {
                        z = false;
                    }
                    if (!z) {
                        ki42 = new ki4();
                        ki42.f136811e = rc02.f299305h;
                        ki42.f136812f = rc02.f299309j;
                        ki42.f136813g = 2;
                        ki42.f136814h = (long) ((int) rc02.f299336x0);
                        ki42.f136810d = (Util.nullAs(rc02.f299280T, "") + "@thumb").hashCode();
                    }
                    if (ki42 != null) {
                        map.put(Integer.valueOf(ki42.f136810d), rc02);
                        list.add(ki42);
                        Log.m105924i("MicroMsg.RecordFromFavSendFSC", "add thumb cdnitem, clientId:" + ki42.f136810d + " dataID:" + rc02.f299280T + " datatype:" + ki42.f136813g + " dataurl:" + rc02.f299325s + " size:" + rc02.f299276R);
                    }
                    if (ki4 != null) {
                        map2.put(Integer.valueOf(ki4.f136810d), rc02);
                        list.add(ki4);
                        Log.m105924i("MicroMsg.RecordFromFavSendFSC", "add data cdnitem, clientId:" + ki4.f136810d + " dataID:" + rc02.f299280T + " datatype:" + ki4.f136813g + " dataurl:" + rc02.f299325s + " size:" + rc02.f299276R);
                    }
                }
            }
        }
    }

    /* renamed from: j3 */
    public final void mo140616j3(C101801kd0 kd02) {
        LinkedList<C101834rc0> linkedList;
        if (kd02 != null && (linkedList = kd02.f298618f) != null) {
            for (C101834rc0 rc02 : linkedList) {
                if (C100734q.m131833X(rc02.f299258I)) {
                    mo140616j3(rc02.f299275Q1);
                    C101801kd0 kd03 = rc02.f299275Q1;
                    if (kd03 != null) {
                        rc02.mo141234H(C101147j0.m132617J(kd03.f298626q, kd03.f298628s, "", kd03, kd03.f298618f));
                    }
                }
            }
        }
    }

    /* renamed from: k3 */
    public final void mo140617k3() {
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) this.f296123h).getValue(), (C53934p0) null, new C101173c(this, (C15601d<? super C101173c>) null), 1, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v10, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v18, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v49, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v66, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v23, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v15, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v68, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v72, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v11, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v130, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v25, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v25, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v28, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v19, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v21, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v21, resolved type: og2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v14, resolved type: qg2.w} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:29|(2:30|31)|32|33|34|35|(1:37)(10:38|39|40|41|42|49|(0)(0)|114|27|(1:115)(0))|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x047c, code lost:
        r0.add(r5);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, "need upload data cdn info ClientId:" + r3.f136810d + " DataId:" + r5.f299280T);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x049e, code lost:
        r4 = rx3.C13598b0.f38549a;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x04a2, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x04a3, code lost:
        if (r4 == false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x04a5, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r37);
        r4.append('_');
        r4.append(r3.f136810d);
        r10.put(r4.toString(), new java.lang.Integer(10000));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x04c7, code lost:
        r12 = r6;
        r4 = r14;
        r6 = r26;
        r5 = r27;
        r3 = r28;
        r7 = r29;
        r8 = r30;
        r9 = r33;
        r11 = r34;
        r13 = r35;
        r14 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x04dd, code lost:
        sx3.C64197v.m75542k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x04e1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x04e2, code lost:
        r26 = r6;
        r29 = r7;
        r30 = r8;
        r33 = r9;
        r34 = r11;
        r6 = r12;
        r35 = r13;
        r36 = r14;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04f8, code lost:
        if ((!r10.isEmpty()) != false) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x04fa, code lost:
        r14.mo140619m3(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0500, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0501, code lost:
        r3 = r14;
        r4 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0505, code lost:
        r3 = r4;
        r25 = r5;
        r26 = r6;
        r29 = r7;
        r30 = r8;
        r33 = r9;
        r34 = r11;
        r6 = r12;
        r35 = r13;
        r36 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0517, code lost:
        r11 = r0;
        r4 = r3;
        r12 = r6;
        r3 = r16;
        r5 = r25;
        r6 = r26;
        r7 = r29;
        r8 = r30;
        r9 = r33;
        r13 = r35;
        r14 = r36;
        r16 = r2;
        r2 = r40;
        r40 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0532, code lost:
        r25 = r5;
        r26 = r6;
        r5 = r11;
        r31 = r12;
        r11 = r40;
        r0 = pb1.C100753y.f295167a;
        pb1.C100753y.f295168b.f265529j = r5.size();
        pb1.C100753y.f295168b.f265530k = r31.size();
        r6 = r16;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, "check need upload size thumb:" + r31.size() + " data:" + r5.size());
        r0 = r31.iterator();
        r10 = r2;
        r2 = r6;
        r13 = r21;
        r14 = r22;
        r15 = r23;
        r6 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0587, code lost:
        if (r0.hasNext() == false) goto L_0x07f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0589, code lost:
        r12 = (te3.C101834rc0) r0.next();
        r40 = r7;
        r16 = r8;
        r21 = r13;
        r7 = qg2.C101147j0.m132611D(r12, r1.field_msgId, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x05a0, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r7) == false) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x05a2, code lost:
        r8 = ((pb1.C100719k0) di3.C86312j.m106911c(r9)).i50(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x05b0, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r8) == false) goto L_0x05b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x05b2, code lost:
        r8 = ((pb1.C100719k0) di3.C86312j.m106911c(r9)).je0("RecordFavFSC_DownloadFavThumb", r12);
        r13 = new java.lang.StringBuilder();
        r22 = r9;
        r13.append("RecordFavFSC_Fav_Download_Thumb_");
        r23 = r2;
        r9 = r3;
        r13.append(r1.field_msgId);
        r13.append('_');
        r13.append(r12.f299280T);
        r8.field_mediaId = r13.toString();
        r8.field_fullpath = new com.tencent.p014mm.vfs.C86009m1((com.tencent.p014mm.vfs.C86009m1) ((rx3.C36570n) r4.f296122g).getValue(), r8.field_mediaId).mo119971i();
        r2 = di3.C86312j.m106911c(r6);
        gy3.C87412m.m108593f(r2, r14);
        r10.f296131d = r4;
        r10.f296132e = r1;
        r10.f296133f = r5;
        r10.f296134g = r0;
        r10.f296135h = r12;
        r10.f296136i = r7;
        r10.f296137j = r8;
        r10.f296138n = null;
        r10.f296139o = r9;
        r10.f296142r = 2;
        r2 = p663qo.C77384i.C77385a.m93301a((p663qo.C77384i) r2, r8, 0, (java.lang.ref.WeakReference) null, r10, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x062a, code lost:
        if (r2 == r11) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x062c, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x062d, code lost:
        r13 = r7;
        r3 = r8;
        r8 = r16;
        r7 = r40;
        r40 = r4;
        r16 = r15;
        r4 = r24;
        r15 = r14;
        r14 = r21;
        r21 = r9;
        r9 = r22;
        r22 = r0;
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0644, code lost:
        r2 = (com.tencent.p014mm.modelcdntran.C92798v) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0646, code lost:
        if (r2 != null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0648, code lost:
        r23 = r1;
        r1 = r2.f267130a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x064d, code lost:
        r23 = r1;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0650, code lost:
        if (r1 != r8) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0652, code lost:
        if (r2 != null) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0654, code lost:
        r1 = r2.f267130a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0657, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0658, code lost:
        if (r1 != r7) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x065b, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("needUploadThumb but file not exist and try download fail, action:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0666, code lost:
        if (r2 != null) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0668, code lost:
        r3 = r2.f267130a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x066b, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x066c, code lost:
        r1.append(r3);
        r1.append(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0672, code lost:
        if (r2 != null) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0674, code lost:
        r3 = new java.lang.Integer(r2.f267132c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x067c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x067d, code lost:
        r1.append(r3);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0688, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, "needUploadThumb but file not exist and try download success, move file " + com.tencent.p014mm.vfs.C86013q1.m106463x(r3.field_fullpath, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x06a3, code lost:
        r26 = r0;
        r24 = r4;
        r3 = r13;
        r0 = r23;
        r13 = r10;
        r23 = r15;
        r15 = r22;
        r10 = r6;
        r22 = r9;
        r6 = r16;
        r9 = r21;
        r16 = r8;
        r21 = r14;
        r8 = r5;
        r14 = r11;
        r11 = r7;
        r7 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x06c0, code lost:
        r13 = r1;
        r22 = r9;
        r9 = r3;
        r3 = r0;
        r1 = r2;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "needUploadThumb fav file exist and copy " + com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x06e4, code lost:
        r13 = r1;
        r1 = r2;
        r22 = r9;
        r9 = r3;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x06ea, code lost:
        r26 = r1;
        r8 = r5;
        r0 = r13;
        r23 = r14;
        r13 = r10;
        r14 = r11;
        r11 = r40;
        r10 = r6;
        r6 = r15;
        r15 = r3;
        r3 = r7;
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x06fd, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r3) == false) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x06ff, code lost:
        r7.mo140619m3(r0);
        r0 = pb1.C100753y.f295167a;
        r1 = pb1.C100753y.f295168b;
        r1.f265531l = -1;
        r1.f265532m = 1;
        r1.f265533n = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x070f, code lost:
        if (r9 != 0) goto L_0x0711;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0711, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0713, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0714, code lost:
        r0.mo140173a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0719, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x071a, code lost:
        gy3.C87412m.m108593f(r3, "toThumbPath");
        r5 = r12.f299309j;
        gy3.C87412m.m108593f(r5, "dataItem.cdnThumbKey");
        r1 = r0.field_toUser;
        gy3.C87412m.m108593f(r1, r6);
        r28 = r6;
        r1 = r7.mo140614g3("RecordFavFSC_Record_Upload_Thumb_" + r12.f299280T, r3, 1, r5, r1);
        r13.f296131d = r7;
        r13.f296132e = r0;
        r13.f296133f = r8;
        r13.f296134g = r15;
        r13.f296135h = r12;
        r13.f296136i = null;
        r13.f296137j = null;
        r13.f296138n = null;
        r13.f296139o = r9;
        r13.f296142r = 3;
        r2 = r7.mo140620n3(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0765, code lost:
        if (r2 == r14) goto L_0x0767;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0767, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0768, code lost:
        r1 = r0;
        r4 = r7;
        r5 = r8;
        r6 = r10;
        r7 = r11;
        r10 = r13;
        r11 = r14;
        r0 = r15;
        r8 = r16;
        r13 = r21;
        r14 = r23;
        r3 = r26;
        r15 = r28;
        r21 = r9;
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x077e, code lost:
        r2 = (rx3.C13604l) r2;
        r40 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x078a, code lost:
        if (z04.C112551y.m153811k(r2.f38555d) != false) goto L_0x07d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0797, code lost:
        r12.mo141255k(r2.f38555d);
        r12.mo141256l(r2.f38556e);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, "update dataId:" + r12.f299280T + " thumb key:" + r12.f299309j + " url:" + r12.f299305h);
        r0 = r40;
        r2 = r3;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x07d7, code lost:
        r4.mo140619m3(r1);
        r0 = pb1.C100753y.f295167a;
        r1 = pb1.C100753y.f295168b;
        r1.f265531l = -1;
        r1.f265532m = 1;
        r1.f265533n = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x07e6, code lost:
        if (r21 != 0) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x07e8, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x07ea, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x07eb, code lost:
        r0.mo140173a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x07f0, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x07f1, code lost:
        r40 = r7;
        r16 = r8;
        r22 = r9;
        r21 = r13;
        r13 = r1;
        r1 = r2;
        r9 = r3;
        r0 = r5.iterator();
        r3 = r17;
        r5 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0808, code lost:
        if (r0.hasNext() == false) goto L_0x0a46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x080a, code lost:
        r2 = (te3.C101834rc0) r0.next();
        r40 = r7;
        r12 = r8;
        r16 = r3;
        r7 = qg2.C101147j0.m132636q(r2, r13.field_msgId, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0820, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r7) == false) goto L_0x0822;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0822, code lost:
        r3 = ((pb1.C100719k0) di3.C86312j.m106911c(r22)).mo135045L2(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0830, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r3) == false) goto L_0x0832;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0832, code lost:
        r3 = ((pb1.C100719k0) di3.C86312j.m106911c(r22)).Pn0("RecordFavFSC_DownloadFavData", r2);
        r8 = new java.lang.StringBuilder();
        r17 = r5;
        r8.append("RecordFavFSC_Fav_Download_Data_");
        r5 = r11;
        r23 = r12;
        r8.append(r13.field_msgId);
        r8.append('_');
        r8.append(r2.f299280T);
        r3.field_mediaId = r8.toString();
        r3.field_fullpath = new com.tencent.p014mm.vfs.C86009m1((com.tencent.p014mm.vfs.C86009m1) ((rx3.C36570n) r4.f296122g).getValue(), r3.field_mediaId).mo119971i();
        r8 = di3.C86312j.m106911c(r6);
        gy3.C87412m.m108593f(r8, r14);
        r10.f296131d = r4;
        r10.f296132e = r13;
        r10.f296133f = r0;
        r10.f296134g = r2;
        r10.f296135h = r7;
        r10.f296136i = r3;
        r10.f296137j = null;
        r10.f296138n = null;
        r10.f296139o = r9;
        r10.f296142r = 4;
        r8 = p663qo.C77384i.C77385a.m93301a((p663qo.C77384i) r8, r3, 0, (java.lang.ref.WeakReference) null, r10, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x08aa, code lost:
        if (r8 == r5) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x08ac, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x08ad, code lost:
        r11 = r5;
        r12 = r7;
        r5 = r17;
        r7 = r40;
        r40 = r4;
        r17 = r15;
        r4 = r24;
        r15 = r14;
        r14 = r21;
        r21 = r9;
        r9 = r22;
        r22 = r0;
        r0 = r1;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x08c5, code lost:
        r8 = (com.tencent.p014mm.modelcdntran.C92798v) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x08c7, code lost:
        if (r8 != null) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x08c9, code lost:
        r23 = r2;
        r2 = r8.f267130a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x08ce, code lost:
        r23 = r2;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x08d1, code lost:
        if (r2 != r1) goto L_0x08d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x08d3, code lost:
        if (r8 != null) goto L_0x08d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x08d5, code lost:
        r2 = r8.f267130a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x08d8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x08d9, code lost:
        if (r2 != r7) goto L_0x08dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x08dc, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("needUploadData but file not exist and try download fail, action:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x08e7, code lost:
        if (r8 != null) goto L_0x08e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x08e9, code lost:
        r3 = r8.f267130a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x08ec, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x08ed, code lost:
        r2.append(r3);
        r2.append(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x08f3, code lost:
        if (r8 != null) goto L_0x08f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x08f5, code lost:
        r8 = new java.lang.Integer(r8.f267132c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x08fd, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x08fe, code lost:
        r2.append(r8);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0909, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, "needUploadData but file not exist and try download success, move file " + com.tencent.p014mm.vfs.C86013q1.m106463x(r3.field_fullpath, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0924, code lost:
        r25 = r0;
        r24 = r4;
        r3 = r12;
        r0 = r13;
        r8 = r22;
        r22 = r9;
        r12 = r10;
        r13 = r11;
        r9 = r21;
        r10 = r6;
        r11 = r7;
        r21 = r14;
        r6 = r17;
        r14 = r23;
        r7 = r40;
        r23 = r1;
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0941, code lost:
        r17 = r5;
        r5 = r11;
        r23 = r12;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "needUploadData fav file exist and copy " + com.tencent.p014mm.vfs.C86013q1.m106443d(r3, r7, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0961, code lost:
        r17 = r5;
        r5 = r11;
        r23 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0966, code lost:
        r11 = r40;
        r8 = r0;
        r25 = r1;
        r3 = r7;
        r12 = r10;
        r0 = r13;
        r7 = r4;
        r13 = r5;
        r10 = r6;
        r6 = r15;
        r15 = r14;
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0978, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r3) == false) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x097a, code lost:
        r7.mo140619m3(r0);
        r0 = pb1.C100753y.f295167a;
        r1 = pb1.C100753y.f295168b;
        r1.f265531l = -1;
        r1.f265532m = 1;
        r1.f265533n = -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x098a, code lost:
        if (r9 != 0) goto L_0x098c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x098c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x098e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x098f, code lost:
        r0.mo140173a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0994, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0995, code lost:
        r4 = qg2.C101147j0.m132635p(r14.f299258I, (int) com.tencent.p014mm.vfs.C86013q1.m106451l(r3));
        gy3.C87412m.m108593f(r3, "toDataPath");
        r5 = r14.f299329u;
        gy3.C87412m.m108593f(r5, "dataItem.cdnDataKey");
        r1 = r0.field_toUser;
        gy3.C87412m.m108593f(r1, r6);
        r27 = r6;
        r1 = r7.mo140614g3("RecordFavFSC_Record_Upload_Data_" + r14.f299280T, r3, r4, r5, r1);
        r12.f296131d = r7;
        r12.f296132e = r0;
        r12.f296133f = r8;
        r12.f296134g = r14;
        r12.f296135h = null;
        r12.f296136i = null;
        r12.f296137j = null;
        r12.f296138n = null;
        r12.f296139o = r9;
        r12.f296142r = 5;
        r2 = r7.mo140620n3(r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x09ea, code lost:
        if (r2 == r13) goto L_0x09ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x09ec, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x09ed, code lost:
        r4 = r7;
        r6 = r10;
        r7 = r11;
        r10 = r12;
        r11 = r13;
        r12 = r14;
        r14 = r15;
        r3 = r16;
        r5 = r17;
        r1 = r25;
        r15 = r27;
        r13 = r0;
        r0 = r8;
        r8 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0a00, code lost:
        r2 = (rx3.C13604l) r2;
        r40 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0a0c, code lost:
        if (z04.C112551y.m153811k(r2.f38555d) != false) goto L_0x0a2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0a19, code lost:
        r12.mo141253f(r2.f38555d);
        r12.mo141254j(r2.f38556e);
        r0 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0a2b, code lost:
        r4.mo140619m3(r13);
        r0 = pb1.C100753y.f295167a;
        r1 = pb1.C100753y.f295168b;
        r1.f265531l = -1;
        r1.f265532m = 1;
        r1.f265533n = -3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0a3b, code lost:
        if (r9 != 0) goto L_0x0a3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0a3d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0a3f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0a40, code lost:
        r0.mo140173a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0a45, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0a46, code lost:
        r16 = r3;
        r17 = r5;
        r5 = r11;
        r4.mo140616j3(r13.field_dataProto);
        r0 = pb1.C100753y.f295167a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0a52, code lost:
        if (r9 != 0) goto L_0x0a54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0a54, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0a56, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0a57, code lost:
        r0.mo140173a(r3);
        r11 = r5;
        r3 = r16;
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0a73, code lost:
        r0 = r13.field_dataProto;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0a75, code lost:
        if (r0 != null) goto L_0x0a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0a77, code lost:
        r0 = qg2.C101147j0.m132626g(r13.field_title, r13.field_desc, r0, "", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0a86, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0a87, code lost:
        if (r0 == null) goto L_0x0a89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0a89, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0a8b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "upload end, generate final XML " + com.tencent.p014mm.sdk.p134kt.CommonKt.toLimitString(r0, 100));
        r2 = ((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(r5)).mo96095LE()).b00(r13.field_msgId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0ac2, code lost:
        if (r2.getMsgId() != r13.field_msgId) goto L_0x0ac4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0ac4, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "msgId not same " + r2.getMsgId() + ' ' + r13.field_msgId + " localId:" + r13.field_localId);
        ((qg2.C101143h0) ((og2.C100336e) di3.C86312j.m106911c(r3)).k10()).mo140594jo(r13.field_localId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0b02, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0b03, code lost:
        r2.mo108732L2(r0);
        r2.mo100991d(1);
        ((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(r5)).mo96095LE()).xy0(r13.field_msgId, r2);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "update msg sending " + r13.field_msgId);
        r0 = ((com.tencent.p014mm.pluginsdk.model.app.C96776s) ((p763ym.C53543s) di3.C86312j.m106911c(r24)).mo74023HM()).mo135038a0(r13.field_msgId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0b44, code lost:
        if (r0 != null) goto L_0x0b46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0b46, code lost:
        r0.field_xml = r2.getContent();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "update appmessage info " + r13.field_msgId + ' ' + ((com.tencent.p014mm.pluginsdk.model.app.C96776s) ((p763ym.C53543s) di3.C86312j.m106911c(r24)).mo74023HM()).mo135037Lo(r0, new java.lang.String[]{"msgId"}));
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0b82, code lost:
        ((qg2.C101143h0) ((og2.C100336e) di3.C86312j.m106911c(r3)).k10()).mo140594jo(r13.field_localId);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "delete record msg storage " + r13.field_localId);
        r3 = new hc3.C98343d();
        r5 = r2.getContent();
        gy3.C87412m.m108593f(r5, "msg.content");
        r3.mo141099d(r5);
        r5 = rx3.C13598b0.f38549a;
        r10.f296131d = r4;
        r10.f296132e = r13;
        r5 = null;
        r10.f296133f = null;
        r10.f296134g = null;
        r10.f296135h = null;
        r10.f296136i = null;
        r10.f296137j = null;
        r10.f296138n = null;
        r10.f296142r = 6;
        r2 = ((p455bn.C54500b) di3.C86312j.m106911c(p455bn.C54500b.class)).mo75336ON(r2, r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0bdd, code lost:
        if (r2 == r11) goto L_0x0bdf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0bdf, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0be0, code lost:
        r3 = r4;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0be2, code lost:
        r2 = (te3.C64596nz3) r2;
        r4 = new java.lang.StringBuilder();
        r4.append("dosceneSendAppMsg localId:");
        r4.append(r0.field_localId);
        r4.append(" msgId:");
        r4.append(r0.field_msgId);
        r4.append(" msgSvrId:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0c02, code lost:
        if (r2 != null) goto L_0x0c04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0c04, code lost:
        r0 = new java.lang.Long(r2.f184595n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0c0c, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0c0d, code lost:
        r4.append(r0);
        r4.append(" msgSource:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0c15, code lost:
        if (r2 != null) goto L_0x0c17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0c17, code lost:
        r0 = r2.f184597p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0c1a, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0c1b, code lost:
        r4.append(r0);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4.toString());
        r3.mo140617k3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0c2a, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01d8, code lost:
        if (r14.hasNext() == false) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01da, code lost:
        r0 = (java.util.List) r14.next();
        r25 = r5;
        r5 = new te3.C52240zb();
        r26 = r6;
        r5.f145784e.addAll(r0);
        r5.f145783d = r0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0 = new ob0.C47350c.C47352b();
        r0.f127069d = 632;
        r0.f127068c = "/cgi-bin/micromsg-bin/batchtranscdnitem";
        r0.f127066a = r5;
        r0.f127067b = new te3.C48691ac();
        r0 = r0.mo72403a();
        r5 = new ob0.C89132b();
        r5.mo123453j(r0);
        r2.f296131d = r4;
        r2.f296132e = r1;
        r2.f296133f = r13;
        r2.f296134g = r15;
        r2.f296135h = r10;
        r2.f296136i = r12;
        r2.f296137j = r11;
        r2.f296138n = r14;
        r2.f296139o = r3;
        r2.f296142r = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0230, code lost:
        r6 = r10;
        r10 = r5;
        r5 = r11;
        r31 = r12;
        r27 = r13;
        r32 = r16;
        r28 = r14;
        r33 = r40;
        r30 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = q40.C89456b.m111831a(r10, 0, (mp3.C88819d) null, r2, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x024b, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x024d, code lost:
        if (r0 == r11) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x024f, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0250, code lost:
        r10 = r2;
        r13 = r21;
        r14 = r22;
        r15 = r23;
        r12 = r28;
        r22 = r31;
        r16 = r32;
        r2 = r0;
        r21 = r5;
        r23 = r6;
        r5 = r25;
        r6 = r26;
        r25 = r27;
        r26 = r1;
        r27 = r4;
        r4 = r24;
        r24 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = (te3.C48691ac) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0273, code lost:
        r40 = r10;
        r2 = r16;
        r10 = r23;
        r1 = r26;
        r16 = r3;
        r23 = r15;
        r15 = r24;
        r3 = r0;
        r24 = r4;
        r0 = r21;
        r4 = r27;
        r21 = r13;
        r13 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x028e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x028f, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0292, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0293, code lost:
        r6 = r10;
        r5 = r11;
        r31 = r12;
        r27 = r13;
        r28 = r14;
        r30 = r15;
        r32 = r16;
        r11 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x02a1, code lost:
        r10 = r2;
        r13 = r21;
        r14 = r22;
        r15 = r23;
        r12 = r28;
        r22 = r31;
        r21 = r5;
        r23 = r6;
        r5 = r25;
        r6 = r26;
        r25 = r27;
        r26 = r1;
        r27 = r4;
        r4 = r24;
        r24 = r30;
        r1 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x02c0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, "cgi errCode:" + r0.f35058f + " errType:" + r0.f35057e + " errMsg:" + r0.f35059g);
        r16 = r3;
        r2 = r1;
        r40 = r10;
        r0 = r21;
        r10 = r23;
        r1 = r26;
        r3 = null;
        r21 = r13;
        r23 = r15;
        r15 = r24;
        r13 = r25;
        r24 = r4;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0304, code lost:
        r38 = r14;
        r14 = r12;
        r12 = r22;
        r22 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x030b, code lost:
        if (r3 == null) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x030d, code lost:
        r3 = r3.f130423e;
        r25 = r5;
        gy3.C87412m.m108593f(r3, "response.List");
        r3 = r3.iterator();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0320, code lost:
        if (r3.hasNext() != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0322, code lost:
        r26 = r3.next();
        r27 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0328, code lost:
        if (r5 >= 0) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x032a, code lost:
        r28 = r3;
        r3 = (te3.ki4) r26;
        r26 = r6;
        r29 = r7;
        r6 = (te3.C101834rc0) r13.get(new java.lang.Integer(r3.f136810d));
        r30 = r8;
        r33 = r9;
        r34 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0351, code lost:
        if (r6 != null) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0353, code lost:
        r35 = r13;
        r13 = r3.f136811e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0357, code lost:
        if (r13 == null) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0360, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0362, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0363, code lost:
        if (r13 == false) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0365, code lost:
        r13 = r3.f136812f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0367, code lost:
        if (r13 == null) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0370, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0372, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0373, code lost:
        if (r13 == false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0375, code lost:
        r36 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x037b, code lost:
        if (r3.f136814h > 0) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x037d, code lost:
        r6.mo141256l(r3.f136811e);
        r6.mo141255k(r3.f136812f);
        r6.mo141243R(r3.f136814h);
        r13 = new java.lang.StringBuilder();
        r13.append("update thumb cdn info ClientId:");
        r13.append(r3.f136810d);
        r13.append(" DataId:");
        r13.append(r6.f299280T);
        r13.append(" fileId:");
        r13.append(r3.f136811e);
        r13.append(" aeskey:");
        r13.append(r3.f136812f);
        r13.append(" size:");
        r14 = r4;
        r37 = r5;
        r13.append(r3.f136814h);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03c7, code lost:
        r14 = r4;
        r37 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x03cb, code lost:
        r37 = r5;
        r36 = r14;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x03d0, code lost:
        r12.add(r6);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, "need upload thumb cdn info ClientId:" + r3.f136810d + " DataId:" + r6.f299280T);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03f2, code lost:
        r4 = rx3.C13598b0.f38549a;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03f6, code lost:
        r37 = r5;
        r35 = r13;
        r36 = r14;
        r14 = r4;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x03fe, code lost:
        r5 = (te3.C101834rc0) r15.get(new java.lang.Integer(r3.f136810d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x040b, code lost:
        if (r5 != null) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x040d, code lost:
        r4 = r3.f136811e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x040f, code lost:
        if (r4 == null) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0418, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x041a, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x041b, code lost:
        if (r4 == false) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x041d, code lost:
        r4 = r3.f136812f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x041f, code lost:
        if (r4 == null) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0428, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x042a, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x042b, code lost:
        if (r4 == false) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x042d, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0432, code lost:
        if (r3.f136814h > 0) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0434, code lost:
        r5.mo141254j(r3.f136811e);
        r5.mo141253f(r3.f136812f);
        r5.mo141269y(r3.f136814h);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, "update data cdn info ClientId:" + r3.f136810d + " DataId:" + r5.f299280T + " fileId:" + r3.f136811e + " aeskey:" + r3.f136812f + " size:" + r3.f136814h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x047b, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x06ff  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0711  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0713  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x097a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x098c  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x098e  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0995  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo140618l3(og2.C100346q r40, wx3.C15601d<? super rx3.C13598b0> r41) {
        /*
            r39 = this;
            r1 = r39
            r0 = r40
            r2 = r41
            java.lang.Class<og2.e> r3 = og2.C100336e.class
            java.lang.Class<ym.s> r4 = p763ym.C53543s.class
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.Class<qo.i> r6 = p663qo.C77384i.class
            com.tencent.mm.modelcdntran.v$a r7 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackFindLocal
            com.tencent.mm.modelcdntran.v$a r8 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackSuccess
            java.lang.Class<pb1.k0> r9 = pb1.C100719k0.class
            boolean r10 = r2 instanceof qg2.C101170w.C101174d
            if (r10 == 0) goto L_0x0027
            r10 = r2
            qg2.w$d r10 = (qg2.C101170w.C101174d) r10
            int r11 = r10.f296142r
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r11 & r12
            if (r13 == 0) goto L_0x0027
            int r11 = r11 - r12
            r10.f296142r = r11
            goto L_0x002c
        L_0x0027:
            qg2.w$d r10 = new qg2.w$d
            r10.<init>(r1, r2)
        L_0x002c:
            java.lang.Object r2 = r10.f296140p
            xx3.a r11 = xx3.C15911a.COROUTINE_SUSPENDED
            int r12 = r10.f296142r
            java.lang.String r13 = " ret:"
            java.lang.String r14 = "getService(ICdnFeatureService::class.java)"
            java.lang.String r15 = "info.field_toUser"
            java.lang.String r16 = "MicroMsg.RecordFromFavSendFSC"
            r17 = r3
            switch(r12) {
                case 0: goto L_0x0165;
                case 1: goto L_0x012a;
                case 2: goto L_0x00e9;
                case 3: goto L_0x00bb;
                case 4: goto L_0x0084;
                case 5: goto L_0x0057;
                case 6: goto L_0x0047;
                default: goto L_0x003f;
            }
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            java.lang.Object r0 = r10.f296132e
            og2.q r0 = (og2.C100346q) r0
            java.lang.Object r3 = r10.f296131d
            qg2.w r3 = (qg2.C101170w) r3
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r16
            r5 = 0
            goto L_0x0be2
        L_0x0057:
            int r0 = r10.f296139o
            java.lang.Object r12 = r10.f296134g
            te3.rc0 r12 = (te3.C101834rc0) r12
            java.lang.Object r3 = r10.f296133f
            java.util.Iterator r3 = (java.util.Iterator) r3
            r40 = r0
            java.lang.Object r0 = r10.f296132e
            og2.q r0 = (og2.C100346q) r0
            r21 = r0
            java.lang.Object r0 = r10.f296131d
            qg2.w r0 = (qg2.C101170w) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r24 = r4
            r22 = r9
            r1 = r16
            r9 = r40
            r4 = r0
            r0 = r3
            r3 = r17
            r38 = r21
            r21 = r13
            r13 = r38
            goto L_0x0a00
        L_0x0084:
            int r0 = r10.f296139o
            java.lang.Object r3 = r10.f296136i
            gi.g r3 = (p1081gi.C98124g) r3
            java.lang.Object r12 = r10.f296135h
            java.lang.String r12 = (java.lang.String) r12
            r21 = r0
            java.lang.Object r0 = r10.f296134g
            te3.rc0 r0 = (te3.C101834rc0) r0
            r40 = r0
            java.lang.Object r0 = r10.f296133f
            java.util.Iterator r0 = (java.util.Iterator) r0
            r22 = r0
            java.lang.Object r0 = r10.f296132e
            og2.q r0 = (og2.C100346q) r0
            r23 = r0
            java.lang.Object r0 = r10.f296131d
            qg2.w r0 = (qg2.C101170w) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r8
            r8 = r2
            r2 = r40
            r40 = r0
            r0 = r16
            r16 = r17
            r17 = r15
            r15 = r14
            r14 = r13
            r13 = r23
            goto L_0x08c5
        L_0x00bb:
            int r0 = r10.f296139o
            java.lang.Object r3 = r10.f296135h
            te3.rc0 r3 = (te3.C101834rc0) r3
            java.lang.Object r12 = r10.f296134g
            java.util.Iterator r12 = (java.util.Iterator) r12
            r21 = r0
            java.lang.Object r0 = r10.f296133f
            java.util.List r0 = (java.util.List) r0
            r40 = r0
            java.lang.Object r0 = r10.f296132e
            og2.q r0 = (og2.C100346q) r0
            r22 = r0
            java.lang.Object r0 = r10.f296131d
            qg2.w r0 = (qg2.C101170w) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r24 = r4
            r25 = r5
            r1 = r22
            r5 = r40
            r4 = r0
            r0 = r12
            r12 = r3
            r3 = r16
            goto L_0x077e
        L_0x00e9:
            int r0 = r10.f296139o
            java.lang.Object r3 = r10.f296137j
            gi.g r3 = (p1081gi.C98124g) r3
            java.lang.Object r12 = r10.f296136i
            java.lang.String r12 = (java.lang.String) r12
            r21 = r0
            java.lang.Object r0 = r10.f296135h
            te3.rc0 r0 = (te3.C101834rc0) r0
            r40 = r0
            java.lang.Object r0 = r10.f296134g
            java.util.Iterator r0 = (java.util.Iterator) r0
            r22 = r0
            java.lang.Object r0 = r10.f296133f
            java.util.List r0 = (java.util.List) r0
            r23 = r0
            java.lang.Object r0 = r10.f296132e
            og2.q r0 = (og2.C100346q) r0
            r24 = r0
            java.lang.Object r0 = r10.f296131d
            qg2.w r0 = (qg2.C101170w) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r25 = r5
            r5 = r23
            r1 = r24
            r38 = r12
            r12 = r40
            r40 = r0
            r0 = r16
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r38
            goto L_0x0644
        L_0x012a:
            int r3 = r10.f296139o
            java.lang.Object r0 = r10.f296138n
            r12 = r0
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r0 = r10.f296137j
            r21 = r0
            java.util.List r21 = (java.util.List) r21
            java.lang.Object r0 = r10.f296136i
            r22 = r0
            java.util.List r22 = (java.util.List) r22
            java.lang.Object r0 = r10.f296135h
            r23 = r0
            java.util.Map r23 = (java.util.Map) r23
            java.lang.Object r0 = r10.f296134g
            r24 = r0
            java.util.Map r24 = (java.util.Map) r24
            java.lang.Object r0 = r10.f296133f
            r25 = r0
            java.util.Map r25 = (java.util.Map) r25
            java.lang.Object r0 = r10.f296132e
            r26 = r0
            og2.q r26 = (og2.C100346q) r26
            java.lang.Object r0 = r10.f296131d
            r27 = r0
            qg2.w r27 = (qg2.C101170w) r27
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ d -> 0x0160 }
            goto L_0x0270
        L_0x0160:
            r0 = move-exception
            r1 = r16
            goto L_0x02c0
        L_0x0165:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.LinkedHashMap r21 = new java.util.LinkedHashMap
            r21.<init>()
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            r24 = r4
            te3.kd0 r4 = r0.field_dataProto
            r1.mo140615i3(r2, r3, r12, r4)
            int r4 = r0.field_type
            r1 = 1
            if (r4 != r1) goto L_0x0194
            r4 = 1
            goto L_0x0195
        L_0x0194:
            r4 = 0
        L_0x0195:
            boolean r20 = r2.isEmpty()
            r25 = r20 ^ 1
            if (r25 == 0) goto L_0x0a60
            pb1.y r1 = pb1.C100753y.f295167a
            int r1 = r2.size()
            r25 = r3
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r3 = pb1.C100753y.f295168b
            r3.f265528i = r1
            r1 = r5
            r26 = r6
            long r5 = r0.field_msgId
            r3.f265535p = r5
            r3 = 20
            java.util.List r2 = com.tencent.p014mm.sdk.p134kt.CommonKt.splitList(r2, r3)
            java.util.Iterator r2 = r2.iterator()
            r5 = r1
            r3 = r4
            r40 = r11
            r11 = r23
            r6 = r26
            r4 = r39
            r1 = r0
            r23 = r15
            r15 = r12
            r12 = r22
            r22 = r14
            r14 = r2
            r2 = r10
            r10 = r21
            r21 = r13
            r13 = r25
        L_0x01d4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0532
            java.lang.Object r0 = r14.next()
            java.util.List r0 = (java.util.List) r0
            r25 = r5
            te3.zb r5 = new te3.zb
            r5.<init>()
            r26 = r6
            java.util.LinkedList<te3.ki4> r6 = r5.f145784e
            r6.addAll(r0)
            int r0 = r0.size()
            r5.f145783d = r0
            ob0.c$b r0 = new ob0.c$b     // Catch:{ d -> 0x0292 }
            r0.<init>()     // Catch:{ d -> 0x0292 }
            r6 = 632(0x278, float:8.86E-43)
            r0.f127069d = r6     // Catch:{ d -> 0x0292 }
            java.lang.String r6 = "/cgi-bin/micromsg-bin/batchtranscdnitem"
            r0.f127068c = r6     // Catch:{ d -> 0x0292 }
            r0.f127066a = r5     // Catch:{ d -> 0x0292 }
            te3.ac r5 = new te3.ac     // Catch:{ d -> 0x0292 }
            r5.<init>()     // Catch:{ d -> 0x0292 }
            r0.f127067b = r5     // Catch:{ d -> 0x0292 }
            ob0.c r0 = r0.mo72403a()     // Catch:{ d -> 0x0292 }
            ob0.b r5 = new ob0.b     // Catch:{ d -> 0x0292 }
            r5.<init>()     // Catch:{ d -> 0x0292 }
            r5.mo123453j(r0)     // Catch:{ d -> 0x0292 }
            r27 = 0
            r0 = 0
            r29 = 0
            r2.f296131d = r4     // Catch:{ d -> 0x0292 }
            r2.f296132e = r1     // Catch:{ d -> 0x0292 }
            r2.f296133f = r13     // Catch:{ d -> 0x0292 }
            r2.f296134g = r15     // Catch:{ d -> 0x0292 }
            r2.f296135h = r10     // Catch:{ d -> 0x0292 }
            r2.f296136i = r12     // Catch:{ d -> 0x0292 }
            r2.f296137j = r11     // Catch:{ d -> 0x0292 }
            r2.f296138n = r14     // Catch:{ d -> 0x0292 }
            r2.f296139o = r3     // Catch:{ d -> 0x0292 }
            r6 = 1
            r2.f296142r = r6     // Catch:{ d -> 0x0292 }
            r6 = r10
            r10 = r5
            r5 = r11
            r31 = r12
            r11 = r27
            r27 = r13
            r32 = r16
            r13 = r0
            r28 = r14
            r14 = r2
            r33 = r40
            r30 = r15
            r0 = 3
            r15 = r0
            r16 = r29
            java.lang.Object r0 = q40.C89456b.m111831a(r10, r11, r13, r14, r15, r16)     // Catch:{ d -> 0x028e }
            r11 = r33
            if (r0 != r11) goto L_0x0250
            return r11
        L_0x0250:
            r10 = r2
            r13 = r21
            r14 = r22
            r15 = r23
            r12 = r28
            r22 = r31
            r16 = r32
            r2 = r0
            r21 = r5
            r23 = r6
            r5 = r25
            r6 = r26
            r25 = r27
            r26 = r1
            r27 = r4
            r4 = r24
            r24 = r30
        L_0x0270:
            r0 = r2
            te3.ac r0 = (te3.C48691ac) r0     // Catch:{ d -> 0x0160 }
            r40 = r10
            r2 = r16
            r10 = r23
            r1 = r26
            r16 = r3
            r23 = r15
            r15 = r24
            r3 = r0
            r24 = r4
            r0 = r21
            r4 = r27
            r21 = r13
            r13 = r25
            goto L_0x0304
        L_0x028e:
            r0 = move-exception
            r11 = r33
            goto L_0x02a1
        L_0x0292:
            r0 = move-exception
            r6 = r10
            r5 = r11
            r31 = r12
            r27 = r13
            r28 = r14
            r30 = r15
            r32 = r16
            r11 = r40
        L_0x02a1:
            r10 = r2
            r13 = r21
            r14 = r22
            r15 = r23
            r12 = r28
            r22 = r31
            r21 = r5
            r23 = r6
            r5 = r25
            r6 = r26
            r25 = r27
            r26 = r1
            r27 = r4
            r4 = r24
            r24 = r30
            r1 = r32
        L_0x02c0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r40 = r3
            java.lang.String r3 = "cgi errCode:"
            r2.append(r3)
            int r3 = r0.f35058f
            r2.append(r3)
            java.lang.String r3 = " errType:"
            r2.append(r3)
            int r3 = r0.f35057e
            r2.append(r3)
            java.lang.String r3 = " errMsg:"
            r2.append(r3)
            java.lang.String r0 = r0.f35059g
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r16 = r40
            r2 = r1
            r40 = r10
            r0 = r21
            r10 = r23
            r1 = r26
            r3 = 0
            r21 = r13
            r23 = r15
            r15 = r24
            r13 = r25
            r24 = r4
            r4 = r27
        L_0x0304:
            r38 = r14
            r14 = r12
            r12 = r22
            r22 = r38
            if (r3 == 0) goto L_0x0505
            java.util.LinkedList<te3.ki4> r3 = r3.f130423e
            r25 = r5
            java.lang.String r5 = "response.List"
            gy3.C87412m.m108593f(r3, r5)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x031c:
            boolean r26 = r3.hasNext()
            if (r26 == 0) goto L_0x04e2
            java.lang.Object r26 = r3.next()
            int r27 = r5 + 1
            if (r5 < 0) goto L_0x04dd
            r28 = r3
            r3 = r26
            te3.ki4 r3 = (te3.ki4) r3
            r26 = r6
            int r6 = r3.f136810d
            r29 = r7
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            java.lang.Object r6 = r13.get(r7)
            te3.rc0 r6 = (te3.C101834rc0) r6
            java.lang.String r7 = " aeskey:"
            r30 = r8
            java.lang.String r8 = " fileId:"
            r31 = 0
            r33 = r9
            java.lang.String r9 = " DataId:"
            r34 = r11
            java.lang.String r11 = " size:"
            if (r6 == 0) goto L_0x03f6
            r35 = r13
            java.lang.String r13 = r3.f136811e
            if (r13 == 0) goto L_0x0362
            boolean r13 = z04.C112551y.m153811k(r13)
            if (r13 == 0) goto L_0x0360
            goto L_0x0362
        L_0x0360:
            r13 = 0
            goto L_0x0363
        L_0x0362:
            r13 = 1
        L_0x0363:
            if (r13 != 0) goto L_0x03cb
            java.lang.String r13 = r3.f136812f
            if (r13 == 0) goto L_0x0372
            boolean r13 = z04.C112551y.m153811k(r13)
            if (r13 == 0) goto L_0x0370
            goto L_0x0372
        L_0x0370:
            r13 = 0
            goto L_0x0373
        L_0x0372:
            r13 = 1
        L_0x0373:
            if (r13 != 0) goto L_0x03cb
            r36 = r14
            long r13 = r3.f136814h
            int r37 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r37 <= 0) goto L_0x03c7
            java.lang.String r13 = r3.f136811e
            r6.mo141256l(r13)
            java.lang.String r13 = r3.f136812f
            r6.mo141255k(r13)
            long r13 = r3.f136814h
            r6.mo141243R(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "update thumb cdn info ClientId:"
            r13.append(r14)
            int r14 = r3.f136810d
            r13.append(r14)
            r13.append(r9)
            java.lang.String r6 = r6.f299280T
            r13.append(r6)
            r13.append(r8)
            java.lang.String r6 = r3.f136811e
            r13.append(r6)
            r13.append(r7)
            java.lang.String r6 = r3.f136812f
            r13.append(r6)
            r13.append(r11)
            r14 = r4
            r37 = r5
            long r4 = r3.f136814h
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x03f2
        L_0x03c7:
            r14 = r4
            r37 = r5
            goto L_0x03d0
        L_0x03cb:
            r37 = r5
            r36 = r14
            r14 = r4
        L_0x03d0:
            r12.add(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "need upload thumb cdn info ClientId:"
            r4.append(r5)
            int r5 = r3.f136810d
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = r6.f299280T
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x03f2:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r4 = 1
            goto L_0x03fe
        L_0x03f6:
            r37 = r5
            r35 = r13
            r36 = r14
            r14 = r4
            r4 = 0
        L_0x03fe:
            int r5 = r3.f136810d
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            java.lang.Object r5 = r15.get(r6)
            te3.rc0 r5 = (te3.C101834rc0) r5
            if (r5 == 0) goto L_0x04a2
            java.lang.String r4 = r3.f136811e
            if (r4 == 0) goto L_0x041a
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x0418
            goto L_0x041a
        L_0x0418:
            r4 = 0
            goto L_0x041b
        L_0x041a:
            r4 = 1
        L_0x041b:
            if (r4 != 0) goto L_0x047b
            java.lang.String r4 = r3.f136812f
            if (r4 == 0) goto L_0x042a
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x0428
            goto L_0x042a
        L_0x0428:
            r4 = 0
            goto L_0x042b
        L_0x042a:
            r4 = 1
        L_0x042b:
            if (r4 != 0) goto L_0x047b
            r6 = r12
            long r12 = r3.f136814h
            int r4 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r4 <= 0) goto L_0x047c
            java.lang.String r4 = r3.f136811e
            r5.mo141254j(r4)
            java.lang.String r4 = r3.f136812f
            r5.mo141253f(r4)
            long r12 = r3.f136814h
            r5.mo141269y(r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "update data cdn info ClientId:"
            r4.append(r12)
            int r12 = r3.f136810d
            r4.append(r12)
            r4.append(r9)
            java.lang.String r5 = r5.f299280T
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = r3.f136811e
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = r3.f136812f
            r4.append(r5)
            r4.append(r11)
            long r7 = r3.f136814h
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x049e
        L_0x047b:
            r6 = r12
        L_0x047c:
            r0.add(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "need upload data cdn info ClientId:"
            r4.append(r7)
            int r7 = r3.f136810d
            r4.append(r7)
            r4.append(r9)
            java.lang.String r5 = r5.f299280T
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x049e:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r4 = 1
            goto L_0x04a3
        L_0x04a2:
            r6 = r12
        L_0x04a3:
            if (r4 != 0) goto L_0x04c7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r37
            r4.append(r5)
            r5 = 95
            r4.append(r5)
            int r3 = r3.f136810d
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r10.put(r3, r5)
        L_0x04c7:
            r12 = r6
            r4 = r14
            r6 = r26
            r5 = r27
            r3 = r28
            r7 = r29
            r8 = r30
            r9 = r33
            r11 = r34
            r13 = r35
            r14 = r36
            goto L_0x031c
        L_0x04dd:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x04e2:
            r26 = r6
            r29 = r7
            r30 = r8
            r33 = r9
            r34 = r11
            r6 = r12
            r35 = r13
            r36 = r14
            r14 = r4
            boolean r3 = r10.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0501
            r3 = r14
            r3.mo140619m3(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0501:
            r3 = r14
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0517
        L_0x0505:
            r3 = r4
            r25 = r5
            r26 = r6
            r29 = r7
            r30 = r8
            r33 = r9
            r34 = r11
            r6 = r12
            r35 = r13
            r36 = r14
        L_0x0517:
            r11 = r0
            r4 = r3
            r12 = r6
            r3 = r16
            r5 = r25
            r6 = r26
            r7 = r29
            r8 = r30
            r9 = r33
            r13 = r35
            r14 = r36
            r16 = r2
            r2 = r40
            r40 = r34
            goto L_0x01d4
        L_0x0532:
            r25 = r5
            r26 = r6
            r5 = r11
            r31 = r12
            r32 = r16
            r11 = r40
            pb1.y r0 = pb1.C100753y.f295167a
            int r0 = r5.size()
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r6 = pb1.C100753y.f295168b
            r6.f265529j = r0
            int r0 = r31.size()
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r6 = pb1.C100753y.f295168b
            r6.f265530k = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "check need upload size thumb:"
            r0.append(r6)
            int r6 = r31.size()
            r0.append(r6)
            java.lang.String r6 = " data:"
            r0.append(r6)
            int r6 = r5.size()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r6 = r32
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.util.Iterator r0 = r31.iterator()
            r10 = r2
            r2 = r6
            r13 = r21
            r14 = r22
            r15 = r23
            r6 = r26
        L_0x0583:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x07f1
            java.lang.Object r12 = r0.next()
            te3.rc0 r12 = (te3.C101834rc0) r12
            r40 = r7
            r16 = r8
            long r7 = r1.field_msgId
            r21 = r13
            r13 = 1
            java.lang.String r7 = qg2.C101147j0.m132611D(r12, r7, r13)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r8 != 0) goto L_0x06e4
            di3.d r8 = di3.C86312j.m106911c(r9)
            pb1.k0 r8 = (pb1.C100719k0) r8
            java.lang.String r8 = r8.i50(r12)
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r13 != 0) goto L_0x06c0
            di3.d r8 = di3.C86312j.m106911c(r9)
            pb1.k0 r8 = (pb1.C100719k0) r8
            java.lang.String r13 = "RecordFavFSC_DownloadFavThumb"
            gi.g r8 = r8.je0(r13, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r22 = r9
            java.lang.String r9 = "RecordFavFSC_Fav_Download_Thumb_"
            r13.append(r9)
            r23 = r2
            r9 = r3
            long r2 = r1.field_msgId
            r13.append(r2)
            r2 = 95
            r13.append(r2)
            java.lang.String r2 = r12.f299280T
            r13.append(r2)
            java.lang.String r2 = r13.toString()
            r8.field_mediaId = r2
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            rx3.g r3 = r4.f296122g
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.vfs.m1 r3 = (com.tencent.p014mm.vfs.C86009m1) r3
            java.lang.String r13 = r8.field_mediaId
            r2.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r13)
            java.lang.String r2 = r2.mo119971i()
            r8.field_fullpath = r2
            di3.d r2 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r2, r14)
            r26 = r2
            qo.i r26 = (p663qo.C77384i) r26
            r28 = 0
            r30 = 0
            r32 = 6
            r33 = 0
            r10.f296131d = r4
            r10.f296132e = r1
            r10.f296133f = r5
            r10.f296134g = r0
            r10.f296135h = r12
            r10.f296136i = r7
            r10.f296137j = r8
            r2 = 0
            r10.f296138n = r2
            r10.f296139o = r9
            r2 = 2
            r10.f296142r = r2
            r27 = r8
            r31 = r10
            java.lang.Object r2 = p663qo.C77384i.C77385a.m93301a(r26, r27, r28, r30, r31, r32, r33)
            if (r2 != r11) goto L_0x062d
            return r11
        L_0x062d:
            r13 = r7
            r3 = r8
            r8 = r16
            r7 = r40
            r40 = r4
            r16 = r15
            r4 = r24
            r15 = r14
            r14 = r21
            r21 = r9
            r9 = r22
            r22 = r0
            r0 = r23
        L_0x0644:
            com.tencent.mm.modelcdntran.v r2 = (com.tencent.p014mm.modelcdntran.C92798v) r2
            if (r2 == 0) goto L_0x064d
            r23 = r1
            com.tencent.mm.modelcdntran.v$a r1 = r2.f267130a
            goto L_0x0650
        L_0x064d:
            r23 = r1
            r1 = 0
        L_0x0650:
            if (r1 == r8) goto L_0x0688
            if (r2 == 0) goto L_0x0657
            com.tencent.mm.modelcdntran.v$a r1 = r2.f267130a
            goto L_0x0658
        L_0x0657:
            r1 = 0
        L_0x0658:
            if (r1 != r7) goto L_0x065b
            goto L_0x0688
        L_0x065b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "needUploadThumb but file not exist and try download fail, action:"
            r1.append(r3)
            if (r2 == 0) goto L_0x066b
            com.tencent.mm.modelcdntran.v$a r3 = r2.f267130a
            goto L_0x066c
        L_0x066b:
            r3 = 0
        L_0x066c:
            r1.append(r3)
            r1.append(r14)
            if (r2 == 0) goto L_0x067c
            int r2 = r2.f267132c
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            goto L_0x067d
        L_0x067c:
            r3 = 0
        L_0x067d:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x06a3
        L_0x0688:
            java.lang.String r1 = r3.field_fullpath
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106463x(r1, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "needUploadThumb but file not exist and try download success, move file "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x06a3:
            r26 = r0
            r24 = r4
            r3 = r13
            r0 = r23
            r13 = r10
            r23 = r15
            r15 = r22
            r10 = r6
            r22 = r9
            r6 = r16
            r9 = r21
            r16 = r8
            r21 = r14
            r8 = r5
            r14 = r11
            r11 = r7
            r7 = r40
            goto L_0x06f9
        L_0x06c0:
            r13 = r1
            r23 = r2
            r22 = r9
            r2 = 1
            r9 = r3
            r3 = r0
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r7, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "needUploadThumb fav file exist and copy "
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x06ea
        L_0x06e4:
            r13 = r1
            r1 = r2
            r22 = r9
            r9 = r3
            r3 = r0
        L_0x06ea:
            r26 = r1
            r8 = r5
            r0 = r13
            r23 = r14
            r13 = r10
            r14 = r11
            r11 = r40
            r10 = r6
            r6 = r15
            r15 = r3
            r3 = r7
            r7 = r4
        L_0x06f9:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r1 != 0) goto L_0x071a
            r7.mo140619m3(r0)
            pb1.y r0 = pb1.C100753y.f295167a
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r1 = pb1.C100753y.f295168b
            r2 = -1
            r1.f265531l = r2
            r2 = 1
            r1.f265532m = r2
            r2 = -2
            r1.f265533n = r2
            if (r9 == 0) goto L_0x0713
            r3 = 1
            goto L_0x0714
        L_0x0713:
            r3 = 0
        L_0x0714:
            r0.mo140173a(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x071a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RecordFavFSC_Record_Upload_Thumb_"
            r1.append(r2)
            java.lang.String r2 = r12.f299280T
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "toThumbPath"
            gy3.C87412m.m108593f(r3, r1)
            r4 = 1
            java.lang.String r5 = r12.f299309j
            java.lang.String r1 = "dataItem.cdnThumbKey"
            gy3.C87412m.m108593f(r5, r1)
            java.lang.String r1 = r0.field_toUser
            gy3.C87412m.m108593f(r1, r6)
            r27 = r1
            r1 = r7
            r28 = r6
            r6 = r27
            gi.g r1 = r1.mo140614g3(r2, r3, r4, r5, r6)
            r13.f296131d = r7
            r13.f296132e = r0
            r13.f296133f = r8
            r13.f296134g = r15
            r13.f296135h = r12
            r2 = 0
            r13.f296136i = r2
            r13.f296137j = r2
            r13.f296138n = r2
            r13.f296139o = r9
            r2 = 3
            r13.f296142r = r2
            java.lang.Object r2 = r7.mo140620n3(r1, r13)
            if (r2 != r14) goto L_0x0768
            return r14
        L_0x0768:
            r1 = r0
            r4 = r7
            r5 = r8
            r6 = r10
            r7 = r11
            r10 = r13
            r11 = r14
            r0 = r15
            r8 = r16
            r13 = r21
            r14 = r23
            r3 = r26
            r15 = r28
            r21 = r9
            r9 = r22
        L_0x077e:
            rx3.l r2 = (rx3.C13604l) r2
            r40 = r0
            A r0 = r2.f38555d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 != 0) goto L_0x07d7
            B r0 = r2.f38556e
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0797
            goto L_0x07d7
        L_0x0797:
            A r0 = r2.f38555d
            java.lang.String r0 = (java.lang.String) r0
            r12.mo141255k(r0)
            B r0 = r2.f38556e
            java.lang.String r0 = (java.lang.String) r0
            r12.mo141256l(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "update dataId:"
            r0.append(r2)
            java.lang.String r2 = r12.f299280T
            r0.append(r2)
            java.lang.String r2 = " thumb key:"
            r0.append(r2)
            java.lang.String r2 = r12.f299309j
            r0.append(r2)
            java.lang.String r2 = " url:"
            r0.append(r2)
            java.lang.String r2 = r12.f299305h
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r0 = r40
            r2 = r3
            r3 = r21
            goto L_0x0583
        L_0x07d7:
            r4.mo140619m3(r1)
            pb1.y r0 = pb1.C100753y.f295167a
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r1 = pb1.C100753y.f295168b
            r2 = -1
            r1.f265531l = r2
            r3 = 1
            r1.f265532m = r3
            r1.f265533n = r2
            if (r21 == 0) goto L_0x07ea
            r3 = 1
            goto L_0x07eb
        L_0x07ea:
            r3 = 0
        L_0x07eb:
            r0.mo140173a(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x07f1:
            r40 = r7
            r16 = r8
            r22 = r9
            r21 = r13
            r13 = r1
            r1 = r2
            r9 = r3
            java.util.Iterator r0 = r5.iterator()
            r3 = r17
            r5 = r25
        L_0x0804:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0a46
            java.lang.Object r2 = r0.next()
            te3.rc0 r2 = (te3.C101834rc0) r2
            r40 = r7
            r12 = r8
            long r7 = r13.field_msgId
            r16 = r3
            r3 = 1
            java.lang.String r7 = qg2.C101147j0.m132636q(r2, r7, r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r3 != 0) goto L_0x0961
            di3.d r3 = di3.C86312j.m106911c(r22)
            pb1.k0 r3 = (pb1.C100719k0) r3
            java.lang.String r3 = r3.mo135045L2(r2)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r8 != 0) goto L_0x0941
            di3.d r3 = di3.C86312j.m106911c(r22)
            pb1.k0 r3 = (pb1.C100719k0) r3
            java.lang.String r8 = "RecordFavFSC_DownloadFavData"
            gi.g r3 = r3.Pn0(r8, r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r17 = r5
            java.lang.String r5 = "RecordFavFSC_Fav_Download_Data_"
            r8.append(r5)
            r5 = r11
            r23 = r12
            long r11 = r13.field_msgId
            r8.append(r11)
            r11 = 95
            r8.append(r11)
            java.lang.String r12 = r2.f299280T
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            r3.field_mediaId = r8
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            rx3.g r12 = r4.f296122g
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            com.tencent.mm.vfs.m1 r12 = (com.tencent.p014mm.vfs.C86009m1) r12
            java.lang.String r11 = r3.field_mediaId
            r8.<init>((com.tencent.p014mm.vfs.C86009m1) r12, (java.lang.String) r11)
            java.lang.String r8 = r8.mo119971i()
            r3.field_fullpath = r8
            di3.d r8 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r8, r14)
            r25 = r8
            qo.i r25 = (p663qo.C77384i) r25
            r27 = 0
            r29 = 0
            r31 = 6
            r32 = 0
            r10.f296131d = r4
            r10.f296132e = r13
            r10.f296133f = r0
            r10.f296134g = r2
            r10.f296135h = r7
            r10.f296136i = r3
            r8 = 0
            r10.f296137j = r8
            r10.f296138n = r8
            r10.f296139o = r9
            r8 = 4
            r10.f296142r = r8
            r26 = r3
            r30 = r10
            java.lang.Object r8 = p663qo.C77384i.C77385a.m93301a(r25, r26, r27, r29, r30, r31, r32)
            if (r8 != r5) goto L_0x08ad
            return r5
        L_0x08ad:
            r11 = r5
            r12 = r7
            r5 = r17
            r7 = r40
            r40 = r4
            r17 = r15
            r4 = r24
            r15 = r14
            r14 = r21
            r21 = r9
            r9 = r22
            r22 = r0
            r0 = r1
            r1 = r23
        L_0x08c5:
            com.tencent.mm.modelcdntran.v r8 = (com.tencent.p014mm.modelcdntran.C92798v) r8
            if (r8 == 0) goto L_0x08ce
            r23 = r2
            com.tencent.mm.modelcdntran.v$a r2 = r8.f267130a
            goto L_0x08d1
        L_0x08ce:
            r23 = r2
            r2 = 0
        L_0x08d1:
            if (r2 == r1) goto L_0x0909
            if (r8 == 0) goto L_0x08d8
            com.tencent.mm.modelcdntran.v$a r2 = r8.f267130a
            goto L_0x08d9
        L_0x08d8:
            r2 = 0
        L_0x08d9:
            if (r2 != r7) goto L_0x08dc
            goto L_0x0909
        L_0x08dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "needUploadData but file not exist and try download fail, action:"
            r2.append(r3)
            if (r8 == 0) goto L_0x08ec
            com.tencent.mm.modelcdntran.v$a r3 = r8.f267130a
            goto L_0x08ed
        L_0x08ec:
            r3 = 0
        L_0x08ed:
            r2.append(r3)
            r2.append(r14)
            if (r8 == 0) goto L_0x08fd
            int r3 = r8.f267132c
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r3)
            goto L_0x08fe
        L_0x08fd:
            r8 = 0
        L_0x08fe:
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0924
        L_0x0909:
            java.lang.String r2 = r3.field_fullpath
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106463x(r2, r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "needUploadData but file not exist and try download success, move file "
            r3.append(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x0924:
            r25 = r0
            r24 = r4
            r3 = r12
            r0 = r13
            r8 = r22
            r22 = r9
            r12 = r10
            r13 = r11
            r9 = r21
            r10 = r6
            r11 = r7
            r21 = r14
            r6 = r17
            r14 = r23
            r7 = r40
            r23 = r1
            r17 = r5
            goto L_0x0974
        L_0x0941:
            r17 = r5
            r5 = r11
            r23 = r12
            r8 = 1
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106443d(r3, r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "needUploadData fav file exist and copy "
            r3.append(r8)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            goto L_0x0966
        L_0x0961:
            r17 = r5
            r5 = r11
            r23 = r12
        L_0x0966:
            r11 = r40
            r8 = r0
            r25 = r1
            r3 = r7
            r12 = r10
            r0 = r13
            r7 = r4
            r13 = r5
            r10 = r6
            r6 = r15
            r15 = r14
            r14 = r2
        L_0x0974:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r1 != 0) goto L_0x0995
            r7.mo140619m3(r0)
            pb1.y r0 = pb1.C100753y.f295167a
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r1 = pb1.C100753y.f295168b
            r2 = -1
            r1.f265531l = r2
            r2 = 1
            r1.f265532m = r2
            r2 = -4
            r1.f265533n = r2
            if (r9 == 0) goto L_0x098e
            r3 = 1
            goto L_0x098f
        L_0x098e:
            r3 = 0
        L_0x098f:
            r0.mo140173a(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0995:
            int r1 = r14.f299258I
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            int r2 = (int) r4
            int r4 = qg2.C101147j0.m132635p(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RecordFavFSC_Record_Upload_Data_"
            r1.append(r2)
            java.lang.String r2 = r14.f299280T
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "toDataPath"
            gy3.C87412m.m108593f(r3, r1)
            java.lang.String r5 = r14.f299329u
            java.lang.String r1 = "dataItem.cdnDataKey"
            gy3.C87412m.m108593f(r5, r1)
            java.lang.String r1 = r0.field_toUser
            gy3.C87412m.m108593f(r1, r6)
            r26 = r1
            r1 = r7
            r27 = r6
            r6 = r26
            gi.g r1 = r1.mo140614g3(r2, r3, r4, r5, r6)
            r12.f296131d = r7
            r12.f296132e = r0
            r12.f296133f = r8
            r12.f296134g = r14
            r2 = 0
            r12.f296135h = r2
            r12.f296136i = r2
            r12.f296137j = r2
            r12.f296138n = r2
            r12.f296139o = r9
            r2 = 5
            r12.f296142r = r2
            java.lang.Object r2 = r7.mo140620n3(r1, r12)
            if (r2 != r13) goto L_0x09ed
            return r13
        L_0x09ed:
            r4 = r7
            r6 = r10
            r7 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r14 = r15
            r3 = r16
            r5 = r17
            r1 = r25
            r15 = r27
            r13 = r0
            r0 = r8
            r8 = r23
        L_0x0a00:
            rx3.l r2 = (rx3.C13604l) r2
            r40 = r0
            A r0 = r2.f38555d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 != 0) goto L_0x0a2b
            B r0 = r2.f38556e
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0a19
            goto L_0x0a2b
        L_0x0a19:
            A r0 = r2.f38555d
            java.lang.String r0 = (java.lang.String) r0
            r12.mo141253f(r0)
            B r0 = r2.f38556e
            java.lang.String r0 = (java.lang.String) r0
            r12.mo141254j(r0)
            r0 = r40
            goto L_0x0804
        L_0x0a2b:
            r4.mo140619m3(r13)
            pb1.y r0 = pb1.C100753y.f295167a
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r1 = pb1.C100753y.f295168b
            r2 = -1
            r1.f265531l = r2
            r2 = 1
            r1.f265532m = r2
            r2 = -3
            r1.f265533n = r2
            if (r9 == 0) goto L_0x0a3f
            r3 = 1
            goto L_0x0a40
        L_0x0a3f:
            r3 = 0
        L_0x0a40:
            r0.mo140173a(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0a46:
            r16 = r3
            r17 = r5
            r5 = r11
            te3.kd0 r0 = r13.field_dataProto
            r4.mo140616j3(r0)
            pb1.y r0 = pb1.C100753y.f295167a
            if (r9 == 0) goto L_0x0a56
            r3 = 1
            goto L_0x0a57
        L_0x0a56:
            r3 = 0
        L_0x0a57:
            r0.mo140173a(r3)
            r11 = r5
            r3 = r16
            r5 = r17
            goto L_0x0a73
        L_0x0a60:
            r1 = r5
            pb1.y r2 = pb1.C100753y.f295167a
            com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct r3 = pb1.C100753y.f295168b
            r5 = 0
            r3.f265528i = r5
            r2.mo140173a(r4)
            r4 = r39
            r13 = r0
            r5 = r1
            r1 = r16
            r3 = r17
        L_0x0a73:
            te3.kd0 r0 = r13.field_dataProto
            if (r0 == 0) goto L_0x0a86
            java.lang.String r14 = r13.field_title
            java.lang.String r15 = r13.field_desc
            r18 = 0
            java.lang.String r17 = ""
            r16 = r0
            java.lang.String r0 = qg2.C101147j0.m132626g(r14, r15, r16, r17, r18)
            goto L_0x0a87
        L_0x0a86:
            r0 = 0
        L_0x0a87:
            if (r0 != 0) goto L_0x0a8b
            java.lang.String r0 = ""
        L_0x0a8b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "upload end, generate final XML "
            r2.append(r6)
            r6 = 100
            java.lang.String r6 = com.tencent.p014mm.sdk.p134kt.CommonKt.toLimitString(r0, r6)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            k40.a r2 = f40.C86709a0.m107533q(r5)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            long r6 = r13.field_msgId
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r6)
            long r6 = r2.getMsgId()
            long r8 = r13.field_msgId
            r12 = 32
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x0b03
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "msgId not same "
            r0.append(r4)
            long r4 = r2.getMsgId()
            r0.append(r4)
            r0.append(r12)
            long r4 = r13.field_msgId
            r0.append(r4)
            java.lang.String r2 = " localId:"
            r0.append(r2)
            int r2 = r13.field_localId
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            og2.e r0 = (og2.C100336e) r0
            og2.k r0 = r0.k10()
            int r1 = r13.field_localId
            qg2.h0 r0 = (qg2.C101143h0) r0
            r0.mo140594jo(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0b03:
            r2.mo108732L2(r0)
            r6 = 1
            r2.mo100991d(r6)
            k40.a r0 = f40.C86709a0.m107533q(r5)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            long r5 = r13.field_msgId
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r5, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "update msg sending "
            r0.append(r5)
            long r5 = r13.field_msgId
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r24)
            ym.s r0 = (p763ym.C53543s) r0
            ym.n r0 = r0.mo74023HM()
            long r5 = r13.field_msgId
            com.tencent.mm.pluginsdk.model.app.s r0 = (com.tencent.p014mm.pluginsdk.model.app.C96776s) r0
            com.tencent.mm.message.l r0 = r0.mo135038a0(r5)
            if (r0 == 0) goto L_0x0b82
            java.lang.String r5 = r2.getContent()
            r0.field_xml = r5
            di3.d r5 = di3.C86312j.m106911c(r24)
            ym.s r5 = (p763ym.C53543s) r5
            ym.n r5 = r5.mo74023HM()
            java.lang.String r6 = "msgId"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            com.tencent.mm.pluginsdk.model.app.s r5 = (com.tencent.p014mm.pluginsdk.model.app.C96776s) r5
            boolean r0 = r5.mo135037Lo(r0, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "update appmessage info "
            r5.append(r6)
            long r6 = r13.field_msgId
            r5.append(r6)
            r5.append(r12)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b82:
            di3.d r0 = di3.C86312j.m106911c(r3)
            og2.e r0 = (og2.C100336e) r0
            og2.k r0 = r0.k10()
            int r3 = r13.field_localId
            qg2.h0 r0 = (qg2.C101143h0) r0
            r0.mo140594jo(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "delete record msg storage "
            r0.append(r3)
            int r3 = r13.field_localId
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.Class<bn.b> r0 = p455bn.C54500b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            bn.b r0 = (p455bn.C54500b) r0
            hc3.d r3 = new hc3.d
            r3.<init>()
            java.lang.String r5 = r2.getContent()
            java.lang.String r6 = "msg.content"
            gy3.C87412m.m108593f(r5, r6)
            r3.mo141099d(r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r10.f296131d = r4
            r10.f296132e = r13
            r5 = 0
            r10.f296133f = r5
            r10.f296134g = r5
            r10.f296135h = r5
            r10.f296136i = r5
            r10.f296137j = r5
            r10.f296138n = r5
            r6 = 6
            r10.f296142r = r6
            java.lang.Object r2 = r0.mo75336ON(r2, r3, r10)
            if (r2 != r11) goto L_0x0be0
            return r11
        L_0x0be0:
            r3 = r4
            r0 = r13
        L_0x0be2:
            te3.nz3 r2 = (te3.C64596nz3) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "dosceneSendAppMsg localId:"
            r4.append(r6)
            int r6 = r0.field_localId
            r4.append(r6)
            java.lang.String r6 = " msgId:"
            r4.append(r6)
            long r6 = r0.field_msgId
            r4.append(r6)
            java.lang.String r0 = " msgSvrId:"
            r4.append(r0)
            if (r2 == 0) goto L_0x0c0c
            long r6 = r2.f184595n
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r6)
            goto L_0x0c0d
        L_0x0c0c:
            r0 = r5
        L_0x0c0d:
            r4.append(r0)
            java.lang.String r0 = " msgSource:"
            r4.append(r0)
            if (r2 == 0) goto L_0x0c1a
            java.lang.String r0 = r2.f184597p
            goto L_0x0c1b
        L_0x0c1a:
            r0 = r5
        L_0x0c1b:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r3.mo140617k3()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101170w.mo140618l3(og2.q, wx3.d):java.lang.Object");
    }

    /* renamed from: m3 */
    public final void mo140619m3(C100346q qVar) {
        Class cls = C75700k0.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(qVar.field_msgId);
        b002.mo100991d(5);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(qVar.field_msgId, b002);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo140620n3(p1081gi.C98124g r12, wx3.C15601d<? super rx3.C13604l<java.lang.String, java.lang.String>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof qg2.C101170w.C101175f
            if (r0 == 0) goto L_0x0013
            r0 = r13
            qg2.w$f r0 = (qg2.C101170w.C101175f) r0
            int r1 = r0.f296148i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f296148i = r1
            goto L_0x0018
        L_0x0013:
            qg2.w$f r0 = new qg2.w$f
            r0.<init>(r11, r13)
        L_0x0018:
            r6 = r0
            java.lang.Object r13 = r6.f296146g
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f296148i
            r2 = 1
            java.lang.String r9 = ""
            if (r1 == 0) goto L_0x0043
            if (r1 != r2) goto L_0x003b
            java.lang.Object r12 = r6.f296145f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r6.f296144e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.f296143d
            gi.g r1 = (p1081gi.C98124g) r1
            kotlin.ResultKt.throwOnFailure(r13)
            r10 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r10
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Class<qo.i> r13 = p663qo.C77384i.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            java.lang.String r1 = "getService(ICdnFeatureService::class.java)"
            gy3.C87412m.m108593f(r13, r1)
            r1 = r13
            qo.i r1 = (p663qo.C77384i) r1
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r6.f296143d = r12
            r6.f296144e = r9
            r6.f296145f = r9
            r6.f296148i = r2
            r2 = r12
            java.lang.Object r13 = p663qo.C77384i.C77385a.m93302b(r1, r2, r3, r5, r6, r7, r8)
            if (r13 != r0) goto L_0x0069
            return r0
        L_0x0069:
            r0 = r13
            r13 = r9
            r1 = r13
        L_0x006c:
            com.tencent.mm.modelcdntran.v r0 = (com.tencent.p014mm.modelcdntran.C92798v) r0
            r2 = 0
            if (r0 == 0) goto L_0x0074
            com.tencent.mm.modelcdntran.v$a r3 = r0.f267130a
            goto L_0x0075
        L_0x0074:
            r3 = r2
        L_0x0075:
            com.tencent.mm.modelcdntran.v$a r4 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnUploadCallbackSuccess
            r5 = 32
            java.lang.String r6 = "uploadTask "
            java.lang.String r7 = "MicroMsg.RecordFromFavSendFSC"
            if (r3 != r4) goto L_0x00b8
            gi.d r13 = r0.f267135f
            if (r13 == 0) goto L_0x0087
            java.lang.String r0 = r13.field_fileId
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            if (r0 != 0) goto L_0x008b
            r0 = r9
        L_0x008b:
            if (r13 == 0) goto L_0x008f
            java.lang.String r2 = r13.field_aesKey
        L_0x008f:
            if (r2 != 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r9 = r2
        L_0x0093:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            java.lang.String r12 = r12.field_mediaId
            r13.append(r12)
            java.lang.String r12 = " success "
            r13.append(r12)
            r13.append(r0)
            r13.append(r5)
            r13.append(r9)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r12)
            r13 = r0
            r1 = r9
            goto L_0x00e9
        L_0x00b8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r12 = r12.field_mediaId
            r3.append(r12)
            java.lang.String r12 = " fail "
            r3.append(r12)
            if (r0 == 0) goto L_0x00cf
            com.tencent.mm.modelcdntran.v$a r12 = r0.f267130a
            goto L_0x00d0
        L_0x00cf:
            r12 = r2
        L_0x00d0:
            r3.append(r12)
            r3.append(r5)
            if (r0 == 0) goto L_0x00df
            int r12 = r0.f267132c
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r12)
        L_0x00df:
            r3.append(r2)
            java.lang.String r12 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r12)
        L_0x00e9:
            rx3.l r12 = new rx3.l
            r12.<init>(r1, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101170w.mo140620n3(gi.g, wx3.d):java.lang.Object");
    }
}
