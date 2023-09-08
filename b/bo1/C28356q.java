package bo1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bo1.q */
public enum C28356q implements C38174i<C54504p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78006d;

    public Object get() {
        Object obj = this.f78006d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78006d;
                if (obj == obj2) {
                    obj = new C54504p();
                    this.f78006d = obj;
                }
            }
        }
        return (C54504p) obj;
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
        return "provider " + C54504p.class.getName();
    }
}
