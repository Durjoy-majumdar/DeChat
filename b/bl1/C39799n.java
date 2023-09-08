package bl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50195kz0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxDataStore$RedDotPollingTask$processResp$1$2", mo125469f = "BoxDataStore.kt", mo125470l = {580}, mo125471m = "invokeSuspend")
/* renamed from: bl1.n */
public final class C39799n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f106800d;

    /* renamed from: e */
    public final /* synthetic */ C50195kz0 f106801e;

    /* renamed from: f */
    public final /* synthetic */ C39786k f106802f;

    /* renamed from: g */
    public final /* synthetic */ C89132b<C50195kz0> f106803g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxDataStore$RedDotPollingTask$processResp$1$2$1", mo125469f = "BoxDataStore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: bl1.n$a */
    public static final class C39800a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C50195kz0 f106804d;

        /* renamed from: e */
        public final /* synthetic */ C39786k f106805e;

        /* renamed from: f */
        public final /* synthetic */ C89132b<C50195kz0> f106806f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39800a(C50195kz0 kz02, C39786k kVar, C89132b<C50195kz0> bVar, C15601d<? super C39800a> dVar) {
            super(2, dVar);
            this.f106804d = kz02;
            this.f106805e = kVar;
            this.f106806f = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C39800a(this.f106804d, this.f106805e, this.f106806f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C39800a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0084 A[SYNTHETIC, Splitter:B:38:0x0084] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0011 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.ResultKt.throwOnFailure(r10)
                te3.kz0 r10 = r9.f106804d
                java.util.LinkedList<te3.bj> r10 = r10.f137105e
                if (r10 == 0) goto L_0x00df
                ob0.b<te3.kz0> r0 = r9.f106806f
                bl1.k r1 = r9.f106805e
                java.util.Iterator r10 = r10.iterator()
            L_0x0011:
                boolean r2 = r10.hasNext()
                if (r2 == 0) goto L_0x00df
                java.lang.Object r2 = r10.next()
                te3.bj r2 = (te3.C48862bj) r2
                boolean r3 = r2.f131139e
                if (r3 == 0) goto L_0x0011
                boolean r3 = r0 instanceof je1.C46545x
                r4 = 0
                if (r3 == 0) goto L_0x002a
                r3 = r0
                je1.x r3 = (je1.C46545x) r3
                goto L_0x002b
            L_0x002a:
                r3 = r4
            L_0x002b:
                if (r3 == 0) goto L_0x0061
                java.util.List<te3.aj> r3 = r3.f125416s
                if (r3 == 0) goto L_0x0061
                java.util.Iterator r3 = r3.iterator()
            L_0x0035:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0059
                java.lang.Object r5 = r3.next()
                r6 = r5
                te3.aj r6 = (te3.C48721aj) r6
                te3.lw0 r6 = r6.f130560d
                if (r6 == 0) goto L_0x0049
                java.lang.String r6 = r6.f137677e
                goto L_0x004a
            L_0x0049:
                r6 = r4
            L_0x004a:
                te3.lw0 r7 = r2.f131138d
                if (r7 == 0) goto L_0x0051
                java.lang.String r7 = r7.f137677e
                goto L_0x0052
            L_0x0051:
                r7 = r4
            L_0x0052:
                boolean r6 = gy3.C87412m.m108589b(r6, r7)
                if (r6 == 0) goto L_0x0035
                goto L_0x005a
            L_0x0059:
                r5 = r4
            L_0x005a:
                te3.aj r5 = (te3.C48721aj) r5
                if (r5 == 0) goto L_0x0061
                pe3.b r3 = r5.f130561e
                goto L_0x0062
            L_0x0061:
                r3 = r4
            L_0x0062:
                bl1.k$b r5 = bl1.C39786k.f106760i
                java.lang.String r5 = "Finder.BoxDataStore"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "get box redDot, boxId: "
                r6.append(r7)
                te3.lw0 r7 = r2.f131138d
                if (r7 == 0) goto L_0x0077
                java.lang.String r7 = r7.f137677e
                goto L_0x0078
            L_0x0077:
                r7 = r4
            L_0x0078:
                r6.append(r7)
                java.lang.String r7 = ", lastBuffer:"
                r6.append(r7)
                java.lang.String r7 = ""
                if (r3 == 0) goto L_0x009b
                byte[] r4 = r3.mo123703f()     // Catch:{ all -> 0x0093 }
                r8 = 2
                java.lang.String r4 = android.util.Base64.encodeToString(r4, r8)     // Catch:{ all -> 0x0093 }
                java.lang.String r8 = "encodeToString(this.toByteArray(), Base64.NO_WRAP)"
                gy3.C87412m.m108593f(r4, r8)     // Catch:{ all -> 0x0093 }
                goto L_0x009b
            L_0x0093:
                java.lang.String r4 = "Finder"
                java.lang.String r8 = "ByteString encode failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
                r4 = r7
            L_0x009b:
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                java.lang.String r6 = "str"
                gy3.C87412m.m108594g(r4, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "redDotFlowLog "
                r6.append(r8)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.v>> r4 = r1.f106766e
                java.lang.Object r4 = r4.getValue()
                java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
                if (r4 == 0) goto L_0x0011
                te3.lw0 r5 = r2.f131138d
                if (r5 == 0) goto L_0x00d0
                java.lang.String r5 = r5.f137677e
                if (r5 != 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00cf:
                r7 = r5
            L_0x00d0:
                bl1.v r5 = new bl1.v
                boolean r2 = r2.f131139e
                r5.<init>(r2, r3)
                java.lang.Object r2 = r4.put(r7, r5)
                bl1.v r2 = (bl1.C28333v) r2
                goto L_0x0011
            L_0x00df:
                bl1.k r10 = r9.f106805e
                androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.v>> r10 = r10.f106766e
                if (r10 == 0) goto L_0x00ee
                java.lang.Object r0 = r10.getValue()
                if (r0 == 0) goto L_0x00ee
                r10.setValue(r0)
            L_0x00ee:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: bl1.C39799n.C39800a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39799n(C50195kz0 kz02, C39786k kVar, C89132b<C50195kz0> bVar, C15601d<? super C39799n> dVar) {
        super(2, dVar);
        this.f106801e = kz02;
        this.f106802f = kVar;
        this.f106803g = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C39799n(this.f106801e, this.f106802f, this.f106803g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C39799n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f106800d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C39800a aVar2 = new C39800a(this.f106801e, this.f106802f, this.f106803g, (C15601d<? super C39800a>) null);
            this.f106800d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
