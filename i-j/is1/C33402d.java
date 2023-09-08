package is1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: is1.d */
public enum C33402d implements C38174i<C9239c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90505d;

    public Object get() {
        Object obj = this.f90505d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90505d;
                if (obj == obj2) {
                    obj = new C9239c();
                    this.f90505d = obj;
                }
            }
        }
        return (C9239c) obj;
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
        return "provider " + C9239c.class.getName();
    }
}
