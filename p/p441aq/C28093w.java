package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.w */
public enum C28093w implements C38174i<C92059v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77471d;

    public Object get() {
        Object obj = this.f77471d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77471d;
                if (obj == obj2) {
                    obj = new C92059v();
                    this.f77471d = obj;
                }
            }
        }
        return (C92059v) obj;
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
        return "provider " + C92059v.class.getName();
    }
}
