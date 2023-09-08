package qa0;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: qa0.a */
public final class C47792a {

    /* renamed from: a */
    public static final C47792a f128329a = new C47792a();

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateCgiHelper", mo125469f = "TemplateCgiHelper.kt", mo125470l = {82}, mo125471m = "getCameraTemplateList")
    /* renamed from: qa0.a$a */
    public static final class C47793a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f128330d;

        /* renamed from: e */
        public final /* synthetic */ C47792a f128331e;

        /* renamed from: f */
        public int f128332f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47793a(C47792a aVar, C15601d<? super C47793a> dVar) {
            super(dVar);
            this.f128331e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128330d = obj;
            this.f128332f |= Integer.MIN_VALUE;
            return this.f128331e.mo72568a(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateCgiHelper", mo125469f = "TemplateCgiHelper.kt", mo125470l = {63}, mo125471m = "getTemplateList")
    /* renamed from: qa0.a$b */
    public static final class C47794b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f128333d;

        /* renamed from: e */
        public final /* synthetic */ C47792a f128334e;

        /* renamed from: f */
        public int f128335f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47794b(C47792a aVar, C15601d<? super C47794b> dVar) {
            super(dVar);
            this.f128334e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128333d = obj;
            this.f128335f |= Integer.MIN_VALUE;
            return this.f128334e.mo72569b(0, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateCgiHelper", mo125469f = "TemplateCgiHelper.kt", mo125470l = {100}, mo125471m = "getTemplateResource")
    /* renamed from: qa0.a$c */
    public static final class C47795c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f128336d;

        /* renamed from: e */
        public final /* synthetic */ C47792a f128337e;

        /* renamed from: f */
        public int f128338f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47795c(C47792a aVar, C15601d<? super C47795c> dVar) {
            super(dVar);
            this.f128337e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128336d = obj;
            this.f128338f |= Integer.MIN_VALUE;
            return this.f128337e.mo72570c(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateCgiHelper", mo125469f = "TemplateCgiHelper.kt", mo125470l = {43}, mo125471m = "getTemplateSpecific")
    /* renamed from: qa0.a$d */
    public static final class C47796d extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f128339d;

        /* renamed from: e */
        public final /* synthetic */ C47792a f128340e;

        /* renamed from: f */
        public int f128341f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47796d(C47792a aVar, C15601d<? super C47796d> dVar) {
            super(dVar);
            this.f128340e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128339d = obj;
            this.f128341f |= Integer.MIN_VALUE;
            return this.f128340e.mo72571d((String) null, 0, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72568a(wx3.C15601d<? super te3.C51166rw1> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof qa0.C47792a.C47793a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            qa0.a$a r0 = (qa0.C47792a.C47793a) r0
            int r1 = r0.f128332f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128332f = r1
            goto L_0x0018
        L_0x0013:
            qa0.a$a r0 = new qa0.a$a
            r0.<init>(r9, r10)
        L_0x0018:
            r5 = r0
            java.lang.Object r10 = r5.f128330d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f128332f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0080 }
            goto L_0x0079
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x0080 }
            ob0.b r1 = new ob0.b     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            ob0.c$b r10 = new ob0.c$b     // Catch:{ all -> 0x0080 }
            r10.<init>()     // Catch:{ all -> 0x0080 }
            te3.qw1 r3 = new te3.qw1     // Catch:{ all -> 0x0080 }
            r3.<init>()     // Catch:{ all -> 0x0080 }
            r4 = 2
            r3.f140587g = r4     // Catch:{ all -> 0x0080 }
            r4 = 1011000(0xf6d38, float:1.416713E-39)
            r3.f140585e = r4     // Catch:{ all -> 0x0080 }
            r10.f127066a = r3     // Catch:{ all -> 0x0080 }
            te3.rw1 r3 = new te3.rw1     // Catch:{ all -> 0x0080 }
            r3.<init>()     // Catch:{ all -> 0x0080 }
            r10.f127067b = r3     // Catch:{ all -> 0x0080 }
            r3 = 6940(0x1b1c, float:9.725E-42)
            r10.f127069d = r3     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "/cgi-bin/micromsg-bin/findertemplategetcamera"
            r10.f127068c = r3     // Catch:{ all -> 0x0080 }
            r10.f127070e = r8     // Catch:{ all -> 0x0080 }
            r10.f127071f = r8     // Catch:{ all -> 0x0080 }
            ob0.c r10 = r10.mo72403a()     // Catch:{ all -> 0x0080 }
            r1.mo123453j(r10)     // Catch:{ all -> 0x0080 }
            r3 = 0
            r10 = 0
            r6 = 3
            r7 = 0
            r5.f128332f = r2     // Catch:{ all -> 0x0080 }
            r2 = r3
            r4 = r10
            java.lang.Object r10 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0080 }
            if (r10 != r0) goto L_0x0079
            return r0
        L_0x0079:
            te3.rw1 r10 = (te3.C51166rw1) r10     // Catch:{ all -> 0x0080 }
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)     // Catch:{ all -> 0x0080 }
            goto L_0x008b
        L_0x0080:
            r10 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)
        L_0x008b:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r10)
            if (r0 != 0) goto L_0x0092
            goto L_0x009c
        L_0x0092:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r1 = "MicroMsg.Maas.TemplateCgiHelper"
            java.lang.String r2 = "getTemplateList cgi error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r10)
            r10 = 0
        L_0x009c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C47792a.mo72568a(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72569b(int r10, wx3.C15601d<? super te3.C52088y92> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof qa0.C47792a.C47794b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            qa0.a$b r0 = (qa0.C47792a.C47794b) r0
            int r1 = r0.f128335f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128335f = r1
            goto L_0x0018
        L_0x0013:
            qa0.a$b r0 = new qa0.a$b
            r0.<init>(r9, r11)
        L_0x0018:
            r5 = r0
            java.lang.Object r11 = r5.f128333d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f128335f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x008b }
            goto L_0x0084
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result$Companion r11 = kotlin.Result.Companion     // Catch:{ all -> 0x008b }
            ob0.b r1 = new ob0.b     // Catch:{ all -> 0x008b }
            r1.<init>()     // Catch:{ all -> 0x008b }
            ob0.c$b r11 = new ob0.c$b     // Catch:{ all -> 0x008b }
            r11.<init>()     // Catch:{ all -> 0x008b }
            te3.x92 r3 = new te3.x92     // Catch:{ all -> 0x008b }
            r3.<init>()     // Catch:{ all -> 0x008b }
            r4 = 1011000(0xf6d38, float:1.416713E-39)
            r3.f144543e = r4     // Catch:{ all -> 0x008b }
            int r4 = qr3.C110470e.f330363a     // Catch:{ all -> 0x008b }
            if (r4 != 0) goto L_0x0053
            r4 = 2011400(0x1eb108, float:2.818572E-39)
            qr3.C110470e.f330363a = r4     // Catch:{ all -> 0x008b }
        L_0x0053:
            int r4 = qr3.C110470e.f330363a     // Catch:{ all -> 0x008b }
            r3.f144544f = r4     // Catch:{ all -> 0x008b }
            r3.f144546h = r10     // Catch:{ all -> 0x008b }
            r11.f127066a = r3     // Catch:{ all -> 0x008b }
            te3.y92 r10 = new te3.y92     // Catch:{ all -> 0x008b }
            r10.<init>()     // Catch:{ all -> 0x008b }
            r11.f127067b = r10     // Catch:{ all -> 0x008b }
            r10 = 6995(0x1b53, float:9.802E-42)
            r11.f127069d = r10     // Catch:{ all -> 0x008b }
            java.lang.String r10 = "/cgi-bin/micromsg-bin/findertemplategetsquare"
            r11.f127068c = r10     // Catch:{ all -> 0x008b }
            r11.f127070e = r8     // Catch:{ all -> 0x008b }
            r11.f127071f = r8     // Catch:{ all -> 0x008b }
            ob0.c r10 = r11.mo72403a()     // Catch:{ all -> 0x008b }
            r1.mo123453j(r10)     // Catch:{ all -> 0x008b }
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f128335f = r2     // Catch:{ all -> 0x008b }
            r2 = r10
            java.lang.Object r11 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x008b }
            if (r11 != r0) goto L_0x0084
            return r0
        L_0x0084:
            te3.y92 r11 = (te3.C52088y92) r11     // Catch:{ all -> 0x008b }
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r11)     // Catch:{ all -> 0x008b }
            goto L_0x0096
        L_0x008b:
            r10 = move-exception
            kotlin.Result$Companion r11 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)
        L_0x0096:
            java.lang.Throwable r11 = kotlin.Result.m168117exceptionOrNullimpl(r10)
            if (r11 != 0) goto L_0x009d
            goto L_0x00a7
        L_0x009d:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r0 = "MicroMsg.Maas.TemplateCgiHelper"
            java.lang.String r1 = "getTemplateList cgi error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r1, r10)
            r10 = 0
        L_0x00a7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C47792a.mo72569b(int, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72570c(wx3.C15601d<? super te3.C51804w92> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof qa0.C47792a.C47795c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            qa0.a$c r0 = (qa0.C47792a.C47795c) r0
            int r1 = r0.f128338f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128338f = r1
            goto L_0x0018
        L_0x0013:
            qa0.a$c r0 = new qa0.a$c
            r0.<init>(r9, r10)
        L_0x0018:
            r5 = r0
            java.lang.Object r10 = r5.f128336d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f128338f
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x007a }
            goto L_0x0073
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x007a }
            ob0.b r1 = new ob0.b     // Catch:{ all -> 0x007a }
            r1.<init>()     // Catch:{ all -> 0x007a }
            ob0.c$b r10 = new ob0.c$b     // Catch:{ all -> 0x007a }
            r10.<init>()     // Catch:{ all -> 0x007a }
            te3.v92 r3 = new te3.v92     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            r3.f143396e = r2     // Catch:{ all -> 0x007a }
            r10.f127066a = r3     // Catch:{ all -> 0x007a }
            te3.w92 r3 = new te3.w92     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            r10.f127067b = r3     // Catch:{ all -> 0x007a }
            r3 = 11538(0x2d12, float:1.6168E-41)
            r10.f127069d = r3     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "/cgi-bin/micromsg-bin/findertemplategetresource"
            r10.f127068c = r3     // Catch:{ all -> 0x007a }
            r10.f127070e = r8     // Catch:{ all -> 0x007a }
            r10.f127071f = r8     // Catch:{ all -> 0x007a }
            ob0.c r10 = r10.mo72403a()     // Catch:{ all -> 0x007a }
            r1.mo123453j(r10)     // Catch:{ all -> 0x007a }
            r3 = 0
            r10 = 0
            r6 = 3
            r7 = 0
            r5.f128338f = r2     // Catch:{ all -> 0x007a }
            r2 = r3
            r4 = r10
            java.lang.Object r10 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x007a }
            if (r10 != r0) goto L_0x0073
            return r0
        L_0x0073:
            te3.w92 r10 = (te3.C51804w92) r10     // Catch:{ all -> 0x007a }
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)     // Catch:{ all -> 0x007a }
            goto L_0x0085
        L_0x007a:
            r10 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)
        L_0x0085:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r10)
            if (r0 != 0) goto L_0x008c
            goto L_0x0096
        L_0x008c:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r1 = "MicroMsg.Maas.TemplateCgiHelper"
            java.lang.String r2 = "getTemplateResource cgi error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r10)
            r10 = 0
        L_0x0096:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C47792a.mo72570c(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72571d(java.lang.String r10, int r11, wx3.C15601d<? super te3.C48973c92> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof qa0.C47792a.C47796d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            qa0.a$d r0 = (qa0.C47792a.C47796d) r0
            int r1 = r0.f128341f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128341f = r1
            goto L_0x0018
        L_0x0013:
            qa0.a$d r0 = new qa0.a$d
            r0.<init>(r9, r12)
        L_0x0018:
            r5 = r0
            java.lang.Object r12 = r5.f128339d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f128341f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0080 }
            goto L_0x0079
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Result$Companion r12 = kotlin.Result.Companion     // Catch:{ all -> 0x0080 }
            ob0.b r1 = new ob0.b     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            ob0.c$b r12 = new ob0.c$b     // Catch:{ all -> 0x0080 }
            r12.<init>()     // Catch:{ all -> 0x0080 }
            te3.b92 r3 = new te3.b92     // Catch:{ all -> 0x0080 }
            r3.<init>()     // Catch:{ all -> 0x0080 }
            r3.f131015e = r10     // Catch:{ all -> 0x0080 }
            r10 = 1011000(0xf6d38, float:1.416713E-39)
            r3.f131017g = r10     // Catch:{ all -> 0x0080 }
            r3.f131018h = r11     // Catch:{ all -> 0x0080 }
            r12.f127066a = r3     // Catch:{ all -> 0x0080 }
            te3.c92 r10 = new te3.c92     // Catch:{ all -> 0x0080 }
            r10.<init>()     // Catch:{ all -> 0x0080 }
            r12.f127067b = r10     // Catch:{ all -> 0x0080 }
            r10 = 6963(0x1b33, float:9.757E-42)
            r12.f127069d = r10     // Catch:{ all -> 0x0080 }
            java.lang.String r10 = "/cgi-bin/micromsg-bin/findertemplategetspecific"
            r12.f127068c = r10     // Catch:{ all -> 0x0080 }
            r12.f127070e = r8     // Catch:{ all -> 0x0080 }
            r12.f127071f = r8     // Catch:{ all -> 0x0080 }
            ob0.c r10 = r12.mo72403a()     // Catch:{ all -> 0x0080 }
            r1.mo123453j(r10)     // Catch:{ all -> 0x0080 }
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f128341f = r2     // Catch:{ all -> 0x0080 }
            r2 = r10
            java.lang.Object r12 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0080 }
            if (r12 != r0) goto L_0x0079
            return r0
        L_0x0079:
            te3.c92 r12 = (te3.C48973c92) r12     // Catch:{ all -> 0x0080 }
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r12)     // Catch:{ all -> 0x0080 }
            goto L_0x008b
        L_0x0080:
            r10 = move-exception
            kotlin.Result$Companion r11 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)
        L_0x008b:
            java.lang.Throwable r11 = kotlin.Result.m168117exceptionOrNullimpl(r10)
            if (r11 != 0) goto L_0x0092
            goto L_0x009c
        L_0x0092:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r12 = "MicroMsg.Maas.TemplateCgiHelper"
            java.lang.String r0 = "getTemplateSpecific cgi error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r11, r0, r10)
            r10 = 0
        L_0x009c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C47792a.mo72571d(java.lang.String, int, wx3.d):java.lang.Object");
    }
}
