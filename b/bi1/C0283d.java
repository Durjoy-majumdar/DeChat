package bi1;

import a14.C53916l;
import a14.C53921m;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: bi1.d */
public final class C0283d {

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.infrastructure.FinderCgiCommonKt", mo125469f = "FinderCgiCommon.kt", mo125470l = {112}, mo125471m = "request")
    /* renamed from: bi1.d$a */
    public static final class C0284a<Response extends C49335eu3> extends C66704d {

        /* renamed from: d */
        public Object f845d;

        /* renamed from: e */
        public Object f846e;

        /* renamed from: f */
        public /* synthetic */ Object f847f;

        /* renamed from: g */
        public int f848g;

        public C0284a(C15601d<? super C0284a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f847f = obj;
            this.f848g |= Integer.MIN_VALUE;
            return C0283d.m243a((C89132b) null, (C66212f) null, this);
        }
    }

    /* renamed from: bi1.d$b */
    public static final class C0285b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C117747y f849d;

        /* renamed from: e */
        public final /* synthetic */ C0286c f850e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0285b(C117747y yVar, C0286c cVar) {
            super(1);
            this.f849d = yVar;
            this.f850e = cVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C86709a0.m107524d().mo123470p(this.f849d.getType(), this.f850e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bi1.d$c */
    public static final class C0286c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C117747y f851d;

        /* renamed from: e */
        public final /* synthetic */ C53916l<T> f852e;

        /* renamed from: f */
        public final /* synthetic */ C32229r<Integer, Integer, String, C117747y, T> f853f;

        public C0286c(C117747y yVar, C53916l<? super T> lVar, C32229r<? super Integer, ? super Integer, ? super String, ? super C117747y, ? extends T> rVar) {
            this.f851d = yVar;
            this.f852e = lVar;
            this.f853f = rVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (C87412m.m108589b(yVar, this.f851d)) {
                C86709a0.m107524d().mo123470p(this.f851d.getType(), this);
                C53916l<T> lVar = this.f852e;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(this.f853f.mo162I(Integer.valueOf(i), Integer.valueOf(i2), str, yVar)));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: wx3.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <Response extends te3.C49335eu3> java.lang.Object m243a(ob0.C89132b<Response> r12, wx3.C66212f r13, wx3.C15601d<? super bi1.C0287e<? extends Response, bi1.C0280a>> r14) {
        /*
            boolean r0 = r14 instanceof bi1.C0283d.C0284a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            bi1.d$a r0 = (bi1.C0283d.C0284a) r0
            int r1 = r0.f848g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f848g = r1
            goto L_0x0018
        L_0x0013:
            bi1.d$a r0 = new bi1.d$a
            r0.<init>(r14)
        L_0x0018:
            r5 = r0
            java.lang.Object r14 = r5.f847f
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f848g
            java.lang.String r8 = "cgi: "
            java.lang.String r9 = "FinderCgiCommon"
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x003e
            if (r1 != r10) goto L_0x0036
            java.lang.Object r12 = r5.f846e
            r13 = r12
            wx3.f r13 = (wx3.C66212f) r13
            java.lang.Object r12 = r5.f845d
            ob0.b r12 = (ob0.C89132b) r12
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ d -> 0x0080, CancellationException -> 0x005a }
            goto L_0x0054
        L_0x0036:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f845d = r12     // Catch:{ d -> 0x0080, CancellationException -> 0x005a }
            r5.f846e = r13     // Catch:{ d -> 0x0080, CancellationException -> 0x005a }
            r5.f848g = r10     // Catch:{ d -> 0x0080, CancellationException -> 0x005a }
            r1 = r12
            java.lang.Object r14 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ d -> 0x0080, CancellationException -> 0x005a }
            if (r14 != r0) goto L_0x0054
            return r0
        L_0x0054:
            bi1.f r0 = new bi1.f     // Catch:{ d -> 0x0080, CancellationException -> 0x005a }
            r0.<init>(r14, r13)     // Catch:{ d -> 0x0080, CancellationException -> 0x005a }
            goto L_0x00a6
        L_0x005a:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r12)
            java.lang.String r12 = " catch CancellationException: "
            r0.append(r12)
            r0.append(r14)
            java.lang.String r12 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r12)
            bi1.b r0 = new bi1.b
            bi1.a r12 = new bi1.a
            r12.<init>(r11, r14, r10, r11)
            r0.<init>(r12, r13)
            goto L_0x00a6
        L_0x0080:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r12)
            java.lang.String r12 = " catch CgiException: "
            r0.append(r12)
            r0.append(r14)
            java.lang.String r12 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r12)
            bi1.b r0 = new bi1.b
            bi1.a r12 = new bi1.a
            r1 = 2
            r12.<init>(r14, r11, r1, r11)
            r0.<init>(r12, r13)
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bi1.C0283d.m243a(ob0.b, wx3.f, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public static final <T> Object m244b(C117747y yVar, C32229r<? super Integer, ? super Integer, ? super String, ? super C117747y, ? extends T> rVar, C15601d<? super T> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C0286c cVar = new C0286c(yVar, mVar, rVar);
        C86709a0.m107524d().mo123455a(yVar.getType(), cVar);
        mVar.mo74599v(new C0285b(yVar, cVar));
        C86709a0.m107524d().mo123460f(yVar);
        return mVar.mo74608o();
    }

    /* renamed from: c */
    public static /* synthetic */ Object m245c(C89132b bVar, C66212f fVar, C15601d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = null;
        }
        return m243a(bVar, fVar, dVar);
    }

    /* renamed from: d */
    public static final <Resp extends C49335eu3> boolean m246d(C89132b.C89134c<Resp> cVar) {
        return (cVar != null && cVar.f256793a == 0) && cVar.f256794b == 0;
    }
}
