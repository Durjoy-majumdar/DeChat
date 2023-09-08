package jf1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: jf1.d */
public enum C33566d implements C38174i<C33565c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90874d;

    public Object get() {
        Object obj = this.f90874d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90874d;
                if (obj == obj2) {
                    obj = new C33565c();
                    this.f90874d = obj;
                }
            }
        }
        return (C33565c) obj;
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
        return "provider " + C33565c.class.getName();
    }
}
