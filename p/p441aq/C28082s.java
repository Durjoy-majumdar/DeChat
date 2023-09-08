package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.s */
public enum C28082s implements C38174i<C67099r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77444d;

    public Object get() {
        Object obj = this.f77444d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77444d;
                if (obj == obj2) {
                    obj = new C67099r();
                    this.f77444d = obj;
                }
            }
        }
        return (C67099r) obj;
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
        return "provider " + C67099r.class.getName();
    }
}
