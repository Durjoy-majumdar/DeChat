package cv0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import oa1.C117731d;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: cv0.b */
public final class C7134b {
    /* renamed from: a */
    public static final boolean m7327a(Context context, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        if (!(C117731d.m166007c().mo182443e("clicfg_backup_clear_enable", 0, false, true) == 1) || !((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101185qq()) {
            return true;
        }
        C75604z3.m90829a();
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(context.getString(C0966R.string.fqh));
        qVar.mo107600l(new C7133a(aVar));
        qVar.mo107603o();
        return false;
    }
}
