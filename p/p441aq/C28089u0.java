package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.u0 */
public enum C28089u0 implements C38174i<C92058t0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77462d;

    public Object get() {
        Object obj = this.f77462d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77462d;
                if (obj == obj2) {
                    obj = new C92058t0();
                    this.f77462d = obj;
                }
            }
        }
        return (C92058t0) obj;
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
        return "provider " + C92058t0.class.getName();
    }
}
