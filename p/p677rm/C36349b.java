package p677rm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rm.b */
public enum C36349b implements C38174i<C36347a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96742d;

    public Object get() {
        Object obj = this.f96742d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96742d;
                if (obj == obj2) {
                    obj = new C36347a();
                    this.f96742d = obj;
                }
            }
        }
        return (C36347a) obj;
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
        return "provider " + C36347a.class.getName();
    }
}
