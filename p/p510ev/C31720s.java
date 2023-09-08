package p510ev;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ev.s */
public enum C31720s implements C38174i<C97752r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84703d;

    public Object get() {
        Object obj = this.f84703d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84703d;
                if (obj == obj2) {
                    obj = new C97752r();
                    this.f84703d = obj;
                }
            }
        }
        return (C97752r) obj;
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
        return "provider " + C97752r.class.getName();
    }
}
