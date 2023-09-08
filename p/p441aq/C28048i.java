package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.i */
public enum C28048i implements C38174i<C92054g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77368d;

    public Object get() {
        Object obj = this.f77368d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77368d;
                if (obj == obj2) {
                    obj = new C92054g();
                    this.f77368d = obj;
                }
            }
        }
        return (C92054g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C92054g.class.getName();
    }
}
