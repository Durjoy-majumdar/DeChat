package f40;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: f40.c */
public enum C31879c implements C38174i<C31878b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84951d;

    public Object get() {
        Object obj = this.f84951d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84951d;
                if (obj == obj2) {
                    obj = new C31878b();
                    this.f84951d = obj;
                }
            }
        }
        return (C31878b) obj;
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
        return "provider " + C31878b.class.getName();
    }
}
