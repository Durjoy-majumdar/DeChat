package p231rv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rv.d */
public enum C36498d implements C38174i<C13585c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97102d;

    public Object get() {
        Object obj = this.f97102d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97102d;
                if (obj == obj2) {
                    obj = new C13585c();
                    this.f97102d = obj;
                }
            }
        }
        return (C13585c) obj;
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
        return "provider " + C13585c.class.getName();
    }
}
