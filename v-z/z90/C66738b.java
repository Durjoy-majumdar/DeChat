package z90;

import a14.C0000n0;
import com.tencent.p014mm.mj_template.album_template.multi_template.MMMusicManager;
import fy3.C32227p;
import kotlin.ResultKt;
import na0.C61630a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$release$1", mo125469f = "MMMusicManager.kt", mo125470l = {217}, mo125471m = "invokeSuspend")
/* renamed from: z90.b */
public final class C66738b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f191775d;

    /* renamed from: e */
    public final /* synthetic */ MMMusicManager f191776e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66738b(MMMusicManager mMMusicManager, C15601d<? super C66738b> dVar) {
        super(2, dVar);
        this.f191776e = mMMusicManager;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66738b(this.f191776e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66738b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f191775d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C61630a aVar2 = this.f191776e.f157436n;
            if (aVar2 != null) {
                this.f191775d = 1;
                if (aVar2.mo86581d(this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f191776e.f157436n = null;
        return C13598b0.f38549a;
    }
}
