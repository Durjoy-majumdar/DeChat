package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.q0 */
public enum C34108q0 implements C38174i<C117430p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92025d;

    public Object get() {
        Object obj = this.f92025d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92025d;
                if (obj == obj2) {
                    obj = new C117430p0();
                    this.f92025d = obj;
                }
            }
        }
        return (C117430p0) obj;
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
        return "provider " + C117430p0.class.getName();
    }
}
