package sf0;

import android.os.Bundle;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116746l3;
import java.util.Iterator;
import java.util.LinkedList;
import qe3.C118188q;
import qe3.C118189r;
import qe3.C118193t;
import te3.d54;
import te3.vc4;

/* renamed from: sf0.e */
public class C118276e {
    /* renamed from: a */
    public static C114735a0.C1301c m166845a(C114735a0 a0Var) {
        d54 d54;
        LinkedList<vc4> linkedList;
        Bundle bundle = new Bundle();
        bundle.putInt("kscene_type", 73);
        if (a0Var == null) {
            return null;
        }
        C118193t tVar = ((C116746l3) a0Var.f343980e).f350049c;
        if (((C118189r) tVar).f353315a.f354538e == null || (d54 = ((C118189r) tVar).f353315a.f354538e.f354596t) == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return null;
        }
        C114735a0.C1301c cVar = new C114735a0.C1301c();
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            int i = next.f185871d;
            if (i == 19) {
                cVar.f10409b = next.f185872e;
            } else if (i == 20) {
                cVar.f10410c = next.f185872e;
            } else if (i == 21) {
                cVar.f10411d = next.f185872e;
            }
        }
        cVar.f10413f = bundle;
        cVar.f10408a = 0;
        if (Util.isNullOrNil(cVar.f10409b)) {
            return null;
        }
        cVar.f10412e = ((C118188q) a0Var.f343980e.getReqObj()).f353310b.f185080d.f185297f;
        return cVar;
    }
}
