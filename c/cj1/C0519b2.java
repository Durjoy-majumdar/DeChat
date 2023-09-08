package cj1;

import a14.C0000n0;
import fy3.C32227p;
import ig1.C8916d;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51765w03;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncRandomGiftResource$2", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {525}, mo125471m = "invokeSuspend")
/* renamed from: cj1.b2 */
public final class C0519b2 extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public Object f1256d;

    /* renamed from: e */
    public int f1257e;

    /* renamed from: f */
    public /* synthetic */ Object f1258f;

    /* renamed from: g */
    public final /* synthetic */ LinkedList<C51765w03> f1259g;

    /* renamed from: h */
    public final /* synthetic */ String f1260h;

    /* renamed from: i */
    public final /* synthetic */ C8916d f1261i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncRandomGiftResource$2$1$1", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {510}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.b2$a */
    public static final class C0520a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f1262d;

        /* renamed from: e */
        public final /* synthetic */ String f1263e;

        /* renamed from: f */
        public final /* synthetic */ String f1264f;

        /* renamed from: g */
        public final /* synthetic */ String f1265g;

        /* renamed from: h */
        public final /* synthetic */ String f1266h;

        /* renamed from: i */
        public final /* synthetic */ String f1267i;

        /* renamed from: j */
        public final /* synthetic */ C8916d f1268j;

        /* renamed from: n */
        public final /* synthetic */ String f1269n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0520a(String str, String str2, String str3, String str4, String str5, C8916d dVar, String str6, C15601d<? super C0520a> dVar2) {
            super(2, dVar2);
            this.f1263e = str;
            this.f1264f = str2;
            this.f1265g = str3;
            this.f1266h = str4;
            this.f1267i = str5;
            this.f1268j = dVar;
            this.f1269n = str6;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0520a(this.f1263e, this.f1264f, this.f1265g, this.f1266h, this.f1267i, this.f1268j, this.f1269n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0520a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1262d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f1262d = 1;
                obj = C0519b2.m443f(this.f1263e, this.f1264f, this.f1265g, this.f1266h, this.f1267i, "checkAndDownloadMultiAnimation id:" + this.f1263e + " name:" + this.f1268j.field_name + " animationId:" + this.f1269n, this);
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncRandomGiftResource$2$1$2", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {520}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.b2$b */
    public static final class C0521b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f1270d;

        /* renamed from: e */
        public final /* synthetic */ String f1271e;

        /* renamed from: f */
        public final /* synthetic */ String f1272f;

        /* renamed from: g */
        public final /* synthetic */ String f1273g;

        /* renamed from: h */
        public final /* synthetic */ String f1274h;

        /* renamed from: i */
        public final /* synthetic */ String f1275i;

        /* renamed from: j */
        public final /* synthetic */ C8916d f1276j;

        /* renamed from: n */
        public final /* synthetic */ String f1277n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0521b(String str, String str2, String str3, String str4, String str5, C8916d dVar, String str6, C15601d<? super C0521b> dVar2) {
            super(2, dVar2);
            this.f1271e = str;
            this.f1272f = str2;
            this.f1273g = str3;
            this.f1274h = str4;
            this.f1275i = str5;
            this.f1276j = dVar;
            this.f1277n = str6;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0521b(this.f1271e, this.f1272f, this.f1273g, this.f1274h, this.f1275i, this.f1276j, this.f1277n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0521b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1270d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f1270d = 1;
                obj = C0519b2.m443f(this.f1271e, this.f1272f, this.f1273g, this.f1274h, this.f1275i, "checkAndDownloadMultiAnimation id:" + this.f1271e + " name:" + this.f1276j.field_name + " animationId:" + this.f1277n + " land ", this);
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
    public C0519b2(LinkedList<C51765w03> linkedList, String str, C8916d dVar, C15601d<? super C0519b2> dVar2) {
        super(2, dVar2);
        this.f1259g = linkedList;
        this.f1260h = str;
        this.f1261i = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m443f(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, wx3.C15601d r15) {
        /*
            boolean r0 = r15 instanceof cj1.C0525c2
            if (r0 == 0) goto L_0x0013
            r0 = r15
            cj1.c2 r0 = (cj1.C0525c2) r0
            int r1 = r0.f1286i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1286i = r1
            goto L_0x0018
        L_0x0013:
            cj1.c2 r0 = new cj1.c2
            r0.<init>(r15)
        L_0x0018:
            r4 = r0
            java.lang.Object r15 = r4.f1285h
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r4.f1286i
            r7 = 1
            java.lang.String r8 = "Finder.FinderLiveGiftLoader"
            if (r1 == 0) goto L_0x0046
            if (r1 != r7) goto L_0x003e
            java.lang.Object r9 = r4.f1284g
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r9 = r4.f1283f
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r4.f1282e
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r9 = r4.f1281d
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00b8
        L_0x003e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r15)
            com.tencent.mm.vfs.m1 r15 = new com.tencent.mm.vfs.m1
            r15.<init>((java.lang.String) r12)
            boolean r1 = r15.mo119967g()
            if (r1 == 0) goto L_0x0076
            cj1.y1 r13 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            java.lang.String r14 = ", exist, Md5:"
            r13.append(r14)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            cj1.y1 r10 = cj1.C0639y1.f1510a
            cj1.C0639y1.m564a(r10, r11, r12, r9)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0113
        L_0x0076:
            java.lang.String r10 = r15.mo119973k()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r10)
            java.util.HashMap<java.lang.String, java.lang.Long> r10 = cj1.C0639y1.f1521l
            r1 = 0
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r1)
            r10.put(r11, r15)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            java.lang.String r15 = ", start download"
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            ql1.a r10 = ql1.C12874a.f36849a
            yf.c r1 = r10.mo12389a()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f1281d = r9
            r4.f1282e = r11
            r4.f1283f = r12
            r4.f1284g = r14
            r4.f1286i = r7
            r2 = r13
            java.lang.Object r15 = p277yf.C15996c.C15997a.m14901a(r1, r2, r3, r4, r5, r6)
            if (r15 != r0) goto L_0x00b8
            goto L_0x0113
        L_0x00b8:
            org.libpag.PAGFile r15 = (org.libpag.PAGFile) r15
            if (r15 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r7 = 0
        L_0x00be:
            boolean r10 = cj1.C0639y1.f1511b
            if (r10 == 0) goto L_0x00db
            cj1.y1 r9 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            java.lang.String r10 = ", skip fetch pag callback, live is released"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0113
        L_0x00db:
            if (r7 == 0) goto L_0x00fb
            cj1.y1 r10 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            java.lang.String r13 = ", download succ"
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            cj1.y1 r10 = cj1.C0639y1.f1510a
            cj1.C0639y1.m564a(r10, r11, r12, r9)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0113
        L_0x00fb:
            cj1.y1 r9 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            java.lang.String r10 = ", download failed"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0113:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C0519b2.m443f(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C0519b2 b2Var = new C0519b2(this.f1259g, this.f1260h, this.f1261i, dVar);
        b2Var.f1258f = obj;
        return b2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0519b2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r0 = r28
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f1257e
            r4 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 != r4) goto L_0x001c
            java.lang.Object r2 = r0.f1256d
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.f1258f
            gy3.a0 r5 = (gy3.C8477a0) r5
            kotlin.ResultKt.throwOnFailure(r29)
            r4 = r29
            r3 = r2
            r2 = 1
            goto L_0x01d5
        L_0x001c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r29)
            java.lang.Object r2 = r0.f1258f
            a14.n0 r2 = (a14.C0000n0) r2
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.LinkedList<te3.w03> r5 = r0.f1259g
            java.lang.String r10 = r0.f1260h
            ig1.d r9 = r0.f1261i
            java.util.Iterator r21 = r5.iterator()
        L_0x003a:
            boolean r5 = r21.hasNext()
            if (r5 == 0) goto L_0x01ad
            java.lang.Object r5 = r21.next()
            r8 = r5
            te3.w03 r8 = (te3.C51765w03) r8
            java.lang.String r7 = r8.f143798d
            te3.du3 r5 = r8.f143799e
            r6 = 0
            if (r5 == 0) goto L_0x0052
            java.lang.String r12 = r5.f132536d
            r15 = r12
            goto L_0x0053
        L_0x0052:
            r15 = r6
        L_0x0053:
            if (r5 == 0) goto L_0x0059
            java.lang.String r5 = r5.f132537e
            r14 = r5
            goto L_0x005a
        L_0x0059:
            r14 = r6
        L_0x005a:
            te3.du3 r5 = r8.f143800f
            if (r5 == 0) goto L_0x0062
            java.lang.String r12 = r5.f132536d
            r13 = r12
            goto L_0x0063
        L_0x0062:
            r13 = r6
        L_0x0063:
            if (r5 == 0) goto L_0x0068
            java.lang.String r5 = r5.f132537e
            r6 = r5
        L_0x0068:
            if (r7 == 0) goto L_0x0073
            int r5 = r7.length()
            if (r5 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r5 = 0
            goto L_0x0074
        L_0x0073:
            r5 = 1
        L_0x0074:
            java.lang.String r12 = " name:"
            java.lang.String r4 = "checkAndDownloadMultiAnimation id:"
            r29 = r6
            java.lang.String r6 = "Finder.FinderLiveGiftLoader"
            if (r5 != 0) goto L_0x016b
            if (r15 == 0) goto L_0x0089
            int r5 = r15.length()
            if (r5 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r5 = 0
            goto L_0x008a
        L_0x0089:
            r5 = 1
        L_0x008a:
            if (r5 != 0) goto L_0x016b
            if (r14 == 0) goto L_0x0097
            int r5 = r14.length()
            if (r5 != 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r5 = 0
            goto L_0x0098
        L_0x0097:
            r5 = 1
        L_0x0098:
            if (r5 == 0) goto L_0x009c
            goto L_0x016b
        L_0x009c:
            cj1.y1 r5 = cj1.C0639y1.f1510a
            te3.w11 r3 = new te3.w11
            r3.<init>()
            r3.f143810d = r7
            rx3.b0 r16 = rx3.C13598b0.f38549a
            java.lang.String r3 = r5.mo610b(r10, r3)
            r0 = 0
            java.lang.String r16 = r5.mo616h(r10, r0, r8)
            r0 = 0
            r22 = 0
            cj1.b2$a r23 = new cj1.b2$a
            r20 = 0
            r24 = r12
            r12 = r23
            r25 = r13
            r13 = r10
            r17 = r15
            r15 = r3
            r18 = r9
            r19 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r12 = 3
            r13 = 0
            r14 = r5
            r5 = r2
            r15 = r29
            r26 = r6
            r6 = r0
            r0 = r7
            r7 = r22
            r27 = r8
            r8 = r23
            r29 = r9
            r9 = r12
            r12 = r10
            r10 = r13
            a14.u0 r5 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
            r11.add(r5)
            r6 = r25
            if (r6 == 0) goto L_0x00f1
            int r5 = r6.length()
            if (r5 != 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r5 = 0
            goto L_0x00f2
        L_0x00f1:
            r5 = 1
        L_0x00f2:
            if (r5 != 0) goto L_0x0131
            if (r15 == 0) goto L_0x00ff
            int r5 = r15.length()
            if (r5 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r5 = 0
            goto L_0x0100
        L_0x00ff:
            r5 = 1
        L_0x0100:
            if (r5 == 0) goto L_0x0103
            goto L_0x0131
        L_0x0103:
            r5 = r27
            java.lang.String r16 = r14.mo615g(r12, r5)
            r4 = 0
            r7 = 0
            cj1.b2$b r8 = new cj1.b2$b
            r20 = 0
            r10 = r12
            r12 = r8
            r13 = r10
            r14 = r15
            r15 = r3
            r17 = r6
            r18 = r29
            r19 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r9 = 3
            r0 = 0
            r5 = r2
            r6 = r4
            r3 = r10
            r10 = r0
            a14.u0 r0 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
            r11.add(r0)
            r0 = r28
            r9 = r29
            r10 = r3
            goto L_0x01aa
        L_0x0131:
            r3 = r12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            r7 = r24
            r5.append(r7)
            r8 = r29
            java.lang.String r4 = r8.field_name
            r5.append(r4)
            java.lang.String r4 = " animationId:"
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ", land res invalid, landUrl:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r0 = ", landMd5:"
            r5.append(r0)
            r5.append(r15)
            java.lang.String r0 = r5.toString()
            r5 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x01a6
        L_0x016b:
            r5 = r6
            r0 = r7
            r8 = r9
            r3 = r10
            r7 = r12
            r17 = r15
            cj1.y1 r6 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r3)
            r6.append(r7)
            java.lang.String r4 = r8.field_name
            r6.append(r4)
            java.lang.String r4 = " multiAnimationList resource invalid, "
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r12 = r17
            r6.append(r12)
            r6.append(r0)
            r6.append(r14)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
        L_0x01a6:
            r0 = r28
            r10 = r3
            r9 = r8
        L_0x01aa:
            r4 = 1
            goto L_0x003a
        L_0x01ad:
            gy3.a0 r0 = new gy3.a0
            r0.<init>()
            r2 = 1
            r0.f27482d = r2
            java.util.Iterator r3 = r11.iterator()
            r5 = r0
            r0 = r28
        L_0x01bc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r4 = r3.next()
            a14.u0 r4 = (a14.C53953u0) r4
            r0.f1258f = r5
            r0.f1256d = r3
            r0.f1257e = r2
            java.lang.Object r4 = r4.mo74634A(r0)
            if (r4 != r1) goto L_0x01d5
            return r1
        L_0x01d5:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x01e1
            r4 = 0
            r5.f27482d = r4
            goto L_0x01bc
        L_0x01e1:
            r4 = 0
            goto L_0x01bc
        L_0x01e3:
            boolean r0 = r5.f27482d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C0519b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
