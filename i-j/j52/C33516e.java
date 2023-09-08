package j52;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: j52.e */
public enum C33516e implements C38174i<C24788d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90750d;

    public Object get() {
        Object obj = this.f90750d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90750d;
                if (obj == obj2) {
                    obj = new C24788d();
                    this.f90750d = obj;
                }
            }
        }
        return (C24788d) obj;
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
        return "provider " + C24788d.class.getName();
    }
}
