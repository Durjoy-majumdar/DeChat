package com.tencent.p014mm.modelsimple;

import te3.C51018qv3;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.modelsimple.e */
public final class C1303e {

    /* renamed from: a */
    public static final C1303e f10418a = new C1303e();

    @C91590f(mo125468c = "com.tencent.mm.modelsimple.CgiVerifyPswd", mo125469f = "CgiVerifyPswd.kt", mo125470l = {27}, mo125471m = "doQueryHasPswdScene")
    /* renamed from: com.tencent.mm.modelsimple.e$a */
    public static final class C1304a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f10419d;

        /* renamed from: e */
        public final /* synthetic */ C1303e f10420e;

        /* renamed from: f */
        public int f10421f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1304a(C1303e eVar, C15601d<? super C1304a> dVar) {
            super(dVar);
            this.f10420e = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10419d = obj;
            this.f10421f |= Integer.MIN_VALUE;
            return this.f10420e.mo1223a(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelsimple.CgiVerifyPswd", mo125469f = "CgiVerifyPswd.kt", mo125470l = {54}, mo125471m = "doVerifyPswdScene")
    /* renamed from: com.tencent.mm.modelsimple.e$b */
    public static final class C1305b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f10422d;

        /* renamed from: e */
        public final /* synthetic */ C1303e f10423e;

        /* renamed from: f */
        public int f10424f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1305b(C1303e eVar, C15601d<? super C1305b> dVar) {
            super(dVar);
            this.f10423e = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10422d = obj;
            this.f10424f |= Integer.MIN_VALUE;
            return this.f10423e.mo1224b(0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (C51018qv3) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo1223a(wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.tencent.p014mm.modelsimple.C1303e.C1304a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.tencent.mm.modelsimple.e$a r0 = (com.tencent.p014mm.modelsimple.C1303e.C1304a) r0
            int r1 = r0.f10421f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10421f = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.modelsimple.e$a r0 = new com.tencent.mm.modelsimple.e$a
            r0.<init>(r8, r9)
        L_0x0018:
            r5 = r0
            java.lang.Object r9 = r5.f10419d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f10421f
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006c
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r9)
            te3.el3 r9 = new te3.el3
            r9.<init>()
            r9.f132997d = r2
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            r3 = 255(0xff, float:3.57E-43)
            r1.f127069d = r3
            java.lang.String r3 = "/cgi-bin/micromsg-bin/queryhaspasswd"
            r1.f127068c = r3
            r1.f127066a = r9
            te3.fl3 r9 = new te3.fl3
            r9.<init>()
            r1.f127067b = r9
            ob0.c r9 = r1.mo72403a()
            ob0.b r1 = new ob0.b
            r1.<init>()
            r1.mo123453j(r9)
            r3 = 0
            r9 = 0
            r6 = 3
            r7 = 0
            r5.f10421f = r2
            r2 = r3
            r4 = r9
            java.lang.Object r9 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)
            if (r9 != r0) goto L_0x006c
            return r0
        L_0x006c:
            te3.fl3 r9 = (te3.C49441fl3) r9
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelsimple.C1303e.mo1223a(wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo1224b(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, te3.C51018qv3 r13, wx3.C15601d<? super te3.cq4> r14) {
        /*
            r5 = this;
            boolean r0 = r14 instanceof com.tencent.p014mm.modelsimple.C1303e.C1305b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.tencent.mm.modelsimple.e$b r0 = (com.tencent.p014mm.modelsimple.C1303e.C1305b) r0
            int r1 = r0.f10424f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10424f = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.modelsimple.e$b r0 = new com.tencent.mm.modelsimple.e$b
            r0.<init>(r5, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f10422d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f10424f
            java.lang.String r3 = "_auth_key"
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00ff
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r14)
            te3.bq4 r14 = new te3.bq4
            r14.<init>()
            r14.f131261d = r6
            r14.f131262e = r7
            r14.f131263f = r8
            r14.f131268n = r12
            android.content.SharedPreferences r6 = eb0.C7627m3.m7760a()
            java.lang.String r7 = ""
            java.lang.String r6 = r6.getString(r3, r7)
            if (r6 != 0) goto L_0x004f
            r6 = r7
        L_0x004f:
            byte[] r6 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r6)
            te3.m8 r8 = new te3.m8
            r8.<init>()
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)
            r2 = 0
            if (r12 != 0) goto L_0x0074
            te3.qv3 r12 = new te3.qv3
            r12.<init>()
            r12.mo73350k(r6)
            r8.parseFrom(r6)     // Catch:{ IOException -> 0x006b }
            goto L_0x007e
        L_0x006b:
            r6 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r2 = "MicroMsg.CgiVerifyPswd"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r6, r7, r8)
            goto L_0x007e
        L_0x0074:
            te3.qv3 r12 = new te3.qv3
            r12.<init>()
            byte[] r6 = new byte[r2]
            r12.mo73350k(r6)
        L_0x007e:
            r14.f131270p = r12
            te3.rv3 r6 = new te3.rv3
            r6.<init>()
            r6.f141175d = r10
            r6.f141176e = r4
            r14.f131265h = r6
            te3.rv3 r6 = new te3.rv3
            r6.<init>()
            r6.f141175d = r9
            r6.f141176e = r4
            r14.f131264g = r6
            te3.rv3 r6 = new te3.rv3
            r6.<init>()
            r6.f141175d = r11
            r6.f141176e = r4
            r14.f131266i = r6
            r14.f131269o = r13
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r7 = 47
            r8 = 0
            java.lang.Object r6 = r6.mo119684e(r7, r8)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x00b9
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
        L_0x00b9:
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            te3.qv3 r7 = new te3.qv3
            r7.<init>()
            byte[] r6 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r6)
            r7.mo73350k(r6)
            r14.f131267j = r7
            ob0.c$b r6 = new ob0.c$b
            r6.<init>()
            r7 = 384(0x180, float:5.38E-43)
            r6.f127069d = r7
            java.lang.String r7 = "/cgi-bin/micromsg-bin/newverifypasswd"
            r6.f127068c = r7
            r6.f127066a = r14
            te3.cq4 r7 = new te3.cq4
            r7.<init>()
            r6.f127067b = r7
            ob0.c r6 = r6.mo72403a()
            ob0.b r7 = new ob0.b
            r7.<init>()
            r7.mo123453j(r6)
            r8 = 0
            r10 = 0
            r11 = 3
            r12 = 0
            r0.f10424f = r4
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r0
            java.lang.Object r14 = q40.C89456b.m111831a(r6, r7, r9, r10, r11, r12)
            if (r14 != r1) goto L_0x00ff
            return r1
        L_0x00ff:
            te3.cq4 r14 = (te3.cq4) r14
            te3.qv3 r6 = r14.f131910o
            java.lang.String r7 = "resp.AutoAuthKey"
            gy3.C87412m.m108593f(r6, r7)
            pe3.b r6 = r6.f140574f
            byte[] r6 = r6.mo123703f()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 4
            java.lang.String r9 = "auth_info_key_prefs"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r9, r8)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r8 = "key_auth_info_prefs_created"
            r7.putBoolean(r8, r4)
            int r8 = qe3.C89625d.f257841g
            java.lang.String r9 = "key_auth_update_version"
            r7.putInt(r9, r8)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r6)
            r7.putString(r3, r6)
            f40.e r6 = f40.C86709a0.m107523b()
            int r6 = r6.mo121110g()
            java.lang.String r8 = "_auth_uin"
            r7.putInt(r8, r6)
            r7.commit()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelsimple.C1303e.mo1224b(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, te3.qv3, wx3.d):java.lang.Object");
    }
}
