package p165hr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hr.k0 */
public enum C32996k0 implements C38174i<C60093j0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89640d;

    public Object get() {
        Object obj = this.f89640d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89640d;
                if (obj == obj2) {
                    obj = new C60093j0();
                    this.f89640d = obj;
                }
            }
        }
        return (C60093j0) obj;
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
        return "provider " + C60093j0.class.getName();
    }
}
