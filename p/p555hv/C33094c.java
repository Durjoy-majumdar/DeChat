package p555hv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hv.c */
public enum C33094c implements C38174i<C108269b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89860d;

    public Object get() {
        Object obj = this.f89860d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89860d;
                if (obj == obj2) {
                    obj = new C108269b();
                    this.f89860d = obj;
                }
            }
        }
        return (C108269b) obj;
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
        return "provider " + C108269b.class.getName();
    }
}
