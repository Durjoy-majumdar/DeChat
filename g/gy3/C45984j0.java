package gy3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: gy3.j0 */
public class C45984j0 {

    /* renamed from: a */
    public final ArrayList<Object> f124001a;

    public C45984j0(int i) {
        this.f124001a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo71372a(Object obj) {
        this.f124001a.add(obj);
    }

    /* renamed from: b */
    public void mo71373b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f124001a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f124001a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f124001a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f124001a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f124001a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int mo71374c() {
        return this.f124001a.size();
    }

    /* renamed from: d */
    public Object[] mo71375d(Object[] objArr) {
        return this.f124001a.toArray(objArr);
    }
}
