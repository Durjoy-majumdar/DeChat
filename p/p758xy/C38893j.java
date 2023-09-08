package p758xy;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xy.j */
public enum C38893j implements C38174i<C53468i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104832d;

    public Object get() {
        Object obj = this.f104832d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104832d;
                if (obj == obj2) {
                    obj = new C53468i();
                    this.f104832d = obj;
                }
            }
        }
        return (C53468i) obj;
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
        return "provider " + C53468i.class.getName();
    }
}
