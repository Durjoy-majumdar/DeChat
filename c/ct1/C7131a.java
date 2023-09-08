package ct1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import gy3.C87412m;
import te3.C48646a1;

/* renamed from: ct1.a */
public final class C7131a extends Preference {

    /* renamed from: J */
    public C48646a1 f25105J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7131a(C48646a1 a1Var, Context context) {
        super(context);
        String str;
        C87412m.m108594g(a1Var, "config");
        C87412m.m108594g(context, "context");
        this.f121271G = C0966R.C0971layout.bcy;
        this.f25105J = a1Var;
        String str2 = "";
        String str3 = a1Var.f130191f;
        mo69924H(str3 == null ? str2 : str3);
        C48646a1 a1Var2 = this.f25105J;
        mo26273A(String.valueOf(a1Var2 != null ? Integer.valueOf(a1Var2.hashCode()) : null));
        C48646a1 a1Var3 = this.f25105J;
        if (!(a1Var3 == null || (str = a1Var3.f130195j) == null)) {
            str2 = str;
        }
        mo7741E(str2);
    }
}
