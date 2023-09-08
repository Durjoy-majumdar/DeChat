package b00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: b00.x */
public enum C28211x implements C38174i<C0239w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77739d;

    public Object get() {
        Object obj = this.f77739d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77739d;
                if (obj == obj2) {
                    obj = new C0239w();
                    this.f77739d = obj;
                }
            }
        }
        return (C0239w) obj;
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
        return "provider " + C0239w.class.getName();
    }
}
