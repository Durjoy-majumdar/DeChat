package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.k0 */
public enum C34098k0 implements C38174i<C88319j0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91998d;

    public Object get() {
        Object obj = this.f91998d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91998d;
                if (obj == obj2) {
                    obj = new C88319j0();
                    this.f91998d = obj;
                }
            }
        }
        return (C88319j0) obj;
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
        return "provider " + C88319j0.class.getName();
    }
}
