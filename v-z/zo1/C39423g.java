package zo1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zo1.g */
public final class C39423g extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66917d f105903d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39423g(C66917d dVar) {
        super(1);
        this.f105903d = dVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        String str = this.f105903d.f192278r;
        Log.m105924i(str, "choose id:" + intValue + '!');
        return C13598b0.f38549a;
    }
}
