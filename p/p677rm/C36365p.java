package p677rm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rm.p */
public enum C36365p implements C38174i<C36364o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96775d;

    public Object get() {
        Object obj = this.f96775d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96775d;
                if (obj == obj2) {
                    obj = new C36364o();
                    this.f96775d = obj;
                }
            }
        }
        return (C36364o) obj;
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
        return "provider " + C36364o.class.getName();
    }
}
