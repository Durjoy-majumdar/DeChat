package androidx.compose.p002ui.platform;

import a14.C0000n0;
import android.view.Choreographer;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", mo125469f = "AndroidUiDispatcher.android.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.c0 */
public final class C54162c0 extends C91594j implements C32227p<C0000n0, C15601d<? super Choreographer>, Object> {
    public C54162c0(C15601d<? super C54162c0> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54162c0(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C54162c0((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return Choreographer.getInstance();
    }
}
