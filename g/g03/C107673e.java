package g03;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g03.e */
public final class C107673e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107666c f322133d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107673e(C107666c cVar) {
        super(0);
        this.f322133d = cVar;
    }

    public Object invoke() {
        String str = this.f322133d.f322101g;
        Log.m105924i(str, "invoke first frame callback, pts:" + this.f322133d.f322111q);
        C32224a<C13598b0> aVar = this.f322133d.f322098d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f322133d.f322098d = null;
        return C13598b0.f38549a;
    }
}
