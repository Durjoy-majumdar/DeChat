package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.f */
public enum C28036f implements C38174i<C28015e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77345d;

    public Object get() {
        Object obj = this.f77345d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77345d;
                if (obj == obj2) {
                    obj = new C28015e();
                    this.f77345d = obj;
                }
            }
        }
        return (C28015e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C28015e.class.getName();
    }
}
