package p656py;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: py.i */
public enum C35733i implements C38174i<C35732h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95442d;

    public Object get() {
        Object obj = this.f95442d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95442d;
                if (obj == obj2) {
                    obj = new C35732h();
                    this.f95442d = obj;
                }
            }
        }
        return (C35732h) obj;
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
        return "provider " + C35732h.class.getName();
    }
}
