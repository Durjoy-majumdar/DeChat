package p61;

import a14.C53916l;
import a14.C53921m;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: p61.d0 */
public final class C35375d0 {

    /* renamed from: p61.d0$a */
    public static final class C35376a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ T f94715d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C11385n> f94716e;

        /* renamed from: f */
        public final /* synthetic */ C53916l<T> f94717f;

        public C35376a(T t, C8479f0<C11385n> f0Var, C53916l<? super T> lVar) {
            this.f94715d = t;
            this.f94716e = f0Var;
            this.f94717f = lVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (C87412m.m108589b(yVar, this.f94715d)) {
                C86709a0.m107529k().f251779b.mo123470p(this.f94715d.getType(), (C11385n) this.f94716e.f27484d);
                if (i == 0 && i2 == 0) {
                    C53916l<T> lVar = this.f94717f;
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(this.f94715d));
                    return;
                }
                C53916l<T> lVar2 = this.f94717f;
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C35374c0(i, i2, str))));
            }
        }
    }

    /* renamed from: p61.d0$b */
    public static final class C35377b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ T f94718d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C11385n> f94719e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35377b(T t, C8479f0<C11385n> f0Var) {
            super(1);
            this.f94718d = t;
            this.f94719e = f0Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C86709a0.m107529k().f251779b.mo123470p(this.f94718d.getType(), (C11385n) this.f94719e.f27484d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final <T extends C117747y> Object m40668a(T t, C15601d<? super T> dVar) {
        C8479f0 f0Var = new C8479f0();
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        f0Var.f27484d = new C35376a(t, f0Var, mVar);
        C86709a0.m107529k().f251779b.mo123455a(t.getType(), (C11385n) f0Var.f27484d);
        C86709a0.m107529k().f251779b.mo123460f(t);
        mVar.mo74599v(new C35377b(t, f0Var));
        return mVar.mo74608o();
    }
}
