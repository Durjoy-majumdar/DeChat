package c12;

import pe3.C89349b;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: c12.b */
public final class C39886b {

    /* renamed from: a */
    public static final C39886b f106941a = new C39886b();

    @C91590f(mo125468c = "com.tencent.mm.plugin.ilink.ILinkCgiHelper", mo125469f = "ILinkCgiHelper.kt", mo125470l = {20}, mo125471m = "cloudAuth")
    /* renamed from: c12.b$a */
    public static final class C39887a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f106942d;

        /* renamed from: e */
        public final /* synthetic */ C39886b f106943e;

        /* renamed from: f */
        public int f106944f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39887a(C39886b bVar, C15601d<? super C39887a> dVar) {
            super(dVar);
            this.f106943e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106942d = obj;
            this.f106944f |= Integer.MIN_VALUE;
            return this.f106943e.mo62499a((C89349b) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ilink.ILinkCgiHelper", mo125469f = "ILinkCgiHelper.kt", mo125470l = {40}, mo125471m = "transfer")
    /* renamed from: c12.b$b */
    public static final class C39888b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f106945d;

        /* renamed from: e */
        public final /* synthetic */ C39886b f106946e;

        /* renamed from: f */
        public int f106947f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39888b(C39886b bVar, C15601d<? super C39888b> dVar) {
            super(dVar);
            this.f106946e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106945d = obj;
            this.f106947f |= Integer.MIN_VALUE;
            return this.f106946e.mo62500b((C89349b) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62499a(pe3.C89349b r11, wx3.C15601d<? super rx3.C13604l<java.lang.Integer, pe3.C89349b>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof c12.C39886b.C39887a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            c12.b$a r0 = (c12.C39886b.C39887a) r0
            int r1 = r0.f106944f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106944f = r1
            goto L_0x0018
        L_0x0013:
            c12.b$a r0 = new c12.b$a
            r0.<init>(r10, r12)
        L_0x0018:
            r5 = r0
            java.lang.Object r12 = r5.f106942d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f106944f
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 != r8) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0080 }
            goto L_0x006d
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Result$Companion r12 = kotlin.Result.Companion     // Catch:{ all -> 0x0080 }
            te3.lh2 r12 = new te3.lh2     // Catch:{ all -> 0x0080 }
            r12.<init>()     // Catch:{ all -> 0x0080 }
            r12.f137423d = r11     // Catch:{ all -> 0x0080 }
            ob0.c$b r11 = new ob0.c$b     // Catch:{ all -> 0x0080 }
            r11.<init>()     // Catch:{ all -> 0x0080 }
            r1 = 7994(0x1f3a, float:1.1202E-41)
            r11.f127069d = r1     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "/cgi-bin/micromsg-bin/mm_ilink_cloud_app_auth"
            r11.f127068c = r1     // Catch:{ all -> 0x0080 }
            r11.f127066a = r12     // Catch:{ all -> 0x0080 }
            te3.mh2 r12 = new te3.mh2     // Catch:{ all -> 0x0080 }
            r12.<init>()     // Catch:{ all -> 0x0080 }
            r11.f127067b = r12     // Catch:{ all -> 0x0080 }
            ob0.c r11 = r11.mo72403a()     // Catch:{ all -> 0x0080 }
            ob0.b r1 = new ob0.b     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            r1.mo123453j(r11)     // Catch:{ all -> 0x0080 }
            r2 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f106944f = r8     // Catch:{ all -> 0x0080 }
            java.lang.Object r12 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0080 }
            if (r12 != r0) goto L_0x006d
            return r0
        L_0x006d:
            te3.mh2 r12 = (te3.C50402mh2) r12     // Catch:{ all -> 0x0080 }
            rx3.l r11 = new rx3.l     // Catch:{ all -> 0x0080 }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x0080 }
            r0.<init>(r9)     // Catch:{ all -> 0x0080 }
            pe3.b r12 = r12.f138031d     // Catch:{ all -> 0x0080 }
            r11.<init>(r0, r12)     // Catch:{ all -> 0x0080 }
            java.lang.Object r11 = kotlin.Result.m168114constructorimpl(r11)     // Catch:{ all -> 0x0080 }
            goto L_0x008b
        L_0x0080:
            r11 = move-exception
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.m168114constructorimpl(r11)
        L_0x008b:
            java.lang.Throwable r12 = kotlin.Result.m168117exceptionOrNullimpl(r11)
            if (r12 != 0) goto L_0x0092
            goto L_0x00f5
        L_0x0092:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "cloud auth cgi error "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r1 = "MicroMsg.ILinkCgiHelper"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r12, r11, r0)
            boolean r11 = r12 instanceof q40.C12040d
            r0 = 0
            if (r11 == 0) goto L_0x00b3
            r1 = r12
            q40.d r1 = (q40.C12040d) r1
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            if (r1 == 0) goto L_0x00bb
            int r1 = r1.f35057e
            if (r1 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r8 = 0
        L_0x00bc:
            r1 = -1
            if (r8 == 0) goto L_0x00da
            rx3.l r2 = new rx3.l
            if (r11 == 0) goto L_0x00c6
            r0 = r12
            q40.d r0 = (q40.C12040d) r0
        L_0x00c6:
            if (r0 == 0) goto L_0x00ca
            int r1 = r0.f35058f
        L_0x00ca:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r1)
            pe3.b r12 = new pe3.b
            byte[] r0 = new byte[r9]
            r12.<init>(r0, r9, r9)
            r2.<init>(r11, r12)
            goto L_0x00f4
        L_0x00da:
            rx3.l r2 = new rx3.l
            if (r11 == 0) goto L_0x00e1
            r0 = r12
            q40.d r0 = (q40.C12040d) r0
        L_0x00e1:
            if (r0 == 0) goto L_0x00e5
            int r1 = r0.f35057e
        L_0x00e5:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r1)
            pe3.b r12 = new pe3.b
            byte[] r0 = new byte[r9]
            r12.<init>(r0, r9, r9)
            r2.<init>(r11, r12)
        L_0x00f4:
            r11 = r2
        L_0x00f5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c12.C39886b.mo62499a(pe3.b, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62500b(pe3.C89349b r10, wx3.C15601d<? super rx3.C13604l<java.lang.Integer, pe3.C89349b>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof c12.C39886b.C39888b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            c12.b$b r0 = (c12.C39886b.C39888b) r0
            int r1 = r0.f106947f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106947f = r1
            goto L_0x0018
        L_0x0013:
            c12.b$b r0 = new c12.b$b
            r0.<init>(r9, r11)
        L_0x0018:
            r5 = r0
            java.lang.Object r11 = r5.f106945d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f106947f
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0081 }
            goto L_0x006e
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result$Companion r11 = kotlin.Result.Companion     // Catch:{ all -> 0x0081 }
            te3.nh2 r11 = new te3.nh2     // Catch:{ all -> 0x0081 }
            r11.<init>()     // Catch:{ all -> 0x0081 }
            r11.f138608d = r10     // Catch:{ all -> 0x0081 }
            ob0.c$b r10 = new ob0.c$b     // Catch:{ all -> 0x0081 }
            r10.<init>()     // Catch:{ all -> 0x0081 }
            r1 = 11421(0x2c9d, float:1.6004E-41)
            r10.f127069d = r1     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "/cgi-bin/micromsg-bin/mmilinktransfer"
            r10.f127068c = r1     // Catch:{ all -> 0x0081 }
            r10.f127066a = r11     // Catch:{ all -> 0x0081 }
            te3.oh2 r11 = new te3.oh2     // Catch:{ all -> 0x0081 }
            r11.<init>()     // Catch:{ all -> 0x0081 }
            r10.f127067b = r11     // Catch:{ all -> 0x0081 }
            ob0.c r10 = r10.mo72403a()     // Catch:{ all -> 0x0081 }
            ob0.b r1 = new ob0.b     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
            r1.mo123453j(r10)     // Catch:{ all -> 0x0081 }
            r10 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f106947f = r2     // Catch:{ all -> 0x0081 }
            r2 = r10
            java.lang.Object r11 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x0081 }
            if (r11 != r0) goto L_0x006e
            return r0
        L_0x006e:
            te3.oh2 r11 = (te3.C50683oh2) r11     // Catch:{ all -> 0x0081 }
            rx3.l r10 = new rx3.l     // Catch:{ all -> 0x0081 }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x0081 }
            r0.<init>(r8)     // Catch:{ all -> 0x0081 }
            pe3.b r11 = r11.f139183d     // Catch:{ all -> 0x0081 }
            r10.<init>(r0, r11)     // Catch:{ all -> 0x0081 }
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)     // Catch:{ all -> 0x0081 }
            goto L_0x008c
        L_0x0081:
            r10 = move-exception
            kotlin.Result$Companion r11 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m168114constructorimpl(r10)
        L_0x008c:
            java.lang.Throwable r11 = kotlin.Result.m168117exceptionOrNullimpl(r10)
            if (r11 != 0) goto L_0x0093
            goto L_0x00ca
        L_0x0093:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "transfer cgi error "
            r10.append(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "MicroMsg.ILinkCgiHelper"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r11, r10, r0)
            rx3.l r10 = new rx3.l
            boolean r0 = r11 instanceof q40.C12040d
            if (r0 == 0) goto L_0x00b4
            q40.d r11 = (q40.C12040d) r11
            goto L_0x00b5
        L_0x00b4:
            r11 = 0
        L_0x00b5:
            if (r11 == 0) goto L_0x00ba
            int r11 = r11.f35058f
            goto L_0x00bb
        L_0x00ba:
            r11 = -1
        L_0x00bb:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            pe3.b r11 = new pe3.b
            byte[] r1 = new byte[r8]
            r11.<init>(r1, r8, r8)
            r10.<init>(r0, r11)
        L_0x00ca:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c12.C39886b.mo62500b(pe3.b, wx3.d):java.lang.Object");
    }
}
