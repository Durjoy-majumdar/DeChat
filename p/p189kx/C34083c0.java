package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.c0 */
public enum C34083c0 implements C38174i<C99271b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91961d;

    public Object get() {
        Object obj = this.f91961d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91961d;
                if (obj == obj2) {
                    obj = new C99271b0();
                    this.f91961d = obj;
                }
            }
        }
        return (C99271b0) obj;
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
        return "provider " + C99271b0.class.getName();
    }
}
