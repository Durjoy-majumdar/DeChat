package iz3;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jz3.C24851v;
import m04.C21479h;
import mz3.C25072x;
import mz3.C25073y;
import wy3.C26446d1;
import wy3.C26469k;

/* renamed from: iz3.i */
public final class C24652i implements C24656l {

    /* renamed from: a */
    public final C24651h f70295a;

    /* renamed from: b */
    public final C26469k f70296b;

    /* renamed from: c */
    public final int f70297c;

    /* renamed from: d */
    public final Map<C25072x, Integer> f70298d;

    /* renamed from: e */
    public final C21479h<C25072x, C24851v> f70299e;

    /* renamed from: iz3.i$a */
    public static final class C24653a extends C87413o implements C32226l<C25072x, C24851v> {

        /* renamed from: d */
        public final /* synthetic */ C24652i f70300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24653a(C24652i iVar) {
            super(1);
            this.f70300d = iVar;
        }

        public Object invoke(Object obj) {
            C25072x xVar = (C25072x) obj;
            C87412m.m108594g(xVar, "typeParameter");
            Integer num = (Integer) ((LinkedHashMap) this.f70300d.f70298d).get(xVar);
            if (num == null) {
                return null;
            }
            C24652i iVar = this.f70300d;
            int intValue = num.intValue();
            C24651h hVar = iVar.f70295a;
            C87412m.m108594g(hVar, "<this>");
            return new C24851v(C24641b.m30820b(new C24651h(hVar.f70290a, iVar, hVar.f70292c), iVar.f70296b.getAnnotations()), xVar, iVar.f70297c + intValue, iVar.f70296b);
        }
    }

    public C24652i(C24651h hVar, C26469k kVar, C25073y yVar, int i) {
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(kVar, "containingDeclaration");
        C87412m.m108594g(yVar, "typeParameterOwner");
        this.f70295a = hVar;
        this.f70296b = kVar;
        this.f70297c = i;
        List<C25072x> typeParameters = yVar.getTypeParameters();
        C87412m.m108594g(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f70298d = linkedHashMap;
        this.f70299e = this.f70295a.f70290a.f70256a.mo52004e(new C24653a(this));
    }

    /* renamed from: a */
    public C26446d1 mo51482a(C25072x xVar) {
        C87412m.m108594g(xVar, "javaTypeParameter");
        C24851v invoke = this.f70299e.invoke(xVar);
        return invoke != null ? invoke : this.f70295a.f70291b.mo51482a(xVar);
    }
}
