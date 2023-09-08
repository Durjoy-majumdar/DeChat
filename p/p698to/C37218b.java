package p698to;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: to.b */
public enum C37218b implements C38174i<C101909a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98513d;

    public Object get() {
        Object obj = this.f98513d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98513d;
                if (obj == obj2) {
                    obj = new C101909a();
                    this.f98513d = obj;
                }
            }
        }
        return (C101909a) obj;
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
        return "provider " + C101909a.class.getName();
    }
}
