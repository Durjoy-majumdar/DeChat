package pg2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: pg2.b */
public enum C35486b implements C38174i<C100790a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94927d;

    public Object get() {
        Object obj = this.f94927d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94927d;
                if (obj == obj2) {
                    obj = new C100790a();
                    this.f94927d = obj;
                }
            }
        }
        return (C100790a) obj;
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
        return "provider " + C100790a.class.getName();
    }
}
