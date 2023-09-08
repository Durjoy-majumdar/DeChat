package p513ey;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ey.c */
public enum C31737c implements C38174i<C45715b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84742d;

    public Object get() {
        Object obj = this.f84742d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84742d;
                if (obj == obj2) {
                    obj = new C45715b();
                    this.f84742d = obj;
                }
            }
        }
        return (C45715b) obj;
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
        return "provider " + C45715b.class.getName();
    }
}
