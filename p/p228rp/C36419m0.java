package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.m0 */
public enum C36419m0 implements C38174i<C13097l0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96900d;

    public Object get() {
        Object obj = this.f96900d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96900d;
                if (obj == obj2) {
                    obj = new C13097l0();
                    this.f96900d = obj;
                }
            }
        }
        return (C13097l0) obj;
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
        return "provider " + C13097l0.class.getName();
    }
}
