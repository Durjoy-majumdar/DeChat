package kl1;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.bulletcommet.FinderLiveHotCommentWidget$launchCntAnim$1", mo125469f = "FinderLiveHotCommentWidget.kt", mo125470l = {188}, mo125471m = "invokeSuspend")
/* renamed from: kl1.x */
public final class C10352x extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f31531d;

    /* renamed from: e */
    public final /* synthetic */ C10346v f31532e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10352x(C10346v vVar, C15601d<? super C10352x> dVar) {
        super(2, dVar);
        this.f31532e = vVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10352x(this.f31532e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10352x) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f31531d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f31531d = 1;
            if (C53965x0.m60607b(4000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f31532e.mo10644e();
        return C13598b0.f38549a;
    }
}
