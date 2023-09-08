package q40;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import kotlin.Result;
import kotlin.ResultKt;
import mp3.C88819d;
import nr3.C89059e;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ktx.CgiKt$await$2", mo125469f = "Cgi.kt", mo125470l = {131}, mo125471m = "invokeSuspend")
/* renamed from: q40.a */
public final class C47751a extends C91594j implements C32227p<C0000n0, C15601d<C49335eu3>, Object> {

    /* renamed from: d */
    public Object f128268d;

    /* renamed from: e */
    public Object f128269e;

    /* renamed from: f */
    public int f128270f;

    /* renamed from: g */
    public final /* synthetic */ C89132b<C49335eu3> f128271g;

    /* renamed from: h */
    public final /* synthetic */ C88819d f128272h;

    /* renamed from: q40.a$a */
    public static final class C47752a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89059e<C13598b0> f128273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47752a(C89059e<C13598b0> eVar) {
            super(1);
            this.f128273d = eVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f128273d.dead();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q40.a$b */
    public static final class C47753b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C53916l<C49335eu3> f128274a;

        public C47753b(C53916l<C49335eu3> lVar) {
            this.f128274a = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && cVar.f256796d != null) {
                cVar.f256798f.dead();
                C53916l<C49335eu3> lVar = this.f128274a;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(cVar.f256796d));
            } else {
                C53916l<C49335eu3> lVar2 = this.f128274a;
                String str = cVar.f256798f.f256789f.f127057c;
                C87412m.m108593f(str, "cgiBack.cgi.reqResp.uri");
                int i = cVar.f256793a;
                int i2 = cVar.f256794b;
                String str2 = cVar.f256795c;
                T t = cVar.f256796d;
                C87412m.m108593f(t, "cgiBack.resp");
                C12040d dVar = new C12040d(str, i, i2, str2, t);
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(dVar)));
                cVar.f256798f.dead();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47751a(C89132b<C49335eu3> bVar, C88819d dVar, C15601d<? super C47751a> dVar2) {
        super(2, dVar2);
        this.f128271g = bVar;
        this.f128272h = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47751a(this.f128271g, this.f128272h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47751a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f128270f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C89132b<C49335eu3> bVar = this.f128271g;
            C88819d dVar = this.f128272h;
            this.f128268d = bVar;
            this.f128269e = dVar;
            this.f128270f = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            mVar.mo74599v(new C47752a(bVar.mo9225i().mo123421I(dVar, new C47753b(mVar))));
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C88819d dVar2 = (C88819d) this.f128269e;
            C89132b bVar2 = (C89132b) this.f128268d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
