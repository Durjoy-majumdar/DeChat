package q22;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import di3.C86312j;
import h81.C32735h;

/* renamed from: q22.b */
public class C12036b implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        boolean z = false;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_flutter_game_enable, 0);
        Bundle bundle2 = new Bundle();
        if (Qe == 1) {
            z = true;
        }
        bundle2.putBoolean("result", z);
        if (gVar != null) {
            gVar.mo894a(bundle2);
        }
    }
}
