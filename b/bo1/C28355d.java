package bo1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bo1.d */
public enum C28355d implements C38174i<C0339c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78003d;

    public Object get() {
        Object obj = this.f78003d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78003d;
                if (obj == obj2) {
                    obj = new C0339c();
                    this.f78003d = obj;
                }
            }
        }
        return (C0339c) obj;
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
        return "provider " + C0339c.class.getName();
    }
}
