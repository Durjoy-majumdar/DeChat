package is1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: is1.f */
public enum C33403f implements C38174i<C60618e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90508d;

    public Object get() {
        Object obj = this.f90508d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90508d;
                if (obj == obj2) {
                    obj = new C60618e();
                    this.f90508d = obj;
                }
            }
        }
        return (C60618e) obj;
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
        return "provider " + C60618e.class.getName();
    }
}
