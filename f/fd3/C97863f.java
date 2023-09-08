package fd3;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import fd3.C97867h;
import fd3.C97872k;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.pluginsdk.manager.CGIParallelUploaderKtKt$syncUpload$2", mo125469f = "CGIParallelUploaderKt.kt", mo125470l = {36}, mo125471m = "invokeSuspend")
/* renamed from: fd3.f */
public final class C97863f extends C91594j implements C32227p<C0000n0, C15601d<? super C97866g>, Object> {

    /* renamed from: d */
    public Object f287070d;

    /* renamed from: e */
    public Object f287071e;

    /* renamed from: f */
    public int f287072f;

    /* renamed from: g */
    public final /* synthetic */ C97860d f287073g;

    /* renamed from: h */
    public final /* synthetic */ C97867h f287074h;

    /* renamed from: fd3.f$a */
    public static final class C97864a implements C97867h.C97868a {

        /* renamed from: a */
        public final /* synthetic */ C53916l<C97866g> f287075a;

        /* renamed from: b */
        public final /* synthetic */ C97867h f287076b;

        public C97864a(C53916l<? super C97866g> lVar, C97867h hVar) {
            this.f287075a = lVar;
            this.f287076b = hVar;
        }

        /* renamed from: a */
        public void mo127086a(int i, String str) {
            C53916l<C97866g> lVar = this.f287075a;
            C97866g gVar = new C97866g(C97862e.Fail, this.f287076b);
            gVar.f287080c = i;
            gVar.f287081d = str;
            lVar.resumeWith(Result.m168114constructorimpl(gVar));
        }

        /* renamed from: b */
        public void mo127087b(C97872k.C97873a aVar) {
            C53916l<C97866g> lVar = this.f287075a;
            C97866g gVar = new C97866g(C97862e.Success, this.f287076b);
            gVar.f287079b = aVar;
            lVar.resumeWith(Result.m168114constructorimpl(gVar));
        }

        /* renamed from: c */
        public void mo127088c(float f, long j) {
        }
    }

    /* renamed from: fd3.f$b */
    public static final class C97865b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97860d f287077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97865b(C97860d dVar) {
            super(1);
            this.f287077d = dVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f287077d.mo137190c();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97863f(C97860d dVar, C97867h hVar, C15601d<? super C97863f> dVar2) {
        super(2, dVar2);
        this.f287073g = dVar;
        this.f287074h = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C97863f(this.f287073g, this.f287074h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97863f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f287072f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C97860d dVar = this.f287073g;
            C97867h hVar = this.f287074h;
            this.f287070d = dVar;
            this.f287071e = hVar;
            this.f287072f = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            if (dVar.mo137189b(hVar)) {
                hVar.f287084c = new C97864a(mVar, hVar);
            } else {
                Result.Companion companion = Result.Companion;
                mVar.resumeWith(Result.m168114constructorimpl(new C97866g(C97862e.StartFail, hVar)));
            }
            mVar.mo74599v(new C97865b(dVar));
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C97867h hVar2 = (C97867h) this.f287071e;
            C97860d dVar2 = (C97860d) this.f287070d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
