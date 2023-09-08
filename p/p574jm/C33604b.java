package p574jm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: jm.b */
public enum C33604b implements C38174i<C33603a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90946d;

    public Object get() {
        Object obj = this.f90946d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90946d;
                if (obj == obj2) {
                    obj = new C33603a();
                    this.f90946d = obj;
                }
            }
        }
        return (C33603a) obj;
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
        return "provider " + C33603a.class.getName();
    }
}
