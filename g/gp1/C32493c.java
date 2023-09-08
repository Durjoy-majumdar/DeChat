package gp1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gp1.c */
public enum C32493c implements C38174i<C32492b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86319d;

    public Object get() {
        Object obj = this.f86319d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86319d;
                if (obj == obj2) {
                    obj = new C32492b();
                    this.f86319d = obj;
                }
            }
        }
        return (C32492b) obj;
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
        return "provider " + C32492b.class.getName();
    }
}
