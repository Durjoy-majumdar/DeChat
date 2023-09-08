package p719uz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uz.d */
public enum C37615d implements C38174i<C65487c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99738d;

    public Object get() {
        Object obj = this.f99738d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99738d;
                if (obj == obj2) {
                    obj = new C65487c();
                    this.f99738d = obj;
                }
            }
        }
        return (C65487c) obj;
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
        return "provider " + C65487c.class.getName();
    }
}
