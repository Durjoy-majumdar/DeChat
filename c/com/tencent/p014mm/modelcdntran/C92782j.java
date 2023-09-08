package com.tencent.p014mm.modelcdntran;

import a70.C112760b;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import java.io.File;
import java.util.concurrent.ConcurrentLinkedQueue;
import k14.C60949f;
import k14.C99088c;
import p1081gi.C98124g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.modelcdntran.j */
public final class C92782j extends C98597b {

    /* renamed from: f */
    public final C13601g f267058f = C36568h.m40985a(C29009g.f79512d);

    /* renamed from: g */
    public final C13601g f267059g = C36568h.m40985a(C92785d.f267068d);

    /* renamed from: h */
    public final C13601g f267060h = C36568h.m40985a(C29007c.f79510d);

    /* renamed from: i */
    public final C13601g f267061i = C36568h.m40985a(C29008e.f79511d);

    /* renamed from: j */
    public final C13601g f267062j;

    /* renamed from: n */
    public final C99088c f267063n;

    /* renamed from: com.tencent.mm.modelcdntran.j$c */
    public static final class C29007c extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C29007c f79510d = new C29007c();

        public C29007c() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "cdnTemp";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.j$e */
    public static final class C29008e extends C87413o implements C32224a<ConcurrentLinkedQueue<C92795s>> {

        /* renamed from: d */
        public static final C29008e f79511d = new C29008e();

        public C29008e() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentLinkedQueue();
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.j$g */
    public static final class C29009g extends C87413o implements C32224a<ConcurrentLinkedQueue<C92783a>> {

        /* renamed from: d */
        public static final C29009g f79512d = new C29009g();

        public C29009g() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentLinkedQueue();
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.j$a */
    public static final class C92783a {

        /* renamed from: a */
        public final String f267064a;

        /* renamed from: b */
        public final C55385t f267065b;

        /* renamed from: c */
        public final C98124g f267066c;

        public C92783a(String str, C55385t tVar, C98124g gVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(tVar, "mediaTaskInfo");
            C87412m.m108594g(gVar, "keepTaskInfo");
            this.f267064a = str;
            this.f267065b = tVar;
            this.f267066c = gVar;
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.j$b */
    public static final class C92784b extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ C98598e f267067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92784b(C98598e eVar) {
            super(0);
            this.f267067d = eVar;
        }

        public Object invoke() {
            return new LifecycleScope("FavCdnService", this.f267067d, 0, 4, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.j$d */
    public static final class C92785d extends C87413o implements C32224a<FlowController> {

        /* renamed from: d */
        public static final C92785d f267068d = new C92785d();

        public C92785d() {
            super(0);
        }

        public Object invoke() {
            return new FlowController(2, C1296o.f10404d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnMediaFSC", mo125469f = "CdnMediaFSC.kt", mo125470l = {214, 295, 223}, mo125471m = "removeTask")
    /* renamed from: com.tencent.mm.modelcdntran.j$f */
    public static final class C92786f extends C66704d {

        /* renamed from: d */
        public Object f267069d;

        /* renamed from: e */
        public Object f267070e;

        /* renamed from: f */
        public Object f267071f;

        /* renamed from: g */
        public /* synthetic */ Object f267072g;

        /* renamed from: h */
        public final /* synthetic */ C92782j f267073h;

        /* renamed from: i */
        public int f267074i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92786f(C92782j jVar, C15601d<? super C92786f> dVar) {
            super(dVar);
            this.f267073h = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f267072g = obj;
            this.f267074i |= Integer.MIN_VALUE;
            return this.f267073h.mo127016n3((String) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92782j(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "plugin");
        this.f267062j = C36568h.m40985a(new C92784b(eVar));
        this.f267063n = C60949f.m71437a(false, 1, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [k14.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r7.mo85908b((java.lang.Object) null, r0) == r1) goto L_0x0084;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m116946g3(com.tencent.p014mm.modelcdntran.C92782j r5, com.tencent.p014mm.modelcdntran.C92782j.C92783a r6, wx3.C15601d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.tencent.p014mm.modelcdntran.C92787k
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.tencent.mm.modelcdntran.k r0 = (com.tencent.p014mm.modelcdntran.C92787k) r0
            int r1 = r0.f267080i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f267080i = r1
            goto L_0x001b
        L_0x0016:
            com.tencent.mm.modelcdntran.k r0 = new com.tencent.mm.modelcdntran.k
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f267078g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f267080i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r5 = r0.f267077f
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r6 = r0.f267076e
            com.tencent.mm.modelcdntran.j$a r6 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r6
            java.lang.Object r0 = r0.f267075d
            com.tencent.mm.modelcdntran.j r0 = (com.tencent.p014mm.modelcdntran.C92782j) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r5
            r5 = r0
            goto L_0x0057
        L_0x0039:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r7)
            k14.c r7 = r5.f267063n
            r0.f267075d = r5
            r0.f267076e = r6
            r0.f267077f = r7
            r0.f267080i = r4
            k14.d r7 = (k14.C60942d) r7
            java.lang.Object r0 = r7.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0057
            goto L_0x0084
        L_0x0057:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.mo127015m3()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0085 }
        L_0x005f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0085 }
            com.tencent.mm.modelcdntran.j$a r1 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r1     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r1.f267064a     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r6.f267064a     // Catch:{ all -> 0x0085 }
            boolean r1 = gy3.C87412m.m108589b(r1, r2)     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x005f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0085 }
            goto L_0x0081
        L_0x0078:
            java.util.concurrent.ConcurrentLinkedQueue r5 = r5.mo127015m3()     // Catch:{ all -> 0x0085 }
            r5.add(r6)     // Catch:{ all -> 0x0085 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0085 }
        L_0x0081:
            r7.mo85909c(r3)
        L_0x0084:
            return r1
        L_0x0085:
            r5 = move-exception
            r7.mo85909c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92782j.m116946g3(com.tencent.mm.modelcdntran.j, com.tencent.mm.modelcdntran.j$a, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: com.tencent.mm.modelcdntran.j$a} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        if (r2 != 11) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0142, code lost:
        if (r5 != false) goto L_0x0144;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015b A[LOOP:0: B:53:0x0155->B:55:0x015b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m116947i3(com.tencent.p014mm.modelcdntran.C92782j r10, com.tencent.p014mm.modelcdntran.C92798v r11, com.tencent.p014mm.modelcdntran.C92782j.C92783a r12, wx3.C15601d r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof com.tencent.p014mm.modelcdntran.C92792p
            if (r0 == 0) goto L_0x0016
            r0 = r13
            com.tencent.mm.modelcdntran.p r0 = (com.tencent.p014mm.modelcdntran.C92792p) r0
            int r1 = r0.f267105j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f267105j = r1
            goto L_0x001b
        L_0x0016:
            com.tencent.mm.modelcdntran.p r0 = new com.tencent.mm.modelcdntran.p
            r0.<init>(r10, r13)
        L_0x001b:
            java.lang.Object r13 = r0.f267103h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f267105j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0062
            if (r2 == r5) goto L_0x0048
            if (r2 != r4) goto L_0x0040
            java.lang.Object r10 = r0.f267102g
            gy3.d0 r10 = (gy3.C8478d0) r10
            java.lang.Object r11 = r0.f267101f
            r12 = r11
            com.tencent.mm.modelcdntran.j$a r12 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r12
            java.lang.Object r11 = r0.f267100e
            com.tencent.mm.modelcdntran.v r11 = (com.tencent.p014mm.modelcdntran.C92798v) r11
            java.lang.Object r0 = r0.f267099d
            com.tencent.mm.modelcdntran.j r0 = (com.tencent.p014mm.modelcdntran.C92782j) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00eb
        L_0x0040:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0048:
            java.lang.Object r10 = r0.f267102g
            gy3.d0 r10 = (gy3.C8478d0) r10
            java.lang.Object r11 = r0.f267101f
            com.tencent.mm.modelcdntran.j$a r11 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r11
            java.lang.Object r12 = r0.f267100e
            com.tencent.mm.modelcdntran.v r12 = (com.tencent.p014mm.modelcdntran.C92798v) r12
            java.lang.Object r0 = r0.f267099d
            com.tencent.mm.modelcdntran.j r0 = (com.tencent.p014mm.modelcdntran.C92782j) r0
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r10
            r10 = r0
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x012a
        L_0x0062:
            kotlin.ResultKt.throwOnFailure(r13)
            gi.g r13 = r11.f267133d
            java.lang.String r2 = ", mediaId:"
            java.lang.String r6 = "MicroMsg.CdnMediaFSC"
            if (r13 != 0) goto L_0x008f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "handleCdnDownloadEvent, but taskInfo is null!!! action:"
            r10.append(r12)
            com.tencent.mm.modelcdntran.v$a r12 = r11.f267130a
            r10.append(r12)
            r10.append(r2)
            java.lang.String r11 = r11.f267131b
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0171
        L_0x008f:
            gy3.d0 r13 = new gy3.d0
            r13.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "handleCdnDownloadEvent, action:"
            r7.append(r8)
            com.tencent.mm.modelcdntran.v$a r8 = r11.f267130a
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r11.f267131b
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            com.tencent.mm.modelcdntran.v$a r2 = r11.f267130a
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0117
            if (r2 == r5) goto L_0x00d5
            if (r2 == r4) goto L_0x00d5
            if (r2 == r3) goto L_0x00c6
            r6 = 11
            if (r2 == r6) goto L_0x0117
            goto L_0x0149
        L_0x00c6:
            r0 = 4
            r13.f27483d = r0
            gi.c r11 = r11.f267134e
            if (r11 == 0) goto L_0x0149
            long r0 = r11.field_finishedLength
            com.tencent.mm.modelcdntran.t r11 = r12.f267065b
            r11.f157723e = r0
            goto L_0x0149
        L_0x00d5:
            java.lang.String r2 = r11.f267131b
            r0.f267099d = r10
            r0.f267100e = r11
            r0.f267101f = r12
            r0.f267102g = r13
            r0.f267105j = r4
            java.lang.Object r0 = r10.mo127016n3(r2, r0)
            if (r0 != r1) goto L_0x00e9
            goto L_0x0171
        L_0x00e9:
            r0 = r10
            r10 = r13
        L_0x00eb:
            gi.g r11 = r11.f267133d
            if (r11 == 0) goto L_0x0114
            java.lang.String r13 = r11.field_fullpath
            com.tencent.mm.modelcdntran.t r1 = r12.f267065b
            java.lang.String r1 = r1.f157726h
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106463x(r13, r1)
            if (r13 != 0) goto L_0x00fe
            r10.f27483d = r4
            goto L_0x0114
        L_0x00fe:
            r10.f27483d = r5
            java.lang.Class<xp.b> r13 = p753xp.C102704b.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            xp.b r13 = (p753xp.C102704b) r13
            com.tencent.mm.modelcdntran.t r1 = r12.f267065b
            java.lang.String r1 = r1.f157726h
            r2 = 19
            java.lang.String r11 = r11.field_filemd5
            r3 = 0
            r13.mo138748Bg(r1, r2, r11, r3)
        L_0x0114:
            r13 = r10
            r10 = r0
            goto L_0x0149
        L_0x0117:
            java.lang.String r2 = r11.f267131b
            r0.f267099d = r10
            r0.f267100e = r11
            r0.f267101f = r12
            r0.f267102g = r13
            r0.f267105j = r5
            java.lang.Object r0 = r10.mo127016n3(r2, r0)
            if (r0 != r1) goto L_0x012a
            goto L_0x0171
        L_0x012a:
            gi.d r11 = r11.f267135f
            if (r11 == 0) goto L_0x0147
            int r11 = r11.field_retCode
            r0 = -5103059(0xffffffffffb2222d, float:NaN)
            r1 = 0
            if (r11 != r0) goto L_0x0138
            r0 = 1
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            if (r0 != 0) goto L_0x0144
            r0 = -5103017(0xffffffffffb22257, float:NaN)
            if (r11 != r0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r5 = 0
        L_0x0142:
            if (r5 == 0) goto L_0x0147
        L_0x0144:
            r13.f27483d = r3
            goto L_0x0149
        L_0x0147:
            r13.f27483d = r4
        L_0x0149:
            int r11 = r13.f27483d
            com.tencent.mm.modelcdntran.t r12 = r12.f267065b
            java.util.concurrent.ConcurrentLinkedQueue r10 = r10.mo127014l3()
            java.util.Iterator r10 = r10.iterator()
        L_0x0155:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0165
            java.lang.Object r13 = r10.next()
            com.tencent.mm.modelcdntran.s r13 = (com.tencent.p014mm.modelcdntran.C92795s) r13
            r13.mo76200o2(r11, r12)
            goto L_0x0155
        L_0x0165:
            java.lang.Class<com.tencent.mm.modelcdntran.f0> r10 = com.tencent.p014mm.modelcdntran.C92768f0.class
            com.tencent.mm.modelcdntran.q r13 = new com.tencent.mm.modelcdntran.q
            r13.<init>(r11, r12)
            p261wl.C38166b.m41755b(r10, r13)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0171:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92782j.m116947i3(com.tencent.mm.modelcdntran.j, com.tencent.mm.modelcdntran.v, com.tencent.mm.modelcdntran.j$a, wx3.d):java.lang.Object");
    }

    /* renamed from: j3 */
    public final String mo127012j3(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return ((C86009m1) ((C36570n) this.f267060h).getValue()) + File.separator + str;
    }

    /* renamed from: k3 */
    public final FlowController mo127013k3() {
        return (FlowController) ((C36570n) this.f267059g).getValue();
    }

    /* renamed from: l3 */
    public final ConcurrentLinkedQueue<C92795s> mo127014l3() {
        return (ConcurrentLinkedQueue) ((C36570n) this.f267061i).getValue();
    }

    /* renamed from: m3 */
    public final ConcurrentLinkedQueue<C92783a> mo127015m3() {
        return (ConcurrentLinkedQueue) ((C36570n) this.f267058f).getValue();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c A[Catch:{ all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo127016n3(java.lang.String r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.tencent.p014mm.modelcdntran.C92782j.C92786f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.tencent.mm.modelcdntran.j$f r0 = (com.tencent.p014mm.modelcdntran.C92782j.C92786f) r0
            int r1 = r0.f267074i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f267074i = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.modelcdntran.j$f r0 = new com.tencent.mm.modelcdntran.j$f
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f267072g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f267074i
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r6) goto L_0x0047
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00c6
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            java.lang.Object r10 = r0.f267071f
            k14.c r10 = (k14.C99088c) r10
            java.lang.Object r2 = r0.f267070e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f267069d
            com.tencent.mm.modelcdntran.j r4 = (com.tencent.p014mm.modelcdntran.C92782j) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x007e
        L_0x0047:
            java.lang.Object r10 = r0.f267070e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f267069d
            com.tencent.mm.modelcdntran.j r2 = (com.tencent.p014mm.modelcdntran.C92782j) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0068
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r11)
            com.tencent.mm.sdk.coroutines.FlowController r11 = r9.mo127013k3()
            r0.f267069d = r9
            r0.f267070e = r10
            r0.f267074i = r6
            java.lang.Object r11 = r11.outFlow(r10, r0)
            if (r11 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r9
        L_0x0068:
            k14.c r11 = r2.f267063n
            r0.f267069d = r2
            r0.f267070e = r10
            r0.f267071f = r11
            r0.f267074i = r4
            k14.d r11 = (k14.C60942d) r11
            java.lang.Object r4 = r11.mo85908b(r5, r0)
            if (r4 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r4 = r2
            r2 = r10
            r10 = r11
        L_0x007e:
            java.util.concurrent.ConcurrentLinkedQueue r11 = r4.mo127015m3()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x0086:
            boolean r7 = r11.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x00c9 }
            com.tencent.mm.modelcdntran.j$a r7 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r7     // Catch:{ all -> 0x00c9 }
            java.lang.String r8 = r7.f267064a     // Catch:{ all -> 0x00c9 }
            boolean r8 = gy3.C87412m.m108589b(r8, r2)     // Catch:{ all -> 0x00c9 }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ConcurrentLinkedQueue r8 = r4.mo127015m3()     // Catch:{ all -> 0x00c9 }
            r8.remove(r7)     // Catch:{ all -> 0x00c9 }
            goto L_0x0086
        L_0x00a2:
            rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c9 }
            r10.mo85909c(r5)
            r0.f267069d = r5
            r0.f267070e = r5
            r0.f267071f = r5
            r0.f267074i = r3
            rx3.g r10 = r4.f267062j
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r10 = (com.tencent.p014mm.sdk.coroutines.LifecycleScope) r10
            com.tencent.mm.modelcdntran.n r11 = new com.tencent.mm.modelcdntran.n
            r11.<init>(r4, r5)
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r10, r5, r11, r6, r5)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            if (r10 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x00c9:
            r11 = move-exception
            r10.mo85909c(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92782j.mo127016n3(java.lang.String, wx3.d):java.lang.Object");
    }
}
