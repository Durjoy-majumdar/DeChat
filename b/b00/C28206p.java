package b00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: b00.p */
public enum C28206p implements C38174i<C28205o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77727d;

    public Object get() {
        Object obj = this.f77727d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77727d;
                if (obj == obj2) {
                    obj = new C28205o();
                    this.f77727d = obj;
                }
            }
        }
        return (C28205o) obj;
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
        return "provider " + C28205o.class.getName();
    }
}
