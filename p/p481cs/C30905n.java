package p481cs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cs.n */
public enum C30905n implements C38174i<C30904m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82967d;

    public Object get() {
        Object obj = this.f82967d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82967d;
                if (obj == obj2) {
                    obj = new C30904m();
                    this.f82967d = obj;
                }
            }
        }
        return (C30904m) obj;
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
        return "provider " + C30904m.class.getName();
    }
}
