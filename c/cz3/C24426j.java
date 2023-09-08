package cz3;

import gy3.C8480h;
import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import mz3.C25053e;
import vz3.C22830f;

/* renamed from: cz3.j */
public final class C24426j extends C24417f implements C25053e {

    /* renamed from: b */
    public final Object[] f69871b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24426j(C22830f fVar, Object[] objArr) {
        super(fVar, (C8480h) null);
        C87412m.m108594g(objArr, "values");
        this.f69871b = objArr;
    }

    /* renamed from: b */
    public List<C24417f> mo51067b() {
        Object[] objArr = this.f69871b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C87412m.m108591d(obj);
            arrayList.add(C24410d.m30459e(obj.getClass()) ? new C24440y((C22830f) null, (Enum) obj) : obj instanceof Annotation ? new C24419g((C22830f) null, (Annotation) obj) : obj instanceof Object[] ? new C24426j((C22830f) null, (Object[]) obj) : obj instanceof Class ? new C24436u((C22830f) null, (Class) obj) : new C24403a0((C22830f) null, obj));
        }
        return arrayList;
    }
}
