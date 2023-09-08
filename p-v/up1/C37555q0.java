package up1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: up1.q0 */
public enum C37555q0 implements C38174i<C37554p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99613d;

    public Object get() {
        Object obj = this.f99613d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99613d;
                if (obj == obj2) {
                    obj = new C37554p0();
                    this.f99613d = obj;
                }
            }
        }
        return (C37554p0) obj;
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
        return "provider " + C37554p0.class.getName();
    }
}
