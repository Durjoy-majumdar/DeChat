package fw3;

import gw3.C117005i;
import java.util.Comparator;

/* renamed from: fw3.d */
public class C116907d implements Comparator<C117005i> {
    public C116907d(C116908e eVar) {
    }

    public int compare(Object obj, Object obj2) {
        C117005i iVar = (C117005i) obj;
        C117005i iVar2 = (C117005i) obj2;
        int i = iVar.f350649j - iVar2.f350649j;
        return i == 0 ? (int) (iVar.f350646g - iVar2.f350646g) : i;
    }
}
