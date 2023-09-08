package qj1;

import a14.C0000n0;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C0691u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di1.C7333c;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C48648a11;
import te3.C51503u71;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$checkWishEnable$$inlined$success$default$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: qj1.ji */
public final class C12480ji extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f35902d;

    /* renamed from: e */
    public final /* synthetic */ C12453ii f35903e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12480ji(C0287e eVar, C15601d dVar, C12453ii iiVar) {
        super(2, dVar);
        this.f35902d = eVar;
        this.f35903e = iiVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12480ji(this.f35902d, dVar, this.f35903e);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12480ji) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C48648a11 a112 = (C48648a11) ((C0288f) this.f35902d).f855b;
        Log.m105924i("FinderLiveWishPanelPlug", "anchor checkWishEnable is_active: " + a112.f130207h);
        C7333c<C51503u71> cVar = ((C0691u1) this.f35903e.mo87696x0(C0691u1.class)).f1637f;
        C51503u71 u712 = new C51503u71();
        u712.f142641d = a112.f130207h;
        cVar.postValue(u712);
        return C13598b0.f38549a;
    }
}
