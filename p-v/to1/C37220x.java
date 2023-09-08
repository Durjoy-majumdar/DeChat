package to1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: to1.x */
public final class C37220x extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64990y f98517d;

    /* renamed from: e */
    public final /* synthetic */ int f98518e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37220x(C64990y yVar, int i) {
        super(1);
        this.f98517d = yVar;
        this.f98518e = i;
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        this.f98517d.f187114e.invoke(view, Integer.valueOf(this.f98518e));
        return C13598b0.f38549a;
    }
}
