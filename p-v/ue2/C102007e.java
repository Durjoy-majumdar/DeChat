package ue2;

import fy3.C32224a;
import gy3.C87413o;
import java.util.concurrent.ConcurrentLinkedDeque;
import k14.C60949f;
import k14.C99088c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ve2.C102179e;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ue2.e */
public final class C102007e {

    /* renamed from: a */
    public final C13601g f300342a = C36568h.m40985a(C102012e.f300368d);

    /* renamed from: b */
    public final C99088c f300343b = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: c */
    public C102179e f300344c;

    @C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.PreloadNowTaskController", mo125469f = "PreloadNowTaskController.kt", mo125470l = {109, 37}, mo125471m = "addTask")
    /* renamed from: ue2.e$a */
    public static final class C102008a extends C66704d {

        /* renamed from: d */
        public Object f300345d;

        /* renamed from: e */
        public Object f300346e;

        /* renamed from: f */
        public Object f300347f;

        /* renamed from: g */
        public boolean f300348g;

        /* renamed from: h */
        public /* synthetic */ Object f300349h;

        /* renamed from: i */
        public final /* synthetic */ C102007e f300350i;

        /* renamed from: j */
        public int f300351j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102008a(C102007e eVar, C15601d<? super C102008a> dVar) {
            super(dVar);
            this.f300350i = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f300349h = obj;
            this.f300351j |= Integer.MIN_VALUE;
            return this.f300350i.mo141503a((C102179e) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.PreloadNowTaskController", mo125469f = "PreloadNowTaskController.kt", mo125470l = {109, 49}, mo125471m = "finishTask")
    /* renamed from: ue2.e$b */
    public static final class C102009b extends C66704d {

        /* renamed from: d */
        public Object f300352d;

        /* renamed from: e */
        public Object f300353e;

        /* renamed from: f */
        public Object f300354f;

        /* renamed from: g */
        public /* synthetic */ Object f300355g;

        /* renamed from: h */
        public final /* synthetic */ C102007e f300356h;

        /* renamed from: i */
        public int f300357i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102009b(C102007e eVar, C15601d<? super C102009b> dVar) {
            super(dVar);
            this.f300356h = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f300355g = obj;
            this.f300357i |= Integer.MIN_VALUE;
            return this.f300356h.mo141504b((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.PreloadNowTaskController", mo125469f = "PreloadNowTaskController.kt", mo125470l = {109}, mo125471m = "isDownloading")
    /* renamed from: ue2.e$c */
    public static final class C102010c extends C66704d {

        /* renamed from: d */
        public Object f300358d;

        /* renamed from: e */
        public Object f300359e;

        /* renamed from: f */
        public /* synthetic */ Object f300360f;

        /* renamed from: g */
        public final /* synthetic */ C102007e f300361g;

        /* renamed from: h */
        public int f300362h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102010c(C102007e eVar, C15601d<? super C102010c> dVar) {
            super(dVar);
            this.f300361g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f300360f = obj;
            this.f300362h |= Integer.MIN_VALUE;
            return this.f300361g.mo141506d(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.PreloadNowTaskController", mo125469f = "PreloadNowTaskController.kt", mo125470l = {85, 109}, mo125471m = "startTask")
    /* renamed from: ue2.e$d */
    public static final class C102011d extends C66704d {

        /* renamed from: d */
        public Object f300363d;

        /* renamed from: e */
        public Object f300364e;

        /* renamed from: f */
        public /* synthetic */ Object f300365f;

        /* renamed from: g */
        public final /* synthetic */ C102007e f300366g;

        /* renamed from: h */
        public int f300367h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102011d(C102007e eVar, C15601d<? super C102011d> dVar) {
            super(dVar);
            this.f300366g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f300365f = obj;
            this.f300367h |= Integer.MIN_VALUE;
            return this.f300366g.mo141507e(this);
        }
    }

    /* renamed from: ue2.e$e */
    public static final class C102012e extends C87413o implements C32224a<ConcurrentLinkedDeque<C102179e>> {

        /* renamed from: d */
        public static final C102012e f300368d = new C102012e();

        public C102012e() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentLinkedDeque();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v10, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo141503a(ve2.C102179e r8, wx3.C15601d<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ue2.C102007e.C102008a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ue2.e$a r0 = (ue2.C102007e.C102008a) r0
            int r1 = r0.f300351j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f300351j = r1
            goto L_0x0018
        L_0x0013:
            ue2.e$a r0 = new ue2.e$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f300349h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f300351j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            boolean r8 = r0.f300348g
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00ad
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            java.lang.Object r8 = r0.f300347f
            k14.c r8 = (k14.C99088c) r8
            java.lang.Object r2 = r0.f300346e
            ve2.e r2 = (ve2.C102179e) r2
            java.lang.Object r6 = r0.f300345d
            ue2.e r6 = (ue2.C102007e) r6
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L_0x005f
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r9)
            k14.c r9 = r7.f300343b
            r0.f300345d = r7
            r0.f300346e = r8
            r0.f300347f = r9
            r0.f300351j = r4
            k14.d r9 = (k14.C60942d) r9
            java.lang.Object r2 = r9.mo85908b(r5, r0)
            if (r2 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r6 = r7
        L_0x005f:
            java.util.concurrent.ConcurrentLinkedDeque r2 = r6.mo141505c()     // Catch:{ all -> 0x00b2 }
            boolean r2 = r2.contains(r8)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x006b
            r4 = 0
            goto L_0x0072
        L_0x006b:
            java.util.concurrent.ConcurrentLinkedDeque r2 = r6.mo141505c()     // Catch:{ all -> 0x00b2 }
            r2.push(r8)     // Catch:{ all -> 0x00b2 }
        L_0x0072:
            r9.mo85909c(r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "c2c pre download now task add result:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = ", list size: "
            r8.append(r9)
            java.util.concurrent.ConcurrentLinkedDeque r9 = r6.mo141505c()
            int r9 = r9.size()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.PreloadTaskController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r0.f300345d = r5
            r0.f300346e = r5
            r0.f300347f = r5
            r0.f300348g = r4
            r0.f300351j = r3
            java.lang.Object r8 = r6.mo141507e(r0)
            if (r8 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r8 = r4
        L_0x00ad:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L_0x00b2:
            r8 = move-exception
            r9.mo85909c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ue2.C102007e.mo141503a(ve2.e, wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v8, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo141504b(java.lang.String r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ue2.C102007e.C102009b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ue2.e$b r0 = (ue2.C102007e.C102009b) r0
            int r1 = r0.f300357i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f300357i = r1
            goto L_0x0018
        L_0x0013:
            ue2.e$b r0 = new ue2.e$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f300355g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f300357i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0082
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            java.lang.Object r7 = r0.f300354f
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r2 = r0.f300353e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f300352d
            ue2.e r4 = (ue2.C102007e) r4
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r2
            goto L_0x005c
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r8)
            k14.c r8 = r6.f300343b
            r0.f300352d = r6
            r0.f300353e = r7
            r0.f300354f = r8
            r0.f300357i = r4
            k14.d r8 = (k14.C60942d) r8
            java.lang.Object r2 = r8.mo85908b(r5, r0)
            if (r2 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r4 = r6
        L_0x005c:
            ve2.e r2 = r4.f300344c     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0070
            xe2.a r2 = r2.f300868e     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r2.mo142476r2()     // Catch:{ all -> 0x0085 }
            boolean r7 = gy3.C87412m.m108589b(r2, r7)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x006e
            r4.f300344c = r5     // Catch:{ all -> 0x0085 }
        L_0x006e:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0085 }
        L_0x0070:
            r8.mo85909c(r5)
            r0.f300352d = r5
            r0.f300353e = r5
            r0.f300354f = r5
            r0.f300357i = r3
            java.lang.Object r7 = r4.mo141507e(r0)
            if (r7 != r1) goto L_0x0082
            return r1
        L_0x0082:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x0085:
            r7 = move-exception
            r8.mo85909c(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ue2.C102007e.mo141504b(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final ConcurrentLinkedDeque<C102179e> mo141505c() {
        return (ConcurrentLinkedDeque) ((C36570n) this.f300342a).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo141506d(wx3.C15601d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ue2.C102007e.C102010c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ue2.e$c r0 = (ue2.C102007e.C102010c) r0
            int r1 = r0.f300362h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f300362h = r1
            goto L_0x0018
        L_0x0013:
            ue2.e$c r0 = new ue2.e$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f300360f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f300362h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r1 = r0.f300359e
            k14.c r1 = (k14.C99088c) r1
            java.lang.Object r0 = r0.f300358d
            ue2.e r0 = (ue2.C102007e) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r6)
            k14.c r6 = r5.f300343b
            r0.f300358d = r5
            r0.f300359e = r6
            r0.f300362h = r4
            k14.d r6 = (k14.C60942d) r6
            java.lang.Object r0 = r6.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            ve2.e r6 = r0.f300344c     // Catch:{ all -> 0x005c }
            if (r6 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x005c }
            r1.mo85909c(r3)
            return r6
        L_0x005c:
            r6 = move-exception
            r1.mo85909c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ue2.C102007e.mo141506d(wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo141507e(wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ue2.C102007e.C102011d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ue2.e$d r0 = (ue2.C102007e.C102011d) r0
            int r1 = r0.f300367h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f300367h = r1
            goto L_0x0018
        L_0x0013:
            ue2.e$d r0 = new ue2.e$d
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f300365f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f300367h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r1 = r0.f300364e
            k14.c r1 = (k14.C99088c) r1
            java.lang.Object r0 = r0.f300363d
            ue2.e r0 = (ue2.C102007e) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0078
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            java.lang.Object r2 = r0.f300363d
            ue2.e r2 = (ue2.C102007e) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005d
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.concurrent.ConcurrentLinkedDeque r7 = r6.mo141505c()
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x009d
            r0.f300363d = r6
            r0.f300367h = r5
            java.lang.Object r7 = r6.mo141506d(r0)
            if (r7 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r6
        L_0x005d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x00ad
            k14.c r7 = r2.f300343b
            r0.f300363d = r2
            r0.f300364e = r7
            r0.f300367h = r4
            k14.d r7 = (k14.C60942d) r7
            java.lang.Object r0 = r7.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r1 = r7
            r0 = r2
        L_0x0078:
            java.util.concurrent.ConcurrentLinkedDeque r7 = r0.mo141505c()     // Catch:{ all -> 0x0098 }
            java.lang.Object r7 = r7.getLast()     // Catch:{ all -> 0x0098 }
            ve2.e r7 = (ve2.C102179e) r7     // Catch:{ all -> 0x0098 }
            r0.f300344c = r7     // Catch:{ all -> 0x0098 }
            java.util.concurrent.ConcurrentLinkedDeque r7 = r0.mo141505c()     // Catch:{ all -> 0x0098 }
            ve2.e r2 = r0.f300344c     // Catch:{ all -> 0x0098 }
            r7.remove(r2)     // Catch:{ all -> 0x0098 }
            r1.mo85909c(r3)
            ve2.e r7 = r0.f300344c
            if (r7 == 0) goto L_0x00ad
            r7.mo141717c()
            goto L_0x00ad
        L_0x0098:
            r7 = move-exception
            r1.mo85909c(r3)
            throw r7
        L_0x009d:
            java.lang.Class<ke2.c> r7 = ke2.C99129c.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ke2.c r7 = (ke2.C99129c) r7
            r7.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader r7 = r7.f290655A
            r7.mo129638g()
        L_0x00ad:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ue2.C102007e.mo141507e(wx3.d):java.lang.Object");
    }
}
