package p481cs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cs.p */
public enum C30907p implements C38174i<C30906o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82970d;

    public Object get() {
        Object obj = this.f82970d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82970d;
                if (obj == obj2) {
                    obj = new C30906o();
                    this.f82970d = obj;
                }
            }
        }
        return (C30906o) obj;
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
        return "provider " + C30906o.class.getName();
    }
}
