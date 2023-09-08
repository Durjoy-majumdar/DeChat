package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.g0 */
public enum C36409g0 implements C38174i<C36407f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96875d;

    public Object get() {
        Object obj = this.f96875d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96875d;
                if (obj == obj2) {
                    obj = new C36407f0();
                    this.f96875d = obj;
                }
            }
        }
        return (C36407f0) obj;
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
        return "provider " + C36407f0.class.getName();
    }
}
