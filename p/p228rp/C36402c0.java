package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.c0 */
public enum C36402c0 implements C38174i<C36400b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96863d;

    public Object get() {
        Object obj = this.f96863d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96863d;
                if (obj == obj2) {
                    obj = new C36400b0();
                    this.f96863d = obj;
                }
            }
        }
        return (C36400b0) obj;
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
        return "provider " + C36400b0.class.getName();
    }
}
