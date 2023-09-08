package ac3;

import android.content.res.AssetManager;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ac3.o0 */
public final class C91991o0 extends C87413o implements C32226l<AssetManager, C13598b0> {

    /* renamed from: d */
    public static final C91991o0 f263330d = new C91991o0();

    public C91991o0() {
        super(1);
    }

    public Object invoke(Object obj) {
        AssetManager assetManager = (AssetManager) obj;
        C87412m.m108594g(assetManager, TPMediaCompositionHelper.XML_TAG_ASSERT);
        C91992q0 q0Var = C91992q0.f263331a;
        if (!q0Var.mo125831e()) {
            q0Var.mo125833g(assetManager);
        }
        return C13598b0.f38549a;
    }
}
