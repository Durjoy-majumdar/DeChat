package j82;

import a14.C0000n0;
import fy3.C32227p;
import j82.C108656b;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.MTRContext$ClosableInfo$close$2", mo125469f = "MTRContext.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: j82.a */
public final class C87907a extends C91594j implements C32227p<C0000n0, C15601d<? super Result<? extends C13598b0>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C108656b.C87908a f254441d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87907a(C108656b.C87908a aVar, C15601d<? super C87907a> dVar) {
        super(2, dVar);
        this.f254441d = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C87907a(this.f254441d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C87907a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ResultKt.throwOnFailure(obj);
        C108656b.C87908a aVar = this.f254441d;
        try {
            Result.Companion companion = Result.Companion;
            aVar.f254442a.close();
            obj2 = Result.m168114constructorimpl(C13598b0.f38549a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m168113boximpl(obj2);
    }
}
