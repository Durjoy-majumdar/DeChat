package p710un;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: un.b */
public enum C37513b implements C38174i<C37512a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99102d;

    public Object get() {
        Object obj = this.f99102d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99102d;
                if (obj == obj2) {
                    obj = new C37512a();
                    this.f99102d = obj;
                }
            }
        }
        return (C37512a) obj;
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
        return "provider " + C37512a.class.getName();
    }
}
