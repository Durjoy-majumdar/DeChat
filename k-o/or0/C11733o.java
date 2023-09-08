package or0;

import a14.C0000n0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$uploadScreenshotToCdn$1", mo125469f = "WxaShortLinkRiskManager.kt", mo125470l = {49}, mo125471m = "invokeSuspend")
/* renamed from: or0.o */
public final class C11733o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f34333d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f34334e;

    /* renamed from: f */
    public final /* synthetic */ String f34335f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11733o(C83928t1 t1Var, String str, C15601d<? super C11733o> dVar) {
        super(2, dVar);
        this.f34334e = t1Var;
        this.f34335f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11733o(this.f34334e, this.f34335f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11733o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f34333d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WxaShortLinkRiskManager wxaShortLinkRiskManager = WxaShortLinkRiskManager.f11879a;
            C83928t1 t1Var = this.f34334e;
            String str = this.f34335f;
            this.f34333d = 1;
            if (WxaShortLinkRiskManager.m1951a(wxaShortLinkRiskManager, t1Var, str, this) == aVar) {
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
