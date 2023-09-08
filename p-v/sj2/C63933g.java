package sj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: sj2.g */
public final class C63933g extends C63924f {

    /* renamed from: e */
    public long f181218e;

    /* renamed from: f */
    public long f181219f;

    /* renamed from: g */
    public boolean f181220g = true;

    /* renamed from: h */
    public int f181221h = -1;

    /* renamed from: i */
    public String f181222i = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneSearchDataLoader$load$2", mo125469f = "RingtoneSearchDataLoader.kt", mo125470l = {36, 43}, mo125471m = "invokeSuspend")
    /* renamed from: sj2.g$a */
    public static final class C63934a extends C91594j implements C32227p<C0000n0, C15601d<? super C63923e>, Object> {

        /* renamed from: d */
        public Object f181223d;

        /* renamed from: e */
        public Object f181224e;

        /* renamed from: f */
        public int f181225f;

        /* renamed from: g */
        public /* synthetic */ Object f181226g;

        /* renamed from: h */
        public final /* synthetic */ C63933g f181227h;

        /* renamed from: i */
        public final /* synthetic */ int f181228i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63934a(C63933g gVar, int i, C15601d<? super C63934a> dVar) {
            super(2, dVar);
            this.f181227h = gVar;
            this.f181228i = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63934a aVar = new C63934a(this.f181227h, this.f181228i, dVar);
            aVar.f181226g = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63934a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00fe A[Catch:{ Exception -> 0x011b }, LOOP:2: B:33:0x00f8->B:35:0x00fe, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f181225f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002d
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r0 = r12.f181224e
                gy3.d0 r0 = (gy3.C8478d0) r0
                java.lang.Object r1 = r12.f181223d
                ve3.w0 r1 = (ve3.C52860w0) r1
                java.lang.Object r2 = r12.f181226g
                a14.n0 r2 = (a14.C0000n0) r2
                kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ Exception -> 0x011b }
                goto L_0x00e1
            L_0x001d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0025:
                java.lang.Object r1 = r12.f181226g
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ Exception -> 0x011b }
                goto L_0x0062
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.f181226g
                a14.n0 r13 = (a14.C0000n0) r13
                vj2.j r1 = new vj2.j     // Catch:{ Exception -> 0x011b }
                sj2.g r4 = r12.f181227h     // Catch:{ Exception -> 0x011b }
                java.lang.String r5 = r4.f181222i     // Catch:{ Exception -> 0x011b }
                int r6 = r4.f181221h     // Catch:{ Exception -> 0x011b }
                int r6 = r6 + r3
                long r7 = r4.f181218e     // Catch:{ Exception -> 0x011b }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x011b }
                sj2.g r4 = r12.f181227h     // Catch:{ Exception -> 0x011b }
                long r8 = r4.f181219f     // Catch:{ Exception -> 0x011b }
                int r10 = r12.f181228i     // Catch:{ Exception -> 0x011b }
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ Exception -> 0x011b }
                r5 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r12.f181226g = r13     // Catch:{ Exception -> 0x011b }
                r12.f181225f = r3     // Catch:{ Exception -> 0x011b }
                r4 = r1
                r8 = r12
                java.lang.Object r1 = q40.C89456b.m111831a(r4, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x011b }
                if (r1 != r0) goto L_0x005f
                return r0
            L_0x005f:
                r11 = r1
                r1 = r13
                r13 = r11
            L_0x0062:
                ve3.w0 r13 = (ve3.C52860w0) r13     // Catch:{ Exception -> 0x011b }
                wx3.f r4 = r1.getCoroutineContext()     // Catch:{ Exception -> 0x011b }
                a14.C53873d2.m60392d(r4)     // Catch:{ Exception -> 0x011b }
                gy3.d0 r4 = new gy3.d0     // Catch:{ Exception -> 0x011b }
                r4.<init>()     // Catch:{ Exception -> 0x011b }
                r5 = -1
                r4.f27483d = r5     // Catch:{ Exception -> 0x011b }
                java.util.LinkedList<ve3.u0> r5 = r13.f147644e     // Catch:{ Exception -> 0x011b }
                java.lang.String r6 = "response.Infos"
                gy3.C87412m.m108593f(r5, r6)     // Catch:{ Exception -> 0x011b }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x011b }
                r6.<init>()     // Catch:{ Exception -> 0x011b }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x011b }
            L_0x0084:
                boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x011b }
                if (r7 == 0) goto L_0x00a2
                java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x011b }
                ve3.u0 r7 = (ve3.C52856u0) r7     // Catch:{ Exception -> 0x011b }
                int r8 = r4.f27483d     // Catch:{ Exception -> 0x011b }
                int r9 = r7.f147635e     // Catch:{ Exception -> 0x011b }
                int r8 = java.lang.Math.max(r8, r9)     // Catch:{ Exception -> 0x011b }
                r4.f27483d = r8     // Catch:{ Exception -> 0x011b }
                ve3.n0 r7 = r7.f147634d     // Catch:{ Exception -> 0x011b }
                if (r7 == 0) goto L_0x0084
                r6.add(r7)     // Catch:{ Exception -> 0x011b }
                goto L_0x0084
            L_0x00a2:
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x011b }
                r7 = 10
                int r7 = sx3.C36907w.m41090l(r6, r7)     // Catch:{ Exception -> 0x011b }
                r5.<init>(r7)     // Catch:{ Exception -> 0x011b }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x011b }
            L_0x00b1:
                boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x011b }
                if (r7 == 0) goto L_0x00cb
                java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x011b }
                ve3.n0 r7 = (ve3.C65685n0) r7     // Catch:{ Exception -> 0x011b }
                pj2.e r8 = new pj2.e     // Catch:{ Exception -> 0x011b }
                java.lang.String r9 = "it"
                gy3.C87412m.m108593f(r7, r9)     // Catch:{ Exception -> 0x011b }
                r8.<init>(r7)     // Catch:{ Exception -> 0x011b }
                r5.add(r8)     // Catch:{ Exception -> 0x011b }
                goto L_0x00b1
            L_0x00cb:
                sj2.g r6 = r12.f181227h     // Catch:{ Exception -> 0x011b }
                r12.f181226g = r1     // Catch:{ Exception -> 0x011b }
                r12.f181223d = r13     // Catch:{ Exception -> 0x011b }
                r12.f181224e = r4     // Catch:{ Exception -> 0x011b }
                r12.f181225f = r2     // Catch:{ Exception -> 0x011b }
                java.lang.Object r2 = r6.mo88699b(r5, r12)     // Catch:{ Exception -> 0x011b }
                if (r2 != r0) goto L_0x00dc
                return r0
            L_0x00dc:
                r0 = r4
                r11 = r1
                r1 = r13
                r13 = r2
                r2 = r11
            L_0x00e1:
                java.util.List r13 = (java.util.List) r13     // Catch:{ Exception -> 0x011b }
                wx3.f r2 = r2.getCoroutineContext()     // Catch:{ Exception -> 0x011b }
                a14.C53873d2.m60392d(r2)     // Catch:{ Exception -> 0x011b }
                sj2.g r2 = r12.f181227h     // Catch:{ Exception -> 0x011b }
                boolean r1 = r1.f147643d     // Catch:{ Exception -> 0x011b }
                r2.f181220g = r1     // Catch:{ Exception -> 0x011b }
                int r0 = r0.f27483d     // Catch:{ Exception -> 0x011b }
                r2.f181221h = r0     // Catch:{ Exception -> 0x011b }
                java.util.Iterator r0 = r13.iterator()     // Catch:{ Exception -> 0x011b }
            L_0x00f8:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x011b }
                if (r1 == 0) goto L_0x0111
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x011b }
                pj2.e r1 = (pj2.C62324e) r1     // Catch:{ Exception -> 0x011b }
                java.lang.String r4 = r2.f181222i     // Catch:{ Exception -> 0x011b }
                r1.getClass()     // Catch:{ Exception -> 0x011b }
                java.lang.String r5 = "<set-?>"
                gy3.C87412m.m108594g(r4, r5)     // Catch:{ Exception -> 0x011b }
                r1.f177157g = r4     // Catch:{ Exception -> 0x011b }
                goto L_0x00f8
            L_0x0111:
                sj2.e r0 = new sj2.e     // Catch:{ Exception -> 0x011b }
                sj2.g r1 = r12.f181227h     // Catch:{ Exception -> 0x011b }
                boolean r1 = r1.f181220g     // Catch:{ Exception -> 0x011b }
                r0.<init>(r13, r1, r3)     // Catch:{ Exception -> 0x011b }
                return r0
            L_0x011b:
                r13 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "GetSearchRingBack failed: "
                r0.append(r1)
                java.lang.String r13 = r13.getMessage()
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                java.lang.String r0 = "MicroMsg.RingtoneSearchDataLoader"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
                sj2.e r13 = new sj2.e
                sx3.f0 r2 = sx3.C64186f0.f181907d
                r3 = 0
                r4 = 0
                r5 = 2
                r6 = 0
                r1 = r13
                r1.<init>(r2, r3, r4, r5, r6)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: sj2.C63933g.C63934a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public Object mo13066a(int i, boolean z, boolean z2, C15601d<? super C63923e> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C63934a(this, i, (C15601d<? super C63934a>) null), dVar);
    }
}
