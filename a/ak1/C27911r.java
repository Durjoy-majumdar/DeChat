package ak1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ak1.r */
public enum C27911r implements C38174i<C27910q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77094d;

    public Object get() {
        Object obj = this.f77094d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77094d;
                if (obj == obj2) {
                    obj = new C27910q();
                    this.f77094d = obj;
                }
            }
        }
        return (C27910q) obj;
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
        return "provider " + C27910q.class.getName();
    }
}
