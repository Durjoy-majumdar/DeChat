package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.i0 */
public enum C34802i0 implements C38174i<C47233h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93519d;

    public Object get() {
        Object obj = this.f93519d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93519d;
                if (obj == obj2) {
                    obj = new C47233h0();
                    this.f93519d = obj;
                }
            }
        }
        return (C47233h0) obj;
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
        return "provider " + C47233h0.class.getName();
    }
}
