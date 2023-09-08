package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.k0 */
public enum C28055k0 implements C38174i<C92055j0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77386d;

    public Object get() {
        Object obj = this.f77386d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77386d;
                if (obj == obj2) {
                    obj = new C92055j0();
                    this.f77386d = obj;
                }
            }
        }
        return (C92055j0) obj;
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
        return "provider " + C92055j0.class.getName();
    }
}
