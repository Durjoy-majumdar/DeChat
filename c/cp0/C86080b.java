package cp0;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: cp0.b */
public final class C86080b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86078a f250558d;

    /* renamed from: e */
    public final /* synthetic */ String f250559e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86080b(C86078a aVar, String str) {
        super(0);
        this.f250558d = aVar;
        this.f250559e = str;
    }

    public Object invoke() {
        try {
            Intent intent = new Intent(this.f250558d.f250550a, Class.forName(this.f250559e));
            C86078a aVar = this.f250558d;
            String str = this.f250559e;
            boolean bindService = aVar.f250550a.bindService(intent, (C86082d) ((C36570n) aVar.f250556g).getValue(), 65);
            Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startAppBrandProgress: bind " + str + " ret = " + bindService);
            C86078a.f250549h = !bindService ? null : (C86082d) ((C36570n) aVar.f250556g).getValue();
        } catch (SecurityException e) {
            Log.m105921e("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startAppBrandProgress: ", e);
            C86078a.f250549h = null;
            C86083e.f250564a.mo120505a(this.f250558d.f250555f);
        }
        return C13598b0.f38549a;
    }
}
