package p481cs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cs.r */
public enum C30909r implements C38174i<C30908q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82973d;

    public Object get() {
        Object obj = this.f82973d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82973d;
                if (obj == obj2) {
                    obj = new C30908q();
                    this.f82973d = obj;
                }
            }
        }
        return (C30908q) obj;
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
        return "provider " + C30908q.class.getName();
    }
}
