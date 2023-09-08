package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.t */
public enum C34110t implements C38174i<C99272s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92031d;

    public Object get() {
        Object obj = this.f92031d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92031d;
                if (obj == obj2) {
                    obj = new C99272s();
                    this.f92031d = obj;
                }
            }
        }
        return (C99272s) obj;
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
        return "provider " + C99272s.class.getName();
    }
}
