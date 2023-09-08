package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.o0 */
public enum C34105o0 implements C38174i<C34103n0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92016d;

    public Object get() {
        Object obj = this.f92016d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92016d;
                if (obj == obj2) {
                    obj = new C34103n0();
                    this.f92016d = obj;
                }
            }
        }
        return (C34103n0) obj;
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
        return "provider " + C34103n0.class.getName();
    }
}
