package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.u */
public enum C28088u implements C38174i<C28086t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77459d;

    public Object get() {
        Object obj = this.f77459d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77459d;
                if (obj == obj2) {
                    obj = new C28086t();
                    this.f77459d = obj;
                }
            }
        }
        return (C28086t) obj;
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
        return "provider " + C28086t.class.getName();
    }
}
