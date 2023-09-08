package androidx.compose.p002ui.platform;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", mo125469f = "Wrapper.android.kt", mo125470l = {154}, mo125471m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.z2 */
public final class C103712z2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f306300d;

    /* renamed from: e */
    public final /* synthetic */ WrappedComposition f306301e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103712z2(WrappedComposition wrappedComposition, C15601d<? super C103712z2> dVar) {
        super(2, dVar);
        this.f306301e = wrappedComposition;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C103712z2(this.f306301e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C103712z2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f306300d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AndroidComposeView androidComposeView = this.f306301e.f306042d;
            this.f306300d = 1;
            Object a = androidComposeView.f306014s.mo144775a(this);
            if (a != aVar) {
                a = C13598b0.f38549a;
            }
            if (a == aVar) {
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
