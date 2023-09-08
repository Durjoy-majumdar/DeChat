package gq3;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

@C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$isOcrResultSame$2", mo125469f = "ImageQueryViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: gq3.n */
public final class C8377n extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f27367d;

    /* renamed from: e */
    public final /* synthetic */ String f27368e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8377n(String str, String str2, C15601d<? super C8377n> dVar) {
        super(2, dVar);
        this.f27367d = str;
        this.f27368e = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8377n(this.f27367d, this.f27368e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8377n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.ImageQueryViewModel", "isOcrResultSame >> queryText: " + this.f27367d);
        boolean z = true;
        if (this.f27368e.length() > 0) {
            String str = this.f27367d;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z && C112550d0.m153803w(this.f27368e, this.f27367d, false, 2, (Object) null)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
