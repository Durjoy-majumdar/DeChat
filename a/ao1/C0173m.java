package ao1;

import a14.C0000n0;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import it1.C9247b;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.post.PostCreateContactUIC$requestAvatarUrl$1$1$2", mo125469f = "PostCreateContactUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ao1.m */
public final class C0173m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0166l f636d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0173m(C0166l lVar, C15601d<? super C0173m> dVar) {
        super(2, dVar);
        this.f636d = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0173m(this.f636d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0173m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C9247b bVar = this.f636d.f620e;
        if (bVar != null) {
            bVar.mo8913b();
        }
        C76912y0.m92773l(this.f636d.getContext(), this.f636d.getString(C0966R.string.d5b));
        return C13598b0.f38549a;
    }
}
