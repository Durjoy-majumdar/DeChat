package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.y */
public enum C28100y implements C38174i<C92060x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77488d;

    public Object get() {
        Object obj = this.f77488d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77488d;
                if (obj == obj2) {
                    obj = new C92060x();
                    this.f77488d = obj;
                }
            }
        }
        return (C92060x) obj;
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
        return "provider " + C92060x.class.getName();
    }
}
