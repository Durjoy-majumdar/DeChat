package rs1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: rs1.cb */
public final class C36471cb extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Context f97045d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36471cb(Context context) {
        super(1);
        this.f97045d = context;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        return Boolean.valueOf(o2Var.getContextTag() == this.f97045d.hashCode());
    }
}
