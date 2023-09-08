package b00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: b00.v */
public enum C28210v implements C38174i<C54391u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77736d;

    public Object get() {
        Object obj = this.f77736d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77736d;
                if (obj == obj2) {
                    obj = new C54391u();
                    this.f77736d = obj;
                }
            }
        }
        return (C54391u) obj;
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
        return "provider " + C54391u.class.getName();
    }
}
