package mo1;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C75592q0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: mo1.r */
public final class C11046r extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11025q f32794d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11046r(C11025q qVar) {
        super(1);
        this.f32794d = qVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", C75592q0.m90789s());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
        C88144b.m109791i(this.f32794d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this.f32794d.getActivity(), 13, 5, false, 0, 0, (String) null, 120, (Object) null);
        return C13598b0.f38549a;
    }
}
