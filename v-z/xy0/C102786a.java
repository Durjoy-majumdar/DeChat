package xy0;

import com.tencent.p014mm.storage.C72963f4;
import java.util.ArrayList;
import java.util.List;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import ph0.C100792a;
import th0.C101888l;
import yy0.C102970a;

/* renamed from: xy0.a */
public class C102786a implements C102790e {
    /* renamed from: a */
    public List<C102970a> mo142536a(C72963f4 f4Var) {
        if (f4Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            C98671a aVar = new C98671a();
            aVar.mo141099d(f4Var.getContent());
            C98674g gVar = new C98674g();
            gVar.mo141099d(aVar.f289309p);
            for (C98672d next : gVar.f289364h) {
                if (next.mo55274P() == 2) {
                    C100792a aVar2 = C100792a.f295260a;
                    C102789d.m135840a(arrayList, f4Var, aVar2.mo140250v(next, f4Var), 21);
                    C102789d.m135840a(arrayList, f4Var, aVar2.mo140250v(next, f4Var) + "hd", 22);
                    if (C101888l.f300029a.mo141359i(next, f4Var)) {
                        C102789d.m135840a(arrayList, f4Var, aVar2.mo140245q(next, f4Var), 26);
                        C102789d.m135840a(arrayList, f4Var, aVar2.mo140238j(next, f4Var), 20);
                    } else {
                        C102789d.m135840a(arrayList, f4Var, aVar2.mo140238j(next, f4Var), 26);
                    }
                } else if (next.mo55274P() == 4) {
                    C100792a aVar3 = C100792a.f295260a;
                    C102789d.m135840a(arrayList, f4Var, aVar3.mo140250v(next, f4Var), 2);
                    if (C101888l.f300029a.mo141359i(next, f4Var)) {
                        C102789d.m135840a(arrayList, f4Var, aVar3.mo140245q(next, f4Var), 4);
                        C102789d.m135840a(arrayList, f4Var, aVar3.mo140238j(next, f4Var), 3);
                    } else {
                        C102789d.m135840a(arrayList, f4Var, aVar3.mo140238j(next, f4Var), 4);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
