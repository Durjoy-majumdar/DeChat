package qj1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import q40.C12040d;
import qj1.C12360e8;
import qj1.C12666si;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C50792p71;
import te3.C51769w11;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.RandomGiftSendProcessor$onInstantClick$1$job$1", mo125469f = "RandomGiftSendProcessor.kt", mo125470l = {50, 145, 152}, mo125471m = "invokeSuspend")
/* renamed from: qj1.ti */
public final class C12686ti extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f36332d;

    /* renamed from: e */
    public /* synthetic */ Object f36333e;

    /* renamed from: f */
    public final /* synthetic */ C50792p71 f36334f;

    /* renamed from: g */
    public final /* synthetic */ C12666si f36335g;

    /* renamed from: h */
    public final /* synthetic */ String f36336h;

    /* renamed from: i */
    public final /* synthetic */ C12666si.C12667a f36337i;

    /* renamed from: j */
    public final /* synthetic */ String f36338j;

    /* renamed from: n */
    public final /* synthetic */ C12360e8.C12365c.C12366a f36339n;

    /* renamed from: qj1.ti$a */
    public static final class C12687a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12666si f36340d;

        /* renamed from: e */
        public final /* synthetic */ String f36341e;

        /* renamed from: f */
        public final /* synthetic */ String f36342f;

        /* renamed from: g */
        public final /* synthetic */ C12360e8.C12365c.C12366a f36343g;

        /* renamed from: h */
        public final /* synthetic */ C51769w11 f36344h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12687a(C12666si siVar, String str, String str2, C12360e8.C12365c.C12366a aVar, C51769w11 w112) {
            super(0);
            this.f36340d = siVar;
            this.f36341e = str;
            this.f36342f = str2;
            this.f36343g = aVar;
            this.f36344h = w112;
        }

        public Object invoke() {
            C12666si siVar = this.f36340d;
            int i = siVar.f36272f + 1;
            siVar.f36272f = i;
            C12360e8.f35587T.mo12056a(this.f36341e, i, this.f36342f, 1, false, this.f36343g, C26236u.m33719b(this.f36344h));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.RandomGiftSendProcessor$onInstantClick$1$job$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "RandomGiftSendProcessor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ti$b */
    public static final class C12688b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f36345d;

        /* renamed from: e */
        public final /* synthetic */ C12666si f36346e;

        /* renamed from: f */
        public final /* synthetic */ C50792p71 f36347f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12688b(C0287e eVar, C15601d dVar, C12666si siVar, C50792p71 p712) {
            super(2, dVar);
            this.f36345d = eVar;
            this.f36346e = siVar;
            this.f36347f = p712;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12688b(this.f36345d, dVar, this.f36346e, this.f36347f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12688b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0280a aVar = (C0280a) ((C0281b) this.f36345d).f843b;
            String str = this.f36346e.f36268b;
            StringBuilder sb = new StringBuilder();
            sb.append("req:");
            sb.append(this.f36347f.hashCode());
            sb.append(" failed. errType:");
            C12040d dVar = aVar.f841a;
            String str2 = null;
            sb.append(dVar != null ? new Integer(dVar.f35057e) : null);
            sb.append(", errCode:");
            C12040d dVar2 = aVar.f841a;
            sb.append(dVar2 != null ? new Integer(dVar2.f35058f) : null);
            sb.append(",errMsg:");
            C12040d dVar3 = aVar.f841a;
            if (dVar3 != null) {
                str2 = dVar3.f35059g;
            }
            sb.append(str2);
            sb.append(",cancel?:");
            sb.append(aVar.f842b);
            Log.m105924i(str, sb.toString());
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.RandomGiftSendProcessor$onInstantClick$1$job$1$invokeSuspend$$inlined$success$default$1", mo125469f = "RandomGiftSendProcessor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ti$c */
    public static final class C12689c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f36348d;

        /* renamed from: e */
        public final /* synthetic */ C0000n0 f36349e;

        /* renamed from: f */
        public final /* synthetic */ C12666si f36350f;

        /* renamed from: g */
        public final /* synthetic */ C50792p71 f36351g;

        /* renamed from: h */
        public final /* synthetic */ String f36352h;

        /* renamed from: i */
        public final /* synthetic */ C12666si.C12667a f36353i;

        /* renamed from: j */
        public final /* synthetic */ String f36354j;

        /* renamed from: n */
        public final /* synthetic */ C12360e8.C12365c.C12366a f36355n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12689c(C0287e eVar, C15601d dVar, C0000n0 n0Var, C12666si siVar, C50792p71 p712, String str, C12666si.C12667a aVar, String str2, C12360e8.C12365c.C12366a aVar2) {
            super(2, dVar);
            this.f36348d = eVar;
            this.f36349e = n0Var;
            this.f36350f = siVar;
            this.f36351g = p712;
            this.f36352h = str;
            this.f36353i = aVar;
            this.f36354j = str2;
            this.f36355n = aVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12689c(this.f36348d, dVar, this.f36349e, this.f36350f, this.f36351g, this.f36352h, this.f36353i, this.f36354j, this.f36355n);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12689c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: te3.w11} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.ResultKt.throwOnFailure(r10)
                bi1.e r10 = r9.f36348d
                bi1.f r10 = (bi1.C0288f) r10
                T r10 = r10.f855b
                te3.q71 r10 = (te3.C50923q71) r10
                a14.n0 r0 = r9.f36349e
                boolean r0 = a14.C53930o0.m60560g(r0)
                if (r0 != 0) goto L_0x0038
                qj1.si r10 = r9.f36350f
                java.lang.String r10 = r10.f36268b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "req:"
                r0.append(r1)
                te3.p71 r1 = r9.f36351g
                int r1 = r1.hashCode()
                r0.append(r1)
                java.lang.String r1 = " succ but was cancelled"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                goto L_0x0120
            L_0x0038:
                te3.v11 r0 = new te3.v11
                r0.<init>()
                pe3.b r1 = r10.f140170e
                r2 = 0
                if (r1 == 0) goto L_0x0047
                byte[] r1 = r1.mo123703f()
                goto L_0x0048
            L_0x0047:
                r1 = r2
            L_0x0048:
                if (r1 != 0) goto L_0x004c
            L_0x004a:
                r0 = r2
                goto L_0x0060
            L_0x004c:
                r0.parseFrom(r1)     // Catch:{ Exception -> 0x0050 }
                goto L_0x0060
            L_0x0050:
                r0 = move-exception
                java.lang.String r1 = "safeParser"
                java.lang.String r3 = ""
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r0
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r4)
                goto L_0x004a
            L_0x0060:
                if (r0 == 0) goto L_0x0065
                java.util.LinkedList<te3.w11> r0 = r0.f143244e
                goto L_0x0066
            L_0x0065:
                r0 = r2
            L_0x0066:
                if (r0 == 0) goto L_0x006f
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
                r2 = r0
                te3.w11 r2 = (te3.C51769w11) r2
            L_0x006f:
                r8 = r2
                if (r8 != 0) goto L_0x00a1
                qj1.si r10 = r9.f36350f
                java.lang.String r10 = r10.f36268b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "req:"
                r0.append(r1)
                te3.p71 r1 = r9.f36351g
                int r1 = r1.hashCode()
                r0.append(r1)
                java.lang.String r1 = " resp giftId:"
                r0.append(r1)
                java.lang.String r1 = r9.f36352h
                r0.append(r1)
                java.lang.String r1 = ", result invalid"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                goto L_0x0120
            L_0x00a1:
                qj1.si r0 = r9.f36350f
                java.lang.String r0 = r0.f36268b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "req:"
                r1.append(r2)
                te3.p71 r2 = r9.f36351g
                int r2 = r2.hashCode()
                r1.append(r2)
                java.lang.String r2 = " succ"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                qj1.si r0 = r9.f36350f
                monitor-enter(r0)
                qj1.si r1 = r9.f36350f     // Catch:{ all -> 0x0123 }
                java.util.ArrayList<qj1.si$a> r1 = r1.f36269c     // Catch:{ all -> 0x0123 }
                qj1.si$a r2 = r9.f36353i     // Catch:{ all -> 0x0123 }
                boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0123 }
                if (r1 == 0) goto L_0x00fa
                qj1.si$a r1 = r9.f36353i     // Catch:{ all -> 0x0123 }
                r1.f36274b = r10     // Catch:{ all -> 0x0123 }
                qj1.si r10 = r9.f36350f     // Catch:{ all -> 0x0123 }
                java.util.ArrayList<qj1.si$a> r10 = r10.f36269c     // Catch:{ all -> 0x0123 }
                r10.remove(r1)     // Catch:{ all -> 0x0123 }
                qj1.si r10 = r9.f36350f     // Catch:{ all -> 0x0123 }
                java.util.ArrayList<qj1.si$a> r10 = r10.f36270d     // Catch:{ all -> 0x0123 }
                qj1.si$a r1 = r9.f36353i     // Catch:{ all -> 0x0123 }
                r10.add(r1)     // Catch:{ all -> 0x0123 }
                monitor-exit(r0)
                qj1.ti$a r10 = new qj1.ti$a
                qj1.si r4 = r9.f36350f
                java.lang.String r5 = r9.f36352h
                java.lang.String r6 = r9.f36354j
                qj1.e8$c$a r7 = r9.f36355n
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                o40.C61926c.m72668M(r10)
                goto L_0x0120
            L_0x00fa:
                qj1.si r10 = r9.f36350f     // Catch:{ all -> 0x0123 }
                java.lang.String r10 = r10.f36268b     // Catch:{ all -> 0x0123 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
                r1.<init>()     // Catch:{ all -> 0x0123 }
                java.lang.String r2 = "req:"
                r1.append(r2)     // Catch:{ all -> 0x0123 }
                te3.p71 r2 = r9.f36351g     // Catch:{ all -> 0x0123 }
                int r2 = r2.hashCode()     // Catch:{ all -> 0x0123 }
                r1.append(r2)     // Catch:{ all -> 0x0123 }
                java.lang.String r2 = " succ but not exist in rawList"
                r1.append(r2)     // Catch:{ all -> 0x0123 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0123 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)     // Catch:{ all -> 0x0123 }
                rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0123 }
                monitor-exit(r0)
            L_0x0120:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            L_0x0123:
                r10 = move-exception
                monitor-exit(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12686ti.C12689c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12686ti(C50792p71 p712, C12666si siVar, String str, C12666si.C12667a aVar, String str2, C12360e8.C12365c.C12366a aVar2, C15601d<? super C12686ti> dVar) {
        super(2, dVar);
        this.f36334f = p712;
        this.f36335g = siVar;
        this.f36336h = str;
        this.f36337i = aVar;
        this.f36338j = str2;
        this.f36339n = aVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C12686ti tiVar = new C12686ti(this.f36334f, this.f36335g, this.f36336h, this.f36337i, this.f36338j, this.f36339n, dVar);
        tiVar.f36333e = obj;
        return tiVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12686ti) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f36332d
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r6) goto L_0x002c
            if (r2 == r4) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            java.lang.Object r1 = r0.f36333e
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x00cf
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            java.lang.Object r2 = r0.f36333e
            bi1.e r2 = (bi1.C0287e) r2
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x00ad
        L_0x002c:
            java.lang.Object r2 = r0.f36333e
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r18)
            r6 = r18
            goto L_0x0076
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.f36333e
            a14.n0 r2 = (a14.C0000n0) r2
            te3.p71 r7 = r0.f36334f
            r7.getClass()
            ob0.c$b r8 = new ob0.c$b
            r8.<init>()
            r9 = 11809(0x2e21, float:1.6548E-41)
            r8.f127069d = r9
            java.lang.String r9 = "/cgi-bin/micromsg-bin/finderliverewardprepare"
            r8.f127068c = r9
            r8.f127066a = r7
            te3.q71 r7 = new te3.q71
            r7.<init>()
            r8.f127067b = r7
            ob0.c r7 = r8.mo72403a()
            java.lang.Class<ht1.s1> r8 = ht1.C8802s1.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ht1.s1 r8 = (ht1.C8802s1) r8
            ob0.b r8 = r8.mo9632ui()
            r8.mo123453j(r7)
            r0.f36333e = r2
            r0.f36332d = r6
            java.lang.Object r6 = bi1.C0283d.m245c(r8, r5, r0, r6, r5)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r10 = r2
            r2 = r6
            bi1.e r2 = (bi1.C0287e) r2
            qj1.si r11 = r0.f36335g
            te3.p71 r12 = r0.f36334f
            java.lang.String r13 = r0.f36336h
            qj1.si$a r14 = r0.f36337i
            java.lang.String r15 = r0.f36338j
            qj1.e8$c$a r6 = r0.f36339n
            boolean r7 = r2 instanceof bi1.C0288f
            if (r7 == 0) goto L_0x00ad
            wx3.f r7 = r2.f854a
            if (r7 != 0) goto L_0x0092
            wx3.f r7 = r17.getContext()
        L_0x0092:
            r9 = r7
            qj1.ti$c r8 = new qj1.ti$c
            r16 = 0
            r7 = r8
            r3 = r8
            r8 = r2
            r5 = r9
            r9 = r16
            r16 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f36333e = r2
            r0.f36332d = r4
            java.lang.Object r3 = a14.C53895h.m60469g(r5, r3, r0)
            if (r3 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            qj1.si r3 = r0.f36335g
            te3.p71 r4 = r0.f36334f
            boolean r5 = r2 instanceof bi1.C0281b
            if (r5 == 0) goto L_0x00cf
            wx3.f r5 = r2.f854a
            if (r5 != 0) goto L_0x00bd
            wx3.f r5 = r17.getContext()
        L_0x00bd:
            qj1.ti$b r6 = new qj1.ti$b
            r7 = 0
            r6.<init>(r2, r7, r3, r4)
            r0.f36333e = r2
            r2 = 3
            r0.f36332d = r2
            java.lang.Object r2 = a14.C53895h.m60469g(r5, r6, r0)
            if (r2 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12686ti.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
