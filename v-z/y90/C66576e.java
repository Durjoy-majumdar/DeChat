package y90;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import la0.C61242a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$getMusicState$1$4$1", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {456}, mo125471m = "invokeSuspend")
/* renamed from: y90.e */
public final class C66576e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f191458d;

    /* renamed from: e */
    public final /* synthetic */ C61242a f191459e;

    /* renamed from: f */
    public final /* synthetic */ boolean f191460f;

    /* renamed from: g */
    public final /* synthetic */ boolean f191461g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66576e(C61242a aVar, boolean z, boolean z2, C15601d<? super C66576e> dVar) {
        super(2, dVar);
        this.f191459e = aVar;
        this.f191460f = z;
        this.f191461g = z2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66576e(this.f191459e, this.f191460f, this.f191461g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66576e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f191458d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C61242a aVar2 = this.f191459e;
            boolean z = this.f191460f;
            boolean z2 = this.f191461g;
            this.f191458d = 1;
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
