package fg0;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lfg0/c;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "account-bind_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: fg0.c */
public final class C32041c implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("key_wording_cfg", "");
            C87412m.m108593f(string, "it.getString(ConstantsUI…tact.KEY_WORDING_CFG, \"\")");
            C32040b.f85276a = string;
        }
        if (gVar != null) {
            gVar.mo894a(null);
        }
    }
}
