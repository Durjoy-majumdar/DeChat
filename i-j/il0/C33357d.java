package il0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: il0.d */
public enum C33357d implements C38174i<C33356c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90408d;

    public Object get() {
        Object obj = this.f90408d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90408d;
                if (obj == obj2) {
                    obj = new C33356c();
                    this.f90408d = obj;
                }
            }
        }
        return (C33356c) obj;
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
        return "provider " + C33356c.class.getName();
    }
}
