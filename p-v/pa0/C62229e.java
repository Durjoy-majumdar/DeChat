package pa0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import la0.C61242a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$getMusicState$1$4$1", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {823}, mo125471m = "invokeSuspend")
/* renamed from: pa0.e */
public final class C62229e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f176908d;

    /* renamed from: e */
    public final /* synthetic */ C61242a f176909e;

    /* renamed from: f */
    public final /* synthetic */ boolean f176910f;

    /* renamed from: g */
    public final /* synthetic */ boolean f176911g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62229e(C61242a aVar, boolean z, boolean z2, C15601d<? super C62229e> dVar) {
        super(2, dVar);
        this.f176909e = aVar;
        this.f176910f = z;
        this.f176911g = z2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62229e(this.f176909e, this.f176910f, this.f176911g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62229e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f176908d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C61242a aVar2 = this.f176909e;
            boolean z = this.f176910f;
            boolean z2 = this.f176911g;
            this.f176908d = 1;
            if (aVar2.mo86214Q2(z, z2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
