package qj2;

import a14.C0000n0;
import d14.C58052j1;
import fy3.C32227p;
import java.util.List;
import kotlin.ResultKt;
import pj2.C62318a;
import qj2.C63183a;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.exclusive.ExclusiveDataViewModel$noExclusiveHasBeenSet$1", mo125469f = "ExclusiveDataViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: qj2.e */
public final class C63191e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C63183a f179290d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63191e(C63183a aVar, C15601d<? super C63191e> dVar) {
        super(2, dVar);
        this.f179290d = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63191e(this.f179290d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63191e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ((C58052j1) this.f179290d.f179274f).setValue(new C63183a.C63184a.C63185a((List<C62318a>) null, 3));
        return C13598b0.f38549a;
    }
}
