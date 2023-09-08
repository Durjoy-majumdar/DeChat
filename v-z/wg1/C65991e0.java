package wg1;

import a14.C0000n0;
import cj1.C54768h6;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$playMusic$1$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {233}, mo125471m = "invokeSuspend")
/* renamed from: wg1.e0 */
public final class C65991e0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f189727d;

    /* renamed from: e */
    public final /* synthetic */ C65954a0 f189728e;

    /* renamed from: f */
    public final /* synthetic */ boolean f189729f;

    /* renamed from: g */
    public final /* synthetic */ C54768h6 f189730g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65991e0(C65954a0 a0Var, boolean z, C54768h6 h6Var, C15601d<? super C65991e0> dVar) {
        super(2, dVar);
        this.f189728e = a0Var;
        this.f189729f = z;
        this.f189730g = h6Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65991e0(this.f189728e, this.f189729f, this.f189730g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65991e0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f189727d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65954a0 a0Var = this.f189728e;
            int i2 = this.f189729f ? 3 : 1;
            Integer num = new Integer(this.f189730g.f153498a.f144442d);
            this.f189727d = 1;
            if (C65954a0.m77683j0(a0Var, i2, num, 0, this, 4, (Object) null) == aVar) {
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
