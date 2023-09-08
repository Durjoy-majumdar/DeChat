package p406zn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zn.b */
public enum C39395b implements C38174i<C23520a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105847d;

    public Object get() {
        Object obj = this.f105847d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105847d;
                if (obj == obj2) {
                    obj = new C23520a();
                    this.f105847d = obj;
                }
            }
        }
        return (C23520a) obj;
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
        return "provider " + C23520a.class.getName();
    }
}
