package p935cb;

import java.util.Iterator;
import java.util.LinkedList;
import p935cb.C79986k;

/* renamed from: cb.b */
public class C79970b extends C79986k.C79988b {

    /* renamed from: a */
    public final /* synthetic */ C79973e f234241a;

    public C79970b(C79973e eVar) {
        this.f234241a = eVar;
    }

    /* renamed from: a */
    public void mo110147a() {
        C79973e eVar = this.f234241a;
        eVar.f234253g = true;
        LinkedList<String> linkedList = eVar.f234252f;
        if (linkedList != null && !linkedList.isEmpty()) {
            Iterator<String> it = this.f234241a.f234252f.iterator();
            while (it.hasNext()) {
                this.f234241a.mo110151b(it.next());
            }
        }
    }
}
