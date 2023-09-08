package p709um;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: um.b */
public enum C37487b implements C38174i<C37485a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99045d;

    public Object get() {
        Object obj = this.f99045d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99045d;
                if (obj == obj2) {
                    obj = new C37485a();
                    this.f99045d = obj;
                }
            }
        }
        return (C37485a) obj;
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
        return "provider " + C37485a.class.getName();
    }
}
