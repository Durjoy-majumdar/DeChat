package w50;

import android.content.res.AssetManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: w50.f */
public final class C65932f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C65932f f189543d = new C65932f();

    public C65932f() {
        super(0);
    }

    public Object invoke() {
        C65929d dVar = C65929d.f189535a;
        String str = C65929d.f189536b;
        C86013q1.m106445f(str);
        C86013q1.m106461v(str);
        AssetManager assets = MMApplicationContext.getContext().getAssets();
        C87412m.m108593f(assets, "getContext().assets");
        dVar.mo89969a(assets, "filters", str);
        C61926c.m72668M(C65931e.f189542d);
        return C13598b0.f38549a;
    }
}
