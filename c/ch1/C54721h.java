package ch1;

import cj1.C54734a4;
import cj1.C54743c4;
import cj1.C54847z3;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C48742ao0;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ch1.h */
public final class C54721h extends C66639f {
    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        if (ao02 == null) {
            return true;
        }
        LinkedList<Integer> linkedList = ao02.f130666D;
        if (linkedList != null) {
            FinderLiveService.f159376d.getClass();
            C54847z3 z3Var = FinderLiveService.f159383n;
            z3Var.getClass();
            z3Var.f153758g.post(new C54743c4(linkedList, z3Var));
        }
        LinkedList<Integer> linkedList2 = ao02.f130665C;
        if (linkedList2 == null) {
            return true;
        }
        FinderLiveService.f159376d.getClass();
        C54847z3 z3Var2 = FinderLiveService.f159383n;
        z3Var2.getClass();
        z3Var2.f153758g.post(new C54734a4(linkedList2, z3Var2));
        return true;
    }
}
