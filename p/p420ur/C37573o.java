package p420ur;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ur.o */
public enum C37573o implements C38174i<C78278n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99655d;

    public Object get() {
        Object obj = this.f99655d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99655d;
                if (obj == obj2) {
                    obj = new C78278n();
                    this.f99655d = obj;
                }
            }
        }
        return (C78278n) obj;
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
        return "provider " + C78278n.class.getName();
    }
}
