package p420ur;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ur.k */
public enum C37570k implements C38174i<C78277j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99648d;

    public Object get() {
        Object obj = this.f99648d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99648d;
                if (obj == obj2) {
                    obj = new C78277j();
                    this.f99648d = obj;
                }
            }
        }
        return (C78277j) obj;
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
        return "provider " + C78277j.class.getName();
    }
}
