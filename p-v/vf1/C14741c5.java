package vf1;

import a14.C0000n0;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy3.C32227p;
import kotlin.ResultKt;
import ky2.C10432i;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI$getGuardianContact$2", mo125469f = "FinderTeenModeLimitUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: vf1.c5 */
public final class C14741c5 extends C91594j implements C32227p<C0000n0, C15601d<? super C72996z1>, Object> {
    public C14741c5(C15601d<? super C14741c5> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14741c5(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C14741c5((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return ((C10432i) C86312j.m106911c(C10432i.class)).mo10736BD();
    }
}
