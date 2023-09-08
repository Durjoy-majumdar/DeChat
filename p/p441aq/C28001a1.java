package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.a1 */
public enum C28001a1 implements C38174i<C28103z0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77283d;

    public Object get() {
        Object obj = this.f77283d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77283d;
                if (obj == obj2) {
                    obj = new C28103z0();
                    this.f77283d = obj;
                }
            }
        }
        return (C28103z0) obj;
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
        return "provider " + C28103z0.class.getName();
    }
}
