package p481cs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cs.j */
public enum C30902j implements C38174i<C30901i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82961d;

    public Object get() {
        Object obj = this.f82961d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82961d;
                if (obj == obj2) {
                    obj = new C30901i();
                    this.f82961d = obj;
                }
            }
        }
        return (C30901i) obj;
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
        return "provider " + C30901i.class.getName();
    }
}
