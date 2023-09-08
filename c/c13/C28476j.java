package c13;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: c13.j */
public enum C28476j implements C38174i<C113235i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78277d;

    public Object get() {
        Object obj = this.f78277d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78277d;
                if (obj == obj2) {
                    obj = new C113235i();
                    this.f78277d = obj;
                }
            }
        }
        return (C113235i) obj;
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
        return "provider " + C113235i.class.getName();
    }
}
