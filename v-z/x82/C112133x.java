package x82;

import android.view.Surface;
import b92.C104065a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: x82.x */
public final class C112133x extends C87413o implements C32226l<C104065a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112124u f335731d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112133x(C112124u uVar) {
        super(1);
        this.f335731d = uVar;
    }

    public Object invoke(Object obj) {
        C104065a aVar = (C104065a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        Surface surface = aVar.f307796i;
        if (surface != null) {
            this.f335731d.setBitmapBackgroundRenderTarget(surface);
        }
        aVar.f307795h = new C112132w(this.f335731d, aVar);
        return C13598b0.f38549a;
    }
}
