package og2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: og2.p */
public enum C35165p implements C38174i<C100345o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94311d;

    public Object get() {
        Object obj = this.f94311d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94311d;
                if (obj == obj2) {
                    obj = new C100345o();
                    this.f94311d = obj;
                }
            }
        }
        return (C100345o) obj;
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
        return "provider " + C100345o.class.getName();
    }
}
