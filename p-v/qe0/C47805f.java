package qe0;

import java.util.LinkedList;
import java.util.List;
import te3.C49464fs;
import te3.C52224z63;

/* renamed from: qe0.f */
public class C47805f {
    /* renamed from: a */
    public static LinkedList<C49464fs> m53115a(List<C52224z63> list) {
        LinkedList<C49464fs> linkedList = new LinkedList<>();
        if (list == null) {
            return linkedList;
        }
        for (C52224z63 next : list) {
            C49464fs fsVar = new C49464fs();
            fsVar.f133650d = next.f145718d;
            fsVar.f133651e = next.f145719e;
            fsVar.f133652f = next.f145720f;
            fsVar.f133653g = next.f145721g;
            fsVar.f133654h = next.f145722h;
            fsVar.f133655i = next.f145723i;
            fsVar.f133656j = next.f145726o;
            linkedList.add(fsVar);
        }
        return linkedList;
    }
}
