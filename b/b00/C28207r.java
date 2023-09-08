package b00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: b00.r */
public enum C28207r implements C38174i<C92166q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77730d;

    public Object get() {
        Object obj = this.f77730d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77730d;
                if (obj == obj2) {
                    obj = new C92166q();
                    this.f77730d = obj;
                }
            }
        }
        return (C92166q) obj;
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
        return "provider " + C92166q.class.getName();
    }
}
