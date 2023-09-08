package do1;

import a14.C0000n0;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import do1.C58341h;
import dp1.C20480e0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import java.util.LinkedList;
import je1.C9342n1;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.preload.tabPreload.TabPreloadWorker$fetchEnterLoad$1", mo125469f = "TabPreloadWorker.kt", mo125470l = {853}, mo125471m = "invokeSuspend")
/* renamed from: do1.k */
public final class C7413k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f25569d;

    /* renamed from: e */
    public Object f25570e;

    /* renamed from: f */
    public int f25571f;

    /* renamed from: g */
    public /* synthetic */ Object f25572g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<C58341h.C58345g, C13598b0> f25573h;

    /* renamed from: i */
    public final /* synthetic */ C58341h f25574i;

    /* renamed from: j */
    public final /* synthetic */ C58341h.C58344f f25575j;

    /* renamed from: n */
    public final /* synthetic */ C89349b f25576n;

    /* renamed from: o */
    public final /* synthetic */ C49712hj1 f25577o;

    /* renamed from: p */
    public final /* synthetic */ LinkedList<FinderObject> f25578p;

    /* renamed from: q */
    public final /* synthetic */ boolean f25579q;

    /* renamed from: do1.k$a */
    public static final class C7414a extends C87413o implements C32224a<C9342n1> {

        /* renamed from: d */
        public final /* synthetic */ C58341h f25580d;

        /* renamed from: e */
        public final /* synthetic */ C89349b f25581e;

        /* renamed from: f */
        public final /* synthetic */ C49712hj1 f25582f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<FinderObject> f25583g;

        /* renamed from: h */
        public final /* synthetic */ boolean f25584h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7414a(C58341h hVar, C89349b bVar, C49712hj1 hj12, LinkedList<FinderObject> linkedList, boolean z) {
            super(0);
            this.f25580d = hVar;
            this.f25581e = bVar;
            this.f25582f = hj12;
            this.f25583g = linkedList;
            this.f25584h = z;
        }

        public Object invoke() {
            C9342n1 n1Var = new C9342n1(this.f25580d.f167025a, 0, this.f25581e, this.f25582f, this.f25583g, true, false, false, 0, false, 960, (C8480h) null);
            boolean z = this.f25584h;
            C58341h hVar = this.f25580d;
            n1Var.f29190q = new C7411i(z, hVar);
            n1Var.f29189p = new C7412j(hVar);
            C20480e0.C20481a e = C20480e0.f57583a.mo32032e(hVar.f167025a);
            if (e != null) {
                if (!(e.f57617a && !e.f57619b)) {
                    e = null;
                }
                if (e != null) {
                    e.f57626e0 = 1;
                }
            }
            return n1Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7413k(C32226l<? super C58341h.C58345g, C13598b0> lVar, C58341h hVar, C58341h.C58344f fVar, C89349b bVar, C49712hj1 hj12, LinkedList<FinderObject> linkedList, boolean z, C15601d<? super C7413k> dVar) {
        super(2, dVar);
        this.f25573h = lVar;
        this.f25574i = hVar;
        this.f25575j = fVar;
        this.f25576n = bVar;
        this.f25577o = hj12;
        this.f25578p = linkedList;
        this.f25579q = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C7413k kVar = new C7413k(this.f25573h, this.f25574i, this.f25575j, this.f25576n, this.f25577o, this.f25578p, this.f25579q, dVar);
        kVar.f25572g = obj;
        return kVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C7413k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            do1.h$f r4 = do1.C58341h.C58344f.RefreshContinue
            do1.h$g r2 = do1.C58341h.C58345g.OK
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r1.f25571f
            java.lang.String r5 = "fetchEnterLoad: enterLoad is end when RefreshContinue, respEx = "
            java.lang.String r6 = "fetchEnterLoad: enter load set loading end"
            r7 = 1
            if (r3 == 0) goto L_0x0034
            if (r3 != r7) goto L_0x002c
            java.lang.Object r0 = r1.f25570e
            gy3.f0 r0 = (gy3.C8479f0) r0
            java.lang.Object r3 = r1.f25569d
            gy3.f0 r3 = (gy3.C8479f0) r3
            java.lang.Object r7 = r1.f25572g
            gy3.f0 r7 = (gy3.C8479f0) r7
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0028 }
            r9 = r3
            r3 = r7
            r7 = r19
            goto L_0x0091
        L_0x0028:
            r0 = move-exception
        L_0x0029:
            r9 = r3
            goto L_0x0115
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r3 = r1.f25572g
            a14.n0 r3 = (a14.C0000n0) r3
            do1.k$a r8 = new do1.k$a
            do1.h r11 = r1.f25574i
            pe3.b r12 = r1.f25576n
            te3.hj1 r13 = r1.f25577o
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r14 = r1.f25578p
            boolean r15 = r1.f25579q
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            gy3.f0 r15 = new gy3.f0
            r15.<init>()
            gy3.f0 r14 = new gy3.f0
            r14.<init>()
            me1.b r13 = new me1.b     // Catch:{ all -> 0x010f }
            wx3.f r3 = r3.getCoroutineContext()     // Catch:{ all -> 0x010f }
            a14.z1$b r10 = a14.C53973z1.C0004b.f3d     // Catch:{ all -> 0x010f }
            wx3.f$b r3 = r3.get(r10)     // Catch:{ all -> 0x010f }
            r12 = r3
            a14.z1 r12 = (a14.C53973z1) r12     // Catch:{ all -> 0x010f }
            r3 = 0
            r16 = 4
            r17 = 0
            r10 = r13
            r11 = r8
            r8 = r13
            r13 = r3
            r3 = r14
            r14 = r16
            r9 = r15
            r15 = r17
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x010d }
            r3.f27484d = r8     // Catch:{ all -> 0x010d }
            r1.f25572g = r9     // Catch:{ all -> 0x010d }
            r1.f25569d = r3     // Catch:{ all -> 0x010d }
            r1.f25570e = r9     // Catch:{ all -> 0x010d }
            r1.f25571f = r7     // Catch:{ all -> 0x010d }
            java.lang.String r7 = r8.f350948a     // Catch:{ all -> 0x010d }
            java.lang.String r10 = "preload: start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)     // Catch:{ all -> 0x010d }
            java.lang.Object r7 = i31.C117134d.m165172f(r8, r1)     // Catch:{ all -> 0x010d }
            if (r7 != r0) goto L_0x008e
            return r0
        L_0x008e:
            r0 = r9
            r9 = r3
            r3 = r0
        L_0x0091:
            r0.f27484d = r7     // Catch:{ all -> 0x0108 }
            fy3.l<do1.h$g, rx3.b0> r0 = r1.f25573h
            r0.invoke(r2)
            do1.h r0 = r1.f25574i
            java.lang.String r0 = r0.f167027c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            do1.h r0 = r1.f25574i
            do1.h$e r2 = r0.f167042r
            boolean r6 = r2.f25557a
            if (r6 == 0) goto L_0x00fa
            do1.h$f r6 = r2.f25558b
            if (r6 != r4) goto L_0x00fa
            java.lang.String r0 = r0.f167027c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            T r5 = r3.f27484d
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            T r0 = r3.f27484d
            je1.n1$d r0 = (je1.C9342n1.C9346d) r0
            if (r0 == 0) goto L_0x00fe
            do1.h r2 = r1.f25574i
            r5 = 0
            do1.h$d r6 = new do1.h$d
            r6.<init>()
            je1.n1$c r7 = r0.mo10088b()
            long r7 = r7.f145380r
            r6.f167055a = r7
            T r3 = r3.f27484d
            je1.n1$d r3 = (je1.C9342n1.C9346d) r3
            je1.n1$c r3 = r3.mo10088b()
            int r3 = r3.f145371f
            r6.f167056b = r3
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r7 = 0
            r3 = r0
            r2.mo83096r(r3, r4, r5, r6, r7)
            T r0 = r9.f27484d
            me1.b r0 = (me1.C117551b) r0
            if (r0 == 0) goto L_0x00fe
            j31.b r0 = r0.mo181070d()
            r2 = 0
            r0.mo10056c(r2)
            goto L_0x00fe
        L_0x00fa:
            do1.h$f r0 = r1.f25575j
            r2.f25558b = r0
        L_0x00fe:
            do1.h r0 = r1.f25574i
            do1.h$e r0 = r0.f167042r
            r2 = 0
            r0.f25557a = r2
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0108:
            r0 = move-exception
            r7 = r3
            r3 = r9
            goto L_0x0029
        L_0x010d:
            r0 = move-exception
            goto L_0x0112
        L_0x010f:
            r0 = move-exception
            r3 = r14
            r9 = r15
        L_0x0112:
            r7 = r9
            goto L_0x0029
        L_0x0115:
            fy3.l<do1.h$g, rx3.b0> r3 = r1.f25573h
            r3.invoke(r2)
            do1.h r2 = r1.f25574i
            java.lang.String r2 = r2.f167027c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            do1.h r2 = r1.f25574i
            do1.h$e r3 = r2.f167042r
            boolean r6 = r3.f25557a
            if (r6 == 0) goto L_0x017c
            do1.h$f r6 = r3.f25558b
            if (r6 != r4) goto L_0x017c
            java.lang.String r2 = r2.f167027c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            T r5 = r7.f27484d
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            T r2 = r7.f27484d
            r3 = r2
            je1.n1$d r3 = (je1.C9342n1.C9346d) r3
            if (r3 == 0) goto L_0x0180
            do1.h r2 = r1.f25574i
            r5 = 0
            do1.h$d r6 = new do1.h$d
            r6.<init>()
            je1.n1$c r8 = r3.mo10088b()
            long r10 = r8.f145380r
            r6.f167055a = r10
            T r7 = r7.f27484d
            je1.n1$d r7 = (je1.C9342n1.C9346d) r7
            je1.n1$c r7 = r7.mo10088b()
            int r7 = r7.f145371f
            r6.f167056b = r7
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r7 = 0
            r2.mo83096r(r3, r4, r5, r6, r7)
            T r2 = r9.f27484d
            me1.b r2 = (me1.C117551b) r2
            if (r2 == 0) goto L_0x0180
            j31.b r2 = r2.mo181070d()
            r3 = 0
            r2.mo10056c(r3)
            goto L_0x0180
        L_0x017c:
            do1.h$f r2 = r1.f25575j
            r3.f25558b = r2
        L_0x0180:
            do1.h r2 = r1.f25574i
            do1.h$e r2 = r2.f167042r
            r3 = 0
            r2.f25557a = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.C7413k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
