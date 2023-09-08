package oi2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: oi2.e */
public enum C35172e implements C38174i<C77009d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94325d;

    public Object get() {
        Object obj = this.f94325d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94325d;
                if (obj == obj2) {
                    obj = new C77009d();
                    this.f94325d = obj;
                }
            }
        }
        return (C77009d) obj;
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
        return "provider " + C77009d.class.getName();
    }
}
