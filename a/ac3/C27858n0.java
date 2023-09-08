package ac3;

import ac3.C27856m0;
import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ac3.n0 */
public enum C27858n0 implements C38174i<C39538h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76996d;

    public Object get() {
        Object obj = this.f76996d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76996d;
                if (obj == obj2) {
                    C27856m0.f76993a.getClass();
                    obj = C39538h0.f106157d;
                    this.f76996d = obj;
                }
            }
        }
        return (C39538h0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C27856m0.C27857a.class;
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
        return "provider " + C39538h0.class.getName();
    }
}
