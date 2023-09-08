package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.e0 */
public enum C36405e0 implements C38174i<C48064d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96869d;

    public Object get() {
        Object obj = this.f96869d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96869d;
                if (obj == obj2) {
                    obj = new C48064d0();
                    this.f96869d = obj;
                }
            }
        }
        return (C48064d0) obj;
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
        return "provider " + C48064d0.class.getName();
    }
}
