package q40;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import hp3.C87581a;
import kotlin.Result;
import kotlin.ResultKt;
import mp3.C88819d;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;
import ug3.C90661f;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: q40.b */
public final class C89456b {

    @C91590f(mo125468c = "com.tencent.mm.ktx.CgiKt", mo125469f = "Cgi.kt", mo125470l = {56}, mo125471m = "awaitReq")
    /* renamed from: q40.b$a */
    public static final class C89457a<Response extends C49335eu3> extends C66704d {

        /* renamed from: d */
        public Object f257499d;

        /* renamed from: e */
        public /* synthetic */ Object f257500e;

        /* renamed from: f */
        public int f257501f;

        public C89457a(C15601d<? super C89457a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f257500e = obj;
            this.f257501f |= Integer.MIN_VALUE;
            return C89456b.m111832b((C89132b) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.ktx.CgiKt$awaitReq$2", mo125469f = "Cgi.kt", mo125470l = {131}, mo125471m = "invokeSuspend")
    /* renamed from: q40.b$b */
    public static final class C89458b extends C91594j implements C32227p<C0000n0, C15601d<? super C89132b.C89134c<Response>>, Object> {

        /* renamed from: d */
        public Object f257502d;

        /* renamed from: e */
        public int f257503e;

        /* renamed from: f */
        public final /* synthetic */ C89132b<Response> f257504f;

        /* renamed from: q40.b$b$a */
        public static final class C89459a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C89059e<C89132b.C89134c<Response>> f257505a;

            /* renamed from: b */
            public final /* synthetic */ C53916l<C89132b.C89134c<Response>> f257506b;

            public C89459a(C89059e<C89132b.C89134c<Response>> eVar, C53916l<? super C89132b.C89134c<Response>> lVar) {
                this.f257505a = eVar;
                this.f257506b = lVar;
            }

            public Object call(Object obj) {
                this.f257505a.dead();
                this.f257506b.resumeWith(Result.m168114constructorimpl((C89132b.C89134c) obj));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: q40.b$b$b */
        public static final class C89460b extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89059e<C89132b.C89134c<Response>> f257507d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89460b(C89059e<C89132b.C89134c<Response>> eVar) {
                super(1);
                this.f257507d = eVar;
            }

            public Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                this.f257507d.dead();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89458b(C89132b<Response> bVar, C15601d<? super C89458b> dVar) {
            super(2, dVar);
            this.f257504f = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C89458b(this.f257504f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C89458b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f257503e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C89132b<Response> bVar = this.f257504f;
                this.f257502d = bVar;
                this.f257503e = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                C47350c cVar = bVar.f256789f;
                int i2 = cVar != null ? cVar.f127058d : 0;
                C90661f fVar = new C90661f("Cgi_" + i2);
                C89059e<C89132b.C89134c<Response>> i3 = bVar.mo9225i();
                i3.mo123421I(fVar, new C89459a(i3, mVar));
                mVar.mo74599v(new C89460b(i3));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89132b bVar2 = (C89132b) this.f257502d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* renamed from: a */
    public static Object m111831a(C89132b bVar, long j, C88819d dVar, C15601d dVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        if ((i & 2) != 0) {
            dVar = null;
        }
        return C53860b3.m60374b(j, new C47751a(bVar, dVar, (C15601d<? super C47751a>) null), dVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <Response extends te3.C49335eu3> java.lang.Object m111832b(ob0.C89132b<Response> r8, wx3.C15601d<? super ob0.C89132b.C89134c<Response>> r9) {
        /*
            boolean r0 = r9 instanceof q40.C89456b.C89457a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            q40.b$a r0 = (q40.C89456b.C89457a) r0
            int r1 = r0.f257501f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f257501f = r1
            goto L_0x0018
        L_0x0013:
            q40.b$a r0 = new q40.b$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f257500e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f257501f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.f257499d
            ob0.b r8 = (ob0.C89132b) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x004a
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r9)
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            q40.b$b r9 = new q40.b$b
            r2 = 0
            r9.<init>(r8, r2)
            r0.f257499d = r8
            r0.f257501f = r3
            java.lang.Object r9 = a14.C53860b3.m60375c(r4, r9, r0)
            if (r9 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r7 = r8
            ob0.b$c r9 = (ob0.C89132b.C89134c) r9
            if (r9 != 0) goto L_0x005c
            r2 = 3
            r3 = -13
            r5 = 0
            ob0.b$d<_Resp> r6 = r7.f256787d
            java.lang.String r4 = "Timeout"
            ob0.b$c r8 = ob0.C89132b.C89134c.m111401a(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x005c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q40.C89456b.m111832b(ob0.b, wx3.d):java.lang.Object");
    }
}
