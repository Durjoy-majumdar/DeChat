package p417qz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qz.r */
public enum C36222r implements C38174i<C101321q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96479d;

    public Object get() {
        Object obj = this.f96479d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96479d;
                if (obj == obj2) {
                    obj = new C101321q();
                    this.f96479d = obj;
                }
            }
        }
        return (C101321q) obj;
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
        return "provider " + C101321q.class.getName();
    }
}
