package ue1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ue1.C65328r;

/* renamed from: ue1.x */
public final class C37450x extends C87413o implements C32226l<C65328r.C37442c, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f98975d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37450x(String str) {
        super(1);
        this.f98975d = str;
    }

    public Object invoke(Object obj) {
        C65328r.C37442c cVar = (C65328r.C37442c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        String str = cVar.f98954b.get(".sysmsg.content.task_id");
        if (str == null) {
            str = "";
        }
        int safeParseInt = Util.safeParseInt(cVar.f98954b.get(".sysmsg.content.action_type"));
        boolean z = true;
        if (!C87412m.m108589b(str, this.f98975d) || safeParseInt != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
