package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.o2 */
public enum C28072o2 implements C38174i<C28068n2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77423d;

    public Object get() {
        Object obj = this.f77423d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77423d;
                if (obj == obj2) {
                    obj = new C28068n2();
                    this.f77423d = obj;
                }
            }
        }
        return (C28068n2) obj;
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
        return "provider " + C28068n2.class.getName();
    }
}