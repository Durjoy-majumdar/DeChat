package p167hz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hz.p */
public enum C33153p implements C38174i<C8838o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90002d;

    public Object get() {
        Object obj = this.f90002d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90002d;
                if (obj == obj2) {
                    obj = new C8838o();
                    this.f90002d = obj;
                }
            }
        }
        return (C8838o) obj;
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
        return "provider " + C8838o.class.getName();
    }
}
