package n02;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: n02.e */
public final class C34720e extends C87413o implements C32226l<C34715b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f93351d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34720e(String str) {
        super(1);
        this.f93351d = str;
    }

    public Object invoke(Object obj) {
        C34715b bVar = (C34715b) obj;
        C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
        return Boolean.valueOf(C87412m.m108589b(bVar.field_UserName, this.f93351d));
    }
}
