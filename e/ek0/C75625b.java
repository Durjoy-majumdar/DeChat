package ek0;

import com.tencent.p014mm.plugin.address.model.RcptItem;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ek0.b */
public final class C75625b extends C87413o implements C32226l<RcptItem, CharSequence> {

    /* renamed from: d */
    public static final C75625b f222171d = new C75625b();

    public C75625b() {
        super(1);
    }

    public Object invoke(Object obj) {
        RcptItem rcptItem = (RcptItem) obj;
        C87412m.m108594g(rcptItem, LocaleUtil.ITALIAN);
        String str = rcptItem.f196786d;
        C87412m.m108593f(str, "it.name");
        return str;
    }
}
