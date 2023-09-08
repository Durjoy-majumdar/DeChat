package p417qz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qz.p */
public enum C36221p implements C38174i<C101320o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96476d;

    public Object get() {
        Object obj = this.f96476d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96476d;
                if (obj == obj2) {
                    obj = new C101320o();
                    this.f96476d = obj;
                }
            }
        }
        return (C101320o) obj;
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
        return "provider " + C101320o.class.getName();
    }
}
