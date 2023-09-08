package id1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: id1.d */
public enum C33285d implements C38174i<C60273b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90281d;

    public Object get() {
        Object obj = this.f90281d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90281d;
                if (obj == obj2) {
                    obj = new C60273b();
                    this.f90281d = obj;
                }
            }
        }
        return (C60273b) obj;
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
        return "provider " + C60273b.class.getName();
    }
}
