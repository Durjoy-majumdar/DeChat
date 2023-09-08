package ak1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ak1.y */
public enum C27913y implements C38174i<C54116w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77098d;

    public Object get() {
        Object obj = this.f77098d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77098d;
                if (obj == obj2) {
                    obj = new C54116w();
                    this.f77098d = obj;
                }
            }
        }
        return (C54116w) obj;
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
        return "provider " + C54116w.class.getName();
    }
}
