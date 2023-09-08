package cm1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53921m;
import a14.C53934p0;
import cm1.C0742j2;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import di3.C86312j;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66217g;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SetProfileCoverViewModel$unSetProfileCover$1", mo125469f = "SetProfileCoverViewModel.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
/* renamed from: cm1.p2 */
public final class C0765p2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f1804d;

    /* renamed from: e */
    public final /* synthetic */ C0742j2 f1805e;

    /* renamed from: f */
    public final /* synthetic */ C0742j2.C0743a f1806f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SetProfileCoverViewModel$unSetProfileCover$1$1", mo125469f = "SetProfileCoverViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cm1.p2$a */
    public static final class C0766a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0742j2.C0743a f1807d;

        /* renamed from: e */
        public final /* synthetic */ C13604l<Integer, String> f1808e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0766a(C0742j2.C0743a aVar, C13604l<Integer, String> lVar, C15601d<? super C0766a> dVar) {
            super(2, dVar);
            this.f1807d = aVar;
            this.f1808e = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0766a(this.f1807d, this.f1808e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0766a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f1807d.mo704a("", 0, ((Number) this.f1808e.f38555d).intValue(), (String) this.f1808e.f38556e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0765p2(C0742j2 j2Var, C0742j2.C0743a aVar, C15601d<? super C0765p2> dVar) {
        super(2, dVar);
        this.f1805e = j2Var;
        this.f1806f = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0765p2(this.f1805e, this.f1806f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0765p2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f1804d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0742j2 j2Var = this.f1805e;
            this.f1804d = 1;
            j2Var.getClass();
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            mVar.mo74599v(new C0746k2(mVar));
            j2Var.f1763d = new C0749l2(mVar);
            ((C3605p1) C86312j.m106911c(C3605p1.class)).mo3986l9("", j2Var.f1763d);
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0742j2 j2Var2 = this.f1805e;
        C0766a aVar2 = new C0766a(this.f1806f, (C13604l) obj, (C15601d<? super C0766a>) null);
        C53895h.m60465c(j2Var2.getMainScope(), C66217g.f190253d, C53934p0.DEFAULT, aVar2);
        return C13598b0.f38549a;
    }
}
