package n02;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: n02.d */
public final class C34719d extends C87413o implements C32226l<C34715b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ int f93349d;

    /* renamed from: e */
    public final /* synthetic */ String f93350e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34719d(int i, String str) {
        super(1);
        this.f93349d = i;
        this.f93350e = str;
    }

    public Object invoke(Object obj) {
        C34715b bVar = (C34715b) obj;
        C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
        int i = this.f93349d;
        return Boolean.valueOf(C87412m.m108589b(i != 1 ? i != 3 ? bVar.field_CommHashUserName : bVar.field_HardCodeHashUserName : bVar.field_HashUserName, this.f93350e));
    }
}
