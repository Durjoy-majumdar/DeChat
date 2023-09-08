package hl1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import qj1.C12738xf;
import rx3.C13598b0;
import te3.C48682a91;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorEndUIC$requestFinderLiveEndNav$$inlined$fail$default$1", mo125469f = "FinderLiveVisitorEndUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: hl1.c */
public final class C8542c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f27611d;

    /* renamed from: e */
    public final /* synthetic */ C59974g f27612e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8542c(C0287e eVar, C15601d dVar, C59974g gVar) {
        super(2, dVar);
        this.f27611d = eVar;
        this.f27612e = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8542c(this.f27611d, dVar, this.f27612e);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8542c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("Finder.FinderLiveVisitorEndUIC", "#requestFinderLiveEndNav bad size=" + ((C0280a) ((C0281b) this.f27611d).f843b).f841a);
        C12738xf xfVar = this.f27612e.f171121i;
        if (xfVar != null) {
            xfVar.mo12280d1((C48682a91) null);
        }
        return C13598b0.f38549a;
    }
}
