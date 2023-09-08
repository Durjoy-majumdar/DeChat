package p51;

import a14.C53916l;
import a14.C53921m;
import fy3.C32226l;
import gy3.C87413o;
import hp3.C87581a;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: p51.b */
public final class C110175b {

    /* renamed from: p51.b$a */
    public static final class C110176a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C53916l<Response> f329597a;

        public C110176a(C53916l<? super Response> lVar) {
            this.f329597a = lVar;
        }

        public Object call(Object obj) {
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && (t = cVar.f256796d) != null) {
                this.f329597a.resumeWith(Result.m168114constructorimpl(t));
            } else {
                C53916l<Response> lVar = this.f329597a;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C110174a(cVar.f256793a, cVar.f256794b, cVar.f256795c))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: p51.b$b */
    public static final class C110177b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46566c<C9486a> f329598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110177b(C46566c<C9486a> cVar) {
            super(1);
            this.f329598d = cVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f329598d.dead();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final <Response extends C49335eu3> Object m149770a(C89132b<Response> bVar, C15601d<? super Response> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C46566c cVar = new C46566c();
        bVar.mo9225i().mo11397F(cVar).mo123420E(new C110176a(mVar));
        mVar.mo74599v(new C110177b(cVar));
        return mVar.mo74608o();
    }
}
