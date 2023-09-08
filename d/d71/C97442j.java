package d71;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: d71.j */
public final class C97442j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C97434g f286019d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97442j(C97434g gVar) {
        super(0);
        this.f286019d = gVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.EditorPresenter", "video play callback");
        C97434g gVar = this.f286019d;
        gVar.f285996i = true;
        C61926c.m72668M(new C97441i(gVar));
        return C13598b0.f38549a;
    }
}
