package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.i0 */
public enum C36412i0 implements C38174i<C36411h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96881d;

    public Object get() {
        Object obj = this.f96881d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96881d;
                if (obj == obj2) {
                    obj = new C36411h0();
                    this.f96881d = obj;
                }
            }
        }
        return (C36411h0) obj;
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
        return "provider " + C36411h0.class.getName();
    }
}
