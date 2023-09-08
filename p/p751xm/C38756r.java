package p751xm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xm.r */
public enum C38756r implements C38174i<C118887q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104554d;

    public Object get() {
        Object obj = this.f104554d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104554d;
                if (obj == obj2) {
                    obj = new C118887q();
                    this.f104554d = obj;
                }
            }
        }
        return (C118887q) obj;
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
        return "provider " + C118887q.class.getName();
    }
}
