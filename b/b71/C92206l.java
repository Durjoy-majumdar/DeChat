package b71;

import a71.C91977i;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import te3.C101814mn2;
import th3.C101893b;

/* renamed from: b71.l */
public final class C92206l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92200j f263913d;

    /* renamed from: e */
    public final /* synthetic */ List<C101814mn2> f263914e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92206l(C92200j jVar, List<? extends C101814mn2> list) {
        super(0);
        this.f263913d = jVar;
        this.f263914e = list;
    }

    public Object invoke() {
        C92200j jVar = this.f263913d;
        boolean z = false;
        if (jVar.f263900g) {
            jVar.f263900g = false;
            jVar.f263908o.clear();
            this.f263913d.f263905l.clear();
            if (this.f263914e.isEmpty()) {
                C101893b.f300042a.mo141391c(this.f263913d.f263905l);
                this.f263913d.mo126167d();
                return C13598b0.f38549a;
            }
        }
        int min = Math.min(C91977i.f263325d - this.f263913d.f263905l.size(), this.f263914e.size());
        if (min > 0) {
            this.f263913d.f263905l.addAll(this.f263914e.subList(0, min));
            C101893b.f300042a.mo141391c(this.f263913d.f263905l);
            C92200j jVar2 = this.f263913d;
            if (min < this.f263914e.size()) {
                z = true;
            }
            jVar2.f263901h = z;
            this.f263913d.mo126167d();
            if (min < this.f263914e.size()) {
                LinkedList<C101814mn2> linkedList = this.f263913d.f263908o;
                List<C101814mn2> list = this.f263914e;
                linkedList.addAll(list.subList(min, list.size()));
                this.f263913d.mo126166c();
            }
        } else {
            C92200j jVar3 = this.f263913d;
            if (!jVar3.f263901h) {
                jVar3.f263901h = true;
                jVar3.mo126167d();
            }
            this.f263913d.f263908o.addAll(this.f263914e);
            this.f263913d.mo126166c();
        }
        return C13598b0.f38549a;
    }
}
