package p741wq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wq.j */
public enum C38257j implements C38174i<C102483i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101020d;

    public Object get() {
        Object obj = this.f101020d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101020d;
                if (obj == obj2) {
                    obj = new C102483i();
                    this.f101020d = obj;
                }
            }
        }
        return (C102483i) obj;
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
        return "provider " + C102483i.class.getName();
    }
}
