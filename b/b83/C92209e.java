package b83;

import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lv1.C99681n;

/* renamed from: b83.e */
public class C92209e extends C0251a<C92210a> {

    /* renamed from: c */
    public List<C92210a> f263922c = Collections.emptyList();

    /* renamed from: b83.e$a */
    public static class C92210a {

        /* renamed from: a */
        public String f263923a;

        /* renamed from: b */
        public String f263924b;

        /* renamed from: c */
        public String f263925c;

        /* renamed from: d */
        public String f263926d;

        /* renamed from: e */
        public String f263927e;

        /* renamed from: f */
        public String f263928f;
    }

    public C92209e(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public void mo289a(List<C99681n> list) {
        this.f263922c = new ArrayList(list.size());
        for (C99681n next : list) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next.f292151e);
            C92210a aVar = new C92210a();
            aVar.f263923a = z1Var.getUsername();
            aVar.f263924b = next.f292154h;
            aVar.f263925c = z1Var.getNickname();
            aVar.f263926d = z1Var.mo73969n2();
            aVar.f263927e = z1Var.mo62913l2();
            aVar.f263928f = z1Var.f149513S0;
            this.f263922c.add(aVar);
        }
    }
}
