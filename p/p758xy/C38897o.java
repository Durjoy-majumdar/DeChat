package p758xy;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xy.o */
public enum C38897o implements C38174i<C79010n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104842d;

    public Object get() {
        Object obj = this.f104842d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104842d;
                if (obj == obj2) {
                    obj = new C79010n();
                    this.f104842d = obj;
                }
            }
        }
        return (C79010n) obj;
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
        return "provider " + C79010n.class.getName();
    }
}
