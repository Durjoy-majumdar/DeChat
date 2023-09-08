package dg0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dg0.d */
public enum C31177d implements C38174i<C75397c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83562d;

    public Object get() {
        Object obj = this.f83562d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83562d;
                if (obj == obj2) {
                    obj = new C75397c();
                    this.f83562d = obj;
                }
            }
        }
        return (C75397c) obj;
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
        return "provider " + C75397c.class.getName();
    }
}
