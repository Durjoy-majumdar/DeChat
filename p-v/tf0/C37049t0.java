package tf0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tf0.t0 */
public enum C37049t0 implements C38174i<C37047s0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98210d;

    public Object get() {
        Object obj = this.f98210d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98210d;
                if (obj == obj2) {
                    obj = new C37047s0();
                    this.f98210d = obj;
                }
            }
        }
        return (C37047s0) obj;
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
        return "provider " + C37047s0.class.getName();
    }
}
