package dp1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dp1.z0 */
public enum C31234z0 implements C38174i<C58417y0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83686d;

    public Object get() {
        Object obj = this.f83686d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83686d;
                if (obj == obj2) {
                    obj = new C58417y0();
                    this.f83686d = obj;
                }
            }
        }
        return (C58417y0) obj;
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
        return "provider " + C58417y0.class.getName();
    }
}
