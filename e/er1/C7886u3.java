package er1;

import android.content.Context;
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

/* renamed from: er1.u3 */
public final class C7886u3 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f26508d;

    /* renamed from: e */
    public final /* synthetic */ boolean f26509e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7886u3(Context context, boolean z) {
        super(1);
        this.f26508d = context;
        this.f26509e = z;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
        Intent intent = new Intent();
        String s = C75592q0.m90789s();
        intent.putExtra("Contact_User", s);
        if (s != null) {
            if (s.length() > 0) {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
                C88144b.m109791i(this.f26508d, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            }
        }
        if (this.f26509e) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.fy0((C58417y0) c, this.f26508d, 12, 5, false, 0, 0, (String) null, 120, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
