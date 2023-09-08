package p506ep;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ep.g */
public enum C31650g implements C38174i<C116781f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84553d;

    public Object get() {
        Object obj = this.f84553d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84553d;
                if (obj == obj2) {
                    obj = new C116781f();
                    this.f84553d = obj;
                }
            }
        }
        return (C116781f) obj;
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
        return "provider " + C116781f.class.getName();
    }
}
