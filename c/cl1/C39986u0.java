package cl1;

import al1.C39611s;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: cl1.u0 */
public final class C39986u0 extends C87413o implements C32226l<C39611s, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f107211d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39986u0(String str) {
        super(1);
        this.f107211d = str;
    }

    public Object invoke(Object obj) {
        C39611s sVar = (C39611s) obj;
        C87412m.m108594g(sVar, LocaleUtil.ITALIAN);
        return Boolean.valueOf(Util.isEqual(sVar.f106357a, this.f107211d));
    }
}
