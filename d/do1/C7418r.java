package do1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import do1.C58341h;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: do1.r */
public final class C7418r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58341h.C58344f f25591d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7418r(C58341h.C58344f fVar) {
        super(0);
        this.f25591d = fVar;
    }

    public Object invoke() {
        if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            Context context = MMApplicationContext.getContext();
            C76912y0.makeText(context, (CharSequence) "hit preload cache. source:" + this.f25591d, 1).show();
        }
        return C13598b0.f38549a;
    }
}
