package eg1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eg1.m */
public enum C31586m implements C38174i<C58572h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84412d;

    public Object get() {
        Object obj = this.f84412d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84412d;
                if (obj == obj2) {
                    obj = new C58572h();
                    this.f84412d = obj;
                }
            }
        }
        return (C58572h) obj;
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
        return "provider " + C58572h.class.getName();
    }
}
