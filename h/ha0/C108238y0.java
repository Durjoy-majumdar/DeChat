package ha0;

import a14.C53916l;
import c14.C54624g;
import c14.C54630l;
import c14.C54647v;
import com.tencent.maas.MJMaasCore;
import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.MJTaskTrace;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C58018b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ja0.C108679b;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66217g;
import wx3.C66218h;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ha0.y0 */
public final class C108238y0 {

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.UtilsKt$asyncTaskWrapper$1", mo125469f = "Utils.kt", mo125470l = {143, 125}, mo125471m = "invokeSuspend")
    /* renamed from: ha0.y0$a */
    public static final class C108239a extends C91594j implements C32227p<C54647v<? super Float>, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f324094d;

        /* renamed from: e */
        public Object f324095e;

        /* renamed from: f */
        public Object f324096f;

        /* renamed from: g */
        public int f324097g;

        /* renamed from: h */
        public /* synthetic */ Object f324098h;

        /* renamed from: i */
        public final /* synthetic */ C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> f324099i;

        /* renamed from: j */
        public final /* synthetic */ String f324100j;

        /* renamed from: n */
        public final /* synthetic */ C32226l<MJAsyncTaskInfo, C13598b0> f324101n;

        /* renamed from: ha0.y0$a$d */
        public static final class C32748d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f89130d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C32748d(String str) {
                super(0);
                this.f89130d = str;
            }

            public Object invoke() {
                Log.m105924i("MaasFuncUtils", this.f89130d + " call close");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ha0.y0$a$a */
        public static final class C108240a extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f324102d;

            /* renamed from: e */
            public final /* synthetic */ long f324103e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<MJAsyncTaskInfo, C13598b0> f324104f;

            /* renamed from: g */
            public final /* synthetic */ MJAsyncTaskInfo f324105g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C108240a(String str, long j, C32226l<? super MJAsyncTaskInfo, C13598b0> lVar, MJAsyncTaskInfo mJAsyncTaskInfo) {
                super(1);
                this.f324102d = str;
                this.f324103e = j;
                this.f324104f = lVar;
                this.f324105g = mJAsyncTaskInfo;
            }

            public Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                C108679b bVar = C108679b.f325464a;
                String str = this.f324102d;
                C87412m.m108594g(str, "funName");
                bVar.mo159696c(100, str, "cancel", System.currentTimeMillis() - this.f324103e);
                this.f324104f.invoke(this.f324105g);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ha0.y0$a$b */
        public static final class C108241b implements MJMovieSession.OnTaskProgress {

            /* renamed from: a */
            public final /* synthetic */ C54647v<Float> f324106a;

            /* renamed from: b */
            public final /* synthetic */ String f324107b;

            public C108241b(C54647v<? super Float> vVar, String str) {
                this.f324106a = vVar;
                this.f324107b = str;
            }

            public final void onTaskProgress(float f, MJTaskTrace mJTaskTrace) {
                if (this.f324106a.mo75539t(Float.valueOf(f)) instanceof C54630l.C54632b) {
                    Log.m105920e("MaasFuncUtils", this.f324107b + " try send error " + f);
                }
            }
        }

        /* renamed from: ha0.y0$a$c */
        public static final class C108242c implements MJMovieSession.OnComplete {

            /* renamed from: a */
            public final /* synthetic */ C53916l<C13598b0> f324108a;

            /* renamed from: b */
            public final /* synthetic */ String f324109b;

            /* renamed from: c */
            public final /* synthetic */ long f324110c;

            public C108242c(C53916l<? super C13598b0> lVar, String str, long j) {
                this.f324108a = lVar;
                this.f324109b = str;
                this.f324110c = j;
            }

            public final void onComplete(MJError mJError) {
                if (!this.f324108a.mo74597a()) {
                    Log.m105920e("MaasFuncUtils", this.f324109b + " already resumed");
                } else if (mJError != null) {
                    C108679b.f325464a.mo159694a(this.f324109b, mJError, System.currentTimeMillis() - this.f324110c);
                    C53916l<C13598b0> lVar = this.f324108a;
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C108236x0(mJError))));
                } else {
                    this.f324108a.mo74596X(C13598b0.f38549a, (C32226l<? super Throwable, C13598b0>) null);
                    C108679b.f325464a.mo159695b(this.f324109b, System.currentTimeMillis() - this.f324110c);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108239a(C32227p<? super MJMovieSession.OnTaskProgress, ? super MJMovieSession.OnComplete, ? extends MJAsyncTaskInfo> pVar, String str, C32226l<? super MJAsyncTaskInfo, C13598b0> lVar, C15601d<? super C108239a> dVar) {
            super(2, dVar);
            this.f324099i = pVar;
            this.f324100j = str;
            this.f324101n = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C108239a aVar = new C108239a(this.f324099i, this.f324100j, this.f324101n, dVar);
            aVar.f324098h = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108239a) create((C54647v) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: c14.v} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f324097g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00c6
            L_0x0011:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0019:
                java.lang.Object r1 = r13.f324096f
                fy3.l r1 = (fy3.C32226l) r1
                java.lang.Object r1 = r13.f324095e
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r13.f324094d
                fy3.p r1 = (fy3.C32227p) r1
                java.lang.Object r1 = r13.f324098h
                c14.v r1 = (c14.C54647v) r1
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00a6
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.f324098h
                r1 = r14
                c14.v r1 = (c14.C54647v) r1
                fy3.p<com.tencent.maas.instamovie.MJMovieSession$OnTaskProgress, com.tencent.maas.instamovie.MJMovieSession$OnComplete, com.tencent.maas.instamovie.MJAsyncTaskInfo> r14 = r13.f324099i
                java.lang.String r5 = r13.f324100j
                fy3.l<com.tencent.maas.instamovie.MJAsyncTaskInfo, rx3.b0> r8 = r13.f324101n
                r13.f324098h = r1
                r13.f324094d = r14
                r13.f324095e = r5
                r13.f324096f = r8
                r13.f324097g = r3
                a14.m r10 = new a14.m
                wx3.d r4 = xx3.C66447b.m78392b(r13)
                r10.<init>(r4, r3)
                r10.mo74609p()
                long r6 = java.lang.System.currentTimeMillis()
                ha0.y0$a$b r4 = new ha0.y0$a$b
                r4.<init>(r1, r5)
                ha0.y0$a$c r9 = new ha0.y0$a$c
                r9.<init>(r10, r5, r6)
                java.lang.Object r14 = r14.invoke(r4, r9)
                r9 = r14
                com.tencent.maas.instamovie.MJAsyncTaskInfo r9 = (com.tencent.maas.instamovie.MJAsyncTaskInfo) r9
                com.tencent.maas.instamovie.base.MJError r14 = r9.error
                if (r14 == 0) goto L_0x0096
                boolean r14 = r10.mo74597a()
                if (r14 == 0) goto L_0x0096
                ja0.b r14 = ja0.C108679b.f325464a
                com.tencent.maas.instamovie.base.MJError r4 = r9.error
                java.lang.String r11 = "task.error"
                gy3.C87412m.m108593f(r4, r11)
                long r11 = java.lang.System.currentTimeMillis()
                long r11 = r11 - r6
                r14.mo159694a(r5, r4, r11)
                kotlin.Result$Companion r14 = kotlin.Result.Companion
                ha0.x0 r14 = new ha0.x0
                com.tencent.maas.instamovie.base.MJError r4 = r9.error
                r14.<init>(r4)
                java.lang.Object r14 = kotlin.ResultKt.createFailure(r14)
                java.lang.Object r14 = kotlin.Result.m168114constructorimpl(r14)
                r10.resumeWith(r14)
            L_0x0096:
                ha0.y0$a$a r14 = new ha0.y0$a$a
                r4 = r14
                r4.<init>(r5, r6, r8, r9)
                r10.mo74599v(r14)
                java.lang.Object r14 = r10.mo74608o()
                if (r14 != r0) goto L_0x00a6
                return r0
            L_0x00a6:
                c14.b0 r14 = r1.getChannel()
                r4 = 0
                c14.C54612b0.C54613a.m61404a(r14, r4, r3, r4)
                ha0.y0$a$d r14 = new ha0.y0$a$d
                java.lang.String r3 = r13.f324100j
                r14.<init>(r3)
                r13.f324098h = r4
                r13.f324094d = r4
                r13.f324095e = r4
                r13.f324096f = r4
                r13.f324097g = r2
                java.lang.Object r14 = c14.C54643t.m61515a(r1, r14, r13)
                if (r14 != r0) goto L_0x00c6
                return r0
            L_0x00c6:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ha0.C108238y0.C108239a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ha0.y0$b */
    public static final class C108243b implements MJMovieSession.OnComplete {

        /* renamed from: a */
        public final /* synthetic */ C15601d<Boolean> f324111a;

        /* renamed from: b */
        public final /* synthetic */ String f324112b;

        /* renamed from: c */
        public final /* synthetic */ long f324113c;

        public C108243b(C15601d<? super Boolean> dVar, String str, long j) {
            this.f324111a = dVar;
            this.f324112b = str;
            this.f324113c = j;
        }

        public final void onComplete(MJError mJError) {
            if (mJError != null) {
                Log.m105921e("MaasFuncUtils", mJError.f154609ec + ' ' + mJError.message, new Throwable());
                C15601d<Boolean> dVar = this.f324111a;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                C108679b.f325464a.mo159694a(this.f324112b, mJError, System.currentTimeMillis() - this.f324113c);
                return;
            }
            C15601d<Boolean> dVar2 = this.f324111a;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }

    /* renamed from: ha0.y0$c */
    public static final class C108244c implements MJMaasCore.OnComplete {

        /* renamed from: a */
        public final /* synthetic */ String f324114a;

        /* renamed from: b */
        public final /* synthetic */ C15601d<Boolean> f324115b;

        /* renamed from: c */
        public final /* synthetic */ long f324116c;

        public C108244c(String str, C15601d<? super Boolean> dVar, long j) {
            this.f324114a = str;
            this.f324115b = dVar;
            this.f324116c = j;
        }

        public final void onComplete(MJError mJError) {
            if (mJError != null) {
                Log.m105921e("MaasFuncUtils", this.f324114a + " call error: " + mJError.f154609ec + ' ' + mJError.message, new Throwable());
                C15601d<Boolean> dVar = this.f324115b;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                C108679b.f325464a.mo159694a(this.f324114a, mJError, System.currentTimeMillis() - this.f324116c);
                return;
            }
            C15601d<Boolean> dVar2 = this.f324115b;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            C108679b.f325464a.mo159695b(this.f324114a, System.currentTimeMillis() - this.f324116c);
        }
    }

    /* renamed from: a */
    public static final C45252f<Float> m146562a(String str, C32227p<? super MJMovieSession.OnTaskProgress, ? super MJMovieSession.OnComplete, ? extends MJAsyncTaskInfo> pVar, C32226l<? super MJAsyncTaskInfo, C13598b0> lVar) {
        C87412m.m108594g(str, "funcName");
        C87412m.m108594g(pVar, "block");
        C87412m.m108594g(lVar, "onCancel");
        return new C58018b(new C108239a(pVar, str, lVar, (C15601d<? super C108239a>) null), C66217g.f190253d, -2, C54624g.SUSPEND);
    }

    /* renamed from: b */
    public static final Object m146563b(String str, C32226l<? super MJMovieSession.OnComplete, ? extends MJError> lVar, C15601d<? super Boolean> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        long currentTimeMillis = System.currentTimeMillis();
        MJError mJError = (MJError) lVar.invoke(new C108243b(hVar, str, currentTimeMillis));
        if (mJError != null) {
            Log.m105921e("MaasFuncUtils", str + " call error: " + mJError.f154609ec + ' ' + mJError.message, new Throwable());
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            C108679b.f325464a.mo159694a(str, mJError, System.currentTimeMillis() - currentTimeMillis);
        }
        return hVar.mo90314b();
    }

    /* renamed from: c */
    public static final Object m146564c(String str, C32226l<? super MJMaasCore.OnComplete, ? extends MJError> lVar, C15601d<? super Boolean> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        long currentTimeMillis = System.currentTimeMillis();
        MJError mJError = (MJError) lVar.invoke(new C108244c(str, hVar, currentTimeMillis));
        if (mJError != null) {
            Log.m105921e("MaasFuncUtils", str + " call error: " + mJError.f154609ec + ' ' + mJError.message, new Throwable());
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            C108679b.f325464a.mo159694a(str, mJError, System.currentTimeMillis() - currentTimeMillis);
        }
        return hVar.mo90314b();
    }
}
