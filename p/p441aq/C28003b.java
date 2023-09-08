package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.b */
public enum C28003b implements C38174i<C92050a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77289d;

    public Object get() {
        Object obj = this.f77289d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77289d;
                if (obj == obj2) {
                    obj = new C92050a();
                    this.f77289d = obj;
                }
            }
        }
        return (C92050a) obj;
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
        return "provider " + C92050a.class.getName();
    }
}
