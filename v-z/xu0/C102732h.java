package xu0;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13601g;
import rx3.C36568h;
import wb0.C102382b;
import wb0.C102383c;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: xu0.h */
public final class C102732h extends ProcessorPipelineComponent<C102382b, C102383c> {

    /* renamed from: b */
    public static final C13601g<HashMap<String, Integer>> f303343b = C36568h.m40985a(C38838a.f104712d);

    /* renamed from: a */
    public final C13601g f303344a = C36568h.m40985a(C38840e.f104713d);

    /* renamed from: xu0.h$a */
    public static final class C38838a extends C87413o implements C32224a<HashMap<String, Integer>> {

        /* renamed from: d */
        public static final C38838a f104712d = new C38838a();

        public C38838a() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: xu0.h$b */
    public static final class C38839b {
        public C38839b(C8480h hVar) {
        }
    }

    /* renamed from: xu0.h$e */
    public static final class C38840e extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C38840e f104713d = new C38840e();

        public C38840e() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV(C86709a0.m107523b().mo121111i() + "_BigHeadImg");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.ppc.AvatarLoadDataFromRemotePPC", mo125469f = "AvatarLoadDataFromRemotePPC.kt", mo125470l = {342}, mo125471m = "loadFromBigCgi")
    /* renamed from: xu0.h$c */
    public static final class C102733c extends C66704d {

        /* renamed from: d */
        public Object f303345d;

        /* renamed from: e */
        public Object f303346e;

        /* renamed from: f */
        public Object f303347f;

        /* renamed from: g */
        public Object f303348g;

        /* renamed from: h */
        public Object f303349h;

        /* renamed from: i */
        public Object f303350i;

        /* renamed from: j */
        public /* synthetic */ Object f303351j;

        /* renamed from: n */
        public final /* synthetic */ C102732h f303352n;

        /* renamed from: o */
        public int f303353o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102733c(C102732h hVar, C15601d<? super C102733c> dVar) {
            super(dVar);
            this.f303352n = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f303351j = obj;
            this.f303353o |= Integer.MIN_VALUE;
            C102732h hVar = this.f303352n;
            C13601g<HashMap<String, Integer>> gVar = C102732h.f303343b;
            return hVar.mo142518a((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.ppc.AvatarLoadDataFromRemotePPC", mo125469f = "AvatarLoadDataFromRemotePPC.kt", mo125470l = {293}, mo125471m = "loadFromSmallCgi")
    /* renamed from: xu0.h$d */
    public static final class C102734d extends C66704d {

        /* renamed from: d */
        public Object f303354d;

        /* renamed from: e */
        public /* synthetic */ Object f303355e;

        /* renamed from: f */
        public final /* synthetic */ C102732h f303356f;

        /* renamed from: g */
        public int f303357g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102734d(C102732h hVar, C15601d<? super C102734d> dVar) {
            super(dVar);
            this.f303356f = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f303355e = obj;
            this.f303357g |= Integer.MIN_VALUE;
            C102732h hVar = this.f303356f;
            C13601g<HashMap<String, Integer>> gVar = C102732h.f303343b;
            return hVar.mo142519b((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.ppc.AvatarLoadDataFromRemotePPC", mo125469f = "AvatarLoadDataFromRemotePPC.kt", mo125470l = {381, 383}, mo125471m = "processAction")
    /* renamed from: xu0.h$f */
    public static final class C102735f extends C66704d {

        /* renamed from: d */
        public Object f303358d;

        /* renamed from: e */
        public Object f303359e;

        /* renamed from: f */
        public Object f303360f;

        /* renamed from: g */
        public /* synthetic */ Object f303361g;

        /* renamed from: h */
        public final /* synthetic */ C102732h f303362h;

        /* renamed from: i */
        public int f303363i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102735f(C102732h hVar, C15601d<? super C102735f> dVar) {
            super(dVar);
            this.f303362h = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f303361g = obj;
            this.f303363i |= Integer.MIN_VALUE;
            return this.f303362h.processAction((PipelineState) null, (C102382b) null, this);
        }
    }

    static {
        new C38839b((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102732h(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0216 A[SYNTHETIC, Splitter:B:44:0x0216] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo142518a(java.lang.String r22, wx3.C15601d<? super byte[]> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof xu0.C102732h.C102733c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            xu0.h$c r3 = (xu0.C102732h.C102733c) r3
            int r4 = r3.f303353o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f303353o = r4
            goto L_0x001e
        L_0x0019:
            xu0.h$c r3 = new xu0.h$c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f303351j
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f303353o
            java.lang.String r6 = "MicroMsg.Avatar.AvatarLoadDataFromRemotePPC"
            r7 = 59
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x0055
            if (r5 != r9) goto L_0x004d
            java.lang.Object r1 = r3.f303350i
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            java.lang.Object r5 = r3.f303349h
            gy3.d0 r5 = (gy3.C8478d0) r5
            java.lang.Object r11 = r3.f303348g
            gy3.d0 r11 = (gy3.C8478d0) r11
            java.lang.Object r12 = r3.f303347f
            com.tencent.mm.vfs.m1 r12 = (com.tencent.p014mm.vfs.C86009m1) r12
            java.lang.Object r13 = r3.f303346e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r3.f303345d
            xu0.h r14 = (xu0.C102732h) r14
            kotlin.ResultKt.throwOnFailure(r2)
            r8 = r1
            r1 = r13
            goto L_0x017b
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Class<n20.s> r2 = n20.C61611s.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            n20.s r2 = (n20.C61611s) r2
            com.tencent.mm.vfs.m1 r2 = r2.xn0()
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "hd_"
            r11.append(r12)
            java.nio.charset.Charset r12 = z04.C119027c.f356488a
            byte[] r12 = r1.getBytes(r12)
            java.lang.String r13 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r12, r13)
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r11)
            gy3.d0 r2 = new gy3.d0
            r2.<init>()
            gy3.d0 r11 = new gy3.d0
            r11.<init>()
            boolean r12 = r5.mo119967g()
            if (r12 == 0) goto L_0x00f3
            rx3.g r12 = r0.f303344a
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r12
            java.lang.String r13 = ""
            java.lang.String r14 = r12.decodeString(r1, r13)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r12 != 0) goto L_0x00f0
            java.lang.String r12 = "downloadInfoStr"
            gy3.C87412m.m108593f(r14, r12)
            java.lang.String r12 = ";"
            java.lang.String[] r15 = new java.lang.String[]{r12}
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            java.util.List r12 = z04.C112550d0.m153785U(r14, r15, r16, r17, r18, r19)
            int r13 = r12.size()
            r14 = 2
            if (r13 != r14) goto L_0x00d0
            r13 = 1
            goto L_0x00d1
        L_0x00d0:
            r13 = 0
        L_0x00d1:
            if (r13 == 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r12 = 0
        L_0x00d5:
            if (r12 == 0) goto L_0x00f3
            java.lang.Object r13 = r12.get(r10)
            java.lang.String r13 = (java.lang.String) r13
            int r13 = java.lang.Integer.parseInt(r13)
            r2.f27483d = r13
            java.lang.Object r12 = r12.get(r9)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = java.lang.Integer.parseInt(r12)
            r11.f27483d = r12
            goto L_0x00f3
        L_0x00f0:
            r5.mo119966f()
        L_0x00f3:
            java.io.OutputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106426H(r5)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00fa
        L_0x00f8:
            r12 = 0
        L_0x00fa:
            r14 = r0
            r20 = r11
            r11 = r2
            r2 = r5
            r5 = r20
        L_0x0101:
            if (r12 == 0) goto L_0x0214
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "start request BigHead "
            r13.append(r15)
            int r15 = r11.f27483d
            r13.append(r15)
            r13.append(r7)
            int r15 = r5.f27483d
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)
            te3.j12 r13 = new te3.j12
            r13.<init>()
            r13.f298443d = r1
            r13.f298449j = r9
            r15 = 480(0x1e0, float:6.73E-43)
            r13.f298445f = r15
            r13.f298444e = r15
            java.lang.String r15 = "jpg"
            r13.f298446g = r15
            int r15 = r11.f27483d
            r13.f298447h = r15
            int r15 = r5.f27483d
            r13.f298448i = r15
            ob0.c$b r15 = new ob0.c$b
            r15.<init>()
            r8 = 158(0x9e, float:2.21E-43)
            r15.f127069d = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/gethdheadimg"
            r15.f127068c = r8
            r15.f127066a = r13
            te3.k12 r8 = new te3.k12
            r8.<init>()
            r15.f127067b = r8
            ob0.c r8 = r15.mo72403a()
            ob0.b r13 = new ob0.b
            r13.<init>()
            r13.mo123453j(r8)
            r3.f303345d = r14
            r3.f303346e = r1
            r3.f303347f = r2
            r3.f303348g = r11
            r3.f303349h = r5
            r3.f303350i = r12
            r3.f303353o = r9
            java.lang.Object r8 = q40.C89456b.m111832b(r13, r3)
            if (r8 != r4) goto L_0x0175
            return r4
        L_0x0175:
            r20 = r12
            r12 = r2
            r2 = r8
            r8 = r20
        L_0x017b:
            ob0.b$c r2 = (ob0.C89132b.C89134c) r2
            T r2 = r2.f256796d
            te3.k12 r2 = (te3.C50066k12) r2
            if (r2 == 0) goto L_0x020d
            byte[] r13 = r2.getData()
            r8.write(r13)
            int r13 = r2.f136504e
            r11.f27483d = r13
            int r13 = r5.f27483d
            byte[] r2 = r2.getData()
            int r2 = r2.length
            int r13 = r13 + r2
            r5.f27483d = r13
            int r2 = r11.f27483d
            if (r13 < r2) goto L_0x01c8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "BigHead Resp Finish "
            r2.append(r3)
            int r3 = r11.f27483d
            r2.append(r3)
            r2.append(r7)
            int r3 = r5.f27483d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            rx3.g r2 = r14.f303344a
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2
            r2.removeValueForKey(r1)
            goto L_0x0212
        L_0x01c8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = "BigHead Resp Progress "
            r2.append(r13)
            int r13 = r11.f27483d
            r2.append(r13)
            r2.append(r7)
            int r13 = r5.f27483d
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            rx3.g r2 = r14.f303344a
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r15 = r11.f27483d
            r13.append(r15)
            r13.append(r7)
            int r15 = r5.f27483d
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r2.encode((java.lang.String) r1, (java.lang.String) r13)
            r2 = r12
            r12 = r8
            goto L_0x0101
        L_0x020d:
            java.lang.String r1 = "BigHead Resp is Error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
        L_0x0212:
            r2 = r12
            r12 = r8
        L_0x0214:
            if (r12 == 0) goto L_0x021b
            r12.close()     // Catch:{ Exception -> 0x021a }
            goto L_0x021b
        L_0x021a:
        L_0x021b:
            int r1 = r5.f27483d
            int r3 = r11.f27483d
            if (r1 < r3) goto L_0x0236
            long r3 = r2.mo119980r()
            int r1 = r11.f27483d
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0236
            java.lang.String r1 = r2.mo119971i()
            r2 = -1
            byte[] r1 = com.tencent.p014mm.vfs.C86013q1.m106433O(r1, r10, r2)
            return r1
        L_0x0236:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xu0.C102732h.mo142518a(java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo142519b(java.lang.String r8, wx3.C15601d<? super byte[]> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof xu0.C102732h.C102734d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            xu0.h$d r0 = (xu0.C102732h.C102734d) r0
            int r1 = r0.f303357g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f303357g = r1
            goto L_0x0018
        L_0x0013:
            xu0.h$d r0 = new xu0.h$d
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f303355e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f303357g
            r3 = 0
            java.lang.String r4 = "MicroMsg.Avatar.AvatarLoadDataFromRemotePPC"
            r5 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r5) goto L_0x002f
            java.lang.Object r8 = r0.f303354d
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00b0
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r9)
            rx3.g<java.util.HashMap<java.lang.String, java.lang.Integer>> r9 = f303343b
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0059
            int r9 = r9.intValue()
            r2 = 5
            if (r9 < r2) goto L_0x0059
            java.lang.String r8 = "get image data is null from cgi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            return r3
        L_0x0059:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "try to load avatar from cgi "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            te3.gb r9 = new te3.gb
            r9.<init>()
            java.util.LinkedList<te3.rv3> r2 = r9.f133947e
            te3.rv3 r6 = new te3.rv3
            r6.<init>()
            r6.f141175d = r8
            r6.f141176e = r5
            r2.add(r6)
            r9.f133946d = r5
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            r6 = 123(0x7b, float:1.72E-43)
            r2.f127069d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/batchgetheadimg"
            r2.f127068c = r6
            r2.f127066a = r9
            te3.hb r9 = new te3.hb
            r9.<init>()
            r2.f127067b = r9
            ob0.c r9 = r2.mo72403a()
            ob0.b r2 = new ob0.b
            r2.<init>()
            r2.mo123453j(r9)
            r0.f303354d = r8
            r0.f303357g = r5
            java.lang.Object r9 = q40.C89456b.m111832b(r2, r0)
            if (r9 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            ob0.b$c r9 = (ob0.C89132b.C89134c) r9
            int r0 = r9.f256793a
            r1 = 0
            if (r0 != 0) goto L_0x00bd
            int r0 = r9.f256794b
            if (r0 != 0) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r0 == 0) goto L_0x014c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "load small avatar head success "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            T r9 = r9.f256796d
            te3.hb r9 = (te3.C49682hb) r9
            if (r9 == 0) goto L_0x0104
            java.util.LinkedList<te3.zh2> r9 = r9.f134536e
            if (r9 == 0) goto L_0x0104
            java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
            te3.zh2 r9 = (te3.C52265zh2) r9
            if (r9 == 0) goto L_0x0104
            te3.rv3 r0 = r9.f145962e
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r0.f141175d
            goto L_0x00ef
        L_0x00ee:
            r0 = r3
        L_0x00ef:
            boolean r0 = gy3.C87412m.m108589b(r0, r8)
            if (r0 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r9 = r3
        L_0x00f7:
            if (r9 == 0) goto L_0x0104
            te3.qv3 r9 = r9.f145961d
            if (r9 == 0) goto L_0x0104
            pe3.b r9 = r9.f140574f
            if (r9 == 0) goto L_0x0104
            byte[] r9 = r9.f257327a
            r3 = r9
        L_0x0104:
            if (r3 != 0) goto L_0x0169
            rx3.g<java.util.HashMap<java.lang.String, java.lang.Integer>> r9 = f303343b
            r0 = r9
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r8)
            if (r2 != 0) goto L_0x011f
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r0.put(r8, r2)
        L_0x011f:
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.util.HashMap r9 = (java.util.HashMap) r9
            int r0 = r0 + r5
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r9.put(r8, r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "load small avatar head success but image data is null "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            goto L_0x0169
        L_0x014c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "load small avatar head error "
            r0.append(r1)
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
        L_0x0169:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xu0.C102732h.mo142519b(java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v37, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v38, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v39, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v40, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v41, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v43, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v46, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v47, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v48, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v49, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v50, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v40, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v51, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v52, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v53, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v54, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v37, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v55, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v57, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v58, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v60, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v61, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v62, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v63, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v67, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v68, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v73, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v74, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v48, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v75, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v49, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v76, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v50, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v77, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v43, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v78, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v79, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v80, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v81, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v82, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v56, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v57, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v58, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v59, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v60, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v61, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v62, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v63, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v64, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v65, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v66, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v67, resolved type: com.tencent.mm.network.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v100, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v101, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v102, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v103, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v118, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v119, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v120, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v121, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v8, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v11, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v14, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v17, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r9v39 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: type inference failed for: r9v43, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v50 */
    /* JADX WARNING: type inference failed for: r6v89 */
    /* JADX WARNING: type inference failed for: r9v54 */
    /* JADX WARNING: type inference failed for: r6v147 */
    /* JADX WARNING: type inference failed for: r9v83 */
    /* JADX WARNING: type inference failed for: r9v85 */
    /* JADX WARNING: type inference failed for: r9v87 */
    /* JADX WARNING: type inference failed for: r9v89 */
    /* JADX WARNING: type inference failed for: r6v148 */
    /* JADX WARNING: type inference failed for: r9v90 */
    /* JADX WARNING: type inference failed for: r9v92 */
    /* JADX WARNING: type inference failed for: r9v94 */
    /* JADX WARNING: type inference failed for: r9v96 */
    /* JADX WARNING: type inference failed for: r9v115 */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x059a, code lost:
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.idkeyStat(138, 9, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05aa, code lost:
        r7 = r0;
        r1 = r14;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05b8, code lost:
        r7 = r0;
        r1 = r14;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05c6, code lost:
        r7 = r0;
        r1 = r14;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d4, code lost:
        r7 = r0;
        r1 = r14;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05e2, code lost:
        r1 = r0;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0609, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x060a, code lost:
        r6 = null;
        r1 = r0;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x060e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x060f, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0618, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0619, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0622, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0623, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x062c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x062d, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06b3, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06b6, code lost:
        r17 = r13.mo112937k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06be, code lost:
        r17 = java.lang.Integer.valueOf(r13.mo112938l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06c7, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06cd, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06d0, code lost:
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0700, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0701, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0705, code lost:
        r9.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x070c, code lost:
        r7.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0745, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "exception:%s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1));
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "close conn failed : %s", r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x07a9, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x07ac, code lost:
        r17 = r13.mo112937k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07b4, code lost:
        r17 = java.lang.Integer.valueOf(r13.mo112938l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07bd, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07c3, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07c6, code lost:
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07f7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07fb, code lost:
        r9.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0802, code lost:
        r7.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x083b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "exception:%s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1));
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "close conn failed : %s", r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08a1, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x08a4, code lost:
        r17 = r13.mo112937k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x08ac, code lost:
        r17 = java.lang.Integer.valueOf(r13.mo112938l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x08b5, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x08bb, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x08be, code lost:
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x08ef, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08f3, code lost:
        r9.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08fa, code lost:
        r7.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0933, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "exception:%s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1));
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "close conn failed : %s", r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0999, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x099c, code lost:
        r17 = r13.mo112937k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x09a4, code lost:
        r17 = java.lang.Integer.valueOf(r13.mo112938l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x09ad, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x09b3, code lost:
        r17 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x09b6, code lost:
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:?, code lost:
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09e7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x09eb, code lost:
        r9.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x09f2, code lost:
        r7.close();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0a2a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "exception:%s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1));
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "close conn failed : %s", r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:?, code lost:
        r2 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a80, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0a81, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a85, code lost:
        r6.close();
        r2 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a8c, code lost:
        r13.close();
        r2 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0ac4, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "exception:%s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2));
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.Avatar.AvatarLoadDataFromRemotePPC", "close conn failed : %s", r2.getMessage());
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.idkeyStat(138, 9, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0167, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0168, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016b, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0170, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0171, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0184, code lost:
        r36 = "null";
        r7 = r13;
        r6 = null;
        r14 = null;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018e, code lost:
        r36 = "null";
        r7 = r13;
        r6 = null;
        r14 = null;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0198, code lost:
        r36 = "null";
        r7 = r13;
        r6 = null;
        r14 = null;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a2, code lost:
        r36 = "null";
        r7 = r13;
        r6 = null;
        r14 = null;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x036c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x036d, code lost:
        r1 = r0;
        r15 = r11;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0372, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0373, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0379, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x037a, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0380, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0381, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0387, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0388, code lost:
        r36 = "null";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05e1 A[ExcHandler: all (r0v26 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r9 
      PHI: (r9v34 java.lang.Object) = (r9v99 java.lang.Object), (r9v104 java.lang.Object), (r9v109 java.lang.Object), (r9v114 java.lang.Object), (r9v116 java.lang.Object), (r9v117 java.lang.Object), (r9v122 java.lang.Object), (r9v127 java.lang.Object), (r9v128 java.lang.Object) binds: [B:162:0x04e0, B:163:?, B:107:0x03a7, B:124:0x03cb, B:140:0x045a, B:144:0x0476, B:129:0x03e4, B:113:0x03b5, B:114:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:140:0x045a] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0609 A[ExcHandler: all (r0v21 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:32:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x06b3 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06b6 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06be A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x06c7 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06cd A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06d0 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x06fd A[SYNTHETIC, Splitter:B:296:0x06fd] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0705 A[Catch:{ Exception -> 0x0700 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x070c A[Catch:{ Exception -> 0x0700 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x07a9 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x07ac A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x07b4 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x07bd A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x07c3 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x07c6 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x07f3 A[SYNTHETIC, Splitter:B:324:0x07f3] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07fb A[Catch:{ Exception -> 0x07f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0802 A[Catch:{ Exception -> 0x07f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x08a1 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08a4 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x08ac A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x08b5 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x08bb A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08be A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x08eb A[SYNTHETIC, Splitter:B:352:0x08eb] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x08f3 A[Catch:{ Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x08fa A[Catch:{ Exception -> 0x08ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0999 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x099c A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x09a4 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x09ad A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x09b3 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x09b6 A[Catch:{ all -> 0x0a75 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x09e3 A[SYNTHETIC, Splitter:B:380:0x09e3] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x09eb A[Catch:{ Exception -> 0x09e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x09f2 A[Catch:{ Exception -> 0x09e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0a63  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0a69  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0a7d A[SYNTHETIC, Splitter:B:401:0x0a7d] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0a85 A[Catch:{ Exception -> 0x0a80 }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0a8c A[Catch:{ Exception -> 0x0a80 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x036c A[ExcHandler: all (r0v62 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:36:0x0158] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:337:0x0862=Splitter:B:337:0x0862, B:281:0x0676=Splitter:B:281:0x0676, B:365:0x095a=Splitter:B:365:0x095a, B:309:0x076c=Splitter:B:309:0x076c} */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo142520c(com.tencent.p014mm.modelavatar.C68097n r46, int r47) {
        /*
            r45 = this;
            java.lang.Class<z51.i> r1 = z51.C102975i.class
            java.lang.String r2 = "HTTP download exception: url:%s exception:%s %s"
            java.lang.String r3 = "close conn failed : %s"
            java.lang.String r4 = "exception:%s"
            java.lang.String r5 = "use normal time "
            java.lang.String r6 = "null"
            r7 = 1
            r8 = r47
            if (r8 != r7) goto L_0x0018
            java.lang.String r8 = r46.mo93594c()
            goto L_0x001c
        L_0x0018:
            java.lang.String r8 = r46.mo93597f()
        L_0x001c:
            di3.d r9 = di3.C86312j.m106911c(r1)
            z51.i r9 = (z51.C102975i) r9
            boolean r9 = r9.mo141697he()
            com.tencent.mm.modelcdntran.u r10 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.Object r11 = r10.f267122o
            monitor-enter(r11)
            int r10 = r10.f267123p     // Catch:{ all -> 0x0aea }
            monitor-exit(r11)     // Catch:{ all -> 0x0aea }
            r11 = 0
            if (r10 == 0) goto L_0x0035
            r10 = 1
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            java.lang.String r12 = "MicroMsg.Avatar.AvatarLoadDataFromRemotePPC"
            r13 = 138(0x8a, float:1.93E-43)
            r14 = 2
            r15 = 0
            if (r9 == 0) goto L_0x007d
            if (r10 != 0) goto L_0x007d
            java.lang.String r9 = "HttpGetAvatar: get hevc"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            java.lang.String r9 = "url"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = "?"
            boolean r9 = z04.C112550d0.m153803w(r8, r9, r11, r14, r15)
            if (r9 == 0) goto L_0x0065
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "&tp=wxpic"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            goto L_0x0076
        L_0x0065:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "?tp=wxpic"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L_0x0076:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 50
            r9.mo175911u(r13, r10)
        L_0x007d:
            f40.e r9 = f40.C86709a0.m107523b()
            boolean r9 = r9.mo121114l()
            java.lang.String r10 = ""
            r13 = 4
            if (r9 == 0) goto L_0x00ea
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = "https://"
            r9.append(r15)
            r15 = 2131831344(0x7f112a30, float:1.929571E38)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r15)
            r9.append(r15)
            java.lang.String r15 = "/?version=%d&uin=%s&nettype=%d&signal=%d"
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r15 = new java.lang.Object[r13]
            int r18 = qe3.C89625d.f257841g
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r15[r11] = r18
            f40.e r18 = f40.C86709a0.m107523b()
            int r18 = r18.mo121110g()
            java.lang.String r18 = p823sg.C77710q.m93738a(r18)
            r15[r7] = r18
            android.content.Context r18 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r18 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r18)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r15[r14] = r18
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r14 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            r13 = 0
            int r14 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getCompatMixStrength$default(r14, r11, r7, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r14 = 3
            r15[r14] = r13
            r13 = 4
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r13)
            java.lang.String r9 = java.lang.String.format(r9, r15)
            java.lang.String r13 = "format(format, *args)"
            gy3.C87412m.m108593f(r9, r13)
            goto L_0x00ec
        L_0x00ea:
            r14 = 3
            r9 = r10
        L_0x00ec:
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.String r14 = r46.mo93598g()
            r13[r11] = r14
            r13[r7] = r9
            r14 = 2
            r13[r14] = r8
            java.lang.String r14 = "dkreferer dkavatar user: %s referer: %s url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r13)
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
            r13.<init>()
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 138(0x8a, double:6.8E-322)
            r23 = 40
            r25 = 1
            r27 = 1
            r20 = r14
            r20.idkeyStat(r21, r23, r25, r27)
            r30 = 8
            r31 = 7
            r32 = 6
            r33 = 5
            r34 = 100001(0x186a1, float:1.40131E-40)
            r35 = 10003(0x2713, float:1.4017E-41)
            long r28 = java.lang.System.currentTimeMillis()     // Catch:{ ProtocolException -> 0x094d, SocketTimeoutException -> 0x0855, IOException -> 0x075f, Exception -> 0x0669, all -> 0x065f }
            r15 = 0
            com.tencent.mm.network.d0 r11 = com.tencent.p014mm.network.C81035d.m98964e(r8, r15)     // Catch:{ ProtocolException -> 0x0656, SocketTimeoutException -> 0x064d, IOException -> 0x0644, Exception -> 0x063c, all -> 0x0636 }
            r15 = 1224(0x4c8, float:1.715E-42)
            r11.mo112942p(r15)     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            r11.mo112944r(r7)     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 96
            r25 = 1
            r27 = 0
            r20 = r14
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            java.lang.String r15 = "GET"
            r11.mo112943q(r15)     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            java.lang.String r15 = "referer"
            r11.mo112921e(r15, r9)     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            r9 = 5000(0x1388, float:7.006E-42)
            r11.mo112919d(r9)     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            r11.mo112923g(r9)     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            int r9 = r11.mo112916a()     // Catch:{ ProtocolException -> 0x062c, SocketTimeoutException -> 0x0622, IOException -> 0x0618, Exception -> 0x060e, all -> 0x0609 }
            r15 = 200(0xc8, float:2.8E-43)
            if (r9 == r15) goto L_0x038e
            java.util.Map r1 = r11.mo112940n()     // Catch:{ ProtocolException -> 0x0387, SocketTimeoutException -> 0x0380, IOException -> 0x0379, Exception -> 0x0372, all -> 0x036c }
            if (r1 == 0) goto L_0x0173
            java.lang.String r15 = "X-ErrNo"
            java.lang.Object r1 = r1.get(r15)     // Catch:{ ProtocolException -> 0x0170, SocketTimeoutException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167, all -> 0x036c }
            java.util.List r1 = (java.util.List) r1     // Catch:{ ProtocolException -> 0x0170, SocketTimeoutException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167, all -> 0x036c }
            goto L_0x0174
        L_0x0167:
            r0 = move-exception
            r1 = r0
            goto L_0x0184
        L_0x016a:
            r0 = move-exception
            r1 = r0
            goto L_0x018e
        L_0x016d:
            r0 = move-exception
            r1 = r0
            goto L_0x0198
        L_0x0170:
            r0 = move-exception
            r1 = r0
            goto L_0x01a2
        L_0x0173:
            r1 = 0
        L_0x0174:
            if (r1 == 0) goto L_0x01ac
            int r15 = r1.size()     // Catch:{ ProtocolException -> 0x0170, SocketTimeoutException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167, all -> 0x036c }
            if (r15 <= 0) goto L_0x01ac
            r15 = 0
            java.lang.Object r1 = r1.get(r15)     // Catch:{ ProtocolException -> 0x0170, SocketTimeoutException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167, all -> 0x036c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ProtocolException -> 0x0170, SocketTimeoutException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167, all -> 0x036c }
            goto L_0x01ad
        L_0x0184:
            r36 = r6
            r7 = r13
            r6 = 0
            r14 = 0
            r17 = 0
        L_0x018b:
            r13 = r11
            goto L_0x05b3
        L_0x018e:
            r36 = r6
            r7 = r13
            r6 = 0
            r14 = 0
            r17 = 0
        L_0x0195:
            r13 = r11
            goto L_0x05c1
        L_0x0198:
            r36 = r6
            r7 = r13
            r6 = 0
            r14 = 0
            r17 = 0
        L_0x019f:
            r13 = r11
            goto L_0x05cf
        L_0x01a2:
            r36 = r6
            r7 = r13
            r6 = 0
            r14 = 0
            r17 = 0
        L_0x01a9:
            r13 = r11
            goto L_0x05dd
        L_0x01ac:
            r1 = r10
        L_0x01ad:
            java.lang.String r15 = "checkHttpConnection failed! url:%s code:%d xErr:%s"
            r36 = r6
            r7 = 3
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7 = 0
            r6[r7] = r8     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r20 = 1
            r6[r20] = r7     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7 = 2
            r6[r7] = r1     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r15, r6)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 404(0x194, float:5.66E-43)
            if (r9 == r6) goto L_0x030b
            r21 = 138(0x8a, double:6.8E-322)
            switch(r9) {
                case 502: goto L_0x0279;
                case 503: goto L_0x022a;
                case 504: goto L_0x01db;
                default: goto L_0x01ce;
            }     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
        L_0x01ce:
            r23 = 6
            r25 = 1
            r27 = 1
            r20 = r14
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            goto L_0x02c8
        L_0x01db:
            r23 = 5
            r25 = 1
            r27 = 1
            r20 = r14
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 10
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r34)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r15 = 0
            r7[r15] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 1
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 2
            r7[r6] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 3
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r46.mo93598g()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 4
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r11.mo112937k()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r33] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            int r6 = r11.mo112938l()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r32] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r31] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r30] = r8     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 9
            r7[r6] = r1     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r1 = 14058(0x36ea, float:1.97E-41)
            r14.mo160131h(r1, r7)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            goto L_0x035a
        L_0x022a:
            r23 = 4
            r25 = 1
            r27 = 1
            r20 = r14
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 10
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r34)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r15 = 0
            r7[r15] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 1
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 2
            r7[r6] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 3
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r46.mo93598g()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 4
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r11.mo112937k()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r33] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            int r6 = r11.mo112938l()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r32] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r31] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r30] = r8     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 9
            r7[r6] = r1     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r1 = 14058(0x36ea, float:1.97E-41)
            r14.mo160131h(r1, r7)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            goto L_0x035a
        L_0x0279:
            r23 = 3
            r25 = 1
            r27 = 1
            r20 = r14
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 10
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r34)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r15 = 0
            r7[r15] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 1
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 2
            r7[r6] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 3
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r46.mo93598g()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 4
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r11.mo112937k()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r33] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            int r6 = r11.mo112938l()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r32] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r31] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r30] = r8     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 9
            r7[r6] = r1     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r1 = 14058(0x36ea, float:1.97E-41)
            r14.mo160131h(r1, r7)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            goto L_0x035a
        L_0x02c8:
            r6 = 10
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r34)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r15 = 0
            r7[r15] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 1
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 2
            r7[r6] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 3
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r46.mo93598g()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 4
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r11.mo112937k()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r33] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            int r6 = r11.mo112938l()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r32] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r31] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r30] = r8     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 9
            r7[r6] = r1     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r1 = 14058(0x36ea, float:1.97E-41)
            r14.mo160131h(r1, r7)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            goto L_0x035a
        L_0x030b:
            r21 = 138(0x8a, double:6.8E-322)
            r23 = 2
            r25 = 1
            r27 = 1
            r20 = r14
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 10
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r34)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r15 = 0
            r7[r15] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 1
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 2
            r7[r6] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 3
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r46.mo93598g()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r9 = 4
            r7[r9] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.String r6 = r11.mo112937k()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r33] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            int r6 = r11.mo112938l()     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r32] = r6     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r31] = r10     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r7[r30] = r8     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r6 = 9
            r7[r6] = r1     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            r1 = 14058(0x36ea, float:1.97E-41)
            r14.mo160131h(r1, r7)     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ ProtocolException -> 0x0369, SocketTimeoutException -> 0x0366, IOException -> 0x0363, Exception -> 0x0360, all -> 0x036c }
        L_0x035a:
            r6 = 0
            r7 = -1
            r9 = 0
            r14 = 0
            goto L_0x04e0
        L_0x0360:
            r0 = move-exception
        L_0x0361:
            r1 = r0
            goto L_0x0376
        L_0x0363:
            r0 = move-exception
        L_0x0364:
            r1 = r0
            goto L_0x037d
        L_0x0366:
            r0 = move-exception
        L_0x0367:
            r1 = r0
            goto L_0x0384
        L_0x0369:
            r0 = move-exception
        L_0x036a:
            r1 = r0
            goto L_0x038b
        L_0x036c:
            r0 = move-exception
            r1 = r0
            r15 = r11
            r6 = 0
            goto L_0x0a7b
        L_0x0372:
            r0 = move-exception
            r36 = r6
            goto L_0x0361
        L_0x0376:
            r9 = 0
            goto L_0x0446
        L_0x0379:
            r0 = move-exception
            r36 = r6
            goto L_0x0364
        L_0x037d:
            r9 = 0
            goto L_0x044b
        L_0x0380:
            r0 = move-exception
            r36 = r6
            goto L_0x0367
        L_0x0384:
            r9 = 0
            goto L_0x0450
        L_0x0387:
            r0 = move-exception
            r36 = r6
            goto L_0x036a
        L_0x038b:
            r9 = 0
            goto L_0x0455
        L_0x038e:
            r36 = r6
            java.lang.String r6 = "X-Enc"
            r7 = 0
            int r6 = r11.mo112939m(r6, r7)     // Catch:{ ProtocolException -> 0x0605, SocketTimeoutException -> 0x0601, IOException -> 0x05fd, Exception -> 0x05f9, all -> 0x0609 }
            r7 = 1
            if (r6 != r7) goto L_0x039c
            r6 = 1
            goto L_0x039d
        L_0x039c:
            r6 = 0
        L_0x039d:
            int r7 = r11.mo112936j()     // Catch:{ ProtocolException -> 0x0605, SocketTimeoutException -> 0x0601, IOException -> 0x05fd, Exception -> 0x05f9, all -> 0x0609 }
            java.io.InputStream r9 = r11.getInputStream()     // Catch:{ ProtocolException -> 0x0605, SocketTimeoutException -> 0x0601, IOException -> 0x05fd, Exception -> 0x05f9, all -> 0x0609 }
            r14 = 1024(0x400, float:1.435E-42)
            byte[] r14 = new byte[r14]     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
        L_0x03a9:
            int r15 = r9.read(r14)     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            rx3.b0 r20 = rx3.C13598b0.f38549a     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            r20 = r7
            r7 = -1
            if (r15 == r7) goto L_0x03cb
            r7 = 0
            r13.write(r14, r7, r15)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            r7 = r20
            goto L_0x03a9
        L_0x03bb:
            r0 = move-exception
            r1 = r0
            goto L_0x0446
        L_0x03bf:
            r0 = move-exception
            r1 = r0
            goto L_0x044b
        L_0x03c3:
            r0 = move-exception
            r1 = r0
            goto L_0x0450
        L_0x03c7:
            r0 = move-exception
            r1 = r0
            goto L_0x0455
        L_0x03cb:
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            r38 = 138(0x8a, double:6.8E-322)
            r40 = 41
            r42 = 1
            r44 = 1
            r37 = r7
            r37.idkeyStat(r38, r40, r42, r44)     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            byte[] r14 = r13.toByteArray()     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            if (r14 == 0) goto L_0x04dc
            if (r6 == 0) goto L_0x045a
            java.lang.String r6 = "DecryptAvatar: decrypt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            r6 = 51
            r15 = 138(0x8a, float:1.93E-43)
            r7.mo175911u(r15, r6)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            byte[] r6 = com.tencent.p014mm.jni.utils.UtilsJni.DecryptAvatar(r14)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            java.lang.String r14 = "DecryptAvatar(outBuf)"
            gy3.C87412m.m108593f(r6, r14)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            if (r14 == 0) goto L_0x0444
            r1 = 52
            r6 = 138(0x8a, float:1.93E-43)
            r7.mo175911u(r6, r1)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            java.lang.String r1 = "DecryptAvatar: decrypt output empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)     // Catch:{ ProtocolException -> 0x03c7, SocketTimeoutException -> 0x03c3, IOException -> 0x03bf, Exception -> 0x03bb, all -> 0x05e1 }
            r9.close()
            r13.close()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r28
            r3 = 1224(0x4c8, double:6.047E-321)
            r40 = 98
            r6 = 0
            r38 = 1224(0x4c8, double:6.047E-321)
            r44 = 0
            r37 = r7
            r42 = r1
            r37.idkeyStat(r38, r40, r42, r44)
            r40 = 100
            r42 = 1
            r38 = r3
            r44 = r6
            r37.idkeyStat(r38, r40, r42, r44)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            r1 = 0
            return r1
        L_0x0444:
            r14 = r6
            goto L_0x045a
        L_0x0446:
            r7 = r13
            r6 = 0
            r14 = 0
            goto L_0x0615
        L_0x044b:
            r7 = r13
            r6 = 0
            r14 = 0
            goto L_0x061f
        L_0x0450:
            r7 = r13
            r6 = 0
            r14 = 0
            goto L_0x0629
        L_0x0455:
            r7 = r13
            r6 = 0
            r14 = 0
            goto L_0x0633
        L_0x045a:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((byte[]) r14)     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            if (r6 == 0) goto L_0x04da
            java.lang.String r6 = "DecryptAvatar: hevc to pic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            r6 = 53
            r15 = 138(0x8a, float:1.93E-43)
            r7.mo175911u(r15, r6)     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            z51.i r1 = (z51.C102975i) r1     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            byte[] r1 = r1.mo141695Gj(r14)     // Catch:{ ProtocolException -> 0x05f4, SocketTimeoutException -> 0x05ef, IOException -> 0x05ea, Exception -> 0x05e5, all -> 0x05e1 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r1)     // Catch:{ ProtocolException -> 0x04d5, SocketTimeoutException -> 0x04d0, IOException -> 0x04cb, Exception -> 0x04c6, all -> 0x05e1 }
            if (r6 == 0) goto L_0x04c3
            r6 = 54
            r14 = 138(0x8a, float:1.93E-43)
            r7.mo175911u(r14, r6)     // Catch:{ ProtocolException -> 0x04d5, SocketTimeoutException -> 0x04d0, IOException -> 0x04cb, Exception -> 0x04c6, all -> 0x05e1 }
            java.lang.String r6 = "DecryptAvatar: output is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)     // Catch:{ ProtocolException -> 0x04d5, SocketTimeoutException -> 0x04d0, IOException -> 0x04cb, Exception -> 0x04c6, all -> 0x05e1 }
            r9.close()
            r13.close()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r28
            r3 = 1224(0x4c8, double:6.047E-321)
            r40 = 98
            r6 = 0
            r38 = 1224(0x4c8, double:6.047E-321)
            r44 = 0
            r37 = r7
            r42 = r1
            r37.idkeyStat(r38, r40, r42, r44)
            r40 = 100
            r42 = 1
            r38 = r3
            r44 = r6
            r37.idkeyStat(r38, r40, r42, r44)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            r6 = 0
            return r6
        L_0x04c3:
            r6 = 0
            r14 = r1
            goto L_0x04de
        L_0x04c6:
            r0 = move-exception
            r6 = 0
            r7 = r0
            goto L_0x05ac
        L_0x04cb:
            r0 = move-exception
            r6 = 0
            r7 = r0
            goto L_0x05ba
        L_0x04d0:
            r0 = move-exception
            r6 = 0
            r7 = r0
            goto L_0x05c8
        L_0x04d5:
            r0 = move-exception
            r6 = 0
            r7 = r0
            goto L_0x05d6
        L_0x04da:
            r6 = 0
            goto L_0x04de
        L_0x04dc:
            r6 = 0
            r14 = r6
        L_0x04de:
            r7 = r20
        L_0x04e0:
            r13.close()     // Catch:{ ProtocolException -> 0x05d3, SocketTimeoutException -> 0x05c5, IOException -> 0x05b7, Exception -> 0x05a9, all -> 0x05e1 }
            if (r9 == 0) goto L_0x04ff
            r9.close()     // Catch:{ ProtocolException -> 0x04fa, SocketTimeoutException -> 0x04f5, IOException -> 0x04f1, Exception -> 0x04ed, all -> 0x04e9 }
            goto L_0x04ff
        L_0x04e9:
            r0 = move-exception
            r1 = r0
            r13 = r9
            goto L_0x052b
        L_0x04ed:
            r0 = move-exception
            r1 = r0
            r13 = r9
            goto L_0x0531
        L_0x04f1:
            r0 = move-exception
            r1 = r0
            r13 = r9
            goto L_0x0538
        L_0x04f5:
            r0 = move-exception
            r1 = r0
            r13 = r9
            goto L_0x053f
        L_0x04fa:
            r0 = move-exception
            r1 = r0
            r13 = r9
            goto L_0x0546
        L_0x04ff:
            if (r7 <= 0) goto L_0x054c
            if (r14 == 0) goto L_0x0514
            int r1 = r14.length     // Catch:{ ProtocolException -> 0x0511, SocketTimeoutException -> 0x050e, IOException -> 0x050b, Exception -> 0x0508, all -> 0x0505 }
            goto L_0x0515
        L_0x0505:
            r0 = move-exception
            r1 = r0
            goto L_0x052a
        L_0x0508:
            r0 = move-exception
            r1 = r0
            goto L_0x0530
        L_0x050b:
            r0 = move-exception
            r1 = r0
            goto L_0x0537
        L_0x050e:
            r0 = move-exception
            r1 = r0
            goto L_0x053e
        L_0x0511:
            r0 = move-exception
            r1 = r0
            goto L_0x0545
        L_0x0514:
            r1 = 0
        L_0x0515:
            if (r1 >= r7) goto L_0x054c
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ ProtocolException -> 0x0511, SocketTimeoutException -> 0x050e, IOException -> 0x050b, Exception -> 0x0508, all -> 0x0505 }
            r21 = 138(0x8a, double:6.8E-322)
            r23 = 15
            r25 = 1
            r27 = 1
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ ProtocolException -> 0x0511, SocketTimeoutException -> 0x050e, IOException -> 0x050b, Exception -> 0x0508, all -> 0x0505 }
            java.lang.String r1 = "HTTP downloaded length is smaller than Content-Length field. Drop."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)     // Catch:{ ProtocolException -> 0x0511, SocketTimeoutException -> 0x050e, IOException -> 0x050b, Exception -> 0x0508, all -> 0x0505 }
            goto L_0x054c
        L_0x052a:
            r13 = r6
        L_0x052b:
            r15 = r6
            r6 = r13
            r13 = r15
            goto L_0x0a7b
        L_0x0530:
            r13 = r6
        L_0x0531:
            r7 = r6
            r17 = r13
            r13 = r7
            goto L_0x05b3
        L_0x0537:
            r13 = r6
        L_0x0538:
            r7 = r6
            r17 = r13
            r13 = r7
            goto L_0x05c1
        L_0x053e:
            r13 = r6
        L_0x053f:
            r7 = r6
            r17 = r13
            r13 = r7
            goto L_0x05cf
        L_0x0545:
            r13 = r6
        L_0x0546:
            r7 = r6
            r17 = r13
            r13 = r7
            goto L_0x05dd
        L_0x054c:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0580 }
            long r1 = r1 - r28
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0580 }
            r16 = 1224(0x4c8, double:6.047E-321)
            r18 = 98
            r22 = 0
            r15 = r7
            r20 = r1
            r15.idkeyStat(r16, r18, r20, r22)     // Catch:{ Exception -> 0x0580 }
            r16 = 1224(0x4c8, double:6.047E-321)
            r18 = 100
            r20 = 1
            r22 = 0
            r15 = r7
            r15.idkeyStat(r16, r18, r20, r22)     // Catch:{ Exception -> 0x0580 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0580 }
            r7.<init>()     // Catch:{ Exception -> 0x0580 }
            r7.append(r5)     // Catch:{ Exception -> 0x0580 }
            r7.append(r1)     // Catch:{ Exception -> 0x0580 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0580 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)     // Catch:{ Exception -> 0x0580 }
            goto L_0x0a44
        L_0x0580:
            r0 = move-exception
            r1 = r0
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r9 = 0
            r5[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r4, r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getMessage()
            r2[r9] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r3, r2)
        L_0x059a:
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 138(0x8a, double:6.8E-322)
            r18 = 9
            r20 = 1
            r22 = 1
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x0a44
        L_0x05a9:
            r0 = move-exception
            r7 = r0
            r1 = r14
        L_0x05ac:
            r14 = r1
            r1 = r7
            r17 = r9
            r7 = r13
            goto L_0x018b
        L_0x05b3:
            r9 = r17
            goto L_0x0676
        L_0x05b7:
            r0 = move-exception
            r7 = r0
            r1 = r14
        L_0x05ba:
            r14 = r1
            r1 = r7
            r17 = r9
            r7 = r13
            goto L_0x0195
        L_0x05c1:
            r9 = r17
            goto L_0x076c
        L_0x05c5:
            r0 = move-exception
            r7 = r0
            r1 = r14
        L_0x05c8:
            r14 = r1
            r1 = r7
            r17 = r9
            r7 = r13
            goto L_0x019f
        L_0x05cf:
            r9 = r17
            goto L_0x0862
        L_0x05d3:
            r0 = move-exception
            r7 = r0
            r1 = r14
        L_0x05d6:
            r14 = r1
            r1 = r7
            r17 = r9
            r7 = r13
            goto L_0x01a9
        L_0x05dd:
            r9 = r17
            goto L_0x095a
        L_0x05e1:
            r0 = move-exception
            r1 = r0
            goto L_0x0a79
        L_0x05e5:
            r0 = move-exception
            r6 = 0
            r1 = r0
            r14 = r6
            goto L_0x0614
        L_0x05ea:
            r0 = move-exception
            r6 = 0
            r1 = r0
            r14 = r6
            goto L_0x061e
        L_0x05ef:
            r0 = move-exception
            r6 = 0
            r1 = r0
            r14 = r6
            goto L_0x0628
        L_0x05f4:
            r0 = move-exception
            r6 = 0
            r1 = r0
            r14 = r6
            goto L_0x0632
        L_0x05f9:
            r0 = move-exception
        L_0x05fa:
            r6 = 0
            r1 = r0
            goto L_0x0612
        L_0x05fd:
            r0 = move-exception
        L_0x05fe:
            r6 = 0
            r1 = r0
            goto L_0x061c
        L_0x0601:
            r0 = move-exception
        L_0x0602:
            r6 = 0
            r1 = r0
            goto L_0x0626
        L_0x0605:
            r0 = move-exception
        L_0x0606:
            r6 = 0
            r1 = r0
            goto L_0x0630
        L_0x0609:
            r0 = move-exception
            r6 = 0
            r1 = r0
            goto L_0x0a7a
        L_0x060e:
            r0 = move-exception
            r36 = r6
            goto L_0x05fa
        L_0x0612:
            r9 = r6
            r14 = r9
        L_0x0614:
            r7 = r13
        L_0x0615:
            r13 = r11
            goto L_0x0676
        L_0x0618:
            r0 = move-exception
            r36 = r6
            goto L_0x05fe
        L_0x061c:
            r9 = r6
            r14 = r9
        L_0x061e:
            r7 = r13
        L_0x061f:
            r13 = r11
            goto L_0x076c
        L_0x0622:
            r0 = move-exception
            r36 = r6
            goto L_0x0602
        L_0x0626:
            r9 = r6
            r14 = r9
        L_0x0628:
            r7 = r13
        L_0x0629:
            r13 = r11
            goto L_0x0862
        L_0x062c:
            r0 = move-exception
            r36 = r6
            goto L_0x0606
        L_0x0630:
            r9 = r6
            r14 = r9
        L_0x0632:
            r7 = r13
        L_0x0633:
            r13 = r11
            goto L_0x095a
        L_0x0636:
            r0 = move-exception
            r6 = r15
            r1 = r0
            r14 = r28
            goto L_0x0664
        L_0x063c:
            r0 = move-exception
            r36 = r6
            r6 = r15
            r1 = r0
            r14 = r28
            goto L_0x0670
        L_0x0644:
            r0 = move-exception
            r36 = r6
            r6 = r15
            r1 = r0
            r14 = r28
            goto L_0x0766
        L_0x064d:
            r0 = move-exception
            r36 = r6
            r6 = r15
            r1 = r0
            r14 = r28
            goto L_0x085c
        L_0x0656:
            r0 = move-exception
            r36 = r6
            r6 = r15
            r1 = r0
            r14 = r28
            goto L_0x0954
        L_0x065f:
            r0 = move-exception
            r6 = 0
            r1 = r0
            r14 = 0
        L_0x0664:
            r28 = r14
            r15 = r6
            goto L_0x0a7b
        L_0x0669:
            r0 = move-exception
            r36 = r6
            r6 = 0
            r1 = r0
            r14 = 0
        L_0x0670:
            r9 = r6
            r7 = r13
            r28 = r14
            r13 = r9
            r14 = r13
        L_0x0676:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0a75 }
            r21 = 138(0x8a, double:6.8E-322)
            r23 = 0
            r25 = 1
            r27 = 1
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ all -> 0x0a75 }
            r15 = 10
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0a75 }
            r20 = 0
            r15[r20] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r35)     // Catch:{ all -> 0x0a75 }
            r21 = 1
            r15[r21] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r18 = 2
            r15[r18] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0a75 }
            r16 = 3
            r15[r16] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r46.mo93598g()     // Catch:{ all -> 0x0a75 }
            r19 = 4
            r15[r19] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x06b6
            r17 = r36
            goto L_0x06ba
        L_0x06b6:
            java.lang.String r17 = r13.mo112937k()     // Catch:{ all -> 0x0a75 }
        L_0x06ba:
            r15[r33] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x06c7
            int r17 = r13.mo112938l()     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0a75 }
            goto L_0x06c9
        L_0x06c7:
            r17 = r36
        L_0x06c9:
            r15[r32] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x06d0
            r17 = r36
            goto L_0x06d2
        L_0x06d0:
            java.lang.String r17 = ""
        L_0x06d2:
            r15[r31] = r17     // Catch:{ all -> 0x0a75 }
            r15[r30] = r8     // Catch:{ all -> 0x0a75 }
            r17 = 9
            r15[r17] = r10     // Catch:{ all -> 0x0a75 }
            r10 = 14058(0x36ea, float:1.97E-41)
            r11.mo160131h(r10, r15)     // Catch:{ all -> 0x0a75 }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0a75 }
            r15 = 0
            r10[r15] = r8     // Catch:{ all -> 0x0a75 }
            java.lang.Class r15 = r1.getClass()     // Catch:{ all -> 0x0a75 }
            java.lang.String r15 = r15.getSimpleName()     // Catch:{ all -> 0x0a75 }
            r16 = 1
            r10[r16] = r15     // Catch:{ all -> 0x0a75 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r15 = 2
            r10[r15] = r1     // Catch:{ all -> 0x0a75 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r10)     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x0703
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0700 }
            goto L_0x0703
        L_0x0700:
            r0 = move-exception
            r1 = r0
            goto L_0x0745
        L_0x0703:
            if (r9 == 0) goto L_0x070a
            r9.close()     // Catch:{ Exception -> 0x0700 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0700 }
        L_0x070a:
            if (r7 == 0) goto L_0x0711
            r7.close()     // Catch:{ Exception -> 0x0700 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0700 }
        L_0x0711:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0700 }
            long r1 = r1 - r28
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 98
            r27 = 0
            r20 = r11
            r25 = r1
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x0700 }
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 100
            r25 = 1
            r27 = 0
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x0700 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0700 }
            r7.<init>()     // Catch:{ Exception -> 0x0700 }
            r7.append(r5)     // Catch:{ Exception -> 0x0700 }
            r7.append(r1)     // Catch:{ Exception -> 0x0700 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0700 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)     // Catch:{ Exception -> 0x0700 }
            goto L_0x0a44
        L_0x0745:
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r9 = 0
            r5[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r4, r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getMessage()
            r2[r9] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r3, r2)
            goto L_0x059a
        L_0x075f:
            r0 = move-exception
            r36 = r6
            r6 = 0
            r1 = r0
            r14 = 0
        L_0x0766:
            r9 = r6
            r7 = r13
            r28 = r14
            r13 = r9
            r14 = r13
        L_0x076c:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0a75 }
            r21 = 138(0x8a, double:6.8E-322)
            r23 = 7
            r25 = 1
            r27 = 1
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ all -> 0x0a75 }
            r15 = 10
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0a75 }
            r20 = 0
            r15[r20] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r35)     // Catch:{ all -> 0x0a75 }
            r21 = 1
            r15[r21] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r18 = 2
            r15[r18] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0a75 }
            r16 = 3
            r15[r16] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r46.mo93598g()     // Catch:{ all -> 0x0a75 }
            r19 = 4
            r15[r19] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x07ac
            r17 = r36
            goto L_0x07b0
        L_0x07ac:
            java.lang.String r17 = r13.mo112937k()     // Catch:{ all -> 0x0a75 }
        L_0x07b0:
            r15[r33] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x07bd
            int r17 = r13.mo112938l()     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0a75 }
            goto L_0x07bf
        L_0x07bd:
            r17 = r36
        L_0x07bf:
            r15[r32] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x07c6
            r17 = r36
            goto L_0x07c8
        L_0x07c6:
            java.lang.String r17 = ""
        L_0x07c8:
            r15[r31] = r17     // Catch:{ all -> 0x0a75 }
            r15[r30] = r8     // Catch:{ all -> 0x0a75 }
            r17 = 9
            r15[r17] = r10     // Catch:{ all -> 0x0a75 }
            r10 = 14058(0x36ea, float:1.97E-41)
            r11.mo160131h(r10, r15)     // Catch:{ all -> 0x0a75 }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0a75 }
            r15 = 0
            r10[r15] = r8     // Catch:{ all -> 0x0a75 }
            java.lang.Class r15 = r1.getClass()     // Catch:{ all -> 0x0a75 }
            java.lang.String r15 = r15.getSimpleName()     // Catch:{ all -> 0x0a75 }
            r16 = 1
            r10[r16] = r15     // Catch:{ all -> 0x0a75 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r15 = 2
            r10[r15] = r1     // Catch:{ all -> 0x0a75 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r10)     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x07f9
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x07f6 }
            goto L_0x07f9
        L_0x07f6:
            r0 = move-exception
            r1 = r0
            goto L_0x083b
        L_0x07f9:
            if (r9 == 0) goto L_0x0800
            r9.close()     // Catch:{ Exception -> 0x07f6 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x07f6 }
        L_0x0800:
            if (r7 == 0) goto L_0x0807
            r7.close()     // Catch:{ Exception -> 0x07f6 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x07f6 }
        L_0x0807:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x07f6 }
            long r1 = r1 - r28
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 98
            r27 = 0
            r20 = r11
            r25 = r1
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x07f6 }
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 100
            r25 = 1
            r27 = 0
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x07f6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x07f6 }
            r7.<init>()     // Catch:{ Exception -> 0x07f6 }
            r7.append(r5)     // Catch:{ Exception -> 0x07f6 }
            r7.append(r1)     // Catch:{ Exception -> 0x07f6 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x07f6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)     // Catch:{ Exception -> 0x07f6 }
            goto L_0x0a44
        L_0x083b:
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r9 = 0
            r5[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r4, r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getMessage()
            r2[r9] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r3, r2)
            goto L_0x059a
        L_0x0855:
            r0 = move-exception
            r36 = r6
            r6 = 0
            r1 = r0
            r14 = 0
        L_0x085c:
            r9 = r6
            r7 = r13
            r28 = r14
            r13 = r9
            r14 = r13
        L_0x0862:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0a75 }
            r21 = 138(0x8a, double:6.8E-322)
            r23 = 8
            r25 = 1
            r27 = 1
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ all -> 0x0a75 }
            r15 = 10
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0a75 }
            r20 = 0
            r15[r20] = r17     // Catch:{ all -> 0x0a75 }
            r17 = 10002(0x2712, float:1.4016E-41)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0a75 }
            r21 = 1
            r15[r21] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r18 = 2
            r15[r18] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0a75 }
            r16 = 3
            r15[r16] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r46.mo93598g()     // Catch:{ all -> 0x0a75 }
            r19 = 4
            r15[r19] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x08a4
            r17 = r36
            goto L_0x08a8
        L_0x08a4:
            java.lang.String r17 = r13.mo112937k()     // Catch:{ all -> 0x0a75 }
        L_0x08a8:
            r15[r33] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x08b5
            int r17 = r13.mo112938l()     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0a75 }
            goto L_0x08b7
        L_0x08b5:
            r17 = r36
        L_0x08b7:
            r15[r32] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x08be
            r17 = r36
            goto L_0x08c0
        L_0x08be:
            java.lang.String r17 = ""
        L_0x08c0:
            r15[r31] = r17     // Catch:{ all -> 0x0a75 }
            r15[r30] = r8     // Catch:{ all -> 0x0a75 }
            r17 = 9
            r15[r17] = r10     // Catch:{ all -> 0x0a75 }
            r10 = 14058(0x36ea, float:1.97E-41)
            r11.mo160131h(r10, r15)     // Catch:{ all -> 0x0a75 }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0a75 }
            r15 = 0
            r10[r15] = r8     // Catch:{ all -> 0x0a75 }
            java.lang.Class r15 = r1.getClass()     // Catch:{ all -> 0x0a75 }
            java.lang.String r15 = r15.getSimpleName()     // Catch:{ all -> 0x0a75 }
            r16 = 1
            r10[r16] = r15     // Catch:{ all -> 0x0a75 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r15 = 2
            r10[r15] = r1     // Catch:{ all -> 0x0a75 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r10)     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x08f1
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x08ee }
            goto L_0x08f1
        L_0x08ee:
            r0 = move-exception
            r1 = r0
            goto L_0x0933
        L_0x08f1:
            if (r9 == 0) goto L_0x08f8
            r9.close()     // Catch:{ Exception -> 0x08ee }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x08ee }
        L_0x08f8:
            if (r7 == 0) goto L_0x08ff
            r7.close()     // Catch:{ Exception -> 0x08ee }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x08ee }
        L_0x08ff:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x08ee }
            long r1 = r1 - r28
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 98
            r27 = 0
            r20 = r11
            r25 = r1
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x08ee }
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 100
            r25 = 1
            r27 = 0
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x08ee }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08ee }
            r7.<init>()     // Catch:{ Exception -> 0x08ee }
            r7.append(r5)     // Catch:{ Exception -> 0x08ee }
            r7.append(r1)     // Catch:{ Exception -> 0x08ee }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x08ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)     // Catch:{ Exception -> 0x08ee }
            goto L_0x0a44
        L_0x0933:
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r9 = 0
            r5[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r4, r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getMessage()
            r2[r9] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r3, r2)
            goto L_0x059a
        L_0x094d:
            r0 = move-exception
            r36 = r6
            r6 = 0
            r1 = r0
            r14 = 0
        L_0x0954:
            r9 = r6
            r7 = r13
            r28 = r14
            r13 = r9
            r14 = r13
        L_0x095a:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0a75 }
            r21 = 138(0x8a, double:6.8E-322)
            r23 = 1
            r25 = 1
            r27 = 1
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ all -> 0x0a75 }
            r15 = 10
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r34)     // Catch:{ all -> 0x0a75 }
            r20 = 0
            r15[r20] = r17     // Catch:{ all -> 0x0a75 }
            r17 = 10001(0x2711, float:1.4014E-41)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0a75 }
            r21 = 1
            r15[r21] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r18 = 2
            r15[r18] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0a75 }
            r16 = 3
            r15[r16] = r17     // Catch:{ all -> 0x0a75 }
            java.lang.String r17 = r46.mo93598g()     // Catch:{ all -> 0x0a75 }
            r19 = 4
            r15[r19] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x099c
            r17 = r36
            goto L_0x09a0
        L_0x099c:
            java.lang.String r17 = r13.mo112937k()     // Catch:{ all -> 0x0a75 }
        L_0x09a0:
            r15[r33] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x09ad
            int r17 = r13.mo112938l()     // Catch:{ all -> 0x0a75 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0a75 }
            goto L_0x09af
        L_0x09ad:
            r17 = r36
        L_0x09af:
            r15[r32] = r17     // Catch:{ all -> 0x0a75 }
            if (r13 != 0) goto L_0x09b6
            r17 = r36
            goto L_0x09b8
        L_0x09b6:
            java.lang.String r17 = ""
        L_0x09b8:
            r15[r31] = r17     // Catch:{ all -> 0x0a75 }
            r15[r30] = r8     // Catch:{ all -> 0x0a75 }
            r17 = 9
            r15[r17] = r10     // Catch:{ all -> 0x0a75 }
            r10 = 14058(0x36ea, float:1.97E-41)
            r11.mo160131h(r10, r15)     // Catch:{ all -> 0x0a75 }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0a75 }
            r15 = 0
            r10[r15] = r8     // Catch:{ all -> 0x0a75 }
            java.lang.Class r15 = r1.getClass()     // Catch:{ all -> 0x0a75 }
            java.lang.String r15 = r15.getSimpleName()     // Catch:{ all -> 0x0a75 }
            r16 = 1
            r10[r16] = r15     // Catch:{ all -> 0x0a75 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0a75 }
            r15 = 2
            r10[r15] = r1     // Catch:{ all -> 0x0a75 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r10)     // Catch:{ all -> 0x0a75 }
            if (r13 == 0) goto L_0x09e9
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x09e6 }
            goto L_0x09e9
        L_0x09e6:
            r0 = move-exception
            r1 = r0
            goto L_0x0a2a
        L_0x09e9:
            if (r9 == 0) goto L_0x09f0
            r9.close()     // Catch:{ Exception -> 0x09e6 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x09e6 }
        L_0x09f0:
            if (r7 == 0) goto L_0x09f7
            r7.close()     // Catch:{ Exception -> 0x09e6 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x09e6 }
        L_0x09f7:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x09e6 }
            long r1 = r1 - r28
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 98
            r27 = 0
            r20 = r11
            r25 = r1
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x09e6 }
            r21 = 1224(0x4c8, double:6.047E-321)
            r23 = 100
            r25 = 1
            r27 = 0
            r20 = r11
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x09e6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09e6 }
            r7.<init>()     // Catch:{ Exception -> 0x09e6 }
            r7.append(r5)     // Catch:{ Exception -> 0x09e6 }
            r7.append(r1)     // Catch:{ Exception -> 0x09e6 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x09e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)     // Catch:{ Exception -> 0x09e6 }
            goto L_0x0a44
        L_0x0a2a:
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r9 = 0
            r5[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r4, r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getMessage()
            r2[r9] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r3, r2)
            goto L_0x059a
        L_0x0a44:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loadFromNetWork "
            r1.append(r2)
            java.lang.String r2 = r46.mo93598g()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            r1.append(r8)
            r1.append(r2)
            if (r14 == 0) goto L_0x0a69
            int r2 = r14.length
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            goto L_0x0a6a
        L_0x0a69:
            r15 = r6
        L_0x0a6a:
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            return r14
        L_0x0a75:
            r0 = move-exception
            r1 = r0
            r11 = r13
            r13 = r7
        L_0x0a79:
            r6 = r9
        L_0x0a7a:
            r15 = r11
        L_0x0a7b:
            if (r15 == 0) goto L_0x0a83
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0a80 }
            goto L_0x0a83
        L_0x0a80:
            r0 = move-exception
            r2 = r0
            goto L_0x0ac4
        L_0x0a83:
            if (r6 == 0) goto L_0x0a8a
            r6.close()     // Catch:{ Exception -> 0x0a80 }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0a80 }
        L_0x0a8a:
            if (r13 == 0) goto L_0x0a91
            r13.close()     // Catch:{ Exception -> 0x0a80 }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0a80 }
        L_0x0a91:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0a80 }
            long r6 = r6 - r28
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0a80 }
            r14 = 1224(0x4c8, double:6.047E-321)
            r16 = 98
            r20 = 0
            r13 = r2
            r18 = r6
            r13.idkeyStat(r14, r16, r18, r20)     // Catch:{ Exception -> 0x0a80 }
            r14 = 1224(0x4c8, double:6.047E-321)
            r16 = 100
            r18 = 1
            r20 = 0
            r13 = r2
            r13.idkeyStat(r14, r16, r18, r20)     // Catch:{ Exception -> 0x0a80 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a80 }
            r2.<init>()     // Catch:{ Exception -> 0x0a80 }
            r2.append(r5)     // Catch:{ Exception -> 0x0a80 }
            r2.append(r6)     // Catch:{ Exception -> 0x0a80 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0a80 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)     // Catch:{ Exception -> 0x0a80 }
            goto L_0x0ae9
        L_0x0ac4:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r8 = 0
            r6[r8] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r4, r6)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r2 = r2.getMessage()
            r4[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r3, r4)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 138(0x8a, double:6.8E-322)
            r16 = 9
            r18 = 1
            r20 = 1
            r13.idkeyStat(r14, r16, r18, r20)
        L_0x0ae9:
            throw r1
        L_0x0aea:
            r0 = move-exception
            r1 = r0
            monitor-exit(r11)     // Catch:{ all -> 0x0aea }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xu0.C102732h.mo142520c(com.tencent.mm.modelavatar.n, int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r7 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r7 == null) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processAction(com.tencent.p014mm.sdk.pipeline.PipelineState r12, wb0.C102382b r13, wx3.C15601d<? super wb0.C102383c> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof xu0.C102732h.C102735f
            if (r0 == 0) goto L_0x0013
            r0 = r14
            xu0.h$f r0 = (xu0.C102732h.C102735f) r0
            int r1 = r0.f303363i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f303363i = r1
            goto L_0x0018
        L_0x0013:
            xu0.h$f r0 = new xu0.h$f
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f303361g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f303363i
            r3 = 2
            java.lang.String r4 = "MicroMsg.Avatar.AvatarLoadDataFromRemotePPC"
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r6) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r12 = r0.f303360f
            com.tencent.mm.modelavatar.n r12 = (com.tencent.p014mm.modelavatar.C68097n) r12
            java.lang.Object r13 = r0.f303359e
            wb0.b r13 = (wb0.C102382b) r13
            java.lang.Object r0 = r0.f303358d
            xu0.h r0 = (xu0.C102732h) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00cd
        L_0x003a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0042:
            java.lang.Object r12 = r0.f303360f
            com.tencent.mm.modelavatar.n r12 = (com.tencent.p014mm.modelavatar.C68097n) r12
            java.lang.Object r13 = r0.f303359e
            wb0.b r13 = (wb0.C102382b) r13
            java.lang.Object r0 = r0.f303358d
            xu0.h r0 = (xu0.C102732h) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00ae
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.String r14 = "Avatar_ImgFlag"
            java.lang.Object r14 = r12.get(r14)
            com.tencent.mm.modelavatar.n r14 = (com.tencent.p014mm.modelavatar.C68097n) r14
            java.lang.String r2 = "Avatar_HdFlag"
            int r12 = r12.getIntOrInterrupt(r2)
            java.lang.String r2 = ""
            if (r12 != r6) goto L_0x0072
            if (r14 == 0) goto L_0x006e
            java.lang.String r7 = r14.mo93594c()
            goto L_0x006f
        L_0x006e:
            r7 = r5
        L_0x006f:
            if (r7 != 0) goto L_0x007d
            goto L_0x007e
        L_0x0072:
            if (r14 == 0) goto L_0x0079
            java.lang.String r7 = r14.mo93597f()
            goto L_0x007a
        L_0x0079:
            r7 = r5
        L_0x007a:
            if (r7 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r2 = r7
        L_0x007e:
            if (r14 == 0) goto L_0x01b7
            boolean r2 = z04.C112551y.m153811k(r2)
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x008c
            byte[] r12 = r11.mo142520c(r14, r12)
            goto L_0x00e8
        L_0x008c:
            int r2 = r14.f195729b
            r7 = 4
            if (r2 == r7) goto L_0x00d0
            java.lang.String r2 = "imgFlag.username"
            if (r12 != r6) goto L_0x00b4
            java.lang.String r12 = r14.mo93598g()
            gy3.C87412m.m108593f(r12, r2)
            r0.f303358d = r11
            r0.f303359e = r13
            r0.f303360f = r14
            r0.f303363i = r6
            java.lang.Object r12 = r11.mo142518a(r12, r0)
            if (r12 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            r10 = r14
            r14 = r12
            r12 = r10
        L_0x00ae:
            byte[] r14 = (byte[]) r14
        L_0x00b0:
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x00e8
        L_0x00b4:
            java.lang.String r12 = r14.mo93598g()
            gy3.C87412m.m108593f(r12, r2)
            r0.f303358d = r11
            r0.f303359e = r13
            r0.f303360f = r14
            r0.f303363i = r3
            java.lang.Object r12 = r11.mo142519b(r12, r0)
            if (r12 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            r10 = r14
            r14 = r12
            r12 = r10
        L_0x00cd:
            byte[] r14 = (byte[]) r14
            goto L_0x00b0
        L_0x00d0:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "url is empty and not exist head img "
            r12.append(r0)
            java.lang.String r0 = r13.f301540a
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            r12 = r5
        L_0x00e8:
            if (r12 == 0) goto L_0x0192
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = r13.f301541b
            r0.<init>((java.lang.String) r1)
            com.tencent.mm.vfs.m1 r0 = r0.mo119974l()
            r1 = 32
            r2 = 0
            if (r0 == 0) goto L_0x0157
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()
            if (r0 == 0) goto L_0x0157
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r0.length
            r6 = 0
        L_0x0107:
            if (r6 >= r5) goto L_0x0124
            r7 = r0[r6]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "it.name"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = "small_"
            boolean r8 = z04.C112551y.m153819s(r8, r9, r2)
            if (r8 == 0) goto L_0x0121
            r3.add(r7)
        L_0x0121:
            int r6 = r6 + 1
            goto L_0x0107
        L_0x0124:
            java.util.Iterator r0 = r3.iterator()
        L_0x0128:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0157
            java.lang.Object r3 = r0.next()
            com.tencent.mm.vfs.m1 r3 = (com.tencent.p014mm.vfs.C86009m1) r3
            boolean r5 = r3.mo119966f()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "delete other small avatar file "
            r6.append(r7)
            java.lang.String r3 = r3.mo119971i()
            r6.append(r3)
            r6.append(r1)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x0128
        L_0x0157:
            java.lang.String r0 = r13.f301541b
            int r3 = r12.length
            int r0 = com.tencent.p014mm.vfs.C86013q1.m106438T(r0, r12, r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadFromNetWork writeResult:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " length:"
            r2.append(r0)
            int r0 = r12.length
            r2.append(r0)
            java.lang.String r0 = " username:"
            r2.append(r0)
            java.lang.String r0 = r14.mo93598g()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r13.f301541b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0192:
            if (r5 != 0) goto L_0x01ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadFromNetWork imageData is empty username:"
            r0.append(r1)
            java.lang.String r14 = r14.mo93598g()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
        L_0x01ad:
            wb0.c r14 = new wb0.c
            java.lang.String r0 = r13.f301540a
            java.lang.String r13 = r13.f301541b
            r14.<init>(r0, r13, r12)
            goto L_0x01c0
        L_0x01b7:
            wb0.c r14 = new wb0.c
            java.lang.String r12 = r13.f301540a
            java.lang.String r13 = r13.f301541b
            r14.<init>(r12, r13, r5)
        L_0x01c0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xu0.C102732h.processAction(com.tencent.mm.sdk.pipeline.PipelineState, wb0.b, wx3.d):java.lang.Object");
    }
}
