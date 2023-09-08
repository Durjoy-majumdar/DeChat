package v82;

import d82.C107025a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: v82.b */
public final class C111417b extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111424d f333539d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111417b(C111424d dVar) {
        super(1);
        this.f333539d = dVar;
    }

    public Object invoke(Object obj) {
        Object obj2;
        HashSet<String> hashSet;
        String str = (String) obj;
        C87412m.m108594g(str, "usrName");
        Iterator<C107025a> it = this.f333539d.f333577e.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            C107025a next = it.next();
            C107025a aVar = next;
            if (aVar != null) {
                obj2 = aVar.f320418e;
            }
            if (C87412m.m108589b(obj2, str)) {
                obj2 = next;
                break;
            }
        }
        C107025a aVar2 = (C107025a) obj2;
        if (!(aVar2 == null || (hashSet = this.f333539d.f333581i) == null)) {
            hashSet.add(aVar2.f320414a.f320048d);
        }
        return C13598b0.f38549a;
    }
}
