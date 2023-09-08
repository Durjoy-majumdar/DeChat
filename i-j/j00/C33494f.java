package j00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: j00.f */
public enum C33494f implements C38174i<C46391e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90697d;

    public Object get() {
        Object obj = this.f90697d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90697d;
                if (obj == obj2) {
                    obj = new C46391e();
                    this.f90697d = obj;
                }
            }
        }
        return (C46391e) obj;
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
        return "provider " + C46391e.class.getName();
    }
}
