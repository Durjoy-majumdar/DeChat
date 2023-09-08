package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.o */
public enum C28069o implements C38174i<C92057n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77414d;

    public Object get() {
        Object obj = this.f77414d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77414d;
                if (obj == obj2) {
                    obj = new C92057n();
                    this.f77414d = obj;
                }
            }
        }
        return (C92057n) obj;
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
        return "provider " + C92057n.class.getName();
    }
}
