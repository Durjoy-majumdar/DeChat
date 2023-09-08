package j50;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import s50.C110755r;

/* renamed from: j50.f */
public final class C60756f extends C87413o implements C32226l<C110755r, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173070d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60756f(C60735a aVar) {
        super(1);
        this.f173070d = aVar;
    }

    public Object invoke(Object obj) {
        C110755r rVar = (C110755r) obj;
        C87412m.m108594g(rVar, LocaleUtil.ITALIAN);
        Surface surface = rVar.f331264j;
        if (surface != null) {
            this.f173070d.f173004Q = surface;
        }
        rVar.f331263i = new C60755e(rVar, this.f173070d);
        return C13598b0.f38549a;
    }
}
