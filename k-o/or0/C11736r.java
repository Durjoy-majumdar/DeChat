package or0;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$uploadScreenshotToCdnSuspended$screenshot$1", mo125469f = "WxaShortLinkRiskManager.kt", mo125470l = {55}, mo125471m = "invokeSuspend")
/* renamed from: or0.r */
public final class C11736r extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

    /* renamed from: d */
    public Object f34344d;

    /* renamed from: e */
    public int f34345e;

    /* renamed from: f */
    public final /* synthetic */ C83928t1 f34346f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11736r(C83928t1 t1Var, C15601d<? super C11736r> dVar) {
        super(2, dVar);
        this.f34346f = t1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11736r(this.f34346f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11736r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f34345e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C83928t1 t1Var = this.f34346f;
            this.f34344d = t1Var;
            this.f34345e = 1;
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(t1Var.mo116159N0()));
            obj = hVar.mo90314b();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C83928t1 t1Var2 = (C83928t1) this.f34344d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
