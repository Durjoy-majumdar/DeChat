package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.q */
public enum C28076q implements C38174i<C28073p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77429d;

    public Object get() {
        Object obj = this.f77429d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77429d;
                if (obj == obj2) {
                    obj = new C28073p();
                    this.f77429d = obj;
                }
            }
        }
        return (C28073p) obj;
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
        return "provider " + C28073p.class.getName();
    }
}
