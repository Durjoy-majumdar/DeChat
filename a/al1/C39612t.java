package al1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import bl1.C39786k;
import cl1.C54991o;
import cl1.C55001u;
import er1.C45684k;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import je1.C46514d0;
import kotlin.ResultKt;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: al1.t */
public final class C39612t {

    /* renamed from: a */
    public final C39617d f106363a;

    /* renamed from: b */
    public final C66212f f106364b;

    /* renamed from: c */
    public final long f106365c;

    /* renamed from: d */
    public C0000n0 f106366d;

    /* renamed from: e */
    public C53973z1 f106367e;

    /* renamed from: al1.t$a */
    public static abstract class C39613a<T extends C49335eu3> implements C39617d {

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.PollingHandler$BatchCgiTask$run$2", mo125469f = "PollingHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: al1.t$a$b */
        public static final class C27916b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f77104d;

            /* renamed from: e */
            public final /* synthetic */ List<C89132b<T>> f77105e;

            /* renamed from: f */
            public final /* synthetic */ ArrayList<C39616c> f77106f;

            /* renamed from: g */
            public final /* synthetic */ C39613a<T> f77107g;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.PollingHandler$BatchCgiTask$run$2$1$1", mo125469f = "PollingHandler.kt", mo125470l = {73}, mo125471m = "invokeSuspend")
            /* renamed from: al1.t$a$b$a */
            public static final class C27917a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public Object f77108d;

                /* renamed from: e */
                public int f77109e;

                /* renamed from: f */
                public final /* synthetic */ ArrayList<C39616c> f77110f;

                /* renamed from: g */
                public final /* synthetic */ C39613a<T> f77111g;

                /* renamed from: h */
                public final /* synthetic */ C89132b<T> f77112h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C27917a(ArrayList<C39616c> arrayList, C39613a<T> aVar, C89132b<T> bVar, C15601d<? super C27917a> dVar) {
                    super(2, dVar);
                    this.f77110f = arrayList;
                    this.f77111g = aVar;
                    this.f77112h = bVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C27917a(this.f77110f, this.f77111g, this.f77112h, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C27917a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ArrayList<C39616c> arrayList;
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f77109e;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ArrayList<C39616c> arrayList2 = this.f77110f;
                        C39613a<T> aVar2 = this.f77111g;
                        C89132b<T> bVar = this.f77112h;
                        this.f77108d = arrayList2;
                        this.f77109e = 1;
                        aVar2.getClass();
                        C66218h hVar = new C66218h(C66447b.m78392b(this));
                        bVar.mo9225i().mo123420E(new C39618u(aVar2, bVar, hVar));
                        Object b = hVar.mo90314b();
                        if (b == aVar) {
                            return aVar;
                        }
                        arrayList = arrayList2;
                        obj = b;
                    } else if (i == 1) {
                        arrayList = (ArrayList) this.f77108d;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList.add(obj);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27916b(List<? extends C89132b<T>> list, ArrayList<C39616c> arrayList, C39613a<T> aVar, C15601d<? super C27916b> dVar) {
                super(2, dVar);
                this.f77105e = list;
                this.f77106f = arrayList;
                this.f77107g = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C27916b bVar = new C27916b(this.f77105e, this.f77106f, this.f77107g, dVar);
                bVar.f77104d = obj;
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C27916b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f77104d;
                List<C89132b<T>> list = this.f77105e;
                ArrayList<C39616c> arrayList = this.f77106f;
                C39613a<T> aVar = this.f77107g;
                for (C89132b aVar2 : list) {
                    C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C27917a(arrayList, aVar, aVar2, (C15601d<? super C27917a>) null), 3, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.PollingHandler$BatchCgiTask", mo125469f = "PollingHandler.kt", mo125470l = {70}, mo125471m = "run$suspendImpl")
        /* renamed from: al1.t$a$a */
        public static final class C39614a extends C66704d {

            /* renamed from: d */
            public Object f106368d;

            /* renamed from: e */
            public /* synthetic */ Object f106369e;

            /* renamed from: f */
            public final /* synthetic */ C39613a<T> f106370f;

            /* renamed from: g */
            public int f106371g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39614a(C39613a<T> aVar, C15601d<? super C39614a> dVar) {
                super(dVar);
                this.f106370f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f106369e = obj;
                this.f106371g |= Integer.MIN_VALUE;
                return C39613a.m42227b(this.f106370f, this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0138  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object m42227b(al1.C39612t.C39613a r18, wx3.C15601d r19) {
            /*
                r0 = r18
                r1 = r19
                boolean r2 = r1 instanceof al1.C39612t.C39613a.C39614a
                if (r2 == 0) goto L_0x0017
                r2 = r1
                al1.t$a$a r2 = (al1.C39612t.C39613a.C39614a) r2
                int r3 = r2.f106371g
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.f106371g = r3
                goto L_0x001c
            L_0x0017:
                al1.t$a$a r2 = new al1.t$a$a
                r2.<init>(r0, r1)
            L_0x001c:
                java.lang.Object r1 = r2.f106369e
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r2.f106371g
                r5 = 0
                r6 = 1
                if (r4 == 0) goto L_0x0039
                if (r4 != r6) goto L_0x0031
                java.lang.Object r0 = r2.f106368d
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                kotlin.ResultKt.throwOnFailure(r1)
                goto L_0x00fb
            L_0x0031:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0039:
                kotlin.ResultKt.throwOnFailure(r1)
                r1 = r0
                bl1.k$e r1 = (bl1.C39786k.C39791e) r1
                r1.getClass()
                java.lang.Class<cl1.u> r4 = cl1.C55001u.class
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                bl1.k r8 = r1.f106779c
                boolean r9 = r8.f106767f
                if (r9 != 0) goto L_0x0051
                goto L_0x00e5
            L_0x0051:
                fj1.b r8 = r8.f106762a
                androidx.lifecycle.i0 r8 = r8.mo71262a(r4)
                cl1.u r8 = (cl1.C55001u) r8
                byte[] r10 = r8.f154417n
                bl1.k r8 = r1.f106779c
                fj1.b r8 = r8.f106762a
                androidx.lifecycle.i0 r8 = r8.mo71262a(r4)
                cl1.u r8 = (cl1.C55001u) r8
                long r11 = r8.f154416j
                bl1.k r8 = r1.f106779c
                fj1.b r8 = r8.f106762a
                androidx.lifecycle.i0 r4 = r8.mo71262a(r4)
                cl1.u r4 = (cl1.C55001u) r4
                te3.c21 r4 = r4.f154420q
                long r13 = r4.f182392d
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                te3.aj r4 = new te3.aj
                r4.<init>()
                te3.xi r8 = r1.f106777a
                te3.lw0 r9 = r8.f144664d
                r4.f130560d = r9
                pe3.b r8 = r8.f144665e
                r4.f130561e = r8
                r15.add(r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                bl1.k r4 = r1.f106779c
                fj1.b r4 = r4.f106762a
                java.lang.Class<cl1.o> r8 = cl1.C54991o.class
                androidx.lifecycle.i0 r4 = r4.mo71262a(r8)
                cl1.o r4 = (cl1.C54991o) r4
                java.lang.String r4 = r4.f154345o
                te3.hj1 r8 = r1.f106778b
                je1.x r9 = new je1.x
                r19 = r9
                r16 = r4
                r17 = r8
                r9.<init>(r10, r11, r13, r15, r16, r17)
                r4 = r19
                r7.add(r4)
                er1.k r4 = er1.C45684k.f123488a
                bl1.k$b r8 = bl1.C39786k.f106760i
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "polling reddot, boxContext "
                r8.append(r9)
                te3.xi r1 = r1.f106777a
                java.lang.String r1 = r4.mo71182c(r1)
                r8.append(r1)
                java.lang.String r1 = r8.toString()
                java.lang.String r4 = "str"
                gy3.C87412m.m108594g(r1, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r8 = "redDotFlowLog "
                r4.append(r8)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                java.lang.String r4 = "Finder.BoxDataStore"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            L_0x00e5:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                al1.t$a$b r4 = new al1.t$a$b
                r4.<init>(r7, r1, r0, r5)
                r2.f106368d = r1
                r2.f106371g = r6
                java.lang.Object r0 = a14.C53930o0.m60559f(r4, r2)
                if (r0 != r3) goto L_0x00fa
                return r3
            L_0x00fa:
                r0 = r1
            L_0x00fb:
                boolean r1 = r0.isEmpty()
                r2 = 0
                if (r1 != 0) goto L_0x012b
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x0109
                goto L_0x0126
            L_0x0109:
                java.util.Iterator r1 = r0.iterator()
            L_0x010d:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0126
                java.lang.Object r3 = r1.next()
                al1.t$c r3 = (al1.C39612t.C39616c) r3
                if (r3 == 0) goto L_0x0121
                boolean r3 = r3.f106372a
                if (r3 != r6) goto L_0x0121
                r3 = 1
                goto L_0x0122
            L_0x0121:
                r3 = 0
            L_0x0122:
                if (r3 == 0) goto L_0x010d
                r1 = 1
                goto L_0x0127
            L_0x0126:
                r1 = 0
            L_0x0127:
                if (r1 == 0) goto L_0x012a
                goto L_0x012b
            L_0x012a:
                r6 = 0
            L_0x012b:
                java.util.Iterator r0 = r0.iterator()
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 != 0) goto L_0x0138
                goto L_0x0168
            L_0x0138:
                java.lang.Object r1 = r0.next()
                al1.t$c r1 = (al1.C39612t.C39616c) r1
                if (r1 == 0) goto L_0x0143
                long r4 = r1.f106373b
                goto L_0x0144
            L_0x0143:
                r4 = r2
            L_0x0144:
                java.lang.Long r1 = new java.lang.Long
                r1.<init>(r4)
            L_0x0149:
                r5 = r1
            L_0x014a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0168
                java.lang.Object r1 = r0.next()
                al1.t$c r1 = (al1.C39612t.C39616c) r1
                if (r1 == 0) goto L_0x015b
                long r7 = r1.f106373b
                goto L_0x015c
            L_0x015b:
                r7 = r2
            L_0x015c:
                java.lang.Long r1 = new java.lang.Long
                r1.<init>(r7)
                int r4 = r5.compareTo(r1)
                if (r4 >= 0) goto L_0x014a
                goto L_0x0149
            L_0x0168:
                if (r5 == 0) goto L_0x016e
                long r2 = r5.longValue()
            L_0x016e:
                al1.t$c r0 = new al1.t$c
                r0.<init>(r6, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: al1.C39612t.C39613a.m42227b(al1.t$a, wx3.d):java.lang.Object");
        }

        /* renamed from: a */
        public Object mo62173a(C15601d<? super C39616c> dVar) {
            return m42227b(this, dVar);
        }
    }

    /* renamed from: al1.t$b */
    public static abstract class C39615b<T extends C49335eu3> implements C39617d {
        /* renamed from: a */
        public Object mo62173a(C15601d<? super C39616c> dVar) {
            C66218h hVar = new C66218h(C66447b.m78392b(dVar));
            C39786k.C39789c cVar = (C39786k.C39789c) this;
            Class cls = C55001u.class;
            C39786k kVar = cVar.f106773d;
            kVar.mo62411b("lxltest boxContext: " + C45684k.f123488a.mo71182c(cVar.f106771b));
            C46514d0 d0Var = new C46514d0(((C55001u) cVar.f106773d.f106762a.mo71262a(cls)).f154417n, cVar.f106770a, cVar.f106771b.f144665e, ((C55001u) cVar.f106773d.f106762a.mo71262a(cls)).f154416j, ((C55001u) cVar.f106773d.f106762a.mo71262a(cls)).f154420q.f182392d, ((C54991o) cVar.f106773d.f106762a.mo71262a(C54991o.class)).f154345o, cVar.f106772c);
            d0Var.mo9225i().mo123420E(new C39619v(this, d0Var, hVar));
            return hVar.mo90314b();
        }
    }

    /* renamed from: al1.t$c */
    public static final class C39616c {

        /* renamed from: a */
        public final boolean f106372a;

        /* renamed from: b */
        public final long f106373b;

        public C39616c(boolean z, long j) {
            this.f106372a = z;
            this.f106373b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39616c)) {
                return false;
            }
            C39616c cVar = (C39616c) obj;
            return this.f106372a == cVar.f106372a && this.f106373b == cVar.f106373b;
        }

        public int hashCode() {
            boolean z = this.f106372a;
            if (z) {
                z = true;
            }
            long j = this.f106373b;
            return ((z ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "NextConfig(continuePolling=" + this.f106372a + ", delayTimeMs=" + this.f106373b + ')';
        }
    }

    /* renamed from: al1.t$d */
    public interface C39617d {
        /* renamed from: a */
        Object mo62173a(C15601d<? super C39616c> dVar);
    }

    public C39612t(C39617d dVar, C66212f fVar, long j) {
        C87412m.m108594g(dVar, "task");
        C87412m.m108594g(fVar, "coroutineContext");
        this.f106363a = dVar;
        this.f106364b = fVar;
        this.f106365c = j;
    }
}
