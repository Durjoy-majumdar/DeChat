package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.a0 */
public enum C36398a0 implements C38174i<C48072z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96857d;

    public Object get() {
        Object obj = this.f96857d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96857d;
                if (obj == obj2) {
                    obj = new C48072z();
                    this.f96857d = obj;
                }
            }
        }
        return (C48072z) obj;
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
        return "provider " + C48072z.class.getName();
    }
}
