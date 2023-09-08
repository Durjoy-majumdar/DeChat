package ow2;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ow2.h */
public final class C100595h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C100591g f294739d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100595h(C100591g gVar) {
        super(0);
        this.f294739d = gVar;
    }

    public Object invoke() {
        C100591g gVar = this.f294739d;
        gVar.f294731c.mo75025b(gVar.f294730b);
        MMHandlerThread.removeRunnable(this.f294739d.f294734f);
        C100591g gVar2 = this.f294739d;
        gVar2.f294729a.removeView(gVar2.f294735g);
        C100591g gVar3 = this.f294739d;
        gVar3.f294730b.mo17098m1(gVar3.f294733e);
        return C13598b0.f38549a;
    }
}
