package p152f0;

import a14.C0000n0;
import com.tencent.midas.data.APMidasPluginInfo;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p257w.C111626b;
import p257w.C37902h0;
import p257w.C37903i;
import p257w.C37907l;
import p257w.C37908l0;
import p257w.C37924q0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", mo125469f = "TextFieldCursor.kt", mo125470l = {49}, mo125471m = "invokeSuspend")
/* renamed from: f0.j1 */
public final class C31748j1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f84766d;

    /* renamed from: e */
    public final /* synthetic */ C111626b<Float, C37907l> f84767e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31748j1(C111626b<Float, C37907l> bVar, C15601d<? super C31748j1> dVar) {
        super(2, dVar);
        this.f84767e = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C31748j1(this.f84767e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C31748j1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f84766d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C111626b<Float, C37907l> bVar = this.f84767e;
            Float f = new Float(0.0f);
            float f2 = C31750n1.f84769a;
            C31749m1 m1Var = C31749m1.f84768d;
            C87412m.m108594g(m1Var, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            C37908l0.C37910b bVar2 = new C37908l0.C37910b();
            m1Var.invoke(bVar2);
            C37902h0 a = C37903i.m41593a(new C37908l0(bVar2), (C37924q0) null, 0, 6, (Object) null);
            this.f84766d = 1;
            if (C111626b.m152137b(bVar, f, a, (Object) null, (C32226l) null, this, 12, (Object) null) == aVar) {
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
