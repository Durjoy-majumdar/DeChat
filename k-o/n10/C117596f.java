package n10;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n10.C117593e;

/* renamed from: n10.f */
public final class C117596f extends C87413o implements C32226l<C117593e.C117595b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ int f351826d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117596f(int i) {
        super(1);
        this.f351826d = i;
    }

    public Object invoke(Object obj) {
        C117593e.C117595b bVar = (C117593e.C117595b) obj;
        C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
        return Boolean.valueOf(bVar.f351822a == this.f351826d);
    }
}
