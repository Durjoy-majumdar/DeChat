package jf1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: jf1.f */
public enum C33568f implements C38174i<C33567e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90877d;

    public Object get() {
        Object obj = this.f90877d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90877d;
                if (obj == obj2) {
                    obj = new C33567e();
                    this.f90877d = obj;
                }
            }
        }
        return (C33567e) obj;
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
        return "provider " + C33567e.class.getName();
    }
}
