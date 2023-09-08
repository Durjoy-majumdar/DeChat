package rs1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: rs1.bb */
public final class C13129bb extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C59670o2 f37363d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13129bb(C59670o2 o2Var) {
        super(1);
        this.f37363d = o2Var;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        Log.m105924i("Finder.VideoRecycler", "[recycledVideoView] " + o2Var + '}');
        return Boolean.valueOf(C87412m.m108589b(o2Var, this.f37363d));
    }
}
