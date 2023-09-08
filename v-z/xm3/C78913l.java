package xm3;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60898l;
import om3.C77020b;
import rx3.C13598b0;
import zb2.C103009m;

/* renamed from: xm3.l */
public final class C78913l extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C78917n f231780d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78913l(C78917n nVar) {
        super(1);
        this.f231780d = nVar;
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        C103009m<C77020b> mVar = this.f231780d.f231785f;
        if (mVar != null) {
            C60898l.m71329W5(mVar, view, view.hashCode(), false, 4, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
