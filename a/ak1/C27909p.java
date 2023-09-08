package ak1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ak1.p */
public enum C27909p implements C38174i<C54108o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77091d;

    public Object get() {
        Object obj = this.f77091d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77091d;
                if (obj == obj2) {
                    obj = new C54108o();
                    this.f77091d = obj;
                }
            }
        }
        return (C54108o) obj;
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
        return "provider " + C54108o.class.getName();
    }
}
