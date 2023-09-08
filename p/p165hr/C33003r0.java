package p165hr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hr.r0 */
public enum C33003r0 implements C38174i<C60103p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89661d;

    public Object get() {
        Object obj = this.f89661d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89661d;
                if (obj == obj2) {
                    obj = new C60103p0();
                    this.f89661d = obj;
                }
            }
        }
        return (C60103p0) obj;
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
        return "provider " + C60103p0.class.getName();
    }
}
